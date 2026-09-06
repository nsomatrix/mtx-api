/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.a;

public final class dd {
    private int u;
    private int v;
    private Image w;
    private String x;
    private int[][] y;
    private static String z = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():a\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7bcd\u0111e\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7fghi\u00ed\u00ec\u1ec9\u0129\u1ecbjklmno\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3pqrstu\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1vxy\u00fd\u1ef3\u1ef7\u1ef9\u1ef5zwA\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eb0\u1eae\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eacBCD\u0110E\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6FGHI\u00cd\u00cc\u1ec8\u0128\u1ecaJKLMNO\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2PQRSTU\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0VXY\u00dd\u1ef2\u1ef6\u1ef8\u1ef4ZW";
    public static dd a = new dd(z, "/font/tahoma_7b_red.png", "/font/tahoma_7b", 0, 0);
    public static dd b = new dd(z, "/font/tahoma_7b_blue.png", "/font/tahoma_7b", 0, 0);
    public static dd c = new dd(z, "/font/tahoma_7b_purple.png", "/font/tahoma_7b", 0, 0);
    public static dd d = new dd(z, "/font/tahoma_7b_yellow.png", "/font/tahoma_7b", 0, 0);
    public static dd e = new dd(z, "/font/tahoma_7b_white.png", "/font/tahoma_7b", 0, 0);
    public static dd f = new dd(z, "/font/tahoma_7b_green.png", "/font/tahoma_7b", 0, 0);
    public static dd g = new dd(z, "/font/tahoma_7.png", "/font/tahoma_7", 0, 0);
    public static dd h = new dd(z, "/font/tahoma_7_blue1.png", "/font/tahoma_7", 0, 0);
    public static dd i = new dd(z, "/font/tahoma_7_white.png", "/font/tahoma_7", 0, 0);
    public static dd j = new dd(z, "/font/tahoma_7_yellow.png", "/font/tahoma_7", 0, 0);
    public static dd k = new dd(z, "/font/tahoma_7_grey.png", "/font/tahoma_7", 0, 0);
    public static dd l = new dd(z, "/font/tahoma_7_red.png", "/font/tahoma_7", 0, 0);
    public static dd m = new dd(z, "/font/tahoma_7_blue.png", "/font/tahoma_7", 0, 0);
    public static dd n = new dd(z, "/font/tahoma_7_green.png", "/font/tahoma_7", 0, 0);
    public static dd o = new dd(z, "/font/tahoma_8b.png", "/font/tahoma_8b", -1, 0);
    public static dd p = new dd(" 0123456789+-", "/font/number_yellow.png", "/font/number", 0, 0);
    public static dd q = new dd(" 0123456789+-", "/font/number_red.png", "/font/number", 0, 0);
    public static dd r = new dd(" 0123456789+-", "/font/number_green.png", "/font/number", 0, 0);
    public static dd s = new dd(" 0123456789+-", "/font/number_white.png", "/font/number", 0, 0);
    public static dd t = new dd(" 0123456789+-", "/font/number_orange.png", "/font/number", 0, 0);
    private String A;

    private dd(String string, String object, String string2, int n2, byte by2) {
        try {
            ((dd)((Object)iOException2)).x = string;
            ((dd)((Object)iOException2)).u = n2;
            ((dd)((Object)iOException2)).A = object;
            FilterInputStream filterInputStream = null;
            ((dd)((Object)iOException2)).a();
            try {
                filterInputStream = new DataInputStream(iOException2.getClass().getResourceAsStream(string2));
                ((dd)((Object)iOException2)).y = new int[((DataInputStream)filterInputStream).readShort()][];
                int n3 = 0;
                while (n3 < ((dd)((Object)iOException2)).y.length) {
                    ((dd)((Object)iOException2)).y[n3] = new int[4];
                    ((dd)((Object)iOException2)).y[n3][0] = ((DataInputStream)filterInputStream).readShort();
                    ((dd)((Object)iOException2)).y[n3][1] = ((DataInputStream)filterInputStream).readShort();
                    ((dd)((Object)iOException2)).y[n3][2] = ((DataInputStream)filterInputStream).readShort();
                    ((dd)((Object)iOException2)).y[n3][3] = ((DataInputStream)filterInputStream).readShort();
                    int n4 = ((dd)((Object)iOException2)).y[n3][3];
                    object = iOException2;
                    ((dd)((Object)iOException2)).v = n4;
                    ++n3;
                }
                return;
            }
            catch (Exception exception) {
                try {
                    filterInputStream.close();
                    return;
                }
                catch (IOException iOException) {
                    IOException iOException2 = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a() {
        this.w = main.a.c(this.A);
    }

    public final void b() {
        this.w = null;
    }

    public final int c() {
        dd dd2 = this;
        return this.v;
    }

    public final int a(String string) {
        int n2 = 0;
        dd dd2 = this;
        int n3 = 0;
        while (n3 < string.length()) {
            int n4 = this.x.indexOf(string.charAt(n3));
            if (n4 == -1) {
                n4 = 0;
            }
            n2 += this.y[n4][2] + this.u;
            ++n3;
        }
        return n2;
    }

    public final void a(t t2, String string, int n2, int n3, int n4) {
        int n5 = string.length();
        n4 = n4 == 0 ? n2 : (n4 == 1 ? n2 - this.a(string) : n2 - (this.a(string) >> 1));
        dd dd2 = this;
        int n6 = 0;
        while (n6 < n5) {
            int n7 = this.x.indexOf(string.charAt(n6));
            if (n7 == -1) {
                n7 = 0;
            }
            if (n7 > -1) {
                t2.a(this.w, this.y[n7][0], this.y[n7][1], this.y[n7][2], this.y[n7][3], 0, n4, n3, 20);
            }
            n4 += this.y[n7][2] + this.u;
            ++n6;
        }
    }

    public final void a(t t2, String string, int n2, int n3, int n4, dd dd2) {
        int n5 = string.length();
        n4 = n4 == 0 ? n2 : (n4 == 1 ? n2 - this.a(string) : n2 - (this.a(string) >> 1));
        dd dd3 = this;
        int n6 = 0;
        while (n6 < n5) {
            int n7 = this.x.indexOf(string.charAt(n6));
            if (n7 == -1) {
                n7 = 0;
            }
            if (n7 > -1) {
                t2.a(dd2.w, this.y[n7][0], this.y[n7][1], this.y[n7][2], this.y[n7][3], 0, n4 + 1, n3, 20);
                t2.a(dd2.w, this.y[n7][0], this.y[n7][1], this.y[n7][2], this.y[n7][3], 0, n4, n3 + 1, 20);
                t2.a(this.w, this.y[n7][0], this.y[n7][1], this.y[n7][2], this.y[n7][3], 0, n4, n3, 20);
            }
            n4 += this.y[n7][2] + this.u;
            ++n6;
        }
    }

    public final aa a(String string, int n2) {
        aa aa2 = new aa();
        String string2 = "";
        int n3 = 0;
        while (n3 < string.length()) {
            if (string.charAt(n3) == '\n') {
                aa2.addElement(string2);
                string2 = "";
            } else {
                if (this.a(string2 = String.valueOf(string2) + string.charAt(n3)) > n2) {
                    int n4 = 0;
                    n4 = string2.length() - 1;
                    while (n4 >= 0) {
                        if (string2.charAt(n4) == ' ') break;
                        --n4;
                    }
                    if (n4 < 0) {
                        n4 = string2.length() - 1;
                    }
                    aa2.addElement(string2.substring(0, n4));
                    n3 = n3 - (string2.length() - n4) + 1;
                    string2 = "";
                }
                if (n3 == string.length() - 1 && !string2.trim().equals("")) {
                    aa2.addElement(string2);
                }
            }
            ++n3;
        }
        return aa2;
    }

    public final String[] b(String stringArray, int n2) {
        aa aa2 = ((dd)((Object)aa2)).a((String)stringArray, n2);
        stringArray = new String[aa2.size()];
        n2 = 0;
        while (n2 < aa2.size()) {
            stringArray[n2] = ((Vector)aa2).elementAt(n2).toString();
            ++n2;
        }
        return stringArray;
    }
}

