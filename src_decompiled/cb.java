/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cb
extends au
implements cs {
    private int g = 100;
    private int h;
    private int i;
    private String[] j;
    private int k;
    private int l;
    private int m;
    private bp n;
    private boolean o = false;
    private int p;
    private String[] q;
    public bd e;
    public static cb f;

    public static void a(String stringArray, int n2, bp bp2) {
        if ((stringArray = am.a((String)stringArray, "\n", 0)).length == 1) {
            cb.b(stringArray[0], 1000, bp2);
            return;
        }
        f = cb.b(stringArray[0], 1000, bp2);
        cb.b(stringArray[0], 1000, bp2).p = 0;
        cb.f.q = stringArray;
        cb.f.e = new bd(df.ab, f, 8000, null);
    }

    public static cb b(String string, int n2, bp bp2) {
        cb cb2 = new cb();
        if (string.length() < 10) {
            cb2.g = 64;
        }
        if (main.a.A == 128) {
            cb2.g = 128;
        }
        cb2.j = dd.l.b(string, cb2.g - 10);
        cb2.h = n2;
        cb2.n = bp2;
        cb2.k = bp2.i;
        cb2.l = bp2.j;
        bp2.f = cb2;
        cb2.i = 7;
        au.a.addElement(cb2);
        return cb2;
    }

    public final void a() {
        if (this.n != null) {
            this.k = this.n.i;
            this.l = this.n.j;
            this.m = this.n.ag + 10;
        }
        if (this.h > 0) {
            --this.h;
        }
        if (this.i > 1) {
            --this.i;
        }
        if (this.n != null && this.n.f != null && this.n.f != this || this.n != null && this.n.f == null || this.h == 0) {
            au.c.removeElement(this);
            au.a.removeElement(this);
        }
    }

    public final void a(t t2) {
        int n2 = this.k;
        int n3 = this.l;
        t2.a(0xFFFFFF);
        t2.b(n2 - this.g / 2 - 1, n3 - this.m - 15 + this.i - this.j.length * 12 - 10, this.g + 2, (this.j.length + 1) * 12 + 1, 12, 12);
        t2.a(0);
        t2.a(n2 - this.g / 2 - 1, n3 - this.m - 15 + this.i - this.j.length * 12 - 10, this.g + 1, (this.j.length + 1) * 12, 12, 12);
        ab.a(t2, 941, n2 - 3, n3 - this.m - 15 + this.i + 2, 0, 17);
        int n4 = 0;
        while (n4 < this.j.length) {
            dd.g.a(t2, this.j[n4], n2, n3 - this.m - 15 + this.i + n4 * 12 - this.j.length * 12 - 4, 2);
            ++n4;
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 8000) {
            int n3 = cb.f.p;
            if (++n3 >= cb.f.q.length) {
                cb.f.n.f = null;
                f = null;
                return;
            }
            cb cb2 = cb.b(cb.f.q[n3], cb.f.h, cb.f.n);
            cb.b(cb.f.q[n3], cb.f.h, cb.f.n).p = n3;
            cb2.q = cb.f.q;
            cb2.e = cb.f.e;
            f = cb2;
        }
    }
}

