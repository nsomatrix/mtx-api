/*
 * Decompiled with CFR 0.152.
 */
public final class v {
    private int b;
    private int c;
    public int a = 0;
    private int d;
    private int e = 0;

    public v(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final void a() {
        if (this.d == 1) {
            ++this.e;
            if (this.e % 2 == 0) {
                ++this.a;
                return;
            }
        } else {
            if (this.d == 0) {
                ++this.a;
                return;
            }
            if (this.d == 2 || this.d == 3 || this.d == 4 || this.d == 5) {
                ++this.e;
                if (this.e % 2 == 0) {
                    ++this.a;
                }
            }
        }
    }

    public final void a(t t2) {
        if (this.d == 0) {
            t2.a(dg.bC, 0, this.a * 3, 3, 3, 0, this.b, this.c, 0);
            return;
        }
        if (this.d == 1) {
            t2.a(dg.bD, 0, this.a * 20, 20, 20, 0, this.b, this.c, 33);
            return;
        }
        if (this.d == 2) {
            t2.a(dg.bW, 0, this.a * 15, 14, 15, 0, this.b + 20, this.c + 4, 20);
            return;
        }
        if (this.d == 3) {
            t2.a(dg.bT, 0, this.a << 3, 8, 8, 0, this.b + 20, this.c + 4, 20);
            return;
        }
        if (this.d == 4) {
            t2.a(dg.bU, 0, this.a << 3, 8, 8, 0, this.b + 20, this.c + 4, 20);
            return;
        }
        if (this.d == 5) {
            t2.a(dg.bV, 0, this.a * 14, 14, 14, 0, this.b + 20, this.c + 4, 20);
        }
    }
}

