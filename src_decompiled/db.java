/*
 * Decompiled with CFR 0.152.
 */
public final class db {
    public int a;
    public int b;
    public short c;
    public String d;
    public boolean e;
    public bp f;
    public int g;

    public db(byte by2, int n2, String string, int n3) {
        switch (by2) {
            case 0: {
                this.c = (short)647;
                break;
            }
            case 1: {
                this.c = (short)1182;
                break;
            }
            case 2: {
                this.c = (short)1181;
                break;
            }
            case 3: {
                this.c = (short)643;
                break;
            }
            case 4: {
                this.c = (short)645;
                break;
            }
            case 5: {
                this.c = (short)676;
                break;
            }
            case 6: {
                this.c = (short)1119;
            }
        }
        this.d = string;
        this.b = n2;
        this.g = n3;
    }

    public db(int n2, byte by2, String string, boolean bl2) {
        this.a = n2;
        this.e = bl2;
        switch (by2) {
            case 0: {
                this.c = (short)647;
                break;
            }
            case 1: {
                this.c = (short)1182;
                break;
            }
            case 2: {
                this.c = (short)1181;
                break;
            }
            case 3: {
                this.c = (short)643;
                break;
            }
            case 4: {
                this.c = (short)645;
                break;
            }
            case 5: {
                this.c = (short)676;
                break;
            }
            case 6: {
                this.c = (short)1119;
            }
        }
        this.d = string;
        if (n2 == bp.d().p) {
            this.f = bp.d();
            return;
        }
        this.f = dg.e(n2);
    }

    public static void a() {
        int n2 = 0;
        while (n2 < dg.G.size()) {
            db db2 = (db)dg.G.elementAt(n2);
            if (db2.a != bp.d().p) {
                db2.f = dg.e(db2.a);
            }
            ++n2;
        }
    }

    public static void a(int n2) {
        int n3 = 0;
        while (n3 < dg.G.size()) {
            db db2 = (db)dg.G.elementAt(n3);
            if (db2.a == n2) {
                db2.f = null;
                return;
            }
            ++n3;
        }
    }
}

