/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class az
extends au {
    private static aj e;
    private static aj f;
    private static Image g;
    private static Image h;
    private byte i = 0;
    private int j = 0;
    private aa k = new aa();

    static {
        new bw();
        g = main.a.c("/u/tuyet.png");
        h = main.a.c("/u/cobay.png");
    }

    public az(byte by2, boolean n2, int n3) {
        this.i = by2;
        this.j = n3;
        switch (by2) {
            case 1: {
                n3 = 10;
                if (e != null) break;
                e = new aj(h, 16, 10);
                break;
            }
            case 3: {
                if (f != null) break;
                f = new aj(g, 5, 5);
            }
        }
        n2 = 0;
        while (n2 < n3) {
            ck ck2 = null;
            ck2 = new ck((dg.i - 20 + am.d((main.a.A + 40) / 5) * 5) * 10, (dg.j - 20 + am.d(main.a.B / 5) * 5) * 10);
            ck2.d = by2 == 3 ? am.d(3) : am.d(4);
            ck2.f = 16 + (am.d(3) << 2);
            ck2.c = am.d(-1, 1);
            ck2.e = am.d(ck2.f);
            this.k.addElement(ck2);
            ++n2;
        }
    }

    public final void a(t t2) {
        t2.a(-t2.a(), -t2.b());
        t2.d(0, -200, main.a.A, 200 + main.a.B);
        switch (this.i) {
            case 1: {
                int n2 = 0;
                while (n2 < this.j) {
                    ck ck2 = (ck)this.k.elementAt(n2);
                    e.a(ck2.e / (ck2.f / 4), ck2.a / 10 - dg.i, ck2.b / 10 - dg.j, 0, 3, t2);
                    ++n2;
                }
                return;
            }
            case 3: {
                int n3 = 0;
                while (n3 < this.j) {
                    ck ck3 = (ck)this.k.elementAt(n3);
                    if (ck3.d > 0) {
                        dg.n();
                        if (bw.g == null) {
                            bw.g = new bw();
                        }
                        int n4 = bw.g.a * ((2 - ck3.d) * 20) / 120 - dg.i;
                        f.a(ck3.d, n4 + ck3.a / 10, ck3.b / 10 - dg.j, 2, 0, t2);
                    }
                    ++n3;
                }
                break;
            }
        }
    }

    public final void a() {
        switch (this.i) {
            case 1: {
                int n2 = 0;
                while (n2 < this.j) {
                    ck ck2 = (ck)this.k.elementAt(n2);
                    ck2.b += 10;
                    ck2.a += ck2.c * 10;
                    ++ck2.e;
                    if (ck2.e >= ck2.f) {
                        ck2.e = 0;
                    }
                    if (ck2.b / 10 > dg.j + main.a.B - (3 - ck2.d) * 40 || ck2.a / 10 < dg.i - main.a.C || ck2.a / 10 > dg.i + main.a.A + main.a.C) {
                        if (ck2.b / 10 > 24) {
                            int n3 = ck2.b / 10 + dg.j;
                            int n4 = ck2.a / 10 + dg.i;
                            az az2 = this;
                            ck ck3 = new ck(n4, n3);
                            new ck(n4, n3).f = 200;
                            am.d(4);
                            new bj(az2, ck3, n4, n3);
                        }
                        this.a(ck2);
                    }
                    ++n2;
                }
                return;
            }
            case 3: {
                int n5 = 0;
                while (n5 < this.j) {
                    ck ck4 = (ck)this.k.elementAt(n5);
                    ck4.b += (ck4.d + 1) * 5;
                    ck4.a += ck4.d + 1 << 1;
                    if (ck4.b / 10 > dg.j + main.a.B - (3 - ck4.d) * 30) {
                        this.a(ck4);
                    }
                    ck ck5 = ck4;
                    int n6 = dg.i * ((2 - ck5.d) * 20) / 120;
                    if (ck5.a / 10 + n6 < dg.i - 10) {
                        ck5.a += (main.a.A + 20) * 10;
                    }
                    if (ck5.a / 10 + n6 > dg.i + main.a.A + 10) {
                        ck5.a -= (main.a.A + 20) * 10;
                    }
                    ++n5;
                }
                break;
            }
        }
    }

    private void a(ck ck2) {
        ck2.a = (dg.i - 20 + am.d((main.a.A + 40) / 5) * 5) * 10;
        ck2.b = (dg.j - main.a.D + am.d(main.a.B / 5) * 5) * 10;
        if (this.i == 3) {
            ck2.d = am.d(3);
            return;
        }
        ck2.d = am.d(4);
    }
}

