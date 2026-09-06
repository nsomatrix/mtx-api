/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class br
extends i {
    private String[] f;
    public boolean d;
    public int e;
    private int g;
    private int h = 30;

    public br() {
        if (main.a.A <= 176) {
            this.h = 10;
        }
    }

    public final void b() {
        this.a(df.y, null, null, null);
        main.a.J = this;
    }

    public final void a(String string, bd bd2, bd bd3, bd bd4) {
        this.f = dd.o.b(string, main.a.A - ((this.h << 1) + 40));
        this.a = bd2;
        this.b = bd3;
        this.c = bd4;
        if (bd3 != null) {
            this.b.f = main.a.A / 2 - 35;
            this.b.g = main.a.B - 26;
            if (bd2 != null) {
                this.a.f = main.a.A / 2 - 115;
                this.a.g = main.a.B - 26;
            }
            if (bd4 != null) {
                this.c.f = main.a.A / 2 + 45;
                this.c.g = main.a.B - 26;
            }
        } else {
            if (bd2 != null) {
                this.a.f = main.a.A / 2 - 80;
                this.a.g = main.a.B - 26;
            }
            if (bd4 != null) {
                this.c.f = main.a.A / 2 + 10;
                this.c.g = main.a.B - 26;
            }
        }
        this.d = false;
        this.g = 80;
        if (this.f.length >= 5) {
            this.g = this.f.length * dd.o.c() + 20;
        }
    }

    public final void a(t t2) {
        int n2 = main.a.B - this.g - 38;
        ay.a(this.h, n2, main.a.A - (this.h << 1), this.g, t2);
        n2 = n2 + (this.g - this.f.length * dd.o.c()) / 2 - 2;
        if (this.d) {
            main.a.a(main.a.C, (n2 += 8) - 12, t2, false);
        }
        int n3 = 0;
        while (n3 < this.f.length) {
            dd.o.a(t2, this.f[n3], main.a.C, n2, 2);
            ++n3;
            n2 += dd.o.c();
        }
        super.a(t2);
    }

    public final void a() {
        if (this.e > 0) {
            --this.e;
            if (this.e == 1) {
                main.a.j();
                this.e = 0;
            }
        }
        super.a();
    }
}

