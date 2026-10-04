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
        bd matrixBtn = new bd("MTX-API", 888999);
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
        }
        return false;
    }

    /**
     * Displays main MatrixAPI menu list.
     */
    public static void showMatrixMenu() {
        aa menuList = new aa();
        menuList.addElement(new bd("Inspect Player Target", 888901));
        boolean syncState = mod.web.MatrixWebClient.enableWebSync;
        menuList.addElement(new bd("REST Web Sync [" + (syncState ? "ON" : "OFF") + "]", 888904));
        menuList.addElement(new bd("Set REST API Endpoint", 888905));
        boolean autoLoginState = mod.net.MatrixAutoReconnect.enableAutoLogin;
        menuList.addElement(new bd("Auto Login [" + (autoLoginState ? "ON" : "OFF") + "]", 888907));
        a.F.a(menuList); // Native interactive menu list
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
}
