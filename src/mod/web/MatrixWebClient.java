package mod.web;

import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.rms.RecordStore;
import java.io.OutputStream;
import java.io.InputStream;
import bp;
import by;
import cg;
import df;
import mod.log.MatrixLogger;

/**
 * MatrixWebClient — Asynchronous HTTP REST API Engine for J2ME.
 * 
 * Provides non-blocking streaming of player profiles and telemetry
 * to remote REST endpoints using J2ME MIDP 2.0 HttpConnection.
 */
public class MatrixWebClient {

    public static boolean enableWebSync = true;
    public static boolean enablePolling = true;
    public static String restApiEndpoint = loadEndpointFromRMS();
    private static Thread pollThread = null;

    /**
     * Resolves the full POST players API URL regardless of how user entered it.
     */
    public static String getPlayersEndpointUrl() {
        if (restApiEndpoint == null || restApiEndpoint.trim().length() == 0) return null;
        String base = restApiEndpoint.trim();
        if (base.endsWith("/")) {
            base = base.substring(0, base.length() - 1);
        }
        if (base.endsWith("/api/v1/inspect")) {
            return base.substring(0, base.length() - 15) + "/api/v1/players";
        }
        if (base.endsWith("/api/v1/players")) {
            return base;
        }
        if (base.endsWith("/api/v1")) {
            return base + "/players";
        }
        return base + "/api/v1/players";
    }

    /**
     * Resolves the full GET inspect API URL regardless of how user entered it.
     */
    public static String getInspectEndpointUrl() {
        if (restApiEndpoint == null || restApiEndpoint.trim().length() == 0) return null;
        String base = restApiEndpoint.trim();
        if (base.endsWith("/")) {
            base = base.substring(0, base.length() - 1);
        }
        if (base.endsWith("/api/v1/players")) {
            return base.substring(0, base.length() - 15) + "/api/v1/inspect";
        }
        if (base.endsWith("/api/v1/inspect")) {
            return base;
        }
        if (base.endsWith("/api/v1")) {
            return base + "/inspect";
        }
        return base + "/api/v1/inspect";
    }



    private static java.util.Vector activeLiveTargets = new java.util.Vector();
    private static java.util.Hashtable lastPostTimes = new java.util.Hashtable();

    public static boolean isWebTarget(String name) {
        return mod.net.MatrixNet.isPendingWebInspect(name);
    }

    /**
     * Starts background worker thread polling the remote REST server for queued inspect targets and outbound chat messages.
     */
    public static synchronized void startPollingLoop() {
        mod.net.MatrixAutoReconnect.startWatchdog();
        if (pollThread != null && pollThread.isAlive()) return;

        pollThread = new Thread(new Runnable() {
            public void run() {
                MatrixLogger.log("WEB-REST", "Background Telemetry Poller active!");
                while (enableWebSync && enablePolling) {
                    try {
                        Thread.sleep(6000); // Poll every 6.0 seconds for new web inspect targets
                        checkPendingInspectTarget();
                    } catch (Exception e) {
                    }
                }
            }
        });
        pollThread.start();
    }

    private static void checkPendingInspectTarget() {
        if (!enableWebSync || restApiEndpoint == null || restApiEndpoint.trim().length() == 0) return;

        String inspectUrl = getInspectEndpointUrl();
        if (inspectUrl == null) return;

        HttpConnection conn = null;
        InputStream is = null;
        try {
            conn = (HttpConnection) Connector.open(inspectUrl, Connector.READ, true);
            conn.setRequestMethod(HttpConnection.GET);
            conn.setRequestProperty("User-Agent", "MTX-API/1.0 (J2ME MIDP2.0)");

            int code = conn.getResponseCode();
            if (code == HttpConnection.HTTP_OK) {
                is = conn.openInputStream();
                StringBuffer sb = new StringBuffer();
                int ch;
                while ((ch = is.read()) != -1) {
                    sb.append((char) ch);
                }
                String resp = sb.toString();
                String target = extractTargetFromJson(resp);
                if (target != null && target.trim().length() > 0) {
                    String cleanName = target.trim();
                    if (cleanName.equalsIgnoreCase("__CLEAR__")) {
                        MatrixLogger.log("WEB-REST", "Received Clear Command from Web: Purging active target list");
                        activeLiveTargets.removeAllElements();
                    } else {
                        boolean exists = false;
                        for (int i = 0; i < activeLiveTargets.size(); i++) {
                            if (((String) activeLiveTargets.elementAt(i)).equalsIgnoreCase(cleanName)) {
                                exists = true;
                                break;
                            }
                        }
                        if (!exists) {
                            if (activeLiveTargets.size() >= 50) {
                                activeLiveTargets.removeElementAt(0); // Evict oldest target to keep memory footprint low
                            }
                            activeLiveTargets.addElement(cleanName);
                        }
                        MatrixLogger.log("WEB-REST", "Added Multi-Target (" + activeLiveTargets.size() + " active): \"" + cleanName + "\"");
                        mod.net.MatrixNet.inspectPlayer(cleanName, true); // fromWeb = true
                    }
                }
            }
        } catch (Exception e) {
            MatrixLogger.log("WEB-REST", "Poll Check Warning (" + inspectUrl + "): " + e.getMessage());
        } finally {
            try { if (is != null) is.close(); } catch (Exception ex) {}
            try { if (conn != null) conn.close(); } catch (Exception ex) {}
        }
    }



    private static String extractTargetFromJson(String json) {
        if (json == null) return null;
        int idx = json.indexOf("\"target\":");
        if (idx == -1) return null;
        int colonIdx = idx + 9;
        // Skip whitespace after "target":
        while (colonIdx < json.length()) {
            char c = json.charAt(colonIdx);
            if (c == ' ' || c == '\t' || c == '\r' || c == '\n') {
                colonIdx++;
            } else {
                break;
            }
        }
        if (colonIdx >= json.length() || json.charAt(colonIdx) != '"') {
            return null; // Value is null, number, or boolean (not a quoted string)
        }
        int startQuote = colonIdx;
        int endQuote = json.indexOf("\"", startQuote + 1);
        if (endQuote == -1) return null;
        String val = json.substring(startQuote + 1, endQuote);
        if ("null".equals(val) || val.trim().length() == 0) return null;
        return val;
    }

    /**
     * Dynamically updates and persists the REST API Endpoint URL in J2ME RMS storage.
     */
    public static void setRestEndpoint(String newUrl) {
        if (newUrl != null && newUrl.trim().length() > 0) {
            restApiEndpoint = newUrl.trim();
            saveEndpointToRMS(restApiEndpoint);
            MatrixLogger.log("WEB-REST", "REST API Endpoint updated & saved: " + restApiEndpoint);
            startPollingLoop(); // Restart poller with new URL
        }
    }

    private static String loadEndpointFromRMS() {
        RecordStore rs = null;
        try {
            rs = RecordStore.openRecordStore("MatrixWebConfig", true);
            if (rs.getNumRecords() > 0) {
                byte[] data = rs.getRecord(1);
                if (data != null && data.length > 0) {
                    String saved = new String(data, "UTF-8");
                    if (saved != null && saved.indexOf("vercel.app") != -1) {
                        saved = "https://mtx-api.pages.dev/api/v1/players";
                        saveEndpointToRMS(saved);
                    }
                    return saved;
                }
            }
        } catch (Exception e) {
        } finally {
            try { if (rs != null) rs.closeRecordStore(); } catch (Exception e) {}
        }
        return "https://mtx-api.pages.dev/api/v1/players"; // Default Cloudflare Pages production fallback
    }

    private static void saveEndpointToRMS(String url) {
        RecordStore rs = null;
        try {
            rs = RecordStore.openRecordStore("MatrixWebConfig", true);
            byte[] data = url.getBytes("UTF-8");
            if (rs.getNumRecords() == 0) {
                rs.addRecord(data, 0, data.length);
            } else {
                rs.setRecord(1, data, 0, data.length);
            }
        } catch (Exception e) {
            MatrixLogger.log("WEB-REST", "RMS Save Error: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.closeRecordStore(); } catch (Exception e) {}
        }
    }

    /**
     * Asynchronously posts player profile stats to the configured REST API endpoint.
     */
    public static void postPlayerStats(final bp player) {
        postPlayerStats(player, false);
    }

    public static void postPlayerStats(final bp player, boolean force) {
        if (!enableWebSync || player == null || player.ab == null || player.ab.trim().length() == 0) {
            return;
        }

        // Per-player deduplication (400ms cooldown, bypassed if force is true)
        long now = System.currentTimeMillis();
        String pNameKey = player.ab.trim().toLowerCase();
        Long lastTimeObj = (Long) lastPostTimes.get(pNameKey);
        if (!force && lastTimeObj != null && (now - lastTimeObj.longValue() < 400)) {
            return;
        }
        lastPostTimes.put(pNameKey, Long.valueOf(now));

        final String postUrl = getPlayersEndpointUrl();
        if (postUrl == null) return;

        // Extract class name
        String classNameVal = "Unknown";
        if (player.av != null && player.av.b != null) {
            classNameVal = player.av.b;
        }
        final String className = classNameVal;

        // Extract school name
        String schoolNameVal = "Unknown";
        try {
            int schoolId = player.a();
            if (df.eK != null && schoolId >= 0 && schoolId < df.eK.length) {
                schoolNameVal = df.eK[schoolId];
            }
        } catch (Exception e) {}
        final String schoolName = schoolNameVal;

        // Run HTTP request on worker thread to avoid blocking main J2ME loop
        Thread webThread = new Thread(new Runnable() {
            public void run() {
                HttpConnection conn = null;
                OutputStream os = null;
                InputStream is = null;
                try {
                    String jsonPayload = buildPlayerJson(player, className, schoolName);

                    MatrixLogger.log("WEB-REST", "Sending REST POST to " + postUrl + " for: \"" + player.ab + "\"");

                    conn = (HttpConnection) Connector.open(postUrl, Connector.READ_WRITE, true);
                    conn.setRequestMethod(HttpConnection.POST);
                    conn.setRequestProperty("Content-Type", "application/json");
                    conn.setRequestProperty("User-Agent", "MTX-API/1.0 (J2ME MIDP2.0)");

                    byte[] data = jsonPayload.getBytes("UTF-8");
                    conn.setRequestProperty("Content-Length", Integer.toString(data.length));

                    os = conn.openOutputStream();
                    os.write(data);
                    os.flush();

                    int responseCode = conn.getResponseCode();
                    MatrixLogger.log("WEB-REST", "REST Response Code: " + responseCode + " for target: " + player.ab);

                    // Read response if available
                    if (responseCode == HttpConnection.HTTP_OK || responseCode == HttpConnection.HTTP_CREATED) {
                        is = conn.openInputStream();
                        StringBuffer sb = new StringBuffer();
                        int ch;
                        while ((ch = is.read()) != -1) {
                            sb.append((char) ch);
                        }
                        MatrixLogger.log("WEB-REST", "Server Response: " + sb.toString());
                    }
                } catch (Exception e) {
                    MatrixLogger.log("WEB-REST", "REST Request Warning (Server offline or unreachable): " + e.getMessage());
                } finally {
                    try { if (os != null) os.close(); } catch (Exception ex) {}
                    try { if (is != null) is.close(); } catch (Exception ex) {}
                    try { if (conn != null) conn.close(); } catch (Exception ex) {}
                }
            }
        });
        webThread.start();
    }

    /**
     * Constructs a valid CLDC 1.1 JSON string payload for player profile attributes.
     */
    private static String buildPlayerJson(bp player, String className, String schoolName) {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"name\":").append(quote(player.ab)).append(",");
        sb.append("\"level\":").append(player.w).append(",");
        sb.append("\"class\":").append(quote(className)).append(",");
        sb.append("\"school\":").append(quote(schoolName)).append(",");
        String genderStr = (player.aN == 1) ? "Female" : "Male";
        sb.append("\"gender\":").append(quote(genderStr)).append(",");
        String clanName = (player.ac != null && player.ac.trim().length() > 0) ? player.ac.trim() : "";
        sb.append("\"clan\":").append(quote(clanName)).append(",");
        sb.append("\"giaToc\":").append(quote(clanName)).append(",");
        sb.append("\"clanRank\":").append(player.ad).append(",");
        sb.append("\"hp\":").append(player.z).append(",");
        sb.append("\"maxHp\":").append(player.B).append(",");
        sb.append("\"mp\":").append(player.x).append(",");
        sb.append("\"maxMp\":").append(player.y).append(",");
        sb.append("\"speed\":").append(player.b()).append(",");
        sb.append("\"attackMin\":").append(player.u - player.u / 10).append(",");
        sb.append("\"attackMax\":").append(player.u).append(",");
        sb.append("\"antiFire\":").append(player.aG).append(",");
        sb.append("\"antiIce\":").append(player.aH).append(",");
        sb.append("\"antiWind\":").append(player.aI).append(",");
        sb.append("\"reducePain\":").append(player.v).append(",");
        sb.append("\"accurate\":").append(player.aK).append(",");
        sb.append("\"dodge\":").append(player.aJ).append(",");
        sb.append("\"critical\":").append(player.aL).append(",");
        sb.append("\"counterStrike\":").append(player.aO).append(",");
        sb.append("\"antiChakra\":").append(player.aP).append(",");
        sb.append("\"antiChakraBack\":").append(player.aQ).append(",");
        sb.append("\"str\":").append(player.F).append(",");
        sb.append("\"dex\":").append(player.G).append(",");
        sb.append("\"vit\":").append(player.H).append(",");
        sb.append("\"int\":").append(player.I).append(",");
        sb.append("\"unassignedPotentials\":").append(player.W).append(",");
        sb.append("\"unassignedSkills\":").append(player.X).append(",");
        sb.append("\"exp\":").append(player.E).append(",");
        sb.append("\"pk\":").append(player.at).append(",");
        sb.append("\"equipment\":").append(buildEquipmentJson(player));
        sb.append("}");
        return sb.toString();
    }

    /**
     * Constructs CLDC 1.1 equipment JSON array from player's equipped item arrays (aD & aE).
     */
    private static String buildEquipmentJson(bp player) {
        StringBuffer sb = new StringBuffer("[");
        boolean first = true;
        if (player != null && player.aD != null) {
            for (int i = 0; i < player.aD.length; i++) {
                by item = player.aD[i];
                if (item != null && item.b != null) {
                    if (!first) sb.append(",");
                    first = false;
                    sb.append(buildSingleItemJson(item, 1, i));
                }
            }
        }
        if (player != null && player.aE != null) {
            for (int i = 0; i < player.aE.length; i++) {
                by item = player.aE[i];
                if (item != null && item.b != null) {
                    if (!first) sb.append(",");
                    first = false;
                    sb.append(buildSingleItemJson(item, 2, i));
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String buildSingleItemJson(by item, int tab, int slotIndex) {
        String itemName = item.b.d != null ? item.b.d : "Equipment";
        int itemType = item.b.b;
        int upgrade = item.j;
        int reqLevel = item.b.f;
        int rarityTier = item.i;
        String rarityDesc = "";
        switch (rarityTier) {
            case 0: rarityDesc = "White"; break;
            case 1: rarityDesc = "Blue"; break;
            case 2: rarityDesc = "Yellow"; break;
            case 3: rarityDesc = "Violet"; break;
            default: rarityDesc = (item.b.e != null ? item.b.e : ""); break;
        }
        boolean isBound = (item.k > 0 || item.p);
        int durability = item.n;
        String expiresIn = formatItemExpiry(item);

        StringBuffer sb = new StringBuffer("{");
        sb.append("\"tab\":").append(tab).append(",");
        sb.append("\"slotIndex\":").append(slotIndex).append(",");
        sb.append("\"type\":").append(itemType).append(",");
        sb.append("\"name\":").append(quote(itemName)).append(",");
        sb.append("\"upgrade\":").append(upgrade).append(",");
        sb.append("\"reqLevel\":").append(reqLevel).append(",");
        sb.append("\"rarity\":").append(rarityTier).append(",");
        sb.append("\"rarityDesc\":").append(quote(rarityDesc)).append(",");
        sb.append("\"isBound\":").append(isBound ? "true" : "false").append(",");
        sb.append("\"durability\":").append(durability).append(",");
        sb.append("\"expiresIn\":").append(quote(expiresIn)).append(",");
        sb.append("\"options\":").append(buildItemOptionsJson(item));
        sb.append("}");
        return sb.toString();
    }

    private static String formatItemExpiry(by item) {
        if (item == null || item.g <= 0) {
            return "Permanent";
        }
        long now = System.currentTimeMillis();
        long remainingMs = item.g;
        if (item.g > 1000000000000L) {
            remainingMs = item.g - now;
        }

        if (remainingMs <= 0) {
            return "Expired";
        }

        long remainingSec = remainingMs / 1000L;
        long days = remainingSec / 86400L;
        long hours = (remainingSec % 86400L) / 3600L;
        long minutes = (remainingSec % 3600L) / 60L;

        if (days > 0) {
            return days + "d " + hours + "h";
        } else if (hours > 0) {
            return hours + "h " + minutes + "m";
        } else if (minutes > 0) {
            return minutes + "m";
        } else {
            return remainingSec + "s";
        }
    }

    private static String buildItemOptionsJson(by item) {
        if (item == null || item.c == null || item.c.size() == 0) {
            return "[]";
        }
        StringBuffer sb = new StringBuffer("[");
        boolean first = true;
        for (int i = 0; i < item.c.size(); i++) {
            cg opt = (cg) item.c.elementAt(i);
            if (opt != null && opt.c != null) {
                if (!first) sb.append(",");
                first = false;
                sb.append("{");
                sb.append("\"id\":").append(opt.c.a).append(",");
                sb.append("\"param\":").append(opt.a).append(",");
                String optText = opt.a();
                sb.append("\"text\":").append(quote(optText));
                sb.append("}");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Intercepts game notice dialogs to detect offline player responses and post status to REST API.
     */
    public static boolean handleNoticeDialog(String text) {
        if (text == null || text.trim().length() == 0) return false;

        String target = mod.net.MatrixNet.findRecentTargetForNotice(text);

        boolean isRecentTarget = target != null;
        if (isRecentTarget) {
            MatrixLogger.log("WEB-REST", "Inspecting Notice Text received within 15s for \"" + target + "\": [" + text + "]");
        }

        String clean = text.toLowerCase();
        boolean isOfflineNotice = clean.indexOf("not online") != -1
                || clean.indexOf("kh\u00f4ng online") != -1
                || clean.indexOf("khong online") != -1
                || clean.indexOf("offline") != -1
                || clean.indexOf("kh\u00f4ng t\u1ed3n t\u1ea1i") != -1
                || clean.indexOf("khong ton tai") != -1
                || clean.indexOf("not exist") != -1
                || clean.indexOf("not found") != -1
                || clean.indexOf("khong tim thay") != -1
                || clean.indexOf("kh\u00f4ng t\u00ecm th\u1ea5y") != -1
                || clean.indexOf("r\u1eddi kh\u1ecfi") != -1
                || clean.indexOf("roi khoi") != -1;

        if (isRecentTarget && isOfflineNotice) {
            if (mod.net.MatrixNet.isPendingWebInspect(target)) {
                MatrixLogger.log("WEB-REST", "Detected Offline / Unavailable Notice for remote web target: \"" + target + "\": " + text);
                postOfflineStatus(target, text);
                mod.net.MatrixNet.markWebFulfilled(target);
                return true; // Suppress notice popup/ticker in J2ME client UI for web inspects
            }
        }
        return false;
    }

    public static void postOfflineStatus(final String playerName, final String noticeText) {
        if (!enableWebSync || playerName == null || playerName.trim().length() == 0) return;
        final String postUrl = getPlayersEndpointUrl();
        if (postUrl == null) return;

        Thread webThread = new Thread(new Runnable() {
            public void run() {
                HttpConnection conn = null;
                OutputStream os = null;
                InputStream is = null;
                try {
                    StringBuffer sb = new StringBuffer();
                    sb.append("{");
                    sb.append("\"name\":").append(quote(playerName)).append(",");
                    sb.append("\"status\":").append(quote("OFFLINE")).append(",");
                    sb.append("\"online\":false,");
                    sb.append("\"error\":").append(quote(noticeText));
                    sb.append("}");
                    String jsonPayload = sb.toString();

                    MatrixLogger.log("WEB-REST", "Posting Offline Status to REST API for: \"" + playerName + "\"");

                    conn = (HttpConnection) Connector.open(postUrl, Connector.READ_WRITE, true);
                    conn.setRequestMethod(HttpConnection.POST);
                    conn.setRequestProperty("Content-Type", "application/json");
                    conn.setRequestProperty("User-Agent", "MTX-API/1.0 (J2ME MIDP2.0)");

                    byte[] data = jsonPayload.getBytes("UTF-8");
                    conn.setRequestProperty("Content-Length", Integer.toString(data.length));

                    os = conn.openOutputStream();
                    os.write(data);
                    os.flush();

                    int responseCode = conn.getResponseCode();
                    MatrixLogger.log("WEB-REST", "Offline Status POST Response: " + responseCode);
                } catch (Exception e) {
                    MatrixLogger.log("WEB-REST", "Offline Status POST Warning: " + e.getMessage());
                } finally {
                    try { if (os != null) os.close(); } catch (Exception ex) {}
                    try { if (is != null) is.close(); } catch (Exception ex) {}
                    try { if (conn != null) conn.close(); } catch (Exception ex) {}
                }
            }
        });
        webThread.start();
    }




    private static String quote(String input) {
        if (input == null) return "\"\"";
        StringBuffer out = new StringBuffer("\"");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '"') out.append("\\\"");
            else if (c == '\\') out.append("\\\\");
            else if (c == '\n') out.append("\\n");
            else if (c == '\r') out.append("\\r");
            else out.append(c);
        }
        out.append("\"");
        return out.toString();
    }
}
