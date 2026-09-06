/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.a;

public final class de
extends i
implements cs {
    private String[] f;
    public ad d;
    public ad e;
    private int g;
    private int h;
    private int i;
    private int j;

    public de() {
        new bd("", 1000, null);
        this.d = new ad();
        this.e = new ad();
    }

    public final void a(String string, String string2) {
        this.j = dd.o.a(string) > dd.o.a(string2) ? dd.o.a(string) : dd.o.a(string2);
        this.g = 40;
        this.h = 0;
        if (main.a.A <= 176) {
            this.g = 10;
        }
        this.d.a = this.g + this.j + 10;
        this.d.b = main.a.B - 2 * ag.n - 50;
        this.d.c = main.a.A - 2 * this.g - this.j - 20;
        this.d.d = ag.n + 2;
        this.d.e = true;
        this.d.f = string;
        this.e.a = this.g + this.j + 10;
        this.e.b = main.a.B - ag.n - 43;
        this.e.c = main.a.A - 2 * this.g - this.j - 20;
        this.e.d = ag.n + 2;
        this.e.f = string2;
        this.c = this.d.l;
    }

    public final void a(String object, bd bd2, bd bd3, int n2, int n3) {
        this.d.a("");
        this.d.c(n2);
        this.e.a("");
        this.e.c(n3);
        this.f = dd.o.b((String)object, main.a.A - this.g * 3);
        object = dd.o.a((String)object, main.a.A - this.g * 3);
        this.i = ((Vector)object).size();
        this.a = bd2;
        this.b = bd3;
        main.a.J = this;
    }

    public final void a(t t2) {
        main.a.N.a(t2, this.g, main.a.B - 85 - ag.p - this.i * 13, main.a.A - (this.g << 1), 80 + this.i * 13, this.f, null);
        dd.o.a(t2, String.valueOf(this.d.f) + ": ", this.d.a - this.j - 5, this.d.b + 5, 0);
        this.d.a(t2);
        t2.d(0, 0, main.a.A, main.a.B);
        dd.o.a(t2, String.valueOf(this.e.f) + ": ", this.e.a - this.j - 5, this.e.b + 5, 0);
        this.e.a(t2);
        super.a(t2);
    }

    public final void a(int n2) {
        if (this.h == 0) {
            this.d.a(n2);
        } else {
            this.e.a(n2);
        }
        super.a(n2);
    }

    public final void a() {
        if (main.a.n[2]) {
            this.h = 0;
        }
        if (main.a.n[8]) {
            this.h = 1;
        }
        if (this.h == 0) {
            this.d.e = true;
            this.e.e = false;
            this.c = this.d.l;
            this.d.c();
        } else {
            this.d.e = false;
            this.e.e = true;
            this.c = this.e.l;
            this.e.c();
        }
        if (main.a.g && main.a.r && main.a.q) {
            if (main.a.b(this.d.a, this.d.b, this.d.c, this.d.d)) {
                this.h = 0;
            }
            if (main.a.b(this.e.a, this.e.b, this.e.c, this.e.d)) {
                this.h = 1;
            }
        }
        if (this.a != null) {
            this.a.f = main.a.A / 2 - 160;
            this.a.g = main.a.B - 26;
        }
        if (this.b != null) {
            this.b.f = main.a.A / 2 - 35;
            this.b.g = main.a.B - 26;
        }
        if (this.c != null) {
            this.c.f = main.a.A / 2 + 88;
            this.c.g = main.a.B - 26;
        }
        super.a();
    }

    public final void a(int n2, Object object) {
    }
}

