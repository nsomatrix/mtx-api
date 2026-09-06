/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.microedition.lcdui.Image;

public final class by {
    public int a;
    public bz b;
    public aa c;
    public int d;
    private int t;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    private int u;
    public int n;
    public int o;
    public boolean p;
    public g q;
    public int r;
    public Image s;

    public final by a() {
        by by2 = new by();
        new by().b = this.b;
        if (this.c != null) {
            by2.c = new aa();
            int n2 = 0;
            while (n2 < this.c.size()) {
                cg cg2 = new cg();
                new cg().c = ((cg)this.c.elementAt((int)n2)).c;
                cg2.a = ((cg)this.c.elementAt((int)n2)).a;
                by2.c.addElement(cg2);
                ++n2;
            }
        }
        by2.d = this.d;
        by2.t = this.t;
        by2.e = this.e;
        by2.f = this.f;
        by2.g = this.g;
        by2.h = this.h;
        by2.i = this.i;
        by2.j = this.j;
        by2.k = this.k;
        by2.l = this.l;
        by2.m = this.m;
        by2.u = this.u;
        by2.n = this.n;
        by2.o = this.o;
        by2.p = this.p;
        return by2;
    }

    public final by a(int n2) {
        by by2 = by2.a();
        v0.h = true;
        int n3 = n2 - by2.j;
        if (n3 == 0) {
            return by2;
        }
        by2.j = n2;
        if (by2.c != null) {
            n2 = 0;
            while (n2 < by2.c.size()) {
                cg cg2 = (cg)by2.c.elementAt(n2);
                if (cg2.c.a == 6 || cg2.c.a == 7) {
                    cg2.a += n3 * 15;
                } else if (cg2.c.a == 8 || cg2.c.a == 9 || cg2.c.a == 19) {
                    cg2.a += n3 * 10;
                } else if (cg2.c.a == 10 || cg2.c.a == 11 || cg2.c.a == 12 || cg2.c.a == 13 || cg2.c.a == 14 || cg2.c.a == 15 || cg2.c.a == 17 || cg2.c.a == 18 || cg2.c.a == 20) {
                    cg2.a += n3 * 5;
                } else if (cg2.c.a == 21 || cg2.c.a == 22 || cg2.c.a == 23 || cg2.c.a == 24 || cg2.c.a == 25 || cg2.c.a == 26) {
                    cg2.a += n3 * 150;
                } else if (cg2.c.a == 16) {
                    cg2.a += n3 * 3;
                }
                ++n2;
            }
        }
        return by2;
    }

    public final boolean b() {
        return this.b.b >= 0 && this.b.b <= 15;
    }

    public final boolean c() {
        return 29 <= this.b.b && this.b.b <= 33;
    }

    public final boolean d() {
        return this.b.b == 34;
    }

    public final String e() {
        if (this.g <= 0L) {
            return df.bK;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        calendar.setTime(new Date(this.g));
        int n2 = calendar.get(11);
        int n3 = calendar.get(12);
        int n4 = calendar.get(5);
        int n5 = calendar.get(2) + 1;
        int n6 = calendar.get(1);
        return String.valueOf(n4) + "/" + n5 + "/" + n6 + " " + n2 + "h" + n3 + "'";
    }

    public final String f() {
        if (this.g <= 0L) {
            return df.bK;
        }
        if (this.g / 1000L >= 2592000L) {
            return String.valueOf(this.g / 1000L / 2592000L) + " " + df.eU;
        }
        if (this.g / 1000L >= 604800L) {
            return String.valueOf(this.g / 1000L / 604800L) + " " + df.eV;
        }
        if (this.g / 1000L >= 86400L) {
            return String.valueOf(this.g / 1000L / 86400L) + " " + df.eW;
        }
        if (this.g / 1000L >= 3600L) {
            return String.valueOf(this.g / 1000L / 3600L) + " " + df.eX;
        }
        if (this.g / 1000L >= 60L) {
            return String.valueOf(this.g / 1000L / 60L) + " " + df.eZ;
        }
        return "";
    }

    public final void g() {
        if (!this.c()) {
            this.g = 0L;
        }
    }

    public final boolean h() {
        return this.o == 5 || this.o == 3 || this.o == 4 || this.o == 39;
    }

    public final boolean i() {
        if (this.j()) {
            return true;
        }
        return this.l() || this.m() || this.n() || this.o();
    }

    public final boolean j() {
        return this.o == 20 || this.o == 21 || this.o == 22 || this.o == 23 || this.o == 24 || this.o == 25 || this.o == 26 || this.o == 27 || this.o == 28 || this.o == 29 || this.o == 16 || this.o == 17 || this.o == 18 || this.o == 19 || this.o == 2 || this.o == 6 || this.o == 8 || this.o == 34;
    }

    public final boolean k() {
        return this.o == 7 || this.o == 9;
    }

    public final boolean l() {
        return this.o == 14;
    }

    public final boolean m() {
        return this.o == 15;
    }

    public final boolean n() {
        return this.o == 32;
    }

    public final boolean o() {
        return this.o == 34;
    }

    public final boolean p() {
        return this.q() == this.j;
    }

    public final int q() {
        if (this.b.f >= 1 && this.b.f < 20) {
            return 4;
        }
        if (this.b.f >= 20 && this.b.f < 40) {
            return 8;
        }
        if (this.b.f >= 40 && this.b.f < 50) {
            return 12;
        }
        if (this.b.f >= 50 && this.b.f < 60) {
            return 14;
        }
        return 16;
    }

    public final boolean r() {
        return this.b.b == 0 || this.b.b == 2 || this.b.b == 4 || this.b.b == 6 || this.b.b == 8;
    }

    public final boolean s() {
        return this.b.b == 3 || this.b.b == 5 || this.b.b == 7 || this.b.b == 9;
    }

    public final boolean t() {
        return this.b.b == 1;
    }

    public final boolean u() {
        if (this.c != null) {
            int n2 = 0;
            while (n2 < this.c.size()) {
                cg cg2 = (cg)this.c.elementAt(n2);
                if (cg2.c.a == 155) {
                    return true;
                }
                ++n2;
            }
        }
        return false;
    }
}

