/*
 * Decompiled with CFR 0.152.
 */
public final class bt {
    public int a;
    public int b;
    public int c = 0;
    public byte d = 0;
    public int e;
    public static ci f;

    public final boolean a() {
        if (this.a < dg.i) {
            return false;
        }
        if (this.a > dg.i + dg.b) {
            return false;
        }
        if (this.b < dg.j) {
            return false;
        }
        if (this.b > dg.j + dg.c + 30) {
            return false;
        }
        return f == null || bt.f.h != 8;
    }

    public bt(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        int n4 = 0;
        while (n4 < dg.Q.size()) {
            ci ci2 = (ci)dg.Q.elementAt(n4);
            if (ci2.s == 202) {
                f = ci2;
            }
            ++n4;
        }
    }
}

