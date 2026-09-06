package mod.log;

import bp;
import df;

public class MatrixLogger {
    public static boolean enableLogging = true;
    public static boolean logMovementPackets = false; // Filter high-frequency movement sync packets (1, -30, -28)

    private static String lastLoggedPlayer = "";

    public static void log(String category, String message) {
        if (!enableLogging) return;
        System.out.println("[MATRIX::" + category + "] " + message);
    }

    public static void logCommand(int commandId) {
        log("COMMAND", "Action/Menu Triggered -> ID: " + commandId);
    }

    public static void logKey(int keyCode) {
        String keyName = getKeyName(keyCode);
        log("KEY", "Key Pressed -> Code: " + keyCode + " (" + keyName + ")");
    }

    public static void logPacketSend(int packetId, int size) {
        if (!logMovementPackets && (packetId == 1 || packetId == -30 || packetId == -28)) return;
        log("NET-OUT", "Sending Packet -> ID: " + packetId + " | Payload Size: " + size + " bytes");
    }

    public static void logPacketRecv(int packetId) {
        if (!logMovementPackets && (packetId == 1 || packetId == -30 || packetId == -28)) return;
        log("NET-IN", "Received Packet -> ID: " + packetId);
    }

    public static void logDialog(String text) {
        log("DIALOG", "Game Notice Box -> \"" + text + "\"");
    }

    public static void logChat(String channel, String sender, String recipient, String message) {
        if (recipient != null && recipient.trim().length() > 0) {
            log("CHAT", "[" + channel + "] " + sender + " -> " + recipient + ": \"" + message + "\"");
        } else {
            log("CHAT", "[" + channel + "] " + sender + ": \"" + message + "\"");
        }
    }

    public static void logPlayerInfo(bp player) {
        if (player == null || player.ab == null || player.ab.trim().length() == 0) return;
        
        // Trigger REST API Sync for web streaming (always posts profile to web API)
        try {
            mod.web.MatrixWebClient.postPlayerStats(player);
        } catch (Exception e) {}

        // Ensure console info prints EXACTLY ONCE per player inspection request (prevents frame-repaint flooding)
        if (player.ab.equals(lastLoggedPlayer)) {
            return;
        }
        lastLoggedPlayer = player.ab;

        String schoolName = "Unknown";
        try {
            int schoolId = player.a();
            if (df.eK != null && schoolId >= 0 && schoolId < df.eK.length) {
                schoolName = df.eK[schoolId];
            }
        } catch (Exception e) {}

        String className = (player.av != null && player.av.b != null) ? player.av.b : "Unknown";

        System.out.println("==================================================");
        System.out.println("⚡ [MATRIX::PLAYER-INFO] Programmatic Target Profile");
        System.out.println("  Character:                 " + player.ab);
        System.out.println("  Aggressive:                " + player.aM);
        System.out.println("  Level:                     " + player.w);
        System.out.println("  Class:                     " + className);
        System.out.println("  School:                    " + schoolName);
        System.out.println("  HP:                        " + player.z + " / " + player.B);
        System.out.println("  MP:                        " + player.x + " / " + player.y);
        System.out.println("  Speed:                     " + player.b());
        System.out.println("  Attack:                    " + (player.u - player.u / 10) + "-" + player.u);
        System.out.println("  Anti Fire:                 " + player.aG);
        System.out.println("  Anti Ice:                  " + player.aH);
        System.out.println("  Anti Wind:                 " + player.aI);
        System.out.println("  Reduce Pain:               " + player.v);
        System.out.println("  Accurate Point:            " + player.aK);
        System.out.println("  Dodge Ability:             " + player.aJ);
        System.out.println("  Critical:                  " + player.aL);
        System.out.println("  Close Combat Strike Back:  " + player.aO);
        System.out.println("  Anti Chakra:               " + player.aP);
        System.out.println("  Anti Chakra Back:          " + player.aQ);
        System.out.println("==================================================");
    }

    public static void resetLoggedPlayer() {
        lastLoggedPlayer = "";
    }

    public static String getLastLoggedPlayer() {
        return lastLoggedPlayer;
    }

    private static String getKeyName(int keyCode) {
        switch (keyCode) {
            case -1: return "UP Arrow";
            case -2: return "DOWN Arrow";
            case -3: return "LEFT Arrow";
            case -4: return "RIGHT Arrow";
            case -5: return "SELECT / OK";
            case -6: return "SOFTKEY 1 (LEFT)";
            case -7: return "SOFTKEY 2 (RIGHT)";
            case 48: return "KEY 0";
            case 49: return "KEY 1";
            case 50: return "KEY 2";
            case 51: return "KEY 3";
            case 52: return "KEY 4";
            case 53: return "KEY 5";
            case 54: return "KEY 6";
            case 55: return "KEY 7";
            case 56: return "KEY 8";
            case 57: return "KEY 9";
            case 42: return "KEY *";
            case 35: return "KEY #";
            default: return "Custom Key";
        }
    }
}
