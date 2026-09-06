/*
 * Decompiled with CFR 0.152.
 */
public class as {
    public aa a = new aa();

    public final void a(t t2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.a.size()) {
            y y2 = (y)this.a.elementAt(n5);
            if (y2 != null) {
                int n6 = n3;
                if (y2.f) {
                    n6 = n3 + n4 + 4;
                }
                y2.a(t2, n2, n6);
            }
            ++n5;
        }
    }

    public final void b(t t2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.a.size()) {
            y y2 = (y)this.a.elementAt(n5);
            if (y2 != null) {
                int n6 = n3;
                if (y2.f) {
                    n6 = n3 + n4 + 4;
                }
                y2.b(t2, n2, n6);
            }
            ++n5;
        }
    }

    public final void a(byte by2, int n2) {
        int n3 = 0;
        while (n3 < this.a.size()) {
            y y2 = (y)this.a.elementAt(n3);
            if (y2 != null) {
                y2.a();
                if (y2.s) {
                    this.a.removeElement(y2);
                }
            }
            ++n3;
        }
        if (by2 == 0 && n2 == 14) {
            as as2 = this;
            as2.a.removeAllElements();
        }
        if (by2 == 1 && n2 == 0) {
            as as3 = this;
            as3.a.removeAllElements();
        }
    }
}

