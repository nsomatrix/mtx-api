package mod;

import aa;
import bp;
import ce;
import dg;
import mod.ui.MatrixUI;
import mod.net.MatrixNet;
import mod.log.MatrixLogger;
import mod.web.MatrixWebClient;

/**
 * MatrixAPI — Central Facade & Bytecode Hook Entrypoint.
 * 
 * Provides unified, stable static entry points for Patcher.java while
 * delegating domain responsibilities to modular sub-packages:
 *  - mod.ui.MatrixUI
 *  - mod.net.MatrixNet
 *  - mod.log.MatrixLogger
 *  - mod.web.MatrixWebClient
 */
public class MatrixAPI {

    // Configuration flags
    public static boolean enableLogging = MatrixLogger.enableLogging;
    public static boolean logMovementPackets = MatrixLogger.logMovementPackets;
    public static boolean enableWebSync = MatrixWebClient.enableWebSync;
    public static boolean enableAutoLogin = mod.net.MatrixAutoReconnect.enableAutoLogin;
    public static String restApiEndpoint = MatrixWebClient.restApiEndpoint;

    public static void toggleAutoLogin() {
        mod.net.MatrixAutoReconnect.toggleAutoLogin();
        enableAutoLogin = mod.net.MatrixAutoReconnect.enableAutoLogin;
    }

    // =========================================================================
    // UI & MENU HOOKS
    // =========================================================================

    public static void addMatrixMenuItem(aa vector) {
        MatrixWebClient.startPollingLoop();
        MatrixUI.addMatrixMenuItem(vector);
    }

    public static boolean handleMatrixCommand(int commandId, Object obj) {
        return MatrixUI.handleMatrixCommand(commandId, obj);
    }

    public static void showMatrixMenu() {
        MatrixUI.showMatrixMenu();
    }

    public static void promptPlayerName() {
        MatrixUI.promptPlayerName();
    }

    public static void submitPlayerInspect() {
        MatrixUI.submitPlayerInspect();
    }

    // =========================================================================
    // NETWORK & PLAYER INSPECTION HOOKS
    // =========================================================================

    public static void inspectPlayer(String playerName) {
        MatrixNet.inspectPlayer(playerName);
    }

    // =========================================================================
    // LOGGING & TRACING HOOKS
    // =========================================================================

    public static void log(String category, String message) {
        MatrixLogger.log(category, message);
    }

    public static void logCommand(int commandId) {
        MatrixWebClient.startPollingLoop();
        MatrixLogger.logCommand(commandId);
    }

    public static void logKey(int keyCode) {
        MatrixLogger.logKey(keyCode);
    }

    public static void logPacketSend(int packetId, int size) {
        MatrixLogger.logPacketSend(packetId, size);
    }

    public static void logPacketRecv(int packetId) {
        MatrixWebClient.startPollingLoop();
        MatrixLogger.logPacketRecv(packetId);
    }

    public static void onPacketReceived(ce packet) {
        if (packet == null) return;
        MatrixWebClient.startPollingLoop();
        MatrixLogger.logPacketRecv(packet.a);

        // Auto-dump items when game data resources packet arrives (Packet -28 or -29)
        if (packet.a == -28 || packet.a == -29) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(3000); // Wait 3s for game engine to unpack e.a table
                        mod.item.MatrixItemExporter.dumpItemsToConsole();
                    } catch (Exception e) {}
                }
            }).start();
        }
    }

    public static boolean handleNoticeDialog(String text) {
        MatrixLogger.logDialog(text);
        return MatrixWebClient.handleNoticeDialog(text);
    }

    public static void onPrivateMessageReceived(String sender, String text) {
        if (sender == null || text == null) return;
        MatrixLogger.logChat("Private", sender, null, text);
    }

    public static void logPlayerInfo(bp player) {
        MatrixLogger.logPlayerInfo(player);
    }

    public static boolean checkAndHandleWebInspect(bp player) {
        if (player == null || player.ab == null) return false;
        MatrixLogger.logPlayerInfo(player);
        if (MatrixNet.isPendingWebInspect(player.ab)) {
            MatrixLogger.log("API", "Remote Web Inspect fulfilled for target: \"" + player.ab + "\". Suppressing in-game UI.");
            MatrixNet.markWebFulfilled(player.ab);
            try {
                if (dg.n() != null) {
                    dg.n().v();
                }
            } catch (Exception e) {}
            return true;
        }
        return false;
    }

    public static void resetLoggedPlayer() {
        MatrixLogger.resetLoggedPlayer();
    }

    // =========================================================================
    // WEB REST API HOOKS
    // =========================================================================

    public static void postPlayerStats(bp player) {
        MatrixWebClient.postPlayerStats(player);
    }

    public static void toggleWebSync() {
        MatrixWebClient.enableWebSync = !MatrixWebClient.enableWebSync;
        enableWebSync = MatrixWebClient.enableWebSync;
        log("WEB-REST", "Web REST Sync set to: " + (enableWebSync ? "ENABLED" : "DISABLED"));
    }

    public static void setRestEndpoint(String newUrl) {
        MatrixWebClient.setRestEndpoint(newUrl);
        restApiEndpoint = MatrixWebClient.restApiEndpoint;
    }

    public static void promptRestEndpoint() {
        MatrixUI.promptRestEndpoint();
    }

    public static void submitRestEndpoint() {
        MatrixUI.submitRestEndpoint();
    }
}
