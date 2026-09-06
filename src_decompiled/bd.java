/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class bd {
    public String a;
    public String[] b;
    public cs c;
    public int d;
    private Image l;
    private Image m;
    public Image e;
    public int f = 0;
    public int g = 0;
    public int h = ag.o;
    public int i = ag.p;
    public boolean j = false;
    public Object k;

    public bd(String string, cs cs2, int n2, Object object, int n3, int n4) {
        this.a = string;
        this.d = n2;
        this.c = cs2;
        this.k = object;
        this.f = n3;
        this.g = n4;
        this.h = ag.o;
        this.i = ag.p;
        this.l = null;
        this.m = null;
    }

    public bd(String string, cs cs2, int n2, Object object) {
        this.a = string;
        this.d = n2;
        this.c = cs2;
        this.k = object;
    }

    public bd(String string, int n2, Object object) {
        this.a = string;
        this.d = n2;
        this.k = object;
    }

    public bd(String string, int n2) {
        this.a = string;
        this.d = n2;
    }

    public bd(String string, int n2, int n3, int n4) {
        this.a = string;
        this.d = 0;
        this.f = n3;
        this.g = n4;
    }

    public final void a() {
        if (this.d > 0) {
            if (this.c != null) {
                this.c.a(this.d, this.k);
                return;
            }
            dg.n().b(this.d, this.k);
        }
    }

    public final void a(t t2) {
        if (this.e != null) {
            t2.a(this.e, this.f + t.a(this.e) / 2, this.g + t.b(this.e) / 2, 3);
            return;
        }
        if (this.a != "") {
            if (!this.j) {
                t2.a(dg.bA, this.f, this.g, 0);
            } else {
                t2.a(dg.bB, this.f, this.g, 0);
            }
        }
        dd.d.a(t2, this.a, this.f + 36, this.g + 6, 2);
    }

    public final boolean b() {
        this.j = false;
        if (main.a.b(this.f - 3, this.g - 3, this.h + 6, this.i + 6)) {
            if (main.a.p) {
                this.j = true;
            }
            if (main.a.r && main.a.q) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        bd bd2 = this;
        if (bd2.f > 0 && bd2.g > 0 && this.b()) {
            this.a();
            main.a.p = false;
            this.j = false;
        }
    }
}

