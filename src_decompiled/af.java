/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class af {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static char[] f;
    public static int[] g;
    private static Image E;
    private static Image F;
    public static Image h;
    private static Image G;
    private static Image H;
    private static Image I;
    private static Image J;
    private static Image K;
    public static byte i;
    private static int L;
    private static int M;
    private static int N;
    private static int O;
    public static String j;
    public static String k;
    public static byte l;
    public static byte m;
    public static byte n;
    public static short o;
    private static int P;
    private static int Q;
    private static int R;
    private static int S;
    private static int T;
    private static int U;
    private static int V;
    private static int W;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static Vector t;
    public static String[] u;
    public static bm v;
    public static bm w;
    private static int X;
    public static int x;
    public static int y;
    public static int z;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    private static int[] Y;

    static {
        i = (byte)24;
        j = null;
        k = "";
        t = new Vector();
        v = new bm();
        w = new bm();
        x = 2;
        Y = new int[]{5257738, 8807192};
    }

    public static void a(int n2, int n3, int n4, int n5) {
        p = n4;
        q = n5;
        r = n2;
        s = n3;
    }

    public static void a() {
        T = bp.d().i / 12;
        P = bp.d().j / 12;
        T = T > a * x - p / 2 ? a * x - p : (T < p / 2 ? 0 : (T -= p / 2));
        P = P < q / 2 ? 0 : (P -= q / 2);
        if (P > b * x - q) {
            P = b * x - q;
        }
    }

    public static void b() {
        if (a * x >= p || b * x >= q) {
            if (Q != P) {
                S = P - Q << 2;
                Q += (R += S) >> 4;
                R &= 0xF;
            }
            if (U != T) {
                W = T - U << 2;
                U += (V += W) >> 4;
                V &= 0xF;
            }
        }
    }

    public static void c() {
        E = null;
        System.gc();
    }

    static final void d() {
        if (J == null) {
            J = main.a.c("/t/uwt.png");
        }
        if (G == null) {
            G = main.a.c("/t/wtf.png");
        }
        if (H == null) {
            H = main.a.c("/t/twtf.png");
        }
        if (I == null) {
            I = main.a.c("/t/wts.png");
        }
        if (K == null) {
            K = main.a.c("/t/wts1.png");
        }
        System.gc();
    }

    public static void a(int n2) {
        d = b * i;
        c = a * i;
        try {
            int n3;
            int n4 = 0;
            while (n4 < a * b) {
                n3 = n4;
                boolean bl2 = v != null ? v.a(String.valueOf(n3)) != null : false;
                if (bl2) {
                    int n5 = n4;
                    g[n5] = g[n5] | 2;
                }
                if (n2 == 4) {
                    if (f[n4] == '\u0001' || f[n4] == '\u0002' || f[n4] == '\u0003' || f[n4] == '\u0004' || f[n4] == '\u0005' || f[n4] == '\u0006' || f[n4] == '\t' || f[n4] == '\n' || f[n4] == 'O' || f[n4] == 'P' || f[n4] == '\r' || f[n4] == '\u000e' || f[n4] == '+' || f[n4] == ',' || f[n4] == '-' || f[n4] == '2') {
                        int n6 = n4;
                        g[n6] = g[n6] | 2;
                    }
                    if (f[n4] == '\t' || f[n4] == '\u000b') {
                        int n7 = n4;
                        g[n7] = g[n7] | 4;
                    }
                    if (f[n4] == '\n' || f[n4] == '\f') {
                        int n8 = n4;
                        g[n8] = g[n8] | 8;
                    }
                    if (f[n4] == '\r' || f[n4] == '\u000e') {
                        int n9 = n4;
                        g[n9] = g[n9] | 0x400;
                    }
                    if (f[n4] == 'L' || f[n4] == 'M') {
                        int n10 = n4;
                        g[n10] = g[n10] | 0x40;
                        if (f[n4] == 'N') {
                            int n11 = n4;
                            g[n11] = g[n11] | 0x1000;
                        }
                    }
                }
                if (n2 == 1) {
                    if (f[n4] == '\u0016') {
                        X = f[n4] - '\u0001';
                    }
                    if (f[n4] == '\u0001' || f[n4] == '\u0002' || f[n4] == '\u0003' || f[n4] == '\u0004' || f[n4] == '\u0005' || f[n4] == '\u0006' || f[n4] == '\u0007' || f[n4] == '$' || f[n4] == '%' || f[n4] == '6' || f[n4] == '[' || f[n4] == '\\' || f[n4] == ']' || f[n4] == '^' || f[n4] == 'I' || f[n4] == 'J' || f[n4] == 'a' || f[n4] == 'b' || f[n4] == 't' || f[n4] == 'u' || f[n4] == 'v' || f[n4] == 'x' || f[n4] == '=') {
                        int n12 = n4;
                        g[n12] = g[n12] | 2;
                    }
                    if (f[n4] == '\u0002' || f[n4] == '\u0003' || f[n4] == '\u0004' || f[n4] == '\u0005' || f[n4] == '\u0006' || f[n4] == '\u0014' || f[n4] == '\u0015' || f[n4] == '\u0016' || f[n4] == '\u0017' || f[n4] == '$' || f[n4] == '%' || f[n4] == '&' || f[n4] == '\'' || f[n4] == '=') {
                        int n13 = n4;
                        g[n13] = g[n13] | 0x1000;
                    }
                    if (f[n4] == '\b' || f[n4] == '\t' || f[n4] == '\n' || f[n4] == '\f' || f[n4] == '\r' || f[n4] == '\u000e' || f[n4] == '\u001e') {
                        int n14 = n4;
                        g[n14] = g[n14] | 0x10;
                    }
                    if (f[n4] == '\u0011') {
                        int n15 = n4;
                        g[n15] = g[n15] | 0x20;
                    }
                    if (f[n4] == '\u0012') {
                        int n16 = n4;
                        g[n16] = g[n16] | 0x80;
                    }
                    if (f[n4] == '%' || f[n4] == '&' || f[n4] == '=') {
                        int n17 = n4;
                        g[n17] = g[n17] | 4;
                    }
                    if (f[n4] == '$' || f[n4] == '\'' || f[n4] == '=') {
                        int n18 = n4;
                        g[n18] = g[n18] | 8;
                    }
                    if (f[n4] == '\u0013') {
                        int n19 = n4;
                        g[n19] = g[n19] | 0x40;
                        if ((g[n4 - a] & 0x1000) == 4096) {
                            int n20 = n4;
                            g[n20] = g[n20] | 0x1000;
                        }
                    }
                    if (f[n4] == '#') {
                        int n21 = n4;
                        g[n21] = g[n21] | 0x800;
                    }
                    if (f[n4] == '\u0007') {
                        int n22 = n4;
                        g[n22] = g[n22] | 0x400;
                    }
                    if (f[n4] == ' ' || f[n4] == '!' || f[n4] == '\"') {
                        int n23 = n4;
                        g[n23] = g[n23] | 0x100;
                    }
                }
                if (n2 == 2) {
                    if (f[n4] == '\u0016' || f[n4] == 'g' || f[n4] == 'o') {
                        X = f[n4] - '\u0001';
                    }
                    if (f[n4] == '\u0001' || f[n4] == '\u0002' || f[n4] == '\u0003' || f[n4] == '\u0004' || f[n4] == '\u0005' || f[n4] == '\u0006' || f[n4] == '\u0007' || f[n4] == '$' || f[n4] == '%' || f[n4] == '6' || f[n4] == '=' || f[n4] == 'I' || f[n4] == 'L' || f[n4] == 'M' || f[n4] == 'N' || f[n4] == 'O' || f[n4] == 'R' || f[n4] == 'S' || f[n4] == 'b' || f[n4] == 'c' || f[n4] == 'd' || f[n4] == 'f' || f[n4] == 'g' || f[n4] == 'l' || f[n4] == 'm' || f[n4] == 'n' || f[n4] == 'p' || f[n4] == 'q' || f[n4] == 't' || f[n4] == 'u' || f[n4] == '}' || f[n4] == '~' || f[n4] == '\u007f' || f[n4] == '\u0081' || f[n4] == '\u0082') {
                        int n24 = n4;
                        g[n24] = g[n24] | 2;
                    }
                    if (f[n4] == '\u0001' || f[n4] == '\u0003' || f[n4] == '\u0004' || f[n4] == '\u0005' || f[n4] == '\u0006' || f[n4] == '\u0014' || f[n4] == '\u0015' || f[n4] == '\u0016' || f[n4] == '\u0017' || f[n4] == '$' || f[n4] == '%' || f[n4] == '&' || f[n4] == '\'' || f[n4] == '7' || f[n4] == 'm' || f[n4] == 'o' || f[n4] == 'p' || f[n4] == 'q' || f[n4] == 'r' || f[n4] == 's' || f[n4] == 't' || f[n4] == '\u007f' || f[n4] == '\u0081' || f[n4] == '\u0082') {
                        int n25 = n4;
                        g[n25] = g[n25] | 0x1000;
                    }
                    if (f[n4] == '\b' || f[n4] == '\t' || f[n4] == '\n' || f[n4] == '\f' || f[n4] == '\r' || f[n4] == '\u000e' || f[n4] == '\u001e' || f[n4] == '\u0087') {
                        int n26 = n4;
                        g[n26] = g[n26] | 0x10;
                    }
                    if (f[n4] == '\u0011') {
                        int n27 = n4;
                        g[n27] = g[n27] | 0x20;
                    }
                    if (f[n4] == '\u0012') {
                        int n28 = n4;
                        g[n28] = g[n28] | 0x80;
                    }
                    if (f[n4] == '=' || f[n4] == '%' || f[n4] == '&' || f[n4] == '\u007f' || f[n4] == '\u0082' || f[n4] == '\u0083') {
                        int n29 = n4;
                        g[n29] = g[n29] | 4;
                    }
                    if (f[n4] == '=' || f[n4] == '$' || f[n4] == '\'' || f[n4] == '\u007f' || f[n4] == '\u0081' || f[n4] == '\u0084') {
                        int n30 = n4;
                        g[n30] = g[n30] | 8;
                    }
                    if (f[n4] == '\u0013') {
                        int n31 = n4;
                        g[n31] = g[n31] | 0x40;
                        if ((g[n4 - a] & 0x1000) == 4096) {
                            int n32 = n4;
                            g[n32] = g[n32] | 0x1000;
                        }
                    }
                    if (f[n4] == '\u0086') {
                        int n33 = n4;
                        g[n33] = g[n33] | 0x40;
                        if ((g[n4 - a] & 0x1000) == 4096) {
                            int n34 = n4;
                            g[n34] = g[n34] | 0x1000;
                        }
                    }
                    if (f[n4] == '#') {
                        int n35 = n4;
                        g[n35] = g[n35] | 0x800;
                    }
                    if (f[n4] == '\u0007') {
                        int n36 = n4;
                        g[n36] = g[n36] | 0x400;
                    }
                    if (f[n4] == ' ' || f[n4] == '!' || f[n4] == '\"') {
                        int n37 = n4;
                        g[n37] = g[n37] | 0x100;
                    }
                    if (f[n4] == '=' || f[n4] == '\u007f') {
                        int n38 = n4;
                        g[n38] = g[n38] | 0x2000;
                    }
                }
                if (n2 == 3) {
                    if (f[n4] == '\f' || f[n4] == '3' || f[n4] == 'X' || f[n4] == 't' || f[n4] == '\u0080') {
                        X = f[n4] - '\u0001';
                    }
                    if (f[n4] == 'm' || f[n4] == 'n') {
                        X = f[n4];
                    }
                    if (f[n4] == '\u0001' || f[n4] == '\u0002' || f[n4] == '\u0003' || f[n4] == '\u0004' || f[n4] == '\u0005' || f[n4] == '\u0006' || f[n4] == '\u0007' || f[n4] == '\u000b' || f[n4] == '\u000e' || f[n4] == '\u0011' || f[n4] == '+' || f[n4] == '3' || f[n4] == '?' || f[n4] == 'A' || f[n4] == 'C' || f[n4] == 'D' || f[n4] == 'G' || f[n4] == 'H' || f[n4] == 'S' || f[n4] == 'T' || f[n4] == 'U' || f[n4] == 'W' || f[n4] == '[' || f[n4] == '^' || f[n4] == 'a' || f[n4] == 'b' || f[n4] == 'j' || f[n4] == 'k' || f[n4] == 'o' || f[n4] == 'q' || f[n4] == 'u' || f[n4] == 'v' || f[n4] == 'w' || f[n4] == '}' || f[n4] == '~' || f[n4] == '\u0081' || f[n4] == '\u0082' || f[n4] == '\u0083' || f[n4] == '\u0085' || f[n4] == '\u0088' || f[n4] == '\u008a' || f[n4] == '\u008b' || f[n4] == '\u008e') {
                        int n39 = n4;
                        g[n39] = g[n39] | 2;
                    }
                    if (f[n4] == '|' || f[n4] == 't' || f[n4] == '{' || f[n4] == ',' || f[n4] == '\f' || f[n4] == '\u000f' || f[n4] == '\u0010' || f[n4] == '-' || f[n4] == '\n' || f[n4] == '\t') {
                        int n40 = n4;
                        g[n40] = g[n40] | 0x1000;
                    }
                    if (f[n4] == '\u0017') {
                        int n41 = n4;
                        g[n41] = g[n41] | 0x20;
                    }
                    if (f[n4] == '\u0018') {
                        int n42 = n4;
                        g[n42] = g[n42] | 0x80;
                    }
                    if (f[n4] == '\u0006' || f[n4] == '\u000f' || f[n4] == '3' || f[n4] == '_' || f[n4] == 'a' || f[n4] == 'j' || f[n4] == 'o' || f[n4] == '{' || f[n4] == '}' || f[n4] == '\u008a' || f[n4] == '\u008c') {
                        int n43 = n4;
                        g[n43] = g[n43] | 4;
                    }
                    if (f[n4] == '\u0007' || f[n4] == '\u0010' || f[n4] == '3' || f[n4] == '`' || f[n4] == 'b' || f[n4] == 'k' || f[n4] == 'o' || f[n4] == '|' || f[n4] == '~' || f[n4] == '\u008b' || f[n4] == '\u008d') {
                        int n44 = n4;
                        g[n44] = g[n44] | 8;
                    }
                    if (f[n4] == '\u0019') {
                        int n45 = n4;
                        g[n45] = g[n45] | 0x40;
                        if ((g[n4 - a] & 0x1000) == 4096) {
                            int n46 = n4;
                            g[n46] = g[n46] | 0x1000;
                        }
                    }
                    if (f[n4] == '\"') {
                        int n47 = n4;
                        g[n47] = g[n47] | 0x800;
                    }
                    if (f[n4] == '\u0011') {
                        int n48 = n4;
                        g[n48] = g[n48] | 0x400;
                    }
                    if (f[n4] == '!' || f[n4] == 'g' || f[n4] == 'h' || f[n4] == 'i' || f[n4] == '\u001a' || f[n4] == '!') {
                        int n49 = n4;
                        g[n49] = g[n49] | 0x100;
                    }
                    if (f[n4] == '3' || f[n4] == 'o' || f[n4] == 'D') {
                        int n50 = n4;
                        g[n50] = g[n50] | 0x2000;
                    }
                    if (f[n4] == 'R' || f[n4] == 'n' || f[n4] == '\u008f') {
                        int n51 = n4;
                        g[n51] = g[n51] | 0x4000;
                    }
                    if (f[n4] == 'q') {
                        int n52 = n4;
                        g[n52] = g[n52] | 0x10000;
                    }
                    if (f[n4] == '\u008e') {
                        int n53 = n4;
                        g[n53] = g[n53] | 0x8000;
                    }
                    if (f[n4] == '(' || f[n4] == ')') {
                        int n54 = n4;
                        g[n54] = g[n54] | 0x20000;
                    }
                    if (f[n4] == 'n') {
                        int n55 = n4;
                        g[n55] = g[n55] | 0x40000;
                    }
                    if (f[n4] == '\u008f') {
                        int n56 = n4;
                        g[n56] = g[n56] | 0x80000;
                    }
                }
                ++n4;
            }
            h = Image.createImage((int)(a * x * t.b), (int)(b * x * t.b));
            t t2 = new t(h.getGraphics());
            t2.a(0);
            t2.c(0, 0, a * x, b * x);
            n2 = 0;
            while (n2 < a) {
                n3 = 0;
                while (n3 < b) {
                    int n57 = f[n3 * a + n2] - '\u0001';
                    if (n57 != -1) {
                        t2.a(F, 0, n57 * x, x, x, 0, n2 * x, n3 * x, 0);
                    }
                    ++n3;
                }
                ++n2;
            }
            if (!main.a.a) {
                if (o == 0 || o <= 4 || o >= 16 && o <= 18 || o >= 24 && o <= 27 || o == 22 || o == 33 || o == 34 || o == 38 || o == 57 || o == 58 || o == 60 || o == 68 || o >= 70 && o <= 75 || o == 81) {
                    au.d.addElement(new az(1, true, 10));
                }
                if (o >= 39 && o <= 44 || o >= 46 && o <= 48 || o == 56 || o >= 62 && o <= 65) {
                    au.d.addElement(new az(3, true, am.d(150, 200)));
                    return;
                }
            }
        }
        catch (Exception exception) {
            System.out.println("Error Load Map");
            exception.printStackTrace();
            GameMidlet.g.a();
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final void a(t var0) {
        var2_1 = dg.t;
        while (var2_1 < dg.v) {
            var3_3 = dg.u;
            while (var3_3 < dg.w) {
                block21: {
                    block37: {
                        block36: {
                            block31: {
                                block35: {
                                    block34: {
                                        block33: {
                                            block32: {
                                                block28: {
                                                    block30: {
                                                        block29: {
                                                            block22: {
                                                                block27: {
                                                                    block26: {
                                                                        block25: {
                                                                            block24: {
                                                                                block23: {
                                                                                    var1_2 = af.f[var3_3 * af.a + var2_1] - '\u0001';
                                                                                    if ((af.c(var2_1, var3_3) & 256) == 256) break block21;
                                                                                    if (af.e != 4 || (af.c(var2_1, var3_3) & 64) != 64) break block22;
                                                                                    var1_2 = var3_3 - 1;
                                                                                    if ((var1_2 = af.f[var1_2 * af.a + var2_1] - '\u0001') != 15) break block23;
                                                                                    var0.a(af.E, 0, 17 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                                                    break block21;
                                                                                }
                                                                                if (var1_2 != 5) break block24;
                                                                                var0.a(af.E, 0, 7 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                                                break block21;
                                                                            }
                                                                            if (var1_2 != 18 && var1_2 != 22 && var1_2 != 15) break block25;
                                                                            var0.a(af.E, 0, 17 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                                            break block21;
                                                                        }
                                                                        if (var1_2 != 44 && var1_2 != 52 && var1_2 != 51) break block26;
                                                                        var0.a(af.E, 0, 56 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                                        break block21;
                                                                    }
                                                                    if (var1_2 == 24 || var1_2 == 23 || var1_2 == 20 || var1_2 == 21 || var1_2 == 19 || var1_2 == 12 || var1_2 == 13) break block21;
                                                                    if (var1_2 == -1) break block27;
                                                                    var0.a(af.E, 0, var1_2 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                                    break block22;
                                                                }
                                                                if (var1_2 == -1) break block21;
                                                            }
                                                            if (af.e != 1) break block28;
                                                            if ((af.c(var2_1, var3_3) & 32) != 32) break block29;
                                                            var0.a(af.G, 0, 24 * (main.a.w % 4), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                            break block21;
                                                        }
                                                        if ((af.c(var2_1, var3_3) & 64) != 64 && (af.c(var2_1, var3_3) & 2048) != 2048) break block28;
                                                        if ((af.c(var2_1, var3_3 - 1) & 32) != 32) break block30;
                                                        var0.a(af.G, 0, 24 * (main.a.w % 4), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                        break block21;
                                                    }
                                                    if ((af.c(var2_1, var3_3 - 1) & 4096) != 4096) break block28;
                                                    var0.a(af.E, 0, 504, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                    break block21;
                                                }
                                                if (af.e != 2) break block31;
                                                if ((af.c(var2_1, var3_3) & 32) != 32) break block32;
                                                var0.a(af.G, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                                break block21;
                                            }
                                            if (var1_2 != 17) break block33;
                                            var0.a(af.H, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                            break block21;
                                        }
                                        if (var1_2 != 133) break block34;
                                        var0.a(af.E, 0, 132 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                        break block21;
                                    }
                                    if ((af.c(var2_1, var3_3) & 64) != 64 && (af.c(var2_1, var3_3) & 2048) != 2048) break block31;
                                    if ((af.c(var2_1, var3_3 - 1) & 32) != 32) break block35;
                                    var0.a(af.G, 0, 24 * (main.a.w % 4), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                    break block21;
                                }
                                if ((af.c(var2_1, var3_3 - 1) & 4096) != 4096) break block31;
                                var1_2 = af.b(var2_1, var3_3 - 1);
                                if (var1_2 == 55) {
                                    var1_2 = 54;
                                } else if (var1_2 == 19 || var1_2 == 35) {
                                    var1_2 = af.b(var2_1, var3_3 - 2);
                                    if (var1_2 == 55) {
                                        var1_2 = 54;
                                    } else if (var1_2 < 40) {
                                        var1_2 = 21;
                                    }
                                } else {
                                    var1_2 = var1_2 < 40 ? 21 : 110;
                                }
                                var0.a(af.E, 0, var1_2 * 24, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                                break block21;
                            }
                            if (af.e != 3) ** GOTO lbl-1000
                            if ((af.c(var2_1, var3_3) & 32) != 32) break block36;
                            var0.a(af.G, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                            break block21;
                        }
                        if (var1_2 != 23) break block37;
                        var0.a(af.H, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                        break block21;
                    }
                    if ((af.c(var2_1, var3_3) & 64) != 64 && (af.c(var2_1, var3_3) & 2048) != 2048) ** GOTO lbl-1000
                    if ((af.c(var2_1, var3_3 - 1) & 32) == 32) {
                        var0.a(af.G, 0, 24 * (main.a.w % 4), 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                    } else if ((af.c(var2_1, var3_3 - 1) & 4096) == 4096) {
                        var1_2 = af.b(var2_1, var3_3 - 1);
                        if (var1_2 == 25) {
                            var1_2 = af.b(var2_1, var3_3 - 2);
                        }
                        if (var1_2 == 45) {
                            var1_2 = 44;
                        }
                        var0.a(af.E, 0, --var1_2 * 24, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                    } else if ((af.c(var2_1, var3_3) & 16) == 16) {
                        af.L = var2_1 * af.i - dg.i;
                        af.M = af.L - dg.d;
                        af.O = (af.i - 2) * af.M / af.i;
                        af.N = af.O + dg.d;
                        var0.a(af.E, 0, var1_2 * af.i, 24, 24, 0, af.N + dg.i, var3_3 * af.i, 0);
                    } else if ((af.c(var2_1, var3_3) & 512) == 512) {
                        if (var1_2 != -1) {
                            var0.a(af.E, 0, var1_2 * af.i, 24, 1, 0, var2_1 * af.i, var3_3 * af.i, 0);
                            var0.a(af.E, 0, var1_2 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i + 1, 0);
                        }
                    } else if (var1_2 != -1) {
                        var0.a(af.E, 0, var1_2 * af.i, 24, 24, 0, var2_1 * af.i, var3_3 * af.i, 0);
                    }
                }
                ++var3_3;
            }
            ++var2_1;
        }
    }

    public static final void b(t t2) {
        if (main.a.A <= 176) {
            return;
        }
        am.a(t2);
        t2.a(r + 1, s + 2);
        int n2 = bp.d().i / 12;
        int n3 = bp.d().j / 12;
        t2.a(0);
        t2.c(-2, -2, p + 2, q);
        t2.d(-2, -2, p + 4, q + 4);
        int n4 = 0;
        while (n4 < 2) {
            t2.a(Y[n4]);
            t2.b(n4 - 2, n4 - 2, p + 2 - (n4 << 1), q - (n4 << 1));
            ++n4;
        }
        t2.d(0, 0, p - 2, q - 3);
        if (t.a(h) > p || t.b(h) > q) {
            t2.a(-U, -Q);
        }
        t2.a(h, 0, 0, 0);
        t2.a(0xFFFFFF);
        t2.c(n2 - 2, n3 - 2, 5, 5);
        t2.a(0xFF0000);
        t2.c(n2 - 1, n3 - 1, 3, 3);
        n4 = 0;
        while (n4 < dg.G.size()) {
            db db2 = (db)dg.G.elementAt(n4);
            if (db2.f != null && db2.f != bp.d()) {
                n3 = db2.f.i / 12;
                int n5 = db2.f.j / 12;
                if (n3 < U) {
                    n3 = U;
                }
                if (n5 < Q) {
                    n5 = Q;
                }
                if (n3 > U + p) {
                    n3 = U + p;
                }
                if (n5 > Q + q) {
                    n5 = Q + q;
                }
                if (main.a.w % 10 < 8) {
                    t2.a(0xFFFFFF);
                    t2.c(n3 - 2, n5 - 2, 5, 5);
                    t2.a(65280);
                    t2.c(n3 - 1, n5 - 1, 3, 3);
                }
            }
            ++n4;
        }
        am.a(t2);
        if (main.a.g) {
            t2.a(dg.bz, r - 1, s, 0);
        }
    }

    public static final void c(t t2) {
        int n2;
        if (main.a.a) {
            return;
        }
        int n3 = dg.t;
        while (n3 < dg.v) {
            n2 = dg.u;
            while (n2 < dg.w) {
                Image image = null;
                image = e == 4 ? K : I;
                if ((af.c(n3, n2) & 0x800) == 2048) {
                    t2.a(J, n3, n2, 0);
                }
                if ((af.c(n3, n2) & 0x40) == 64) {
                    t2.a(image, 0, (main.a.w % 8 >> 2) * 24, 24, 24, 0, n3 * i, n2 * i, 0);
                }
                if ((af.c(n3, n2) & 0x100) == 256) {
                    t2.a(E, 0, (f[n2 * a + n3] - '\u0001') * i, 24, 24, 0, n3 * i, n2 * i, 0);
                }
                ++n2;
            }
            ++n3;
        }
        if (e != 4 && main.a.g && main.a.h && dg.w >= b - 2) {
            n3 = dg.t;
            while (n3 < dg.v) {
                int n4;
                n2 = b - 2;
                int n5 = f[n2 * a + n3] - '\u0001';
                if ((af.c(n3, n2) & 0x20) == 32) {
                    n4 = 1;
                    while (n4 <= 4) {
                        t2.a(G, 0, 24 * (main.a.w % 4), 24, 24, 0, n3 * i, (n2 + n4) * i, 0);
                        ++n4;
                    }
                } else {
                    if (o == 64) {
                        X = 115;
                    }
                    if ((af.c(n3, n2) & 2) == 2 || (af.c(n3, n2) & 0x40) == 64) {
                        n5 = X;
                    }
                    if (n5 >= 0) {
                        n4 = 1;
                        while (n4 <= 4) {
                            t2.a(E, 0, n5 * i, 24, 24, 0, n3 * i, (n2 + n4) * i, 0);
                            ++n4;
                        }
                    }
                }
                ++n3;
            }
        }
    }

    private static int b(int n2, int n3) {
        try {
            return f[n3 * a + n2];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    private static int c(int n2, int n3) {
        try {
            return g[n3 * a + n2];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final int a(int n2, int n3) {
        try {
            return g[n3 / i * a + n2 / i];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        try {
            return (g[n3 / i * a + n2 / i] & n4) == n4;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final void b(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        g[n5] = g[n5] | 0x200;
    }

    public static final void c(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        g[n5] = g[n5] & 0xFFFFFDFF;
    }

    public static final int b(int n2) {
        return n2 / i * i;
    }

    public static final int c(int n2) {
        return n2 / i * i;
    }

    public static void e() {
        InputStream inputStream = null;
        inputStream = null;
        inputStream = "".getClass().getResourceAsStream("/map/" + o);
        inputStream = new DataInputStream(inputStream);
        a = (char)((FilterInputStream)inputStream).read();
        b = (char)((FilterInputStream)inputStream).read();
        f = new char[((FilterInputStream)inputStream).available()];
        int n2 = 0;
        while (n2 < a * b) {
            af.f[n2] = (char)((FilterInputStream)inputStream).read();
            ++n2;
        }
        g = new int[f.length];
    }

    public static void f() {
        E = null;
        System.gc();
        E = main.a.c("/t/" + e + ".png");
        F = main.a.c("/t/mini_" + e + ".png");
    }
}

