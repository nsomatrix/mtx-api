/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ca {
    public int a;
    private int b;
    private int c;

    public ca(int n2, int n3) {
        this.b = n2 * 24 + 12;
        this.c = n3 * 24 + 24 + 3;
    }

    private Object a() {
        Object object = af.w.a(String.valueOf(((ca)object).a));
        if (object != null) {
            return object;
        }
        return null;
    }

    public final void a(t t2) {
        if (main.a.a) {
            return;
        }
        if (this.a() != null) {
            t2.a((Image)this.a(), this.b, this.c, 33);
        }
    }
}

