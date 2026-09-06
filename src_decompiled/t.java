/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class t {
    public Graphics a;
    public static int b = 1;

    public t(Graphics graphics) {
        this.a = graphics;
    }

    public t() {
    }

    public final void a(Image image, int n2, int n3, int n4) {
        this.a.drawImage(image, n2 *= b, n3 *= b, n4);
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a.drawLine(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void b(int n2, int n3, int n4, int n5) {
        this.a.drawRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void a(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.a.drawRegion(image, n2 *= b, n3 *= b, n4 *= b, n5 *= b, n6, n7 *= b, n8 *= b, n9);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.drawRoundRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b, n6 *= b, n7 *= b);
    }

    public final void c(int n2, int n3, int n4, int n5) {
        this.a.fillRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.fillRoundRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b, n6 *= b, n7 *= b);
    }

    public final int a() {
        return this.a.getTranslateX() / b;
    }

    public final int b() {
        return this.a.getTranslateY() / b;
    }

    public final void d(int n2, int n3, int n4, int n5) {
        this.a.setClip(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void a(int n2) {
        this.a.setColor(n2);
    }

    public final void a(int n2, int n3) {
        this.a.translate(n2 *= b, n3 *= b);
    }

    public static int a(Image image) {
        return image.getWidth() / b;
    }

    public static int b(Image image) {
        return image.getHeight() / b;
    }
}

