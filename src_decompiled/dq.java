/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;
import main.GameMidlet;
import main.a;

public final class dq {
    private dh a = dh.a();
    private static dq b;
    private int c;
    private int d;

    public static dq a() {
        if (b == null) {
            b = new dq();
        }
        return b;
    }

    private static ce b(byte by2) {
        ce ce2 = new ce(-29);
        String cfr_ignored_0 = "CMD NOT_LOGIN ----> " + by2;
        ce2.c().writeByte(by2);
        return ce2;
    }

    private static ce c(byte by2) {
        ce ce2 = new ce(-28);
        String cfr_ignored_0 = "CMD NOT MAP ----> " + by2;
        ce2.c().writeByte(by2);
        return ce2;
    }

    private static ce d(byte by2) {
        ce ce2 = new ce(-30);
        String cfr_ignored_0 = "CMD SUB_COMMAND ----> " + by2;
        ce2.c().writeByte(by2);
        return ce2;
    }

    public final void b() {
        try {
            ce ce2 = dq.b((byte)-125);
            ce2.c().writeByte(GameMidlet.a);
            ce2.c().writeByte(t.b);
            ce2.c().writeBoolean(main.a.d);
            ce2.c().writeInt(main.a.A);
            ce2.c().writeInt(main.a.B);
            ce2.c().writeBoolean(ad.h);
            ce2.c().writeBoolean(main.a.g);
            ce2.c().writeUTF(System.getProperty("microedition.platform"));
            ce2.c().writeByte(0);
            ce2.c().writeInt(0);
            ce2.c().writeByte(df.a);
            ce2.c().writeInt(GameMidlet.e);
            ce2.c().writeUTF(GameMidlet.f);
            ((dq)((Object)iOException2)).a.a(ce2);
            ce2.d();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void a(String string, String string2, String string3) {
        dq.a().b();
        try {
            ce ce2 = dq.b((byte)-127);
            ce2.c().writeUTF(string);
            ce2.c().writeUTF(string2);
            ce2.c().writeUTF(string3);
            ce2.c().writeUTF("");
            ce2.c().writeUTF("");
            ce2.c().writeUTF(w.b("random"));
            ce2.c().writeByte(GameMidlet.h);
            ((dq)((Object)iOException2)).a.a(ce2);
            ce2.d();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void b(String string, String string2, String string3) {
        try {
            ce ce2 = new ce(118);
            ce2.c().writeUTF(string);
            ce2.c().writeUTF(string2);
            ce2.c().writeUTF(string3);
            this.a.a(ce2);
            ce2.d();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(String string) {
        try {
            ce ce2 = dq.b((byte)-122);
            ce2.c().writeUTF(string);
            this.a.a(ce2);
            ce2.d();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void c() {
        ce ce2 = new ce(-17);
        this.a.a(ce2);
        ce2.d();
    }

    public final void a(int n2, int n3) {
        ce ce2 = new ce(28);
        try {
            ce2.c().writeByte(n2);
            ce2.c().writeByte(n3);
            this.a.a(ce2);
            ce2.d();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b(int n2, int n3) {
        try {
            if (n2 - this.c != 0 || n3 - this.d != 0) {
                ce ce2 = new ce(1);
                ce2.c().writeShort(n2);
                ce2.c().writeShort(n3);
                this.c = n2;
                this.d = n3;
                this.a.a(ce2);
                ce2.d();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void b(String object) {
        ce ce2 = new ce(-28);
        try {
            ce2.c().writeByte(-126);
            ce2.c().writeUTF((String)object);
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        this.a.a(ce2);
    }

    public final void a(String object, int n2, int n3) {
        ce ce2 = new ce(-28);
        try {
            ce2.c().writeByte(-125);
            ce2.c().writeUTF((String)object);
            ce2.c().writeByte(n2);
            ce2.c().writeByte(n3);
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        this.a.a(ce2);
    }

    public final void a(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-108);
                ce2.c().writeShort(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(42);
                ce2.c().writeByte(n2);
                ce2.c().writeByte(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void d(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(94);
                ce2.c().writeInt(n2);
                ce2.c().writeByte(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void e(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-109);
                ce2.c().writeByte(n2);
                ce2.c().writeShort(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void f(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-108);
                ce2.c().writeShort(n2);
                ce2.c().writeByte(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(15);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(108);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void d(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(16);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void e(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(17);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void f(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(11);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
        if (bp.d().aB[n2] != null && bp.d().aB[n2].b.b == 24) {
            dg.n().v();
            b.a("");
        }
    }

    public final void g(int n2, int n3) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(14);
                ce2.c().writeByte(n2);
                if (n3 > 1) {
                    ce2.c().writeInt(n3);
                }
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(int n2, int n3, int n4) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(13);
                ce2.c().writeByte(n2);
                ce2.c().writeByte(n3);
                if (n4 > 1) {
                    ce2.c().writeShort(n4);
                }
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void g(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(41);
                ce2.c().writeShort(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void d() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-77);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void e() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(36);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void h(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(12);
                ce2.c().writeByte(n2);
                ce2.c().writeByte(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void h(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(40);
                ce2.c().writeShort(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(byte by2, int n2, int n3, int n4) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(29);
                ce2.c().writeByte(by2);
                ce2.c().writeByte(n2);
                ce2.c().writeByte(n3);
                ce2.c().writeByte(n4);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(short s2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(34);
                ce2.c().writeShort(s2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(short s2, String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(92);
                ce2.c().writeShort(s2);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void i(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-103);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void f() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-107);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void g() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-106);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void j(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-105);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void k(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-104);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(by[] byArray) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(19);
                int n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null) {
                        ce2.c().writeByte(byArray[n2].e);
                    }
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(by object, by[] byArray, boolean bl2) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(21);
                ce2.c().writeBoolean(bl2);
                ce2.c().writeByte(((by)object).e);
                int n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null) {
                        ce2.c().writeByte(byArray[n2].e);
                    }
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(by[] byArray) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(20);
                int n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null) {
                        ce2.c().writeByte(byArray[n2].e);
                    }
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(by by2) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(22);
                ce2.c().writeByte(by2.e);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void l(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(44);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void m(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(99);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void n(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(106);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void o(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(107);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void p(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(66);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void h() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(56);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void i() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(57);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void j() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(46);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(int n2, by[] byArray) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(45);
                ce2.c().writeInt(n2);
                n2 = 0;
                int n3 = 0;
                while (n3 < byArray.length) {
                    if (byArray[n3] != null) {
                        ++n2;
                    }
                    ++n3;
                }
                ce2.c().writeByte(n2);
                n3 = 0;
                while (n3 < byArray.length) {
                    if (byArray[n3] != null) {
                        ce2.c().writeByte(byArray[n3].e);
                    }
                    ++n3;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(aa aa2, aa aa3, int n2) {
        ce ce2 = null;
        if (n2 == 0) {
            return;
        }
        try {
            if (aa2.size() > 0 && aa3.size() > 0) {
                as as2;
                if (n2 == 1) {
                    ce2 = new ce(4);
                } else if (n2 == 2) {
                    ce2 = new ce(73);
                }
                ce2.c().writeByte(aa2.size());
                n2 = 0;
                while (n2 < aa2.size()) {
                    as2 = (ci)aa2.elementAt(n2);
                    ce2.c().writeByte(as2.m);
                    ++n2;
                }
                n2 = 0;
                while (n2 < aa3.size()) {
                    as2 = (bp)aa3.elementAt(n2);
                    if (as2 != null) {
                        ce2.c().writeInt(((bp)as2).p);
                    } else {
                        ce2.c().writeInt(-1);
                    }
                    ++n2;
                }
            } else if (aa2.size() > 0) {
                ce2 = new ce(60);
                n2 = 0;
                while (n2 < aa2.size()) {
                    ci ci2 = (ci)aa2.elementAt(n2);
                    ce2.c().writeByte(ci2.m);
                    ++n2;
                }
            } else if (aa3.size() > 0) {
                ce2 = new ce(61);
                n2 = 0;
                while (n2 < aa3.size()) {
                    bp bp2 = (bp)aa3.elementAt(n2);
                    ce2.c().writeInt(bp2.p);
                    ++n2;
                }
            }
            if (ce2 == null) {
                return;
            }
            this.a.a(ce2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void q(int n2) {
        ce ce2 = null;
        int n3 = 0;
        while (n3 < dg.N.size()) {
            dg.N.elementAt(n3);
            ++n3;
        }
        try {
            try {
                ce2 = new ce(-14);
                ce2.c().writeShort(n2);
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void r(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-12);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void k() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-9);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void l() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-10);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(int n2, int n3, int n4) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(47);
                ce2.c().writeByte(n2);
                ce2.c().writeByte(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-23);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void d(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-78);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void m() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-122);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void n() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-121);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void o() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-120);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void p() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-119);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void q() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-101);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void s(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(43);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void e(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(59);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void t(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(80);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void u(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(81);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void v(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(65);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void w(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(68);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void x(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-79);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void f(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(79);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void y(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-109);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void z(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-93);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void A(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-87);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void B(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-86);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void r() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(74);
                ce2.c().writeByte(bp.d().o);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void s() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-88);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(boolean bl2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-76);
                ce2.c().writeBoolean(bl2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void t() {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(83);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void u() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-85);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void C(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(100);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(aa aa2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(25);
                ce2.c().writeByte(aa2.size());
                int n2 = 0;
                while (n2 < aa2.size()) {
                    bp bp2 = (bp)aa2.elementAt(n2);
                    ce2.c().writeInt(bp2.p);
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void v() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-84);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void g(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-83);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void h(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(23);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void i(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(24);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(String string, int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(93);
                ce2.c().writeUTF(string);
                ce2.c().writeByte(0);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void j(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-20);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void k(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-21);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(String string, String string2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-22);
                ce2.c().writeUTF(string);
                ce2.c().writeUTF(string2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void l(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(-19);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(String string, String string2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-99);
                ce2.c().writeUTF(string);
                ce2.c().writeUTF(string2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(String string, byte[] byArray, byte by2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-67);
                ce2.c().writeUTF(string);
                ce2.c().writeInt(byArray.length);
                ((OutputStream)ce2.c()).write(byArray);
                ce2.c().write(by2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void m(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-65);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void D(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-70);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(String string, int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-97);
                ce2.c().writeInt(n2);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void E(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-115);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void w() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-113);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void x() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-112);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void y() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-111);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void z() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-114);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void F(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-63);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void G(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-61);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void H(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-62);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void I(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.d((byte)-60);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void n(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-95);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(String string, int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-94);
                ce2.c().writeUTF(string);
                ce2.c().writeByte(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void o(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-93);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void A() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-92);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void J(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-90);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void K(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-89);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void B() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-91);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(int n2, int n3, int n4) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-88);
                ce2.c().writeByte(n2);
                ce2.c().writeByte(n3);
                ce2.c().writeByte(n4);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void p(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-87);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void q(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-70);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void C() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-68);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void D() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-69);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void E() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-62);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void i(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-85);
                ce2.c().writeByte(n2);
                ce2.c().writeInt(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void L(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-105);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void M(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-102);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void j(int n2, int n3) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-104);
                ce2.c().writeInt(n2);
                ce2.c().writeInt(n3);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void N(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-103);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void F() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-82);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void G() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-79);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(by by2, int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(102);
                ce2.c().writeByte(by2.e);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void O(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(104);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void P(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(105);
                ce2.c().writeInt(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void H() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-72);
                ce2.c().writeByte(dg.U);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void r(String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-61);
                ce2.c().writeByte(dg.U);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void I() {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)-60);
                ce2.c().writeByte(dg.U);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(by[] byArray) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(110);
                int n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null && (byArray[n2].b.a == 10 || byArray[n2].b.a == 11)) {
                        ce2.c().writeByte(byArray[n2].e);
                        break;
                    }
                    ++n2;
                }
                n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null && (byArray[n2].b.a == 455 || byArray[n2].b.a == 456)) {
                        ce2.c().writeByte(byArray[n2].e);
                    }
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(by object, by[] byArray) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(111);
                ce2.c().writeByte(((by)object).e);
                int n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null && (byArray[n2].b.a == 455 || byArray[n2].b.a == 456 || byArray[n2].b.a == 457)) {
                        ce2.c().writeByte(byArray[n2].e);
                    }
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(by object, by[] byArray) {
        ce ce2;
        block8: {
            main.a.K.b();
            ce2 = null;
            ce2 = new ce(112);
            ce2.c().writeByte(((by)object).e);
            int n2 = 0;
            int n3 = 0;
            while (n3 < byArray.length) {
                if (byArray[n3] != null && byArray[n3].b.a == 454) {
                    ce2.c().writeByte(byArray[n3].e);
                    ++n2;
                }
                ++n3;
            }
            if (n2 >= 20) break block8;
            main.a.a(df.is);
            ce2.d();
            return;
        }
        try {
            try {
                this.a.a(ce2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            ce2.d();
        }
    }

    public final void Q(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(113);
                ce2.c().writeShort(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(String string, String string2, byte by2) {
        ce ce2 = null;
        string = String.valueOf(string) + " " + string2;
        try {
            try {
                ce2 = new ce(-21);
                ce2.c().writeUTF(string);
                ce2.c().writeByte(by2);
                this.a.a(ce2);
            }
            catch (Exception exception) {}
        }
        finally {
            ce2.d();
        }
    }

    public final void b(short s2, String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(118);
                ce2.c().writeUTF(string);
                ce2.c().writeShort(s2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void b(short s2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(119);
                ce2.c().writeByte(s2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(byte by2, String string) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(121);
                ce2.c().writeByte(by2);
                ce2.c().writeUTF(string);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(byte by2, short s2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)122);
                ce2.c().writeByte(by2);
                ce2.c().writeByte(s2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(short s2, String string, byte by2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(92);
                ce2.c().writeShort(s2);
                ce2.c().writeUTF(string);
                ce2.c().writeByte(by2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        try {
            ce ce2 = new ce(123);
            ce2.c().writeUTF(string);
            ce2.c().writeUTF(string2);
            ce2.c().writeUTF(string3);
            ce2.c().writeUTF(string4);
            ce2.c().writeUTF(string5);
            ce2.c().writeUTF(string6);
            ce2.c().writeUTF(string7);
            this.a.a(ce2);
            ce2.d();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(byte by2) {
        ce ce2 = null;
        try {
            try {
                ce2 = dq.c((byte)122);
                ce2.c().writeByte(4);
                ce2.c().writeByte(by2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void a(byte by2, by by3, by by4, by[] byArray) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(124);
                ce2.c().writeByte(by2);
                if (by2 == 0) {
                    ce2.c().writeByte(by3.e);
                    ce2.c().writeByte(by4.e);
                    by2 = 0;
                    while (by2 < byArray.length) {
                        if (byArray[by2] != null) {
                            ce2.c().writeByte(byArray[by2].e);
                        }
                        by2 = (byte)(by2 + 1);
                    }
                } else if (by2 == 1) {
                    ce2.c().writeByte(by4.e);
                    by2 = 0;
                    while (by2 < byArray.length) {
                        if (byArray[by2] != null) {
                            ce2.c().writeByte(byArray[by2].e);
                        }
                        by2 = (byte)(by2 + 1);
                    }
                } else if (by2 == 2 || by2 == 3) {
                    ce2.c().writeByte(by4.e);
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void d(by[] byArray) {
        main.a.K.b();
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(126);
                int n2 = 0;
                while (n2 < byArray.length) {
                    if (byArray[n2] != null) {
                        ce2.c().writeByte(byArray[n2].e);
                    }
                    ++n2;
                }
                this.a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void c(short s2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(125);
                ce2.c().writeByte(1);
                ce2.c().writeShort(s2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void R(int n2) {
        ce ce2 = null;
        try {
            try {
                ce2 = new ce(125);
                ce2.c().writeByte(2);
                ce2.c().writeShort(n2);
                ((dq)((Object)exception2)).a.a(ce2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        finally {
            ce2.d();
        }
    }

    public final void J() {
        ce ce2 = null;
        try {
            ce2 = dq.c((byte)-59);
            ce2.c().writeUTF(GameMidlet.k);
            ce2.c().writeUTF(GameMidlet.j);
            ((dq)((Object)exception2)).a.a(ce2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void S(int n2) {
        ce ce2 = null;
        try {
            ce2 = new ce(117);
            ce2.c().writeByte(0);
            ce2.c().writeByte(n2);
            ((dq)((Object)exception2)).a.a(ce2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

