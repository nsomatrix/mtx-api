/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.a;

public final class co
extends ag
implements cs {
    private int e;
    private int f;
    private int g;
    private int h;
    private int i = -1;
    private static String[] j;
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    private static bd r;
    private static bd s;
    private static bd t;
    private static bd u;
    private static bd v;
    private static bd[][] w;
    private static int x;

    static {
        c = "";
        d = "";
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
    }

    public static void b() {
        x = w.c("indServer");
        if (x < 0 || x > GameMidlet.l.length - 1) {
            co.a(GameMidlet.e());
            return;
        }
        co.a(x);
    }

    public static void a(int n2) {
        if (dh.a().b()) {
            dh.a().c();
        }
        n2 = x = n2;
        w.a("indServer", n2);
        GameMidlet.d = GameMidlet.m[x];
        GameMidlet.c = GameMidlet.n[x];
        GameMidlet.h = GameMidlet.o[x];
        df.a(GameMidlet.p[x]);
        main.a.F.b = GameMidlet.q[x];
        main.a.a(7);
    }

    public final void a() {
        main.a.V = w.c("isKiemduyet") == 0;
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
        this.e = 170;
        this.f = 175;
        if (main.a.A == 128 || main.a.B <= 208) {
            this.e = 126;
            this.f = 160;
        }
        this.g = main.a.A / 2 - this.e / 2;
        this.h = main.a.B / 2 - this.f / 2;
        if (main.a.B <= 250) {
            this.h -= 10;
        }
        this.m = new bd(df.av, main.a.k, 8885, null);
        this.k = new bd(df.D, main.a.k, 8886, null);
        this.i = -1;
        if (!main.a.g) {
            this.i = 0;
        }
        if (main.a.g && main.a.A >= 320) {
            this.m.f = main.a.A / 2 + 88;
        }
        if (r == null) {
            r = new bd(main.a.g ? "" : df.ax, this, 1000, null);
            s = new bd(main.a.g ? "" : df.ax, this, 1001, null);
            u = new bd(main.a.g ? "" : df.ax, this, 1002, null);
            t = new bd(main.a.g ? "" : df.ax, this, 1003, null);
            v = new bd(main.a.g ? "" : df.ax, this, 20100, null);
            w = new bd[][]{{r, s, u, v}, {t, r, s, u, v}};
        }
        a = w.b("acc");
        b = w.b("pass");
        if (a == null) {
            a = "";
        }
        if (b == null) {
            b = "";
        }
        j = (a == null || a.equals("")) && c.equals("") ? new String[]{df.iC, df.iE, df.iF, df.iK} : new String[]{df.iD, df.iC, df.iE, df.iF, df.iK};
        main.a.F.b = GameMidlet.e();
        GameMidlet.d = GameMidlet.m[GameMidlet.e()];
        if (w.c("indServer") > -1 && w.c("indServer") < GameMidlet.m.length) {
            main.a.F.b = w.c("indServer");
            GameMidlet.d = GameMidlet.m[w.c("indServer")];
        }
        if (w.b("random") == null) {
            w.a("random", co.h());
        }
    }

    public final void a(t t2) {
        t2.a(0);
        t2.c(0, 0, main.a.A, main.a.B);
        main.a.a(t2);
        t2.a(dc.a, main.a.C - dc.a.getWidth() / 2, this.h + 10 - dc.a.getHeight() / 2, 0);
        if (!main.a.g && main.a.F.b == -1) {
            main.a.F.b = 0;
        }
        int n2 = this.h + 50;
        int n3 = 0;
        while (n3 < j.length) {
            t2.a(ay.c);
            t2.c(this.g + 10, n2 + n3 * 35, this.e - 20, 28);
            ay.b(this.g + 10, n2 + n3 * 35, this.e - 20, 28, t2);
            if (n3 == this.i) {
                t2.a(ay.b);
                t2.c(this.g + 10, n2 + n3 * 35, this.e - 20, 28);
                ay.b(this.g + 10, n2 + n3 * 35, this.e - 20, 28, t2);
            }
            if (n3 < j.length) {
                String string;
                if (a.equals("") && c.equals("")) {
                    if (n3 == 2) {
                        string = GameMidlet.l[w.c("indServer")];
                        dd.e.a(t2, String.valueOf(j[n3]) + string, this.g + this.e / 2, n2 + n3 * 35 + 8, 2);
                    } else {
                        dd.e.a(t2, j[n3], this.g + this.e / 2, n2 + n3 * 35 + 8, 2);
                    }
                } else if (n3 == 0) {
                    dd.e.a(t2, String.valueOf(j[n3]) + (!c.equals("") ? ": " + c : (a.startsWith("tmpusr") ? "" : ": " + a)), this.g + this.e / 2, n2 + n3 * 35 + 8, 2);
                } else if (n3 == 3) {
                    string = GameMidlet.l[w.c("indServer")];
                    dd.e.a(t2, String.valueOf(j[n3]) + string, this.g + this.e / 2, n2 + n3 * 35 + 8, 2);
                } else {
                    dd.e.a(t2, j[n3], this.g + this.e / 2, n2 + n3 * 35 + 8, 2);
                }
            }
            ++n3;
        }
        if (main.a.J == null) {
            ay.a(t2, this.k, this.l, this.m);
        }
        super.a(t2);
    }

    public final void c() {
        if (a.equals("") && c.equals("")) {
            if (this.i > -1 && this.i < w[0].length) {
                this.l = w[0][this.i];
            }
        } else if (this.i > -1 && this.i < w[1].length) {
            this.l = w[1][this.i];
        }
        if (++dg.i > main.a.A * 3 + 100) {
            dg.i = 100;
        }
        super.c();
    }

    public final void d() {
        if (main.a.n[2] || main.a.n[4]) {
            --this.i;
            if (this.i < 0) {
                this.i = j.length - 1;
            }
        } else if (main.a.n[8] || main.a.n[6]) {
            ++this.i;
            if (this.i > j.length - 1) {
                this.i = 0;
            }
        }
        if (main.a.r && main.a.b(this.g + 10, this.h + 45, this.e - 10, 170)) {
            if (main.a.q) {
                this.i = (main.a.t - (this.h + 45)) / 35;
            }
            if (a.equals("") && c.equals("")) {
                if (this.i > -1 && this.i < w[0].length) {
                    w[0][this.i].a();
                }
            } else if (this.i > -1 && this.i < w[1].length) {
                w[1][this.i].a();
            }
        }
        super.d();
        main.a.h();
    }

    private void i() {
        if (!dh.a().f) {
            main.a.a(5);
        }
        main.a.k();
    }

    public static boolean g() {
        return a != null && (a.startsWith("tmpusr") || a.equals(""));
    }

    public static String h() {
        String string = "";
        int n2 = 0;
        while (n2 < 12) {
            int n3 = am.d(0, 9);
            String string2 = Integer.toString(n3);
            string = String.valueOf(string) + string2;
            ++n2;
        }
        return string;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                if (co.g() && !a.equals("")) {
                    main.a.a(df.iB, new bd(df.iD, this, 10001, null), new bd(df.au, main.a.k, 8882, null));
                    return;
                }
                this.i();
                dq.a().a("-1", "12345", "2.1.7");
                return;
            }
            case 10001: {
                this.i();
                dq.a().a("-1", "12345", "2.1.7");
                if (c.equals("")) break;
                a = c;
                b = d;
                c = "";
                d = "";
                w.a("acc", a);
                w.a("pass", b);
                return;
            }
            case 1001: {
                if (co.g() && !a.equals("") && c.equals("")) {
                    main.a.a(df.iB, new bd(df.iG, this, 10004, null), new bd(df.au, main.a.k, 8882, null));
                    return;
                }
                main.a.H.a();
                return;
            }
            case 10004: {
                main.a.J = null;
                main.a.H.a();
                return;
            }
            case 100041: {
                return;
            }
            case 1002: {
                aa aa2 = new aa();
                if (GameMidlet.i) {
                    int n3 = GameMidlet.f() + 1;
                    while (n3 <= GameMidlet.p.length - 1) {
                        aa2.addElement(new bd(GameMidlet.l[n3], this, n3 + 20000, null));
                        ++n3;
                    }
                } else {
                    int n4 = 0;
                    while (n4 <= GameMidlet.f()) {
                        aa2.addElement(new bd(GameMidlet.l[n4], this, n4 + 20000, null));
                        ++n4;
                    }
                }
                main.a.F.a(aa2);
                if (w.c("indServer") != -1) {
                    main.a.F.b = GameMidlet.q[w.c("indServer")];
                }
                return;
            }
            case 1003: {
                this.i();
                if (!c.equals("")) {
                    a = c;
                    b = d;
                    c = "";
                    d = "";
                    w.a("acc", a);
                    w.a("pass", b);
                }
                dq.a().a(a, b, "2.1.7");
                return;
            }
            case 20000: 
            case 20001: 
            case 20002: 
            case 20003: 
            case 20004: 
            case 20005: 
            case 20006: 
            case 20007: 
            case 20008: 
            case 20009: 
            case 20010: 
            case 20011: 
            case 20012: 
            case 20013: 
            case 20014: 
            case 20015: 
            case 20016: 
            case 20017: 
            case 20018: 
            case 20019: {
                if (dh.a().b()) {
                    dh.a().c();
                }
                int n5 = n2 - 20000;
                main.a.F.a = false;
                GameMidlet.d = GameMidlet.m[n5];
                GameMidlet.c = GameMidlet.n[n5];
                GameMidlet.h = GameMidlet.o[n5];
                n2 = n5;
                w.a("indServer", n2);
                main.a.F.b = GameMidlet.q[n5];
                main.a.a(6);
                return;
            }
            case 20100: {
                main.a.k();
                GameMidlet.c();
                main.a.j();
            }
        }
    }
}

