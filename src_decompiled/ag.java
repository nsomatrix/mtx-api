/*
 * Decompiled with CFR 0.152.
 */
import main.a;
import main.b;

public class ag {
    public bd k;
    public bd l;
    public bd m;
    public static final int n = dd.o.c() + 8;
    public static int o = 70 * t.b;
    public static int p = 22;
    public static int q = -1;

    public void a() {
        a.h();
        a.i();
        if (a.E != null) {
            a.E.e();
        }
        a.E = this;
        boolean bl2 = true;
        b.a.setFullScreenMode(true);
    }

    public void e() {
    }

    public static void f() {
        if (a.g) {
            p = 26;
            return;
        }
        p = 24;
    }

    public void b(int n2) {
    }

    public void c() {
    }

    public void d() {
        if (a.n[5] || ag.a(a.E.l)) {
            a.n[5] = false;
            q = -1;
            a.r = false;
            if (this.l != null) {
                this.l.a();
            }
        }
        if (a.n[12] || ag.a(a.E.k)) {
            a.n[12] = false;
            q = -1;
            a.r = false;
            if (aw.a().b) {
                if (aw.a().d != null) {
                    aw.a().d.a();
                }
            } else if (this.k != null) {
                this.k.a();
            }
        }
        if (a.n[13] || ag.a(a.E.m)) {
            a.n[13] = false;
            q = -1;
            a.r = false;
            if (aw.a().b) {
                if (aw.a().e != null) {
                    aw.a().e.a();
                    return;
                }
            } else if (this.m != null) {
                this.m.a();
            }
        }
    }

    public static boolean a(bd bd2) {
        if (bd2 == null) {
            return false;
        }
        if (bd2.f != 0 && bd2.g != 0) {
            return bd2.b();
        }
        if (a.J != null) {
            if (a.J.b != null && a.b(a.A - o >> 1, a.B - p - 5, o, p + 10)) {
                q = 1;
                if (bd2 == a.J.b && a.q && a.r) {
                    return true;
                }
            }
            if (a.J.a != null && a.b(0, a.B - p - 5, o, p + 10)) {
                q = 0;
                if (bd2 == a.J.a && a.q && a.r) {
                    return true;
                }
            }
            if (a.J.c != null && a.b(a.A - o, a.B - p - 5, o, p + 10)) {
                q = 2;
                if ((bd2 == a.J.c || bd2 == aw.a().e) && a.q && a.r) {
                    return true;
                }
            }
        } else {
            if (bd2 == a.E.k && a.b(0, a.B - p - 5, o, p + 10)) {
                q = 0;
                if (a.q && a.r) {
                    return true;
                }
            }
            if (bd2 == a.E.m && a.b(a.A - o, a.B - p - 5, o, p + 10)) {
                q = 2;
                if (a.q && a.r) {
                    return true;
                }
            }
            if ((bd2 == a.E.l || cb.f != null) && a.b(a.A - o >> 1, a.B - p - 5, o, p + 10)) {
                q = 1;
                if (a.q && a.r) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(t t2) {
        t2.a(-t2.a(), -t2.b());
        t2.d(0, 0, a.A, a.B + 1);
        ay.a(t2);
        if (cb.f != null) {
            ay.a(t2, null, cb.f.e, null);
            return;
        }
        if (aw.a().b) {
            ay.a(t2, aw.a().d, aw.a().f, aw.a().e);
            return;
        }
        if (a.J == null && !a.F.a) {
            ay.a(t2, this.k, this.l, this.m);
        }
    }
}

