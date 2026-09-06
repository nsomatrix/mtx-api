package mod.ui;

import main.a;
import bd;
import aa;
import mod.net.MatrixNet;

public class MatrixUI {

    /**
     * Appends MatrixAPI as the VERY FIRST option (index 0) in the main game menu.
     */
    public static void addMatrixMenuItem(aa vector) {
        bd matrixBtn = new bd("MatrixAPI", 888999);
        vector.insertElementAt(matrixBtn, 0); // Position 0: Very first option!
    }

    /**
     * Handles MatrixAPI command triggers.
     */
    public static boolean handleMatrixCommand(int commandId, Object obj) {
        if (commandId == 888999) {
            showMatrixMenu();
            return true;
        } else if (commandId == 888901) { // Sub-option: Inspect Player Target
            promptPlayerName();
            return true;
        } else if (commandId == 888903) { // Triggered when OK button is pressed on inspect dialog
            submitPlayerInspect();
            return true;
        } else if (commandId == 888904) { // Sub-option: Toggle REST Web Sync
            mod.MatrixAPI.toggleWebSync();
            boolean state = mod.web.MatrixWebClient.enableWebSync;
            a.a("REST Web Sync: " + (state ? "ENABLED" : "DISABLED"));
            return true;
        } else if (commandId == 888905) { // Sub-option: Set REST API Endpoint
            promptRestEndpoint();
            return true;
        } else if (commandId == 888906) { // Callback when Save button is pressed on URL dialog
            submitRestEndpoint();
            return true;
        } else if (commandId == 888907) { // Sub-option: Toggle Auto-Login Watchdog
            mod.MatrixAPI.toggleAutoLogin();
            boolean state = mod.net.MatrixAutoReconnect.enableAutoLogin;
            a.a("Auto Login: " + (state ? "ENABLED" : "DISABLED"));
            return true;
        } else if (commandId == 888920) { // Sub-option: Open Chat Console Sub-Menu
            showChatConsoleMenu();
            return true;
        } else if (commandId == 888910) { // Sub-option: Send Private Message (PM)
            promptPrivateMessage();
            return true;
        } else if (commandId == 888911) { // Sub-option: Send Map Chat
            promptMapChat();
            return true;
        } else if (commandId == 888914) { // Sub-option: Send World Chat
            promptWorldChat();
            return true;
        } else if (commandId == 888915) { // Sub-option: Send Clan Chat
            promptClanChat();
            return true;
        } else if (commandId == 888912) { // Submit PM
            submitPrivateMessage();
            return true;
        } else if (commandId == 888913) { // Submit Map Chat
            submitMapChat();
            return true;
        } else if (commandId == 888916) { // Submit World Chat
            submitWorldChat();
            return true;
        } else if (commandId == 888917) { // Submit Clan Chat
            submitClanChat();
            return true;
        }
        return false;
    }

    /**
     * Displays main MatrixAPI menu list.
     */
    public static void showMatrixMenu() {
        aa menuList = new aa();
        menuList.addElement(new bd("Inspect Player Target", 888901));
        menuList.addElement(new bd("Chat Console", 888920));
        boolean syncState = mod.web.MatrixWebClient.enableWebSync;
        menuList.addElement(new bd("REST Web Sync [" + (syncState ? "ON" : "OFF") + "]", 888904));
        menuList.addElement(new bd("Set REST API Endpoint", 888905));
        boolean autoLoginState = mod.net.MatrixAutoReconnect.enableAutoLogin;
        menuList.addElement(new bd("Auto Login [" + (autoLoginState ? "ON" : "OFF") + "]", 888907));
        a.F.a(menuList); // Native interactive menu list
    }

    /**
     * Displays dedicated Chat Console sub-menu.
     */
    public static void showChatConsoleMenu() {
        aa menuList = new aa();
        menuList.addElement(new bd("Send Private Message", 888910));
        menuList.addElement(new bd("Send Map Chat", 888911));
        menuList.addElement(new bd("Send World Chat", 888914));
        menuList.addElement(new bd("Send Clan Chat", 888915));
        a.F.a(menuList);
    }

    /**
     * Opens in-game input field for configuring custom REST URL endpoint.
     */
    public static void promptRestEndpoint() {
        bd saveCmd = new bd("Save", 888906);
        a.L.a("Enter REST Endpoint URL:", saveCmd, 0);
    }

    /**
     * Reads typed REST URL, saves to RMS storage, and updates active endpoint.
     */
    public static void submitRestEndpoint() {
        String typedUrl = null;
        if (a.L != null && a.L.d != null) {
            typedUrl = a.L.d.d();
        }
        a.j();

        if (typedUrl != null && typedUrl.trim().length() > 0) {
            mod.web.MatrixWebClient.setRestEndpoint(typedUrl.trim());
            a.a("REST Endpoint Saved:\n" + mod.web.MatrixWebClient.restApiEndpoint);
        } else {
            a.a("Please enter a valid URL!");
        }
    }

    /**
     * Opens the exact working in-game text field box screen (main.a.L).
     */
    public static void promptPlayerName() {
        // Construct OK command BD pointing to command 888903
        bd okCmd = new bd("OK", 888903);

        // Open in-game text input screen (a.L)
        a.L.a("Enter Player Name:", okCmd, 0);
    }

    /**
     * Reads typed player name from input screen and dispatches Packet 93 request.
     */
    public static void submitPlayerInspect() {
        String playerName = null;

        // 1. Extract typed text from active text field box
        if (a.L != null && a.L.d != null) {
            playerName = a.L.d.d();
        }

        // 2. Close input dialog screen
        a.j();

        // 3. Process inspection request
        if (playerName != null && playerName.trim().length() > 0) {
            MatrixNet.inspectPlayer(playerName.trim());
        } else {
            a.a("Please enter a valid player name!");
        }
    }

    /**
     * Opens dual-input field box (main.a.M) for typing target player and private message text.
     */
    public static void promptPrivateMessage() {
        if (a.M != null) {
            a.M.a("Recipient:", "Message:");
            if (a.M.d != null) a.M.d.b(50);  // Set max length for recipient text field
            if (a.M.e != null) a.M.e.b(200); // Set max length for message text field
            a.M.a("Send PM", new bd("Cancel", 8882), new bd("Send", 888912), 0, 0);
            a.J = a.M;
        }
    }

    /**
     * Reads typed recipient and message text, then dispatches private message.
     */
    public static void submitPrivateMessage() {
        String recipient = null;
        String message = null;
        if (a.M != null && a.M.d != null && a.M.e != null) {
            recipient = a.M.d.d();
            message = a.M.e.d();
        }
        a.j();
        if (recipient != null && message != null && recipient.trim().length() > 0 && message.trim().length() > 0) {
            mod.chat.MatrixChat.sendPrivateMessage(recipient.trim(), message.trim());
        } else {
            a.a("Invalid recipient or message!");
        }
    }

    /**
     * Opens single-input field box (main.a.L) for typing map chat text.
     */
    public static void promptMapChat() {
        bd sendCmd = new bd("Send", 888913);
        a.L.a("Enter Map Message:", sendCmd, 0);
    }

    /**
     * Reads typed text and dispatches map chat message.
     */
    public static void submitMapChat() {
        String message = null;
        if (a.L != null && a.L.d != null) {
            message = a.L.d.d();
        }
        a.j();
        if (message != null && message.trim().length() > 0) {
            mod.chat.MatrixChat.sendMapChat(message.trim());
        } else {
            a.a("Please enter a valid message!");
        }
    }

    /**
     * Opens single-input field box (main.a.L) for typing world chat text.
     */
    public static void promptWorldChat() {
        bd sendCmd = new bd("Send", 888916);
        a.L.a("Enter World Message:", sendCmd, 0);
    }

    /**
     * Reads typed text and dispatches world chat message.
     */
    public static void submitWorldChat() {
        String message = null;
        if (a.L != null && a.L.d != null) {
            message = a.L.d.d();
        }
        a.j();
        if (message != null && message.trim().length() > 0) {
            mod.chat.MatrixChat.sendWorldChat(message.trim());
        } else {
            a.a("Please enter a valid message!");
        }
    }

    /**
     * Opens single-input field box (main.a.L) for typing clan chat text.
     */
    public static void promptClanChat() {
        bd sendCmd = new bd("Send", 888917);
        a.L.a("Enter Clan Message:", sendCmd, 0);
    }

    /**
     * Reads typed text and dispatches clan chat message.
     */
    public static void submitClanChat() {
        String message = null;
        if (a.L != null && a.L.d != null) {
            message = a.L.d.d();
        }
        a.j();
        if (message != null && message.trim().length() > 0) {
            mod.chat.MatrixChat.sendClanChat(message.trim());
        } else {
            a.a("Please enter a valid message!");
        }
    }
}
