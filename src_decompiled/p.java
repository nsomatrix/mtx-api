/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class p
extends i {
    private String[] e;
    public ad d;
    private int f = 40;

    public p() {
        if (main.a.A <= 176) {
            this.f = 10;
        }
        this.d = new ad();
        this.d.a = this.f + 10;
        this.d.b = main.a.B - ag.n - 43;
        this.d.c = main.a.A - 2 * (this.f + 10);
        this.d.d = ag.n + 2;
        this.d.e = true;
        this.c = this.d.l;
    }

    public final void a(String string, bd bd2, int n2) {
        try {
            ((p)((Object)exception2)).d.a("");
            ((p)((Object)exception2)).d.c(n2);
            ((p)((Object)exception2)).e = dd.o.b(string, main.a.A - (((p)((Object)exception2)).f << 1));
            ((i)((Object)exception2)).a = new bd(df.H, main.a.a(), 8882, null);
            ((i)((Object)exception2)).b = bd2;
            if (((i)((Object)exception2)).a != null) {
                ((i)((Object)exception2)).a.f = main.a.A / 2 - 160;
                ((i)((Object)exception2)).a.g = main.a.B - 26;
            }
            if (((i)((Object)exception2)).b != null) {
                ((i)((Object)exception2)).b.f = main.a.A / 2 - 35;
                ((i)((Object)exception2)).b.g = main.a.B - 26;
            }
            if (((i)((Object)exception2)).c != null) {
                ((i)((Object)exception2)).c.f = main.a.A / 2 + 88;
                ((i)((Object)exception2)).c.g = main.a.B - 26;
            }
            main.a.J = exception2;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(t t2) {
        main.a.N.a(t2, this.f, main.a.B - 77 - ag.p, main.a.A - (this.f << 1), 69, this.e, null);
        this.d.a(t2);
        super.a(t2);
    }

    public final void a(int n2) {
        this.d.a(n2);
        super.a(n2);
    }

    public final void a() {
        this.d.c();
        super.a();
    }
}

