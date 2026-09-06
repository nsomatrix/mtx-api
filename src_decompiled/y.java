/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.util.Vector;

public final class y {
    public long a;
    public aa b = new aa();
    private ab[] t;
    private byte[][] u;
    public byte[] c;
    private byte v;
    private byte w;
    public boolean d;
    public short e;
    private byte x;
    private byte[] y;
    private boolean z;
    public boolean f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte n;
    public byte o;
    public byte p;
    private aa A;
    private aa B;
    private aa C;
    private aa D;
    private aa E;
    private aa F;
    private aa G;
    public long q;
    private long H;
    public int r;
    public boolean s;
    private boolean I;

    static {
        new cq();
    }

    public y() {
        new aa();
        this.u = new byte[4][];
        new aa();
        this.e = 0;
        this.x = 0;
        this.y = new byte[4];
        this.f = false;
        this.A = new aa();
        this.B = new aa();
        this.C = new aa();
        this.D = new aa();
        this.E = new aa();
        this.F = new aa();
        this.G = new aa();
        new aa();
    }

    public y(short s2, boolean bl2) {
        new aa();
        this.u = new byte[4][];
        new aa();
        this.e = 0;
        this.x = 0;
        this.y = new byte[4];
        this.f = false;
        this.A = new aa();
        this.B = new aa();
        this.C = new aa();
        this.D = new aa();
        this.E = new aa();
        this.F = new aa();
        this.G = new aa();
        new aa();
        this.e = s2;
        this.z = bl2;
        this.a(null);
    }

    private void a(byte[] byArray) {
        try {
            cp cp2 = (cp)cu.c.a("" + this.e);
            if (cp2 != null && cp2.a != null) {
                byArray = cp2.a;
            }
            if (cp2 == null) {
                cp2 = new cp();
                cu.c.a("" + this.e, cp2);
                dq.a().R(this.e);
                System.currentTimeMillis();
            }
            if (byArray != null && byArray.length > 0) {
                this.b(byArray);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private void b(byte[] byArray) {
        if (byArray == null) {
            return;
        }
        FilterInputStream filterInputStream = null;
        try {
            try {
                int n2;
                this.b.removeAllElements();
                this.t = null;
                filterInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
                int n3 = ((DataInputStream)filterInputStream).readByte();
                this.t = new ab[n3];
                int n4 = 0;
                while (n4 < n3) {
                    this.t[n4] = new ab(((DataInputStream)filterInputStream).readUnsignedByte(), ((DataInputStream)filterInputStream).readUnsignedByte(), ((DataInputStream)filterInputStream).readUnsignedByte(), ((DataInputStream)filterInputStream).readUnsignedByte(), ((DataInputStream)filterInputStream).readUnsignedByte());
                    ++n4;
                }
                n3 = ((DataInputStream)filterInputStream).readShort();
                n4 = 0;
                while (n4 < n3) {
                    n2 = ((DataInputStream)filterInputStream).readByte();
                    aa aa2 = new aa();
                    aa aa3 = new aa();
                    int n5 = 0;
                    while (n5 < n2) {
                        cl cl2 = new cl(((DataInputStream)filterInputStream).readShort(), ((DataInputStream)filterInputStream).readShort(), ((DataInputStream)filterInputStream).readByte());
                        new cl(((DataInputStream)filterInputStream).readShort(), ((DataInputStream)filterInputStream).readShort(), ((DataInputStream)filterInputStream).readByte()).d = ((DataInputStream)filterInputStream).readByte();
                        cl2.e = ((DataInputStream)filterInputStream).readByte();
                        if (cl2.e == 0) {
                            aa2.addElement(cl2);
                        } else {
                            aa3.addElement(cl2);
                        }
                        ++n5;
                    }
                    this.b.addElement(new ai(aa2, aa3));
                    ++n4;
                }
                n4 = (short)((DataInputStream)filterInputStream).readUnsignedByte();
                this.c = new byte[n4];
                n2 = 0;
                int n6 = 0;
                while (n6 < n4) {
                    this.c[n6] = (byte)((DataInputStream)filterInputStream).readShort();
                    if (this.z) {
                        if (n2 == 2 && this.c[n6] != -1) {
                            this.A.addElement(String.valueOf(this.c[n6]));
                        }
                        if (n2 == 3 && this.c[n6] != -1) {
                            this.B.addElement(String.valueOf(this.c[n6]));
                        }
                        if (n2 == 4 && this.c[n6] != -1) {
                            this.C.addElement(String.valueOf(this.c[n6]));
                        }
                        if (n2 == 5 && this.c[n6] != -1) {
                            this.D.addElement(String.valueOf(this.c[n6]));
                        }
                        if (n2 == 6 && this.c[n6] != -1) {
                            this.E.addElement(String.valueOf(this.c[n6]));
                        }
                        if (n2 == 7 && this.c[n6] != -1) {
                            this.F.addElement(String.valueOf(this.c[n6]));
                        }
                        if (n2 == 8 && this.c[n6] != -1) {
                            this.G.addElement(String.valueOf(this.c[n6]));
                        }
                        if (this.c[n6] == -1) {
                            ++n2;
                        }
                    }
                    ++n6;
                }
                if (this.z) {
                    this.n = this.c[0];
                    this.o = this.c[2];
                    this.p = this.c[3];
                    this.k = y.a(this.A);
                    this.g = y.a(this.B);
                    this.h = y.a(this.C);
                    this.i = y.a(this.D);
                    this.j = y.a(this.E);
                    this.l = y.a(this.F);
                    if (this.l == null || this.l.length == 0) {
                        this.l = new byte[this.n];
                    }
                    this.m = y.a(this.G);
                    if (this.m == null || this.m.length == 0) {
                        this.m = new byte[this.n];
                    }
                    this.A.removeAllElements();
                    this.B.removeAllElements();
                    this.C.removeAllElements();
                    this.D.removeAllElements();
                    this.E.removeAllElements();
                    this.F.removeAllElements();
                    this.G.removeAllElements();
                }
                ((DataInputStream)filterInputStream).readByte();
                n4 = ((DataInputStream)filterInputStream).readByte();
                this.u[0] = new byte[n4];
                n6 = 0;
                while (n6 < n4) {
                    this.u[0][n6] = ((DataInputStream)filterInputStream).readByte();
                    ++n6;
                }
                n4 = ((DataInputStream)filterInputStream).readByte();
                this.u[1] = new byte[n4];
                n6 = 0;
                while (n6 < n4) {
                    this.u[1][n6] = ((DataInputStream)filterInputStream).readByte();
                    ++n6;
                }
                n4 = ((DataInputStream)filterInputStream).readByte();
                this.u[3] = new byte[n4];
                n6 = 0;
                while (n6 < n4) {
                    this.u[3][n6] = ((DataInputStream)filterInputStream).readByte();
                    ++n6;
                }
                this.d = true;
                try {
                    this.y[0] = (byte)(this.u[0].length - 7);
                    this.y[1] = (byte)(this.u[1].length - 7);
                    this.y[2] = (byte)(this.u[3].length - 7);
                    this.y[3] = (byte)(this.u[3].length - 7);
                }
                catch (Exception exception) {}
                this.y[0] = ((DataInputStream)filterInputStream).readByte();
                this.y[1] = ((DataInputStream)filterInputStream).readByte();
                this.y[2] = ((DataInputStream)filterInputStream).readByte();
                this.y[3] = this.y[2];
            }
            catch (Exception exception) {}
        }
        catch (Throwable throwable) {
            try {
                filterInputStream.close();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            filterInputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public y(short s2, long l2, int n2, boolean bl2) {
        new aa();
        this.u = new byte[4][];
        new aa();
        this.e = 0;
        this.x = 0;
        this.y = new byte[4];
        this.f = false;
        this.A = new aa();
        this.B = new aa();
        this.C = new aa();
        this.D = new aa();
        this.E = new aa();
        this.F = new aa();
        this.G = new aa();
        new aa();
        this.e = s2;
        this.q = l2;
        this.r = n2;
        this.f = bl2;
        this.a(null);
        if (l2 == -1L) {
            this.x = (byte)3;
            return;
        }
        if (l2 == 0L) {
            this.x = 1;
            return;
        }
        this.q += System.currentTimeMillis();
        this.x = (byte)2;
    }

    public final void a(long l2) {
        if (l2 == -1L) {
            this.x = (byte)3;
            return;
        }
        if (l2 == 0L) {
            this.x = 1;
            return;
        }
        this.x = (byte)2;
    }

    private static byte[] a(aa aa2) {
        byte[] byArray = null;
        byArray = new byte[aa2.size()];
        int n2 = 0;
        while (n2 < byArray.length) {
            byArray[n2] = Byte.parseByte((String)aa2.elementAt(n2));
            ++n2;
        }
        return byArray;
    }

    private boolean b() {
        if (this.d) {
            return true;
        }
        this.a(null);
        return false;
    }

    public final void a(t t2, int n2, int n3, int n4, int n5) {
        if (!this.b()) {
            return;
        }
        if (n4 < this.b.size()) {
            Object object = (ai)this.b.elementAt(n4);
            try {
                object = ((ai)object).b;
                int n6 = 0;
                while (n6 < ((Vector)object).size()) {
                    cl cl2 = (cl)((aa)object).elementAt(n6);
                    ab ab2 = this.t[cl2.a];
                    d d2 = cu.a(this.e);
                    if (d2 != null && d2.a != null) {
                        int n7 = cl2.b;
                        int n8 = ab2.e;
                        int n9 = ab2.f;
                        short s2 = ab2.c;
                        short s3 = ab2.d;
                        int n10 = d2.a.getWidth();
                        int n11 = d2.a.getHeight();
                        if (s2 > n10) {
                            s2 = 0;
                        }
                        if (s3 > n11) {
                            s3 = 0;
                        }
                        if (s2 + n8 > n10) {
                            n8 = n10 - s2;
                        }
                        if (s3 + n9 > n11) {
                            n9 = n11 - s3;
                        }
                        int n12 = n10 = cl2.d == 1 ? 2 : 0;
                        if (n5 == 2 || n5 == 6) {
                            n10 = n10 == 2 ? 0 : 2;
                            n7 = -(n7 + n8);
                        }
                        t2.a(d2.a, s2, s3, n8, n9, n10, n2 + n7, n3 + cl2.c, 0);
                    }
                    ++n6;
                }
                return;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
    }

    public final void b(t t2, int n2, int n3, int n4, int n5) {
        if (!this.b()) {
            return;
        }
        if (n4 < this.b.size()) {
            Object object = (ai)this.b.elementAt(n4);
            try {
                object = ((ai)object).a;
                int n6 = 0;
                while (n6 < ((Vector)object).size()) {
                    cl cl2 = (cl)((aa)object).elementAt(n6);
                    ab ab2 = this.t[cl2.a];
                    d d2 = cu.a(this.e);
                    if (d2 != null && d2.a != null) {
                        int n7 = cl2.b;
                        int n8 = ab2.e;
                        int n9 = ab2.f;
                        short s2 = ab2.c;
                        short s3 = ab2.d;
                        int n10 = d2.a.getWidth();
                        int n11 = d2.a.getHeight();
                        if (s2 > n10) {
                            s2 = 0;
                        }
                        if (s3 > n11) {
                            s3 = 0;
                        }
                        if (s2 + n8 > n10) {
                            n8 = n10 - s2;
                        }
                        if (s3 + n9 > n11) {
                            n9 = n11 - s3;
                        }
                        int n12 = n10 = cl2.d == 1 ? 2 : 0;
                        if (n5 == 2 || n5 == 6) {
                            n10 = n10 == 2 ? 0 : 2;
                            n7 = -(n7 + n8);
                        }
                        t2.a(d2.a, s2, s3, n8, n9, n10, n2 + n7, n3 + cl2.c, 0);
                    }
                    ++n6;
                }
                return;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
    }

    public final void a(t t2, int n2, int n3) {
        try {
            if (!this.b()) {
                return;
            }
            if (this.I) {
                return;
            }
            if (this.v < this.b.size()) {
                Object object = (ai)this.b.elementAt(this.v);
                object = ((ai)object).a;
                int n4 = 0;
                while (n4 < ((Vector)object).size()) {
                    cl cl2 = (cl)((aa)object).elementAt(n4);
                    ab ab2 = this.t[cl2.a];
                    d d2 = cu.a(this.e);
                    if (d2 != null && d2.a != null) {
                        short s2 = cl2.b;
                        int n5 = ab2.e;
                        int n6 = ab2.f;
                        short s3 = ab2.c;
                        short s4 = ab2.d;
                        if (s3 > d2.a.getWidth()) {
                            s3 = 0;
                        }
                        if (s4 > d2.a.getHeight()) {
                            s4 = 0;
                        }
                        if (s3 + n5 > d2.a.getWidth()) {
                            n5 = d2.a.getWidth() - s3;
                        }
                        if (s4 + n6 > d2.a.getHeight()) {
                            n6 = d2.a.getHeight() - s4;
                        }
                        t2.a(d2.a, s3, s4, n5, n6, cl2.d == 1 ? 2 : 0, n2 + s2, n3 + cl2.c, 0);
                    }
                    ++n4;
                }
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.e);
        }
    }

    public final void b(t t2, int n2, int n3) {
        try {
            if (!this.b()) {
                return;
            }
            if (this.I) {
                return;
            }
            if (this.v < this.b.size()) {
                Object object = (ai)this.b.elementAt(this.v);
                object = ((ai)object).b;
                int n4 = 0;
                while (n4 < ((Vector)object).size()) {
                    cl cl2 = (cl)((aa)object).elementAt(n4);
                    ab ab2 = this.t[cl2.a];
                    d d2 = cu.a(this.e);
                    if (d2 != null && d2.a != null) {
                        short s2 = cl2.b;
                        int n5 = ab2.e;
                        int n6 = ab2.f;
                        short s3 = ab2.c;
                        short s4 = ab2.d;
                        if (s3 > d2.a.getWidth()) {
                            s3 = 0;
                        }
                        if (s4 > d2.a.getHeight()) {
                            s4 = 0;
                        }
                        if (s3 + n5 > d2.a.getWidth()) {
                            n5 = d2.a.getWidth() - s3;
                        }
                        if (s4 + n6 > d2.a.getHeight()) {
                            n6 = d2.a.getHeight() - s4;
                        }
                        t2.a(d2.a, s3, s4, n5, n6, cl2.d == 1 ? 2 : 0, n2 + s2, n3 + cl2.c, 0);
                    }
                    ++n4;
                }
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.e);
        }
    }

    private void a(boolean bl2) {
        if (this.r > 0) {
            this.I = bl2;
            if (this.I) {
                this.H = System.currentTimeMillis() + (long)this.r;
                return;
            }
        } else {
            this.I = false;
        }
    }

    public final void a() {
        if (this.b.size() <= 0) {
            return;
        }
        try {
            if (!this.I) {
                switch (this.x) {
                    case 0: {
                        this.w = (byte)(this.w + 1);
                        if (this.w > this.c.length) {
                            this.s = true;
                            this.w = 0;
                        }
                        this.v = this.c[this.w];
                        return;
                    }
                    case 1: {
                        this.w = (byte)(this.w + 1);
                        if (this.w > this.c.length) {
                            this.w = 0;
                            this.s = true;
                        }
                        this.v = this.c[this.w];
                        return;
                    }
                    case 2: {
                        this.w = (byte)(this.w + 1);
                        if (this.q - System.currentTimeMillis() < 0L) {
                            this.s = true;
                        }
                        if (this.w > this.c.length) {
                            this.w = 0;
                        }
                        this.v = this.c[this.w];
                        return;
                    }
                    case 3: {
                        this.w = (byte)(this.w + 1);
                        if (this.w > this.c.length) {
                            this.w = 0;
                            this.a(true);
                        }
                        this.v = this.c[this.w];
                        return;
                    }
                }
                return;
            }
            if (this.H - System.currentTimeMillis() < 0L) {
                this.a(false);
                return;
            }
        }
        catch (Exception exception) {}
    }
}

