/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class x {
    private static aa b = new aa();
    private static cw c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    public static int a;

    static {
        d = 5;
        h = 2;
        a = 15;
    }

    public static void a(t t2) {
        int n2 = main.a.V ? 16 : 0;
        int n3 = main.a.A;
        if (c == null) {
            return;
        }
        t2.d(0, 0, main.a.A, main.a.B);
        if (!main.a.g) {
            ay.a(-6, n2 - 4, n3 + 10, a + 8, t2);
        } else {
            t2.a(0);
            t2.c(0, n2, n3, a);
        }
        t2.d(0, n2, n3, a + 5);
        x.c.b.a(t2, x.c.a, f, n2 + 5, 0);
    }

    public static void a() {
        if (main.a.g) {
            a = 20;
        }
        if (d == 0) {
            if ((f += (h - f) / 3) - h < 3) {
                f = h + 2;
                d = 2;
                e = 0;
                return;
            }
        } else if (d == 2) {
            if (++e > x.c.c) {
                d = 3;
                e = 0;
                return;
            }
        } else if (d == 3) {
            f = f + g < h + main.a.A - 160 ? (f -= 6) : (f -= 2);
            if (f + g < h) {
                d = 4;
                e = 0;
                return;
            }
        } else if (d == 4) {
            if (++e > 10) {
                d = 5;
                e = 0;
                return;
            }
        } else if (d == 5) {
            if (b.size() > 0) {
                cw cw2 = (cw)b.firstElement();
                b.removeElementAt(0);
                if (c != null && cw2.a.equals(x.c.a)) {
                    return;
                }
                c = cw2;
                g = x.c.b.a(x.c.a);
                e = 0;
                d = 0;
                f = main.a.A;
                return;
            }
            c = null;
            if (main.a.g) {
                a = 0;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string, int n2, dd dd2) {
        String string2 = string;
        if (c != null && x.c.a != null && string2.equals(x.c.a)) {
            return;
        }
        if (b.size() > 0 && string2.equals(((cw)x.b.lastElement()).a)) {
            return;
        }
        if (string2.length() >= 8) {
            String string3;
            String string4;
            String string5;
            if (c != null && x.c.a != null && d < 3 && x.c.a.length() >= 8 && (string5 = string2.substring(0, 8)).equals(string4 = x.c.a.substring(0, 8))) {
                int n3 = 7;
                while (n3 < string2.length()) {
                    if (n3 >= x.c.a.length() || string2.charAt(n3) != x.c.a.charAt(n3)) break;
                    ++n3;
                }
                string4 = string2.substring(n3, string2.length());
                x.c.a = String.valueOf(x.c.a) + ", " + string4;
                d = 2;
                e = 0;
                return;
            }
            if (b.size() > 0 && (string5 = ((cw)x.b.lastElement()).a).length() >= 8 && (string4 = string2.substring(0, 8)).equals(string3 = string5.substring(0, 8))) {
                int n4 = 7;
                while (n4 < string2.length()) {
                    if (n4 >= string5.length() || string2.charAt(n4) != string5.charAt(n4)) break;
                    ++n4;
                }
                string2 = string2.substring(n4, string2.length());
                String cfr_ignored_0 = String.valueOf(string5) + ", " + string2;
                return;
            }
        }
        boolean bl2 = false;
        if (bl2) {
            return;
        }
        if (main.a.A == 128) {
            h = 1;
        }
        if (b.size() > 10) {
            b.removeElementAt(0);
        }
        b.addElement(new cw(string, dd2, n2));
    }
}

