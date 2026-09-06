/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.a;

public final class dp
extends au {
    private int e;
    private int f;
    private int g;
    private short h = (short)256;
    private int i;
    private int j;
    private int k;
    private boolean l = false;
    private int m;
    private int n;
    private int o;
    private bp p;
    private dk q;
    private boolean r;
    private int s;
    private int t = 1;
    private static int u;
    private static Vector v;
    private static int w;
    private int x = 0;
    private int y;
    private static byte[] z;
    private static int[] A;
    private static int[] B;

    static {
        v = new Vector();
        w = 0;
        byte[] byArray = new byte[25];
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 1;
        byArray[5] = 1;
        byArray[6] = 2;
        byArray[7] = 1;
        byArray[9] = 1;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 1;
        byArray[14] = 2;
        byArray[15] = 1;
        byArray[17] = 1;
        byArray[18] = 2;
        byArray[19] = 1;
        byArray[21] = 1;
        byArray[22] = 2;
        byArray[23] = 1;
        z = byArray;
        int[] nArray = new int[16];
        nArray[3] = 7;
        nArray[4] = 6;
        nArray[5] = 6;
        nArray[6] = 6;
        nArray[7] = 2;
        nArray[8] = 2;
        nArray[9] = 3;
        nArray[10] = 3;
        nArray[11] = 4;
        nArray[12] = 5;
        nArray[13] = 5;
        nArray[14] = 5;
        nArray[15] = 1;
        A = nArray;
        int[] nArray2 = new int[18];
        nArray2[1] = 15;
        nArray2[2] = 37;
        nArray2[3] = 52;
        nArray2[4] = 75;
        nArray2[5] = 105;
        nArray2[6] = 127;
        nArray2[7] = 142;
        nArray2[8] = 165;
        nArray2[9] = 195;
        nArray2[10] = 217;
        nArray2[11] = 232;
        nArray2[12] = 255;
        nArray2[13] = 285;
        nArray2[14] = 307;
        nArray2[15] = 322;
        nArray2[16] = 345;
        nArray2[17] = 370;
        B = nArray2;
    }

    private void a(int n2) {
        this.e = n2;
        this.f = this.h * am.b(n2) >> 10;
        this.g = this.h * am.a(n2) >> 10;
    }

    public static void a(int n2, int n3, boolean bl2, short s2, int n4, int n5, int n6, bp bp2) {
        u = s2;
        au.a.addElement(new dp(n2, n3, bl2, s2, n4, n5, n6, bp2));
    }

    public static void a(int n2, int n3, dk dk2) {
        au.a.addElement(new dp(n2, n3, dk2));
    }

    private dp(int n2, int n3, boolean bl2, short s2, int n4, int n5, int n6, bp bp2) {
        this.o = 0;
        this.i = n2;
        this.j = n3;
        this.r = bl2;
        this.s = n4;
        this.m = n5;
        this.n = n6;
        this.p = bp2;
        if (bl2) {
            this.a(this.t * 90);
            ++this.t;
            if (this.t > 3) {
                this.t = 1;
                return;
            }
        } else {
            if (n2 > bp2.i) {
                this.a(240);
                return;
            }
            this.a(300);
        }
    }

    private dp(int n2, int n3, dk dk2) {
        this.o = 1;
        this.i = n2;
        this.j = n3;
        this.q = dk2;
        if (n2 > dk2.a) {
            this.a(240);
        } else {
            this.a(300);
        }
        this.h = (short)256;
        this.e = 180;
        this.f = this.h * am.b(this.e) >> 10;
        this.g = this.h * am.a(this.e) >> 10;
    }

    public final void a() {
        int n2;
        int n3;
        Object object;
        if (u > 100) {
            object = new v(this.i, this.j, 2);
            v.addElement(object);
        } else if (u > 50 && u <= 100) {
            object = new v(this.i, this.j, 5);
            v.addElement(object);
        } else if (u > 30 && u <= 50) {
            object = new v(this.i, this.j, 4);
            v.addElement(object);
        } else if (u > 0 && u <= 30) {
            object = new v(this.i, this.j, 3);
            v.addElement(object);
        }
        object = this;
        if (((dp)object).p != null) {
            n3 = ((dp)object).p.i - ((dp)object).i;
            n2 = ((dp)object).p.j - (((dp)object).p.ag >> 1) - ((dp)object).j;
            ++((dp)object).k;
            if ((am.e(n3) >= 16 || am.e(n2) >= 16) && ((dp)object).k <= 60) {
                int n4;
                block22: {
                    int n5 = am.a(n3, n2);
                    if (Math.abs(n5 - ((dp)object).e) < 90 || n3 * n3 + n2 * n2 > 4096) {
                        ((dp)object).e = Math.abs(n5 - ((dp)object).e) < 15 ? n5 : (n5 - ((dp)object).e >= 0 && n5 - ((dp)object).e < 180 || n5 - ((dp)object).e < -180 ? am.c(((dp)object).e + 15) : am.c(((dp)object).e - 15));
                    }
                    if (((dp)object).h < 8192) {
                        ((dp)object).h = (short)(((dp)object).h + 1024);
                    }
                    ((dp)object).f = ((dp)object).h * am.b(((dp)object).e) >> 10;
                    ((dp)object).g = ((dp)object).h * am.a(((dp)object).e) >> 10;
                    n3 += ((dp)object).f;
                    ((dp)object).i += (n3 >>= 10);
                    n2 += ((dp)object).g;
                    ((dp)object).j += (n2 >>= 10);
                    n3 = am.a(n3, -n2);
                    n2 = 0;
                    while (n2 < B.length - 1) {
                        if (n3 >= B[n2] && n3 <= B[n2 + 1]) {
                            n4 = n2 >= 16 ? 0 : n2;
                            break block22;
                        }
                        ++n2;
                    }
                    n4 = 0;
                }
                ((dp)object).y = n4;
                ((dp)object).x = z[((dp)object).y];
                w = A[((dp)object).y];
            }
        }
        int n6 = 0;
        n3 = 0;
        if (this.o == 0) {
            n6 = this.p.i - this.i;
            n3 = this.p.j - 10 - this.j;
            ++this.k;
            if (this.p.n == 5 || this.p.n == 14) {
                this.i += (this.p.i - this.i) / 2;
                this.j += (this.p.j - this.j) / 2;
            }
            if (am.e(n6) < 16 && am.e(n3) < 16 || this.k > 60) {
                this.p.a(this.m, this.n, this.r, this.s);
                au.a.removeElement(this);
                return;
            }
        } else if (this.o == 1) {
            n6 = this.q.a - this.i;
            n3 = this.q.b - 10 - this.j;
            ++this.k;
            if (am.e(n6) < 16 && am.e(n3) < 16 || this.k > 60) {
                dk dk2 = this.q;
                this.q.d = true;
                au.a.removeElement(this);
                return;
            }
        }
        if (Math.abs((n2 = am.a(n6, n3)) - this.e) < 90 || n6 * n6 + n3 * n3 > 4096) {
            this.e = Math.abs(n2 - this.e) < 15 ? n2 : (n2 - this.e >= 0 && n2 - this.e < 180 || n2 - this.e < -180 ? am.c(this.e + 15) : am.c(this.e - 15));
        }
        n6 += this.f;
        this.i += (n6 >>= 10);
        n6 = (n3 += this.g) >> 10;
        this.j += n6;
        int n7 = 0;
        while (n7 < v.size()) {
            v v2 = (v)v.elementAt(n7);
            v2.a();
            if (v2.a > 3) {
                v.removeElementAt(n7);
            }
            ++n7;
        }
    }

    public final void a(t t2) {
        block29: {
            block27: {
                int n2;
                block31: {
                    block30: {
                        block28: {
                            if (!this.r) break block27;
                            n2 = 7;
                            n2 = main.a.w % n2;
                            if (this.s == 114) {
                                if (n2 < 4) {
                                    ab.a(t2, 1299, this.i, this.j, 0, 3);
                                    return;
                                }
                                ab.a(t2, 1307, this.i, this.j, 0, 3);
                                return;
                            }
                            if (this.s != 115) break block28;
                            n2 = 20;
                            if ((n2 = main.a.w % n2) < 4) {
                                ab.a(t2, 1379, this.i, this.j, 0, 3);
                                return;
                            }
                            if (n2 < 8) {
                                ab.a(t2, 1380, this.i, this.j, 0, 3);
                                return;
                            }
                            if (n2 < 12) {
                                ab.a(t2, 1379, this.i, this.j, 0, 3);
                                return;
                            }
                            if (n2 < 16) {
                                ab.a(t2, 1382, this.i, this.j, 0, 3);
                                return;
                            }
                            break block29;
                        }
                        if (this.s != 116) break block30;
                        n2 = 17;
                        if ((n2 = main.a.w % n2) < 4) {
                            ab.a(t2, 1399, this.i, this.j, 0, 3);
                            return;
                        }
                        if (n2 < 8) {
                            ab.a(t2, 1400, this.i, this.j, 0, 3);
                            return;
                        }
                        if (n2 < 12) {
                            ab.a(t2, 1401, this.i, this.j, 0, 3);
                            return;
                        }
                        if (n2 < 16) {
                            ab.a(t2, 1402, this.i, this.j, 0, 3);
                            return;
                        }
                        break block29;
                    }
                    if (this.s != 139) break block31;
                    n2 = 20;
                    if ((n2 = main.a.w % n2) < 4) {
                        ab.a(t2, 1459, this.i, this.j, 0, 3);
                        return;
                    }
                    if (n2 < 8) {
                        ab.a(t2, 1380, this.i, this.j, 0, 3);
                        return;
                    }
                    if (n2 < 12) {
                        ab.a(t2, 1461, this.i, this.j, 0, 3);
                        return;
                    }
                    if (n2 < 16) {
                        ab.a(t2, 1382, this.i, this.j, 0, 3);
                        return;
                    }
                    break block29;
                }
                if (this.s != 144 && this.s != 163) break block29;
                n2 = 20;
                if ((n2 = main.a.w % n2) < 4) {
                    ab.a(t2, 1459, this.i, this.j, 0, 3);
                    return;
                }
                if (n2 < 8) {
                    ab.a(t2, 1380, this.i, this.j, 0, 3);
                    return;
                }
                if (n2 < 12) {
                    ab.a(t2, 1461, this.i, this.j, 0, 3);
                    return;
                }
                if (n2 < 16) {
                    ab.a(t2, 1382, this.i, this.j, 0, 3);
                    return;
                }
                break block29;
            }
            if (u > 100) {
                t2.a(dg.bS, 0, this.x * 23, 31, 23, w, this.i, this.j, 0);
            } else if (u > 50 && u <= 100) {
                t2.a(dg.bS, 0, 0, 14, 14, w, this.i, this.j, 0);
            } else if (u > 30 && u <= 50) {
                t2.a(dg.bS, 0, 0, 8, 8, w, this.i, this.j, 0);
            } else if (u > 0 && u <= 30) {
                t2.a(dg.bS, 0, 0, 8, 8, w, this.i, this.j, 0);
            }
            int n3 = 0;
            while (n3 < v.size()) {
                v v2 = (v)v.elementAt(n3);
                if (v2 != null) {
                    v2.a(t2);
                }
                ++n3;
            }
        }
    }
}

