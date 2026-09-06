/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class aj {
    private int a;
    private int b;
    private int c;
    private Image d;
    private int[] e;
    private int f;

    public aj(Image image, int n2, int n3) {
        this.d = image;
        this.a = n2;
        this.b = n3;
        this.f = image.getHeight();
        this.c = this.f / n3;
        this.e = new int[this.c];
        int n4 = 0;
        while (n4 < this.c) {
            this.e[n4] = n4 * n3;
            ++n4;
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, t t2) {
        if (n2 >= 0 && n2 < this.c) {
            t2.a(this.d, 0, this.e[n2], this.a, this.b, n5, n3, n4, n6);
        }
    }
}

