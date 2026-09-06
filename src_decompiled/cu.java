/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cu {
    public static int a = 0;
    public static cq b = new cq();
    public static cq c = new cq();

    public static d a(short s2) {
        try {
            d d2 = (d)b.a(String.valueOf(s2));
            if (d2 == null || d2 != null && d2.a == null) {
                if (d2 == null) {
                    d2 = new d();
                    b.a(String.valueOf(s2), d2);
                }
                d2.a = an.a(w.a("effect " + s2));
                if (d2.a == null && System.currentTimeMillis() / 1000L - d2.b > 10L) {
                    d2.b = (int)(System.currentTimeMillis() / 1000L);
                    if (s2 >= 0) {
                        d2.a = main.a.c("/eff_auto/" + s2 + ".png");
                    }
                    if (d2.a == null && dh.a().b()) {
                        dq.a().c(s2);
                        d2.b = (int)(System.currentTimeMillis() / 1000L);
                    }
                    System.currentTimeMillis();
                }
            } else {
                System.currentTimeMillis();
            }
            return d2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(short s2, byte[] byArray) {
        try {
            d d2 = (d)b.a(String.valueOf(s2));
            if (d2 == null) {
                d2 = new d();
            }
            b.a(String.valueOf(s2), d2);
            if (byArray.length > 0) {
                d2.a = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            } else {
                d2.b = (int)(System.currentTimeMillis() / 1000L);
            }
            System.currentTimeMillis();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

