/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class c
extends au {
    private int[] e = new int[]{0xFCFCFD, 11188220};
    private aa f = new aa();
    private aa[] g;
    private ba h;
    private long i = 0L;
    private boolean j = false;
    private boolean k = true;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private int o = 7;

    public static void a(aa aa2, ba ba2, boolean bl2, int n2) {
        c c2 = new c();
        c2.e[1] = n2;
        n2 = 0;
        while (n2 < aa2.size()) {
            ba ba3 = (ba)aa2.elementAt(n2);
            if (ba3 != null && (am.e(ba3.a - ba2.a) >= 100 || am.e(ba3.b - ba2.b) >= 50)) {
                aa2.removeElementAt(n2);
            }
            ++n2;
        }
        c2.a(aa2, ba2, true);
        au.a.addElement(c2);
    }

    private void a(aa aa2, ba ba2, boolean bl2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        if (aa2.size() == 0) {
            return;
        }
        this.j = bl2;
        if (!bl2) {
            aa aa3 = aa2;
            n7 = aa3.size();
            int n8 = 0;
            while (n8 < n7 - 1) {
                ba ba3 = (ba)aa3.elementAt(n8);
                n6 = n8 + 1;
                while (n6 < n7) {
                    ba ba4 = (ba)aa3.elementAt(n6);
                    if (ba3.a > ba4.a) {
                        aa3.setElementAt(ba3, n6);
                        aa3.setElementAt(ba4, n8);
                        ba3 = ba4;
                    }
                    ++n6;
                }
                ++n8;
            }
        }
        this.f = aa2;
        this.h = ba2;
        this.g = new aa[aa2.size()];
        int n9 = 0;
        while (n9 < this.g.length) {
            this.g[n9] = new aa();
            ++n9;
        }
        ba2.c = (byte)-1;
        this.g[0].addElement(ba2);
        n9 = -1;
        int n10 = 0;
        while (n10 < aa2.size()) {
            n5 = ba2.a;
            int n11 = ba2.b;
            if (bl2 && n9 != -1) {
                ba ba5 = (ba)aa2.elementAt(n9);
                n5 = ba5.a;
                n11 = ba5.b;
            }
            if (!bl2) {
                int n12;
                block22: {
                    aa aa4 = aa2;
                    int n13 = 0;
                    int n14 = 0;
                    while (n14 < aa4.size()) {
                        ba ba6 = (ba)aa4.elementAt(n14);
                        if (ba6.e == -1) {
                            ++n13;
                        }
                        ++n14;
                    }
                    if (n13 == 0) {
                        n12 = -1;
                    } else {
                        n13 = am.d(n13);
                        n14 = 0;
                        int n15 = 0;
                        while (n15 < aa4.size()) {
                            ba ba7 = (ba)aa4.elementAt(n15);
                            if (ba7.e == -1) {
                                if (n13 == n14) {
                                    ba7.e = 0;
                                    n12 = n15;
                                    break block22;
                                }
                                ++n14;
                            }
                            ++n15;
                        }
                        n12 = -1;
                    }
                }
                n9 = n12;
            } else {
                ++n9;
            }
            n7 = this.g[n9].size() - 1;
            ba ba8 = (ba)aa2.elementAt(n9);
            int n16 = am.a(ba8.a - n5, -(ba8.b - n11));
            n6 = am.d(15) + 10;
            n4 = 0;
            int n17 = 0;
            while (true) {
                n17 = 0;
                if (n4 != 0) {
                    n17 = n16 - 5 + am.d(10);
                }
                n17 = am.c(n17);
                n3 = n6 * n4 * am.b(n17) >> 10;
                n2 = -(n6 * n4 * am.a(n17)) >> 10;
                ba ba9 = new ba(n5 + n3, n11 + n2, n7++);
                this.g[n9].addElement(ba9);
                if (am.a(n5, n11, n5 + n3, n11 + n2) >= am.a(n5, n11, ba8.a, ba8.b) - 20) break;
                ++n4;
            }
            ++n10;
        }
        n10 = 0;
        while (n10 < this.g.length) {
            n5 = this.g[n10].size();
            ba ba10 = (ba)aa2.elementAt(n10);
            ((ba)aa2.elementAt(n10)).c = (byte)(this.g[n10].size() - 1);
            ba10.e = (short)-1;
            ba ba11 = new ba(ba10.a, ba10.b, ba10.c);
            new ba(ba10.a, ba10.b, ba10.c).e = (short)-1;
            this.g[n10].addElement(ba11);
            int n18 = 1;
            while (n18 < n5) {
                ba ba12 = (ba)this.g[n10].elementAt(n18);
                n6 = am.d(2);
                n4 = 0;
                while (n4 < n6) {
                    int n19 = 180 + am.d(180);
                    n3 = 5 + am.d(10);
                    n2 = n3 * am.b(am.c(n19)) >> 10;
                    n19 = -(n3 * am.a(am.c(n19))) >> 10;
                    ba2 = new ba(ba12.a + n2, ba12.b + n19, n18);
                    new ba(ba12.a + n2, ba12.b + n19, n18).e = 0;
                    this.g[n10].addElement(ba2);
                    ++n4;
                }
                ++n18;
            }
            ++n10;
        }
    }

    public final void a() {
        if (this.h == null) {
            au.b.addElement(this);
            return;
        }
        try {
            if (main.a.w % 2 == 1) {
                this.h.c = (byte)-1;
                this.h.e = (short)-1;
                int n2 = 0;
                while (n2 < this.f.size()) {
                    ba ba2 = (ba)this.f.elementAt(n2);
                    ((ba)this.f.elementAt(n2)).e = (short)-1;
                    ba2.c = (byte)-1;
                    ++n2;
                }
                if (this.j && this.k && this.f.size() > 1 && System.currentTimeMillis() / 10L - this.i > 30L) {
                    this.i = System.currentTimeMillis() / 10L;
                    this.h = (ba)this.f.elementAt(0);
                    this.f.removeElementAt(0);
                }
                this.a(this.f, this.h, this.j);
                if (this.l > 3) {
                    this.o = 7;
                    au.a.removeElement(this);
                }
                ++this.l;
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void a(t t2) {
        this.n = 0;
        ++this.m;
        if (this.m >= 12) {
            this.m = 0;
        }
        if (this.g != null) {
            int n2 = 0;
            while (n2 < this.g.length) {
                int n3 = 0;
                while (n3 < this.g[n2].size()) {
                    Object object = (ba)this.g[n2].elementAt(n3);
                    if (((ba)object).c >= 0 && ((ba)object).c < this.g[n2].size()) {
                        Object object2 = (ba)this.g[n2].elementAt(((ba)object).c);
                        if (main.a.e(((ba)object).a, ((ba)object).b) && main.a.e(((ba)object2).a, ((ba)object2).b)) {
                            ba ba2 = object2;
                            ba ba3 = object;
                            object2 = t2;
                            object = this;
                            ((t)object2).a(((c)object).e[0]);
                            ((t)object2).a(ba3.a, ba3.b, ba2.a, ba2.b);
                            if (ba3.e == -1) {
                                ((t)object2).a(((c)object).e[1]);
                                ((t)object2).a(ba3.a - 1, ba3.b, ba2.a - 1, ba2.b);
                                if (((c)object).j && ((c)object).k) {
                                    ((t)object2).a(ba3.a + 1, ba3.b, ba2.a + 1, ba2.b);
                                }
                            }
                        }
                        if (this.j && this.k) {
                            ++this.n;
                            if (this.n >= this.o) {
                                this.o += 7;
                                return;
                            }
                        }
                    }
                    ++n3;
                }
                ba ba4 = (ba)this.f.elementAt(n2);
                ba4.d = (byte)(ba4.d + 1);
                if (ba4.d >= 12) {
                    ba4.d = 0;
                }
                ++n2;
            }
        }
    }
}

