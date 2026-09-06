/*
 * Decompiled with CFR 0.152.
 */
import main.a;
import main.b;

public final class aw
implements cs {
    private static aw g;
    public ad a;
    public boolean b = false;
    dg c;
    private long h = 0L;
    public bd d = new bd(df.aw, this, 8000, null, 1, main.a.B - ag.p + 1);
    public bd e = new bd(df.W, this, 8001, null, main.a.A - 53, main.a.B - ag.p + 1);
    public bd f = null;
    private String i;

    public static aw a() {
        if (g == null) {
            g = new aw();
            return g;
        }
        return g;
    }

    protected aw() {
        this.a = new ad();
        this.a.k = "chat";
        this.a.a = 16;
        this.a.c = main.b.a.b() - 32;
        this.a.d = ag.n + 2;
        this.a.e = true;
        this.a.b(40);
    }

    public final void a(int n2, dg dg2, String string) {
        this.e.a = df.H;
        this.i = string;
        this.a.a(n2);
        if (!this.a.d().equals("") && main.a.J == null) {
            this.c = dg2;
            this.b = true;
        }
        this.a.g = string;
    }

    public final void a(String string) {
        this.e.a = df.H;
        this.i = string;
        if (main.a.J == null) {
            this.b = true;
            if (main.a.g) {
                this.a.a();
            }
        }
        this.a.g = string;
    }

    public final void a(t t2) {
        if (!this.b) {
            return;
        }
        this.a.a(t2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                if (this.c == null) break;
                long l2 = System.currentTimeMillis();
                if (l2 - this.h < 1000L) {
                    return;
                }
                this.h = l2;
                this.c.a(this.a.d(), this.i);
                this.a.a("");
                this.e.a = df.H;
                return;
            }
            case 8001: {
                this.a.b();
                if (!this.a.d().equals("")) break;
                this.b = false;
                this.c.K();
            }
        }
    }
}

