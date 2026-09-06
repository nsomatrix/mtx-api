package mod.net;

import dh;
import dq;
import co;
import u;
import mod.log.MatrixLogger;

public class MatrixAutoReconnect implements Runnable {

    public static boolean enableAutoLogin = true;
    public static boolean hasBeenConnectedOnce = false;
    private static boolean isReconnecting = false;

    private static MatrixAutoReconnect instance;
    private static Thread watchdogThread;
    private static boolean running = false;
    private static long lastPingTime = 0;
    private static long lastLoginAttempt = 0;

    public static void toggleAutoLogin() {
        enableAutoLogin = !enableAutoLogin;
        MatrixLogger.log("AUTO-RECONNECT", "AutoLogin toggled: " + (enableAutoLogin ? "ENABLED" : "DISABLED"));
    }

    /**
     * Starts the auto-reconnect and anti-disconnect keepalive watchdog loop.
     */
    public static synchronized void startWatchdog() {
        if (running) return;
        running = true;
        instance = new MatrixAutoReconnect();
        watchdogThread = new Thread(instance);
        watchdogThread.start();
        MatrixLogger.log("AUTO-RECONNECT", "Watchdog active with socket guards.");
    }

    public static void stopWatchdog() {
        running = false;
    }

    public void run() {
        while (running) {
            try {
                Thread.sleep(5000); // Check every 5 seconds

                if (!enableAutoLogin) {
                    continue;
                }

                long now = System.currentTimeMillis();
                dh session = dh.a();
                boolean isConnected = (session != null && session.f);
                boolean isConnecting = (session != null && session.g);

                // DO NOT INTERRUPT if socket is currently connecting
                if (isConnecting) {
                    continue;
                }

                if (isConnected) {
                    // Mark that player has established a connection in this session
                    hasBeenConnectedOnce = true;

                    // 1. If at Character Select Screen (u.b()) during an auto-reconnect sequence
                    if (isReconnecting && main.a.E != null && u.b() != null && main.a.E == u.b()) {
                        if (now - lastLoginAttempt > 4000) {
                            lastLoginAttempt = now;
                            autoSelectCharacter();
                            isReconnecting = false; // Reconnect flow completed
                        }
                        continue;
                    }

                    // 2. Send anti-idle keepalive ping every 30 seconds of inactivity when in-game
                    if (now - lastPingTime > 30000) {
                        lastPingTime = now;
                        try {
                            dq.a().d();
                        } catch (Exception e) {
                            // Suppress ping error
                        }
                    }
                } else {
                    // Socket is DISCONNECTED (not connected and not connecting)
                    // Only trigger auto-login if player has connected at least once in this session
                    if (!hasBeenConnectedOnce) {
                        continue;
                    }

                    // Cooldown of 10 seconds to allow TCP handshake to complete without interruption
                    if (now - lastLoginAttempt > 10000) {
                        lastLoginAttempt = now;

                        // Only clear popup if at main menu screen
                        if (main.a.E != null && main.a.G != null && main.a.E == main.a.G) {
                            if (main.a.J != null) {
                                main.a.J = null;
                            }
                            MatrixLogger.log("AUTO-RECONNECT", "Disconnected state at Main Menu. Triggering auto-reconnect...");
                            isReconnecting = true;
                            triggerAutoLogin();
                        }
                    }
                }
            } catch (Exception e) {
                MatrixLogger.log("AUTO-RECONNECT", "Watchdog loop warning: " + e.getMessage());
            }
        }
    }

    private static void autoSelectCharacter() {
        try {
            u charSelectScreen = u.b();
            if (charSelectScreen != null && charSelectScreen.g != null && charSelectScreen.g.length > 0) {
                int idx = charSelectScreen.a;
                if (idx < 0 || idx >= charSelectScreen.g.length || charSelectScreen.g[idx] == null) {
                    idx = 0;
                    for (int i = 0; i < charSelectScreen.g.length; i++) {
                        if (charSelectScreen.g[i] != null) {
                            idx = i;
                            break;
                        }
                    }
                    charSelectScreen.a = idx;
                }

                String charName = charSelectScreen.g[idx];
                if (charName != null && charName.length() > 0) {
                    MatrixLogger.log("AUTO-RECONNECT", "Auto-selecting character: " + charName);
                    charSelectScreen.a(1000, null);
                }
            }
        } catch (Exception e) {
            MatrixLogger.log("AUTO-RECONNECT", "Character selection error: " + e.getMessage());
        }
    }

    private static void triggerAutoLogin() {
        try {
            if (main.a.G != null && main.a.E == main.a.G) {
                int actionId = (co.a != null && co.a.length() > 0 && !co.a.startsWith("tmpusr")) ? 1003 : 1000;
                MatrixLogger.log("AUTO-RECONNECT", "Invoking login action (" + actionId + ")");
                main.a.G.a(actionId, null);
            }
        } catch (Exception e) {
            MatrixLogger.log("AUTO-RECONNECT", "Auto-login trigger error: " + e.getMessage());
        }
    }
}

