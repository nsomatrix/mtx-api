package mod.chat;

import ce;
import bp;
import dg;
import dq;
import main.a;
import mod.log.MatrixLogger;
import mod.web.MatrixWebClient;

/**
 * MatrixChat — Messaging Subsystem & Outbound Packet Dispatcher.
 * 
 * Provides unified, non-blocking chat capabilities across Map, World, Private (Whisper),
 * and Clan channels for J2ME MIDP 2.0 / CLDC 1.1.
 */
public class MatrixChat {

    /**
     * Sends a local map chat message visible to nearby players in the current zone.
     */
    public static void sendMapChat(String text) {
        if (text == null || text.trim().length() == 0) {
            a.a("Please enter a valid message!");
            return;
        }
        String clean = text.trim();
        MatrixLogger.log("CHAT", "[Map] -> " + clean);
        try {
            dq.a().c(clean); // Outbound packet -23 (Public / Map Chat)
            onChatSent("MAP", null, clean);
        } catch (Exception e) {
            MatrixLogger.log("CHAT-ERR", "Failed to send map chat: " + e.getMessage());
        }
    }

    /**
     * Sends a world chat broadcast message to the entire server.
     */
    public static void sendWorldChat(String text) {
        if (text == null || text.trim().length() == 0) {
            a.a("Please enter a valid message!");
            return;
        }
        String clean = text.trim();
        MatrixLogger.log("CHAT", "[World] -> " + clean);
        try {
            dq.a().k(clean); // Outbound packet -21
            onChatSent("WORLD", null, clean);
        } catch (Exception e) {
            MatrixLogger.log("CHAT-ERR", "Failed to send world chat: " + e.getMessage());
        }
    }

    /**
     * Sends a direct private message (whisper) to a specific target player.
     */
    public static void sendPrivateMessage(String recipient, String text) {
        if (recipient == null || recipient.trim().length() == 0) {
            a.a("Please enter a target player name!");
            return;
        }
        if (text == null || text.trim().length() == 0) {
            a.a("Please enter a message!");
            return;
        }
        String cleanTarget = recipient.trim();
        String cleanText = text.trim();
        MatrixLogger.log("CHAT", "[Whisper to " + cleanTarget + "] -> " + cleanText);
        try {
            dq.a().a(cleanTarget, cleanText); // Outbound packet -22
            onChatSent("PRIVATE", cleanTarget, cleanText);
        } catch (Exception e) {
            MatrixLogger.log("CHAT-ERR", "Failed to send PM to " + cleanTarget + ": " + e.getMessage());
        }
    }

    /**
     * Sends a clan chat message to online clan members.
     */
    public static void sendClanChat(String text) {
        if (text == null || text.trim().length() == 0) {
            a.a("Please enter a valid message!");
            return;
        }
        String clean = text.trim();
        MatrixLogger.log("CHAT", "[Clan] -> " + clean);
        try {
            dq.a().l(clean); // Outbound packet -19
            onChatSent("CLAN", null, clean);
        } catch (Exception e) {
            MatrixLogger.log("CHAT-ERR", "Failed to send clan chat: " + e.getMessage());
        }
    }

    /**
     * Internal callback invoked after sending any chat message.
     * Logs the event and asynchronously posts telemetry to the REST backend.
     */
    private static void onChatSent(String channel, String recipient, String text) {
        MatrixLogger.logChat(channel, "SELF", recipient, text);
        MatrixWebClient.postChatMessage(channel, "SELF", recipient, text);
    }

    /**
     * Intercepts and parses incoming game notice dialogs & chat alerts to stream to web dashboard.
     */
    public static void onChatReceived(String text) {
        if (text == null || text.trim().length() == 0) return;
        String clean = text.trim();

        String channel = "MAP";
        String sender = "GAME_NOTIFY";
        String msg = clean;

        if (clean.indexOf(":") != -1) {
            int colonIdx = clean.indexOf(":");
            String prefix = clean.substring(0, colonIdx).trim();
            msg = clean.substring(colonIdx + 1).trim();

            if (prefix.toLowerCase().indexOf("whisper") != -1 || prefix.toLowerCase().indexOf("pm") != -1) {
                channel = "PRIVATE";
                sender = prefix;
            } else if (prefix.toLowerCase().indexOf("clan") != -1) {
                channel = "CLAN";
                sender = prefix;
            } else if (prefix.toLowerCase().indexOf("world") != -1) {
                channel = "WORLD";
                sender = prefix;
            } else {
                channel = "MAP";
                sender = prefix;
            }
        }

        MatrixLogger.logChat(channel, sender, null, msg);
        MatrixWebClient.postChatMessage(channel, sender, null, msg);
    }

    /**
     * Non-destructively parses inbound network chat packets (PM, World, Clan, Map)
     * using an isolated, cloned byte array stream so the game engine's internal stream
     * is completely untouched and 100% stable.
     */
    public static void parseInboundChatPacket(byte command, ce packet) {
        if (packet == null) return;

        byte[] rawBytes = packet.a();
        if (rawBytes == null || rawBytes.length == 0) return;

        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(rawBytes);
        java.io.DataInputStream dis = new java.io.DataInputStream(bais);

        try {
            String sender = null;
            String message = null;
            String channel = "MAP";

            if (command == -22) {
                // Whisper PM
                channel = "PRIVATE";
                sender = dis.readUTF();
                message = dis.readUTF();
            } else if (command == -21) {
                // World Broadcast
                channel = "WORLD";
                sender = dis.readUTF();
                message = dis.readUTF();
            } else if (command == -19) {
                // Clan Chat
                channel = "CLAN";
                sender = dis.readUTF();
                message = dis.readUTF();
            } else if (command == -23 || command == -20 || command == -24) {
                // Public Map Chat
                channel = "MAP";
                try {
                    int pId = dis.readInt();
                    bp p = (bp.d() != null && bp.d().p == pId) ? bp.d() : dg.e(pId);
                    if (p != null && p.ab != null && p.ab.trim().length() > 0) {
                        sender = p.ab.trim();
                    } else {
                        sender = "Player_" + pId;
                    }
                    message = dis.readUTF();
                } catch (Exception ex) {
                    // Fallback format if pId is omitted
                    try {
                        bais = new java.io.ByteArrayInputStream(rawBytes);
                        dis = new java.io.DataInputStream(bais);
                        message = dis.readUTF();
                        sender = "MAP_PLAYER";
                    } catch (Exception innerEx) {}
                }
            }

            if (message != null && message.trim().length() > 0) {
                if (sender == null || sender.trim().length() == 0) {
                    sender = "GAME_SERVER";
                }
                MatrixLogger.logChat(channel, sender, null, message.trim());
                MatrixWebClient.postChatMessage(channel, sender, null, message.trim());
            }
        } catch (Exception e) {
            // Ignore non-chat or unparseable packets safely
        } finally {
            try { dis.close(); } catch (Exception ignored) {}
            try { bais.close(); } catch (Exception ignored) {}
        }
    }
}
