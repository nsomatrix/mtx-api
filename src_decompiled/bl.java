/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import main.GameMidlet;

public final class bl
extends au {
    private short e;
    private ak f;
    private int g;
    private int h;
    private int i;
    private int j;
    private byte k = 0;
    private long l = 0L;
    private static cc[] m = new cc[20];
    private static Hashtable n = new Hashtable();
    private static Hashtable o = new Hashtable();
    private boolean p;

    public static void a(short s2, int n2, int n3, byte by2, short s3, int n4) {
        bl bl2 = new bl();
        new bl().e = s2;
        bl2.g = n2;
        bl2.h = n3;
        bl2.k = by2;
        bl2.p = bl2.k < 0;
        bl2.l = s3 > 0 ? System.currentTimeMillis() + (long)(s3 * 1000) : -1L;
        bl2.j = n4;
        au.a.addElement(bl2);
    }

    private cc d() {
        return m[this.e];
    }

    public final void a(t t2) {
        if (this.f != null && this.f.a != null && this.d().c != null) {
            ct ct2 = this.d().b[this.d().c[this.i]];
            int n2 = 0;
            while (n2 < ct2.a.length) {
                byte by2 = ct2.c[n2];
                Object object = this.d();
                object = ((cc)object).a[by2];
                if (this.j > 0) {
                    t2.a(this.f.a, ((cv)object).a, ((cv)object).b, ((cv)object).c, ((cv)object).d, 0, this.g + ct2.a[n2], this.h + ct2.b[n2] - 1, 20);
                } else {
                    t2.a(this.f.a, ((cv)object).a, ((cv)object).b, ((cv)object).c, ((cv)object).d, 2, this.g - ct2.a[n2], this.h + ct2.b[n2] - 1, 24);
                }
                ++n2;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        block14: {
            try {
                block15: {
                    block16: {
                        bl.m[this.e] = (cc)bl.o.get(String.valueOf(this.e));
                        if (bl.m[this.e] == null) {
                            bl.m[this.e] = new cc();
                            bl.o.put(String.valueOf(this.e), bl.m[this.e]);
                            this.d().d = System.currentTimeMillis();
                            dq.a().a((byte)1, this.e);
                        } else if (this.d().c == null && System.currentTimeMillis() - this.d().d > 3000L) {
                            this.d().d = System.currentTimeMillis();
                            dq.a().a((byte)1, this.e);
                        }
                        if (this.d().c != null) {
                            this.f = (ak)bl.n.get(String.valueOf(this.e));
                            if (this.f == null) {
                                this.f = new ak();
                                bl.n.put(String.valueOf(this.e), this.f);
                                this.f.a = an.a(w.a("effauto " + this.e));
                                if (this.f.a == null) {
                                    this.f.b = System.currentTimeMillis();
                                    dq.a().a((byte)0, this.e);
                                }
                            } else if (this.f.a == null && System.currentTimeMillis() - this.f.b > 6000L) {
                                this.f.b = System.currentTimeMillis();
                                dq.a().a((byte)0, this.e);
                            }
                        }
                        if (this.f == null || this.f.a == null || this.d().c == null) break block14;
                        ++this.i;
                        if (this.i < this.d().c.length) break block15;
                        if (this.l == -1L) break block16;
                        if (this.l - System.currentTimeMillis() <= 0L) {
                            au.a.removeElement(this);
                        } else {
                            this.i = 0;
                        }
                        break block15;
                    }
                    if (this.p) ** GOTO lbl-1000
                    this.k = (byte)(this.k - 1);
                    if (this.k <= 0) {
                        au.a.removeElement(this);
                    } else lbl-1000:
                    // 2 sources

                    {
                        this.i = 0;
                    }
                }
                this.f.c = System.currentTimeMillis();
                return;
            }
            catch (Exception var0_1) {
                System.out.println("Err update effauto:" + var0_1.toString());
            }
        }
    }

    public static void a(short s2, byte[] byArray) {
        cc cc2 = (cc)o.get(String.valueOf(s2));
        if (cc2.c == null) {
            new cc();
            cc2 = bl.c(s2, byArray);
            o.put(String.valueOf(s2), cc2);
        }
    }

    private static cc c(short s2, byte[] object) {
        try {
            int n2;
            cc cc2 = new cc();
            object = new ByteArrayInputStream((byte[])object);
            object = new DataInputStream((InputStream)object);
            cc2.a = new cv[((DataInputStream)object).readByte()];
            int n3 = 0;
            while (n3 < cc2.a.length) {
                cc2.a[n3] = new cv();
                ((DataInputStream)object).readByte();
                cc2.a[n3].a = ((DataInputStream)object).readUnsignedByte();
                cc2.a[n3].b = ((DataInputStream)object).readUnsignedByte();
                cc2.a[n3].c = ((DataInputStream)object).readUnsignedByte();
                cc2.a[n3].d = ((DataInputStream)object).readUnsignedByte();
                ++n3;
            }
            cc2.b = new ct[((DataInputStream)object).readShort()];
            n3 = 0;
            while (n3 < cc2.b.length) {
                cc2.b[n3] = new ct();
                n2 = ((DataInputStream)object).readByte();
                cc2.b[n3].a = new short[n2];
                cc2.b[n3].b = new short[n2];
                cc2.b[n3].c = new byte[n2];
                int n4 = 0;
                while (n4 < n2) {
                    cc2.b[n3].a[n4] = ((DataInputStream)object).readShort();
                    cc2.b[n3].b[n4] = ((DataInputStream)object).readShort();
                    cc2.b[n3].c[n4] = ((DataInputStream)object).readByte();
                    ++n4;
                }
                ++n3;
            }
            n3 = ((DataInputStream)object).readShort();
            cc2.c = new short[n3];
            n2 = 0;
            while (n2 < n3) {
                cc2.c[n2] = ((DataInputStream)object).readShort();
                ++n2;
            }
            return cc2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void b(short s2, byte[] byArray) {
        ak ak2 = (ak)n.get(String.valueOf(s2));
        if (ak2 == null) {
            ak2 = new ak();
            n.put(String.valueOf(s2), ak2);
        }
        ak2.a = an.a(byArray);
        if (GameMidlet.a != 1) {
            w.b("effauto " + s2, byArray);
        }
    }

    public static void b() {
        try {
            Enumeration enumeration = n.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                ak ak2 = (ak)n.get(string);
                if (System.currentTimeMillis() - ak2.c <= 60000L) continue;
                n.remove(string);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void c() {
        try {
            Enumeration enumeration = o.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                cc cc2 = (cc)o.get(string);
                if (System.currentTimeMillis() - cc2.e <= 600000L) continue;
                o.remove(string);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

