/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class q
extends ag
implements cs {
    private static q a;
    private boolean b;
    private static Image c;
    private static Image d;
    private static Image e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int[] F;
    private static int[] G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean L = false;
    private int M;
    private int N;
    private static int O;

    static {
        c = null;
        D = 0;
        E = 0;
        F = new int[]{1, 156, 140, 174, 196, 195, 125, 148, 156, 173, 199, 203, 222, 264, 283, 277, 298, 307, 311, 315, 116, 90, 59, 31, 252, 55, 81, 111, 148, 187, 219, 253, 278, 304, 311, 310, 284, 309, 294, 62, 92, 117, 99, 134, 154, 175, 34, 52, 40, 78, 59, 82, 114, 179, 158, 142, 1, 215, 291, 242, 147, 301, 71, 23, 116, 126, 305, 286, 264, 20, 46, 70, 78, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        G = new int[]{1, 68, 75, 88, 80, 107, 87, 114, 136, 160, 168, 196, 216, 219, 248, 265, 276, 260, 232, 204, 111, 82, 79, 59, 168, 33, 28, 34, 45, 20, 54, 44, 19, 40, 60, 100, 175, 165, 134, 181, 199, 208, 221, 220, 219, 221, 195, 217, 246, 244, 250, 263, 262, 241, 252, 244, 2, 240, 197, 139, 16, 18, 208, 223, 239, 186, 120, 119, 135, 107, 125, 126, 148, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    }

    public q() {
        this.m = new bd(df.H, this, 1000, null);
        this.l = new bd(df.ca, this, 1001, null);
        this.k = new bd("", this, 14004, null);
        O = -1;
    }

    private void g() {
        int n2 = t.a(af.h);
        this.J = (main.a.A - n2) / 2;
        this.K = (main.a.B - 20 - t.b(af.h)) / 2;
        if (this.J < 0) {
            this.J = 0;
        }
        if (this.K < 0) {
            this.K = 0;
        }
        if (this.b) {
            A = n2 + 20 - main.a.A;
            B = t.b(af.h) + 40 - main.a.B;
            this.H = n2 + 20;
            this.I = n2 + 40;
            if (this.I < main.a.B - 26) {
                this.I = main.a.B - 26;
            }
            if (this.H < main.a.A) {
                this.H = main.a.A;
            }
            h = this.J + bp.d().i / 12;
            i = this.K + bp.d().j / 12;
        } else {
            A = 340 - main.a.A;
            B = 340 - main.a.B;
            h = F[af.o] + D;
            i = G[af.o] + E;
            this.H = 330 + D;
            this.I = 310 + E;
        }
        this.H -= 10;
        this.I -= 10;
        if (A < 0) {
            A = 0;
        }
        if (B < 0) {
            B = 0;
        }
        z = 0;
        y = 0;
        t = 0;
        s = 0;
        s = h - main.a.C;
        t = i - main.a.D;
    }

    public static q b() {
        if (a == null) {
            a = new q();
        }
        return a;
    }

    public final void a() {
        super.a();
        ab.b();
        af.c();
        this.m = new bd(df.H, this, 1000, null);
        this.l = new bd(df.ca, this, 1001, null);
        this.k = new bd("", this, 14004, null);
        if (c == null) {
            c = main.a.c("/wm.png");
            d = main.a.c("/u/x.png");
            e = main.a.c("/u/wpt1.png");
            f = t.b(c);
            g = t.b(c);
        }
        if (main.a.A > f) {
            D = main.a.C - f / 2 - 12;
        }
        if (main.a.B > g) {
            E = main.a.D - g / 2;
        }
        this.g();
        q.h();
        dd.r.b();
        dd.t.b();
        dd.q.b();
        dd.s.b();
        dd.s.b();
        dd.p.b();
        dd.g.b();
        dd.m.b();
        dd.h.b();
        dd.n.b();
        dd.l.b();
        dd.b.b();
        dd.c.b();
        dd.a.b();
        dd.e.b();
        System.gc();
        O = -1;
    }

    public final void e() {
        super.e();
        c = null;
        d = null;
        System.gc();
        af.f();
        ab.c();
        dd.r.a();
        dd.t.a();
        dd.q.a();
        dd.s.a();
        dd.s.a();
        dd.p.a();
        dd.g.a();
        dd.m.a();
        dd.h.a();
        dd.n.a();
        dd.l.a();
        dd.b.a();
        dd.c.a();
        dd.a.a();
        dd.e.a();
    }

    public final void a(t t2) {
        boolean bl2 = false;
        t2.a(0);
        t2.c(0, 0, main.a.A, main.a.B);
        t2.a(10, 10);
        t2.a(-y, -z);
        if (this.b) {
            int n2;
            int n3;
            Object object;
            t2.a(af.h, this.J, this.K, 0);
            int n4 = 0;
            while (n4 < dg.Q.size()) {
                object = (ci)dg.Q.elementAt(n4);
                n3 = ((ci)object).e / 12;
                n2 = ((ci)object).f / 12;
                if (((ci)object).x < bp.d().w - 2) {
                    t2.a(0xAAAAAA);
                } else if (((ci)object).x > bp.d().w + 2) {
                    t2.a(0xFF0000);
                } else {
                    t2.a(0xFFFF00);
                }
                t2.c(this.J + n3 - 1, this.K + n2 - 1, 3, 3);
                ++n4;
            }
            n4 = 0;
            while (n4 < dg.G.size()) {
                object = (db)dg.G.elementAt(n4);
                if (((db)object).f != null && ((db)object).f != bp.d()) {
                    n3 = ((db)object).f.i / 12;
                    n2 = ((db)object).f.j / 12;
                    if (main.a.w % 10 < 8) {
                        t2.a(0xFFFFFF);
                        t2.c(this.J + n3 - 2, this.K + n2 - 2, 5, 5);
                        t2.a(65280);
                        t2.c(this.J + n3 - 1, this.K + n2 - 1, 3, 3);
                    }
                }
                ++n4;
            }
            dg.n();
            dg.F();
            int n5 = 0;
            while (n5 < dg.R.size()) {
                cy cy2 = (cy)dg.R.elementAt(n5);
                n3 = cy2.i / 12;
                n2 = cy2.j / 12;
                t2.a(0xFFFFFF);
                t2.c(this.J + n3 - 2, this.K + n2 - 2, 5, 5);
                t2.a(65280);
                t2.c(this.J + n3 - 1, this.K + n2 - 1, 3, 3);
                t2.a(d, this.J + n3, this.K + n2, 3);
                bl2 = true;
                ++n5;
            }
            n5 = 0;
            while (n5 < af.t.size()) {
                ah ah2 = (ah)af.t.elementAt(n5);
                n3 = (ah2.a + ah2.c) / 2 / 12;
                n2 = (ah2.b + ah2.d) / 2 / 12;
                if (main.a.w % 10 < 8) {
                    t2.a(0);
                    t2.c(this.J + n3 - 2, this.K + n2 - 2, 5, 5);
                    t2.a(0xFFFFFF);
                    t2.c(this.J + n3 - 1, this.K + n2 - 1, 3, 3);
                }
                n5 = (byte)(n5 + 1);
            }
            n3 = bp.d().i / 12;
            n2 = bp.d().j / 12;
            t2.a(0xFFFFFF);
            t2.c(this.J + n3 - 2, this.K + n2 - 2, 5, 5);
            if (main.a.w % 10 > 5) {
                t2.a(255);
                t2.c(this.J + n3 - 1, this.K + n2 - 1, 3, 3);
            }
            t2.a(e, h - 2, i, 0);
            super.a(t2);
            if (!bl2) {
                dd.i.a(t2, af.k, 10, main.a.B - 17, 0);
            }
        } else {
            if (main.a.A > f && main.a.B > g) {
                t2.a(c, main.a.C, main.a.D, ch.g);
            } else if (main.a.A > f) {
                t2.a(c, main.a.C, 0, ch.a);
            } else if (main.a.B > g) {
                t2.a(c, 0, main.a.D, ch.h);
            } else {
                t2.a(c, 0, 0, 0);
            }
            if (af.o < af.u.length && af.o >= 0) {
                int n6 = 0;
                if (F[af.o] != 1 || G[af.o] != 1) {
                    n6 = F[af.o] < 100 ? 0 : (F[af.o] > 200 ? 1 : 2);
                    main.a.a(F[af.o] + D, G[af.o] + E, t2, false);
                }
                int n7 = 0;
                if (C >= 0) {
                    n6 = F[C] < 100 ? 0 : (F[C] > 200 ? 1 : 2);
                    dd.i.a(t2, af.u[C], F[C] + D, G[C] + E - 20, n6, dd.k);
                    t2.a(d, F[C] + D, G[C] + E, 3);
                    bl2 = true;
                    n7 = G[C] - 20;
                } else if (F[af.o] != 1 || G[af.o] != 1) {
                    n7 = G[af.o] - 20;
                    dd.j.a(t2, af.u[af.o], F[af.o] + D, G[af.o] + E - 20, n6, dd.k);
                }
                int n8 = 0;
                while (n8 < bp.d().bw.size()) {
                    av av2 = (av)bp.d().bw.elementAt(n8);
                    if (av2.g >= 0 && av2.g < F.length) {
                        t2.a(d, F[av2.g] + D, G[av2.g] + E, 3);
                    }
                    ++n8;
                }
                if (j >= 0 && (C < 0 && af.o != j || C >= 0 && j != C)) {
                    n6 = F[j] < 100 ? 0 : (F[j] > 200 ? 1 : 2);
                    n8 = F[j];
                    int n9 = G[j] - 20;
                    if (n9 > n7 && n9 - n7 < 30) {
                        n9 += 40;
                    }
                    if (n9 < n7 && n7 - n9 < 20) {
                        n9 -= 5;
                    }
                    dd.j.a(t2, af.u[j], n8 + D, n9 + E, n6, dd.k);
                }
            }
            t2.a(e, h - 2, i, 0);
            t2.a(-t2.a(), -t2.b());
            super.a(t2);
        }
        if (bl2) {
            t2.a(d, 10, main.a.B - 12, 3);
            dd.i.a(t2, df.dx, 20, main.a.B - 17, 0);
        }
    }

    public final void d() {
        super.d();
        if (++r > 10000) {
            r = 0;
        }
        if (y != s || z != t) {
            u = s - y << 1;
            v = t - z << 1;
            w &= 0xF;
            z += (x += v) >> 4;
            x &= 0xF;
            if ((y += (w += u) >> 4) < 0) {
                y = 0;
            }
            if (y > A) {
                y = A;
            }
            if (z < 0) {
                z = 0;
            }
            if (z > B) {
                z = B;
            }
        }
        int n2 = 0;
        if (main.a.o[2]) {
            if ((i -= 4) < E - 10) {
                i = E - 10;
            }
            n2 = 1;
        }
        if (main.a.o[8]) {
            if ((i += 4) > this.I) {
                i = this.I;
            }
            n2 = 1;
        }
        if (main.a.o[4]) {
            if ((h -= 4) < D - 10) {
                h = D - 10;
            }
            n2 = 1;
        }
        if (main.a.o[6]) {
            if ((h += 4) > this.H) {
                h = this.H;
            }
            n2 = 1;
        }
        if (n2 != 0) {
            s = h - main.a.C;
            t = i - main.a.D;
            q.h();
        }
        dg.n();
        C = dg.E();
        if (main.a.q && main.a.t < main.a.B - ag.p) {
            main.a.q = false;
            this.L = true;
            this.M = main.a.s;
            this.N = main.a.t;
        } else if (main.a.p && this.L) {
            t -= main.a.t - this.N;
            if ((s -= main.a.s - this.M) < 0) {
                s = 0;
            }
            if (t < 0) {
                t = 0;
            }
            if (s > A) {
                s = A;
            }
            if (t > B) {
                t = B;
            }
            y = s;
            z = t;
            this.M = main.a.s;
            this.N = main.a.t;
        }
        if (main.a.r) {
            n2 = main.a.u - main.a.s;
            int n3 = main.a.v - main.a.t;
            if (n2 < 10 && n3 < 10) {
                h = y + main.a.u - 8;
                i = z + main.a.v - 8;
                q.h();
            }
            this.L = false;
            main.a.r = false;
        }
        if (main.a.g && main.a.A >= 320) {
            this.k.f = main.a.A / 2 - 160;
            this.l.f = main.a.A / 2 - 35;
            this.m.f = main.a.A / 2 + 88;
            this.l.g = this.m.g = main.a.B - 26;
            this.k.g = this.m.g;
        }
    }

    private static void h() {
        O = j;
        j = -1;
        int n2 = 0;
        while (n2 < F.length) {
            if (am.e(h - (F[n2] + D)) < 10 && am.e(i - (G[n2] + E)) < 10) {
                j = n2;
                if (O == -1 || O != j) break;
                dq.a().D(j);
                O = -1;
                j = -1;
                return;
            }
            ++n2;
        }
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                if (bp.d().z <= 0 || bp.d().n == 14) {
                    this.l = dg.n().cj;
                    bp.d().z = 0;
                }
                dg.n().a();
                return;
            }
            case 1001: {
                this.b = !this.b;
                this.g();
                return;
            }
            case 14004: {
                dq.a().D(j);
            }
        }
    }
}

