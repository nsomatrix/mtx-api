/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class bq {
    public int a;
    public String b;
    public aa c = new aa();

    public bq(String string, int n2) {
        this.b = string;
        this.a = n2;
    }

    public bq() {
    }

    public final void a(String object, String string) {
        boolean bl2 = false;
        if (dg.aU && bg.d().e() == this && dg.V == this.c.size() - 1) {
            bl2 = true;
        }
        this.c.addElement("c3@" + (String)object);
        object = dd.i.a(string, 160);
        int n2 = 0;
        while (n2 < ((Vector)object).size()) {
            this.c.addElement("c0" + ((aa)object).elementAt(n2));
            ++n2;
        }
        if (bl2) {
            dg.n().I();
        }
        this.a();
    }

    private void a() {
        while (this.c.size() > 50) {
            this.c.removeElementAt(1);
        }
    }

    public final void a(String object) {
        boolean bl2 = false;
        if (dg.aU && bg.d().e() == this && dg.V == this.c.size() - 1) {
            bl2 = true;
        }
        object = dd.i.a((String)object, 160);
        int n2 = 0;
        while (n2 < ((Vector)object).size()) {
            this.c.addElement(((aa)object).elementAt(n2));
            ++n2;
        }
        if (bl2) {
            dg.n().I();
        }
        this.a();
    }
}

