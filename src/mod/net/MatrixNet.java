package mod.net;

import dq;
import main.a;
import mod.log.MatrixLogger;
import java.util.Hashtable;

public class MatrixNet {

    public static boolean isWebTriggeredInspect = false;
    public static String lastRequestedTarget = null;
    public static long lastRequestedTime = 0;

    private static Hashtable pendingWebInspects = new Hashtable();
    private static Hashtable recentRequestedTargets = new Hashtable();
    private static String lastWebFulfilledTarget = null;
    private static long lastWebFulfilledTime = 0;

    public static synchronized void markWebInspect(String playerName) {
        if (playerName != null && playerName.trim().length() > 0) {
            String key = playerName.trim().toLowerCase();
            pendingWebInspects.put(key, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static synchronized String findRecentTargetForNotice(String text) {
        long now = System.currentTimeMillis();
        String cleanText = (text != null) ? text.toLowerCase() : "";

        java.util.Enumeration keys = recentRequestedTargets.keys();
        String bestMatch = null;
        long oldestPendingTime = Long.MAX_VALUE;

        while (keys.hasMoreElements()) {
            String nameKey = (String) keys.nextElement();
            Long timeObj = (Long) recentRequestedTargets.get(nameKey);
            if (timeObj != null) {
                long t = timeObj.longValue();
                if (now - t > 15000) {
                    recentRequestedTargets.remove(nameKey); // Expired
                    continue;
                }
                // Case 1: Notice text explicitly contains the target player name
                if (cleanText.length() > 0 && cleanText.indexOf(nameKey) != -1) {
                    return nameKey;
                }
                // Case 2: Track the oldest unfulfilled pending web inspect request
                if (isPendingWebInspect(nameKey) && t < oldestPendingTime) {
                    oldestPendingTime = t;
                    bestMatch = nameKey;
                }
            }
        }

        if (bestMatch != null) {
            return bestMatch;
        }

        // Fallback to lastRequestedTarget if within 15s window
        if (lastRequestedTarget != null && (now - lastRequestedTime < 15000)) {
            return lastRequestedTarget;
        }

        return null;
    }

    public static synchronized boolean isPendingWebInspect(String playerName) {
        if (playerName == null || playerName.trim().length() == 0) return false;
        String key = playerName.trim().toLowerCase();
        
        // Check if recently fulfilled within last 3 seconds (suppresses secondary retry pulse in web inspects)
        long now = System.currentTimeMillis();
        if (key.equalsIgnoreCase(lastWebFulfilledTarget) && (now - lastWebFulfilledTime < 3000)) {
            return true;
        }

        Long timeObj = (Long) pendingWebInspects.get(key);
        if (timeObj != null) {
            long elapsed = now - timeObj.longValue();
            if (elapsed < 15000) { // Valid pending window: 15 seconds
                return true;
            } else {
                pendingWebInspects.remove(key); // Expired
            }
        }
        return false;
    }

    public static synchronized void markWebFulfilled(String playerName) {
        if (playerName != null && playerName.trim().length() > 0) {
            String key = playerName.trim().toLowerCase();
            pendingWebInspects.remove(key);
            recentRequestedTargets.remove(key);
            lastWebFulfilledTarget = key;
            lastWebFulfilledTime = System.currentTimeMillis();
        }
    }

    public static synchronized void clearWebInspect(String playerName) {
        if (playerName != null && playerName.trim().length() > 0) {
            String key = playerName.trim().toLowerCase();
            pendingWebInspects.remove(key);
            recentRequestedTargets.remove(key);
            if (key.equalsIgnoreCase(lastWebFulfilledTarget)) {
                lastWebFulfilledTarget = null;
                lastWebFulfilledTime = 0;
            }
        }
    }

    /**
     * Programmatically requests full player info for any target player by name string via Packet 93.
     */
    public static void inspectPlayer(String playerName) {
        inspectPlayer(playerName, false);
    }

    public static void inspectPlayer(final String playerName, final boolean fromWeb) {
        if (playerName != null && playerName.length() > 0) {
            final String cleanTarget = playerName.trim();
            isWebTriggeredInspect = fromWeb;
            lastRequestedTarget = cleanTarget;
            lastRequestedTime = System.currentTimeMillis();
            recentRequestedTargets.put(cleanTarget.toLowerCase(), Long.valueOf(lastRequestedTime));

            if (fromWeb) {
                markWebInspect(cleanTarget);
            } else {
                clearWebInspect(cleanTarget); // Ensure manual inspects override any stale web mark
            }

            MatrixLogger.resetLoggedPlayer(); // Reset cache to allow fresh print for new target
            MatrixLogger.log("API", "Sending programmatic Inspect Request (fromWeb=" + fromWeb + ") for: \"" + cleanTarget + "\"");
            
            // Primary Dispatch (Pulse #1 - Warms up cold server cache)
            dq.a().a(cleanTarget, 0);

            // Automatic Dual-Pulse Retry (Pulse #2 at +750ms if cold server cache delayed first response)
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(750);
                        if (cleanTarget.equalsIgnoreCase(lastRequestedTarget) 
                            && !cleanTarget.equalsIgnoreCase(MatrixLogger.getLastLoggedPlayer())) {
                            MatrixLogger.log("API", "Executing Warm-Up Dual-Pulse for target: \"" + cleanTarget + "\"");
                            dq.a().a(cleanTarget, 0);
                        }
                    } catch (Exception e) {}
                }
            }).start();
        } else {
            a.a("Invalid Player Name!");
        }
    }
}
