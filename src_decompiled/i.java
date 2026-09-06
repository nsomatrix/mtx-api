/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public abstract class i {
    bd a;
    bd b;
    bd c;

    public void a(t t2) {
        t2.a(-t2.a(), -t2.b());
        t2.d(0, 0, main.a.A, main.a.B);
        ay.a(t2);
        ay.a(t2, this.a, this.b, this.c);
    }

    public void a(int n2) {
        switch (n2) {
            case -38: 
            case -1: {
                main.a.o[2] = true;
                main.a.n[2] = true;
                return;
            }
            case -39: 
            case -2: {
                main.a.o[8] = true;
                main.a.n[8] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.o[12] = true;
                main.a.n[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.o[13] = true;
                main.a.n[13] = true;
                return;
            }
            case -5: 
            case 10: {
                main.a.o[5] = true;
                main.a.n[5] = true;
                return;
            }
        }
    }

    public void a() {
        if (this.b != null && (main.a.n[5] || ag.a(this.b))) {
            main.a.n[5] = false;
            main.a.q = false;
            ag.q = -1;
            main.a.r = false;
            if (this.b != null) {
                this.b.a();
            }
            ag.q = -1;
        }
        if (this.a != null && (main.a.n[12] || ag.a(this.a))) {
            main.a.n[12] = false;
            main.a.q = false;
            ag.q = -1;
            main.a.r = false;
            if (this.a != null) {
                this.a.a();
            }
            ag.q = -1;
        }
        if (this.c != null && (main.a.n[13] || ag.a(this.c))) {
            main.a.n[13] = false;
            main.a.q = false;
            main.a.r = false;
            ag.q = -1;
            if (this.c != null) {
                this.c.a();
            }
            ag.q = -1;
        }
        main.a.h();
        main.a.i();
    }
}

