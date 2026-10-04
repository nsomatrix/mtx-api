package mod.item;

import bz;
import e;
import cq;
import mod.log.MatrixLogger;

public class MatrixItemExporter {

    public static final String OUTPUT_FILE_PATH = "/home/manish/projects/mtx-api/items.json";

    /**
     * Dumps all loaded in-game item templates from runtime memory (e.a) into JSON format.
     */
    public static String exportAllItemsToJson() {
        StringBuffer json = new StringBuffer();
        json.append("[\n");

        cq table = e.a;
        if (table == null) {
            return "[]";
        }

        boolean first = true;
        // In J2ME MIDP 2.0 / CLDC 1.1, cq wraps standard Hashtable storage
        for (short id = 0; id < 2500; id++) {
            bz template = e.a(id);
            if (template != null) {
                if (!first) {
                    json.append(",\n");
                }
                first = false;

                json.append("  {\n");
                json.append("    \"id\": ").append(template.a).append(",\n");
                json.append("    \"name\": \"").append(escapeJson(template.d)).append("\",\n");
                json.append("    \"type\": ").append(template.b).append(",\n");
                json.append("    \"gender\": ").append(template.c).append(",\n");
                json.append("    \"levelRequire\": ").append(template.f).append(",\n");
                json.append("    \"description\": \"").append(escapeJson(template.e)).append("\",\n");
                json.append("    \"iconId\": ").append(template.g).append(",\n");
                json.append("    \"isLocked\": ").append(template.i).append("\n");
                json.append("  }");
            }
        }

        json.append("\n]");
        return json.toString();
    }

    public static void dumpItemsToConsole() {
        String json = exportAllItemsToJson();
        if (json != null && json.length() > 5) {
            MatrixLogger.log("ITEM-EXPORTER", "Exporting complete item dictionary to items.json...");
            System.out.println("==================================================");
            System.out.println("⚡ [MATRIX::ITEMS-JSON] COMPLETE IN-GAME ITEM DICTIONARY DUMP:");
            System.out.println(json);
            System.out.println("==================================================");
            
            // Automatically save to local disk file /home/manish/projects/mtx-api/items.json
            saveToFile(json, OUTPUT_FILE_PATH);
        }
    }

    /**
     * Bypasses CLDC compile-time checks using Reflection to write directly to disk file.
     */
    public static void saveToFile(String content, String filePath) {
        try {
            Class fosClass = Class.forName("java.io.FileOutputStream");
            java.lang.reflect.Constructor ctor = fosClass.getConstructor(new Class[] { String.class });
            Object fos = ctor.newInstance(new Object[] { filePath });
            
            byte[] bytes = content.getBytes("UTF-8");
            java.lang.reflect.Method writeMethod = fosClass.getMethod("write", new Class[] { byte[].class });
            writeMethod.invoke(fos, new Object[] { bytes });
            
            java.lang.reflect.Method closeMethod = fosClass.getMethod("close", new Class[0]);
            closeMethod.invoke(fos, new Object[0]);

            MatrixLogger.log("ITEM-EXPORTER", "SUCCESS! Saved all items directly to file: " + filePath);
        } catch (Throwable t) {
            MatrixLogger.log("ITEM-EXPORTER-ERR", "Could not write to local file: " + t.getMessage());
        }
    }

    private static String escapeJson(String input) {
        if (input == null) return "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '"') sb.append("\\\"");
            else if (c == '\\') sb.append("\\\\");
            else if (c == '\n') sb.append("\\n");
            else if (c == '\r') sb.append("\\r");
            else if (c == '\t') sb.append("\\t");
            else sb.append(c);
        }
        return sb.toString();
    }
}
