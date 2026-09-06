/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class u
extends ag
implements cs {
    private static u r;
    private int s = 48;
    private int t = 85;
    private int u;
    private int v;
    private int w;
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public String[] g;
    public String[] h;
    public byte[] i;
    private bd x;
    private int y;
    public boolean j = true;
    private int z = main.a.B / 2 - 2;
    private int A = main.a.B / 2 + 2;

    public static u b() {
        if (r == null) {
            r = new u();
        }
        return r;
    }

    public u() {
        if (main.a.A < 160) {
            this.s = 32;
        }
        this.u = 7;
        this.v = (main.a.A - 3 * this.s >> 1) - 5;
        this.w = main.a.D - (this.t >> 1) + 10;
        if (main.a.g && main.a.A > 200) {
            this.s = 74;
            this.u = 25;
            this.t = 110;
            this.v = (main.a.A - 3 * this.s >> 1) - 20;
            this.w = main.a.D - (this.t >> 1);
            if (main.a.A < 320) {
                this.u = 6;
                this.v = (main.a.A - 3 * this.s >> 1) - 6;
            }
        }
        this.k = null;
        this.x = new bd(df.bo, this, 1000, null);
        this.l = new bd("", this, 1000, null);
        this.m = new bd(df.av, this, 1001, null);
        this.k = this.x;
        if (main.a.g) {
            this.l = null;
            this.k = null;
        }
        if (main.a.g && main.a.A >= 320) {
            this.m.f = main.a.A / 2 + 88;
            this.m.g = main.a.B - 26;
        }
    }

    private void g() {
        if (this.g[this.a] != null) {
            dq.a().b(this.g[this.a]);
            main.a.b(df.y);
            main.a.f = true;
            return;
        }
        bh.b().a();
    }

    public final void d() {
        super.d();
        if (main.a.n[6]) {
            ++this.a;
            if (this.a >= 3) {
                this.a = 0;
            }
        }
        if (main.a.n[4]) {
            --this.a;
            if (this.a < 0) {
                this.a = 2;
            }
        }
        if (main.a.p && main.a.b(this.v, this.w, 3 * (this.s + this.u), this.t)) {
            int n2 = (main.a.s - this.v) / (this.s + this.u);
            if (n2 > 2) {
                n2 = 2;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            this.a = n2;
        }
        if (main.a.r) {
            if (main.a.b(this.v, this.w, 3 * (this.s + this.u), this.t)) {
                this.y = 5;
            } else {
                this.a = -1;
            }
        }
        main.a.i();
        main.a.h();
    }

    public final void c() {
        if (++dg.i > main.a.A * 3 + 100) {
            dg.i = 100;
        }
        u u2 = this;
        if (this.y > 0) {
            --this.y;
            if (this.y == 0 && this.a >= 0) {
                this.g();
            }
        }
    }

    public final void a() {
        af.c();
        System.gc();
        super.a();
        int n2 = 0;
        while (n2 < this.g.length) {
            if (this.g[n2] != null) {
                this.j = false;
                break;
            }
            ++n2;
        }
        if (this.j) {
            bh.b().a();
        }
    }

    public final void a(t t2) {
        main.a.a(t2);
        int n2 = 0;
        while (n2 < 3) {
            if (this.a == n2) {
                ay.d(this.v + n2 * (this.s + this.u), this.w, this.s, this.t, t2);
            } else {
                ay.c(this.v + n2 * (this.s + this.u), this.w, this.s, this.t, t2);
            }
            ay.b(this.v + n2 * (this.s + this.u), this.w, this.s, this.t, t2);
            ++n2;
        }
        n2 = 0;
        while (n2 < 3) {
            if (this.g[n2] != null) {
                int n3;
                dr dr2 = dg.C[this.b[n2]];
                dr dr3 = dg.C[this.c[n2]];
                dr dr4 = dg.C[this.d[n2]];
                dr dr5 = dg.C[this.e[n2]];
                if (dr2.a == null || dr2.a.length < 8) {
                    bp.d();
                    dr2 = bp.b(this.i[n2]);
                } else {
                    n3 = 0;
                    while (n3 < dr2.a.length) {
                        if (dr2.a[n3] == null || !ab.a(dr2.a[n3].a)) {
                            bp.d();
                            dr2 = bp.b(this.i[n2]);
                            break;
                        }
                        ++n3;
                    }
                }
                n3 = this.v + n2 * (this.s + this.u) + this.s / 2;
                int n4 = 0;
                if (!main.a.g) {
                    n4 = this.w + this.t / 2 + 16;
                    ab.a(t2, dr5.a[bp.bA[0][3][0]].a, n3 + bp.bA[0][3][1] + dr5.a[bp.bA[0][3][0]].b, n4 - bp.bA[0][3][2] + dr5.a[bp.bA[0][3][0]].c, 0, 0);
                    ab.a(t2, dr3.a[bp.bA[0][1][0]].a, n3 + bp.bA[0][1][1] + dr3.a[bp.bA[0][1][0]].b, n4 - bp.bA[0][1][2] + dr3.a[bp.bA[0][1][0]].c, 0, 0);
                    ab.a(t2, dr4.a[bp.bA[0][2][0]].a, n3 + bp.bA[0][2][1] + dr4.a[bp.bA[0][2][0]].b, n4 - bp.bA[0][2][2] + dr4.a[bp.bA[0][2][0]].c, 0, 0);
                    ab.a(t2, dr2.a[bp.bA[0][0][0]].a, n3 + bp.bA[0][0][1] + dr2.a[bp.bA[0][0][0]].b, n4 - bp.bA[0][0][2] + dr2.a[bp.bA[0][0][0]].c, 0, 0);
                    if (this.a == n2) {
                        dd.o.a(t2, String.valueOf(df.fQ[0]) + ": " + this.g[n2], main.a.C, this.w - 45, 2);
                        dd.e.a(t2, String.valueOf(df.fQ[1]) + ": " + this.f[n2], main.a.C, this.w - 28, 2, dd.b);
                        dd.e.a(t2, this.h[n2], main.a.C, this.w - 16, 2, dd.b);
                    }
                } else {
                    n4 = this.w + this.t / 2 - 5;
                    ab.a(t2, dr5.a[bp.bA[0][3][0]].a, n3 + bp.bA[0][3][1] + dr5.a[bp.bA[0][3][0]].b, n4 - bp.bA[0][3][2] + dr5.a[bp.bA[0][3][0]].c, 0, 0);
                    ab.a(t2, dr3.a[bp.bA[0][1][0]].a, n3 + bp.bA[0][1][1] + dr3.a[bp.bA[0][1][0]].b, n4 - bp.bA[0][1][2] + dr3.a[bp.bA[0][1][0]].c, 0, 0);
                    ab.a(t2, dr4.a[bp.bA[0][2][0]].a, n3 + bp.bA[0][2][1] + dr4.a[bp.bA[0][2][0]].b, n4 - bp.bA[0][2][2] + dr4.a[bp.bA[0][2][0]].c, 0, 0);
                    ab.a(t2, dr2.a[bp.bA[0][0][0]].a, n3 + bp.bA[0][0][1] + dr2.a[bp.bA[0][0][0]].b, n4 - bp.bA[0][0][2] + dr2.a[bp.bA[0][0][0]].c, 0, 0);
                    dd.o.a(t2, this.g[n2], n3, this.w + this.t / 2 + 5, 2);
                    dd.e.a(t2, String.valueOf(df.fQ[1]) + ": " + this.f[n2], n3, this.w + this.t / 2 + 22, 2);
                    if (main.a.A > 200) {
                        dd.e.a(t2, this.h[n2], n3, this.w + this.t / 2 + 34, 2);
                    }
                }
            }
            ++n2;
        }
        super.a(t2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                this.g();
                return;
            }
            case 1001: {
                dh.a().c();
                main.a.k.n();
            }
        }
    }
}

