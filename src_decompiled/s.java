/*
 * Decompiled with CFR 0.152.
 */
public final class s {
    long a;
    public String b;
    public boolean c;
    public short d;
    public short e;
    private byte f;

    public s(short s2, short s3, long l2, String string, byte by2) {
        this.a = System.currentTimeMillis() + l2 * 1000L;
        this.b = string;
        this.d = s2;
        this.e = s3;
        this.f = by2;
        if (this.f == 0) {
            this.a = l2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(t t2, int n2, int n3) {
        if (this.e == -1) {
            if (this.f == 1) {
                int n4 = (int)((this.a - System.currentTimeMillis()) / 1000L);
                if (n4 <= 0) return;
                dd.g.a(t2, String.valueOf(this.b) + " : " + s.a(n4), n2 - 5, n3 + 1, 1);
                dd.i.a(t2, String.valueOf(this.b) + " : " + s.a(n4), n2 - 4, n3, 1);
                return;
            }
            dd.g.a(t2, this.b, n2 + 1, n3 + 1, 1);
            dd.i.a(t2, this.b, n2, n3, 1);
            return;
        }
        ak ak2 = (ak)ab.b.get(String.valueOf(this.d));
        if (ak2 == null) {
            ak2 = new ak();
            ab.b.put(String.valueOf(this.d), ak2);
            ak2.a = an.a(w.a(String.valueOf(this.d)));
            if (ak2.a == null) {
                ak2.b = System.currentTimeMillis();
                dq.a().E(this.d);
            }
        } else if (ak2.a == null && System.currentTimeMillis() - ak2.b > 60000L) {
            ak2.b = System.currentTimeMillis();
            dq.a().E(this.d);
        }
        if (ak2 == null || ak2.a == null) return;
        if (this.f == 0) {
            int n5 = dd.g.a(String.valueOf(this.b) + " : ");
            t2.a(ak2.a, n2 - n5 - (ak2.a.getWidth() << 1), n3 + t.b(ak2.a) / 4, 0);
            dd.g.a(t2, this.b, n2 - n5 - (ak2.a.getWidth() << 1) + 1 + t.a(ak2.a), n3 + 1 + t.b(ak2.a) / 4, 0);
            dd.i.a(t2, this.b, n2 - n5 - (ak2.a.getWidth() << 1) + t.a(ak2.a), n3 + t.b(ak2.a) / 4, 0);
            return;
        }
        if (this.f != 1) return;
        int n6 = (int)((this.a - System.currentTimeMillis()) / 1000L);
        int n7 = dd.g.a(String.valueOf(s.a(n6)) + ":");
        t2.a(ak2.a, n2 - n7 - (ak2.a.getWidth() << 1), n3 + t.b(ak2.a) / 4, 0);
        dd.g.a(t2, " : " + s.a(n6), n2 - n7 - (ak2.a.getWidth() << 1) + 1 + t.a(ak2.a), n3 + 1 + t.b(ak2.a) / 4, 0);
        dd.i.a(t2, " : " + s.a(n6), n2 - n7 - (ak2.a.getWidth() << 1) + t.a(ak2.a), n3 + t.b(ak2.a) / 4, 0);
    }

    public final void a() {
        if (this.f == 1 && System.currentTimeMillis() - this.a >= 0L) {
            this.c = true;
        }
    }

    private static String a(int n2) {
        int n3 = n2 % 60;
        int n4 = (n2 /= 60) % 60;
        if ((n2 /= 60) > 0) {
            return String.valueOf(n2) + ":" + n4;
        }
        if (n4 > 0) {
            return String.valueOf(n4) + ":" + n3;
        }
        if (n3 < 0) {
            return "0:" + n3;
        }
        return String.valueOf(n3);
    }
}

