/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class ae {
    private static aa a = new aa();
    private static cw b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;

    static {
        c = 5;
        g = 2;
        h = 20;
    }

    public static void a(t t2) {
        int n2 = g;
        int n3 = main.a.B - 23;
        int n4 = main.a.A;
        if (main.a.g) {
            if (main.a.A >= 450) {
                n2 = 130;
                n4 = main.a.A - 260;
            } else {
                n2 = 80;
                n4 = main.a.A - 160 - 10;
            }
            n3 = main.a.B - 60;
            g = n2 + 2;
        }
        if (b == null) {
            return;
        }
        if (main.a.J != null && main.a.J.b != null) {
            return;
        }
        t2.d(0, 0, main.a.A, main.a.B);
        if (main.a.g) {
            ay.a(n2, n3 - 4, n4 + 10, h + 8, t2);
        } else {
            t2.a(0);
            t2.c(n2 - 2, n3, n4 + 2, h);
        }
        t2.d(n2, n3, n4, h);
        ae.b.b.a(t2, ae.b.a, e, n3 + 3, 0);
    }

    public static void a() {
        if (c == 0) {
            if ((e += (g - e) / 3) - g < 3) {
                e = g + 2;
                c = 2;
                d = 0;
                return;
            }
        } else if (c == 2) {
            if (++d > ae.b.c) {
                c = 3;
                d = 0;
                return;
            }
        } else if (c == 3) {
            e = e + f < g + main.a.A - 20 ? (e -= 6) : (e -= 2);
            if (e + f < g) {
                c = 4;
                d = 0;
                return;
            }
        } else if (c == 4) {
            if (++d > 10) {
                c = 5;
                d = 0;
                return;
            }
        } else if (c == 5) {
            if (a.size() > 0) {
                cw cw2 = (cw)a.firstElement();
                a.removeElementAt(0);
                if (b != null && cw2.a.equals(ae.b.a)) {
                    return;
                }
                b = cw2;
                f = ae.b.b.a(ae.b.a);
                d = 0;
                c = 0;
                e = main.a.A;
                return;
            }
            b = null;
        }
    }

    public static void a(String string) {
        if (ae.b(string)) {
            return;
        }
        if (main.a.A == 128) {
            g = 1;
        }
        if (a.size() > 10) {
            a.removeElementAt(0);
        }
        a.addElement(new cw(string));
    }

    private static boolean b(String string) {
        String string2;
        String string3;
        String string4;
        if (b != null && ae.b.a != null && string.equals(ae.b.a)) {
            return true;
        }
        if (a.size() > 0 && string.equals(((cw)ae.a.lastElement()).a)) {
            return true;
        }
        if (string.length() < 8) {
            return false;
        }
        if (b != null && ae.b.a != null && c < 3 && ae.b.a.length() >= 8 && (string4 = string.substring(0, 8)).equals(string3 = ae.b.a.substring(0, 8))) {
            int n2 = 7;
            while (n2 < string.length()) {
                if (n2 >= ae.b.a.length() || string.charAt(n2) >= '0' && string.charAt(n2) <= '9' || string.charAt(n2) != ae.b.a.charAt(n2)) break;
                ++n2;
            }
            string3 = string.substring(n2, string.length());
            ae.b.a = String.valueOf(ae.b.a) + ", " + string3;
            c = 2;
            d = 0;
            return true;
        }
        if (a.size() > 0 && (string4 = ((cw)ae.a.lastElement()).a).length() >= 8 && (string3 = string.substring(0, 8)).equals(string2 = string4.substring(0, 8))) {
            int n3 = 7;
            while (n3 < string.length()) {
                if (n3 >= string4.length() || string.charAt(n3) >= '0' && string.charAt(n3) <= '9' || string.charAt(n3) != string4.charAt(n3)) break;
                ++n3;
            }
            string = string.substring(n3, string.length());
            String cfr_ignored_0 = String.valueOf(string4) + ", " + string;
            return true;
        }
        return false;
    }

    public static void a(String string, int n2, dd dd2) {
        if (ae.b(string)) {
            return;
        }
        if (main.a.A == 128) {
            g = 1;
        }
        if (a.size() > 10) {
            a.removeElementAt(0);
        }
        a.addElement(new cw(string, dd2, n2));
    }

    public static boolean b() {
        return c == 5 && a.size() == 0;
    }
}

