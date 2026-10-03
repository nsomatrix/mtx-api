package mod.chat;

import dq;
import main.a;
import mod.log.MatrixLogger;

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
        } catch (Exception e) {
            MatrixLogger.log("CHAT-ERR", "Failed to send clan chat: " + e.getMessage());
        }
    }
}

