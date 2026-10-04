package mod.trade;

import bp;
import by;
import dq;
import main.a;
import mod.chat.MatrixChat;
import mod.log.MatrixLogger;

/**
 * MatrixXTrade — Automated Smart Trading Engine.
 * 
 * Supports:
 *  - Buying Mode ("sell x"): Bot buys items from players at set Buy Price.
 *  - Selling Mode ("buy x"): Bot sells items to players at set Sell Price.
 *  - Consume Mode: Bot accepts trade to refill specific item ID and rejects all other items.
 *  - Smart Mutual Exclusivity: Only Buying or Selling can be active at a time.
 */
public class MatrixXTrade {

    // Main Switches
    public static boolean enableBuying = false;
    public static boolean enableSelling = false;
    public static boolean enableConsume = false;

    // Item & Price Settings
    public static int buyItemId = 0;
    public static int buyPricePerUnit = 0;

    public static int sellItemId = 0;
    public static int sellPricePerUnit = 0;

    public static int consumeItemId = 0;

    // Trade State Management
    public static final int TRADE_IDLE = 0;
    public static final int TRADE_BUYING = 1;
    public static final int TRADE_SELLING = 2;
    public static final int TRADE_CONSUMING = 3;

    public static int activeTradeMode = TRADE_IDLE;
    public static String activeTargetPlayer = null;
    public static int activeTargetQty = 0;
    public static int activeTargetPlayerId = -1;

    // =========================================================================
    // SWITCH TOGGLES (Smart Mutual Exclusivity)
    // =========================================================================

    public static void toggleBuying() {
        enableBuying = !enableBuying;
        if (enableBuying) {
            enableSelling = false; // Smart Mutual Exclusivity: Turn off Selling!
            activeTradeMode = TRADE_IDLE;
            a.a("X-Trade: BUYING Mode Enabled.\n(Selling Mode disabled)");
        } else {
            a.a("X-Trade: BUYING Mode Disabled.");
        }
    }

    public static void toggleSelling() {
        enableSelling = !enableSelling;
        if (enableSelling) {
            enableBuying = false; // Smart Mutual Exclusivity: Turn off Buying!
            activeTradeMode = TRADE_IDLE;
            a.a("X-Trade: SELLING Mode Enabled.\n(Buying Mode disabled)");
        } else {
            a.a("X-Trade: SELLING Mode Disabled.");
        }
    }

    public static void toggleConsume() {
        enableConsume = !enableConsume;
        if (enableConsume && consumeItemId == 0) {
            a.a("X-Trade: CONSUME Mode Enabled.\nPlease set Consume Item ID!");
        } else {
            a.a("X-Trade: CONSUME Mode " + (enableConsume ? "Enabled" : "Disabled"));
        }
    }

    // =========================================================================
    // PRIVATE MESSAGE HANDLER ("sell x" / "buy x")
    // =========================================================================

    public static void onPrivateMessageReceived(String sender, String text) {
        if (sender == null || text == null) return;

        String cleanSender = sender.trim();
        String cleanText = text.trim().toLowerCase();

        // 1. BUYING MODE COMMAND: "sell x" (Player wants to sell items to bot)
        if (cleanText.startsWith("sell")) {
            if (!enableBuying) {
                MatrixLogger.log("X-TRADE", "Received 'sell' PM from " + cleanSender + ", but Buying Mode is OFF.");
                return;
            }

            int qty = parseQuantity(cleanText, "sell");
            if (buyItemId == 0 || buyPricePerUnit <= 0) {
                MatrixChat.sendPrivateMessage(cleanSender, "Buying not configured!");
                return;
            }

            MatrixLogger.log("X-TRADE", "Processing BUY request from " + cleanSender + " for Qty: " + qty);
            initiateBuyTransaction(cleanSender, qty);
        }
        // 2. SELLING MODE COMMAND: "buy x" (Player wants to buy items from bot)
        else if (cleanText.startsWith("buy")) {
            if (!enableSelling) {
                MatrixLogger.log("X-TRADE", "Received 'buy' PM from " + cleanSender + ", but Selling Mode is OFF.");
                return;
            }

            int qty = parseQuantity(cleanText, "buy");
            if (sellItemId == 0 || sellPricePerUnit <= 0) {
                MatrixChat.sendPrivateMessage(cleanSender, "Selling not configured!");
                return;
            }

            // Check if bot has enough stock in inventory
            int availableStock = getInventoryCount(sellItemId);
            if (availableStock < qty) {
                MatrixLogger.log("X-TRADE", "Insufficient stock for " + cleanSender + ". Need: " + qty + ", Have: " + availableStock);
                MatrixChat.sendPrivateMessage(cleanSender, "Out of stock! Available: " + availableStock);
                return;
            }

            MatrixLogger.log("X-TRADE", "Processing SELL request from " + cleanSender + " for Qty: " + qty);
            initiateSellTransaction(cleanSender, qty);
        }
    }

    private static int parseQuantity(String text, String prefix) {
        try {
            String remainder = text.substring(prefix.length()).trim();
            if (remainder.length() > 0) {
                int parsed = Integer.parseInt(remainder);
                if (parsed > 0) return parsed;
            }
        } catch (Exception e) {}
        return 1; // Default quantity 1 if omitted or invalid
    }

    // =========================================================================
    // TRANSACTION INITIATION
    // =========================================================================

    private static void initiateBuyTransaction(String targetPlayer, int qty) {
        activeTargetPlayer = targetPlayer;
        activeTargetQty = qty;
        activeTradeMode = TRADE_BUYING;

        int targetId = findPlayerIdByName(targetPlayer);
        if (targetId != -1) {
            activeTargetPlayerId = targetId;
            MatrixLogger.log("X-TRADE", "Sending Trade Request to: " + targetPlayer + " (ID: " + targetId + ")");
            dq.a().s(targetId); // Outbound Packet 43 (Invite Trade)
        } else {
            MatrixLogger.log("X-TRADE", "Target player " + targetPlayer + " not found nearby on map.");
            MatrixChat.sendPrivateMessage(targetPlayer, "Please come closer to trade!");
        }
    }

    private static void initiateSellTransaction(String targetPlayer, int qty) {
        activeTargetPlayer = targetPlayer;
        activeTargetQty = qty;
        activeTradeMode = TRADE_SELLING;

        int targetId = findPlayerIdByName(targetPlayer);
        if (targetId != -1) {
            activeTargetPlayerId = targetId;
            MatrixLogger.log("X-TRADE", "Sending Trade Request to: " + targetPlayer + " (ID: " + targetId + ")");
            dq.a().s(targetId); // Outbound Packet 43 (Invite Trade)
        } else {
            MatrixLogger.log("X-TRADE", "Target player " + targetPlayer + " not found nearby on map.");
            MatrixChat.sendPrivateMessage(targetPlayer, "Please come closer to trade!");
        }
    }

    // =========================================================================
    // INCOMING TRADE INVITATION & EXECUTION
    // =========================================================================

    /**
     * Triggered when an incoming trade invitation packet (Packet 43) is received.
     */
    public static void onTradeInviteReceived(int senderId, String senderName) {
        // CONSUME MODE: Auto-accept trade to receive refill items
        if (enableConsume) {
            activeTradeMode = TRADE_CONSUMING;
            activeTargetPlayerId = senderId;
            activeTargetPlayer = senderName;
            MatrixLogger.log("X-TRADE", "Auto-accepting Consume Trade from: " + senderName);
            dq.a().e(); // Packet 36: Accept Trade
            return;
        }

        // Pending Buy/Sell Trade
        if (activeTradeMode != TRADE_IDLE && activeTargetPlayerId == senderId) {
            MatrixLogger.log("X-TRADE", "Accepting Trade Invitation from: " + senderName);
            dq.a().e(); // Packet 36: Accept Trade
        }
    }

    /**
     * Triggered when trade session window opens.
     */
    public static void onTradeSessionOpened() {
        if (activeTradeMode == TRADE_BUYING) {
            // Put total required coins into trade
            int totalCoins = activeTargetQty * buyPricePerUnit;
            MatrixLogger.log("X-TRADE", "Buying Mode: Depositing " + totalCoins + " coins for " + activeTargetQty + " items.");
            dq.a().h(totalCoins); // Packet 40: Add Coins
        } else if (activeTradeMode == TRADE_SELLING) {
            // Put requested item into trade
            int slot = findInventorySlot(sellItemId);
            if (slot != -1) {
                MatrixLogger.log("X-TRADE", "Selling Mode: Adding Item ID " + sellItemId + " from slot " + slot);
                dq.a().g(slot); // Packet 41: Add Item
            } else {
                MatrixLogger.log("X-TRADE-ERR", "Sell Item not found in inventory during trade! Cancelling.");
                cancelActiveTrade();
            }
        }
    }

    /**
     * Validates and completes trade when opponent offers items/coins.
     */
    public static void processTradeValidation(int offeredCoins, by[] offeredItems) {
        if (activeTradeMode == TRADE_CONSUMING) {
            // CONSUME MODE: Ensure ONLY consumeItemId items are offered
            if (validateConsumeOffer(offeredItems)) {
                MatrixLogger.log("X-TRADE", "Consume Offer Validated! Confirming trade.");
                confirmActiveTrade();
            } else {
                MatrixLogger.log("X-TRADE", "Invalid items in Consume Trade. Rejecting!");
                cancelActiveTrade();
            }
        } else if (activeTradeMode == TRADE_BUYING) {
            // BUYING MODE: Ensure opponent offered required item ID and quantity
            if (validateBuyOffer(offeredItems)) {
                MatrixLogger.log("X-TRADE", "Buy Offer Validated! Confirming trade.");
                confirmActiveTrade();
            } else {
                MatrixLogger.log("X-TRADE", "Incorrect items offered in Buy Trade. Cancelling!");
                cancelActiveTrade();
            }
        } else if (activeTradeMode == TRADE_SELLING) {
            // SELLING MODE: Ensure opponent offered sufficient coins and no unwanted items
            int requiredCoins = activeTargetQty * sellPricePerUnit;
            if (offeredCoins >= requiredCoins && (offeredItems == null || offeredItems.length == 0)) {
                MatrixLogger.log("X-TRADE", "Sell Offer Validated! Coins: " + offeredCoins + " >= " + requiredCoins + ". Confirming trade.");
                confirmActiveTrade();
            } else {
                MatrixLogger.log("X-TRADE", "Insufficient coins or invalid items offered in Sell Trade. Cancelling!");
                cancelActiveTrade();
            }
        }
    }

    private static boolean validateConsumeOffer(by[] items) {
        if (items == null || items.length == 0) return false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].b != null) {
                if (items[i].b.a != consumeItemId) {
                    return false; // Contains unauthorized item!
                }
            }
        }
        return true;
    }

    private static boolean validateBuyOffer(by[] items) {
        if (items == null || items.length == 0) return false;
        int matchedQty = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].b != null) {
                if (items[i].b.a != buyItemId) {
                    return false; // Contains unapproved item!
                }
                matchedQty += items[i].e;
            }
        }
        return matchedQty >= activeTargetQty;
    }

    public static void confirmActiveTrade() {
        dq.a().j(); // Packet 46: Final Confirm
        resetTradeState();
    }

    public static void cancelActiveTrade() {
        dq.a().k(); // Packet 47: Cancel Trade
        resetTradeState();
    }

    public static void resetTradeState() {
        activeTradeMode = TRADE_IDLE;
        activeTargetPlayer = null;
        activeTargetQty = 0;
        activeTargetPlayerId = -1;
    }

    // =========================================================================
    // INVENTORY & PLAYER UTILITIES
    // =========================================================================

    public static int getInventoryCount(int itemId) {
        bp player = bp.d();
        if (player == null || player.aB == null) return 0;
        int total = 0;
        for (int i = 0; i < player.aB.length; i++) {
            by item = player.aB[i];
            if (item != null && item.b != null && item.b.a == itemId) {
                total += item.e;
            }
        }
        return total;
    }

    public static int findInventorySlot(int itemId) {
        bp player = bp.d();
        if (player == null || player.aB == null) return -1;
        for (int i = 0; i < player.aB.length; i++) {
            by item = player.aB[i];
            if (item != null && item.b != null && item.b.a == itemId) {
                return i;
            }
        }
        return -1;
    }

    public static int findPlayerIdByName(String name) {
        if (name == null) return -1;
        // Search target in GameScr character list
        try {
            if (bp.d().aV != null && name.equalsIgnoreCase(bp.d().aV.ab)) {
                return bp.d().aV.p;
            }
        } catch (Exception e) {}
        return -1;
    }
}
