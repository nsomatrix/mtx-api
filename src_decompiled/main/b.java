/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
package main;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import main.c;

public final class b
extends Canvas {
    public static b a;
    private c b;
    private int c = 1;
    private int d;
    private int e;
    private static boolean f;

    static {
        f = true;
    }

    public b() {
        this.setFullScreenMode(true);
        t.b = 1;
        if (!f) {
            if (this.getWidth() * this.getHeight() > 2073600) {
                this.c = 4;
                t.b = 4;
                this.d = this.getWidth() / this.c + 2;
                this.e = this.getHeight() / this.c + 2;
                return;
            }
            if (this.getWidth() * this.getHeight() > 153600) {
                this.c = 3;
                t.b = 3;
                this.d = this.getWidth() / this.c + 2;
                this.e = this.getHeight() / this.c + 2;
                return;
            }
            this.c = 1;
            t.b = 1;
        }
    }

    public final void a(c c2) {
        this.b = c2;
    }

    protected final void paint(Graphics graphics) {
        this.b.a(graphics);
    }

    protected final void keyPressed(int n2) {
        this.b.c(n2);
    }

    protected final void keyReleased(int n2) {
        this.b.d(n2);
    }

    protected final void pointerDragged(int n2, int n3) {
        this.b.a(n2 /= this.c, n3 /= this.c);
    }

    protected final void pointerPressed(int n2, int n3) {
        this.b.b(n2 /= this.c, n3 /= this.c);
    }

    protected final void pointerReleased(int n2, int n3) {
        this.b.c(n2 /= this.c, n3 /= this.c);
    }

    public final int a() {
        if (this.c == 1) {
            return this.getHeight();
        }
        return this.e;
    }

    public final int b() {
        if (this.c == 1) {
            return this.getWidth();
        }
        return this.d;
    }
}

