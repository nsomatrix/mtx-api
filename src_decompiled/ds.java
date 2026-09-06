/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ds
implements cs {
    public boolean a;
    private aa f;
    public int b;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private bd p = new bd(df.bo, 0);
    private bd q = main.a.g ? null : new bd(df.H, 0, main.a.A - 71, main.a.B - ag.p + 1);
    private bd r = null;
    private static Image s;
    private static Image t;
    boolean c;
    public boolean d;
    private int u;
    private int v;
    private int w;
    private int[] x = new int[3];
    private boolean y;
    private boolean z;
    private int A;
    private int B;
    public byte e;
    private int C;
    private int D;

    static {
        s = main.a.c("/hd/btnlBig0.png");
        t = main.a.c("/hd/btnlBig1.png");
    }

    public final void a(aa aa2) {
        this.c = false;
        this.d = false;
        cb.f = null;
        b.b();
        if (aa2.size() == 0) {
            return;
        }
        this.f = aa2;
        this.i = 60;
        this.j = 60;
        int n2 = 0;
        while (n2 < aa2.size()) {
            bd bd2 = (bd)aa2.elementAt(n2);
            int n3 = dd.j.a(bd2.a);
            if (n3 > this.i - 8) {
                bd2.b = dd.j.b(bd2.a, this.i - 8);
            }
            ++n2;
        }
        this.g = (main.a.A - aa2.size() * this.i) / 2;
        if (this.g < 1) {
            this.g = 1;
        }
        this.h = main.a.B - this.j - (ay.f + 1);
        if (main.a.g) {
            this.h -= 3;
        }
        this.k = this.h;
        this.a = true;
        this.b = 0;
        n = this.f.size() * this.i - main.a.A;
        if (n < 0) {
            n = 0;
        }
        l = 0;
        m = 0;
        o = 50;
        this.u = aa2.size() * this.i - 1;
        if (this.u > main.a.A - 2) {
            this.u = main.a.A - 2;
        }
        if (main.a.g) {
            this.b = -1;
        }
    }

    public final void a() {
        Object object;
        if (!this.a) {
            return;
        }
        if (this.e > 0) {
            this.e = (byte)(this.e - 1);
        }
        boolean bl2 = false;
        if (main.a.n[2] || main.a.n[4]) {
            bl2 = true;
            --this.b;
            if (this.b < 0) {
                this.b = this.f.size() - 1;
            }
        } else if (main.a.n[8] || main.a.n[6]) {
            bl2 = true;
            ++this.b;
            if (this.b > this.f.size() - 1) {
                this.b = 0;
            }
        } else if (main.a.n[5]) {
            if (this.r != null) {
                if (this.r.d > 0) {
                    if (this.r.c == dg.n()) {
                        dg.n().b(this.r.d, this.r.k);
                    } else {
                        this.a(this.r.d, this.r.k);
                    }
                }
            } else {
                this.A = 2;
            }
        } else if (main.a.n[12]) {
            if (this.p.d > 0) {
                this.a(this.p.d, this.p.k);
            } else {
                this.A = 2;
            }
        } else if (!this.c && (main.a.n[13] || ag.a(this.q))) {
            object = this;
            this.a = false;
            b.b();
            if (((ds)object).d) {
                dq.a().a((byte)1, bp.d().aU.cm.a, main.a.F.b, 0);
                ((ds)object).d = false;
            }
        }
        this.r = null;
        if (dg.aM && !main.a.g) {
            object = null;
            bd bd2 = null;
            if (this.b != -1) {
                bd2 = (bd)this.f.elementAt(this.b);
                object = bg.d().a(bd2.a);
                if (object != null && ((bq)object).a == 2) {
                    this.r = new bd(df.I, this, 1000, object);
                }
            }
        }
        if (bl2) {
            l = this.b * this.i + this.i - main.a.A / 2;
            if (l > n) {
                l = n;
            }
            if (l < 0) {
                l = 0;
            }
            if (this.b == this.f.size() - 1 || this.b == 0) {
                m = l;
            }
        }
        if (this.e <= 0 && !this.c && main.a.r && !main.a.c(this.g, this.h, this.u, this.j) && !this.y) {
            this.w = 0;
            this.v = 0;
            this.y = false;
            this.a = false;
            main.a.r = false;
            if (this.d) {
                dq.a().a((byte)1, bp.d().aU.cm.a, main.a.F.b, 0);
                this.d = false;
            }
            return;
        }
        if (main.a.p) {
            if (!this.y && main.a.c(this.g, this.h, this.u, this.j)) {
                int n2 = 0;
                while (n2 < this.x.length) {
                    this.x[0] = main.a.s;
                    ++n2;
                }
                this.w = main.a.s;
                this.y = true;
                this.z = this.B != 0;
                this.B = 0;
            } else if (this.y) {
                int n3;
                ++this.v;
                if (this.v > 5 && this.w == main.a.s && !this.z) {
                    this.w = -1000;
                    this.b = (l + main.a.s - this.g) / this.i;
                }
                if ((n3 = main.a.s - this.x[0]) != 0 && this.b != -1) {
                    this.b = -1;
                }
                int n4 = this.x.length - 1;
                while (n4 > 0) {
                    this.x[n4] = this.x[n4 - 1];
                    --n4;
                }
                this.x[0] = main.a.s;
                if ((l -= n3) < 0) {
                    l = 0;
                }
                if (l > n) {
                    l = n;
                }
                if (m < 0 || m > n) {
                    n3 /= 2;
                }
                m -= n3;
            }
        }
        if (main.a.r && this.y) {
            int n5 = main.a.s - this.x[0];
            main.a.r = false;
            if (am.e(n5) < 20 && am.e(main.a.s - this.w) < 20 && !this.z) {
                this.B = 0;
                l = m;
                this.w = -1000;
                this.b = (l + main.a.s - this.g) / this.i;
                this.v = 0;
                this.A = 10;
            } else if (this.b != -1 && this.v > 5) {
                this.v = 0;
                this.A = 1;
            } else if (this.b == -1 && !this.z) {
                if (m < 0) {
                    l = 0;
                } else if (m > n) {
                    l = n;
                } else {
                    int n6 = main.a.s - this.x[0] + (this.x[0] - this.x[1]) + (this.x[1] - this.x[2]);
                    n6 = n6 > 10 ? 10 : (n6 < -10 ? -10 : 0);
                    this.B = -n6 * 100;
                }
            }
            this.y = false;
            this.v = 0;
            main.a.r = false;
        }
        main.a.h();
        main.a.i();
    }

    public final void a(t t2) {
        try {
            t2.a(-t2.a(), -t2.b());
            t2.a(-m, 0);
            if (main.a.g) {
                int n2 = 0;
                while (n2 < this.f.size()) {
                    if (n2 == this.b) {
                        t2.a(t, this.g + n2 * this.i + 1, this.k + 1, 0);
                    } else {
                        t2.a(s, this.g + n2 * this.i + 1, this.k + 1, 0);
                    }
                    String[] stringArray = ((bd)this.f.elementAt((int)n2)).b;
                    if (((bd)this.f.elementAt((int)n2)).b == null) {
                        stringArray = new String[]{((bd)this.f.elementAt((int)n2)).a};
                    }
                    int n3 = this.k + (this.j - stringArray.length * 14) / 2 + 1;
                    int n4 = 0;
                    while (n4 < stringArray.length) {
                        if (dg.aM) {
                            if (bg.d().d(stringArray[n4])) {
                                if (main.a.w % 10 > 5) {
                                    dd.l.a(t2, stringArray[n4], this.g + n2 * this.i + this.i / 2 - 2, n3 + n4 * 14, 2);
                                } else {
                                    dd.j.a(t2, stringArray[n4], this.g + n2 * this.i + this.i / 2 - 2, n3 + n4 * 14, 2);
                                }
                            } else {
                                dd.j.a(t2, stringArray[n4], this.g + n2 * this.i + this.i / 2 - 2, n3 + n4 * 14, 2);
                            }
                        } else {
                            dd.j.a(t2, stringArray[n4], this.g + n2 * this.i + this.i / 2 - 2, n3 + n4 * 14, 2);
                        }
                        ++n4;
                    }
                    ++n2;
                }
            } else {
                int n5 = 0;
                while (n5 < this.f.size()) {
                    if (n5 == this.b) {
                        t2.a(t, this.g + n5 * this.i + 1, this.k + 1 - 23, 0);
                    } else {
                        t2.a(s, this.g + n5 * this.i + 1, this.k + 1 - 23, 0);
                    }
                    String[] stringArray = ((bd)this.f.elementAt((int)n5)).b;
                    if (((bd)this.f.elementAt((int)n5)).b == null) {
                        stringArray = new String[]{((bd)this.f.elementAt((int)n5)).a};
                    }
                    int n6 = this.k + (this.j - stringArray.length * 14) / 2 + 1 - 23;
                    int n7 = 0;
                    while (n7 < stringArray.length) {
                        if (dg.aM) {
                            if (bg.d().d(stringArray[n7])) {
                                if (main.a.w % 10 > 5) {
                                    dd.l.a(t2, stringArray[n7], this.g + n5 * this.i + this.i / 2 - 2, n6 + n7 * 14, 2);
                                } else {
                                    dd.j.a(t2, stringArray[n7], this.g + n5 * this.i + this.i / 2 - 2, n6 + n7 * 14, 2);
                                }
                            } else {
                                dd.j.a(t2, stringArray[n7], this.g + n5 * this.i + this.i / 2 - 2, n6 + n7 * 14, 2);
                            }
                        } else {
                            dd.j.a(t2, stringArray[n7], this.g + n5 * this.i + this.i / 2 - 2, n6 + n7 * 14, 2);
                        }
                        ++n7;
                    }
                    ++n5;
                }
            }
            t2.a(-t2.a(), -t2.b());
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void b() {
        Object object = this;
        if (((ds)object).B != 0 && !((ds)object).y) {
            if ((l += ((ds)object).B / 100) < 0) {
                l = 0;
            } else if (l > n) {
                l = n;
            } else {
                m = l;
            }
            ((ds)object).B = ((ds)object).B * 9 / 10;
            if (((ds)object).B < 100 && ((ds)object).B > -100) {
                ((ds)object).B = 0;
            }
        }
        if (m != l && !((ds)object).y) {
            ((ds)object).C = l - m << 2;
            ((ds)object).D += ((ds)object).C;
            m += ((ds)object).D >> 4;
            ((ds)object).D &= 0xF;
        }
        if (this.k > this.h) {
            int n2 = this.k - this.h >> 1;
            if (n2 < 1) {
                n2 = 1;
            }
            this.k -= n2;
        }
        if (o != 0 && (o >>= 1) < 0) {
            o = 0;
        }
        if (this.A > 0) {
            --this.A;
            dg.aM = false;
            if (this.A == 0) {
                this.a = false;
                if (this.b >= 0 && (object = (bd)this.f.elementAt(this.b)) != null) {
                    ((bd)object).a();
                }
            }
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 1000) {
            bq bq2 = (bq)object;
            this.f.removeAllElements();
            bg.d().e(bq2.b);
            bg.d().a.removeElement(bq2);
            int n3 = 0;
            while (n3 < bg.d().a.size()) {
                object = (bq)bg.d().a.elementAt(n3);
                this.f.addElement(new bd(((bq)object).b, null, 12001, new Integer(n3)));
                ++n3;
            }
            this.f.addElement(new bd(df.hq, null, 12006, null));
            this.f.addElement(new bd(df.hr, null, 12008, null));
            n3 = 0;
            while (n3 < this.f.size()) {
                object = (bd)this.f.elementAt(n3);
                int n4 = dd.j.a(((bd)object).a);
                if (n4 > this.i - 8) {
                    ((bd)object).b = dd.j.b(((bd)object).a, this.i - 8);
                }
                ++n3;
            }
            l = this.b * this.i + this.i - main.a.A / 2;
            n = this.f.size() * this.i - main.a.A;
            if (l > n) {
                l = n;
            }
            if (l < 0) {
                l = 0;
            }
            if (this.b == this.f.size() - 1 || this.b == 0) {
                m = l;
            }
        }
    }
}

