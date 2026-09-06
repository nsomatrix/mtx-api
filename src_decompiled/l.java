/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.a;

public final class l
extends ag
implements cs {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e = -1;

    public final void a() {
        dg.c = main.a.B;
        if (main.a.T == 2) {
            main.a.b(0);
        } else {
            main.a.b(af.m);
        }
        super.a();
        if (dg.a != null) {
            dg.a = null;
        }
        if ((af.m = (byte)(System.currentTimeMillis() % 9L)) == 5 || af.m == 6) {
            af.m = (byte)4;
        }
        dg.a(true);
        dg.i = 100;
        this.a = 170;
        this.b = 175;
        if (main.a.A == 128 || main.a.B <= 208) {
            this.a = 126;
            this.b = 160;
        }
        this.c = main.a.A / 2 - this.a / 2;
        this.d = main.a.B / 2 - this.b / 2;
        if (main.a.B <= 250) {
            this.d -= 10;
        }
        this.l = new bd(main.a.g ? "" : df.ax, this, 1000, null);
        this.m = new bd(df.av, main.a.k, 8885, null);
        this.e = -1;
        if (!main.a.g) {
            this.e = 0;
        }
        if (main.a.g && main.a.A >= 320) {
            this.l.f = main.a.A / 2 - 35;
            this.m.f = main.a.A / 2 + 88;
            this.l.g = this.m.g = main.a.B - 26;
        }
    }

    public final void a(t t2) {
        t2.a(0);
        t2.c(0, 0, main.a.A, main.a.B);
        main.a.a(t2);
        ay.a(this.c, this.d, this.a, this.b, t2);
        t2.a(ay.c);
        t2.b(main.a.C - dd.o.a(df.D) / 2 - 12, this.d + 7, dd.o.a(df.D) + 22, 24, 6, 6);
        t2.a(ay.b);
        t2.a(main.a.C - dd.o.a(df.D) / 2 - 12, this.d + 7, dd.o.a(df.D) + 22, 24, 6, 6);
        dd.o.a(t2, df.D, main.a.C, this.d + 12, 2);
        String[] stringArray = df.F;
        int n2 = this.d + 50;
        int n3 = 0;
        while (n3 < stringArray.length) {
            t2.a(ay.c);
            t2.c(this.c + 10, n2 + n3 * 35, this.a - 20, 28);
            t2.a(5720393);
            t2.b(this.c + 10, n2 + n3 * 35, this.a - 20, 28);
            if (n3 == this.e) {
                t2.a(ay.b);
                t2.c(this.c + 10, n2 + n3 * 35, this.a - 20, 28);
                t2.a(0xA8A8A8);
                t2.b(this.c + 10, n2 + n3 * 35, this.a - 20, 28);
            }
            dd.e.a(t2, stringArray[n3], this.c + this.a / 2, n2 + n3 * 35 + 8, 2);
            ++n3;
        }
        super.a(t2);
        ay.a(t2, this.k, this.l, this.m);
    }

    public static void a(int n2) {
        w.a("indLanguage", n2);
    }

    public static int b() {
        int n2 = 0;
        n2 = w.c("indLanguage");
        return n2;
    }

    public final void c() {
        if (++dg.i > main.a.A * 3 + 100) {
            dg.i = 100;
        }
        super.c();
    }

    public final void d() {
        if (main.a.n[2] || main.a.n[4] || main.a.n[6] || main.a.n[8]) {
            int n2 = this.e = this.e == 0 ? 1 : 0;
        }
        if (main.a.r && main.a.b(this.c + 10, this.d + 45, this.a - 10, 70)) {
            if (main.a.q) {
                this.e = (main.a.t - (this.d + 45)) / 35;
            }
            this.a(1000, null);
        }
        super.d();
        main.a.h();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                main.a.J = null;
                w.a();
                main.a.b();
                GameMidlet.i = this.e != 0;
                co.a(GameMidlet.e());
                main.a.G.a();
            }
        }
    }
}

