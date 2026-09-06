/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;
import main.b;

public final class dc
extends ag
implements cs {
    private ad c;
    private ad d;
    private ad e;
    private ad f;
    private static dc g;
    private int h;
    private int i;
    private int j;
    private int r;
    private boolean s = false;
    private boolean t = false;
    private bd u;
    private bd v;
    private bd w;
    private bd x;
    public static Image a;
    private int y;
    private String[] z;
    private int A = -1;
    private int B = 2;
    private int C = 0;
    private int D = -40;
    private int E = 1;
    public static boolean b;
    private String F = "";

    static {
        a = main.a.c("/tt.png");
    }

    public final void a() {
        if (w.b("random") == null) {
            w.a("random", co.h());
        }
        dc dc2 = this;
        this.j = -50;
        this.t = false;
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
        if (main.a.F != null) {
            main.a.F = new ds();
        }
        main.a.d = false;
        this.k = this.x = new bd(df.aJ, this, 2005, null);
        dg.x.removeAllElements();
    }

    public final void a(boolean bl2) {
        this.t = true;
        dc dc2 = this;
        this.j = -50;
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
        if (main.a.F != null) {
            main.a.F = new ds();
        }
        main.a.d = false;
        this.k = this.x = new bd("H\u1ee7y", this, 20051, null);
    }

    public dc() {
        g = this;
        this.t = false;
        af.m = (byte)(System.currentTimeMillis() % 9L);
        if (af.m == 5 || af.m == 6) {
            af.m = (byte)4;
        }
        dg.a(true);
        dg.i = 100;
        this.r = main.a.B > 200 ? main.a.D - 80 : main.a.D - 65;
        dc dc2 = this;
        this.j = -50;
        this.i = main.a.A - 30;
        if (this.i < 135) {
            this.i = 135;
        }
        if (this.i > 155) {
            this.i = 155;
        }
        this.y = main.a.D - ag.n - 5;
        if (main.a.B <= 160) {
            this.y = 20;
        }
        this.c = new ad();
        this.c.k = df.ay;
        this.c.a = main.a.C - 20 - 57;
        this.c.b = this.y;
        this.c.c = this.i;
        this.c.d = ag.n + 2;
        this.c.e = true;
        this.c.c(3);
        ad.j = GameMidlet.g;
        ad.i = main.b.a;
        this.d = new ad();
        this.d.k = df.az;
        this.d.a = main.a.C - 20 - 57;
        this.d.b = this.y += 35;
        this.d.c = this.i;
        this.d.d = ag.n + 2;
        this.d.e = false;
        this.d.c(2);
        this.e = new ad();
        this.e.k = df.aF;
        this.e.a = main.a.C - 20 - 57;
        this.e.b = this.y += 35;
        this.e.c = this.i;
        this.e.d = ag.n + 2;
        this.e.e = false;
        this.e.c(2);
        this.f = new ad();
        this.f.k = "Email/S\u1ed1 di \u0111\u1ed9ng";
        this.f.a = main.a.C - 20 - 57;
        this.f.b = this.y += 35;
        this.f.c = this.i;
        this.f.d = ag.n + 2;
        this.f.e = false;
        this.f.c(3);
        this.s = true;
        if (co.a != null) {
            if (co.a.startsWith("tmpusr")) {
                this.c.a("");
                this.d.a("");
            } else {
                this.c.a(co.a);
                this.d.a(co.b);
            }
        }
        this.h = 0;
        this.u = new bd(df.ax, this, 2000, null);
        this.v = new bd(df.aG, this, 2001, null);
        this.w = new bd(df.aI, this, 2002, null);
        new bd(df.aJ, this, 2004, null);
        this.k = !this.t ? (this.x = new bd(df.aJ, this, 2005, null)) : (this.x = new bd(df.bd, this, 20051, null));
        if (main.a.g && main.a.A >= 320) {
            this.l = null;
            this.m = this.u;
            return;
        }
        this.l = this.u;
        this.m = this.c.l;
    }

    public static dc b() {
        return g;
    }

    private static void b(boolean bl2) {
        main.a.d = bl2;
        w.a("isGPRS", bl2 ? 1 : 2);
    }

    private void a(String string) {
        GameMidlet.d = GameMidlet.m[GameMidlet.e()];
        main.a.b(df.bj);
        main.a.a(3);
        main.a.b(df.bk);
        dq.a().b();
        dq.a().b(string, this.d.d(), this.f.d());
    }

    public final void c() {
        if (++dg.i > main.a.A * 3 + 100) {
            dg.i = 100;
        }
        this.c.c();
        this.d.c();
        if (this.t) {
            this.e.c();
            this.f.c();
        }
        dc dc2 = this;
        if (dc2.r != dc2.j) {
            dc2.j += dc2.r - dc2.j >> 1;
        }
        if (main.a.g) {
            this.l = null;
            this.m = this.t ? this.w : this.u;
        } else if (this.t) {
            this.l = this.w;
        } else if (this.h == 2) {
            this.l = this.v;
            this.l.a = this.s ? df.aH : df.aG;
        } else {
            this.l = this.u;
        }
        if (this.C >= 0) {
            this.D += this.E * this.C;
            this.C += this.E * this.B;
            if (this.C <= 0) {
                this.E = -this.E;
            }
            if (this.D > 0) {
                this.E = -this.E;
                this.C -= 2 * this.B;
            }
        }
        if (this.A >= 0 && main.a.w % 100 == 0) {
            ++this.A;
            if (this.A >= df.x.length) {
                this.A = 0;
            }
            this.z = dd.i.b(df.x[this.A], main.a.A - 40);
        }
    }

    public final void b(int n2) {
        if (this.c.e) {
            this.c.a(n2);
        } else if (this.d.e) {
            this.d.a(n2);
        } else if (this.t && this.e.e) {
            this.e.a(n2);
        } else if (this.t && this.f.e) {
            this.f.a(n2);
        }
        super.b(n2);
    }

    public final void e() {
        super.e();
    }

    public final void a(t t2) {
        block22: {
            int n2;
            block20: {
                block21: {
                    t2.a(0);
                    t2.c(0, 0, main.a.A, main.a.B);
                    main.a.a(t2);
                    n2 = this.c.b - 45;
                    if (main.a.B <= 220) {
                        n2 += 5;
                    }
                    if (main.a.J != null) break block20;
                    if (this.t) {
                        ay.a(main.a.C - 85, this.c.b - 15, 170, 150, t2);
                    } else {
                        ay.a(main.a.C - 85, this.c.b - 15, 170, 90, t2);
                    }
                    if (main.a.B > 160 && a != null) {
                        t2.a(a, main.a.C, n2 - 2, 3);
                    }
                    this.c.a(t2);
                    this.d.a(t2);
                    if (this.t) {
                        this.e.a(t2);
                        this.f.a(t2);
                    }
                    t2.d(0, 0, main.a.A, main.a.B);
                    n2 = 0;
                    if (main.a.A <= 200) break block21;
                    if (this.c.d().equals("")) {
                        if (!this.c.e) {
                            dd.e.a(t2, df.ay, this.c.a + 5, this.c.b + 7, 0);
                        } else {
                            dd.k.a(t2, df.ay, this.c.a + 5, this.c.b + 7, 0);
                        }
                    }
                    if (this.d.d().equals("")) {
                        if (!this.d.e) {
                            dd.e.a(t2, df.az, this.d.a + 5, this.d.b + 7, 0);
                        } else {
                            dd.k.a(t2, df.az, this.d.a + 5, this.d.b + 7, 0);
                        }
                    }
                    if (!this.t) break block22;
                    if (this.e.d().equals("")) {
                        if (!this.e.e) {
                            dd.e.a(t2, df.aA, this.e.a + 5, this.e.b + 7, 0);
                            dd.e.a(t2, df.az, this.e.a + 50, this.e.b + 7, 0);
                        } else {
                            dd.k.a(t2, df.aA, this.e.a + 5, this.e.b + 7, 0);
                            dd.k.a(t2, df.az, this.e.a + 50, this.e.b + 7, 0);
                        }
                    }
                    if (!this.f.d().equals("")) break block22;
                    if (!this.f.e) {
                        dd.e.a(t2, "Email/s\u1ed1 di \u0111\u1ed9ng", this.f.a + 5, this.f.b + 5, 0);
                    } else {
                        dd.k.a(t2, "Email/s\u1ed1 di \u0111\u1ed9ng", this.f.a + 5, this.f.b + 5, 0);
                    }
                    break block22;
                }
                if (this.c.d().equals("")) {
                    dd.e.a(t2, df.aB, this.c.a - 35, this.c.b + 7, 0);
                }
                if (this.d.d().equals("")) {
                    dd.e.a(t2, df.aC, this.d.a - 35, this.d.b + 7, 0);
                }
                if (!this.t) break block22;
                dd.e.a(t2, df.aD, this.e.a - 35, this.e.b - 1, 0);
                dd.e.a(t2, df.aC, this.e.a - 35, this.e.b + 13, 0);
                dd.e.a(t2, "Email/s\u1ed1 di \u0111\u1ed9ng", this.f.a - 35, this.f.b + 5, 0);
                break block22;
            }
            if (this.z != null) {
                n2 = 0;
                while (n2 < this.z.length) {
                    dd.i.a(t2, this.z[n2], main.a.A / 2, this.c.b - 15 + n2 * 10, 2, dd.k);
                    ++n2;
                }
            }
        }
        String string = "2.1.7";
        dd.k.a(t2, string, main.a.A - 5, 5, 1);
        super.a(t2);
    }

    public final void d() {
        if (main.a.n[2]) {
            --this.h;
            if (this.h < 0) {
                this.h = 3;
            }
        } else if (main.a.n[8]) {
            ++this.h;
            if (this.h > 3) {
                this.h = 0;
            }
        }
        if (main.a.n[2] || main.a.n[8]) {
            main.a.h();
            if (this.h == 1) {
                this.c.e = false;
                this.d.e = true;
                this.e.e = false;
                this.f.e = false;
                this.m = this.d.l;
            } else if (this.h == 0) {
                this.c.e = true;
                this.d.e = false;
                this.e.e = false;
                this.f.e = false;
                this.m = this.c.l;
            } else {
                this.c.e = false;
                this.d.e = false;
                if (this.t) {
                    if (this.h == 2) {
                        this.e.e = true;
                        this.f.e = false;
                        this.m = this.e.l;
                    } else if (this.h == 3) {
                        this.f.e = true;
                        this.e.e = false;
                        this.m = this.f.l;
                    }
                }
            }
        }
        if (main.a.r) {
            if (main.a.b(this.c.a, this.c.b, this.c.c, this.c.d)) {
                this.h = 0;
            } else if (main.a.b(this.d.a, this.d.b, this.d.c, this.d.d)) {
                this.h = 1;
            } else {
                if (this.t) {
                    if (main.a.b(this.e.a, this.e.b, this.e.c, this.e.d)) {
                        this.h = 2;
                    } else if (main.a.b(this.f.a, this.f.b, this.f.c, this.f.d)) {
                        this.h = 3;
                    }
                } else if (main.a.b(this.c.a - 20, main.a.D + 40, 80, 20)) {
                    this.s = !this.s;
                }
                this.h = 2;
            }
        }
        super.d();
        main.a.h();
    }

    public final void a(int n2, Object object) {
        block1 : switch (n2) {
            case 1002: {
                v0.t = true;
                object2.e.e = false;
                object2.f.e = false;
                object2.d.e = false;
                object2.c.e = true;
                object2.m = object2.c.l;
                object2.k = new bd(df.bd, (cs)object2, 10021, null);
                return;
            }
            case 10021: {
                v1.t = false;
                object2.e.e = false;
                object2.d.e = false;
                object2.c.e = true;
                object2.m = object2.c.l;
                object2.k = object2.x;
                return;
            }
            case 1003: {
                try {
                    GameMidlet.g.platformRequest("http://ninjaschool.vn");
                    return;
                }
                catch (ConnectionNotFoundException connectionNotFoundException) {
                    Object object2 = connectionNotFoundException;
                    connectionNotFoundException.printStackTrace();
                    return;
                }
            }
            case 1004: {
                aa aa2 = new aa();
                int n3 = w.c("lowGraphic");
                if (!main.a.g) {
                    if (n3 == 1) {
                        aa2.addElement(new bd(df.aK, (cs)object2, 10041, null));
                    } else {
                        aa2.addElement(new bd(df.aL, (cs)object2, 10042, null));
                    }
                }
                aa2.addElement(new bd(df.D, (cs)object2, 1006, null));
                if (main.a.E == object2) {
                    aa2.addElement(new bd(df.E, (cs)object2, 1009, null));
                }
                main.a.F.a(aa2);
                return;
            }
            case 10041: {
                w.a("lowGraphic", 0);
                main.a.a(df.aE, 8885, null);
                return;
            }
            case 10042: {
                w.a("lowGraphic", 1);
                main.a.a(df.aE, 8885, null);
                return;
            }
            case 1005: {
                main.a.a(df.aT, new bd("3G/Wifi", (cs)object2, 3000, null), new bd("GPRS", (cs)object2, 3001, null));
                return;
            }
            case 1006: {
                main.a.a(df.G, new bd(df.bc, (cs)object2, 10061, null), new bd(df.au, main.a.a(), 8882, null));
                return;
            }
            case 10061: {
                main.a.j();
                l.a(-1);
                GameMidlet.g.notifyDestroyed();
                return;
            }
            case 1009: {
                w.a();
                return;
            }
            case 2000: {
                if (!object2.c.d().equals("") && !object2.d.d().equals("")) {
                    co.c = object2.c.d();
                    co.d = object2.d.d();
                }
                main.a.G.a();
                return;
            }
            case 2001: {
                if (object2.s) {
                    object2.s = false;
                    return;
                }
                object2.s = true;
                return;
            }
            case 2002: {
                if (object2.c.d().equals("")) {
                    main.a.a(df.aM);
                    break;
                }
                char[] cArray = object2.c.d().toCharArray();
                int n4 = 0;
                while (n4 < cArray.length) {
                    if (!ad.a(cArray[n4])) {
                        main.a.a(df.aN);
                        break block1;
                    }
                    ++n4;
                }
                if (object2.d.d().equals("")) {
                    main.a.a(df.aO);
                    break;
                }
                if (object2.e.d().equals("")) {
                    main.a.a(df.aP);
                    break;
                }
                object2.e.d().equals("");
                if (object2.c.d().length() < 5) {
                    main.a.a(df.aQ);
                    break;
                }
                if (!object2.d.d().equals(object2.e.d())) {
                    main.a.a(df.aR);
                    break;
                }
                if (object2.f.d().equals("")) {
                    main.a.a("B\u1ea1n ch\u01b0a nh\u1eadp Email/s\u1ed1 di \u0111\u1ed9ng, Email/s\u1ed1 di \u0111\u1ed9ng gi\u00fap b\u1ea1n l\u1ea5y l\u1ea1i m\u1eadt kh\u1ea9u khi m\u1ea5t m\u1eadt kh\u1ea9u", new bd(df.Y, (cs)object2, 4001, null), new bd(df.au, main.a.k, 8882, null));
                    break;
                }
                main.a.K.a(String.valueOf(df.aS[0]) + " " + object2.c.d() + ", " + df.aS[1], new bd(df.bc, (cs)object2, 4000, null), null, new bd(df.au, main.a.k, 8882, null));
                main.a.J = main.a.K;
                return;
            }
            case 2003: {
                GameMidlet.a("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
                return;
            }
            case 2004: {
                main.a.L.a(df.ez, new bd(df.ax, (cs)object2, 20041, null), 0);
                return;
            }
            case 2005: {
                main.a.a("B\u1ea1n c\u00f3 mu\u1ed1n reset m\u1eadt kh\u1ea9u kh\u00f4ng?", new bd(df.ax, (cs)object2, 20052, null), new bd(df.au, main.a.k, 8882, null));
                return;
            }
            case 20051: {
                dg.n().a();
                return;
            }
            case 20052: {
                GameMidlet.a("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
                return;
            }
            case 20041: {
                object2.F = main.a.L.d.d().toString();
                main.a.j();
                if (object2.F.equals("")) {
                    main.a.a(df.aM);
                    return;
                }
                main.a.a(df.aU, new bd(df.ah, (cs)object2, 200421, null), new bd(df.au, (cs)object2, 200422, null));
                return;
            }
            case 200421: {
                main.a.j();
                String string = object2.F;
                GameMidlet.d = GameMidlet.m[GameMidlet.e()];
                main.a.b(df.bj);
                main.a.a(1);
                main.a.b(df.y);
                dq.a().a(string);
                return;
            }
            case 200422: {
                main.a.a(df.a(df.ha, object2.F));
                return;
            }
            case 3000: {
                dc.b(false);
                main.a.j();
                return;
            }
            case 3001: {
                dc.b(true);
                main.a.j();
                return;
            }
            case 4000: {
                object2.a(object2.c.d());
                return;
            }
            case 4001: {
                object2.a(object2.c.d());
            }
        }
    }
}

