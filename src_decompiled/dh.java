/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.microedition.io.SocketConnection;
import main.GameMidlet;

public final class dh {
    protected static dh a = new dh();
    public boolean b = false;
    private DataOutputStream q;
    public DataInputStream c;
    public an d;
    public SocketConnection e;
    public boolean f;
    public boolean g;
    private final aq r = new aq(this);
    public Thread h;
    public Thread i;
    public int j;
    public int k;
    boolean l;
    public byte[] m = null;
    private byte s;
    private byte t;
    long n;
    public String o = "";
    public static boolean p;
    private aa u;

    public static dh a() {
        return a;
    }

    public final boolean b() {
        return this.f;
    }

    public final void a(an an2) {
        this.d = an2;
    }

    public final void a(String string) {
        System.out.println("connect to " + string + ":" + GameMidlet.h);
        if (this.f || this.g) {
            return;
        }
        this.l = false;
        this.e = null;
        this.h = new Thread(new bs(this, string));
        f.a();
    }

    public final void a(ce ce2) {
        Object object = ((dh)object).r;
        object = ((aq)object).a;
        ((dh)object).u.addElement(ce2);
    }

    private synchronized void b(ce ce2) {
        byte[] byArray = ce2.a();
        try {
            int n2;
            if (this.l) {
                n2 = this.a(ce2.a);
                this.q.writeByte(n2);
            } else {
                this.q.writeByte(ce2.a);
            }
            String cfr_ignored_0 = "cmd send ---> " + ce2.a;
            if (byArray != null) {
                n2 = byArray.length;
                if (ce2.a != -31 && this.l) {
                    byte by2 = this.a((byte)(n2 >> 8));
                    this.q.writeByte(by2);
                    by2 = this.a((byte)n2);
                    this.q.writeByte(by2);
                } else {
                    this.q.writeShort(n2);
                }
                if (this.l) {
                    int n3 = 0;
                    while (n3 < byArray.length) {
                        byArray[n3] = this.a(byArray[n3]);
                        ++n3;
                    }
                }
                ((OutputStream)this.q).write(byArray);
                this.j += 5 + byArray.length;
            } else {
                this.q.writeShort(0);
                this.j += 5;
            }
            this.q.flush();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private byte a(byte by2) {
        byte by3 = this.t;
        this.t = (byte)(by3 + 1);
        by2 = (byte)(this.m[by3] & 0xFF ^ by2 & 0xFF);
        if (this.t >= this.m.length) {
            this.t = (byte)(this.t % this.m.length);
        }
        return by2;
    }

    public final void c() {
        this.d();
    }

    private void d() {
        ((dh)((Object)exception2)).m = null;
        ((dh)((Object)exception2)).s = 0;
        ((dh)((Object)exception2)).t = 0;
        try {
            ((dh)((Object)exception2)).f = false;
            ((dh)((Object)exception2)).g = false;
            if (((dh)((Object)exception2)).e != null) {
                ((dh)((Object)exception2)).e.close();
                ((dh)((Object)exception2)).e = null;
            }
            if (((dh)((Object)exception2)).q != null) {
                ((dh)((Object)exception2)).q.close();
                ((dh)((Object)exception2)).q = null;
            }
            if (((dh)((Object)exception2)).c != null) {
                ((dh)((Object)exception2)).c.close();
                ((dh)((Object)exception2)).c = null;
            }
            ((dh)((Object)exception2)).i = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    static void a(dh dh2, DataOutputStream dataOutputStream) {
        dh2.q = dataOutputStream;
    }

    static aq a(dh dh2) {
        return dh2.r;
    }

    static void a(dh dh2, ce ce2) {
        dh2.b(ce2);
    }

    static void a(dh dh2, aa aa2) {
        dh2.u = aa2;
    }

    static aa b(dh dh2) {
        return dh2.u;
    }

    static void c(dh dh2) {
        dh2.d();
    }

    static byte a(dh dh2, byte by2) {
        byte by3 = dh2.s;
        dh2.s = (byte)(by3 + 1);
        by2 = (byte)(dh2.m[by3] & 0xFF ^ by2 & 0xFF);
        if (dh2.s >= dh2.m.length) {
            dh2.s = (byte)(dh2.s % dh2.m.length);
        }
        return by2;
    }
}

