/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ay {
    public static int a = 6562304;
    public static int b = 9581056;
    public static int c = 3937280;
    public static int d = 15224576;
    public static int e = 0xFFFFFF;
    public static int f = 24;
    private static int g = 0;

    public ay() {
        int[] nArray = new int[]{15970400, -844109861, 0x225544, 16374659, 15906669, 12931125, 3108954};
    }

    public static void a(t t2, bd bd2, bd bd3, bd bd4) {
        int n2;
        dd dd2 = main.a.g ? dd.d : dd.o;
        int n3 = n2 = main.a.g ? 3 : 1;
        if (!main.a.g) {
            if (bd2 != null) {
                dd2.a(t2, bd2.a, 5, main.a.B - ag.p + 4 + n2, 0);
            }
            if (bd3 != null) {
                dd2.a(t2, bd3.a, main.a.C, main.a.B - ag.p + 4 + n2, 2);
            }
            if (bd4 != null) {
                if (bd4.e != null) {
                    t2.a(bd4.e, main.a.A - 5, main.a.B - 11, 10);
                    return;
                }
                dd2.a(t2, bd4.a, main.a.A - 5, main.a.B - ag.p + 4 + n2, 1);
                return;
            }
        } else {
            if (bd2 != null && (g = dd2.a(bd2.a)) > 0) {
                if (bd2.f > 0 && bd2.g > 0) {
                    bd2.a(t2);
                } else {
                    if (ag.q == 0) {
                        t2.a(dg.bB, 1, main.a.B - ag.p + 1, 0);
                    } else {
                        t2.a(dg.bA, 1, main.a.B - ag.p + 1, 0);
                    }
                    dd2.a(t2, bd2.a, 35, main.a.B - ag.p + 4 + n2, 2);
                }
            }
            if (bd3 != null && (g = dd2.a(bd3.a)) > 0) {
                if (bd3.f > 0 && bd3.g > 0) {
                    bd3.a(t2);
                } else {
                    if (ag.q == 1) {
                        t2.a(dg.bB, main.a.C - 35, main.a.B - ag.p + 1, 0);
                    } else {
                        t2.a(dg.bA, main.a.C - 35, main.a.B - ag.p + 1, 0);
                    }
                    dd2.a(t2, bd3.a, main.a.C, main.a.B - ag.p + 4 + n2, 2);
                }
            }
            if (bd4 != null && (g = dd2.a(bd4.a)) > 0) {
                if (bd4.f > 0 && bd4.g > 0) {
                    bd4.a(t2);
                    return;
                }
                if (ag.q == 2) {
                    t2.a(dg.bB, main.a.A - 71, main.a.B - ag.p + 1, 0);
                } else {
                    t2.a(dg.bA, main.a.A - 71, main.a.B - ag.p + 1, 0);
                }
                dd2.a(t2, bd4.a, main.a.A - 35, main.a.B - ag.p + 4 + n2, 2);
            }
        }
    }

    public static void a(t t2) {
        if (!main.a.g) {
            t2.a(0);
            t2.c(0, main.a.B - f, main.a.A, f + 1);
            t2.a(0x888888);
            t2.c(0, main.a.B - (f - 1), main.a.A, 1);
        }
    }

    public static void a(t t2, boolean n2, int n3, int n4, int n5, int n6, int n7, int n8, String string) {
        t2.a(0);
        if (n2 != 0) {
            t2.a(dg.by, 0, 81, 29, 27, 0, n3, n4, 0);
            t2.a(dg.by, 0, 135, 29, 27, 0, n3 + n5 - 29, n4, 0);
            t2.a(dg.by, 0, 108, 29, 27, 0, n3 + n5 - 58, n4, 0);
            n2 = 0;
            while (n2 < (n5 - 58) / 29) {
                t2.a(dg.by, 0, 108, 29, 27, 0, n3 + 29 + n2 * 29, n4, 0);
                ++n2;
            }
        } else {
            t2.a(dg.by, 0, 0, 29, 27, 0, n3, n4, 0);
            t2.a(dg.by, 0, 54, 29, 27, 0, n3 + n5 - 29, n4, 0);
            t2.a(dg.by, 0, 27, 29, 27, 0, n3 + n5 - 58, n4, 0);
            n2 = 0;
            while (n2 < (n5 - 58) / 29) {
                t2.a(dg.by, 0, 27, 29, 27, 0, n3 + 29 + n2 * 29, n4, 0);
                ++n2;
            }
        }
        t2.d(n3 + 3, n4 + 1, n5 - 4, n6 - 4);
        dd.o.a(t2, string, n7, n8, 0);
    }

    public static void a(t t2, boolean n2, int n3, int n4, int n5, int n6, int n7, String string) {
        t2.a(0);
        if (n2 != 0) {
            t2.a(dg.by, 0, 81, 29, 27, 0, n3, n4, 0);
            t2.a(dg.by, 0, 135, 29, 27, 0, n3 + n5 - 29, n4, 0);
            t2.a(dg.by, 0, 108, 29, 27, 0, n3 + n5 - 58, n4, 0);
            n2 = 0;
            while (n2 < (n5 - 58) / 29) {
                t2.a(dg.by, 0, 108, 29, 27, 0, n3 + 29 + n2 * 29, n4, 0);
                ++n2;
            }
        } else {
            t2.a(dg.by, 0, 0, 29, 27, 0, n3, n4, 0);
            t2.a(dg.by, 0, 54, 29, 27, 0, n3 + n5 - 29, n4, 0);
            t2.a(dg.by, 0, 27, 29, 27, 0, n3 + n5 - 58, n4, 0);
            n2 = 0;
            while (n2 < (n5 - 58) / 29) {
                t2.a(dg.by, 0, 27, 29, 27, 0, n3 + 29 + n2 * 29, n4, 0);
                ++n2;
            }
        }
        dd.o.a(t2, string, n6, n7, 0);
    }

    public final void a(t t2, int n2, int n3, int n4, int n5, String[] stringArray, Image image) {
        if (image == null) {
            ay.a(n2, n3, n4, n5, t2);
            int n6 = n3 + 20 - dd.o.c();
            n3 = 0;
            while (n3 < stringArray.length) {
                dd.o.a(t2, stringArray[n3], n2 + n4 / 2, n6, 2);
                ++n3;
                n6 += dd.o.c();
            }
            return;
        }
        ay.a(n2, n3 - image.getHeight(), n4, n5 + image.getHeight(), t2);
        t2.a(image, n2 + n4 / 2, n3 + n5 / 2 - 4, 33);
        int n7 = n3 + 20 - dd.o.c();
        n3 = 0;
        while (n3 < stringArray.length) {
            dd.o.a(t2, stringArray[n3], n2 + n4 / 2, n7 - image.getHeight(), 2);
            ++n3;
            n7 += dd.o.c();
        }
    }

    public static void a(int n2, int n3, int n4, int n5, t t2) {
        t2.a(a);
        t2.c(n2, n3, n4, n5);
        t2.a(0);
        t2.b(n2 - 2, n3 - 2, n4 + 3, n5 + 3);
        t2.a(0xD4D4D4);
        t2.b(n2 - 1, n3 - 1, n4 + 1, n5 + 1);
        t2.a(5720393);
        t2.b(n2, n3, n4 - 1, n5 - 1);
        if (main.a.g) {
            t2.a(main.a.Q[0], n2 - 4, n3 - 3, 20);
            t2.a(main.a.Q[0], 0, 0, main.a.R, main.a.S, 2, n2 + n4 + 4, n3 - 3, ch.c);
            t2.a(main.a.Q[0], 0, 0, main.a.R, main.a.S, 1, n2 - 4, n3 + n5 + 3, ch.e);
            t2.a(main.a.Q[0], 0, 0, main.a.R, main.a.S, 3, n2 + n4 + 4, n3 + n5 + 3, ch.f);
            t2.a(main.a.Q[1], n2 + n4 / 2, n3 - 4, ch.a);
        }
    }

    public static void b(int n2, int n3, int n4, int n5, t t2) {
        t2.a(0);
        t2.b(n2 - 2, n3 - 2, n4 + 3, n5 + 3);
        t2.a(0xD4D4D4);
        t2.b(n2 - 1, n3 - 1, n4 + 1, n5 + 1);
        t2.a(5720393);
        t2.b(n2, n3, n4 - 1, n5 - 1);
        if (main.a.g) {
            t2.a(main.a.Q[0], n2 - 4, n3 - 3, 20);
            t2.a(main.a.Q[0], 0, 0, main.a.R, main.a.S, 2, n2 + n4 + 4, n3 - 3, ch.c);
            t2.a(main.a.Q[0], 0, 0, main.a.R, main.a.S, 1, n2 - 4, n3 + n5 + 3, ch.e);
            t2.a(main.a.Q[0], 0, 0, main.a.R, main.a.S, 3, n2 + n4 + 4, n3 + n5 + 3, ch.f);
            t2.a(main.a.Q[1], n2 + n4 / 2, n3 - 4, ch.a);
        }
    }

    public static void c(int n2, int n3, int n4, int n5, t t2) {
        t2.a(a);
        t2.c(n2, n3, n4, n5);
    }

    public static void d(int n2, int n3, int n4, int n5, t t2) {
        t2.a(b);
        t2.c(n2, n3, n4, n5);
    }
}

