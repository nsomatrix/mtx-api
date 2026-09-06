/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package main;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.c;

public final class a
extends c
implements cs,
Runnable {
    public static boolean a = false;
    public static Image b = null;
    public static boolean c = true;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static a k;
    public static da l;
    static boolean m;
    public static boolean[] n;
    private static boolean[] aa;
    public static boolean[] o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    private static ck[] ab;
    public static int w;
    public static int x;
    public static boolean y;
    public static boolean z;
    private static long ac;
    private static long ad;
    private static boolean ae;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static ag E;
    public static ds F;
    public static co G;
    public static dc H;
    public static l I;
    public static i J;
    public static br K;
    public static p L;
    public static de M;
    public static ay N;
    public static ao O;
    private static Image[] af;
    private static int ag;
    private static int ah;
    public static int P;
    private static int[] ai;
    private t aj = new t();
    private static boolean ak;
    private static int al;
    private static int am;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int ar;
    private static Image as;
    private static Image at;
    public static Image[] Q;
    public static int R;
    public static int S;
    private static int[] au;
    private static int[] av;
    private static int aw;
    private static int ax;
    public static int T;
    private static long ay;
    public static int U;
    private static int[] az;
    private int[] aA;
    private int[] aB;
    private int[] aC;
    private static int[] aD;
    private static int[] aE;
    private static int[] aF;
    private static Image[] aG;
    private static Image aH;
    private static Image[][] aI;
    private boolean aJ;
    public static boolean V;
    public static boolean W;
    public static Image X;
    public static Image Y;
    public static Image[] Z;
    private static int aK;
    private static int aL;
    private static int aM;

    static {
        g = false;
        n = new boolean[14];
        aa = new boolean[14];
        o = new boolean[14];
        ab = new ck[4];
        F = new ds();
        new aa();
        ah = 0;
        Q = new Image[2];
        T = -1;
        ay = 0L;
        new aa();
        V = false;
        W = false;
        aK = A;
        aL = 0;
    }

    public a() {
        int n2 = 1;
        main.b.a.setFullScreenMode(true);
        main.b.a.a(this);
        A = main.b.a.b();
        B = main.b.a.a();
        C = A / 2;
        D = B / 2;
        boolean bl2 = ae = System.getProperty("microedition.platform").indexOf("RIM") == 0;
        if (main.b.a.hasPointerEvents()) {
            g = true;
            if (A >= 240) {
                h = true;
            }
            if (A < 320) {
                i = true;
            }
            if (A >= 320) {
                j = true;
            }
        }
        K = new br();
        if (B <= 160) {
            ay.f = 15;
            ag.p = 17;
        }
        l = new da();
        k = this;
        System.gc();
        N = new ay();
        if (!a) {
            if (aI == null) {
                aI = new Image[2][5];
                n2 = 0;
                while (n2 < 2) {
                    int n3 = 0;
                    while (n3 < 5) {
                        main.a.aI[n2][n3] = main.a.c("/e/d" + n2 + n3 + ".png");
                        ++n3;
                    }
                    ++n2;
                }
            }
            this.aA = new int[2];
            this.aB = new int[2];
            this.aC = new int[2];
            this.aC[1] = -1;
            this.aC[0] = -1;
        }
        main.a.o();
        GameMidlet.d();
        aH = main.a.c("/u/f.png");
        if (g) {
            int n4 = 0;
            while (n4 < 2) {
                main.a.Q[n4] = main.a.c("/hd/bd" + n4 + ".png");
                ++n4;
            }
            R = t.a(Q[0]);
            S = t.b(Q[0]);
            t.a(Q[1]);
            t.b(Q[1]);
        } else {
            int n5 = w.c("lowGraphic");
            if (n5 == 1) {
                a = true;
            }
        }
        ab.c();
        if (main.b.a.hasPointerEvents()) {
            new aa();
        }
        ag.f();
        I = new l();
    }

    public static a a() {
        if (k == null) {
            k = new a();
        }
        return k;
    }

    public static void a(int n2) {
        String string = "socket://" + GameMidlet.d + ":" + GameMidlet.c;
        System.out.println("connect: " + n2 + " | isWorldver: " + GameMidlet.i);
        if (ae) {
            string = !d ? String.valueOf(string) + ";interface=wifi" : String.valueOf(string) + ";deviceside=true";
        }
        dh.a().a(string);
    }

    public static void b() {
        A = main.b.a.b();
        B = main.b.a.a();
        C = A / 2;
        D = B / 2;
        H = new dc();
        G = new co();
        O = new ao();
        L = new p();
        M = new de();
    }

    public final void c() {
        new Thread(this).start();
    }

    public final void run() {
        try {
            Thread.sleep(10L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        m = true;
        while (m) {
            try {
                long l2 = System.currentTimeMillis();
                if (l2 - ac >= 780L && !y) {
                    ac = l2;
                    y = true;
                } else {
                    y = false;
                }
                if (l2 - ad >= 7800L && !z) {
                    ad = l2;
                    z = true;
                } else {
                    z = false;
                }
                if (x > 0) {
                    --x;
                }
                if (++w > 10000) {
                    if (System.currentTimeMillis() - ay > 20000L && E == H) {
                        GameMidlet.g.notifyDestroyed();
                    }
                    w = 0;
                }
                if (E != null) {
                    if (J != null) {
                        J.a();
                    } else if (main.a.F.a) {
                        F.b();
                        F.a();
                    }
                    if (!f) {
                        E.c();
                    }
                    E.d();
                }
                long l3 = System.currentTimeMillis();
                if (bf.c && l3 > bf.b) {
                    bf.c = false;
                    try {
                        if (bf.a > 0) {
                            dg.n().a(bf.a, (Object)null);
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                }
                if (b.b > 0 && --b.b == 0) {
                    b.b();
                }
                if (this.aJ) {
                    this.aJ = false;
                    G.a();
                    try {
                        bp.e();
                        dg.o();
                        dg.b();
                        main.a.j();
                        b.b();
                        dg.a(true);
                        dg.i = 100;
                        main.a.b(af.m);
                        dg.G.removeAllElements();
                        dg.F.removeAllElements();
                        dg.I.removeAllElements();
                        dg.L.removeAllElements();
                        bp.ae = null;
                    }
                    catch (Exception exception) {
                        Exception exception3 = exception;
                        exception.printStackTrace();
                    }
                }
                main.b.a.repaint();
                main.b.a.serviceRepaints();
                long l4 = System.currentTimeMillis() - l2;
                try {
                    if (l4 < 40L) {
                        Thread.sleep(1L * (40L - l4));
                        continue;
                    }
                    Thread.sleep(1L);
                }
                catch (InterruptedException interruptedException) {}
            }
            catch (Exception exception) {
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {
                    InterruptedException interruptedException2 = interruptedException;
                    interruptedException.printStackTrace();
                }
                exception.printStackTrace();
            }
        }
    }

    public static void d() {
        if (e && --P < 0) {
            e = false;
        }
    }

    public static void e() {
        if (a) {
            return;
        }
        if (as == null) {
            return;
        }
        int n2 = 0;
        while (n2 < au.length) {
            if (w % (n2 + 2 << 3) == 0) {
                int n3 = n2;
                au[n3] = au[n3] + 1;
                if (au[n2] > dg.b + (t.a(as) >> 1)) {
                    main.a.au[n2] = -(t.a(as) >> 1);
                }
            }
            ++n2;
        }
    }

    public static void a(t t2) {
        if (e) {
            if (w % 10 > 7) {
                t2.a(0xFFFFFF);
            } else {
                t2.a(0);
            }
            t2.c(0, 0, dg.b, dg.c);
            return;
        }
        if (ak && !a && af != null) {
            t2.a(ag);
            t2.c(0, 0, dg.b, al);
            if (T >= 0 && T <= 1) {
                int n2;
                if (af[0] != null) {
                    n2 = -((dg.i >> 1) % 24);
                    while (n2 < dg.b) {
                        t2.a(af[0], n2, am, 0);
                        n2 += 24;
                    }
                }
                if (af[1] != null) {
                    n2 = -((dg.i >> 2) % 24);
                    while (n2 < dg.b) {
                        t2.a(af[1], n2, an, 0);
                        n2 += 24;
                    }
                }
                if (af[3] != null) {
                    n2 = -((dg.i >> 4) % 64);
                    while (n2 < dg.b) {
                        t2.a(af[3], n2, ap, 0);
                        n2 += 64;
                    }
                }
                if (at != null) {
                    t2.a(at, aw, ax, 3);
                }
                if (as != null) {
                    n2 = 0;
                    while (n2 < 2) {
                        t2.a(as, au[n2], av[n2], 3);
                        ++n2;
                    }
                }
                if (af[2] != null) {
                    n2 = -((dg.i >> 3) % 192);
                    while (n2 < dg.b) {
                        t2.a(af[2], n2, ao, 0);
                        n2 += 192;
                    }
                    return;
                }
            } else if (T >= 2 && T <= 6) {
                int n3;
                if (at != null) {
                    t2.a(at, aw, ax, 3);
                }
                if (as != null) {
                    n3 = 0;
                    while (n3 < au.length) {
                        t2.a(as, au[n3], av[n3], 3);
                        ++n3;
                    }
                }
                if (T != 2) {
                    if (af[3] != null) {
                        n3 = -((dg.i >> az[3]) % ai[3]);
                        while (n3 < dg.b) {
                            t2.a(af[3], n3, ap, 0);
                            n3 += ai[3];
                        }
                    }
                    if (af[2] != null) {
                        n3 = -((dg.i >> az[2]) % ai[2]);
                        while (n3 < dg.b) {
                            t2.a(af[2], n3, ao, 0);
                            n3 += ai[2];
                        }
                    }
                    if (af[1] != null) {
                        n3 = -((dg.i >> az[1]) % ai[1]);
                        while (n3 < dg.b) {
                            t2.a(af[1], n3, ar, 0);
                            n3 += ai[1];
                        }
                    }
                    if (af[0] != null) {
                        n3 = -((dg.i >> az[0]) % ai[0]);
                        while (n3 < dg.b) {
                            t2.a(af[0], n3, aq, 0);
                            n3 += ai[0];
                        }
                        return;
                    }
                }
            } else if (T >= 7 && T <= 16) {
                int n4;
                t2.a(ag);
                t2.c(0, 0, dg.b, dg.c);
                if (T != 8 && af[3] != null) {
                    n4 = -((dg.i >> az[3]) % ai[3]);
                    while (n4 < dg.b) {
                        if (T == 11 || T == 12) {
                            t2.a(af[3], n4, dg.c - t.b(af[3]), 0);
                        } else {
                            t2.a(af[3], n4, ap, 0);
                        }
                        n4 += ai[3];
                    }
                }
                if (T != 8 && T != 11 && T != 12 && af[2] != null) {
                    if (af.o == 45) {
                        t2.a(af[2], dg.b, ao, 0);
                    } else {
                        n4 = -((dg.i >> az[2]) % ai[2]);
                        while (n4 < dg.b) {
                            if (T == 14) {
                                t2.a(af[2], n4, ao + 12, 0);
                            } else {
                                t2.a(af[2], n4, ao, 0);
                            }
                            n4 += ai[2];
                        }
                    }
                }
                if (T != 11 && T != 12 && af[1] != null && af.o != 52) {
                    n4 = -((dg.i >> az[1]) % ai[1]);
                    while (n4 < dg.b) {
                        t2.a(af[1], n4, ar, 0);
                        n4 += ai[1];
                    }
                }
                if (af.o == 45 || af.o == 55) {
                    t2.a(0x110000);
                    t2.c(0, aq + 20, dg.b, dg.c);
                }
                if (af[0] != null) {
                    n4 = -((dg.i >> az[0]) % ai[0]);
                    while (n4 < dg.b) {
                        t2.a(af[0], n4, aq, 0);
                        n4 += ai[0];
                    }
                }
                if (as != null) {
                    if (T == 13 || T == 15) {
                        n4 = 0;
                        while (n4 < 2) {
                            t2.a(as, au[n4], av[n4] - 130, 3);
                            ++n4;
                        }
                        return;
                    }
                    n4 = 0;
                    while (n4 < 2) {
                        t2.a(as, au[n4], av[n4], 3);
                        ++n4;
                    }
                    return;
                }
            }
        } else {
            t2.a(ag);
            t2.c(0, 0, dg.b, dg.c);
        }
    }

    public static void f() {
        af = null;
        as = null;
        at = null;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(int n2) {
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        T = n2;
        int n6 = Integer.MIN_VALUE;
        block22: do {
            switch (n6 == Integer.MIN_VALUE ? T : n6) {
                case 0: {
                    break;
                }
                case 2: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 3: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 4: {
                    n3 = 9;
                    n4 = 6;
                    n6 = 16;
                    continue block22;
                }
                case 5: {
                    az = new int[]{1, 1, 1, 1};
                    break;
                }
                case 6: {
                    n3 = 12;
                    n6 = 16;
                    continue block22;
                }
                case 12: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 11: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 10: {
                    az = new int[]{1, 1, 1, 1};
                    break;
                }
                case 9: {
                    n3 = 16;
                    n4 = 10;
                    n5 = 6;
                    n6 = 16;
                    continue block22;
                }
                case 8: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 7: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 13: {
                    n3 = 60;
                    n6 = 16;
                    continue block22;
                }
                case 14: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 15: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
                case 16: {
                    az = new int[]{1, 2, 3, 4};
                    break;
                }
            }
            break;
        } while (true);
        ag = ch.j[T];
        try {
            if (!a) {
                block59: {
                    af = new Image[4];
                    ai = new int[4];
                    int n7 = 0;
                    while (true) {
                        if (n7 >= 4) {
                            if (T == 10) {
                                main.a.af[1] = main.a.c("/bg/bg09.png");
                                main.a.af[2] = main.a.c("/bg/bg09.png");
                                main.a.ai[1] = t.a(af[1]);
                                main.a.ai[2] = t.a(af[2]);
                            }
                            if (T == 12) {
                                main.a.af[3] = main.a.c("/bg/bg39.png");
                                main.a.ai[3] = t.a(af[3]);
                            }
                            if (T == 14) {
                                if (!g) break;
                                aq = B - t.b(af[0]);
                                ar = aq - t.b(af[1]);
                            }
                            break block59;
                        }
                        try {
                            if (ch.i[T][n7] != -1) {
                                main.a.af[n7] = main.a.c("/bg/bg" + n7 + ch.i[T][n7] + ".png");
                            }
                        }
                        catch (Exception exception) {
                            Exception exception2 = exception;
                            exception.printStackTrace();
                        }
                        if (af[n7] != null) {
                            main.a.ai[n7] = t.a(af[n7]);
                        }
                        ++n7;
                    }
                    aq = B - t.b(af[0]) - 45;
                    ar = aq - t.b(af[1]);
                }
                if (T == 15 && g) {
                    aq = B - t.b(af[0]);
                    ar = aq - t.b(af[1]) + 100;
                }
                if (T == 16) {
                    if (g) {
                        aq = B - t.b(af[0]);
                        ar = aq - t.b(af[1]) + 100;
                    } else {
                        aq = B - t.b(af[0]) - 40;
                        ar = aq - t.b(af[1]) + 100;
                    }
                }
            }
            if (T >= 0 && T <= 1) {
                as = main.a.c("/bg/cl0.png");
                at = main.a.c("/bg/sun0.png");
            } else {
                as = null;
                at = null;
            }
            if (T == 2) {
                as = main.a.c("/bg/cl1.png");
                at = main.a.c("/bg/sun1.png");
            }
            if (T == 7 || T == 11 || T == 12) {
                as = af.o == 20 ? null : main.a.c("/bg/cl0.png");
            }
            if (n2 == 13 || n2 == 15) {
                as = main.a.c("/bg/cl2.png");
            }
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
        ak = false;
        if (!a) {
            ak = true;
            if (af[0] != null && af[1] != null && af[2] != null) {
                al = dg.c - (t.b(af[0]) + t.b(af[1]) + t.b(af[2])) + 11;
            }
            if (af[0] != null) {
                am = dg.c - t.b(af[0]);
            }
            if (af[1] != null) {
                an = am - t.b(af[1]);
            }
            if (af[2] != null) {
                ao = an - t.b(af[2]);
            }
            if (af[3] != null) {
                ap = an - t.b(af[3]) - 10;
            }
            if (T >= 2 && T <= 13) {
                int n8;
                aq = n8 = dg.c - t.b(af[0]);
                if (af[1] != null) {
                    n8 = n8 - t.b(af[1]) + n3;
                }
                ar = n8;
                if (af[3] != null) {
                    n8 = n8 - t.b(af[3]) + n5;
                }
                ap = n8;
                al = n8;
                if (af[2] != null) {
                    ao = ar - t.b(af[2]) + n4;
                }
                if (T == 2) {
                    al = B;
                }
            }
        }
        int n9 = 0;
        n9 = T >= 2 && T <= 12 ? 2 * dg.c / 3 - ar : 2 * dg.c / 3 - an;
        if (n9 < 0) {
            n9 = 0;
        }
        if (af.o == 48 && af.o == 51) {
            aq += n9;
        }
        if (T >= 2 && T <= 6) {
            ar += n9;
        }
        al += n9;
        am += n9;
        an += n9;
        ao += n9;
        ap += n9;
        aw = 3 * dg.b / 4;
        ax = al / 3;
        au = new int[2];
        av = new int[2];
        main.a.au[0] = dg.b / 3;
        main.a.av[0] = al / 2 - 8;
        main.a.au[1] = 2 * dg.b / 3;
        main.a.av[1] = al / 2 + 8;
        if (T == 2) {
            ax = al / 5;
            au = new int[5];
            av = new int[5];
            main.a.au[0] = dg.b / 3;
            main.a.av[0] = al / 3 - 35;
            main.a.au[1] = 3 * dg.b / 4;
            main.a.av[1] = al / 3 + 12;
            main.a.au[2] = dg.b / 3 - 15;
            main.a.av[2] = al / 3 + 12;
            main.a.au[3] = dg.b / 15;
            main.a.av[3] = al / 2 + 12;
            main.a.au[4] = 2 * dg.b / 3 + 25;
            main.a.av[4] = al / 3 + 12;
        }
        if (!a) {
            if (T == 8) {
                aq = ar = dg.f - 50;
            }
            if (T == 10 && af[3] != null) {
                ap = ao - t.b(af[3]);
            }
            if (T == 11 || T == 12) {
                ap = 0;
            }
        }
    }

    protected final void c(int n2) {
        ay = System.currentTimeMillis();
        if (n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 122 || n2 == 10 || n2 == 8 || n2 == 13 || n2 == 32) {
            U = n2;
        }
        int n3 = n2;
        if (J != null) {
            J.a(n3);
            U = 0;
            return;
        }
        E.b(n3);
        switch (n3) {
            case 48: {
                main.a.o[0] = true;
                main.a.n[0] = true;
                return;
            }
            case 49: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[1] = true;
                    main.a.n[1] = true;
                }
                return;
            }
            case 51: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[3] = true;
                    main.a.n[3] = true;
                }
                return;
            }
            case 55: {
                main.a.o[7] = true;
                main.a.n[7] = true;
                return;
            }
            case 57: {
                main.a.o[9] = true;
                main.a.n[9] = true;
                return;
            }
            case 42: {
                main.a.o[10] = true;
                main.a.n[10] = true;
                return;
            }
            case 35: {
                main.a.o[11] = true;
                main.a.n[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.o[12] = true;
                main.a.n[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.o[13] = true;
                main.a.n[13] = true;
                return;
            }
            case -5: 
            case 10: {
                if (E instanceof dg) {
                    bp.d();
                }
                main.a.o[5] = true;
                main.a.n[5] = true;
                return;
            }
            case -38: 
            case -1: {
                if (E instanceof dg) {
                    bp.d();
                }
                main.a.o[2] = true;
                main.a.n[2] = true;
                return;
            }
            case -39: 
            case -2: {
                if (E instanceof dg) {
                    bp.d();
                }
                main.a.o[8] = true;
                main.a.n[8] = true;
                return;
            }
            case -3: {
                if (E instanceof dg) {
                    bp.d();
                }
                main.a.o[4] = true;
                main.a.n[4] = true;
                return;
            }
            case -4: {
                if (E instanceof dg) {
                    bp.d();
                }
                main.a.o[6] = true;
                main.a.n[6] = true;
                return;
            }
            case 50: {
                if (E == dg.a && c && !aw.a().b && !dg.aN) {
                    main.a.o[2] = true;
                    main.a.n[2] = true;
                }
                return;
            }
            case 52: {
                if (E == dg.a && c && !aw.a().b && !dg.aN) {
                    main.a.o[4] = true;
                    main.a.n[4] = true;
                }
                return;
            }
            case 54: {
                if (E == dg.a && c && !aw.a().b && !dg.aN) {
                    main.a.o[6] = true;
                    main.a.n[6] = true;
                }
                return;
            }
            case 56: {
                if (E == dg.a && c && !aw.a().b && !dg.aN) {
                    main.a.o[8] = true;
                    main.a.n[8] = true;
                }
                return;
            }
            case 53: {
                if (E != dg.a || !c || aw.a().b || dg.aN) break;
                main.a.o[5] = true;
                main.a.n[5] = true;
            }
        }
    }

    protected final void d(int n2) {
        U = 0;
        int n3 = n2;
        switch (n3) {
            case 48: {
                main.a.o[0] = false;
                main.a.aa[0] = true;
                return;
            }
            case 49: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[1] = false;
                    main.a.aa[1] = true;
                }
                return;
            }
            case 51: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[3] = false;
                    main.a.aa[3] = true;
                }
                return;
            }
            case 55: {
                main.a.o[7] = false;
                main.a.aa[7] = true;
                return;
            }
            case 57: {
                main.a.o[9] = false;
                main.a.aa[9] = true;
                return;
            }
            case 42: {
                main.a.o[10] = false;
                main.a.aa[10] = true;
                return;
            }
            case 35: {
                main.a.o[11] = false;
                main.a.aa[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.o[12] = false;
                main.a.aa[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.o[13] = false;
                main.a.aa[13] = true;
                return;
            }
            case -5: 
            case 10: {
                main.a.o[5] = false;
                main.a.aa[5] = true;
                return;
            }
            case -38: 
            case -1: {
                main.a.o[2] = false;
                return;
            }
            case -39: 
            case -2: {
                main.a.o[8] = false;
                return;
            }
            case -3: {
                main.a.o[4] = false;
                return;
            }
            case -4: {
                main.a.o[6] = false;
                return;
            }
            case 50: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[2] = false;
                    main.a.aa[2] = true;
                }
                return;
            }
            case 52: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[4] = false;
                    main.a.aa[4] = true;
                }
                return;
            }
            case 54: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[6] = false;
                    main.a.aa[6] = true;
                }
                return;
            }
            case 56: {
                if (E == dg.a && c && !aw.a().b) {
                    main.a.o[8] = false;
                    main.a.aa[8] = true;
                }
                return;
            }
            case 53: {
                if (E != dg.a || !c || aw.a().b) break;
                main.a.o[5] = false;
                main.a.aa[5] = true;
            }
        }
    }

    protected final void a(int n2, int n3) {
        if (am.e(n2 - u) >= 10 || am.e(n3 - v) >= 10) {
            q = false;
        }
        s = n2;
        t = n3;
        if (++ah > 3) {
            ah = 0;
        }
        main.a.ab[main.a.ah] = new ck(n2, n3);
    }

    public static boolean g() {
        return System.currentTimeMillis() - ay >= 800L;
    }

    protected final void b(int n2, int n3) {
        p = true;
        q = true;
        ay = System.currentTimeMillis();
        u = n2;
        v = n3;
        s = n2;
        t = n3;
    }

    protected final void c(int n2, int n3) {
        p = false;
        r = true;
        ag.q = -1;
        s = n2;
        t = n3;
    }

    public static boolean a(int n2, int n3, int n4, int n5) {
        int n6 = s + dg.i;
        int n7 = dg.j + t;
        if (!p && !r) {
            return false;
        }
        return n6 >= n2 && n6 <= n2 + n4 && n7 >= n3 && n7 <= n3 + n5;
    }

    public static boolean a(int n2, int n3, int n4, int n5, bw bw2) {
        int n6 = s + bw2.a;
        int n7 = bw2.b + t;
        if (!p && !r) {
            return false;
        }
        return n6 >= n2 && n6 <= n2 + n4 && n7 >= n3 && n7 <= n3 + n5;
    }

    public static boolean b(int n2, int n3, int n4, int n5) {
        if (!p && !r) {
            return false;
        }
        return s >= n2 && s <= n2 + n4 && t >= n3 && t <= n3 + n5;
    }

    public static void h() {
        int n2 = 0;
        while (n2 < 14) {
            main.a.n[n2] = false;
            ++n2;
        }
        r = false;
    }

    public static void i() {
        int n2 = 0;
        while (n2 < 14) {
            main.a.o[n2] = false;
            ++n2;
        }
    }

    protected final void a(Graphics graphics) {
        Object object;
        ((a)object).aj.a = graphics;
        try {
            if (E != null && !f) {
                E.a(((a)object).aj);
                ((a)object).aj.d(0, 0, A, B);
            }
            ((a)object).aj.a(-((a)object).aj.a(), -((a)object).aj.b());
            ((a)object).aj.d(0, 0, A, B);
            b.a(((a)object).aj);
            if (J != null) {
                J.a(((a)object).aj);
            } else if (main.a.F.a) {
                F.a(((a)object).aj);
            }
            dg.b(((a)object).aj);
            object = ((a)object).aj;
            if (V) {
                aM = dd.d.a(df.iH);
                if (aM > A && --aK < -440) {
                    aK = A;
                }
                ((t)object).a(0);
                ((t)object).c(0, 0, A, 16);
                dd.d.a((t)object, df.iH, aK + 20, 3, 0);
                ((t)object).a(X, 0, 0, 0);
            }
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void j() {
        if (L != null) {
            main.a.L.d.b(500);
        }
        if (M != null) {
            main.a.M.d.b(500);
            main.a.M.e.b(500);
        }
        J = null;
    }

    public static void a(String string) {
        K.a(string, null, new bd(df.ax, k, 8882, null), null);
        J = K;
    }

    public static void b(String string) {
        K.a(string, null, new bd(df.bd, k, 8882, null), null);
        J = K;
        main.a.K.d = true;
    }

    public static void k() {
        main.a.b(df.y);
    }

    public static void l() {
        main.a.K.e = 500;
        K.a(df.y, null, null, null);
        J = K;
        main.a.K.d = true;
    }

    public final void a(String string, String string2, String string3, String string4) {
        K.a(string4, new bd(string, this, 8881, string3), null, new bd(string2, this, 8882, null));
        J = K;
    }

    public final void a(String string, String string2, short s2, String string3, String string4) {
        aa aa2 = new aa();
        aa2.addElement(new Short(s2));
        aa2.addElement(string3);
        K.a(string4, new bd(string, this, 8883, aa2), null, new bd(string2, this, 8882, null));
        J = K;
    }

    public static void a(String object, int n2, Object object2) {
        K.a((String)object, null, new bd(df.ax, k, n2, null, A / 2 - 35, B - 50), null);
        object = K;
        J = object;
    }

    public static void a(String object, int n2, Object object2, int n3, Object object3) {
        String cfr_ignored_0 = "yeso no dilog " + n3;
        K.a((String)object, new bd(df.ah, k, n2, object2), new bd("", k, n2, object2), new bd(df.au, k, n3, object3));
        object = K;
        J = object;
    }

    public static void a(String object, bd bd2, bd bd3) {
        K.a((String)object, bd2, null, bd3);
        object = K;
        J = object;
    }

    public static Image c(String string) {
        string = "/x" + t.b + string;
        Image image = null;
        try {
            image = Image.createImage((String)string);
        }
        catch (IOException iOException) {}
        return image;
    }

    public final boolean a(int n2, int n3, int n4) {
        if (a) {
            return false;
        }
        int n5 = n2 = n2 == 1 ? 0 : 1;
        if (this.aC[n2] != -1) {
            return false;
        }
        this.aC[n2] = 0;
        this.aA[n2] = n3;
        this.aB[n2] = n4;
        return true;
    }

    private static void o() {
        if (a) {
            return;
        }
        aG = new Image[3];
        int n2 = 0;
        while (n2 < 3) {
            main.a.aG[n2] = main.a.c("/e/w" + n2 + ".png");
            ++n2;
        }
        aD = new int[2];
        aE = new int[2];
        int[] nArray = new int[2];
        aF = nArray;
        main.a.aF[1] = -1;
        nArray[0] = -1;
    }

    public static boolean d(int n2, int n3) {
        int n4;
        if (a) {
            return false;
        }
        int n5 = n4 = aF[0] == -1 ? 0 : 1;
        if (aF[n4] != -1) {
            return false;
        }
        main.a.aF[n4] = 0;
        main.a.aD[n4] = n2;
        main.a.aE[n4] = n3;
        return true;
    }

    public final void m() {
        if (a) {
            return;
        }
        int n2 = 0;
        while (n2 < 2) {
            if (this.aC[n2] != -1) {
                int n3 = n2;
                this.aC[n3] = this.aC[n3] + 1;
                if (this.aC[n2] >= 5) {
                    this.aC[n2] = -1;
                }
                if (n2 == 0) {
                    int n4 = n2;
                    this.aA[n4] = this.aA[n4] - 1;
                } else {
                    int n5 = n2;
                    this.aA[n5] = this.aA[n5] + 1;
                }
                int n6 = n2;
                this.aB[n6] = this.aB[n6] - 1;
            }
            ++n2;
        }
    }

    public static boolean e(int n2, int n3) {
        if (n2 < dg.i) {
            return false;
        }
        if (n2 > dg.i + dg.b) {
            return false;
        }
        if (n3 < dg.j) {
            return false;
        }
        return n3 <= dg.j + dg.c + 30;
    }

    public final void b(t t2) {
        if (a) {
            return;
        }
        int n2 = 0;
        while (n2 < 2) {
            if (this.aC[n2] != -1 && main.a.e(this.aA[n2], this.aB[n2])) {
                t2.a(aI[n2][this.aC[n2]], this.aA[n2], this.aB[n2], 3);
            }
            ++n2;
        }
    }

    public static void a(int n2, int n3, t t2, boolean bl2) {
        int n4 = w % 3;
        t2.a(aH, 0, n4 << 4, 16, 16, 0, n2, n3, 3);
    }

    public final void n() {
        f = false;
        this.aJ = true;
    }

    public static boolean c(int n2, int n3, int n4, int n5) {
        if (!p && !r) {
            return false;
        }
        return s >= n2 && s <= n2 + n4 && t >= n3 && t <= n3 + n5;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8891: {
                dq.a().o(0);
                J = null;
                return;
            }
            case 8881: {
                Object object2 = (String)object;
                at.b((String)object2);
                J = null;
                return;
            }
            case 8882: {
                J = null;
                return;
            }
            case 8883: {
                short s2 = (Short)((aa)object).elementAt(0);
                String string = (String)((aa)object).elementAt(0);
                at.a(string, s2);
                J = null;
                return;
            }
            case 8884: {
                main.a.j();
                G.a();
                return;
            }
            case 8885: {
                GameMidlet.g.notifyDestroyed();
                return;
            }
            case 8886: {
                main.a.a(df.iB, new bd(df.iG, k, 8880, null), new bd(df.au, k, 8882, null));
                return;
            }
            case 8880: {
                main.a.j();
                I.a();
                return;
            }
            case 8887: {
                main.a.j();
                int n3 = (Integer)object;
                dq.a().t(n3);
                return;
            }
            case 8888: {
                int n4 = (Integer)object;
                dq.a().u(n4);
                main.a.j();
                return;
            }
            case 8889: {
                Object object2 = (String)object;
                main.a.j();
                dq.a().i((String)object2);
                return;
            }
            case 88810: {
                int n5 = (Integer)object;
                main.a.j();
                dq.a().l(n5);
                return;
            }
            case 88811: {
                main.a.j();
                dq.a().h();
                return;
            }
            case 88812: {
                Object object2 = (bp)object;
                main.a.j();
                dq.a().p(((bp)object2).p);
                return;
            }
            case 88813: {
                main.a.j();
                Object object2 = (by[])object;
                dq.a().a((by[])object2);
                return;
            }
            case 88814: {
                Object object2 = (by[])object;
                main.a.j();
                dq.a().b((by[])object2);
                return;
            }
            case 88815: {
                dg.n();
                dg.G();
                return;
            }
            case 88816: {
                dq.a().b(main.a.M.d.d(), main.a.M.e.d());
                main.a.j();
                return;
            }
            case 88817: {
                if (bp.d().aU != null) {
                    dq.a().a((byte)0, bp.d().aU.cm.a, main.a.F.b, 0);
                    return;
                }
                dq.a().a((byte)0, 0, main.a.F.b, 0);
                return;
            }
            case 888181: {
                short s3 = (Short)object;
                dq.a().b(s3, main.a.L.d.d());
                b = null;
                main.a.j();
                return;
            }
            case 88818: {
                short s4 = (Short)object;
                dq.a().a(s4, main.a.L.d.d());
                main.a.j();
                return;
            }
            case 88819: {
                short s5 = (Short)object;
                dq.a().a(s5);
                dg.n().H();
                return;
            }
            case 88820: {
                Object object2 = (String[])object;
                if (bp.d().aU == null) {
                    return;
                }
                Integer n6 = new Integer(main.a.F.b);
                if (((Object)object2).length > 1) {
                    object = new aa();
                    int n7 = 0;
                    while (n7 < ((Object)object2).length - 1) {
                        ((aa)object).addElement(new bd((String)object2[n7 + 1], k, 88821, n6));
                        ++n7;
                    }
                    F.a((aa)object);
                    return;
                }
                cb.b("", 1, bp.d().aU);
                dq.a().a((byte)0, bp.d().aU.cm.a, n6, 0);
                return;
            }
            case 88821: {
                int n8 = (Integer)object;
                cb.b("", 1, bp.d().aU);
                dq.a().a((byte)0, bp.d().aU.cm.a, n8, main.a.F.b);
                return;
            }
            case 88822: {
                cb.b("", 1, bp.d().aU);
                dq.a().a((byte)0, bp.d().aU.cm.a, main.a.F.b, 0);
                return;
            }
            case 88823: {
                main.a.a(df.bS);
                return;
            }
            case 88824: {
                main.a.a(df.bT);
                return;
            }
            case 88825: {
                Object object2 = df.ht;
                main.a.a((String)object2);
                return;
            }
            case 88826: {
                Object object2 = df.hv;
                main.a.a((String)object2);
                return;
            }
            case 88827: {
                main.a.a(df.hu);
                return;
            }
            case 88828: {
                main.a.a(df.hw);
                return;
            }
            case 88829: {
                String string = main.a.L.d.d();
                if (string.equals("")) {
                    return;
                }
                dq.a().b(string, (int)((Integer)object));
                main.a.b(df.y);
                return;
            }
            case 88830: {
                int n9 = (Integer)object;
                main.a.j();
                dq.a().H(n9);
                return;
            }
            case 88831: {
                int n10 = (Integer)object;
                main.a.j();
                dq.a().I(n10);
                return;
            }
            case 88832: {
                Object object2 = main.a.L.d.d();
                main.a.j();
                if (((String)object2).equals("")) break;
                dq.a().n((String)object2);
                return;
            }
            case 88833: {
                Object object2 = main.a.L.d.d();
                main.a.j();
                if (((String)object2).equals("")) break;
                try {
                    int n11 = Integer.parseInt((String)object2);
                    if (bp.d().ar < n11 || n11 < 0) {
                        ae.a(df.hx, 20, dd.j);
                        return;
                    }
                    dq.a().J(n11);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88834: {
                Object object2 = main.a.L.d.d();
                main.a.j();
                if (((String)object2).equals("")) break;
                try {
                    int n12 = Integer.parseInt((String)object2);
                    if (n12 <= 0) {
                        return;
                    }
                    dq.a().K(n12);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88835: {
                int n13 = Integer.parseInt((String)object);
                n2 = Integer.parseInt(main.a.L.d.d());
                J = null;
                if (n2 < 1 || n2 >= bp.d().aB[n13].f) {
                    main.a.a(df.hy);
                    return;
                }
                dq.a().i(n13, n2);
                return;
            }
            case 88836: {
                main.a.L.d.b(6);
                L.a(df.gX, new bd(df.bc, k, 888361, null), 1);
                return;
            }
            case 888361: {
                Object object2 = main.a.L.d.d();
                main.a.j();
                if (((String)object2).length() < 6 || ((String)object2).equals("")) {
                    main.a.a(df.gR);
                    return;
                }
                try {
                    dq.a().L(Integer.parseInt((String)object2));
                    return;
                }
                catch (Exception exception) {
                    main.a.a(df.gS);
                    return;
                }
            }
            case 88837: {
                Object object2 = main.a.L.d.d();
                main.a.j();
                try {
                    dq.a().N(Integer.parseInt(((String)object2).trim()));
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88838: {
                Object object2 = main.a.M.d.d().trim();
                String string = main.a.M.e.d().trim();
                main.a.j();
                if (((String)object2).length() < 6 || string.length() < 6) {
                    main.a.a(df.gR);
                    return;
                }
                try {
                    int n14 = Integer.parseInt((String)object2);
                    int n15 = Integer.parseInt(string);
                    if (n14 < 99999 || n15 < 99999) {
                        main.a.a(df.gT);
                        return;
                    }
                    dq.a().j(n14, n15);
                    return;
                }
                catch (Exception exception) {
                    main.a.a(df.gS);
                    return;
                }
            }
            case 88839: {
                Object object2 = main.a.L.d.d();
                main.a.j();
                try {
                    Integer.parseInt((String)object2);
                    main.a.a(df.hA, 888391, object2, 8882, null);
                    return;
                }
                catch (Exception exception) {
                    ae.a(df.gU, 20, dd.j);
                    return;
                }
            }
            case 888391: {
                try {
                    main.a.j();
                    n2 = Integer.parseInt((String)object);
                    dq.a().M(n2);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88840: {
                Object object2 = (bp)object;
                main.a.j();
                dq.a().m(((bp)object2).p);
                return;
            }
            case 88841: {
                Object object2 = (bp)object;
                main.a.j();
                dq.a().n(((bp)object2).p);
                return;
            }
            case 88842: {
                dq.a().C();
                return;
            }
            case 88843: {
                String string = main.a.L.d.d();
                main.a.j();
                if (string.equals("")) {
                    main.a.a(df.hz);
                    return;
                }
                dq.a().r(string);
                return;
            }
            case 8890: {
                main.a.j();
                dq.a().o((Integer)object);
                return;
            }
            case 1608: {
                dq.a().a(main.a.M.d.d(), main.a.M.e.d(), (byte)0);
                main.a.j();
                return;
            }
            case 16081: {
                dq.a().a(main.a.M.d.d(), main.a.M.e.d(), (byte)1);
                main.a.j();
                return;
            }
            case 1700: {
                dq.a().a((short)100, main.a.L.d.d(), dg.cp);
                main.a.j();
            }
        }
    }
}

