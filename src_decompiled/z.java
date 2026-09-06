/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class z {
    public j a;
    public short b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public cr[] k;
    public boolean l = false;

    public final void a(int n2, int n3, t t2) {
        ab.a(t2, this.a.e, n2, n3, 0, ch.g);
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.f;
        if (l3 < (long)this.e) {
            t2.a(0x333333);
            if (this.l && main.a.w % 6 > 2) {
                t2.a(0x444444);
            }
            int n4 = (int)(l3 * 18L / (long)this.e);
            t2.c(n2 - 9, n3 - 9 + n4, 18, 18 - n4);
            return;
        }
        this.l = false;
    }

    public final boolean a() {
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.f;
        return l3 < (long)this.e;
    }
}

