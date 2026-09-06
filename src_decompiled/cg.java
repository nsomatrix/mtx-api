/*
 * Decompiled with CFR 0.152.
 */
public final class cg {
    public int a;
    public byte b;
    public do c;

    public cg() {
    }

    public cg(int n2, int n3) {
        this.a = n3;
        this.c = dg.Y[n2];
    }

    public final String a() {
        if (this.c.c == 9) {
            String string = cg.a(this.a);
            return at.a(this.c.b, "#", string);
        }
        return at.a(this.c.b, "#", String.valueOf(this.a));
    }

    private static String a(int n2) {
        if (n2 % 100 == 0) {
            return String.valueOf(n2 / 100);
        }
        if (n2 % 10 == 0) {
            return String.valueOf(n2 / 100) + "." + n2 % 100 / 10;
        }
        return String.valueOf(n2 / 100) + "." + n2 % 100 / 10 + n2 % 10;
    }

    public final String b() {
        String string;
        Object var1_1 = null;
        int n2 = 0;
        if (this.c.a == 0 || this.c.a == 1 || this.c.a == 21 || this.c.a == 22 || this.c.a == 23 || this.c.a == 24 || this.c.a == 25 || this.c.a == 26) {
            n2 = this.a - 50 + 1;
            string = String.valueOf(at.a(this.c.b, "#", String.valueOf(this.a))) + " (" + n2 + "-" + this.a + ")";
        } else if (this.c.a == 6 || this.c.a == 7 || this.c.a == 8 || this.c.a == 9 || this.c.a == 19) {
            n2 = this.a - 10 + 1;
            string = String.valueOf(at.a(this.c.b, "#", String.valueOf(this.a))) + " (" + n2 + "-" + this.a + ")";
        } else if (this.c.a == 2 || this.c.a == 3 || this.c.a == 4 || this.c.a == 5 || this.c.a == 10 || this.c.a == 11 || this.c.a == 12 || this.c.a == 13 || this.c.a == 14 || this.c.a == 15 || this.c.a == 17 || this.c.a == 18 || this.c.a == 20) {
            n2 = this.a - 5 + 1;
            string = String.valueOf(at.a(this.c.b, "#", String.valueOf(this.a))) + " (" + n2 + "-" + this.a + ")";
        } else if (this.c.a == 16) {
            n2 = this.a - 3 + 1;
            string = String.valueOf(at.a(this.c.b, "#", String.valueOf(this.a))) + " (" + n2 + "-" + this.a + ")";
        } else if (this.c.c == 9) {
            string = cg.a(this.a);
            string = at.a(this.c.b, "#", string);
        } else {
            string = at.a(this.c.b, "#", String.valueOf(this.a));
        }
        return string;
    }
}

