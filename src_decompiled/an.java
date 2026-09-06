/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class an {
    private static an a;
    private ce b;

    public static an a() {
        if (a == null) {
            a = new an();
        }
        return a;
    }

    public final void b() {
        main.a.a(df.by, 8884, null);
    }

    private static void b(ce ce2) {
        try {
            int n2 = ce2.b().readUnsignedByte();
            by by2 = dg.aV.aD[n2];
            dg.aV.aD[n2].g = ce2.b().readLong();
            by2.n = ce2.b().readInt();
            by2.i = ce2.b().readByte();
            by2.c = new aa();
            try {
                while (true) {
                    by2.c.addElement(new cg(ce2.b().readUnsignedByte(), ce2.b().readInt()));
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void c(ce ce2) {
        try {
            by by2 = null;
            int n2 = ce2.b().readInt();
            int n3 = 0;
            while (n3 < dg.aF.length) {
                if (dg.aF[n3].a.d == n2) {
                    by2 = dg.aF[n3].a;
                    break;
                }
                ++n3;
            }
            by2.o = 37;
            by2.g = -1L;
            by2.n = ce2.b().readInt();
            if (by2.b() || by2.d()) {
                by2.c = new aa();
                try {
                    by2.j = ce2.b().readByte();
                    by2.i = ce2.b().readByte();
                    while (true) {
                        by2.c.addElement(new cg(ce2.b().readUnsignedByte(), ce2.b().readInt()));
                    }
                }
                catch (Exception exception) {
                    return;
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(ce var1_32) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 50[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a(DataInputStream dataInputStream) {
        dg.bt = dataInputStream.readByte();
        dg.Y = new do[dataInputStream.readUnsignedByte()];
        int n2 = 0;
        while (n2 < dg.Y.length) {
            dg.Y[n2] = new do();
            dg.Y[n2].a = n2;
            dg.Y[n2].b = dataInputStream.readUTF();
            dg.Y[n2].c = dataInputStream.readByte();
            ++n2;
        }
        n2 = dataInputStream.readShort();
        int n3 = 0;
        while (n3 < n2) {
            bz bz2 = new bz((short)n3, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean());
            e.a(bz2);
            ++n3;
        }
    }

    private static void b(DataInputStream dataInputStream) {
        dg.bs = dataInputStream.readByte();
        dg.Z = new cm[dataInputStream.readByte()];
        int n2 = 0;
        while (n2 < dg.Z.length) {
            dg.Z[n2] = new cm();
            dg.Z[n2].a = n2;
            dg.Z[n2].b = dataInputStream.readUTF();
            ++n2;
        }
        dg.T = new cx[dataInputStream.readUnsignedByte()];
        n2 = 0;
        while (n2 < dg.T.length) {
            dg.T[n2] = new cx();
            dg.T[n2].a = n2;
            dg.T[n2].b = dataInputStream.readUTF();
            dg.T[n2].c = new j[dataInputStream.readByte()];
            int n3 = 0;
            while (n3 < dg.T[n2].c.length) {
                dg.T[n2].c[n3] = new j();
                dg.T[n2].c[n3].a = dataInputStream.readByte();
                dg.T[n2].c[n3].b = dataInputStream.readUTF();
                dg.T[n2].c[n3].c = dataInputStream.readByte();
                dg.T[n2].c[n3].d = dataInputStream.readByte();
                dg.T[n2].c[n3].e = dataInputStream.readShort();
                int n4 = 150;
                if (main.a.A == 128 || main.a.B <= 208) {
                    n4 = 100;
                }
                dg.T[n2].c[n3].f = dd.i.b(dataInputStream.readUTF(), n4);
                dg.T[n2].c[n3].g = new z[dataInputStream.readByte()];
                n4 = 0;
                while (n4 < dg.T[n2].c[n3].g.length) {
                    dg.T[n2].c[n3].g[n4] = new z();
                    dg.T[n2].c[n3].g[n4].b = dataInputStream.readShort();
                    dg.T[n2].c[n3].g[n4].a = dg.T[n2].c[n3];
                    dg.T[n2].c[n3].g[n4].c = dataInputStream.readByte();
                    dg.T[n2].c[n3].g[n4].d = dataInputStream.readByte();
                    dg.T[n2].c[n3].g[n4].j = dataInputStream.readShort();
                    dg.T[n2].c[n3].g[n4].e = dataInputStream.readInt();
                    dg.T[n2].c[n3].g[n4].g = dataInputStream.readShort();
                    dg.T[n2].c[n3].g[n4].h = dataInputStream.readShort();
                    dg.T[n2].c[n3].g[n4].i = dataInputStream.readByte();
                    dg.T[n2].c[n3].g[n4].k = new cr[dataInputStream.readByte()];
                    int n5 = 0;
                    while (n5 < dg.T[n2].c[n3].g[n4].k.length) {
                        dg.T[n2].c[n3].g[n4].k[n5] = new cr();
                        dg.T[n2].c[n3].g[n4].k[n5].a = dataInputStream.readShort();
                        dg.T[n2].c[n3].g[n4].k[n5].b = dg.Z[dataInputStream.readByte()];
                        ++n5;
                    }
                    bc.a(dg.T[n2].c[n3].g[n4]);
                    ++n4;
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void c(DataInputStream dataInputStream) {
        int n2;
        dg.br = dataInputStream.readByte();
        af.u = new String[dataInputStream.readUnsignedByte()];
        int n3 = 0;
        while (n3 < af.u.length) {
            af.u[n3] = dataInputStream.readUTF();
            ++n3;
        }
        cy.cn = new bi[dataInputStream.readByte()];
        n3 = 0;
        while (n3 < cy.cn.length) {
            cy.cn[n3] = new bi();
            cy.cn[n3].a = n3;
            cy.cn[n3].b = dataInputStream.readUTF();
            cy.cn[n3].c = dataInputStream.readShort();
            cy.cn[n3].d = dataInputStream.readShort();
            cy.cn[n3].e = dataInputStream.readShort();
            cy.cn[n3].f = new String[dataInputStream.readByte()][];
            n2 = 0;
            while (n2 < cy.cn[n3].f.length) {
                cy.cn[n3].f[n2] = new String[dataInputStream.readByte()];
                int n4 = 0;
                while (n4 < cy.cn[n3].f[n2].length) {
                    cy.cn[n3].f[n2][n4] = dataInputStream.readUTF();
                    ++n4;
                }
                ++n2;
            }
            n3 = (byte)(n3 + 1);
        }
        short s2 = dataInputStream.readShort();
        n3 = s2;
        ci.b = new a[s2];
        n2 = 0;
        while (n2 < n3) {
            ci.b[n2] = new a();
            ci.b[n2].e = (short)n2;
            ci.b[n2].c = dataInputStream.readByte();
            ci.b[n2].g = dataInputStream.readUTF();
            ci.b[n2].f = dataInputStream.readInt();
            ci.b[n2].a = dataInputStream.readByte();
            ci.b[n2].b = dataInputStream.readByte();
            ++n2;
        }
    }

    private static void d(DataInputStream dataInputStream) {
        dg.bq = dataInputStream.readByte();
        w.a("nj_arrow", at.a(dataInputStream));
        w.a("nj_effect", at.a(dataInputStream));
        w.a("nj_image", at.a(dataInputStream));
        w.a("nj_part", at.a(dataInputStream));
        w.a("nj_skill", at.a(dataInputStream));
        byte[][] byArrayArray = new byte[dataInputStream.readByte()][];
        dg.bo = byArrayArray;
        dg.bp = new byte[byArrayArray.length][];
        int n2 = 0;
        while (n2 < dg.bo.length) {
            dg.bo[n2] = new byte[dataInputStream.readByte()];
            dg.bp[n2] = new byte[dg.bo[n2].length];
            int n3 = 0;
            while (n3 < dg.bo[n2].length) {
                dg.bo[n2][n3] = dataInputStream.readByte();
                dg.bp[n2][n3] = dataInputStream.readByte();
                ++n3;
            }
            ++n2;
        }
        dg.aW = new long[dataInputStream.readUnsignedByte()];
        n2 = 0;
        while (n2 < dg.aW.length) {
            dg.aW[n2] = dataInputStream.readLong();
            ++n2;
        }
        dg.aX = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.aX.length) {
            dg.aX[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.aY = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.aY.length) {
            dg.aY[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.aZ = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.aZ.length) {
            dg.aZ[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.ba = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.ba.length) {
            dg.ba[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.bb = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.bb.length) {
            dg.bb[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.bc = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.bc.length) {
            dg.bc[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.bd = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.bd.length) {
            dg.bd[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.be = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.be.length) {
            dg.be[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.bg = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.bg.length) {
            dg.bg[n2] = dataInputStream.readInt();
            ++n2;
        }
        dg.bf = new int[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < dg.bf.length) {
            dg.bf[n2] = dataInputStream.readInt();
            ++n2;
        }
        m.a = new dj[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < m.a.length) {
            m.a[n2] = new dj();
            m.a[n2].a = dataInputStream.readByte();
            m.a[n2].b = dataInputStream.readByte();
            dataInputStream.readUTF();
            m.a[n2].c = dataInputStream.readShort();
            ++n2;
        }
    }

    public static Image a(byte[] byArray) {
        try {
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void d(ce ce2) {
        try {
            Object object;
            int n2;
            int n3;
            Object object2;
            void var1_6;
            bp bp2 = bp.d();
            bp bp3 = bp.d();
            bp.d();
            short s2 = var1_6.b().readShort();
            bp3.bB = s2;
            bp2.i = s2;
            bp bp4 = bp.d();
            bp bp5 = bp.d();
            bp.d();
            short s3 = var1_6.b().readShort();
            bp5.bC = s3;
            bp4.j = s3;
            short s4 = var1_6.b().readByte();
            int n4 = 0;
            while (n4 < s4) {
                af.t.addElement(new ah(var1_6.b().readShort(), var1_6.b().readShort(), var1_6.b().readShort(), var1_6.b().readShort()));
                ++n4;
            }
            byte by2 = var1_6.b().readByte();
            n4 = 0;
            while (n4 < by2) {
                object2 = new ci((short)n4, var1_6.b().readBoolean(), var1_6.b().readBoolean(), var1_6.b().readBoolean(), var1_6.b().readBoolean(), var1_6.b().readBoolean(), var1_6.b().readShort(), var1_6.b().readByte(), var1_6.b().readInt(), var1_6.b().readUnsignedByte(), var1_6.b().readInt(), var1_6.b().readShort(), var1_6.b().readShort(), var1_6.b().readByte(), var1_6.b().readByte(), var1_6.b().readBoolean(), false);
                if (ci.b[((ci)object2).s].c != 0) {
                    ((ci)object2).g = n4 % 3 == 0 ? -1 : 1;
                    ((ci)object2).e += 10 - n4 % 20;
                }
                dg.Q.addElement(object2);
                n4 = (byte)(n4 + 1);
            }
            byte by3 = var1_6.b().readByte();
            n4 = 0;
            while (n4 < by3) {
                dg.S.addElement(new dk(var1_6.b().readUTF(), var1_6.b().readShort(), var1_6.b().readShort()));
                n4 = (byte)(n4 + 1);
            }
            byte by4 = var1_6.b().readByte();
            n4 = 0;
            while (n4 < by4) {
                dg.R.addElement(new cy(n4, var1_6.b().readByte(), var1_6.b().readShort(), var1_6.b().readShort(), var1_6.b().readByte()));
                ++n4;
            }
            byte by5 = var1_6.b().readByte();
            n4 = 0;
            while (n4 < by5) {
                object2 = new dl(var1_6.b().readShort(), var1_6.b().readShort(), var1_6.b().readShort(), var1_6.b().readShort());
                n3 = 0;
                n2 = 0;
                while (n2 < dg.N.size()) {
                    object = (dl)dg.N.elementAt(n2);
                    if (((dl)object).g == ((dl)object2).g) {
                        n3 = 1;
                        break;
                    }
                    ++n2;
                }
                if (n3 == 0) {
                    dg.N.addElement(object2);
                }
                ++n4;
            }
            dg.a(false);
            try {
                af.j = null;
                af.k = af.j = var1_6.b().readUTF();
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                af.v.clear();
                int n5 = var1_6.b().readUnsignedByte();
                int n6 = 0;
                while (n6 < n5) {
                    n3 = var1_6.b().readUnsignedByte();
                    n2 = var1_6.b().readUnsignedByte();
                    object = String.valueOf((short)(n2 * af.a + n3));
                    af.v.a((String)object, "location");
                    ++n6;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
            af.a(af.e);
            bp.d().k = 0;
            bp.d().n = 4;
            dg.n().p();
            main.a.b(af.m);
            bp.bH = false;
            bp.bG = false;
            main.a.i();
            main.a.h();
            dg.n().a();
            b.b();
            b.a(af.k, String.valueOf(df.fC) + " " + af.l, 30);
            db.a();
            main.a.j();
            main.a.f = false;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private void e(ce var1_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 41[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void f(ce ce2) {
        try {
            try {
                byte by2 = ce2.b().readByte();
                switch (by2) {
                    case -124: {
                        System.out.println("SEND SMS");
                        String string = ce2.b().readUTF();
                        String string2 = ce2.b().readUTF();
                        f.a(string2, "sms://" + string, new bd("", main.a.a(), 88825, null), new bd("", main.a.a(), 88826, null));
                        break;
                    }
                    case 2: {
                        w.a();
                    }
                }
            }
            catch (Exception exception) {}
        }
        finally {
            if (ce2 != null) {
                ce2.d();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void g(ce var1_42) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 35[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static boolean a(bp bp2, ce object) {
        try {
            short[] sArray;
            int n2;
            int n3;
            bp2.ac = ((ce)object).b().readUTF();
            if (!bp2.ac.equals("")) {
                bp2.ad = ((ce)object).b().readByte();
            }
            bp2.bh = ((ce)object).b().readBoolean();
            bp2.aN = ((ce)object).b().readByte();
            bp2.av = dg.T[((ce)object).b().readByte()];
            bp2.q = ((ce)object).b().readByte();
            bp2.bO = ((ce)object).b().readShort();
            bp2.ab = ((ce)object).b().readUTF();
            bp2.z = ((ce)object).b().readInt();
            bp2.B = ((ce)object).b().readInt();
            bp2.w = ((ce)object).b().readUnsignedByte();
            bp2.bR = ((ce)object).b().readShort();
            bp2.bQ = ((ce)object).b().readShort();
            bp2.bP = ((ce)object).b().readShort();
            byte by2 = ((ce)object).b().readByte();
            if (bp2.bR == -1) {
                bp2.k();
            }
            if (bp2.bQ == -1) {
                bp2.l();
            }
            if (bp2.bP == -1) {
                bp2.m();
            }
            if (by2 == -1) {
                bp2.aS = null;
            } else {
                n3 = bp2.i;
                n2 = bp2.j - 40;
                bp2.aS = new ci(-1, false, false, false, false, false, by2, 1, 0, 0, 0, (short)n3, (short)n2, 4, 0, false, false);
                bp2.aS.h = 5;
            }
            short s2 = ((ce)object).b().readShort();
            bp2.bD = s2;
            bp2.i = s2;
            short s3 = ((ce)object).b().readShort();
            bp2.bE = s3;
            bp2.j = s3;
            bp2.C = ((ce)object).b().readShort();
            bp2.D = ((ce)object).b().readShort();
            n3 = ((ce)object).b().readByte();
            n2 = 0;
            while (n2 < n3) {
                m m2 = new m(((ce)object).b().readByte(), ((ce)object).b().readInt(), ((ce)object).b().readInt(), ((ce)object).b().readShort());
                bp2.ay.addElement(m2);
                if (m2.e.b == 12 || m2.e.b == 11) {
                    bp2.bh = true;
                }
                ++n2;
            }
            if (!bp2.bh) {
                ap.a(60, bp2, 1);
            }
            if (bp2.z == 0) {
                bp2.n = 14;
                if (bp.d().p == bp2.p) {
                    dg.n().v();
                }
            }
            if (bp2.p == -bp.d().p) {
                n2 = 0;
                while (n2 < dg.R.size()) {
                    cy cy2 = (cy)dg.R.elementAt(n2);
                    if (cy2.cm.b.equals(bp2.ab)) {
                        v2.n = 15;
                        cy2.f = null;
                        break;
                    }
                    ++n2;
                }
            }
            bp2.b = ((ce)object).b().readBoolean();
            bp2.c = ((ce)object).b().readBoolean();
            if (bp2.B()) {
                ap.a(141, bp2.i, bp2.j, 0);
            }
            if ((sArray = new short[]{((ce)object).b().readShort(), ((ce)object).b().readShort(), ((ce)object).b().readShort(), ((ce)object).b().readShort()})[0] > -1) {
                bp2.bO = sArray[0];
            }
            if (sArray[1] > -1) {
                bp2.bR = sArray[1];
            }
            if (sArray[2] > -1) {
                bp2.bQ = sArray[2];
            }
            if (sArray[3] > -1) {
                bp2.bP = sArray[3];
            }
            Object object2 = new short[10];
            try {
                n3 = 0;
                while (n3 < 10) {
                    object2[n3] = ((ce)object).b().readShort();
                    ++n3;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            bp2.a((short[])object2);
            int n4 = 0;
            try {
                n4 = ((ce)object).b().readShort();
            }
            catch (Exception exception) {
                n4 = -1;
            }
            bp2.cf = (short)n4;
            object2 = bp2;
            int n5 = 0;
            while (n5 < dg.G.size()) {
                object = (db)dg.G.elementAt(n5);
                if (((db)object).a == object2.p) {
                    ((db)object).f = object2;
                    break;
                }
                ++n5;
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static void h(ce ce2) {
        try {
            byte by2 = ce2.b().readByte();
            int n2 = ce2.b().readUnsignedByte();
            by by3 = null;
            block2 : switch (by2) {
                case 3: {
                    int n3;
                    by3 = bp.d().aB[n2];
                    if (by3 != null) break;
                    if (dg.aJ != null && dg.aJ.e == n2) {
                        by3 = dg.aJ;
                    }
                    if (dg.aI != null && dg.aI.e == n2) {
                        by3 = dg.aI;
                    }
                    if (dg.aK != null && dg.aK.e == n2) {
                        by3 = dg.aK;
                    }
                    if (by3 == null && dg.aA != null) {
                        n3 = 0;
                        while (n3 < dg.aA.length) {
                            if (dg.aA[n3] != null && dg.aA[n3].e == n2) {
                                by3 = dg.aA[n3];
                                break;
                            }
                            ++n3;
                        }
                    }
                    if (by3 == null && dg.aE != null) {
                        n3 = 0;
                        while (n3 < dg.aE.length) {
                            if (dg.aE[n3] != null && dg.aE[n3].e == n2) {
                                by3 = dg.aE[n3];
                                break;
                            }
                            ++n3;
                        }
                    }
                    if (by3 == null && dg.az != null) {
                        n3 = 0;
                        while (n3 < dg.az.length) {
                            if (dg.az[n3] != null && dg.az[n3].e == n2) {
                                by3 = dg.az[n3];
                                break;
                            }
                            ++n3;
                        }
                    }
                    if (by3 == null && dg.aC != null) {
                        n3 = 0;
                        while (n3 < dg.aC.length) {
                            if (dg.aC[n3] != null && dg.aC[n3].e == n2) {
                                by3 = dg.aC[n3];
                                break;
                            }
                            ++n3;
                        }
                    }
                    if (by3 != null || dg.aB == null) break;
                    n3 = 0;
                    while (n3 < dg.aB.length) {
                        if (dg.aB[n3] != null && dg.aB[n3].e == n2) {
                            by3 = dg.aB[n3];
                            break block2;
                        }
                        ++n3;
                    }
                    break;
                }
                case 4: {
                    by3 = bp.d().aC[n2];
                    break;
                }
                case 39: {
                    by3 = bp.ae.p[dg.U];
                    break;
                }
                case 5: {
                    by3 = bp.d().aD[n2];
                    break;
                }
                case 20: {
                    by3 = dg.ab[n2];
                    break;
                }
                case 21: {
                    by3 = dg.ac[n2];
                    break;
                }
                case 22: {
                    by3 = dg.ad[n2];
                    break;
                }
                case 23: {
                    by3 = dg.ae[n2];
                    break;
                }
                case 24: {
                    by3 = dg.af[n2];
                    break;
                }
                case 25: {
                    by3 = dg.ag[n2];
                    break;
                }
                case 26: {
                    by3 = dg.ah[n2];
                    break;
                }
                case 27: {
                    by3 = dg.ai[n2];
                    break;
                }
                case 28: {
                    by3 = dg.aj[n2];
                    break;
                }
                case 29: {
                    by3 = dg.ak[n2];
                    break;
                }
                case 16: {
                    by3 = dg.al[n2];
                    break;
                }
                case 17: {
                    by3 = dg.am[n2];
                    break;
                }
                case 18: {
                    by3 = dg.an[n2];
                    break;
                }
                case 19: {
                    by3 = dg.ao[n2];
                    break;
                }
                case 2: {
                    by3 = dg.ap[n2];
                    break;
                }
                case 6: {
                    by3 = dg.aq[n2];
                    break;
                }
                case 7: {
                    by3 = dg.ar[n2];
                    break;
                }
                case 8: {
                    by3 = dg.as[n2];
                    break;
                }
                case 9: {
                    by3 = dg.at[n2];
                    break;
                }
                case 14: {
                    by3 = dg.au[n2];
                    break;
                }
                case 35: {
                    by3 = dg.av[n2];
                    break;
                }
                case 15: {
                    by3 = dg.ax[n2];
                    break;
                }
                case 32: {
                    by3 = dg.ay[n2];
                    break;
                }
                case 34: {
                    by3 = dg.aw[n2];
                    break;
                }
                case 30: {
                    by3 = dg.aD[n2];
                }
            }
            by3.g = ce2.b().readLong();
            if (by3.h()) {
                by3.n = ce2.b().readInt();
            } else if (by3.j() || by3.k() || by3.l() || by3.m() || by3.n() || by3.o()) {
                by3.k = ce2.b().readInt();
                by3.l = ce2.b().readInt();
                by3.m = ce2.b().readInt();
            }
            if (by3.b() || by3.c() || by3.d()) {
                by3.i = ce2.b().readByte();
                by3.c = new aa();
                try {
                    while (true) {
                        by3.c.addElement(new cg(ce2.b().readUnsignedByte(), ce2.b().readInt()));
                    }
                }
                catch (Exception exception) {}
            } else if (by3.b.a == 233) {
                by3.s = an.a(at.b(ce2));
            } else if (by3.b.a == 234) {
                by3.s = an.a(at.b(ce2));
            } else if (by3.b.a == 235) {
                by3.s = an.a(at.b(ce2));
            }
            if (by2 == 5) {
                bp.d().w();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("Controller.requestItemInfo()");
        }
    }

    private static void i(ce ce2) {
        try {
            byte by2 = ce2.b().readByte();
            byte by3 = 0;
            while (by3 < by2) {
                short s2 = (short)ce2.b().readUnsignedByte();
                boolean bl2 = ce2.b().readBoolean();
                boolean bl3 = ce2.b().readBoolean();
                boolean bl4 = ce2.b().readBoolean();
                boolean bl5 = ce2.b().readBoolean();
                boolean bl6 = ce2.b().readBoolean();
                short s3 = ce2.b().readShort();
                byte by4 = ce2.b().readByte();
                int n2 = ce2.b().readInt();
                int n3 = ce2.b().readUnsignedByte();
                int n4 = ce2.b().readInt();
                short s4 = ce2.b().readShort();
                short s5 = ce2.b().readShort();
                byte by5 = ce2.b().readByte();
                byte by6 = ce2.b().readByte();
                boolean bl7 = ce2.b().readBoolean();
                ci ci2 = new ci(s2, bl2, bl3, bl4, bl5, bl6, s3, by4, n2, n3, n4, s4, s5, by5, by6, bl7, true);
                if (ci.b[ci2.s].c != 0) {
                    ci2.g = by3 % 3 == 0 ? -1 : 1;
                    ci2.e += 10 - by3 % 20;
                }
                dg.Q.addElement(ci2);
                by3 = (byte)(by3 + 1);
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err addMob");
            return;
        }
    }

    private static void j(ce ce2) {
        try {
            short s2 = (short)ce2.b().readUnsignedByte();
            short s3 = ce2.b().readShort();
            short s4 = ce2.b().readShort();
            byte by2 = ce2.b().readByte();
            short s5 = ce2.b().readShort();
            bl.a(s2, s3, s4, by2, s5, 1);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err add effAuto");
            return;
        }
    }

    private static void k(ce ce2) {
        try {
            short s2 = (short)ce2.b().readUnsignedByte();
            short s3 = ce2.b().readShort();
            byte[] byArray = null;
            if (s3 > 0) {
                byArray = new byte[s3];
                ce2.b().read(byArray);
            }
            bl.a(s2, byArray);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err add effAuto");
            return;
        }
    }

    private static void l(ce object) {
        try {
            short s2 = (short)((ce)object).b().readUnsignedByte();
            object = at.a((ce)object);
            bl.b(s2, (byte[])object);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err getImgEffAuto");
            return;
        }
    }

    private static void m(ce ce2) {
        try {
            byte by2 = ce2.b().readByte();
            bp.d().au = ce2.b().readInt();
            bp.d().ar = ce2.b().readInt();
            bp.d().at = ce2.b().readInt();
            if (by2 == 0) {
                if (dg.aJ != null) {
                    dg.aJ = null;
                }
                if (dg.aB != null) {
                    int n2 = 0;
                    while (n2 < dg.aB.length) {
                        dg.aB[n2] = null;
                        ++n2;
                    }
                }
            } else if (by2 == 1) {
                if (dg.aJ != null) {
                    dg.aJ.h = true;
                    dg.aJ.j = ce2.b().readByte();
                    dg.ci = dg.D[53];
                    dg.ch = 0;
                }
                if (dg.aB != null) {
                    int n3 = 0;
                    while (n3 < dg.aB.length) {
                        dg.aB[n3] = null;
                        ++n3;
                    }
                }
            } else if ((by2 == 2 || by2 == 3) && dg.aB != null) {
                int n4 = 0;
                while (n4 < dg.aB.length) {
                    dg.aB[n4] = null;
                    ++n4;
                }
            }
            dg.n().l = null;
            dg.n().k = null;
            dg.n().B();
            main.a.j();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err getImgEffAuto");
            return;
        }
    }

    private static void n(ce ce2) {
        block7: {
            try {
                as as2;
                int n2;
                byte by2 = ce2.b().readByte();
                if (by2 == 1) {
                    n2 = ce2.b().readUnsignedByte();
                    as2 = ci.a(n2);
                } else {
                    n2 = ce2.b().readInt();
                    as2 = n2 == bp.d().p ? bp.d() : dg.e(n2);
                }
                if (as2 == null) {
                    return;
                }
                n2 = ce2.b().readShort();
                int bl2 = ce2.b().readInt();
                int y3 = ce2.b().readByte();
                byte by3 = ce2.b().readByte();
                by3 = by3 == 0 ? (byte)0 : 1;
                int n3 = n2;
                byte by4 = by3;
                n2 = y3 * 1000;
                long l2 = bl2;
                int n5 = n3;
                as as3 = as2;
                y3 = 0;
                while (y3 < as3.a.size()) {
                    y y2 = (y)as3.a.elementAt(y3);
                    if (y2 != null && y2.e == n5) {
                        y2.q = l2 + System.currentTimeMillis();
                        y2.r = n2;
                        y2.a(l2);
                        break block7;
                    }
                    ++y3;
                }
                y y4 = new y((short)n5, l2, n2, by4 != 0);
                as3.a.addElement(y4);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void o(ce object) {
        try {
            short s2 = (short)((ce)object).b().readUnsignedByte();
            object = at.a((ce)object);
            cu.a(s2, (byte[])object);
            d d2 = (d)cu.b.a("" + s2);
            if (d2 == null) {
                d2 = new d();
                cu.b.a(String.valueOf(s2), d2);
            }
            d2.a = an.a((byte[])object);
            if (GameMidlet.a != 1) {
                w.b("ImgEffect " + s2, (byte[])object);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err getImgEffect");
        }
    }

    private static void p(ce object) {
        try {
            short s2 = (short)((ce)object).b().readUnsignedByte();
            short s3 = ((ce)object).b().readShort();
            byte[] byArray = null;
            if (s3 > 0) {
                byArray = new byte[s3];
                ((ce)object).b().read(byArray);
            }
            if ((object = (cp)cu.c.a("" + s2)) != null) {
                byte[] byArray2 = byArray;
                if (byArray2 != null) {
                    ((cp)object).a = byArray2;
                }
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("err getDataEffect ");
        }
    }

    private static void a(ce ce2, int n2) {
        try {
            int n3;
            ci.b[n2].i = new cv[ce2.b().readByte()];
            int n4 = 0;
            while (n4 < ci.b[n2].i.length) {
                ci.b[n2].i[n4] = new cv();
                ce2.b().readByte();
                ci.b[n2].i[n4].a = ce2.b().readUnsignedByte();
                ci.b[n2].i[n4].b = ce2.b().readUnsignedByte();
                ci.b[n2].i[n4].c = ce2.b().readUnsignedByte();
                ci.b[n2].i[n4].d = ce2.b().readUnsignedByte();
                ++n4;
            }
            ci.b[n2].j = new ct[ce2.b().readShort()];
            n4 = 0;
            while (n4 < ci.b[n2].j.length) {
                ci.b[n2].j[n4] = new ct();
                n3 = ce2.b().readByte();
                ci.b[n2].j[n4].a = new short[n3];
                ci.b[n2].j[n4].b = new short[n3];
                ci.b[n2].j[n4].c = new byte[n3];
                int n5 = 0;
                while (n5 < n3) {
                    ci.b[n2].j[n4].a[n5] = ce2.b().readShort();
                    ci.b[n2].j[n4].b[n5] = ce2.b().readShort();
                    ci.b[n2].j[n4].c[n5] = ce2.b().readByte();
                    ++n5;
                }
                ++n4;
            }
            n4 = ce2.b().readShort();
            n3 = 0;
            while (n3 < n4) {
                ce2.b().readShort();
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void b(ce ce2, int n2) {
        try {
            int n3;
            int n4;
            int n5 = 0;
            ci.b[n2].i = new cv[ce2.b().readByte()];
            n5 = 0;
            while (n5 < ci.b[n2].i.length) {
                ci.b[n2].i[n5] = new cv();
                ce2.b().readByte();
                ci.b[n2].i[n5].a = ce2.b().readUnsignedByte();
                ci.b[n2].i[n5].b = ce2.b().readUnsignedByte();
                ci.b[n2].i[n5].c = ce2.b().readUnsignedByte();
                ci.b[n2].i[n5].d = ce2.b().readUnsignedByte();
                ++n5;
            }
            ci.b[n2].j = new ct[ce2.b().readShort()];
            n5 = 0;
            while (n5 < ci.b[n2].j.length) {
                ci.b[n2].j[n5] = new ct();
                n4 = ce2.b().readByte();
                ci.b[n2].j[n5].a = new short[n4];
                ci.b[n2].j[n5].b = new short[n4];
                ci.b[n2].j[n5].c = new byte[n4];
                ci.b[n2].j[n5].d = new byte[n4];
                ci.b[n2].j[n5].e = new byte[n4];
                n3 = 0;
                while (n3 < n4) {
                    ci.b[n2].j[n5].a[n3] = ce2.b().readShort();
                    ci.b[n2].j[n5].b[n3] = ce2.b().readShort();
                    ci.b[n2].j[n5].c[n3] = ce2.b().readByte();
                    ci.b[n2].j[n5].d[n3] = ce2.b().readByte();
                    ci.b[n2].j[n5].e[n3] = ce2.b().readByte();
                    ++n3;
                }
                ++n5;
            }
            n5 = (short)ce2.b().readUnsignedByte();
            ci.b[n2].n = new byte[n5];
            n4 = 0;
            while (n4 < n5) {
                ci.b[n2].n[n4] = (byte)ce2.b().readShort();
                ++n4;
            }
            ce2.b().readByte();
            n4 = 0;
            while (n4 < 4) {
                if (n4 != 2) {
                    n5 = ce2.b().readByte();
                    ci.b[n2].m[n4] = new byte[n5];
                    n3 = 0;
                    while (n3 < n5) {
                        ci.b[n2].m[n4][n3] = ce2.b().readByte();
                        ++n3;
                    }
                }
                ++n4;
            }
            try {
                ci.b[n2].o[0] = (byte)(ci.b[n2].m[0].length - 7);
                ci.b[n2].o[1] = (byte)(ci.b[n2].m[1].length - 7);
                ci.b[n2].o[2] = (byte)(ci.b[n2].m[3].length - 7);
                ci.b[n2].o[3] = (byte)(ci.b[n2].m[3].length - 7);
            }
            catch (Exception exception) {
                String cfr_ignored_0 = "loi read data mod " + exception.toString();
            }
            int n6 = 0;
            while (n6 < 3) {
                ci.b[n2].o[n6] = ce2.b().readByte();
                ++n6;
            }
            ci.b[n2].o[3] = ci.b[n2].o[2];
            return;
        }
        catch (Exception exception) {
            String cfr_ignored_1 = "loi ham read data new mob " + n2 + " " + exception.toString();
            return;
        }
    }
}

