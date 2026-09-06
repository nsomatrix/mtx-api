/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bh
extends ag
implements cs {
    private static bh a;
    private static ad b;
    private static int c;
    private static int d;
    private static int e;
    private static int[][] f;
    private static int[] g;
    private static int[] h;
    private bd i;
    private bd j;
    private int r = 0;

    static {
        f = new int[][]{{11, 26, 27, 28}, {2, 23, 24, 25}};
        int[] nArray = new int[2];
        nArray[0] = 9;
        g = nArray;
        h = new int[]{10, 1};
    }

    public static bh b() {
        if (a == null) {
            a = new bh();
        }
        return a;
    }

    public bh() {
        if (main.a.A == 128) {
            dg.b(128, 120);
            dg.ce = (main.a.A - 128) / 2;
            dg.cd = 0;
        } else {
            dg.b(170, 190);
            dg.ce = (main.a.A - 170) / 2;
            dg.cd = (main.a.B - 220) / 2;
        }
        c = 1;
        b = new ad();
        new ad().k = df.bA;
        bh.b.c = 100;
        bh.b.a = dg.ce + 45;
        bh.b.a = dg.ce + dg.cf / 2 - bh.b.c / 2;
        bh.b.b = dg.cd + 62;
        if (main.a.A == 128) {
            bh.b.c = 60;
        }
        bh.b.d = 26;
        bh.b.e = true;
        b.c(0);
        c = 1;
        d = 0;
        this.l = new bd(df.bz, this, 8000, null);
        this.k = new bd(df.bE, this, 8001, null);
        this.i = new bd("", this, 8002, null, dg.ce + dg.cf / 2 - ag.o / 2, dg.cd + 70 + 30);
        this.j = new bd("", this, 8003, null, dg.ce + dg.cf / 2 - ag.o / 2, dg.cd + 70 + 70);
        this.m = bh.b.l;
    }

    public final void a() {
        c = main.a.w % 2;
        d = main.a.w % 4;
        super.a();
    }

    public final void b(int n2) {
        b.a(n2);
    }

    public final void c() {
        if (++dg.i > main.a.A * 3 + 100) {
            dg.i = 100;
        }
        if (main.a.g && main.a.A >= 320) {
            if (this.k != null) {
                this.k.f = main.a.A / 2 - 160;
                this.k.g = main.a.B - 26;
            }
            if (this.l != null) {
                this.l.f = main.a.A / 2 - 35;
                this.l.g = main.a.B - 26;
            }
            if (this.m != null) {
                this.m.f = main.a.A / 2 + 88;
                this.m.g = main.a.B - 26;
            }
        }
        if (this.j != null) {
            this.j.c();
        }
        if (this.i != null) {
            this.i.c();
        }
    }

    public final void d() {
        if (main.a.n[2] && --e < 0) {
            e = df.dT.length - 1;
        }
        if (main.a.n[8] && ++e >= df.dT.length) {
            e = 0;
        }
        if (e == 0) {
            this.m = bh.b.l;
            b.c();
        }
        if (e == 1) {
            if (main.a.n[4] && --c < 0) {
                c = df.dU.length - 1;
            }
            if (main.a.n[6] && ++c > df.dU.length - 1) {
                c = 0;
            }
            this.m = null;
        }
        if (e == 2) {
            if (main.a.n[4] && --d < 0) {
                d = df.cf[0].length - 1;
            }
            if (main.a.n[6] && ++d > df.cf[0].length - 1) {
                d = 0;
            }
        }
        if (main.a.r && main.a.b(dg.ce + 5, dg.cd + 65, dg.cf - 5, ag.n)) {
            e = 0;
        }
        super.d();
        main.a.i();
        main.a.h();
    }

    public final void a(t t2) {
        int n2 = 0;
        try {
            main.a.a(t2);
            n2 = 1;
            ay.a(dg.ce, dg.cd, dg.cf, dg.cg, t2);
            int n3 = 40;
            if (main.a.A == 128) {
                n3 = 20;
            }
            n2 = 2;
            int n4 = f[c][d];
            int n5 = g[c];
            int n6 = h[c];
            n2 = 3;
            dr dr2 = dg.C[n4];
            dr dr3 = dg.C[n5];
            dr dr4 = dg.C[n6];
            int n7 = main.a.A / 2;
            int n8 = dg.cd + 50;
            n2 = 4;
            ab.a(t2, dr3.a[bp.bA[0][1][0]].a, n7 + bp.bA[0][1][1] + dr3.a[bp.bA[0][1][0]].b, n8 - bp.bA[0][1][2] + dr3.a[bp.bA[0][1][0]].c, 0, 0);
            ab.a(t2, dr4.a[bp.bA[0][2][0]].a, n7 + bp.bA[0][2][1] + dr4.a[bp.bA[0][2][0]].b, n8 - bp.bA[0][2][2] + dr4.a[bp.bA[0][2][0]].c, 0, 0);
            ab.a(t2, dr2.a[bp.bA[0][0][0]].a, n7 + bp.bA[0][0][1] + dr2.a[bp.bA[0][0][0]].b, n8 - bp.bA[0][0][2] + dr2.a[bp.bA[0][0][0]].c, 0, 0);
            n2 = 5;
            if (!main.a.g) {
                int n9 = 0;
                while (n9 < df.dT.length) {
                    if (e == n9) {
                        int n10 = n9 > 0 ? -5 : 0;
                        ab.a(t2, 989, dg.ce + 10 + (main.a.w % 7 > 3 ? 1 : 0), dg.cd + 76 + n9 * n3 + n10, 2, ch.g);
                        ab.a(t2, 989, dg.ce + dg.cf - 15 - (main.a.w % 7 > 3 ? 1 : 0), dg.cd + 76 + n9 * n3 + n10, 0, ch.g);
                    }
                    ++n9;
                }
            }
            n2 = 7;
            if (main.a.g) {
                this.i.a = df.dU[c];
                this.i.a(t2);
                this.j.a = df.cf[c][d];
                this.j.a(t2);
            } else {
                ay.b(this.i.f, this.i.g, this.i.h, this.i.i, t2);
                if (e == 1) {
                    t2.a(ay.b);
                    t2.c(this.i.f, this.i.g, this.i.h, this.i.i);
                    ay.b(this.i.f, this.i.g, this.i.h, this.i.i, t2);
                }
                ay.b(this.j.f, this.j.g, this.j.h, this.j.i, t2);
                if (e == 2) {
                    t2.a(ay.b);
                    t2.c(this.j.f, this.j.g, this.j.h, this.j.i);
                    ay.b(this.j.f, this.j.g, this.j.h, this.j.i, t2);
                }
                dd.e.a(t2, df.dU[c], dg.ce + 85, dg.cd + 66 + n3 * 1, 2);
                dd.e.a(t2, df.cf[c][d], dg.ce + 85, dg.cd + 66 + n3 * 2, 2);
            }
            bh.b.a = dg.ce + dg.cf / 2 - bh.b.c / 2;
            bh.b.b = dg.cd + 62;
            bh.b.g = df.bA;
            b.a(t2);
            super.a(t2);
            t2.a(0);
            return;
        }
        catch (Exception exception) {
            System.out.println("CreateCharScr.paint(): " + n2);
            exception.printStackTrace();
            return;
        }
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                dq.a().a(b.d(), c, f[c][d]);
                return;
            }
            case 8001: {
                if (u.b().j) {
                    main.a.G.a();
                    return;
                }
                u.b().a();
                return;
            }
            case 8002: {
                this.r = 1;
                e = 1;
                if (this.r != e || --c >= 0) break;
                c = df.dU.length - 1;
                return;
            }
            case 8003: {
                this.r = 2;
                e = 2;
                if (this.r != e || ++d <= df.cf[0].length - 1) break;
                d = 0;
            }
        }
    }
}

