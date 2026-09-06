/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class ao
extends ag
implements cs {
    public static ao a;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private ad[] j = new ad[7];
    private String[] r = new String[]{"H\u1ecd v\u00e0 t\u00ean", "Ng\u00e0y-th\u00e1ng-n\u0103m sinh", "\u0110\u1ecba ch\u1ec9 th\u01b0\u1eddng tr\u00fa", "CMND", "Ng\u00e0y c\u1ea5p(dd-mm-yyyy)", "N\u01a1i c\u1ea5p", "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i, \u0111\u1ecba ch\u1ec9 th\u01b0 \u0111i\u1ec7n t\u1eed (n\u1ebfu c\u00f3).", "* D\u01b0\u1edbi 18 tu\u1ed5i ch\u1ec9 c\u00f3 th\u1ec3 ch\u01a1i 180p 1 ng\u00e0y"};
    private String[] s = new String[]{"", "", "", "", "", "", "", ""};
    public bw b = new bw();

    public ao() {
        a = this;
        this.c = main.a.C - 100;
        this.d = 10;
        this.e = 200;
        this.f = main.a.B - 40;
        this.g = this.e - 40;
        this.h = main.a.C - this.g / 2;
        int n2 = 0;
        while (n2 < this.j.length) {
            this.j[n2] = new ad();
            this.j[n2].k = this.r[n2];
            this.j[n2].a = this.h;
            this.j[n2].b = (n2 + 1) * 50;
            this.j[n2].c = this.g;
            this.j[n2].d = ag.n + 2;
            this.j[n2].e = false;
            this.j[n2].c(3);
            this.j[n2].a(this.s[n2]);
            if (n2 == 0) {
                this.j[n2].e = true;
            }
            ++n2;
        }
        this.k = new bd(df.aI, this, 1, null);
    }

    public final void c() {
        super.c();
        if (++dg.i > main.a.A * 3 + 100) {
            dg.i = 100;
        }
        int n2 = 0;
        while (n2 < this.j.length) {
            this.j[n2].c();
            ++n2;
        }
        new cn();
        cn cn2 = null;
        cn2 = this.b.b();
        if (cn2.a || cn2.c) {
            this.i = (byte)cn2.b;
        }
        this.b.c();
        cn2.getClass();
        if (this.i == -1) {
            int n3 = 0;
            while (n3 < this.j.length) {
                this.j[n3].e = false;
                ++n3;
            }
        }
    }

    public final void b(int n2) {
        super.b(n2);
        int n3 = 0;
        while (n3 < this.j.length) {
            if (this.j[n3].e) {
                this.j[n3].a(n2);
            }
            ++n3;
        }
    }

    public final void d() {
        int n2;
        if (main.a.n[2]) {
            --this.i;
            if (this.i < 0) {
                this.i = this.r.length;
            }
            this.b.a(this.i * this.b.h);
        } else if (main.a.n[8]) {
            ++this.i;
            if (this.i > this.r.length) {
                this.i = 0;
            }
            this.b.a(this.i * this.b.h);
        }
        if (main.a.n[2] || main.a.n[8]) {
            main.a.h();
            n2 = 0;
            while (n2 < this.j.length) {
                this.j[n2].e = false;
                ++n2;
            }
            if (this.i < this.j.length) {
                this.j[this.i].e = true;
            }
            this.b.a(this.i * this.b.h);
        }
        if (main.a.b(this.c, this.d, this.e, this.f) && main.a.r) {
            n2 = 0;
            while (n2 < this.j.length) {
                if (main.a.b(this.j[n2].a, this.j[n2].b, this.j[n2].c, this.j[n2].d)) {
                    this.i = n2;
                }
                ++n2;
            }
        }
        super.d();
        main.a.h();
    }

    public final void a(t t2) {
        t2.a(0);
        t2.c(0, 0, main.a.A, main.a.B);
        main.a.a(t2);
        ay.a(this.c, this.d, this.e, this.f, t2);
        dd.e.a(t2, df.aI, main.a.C, this.d + 10, 2);
        this.b.a(this.r.length, 50, this.c, this.d + 25, this.e, this.f - 25, true, 0);
        this.b.a(t2, this.c, this.d + 25, this.e, this.f - 25);
        int n2 = 0;
        while (n2 < this.r.length) {
            if (n2 != this.r.length - 1) {
                dd.j.a(t2, this.r[n2], main.a.C, (n2 + 1) * 50 - 13, 2);
            } else {
                dd.l.a(t2, this.r[n2], main.a.C, (n2 + 1) * 50 - 13, 2);
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.j.length) {
            this.j[n2].b(t2);
            ++n2;
        }
        super.a(t2);
    }

    public final void a() {
        super.a();
        this.b.a();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1: {
                dq.a().a(this.j[0].d(), this.j[1].d(), this.j[2].d(), this.j[3].d(), this.j[4].d(), this.j[5].d(), this.j[6].d());
                main.a.W = false;
                dg.n().a();
            }
        }
    }
}

