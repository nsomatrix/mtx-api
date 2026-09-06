/*
 * Decompiled with CFR 0.152.
 */
public final class dl {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public bz h;
    public byte i;
    public ak j;

    public dl(short s2, short s3, int n2, int n3, int n4, int n5) {
        this.g = s2;
        this.h = e.a(s3);
        this.a = n4;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n4 - n2 >> 2;
        this.f = 5;
    }

    public dl(short s2, short s3, int n2, int n3) {
        this.g = s2;
        this.h = e.a(s3);
        this.a = this.c = n2;
        this.b = this.d = n3;
        this.i = 1;
    }

    public final void a(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.e = n2 - this.a >> 2;
        this.f = n3 - this.b >> 2;
        this.i = (byte)2;
    }
}

