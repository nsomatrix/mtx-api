/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import main.a;

public final class ad
implements cs {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    private boolean m = false;
    private static int n = 2;
    private static final int[] o = new int[]{18, 14, 11, 9, 6, 4, 2};
    private static int p = 0;
    private static String[] q = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb72", "def3\u0111\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec73", "ghi4\u00ed\u00ec\u1ec9\u0129\u1ecb4", "jkl5", "mno6\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee36", "pqrs7", "tuv8\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef18", "wxyz9\u00fd\u1ef3\u1ef7\u1ef9\u1ef59", "*", "#"};
    private static String[] r = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
    public String f = "";
    public String g = "";
    private String s = "";
    private String t = "";
    private String u = "";
    private int v = 0;
    private int w = 0;
    private int x = 500;
    private int y = 0;
    private int z = -1984;
    private int A = 0;
    private int B = 0;
    private int C = 10;
    private int D = 0;
    public static boolean h;
    private static int E;
    private int F = 0;
    private static int G;
    public static Canvas i;
    public static MIDlet j;
    public String k = "";
    public bd l;

    static {
        String[] stringArray = new String[]{"abc", "Abc", "ABC", "123"};
        G = 11;
        int[][] nArrayArray = new int[][]{{32, 48}, {49, 69}, {50, 84}, {51, 85}, {52, 68}, {53, 71}, {54, 74}, {55, 67}, {56, 66}, {57, 77}, {42, 128}, {35, 137}, {33, 113}, {63, 97}, {64, 121, 122}, {46, 111}, {44, 108}};
    }

    public final void a() {
        Object object;
        TextBox textBox = new TextBox(this.k, "", this.x, 0);
        textBox.addCommand(new Command(df.ax, 4, 0));
        textBox.addCommand(new Command("Cancel", 3, 0));
        textBox.setCommandListener((CommandListener)new bb(this, textBox));
        try {
            if (this.D == 2) {
                textBox.setConstraints(65536);
            } else if (this.D == 1) {
                textBox.setConstraints(2);
            } else {
                textBox.setConstraints(0);
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        object = this;
        textBox.setString(((ad)object).s);
        textBox.setMaxSize(this.x);
        Display.getDisplay((MIDlet)j).setCurrent((Displayable)textBox);
    }

    public static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z';
    }

    public ad() {
        p = dd.o.c() + 1;
        this.l = new bd(df.W, this, 1000, null);
        E = 0;
        if (w.c("qwerty") == 1) {
            h = true;
        }
    }

    public final void b() {
        if (this.v > 0 && this.s.length() > 0) {
            this.s = String.valueOf(this.s.substring(0, this.v - 1)) + this.s.substring(this.v, this.s.length());
            --this.v;
            this.e();
            this.f();
        }
    }

    private void e() {
        this.u = this.D == 2 ? this.t : this.s;
        if (this.y < 0 && dd.o.a(this.u) + this.y < this.c - 4 - 13) {
            this.y = this.c - 10 - dd.o.a(this.u);
        }
        if (this.y + dd.o.a(this.u.substring(0, this.v)) <= 0) {
            this.y = -dd.o.a(this.u.substring(0, this.v));
            this.y += 40;
        } else if (this.y + dd.o.a(this.u.substring(0, this.v)) >= this.c - 12) {
            this.y = this.c - 10 - dd.o.a(this.u.substring(0, this.v)) - 8;
        }
        if (this.y > 0) {
            this.y = 0;
        }
    }

    private void d(int n2) {
        if (!(this.D != 2 && this.D != 3 || n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 90 || n2 >= 97 && n2 <= 122)) {
            return;
        }
        if (this.s.length() < this.x) {
            String string = String.valueOf(this.s.substring(0, this.v)) + (char)n2;
            if (this.v < this.s.length()) {
                string = String.valueOf(string) + this.s.substring(this.v, this.s.length());
            }
            this.s = string;
            ++this.v;
            this.f();
            this.e();
        }
    }

    public final boolean a(int n2) {
        if (n2 == 8 || n2 == -8 || n2 == 204) {
            this.b();
            return true;
        }
        if (n2 >= 65 && n2 <= 122 && !h) {
            h = true;
            E = 0;
            w.a("qwerty", 1);
        }
        if (h) {
            if (n2 == 45) {
                if (n2 == this.z && this.A < o[n]) {
                    this.u = this.s = String.valueOf(this.s.substring(0, this.v - 1)) + '_';
                    this.f();
                    this.e();
                    this.z = -1984;
                    return false;
                }
                this.z = 45;
            }
            if (n2 >= 32) {
                this.d(n2);
                return false;
            }
        }
        if (n2 == G) {
            ++this.F;
            if (this.F > 3) {
                this.F = 0;
            }
            this.A = 1;
            this.z = n2;
            return false;
        }
        if (n2 == 42) {
            n2 = 58;
        }
        if (n2 == 35) {
            n2 = 59;
        }
        if (n2 >= 48 && n2 <= 59) {
            if (this.D == 0 || this.D == 2 || this.D == 3) {
                Object object = this.D == 2 || this.D == 3 ? r : q;
                if (n2 == this.z) {
                    this.B = (this.B + 1) % object[n2 - 48].length();
                    char c2 = object[n2 - 48].charAt(this.B);
                    c2 = this.F == 0 ? Character.toLowerCase(c2) : (this.F == 1 ? Character.toUpperCase(c2) : (this.F == 2 ? Character.toUpperCase(c2) : object[n2 - 48].charAt(object[n2 - 48].length() - 1)));
                    object = String.valueOf(this.s.substring(0, this.v - 1)) + c2;
                    if (this.v < this.s.length()) {
                        object = String.valueOf(object) + this.s.substring(this.v, this.s.length());
                    }
                    this.s = object;
                    this.A = o[n];
                    this.f();
                } else if (this.s.length() < this.x) {
                    if (this.F == 1 && this.z != -1984) {
                        this.F = 0;
                    }
                    this.B = 0;
                    char c3 = object[n2 - 48].charAt(this.B);
                    c3 = this.F == 0 ? Character.toLowerCase(c3) : (this.F == 1 ? Character.toUpperCase(c3) : (this.F == 2 ? Character.toUpperCase(c3) : object[n2 - 48].charAt(object[n2 - 48].length() - 1)));
                    object = String.valueOf(this.s.substring(0, this.v)) + c3;
                    if (this.v < this.s.length()) {
                        object = String.valueOf(object) + this.s.substring(this.v, this.s.length());
                    }
                    this.s = object;
                    this.A = o[n];
                    ++this.v;
                    this.f();
                    this.e();
                }
                this.z = n2;
            } else if (this.D == 1) {
                this.d(n2);
                this.A = 1;
            }
        } else {
            this.B = 0;
            this.z = -1984;
            if (n2 == 14) {
                if (this.v > 0) {
                    --this.v;
                    this.e();
                    this.C = 10;
                    return false;
                }
            } else if (n2 == 15) {
                if (this.v < this.s.length()) {
                    ++this.v;
                    this.e();
                    this.C = 10;
                    return false;
                }
            } else {
                if (n2 == 19) {
                    this.b();
                    return false;
                }
                this.z = n2;
            }
        }
        return true;
    }

    public final void a(t t2) {
        t2.d(0, 0, main.a.A, main.a.B);
        ad ad2 = this;
        boolean bl2 = ad2.e;
        this.u = this.D == 2 ? this.t : this.s;
        if (this.u.equals("")) {
            this.u = this.g;
        }
        ay.a(t2, bl2, this.a, this.b, this.c, this.d, 4 + this.y + this.a, this.b + (this.d - dd.o.c()) / 2, this.u);
        t2.d(this.a + 3, this.b + 1, this.c - 4, this.d - 4);
        t2.a(0);
        ad ad3 = this;
        if (ad3.e && this.A == 0 && (this.C > 0 || this.w / 5 % 2 == 0)) {
            t2.a(0xAAAAAA);
            t2.c(5 + this.y + this.a + dd.o.a(this.u.substring(0, this.v)) - 1, this.b + (this.d - p) / 2 + 1, 1, p);
        }
    }

    public final void b(t t2) {
        ad ad2 = this;
        boolean bl2 = ad2.e;
        this.u = this.D == 2 ? this.t : this.s;
        if (this.u.equals("")) {
            this.u = this.g;
        }
        ay.a(t2, bl2, this.a, this.b, this.c, 4 + this.y + this.a, this.b + (this.d - dd.o.c()) / 2, this.u);
        t2.a(0);
        ad ad3 = this;
        if (ad3.e && this.A == 0 && (this.C > 0 || this.w / 5 % 2 == 0)) {
            t2.a(0xAAAAAA);
            t2.c(5 + this.y + this.a + dd.o.a(this.u.substring(0, this.v)) - 1, this.b + (this.d - p) / 2 + 1, 1, p);
        }
    }

    private void f() {
        if (this.D == 2) {
            this.t = "";
            int n2 = 0;
            while (n2 < this.s.length()) {
                this.t = String.valueOf(this.t) + "*";
                ++n2;
            }
            if (this.A > 0 && this.v > 0) {
                this.t = String.valueOf(this.t.substring(0, this.v - 1)) + this.s.charAt(this.v - 1) + this.t.substring(this.v, this.t.length());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c() {
        ++this.w;
        if (this.A > 0) {
            --this.A;
            if (this.A == 0) {
                this.B = 0;
                if (this.F == 1 && this.z != G) {
                    this.F = 0;
                }
                this.z = -1984;
                this.f();
            }
        }
        if (this.C > 0) {
            --this.C;
        }
        if (!main.a.r) return;
        if (main.a.E == ao.a) {
            int n2;
            if (ao.a == null) {
                ao.a = new ao();
            }
            if (main.a.b(this.a, this.b - (n2 = ao.a.b.b), this.c, this.d)) {
                this.a();
                return;
            }
            this.e = false;
            return;
        }
        if (main.a.b(this.a, this.b, this.c, this.d)) {
            this.a();
            return;
        }
        this.e = false;
    }

    public final String d() {
        return this.s;
    }

    public final void a(String string) {
        if (string == null) {
            return;
        }
        this.z = -1984;
        this.A = 0;
        this.B = 0;
        this.s = string;
        this.u = string;
        this.f();
        this.v = string.length();
        this.e();
    }

    public final void b(int n2) {
        this.x = n2;
    }

    public final void c(int n2) {
        this.D = n2;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                this.b();
            }
        }
    }
}

