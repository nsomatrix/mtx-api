/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cy
extends bp {
    public bi cm;
    public static bi[] cn;

    public cy(int n2, int n3, int n4, int n5, int n6) {
        this.i = n4;
        this.j = n5;
        this.n = n3;
        this.cm = cn[n6];
    }

    public static void E() {
        int n2 = 0;
        while (n2 < dg.R.size()) {
            cy cy2 = (cy)dg.R.elementAt(n2);
            ((cy)dg.R.elementAt(n2)).bV = null;
            cy2.bU = -1;
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void h() {
        block4: {
            block6: {
                block5: {
                    if (this.bV != null) break block4;
                    var1_1 = new byte[]{-1, 9, 9, 10, 10, 11, 11};
                    if (bp.d().r < 9 || bp.d().r > 10 || bp.d().av.a <= 0 || var1_1[bp.d().av.a] != this.cm.a) break block5;
                    if (bp.d().aA == null) ** GOTO lbl-1000
                    if (bp.d().aA == null || bp.d().aA.a + 1 != bp.d().aA.e.length) break block4;
                    this.bV = dg.D[62];
                    break block6;
                }
                dg.n();
                var1_2 = dg.F();
                if (bp.d().aA != null || var1_2 != this.cm.a) {
                    if (bp.d().aA != null && var1_2 == this.cm.a) {
                        ** if (bp.d().aA.a + 1 != bp.d().aA.e.length) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            this.bV = dg.D[62];
                            ** GOTO lbl20
                        }
                    } else {
                        ** GOTO lbl18
                    }
                }
                ** GOTO lbl-1000
lbl18:
                // 2 sources

                break block4;
lbl-1000:
                // 3 sources

                {
                    this.bV = dg.D[57];
                }
            }
            this.bU = 0;
        }
        super.h();
    }

    public final void a(t t2) {
        if (!this.q()) {
            return;
        }
        if (this.n == 15) {
            return;
        }
        if (this.aN != 0) {
            super.a(t2);
            return;
        }
        if (this.cm == null) {
            return;
        }
        if (this.cm.a == 13) {
            if (bp.d().aU != null && bp.d().aU.equals(this)) {
                ab.a(t2, 988, this.i, this.j - this.ag - 1, 0, 33);
            }
            ab.a(t2, 1060, this.i, this.j, 0, 33);
            dd.i.a(t2, String.valueOf(af.l), this.i, this.j - 10 - 2 - dd.g.c(), 2);
            return;
        }
        if (this.cm.a == 31) {
            if (bp.d().aU != null && bp.d().aU.equals(this)) {
                ab.a(t2, 988, this.i, this.j - this.ag - 1, 0, 33);
            }
            ab.a(t2, 1291, this.i, this.j, 0, 33);
            return;
        }
        if (this.cm.a == 27) {
            if (bp.d().aU != null && bp.d().aU.equals(this)) {
                ab.a(t2, 988, this.i, this.j - this.ag - 1, 0, 33);
            }
            ab.a(t2, 1224, this.i, this.j, 0, 33);
            return;
        }
        dr dr2 = dg.C[this.cm.c];
        dr dr3 = dg.C[this.cm.e];
        dr dr4 = dg.C[this.cm.d];
        if (this.o == 1) {
            ab.a(t2, dr2.a[bp.bA[this.am][0][0]].a, this.i + bp.bA[this.am][0][1] + dr2.a[bp.bA[this.am][0][0]].b, this.j - bp.bA[this.am][0][2] + dr2.a[bp.bA[this.am][0][0]].c, 0, 0);
            ab.a(t2, dr3.a[bp.bA[this.am][1][0]].a, this.i + bp.bA[this.am][1][1] + dr3.a[bp.bA[this.am][1][0]].b, this.j - bp.bA[this.am][1][2] + dr3.a[bp.bA[this.am][1][0]].c, 0, 0);
            ab.a(t2, dr4.a[bp.bA[this.am][2][0]].a, this.i + bp.bA[this.am][2][1] + dr4.a[bp.bA[this.am][2][0]].b, this.j - bp.bA[this.am][2][2] + dr4.a[bp.bA[this.am][2][0]].c, 0, 0);
        } else {
            ab.a(t2, dr2.a[bp.bA[this.am][0][0]].a, this.i - bp.bA[this.am][0][1] - dr2.a[bp.bA[this.am][0][0]].b, this.j - bp.bA[this.am][0][2] + dr2.a[bp.bA[this.am][0][0]].c, 2, 24);
            ab.a(t2, dr3.a[bp.bA[this.am][1][0]].a, this.i - bp.bA[this.am][1][1] - dr3.a[bp.bA[this.am][1][0]].b, this.j - bp.bA[this.am][1][2] + dr3.a[bp.bA[this.am][1][0]].c, 2, 24);
            ab.a(t2, dr4.a[bp.bA[this.am][2][0]].a, this.i - bp.bA[this.am][2][1] - dr4.a[bp.bA[this.am][2][0]].b, this.j - bp.bA[this.am][2][2] + dr4.a[bp.bA[this.am][2][0]].c, 2, 24);
        }
        if (this.bU >= 0 && this.bV != null && this.aN == 0) {
            ab.a(t2, this.bV.b[this.bU].c, this.i + this.bV.b[this.bU].a, this.j + this.bV.b[this.bU].b, 0, 3);
            if (main.a.w % 2 == 0) {
                ++this.bU;
                if (this.bU >= this.bV.b.length) {
                    this.bU = 0;
                }
            }
        }
        if (bp.d().aU != null && bp.d().aU.equals(this)) {
            dd.j.a(t2, this.cm.b, this.i, this.j - this.ag - dd.g.c() - 7, 2, dd.k);
            ab.a(t2, 988, this.i, this.j - this.ag - 2, 0, 33);
            return;
        }
        dd.j.a(t2, this.cm.b, this.i, this.j - this.ag - 3 - dd.g.c(), 2, dd.k);
    }
}

