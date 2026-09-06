/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import javax.microedition.rms.RecordStore;

public final class w {
    public static void a(String string, byte[] byArray) {
        try {
            string = RecordStore.openRecordStore((String)("vj" + string), (boolean)true);
            if (string.getNumRecords() > 0) {
                string.setRecord(1, byArray, 0, byArray.length);
            } else {
                string.addRecord(byArray, 0, byArray.length);
            }
            string.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static byte[] a(String string) {
        byte[] byArray;
        try {
            string = RecordStore.openRecordStore((String)("vj" + string), (boolean)false);
            byArray = string.getRecord(1);
            string.closeRecordStore();
        }
        catch (Exception exception) {
            return null;
        }
        return byArray;
    }

    public static void a(String string, int n2) {
        try {
            w.a(string, new byte[]{(byte)n2});
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(String object, String string) {
        try {
            w.a((String)object, string.getBytes("UTF-8"));
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static String b(String object) {
        byte[] byArray = w.a((String)object);
        object = byArray;
        if (byArray == null) {
            return null;
        }
        try {
            String string = new String((byte[])object, "UTF-8");
            return string;
        }
        catch (Exception exception) {
            return new String((byte[])object);
        }
    }

    public static int c(String object) {
        byte[] byArray = w.a((String)object);
        object = byArray;
        if (byArray == null) {
            return -1;
        }
        return (int)object[0];
    }

    private static void d(String string) {
        try {
            RecordStore.deleteRecordStore((String)("vj" + string));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void b(String object, byte[] byArray) {
        try {
            object = RecordStore.openRecordStore((String)("vj" + (String)object), (boolean)true);
            if (object.getNumRecords() > 0) {
                object.setRecord(1, byArray, 0, byArray.length);
            } else {
                object.addRecord(byArray, 0, byArray.length);
            }
            object.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void a() {
        w.d("nj_arrow");
        w.d("nj_effect");
        w.d("nj_image");
        w.d("nj_part");
        w.d("nj_skill");
        w.d("data");
        w.d("dataVersion");
        w.d("map");
        w.d("mapVersion");
        w.d("skill");
        w.d("killVersion");
        w.d("item");
        w.d("itemVersion");
    }
}

