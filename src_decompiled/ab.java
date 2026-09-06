/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class ab {
    public static int[][] a;
    private static Image[] g;
    public static Hashtable b;
    public short c;
    public short d;
    public short e;
    public short f;

    static {
        b = new Hashtable();
    }

    public ab(int n2, int n3, int n4, int n5, int n6) {
        this.c = (short)n3;
        this.d = (short)n4;
        this.e = (short)n5;
        this.f = (short)n6;
    }

    public static void a() {
        try {
            Enumeration enumeration = b.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                ak ak2 = (ak)b.get(string);
                if (System.currentTimeMillis() - ak2.c <= 180000L) continue;
                b.remove(string);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void b() {
        g = null;
        System.gc();
    }

    public static void c() {
        g = null;
        System.gc();
        g = new Image[]{main.a.c("/img/Big0.png"), main.a.c("/img/Big1.png"), main.a.c("/img/Big2.png"), main.a.c("/img/Big3.png"), main.a.c("/img/Big4.png")};
        Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
    }

    public ab() {
        ab.e();
    }

    public static void d() {
        new ab();
    }

    private static void e() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(w.a("nj_image")));
            int n2 = dataInputStream.readShort();
            a = new int[n2][5];
            int n3 = 0;
            while (n3 < n2) {
                ab.a[n3][0] = dataInputStream.readUnsignedByte();
                ab.a[n3][1] = dataInputStream.readShort();
                ab.a[n3][2] = dataInputStream.readShort();
                ab.a[n3][3] = dataInputStream.readShort();
                ab.a[n3][4] = dataInputStream.readShort();
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void a(int n2, byte[] byArray) {
        ak ak2 = (ak)b.get(String.valueOf(n2));
        if (ak2 == null) {
            ak2 = new ak();
            b.put(String.valueOf(n2), ak2);
        }
        ak2.a = an.a(byArray);
        if (GameMidlet.a != 1) {
            w.b(String.valueOf(n2), byArray);
        }
    }

    public static boolean a(int n2) {
        if (n2 >= a.length || a[n2][1] >= g[a[n2][0]].getWidth() || a[n2][3] >= g[a[n2][0]].getWidth() || a[n2][2] >= g[a[n2][0]].getHeight() || a[n2][4] >= g[a[n2][0]].getHeight()) {
            ak ak2 = (ak)b.get(String.valueOf(n2));
            if (ak2 == null) {
                ak2 = new ak();
                b.put(String.valueOf(n2), ak2);
                ak2.a = an.a(w.a(String.valueOf(n2)));
                if (ak2.a == null) {
                    ak2.b = System.currentTimeMillis();
                    dq.a().E(n2);
                }
                return false;
            }
            if (ak2.a != null) {
                return true;
            }
            if (ak2.a == null && System.currentTimeMillis() - ak2.b > 60000L) {
                ak2.b = System.currentTimeMillis();
                dq.a().E(n2);
                return false;
            }
        }
        return true;
    }

    public static int b(int n2) {
        return a[n2][4];
    }

    public static void a(t t2, int n2, int n3, int n4, int n5, int n6) {
        if (n2 >= a.length || a[n2][1] >= g[a[n2][0]].getWidth() || a[n2][3] >= g[a[n2][0]].getWidth() || a[n2][2] >= g[a[n2][0]].getHeight() || a[n2][4] >= g[a[n2][0]].getHeight()) {
            ak ak2 = (ak)b.get(String.valueOf(n2));
            if (ak2 == null) {
                ak2 = new ak();
                b.put(String.valueOf(n2), ak2);
                ak2.a = an.a(w.a(String.valueOf(n2)));
                if (ak2.a == null) {
                    ak2.b = System.currentTimeMillis();
                    dq.a().E(n2);
                }
            } else if (ak2.a == null && System.currentTimeMillis() - ak2.b > 60000L) {
                ak2.b = System.currentTimeMillis();
                dq.a().E(n2);
            }
            if (ak2 != null) {
                if (ak2.a != null) {
                    t2.a(ak2.a, 0, 0, ak2.a.getWidth(), ak2.a.getHeight(), n5, n3, n4, n6);
                }
                ak2.c = System.currentTimeMillis();
                return;
            }
        } else {
            t2.a(g[a[n2][0]], a[n2][1], a[n2][2], a[n2][3], a[n2][4], n5, n3, n4, n6);
        }
    }

    public static void a(t t2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 >= a.length || a[n2][1] >= g[a[n2][0]].getWidth() || a[n2][3] >= g[a[n2][0]].getWidth() || a[n2][2] >= g[a[n2][0]].getHeight() || a[n2][4] >= g[a[n2][0]].getHeight()) {
            ak ak2 = (ak)b.get(String.valueOf(n2));
            if (ak2 == null) {
                ak2 = new ak();
                b.put(String.valueOf(n2), ak2);
                ak2.a = an.a(w.a(String.valueOf(n2)));
                if (ak2.a == null) {
                    ak2.b = System.currentTimeMillis();
                    dq.a().E(n2);
                }
            } else if (ak2.a == null && System.currentTimeMillis() - ak2.b > 60000L) {
                ak2.b = System.currentTimeMillis();
                dq.a().E(n2);
            }
            if (ak2 != null) {
                if (ak2.a != null) {
                    if (ak2.a.getHeight() > 35) {
                        n2 = ak2.a.getWidth();
                        n6 = ak2.a.getHeight() / 3;
                        t2.a(ak2.a, 0, n7 * n6, n2, n6, 0, n3, n4, 3);
                    } else {
                        t2.a(ak2.a, 0, 0, ak2.a.getWidth(), ak2.a.getHeight(), 0, n3, n4, 3);
                    }
                }
                ak2.c = System.currentTimeMillis();
                return;
            }
        } else {
            t2.a(g[a[n2][0]], a[n2][1], a[n2][2], a[n2][3], a[n2][4], 0, n3, n4, 3);
        }
    }
}

