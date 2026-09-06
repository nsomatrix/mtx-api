/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Random;
import main.GameMidlet;
import main.a;

public final class at {
    private static Random a = new Random();

    public static int a(int n2) {
        return a.nextInt(n2);
    }

    public static int a(int n2, int n3) {
        return -7 + a.nextInt(14);
    }

    public static byte[] a(ce ce2) {
        try {
            int n2 = ce2.b().readInt();
            byte[] byArray = new byte[n2];
            ce2.b().read(byArray);
            return byArray;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public static byte[] b(ce ce2) {
        try {
            int n2 = ce2.b().readInt();
            byte[] byArray = new byte[n2];
            ce2.b().read(byArray);
            return byArray;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public static byte[] a(DataInputStream dataInputStream) {
        try {
            int n2 = dataInputStream.readInt();
            byte[] byArray = new byte[n2];
            dataInputStream.read(byArray);
            return byArray;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public static String a(String string, String string2, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        while ((n2 = string.indexOf(string2)) != -1) {
            stringBuffer.append(String.valueOf(string.substring(0, n2)) + string3);
            string = string.substring(n2 + string2.length());
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public static String a(String string) {
        String string2 = "";
        String string3 = "";
        if (string.equals("")) {
            return string2;
        }
        if (string.charAt(0) == '-') {
            string3 = "-";
            string = string.substring(1);
        }
        int n2 = string.length() - 1;
        while (n2 >= 0) {
            string2 = (string.length() - 1 - n2) % 3 == 0 && string.length() - 1 - n2 > 0 ? String.valueOf(string.charAt(n2)) + "." + string2 : String.valueOf(string.charAt(n2)) + string2;
            --n2;
        }
        return String.valueOf(string3) + string2;
    }

    public static void a(String string, short s2) {
        f.a(string, "sms://" + s2, new bd("", main.a.a(), 88827, null), new bd("", main.a.a(), 88828, null));
    }

    public static void b(String object) {
        try {
            try {
                GameMidlet.g.platformRequest((String)object);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
        finally {
            GameMidlet.g.notifyDestroyed();
        }
    }

    public static String b(int n2) {
        int n3 = 0;
        if (n2 > 60) {
            n3 = n2 / 60;
            n2 %= 60;
        }
        int n4 = 0;
        if (n3 > 60) {
            n4 = n3 / 60;
            n3 %= 60;
        }
        int n5 = 0;
        if (n4 > 24) {
            n5 = n4 / 24;
            n4 %= 24;
        }
        String string = "";
        if (n5 > 0) {
            string = String.valueOf(string) + n5;
            string = String.valueOf(string) + "d";
            string = String.valueOf(string) + n4 + "h";
        } else if (n4 > 0) {
            string = String.valueOf(string) + n4;
            string = String.valueOf(string) + "h";
            string = String.valueOf(string) + n3 + "'";
        } else {
            string = n3 > 9 ? String.valueOf(string) + n3 : String.valueOf(string) + "0" + n3;
            string = String.valueOf(string) + ":";
            string = n2 > 9 ? String.valueOf(string) + n2 : String.valueOf(string) + "0" + n2;
        }
        return string;
    }

    public static String[] a(String object, String string) {
        aa aa2 = new aa();
        int n2 = object.indexOf(string);
        while (n2 >= 0) {
            aa2.addElement(object.substring(0, n2));
            object = object.substring(n2 + string.length());
            n2 = object.indexOf(string);
        }
        aa2.addElement(object);
        object = new String[aa2.size()];
        if (aa2.size() > 0) {
            int n3 = 0;
            while (n3 < aa2.size()) {
                object[n3] = (String)aa2.elementAt(n3);
                ++n3;
            }
        }
        return object;
    }
}

