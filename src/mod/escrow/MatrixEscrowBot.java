package mod.escrow;

import bp;
import by;
import dg;
import dq;
import main.a;
import mod.log.MatrixLogger;
import mod.chat.MatrixChat;

import java.util.Vector;

/**
 * MatrixEscrowBot — Robust, Atomic Escrow & Item Transfer Engine.
 * 
 * 3-Step Trade Architecture:
 * Step 1: Invite & Accept (Atomic - Bot NEVER sends duplicate invites; only auto-accepts incoming invites).
 * Step 2: Lock Offer (Packet 45) -> 5-Second Security Countdown.
 * Step 3: Confirm Trade (Packet 46) -> Executed after 5s lock countdown.
 */
public class MatrixEscrowBot {

    public static class State {
        public static final int IDLE = 0;
        public static final int INITIATED = 1;          // Sender whispered "transfer", waiting for sender to send trade invite
        public static final int RECEIVING_ITEMS = 2;    // In active trade window receiving items from sender
        public static final int HOLDING_ITEMS = 3;      // Items received & held, waiting for "tx <target>"
        public static final int WAITING_TARGET = 4;     // "tx <target>" set, waiting for target to send trade invite
        public static final int FORWARDING_ITEMS = 5;   // In active trade window forwarding items to target
        public static final int REFUNDING_ITEMS = 6;    // 2-min timeout expired, waiting for sender to trade for refund

        public static String toString(int state) {
            switch (state) {
                case IDLE: return "IDLE";
                case INITIATED: return "INITIATED";
                case RECEIVING_ITEMS: return "RECEIVING_ITEMS";
                case HOLDING_ITEMS: return "HOLDING_ITEMS";
                case WAITING_TARGET: return "WAITING_TARGET";
                case FORWARDING_ITEMS: return "FORWARDING_ITEMS";
                case REFUNDING_ITEMS: return "REFUNDING_ITEMS";
                default: return "UNKNOWN";
            }
        }
    }

    private static int currentState = State.IDLE;
    private static String senderName = null;
    private static String targetName = null;
    private static long stateTimer = 0;
    private static long lockTimer = 0; // 5-second trade lock countdown

    // Held items snapshot
    private static Vector heldItems = new Vector();
    private static int heldCoins = 0;

    private static Thread watchdogThread = null;

    public static synchronized void startWatchdog() {
        if (watchdogThread != null && watchdogThread.isAlive()) return;

        watchdogThread = new Thread(new Runnable() {
            public void run() {
                MatrixLogger.log("ESCROW", "Escrow Bot Watchdog active.");
                while (true) {
                    try {
                        Thread.sleep(500); // Poll every 500ms for atomic responsiveness
                        tickWatchdog();
                    } catch (Exception e) {}
                }
            }
        });
        watchdogThread.start();
    }

    private static synchronized void tickWatchdog() {
        long now = System.currentTimeMillis();

        if (currentState == State.IDLE) return;

        // 1. Timeout for initial trade setup (30 seconds)
        if (currentState == State.INITIATED && (now - stateTimer > 30000)) {
            MatrixLogger.log("ESCROW", "Initial trade setup timed out for sender: " + senderName);
            cancelSession("Trade request timed out.");
            return;
        }

        // 2. Timeout for 2-minute "tx <target>" instruction or target trade initiation (120 seconds)
        if ((currentState == State.HOLDING_ITEMS || currentState == State.WAITING_TARGET) && (now - stateTimer > 120000)) {
            MatrixLogger.log("ESCROW", "2-Minute timeout expired! Initiating automatic refund state for " + senderName);
            startAutoRefund();
            return;
        }

        // 3. Trade Window Guard: Detect if trade window closed unexpectedly in game
        if (currentState == State.RECEIVING_ITEMS || currentState == State.FORWARDING_ITEMS || currentState == State.REFUNDING_ITEMS) {
            boolean tradeActive = false;
            if (dg.n() != null && (dg.n().bh > 0 || dg.n().bi > 0)) {
                tradeActive = true;
            }
            // If trade window closed while receiving, cleanly void session back to IDLE
            if (!tradeActive && (now - lockTimer > 4000) && lockTimer > 0) {
                if (currentState == State.RECEIVING_ITEMS) {
                    MatrixLogger.log("ESCROW", "Trade window closed unexpectedly. Resetting session to IDLE.");
                    resetSession();
                    return;
                } else if (currentState == State.FORWARDING_ITEMS) {
                    MatrixLogger.log("ESCROW", "Forwarding trade window closed. Reverting to WAITING_TARGET.");
                    currentState = State.WAITING_TARGET;
                    return;
                }
            }
        }

        // 4. Step 3 Confirmation Execution (5-Second Lock Countdown Guard)
        if (currentState == State.RECEIVING_ITEMS) {
            handleActiveReceivingTrade();
        } else if (currentState == State.FORWARDING_ITEMS || currentState == State.REFUNDING_ITEMS) {
            handleActiveForwardTrade();
        }
    }

    // =========================================================================
    // INBOUND CHAT INTERCEPTOR
    // =========================================================================

    public static void onPrivateMessageReceived(String sender, String message) {
        if (sender == null || message == null) return;
        String cleanSender = sender.trim();
        String cleanMsg = message.trim().toLowerCase();

        MatrixLogger.log("ESCROW-PM", "[" + cleanSender + "]: " + message);

        if ("transfer".equals(cleanMsg)) {
            handleTransferCommand(cleanSender);
        } else if ("cancel".equals(cleanMsg) || "reset".equals(cleanMsg)) {
            if (cleanSender.equalsIgnoreCase(senderName) || currentState == State.IDLE) {
                if (currentState == State.HOLDING_ITEMS || currentState == State.WAITING_TARGET) {
                    MatrixLogger.log("ESCROW", "Sender " + cleanSender + " requested cancel. Refunding items...");
                    startAutoRefund();
                } else {
                    cancelSession("Session cancelled by user.");
                }
            }
        } else if (cleanMsg.startsWith("tx ")) {
            String requestedTarget = message.trim().substring(3).trim();
            handleTxCommand(cleanSender, requestedTarget);
        }
    }

    private static synchronized void handleTransferCommand(String sender) {
        // Auto-heal: If session was stuck in INITIATED or voided state, allow fresh start
        if (currentState != State.IDLE) {
            long now = System.currentTimeMillis();
            if (now - stateTimer > 25000 && currentState == State.INITIATED) {
                MatrixLogger.log("ESCROW", "Overwriting stale INITIATED session for new transfer command from: " + sender);
                resetSession();
            } else {
                MatrixChat.sendPrivateMessage(sender, "[Escrow Bot] System busy! Another transfer session is currently active.");
                return;
            }
        }

        senderName = sender;
        targetName = null;
        heldItems.removeAllElements();
        heldCoins = 0;
        lockTimer = 0;
        currentState = State.INITIATED;
        stateTimer = System.currentTimeMillis();

        MatrixLogger.log("ESCROW", "Transfer session initiated by: " + senderName);
        MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] Transfer session initiated! Send me a trade request now.");
    }

    private static synchronized void handleTxCommand(String sender, String requestedTarget) {
        if (!sender.equalsIgnoreCase(senderName)) {
            MatrixChat.sendPrivateMessage(sender, "[Escrow Bot] You do not have an active escrow session.");
            return;
        }

        if (currentState != State.HOLDING_ITEMS && currentState != State.WAITING_TARGET) {
            MatrixChat.sendPrivateMessage(sender, "[Escrow Bot] No held items found to transfer!");
            return;
        }

        if (requestedTarget == null || requestedTarget.length() == 0) {
            MatrixChat.sendPrivateMessage(sender, "[Escrow Bot] Invalid target character name! Usage: tx <character_name>");
            return;
        }

        targetName = requestedTarget;
        currentState = State.WAITING_TARGET;

        MatrixLogger.log("ESCROW", "Target set to: " + targetName + ". Waiting for target to send trade request.");
        MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] Destination set to '" + targetName + "'. Tell " + targetName + " to send a trade request to me now!");
    }

    // =========================================================================
    // TRADE HOOKS & EVENT HANDLERS
    // =========================================================================

    /**
     * Called when Packet 43 (Inbound Trade Invite) is received from another player.
     * Atomic: Auto-accepts trade request and dismisses popup dialogs.
     */
    public static synchronized void onTradeInviteReceived(int senderId, String partnerName) {
        MatrixLogger.log("ESCROW", "Inbound trade invite from ID " + senderId + " (" + partnerName + ") [State: " + State.toString(currentState) + "]");

        // Close any native popup dialog
        try { main.a.j(); } catch (Exception e) {}

        if (currentState == State.INITIATED) {
            if (partnerName == null || partnerName.equalsIgnoreCase(senderName)) {
                MatrixLogger.log("ESCROW", "Auto-accepting trade invite (Packet 44) from sender: " + senderName);
                try {
                    dq.a().l(senderId); // Send Packet 44 (Accept Trade)
                } catch (Exception e) {}
                currentState = State.RECEIVING_ITEMS;
                lockTimer = 0;
            }
        } else if (currentState == State.WAITING_TARGET) {
            if (partnerName != null && partnerName.equalsIgnoreCase(targetName)) {
                MatrixLogger.log("ESCROW", "Auto-accepting trade invite (Packet 44) from target: " + targetName);
                try {
                    dq.a().l(senderId); // Send Packet 44 (Accept Trade)
                } catch (Exception e) {}
                currentState = State.FORWARDING_ITEMS;
                lockTimer = 0;
            }
        } else if (currentState == State.REFUNDING_ITEMS) {
            if (partnerName == null || partnerName.equalsIgnoreCase(senderName)) {
                MatrixLogger.log("ESCROW", "Auto-accepting refund trade invite (Packet 44) from sender: " + senderName);
                try {
                    dq.a().l(senderId); // Send Packet 44 (Accept Trade)
                } catch (Exception e) {}
                lockTimer = 0;
            }
        }
    }

    public static synchronized void onPartnerTradeLocked() {
        MatrixLogger.log("ESCROW", "Partner locked trade (Packet 45 received). State: " + State.toString(currentState));
        if (lockTimer == 0) {
            lockTimer = System.currentTimeMillis(); // Start 5-second countdown timer
        }
        if (currentState == State.RECEIVING_ITEMS) {
            handleActiveReceivingTrade();
        } else if (currentState == State.FORWARDING_ITEMS || currentState == State.REFUNDING_ITEMS) {
            handleActiveForwardTrade();
        }
    }

    public static synchronized void onTradeCompleted() {
        if (currentState == State.RECEIVING_ITEMS) {
            heldItems.removeAllElements();
            heldCoins = (dg.n() != null) ? dg.n().bk : 0;

            by[] received = dg.aD;
            if (received != null) {
                for (int i = 0; i < received.length; i++) {
                    if (received[i] != null) {
                        heldItems.addElement(received[i].a());
                    }
                }
            }

            currentState = State.HOLDING_ITEMS;
            stateTimer = System.currentTimeMillis(); // Start 2-minute tx countdown
            lockTimer = 0;

            MatrixLogger.log("ESCROW", "Successfully received " + heldItems.size() + " items and " + heldCoins + " xu from " + senderName);
            MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] Received " + heldItems.size() + " items & " + heldCoins + " xu! Send 'tx <playername>' within 2 minutes to transfer.");
        } else if (currentState == State.FORWARDING_ITEMS) {
            MatrixLogger.log("ESCROW", "SUCCESS! Items successfully transferred to " + targetName);
            if (senderName != null) {
                MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] Escrow transfer to '" + targetName + "' completed successfully!");
            }
            if (targetName != null) {
                MatrixChat.sendPrivateMessage(targetName, "[Escrow Bot] Received escrowed items from '" + senderName + "'!");
            }
            resetSession();
        } else if (currentState == State.REFUNDING_ITEMS) {
            MatrixLogger.log("ESCROW", "REFUND COMPLETE! All items returned to " + senderName);
            if (senderName != null) {
                MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] All your items have been safely returned to you.");
            }
            resetSession();
        }
    }

    public static synchronized void onTradeCancelled() {
        MatrixLogger.log("ESCROW", "Trade cancelled event (Packet 47). State: " + State.toString(currentState));
        if (currentState == State.RECEIVING_ITEMS || currentState == State.INITIATED) {
            cancelSession("Trade cancelled.");
        } else if (currentState == State.FORWARDING_ITEMS) {
            MatrixLogger.log("ESCROW", "Target trade cancelled. Reverting to WAITING_TARGET.");
            currentState = State.WAITING_TARGET;
            lockTimer = 0;
        } else if (currentState == State.REFUNDING_ITEMS) {
            MatrixLogger.log("ESCROW", "Refund trade cancelled. Waiting for sender to trade again...");
            lockTimer = 0;
        }
    }

    // =========================================================================
    // HELPER & EXECUTION ROUTINES (3-Step Protocol Execution)
    // =========================================================================

    private static void handleActiveReceivingTrade() {
        try {
            if (dg.n() == null) return;
            dg canvas = dg.n();

            // Step 2: Auto-Lock Offer (Packet 45) when partner locks (bi >= 1)
            if (canvas.bi >= 1 && canvas.bh == 0) {
                dq.a().a(0, new by[0]); // Send Packet 45 (Lock Offer)
                canvas.bh = 1;
                if (lockTimer == 0) lockTimer = System.currentTimeMillis();
                MatrixLogger.log("ESCROW", "Partner locked items! Auto-locking bot's trade offer...");
            }

            // Step 3: Auto-Confirm (Packet 46) after 5-second lock countdown (bl)
            long now = System.currentTimeMillis();
            if (canvas.bh == 1 && canvas.bi >= 1) {
                if (lockTimer > 0 && (now - lockTimer >= 4000)) { // 4.0s countdown buffer
                    dq.a().j(); // Send Packet 46 (Confirm Trade)
                    canvas.bh = 2;
                    MatrixLogger.log("ESCROW", "5s Lock countdown complete! Auto-confirming trade with sender...");
                }
            }
        } catch (Exception e) {
            MatrixLogger.log("ESCROW-ERR", "Error in receiving trade handler: " + e.getMessage());
        }
    }

    private static void handleActiveForwardTrade() {
        try {
            if (dg.n() == null) return;
            dg canvas = dg.n();

            by[] offerArray = new by[heldItems.size()];
            for (int i = 0; i < heldItems.size(); i++) {
                offerArray[i] = (by) heldItems.elementAt(i);
            }

            // Step 2: Populate items & Auto-Lock Offer (Packet 45)
            if (canvas.bh == 0) {
                dq.a().a(heldCoins, offerArray);
                canvas.bh = 1;
                if (lockTimer == 0) lockTimer = System.currentTimeMillis();
                MatrixLogger.log("ESCROW", "Auto-locking trade offer with " + offerArray.length + " items and " + heldCoins + " xu");
            }

            // Step 3: Auto-Confirm (Packet 46) after 5-second lock countdown
            long now = System.currentTimeMillis();
            if (canvas.bh == 1 && canvas.bi >= 1) {
                if (lockTimer > 0 && (now - lockTimer >= 4000)) {
                    dq.a().j(); // Send Packet 46 (Confirm Trade)
                    canvas.bh = 2;
                    MatrixLogger.log("ESCROW", "5s Lock countdown complete! Auto-confirming final trade step...");
                }
            }
        } catch (Exception e) {
            MatrixLogger.log("ESCROW-ERR", "Error in active forward trade: " + e.getMessage());
        }
    }

    private static void startAutoRefund() {
        currentState = State.REFUNDING_ITEMS;
        lockTimer = 0;
        MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] Transfer timed out after 2 minutes! Please send me a trade request now to receive your refund.");
    }

    private static void cancelSession(String reason) {
        if (senderName != null) {
            MatrixChat.sendPrivateMessage(senderName, "[Escrow Bot] Session cancelled: " + reason);
        }
        resetSession();
    }

    public static synchronized void resetSession() {
        currentState = State.IDLE;
        senderName = null;
        targetName = null;
        stateTimer = 0;
        lockTimer = 0;
        heldItems.removeAllElements();
        heldCoins = 0;
        MatrixLogger.log("ESCROW", "Escrow session cleanly reset to IDLE state.");
    }

    public static String getCurrentState() {
        return State.toString(currentState);
    }

    public static String getSenderName() {
        return senderName;
    }

    public static String getTargetName() {
        return targetName;
    }
}
