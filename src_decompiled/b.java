/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class b {
    static boolean a;
    private static String d;
    private static String e;
    public static int b;
    public static boolean c;

    public static void a(String string, String string2, int n2) {
        if (string == null) {
            return;
        }
        a = true;
        d = string;
        e = string2;
        b = n2;
    }

    public static void a() {
        b.a(df.y, null, 5000);
        c = true;
    }

    public static void a(String string) {
        b.a(string, null, 5000);
        c = true;
    }

    public static void a(t t2) {
        String string = d;
        if (af.j != null) {
            string = af.j;
        }
        if (!a) {
            return;
        }
        if (c && b > 4990) {
            return;
        }
        if (dg.aO) {
            return;
        }
        ay.a(main.a.C - 64, 10, 128, 40, t2);
        if (c) {
            main.a.a(main.a.C - dd.o.a(string) / 2 - 10, 30, t2, false);
            dd.o.a(t2, string, main.a.C + 5, 23, 2);
            return;
        }
        if (e != null) {
            dd.o.a(t2, string, main.a.C, 18, 2);
            dd.i.a(t2, e, main.a.C, 32, 2);
            return;
        }
        dd.o.a(t2, string, main.a.C, 23, 2);
    }

    public static void b() {
        d = "";
        e = null;
        c = false;
        b = 0;
        a = false;
    }
}

