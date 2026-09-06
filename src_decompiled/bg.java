/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bg {
    public aa a;
    private static bg h;
    public int b = 0;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public aa g = new aa();

    public final void a() {
        ++this.b;
        if (this.b > this.a.size() - 1) {
            this.b = 0;
        }
    }

    public final void b() {
        --this.b;
        if (this.b < 0) {
            this.b = this.a.size() - 1;
        }
    }

    public final void a(int n2) {
        this.b = n2;
    }

    public final void a(bq bq2) {
        this.b = this.a.indexOf(bq2);
    }

    public final void c() {
        this.b = this.a.size() - 1;
    }

    public static bg d() {
        if (h == null) {
            h = new bg();
            return h;
        }
        return h;
    }

    public bg() {
        ((bg)((Object)bq3)).a = new aa();
        ((bg)((Object)bq3)).a.addElement(new bq(df.gI[0], 0));
        ((bg)((Object)bq3)).a.addElement(new bq(df.gJ[0], 1));
        ((bg)((Object)bq3)).a.addElement(new bq(df.gK[0], 3));
        ((bg)((Object)bq3)).a.addElement(new bq(df.gL[0], 4));
        bq bq2 = ((bg)((Object)bq3)).a(df.gK[0]);
        bq2.a("c8" + df.gK[1]);
        bq2.a("c8" + df.gK[2]);
        bq2.a("c8" + df.gK[3]);
        bq2 = ((bg)((Object)bq3)).a(df.gJ[0]);
        bq2.a("c8" + df.gJ[1]);
        bq2 = ((bg)((Object)bq3)).a(df.gL[0]);
        bq2.a("c8" + df.gL[1]);
        bq bq3 = ((bg)((Object)bq3)).a(df.gI[0]);
        bq3.a("c8" + df.gI[1]);
    }

    public final bq a(String string) {
        int n2 = 0;
        while (n2 < this.a.size()) {
            bq bq2 = (bq)this.a.elementAt(n2);
            if (bq2.b.equals(string)) {
                return bq2;
            }
            ++n2;
        }
        return null;
    }

    public final void a(String string, String string2, String string3) {
        bq bq2 = this.a(string);
        if (bq2 == null) {
            bq2 = this.b(string);
        }
        bq2.a(string2, string3);
    }

    public final bq e() {
        return (bq)this.a.elementAt(this.b);
    }

    public final bq b(String object) {
        object = new bq((String)object, 2);
        if (!main.a.g) {
            ((bq)object).a("c2" + df.gH);
        }
        this.a.addElement(object);
        return object;
    }

    public final void c(String string) {
        int n2 = 0;
        while (n2 < this.g.size()) {
            if (((String)this.g.elementAt(n2)).equals(string)) {
                return;
            }
            ++n2;
        }
        this.g.addElement(string);
    }

    public final boolean d(String string) {
        int n2 = 0;
        while (n2 < this.g.size()) {
            if (((String)this.g.elementAt(n2)).equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final void e(String string) {
        int n2 = 0;
        while (n2 < this.g.size()) {
            if (((String)this.g.elementAt(n2)).equals(string)) {
                this.g.removeElementAt(n2);
                return;
            }
            ++n2;
        }
    }

    public static void f() {
        h = null;
    }
}

