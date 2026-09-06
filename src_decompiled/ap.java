/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class ap
extends au {
    private g e;
    private int f;
    private int g;
    private int h;
    private int i = 1;
    private bp j;
    private short k = 0;
    private long l = 0L;

    public static void a(int n2, int n3, int n4, int n5) {
        ap ap2 = new ap();
        new ap().e = dg.D[n2];
        ap2.g = n3;
        ap2.h = n4;
        ap2.k = (short)n5;
        au.a.addElement(ap2);
    }

    public static void a(int n2, int n3, int n4, int n5, byte by2) {
        ap ap2 = new ap();
        new ap().e = dg.D[n2];
        ap2.g = n3;
        ap2.h = n4;
        ap2.k = (short)n5;
        ap2.i = by2;
        au.a.addElement(ap2);
    }

    public static void a(int n2, bp bp2, int n3) {
        ap ap2 = new ap();
        new ap().e = dg.D[n2];
        ap2.j = bp2;
        ap2.k = (short)n3;
        au.a.addElement(ap2);
    }

    public static void b(int n2, bp bp2, int n3) {
        ap ap2 = new ap();
        new ap().e = dg.D[n2];
        ap2.j = bp2;
        ap2.l = System.currentTimeMillis() + (long)(n3 * 1000);
        au.a.addElement(ap2);
    }

    public final void a(t t2) {
        int n2;
        int n3;
        if (this.j != null) {
            this.g = this.j.i;
            this.h = this.j.j;
        }
        if (main.a.e(n3 = this.g + this.e.b[this.f].a * this.i, n2 = this.h + this.e.b[this.f].b)) {
            ab.a(t2, this.e.b[this.f].c, n3, n2, this.i == 1 ? 0 : 2, 3);
        }
    }

    public final void a() {
        if (this.l != 0L) {
            ++this.f;
            if (this.f >= this.e.b.length) {
                this.f = 0;
            }
            if (System.currentTimeMillis() - this.l > 0L) {
                if (this.e.a == 120) {
                    main.a.e = false;
                }
                au.a.removeElement(this);
            }
        } else {
            ++this.f;
            if (this.f >= this.e.b.length) {
                this.k = (short)(this.k - 1);
                if (this.k <= 0) {
                    if (this.e.a == 120) {
                        main.a.e = false;
                    }
                    au.a.removeElement(this);
                } else {
                    this.f = 0;
                }
            }
        }
        if (main.a.w % 11 == 0 && this.j != null && this.j != bp.d() && !dg.M.contains(this.j)) {
            au.a.removeElement(this);
        }
    }
}

