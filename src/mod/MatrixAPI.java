package mod;

import aa;
import bp;
import by;
import ce;
import dg;
import dq;
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

    private static bp currentInspectedPlayer = null;
    private static long lastPacket94Time = 0;
    private static Thread packet94DebounceThread = null;

    public static void onPacketReceived(ce packet) {
        if (packet == null) return;
        MatrixWebClient.startPollingLoop();
        MatrixLogger.logPacketRecv(packet.a);

        // When Packet 94 (Item Option Details) arrives, copy options and send ONE debounced POST request
        if (packet.a == 94 && currentInspectedPlayer != null) {
            lastPacket94Time = System.currentTimeMillis();

            synchronized (MatrixAPI.class) {
                if (packet94DebounceThread == null || !packet94DebounceThread.isAlive()) {
                    packet94DebounceThread = new Thread(new Runnable() {
                        public void run() {
                            try {
                                // Wait until 400ms passes with no new Packet 94 arriving
                                while (System.currentTimeMillis() - lastPacket94Time < 400) {
                                    Thread.sleep(100);
                                }

                                bp myPlayer = dg.aV;
                                if (myPlayer != null && myPlayer.aD != null && currentInspectedPlayer != null && currentInspectedPlayer.aD != null) {
                                    for (int i = 0; i < currentInspectedPlayer.aD.length && i < myPlayer.aD.length; i++) {
                                        by myItem = myPlayer.aD[i];
                                        by targetItem = currentInspectedPlayer.aD[i];
                                        if (myItem != null && targetItem != null && myItem.c != null && myItem.c.size() > 0) {
                                            targetItem.g = myItem.g;
                                            targetItem.n = myItem.n;
                                            targetItem.i = myItem.i;
                                            targetItem.c = myItem.c;
                                        }
                                    }
                                }
                                if (currentInspectedPlayer != null) {
                                    MatrixWebClient.postPlayerStats(currentInspectedPlayer, true);
                                }
                            } catch (Exception ex) {}
                        }
                    });
                    packet94DebounceThread.start();
                }
            }
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

    public static boolean checkAndHandleWebInspect(final bp player) {
        if (player == null || player.ab == null) return false;
        currentInspectedPlayer = player;

        // Dispatch Packet 94 to request item option stats for all equipment slots
        try {
            if (player.aD != null) {
                for (int i = 0; i < player.aD.length; i++) {
                    if (player.aD[i] != null) {
                        dq.a().d(player.p, i);
                    }
                }
            }
        } catch (Exception e) {}

        boolean isWeb = MatrixNet.isPendingWebInspect(player.ab);
        if (isWeb) {
            MatrixLogger.log("API", "Remote Web Inspect fulfilled for target: \"" + player.ab + "\". Suppressing in-game UI.");
            MatrixNet.markWebFulfilled(player.ab);
        }

        // Wait 600ms for incoming Packet 94 option detail packets to unpack completely before posting atomic snapshot
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(600);
                } catch (Exception e) {}

                try {
                    bp myPlayer = dg.aV;
                    if (myPlayer != null && myPlayer.aD != null && player != null && player.aD != null) {
                        for (int i = 0; i < player.aD.length && i < myPlayer.aD.length; i++) {
                            by myItem = myPlayer.aD[i];
                            by targetItem = player.aD[i];
                            if (myItem != null && targetItem != null && myItem.c != null && myItem.c.size() > 0) {
                                targetItem.g = myItem.g;
                                targetItem.n = myItem.n;
                                targetItem.i = myItem.i;
                                targetItem.c = myItem.c;
                            }
                        }
                    }
                } catch (Exception ex) {}

                MatrixLogger.logPlayerInfo(player);
            }
        }).start();

        if (isWeb) {
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
