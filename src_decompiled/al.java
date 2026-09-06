/*
 * Decompiled with CFR 0.152.
 */
public final class al {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private static int[] j;

    static {
        int[] nArray = new int[]{10, 5, 11};
        int[] nArray2 = new int[]{10, 5, 11};
        j = new int[]{4, 1, 4};
    }

    public final void a() {
        if (this.i > 0 && this.i < 4) {
            this.a += this.c;
            this.b += this.d;
            this.d += 2;
            if (this.c < -2) {
                ++this.c;
            }
            if (this.c > 2) {
                --this.c;
            }
            if (this.d == 6) {
                this.i = this.i == 2 ? 0 : 4;
                this.h = 11;
                this.c = am.b(am.a(this.f - this.a, this.g - this.b), this.h);
                this.d = am.c(am.a(this.f - this.a, this.g - this.b), this.h);
            }
            return;
        }
        bp bp2 = null;
        bp2 = (bp)dg.M.elementAt(0);
        this.f = bp2.i;
        this.g = bp2.j - bp2.ai;
        this.a += this.c;
        this.b += this.d;
        ++this.h;
        this.c = am.b(am.a(this.f - this.a, this.g - this.b), this.h);
        this.d = am.c(am.a(this.f - this.a, this.g - this.b), this.h);
        ++this.e;
        if (this.e == j[0]) {
            this.e = 0;
        }
        if (this.a >= this.f + bp2.ah || this.a <= this.f - bp2.ah || this.b >= this.g + bp2.ai || this.b <= this.g - bp2.ai) {
            return;
        }
        dg.O.removeElement(this);
    }
}

