/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bw {
    private int i;
    private int j;
    public int a;
    public int b;
    private int k;
    private int l;
    private int m;
    private int n;
    public int c;
    public int d;
    public int e;
    public int f;
    private int o;
    private int p;
    public static bw g;
    private int q;
    private int r;
    private int[] s = new int[3];
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    public int h;
    private int x;
    private boolean y = true;

    public final void a() {
        this.i = 0;
        this.j = 0;
        this.a = 0;
        this.b = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.e = 0;
        this.f = 0;
    }

    public final void a(t t2, int n2, int n3, int n4, int n5) {
        t2.d(n2, n3, n4, n5 - 1);
        t2.a(-t2.a(), -t2.b());
        t2.a(-this.a, -this.b);
    }

    public final void a(t t2) {
        t2.d(this.c, this.d, this.e, this.f - 1);
        t2.a(-t2.a(), -t2.b());
        t2.a(-this.a, -this.b);
    }

    public final cn b() {
        if (this.y) {
            int n2 = this.c;
            int n3 = this.d;
            int n4 = this.e;
            int n5 = this.f;
            if (main.a.p) {
                if (!this.t && main.a.c(n2, n3, n4, n5)) {
                    n4 = 0;
                    while (n4 < this.s.length) {
                        this.s[0] = main.a.t;
                        ++n4;
                    }
                    this.r = main.a.t;
                    this.t = true;
                    this.w = -1;
                    this.u = this.v != 0;
                    this.v = 0;
                } else if (this.t) {
                    ++this.q;
                    if (this.q > 5 && this.r == main.a.t && !this.u) {
                        this.r = -1000;
                        if (this.x > 1) {
                            n4 = (this.j + main.a.t - n3) / this.h;
                            n5 = (this.i + main.a.s - n2) / this.h;
                            this.w = n4 * this.x + n5;
                        } else {
                            this.w = (this.j + main.a.t - n3) / this.h;
                        }
                    }
                    if ((n4 = main.a.t - this.s[0]) != 0 && this.w != -1) {
                        this.w = -1;
                    }
                    n5 = this.s.length - 1;
                    while (n5 > 0) {
                        this.s[n5] = this.s[n5 - 1];
                        --n5;
                    }
                    this.s[0] = main.a.t;
                    this.j -= n4;
                    if (this.j < 0) {
                        this.j = 0;
                    }
                    if (this.j > this.p) {
                        this.j = this.p;
                    }
                    if (this.b < 0 || this.b > this.p) {
                        n4 /= 2;
                    }
                    this.b -= n4;
                }
            }
            n4 = 0;
            if (main.a.r && this.t) {
                n5 = main.a.t - this.s[0];
                main.a.r = false;
                if (am.e(n5) < 20 && am.e(main.a.t - this.r) < 20 && !this.u) {
                    this.v = 0;
                    this.j = this.b;
                    this.r = -1000;
                    if (this.x > 1) {
                        n3 = (this.j + main.a.t - n3) / this.h;
                        n2 = (this.i + main.a.s - n2) / this.h;
                        this.w = n3 * this.x + n2;
                    } else {
                        this.w = (this.j + main.a.t - n3) / this.h;
                    }
                    this.q = 0;
                    n4 = 1;
                } else if (this.w != -1 && this.q > 5) {
                    this.q = 0;
                    n4 = 1;
                } else if (this.w == -1 && !this.u) {
                    if (this.b < 0) {
                        this.j = 0;
                    } else if (this.b > this.p) {
                        this.j = this.p;
                    } else {
                        n3 = main.a.t - this.s[0] + (this.s[0] - this.s[1]) + (this.s[1] - this.s[2]);
                        n3 = n3 > 10 ? 10 : (n3 < -10 ? -10 : 0);
                        this.v = -n3 * 100;
                    }
                }
                this.t = false;
                this.q = 0;
                main.a.r = false;
            }
            cn cn2 = new cn();
            new cn().b = this.w;
            cn2.c = n4;
            cn2.a = this.t;
            return cn2;
        }
        int n6 = this.c;
        int n7 = this.d;
        int n8 = this.e;
        int n9 = this.f;
        if (main.a.p) {
            if (!this.t && main.a.c(n6, n7, n8, n9)) {
                n8 = 0;
                while (n8 < this.s.length) {
                    this.s[0] = main.a.s;
                    ++n8;
                }
                this.r = main.a.s;
                this.t = true;
                this.w = -1;
                this.u = this.v != 0;
                this.v = 0;
            } else if (this.t) {
                ++this.q;
                if (this.q > 5 && this.r == main.a.s && !this.u) {
                    this.r = -1000;
                    this.w = (this.i + main.a.s - n6) / this.h;
                }
                if ((n8 = main.a.s - this.s[0]) != 0 && this.w != -1) {
                    this.w = -1;
                }
                n9 = this.s.length - 1;
                while (n9 > 0) {
                    this.s[n9] = this.s[n9 - 1];
                    --n9;
                }
                this.s[0] = main.a.s;
                this.i -= n8;
                if (this.i < 0) {
                    this.i = 0;
                }
                if (this.i > this.o) {
                    this.i = this.o;
                }
                if (this.a < 0 || this.a > this.o) {
                    n8 /= 2;
                }
                this.a -= n8;
            }
        }
        n8 = 0;
        if (main.a.r && this.t) {
            n9 = main.a.s - this.s[0];
            main.a.r = false;
            if (am.e(n9) < 20 && am.e(main.a.s - this.r) < 20 && !this.u) {
                this.v = 0;
                this.i = this.a;
                this.r = -1000;
                this.w = (this.i + main.a.s - n6) / this.h;
                this.q = 0;
                n8 = 1;
            } else if (this.w != -1 && this.q > 5) {
                this.q = 0;
                n8 = 1;
            } else if (this.w == -1 && !this.u) {
                if (this.a < 0) {
                    this.i = 0;
                } else if (this.a > this.o) {
                    this.i = this.o;
                } else {
                    n7 = main.a.s - this.s[0] + (this.s[0] - this.s[1]) + (this.s[1] - this.s[2]);
                    n7 = n7 > 10 ? 10 : (n7 < -10 ? -10 : 0);
                    this.v = -n7 * 100;
                }
            }
            this.t = false;
            this.q = 0;
            main.a.r = false;
        }
        cn cn3 = new cn();
        new cn().b = this.w;
        cn3.c = n8;
        cn3.a = this.t;
        return cn3;
    }

    public final void c() {
        if (this.v != 0 && !this.t) {
            if (this.y) {
                this.j += this.v / 100;
                if (this.j < 0) {
                    this.j = 0;
                } else if (this.j > this.p) {
                    this.j = this.p;
                } else {
                    this.b = this.j;
                }
            } else {
                this.i += this.v / 100;
                if (this.i < 0) {
                    this.i = 0;
                } else if (this.i > this.o) {
                    this.i = this.o;
                } else {
                    this.a = this.i;
                }
            }
            this.v = this.v * 9 / 10;
            if (this.v < 100 && this.v > -100) {
                this.v = 0;
            }
        }
        if (this.a != this.i && !this.t) {
            this.k = this.i - this.a << 2;
            this.m += this.k;
            this.a += this.m >> 4;
            this.m &= 0xF;
        }
        if (this.b != this.j && !this.t) {
            this.l = this.j - this.b << 2;
            this.n += this.l;
            this.b += this.n >> 4;
            this.n &= 0xF;
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, int n8) {
        this.c = n4;
        this.d = n5;
        this.h = n3;
        this.e = n6;
        this.f = n7;
        this.y = bl2;
        this.x = n8;
        if (bl2) {
            this.p = n2 * n3 - n7;
        } else {
            this.o = n2 * n3 - n6;
        }
        if (this.p < 0) {
            this.p = 0;
        }
        if (this.o < 0) {
            this.o = 0;
        }
    }

    public final void a(int n2) {
        if (this.y) {
            this.j = n2 -= (this.f - this.h) / 2;
            if (this.j < 0) {
                this.j = 0;
            }
            if (this.j > this.p) {
                this.j = this.p;
                return;
            }
        } else {
            this.i = n2 -= (this.e - this.h) / 2;
            if (this.i < 0) {
                this.i = 0;
            }
            if (this.i > this.o) {
                this.i = this.o;
            }
        }
    }
}

