/*
 * Decompiled with CFR 0.152.
 */
public final class cr {
    public int a;
    public cm b;
    private String c;

    public final String a() {
        if (this.c == null) {
            if (this.b.a == 62 || this.b.a == 64 || this.b.a == 70) {
                float f2 = (float)this.a / 1000.0f;
                this.c = at.a(this.b.b, "#", String.valueOf(f2));
            } else {
                this.c = at.a(this.b.b, "#", String.valueOf(this.a));
            }
        }
        return this.c;
    }
}

