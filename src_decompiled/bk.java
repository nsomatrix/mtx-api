/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private bp h;
    private int[] i;
    private int[] j;
    private int[] k;

    public bk(int n2, int n3, bp bp2) {
        this.a = n2;
        this.b = n3;
        this.c = n2;
        this.d = n3 - (am.d(40) + 20);
        this.e = 1;
        this.g = 1;
        this.h = bp2;
    }

    public bk(int n2, int n3) {
        this.e = 1;
        this.g = 2;
        this.c = n2;
        this.d = n3;
        this.i = new int[5];
        this.j = new int[5];
        this.k = new int[5];
        this.f = 300;
        int n4 = 0;
        while (n4 < this.i.length) {
            this.i[n4] = am.d(n2 - 20, n2 + 20);
            this.j[n4] = n3 - 10;
            this.k[n4] = n4 % 2 == 0 ? 1 : -1;
            ++n4;
        }
    }

    public final void a() {
        if (this.g == 1) {
            if (this.h == null) {
                dg.E.removeElement(this);
                return;
            }
            if (this.e == 1) {
                if (this.b > this.d) {
                    this.b -= 2;
                    this.a += 1 - main.a.w % 3;
                } else {
                    this.e = 2;
                }
                this.f = 100;
                return;
            }
            --this.f;
            if (am.e(this.h.i - this.a) < 50 || am.e(this.h.j - this.b) < 50) {
                this.a += (this.h.i - this.a) / 4;
                this.b += (this.h.j - this.b) / 4;
            } else {
                this.a += (this.h.i - this.a) / 10;
                this.b += (this.h.j - this.b) / 10;
            }
            if (this.f < 0) {
                this.a = this.h.i;
                this.b = this.h.j - this.h.ag / 2;
                if (this.f < -5) {
                    dg.E.removeElement(this);
                    return;
                }
            } else if (am.e(this.h.i - this.a) < 10 && am.e(this.h.j - this.b) < 10) {
                dg.E.removeElement(this);
                return;
            }
        } else if (this.g == 2) {
            int n2 = 0;
            while (n2 < this.i.length) {
                int n3 = n2;
                this.j[n3] = this.j[n3] - main.a.w % 5;
                if (this.k[n2] == -1) {
                    int n4 = n2;
                    this.i[n4] = this.i[n4] - 1;
                } else {
                    int n5 = n2;
                    this.i[n5] = this.i[n5] + 1;
                }
                if (this.i[n2] <= this.c - 20 || this.i[n2] >= this.c + 20) {
                    this.k[n2] = -this.k[n2];
                }
                if (this.j[n2] < 0) {
                    dg.E.removeElement(this);
                }
                ++n2;
            }
        }
    }

    public final void a(t t2) {
        if (this.g == 1) {
            if (main.a.w % 5 > 2) {
                ab.a(t2, 1433, this.a, this.b, 0, 3);
                return;
            }
            ab.a(t2, 1434, this.a, this.b, 0, 3);
            return;
        }
        int n2 = 0;
        while (n2 < this.i.length) {
            if (main.a.w % 5 > 2) {
                ab.a(t2, 1433, this.i[n2], this.j[n2], 0, 3);
            } else {
                ab.a(t2, 1434, this.i[n2], this.j[n2], 0, 3);
            }
            ++n2;
        }
    }
}

