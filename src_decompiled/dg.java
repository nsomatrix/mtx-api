/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class dg
extends ag
implements cs {
    public static dg a;
    public static int b;
    public static int c;
    public static int d;
    private static int cq;
    private static int cr;
    public static int e;
    public static int f;
    private static int cs;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    private static int ct;
    private static int cu;
    private static int cv;
    private static int cw;
    public static int r;
    public static int s;
    private static int cx;
    private static int cy;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static aa x;
    private bd cz;
    private bd cA;
    private bd cB;
    private bd cC;
    private bd cD;
    private bd cE;
    private bd cF;
    private bd cG;
    public static int y;
    public static int z;
    public static n[] A;
    public static bx[] B;
    public static dr[] C;
    public static g[] D;
    private int cH = 0;
    private boolean cI = false;
    public static aa E;
    public static aa F;
    public static aa G;
    public static aa H;
    public static aa I;
    public static aa J;
    public static aa K;
    public static aa L;
    public static aa M;
    public static aa N;
    public static aa O;
    public static aa P;
    public static aa Q;
    public static aa R;
    public static aa S;
    private static aa cJ;
    public static cx[] T;
    private static int cK;
    private static int cL;
    public static int U;
    public static int V;
    private static int cM;
    public static int W;
    public static int X;
    private by cN;
    public static do[] Y;
    public static cm[] Z;
    private static bw cO;
    public static bw aa;
    public static by[] ab;
    public static by[] ac;
    public static by[] ad;
    public static by[] ae;
    public static by[] af;
    public static by[] ag;
    public static by[] ah;
    public static by[] ai;
    public static by[] aj;
    public static by[] ak;
    public static by[] al;
    public static by[] am;
    public static by[] an;
    public static by[] ao;
    public static by[] ap;
    public static by[] aq;
    public static by[] ar;
    public static by[] as;
    public static by[] at;
    public static by[] au;
    public static by[] av;
    public static by[] aw;
    public static by[] ax;
    public static by[] ay;
    public static by[] az;
    public static by[] aA;
    public static by[] aB;
    public static by[] aC;
    public static by[] aD;
    public static by[] aE;
    public static bu[] aF;
    public static short[] aG;
    public int aH;
    public static by aI;
    public static by aJ;
    public static by aK;
    private static boolean cP;
    private static boolean cQ;
    private static boolean cR;
    private static boolean cS;
    public static boolean aL;
    private static boolean cT;
    public static boolean aM;
    private static boolean cU;
    public static boolean aN;
    public static boolean aO;
    private static boolean cV;
    private static boolean cW;
    private static boolean cX;
    public static boolean aP;
    private static boolean cY;
    private static boolean cZ;
    public static boolean aQ;
    private static boolean da;
    public static boolean aR;
    private static boolean db;
    private static boolean dc;
    private static boolean dd;
    private static boolean de;
    private static boolean df;
    private static boolean dg;
    private static boolean dh;
    private static boolean di;
    private static boolean dj;
    private static boolean dk;
    private static boolean dl;
    private static boolean dm;
    private static boolean dn;
    private static boolean do;
    private static boolean dp;
    private static boolean dq;
    private static boolean dr;
    private static boolean ds;
    private static boolean dt;
    private static boolean du;
    private static boolean dv;
    private static boolean dw;
    private static boolean dx;
    private static boolean dy;
    private static boolean dz;
    private static boolean dA;
    private static boolean dB;
    private static boolean dC;
    public static boolean aS;
    private static boolean dD;
    public static boolean aT;
    public static boolean aU;
    private static boolean dE;
    private static boolean dF;
    private static boolean dG;
    private static boolean dH;
    private static boolean dI;
    private static boolean dJ;
    private static boolean dK;
    private static boolean dL;
    private static boolean dM;
    private static boolean dN;
    private static boolean dO;
    private static boolean dP;
    private static boolean dQ;
    private static boolean dR;
    public static bp aV;
    public static long[] aW;
    public static int[] aX;
    public static int[] aY;
    public static int[] aZ;
    public static int[] ba;
    public static int[] bb;
    public static int[] bc;
    public static int[] bd;
    public static int[] be;
    public static int[] bf;
    public static int[] bg;
    private static int[] dS;
    private int dT = 6;
    private int[] dU;
    private int[] dV;
    public int bh = 0;
    public int bi = 0;
    public int bj = 0;
    public int bk = 0;
    public int bl = 0;
    private int dW = 0;
    private int dX = 0;
    private int dY = 0;
    private int dZ = -1;
    public int bm = -1;
    public int bn = -1;
    private boolean ea;
    public static byte[][] bo;
    public static byte[][] bp;
    private aa eb;
    private String ec;
    private ad ed = null;
    public static byte bq;
    public static byte br;
    public static byte bs;
    public static byte bt;
    public static byte bu;
    public static byte bv;
    public static byte bw;
    public static byte bx;
    private static Image ee;
    private static Image ef;
    private static Image eg;
    private static Image eh;
    private static Image ei;
    private static Image ej;
    private static Image ek;
    private static Image el;
    private static Image em;
    private static Image en;
    private static Image eo;
    private static Image ep;
    private static Image eq;
    private static Image er;
    public static Image by;
    public static Image bz;
    public static Image bA;
    public static Image bB;
    private static Image es;
    public static Image bC;
    public static Image bD;
    public String bE = "";
    public String bF = "";
    public int bG;
    public int bH;
    private static byte et;
    public static byte bI;
    private int[] eu = new int[2];
    private int[] ev = new int[2];
    private int[] ew;
    private int[] ex;
    public long bJ;
    public String[] bK = new String[]{"10000", "20000", "30000", "50000", "100000", "200000", "500000", "1000000", "5000000"};
    public int bL;
    public int bM;
    public String[] bN;
    public static aa bO;
    public static aa bP;
    public static aa bQ;
    public static Image bR;
    public static Image bS;
    public static Image bT;
    public static Image bU;
    public static Image bV;
    public static Image bW;
    public static boolean bX;
    public static boolean bY;
    private static z[] ey;
    private static z[] ez;
    private bd eA;
    private bd eB;
    private bd eC;
    private bd eD;
    private bd eE;
    private bd eF;
    private static byte eG;
    static int bZ;
    static int ca;
    private long eH;
    public static int cb;
    public boolean cc = false;
    private int eI = 0;
    private int eJ = -1;
    private long eK;
    private int eL = 0;
    private static int eM;
    private static int eN;
    private static int eO;
    private static int eP;
    private static int eQ;
    private static int eR;
    private static int eS;
    private static int eT;
    private static int eU;
    private static int eV;
    private static int eW;
    private static int eX;
    private static int eY;
    private static int eZ;
    private static int fa;
    private static int fb;
    private static int fc;
    private static int fd;
    private static int[] fe;
    private static int[] ff;
    private static int fg;
    private static int fh;
    private static int fi;
    private static String[] fj;
    private static int[] fk;
    private static int[] fl;
    private static int[] fm;
    private static int[] fn;
    private static int[] fo;
    private static int[] fp;
    private static int[] fq;
    private static int[] fr;
    private static int[] fs;
    private static int[] ft;
    private static int[] fu;
    private static Image[] fv;
    private static int fw;
    private static int fx;
    private static int fy;
    private static int fz;
    private static int fA;
    private static int fB;
    private static int fC;
    private static int fD;
    private static int fE;
    private static int fF;
    private static int fG;
    private static int fH;
    private static Image[] fI;
    public static int cd;
    public static int ce;
    private static int fJ;
    private static boolean fK;
    private int fL;
    private String[] fM;
    private String[] fN;
    private int fO;
    private bd fP;
    private bd fQ;
    private bd fR;
    private bd fS;
    private bd fT;
    private bd fU;
    private bd fV;
    private bd fW;
    private bd fX;
    private bd fY;
    private bd fZ;
    private bd ga;
    private bd gb;
    private bd gc;
    private bd gd;
    private bd ge;
    private bd gf;
    private bd gg;
    private bd gh;
    private bd gi;
    private bd gj;
    private bd gk;
    private bd gl;
    private bd gm;
    private bd gn;
    private bd go;
    private bd gp;
    private bd gq;
    private bd gr;
    private bd gs;
    private bd gt;
    private bd gu;
    private bd gv;
    private bd gw;
    private bd gx;
    private bd gy;
    private bd gz;
    private bd gA;
    private String gB;
    private String gC;
    private static int gD;
    private static int gE;
    public static int cf;
    public static int cg;
    private static int gF;
    private static int gG;
    private static int gH;
    private static int gI;
    private static int gJ;
    private static int gK;
    private int gL;
    private int[] gM;
    private int[][] gN;
    private int[] gO;
    private static String gP;
    public static int ch;
    public static g ci;
    private static int gQ;
    private static int gR;
    private static int gS;
    private static int gT;
    public bd cj;
    private bd gU;
    private bd gV;
    private bd gW;
    private bd gX;
    private bd gY;
    private bd gZ;
    private bd ha;
    public static String ck;
    public static String cl;
    private int hb;
    private int hc;
    private String hd;
    private long he;
    private static long hf;
    private static int hg;
    private static int[] hh;
    private static int[] hi;
    private static boolean hj;
    public static int cm;
    public static int cn;
    public static int co;
    private short hk;
    private short hl;
    private short hm;
    private String hn;
    private String ho;
    private String hp;
    private String hq;
    private String hr;
    private long hs;
    private boolean ht;
    public static byte cp;
    private dd hu;
    private byte[] hv;
    private byte hw;
    private aa hx;
    private int hy;
    private int hz;
    private int hA;
    private int hB;
    private int hC;
    private int hD;
    private int hE;
    private int hF;
    private int hG;
    private int hH;
    private int hI;
    private int hJ;
    private int hK;
    private int hL;
    private int hM;
    private int hN;
    private String hO;
    private int[] hP;
    private int[] hQ;
    private int hR;
    private int[][] hS;
    private static int hT;

    static {
        x = new aa();
        E = new aa();
        F = new aa();
        G = new aa();
        H = new aa();
        I = new aa();
        J = new aa();
        K = new aa();
        L = new aa();
        M = new aa();
        N = new aa();
        O = new aa();
        P = new aa();
        Q = new aa();
        R = new aa();
        S = new aa();
        cJ = new aa();
        cK = 28;
        cL = 0;
        U = 0;
        V = -1;
        W = 0;
        X = -1;
        cO = new bw();
        aa = new bw();
        new aa();
        cR = false;
        cS = false;
        aL = true;
        aM = false;
        cU = false;
        aN = false;
        aO = false;
        cV = false;
        cW = false;
        cX = false;
        aP = false;
        cY = false;
        cZ = false;
        aQ = false;
        da = false;
        aR = false;
        db = false;
        dc = false;
        dd = false;
        de = false;
        df = false;
        dg = false;
        dh = false;
        di = false;
        dj = false;
        dk = false;
        dl = false;
        dm = false;
        dn = false;
        do = false;
        dp = false;
        dq = false;
        dr = false;
        ds = false;
        dt = false;
        du = false;
        dv = false;
        dw = false;
        dx = false;
        dy = false;
        dz = false;
        dA = false;
        dB = false;
        dC = false;
        aS = false;
        dD = false;
        aT = false;
        aU = false;
        dE = false;
        dF = false;
        dG = false;
        dH = false;
        dP = false;
        dQ = false;
        dR = false;
        int[] nArray = new int[11];
        nArray[1] = 5000;
        nArray[2] = 40000;
        nArray[3] = 135000;
        nArray[4] = 320000;
        nArray[5] = 625000;
        nArray[6] = 1080000;
        nArray[7] = 1715000;
        nArray[8] = 2560000;
        nArray[9] = 3645000;
        nArray[10] = 5000000;
        dS = nArray;
        et = 0;
        bI = 0;
        bO = new aa();
        bP = new aa();
        bQ = new aa();
        bX = false;
        bY = false;
        Image[] imageArray = new Image[2];
        main.a.Z = imageArray;
        imageArray[0] = main.a.c("/m1.png");
        main.a.Z[1] = main.a.c("/m2.png");
        main.a.X = main.a.c("/plus12.png");
        main.a.Y = main.a.c("/Big4.png");
        bR = main.a.c("/trung1.png");
        es = main.a.c("/u/select.png");
        by = main.a.c("/hd/tf.png");
        bS = main.a.c("/eff/g132.png");
        bT = main.a.c("/eff/g10.png");
        bU = main.a.c("/eff/g6.png");
        bV = main.a.c("/eff/g99.png");
        bW = main.a.c("/eff/g9.png");
        if (main.a.g) {
            el = main.a.c("/hd/button.png");
            em = main.a.c("/hd/button2.png");
            en = main.a.c("/hd/hpp.png");
            eo = main.a.c("/hd/mpp.png");
            ep = main.a.c("/hd/right.png");
            eq = main.a.c("/hd/right2.png");
            er = main.a.c("/hd/skill.png");
            bB = main.a.c("/hd/btnlf.png");
            eg = main.a.c("/hd/arrow.png");
            eh = main.a.c("/hd/arrow2.png");
            ei = main.a.c("/hd/chat.png");
            ek = main.a.c("/hd/focus.png");
            ej = main.a.c("/hd/menu.png");
            ee = main.a.c("/hd/topbar.png");
            ef = main.a.c("/hd/transparent.png");
            bz = main.a.c("/hd/mapborder.png");
            bA = main.a.c("/hd/btnl.png");
        }
        bC = main.a.c("/hd/mat.png");
        bD = main.a.c("/hd/lua.png");
        byte[] byArray = w.a("dataVersion");
        byte[] byArray2 = w.a("mapVersion");
        byte[] byArray3 = w.a("skillVersion");
        byte[] byArray4 = w.a("itemVersion");
        if (byArray != null) {
            bq = byArray[0];
        }
        if (byArray2 != null) {
            br = byArray2[0];
        }
        if (byArray3 != null) {
            bs = byArray3[0];
        }
        if (byArray4 != null) {
            bt = byArray4[0];
        }
        ey = new z[3];
        ez = new z[5];
        ca = 0;
        fk = new int[5];
        fl = new int[5];
        fm = new int[5];
        fn = new int[5];
        fo = new int[5];
        fj = new String[5];
        fp = new int[8];
        int n2 = 0;
        while (n2 < 5) {
            dg.fo[n2] = -1;
            ++n2;
        }
        fK = false;
        cf = 140;
        cg = 160;
        gJ = 6;
        gP = "Shop Online";
        new aa();
        ch = 0;
        ck = "";
        cl = "";
        hj = false;
        cp = 0;
        hT = 0;
    }

    public static long a(int n2) {
        long l2 = 0L;
        int n3 = 0;
        while (n3 <= n2) {
            l2 += aW[n3];
            ++n3;
        }
        return l2;
    }

    public static void b() {
        M.removeAllElements();
        N.removeAllElements();
        E.removeAllElements();
        au.a.removeAllElements();
        au.d.removeAllElements();
        au.c.removeAllElements();
        O.removeAllElements();
        P.removeAllElements();
        Q.removeAllElements();
        R.removeAllElements();
        S.removeAllElements();
        bp.d().bF.removeAllElements();
    }

    public static void g() {
        dq.a().m("KSkill");
        dq.a().m("OSkill");
        dq.a().m("CSkill");
    }

    public static void h() {
        dq.a().m("KSkill");
        dq.a().m("OSkill");
        dq.a().m("CSkill");
    }

    public final void a(byte[] object) {
        ez = new z[5];
        if (object == null) {
            int n2 = 0;
            while (n2 < ez.length) {
                if (n2 >= bp.d().ax.size()) break;
                object = (z)bp.d().ax.elementAt(n2);
                dg.ez[n2] = object;
                ++n2;
            }
            dg.P();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < bp.d().ax.size()) {
                z z2 = (z)bp.d().ax.elementAt(n4);
                if (z2.a.a == object[n3]) {
                    dg.ez[n3] = z2;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void b(byte[] object) {
        ey = new z[3];
        if (object == null) {
            int n2 = 0;
            while (n2 < ey.length) {
                if (n2 >= bp.d().ax.size()) break;
                object = (z)bp.d().ax.elementAt(n2);
                dg.ey[n2] = object;
                ++n2;
            }
            dg.Q();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < bp.d().ax.size()) {
                z z2 = (z)bp.d().ax.elementAt(n4);
                if (z2.a.a == object[n3]) {
                    dg.ey[n3] = z2;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void c(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            if (bp.d().ax.size() > 0) {
                bp.d().az = (z)bp.d().ax.elementAt(0);
            }
        } else {
            int n2 = 0;
            while (n2 < bp.d().ax.size()) {
                z z2 = (z)bp.d().ax.elementAt(n2);
                if (z2.a.a == byArray[0]) {
                    bp.d().az = z2;
                    bp.d().ck = z2;
                    break;
                }
                ++n2;
            }
        }
        if (bp.d().az != null) {
            dq.a().g(bp.d().az.a.a);
            bp.d();
        }
    }

    private static void a(j object) {
        object = bp.d().a((j)object);
        aa aa2 = new aa();
        int n2 = 0;
        while (n2 < 5) {
            boolean bl2 = false;
            if (ez[n2] == null) {
                bl2 = true;
            }
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = String.valueOf(n2);
            aa2.addElement(new bd(String.valueOf(df.cc) + " " + (n2 + 1), 11120, objectArray2));
            if (bl2) break;
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private static void b(j object) {
        object = bp.d().a((j)object);
        String[] stringArray = ad.h ? df.cd : df.ce;
        aa aa2 = new aa();
        int n2 = 0;
        while (n2 < 3) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = String.valueOf(n2);
            aa2.addElement(new bd(stringArray[n2], 11121, objectArray2));
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private static void P() {
        byte[] byArray = new byte[ez.length];
        int n2 = 0;
        while (n2 < ez.length) {
            byArray[n2] = ez[n2] == null ? -1 : dg.ez[n2].a.a;
            ++n2;
        }
        if (bp.d().A()) {
            dq.a().a("OSkill", byArray, (byte)0);
            return;
        }
        dq.a().a("OSkill", byArray, (byte)1);
    }

    private static void Q() {
        byte[] byArray = new byte[ey.length];
        int n2 = 0;
        while (n2 < ey.length) {
            byArray[n2] = ey[n2] == null ? -1 : dg.ey[n2].a.a;
            ++n2;
        }
        if (bp.d().A()) {
            dq.a().a("KSkill", byArray, (byte)0);
            return;
        }
        dq.a().a("KSkill", byArray, (byte)1);
    }

    public final void a(z z2) {
        if (z2.a.d == 0) {
            return;
        }
        int n2 = 0;
        while (n2 < ez.length) {
            if (ez[n2] == null) {
                dg.ez[n2] = z2;
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < ey.length) {
            if (ey[n2] == null) {
                dg.ey[n2] = z2;
                break;
            }
            ++n2;
        }
        if (bp.d().az == null) {
            bp.d().az = z2;
        }
        dg.Q();
        dg.P();
    }

    public static boolean i() {
        int n2 = bp.d().aB.length - 1;
        while (n2 >= 0) {
            if (bp.d().aB[n2] == null) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static void a(String[] stringArray, cy cy2) {
        aa aa2 = new aa();
        int n2 = 0;
        while (n2 < stringArray.length) {
            aa2.addElement(new bd(stringArray[n2], 11057, cy2));
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private void R() {
        aV = bp.d();
        W = 0;
        this.ae();
    }

    private void S() {
        aV = bp.d();
        W = 1;
        this.ae();
    }

    private void T() {
        aV = bp.d();
        W = 2;
        this.ae();
    }

    private void U() {
        aV = bp.d();
        W = 3;
        this.ae();
    }

    private void V() {
        aV = bp.d();
        W = 4;
        this.ae();
    }

    private void W() {
        aV = bp.d();
        W = 5;
        this.ae();
    }

    private void X() {
        aV = bp.d();
        W = 6;
        hT = 0;
        this.ae();
    }

    private void Y() {
        aV = bp.d();
        W = 6;
        hT = 1;
        this.ae();
    }

    private void Z() {
        aV = bp.d();
        W = 6;
        hT = 2;
        this.ae();
    }

    public static void j() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(w.a("nj_part")));
                int n2 = ((DataInputStream)object).readShort();
                C = new dr[n2];
                int n3 = 0;
                while (n3 < n2) {
                    int n4 = ((DataInputStream)object).readByte();
                    dg.C[n3] = new dr(n4);
                    n4 = 0;
                    while (n4 < dg.C[n3].a.length) {
                        dg.C[n3].a[n4] = new bv();
                        dg.C[n3].a[n4].a = ((DataInputStream)object).readShort();
                        dg.C[n3].a[n4].b = ((DataInputStream)object).readByte();
                        dg.C[n3].a[n4].c = ((DataInputStream)object).readByte();
                        ++n4;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static void k() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(w.a("nj_effect")));
                int n2 = ((DataInputStream)object).readShort();
                D = new g[n2];
                int n3 = 0;
                while (n3 < n2) {
                    dg.D[n3] = new g();
                    dg.D[n3].a = ((DataInputStream)object).readShort();
                    dg.D[n3].b = new di[((DataInputStream)object).readByte()];
                    int n4 = 0;
                    while (n4 < dg.D[n3].b.length) {
                        dg.D[n3].b[n4] = new di();
                        dg.D[n3].b[n4].c = ((DataInputStream)object).readShort();
                        dg.D[n3].b[n4].a = ((DataInputStream)object).readByte();
                        dg.D[n3].b[n4].b = ((DataInputStream)object).readByte();
                        ++n4;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static void l() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(w.a("nj_arrow")));
                int n2 = ((DataInputStream)object).readShort();
                B = new bx[n2];
                int n3 = 0;
                while (n3 < n2) {
                    dg.B[n3] = new bx();
                    ((DataInputStream)object).readShort();
                    dg.B[n3].a[0] = ((DataInputStream)object).readShort();
                    dg.B[n3].a[1] = ((DataInputStream)object).readShort();
                    dg.B[n3].a[2] = ((DataInputStream)object).readShort();
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static void m() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(w.a("nj_skill")));
                short s2 = ((DataInputStream)object).readShort();
                int n2 = 0;
                int n3 = 0;
                while (n3 < T.length) {
                    n2 += dg.T[n3].c.length;
                    ++n3;
                }
                A = new n[n2];
                n3 = 0;
                while (n3 < s2) {
                    n2 = ((DataInputStream)object).readShort();
                    dg.A[n2] = new n();
                    dg.A[n2].a = ((DataInputStream)object).readShort();
                    ((DataInputStream)object).readByte();
                    dg.A[n2].b = new ar[((DataInputStream)object).readByte()];
                    int n4 = 0;
                    while (n4 < dg.A[n2].b.length) {
                        dg.A[n2].b[n4] = new ar();
                        dg.A[n2].b[n4].a = ((DataInputStream)object).readByte();
                        dg.A[n2].b[n4].b = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].c = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].d = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].e = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].f = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].g = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].h = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].i = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].j = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].k = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].l = ((DataInputStream)object).readShort();
                        dg.A[n2].b[n4].m = ((DataInputStream)object).readShort();
                        ++n4;
                    }
                    dg.A[n2].c = new ar[((DataInputStream)object).readByte()];
                    n4 = 0;
                    while (n4 < dg.A[n2].c.length) {
                        dg.A[n2].c[n4] = new ar();
                        dg.A[n2].c[n4].a = ((DataInputStream)object).readByte();
                        dg.A[n2].c[n4].b = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].c = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].d = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].e = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].f = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].g = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].h = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].i = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].j = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].k = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].l = ((DataInputStream)object).readShort();
                        dg.A[n2].c[n4].m = ((DataInputStream)object).readShort();
                        ++n4;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static void a(long l2, boolean bl2) {
        long l3;
        long l4 = l3 = l2;
        int n2 = 0;
        n2 = 0;
        while (n2 < aW.length) {
            if (l4 < aW[n2]) break;
            l4 -= aW[n2];
            ++n2;
        }
        long[] lArray = new long[]{n2, l4};
        bp.d().w = (int)lArray[0];
        bp.d().E = lArray[1];
    }

    public static dg n() {
        if (a == null) {
            a = new dg();
        }
        return a;
    }

    public static void o() {
        a = null;
        aD = null;
        aC = null;
        aB = null;
        aA = null;
        az = null;
        aJ = null;
        aI = null;
    }

    public final void p() {
        if (fv == null) {
            fv = new Image[3];
            int n2 = 0;
            while (n2 < 3) {
                dg.fv[n2] = main.a.c("/e/sp" + n2 + ".png");
                ++n2;
            }
        }
        fq = new int[2];
        fr = new int[2];
        fs = new int[2];
        ft = new int[2];
        fu = new int[2];
        dg.fs[1] = -1;
        dg.fs[0] = -1;
        this.at();
        am.a();
    }

    public dg() {
        int[] nArray = new int[11];
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        this.fL = 0;
        this.fM = null;
        this.fN = null;
        this.fO = 0;
        this.gL = 0;
        int[] nArray2 = new int[18];
        nArray2[4] = 600841;
        nArray2[5] = 600841;
        nArray2[6] = 667658;
        nArray2[7] = 667658;
        nArray2[8] = 3346944;
        nArray2[9] = 0x331100;
        nArray2[10] = 4199680;
        nArray2[11] = 5052928;
        nArray2[12] = 0x320033;
        nArray2[13] = 0x3C0033;
        nArray2[14] = 4587571;
        nArray2[15] = 5046280;
        nArray2[16] = 0x66000A;
        nArray2[17] = 0x334400;
        this.gM = nArray2;
        this.gN = new int[][]{{18687, 16869, 15052, 13235, 11161, 9344}, {45824, 39168, 32768, 26112, 19712, 13056}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {16711705, 15007767, 13369364, 11730962, 0x99000F, 0x80000D}};
        this.gO = new int[]{2, 1, 1, 1, 1, 1};
        this.cj = new bd(df.ge[0], 11038);
        this.hb = 30;
        this.hc = 0;
        this.hd = "";
        this.hu = dd.d;
        this.hv = new byte[]{-1, -1, -1, -1, -1, -1};
        this.hw = 0;
        this.hx = new aa();
        this.hO = "";
        this.hS = new int[][]{new int[2], {200, 10}, {500, 20}, {1000, 50}, {2000, 100}, {5000, 200}, {10000, 500}, {20000, 1000}, {50000, 2000}, {100000, 5000}, {100000, 10000}};
        if (main.a.A == 128 || main.a.B <= 208) {
            cK = 20;
        }
        dg dg2 = this;
        this.eE = new bd(df.cZ, 5043);
        dg2.eF = new bd(df.cZ, 5053);
        dg2.eD = new bd(df.bc, 11002);
        dg2.eC = new bd(df.cZ, 11003);
        dg2.gA = new bd(main.a.g ? df.X : "", 11004);
        dg2.gz = new bd(df.as, 11005);
        dg2.eB = new bd(df.cZ, 11006);
        dg2.gy = new bd(main.a.g ? df.X : "", 11007);
        dg2.gx = new bd(df.as, 11008);
        dg2.gw = new bd(main.a.g ? df.X : "", 11009);
        dg2.gv = new bd(df.as, 11010);
        dg2.gu = new bd(main.a.g ? df.X : "", 11011);
        dg2.gt = new bd(df.as, 11012);
        dg2.gs = new bd(main.a.g ? df.X : "", 11013);
        dg2.gr = new bd(df.as, 11014);
        dg2.gq = new bd(main.a.g ? df.X : "", 11015);
        dg2.gp = new bd(df.as, 11016);
        dg2.gm = new bd(main.a.g ? df.X : "", 11017);
        dg2.go = new bd(main.a.g ? df.X : "", 13001);
        dg2.gl = new bd(df.as, 11018);
        dg2.gn = new bd(df.as, 13002);
        dg2.gi = new bd(main.a.g ? df.X : "", 11019);
        dg2.gh = new bd(df.as, 11020);
        dg2.gf = new bd(df.as, 14022);
        dg2.gg = new bd(main.a.g ? df.X : "", 14023);
        dg2.gk = new bd(main.a.g ? df.X : "", 14018);
        dg2.gj = new bd(df.as, 14019);
        dg2.ge = new bd(df.H, 11021);
        dg2.ha = new bd(df.bo, 11022);
        dg2.gZ = new bd(main.a.g ? df.X : "", 11023);
        dg2.gX = new bd(df.ae, 11024);
        dg2.gY = new bd(df.af, 110244);
        dg2.gW = new bd(df.H, 11025);
        dg2.gU = new bd(df.ac, 11026);
        dg2.gV = new bd(df.ad, 110221);
        dg2.gd = new bd(df.bo, 11027);
        dg2.gc = new bd(df.bo, 11028);
        dg2.gb = new bd(df.bo, 11029);
        dg2.ga = new bd(main.a.g ? df.X : "", 11030);
        new bd(df.bE, 11021);
        dg2.eA = new bd(df.A, 11000);
        dg2.cE = new bd("Focus", 11001);
        dg2.fQ = new bd(df.cR, 11032);
        dg2.fR = new bd(df.bc, 11033);
        dg2.fV = new bd(df.aj, 11034);
        dg2.fW = new bd(df.aj, 14014);
        dg2.fX = new bd(df.aj, 11035);
        dg2.fY = new bd(df.am, 11036);
        dg2.fZ = new bd(df.aj, 11037);
        dg2.fS = new bd(df.aj, 339);
        dg2.fT = new bd(df.aj, 340);
        dg2.fU = new bd(df.aj, 343);
        dg2.fP = new bd(df.aj, 402);
        new bd("240", 110381);
        new bd("360", 1103911);
        new bd("To\u00e0n Map", 110401);
        dg2.cG = new bd(df.iJ, 2003);
        int n2 = main.a.B - 26;
        int n3 = main.a.A / 2 - ag.o / 2;
        bd bd2 = dg2.cG;
        dg2.cG.f = n3;
        bd2.g = n2;
        if (main.a.g && main.a.h) {
            dg2.eA.f = b - 135;
            dg2.eA.g = 6;
            dg2.eA.e = ej;
            dg2.cE.f = b;
            dg2.cE.g = c;
            if (main.a.i) {
                dg2.eA.f = b / 2 - 38;
                dg2.eA.g = c - 34;
            }
        }
        this.cE.e = main.a.c("/u/fc.png");
        this.k = this.eA;
        this.m = this.cE;
        eM = main.a.B / 5;
        if (eM > 100) {
            eM = 100;
        }
    }

    private void aa() {
        if (!main.a.g || main.a.g && main.a.A < 320 || aR && W > 0 || dE && W == 0) {
            aQ = false;
        }
        cQ = false;
        if (dg.A()) {
            this.C();
            this.m = this.ge;
            return;
        }
        this.J();
    }

    private void ab() {
        if (!(cL > 0 && cL <= 4 || main.a.g)) {
            return;
        }
        main.a.L.a(df.ew, this.eB, 1);
    }

    private void ac() {
        if (cL <= 0 || cL > 4) {
            return;
        }
        main.a.L.a(df.ew, this.eC, 1);
    }

    private void ad() {
        if (!aP) {
            return;
        }
        main.a.L.a(df.bB, this.eD, 0);
    }

    private void ae() {
        aR = true;
        dg.b(175, 200);
        this.J();
        if (W == 3 && dg.aV.p == bp.d().p) {
            dq.a().a(dg.aV.ab, 0);
        }
        if (W == 5) {
            this.ew = new int[5];
            this.ex = new int[5];
            gD = ce + 5;
            gE = cd + 35;
            this.ew[0] = gD + 5;
            this.ex[0] = gE + 35;
            this.ew[1] = gD + 5;
            this.ex[1] = gE + 70;
            this.ew[2] = gD + 131;
            this.ex[2] = gE + 35;
            this.ew[3] = gD + 131;
            this.ex[3] = gE + 70;
            this.ew[4] = this.ew[0] + cK + 7;
            this.ex[4] = this.ex[0] - 5;
        }
        if (W == 6) {
            this.ew = new int[5];
            this.ex = new int[5];
            gD = ce + 5;
            gE = cd + 35;
            this.ew[0] = gD + 5;
            this.ex[0] = gE + 35;
            this.ew[1] = gD + 5;
            this.ex[1] = gE + 70;
            this.ew[2] = gD + 131;
            this.ex[2] = gE + 35;
            this.ew[3] = gD + 131;
            this.ex[3] = gE + 70;
            this.ew[4] = this.ew[0] + cK + 7;
            this.ex[4] = this.ex[0] - 5;
        }
        this.m = new bd(df.bE, 11060);
    }

    private void af() {
        aa.a();
        cO.a();
        cQ = false;
        this.cz = new bd(df.cg[0], 1100011);
        this.cA = new bd(df.cg[1], 1100012);
        this.cB = new bd(df.cg[2], 1100013);
        this.cD = new bd(df.cg[3], 1100014);
        this.cC = new bd(df.cg[4], 1100015);
        this.cF = new bd(df.cg[6], 1100017);
        aa aa2 = new aa();
        aa2.addElement(this.cz);
        aa2.addElement(this.cA);
        aa2.addElement(this.cB);
        aa2.addElement(this.cD);
        aa2.addElement(this.cC);
        aa2.addElement(new bd(df.cg[5], 1100016));
        aa2.addElement(this.cF);
        main.a.F.a(aa2);
    }

    private static void ag() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gs[0], 110002));
        aa2.addElement(new bd(df.gs[1], 1100032));
        aa2.addElement(new bd(df.gs[2], 1100033));
        aa2.addElement(new bd(df.s, 1100034));
        aa2.addElement(new bd(df.V, dc.b(), 1004, null));
        main.a.F.a(aa2);
    }

    private static void ah() {
        if (eG > 0) {
            return;
        }
        bd bd2 = new bd(df.dN[1], 110001);
        bd bd3 = new bd(df.dN[3], 110003);
        bd bd4 = new bd(df.dN[4], 110004);
        new bd(df.dN[0], 110005);
        bd bd5 = new bd(df.dN[6], 110006);
        new bd(df.dN[7], 110007);
        new bd(df.dN[8], 110008);
        new bd(df.dN[9], 110009);
        new bd(df.dN[10], 110010);
        new bd(df.dN[11], 110011);
        new bd(df.dN[12], 110012);
        new bd(df.dN[13], 110013);
        new bd(df.dN[14], 110014);
        new bd(df.dN[15], 110015);
        new bd(df.dN[16], 110016);
        new bd(df.dN[17], 110017);
        bd bd6 = new bd(df.dN[18], 110018);
        bd bd7 = new bd("X\u00e1c th\u1ef1c t\u00e0i kho\u1ea3n", 1100181);
        aa aa2 = new aa();
        if (bp.d().w >= 3 && co.g()) {
            aa2.addElement(bd7);
        }
        aa2.addElement(bd2);
        aa2.addElement(bd3);
        aa2.addElement(bd5);
        aa2.addElement(bd6);
        aa2.addElement(bd4);
        main.a.F.a(aa2);
    }

    private void ai() {
        this.v();
        cV = true;
        W = this.cH;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        this.k = new bd(df.dN[2], 110002);
        this.l = new bd(df.ca, 110019);
    }

    private void aj() {
        this.v();
        cX = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        dq.a().d();
        this.s();
    }

    private void ak() {
        this.v();
        if (this.bm > 0) {
            V = bp.d(this.bm);
        } else {
            V = 0;
            this.bm = -1;
        }
        dC = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
    }

    private void al() {
        this.v();
        cW = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        this.t();
    }

    public final void q() {
        this.v();
        cU = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        this.l = null;
        this.k = null;
        V = 0;
    }

    public final void r() {
        this.v();
        cY = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        this.l = null;
        this.k = null;
        V = 0;
    }

    private void am() {
        this.v();
        aP = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        this.k = new bd(df.be, 11044);
        this.l = null;
        V = 0;
        dq.a().u();
    }

    private void an() {
        this.v();
        cZ = true;
        this.ea = true;
        dg.b(175, 200);
        this.m = this.ge;
        this.k = new bd(df.be, 14017);
        this.l = null;
        V = 0;
        dq.a().v();
    }

    public final void s() {
        if (cX) {
            db db2;
            this.l = null;
            this.k = null;
            this.k = new bd(df.A, 11045);
            if (H.size() > 0 && V >= 0 && V < H.size() && (db2 = (db)H.elementAt(V)) != null && !bp.d().ab.equals(db2.d)) {
                this.l = new bd(df.bo, 11046);
            }
        }
    }

    public final void t() {
        if (cW) {
            this.l = null;
            this.k = null;
            V = 0;
            if (G.size() == 0) {
                this.l = null;
                this.k = new bd(df.A, 11047);
                return;
            }
            db db2 = (db)G.firstElement();
            if (db2.a == bp.d().p) {
                this.k = new bd(df.gi, 11070, db2);
                return;
            }
            this.k = new bd(df.gh, 11071);
        }
    }

    private static void ao() {
        if (af.n != 1) {
            q.b().a();
        }
    }

    public final void a(ce ce2) {
        b.b();
        try {
            int n2 = ce2.b().readByte();
            if (n2 <= 0) {
                return;
            }
            this.dU = new int[n2];
            this.dV = new int[this.dU.length];
            n2 = 0;
            while (n2 < this.dU.length) {
                this.dU[n2] = ce2.b().readByte();
                this.dV[n2] = ce2.b().readByte();
                ++n2;
            }
            dD = true;
            U = af.l;
            dg.b(175, 200);
            this.k = new bd(df.bo, 11067);
            this.l = new bd("", 11067);
            this.m = this.ge;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void u() {
        try {
            this.v();
            this.bF = "";
            this.bh = 0;
            this.bk = 0;
            this.bj = 0;
            this.bi = 0;
            this.bh = 0;
            aS = true;
            aC = new by[12];
            aD = new by[12];
            W = 0;
            dg.b(175, 200);
            this.m = this.ge;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void a(boolean n2) {
        b = main.a.A;
        if (!main.a.g || main.a.g && !main.a.h) {
            g = 36;
            if (main.a.g) {
                g += 3;
            }
        } else {
            g = 8;
        }
        c = main.a.B - g - 20;
        if (n2 != 0) {
            c = main.a.B;
        }
        if (main.a.g && main.a.h) {
            c = main.a.B;
        }
        if (main.a.B == 160) {
            c = 150;
        }
        fy = b;
        if (main.a.A > 176) {
            fy -= 50;
        }
        fw = 0;
        fx = main.a.B - ay.f - g;
        cs = main.a.B / 6;
        if (cs < 48) {
            cs = 48;
        }
        d = b >> 1;
        f = c >> 1;
        e = 2 * c / 3;
        h = b / 6;
        cq = b / af.i + 2;
        cr = c / af.i + 2;
        if (b % 24 != 0) {
            ++cq;
        }
        cx = (af.a - 1) * af.i - b;
        cy = (af.b - 1) * af.i - c;
        if (main.a.g && main.a.h) {
            cy += 60;
        }
        i = r = bp.d().i - d + h * bp.d().o;
        j = s = bp.d().j - e;
        if (i < 24) {
            i = 24;
        }
        if (i > cx) {
            i = cx;
        }
        if (j < 0) {
            j = 0;
        }
        if (j > cy) {
            j = cy;
        }
        if ((t = i / af.i - 1) < 0) {
            t = 0;
        }
        u = j / af.i;
        v = t + cq;
        w = u + cr;
        if (u < 0) {
            u = 0;
        }
        if (w > af.b - 1) {
            w = af.b - 1;
        }
        if ((af.C = v - t << 2) > af.a) {
            af.C = af.a;
        }
        if ((af.D = w - u << 2) > af.b) {
            af.D = af.b;
        }
        if ((af.y = (bp.d().i - 2 * b) / af.i) < 0) {
            af.y = 0;
        }
        if ((af.z = af.y + af.C) > af.a) {
            af.z = af.a;
        }
        if ((af.A = (bp.d().j - 2 * c) / af.i) < 0) {
            af.A = 0;
        }
        if ((af.B = af.A + af.D) > af.b) {
            af.B = af.b;
        }
        aw.a().c = a;
        aw.a().a.b = main.a.B - 35 - aw.a().a.d;
        if (!main.a.g || main.a.g && !main.a.h) {
            af.a(main.a.A - 51, fx - 4, 50, 40);
        } else {
            af.a(main.a.A - 60, 0, 60, 42);
        }
        if (main.a.g) {
            eN = c - 88;
            eQ = b - 100;
            eR = 2;
            if (main.a.i) {
                eQ = b / 2 - 2;
                eR = eN + 50;
            }
            eO = 1;
            eP = eN + 50;
            eS = 42;
            eT = eN + 50;
            eU = b - 50;
            eV = eN + 35;
            eW = 22;
            eX = eN + 19;
            eY = b - 74;
            eZ = eN + 13;
            fa = b - 85;
            fb = eN + 50;
            fc = b - 37;
            fd = eN - 1;
            if (main.a.A >= 450) {
                eX -= 15;
                eW += 28;
                eS += 45;
                eO += 10;
                fd -= 12;
                eZ -= 7;
                eU -= 18;
                fc -= 10;
                eY -= 17;
                fa -= 24;
            } else if (main.a.A >= 360) {
                eX -= 5;
                eW += 6;
                eS += 12;
                fd -= 2;
                eZ -= 2;
                eY -= 2;
                fa -= 2;
            }
        }
        fe = new int[ez.length];
        ff = new int[ez.length];
        if (main.a.g) {
            if (main.a.i) {
                fg = 2;
                fh = 55;
                fi = 5;
                n2 = 0;
                while (n2 < fe.length) {
                    dg.fe[n2] = n2 * (25 + fi);
                    dg.ff[n2] = fh;
                    ++n2;
                }
                return;
            }
            fg = main.a.A <= 320 ? d - ez.length * 25 / 2 - 15 : d - ez.length * 25 / 2;
            fh = eN + 58;
            fi = 5;
            n2 = 0;
            while (n2 < fe.length) {
                dg.fe[n2] = n2 * (25 + fi);
                dg.ff[n2] = fh;
                ++n2;
            }
            return;
        }
        fg = 0;
        n2 = 0;
        while (n2 < ff.length) {
            dg.fe[n2] = 2;
            dg.ff[n2] = 2 + n2 * 25;
            ++n2;
        }
    }

    private static boolean ap() {
        if (bp.d().az != null && bp.d().x < bp.d().az.j) {
            ae.a(df.ee);
            return false;
        }
        if (bp.d().az == null || bp.d().az.a.c > 0 && bp.d().az.c == 0) {
            main.a.a(df.fR);
            return false;
        }
        if (bp.d().aD[1] == null) {
            main.a.a(df.fS);
            return false;
        }
        return true;
    }

    public final void v() {
        if (bp.d().aB != null) {
            int n2;
            if ((dz || dI) && az != null) {
                n2 = 0;
                while (n2 < az.length) {
                    if (az[n2] != null) {
                        bp.d().aB[dg.az[n2].e] = az[n2];
                        dg.az[n2] = null;
                    }
                    ++n2;
                }
            }
            if (dw) {
                if (aI != null) {
                    bp.d().aB[dg.aI.e] = aI;
                    aI = null;
                }
                if (aA != null) {
                    n2 = 0;
                    while (n2 < aA.length) {
                        if (aA[n2] != null) {
                            bp.d().aB[dg.aA[n2].e] = aA[n2];
                            dg.aA[n2] = null;
                        }
                        ++n2;
                    }
                }
            }
            if (dM) {
                if (aI != null) {
                    bp.d().aB[dg.aI.e] = aI;
                    aI = null;
                }
                if (aJ != null) {
                    bp.d().aB[dg.aJ.e] = aJ;
                    aJ = null;
                }
                if (aA != null) {
                    n2 = 0;
                    while (n2 < aA.length) {
                        if (aA[n2] != null) {
                            bp.d().aB[dg.aA[n2].e] = aA[n2];
                            dg.aA[n2] = null;
                        }
                        ++n2;
                    }
                }
            }
            if (dQ && aA != null) {
                n2 = 0;
                while (n2 < aA.length) {
                    if (aA[n2] != null) {
                        bp.d().aB[dg.aA[n2].e] = aA[n2];
                        dg.aA[n2] = null;
                    }
                    ++n2;
                }
            }
            if (aN && aK != null) {
                bp.d().aB[dg.aK.e] = aK;
                aK = null;
            }
            if (dx && aE != null) {
                n2 = 0;
                while (n2 < aE.length) {
                    if (aE[n2] != null) {
                        bp.d().aB[dg.aE[n2].e] = aE[n2];
                        dg.aE[n2] = null;
                    }
                    ++n2;
                }
            }
            if (dB || dK || dJ || dL || dR) {
                if (aJ != null) {
                    bp.d().aB[dg.aJ.e] = aJ;
                    aJ = null;
                }
                if (aB != null) {
                    n2 = 0;
                    while (n2 < aB.length) {
                        if (aB[n2] != null) {
                            if (dJ || dK || dL || dR) {
                                bp.d().aB[dg.aB[n2].e] = aB[n2];
                            }
                            dg.aB[n2] = null;
                        }
                        ++n2;
                    }
                }
            }
            if (dQ && aB != null) {
                n2 = 0;
                while (n2 < aB.length) {
                    if (aB[n2] != null) {
                        bp.d().aB[dg.aB[n2].e] = aB[n2];
                        dg.aB[n2] = null;
                    }
                    ++n2;
                }
            }
            if (aS) {
                b.b();
                if (this.bj > 0) {
                    bp.d().ar += this.bj;
                }
                if (aC != null) {
                    n2 = 0;
                    while (n2 < aC.length) {
                        if (aC[n2] != null) {
                            bp.d().aB[dg.aC[n2].e] = aC[n2];
                            dg.aC[n2] = null;
                        }
                        ++n2;
                    }
                }
                if (aD != null) {
                    n2 = 0;
                    while (n2 < aD.length) {
                        dg.aD[n2] = null;
                        ++n2;
                    }
                }
            }
            if ((dN || dO) && aJ != null) {
                bp.d().aB[dg.aJ.e] = aJ;
                aJ = null;
            }
        }
        if (aS) {
            dq.a().i();
        }
        main.a.F.a = false;
        aw aw2 = aw.a();
        aw2.a.a("");
        aw2.b = false;
        aw.a().f = null;
        if (!main.a.g) {
            da = false;
        }
        aM = false;
        dy = false;
        this.ea = false;
        dD = false;
        aT = false;
        aR = false;
        aQ = false;
        cV = false;
        cW = false;
        aU = false;
        dE = false;
        dG = false;
        dF = false;
        dC = false;
        cX = false;
        aP = false;
        dH = false;
        cY = false;
        cU = false;
        cZ = false;
        aO = false;
        dP = false;
        this.bh = 0;
        db = false;
        dc = false;
        dd = false;
        de = false;
        df = false;
        dg = false;
        dh = false;
        di = false;
        dj = false;
        dk = false;
        dl = false;
        dm = false;
        dn = false;
        do = false;
        dp = false;
        dq = false;
        dr = false;
        ds = false;
        dt = false;
        du = false;
        dv = false;
        dw = false;
        aN = false;
        dx = false;
        dK = false;
        dJ = false;
        dB = false;
        aS = false;
        dI = false;
        dz = false;
        dA = false;
        dM = false;
        dL = false;
        dR = false;
        dQ = false;
        dN = false;
        dO = false;
        W = 0;
        U = 0;
        this.dZ = -1;
        V = -1;
        cM = 0;
        cL = 0;
        this.bi = 0;
        this.bh = 0;
        this.k = this.eA;
        this.m = this.cE;
        this.ex = null;
        this.ew = null;
        this.l = null;
        if (bp.d().z <= 0 || bp.d().n == 14 || bp.d().n == 5) {
            if (main.a.i) {
                this.cj.a = "";
            }
            this.l = this.cj;
        }
        aa.a();
    }

    public final void b(int n2) {
        if (this.ed != null && this.ed.e) {
            this.ed.a(n2);
        }
        super.b(n2);
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        block444: {
            block445: {
                block446: {
                    block440: {
                        block443: {
                            block442: {
                                block441: {
                                    block438: {
                                        block439: {
                                            block437: {
                                                if (main.a.F.a) {
                                                    return;
                                                }
                                                if (b.c) {
                                                    return;
                                                }
                                                if (main.a.g && !aw.a().b && !main.a.F.a) {
                                                    var2_6 = var1_1 = this;
                                                    var4_7 = -1;
                                                    if (main.a.q) {
                                                        var5_18 = 0;
                                                        while (var5_18 < var2_6.eu.length) {
                                                            if (main.a.b(var2_6.eu[var5_18], var2_6.ev[var5_18], 100, 12) && main.a.r) {
                                                                var4_7 = var5_18;
                                                                break;
                                                            }
                                                            ++var5_18;
                                                        }
                                                    }
                                                    if (!((var3_24 = var4_7) == -1 || dg.aG() || dg.A() || dg.aI())) {
                                                        if (var3_24 == 0) {
                                                            if (bg.d().g.size() > 0) {
                                                                block436: {
                                                                    var2_6 = bg.d();
                                                                    var5_18 = 3;
                                                                    while (var5_18 < var2_6.a.size()) {
                                                                        var6_32 = (bq)var2_6.a.elementAt(var5_18);
                                                                        var7_34 = 0;
                                                                        while (var7_34 < var2_6.g.size()) {
                                                                            if (var6_32.b.equals(var2_6.g.elementAt(var7_34).toString())) {
                                                                                v0 = var5_18;
                                                                                break block436;
                                                                            }
                                                                            ++var7_34;
                                                                        }
                                                                        ++var5_18;
                                                                    }
                                                                    v0 = -1;
                                                                }
                                                                var4_7 = v0;
                                                                bg.d().a(var4_7);
                                                                super.ck();
                                                                var1_1.ev[0] = -1;
                                                                var1_1.eu[0] = -1;
                                                            }
                                                        } else {
                                                            if (bg.f) {
                                                                bg.d().a(1);
                                                            } else if (bg.e) {
                                                                bg.d().a(3);
                                                            }
                                                            super.ck();
                                                            var1_1.ev[1] = -1;
                                                            var1_1.eu[1] = -1;
                                                        }
                                                    }
                                                    var1_1 = this;
                                                    var3_24 = 0;
                                                    ag.q = -1;
                                                    if (main.a.b(af.r, af.s, af.p, af.q) && main.a.q && main.a.r) {
                                                        dg.ao();
                                                        var3_24 = 1;
                                                    }
                                                    if (!(!main.a.g || main.a.F.a && main.a.i || main.a.J != null || cb.f != null || main.a.F.a || dg.aG())) {
                                                        if (main.a.b(dg.eQ, dg.eR, 34, 34)) {
                                                            ag.q = 15;
                                                            if (main.a.q && main.a.r) {
                                                                aw.a().a(df.gI[0]);
                                                                var3_24 = 1;
                                                                main.a.r = false;
                                                                main.a.q = false;
                                                            }
                                                        }
                                                        if (!super.aH()) {
                                                            if (!bp.d().d) {
                                                                if (main.a.b(dg.eW, dg.eX, 34, 34)) {
                                                                    ag.q = 3;
                                                                    main.a.o[2] = true;
                                                                    super.aq();
                                                                    var3_24 = 1;
                                                                } else if (main.a.p) {
                                                                    main.a.o[2] = false;
                                                                }
                                                                if (main.a.b(dg.eW - 30, dg.eX, 30, 34)) {
                                                                    main.a.o[1] = true;
                                                                    super.aq();
                                                                    var3_24 = 1;
                                                                } else if (main.a.p) {
                                                                    main.a.o[1] = false;
                                                                }
                                                                if (main.a.b(dg.eW + 34, dg.eX, 30, 34)) {
                                                                    main.a.o[3] = true;
                                                                    super.aq();
                                                                    var3_24 = 1;
                                                                } else if (main.a.p) {
                                                                    main.a.o[3] = false;
                                                                }
                                                                if (main.a.b(dg.eO, dg.eP, 34, 34)) {
                                                                    ag.q = 4;
                                                                    main.a.o[4] = true;
                                                                    super.aq();
                                                                    var3_24 = 1;
                                                                } else if (main.a.p) {
                                                                    main.a.o[4] = false;
                                                                }
                                                                if (main.a.b(dg.eS - 5, dg.eT, 40, 34)) {
                                                                    ag.q = 6;
                                                                    main.a.o[6] = true;
                                                                    super.aq();
                                                                    var3_24 = 1;
                                                                } else if (main.a.p) {
                                                                    main.a.o[6] = false;
                                                                }
                                                                if (main.a.b(dg.eU, dg.eV, 54, 54)) {
                                                                    main.a.o[5] = true;
                                                                    ag.q = 5;
                                                                    if (main.a.r) {
                                                                        main.a.n[5] = true;
                                                                        var3_24 = 1;
                                                                    }
                                                                }
                                                            } else {
                                                                var4_8 = var1_1;
                                                                if (main.a.c(dg.eO, dg.eP, 34, 34) && main.a.r) {
                                                                    super.e((byte)0);
                                                                    main.a.i();
                                                                }
                                                                if (main.a.c(dg.eW, dg.eX, 34, 34) && main.a.r) {
                                                                    super.e((byte)1);
                                                                    main.a.i();
                                                                }
                                                                if (main.a.c(dg.eS - 5, dg.eT, 40, 34) && main.a.r) {
                                                                    super.e((byte)2);
                                                                    main.a.i();
                                                                }
                                                            }
                                                            if (bp.d().r > 1) {
                                                                if (main.a.b(dg.fa, dg.fb, 34, 34)) {
                                                                    ag.q = 11;
                                                                    if (main.a.q && main.a.r) {
                                                                        main.a.n[11] = true;
                                                                        var3_24 = 1;
                                                                    }
                                                                }
                                                                if (main.a.b(dg.eY, dg.eZ, 34, 34)) {
                                                                    ag.q = 10;
                                                                    if (main.a.q && main.a.r) {
                                                                        main.a.n[10] = true;
                                                                        var3_24 = 1;
                                                                    }
                                                                }
                                                                if (main.a.b(dg.fc, dg.fd, 34, 34)) {
                                                                    ag.q = 13;
                                                                    if (main.a.q && main.a.r) {
                                                                        main.a.r = false;
                                                                        main.a.q = false;
                                                                        bp.d().u();
                                                                        var3_24 = 1;
                                                                    }
                                                                }
                                                            }
                                                            if (bp.d().aw.size() >= 2 && (main.a.b(dg.fg + dg.fe[0], dg.ff[0], dg.ez.length * 30, 30) || !main.a.h && main.a.b(dg.fg + dg.fe[0], dg.ff[0], 30, dg.ez.length * 25)) && main.a.q && main.a.r) {
                                                                var4_9 = 0;
                                                                var4_9 = main.a.h == false ? (main.a.v - (dg.fh + dg.ff[0])) / 25 : (main.a.u - (dg.fg + dg.fe[0])) / 30;
                                                                var1_1.eJ = var4_9;
                                                                if (dg.U < 0) {
                                                                    dg.U = 0;
                                                                }
                                                                if (var1_1.eJ > dg.ez.length - 1) {
                                                                    var1_1.eJ = dg.ez.length - 1;
                                                                }
                                                                var3_24 = 1;
                                                                var2_6 = dg.ez[var1_1.eJ];
                                                                var1_1.a((z)var2_6, false, true);
                                                                var1_1.cI = true;
                                                            }
                                                            if (main.a.r) {
                                                                main.a.o[1] = false;
                                                                main.a.o[2] = false;
                                                                main.a.o[3] = false;
                                                                main.a.o[4] = false;
                                                                main.a.o[6] = false;
                                                            }
                                                            if (var3_24 == 0 && !dg.aG() && !dg.A() && !dg.aI() && main.a.q) {
                                                                var4_10 = 0;
                                                                while (var4_10 < dg.Q.size()) {
                                                                    var5_19 = (ci)dg.Q.elementAt(var4_10);
                                                                    if (var5_19.d() && main.a.a(var5_19.e - var5_19.k / 2, var5_19.f - var5_19.l, var5_19.k, var5_19.l) && main.a.r) {
                                                                        bp.d().aR = var5_19;
                                                                        bp.d().v();
                                                                        bp.d().aV = null;
                                                                        bp.d().aW = null;
                                                                        bp.cg = true;
                                                                        break block437;
                                                                    }
                                                                    ++var4_10;
                                                                }
                                                                var4_10 = 0;
                                                                while (var4_10 < dg.R.size()) {
                                                                    var5_20 = (cy)dg.R.elementAt(var4_10);
                                                                    if (var5_20.q() && main.a.a(var5_20.i - var5_20.af / 2, var5_20.j - var5_20.ag, var5_20.af, var5_20.ag) && main.a.r) {
                                                                        bp.d().aR = null;
                                                                        bp.d().v();
                                                                        bp.d().aU = var5_20;
                                                                        bp.d().aV = null;
                                                                        bp.d().aW = null;
                                                                        bp.cg = true;
                                                                        break block437;
                                                                    }
                                                                    ++var4_10;
                                                                }
                                                                var4_10 = 0;
                                                                while (var4_10 < dg.M.size()) {
                                                                    var5_21 = (bp)dg.M.elementAt(var4_10);
                                                                    if (var5_21.q() && !var5_21.B() && main.a.a(var5_21.i - var5_21.af / 2, var5_21.j - var5_21.ag, var5_21.af, var5_21.ag) && main.a.r) {
                                                                        bp.d().aR = null;
                                                                        bp.d().v();
                                                                        bp.d().aV = var5_21;
                                                                        bp.d().aW = null;
                                                                        bp.cg = true;
                                                                        break block437;
                                                                    }
                                                                    ++var4_10;
                                                                }
                                                                var4_10 = 0;
                                                                while (var4_10 < dg.N.size()) {
                                                                    var5_22 = (dl)dg.N.elementAt(var4_10);
                                                                    if (main.a.a(var5_22.a - 12, var5_22.b - 24, 24, 24) && main.a.r) {
                                                                        bp.d().aR = null;
                                                                        bp.d().v();
                                                                        bp.d().aV = null;
                                                                        bp.d().aW = var5_22;
                                                                        bp.cg = true;
                                                                        break;
                                                                    }
                                                                    ++var4_10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var1_1 = this;
                                            if (af.o == 130 || dg.ar()) break block438;
                                            var3_25 = System.currentTimeMillis();
                                            if (main.a.n[2] || main.a.n[4] || main.a.n[6] || main.a.n[1] || main.a.n[3]) {
                                                dg.cb = 0;
                                                if (var1_1.cc) {
                                                    bp.d().bI = false;
                                                    var1_1.cc = false;
                                                }
                                            }
                                            if (!main.a.n[5] || dg.aG()) ** GOTO lbl234
                                            if (dg.cb != 0) break block439;
                                            if (var3_25 - var1_1.eH < 800L && (bp.d().az != null && bp.d().x < bp.d().az.j ? false : (bp.d().az == null || bp.d().az.a.c > 0 && bp.d().az.c == 0 ? false : bp.d().aD[1] != null)) && bp.d().aR != null) {
                                                dg.cb = 10;
                                                main.a.n[5] = false;
                                            }
                                            ** GOTO lbl233
                                        }
                                        if (!var1_1.cc && bp.d().n != 14) {
                                            var1_1.cc = var1_1.cc == false;
                                            bp.d().bI = bp.d().bI == false;
                                            var1_1.eH = var3_25;
                                        } else {
                                            dg.cb = 0;
                                            if (var1_1.cc) {
                                                bp.d().bI = false;
                                                var1_1.cc = false;
                                            }
                                            main.a.n[6] = false;
                                            main.a.n[4] = false;
lbl233:
                                            // 2 sources

                                            var1_1.eH = var3_25;
lbl234:
                                            // 2 sources

                                            if (main.a.w % 10 == 0 && dg.cb > 0 && (bp.d().aR != null || bp.d().aW != null)) {
                                                super.b(true);
                                            }
                                            if (dg.cb > 1) {
                                                --dg.cb;
                                            }
                                        }
                                    }
                                    var1_1 = this;
                                    if (main.a.g) {
                                        if (main.a.p && !main.a.r && main.a.b(dg.fc, dg.fd, 34, 34) && !dg.dC && main.a.q && main.a.g()) {
                                            super.ak();
                                        }
                                    } else if (main.a.o[13] && !dg.dC && main.a.g()) {
                                        super.ak();
                                    }
                                    if (cb.f != null) {
                                        var1_1 = cb.f.e;
                                        if ((main.a.n[5] || ag.a((bd)var1_1)) && var1_1 != null) {
                                            main.a.r = false;
                                            main.a.n[5] = false;
                                            ag.q = -1;
                                            if (var1_1 != null) {
                                                var1_1.a();
                                            }
                                        }
                                    } else if (!aw.a().b) {
                                        if (ag.q != -1 && main.a.b(dg.eO, dg.eP, 34, 34)) {
                                            main.a.r = false;
                                        }
                                        if (ag.q != -1 && main.a.b(dg.eS, dg.eT, 34, 34)) {
                                            main.a.r = false;
                                        }
                                        if (ag.q != -1 && main.a.b(dg.eW, dg.eX, 34, 34)) {
                                            main.a.r = false;
                                        }
                                        if ((main.a.n[12] || ag.a(main.a.E.k)) && this.k != null) {
                                            main.a.r = false;
                                            main.a.q = false;
                                            main.a.n[12] = false;
                                            ag.q = -1;
                                            if (this.k != null) {
                                                this.k.a();
                                            }
                                        }
                                        if ((main.a.n[13] || ag.a(main.a.E.m)) && this.m != null) {
                                            main.a.r = false;
                                            main.a.q = false;
                                            main.a.n[13] = false;
                                            ag.q = -1;
                                            if (this.m != null) {
                                                this.m.a();
                                            }
                                        }
                                        if ((main.a.n[5] || ag.a(main.a.E.l)) && this.l != null) {
                                            main.a.r = false;
                                            main.a.n[5] = false;
                                            ag.q = -1;
                                            if (this.l != null) {
                                                this.l.a();
                                            }
                                        }
                                    } else {
                                        if (aw.a().d != null && (main.a.n[12] || ag.a(aw.a().d)) && aw.a().d != null) {
                                            aw.a().d.a();
                                        }
                                        if (aw.a().e != null && (main.a.n[13] || ag.a(aw.a().e)) && aw.a().e != null) {
                                            aw.a().e.a();
                                        }
                                        if (aw.a().f != null && (main.a.n[5] || ag.a(aw.a().f)) && aw.a().f != null) {
                                            aw.a().f.a();
                                        }
                                    }
                                    var1_1 = this;
                                    if (dg.dD && main.a.J == null) {
                                        var3_26 = false;
                                        if (main.a.n[4]) {
                                            if (--dg.U < 0) {
                                                dg.U = var1_1.dU.length - 1;
                                            }
                                            var3_26 = true;
                                        } else if (main.a.n[6]) {
                                            if (++dg.U >= var1_1.dU.length) {
                                                dg.U = 0;
                                            }
                                            var3_26 = true;
                                        } else if (main.a.n[8]) {
                                            if (dg.U + var1_1.dT <= var1_1.dU.length - 1) {
                                                dg.U += var1_1.dT;
                                            }
                                            var3_26 = true;
                                        } else if (main.a.n[2]) {
                                            if (dg.U - var1_1.dT >= 0) {
                                                dg.U -= var1_1.dT;
                                            }
                                            var3_26 = true;
                                        }
                                        if (var3_26) {
                                            dg.aa.a(dg.U / dg.gJ * dg.aa.h);
                                            main.a.i();
                                            main.a.h();
                                        }
                                        if (main.a.g) {
                                            var4_11 = dg.aa.b();
                                            if (var4_11.a || var4_11.c) {
                                                dg.U = var4_11.b;
                                            }
                                        }
                                    }
                                    var1_1 = this;
                                    if (!dg.cU && !dg.cW && !dg.cX && !dg.aP && !dg.cZ && !dg.dC && !dg.cY && !dg.dH) break block440;
                                    if (!dg.dH) break block441;
                                    if (dg.dH) {
                                        var3_27 = dg.aa.b();
                                        if (var3_27.a || var3_27.c) {
                                            dg.U = var3_27.b;
                                            if (dg.U >= dg.aF.length) {
                                                dg.U = -1;
                                            }
                                            if (dg.U >= 0) {
                                                dg.cL = 1;
                                            }
                                            var1_1.C();
                                        }
                                    }
                                    break block440;
                                }
                                if (!dg.cW) break block442;
                                if (dg.G.size() == 0) break block440;
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.G.size()) {
                                        dg.V = dg.G.size() - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                super.aF();
                                break block443;
                            }
                            if (dg.cX) {
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.H.size()) {
                                        dg.V = dg.H.size() - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                var1_1.s();
                            } else if (dg.aP) {
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.cM) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = dg.cM - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                super.aE();
                            } else if (dg.cZ) {
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.cM) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = dg.cM - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                super.aD();
                            } else if (dg.dC) {
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.M.size()) {
                                        dg.V = dg.M.size() - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                if (var1_1.bm > 0 && !main.a.g) {
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                super.aA();
                            } else if (dg.cY) {
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.J.size()) {
                                        dg.V = dg.J.size() - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                super.aC();
                            } else if (dg.cU) {
                                if (main.a.n[8]) {
                                    if (++dg.V >= dg.J.size()) {
                                        dg.V = dg.J.size() - 1;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                } else if (main.a.n[2]) {
                                    if (--dg.V < 0) {
                                        dg.V = 0;
                                    }
                                    dg.aa.a(dg.V * dg.aa.h);
                                }
                                super.aB();
                            }
                        }
                        if (main.a.g && main.a.J == null && !main.a.F.a) {
                            var3_28 = null;
                            if (dg.cW) {
                                var3_28 = dg.G;
                            } else if (dg.aP) {
                                var3_28 = dg.I;
                            } else if (dg.cZ) {
                                var3_28 = dg.L;
                            } else if (dg.cX) {
                                var3_28 = dg.H;
                            } else if (dg.dC) {
                                var3_28 = dg.M;
                            } else if (dg.cY) {
                                var3_28 = dg.J;
                            } else if (dg.cU) {
                                var3_28 = dg.J;
                            }
                            var4_12 = dg.aa.b();
                            if (var4_12.a || var4_12.c) {
                                dg.V = var4_12.b;
                                if (dg.V >= var3_28.size()) {
                                    dg.V = -1;
                                }
                                if (dg.cW) {
                                    super.aF();
                                } else if (dg.aP) {
                                    super.aE();
                                } else if (dg.cZ) {
                                    super.aD();
                                } else if (dg.dC) {
                                    super.aA();
                                } else if (dg.cY) {
                                    super.aC();
                                } else if (dg.cU) {
                                    super.aB();
                                }
                            }
                        }
                        main.a.i();
                        main.a.h();
                    }
                    this.B();
                    this.av();
                    var1_1 = this;
                    if (!dg.dE) break block444;
                    if (dg.cL == 0) {
                        if (main.a.n[8]) {
                            dg.cL = bp.ae == null ? 0 : 1;
                            dg.U = 0;
                            dg.V = -1;
                            if (dg.W == 0) {
                                dg.U = bp.ae.e;
                            }
                            dg.aa.a();
                            dg.cO.a();
                        }
                        if (main.a.n[4]) {
                            dg.U = 0;
                            dg.V = -1;
                            dg.aa.a();
                            dg.cO.a();
                            if (--dg.W < 0) {
                                dg.W = df.fH.length - 1;
                            }
                            if (dg.W >= df.fH.length) {
                                dg.W = 0;
                            }
                            if (dg.W == 1 && dg.dF) {
                                dq.a().x();
                                dg.dF = false;
                            } else if (dg.W == 2) {
                                dq.a().y();
                            } else if (dg.W == 3) {
                                dq.a().z();
                            } else if (dg.W == 4) {
                                dq.a().y();
                            }
                            dg.b(175, 200);
                        }
                        if (main.a.n[6]) {
                            dg.U = 0;
                            dg.V = -1;
                            dg.aa.a();
                            dg.cO.a();
                            if (++dg.W < 0) {
                                dg.W = df.fH.length - 1;
                            }
                            if (dg.W >= df.fH.length) {
                                dg.W = 0;
                            }
                            if (dg.W == 1 && dg.dF) {
                                dq.a().x();
                                dg.dF = false;
                            } else if (dg.W == 2) {
                                dq.a().y();
                            } else if (dg.W == 3) {
                                dq.a().z();
                            } else if (dg.W == 4) {
                                dq.a().y();
                            }
                            dg.b(175, 200);
                        }
                        super.ax();
                    } else if (dg.aQ) {
                        if (main.a.n[2]) {
                            if (--dg.V < 0) {
                                dg.V = dg.cM - 1;
                            }
                            dg.cO.a(dg.V * dg.cO.h);
                        } else if (main.a.n[8]) {
                            if (++dg.V >= dg.cM) {
                                dg.V = 0;
                            }
                            dg.cO.a(dg.V * dg.cO.h);
                        }
                    } else {
                        if (dg.V < 0) {
                            dg.V = 0;
                        }
                        if (dg.W == 2) {
                            if (bp.ae != null && bp.ae.p != null) {
                                if (main.a.n[4]) {
                                    if (--dg.U < 0) {
                                        dg.U = bp.ae.p.length - 1;
                                    }
                                } else if (main.a.n[6]) {
                                    if (++dg.U >= bp.ae.p.length) {
                                        dg.U = 0;
                                    }
                                } else if (main.a.n[8]) {
                                    if (dg.U + dg.gJ <= bp.ae.p.length - 1) {
                                        dg.U += dg.gJ;
                                    }
                                } else if (main.a.n[2]) {
                                    if (dg.U >= 0 && dg.U < dg.gJ) {
                                        dg.cL = 0;
                                        dg.U = 0;
                                    } else if (dg.U - dg.gJ >= 0) {
                                        dg.U -= dg.gJ;
                                    }
                                }
                                dg.aa.a(dg.U / dg.gJ * dg.aa.h);
                            }
                        } else if (dg.W == 0 && dg.cL == 1) {
                            if (main.a.n[8]) {
                                ++dg.cL;
                            } else if (main.a.n[2]) {
                                --dg.cL;
                            }
                        } else if (dg.W == 4) {
                            var3_29 = var1_1;
                            if (main.a.n[2]) {
                                if (dg.V == 0) {
                                    --dg.cL;
                                    dg.V = -1;
                                } else {
                                    --dg.V;
                                }
                                dg.aa.a(dg.V * dg.aa.h);
                            } else if (main.a.n[8]) {
                                if (++dg.V >= dg.cM) {
                                    dg.V = 0;
                                }
                                dg.aa.a(dg.V * dg.aa.h);
                            } else if (main.a.n[4]) {
                                var3_29.hw = (byte)(var3_29.hw - 1);
                                if (var3_29.hw < 0) {
                                    var3_29.hw = 0;
                                }
                            } else if (main.a.n[6]) {
                                var3_29.hw = (byte)(var3_29.hw + 1);
                                if (var3_29.hw > var3_29.hx.size() - 1) {
                                    var3_29.hw = (byte)(var3_29.hx.size() - 1);
                                }
                            }
                        } else if (main.a.n[2]) {
                            if (dg.V == 0) {
                                --dg.cL;
                                dg.V = -1;
                            } else {
                                --dg.V;
                            }
                            dg.aa.a(dg.V * dg.aa.h);
                            if (dg.W == 1 && dg.dF) {
                                dq.a().x();
                                dg.dF = false;
                            }
                        } else if (main.a.n[8]) {
                            if (++dg.V >= dg.cM) {
                                dg.V = 0;
                            }
                            dg.aa.a(dg.V * dg.aa.h);
                        }
                        super.ax();
                    }
                    if (!main.a.g) break block445;
                    var3_30 = var1_1;
                    if (main.a.J != null || main.a.F.a) break block445;
                    if (main.a.r) {
                        if (main.a.b(dg.ce, dg.cd, dg.cf, var3_30.hb) && (!dg.aQ || main.a.A >= 320) && main.a.q) {
                            if (main.a.b(dg.d - 90, dg.cd + 5, 60, 40)) {
                                dg.U = 0;
                                --dg.W;
                                dg.V = 0;
                            }
                            if (main.a.b(dg.d + 20, dg.cd + 5, 60, 40)) {
                                dg.U = 0;
                                ++dg.W;
                                dg.V = 0;
                            }
                            dg.aQ = false;
                            dg.aa.a();
                            dg.cO.a();
                            if (dg.W < 0) {
                                dg.W = df.fH.length - 1;
                            }
                            if (dg.W > df.fH.length - 1) {
                                dg.W = 0;
                            }
                            dg.cL = 1;
                            if (dg.W == 1 && dg.dF) {
                                dq.a().x();
                                dg.dF = false;
                            } else if (dg.W == 2 && bp.ae != null && bp.ae.p == null) {
                                dq.a().y();
                            }
                            if (dg.W == 3) {
                                dq.a().z();
                            }
                            if (dg.W == 4) {
                                dq.a().y();
                            }
                            dg.b(175, 200);
                            super.ax();
                        }
                        if (dg.W == 4) {
                            var2_6 = var3_30;
                            var4_13 = var2_6.hG - var2_6.hI / 2;
                            var5_23 = var2_6.hH - var2_6.hI / 2;
                            var6_33 = (var2_6.hI + 5) * var2_6.hx.size();
                            if (main.a.b(var4_13, var5_23, var6_33, var7_34 = var2_6.hI) && (var1_2 = (main.a.s - var4_13) / (var2_6.hI + 5)) >= 0 && var1_2 < var2_6.hx.size()) {
                                var2_6.hw = (byte)var1_2;
                            }
                        }
                    }
                    if (!dg.aQ) break block446;
                    var4_14 = dg.cO.b();
                    if (var4_14.a || var4_14.c) {
                        dg.V = var4_14.b;
                        dg.cL = 1;
                    }
                    if (main.a.i) break block445;
                }
                if (dg.W == 2) {
                    var4_15 = dg.aa.b();
                    if (var4_15.a || var4_15.c) {
                        dg.U = var4_15.b;
                        dg.cL = 1;
                        var3_30.b(1509, null);
                    }
                } else if (dg.W == 0 && main.a.b(dg.ce + 18, dg.cd + 32, 5 * dg.cK, dg.cK) && main.a.r && main.a.q) {
                    if (bp.ae != null) {
                        dg.U = bp.ae.e;
                        dg.cL = 1;
                    }
                } else if (dg.W == 0 || dg.W == 3) {
                    if (!dg.aQ) {
                        var4_16 = dg.aa.b();
                        if (var4_16.a || var4_16.c) {
                            dg.V = var4_16.b;
                            v1 = dg.cL = dg.W == 0 ? 2 : 1;
                            if (var4_16.c) {
                                dg.aa.a(dg.V * dg.aa.h);
                            }
                        }
                    }
                } else if (dg.W == 1 && dg.F.size() != 0) {
                    var4_17 = dg.aa.b();
                    if (var4_17.a || var4_17.c) {
                        dg.V = var4_17.b;
                        var3_30.C();
                    }
                }
            }
            main.a.i();
            main.a.h();
        }
        if (dg.cV) {
            if (dg.cL == 0) {
                if (dg.cL == 0 && main.a.n[8]) {
                    dg.cL = 1;
                    dg.V = -1;
                    dg.aa.a();
                    dg.cO.a();
                }
            } else {
                if (dg.V < 0) {
                    dg.V = 0;
                }
                if (main.a.n[2]) {
                    if (dg.V == 0) {
                        --dg.cL;
                        dg.V = -1;
                    } else {
                        --dg.V;
                    }
                    dg.aa.a(dg.V * dg.aa.h);
                } else if (main.a.n[8]) {
                    if (++dg.V >= dg.cM) {
                        dg.V = 0;
                    }
                    dg.aa.a(dg.V * dg.aa.h);
                }
            }
            if (main.a.g) {
                var1_3 = dg.aa.b();
                if (var1_3.a || var1_3.c) {
                    dg.V = var1_3.b;
                    dg.cL = 1;
                }
            }
        }
        this.ay();
        this.az();
        if (bp.d().bL != null) {
            var1_4 = 0;
            while (var1_4 < main.a.n.length) {
                if (main.a.n[var1_4]) {
                    bp.d().bL = null;
                    break;
                }
                ++var1_4;
            }
        }
        if (aw.a().b && main.a.U != 0) {
            var3_31 = main.a.U;
            var1_5 = aw.a();
            if (var1_5.b) {
                var1_5.a.a(var3_31);
            }
            var1_5.e.a = var1_5.a.d().equals("") != false ? df.H : df.W;
            main.a.U = 0;
        }
        if (this.ea) {
            main.a.i();
            main.a.h();
            return;
        }
        if (main.a.F.a || dg.aI() || bp.bH) {
            return;
        }
        if (main.a.n[10]) {
            main.a.n[10] = false;
            dg.x();
            main.a.h();
        }
        if (main.a.n[11]) {
            main.a.n[11] = false;
            dg.w();
            main.a.h();
        }
        if (main.a.U != 0 && ad.h) {
            if (main.a.U == 32) {
                dg.x();
                main.a.U = 0;
                main.a.h();
            } else if (main.a.U == 64) {
                dg.w();
                main.a.U = 0;
                main.a.h();
            } else if (main.a.U == 48) {
                dg.w();
                main.a.U = 0;
                main.a.h();
            } else if (main.a.U == 63) {
                dg.w();
                main.a.U = 0;
                main.a.h();
            }
        }
        if (bp.d().bX != null) {
            return;
        }
        if (!bp.d().d) {
            if (bp.d().n == 1) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                    this.b(false);
                } else if (main.a.o[2]) {
                    if (!bp.d().bI && !bp.d().bK) {
                        dg.h(0);
                    }
                } else if (main.a.o[1]) {
                    bp.d().o = -1;
                    if (!bp.d().bI && !bp.d().bK) {
                        dg.h(-4);
                    }
                } else if (main.a.o[3]) {
                    bp.d().o = 1;
                    if (!bp.d().bI && !bp.d().bK) {
                        dg.h(4);
                    }
                } else if (main.a.o[4]) {
                    bp.d().al = false;
                    if (bp.d().o == 1) {
                        bp.d().o = -1;
                    } else if (!bp.d().bI && !bp.d().bK) {
                        bp.d().n = 2;
                        bp.d().k = -bp.d().b();
                    }
                } else if (main.a.o[6]) {
                    bp.d().al = false;
                    if (bp.d().o == -1) {
                        bp.d().o = 1;
                    } else if (!bp.d().bI && !bp.d().bK) {
                        bp.d().n = 2;
                        bp.d().k = bp.d().b();
                    }
                }
            } else if (bp.d().n == 2) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                    this.b(false);
                } else if (main.a.o[2]) {
                    bp.d().l = bp.d().aj != false ? -10 : -8;
                    bp.d().n = 3;
                    bp.d().m = 0;
                } else if (main.a.o[1]) {
                    bp.d().o = -1;
                    bp.d().l = bp.d().aj != false ? -10 : -8;
                    bp.d().k = -4;
                    bp.d().n = 3;
                    bp.d().m = 0;
                } else if (main.a.o[3]) {
                    bp.d().o = 1;
                    bp.d().l = bp.d().aj != false ? -10 : -8;
                    bp.d().k = 4;
                    bp.d().n = 3;
                    bp.d().m = 0;
                } else if (main.a.o[4]) {
                    if (bp.d().o == 1) {
                        bp.d().o = -1;
                    } else {
                        v2 = bp.d();
                        v3 = -bp.d().b();
                        bp.d();
                        v2.k = v3;
                    }
                } else if (main.a.o[6]) {
                    if (bp.d().o == -1) {
                        bp.d().o = 1;
                    } else {
                        v4 = bp.d();
                        v5 = bp.d().b();
                        bp.d();
                        v4.k = v5;
                    }
                }
            } else if (bp.d().n == 3) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                    this.b(false);
                }
                if (main.a.o[4] || main.a.o[1]) {
                    if (bp.d().o == 1) {
                        bp.d().o = -1;
                    } else {
                        bp.d().k = -bp.d().b();
                    }
                } else if (main.a.o[6] || main.a.o[3]) {
                    if (bp.d().o == -1) {
                        bp.d().o = 1;
                    } else {
                        bp.d().k = bp.d().b();
                    }
                }
                if ((main.a.o[2] || main.a.o[1] || main.a.o[3]) && bp.d().aj && bp.d().m == 0 && bp.d().l > -4) {
                    ++bp.d().m;
                    bp.d().l = -7;
                }
            } else if (bp.d().n == 4) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                    this.b(false);
                }
                if (main.a.n[2]) {
                    main.a.h();
                }
                if (main.a.o[4]) {
                    if (bp.d().o == 1) {
                        bp.d().o = -1;
                    } else {
                        bp.d().k = -bp.d().b();
                    }
                } else if (main.a.o[6]) {
                    if (bp.d().o == -1) {
                        bp.d().o = 1;
                    } else {
                        bp.d().k = bp.d().b();
                    }
                }
            } else if (bp.d().n == 10) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                    this.b(false);
                }
                if (main.a.o[2]) {
                    bp.d().l = -10;
                    bp.d().n = 3;
                    bp.d().m = 0;
                } else if (main.a.o[4]) {
                    if (bp.d().o == 1) {
                        bp.d().o = -1;
                    } else {
                        bp.d().k = -5;
                    }
                } else if (main.a.o[6]) {
                    if (bp.d().o == -1) {
                        bp.d().o = 1;
                    } else {
                        bp.d().k = 5;
                    }
                }
            } else if (bp.d().n == 7) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                }
                if (main.a.o[4]) {
                    if (bp.d().o == 1) {
                        bp.d().o = -1;
                    } else {
                        bp.d().k = -bp.d().b() + 2;
                    }
                } else if (main.a.o[6]) {
                    if (bp.d().o == -1) {
                        bp.d().o = 1;
                    } else {
                        bp.d().k = bp.d().b() - 2;
                    }
                }
            } else if (bp.d().n == 11) {
                if (main.a.n[5]) {
                    main.a.n[5] = false;
                    this.b(false);
                }
                if (main.a.o[2]) {
                    bp.d().l = -10;
                    bp.d().n = 3;
                    bp.d().m = 0;
                }
            }
            if (main.a.n[8] && main.a.U != 56) {
                main.a.n[8] = false;
                this.as();
            }
        } else {
            this.dj();
        }
        if (main.a.U != 0) {
            if (ad.h) {
                if (main.a.U == 113) {
                    this.cI = true;
                    if (dg.ey[0] != null) {
                        this.a(dg.ey[0], true, true);
                    }
                } else if (main.a.U == 119) {
                    this.cI = true;
                    if (dg.ey[1] != null) {
                        this.a(dg.ey[1], true, true);
                    }
                } else if (main.a.U == 101) {
                    this.cI = true;
                    if (dg.ey[2] != null) {
                        this.a(dg.ey[2], true, true);
                    }
                } else {
                    aw.a().a(main.a.U, this, df.gI[0]);
                }
            } else if (!main.a.c) {
                aw.a().a(main.a.U, this, df.gI[0]);
            } else if (main.a.U == 55) {
                this.cI = true;
                if (dg.ey[0] != null) {
                    this.a(dg.ey[0], true, true);
                }
            } else if (main.a.U == 56) {
                this.cI = true;
                if (dg.ey[1] != null) {
                    this.a(dg.ey[1], true, true);
                }
            } else if (main.a.U == 57) {
                this.cI = true;
                if (dg.ey[2] != null) {
                    this.a(dg.ey[2], true, true);
                }
            } else if (main.a.U == 48) {
                aw.a().a(df.gI[0]);
            }
            main.a.U = 0;
        }
    }

    private void aq() {
        cb = 0;
        bp.d().bI = false;
        this.cc = false;
    }

    public static void w() {
        if (!bp.d().e(17)) {
            int n2 = 0;
            while (n2 < bp.d().aB.length) {
                if (bp.d().aB[n2] != null && bp.d().aB[n2].b.b == 17) {
                    ae.a(df.fY);
                    return;
                }
                ++n2;
            }
            if (cb != 1) {
                ae.a(df.fZ);
            }
        }
    }

    public static void x() {
        int n2 = (int)(System.currentTimeMillis() / 1000L);
        int n3 = 0;
        while (n3 < bp.d().ay.size()) {
            m m2 = (m)bp.d().ay.elementAt(n3);
            if (m2.e.a == 21 && m2.c - (n2 - m2.b) >= 2) {
                return;
            }
            ++n3;
        }
        if (!bp.d().e(16)) {
            n3 = 0;
            while (n3 < bp.d().aB.length) {
                if (bp.d().aB[n3] != null && bp.d().aB[n3].b.b == 16) {
                    ae.a(df.fY);
                    return;
                }
                ++n3;
            }
            if (cb != 1) {
                ae.a(df.ga);
            }
        }
    }

    private static boolean ar() {
        if (bp.d().aR != null) {
            return bp.d().aR.c().e == 142 && bp.d().aN == 4 || bp.d().aR.c().e == 143 && bp.d().aN == 5 || bp.d().aR.c().e == 143 && bp.d().aN == 6;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void b(boolean var1_1) {
        block25: {
            block27: {
                block41: {
                    block52: {
                        block50: {
                            block51: {
                                block42: {
                                    block49: {
                                        block48: {
                                            block46: {
                                                block47: {
                                                    block45: {
                                                        block44: {
                                                            block43: {
                                                                block40: {
                                                                    block31: {
                                                                        block39: {
                                                                            block38: {
                                                                                block36: {
                                                                                    block37: {
                                                                                        block35: {
                                                                                            block34: {
                                                                                                block33: {
                                                                                                    block32: {
                                                                                                        block30: {
                                                                                                            block29: {
                                                                                                                block28: {
                                                                                                                    block26: {
                                                                                                                        if (bp.d().n == 14) break block25;
                                                                                                                        if (!b.c && !bp.d().bJ && !bp.bH && !bp.d().bK) break block26;
                                                                                                                        v0 = false;
                                                                                                                        break block27;
                                                                                                                    }
                                                                                                                    if (bp.d().aR == null || !(bp.d().aR.s == 97 && bp.d().aN == 4 || bp.d().aR.s == 98 && bp.d().aN == 4 || bp.d().aR.s == 96 && bp.d().aN == 5 || bp.d().aR.s == 99 && bp.d().aN == 5 || bp.d().aR.s == 200 && bp.d().aN == 4 || bp.d().aR.s == 199 && bp.d().aN == 5) && (bp.d().aR.s != 198 || bp.d().aN != 6)) break block28;
                                                                                                                    v0 = false;
                                                                                                                    break block27;
                                                                                                                }
                                                                                                                if (bp.d().az == null || bp.d().az.a.d != 2 || bp.d().aU != null) break block29;
                                                                                                                v0 = dg.ap();
                                                                                                                break block27;
                                                                                                            }
                                                                                                            if (bp.d().bX == null && (bp.d().aV == null || !bp.d().aV.B()) && (bp.d().aR != null || bp.d().aU != null || bp.d().aV != null || bp.d().aW != null)) break block30;
                                                                                                            v0 = false;
                                                                                                            break block27;
                                                                                                        }
                                                                                                        if (bp.d().aR == null) break block31;
                                                                                                        if (bp.d().az != null) break block32;
                                                                                                        v0 = false;
                                                                                                        break block27;
                                                                                                    }
                                                                                                    if (bp.d().aD[1] != null) break block33;
                                                                                                    ae.a(df.gC);
                                                                                                    v0 = false;
                                                                                                    break block27;
                                                                                                }
                                                                                                if (bp.d().aR.h != 1 && bp.d().aR.h != 0 && bp.d().az.a.d != 4) break block34;
                                                                                                v0 = false;
                                                                                                break block27;
                                                                                            }
                                                                                            if (dg.ap()) break block35;
                                                                                            v0 = false;
                                                                                            break block27;
                                                                                        }
                                                                                        bp.d().o = bp.d().i < bp.d().aR.e ? 1 : -1;
                                                                                        var2_2 = Math.abs(bp.d().i - bp.d().aR.e);
                                                                                        var3_7 = Math.abs(bp.d().j - bp.d().aR.f);
                                                                                        bp.d().k = 0;
                                                                                        if (!bp.d().c()) break block36;
                                                                                        if (var2_2 > bp.d().az.g || var3_7 > bp.d().az.h) break block37;
                                                                                        main.a.i();
                                                                                        main.a.h();
                                                                                        ** GOTO lbl-1000
                                                                                    }
                                                                                    bp.d().bL = new cd(bp.d().aR.e, bp.d().j);
                                                                                    main.a.i();
                                                                                    main.a.h();
                                                                                    v0 = false;
                                                                                    break block27;
                                                                                }
                                                                                if (bp.d().az.a.a != 24 && bp.d().az.a.a != 40 && bp.d().az.a.a != 42 || var2_2 > bp.d().az.g || var3_7 > bp.d().az.h) break block38;
                                                                                main.a.i();
                                                                                main.a.h();
                                                                                bp.d().k = 0;
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            if (var2_2 > bp.d().az.g || var3_7 > bp.d().az.h || bp.d().j < bp.d().aR.f - 10) break block39;
                                                                            main.a.i();
                                                                            main.a.h();
                                                                            bp.d().k = 0;
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        bp.d().bL = new cd(bp.d().aR.e + bp.d().aR.g * 12, bp.d().j);
                                                                        main.a.i();
                                                                        main.a.h();
                                                                        v0 = false;
                                                                        break block27;
                                                                    }
                                                                    if (bp.d().aU == null) break block40;
                                                                    bp.d().o = bp.d().i < bp.d().aU.i ? 1 : -1;
                                                                    bp.d().aU.o = bp.d().i < bp.d().aU.i ? -1 : 1;
                                                                    var2_3 = Math.abs(bp.d().i - bp.d().aU.i);
                                                                    var3_8 = Math.abs(bp.d().j - bp.d().aU.j);
                                                                    if (var2_3 < 60 && var3_8 < 40) {
                                                                        main.a.i();
                                                                        main.a.h();
                                                                        if (bp.d().aU.cm.a == 13) {
                                                                            b.a();
                                                                            dq.a().e();
                                                                        } else {
                                                                            dq.a().h(bp.d().aU.cm.a);
                                                                            b.a();
                                                                        }
                                                                    } else {
                                                                        bp.d().bL = new cd(bp.d().aU.i, bp.d().j);
                                                                        main.a.i();
                                                                        main.a.h();
                                                                    }
                                                                    v0 = false;
                                                                    break block27;
                                                                }
                                                                if (bp.d().aV == null) break block41;
                                                                bp.d().o = bp.d().i < bp.d().aV.i ? 1 : -1;
                                                                var2_4 = Math.abs(bp.d().i - bp.d().aV.i);
                                                                var3_9 = Math.abs(bp.d().j - bp.d().aV.j);
                                                                if (!bp.d().b(bp.d().aV)) break block42;
                                                                if (bp.d().az != null) break block43;
                                                                v0 = false;
                                                                break block27;
                                                            }
                                                            if (bp.d().aD[1] != null) break block44;
                                                            ae.a(df.gC);
                                                            v0 = false;
                                                            break block27;
                                                        }
                                                        if (dg.ap()) break block45;
                                                        v0 = false;
                                                        break block27;
                                                    }
                                                    bp.d().o = bp.d().i < bp.d().aV.i ? 1 : -1;
                                                    bp.d().k = 0;
                                                    if (!bp.d().c()) break block46;
                                                    if (var2_4 > bp.d().az.g || var3_9 > bp.d().az.h) break block47;
                                                    main.a.i();
                                                    main.a.h();
                                                    ** GOTO lbl-1000
                                                }
                                                bp.d().bL = new cd(bp.d().aV.i, bp.d().j);
                                                main.a.i();
                                                main.a.h();
                                                v0 = false;
                                                break block27;
                                            }
                                            if (bp.d().az.a.a != 24 && bp.d().az.a.a != 40 && bp.d().az.a.a != 42 || var2_4 > bp.d().az.g || var3_9 > bp.d().az.h) break block48;
                                            main.a.i();
                                            main.a.h();
                                            bp.d().k = 0;
                                            ** GOTO lbl-1000
                                        }
                                        if (var2_4 > bp.d().az.g || var3_9 > bp.d().az.h || bp.d().j < bp.d().aV.j) break block49;
                                        main.a.i();
                                        main.a.h();
                                        bp.d().k = 0;
                                        ** GOTO lbl-1000
                                    }
                                    bp.d().bL = new cd(bp.d().aV.i + bp.d().aV.o * 12, bp.d().j);
                                    main.a.i();
                                    main.a.h();
                                    v0 = false;
                                    break block27;
                                }
                                if (var2_4 >= 60 || var3_9 >= 40 || bp.d().aV.p < 0) break block50;
                                main.a.i();
                                if (bp.d().aV.n == 14 || bp.d().aV.n == 5 || af.n != 1) break block51;
                                v0 = false;
                                break block27;
                            }
                            if (!this.cI) {
                                var2_5 = new aa();
                                var2_5.addElement(new bd(df.gb[6], 110397));
                                var2_5.addElement(new bd(df.gb[4], 110391));
                                if ((bp.d().ad == 4 || bp.d().ad == 3 || bp.d().ad == 2) && bp.d().aV.ac.equals("")) {
                                    var2_5.addElement(new bd(df.gb[8], 110398));
                                }
                                if ((bp.d().aV.ad == 4 || bp.d().aV.ad == 3 || bp.d().aV.ad == 2) && bp.d().ac.equals("")) {
                                    var2_5.addElement(new bd(df.gb[9], 110399));
                                }
                                var2_5.addElement(new bd(df.gb[7], 12004, bp.d().aV.ab));
                                if (bp.d().av.a == 6) {
                                    var2_5.addElement(new bd(String.valueOf(df.gb[11]) + ": " + (bp.bq == false ? df.Q : df.R), 1103991));
                                }
                                if (bp.d().aV.n != 14 && bp.d().aV.n != 5) {
                                    var2_5.addElement(new bd(df.gb[0], 110392));
                                    var2_5.addElement(new bd(df.gb[1], 110393));
                                    var2_5.addElement(new bd(df.gb[2], 110394));
                                } else if (bp.d().az.a.d == 4) {
                                    var2_5.addElement(new bd(df.gb[5], 110395));
                                }
                                var2_5.addElement(new bd(df.gb[3], 110396));
                                main.a.F.a(var2_5);
                                main.a.F.e = (byte)5;
                            }
                            this.cI = false;
                            break block52;
                        }
                        bp.d().bL = new cd(bp.d().aV.i, bp.d().j);
                        main.a.i();
                        main.a.h();
                    }
                    v0 = false;
                    break block27;
                }
                if (bp.d().aW != null) {
                    if (bp.d().n != 1) {
                        v0 = false;
                    } else {
                        bp.d().o = bp.d().i < bp.d().aW.a ? 1 : -1;
                        var2_6 = Math.abs(bp.d().i - bp.d().aW.a);
                        var3_10 = Math.abs(bp.d().j - bp.d().aW.b);
                        if (var2_6 <= 35 && var3_10 < 35 || dg.cb != 0 && var2_6 <= 48 && var3_10 <= 48) {
                            main.a.i();
                            main.a.h();
                            dq.a().q(bp.d().aW.g);
                        } else {
                            bp.d().bL = new cd(bp.d().aW.a, bp.d().j);
                            main.a.i();
                            main.a.h();
                        }
                        v0 = false;
                    }
                } else lbl-1000:
                // 7 sources

                {
                    v0 = true;
                }
            }
            if (v0) {
                if (dg.ar()) {
                    this = new aa();
                    this.addElement(new bd(df.iu, 151301));
                    main.a.F.a((aa)this);
                    return;
                }
                if (bp.d().aR != null && bp.d().aR.c().e == 144 && af.o == 130) {
                    this = new aa();
                    this.addElement(new bd(df.iy, 151301));
                    main.a.F.a((aa)this);
                    return;
                }
                bp.d().a(dg.A[bp.d().az.a.a], 0);
                bp.d().cl = var1_1;
                if (bp.d().ao) {
                    bp.d().ao = false;
                    bp.d().bz = System.currentTimeMillis();
                    if (bp.d().bM >= 500) {
                        ap.a(60, bp.d(), 1);
                    }
                }
                if (bp.d().p() && !bp.d().ap) {
                    bp.d().an = false;
                    bp.d().ap = true;
                    ap.a(60, bp.d(), 1);
                }
                if (bp.d().D() && !bp.d().ap) {
                    bp.d().aq = false;
                    bp.d().ap = true;
                    ap.a(60, bp.d(), 1);
                }
            }
        }
        if (!var1_1) {
            bp.d().ck = bp.d().az;
        }
    }

    private void as() {
        this.eI = 0;
        int n2 = 0;
        while (n2 < ez.length) {
            if (ez[n2] != null) {
                ++this.eI;
            }
            ++n2;
        }
        if (this.eI > 1) {
            if (!da || this.eJ == -1) {
                da = true;
                n2 = 0;
                while (n2 < ez.length) {
                    if (ez[n2] == bp.d().az) {
                        this.eJ = n2;
                        break;
                    }
                    ++n2;
                }
            }
            ++this.eJ;
            if (this.eJ >= ez.length) {
                this.eJ = 0;
            }
            if (ez[this.eJ] == null) {
                this.eJ = 0;
            }
            this.l = new bd("", 11059);
            return;
        }
        ae.b();
    }

    public final void a(z z2, boolean bl2, boolean bl3) {
        this.eJ = -1;
        if (z2 != null) {
            if (z2.a.d == 4 && bp.d().aV != null) {
                if (bp.d().aV.B()) {
                    return;
                }
                if (bp.d().aV.n == 14 || bp.d().aV.n == 5) {
                    dq.a().x(bp.d().aV.p);
                    if ((af.a(bp.d().i, bp.d().j) & 2) == 2) {
                        bp.d().a(A[49], 0);
                    } else {
                        bp.d().a(A[49], 1);
                    }
                }
            }
            if (bl3) {
                dq.a().g(z2.a.a);
            }
        }
        if (z2.a.d != 2) {
            this.v();
        }
        if (z2 != null) {
            bp.d().az = z2;
            if (bp.d().aU == null && z2.a.d != 4) {
                this.b(bl2);
            }
        }
    }

    public static void c(int n2) {
        aa aa2 = n2 == 0 ? I : L;
        int n3 = 0;
        while (n3 < aa2.size() - 1) {
            cz cz2 = (cz)aa2.elementAt(n3);
            int n4 = n3 + 1;
            while (n4 < aa2.size()) {
                cz cz3;
                cz cz4 = (cz)aa2.elementAt(n4);
                if (cz4.b > cz2.b) {
                    cz3 = cz4;
                    cz4 = cz2;
                    cz2 = cz3;
                    aa2.setElementAt(cz2, n3);
                    aa2.setElementAt(cz4, n4);
                } else if (cz4.b == cz2.b && cz2.a.compareTo(cz4.a) > 0) {
                    cz3 = cz4;
                    cz4 = cz2;
                    cz2 = cz3;
                    aa2.setElementAt(cz2, n3);
                    aa2.setElementAt(cz4, n4);
                }
                ++n4;
            }
            ++n3;
        }
    }

    public static void y() {
        int n2 = 0;
        while (n2 < F.size() - 1) {
            bn bn2 = (bn)F.elementAt(n2);
            int n3 = n2 + 1;
            while (n3 < F.size()) {
                bn bn3;
                bn bn4 = (bn)F.elementAt(n3);
                if (cR && !cS) {
                    if (bn4.e && !bn2.e) {
                        bn3 = bn4;
                        bn4 = bn2;
                        bn2 = bn3;
                        F.setElementAt(bn2, n2);
                        F.setElementAt(bn4, n3);
                    } else if (bn4.e && bn2.e) {
                        if (bn4.c > bn2.c) {
                            bn3 = bn4;
                            bn4 = bn2;
                            bn2 = bn3;
                            F.setElementAt(bn2, n2);
                            F.setElementAt(bn4, n3);
                        } else if (bn4.c == bn2.c) {
                            if (bn4.f > bn2.f) {
                                bn3 = bn4;
                                bn4 = bn2;
                                bn2 = bn3;
                                F.setElementAt(bn2, n2);
                                F.setElementAt(bn4, n3);
                            } else if (bn2.f == bn4.f) {
                                if (bn4.g > bn2.g) {
                                    bn3 = bn4;
                                    bn4 = bn2;
                                    bn2 = bn3;
                                    F.setElementAt(bn2, n2);
                                    F.setElementAt(bn4, n3);
                                } else if (bn2.g == bn4.g) {
                                    if (bn4.b > bn2.b) {
                                        bn3 = bn4;
                                        bn4 = bn2;
                                        bn2 = bn3;
                                        F.setElementAt(bn2, n2);
                                        F.setElementAt(bn4, n3);
                                    } else if (bn2.b == bn4.b && bn2.d.compareTo(bn4.d) > 0) {
                                        bn3 = bn4;
                                        bn4 = bn2;
                                        bn2 = bn3;
                                        F.setElementAt(bn2, n2);
                                        F.setElementAt(bn4, n3);
                                    }
                                }
                            }
                        }
                    }
                } else if (cS) {
                    if (cR) {
                        if (bn4.e && !bn2.e) {
                            bn3 = bn4;
                            bn4 = bn2;
                            bn2 = bn3;
                            F.setElementAt(bn2, n2);
                            F.setElementAt(bn4, n3);
                        } else if (bn4.e && bn2.e) {
                            if (bn4.g > bn2.g) {
                                bn3 = bn4;
                                bn4 = bn2;
                                bn2 = bn3;
                                F.setElementAt(bn2, n2);
                                F.setElementAt(bn4, n3);
                            } else if (bn2.g == bn4.g) {
                                if (bn4.f > bn2.f) {
                                    bn3 = bn4;
                                    bn4 = bn2;
                                    bn2 = bn3;
                                    F.setElementAt(bn2, n2);
                                    F.setElementAt(bn4, n3);
                                } else if (bn2.f == bn4.f) {
                                    if (bn4.c > bn2.c) {
                                        bn3 = bn4;
                                        bn4 = bn2;
                                        bn2 = bn3;
                                        F.setElementAt(bn2, n2);
                                        F.setElementAt(bn4, n3);
                                    } else if (bn4.c == bn2.c && bn2.b == bn4.b && bn2.d.compareTo(bn4.d) > 0) {
                                        bn3 = bn4;
                                        bn4 = bn2;
                                        bn2 = bn3;
                                        F.setElementAt(bn2, n2);
                                        F.setElementAt(bn4, n3);
                                    }
                                }
                            }
                        }
                    } else if (bn4.g > bn2.g) {
                        bn3 = bn4;
                        bn4 = bn2;
                        bn2 = bn3;
                        F.setElementAt(bn2, n2);
                        F.setElementAt(bn4, n3);
                    } else if (bn2.g == bn4.g) {
                        if (bn4.f > bn2.f) {
                            bn3 = bn4;
                            bn4 = bn2;
                            bn2 = bn3;
                            F.setElementAt(bn2, n2);
                            F.setElementAt(bn4, n3);
                        } else if (bn2.f == bn4.f) {
                            if (bn4.c > bn2.c) {
                                bn3 = bn4;
                                bn4 = bn2;
                                bn2 = bn3;
                                F.setElementAt(bn2, n2);
                                F.setElementAt(bn4, n3);
                            } else if (bn4.c == bn2.c && bn2.b == bn4.b && bn2.d.compareTo(bn4.d) > 0) {
                                bn3 = bn4;
                                bn4 = bn2;
                                bn2 = bn3;
                                F.setElementAt(bn2, n2);
                                F.setElementAt(bn4, n3);
                            }
                        }
                    }
                } else if (bn4.c > bn2.c) {
                    bn3 = bn4;
                    bn4 = bn2;
                    bn2 = bn3;
                    F.setElementAt(bn2, n2);
                    F.setElementAt(bn4, n3);
                } else if (bn4.c == bn2.c) {
                    if (bn4.f > bn2.f) {
                        bn3 = bn4;
                        bn4 = bn2;
                        bn2 = bn3;
                        F.setElementAt(bn2, n2);
                        F.setElementAt(bn4, n3);
                    } else if (bn2.f == bn4.f) {
                        if (bn4.g > bn2.g) {
                            bn3 = bn4;
                            bn4 = bn2;
                            bn2 = bn3;
                            F.setElementAt(bn2, n2);
                            F.setElementAt(bn4, n3);
                        } else if (bn2.g == bn4.g) {
                            if (bn4.b > bn2.b) {
                                bn3 = bn4;
                                bn4 = bn2;
                                bn2 = bn3;
                                F.setElementAt(bn2, n2);
                                F.setElementAt(bn4, n3);
                            } else if (bn2.b == bn4.b && bn2.d.compareTo(bn4.d) > 0) {
                                bn3 = bn4;
                                bn4 = bn2;
                                bn2 = bn3;
                                F.setElementAt(bn2, n2);
                                F.setElementAt(bn4, n3);
                            }
                        }
                    }
                }
                ++n3;
            }
            ++n2;
        }
    }

    public static void z() {
        int n2 = 0;
        while (n2 < bp.d().ax.size() - 1) {
            z z2 = (z)bp.d().ax.elementAt(n2);
            int n3 = n2 + 1;
            while (n3 < bp.d().ax.size()) {
                z z3 = (z)bp.d().ax.elementAt(n3);
                if (z3.a.a < z2.a.a) {
                    z z4 = z3;
                    z3 = z2;
                    z2 = z4;
                    bp.d().ax.setElementAt(z2, n2);
                    bp.d().ax.setElementAt(z3, n3);
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void h(int n2) {
        bp.d().l = bp.d().aj ? -10 : -8;
        bp.d().k = n2;
        bp.d().n = 3;
        bp.d().m = 0;
    }

    public final void c() {
        int n2;
        Object object;
        int n3 = 0;
        while (n3 < x.size()) {
            object = (s)x.elementAt(n3);
            if (object != null) {
                ((s)object).a();
                if (((s)object).c) {
                    x.removeElement(object);
                }
            }
            ++n3;
        }
        if (W == 4 && main.a.g && ag.a(this.cG) && this.cG != null) {
            main.a.r = false;
            main.a.n[5] = false;
            ag.q = -1;
            this.cG.a();
        }
        if (main.a.w % 200 == 0) {
            bp.r();
        }
        if (bZ != 0 && !main.a.a) {
            i += at.a(-7, 7);
            if (++ca > 20) {
                bZ = 0;
                ca = 0;
            }
        } else if (i != r || j != s) {
            if (!bX) {
                cv = r - i << 2;
                cw = s - j << 2;
            } else {
                cv = r - i << 1;
                cw = s - j << 2;
            }
            ct &= 0xF;
            j += (cu += cw) >> 4;
            cu &= 0xF;
            if ((i += (ct += cv) >> 4) < 24) {
                i = 24;
            }
            if (i > cx) {
                i = cx;
            }
            if (j < 0) {
                j = 0;
            }
            if (j > cy) {
                j = cy;
            }
        }
        if ((t = i / af.i - 1) < 0) {
            t = 0;
        }
        u = j / af.i;
        v = t + cq;
        w = u + cr;
        if (u < 0) {
            u = 0;
        }
        if (w > af.b - 1) {
            w = af.b - 1;
        }
        if ((af.y = (bp.d().i - 2 * b) / af.i) < 0) {
            af.y = 0;
        }
        if ((af.z = af.y + af.C) > af.a) {
            af.z = af.a;
            af.y = af.z - af.C;
        }
        if ((af.A = (bp.d().j - 2 * c) / af.i) < 0) {
            af.A = 0;
        }
        if ((af.B = af.A + af.D) > af.b) {
            af.B = af.b;
            af.A = af.B - af.D;
        }
        aa.c();
        cO.c();
        aw aw2 = aw.a();
        if (aw2.b) {
            aw2.a.c();
            aw2.a.getClass();
        }
        if (eG >= 0) {
            eG = (byte)(eG - 1);
        }
        af.b();
        main.a.a();
        main.a.d();
        if (main.a.d) {
            object = new aa();
            long l2 = System.currentTimeMillis();
            n2 = 0;
            while (n2 < M.size()) {
                bp bp2 = (bp)M.elementAt(n2);
                bp2.h();
                if (bp2.q()) {
                    if (bp2.cj && l2 - bp2.e > 10000L && l2 - this.eK > 10000L) {
                        bp2.cj = false;
                        bp2.e = l2;
                        ((aa)object).addElement(bp2);
                    }
                } else {
                    bp2.e = l2;
                    bp2.cj = true;
                }
                ++n2;
            }
            if (((Vector)object).size() > 0) {
                dq.a().a((aa)object);
                this.eK = l2;
            }
        } else {
            n2 = 0;
            while (n2 < M.size()) {
                ((bp)M.elementAt(n2)).h();
                ++n2;
            }
        }
        bp.d().h();
        if (bp.d().n == 1 && main.a.w % 100 == 0) {
            System.gc();
        }
        n2 = 0;
        while (n2 < Q.size()) {
            ((ci)Q.elementAt(n2)).a();
            ++n2;
        }
        n2 = 0;
        while (n2 < R.size()) {
            ((cy)R.elementAt(n2)).h();
            ++n2;
        }
        main.a.a().m();
        int n4 = 0;
        while (n4 < 5) {
            if (fo[n4] != -1) {
                int n5 = n4;
                fo[n5] = fo[n5] + am.e(fn[n4]);
                if (fo[n4] > 30) {
                    dg.fo[n4] = -1;
                }
                int n6 = n4;
                fk[n6] = fk[n6] + fm[n4];
                int n7 = n4;
                fl[n7] = fl[n7] + fn[n4];
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < cJ.size()) {
            object = (ac)cJ.elementAt(n4);
            ((ac)object).b -= ((ac)object).c;
            if (((ac)object).d - ((ac)object).b > 150) {
                ((ac)object).e = true;
            }
            if (((ac)dg.cJ.elementAt((int)n4)).e) {
                cJ.removeElementAt(n4);
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < 2) {
            if (fs[n4] != -1) {
                int n8 = n4;
                fs[n8] = fs[n8] + 1;
                int n9 = n4;
                fq[n9] = fq[n9] + (fu[n4] << 2);
                int n10 = n4;
                fr[n10] = fr[n10] - 1;
                if (fs[n4] >= 6) {
                    dg.fs[n4] = -1;
                } else {
                    dg.ft[n4] = (fs[n4] >> 1) % 3;
                }
            }
            ++n4;
        }
        if (W != -1) {
            if (gF != gG) {
                gI = gG - gF << 2;
                gF += (gH += gI) >> 4;
                gH &= 0xF;
            }
            if (Math.abs(gG - gF) < 15 && gF < 0) {
                gG = 0;
            }
            if (Math.abs(gG - gF) < 15 && gF > 0) {
                gG = 0;
            }
        }
        main.a.e();
        n2 = 0;
        while (n2 < O.size()) {
            ((al)O.elementAt(n2)).a();
            ++n2;
        }
        n2 = 0;
        while (n2 < N.size()) {
            dl dl2 = (dl)N.elementAt(n2);
            if (dl2.i == 2 && dl2.a == dl2.c && dl2.b == dl2.d) {
                N.removeElement(dl2);
                if (bp.d().aW != null && bp.d().aW.equals(dl2)) {
                    bp.d().aW = null;
                }
            } else if (dl2.i > 0) {
                if (dl2.e == 0) {
                    dl2.a = dl2.c;
                }
                if (dl2.f == 0) {
                    dl2.b = dl2.d;
                }
                if (dl2.a != dl2.c) {
                    dl2.a += dl2.e;
                    if (dl2.e > 0 && dl2.a > dl2.c || dl2.e < 0 && dl2.a < dl2.c) {
                        dl2.a = dl2.c;
                    }
                }
                if (dl2.b != dl2.d) {
                    dl2.b += dl2.f;
                    if (dl2.f > 0 && dl2.b > dl2.d || dl2.f < 0 && dl2.b < dl2.d) {
                        dl2.b = dl2.d;
                    }
                }
            } else {
                dl2.i = (byte)(dl2.i - 4);
                if (dl2.i < -12) {
                    dl2.b -= 12;
                    dl2.i = 1;
                }
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < E.size()) {
            ((bk)E.elementAt(n2)).a();
            ++n2;
        }
        n2 = 0;
        while (n2 < P.size()) {
            k k2 = (k)P.elementAt(n2);
            ++k2.a;
            if (k2.a == 5) {
                k2.a = 0;
                P.removeElement(k2);
            }
            object = ci.a(0);
            k2.b = ((ci)object).e;
            k2.c = ((ci)object).f - ((ci)object).l / 2;
            k2.d = ((bp)dg.M.elementAt((int)0)).i;
            k2.e = ((bp)dg.M.elementAt((int)0)).j - bp.d().ai;
            if (am.e((int)(null[0] - k2.b)) > 5 || am.e((int)(null[0] - k2.c)) > 5) {
                null[0] = k2.b;
                null[0] = k2.c;
            }
            if (am.e((int)(null[0] - k2.d)) > 5 || am.e((int)(null[0] - k2.e)) > 5) {
                null[0] = k2.d;
                null[0] = k2.e;
            }
            ++n2;
        }
        if ((af.a * af.x >= af.p || af.b * af.x >= af.q) && System.currentTimeMillis() / 100L > 20L) {
            af.a();
        }
        n2 = au.b.size() - 1;
        while (n2 >= 0) {
            au.a.removeElement(au.b.elementAt(n2));
            au.b.removeElementAt(n2);
            --n2;
        }
        n2 = 0;
        while (n2 < au.a.size()) {
            object = (au)au.a.elementAt(n2);
            ((au)object).a();
            ++n2;
        }
        n2 = 0;
        while (n2 < au.c.size()) {
            object = (au)au.c.elementAt(n2);
            ((au)object).a();
            ++n2;
        }
        n2 = 0;
        while (n2 < au.d.size()) {
            object = (au)au.d.elementAt(n2);
            ((au)object).a();
            ++n2;
        }
        n2 = 0;
        while (n2 < ci.z.size()) {
            object = (bt)ci.z.elementAt(n2);
            if (object != null) {
                Object object2 = object;
                if (((bt)object2).a()) {
                    if (((bt)object2).d == 0) {
                        ++((bt)object2).e;
                        ((bt)object2).b += ((bt)object2).e;
                        ++((bt)object2).c;
                        if (((bt)object2).c > 3) {
                            ((bt)object2).c = 0;
                        }
                        if ((af.a(((bt)object2).a, ((bt)object2).b) & 2) == 2) {
                            ((bt)object2).d = 1;
                            ((bt)object2).e = 0;
                        }
                    } else if (((bt)object2).d == 1) {
                        ++((bt)object2).c;
                        if (((bt)object2).c > 6) {
                            ((bt)object2).c = 6;
                            bt.f.h = 5;
                        }
                    }
                }
                if (((bt)object).c == 6) {
                    if (bt.f != null) {
                        bt.f.h = 5;
                    }
                    ci.z.removeElementAt(n2);
                }
            }
            ++n2;
        }
        ab.a();
        dg dg2 = this;
        if (dg2.bm >= 0 && M.size() > 0) {
            int n11 = bp.d(dg2.bm);
            if (n11 >= 0 && n11 < M.size()) {
                bp bp3 = (bp)M.elementAt(n11);
                if (bp3 != null && bp.a(bp3) && !bp3.B()) {
                    bp.d().aR = null;
                    bp.d().v();
                    bp.d().aW = null;
                    bp.d();
                    bp.cg = true;
                    bp.d().aV = bp3;
                }
            } else {
                dg2.bm = -1;
                bp.d().aV = null;
            }
        } else {
            dg2.bm = -1;
        }
        x.a();
        ae.a();
        if (aV != null && dg.aV.p != bp.d().p) {
            aV.h();
        }
        ++this.eL;
        if (this.eL > 3) {
            this.eL = 0;
        }
        cK = cU ? 40 : 28;
        bl.b();
        bl.c();
        if (main.a.W) {
            main.a.O.a();
        }
    }

    private static void c(t t2) {
        int n2 = 0;
        while (n2 < x.size()) {
            s s2 = (s)x.elementAt(n2);
            if (s2 != null) {
                s2.a(t2, main.a.A, eM + n2 * 18 + 15);
            }
            ++n2;
        }
    }

    public final void a(t t2) {
        block204: {
            block209: {
                Object object;
                block205: {
                    block206: {
                        t t3;
                        block208: {
                            block207: {
                                int n2;
                                Object object2;
                                Object object3;
                                t t4;
                                if (bp.bG) {
                                    t2.a(0);
                                    t2.c(0, 0, main.a.A, main.a.B);
                                    dd.d.a(t2, df.bD, main.a.C, main.a.D + 20, 2);
                                    main.a.a(main.a.C, main.a.D, t2, false);
                                    return;
                                }
                                main.a.a(t2);
                                t2.a(-i, -j);
                                int n3 = 0;
                                while (n3 < bP.size()) {
                                    ((ca)bP.elementAt(n3)).a(t2);
                                    ++n3;
                                }
                                af.a(t2);
                                n3 = 0;
                                while (n3 < bQ.size()) {
                                    ((ca)bQ.elementAt(n3)).a(t2);
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < Q.size()) {
                                    ((ci)Q.elementAt(n3)).a(t2);
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < ci.z.size()) {
                                    t4 = t2;
                                    object3 = (bt)ci.z.elementAt(n3);
                                    if (((bt)object3).a()) {
                                        t4.a(bR, 0, ((bt)object3).c << 5, 32, 32, 0, ((bt)object3).a, ((bt)object3).b, 33);
                                    }
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < S.size()) {
                                    t4 = t2;
                                    object2 = object3 = (dk)S.elementAt(n3);
                                    if (((dk)object3).a < i ? false : (((dk)object2).a > i + b ? false : (((dk)object2).b < j ? false : ((dk)object2).b <= j + c + 30))) {
                                        dd.j.a(t4, ((dk)object3).c, ((dk)object3).a, ((dk)object3).b - 32, 2, dd.k);
                                        ab.a(t4, 1180, ((dk)object3).a, ((dk)object3).b, 0, 33);
                                        if (((dk)object3).d) {
                                            ab.a(t4, 288, ((dk)object3).a, ((dk)object3).b, 0, 33);
                                            ((dk)object3).d = false;
                                        }
                                    }
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < R.size()) {
                                    ((cy)R.elementAt(n3)).a(t2);
                                    ++n3;
                                }
                                t4 = t2;
                                object3 = this;
                                int n4 = 0;
                                while (n4 < af.t.size()) {
                                    ah ah2 = (ah)af.t.elementAt(n4);
                                    if (ah2.b == 0 || ah2.d >= af.d - 24) {
                                        if (ah2.d <= af.d / 2) {
                                            int n5 = ah2.a + (ah2.c - ah2.a) / 2;
                                            int n6 = ah2.b + (ah2.d - ah2.b) / 2 + ((dg)object3).eL;
                                            if (main.a.g) {
                                                n6 = ah2.d + (ah2.d - ah2.b) + ((dg)object3).eL + 10;
                                            }
                                            ab.a(t4, 1213, n5, n6, 6, ch.g);
                                        } else if (ah2.b >= af.d / 2) {
                                            ab.a(t4, 1213, ah2.a + (ah2.c - ah2.a) / 2, ah2.b - 12 - ((dg)object3).eL, 4, ch.g);
                                        }
                                    } else if (ah2.c <= af.c / 2) {
                                        if (!main.a.g) {
                                            ab.a(t4, 1213, ah2.c + 12 + ((dg)object3).eL, ah2.d - 12, 2, ch.g);
                                        } else {
                                            ab.a(t4, 1213, ah2.c + 12 + ((dg)object3).eL, ah2.d - 32, 2, ch.g);
                                        }
                                    } else if (ah2.a >= af.c / 2) {
                                        if (!main.a.g) {
                                            ab.a(t4, 1213, ah2.a - 12 - ((dg)object3).eL, ah2.d - 12, 0, ch.g);
                                        } else {
                                            ab.a(t4, 1213, ah2.a - 12 - ((dg)object3).eL, ah2.d - 32, 0, ch.g);
                                        }
                                    }
                                    ++n4;
                                }
                                t2.d(0, -200, main.a.A - t2.a(), 200 + main.a.B - t2.b());
                                main.a.a().b(t2);
                                n3 = 0;
                                while (n3 < M.size()) {
                                    object3 = null;
                                    try {
                                        object3 = (bp)M.elementAt(n3);
                                    }
                                    catch (Exception exception) {}
                                    if (object3 != null) {
                                        if (af.o == 111 && n3 > 19) {
                                            ((bp)object3).c(t2);
                                        } else {
                                            ((bp)object3).a(t2);
                                        }
                                    }
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < G.size()) {
                                    object3 = (db)G.elementAt(n3);
                                    if (((db)object3).f != null && ((db)object3).f != bp.d()) {
                                        ((db)object3).f.b(t2);
                                    }
                                    ++n3;
                                }
                                object3 = t2;
                                int n7 = 0;
                                while (n7 < 5) {
                                    if (fo[n7] != -1 && main.a.e(fk[n7], fl[n7])) {
                                        if (fp[n7] == 0) {
                                            dd.q.a((t)object3, fj[n7], fk[n7], fl[n7], 2);
                                        } else if (fp[n7] == 1) {
                                            dd.p.a((t)object3, fj[n7], fk[n7], fl[n7], 2);
                                        } else if (fp[n7] == 2) {
                                            dd.r.a((t)object3, fj[n7], fk[n7], fl[n7], 2);
                                        } else if (fp[n7] == 3) {
                                            dd.d.a((t)object3, fj[n7], fk[n7], fl[n7], 2, dd.b);
                                        } else if (fp[n7] == 8) {
                                            dd.e.a((t)object3, fj[n7], fk[n7], fl[n7], 2, dd.b);
                                        } else if (fp[n7] == 4) {
                                            ab.a((t)object3, 1062, fk[n7], fl[n7], 0, 3);
                                        } else if (fp[n7] == 5) {
                                            dd.t.a((t)object3, fj[n7], fk[n7], fl[n7], 2);
                                        } else if (fp[n7] == 6) {
                                            dd.j.a((t)object3, fj[n7], fk[n7], fl[n7], 2, dd.l);
                                        } else if (fp[n7] == 7) {
                                            ab.a((t)object3, 655, fk[n7], fl[n7], 0, 3);
                                        }
                                    }
                                    ++n7;
                                }
                                object3 = t2;
                                n7 = 0;
                                while (n7 < cJ.size()) {
                                    Object object4 = object3;
                                    object2 = (ac)cJ.elementAt(n7);
                                    if (main.a.w % 10 < 8) {
                                        ab.a((t)object4, 1292, ((ac)object2).a, ((ac)object2).b, 0, 3);
                                    } else {
                                        ab.a((t)object4, 1291, ((ac)object2).a, ((ac)object2).b, 0, 3);
                                    }
                                    ++n7;
                                }
                                object3 = t2;
                                n7 = 0;
                                while (n7 < 2) {
                                    if (fs[n7] != -1) {
                                        if (fu[n7] == 1) {
                                            ((t)object3).a(fv[ft[n7]], fq[n7], fr[n7], 3);
                                        } else {
                                            ((t)object3).a(fv[ft[n7]], 0, 0, t.a(fv[ft[n7]]), t.b(fv[ft[n7]]), 2, fq[n7], fr[n7], 3);
                                        }
                                    }
                                    ++n7;
                                }
                                bp.d().a(t2);
                                t t5 = t2;
                                object3 = this;
                                if (bp.d().d) {
                                    int n8 = 0;
                                    while (n8 < ((dg)object3).hv.length) {
                                        if (((dg)object3).hv[n8] != -1) {
                                            int n9 = 0;
                                            if (((dg)object3).hv[n8] == 0) {
                                                n9 = 2;
                                            } else if (((dg)object3).hv[n8] == 1) {
                                                n9 = 6;
                                            } else if (((dg)object3).hv[n8] == 2) {
                                                n9 = 0;
                                            }
                                            ab.a(t5, 989, bp.d().i + n8 * 10 - (((dg)object3).hv.length - 1) * 10 / 2, bp.d().j - 40, n9, 3);
                                        }
                                        ++n8;
                                    }
                                }
                                n3 = 0;
                                while (n3 < P.size()) {
                                    t5 = t2;
                                    object3 = (k)P.elementAt(n3);
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < N.size()) {
                                    byte by2;
                                    t5 = t2;
                                    object3 = (dl)N.elementAt(n3);
                                    if (((dl)object3).j != null && ((dl)object3).j.a != null) {
                                        by2 = 0;
                                        if (((dl)object3).i <= 0) {
                                            by2 = ((dl)object3).i;
                                        }
                                        t5.a(((dl)object3).j.a, ((dl)object3).a, ((dl)object3).b + by2, 33);
                                    } else {
                                        by2 = 0;
                                        if (((dl)object3).i <= 0) {
                                            by2 = ((dl)object3).i;
                                        }
                                        ab.a(t5, ((dl)object3).h.g, ((dl)object3).a, ((dl)object3).b + by2, 0, 33);
                                        if (bp.d().aW != null && bp.d().aW.equals(object3) && ((dl)object3).i != 2) {
                                            ab.a(t5, 988, ((dl)object3).a, ((dl)object3).b - 20, 0, 3);
                                        }
                                    }
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < E.size()) {
                                    ((bk)E.elementAt(n3)).a(t2);
                                    ++n3;
                                }
                                af.c(t2);
                                n3 = 0;
                                while (n3 < au.a.size()) {
                                    object3 = (au)au.a.elementAt(n3);
                                    ((au)object3).a(t2);
                                    ++n3;
                                }
                                n3 = 0;
                                while (n3 < bO.size()) {
                                    ((ca)bO.elementAt(n3)).a(t2);
                                    ++n3;
                                }
                                if (!main.a.a) {
                                    n3 = 0;
                                    while (n3 < au.d.size()) {
                                        object3 = (au)au.d.elementAt(n3);
                                        ((au)object3).a(t2);
                                        ++n3;
                                    }
                                }
                                n3 = 0;
                                while (n3 < O.size()) {
                                    O.elementAt(n3);
                                    ++n3;
                                }
                                t5 = t2;
                                object3 = this;
                                try {
                                    byte by3 = dg.F();
                                    if (by3 != -1) {
                                        cy cy2 = null;
                                        n2 = 0;
                                        while (n2 < R.size()) {
                                            cy cy3 = (cy)R.elementAt(n2);
                                            if (cy3.cm.a == by3) {
                                                if (cy2 == null) {
                                                    cy2 = cy3;
                                                } else if (am.e(cy3.i - bp.d().i) < am.e(cy2.i - bp.d().i)) {
                                                    cy2 = cy3;
                                                }
                                            }
                                            ++n2;
                                        }
                                        if (cy2 != null && cy2.n != 15 && (cy2.i <= i || cy2.i >= i + b || cy2.j <= j || cy2.j >= j + c) && main.a.w % 10 >= 5) {
                                            n2 = cy2.i - bp.d().i;
                                            int n10 = cy2.j - bp.d().j;
                                            int n11 = 0;
                                            n3 = 0;
                                            int n12 = 0;
                                            if (n2 > 0 && n10 >= 0) {
                                                if (am.e(n2) >= am.e(n10)) {
                                                    n11 = b - 10;
                                                    n3 = c / 2 + 30;
                                                    if (main.a.g) {
                                                        n3 = c / 2 + 10;
                                                    }
                                                    n12 = 0;
                                                } else {
                                                    n11 = b / 2;
                                                    n3 = c - 10;
                                                    n12 = 5;
                                                }
                                            } else if (n2 >= 0 && n10 < 0) {
                                                if (am.e(n2) >= am.e(n10)) {
                                                    n11 = b - 10;
                                                    n3 = c / 2 + 30;
                                                    if (main.a.g) {
                                                        n3 = c / 2 + 10;
                                                    }
                                                    n12 = 0;
                                                } else {
                                                    n11 = b / 2;
                                                    n3 = 10;
                                                    n12 = 6;
                                                }
                                            }
                                            if (n2 < 0 && n10 >= 0) {
                                                if (am.e(n2) >= am.e(n10)) {
                                                    n11 = 10;
                                                    n3 = c / 2 + 30;
                                                    if (main.a.g) {
                                                        n3 = c / 2 + 10;
                                                    }
                                                    n12 = 3;
                                                } else {
                                                    n11 = b / 2;
                                                    n3 = c - 10;
                                                    n12 = 5;
                                                }
                                            } else if (n2 <= 0 && n10 < 0) {
                                                if (am.e(n2) >= am.e(n10)) {
                                                    n11 = 10;
                                                    n3 = c / 2 + 30;
                                                    if (main.a.g) {
                                                        n3 = c / 2 + 10;
                                                    }
                                                    n12 = 3;
                                                } else {
                                                    n11 = b / 2;
                                                    n3 = 10;
                                                    n12 = 6;
                                                }
                                            }
                                            dg.b(t5);
                                            ab.a(t5, 992, n11, n3, n12, ch.g);
                                        }
                                    }
                                }
                                catch (Exception exception) {}
                                t5 = t2;
                                object = this;
                                if (main.a.g) {
                                    dg.b(t5);
                                    ((dg)object).au();
                                    int n13 = bp.d().z * fE / bp.d().B;
                                    int n14 = bp.d().x * fF / bp.d().y;
                                    n2 = (int)(bp.d().E * (long)fG / aW[bp.d().w]);
                                    if (n13 > fE) {
                                        n13 = 0;
                                    }
                                    t5.a(-10585344);
                                    t5.c(0, fD - 10, fG, 3);
                                    t5.a(-10427136);
                                    t5.c(0, fD - 10, n2, 3);
                                    t5.a(-9756672);
                                    t5.c(0, fD - 10, fG, 1);
                                    t5.c(0, fD - 7, fG, 1);
                                    int n15 = 0;
                                    while (n15 < 10) {
                                        t5.c(n15 * fG / 10 - 1, fD - 10, 1, 3);
                                        ++n15;
                                    }
                                    t5.a(-1769452);
                                    t5.a(ef, fC - 1, fD, 0);
                                    t5.c(fC, fD, n13, 9);
                                    t5.a(-16755227);
                                    t5.a(ef, fC - 28, fD + 13, 0);
                                    t5.c(fC, fD + 16, n14, 7);
                                    t5.a(ee, 0, fD - 7, 0);
                                    dd.s.a(t5, "" + bp.d().z, fC + fE / 2 - 30, fD + 1, 0);
                                    dd.s.a(t5, "" + bp.d().x, fC + fE / 2 - 30, fD + 15, 0);
                                    dd.o.a(t5, "" + bp.d().w, fC - 27, fD + 1, 2);
                                    long l2 = 0L;
                                    l2 = bp.d().h > 0L ? bp.d().h * 10000L / aW[bp.d().w] : bp.d().E * 10000L / aW[bp.d().w];
                                    n3 = (int)(l2 % 100L);
                                    dd.i.a(t5, String.valueOf(bp.d().h > 0L ? "-" + l2 / 100L : "" + l2 / 100L) + "." + (n3 < 10 ? "0" + n3 : "" + n3) + "%", fC - 27, fD + 13, 2);
                                }
                                if (bp.d().d) break block204;
                                this.h(t2);
                                dg.b(t2);
                                this.g(t2);
                                dg.b(t2);
                                af.b(t2);
                                t2.a(-t2.a(), -t2.b());
                                if (!main.a.g || main.a.g && !main.a.h) {
                                    object = t2;
                                    ((t)object).d(0, fx - 4, main.a.A, 100);
                                    ((t)object).a(3612190);
                                    ((t)object).c(fC - 44, fD, 19, 19);
                                    ((t)object).a(265220);
                                    ((t)object).c(fz, fx + 35, fB, 1);
                                    ((t)object).c(fz, fx + 33, fB, 1);
                                    ((t)object).c(fz, fx + 30, fB, 1);
                                    ((t)object).c(fz, fx + 28, fB, 1);
                                    ((t)object).c(fz, fx + 26, fB, 1);
                                    ((t)object).c(fz, fx + 12, fB, 1);
                                    ((t)object).c(fz, fx + 24, fB, 1);
                                    ((t)object).c(fz, fx + 18, fB, 1);
                                    ((t)object).c(fz, fx + 16, fB, 1);
                                    ((t)object).c(fz, fx + 2, fB, 1);
                                    ((t)object).c(fz, fx + 4, fB, 1);
                                    ((t)object).c(fz, fx + 6, fB, 1);
                                    ((t)object).c(fz, fx + 14, fB, 1);
                                    ((t)object).a(12562018);
                                    ((t)object).c(fz, fx + 5, fB, 1);
                                    ((t)object).c(fz, fx + 17, fB, 1);
                                    ((t)object).c(fz, fx + 34, fB, 1);
                                    ((t)object).c(fz, fx + 29, fB, 1);
                                    ((t)object).a(14667167);
                                    ((t)object).c(fz, fx + 3, fB, 1);
                                    ((t)object).c(fz, fx + 15, fB, 1);
                                    ((t)object).c(fz, fx + 27, fB, 1);
                                    ((t)object).a(0x333333);
                                    ((t)object).c(fz, fx + 7, fB, 5);
                                    ((t)object).c(fz, fx + 19, fB, 5);
                                    ((t)object).c(fz, fx + 31, fB, 2);
                                    ((t)object).a(0xBB6611);
                                    ((t)object).c(fz, fx + 25, fB, 1);
                                    ((t)object).c(fz, fx + 13, fB, 1);
                                    ((t)object).a(fI[0], 0, fx + 2, 0);
                                    ((t)object).a(fI[1], 0 + fy, fx - 4, 24);
                                    int n16 = bp.d().z * fE / bp.d().B;
                                    if (n16 > fE) {
                                        n16 = 0;
                                    }
                                    ((t)object).a(0x770000);
                                    ((t)object).c(fC, fD, n16, 2);
                                    ((t)object).a(0xCC0000);
                                    ((t)object).c(fC, fD + 1, n16, 4);
                                    n16 = bp.d().x * fE / bp.d().y;
                                    if (n16 > fE) {
                                        n16 = 0;
                                    }
                                    ((t)object).a(4488);
                                    ((t)object).c(fC, fD + 12, n16, 2);
                                    ((t)object).a(4573);
                                    ((t)object).c(fC, fD + 14, n16, fH - 2);
                                    int n17 = (int)(bp.d().E * (long)fG / aW[bp.d().w]);
                                    ((t)object).a(94373);
                                    ((t)object).c(46, fx + 31, n17, 1);
                                    ((t)object).a(65535);
                                    ((t)object).c(46, fx + 32, n17, 1);
                                    dd.p.a((t)object, "" + bp.d().w, 28, fx + 9, 2);
                                    long l3 = 0L;
                                    l3 = bp.d().h > 0L ? bp.d().h * 10000L / aW[bp.d().w] : bp.d().E * 10000L / aW[bp.d().w];
                                    int n18 = (int)(l3 % 100L);
                                    dd.i.a((t)object, String.valueOf(bp.d().h > 0L ? "-" + l3 / 100L : "" + l3 / 100L) + "." + (n18 < 10 ? "0" + n18 : "" + n18) + "%", 24, fx + 23, 2);
                                    dd.r.a((t)object, "" + z, fy - 11, fx + 6, 2);
                                    dd.r.a((t)object, "" + y, fy - 11, fx + 18, 2);
                                    dd.s.a((t)object, "" + bp.d().z, fC + fE / 2, fx + 6, 2);
                                    dd.s.a((t)object, "" + bp.d().x, fC + fE / 2, fx + 18, 2);
                                    if (bp.d().ax.size() > 0 && bp.d().az != null) {
                                        bp.d().az.a(fz - 28, fD + 7, (t)object);
                                    }
                                    ((t)object).a(9463099);
                                    ((t)object).c(0, fx + 35, main.a.A, 1);
                                } else {
                                    ay.a(t2);
                                }
                                if (main.a.g) {
                                    da = true;
                                }
                                dg.b(t2);
                                this.j(t2);
                                dg.b(t2);
                                t2.d(0, 0, main.a.A, main.a.B);
                                n3 = 0;
                                while (n3 < au.c.size()) {
                                    object = (au)au.c.elementAt(n3);
                                    ((au)object).a(t2);
                                    ++n3;
                                }
                                dg.b(t2);
                                if (!aR) break block205;
                                t3 = t2;
                                object = this;
                                if (W == 0) {
                                    super.a(t3, df.cg);
                                }
                                this.o(t2);
                                this.E(t2);
                                t3 = t2;
                                object = this;
                                if (W != 3) break block206;
                                dg.b(t3);
                                ay.a(ce, cd, cf, cg, t3);
                                if (cL == 1) {
                                    t3.a(ay.c);
                                    t3.c(ce + 7, cd + 32, cf - 14, cg - 40);
                                    t3.a(0xFFFFFF);
                                } else {
                                    t3.a(10249521);
                                }
                                t3.b(ce + 7, cd + 32, cf - 14, cg - 40);
                                dg.a(t3, df.cg[W], true);
                                gD = ce + 17;
                                gE = cd + 34;
                                aa.a(cM, 12, ce, cd + 35, cf, cg - 44, true, 1);
                                aa.a(t3);
                                if (et != 0) break block207;
                                cM = 19;
                                int n19 = gE;
                                if (aV == null) break block206;
                                dd.e.a(t3, String.valueOf(df.dP[0]) + dg.aV.ab, gD, n19, 0);
                                dd.i.a(t3, String.valueOf(df.dP[1]) + dg.aV.aM, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[2]) + dg.aV.w, gD, n19 += 12, 0);
                                dd.h.a(t3, String.valueOf(df.dP[3]) + dg.aV.av.b, gD, n19 += 12, 0);
                                dd.h.a(t3, String.valueOf(df.dP[4]) + df.eK[aV.a()], gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[5]) + dg.aV.z + "/" + dg.aV.B, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[6]) + dg.aV.x + "/" + dg.aV.y, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[7]) + aV.b(), gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[8]) + (dg.aV.u - dg.aV.u / 10) + "-" + dg.aV.u, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[9]) + dg.aV.aG, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[10]) + dg.aV.aH, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[11]) + dg.aV.aI, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[12]) + dg.aV.v, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[13]) + dg.aV.aK, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[14]) + dg.aV.aJ, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[15]) + dg.aV.aL, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[16]) + dg.aV.aO, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[17]) + dg.aV.aP, gD, n19 += 12, 0);
                                dd.i.a(t3, String.valueOf(df.dP[18]) + dg.aV.aQ, gD, n19 += 12, 0);
                                break block208;
                            }
                            if (et != 1) break block208;
                            cM = 20;
                            int n20 = gE;
                            if (aV == null) break block206;
                            dd.e.a(t3, String.valueOf(df.dS[15]) + (dg.aV.ac.equals("") ? df.dp : dg.aV.ac), gD, n20, 0);
                            dd.i.a(t3, String.valueOf(df.dS[0]) + dg.aV.H, gD, n20 += 12, 0);
                            dd.h.a(t3, String.valueOf(df.dS[11]) + dg.aV.T + "/20", gD, n20 += 12, 0);
                            dd.h.a(t3, String.valueOf(df.dS[12]) + dg.aV.U + df.dQ, gD, n20 += 12, 0);
                            dd.h.a(t3, String.valueOf(df.dS[16]) + dg.aV.Z + df.dQ, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[13]) + dg.aV.V, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[14]) + dg.aV.W, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[18]) + dg.aV.X + df.dQ, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[19]) + dg.aV.Y + df.dQ, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[17]) + dg.aV.S, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[1]) + dg.aV.J, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[2]) + dg.aV.L, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[3]) + dg.aV.N, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[4]) + dg.aV.P, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[5]) + dg.aV.R, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[6]) + dg.aV.I, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[7]) + dg.aV.K, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[8]) + dg.aV.M, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[9]) + dg.aV.O, gD, n20 += 12, 0);
                            dd.i.a(t3, String.valueOf(df.dS[10]) + dg.aV.Q, gD, n20 += 12, 0);
                        }
                        if (cL == 1 && V >= 0) {
                            ab.a(t3, 942, gD - 8, gE + 2 + V * 12, 0, ch.b);
                        }
                    }
                    this.k(t2);
                    this.l(t2);
                    this.X(t2);
                    break block209;
                }
                if (dg.A()) {
                    t t6 = t2;
                    object = this;
                    if (db) {
                        if (W == 0) {
                            super.a(t6, df.cB, au);
                        } else if (W == 1) {
                            super.a(t6, df.cB, ax);
                        } else if (W == 2) {
                            super.a(t6, df.cB, ay);
                        } else if (W == 3) {
                            super.a(t6, df.cB, aw);
                        } else if (W == 52) {
                            super.b(t6, ay);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dd) {
                        if (W == 0) {
                            super.a(t6, df.ch, ab);
                        } else if (W == 1) {
                            super.a(t6, df.ci);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (de) {
                        if (W == 0) {
                            super.a(t6, df.ch, ac);
                        } else if (W == 1) {
                            super.a(t6, df.ci);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (df) {
                        if (W == 0) {
                            super.a(t6, df.ch, ad);
                        } else if (W == 1) {
                            super.a(t6, df.cj);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dg) {
                        if (W == 0) {
                            super.a(t6, df.ch, ae);
                        } else if (W == 1) {
                            super.a(t6, df.cj);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dh) {
                        if (W == 0) {
                            super.a(t6, df.ch, af);
                        } else if (W == 1) {
                            super.a(t6, df.ck);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (di) {
                        if (W == 0) {
                            super.a(t6, df.ch, ag);
                        } else if (W == 1) {
                            super.a(t6, df.ck);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dj) {
                        if (W == 0) {
                            super.a(t6, df.ch, ah);
                        } else if (W == 1) {
                            super.a(t6, df.cl);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dk) {
                        if (W == 0) {
                            super.a(t6, df.cl, ai);
                        } else if (W == 1) {
                            super.a(t6, df.cl);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dl) {
                        if (W == 0) {
                            super.a(t6, df.ch, aj);
                        } else if (W == 1) {
                            super.a(t6, df.cm);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dm) {
                        if (W == 0) {
                            super.a(t6, df.ch, ak);
                        } else if (W == 1) {
                            super.a(t6, df.cm);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dn) {
                        if (W == 0) {
                            super.a(t6, df.cn, al);
                        } else if (W == 1) {
                            super.a(t6, df.cn);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (do) {
                        if (W == 0) {
                            super.a(t6, df.co, am);
                        } else if (W == 1) {
                            super.a(t6, df.co);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dp) {
                        if (W == 0) {
                            super.a(t6, df.cp, an);
                        } else if (W == 1) {
                            super.a(t6, df.cp);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dq) {
                        if (W == 0) {
                            super.a(t6, df.cq, ao);
                        } else if (W == 1) {
                            super.a(t6, df.cq);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dr) {
                        if (W == 0) {
                            super.a(t6, df.cr, ap);
                        } else if (W == 1) {
                            super.a(t6, df.cr);
                        }
                    }
                    t6 = t2;
                    object = this;
                    if (dc) {
                        super.a(t6, df.cC, av);
                    }
                    this.p(t2);
                    this.q(t2);
                    this.r(t2);
                    this.s(t2);
                    this.t(t2);
                    this.u(t2);
                    this.v(t2);
                    this.J(t2);
                    this.w(t2);
                    this.x(t2);
                    this.y(t2);
                    this.z(t2);
                    this.B(t2);
                    this.C(t2);
                    this.D(t2);
                    this.A(t2);
                    this.R(t2);
                    this.S(t2);
                    this.T(t2);
                    this.W(t2);
                    this.U(t2);
                    this.V(t2);
                } else if (dD) {
                    this.F(t2);
                }
            }
            this.d(t2);
            this.L(t2);
            this.f(t2);
            this.I(t2);
            this.H(t2);
            this.K(t2);
            this.e(t2);
            this.m(t2);
            this.M(t2);
            this.O(t2);
            dg.b(t2);
            if (main.a.g && main.a.A >= 320) {
                if (this.k != null && this.k != this.eA) {
                    this.k.f = main.a.A / 2 - 160;
                    this.k.g = main.a.B - 26;
                }
                if (this.l != null) {
                    this.l.f = main.a.A / 2 - 35;
                    this.l.g = main.a.B - 26;
                }
                if (this.m != null && this.m != this.cE) {
                    this.m.f = main.a.A / 2 + 88;
                    this.m.g = main.a.B - 26;
                }
            }
        }
        super.a(t2);
        if (main.a.g && main.a.h) {
            this.i(t2);
            da = true;
        }
        dg.c(t2);
        dg.b(t2);
        this.G(t2);
        dg.b(t2);
        this.P(t2);
        dg.b(t2);
        x.a(t2);
        dg.b(t2);
        aw.a().a(t2);
        dg.b(t2);
        ae.a(t2);
    }

    private void d(t t2) {
        if (!aT) {
            return;
        }
        dg.b(t2);
        ay.a(ce, cd, cf, cg, t2);
        if (cL == 1) {
            t2.a(ay.c);
            t2.c(ce + 7, cd + 32, cf - 14, cg - 55);
            t2.a(0xFFFFFF);
        } else {
            t2.a(10249521);
        }
        t2.b(ce + 7, cd + 32, cf - 14, cg - 55);
        dg.a(t2, df.gr[7], false);
        gD = ce + 17;
        gE = cd + 45;
        cM = 7;
        aa.a(cM, 35, ce, cd + 39, cf, cg - 63, true, 1);
        aa.a(t2);
        int n2 = gE;
        dg.a(t2, df.hZ[0], bp.bi, String.valueOf(bp.bs) + "%", gD, n2);
        dg.a(t2, df.hZ[1], bp.bj, String.valueOf(bp.bt) + "%", gD, n2 += 30);
        dg.a(t2, df.hZ[2], bp.bk, String.valueOf(bp.bu), gD, n2 += 30);
        dg.a(t2, df.hZ[3], bp.bl, "", gD, n2 += 30);
        dg.a(t2, df.hZ[4], bp.bm, "", gD, n2 += 30);
        dg.a(t2, df.hZ[5], bp.bn, "", gD, n2 += 30);
        dg.a(t2, df.hZ[6], bp.bo, "", gD, n2 += 30);
        dg.a(t2, df.hZ[7], bp.bp, "", gD, n2 += 30);
        if (cL == 1 && V >= 0 && !main.a.g) {
            ab.a(t2, 942, gD - 8, gE + 2 + V * 30, 0, ch.b);
        }
        dg.b(t2);
        dd.n.a(t2, main.a.g ? df.ib : df.ia, ce + cf / 2, cd + cg - 17, 2);
    }

    private static void a(t t2, String string, boolean bl2, String string2, int n2, int n3) {
        t2.a(0xFFFFFF);
        t2.c(n2, n3, 12, 12);
        if (bl2) {
            t2.a(9650442);
            t2.a(n2 + 2, n3 + 2, n2 + 2 + 7, n3 + 2 + 7);
            t2.a(n2 + 2, n3 + 2 + 7, n2 + 2 + 7, n3 + 2);
        }
        dd dd2 = bl2 ? dd.i : dd.k;
        dd2.a(t2, string, n2 + 18, n3, 0);
        if (string2.equals("")) {
            return;
        }
        t2.a(ay.b);
        t2.c(n2 + 115, n3 - 3, 30, 20);
        t2.a(bl2 ? 0xFFFFFF : 0);
        t2.b(n2 + 115, n3 - 3, 30, 20);
        dd2.a(t2, string2, n2 + 133, n3 + 2, 2);
    }

    private void e(t t2) {
        if (cY) {
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.be, false);
            gD = ce + 5;
            gE = cd + 40;
            if (J.size() == 0) {
                dd.i.a(t2, df.go, ce + cf / 2, cd + 40, 2);
                return;
            }
            t2.a(-16770791);
            t2.c(gD - 2, gE - 2, cf - 6, cK * 5 + 8);
            dg.b(t2);
            aa.a(J.size(), cK, gD, gE, cf - 3, cK * 5 + 4, true, 1);
            aa.a(t2, gD, gE, cf - 3, cK * 5 + 6);
            cM = J.size();
            int n2 = 0;
            while (n2 < J.size()) {
                dv dv2 = null;
                try {
                    dv2 = (dv)J.elementAt(n2);
                }
                catch (Exception exception) {}
                if (dv2 != null) {
                    if (V == n2) {
                        t2.a(ay.b);
                        t2.c(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                        t2.a(0xFFFFFF);
                        t2.b(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                    } else {
                        t2.a(ay.a);
                        t2.c(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                        t2.a(13932896);
                        t2.b(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                    }
                    dd.j.a(t2, dv2.b, gD + (cf - 10) / 2 - cf / 4, gE + n2 * cK + cK / 2 - 6, 2);
                    dd.a.a(t2, " vs ", gD + (cf - 10) / 2, gE + n2 * cK + cK / 2 - 6, 2);
                    dd.j.a(t2, dv2.c, gD + (cf - 10) / 2 + cf / 4, gE + n2 * cK + cK / 2 - 6, 2);
                }
                ++n2;
            }
            dg.n(t2);
        }
    }

    private void f(t t2) {
        if (dC) {
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.be, false);
            gD = ce + 5;
            gE = cd + 40;
            if (M.size() == 0) {
                dd.i.a(t2, df.fg, ce + cf / 2, cd + 40, 2);
                return;
            }
            t2.a(-16770791);
            t2.c(gD - 2, gE - 2, cf - 6, cK * 5 + 8);
            dg.b(t2);
            aa.a(M.size(), cK, gD, gE, cf - 3, cK * 5 + 4, true, 1);
            aa.a(t2, gD, gE, cf - 3, cK * 5 + 6);
            cM = M.size();
            int n2 = 0;
            while (n2 < M.size()) {
                block13: {
                    bp bp2;
                    block12: {
                        bp2 = null;
                        try {
                            bp2 = (bp)M.elementAt(n2);
                            if (!bp2.B()) break block12;
                            break block13;
                        }
                        catch (Exception exception) {}
                    }
                    if (bp2 != null) {
                        if (V == n2) {
                            t2.a(ay.b);
                            t2.c(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                            t2.a(0xFFFFFF);
                            t2.b(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                        } else {
                            t2.a(ay.a);
                            t2.c(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                            t2.a(13932896);
                            t2.b(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                        }
                        ab.a(t2, 647, gD + 12, gE + n2 * cK + cK / 2, 0, 3);
                        if (this.bm > 0 && this.bm == bp2.p) {
                            dd.j.a(t2, String.valueOf(bp2.ab) + " - " + df.bv + ": " + bp2.w, gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                        } else if (bp2.n == 14) {
                            dd.k.a(t2, String.valueOf(bp2.ab) + " - " + df.bv + ": " + bp2.w, gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                        } else {
                            dd.n.a(t2, String.valueOf(bp2.ab) + " - " + df.bv + ": " + bp2.w, gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                        }
                    }
                }
                ++n2;
            }
            dg.n(t2);
        }
    }

    private void g(t t2) {
        try {
            int n2;
            int n3 = (int)(System.currentTimeMillis() / 1000L);
            int n4 = 5;
            if (main.a.g && main.a.h) {
                n4 = 45 + x.a;
            }
            if (main.a.i && bp.d().ax.size() > 4) {
                n4 += 25;
            }
            dg.b(t2);
            if (!main.a.j) {
                n2 = 0;
                int n5 = 0;
                while (n5 < bp.d().ay.size()) {
                    m m2 = (m)bp.d().ay.elementAt(n5);
                    ab.a(t2, m2.e.c, main.a.A - 13 - (n5 * 13 << 1), n4 + 14, 0, 33);
                    n2 = m2.c - (n3 - m2.b);
                    if (n2 >= 0) {
                        dd.i.a(t2, at.b(n2), main.a.A - 13 - (n5 * 13 << 1), n4 + 15, 2, dd.k);
                    }
                    ++n5;
                }
                n2 = this.bG - (n3 - this.bH);
                if (bp.d().ay.size() > 0) {
                    n4 += 27;
                }
                if (n2 > 0) {
                    dd.i.a(t2, String.valueOf(df.bf) + ": " + at.b(n2), main.a.A - 2, n4, 1, dd.k);
                    n4 += 12;
                }
                if (af.n == 1) {
                    dd.i.a(t2, String.valueOf(df.bg) + ": " + bp.d().be, main.a.A - 2, n4, 1, dd.k);
                    dd.i.a(t2, String.valueOf(df.bh) + ": " + bp.d().bf, main.a.A - 2, n4 += 12, 1, dd.k);
                    n4 += 12;
                } else if (af.n == 2 || af.o == 114 || af.o == 115 || af.o == 116) {
                    dd.i.a(t2, String.valueOf(df.bi) + ": " + bp.bx, main.a.A - 2, n4, 1, dd.k);
                    n4 += 12;
                } else if (af.n == 3) {
                    dd.i.a(t2, String.valueOf(df.bi) + ": " + bp.by, main.a.A - 2, n4, 1, dd.k);
                    dd.i.a(t2, df.dR[bp.z()], main.a.A - 2, n4 += 12, 1, dd.k);
                    n4 += 12;
                }
            }
            if (G.size() > 0 && main.a.A > 128 && !dg.A()) {
                n4 -= 18;
                n2 = 0;
                while (n2 < G.size()) {
                    db db2 = (db)G.elementAt(n2);
                    if (db2.f != null) {
                        dd.i.a(t2, String.valueOf(db2.d) + "(" + db2.f.w + ")", main.a.A - 14, n4 += 18, 1, dd.k);
                        db2.f.a(t2, main.a.A - 41, n4 + 12);
                        ab.a(t2, db2.c, main.a.A - 7, n4 + 9, 0, 3);
                    } else {
                        dd.n.a(t2, db2.d, main.a.A - 14, (n4 += 16) + 5, 1, dd.k);
                        ab.a(t2, db2.c, main.a.A - 7, n4 + 11, 0, 3);
                    }
                    ++n2;
                }
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void b(t t2) {
        t2.a(-t2.a(), -t2.b());
        t2.d(0, -200, main.a.A, 200 + main.a.B);
    }

    private void h(t t2) {
        try {
            int n2;
            int n3;
            if (main.a.F.a) {
                return;
            }
            if (b.a) {
                return;
            }
            if (dg.aG()) {
                return;
            }
            int n4 = -7;
            int n5 = 3;
            if ((!main.a.g || main.a.g && !main.a.h) && da) {
                n5 += 30;
            }
            if (main.a.g) {
                n4 = -7 + (45 + x.a);
                if (main.a.i) {
                    n4 += 35;
                }
            }
            t2.a(-t2.a(), -t2.b());
            if (main.a.j) {
                n3 = (int)(System.currentTimeMillis() / 1000L);
                int n6 = 0;
                while (n6 < bp.d().ay.size()) {
                    m m2 = (m)bp.d().ay.elementAt(n6);
                    ab.a(t2, m2.e.c, n5 + 13 + (n6 * 13 << 1), n4 + 27, 0, 33);
                    n2 = m2.c - (n3 - m2.b);
                    if (n2 >= 0) {
                        dd.i.a(t2, at.b(n2), n5 + 13 + (n6 * 13 << 1), n4 + 28, 2, dd.k);
                    }
                    ++n6;
                }
                n2 = this.bG - (n3 - this.bH);
                if (bp.d().ay.size() > 0) {
                    n4 += 27;
                }
                if (n2 > 0) {
                    dd.i.a(t2, String.valueOf(df.bf) + ": " + at.b(n2), n5, n4 += 12, 0, dd.k);
                }
            }
            if (bp.d().w <= 20) {
                if (bp.d().F > 0) {
                    String string = "+" + bp.d().F + " " + df.ba;
                    dd.j.a(t2, string, n5, n4 += 12, 0, dd.k);
                }
                if (bp.d().G > 0) {
                    String string = "+" + bp.d().G + " " + df.bb;
                    dd.j.a(t2, string, n5, n4 += 12, 0, dd.k);
                }
            }
            if (bg.d().g.size() > 0) {
                this.eu[0] = n5;
                this.ev[0] = n4 + 12;
                String string = "+" + bg.d().g.size() + " " + df.aV;
                if (main.a.w % 10 > 4) {
                    dd.l.a(t2, string, n5, n4 += 12, 0, dd.k);
                } else {
                    dd.j.a(t2, string, n5, n4 += 12, 0, dd.k);
                }
            }
            if (bg.e || bg.f) {
                String string = "";
                this.eu[1] = n5;
                this.ev[1] = n4 + 12;
                if (bg.e && bg.f) {
                    string = df.aW[0];
                } else if (bg.e) {
                    string = df.aW[1];
                } else if (bg.f) {
                    string = df.aW[2];
                }
                if (main.a.w % 10 > 7) {
                    dd.l.a(t2, string, n5, n4 += 12, 0, dd.k);
                } else {
                    dd.j.a(t2, string, n5, n4 += 12, 0, dd.k);
                }
            }
            if (af.n != 3) {
                if (bp.d().A()) {
                    if (bp.d().aA != null) {
                        String string = bp.d().aA.e[bp.d().aA.a];
                        n2 = 0;
                        while (string == null) {
                            string = bp.d().aA.e[bp.d().aA.a - ++n2];
                        }
                        if (bp.d().aA.b[bp.d().aA.a] != -1) {
                            string = String.valueOf(string) + " " + bp.d().aA.f + "/" + bp.d().aA.b[bp.d().aA.a];
                        }
                        if (main.a.x > 0 && main.a.w % 10 > 4) {
                            dd.j.a(t2, string, n5, n4 += 12, 0, dd.k);
                        } else {
                            dd.i.a(t2, string, n5, n4 += 12, 0, dd.k);
                        }
                    } else {
                        byte by2 = dg.E();
                        n3 = by2;
                        if (by2 >= 0) {
                            dd.i.a(t2, String.valueOf(df.dy) + " " + af.u[n3], n5, n4 += 12, 0, dd.k);
                        }
                    }
                }
            } else if (bp.d().aV != null) {
                if (bp.d().aV.aN == 4) {
                    dd.i.a(t2, df.dz, n5, n4 += 12, 0, dd.k);
                } else if (bp.d().aV.aN == 5) {
                    dd.i.a(t2, df.dA, n5, n4 += 12, 0, dd.k);
                } else if (bp.d().aV.aN == 6) {
                    dd.i.a(t2, df.dB, n5, n4 += 12, 0, dd.k);
                }
            } else if (bp.d().aR != null) {
                if (bp.d().aR.s == 96) {
                    dd.i.a(t2, df.dA, n5, n4 += 12, 0, dd.k);
                } else if (bp.d().aR.s == 97) {
                    dd.i.a(t2, df.dz, n5, n4 += 12, 0, dd.k);
                } else if (bp.d().aR.s == 93) {
                    dd.i.a(t2, df.dB, n5, n4 += 12, 0, dd.k);
                } else {
                    dd.i.a(t2, df.dC, n5, n4 += 12, 0, dd.k);
                }
            }
            if (bp.d().aR != null) {
                a a2 = bp.d().aR.c();
                String string = String.valueOf(a2.g) + " lv" + bp.d().aR.x;
                if (bp.d().aR.s != 0 && bp.d().aR.s != 142 && bp.d().aR.s != 143) {
                    string = String.valueOf(string) + ": " + bp.d().aR.c + "/" + bp.d().aR.d;
                }
                t2.a(bp.d().aR.e());
                t2.c(n5, (n4 += 12) + 3, 5, 5);
                t2.a(0);
                t2.b(n5, n4 + 3, 5, 5);
                dd.i.a(t2, string, n5 + 12, n4, 0, dd.k);
            } else if (bp.d().aU != null) {
                dd.j.a(t2, bp.d().aU.cm.b, n5, n4 += 12, 0, dd.k);
            } else if (bp.d().aV != null) {
                t2.a(bp.d().aV.t());
                t2.c(n5, (n4 += 12) + 3, 5, 5);
                t2.a(0);
                t2.b(n5, n4 + 3, 5, 5);
                dd.i.a(t2, String.valueOf(bp.d().aV.ab) + " lv" + bp.d().aV.w + ": " + bp.d().aV.z + "/" + bp.d().aV.B, n5 + 12, n4, 0, dd.k);
            }
            if (main.a.j) {
                if (af.n == 1) {
                    dd.i.a(t2, String.valueOf(df.bg) + ": " + bp.d().be, n5, n4 += 12, 0, dd.k);
                    dd.i.a(t2, String.valueOf(df.bh) + ": " + bp.d().bf, n5, n4 += 12, 0, dd.k);
                } else if (af.n == 2 || af.o == 114 || af.o == 115 || af.o == 116) {
                    dd.i.a(t2, String.valueOf(df.bi) + ": " + bp.bx, n5, n4 += 12, 0, dd.k);
                } else if (af.n == 3) {
                    dd.i.a(t2, String.valueOf(df.bi) + ": " + bp.by, n5, n4 += 12, 0, dd.k);
                    dd.i.a(t2, df.dR[bp.z()], n5, n4 += 12, 0, dd.k);
                }
            }
            t2.a(-t2.a(), -t2.b());
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void i(t t2) {
        if (!main.a.g || main.a.F.a && main.a.i) {
            return;
        }
        if (main.a.J != null || cb.f != null || main.a.F.a || dg.aG()) {
            return;
        }
        dg.b(t2);
        if (!aw.a().b) {
            t2.a(ei, eQ + 17, eR + 17, 3);
        }
        if (this.aH()) {
            return;
        }
        t2.a(el, eO, eP, 0);
        t2.a(eg, 0, 0, t.a(eg), t.b(eg), 3, eO + 15, eP + 16, 3);
        if (ag.q == 4) {
            t2.a(em, eO, eP, 0);
            t2.a(eh, 0, 0, t.a(eg), t.b(eg), 3, eO + 15, eP + 16, 3);
        }
        t2.a(el, eS, eT, 0);
        t2.a(eg, 0, 0, t.a(eg), t.b(eg), 0, eS + 17, eT + 16, 3);
        if (ag.q == 6) {
            t2.a(em, eS, eT, 0);
            t2.a(eh, 0, 0, t.a(eg), t.b(eg), 0, eS + 17, eT + 16, 3);
        }
        t2.a(el, eW, eX, 0);
        t2.a(eg, 0, 0, t.a(eg), t.b(eg), 7, eW + 17, eX + 14, 3);
        if (ag.q == 3) {
            t2.a(em, eW, eX, 0);
            t2.a(eh, 0, 0, t.a(eg), t.b(eg), 7, eW + 17, eX + 14, 3);
        }
        if (bp.d().r > 1) {
            t2.a(el, eY, eZ, 0);
            if (ag.q == 10) {
                t2.a(em, eY, eZ, 0);
            }
            t2.a(en, eY + 16, eZ + 15, 3);
            dd.s.a(t2, "" + z, eY + 22, eZ + 20, 1);
            t2.a(el, fa, fb, 0);
            if (ag.q == 11) {
                t2.a(em, fa, fb, 0);
            }
            t2.a(eo, fa + 16, fb + 15, 3);
            dd.s.a(t2, "" + y, fa + 22, fb + 20, 1);
            t2.a(el, fc, fd, 0);
            if (ag.q == 13) {
                t2.a(em, fc, fd, 0);
            }
            t2.a(ek, fc + 16, fd + 16, 3);
        }
        t2.a(ep, eU, eV, 0);
        if (ag.q == 5) {
            t2.a(eq, eU, eV, 0);
        }
    }

    private void j(t t2) {
        if (main.a.J != null || cb.f != null || main.a.F.a || dg.aG() || this.l == this.cj) {
            return;
        }
        if (main.a.g && bp.d().aw.size() < 2) {
            return;
        }
        if (da) {
            int n2 = 0;
            while (n2 < ez.length) {
                if (main.a.i) {
                    dg.ff[n2] = x.a > 0 ? 55 + x.a : 55;
                }
                if (main.a.g && main.a.h) {
                    t2.a(er, fg + fe[n2] - 1, ff[n2] - 1, 0);
                } else {
                    t2.a(0xFFCC88);
                    t2.b(fg + fe[n2] - 1, ff[n2] - 1, 25, 25);
                }
                z z2 = ez[n2];
                if (n2 == this.eJ && !dg.A() && main.a.w % 10 > 5) {
                    t2.a(0xFFFFFF);
                    t2.c(fg + fe[n2] + 1, ff[n2] + 1, 22, 22);
                } else if (!main.a.g) {
                    t2.a(0);
                    t2.c(fg + fe[n2], ff[n2], 24, 24);
                }
                if (z2 != null) {
                    if (z2 == bp.d().az) {
                        t2.a(0xFF0000);
                        t2.b(fg + fe[n2] - 1, ff[n2] - 1, 25, 25);
                    }
                    z2.a(fg + fe[n2] + 12, ff[n2] + 12, t2);
                }
                ++n2;
            }
        }
    }

    public static final void a(String string, int n2, int n3, int n4, int n5, int n6) {
        n4 = -1;
        n5 = 0;
        while (n5 < 5) {
            if (fo[n5] == -1) {
                n4 = n5;
                break;
            }
            ++n5;
        }
        if (n4 == -1) {
            return;
        }
        dg.fp[n4] = n6;
        dg.fj[n4] = string;
        dg.fk[n4] = n2;
        dg.fl[n4] = n3;
        dg.fm[n4] = 0;
        dg.fn[n4] = -2;
        dg.fo[n4] = 0;
    }

    public static final void a(int n2, int n3) {
        cJ.addElement(new ac(n2, n3));
    }

    public static final boolean a(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = fs[0] == -1 ? 0 : 1;
        if (fs[n5] != -1) {
            return false;
        }
        dg.fs[n5] = 0;
        dg.fu[n5] = n4;
        dg.fq[n5] = n2;
        dg.fr[n5] = n3;
        return true;
    }

    private void at() {
        if (fI == null) {
            fI = new Image[2];
            int n2 = 0;
            while (n2 < 2) {
                dg.fI[n2] = main.a.c("/u/c" + n2 + ".png");
                ++n2;
            }
        }
        fz = t.a(fI[0]);
        fA = t.a(fI[1]);
        fB = b - fz - fA + 1;
        fC = 63;
        fD = fx + 7;
        fE = b - 84 - 30 + 15;
        fG = b - 44 - 4;
        fH = 5;
        if (main.a.A > 176) {
            fB -= 50;
            fE -= 50;
            fG -= 50;
            fC += 15;
            fE -= 15;
        }
        this.au();
    }

    private void au() {
        if (!main.a.g) {
            return;
        }
        fE = 82;
        fF = 57;
        fC = 52;
        fD = main.a.V ? 25 : 10 + x.a;
        fG = b - 61;
        if (main.a.i) {
            eQ = b / 2 - 2;
            eR = eN + 50;
        } else {
            this.eA.g = 6 + x.a;
            eQ = b - 100;
            eR = 2 + x.a;
        }
        af.a(main.a.A - 60, main.a.V ? 16 : x.a, 60, 42);
    }

    private void k(t t2) {
        int n2;
        int n3;
        int n4;
        if (W != 4) {
            return;
        }
        t2.a(-t2.a(), -t2.b());
        ay.a(ce, cd, cf, cg, t2);
        t2.a(ay.a);
        dg.a(t2, df.cg[W], true);
        if (dg.aV.aD == null) {
            main.a.a(ce + 90, cd + 75, t2, false);
            dd.e.a(t2, df.y, ce + cf / 2, cd + 90, 2);
            return;
        }
        t2.a(13606712);
        t2.b(ce + 33, cd + (main.a.j ? 87 : 34), cf - 67, main.a.j ? 76 : 128);
        int n5 = cK - 2;
        int n6 = 0;
        int n7 = 0;
        while (n7 < 16) {
            if (n7 == 0 || n7 == 2 || n7 == 4 || n7 == 6 || n7 == 8) {
                t2.a(0);
                t2.c(ce + 4 + 1, cd + 35 + n7 / 2 * n5 + 1, n5 - 1, n5 - 1);
                if (fJ == 0) {
                    if (df.eJ[n7].length > 1) {
                        dd.k.a(t2, df.eJ[n7][0], ce + 7 + 11, cd + 36 + n7 / 2 * n5 + 2, 2);
                        dd.k.a(t2, df.eJ[n7][1], ce + 7 + 11, cd + 36 + n7 / 2 * n5 + 2 + 9, 2);
                    } else {
                        dd.k.a(t2, df.eJ[n7][0], ce + 7 + 11, cd + 36 + n7 / 2 * n5 + 2 + 5, 2);
                    }
                }
            } else if (n7 == 1 || n7 == 3 || n7 == 5 || n7 == 7 || n7 == 9) {
                t2.a(0);
                t2.c(ce + cf - n5 - 4, cd + 35 + n7 / 2 * n5 + 1, n5 - 1, n5 - 1);
                if (fJ == 0) {
                    if (df.eJ[n7].length > 1) {
                        dd.k.a(t2, df.eJ[n7][0], ce + cf - n5 / 2 - 4, cd + 36 + n7 / 2 * n5 + 2, 2);
                        dd.k.a(t2, df.eJ[n7][1], ce + cf - n5 / 2 - 4, cd + 36 + n7 / 2 * n5 + 2 + 9, 2);
                    } else {
                        dd.k.a(t2, df.eJ[n7][0], ce + cf - n5 / 2 - 4, cd + 36 + n7 / 2 * n5 + 2 + 5, 2);
                    }
                }
            } else if (n7 == 9 || n7 == 10 || n7 == 11 || n7 == 12 || n7 == 13 || n7 == 14 || n7 == 15) {
                n4 = ce + 4 + 1 + n6 * (n5 + 2);
                n3 = cd + 35 + n5 * 5 + 1;
                t2.a(0);
                t2.c(n4, cd + 35 + n5 * 5 + 1, n5 - 1, n5 - 1);
                if (fJ == 0) {
                    if (df.eJ[n7].length > 1) {
                        dd.k.a(t2, df.eJ[n7][0], n4 + n5 / 2, n3 + 2, 2);
                        dd.k.a(t2, df.eJ[n7][1], n4 + n5 / 2, n3 + 2 + 9, 2);
                    } else {
                        dd.k.a(t2, df.eJ[n7][0], n4 + n5 / 2, n3 + 2 + 5, 2);
                    }
                }
                ++n6;
            }
            ++n7;
        }
        if (fJ == 0) {
            n7 = 0;
            while (n7 < 16) {
                by by2 = dg.aV.aD[n7];
                if (by2 != null) {
                    if (by2.q == null) {
                        by2.q = D[56];
                    }
                    if (by2.e == 0 || by2.e == 2 || by2.e == 4 || by2.e == 6 || by2.e == 8 || by2.e == 10) {
                        n3 = ce + 4;
                        n2 = cd + 34 + by2.e / 2 * n5;
                        ((dg)((Object)bd2)).a(t2, by2, n3 - 1, n2, 0, 1);
                    } else if (by2.e == 1 || by2.e == 3 || by2.e == 5 || by2.e == 7 || by2.e == 9) {
                        n3 = ce + cf - n5 - 5;
                        n2 = cd + 35 + by2.e / 2 * n5;
                        ((dg)((Object)bd2)).a(t2, by2, n3 - 1, n2 - 1, 0, 1);
                    } else if (by2.e == 11 || by2.e == 12 || by2.e == 13 || by2.e == 14 || by2.e == 15) {
                        if (by2.e == 10) {
                            n6 = 1;
                        } else if (by2.e == 11) {
                            n6 = 2;
                        } else if (by2.e == 12) {
                            n6 = 3;
                        } else if (by2.e == 13) {
                            n6 = 4;
                        } else if (by2.e == 14) {
                            n6 = 5;
                        } else if (by2.e == 15) {
                            n6 = 6;
                        }
                        n3 = ce + 2 + 1 + n6 * (n5 + 2) - n5;
                        n2 = cd + 35 + n5 * 5;
                        ((dg)((Object)bd2)).a(t2, by2, n3 - 2, n2 - 1, 0, 1);
                    }
                    if (main.a.w % 4 == 0) {
                        ++by2.r;
                        if (by2.r >= by2.q.b.length) {
                            by2.r = 0;
                        }
                    }
                }
                ++n7;
            }
        }
        if (fJ > 0) {
            n7 = 0;
            while (n7 < 16) {
                by by3 = dg.aV.aD[n7 + fJ];
                if (by3 != null) {
                    int n8;
                    n3 = by3.e - 16;
                    if (by3.q == null) {
                        by3.q = D[56];
                    }
                    if (n3 == 0 || n3 == 2 || n3 == 4 || n3 == 6 || n3 == 8 || n3 == 10) {
                        n2 = ce + 4;
                        n8 = cd + 34 + n3 / 2 * n5;
                        ((dg)((Object)bd2)).a(t2, by3, n2 - 1, n8, 0, 1);
                    } else if (n3 == 1 || n3 == 3 || n3 == 5 || n3 == 7 || n3 == 9) {
                        n2 = ce + cf - n5 - 5;
                        n8 = cd + 35 + n3 / 2 * n5;
                        ((dg)((Object)bd2)).a(t2, by3, n2 - 1, n8 - 1, 0, 1);
                    } else if (n3 == 11 || n3 == 12 || n3 == 13 || n3 == 14 || n3 == 15) {
                        if (n3 == 10) {
                            n6 = 1;
                        } else if (n3 == 11) {
                            n6 = 2;
                        } else if (n3 == 12) {
                            n6 = 3;
                        } else if (n3 == 13) {
                            n6 = 4;
                        } else if (n3 == 14) {
                            n6 = 5;
                        } else if (n3 == 15) {
                            n6 = 6;
                        }
                        n2 = ce + 2 + 1 + n6 * (n5 + 2) - n5;
                        n8 = cd + 35 + n5 * 5;
                        ((dg)((Object)bd2)).a(t2, by3, n2 - 2, n8 - 1, 0, 1);
                    }
                    if (main.a.w % 4 == 0) {
                        ++by3.r;
                        if (by3.r >= by3.q.b.length) {
                            by3.r = 0;
                        }
                    }
                }
                ++n7;
            }
        }
        n7 = 0;
        while (n7 < 16) {
            if (cL == 1 && n7 == U) {
                if (n7 == 0 || n7 == 2 || n7 == 4 || n7 == 6 || n7 == 8) {
                    t2.a(0xFFFFFF);
                    t2.b(ce + 4, cd + 35 + n7 / 2 * n5, n5, n5);
                    dg.a(ce + 5 - 2, cd + 35 + n7 / 2 * n5 - 1, t2);
                } else if (n7 == 1 || n7 == 3 || n7 == 5 || n7 == 7 || n7 == 9) {
                    t2.a(0xFFFFFF);
                    t2.b(ce + cf - n5 - 4 - 1, cd + 35 + n7 / 2 * n5, n5, n5);
                    dg.a(ce + cf - n5 - 4 - 2, cd + 35 + n7 / 2 * n5 - 1, t2);
                } else if (n7 == 9 || n7 == 10 || n7 == 11 || n7 == 12 || n7 == 13 || n7 == 14 || n7 == 15) {
                    if (n7 == 9) {
                        n6 = 0;
                    } else if (n7 == 10) {
                        n6 = 1;
                    } else if (n7 == 11) {
                        n6 = 2;
                    } else if (n7 == 12) {
                        n6 = 3;
                    } else if (n7 == 13) {
                        n6 = 4;
                    } else if (n7 == 14) {
                        n6 = 5;
                    } else if (n7 == 15) {
                        n6 = 6;
                    }
                    n4 = ce + 2 + 1 + n6 * (n5 + 2) - n5;
                    n3 = cd + 35 + n5 * 5;
                    t2.a(0xFFFFFF);
                    t2.b(n4 - 1, n3, n5, n5);
                    dg.a(n4 - 2, n3 - 1, t2);
                }
            }
            ++n7;
        }
        n7 = main.a.j ? -25 : 16;
        dr dr2 = C[dg.aV.bO];
        dr dr3 = C[dg.aV.bP];
        dr dr4 = C[dg.aV.bQ];
        dr dr5 = C[dg.aV.bR];
        if (dg.aV.aD != null && dg.aV.aD[11] != null) {
            dr2 = C[dg.aV.aD[11].b.h];
        }
        if (dr2.a == null || dr2.a.length < 8) {
            bp.d();
            dr2 = bp.b(bp.d().q);
        } else {
            n5 = 0;
            while (n5 < dr2.a.length) {
                if (dr2.a[n5] == null || !ab.a(dr2.a[n5].a)) {
                    bp.d();
                    dr2 = bp.b(bp.d().q);
                    break;
                }
                ++n5;
            }
        }
        n5 = dg.aV.m % 15 < 5 ? 0 : 1;
        int[] nArray = aV.s();
        if (dg.aV.ce > -1) {
            aV.g(t2, d, f - 24, n5);
        }
        if (dg.aV.bZ > -1) {
            aV.c(t2, d, f - 24, n5);
        }
        if (nArray != null && dg.aV.bZ == -1) {
            if (bp.d().bg == 0) {
                ab.a(t2, nArray[bp.d().bg], d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][1] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].b - 2, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][2] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].c + 16, 0, 0);
            } else if (bp.d().bg == 1) {
                ab.a(t2, nArray[bp.d().bg], d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][1] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].b - 9, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][2] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].c + 16, 0, 0);
            } else if (bp.d().bg == 2) {
                ab.a(t2, nArray[bp.d().bg], d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][1] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].b - 12, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][2] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].c + 16, 0, 0);
            } else {
                ab.a(t2, nArray[bp.d().bg], d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][1] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].b - 9, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][2] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].c + 16, 0, 0);
            }
        }
        aV.c(t2, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][1] + dr4.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][0]].b + 18, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][2] + dr3.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][0]].c + 5);
        if (dg.aV.ce == -1) {
            ab.a(t2, dr5.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][3][0]].a, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][3][1] + dr5.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][3][0]].b, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][3][2] + dr5.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][3][0]].c, 0, 0);
        }
        if (dg.aV.cb > -1) {
            aV.i(t2, d, f - 24, n5);
        } else {
            ab.a(t2, dr3.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][0]].a, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][1] + dr3.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][0]].b, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][2] + dr3.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][0]].c, 0, 0);
        }
        if (dg.aV.bY > -1) {
            aV.j(t2, d, f - 24, n5);
        } else {
            ab.a(t2, dr4.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][0]].a, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][1] + dr4.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][0]].b, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][2] + dr4.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][0]].c, 0, 0);
        }
        if (dg.aV.ca > -1) {
            aV.h(t2, d, f - 24, n5);
        } else {
            ab.a(t2, dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].a, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][1] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].b, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][2] + dr2.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][0][0]].c, 0, 0);
        }
        if (dg.aV.cd > -1) {
            aV.e(t2, d, f - 24, n5);
        }
        aV.c(t2, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][1] + dr4.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][0]].b + 5, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][2] + dr3.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][0]].c + 5);
        aV.d(t2, d + bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][1] + dr4.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][2][0]].b + 22, f + n7 - bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][2] + dr3.a[bp.bA[dg.aV.m % 15 < 5 ? 0 : 1][1][0]].c + 5);
        if (dg.aV.bZ > -1) {
            aV.d(t2, d, f - 24, n5);
        }
        if (dg.aV.ce > -1) {
            aV.f(t2, d, f - 24, n5);
        }
        if (((dg)((Object)bd2)).cG != null && main.a.g) {
            bd bd2 = ((dg)((Object)bd2)).cG;
            if (!bd2.j) {
                t2.a(bA, bd2.f, bd2.g, 0);
            } else {
                t2.a(bB, bd2.f, bd2.g, 0);
            }
            dd.d.a(t2, bd2.a, bd2.f + 36, bd2.g + 6, 2);
        }
    }

    private void l(t t2) {
        int n2;
        int n3;
        if (W != 5) {
            return;
        }
        t2.a(-t2.a(), -t2.b());
        ay.a(ce, cd, cf, cg, t2);
        t2.a(ay.a);
        dg.a(t2, df.cg[W], true);
        dg.b(t2);
        t2.a(0);
        t2.c(ce + 2, cd + 31, 171, cg - 34);
        t2.a(13606712);
        t2.b(ce + 3, cd + 32, 168, cg - 37);
        t2.a(ay.a);
        t2.c(ce + 4, cd + 34, 166, cg - 39);
        if (dg.aV.aE[4] != null) {
            dd.e.a(t2, dg.aV.aE[4].b.d, ce + 90, gE + 2, 2);
            n3 = dg.aV.aE[4].i + 1;
            n2 = 0;
            while (n2 < n3) {
                ab.a(t2, 628, ce + 90 + n2 * 12 - n3 * 6, gE + 20, 0, 3);
                ++n2;
            }
        } else {
            dd.e.a(t2, df.ih, ce + 90, gE + 2, 2);
        }
        n3 = 0;
        while (n3 < dg.aV.aE.length - 1) {
            if (dg.aV.aE[n3] != null) {
                this.a(t2, dg.aV.aE[n3], this.ew[n3], this.ex[n3]);
            } else {
                t2.a(6425);
                t2.c(this.ew[n3] - 1, this.ex[n3] - 1, cK + 3, cK + 3);
                if (n3 == 0) {
                    if (aV.p()) {
                        dd.k.a(t2, df.eJ[22][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[22][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    } else {
                        dd.k.a(t2, df.eJ[19][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[19][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    }
                } else if (n3 == 1) {
                    if (aV.p()) {
                        dd.k.a(t2, df.eJ[20][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[20][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    } else {
                        dd.k.a(t2, df.eJ[16][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[16][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    }
                } else if (n3 == 2) {
                    if (aV.p()) {
                        dd.k.a(t2, df.eJ[21][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[21][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    } else {
                        dd.k.a(t2, df.eJ[17][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[17][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    }
                } else if (n3 == 3) {
                    if (aV.p()) {
                        dd.k.a(t2, df.eJ[23][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[23][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    } else {
                        dd.k.a(t2, df.eJ[18][0], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 - 10, 2);
                        dd.k.a(t2, df.eJ[18][1], this.ew[n3] + cK / 2, this.ex[n3] + cK / 2 + 2, 2);
                    }
                }
            }
            if (U == n3 && cL == 1 && U < 4) {
                t2.a(0xFFFFFF);
            } else {
                t2.a(0xBB6611);
            }
            t2.b(this.ew[n3], this.ex[n3], cK, cK);
            ++n3;
        }
        n3 = this.ew[0] + cK + 7;
        n2 = this.ex[0] - 5;
        t2.a(6425);
        t2.c(n3, n2, 84, 75);
        if (U == 4) {
            t2.a(0xFFFFFF);
        } else {
            t2.a(0xBB6611);
        }
        t2.b(n3, n2, 84, 75);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (dg.aV.cc > -1) {
            aV.b(t2, n3 + 35, n2 + 55);
        }
        if (dg.aV.aE[4] != null) {
            if (aV.D()) {
                int[][] nArray = (int[][])dm.h.a(String.valueOf(dg.aV.aE[4].b.a));
                if (main.a.w % 20 > 15) {
                    ab.a(t2, nArray[0][0], n3 + 45 - 10, n2 + 35, 0, 3);
                } else {
                    ab.a(t2, nArray[0][1], n3 + 45 - 10, n2 + 35, 0, 3);
                }
            } else if (aV.p()) {
                if (dg.aV.aE[4].b.a == 485) {
                    if (dg.aV.aE[4].i < 2) {
                        ab.a(t2, 1800, n3 + 45, n2 + 35, 0, 3);
                    } else {
                        ab.a(t2, 2063, n3 + 45, n2 + 35, 0, 3);
                    }
                } else if (dg.aV.aE[4].b.a == 524) {
                    if (dg.aV.aE[4].i < 2) {
                        ab.a(t2, 2067, n3 + 45, n2 + 35, 0, 3);
                    } else {
                        ab.a(t2, 2071, n3 + 45, n2 + 35, 0, 3);
                    }
                }
            } else if (aV.o()) {
                if (dg.aV.aE[4].b.a == 443) {
                    if (dg.aV.aE[4].i < 2) {
                        if (main.a.w % 20 > 15) {
                            ab.a(t2, 1801, n3 + 45, n2 + 35, 0, 3);
                        } else {
                            ab.a(t2, 1802, n3 + 45, n2 + 35, 0, 3);
                        }
                    } else if (main.a.w % 20 > 15) {
                        ab.a(t2, 2080, n3 + 45, n2 + 35, 0, 3);
                    } else {
                        ab.a(t2, 2081, n3 + 45, n2 + 35, 0, 3);
                    }
                } else if (dg.aV.aE[4].b.a == 523) {
                    if (main.a.w % 20 > 15) {
                        ab.a(t2, 2062, n3 + 45, n2 + 35, 0, 3);
                    } else {
                        ab.a(t2, 2061, n3 + 45, n2 + 35, 0, 3);
                    }
                }
            }
            if (dg.aV.aE[4].c != null) {
                int n9 = 0;
                while (n9 < dg.aV.aE[4].c.size()) {
                    cg cg2 = (cg)dg.aV.aE[4].c.elementAt(n9);
                    if (cg2.c.a == 65) {
                        n4 = cg2.a;
                    } else if (cg2.c.a == 66) {
                        n5 = cg2.a;
                    }
                    ++n9;
                }
            }
            n6 = n4 * 85 / 1000;
            n7 = n5 * 85 / 1000;
            n8 = dg.aV.aE[4].j + 1;
        }
        int n10 = gD + 5;
        int n11 = gE + 112;
        dd.e.a(t2, String.valueOf(df.bu) + ": ", n10, n11, 0);
        dd.e.a(t2, String.valueOf(n8), n10 + 70, n11, 0);
        if (aV.p()) {
            dd.e.a(t2, String.valueOf(df.iw) + ": ", n10, n11 += 15, 0);
        } else {
            dd.e.a(t2, String.valueOf(df.da) + ": ", n10, n11 += 15, 0);
        }
        t2.a(6425);
        t2.c(n10 + 70, n11, 85, 14);
        t2.a(371981);
        t2.c(n10 + 70, n11, n6, 14);
        t2.a(5131338);
        t2.b(n10 + 70, n11, 85, 14);
        dd.i.a(t2, String.valueOf(n4) + "/" + 1000, n10 + 113, n11 + 2, 2);
        if (aV.p()) {
            dd.e.a(t2, String.valueOf(df.ix) + ": ", n10, n11 += 17, 0);
        } else {
            dd.e.a(t2, String.valueOf(df.ig) + ": ", n10, n11 += 17, 0);
        }
        t2.a(6425);
        t2.c(n10 + 70, n11, 85, 14);
        t2.a(0xFF0000);
        t2.c(n10 + 70, n11, n7, 14);
        t2.a(5131338);
        t2.b(n10 + 70, n11, 85, 14);
        dd.i.a(t2, String.valueOf(n5) + "/" + 1000, n10 + 113, n11 + 2, 2);
    }

    private void m(t t2) {
        if (!dE) {
            return;
        }
        dg.b(t2);
        ay.a(ce, cd, cf, cg, t2);
        dg.a(t2, df.fH[W], true);
        if (W == 0) {
            if (bp.ae == null || bp.ae.a == null || bp.ae.a.equals("")) {
                cM = 1;
                dd.i.a(t2, df.go, ce + cf / 2, cd + 40, 2);
                return;
            }
            int[] nArray = new int[]{1692, 1693, 1694, 1695, 1696};
            int n2 = 0;
            while (n2 < nArray.length) {
                t2.a(6425);
                t2.c(ce + n2 * cK + 18, cd + 32, cK - 2, cK - 2);
                if (cL == 1 && n2 == U) {
                    t2.a(0xFFFFFF);
                } else {
                    t2.a(0xBB6611);
                }
                t2.b(ce + n2 * cK + 18, cd + 32, cK - 2, cK - 2);
                if (n2 > bp.ae.e - 1) {
                    ab.a(t2, 1697, ce + n2 * cK + 18 + cK / 2, cd + 32 + cK / 2, 0, 3);
                } else {
                    ab.a(t2, nArray[n2], ce + n2 * cK + 18 + cK / 2, cd + 32 + cK / 2, 0, 3);
                }
                ++n2;
            }
            if (cL == 2) {
                t2.a(ay.c);
                t2.c(ce + 7, cd + 60, cf - 14, cg - 68);
                t2.a(0xFFFFFF);
            } else {
                t2.a(10249521);
            }
            t2.b(ce + 7, cd + 60, cf - 14, cg - 68);
            gD = ce + 17;
            gE = cd + 62;
            cM = 12;
            aa.a(cM, 12, ce, cd + 62, cf, cg - 72, true, 1);
            aa.a(t2);
            dd.d.a(t2, String.valueOf(df.fI[0]) + bp.ae.a, gD, gE, 0);
            dd.h.a(t2, String.valueOf(df.fI[1]) + bp.ae.j, gD, gE += 12, 0);
            dd.i.a(t2, String.valueOf(df.fI[2]) + bp.ae.n + "/" + (bp.ae.d * 5 + 45), gD, gE += 12, 0);
            dd.i.a(t2, String.valueOf(df.fI[3]) + bp.ae.d, gD, gE += 12, 0);
            dd.i.a(t2, String.valueOf(df.fI[4]) + bp.ae.b + "/" + bp.ae.c, gD, gE += 12, 0);
            dd.i.a(t2, String.valueOf(df.fI[5]) + at.a(String.valueOf(bp.ae.g)) + " " + df.eA, gD, gE += 12, 0);
            dd.i.a(t2, String.valueOf(df.fI[8]) + at.a(String.valueOf(bp.ae.h)) + " " + df.eA, gD, gE += 12, 0);
            dd.i.a(t2, String.valueOf(df.fI[9]) + at.a(String.valueOf(bp.ae.i)) + " " + df.eA, gD, gE += 12, 0);
            if (dd.i.a(String.valueOf(df.fI[10]) + bp.ae.f + " " + df.fG) > gS - 10) {
                this.a(t2, dd.i, String.valueOf(df.fI[10]) + bp.ae.f + " " + df.fG, gD, gE += 12, 0, cf - 20);
            } else {
                dd.i.a(t2, String.valueOf(df.fI[10]) + bp.ae.f + " " + df.fG, gD, gE += 12, 0);
            }
            if (dd.i.a(String.valueOf(df.fI[12]) + bp.ae.o + " " + df.fG) > gS - 10) {
                this.a(t2, dd.i, String.valueOf(df.fI[12]) + bp.ae.o + " " + df.fG, gD, gE += 12, 0, cf - 20);
            } else {
                dd.i.a(t2, String.valueOf(df.fI[12]) + bp.ae.o + " " + df.fG, gD, gE += 12, 0);
            }
            dd.i.a(t2, String.valueOf(df.fI[6]) + bp.ae.k, gD, gE += 12, 0);
            if (this.fM == null) {
                this.fM = dg.a(dd.j, bp.ae.m);
            }
            this.a(t2, dd.j, this.fM, gD, gE += 12, 0);
            if (cL == 2 && V >= 0) {
                ab.a(t2, 942, gD - 8, cd + 62 + 2 + V * 12, 0, ch.b);
            }
            aa.a(cM, 12, ce, cd + 62, cf, cg - 72, true, 1);
            return;
        }
        if (W == 1) {
            gD = ce + 5;
            gE = cd + 32;
            if (F.size() == 0) {
                dd.i.a(t2, df.go, ce + cf / 2, cd + 40, 2);
                return;
            }
            t2.a(6425);
            t2.c(gD - 2, gE - 2, cf - 6, cK * 5 + 8);
            dg.b(t2);
            aa.a(t2, gD, gE, cf - 3, cK * 5 + 6);
            this.fL = 0;
            int n3 = 0;
            while (n3 < F.size()) {
                bn bn2 = (bn)F.elementAt(n3);
                if (!cR || bn2.e) {
                    if (n3 * (cK + cK / 2) >= dg.aa.b - (cK + cK / 2) && n3 * (cK + cK / 2) < dg.aa.b + (cK * 5 + 8)) {
                        if (V == this.fL) {
                            t2.a(ay.b);
                            t2.c(gD + 2, gE + V * (cK + cK / 2) + 2, cf - 15, cK + cK / 2 - 4);
                            t2.a(0xFFFFFF);
                            t2.b(gD + 2, gE + V * (cK + cK / 2) + 2, cf - 15, cK + cK / 2 - 4);
                        } else {
                            t2.a(ay.a);
                            t2.c(gD + 2, gE + this.fL * (cK + cK / 2) + 2, cf - 15, cK + cK / 2 - 4);
                            t2.a(13932896);
                            t2.b(gD + 2, gE + this.fL * (cK + cK / 2) + 2, cf - 15, cK + cK / 2 - 4);
                        }
                        ab.a(t2, bn2.a, gD + 12, gE + this.fL * (cK + cK / 2) + 13, 0, 3);
                        if (bn2.c == 4) {
                            ab.a(t2, 1216, gD + 12, gE + this.fL * (cK + cK / 2) + 30, 0, 3);
                            if (bn2.e) {
                                dd.j.a(t2, String.valueOf(df.gu[0]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0, dd.k);
                                dd.i.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.n.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.h.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            } else {
                                dd.k.a(t2, String.valueOf(df.gu[0]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.k.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            }
                        } else if (bn2.c == 3) {
                            ab.a(t2, 1215, gD + 12, gE + this.fL * (cK + cK / 2) + 30, 0, 3);
                            if (bn2.e) {
                                dd.j.a(t2, String.valueOf(df.gu[1]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0, dd.k);
                                dd.i.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.n.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.h.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            } else {
                                dd.k.a(t2, String.valueOf(df.gu[1]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.k.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            }
                        } else if (bn2.c == 2) {
                            ab.a(t2, 1217, gD + 12, gE + this.fL * (cK + cK / 2) + 30, 0, 3);
                            if (bn2.e) {
                                dd.j.a(t2, String.valueOf(df.gu[2]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0, dd.k);
                                dd.i.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.n.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.h.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            } else {
                                dd.k.a(t2, String.valueOf(df.gu[2]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.k.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            }
                        } else if (bn2.c == 1) {
                            ab.a(t2, 1214, gD + 12, gE + this.fL * (cK + cK / 2) + 30, 0, 3);
                            if (bn2.e) {
                                dd.j.a(t2, String.valueOf(df.gu[3]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0, dd.k);
                                dd.i.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.n.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.h.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            } else {
                                dd.k.a(t2, String.valueOf(df.gu[3]) + " ", gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 45, gE + this.fL * (cK + cK / 2) + 5, 0);
                                dd.k.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                                dd.k.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                            }
                        } else if (bn2.e) {
                            dd.i.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0);
                            dd.n.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                            dd.h.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                        } else {
                            dd.k.a(t2, String.valueOf(bn2.d) + " - " + df.bv + ": " + bn2.b, gD + 22, gE + this.fL * (cK + cK / 2) + 5, 0);
                            dd.k.a(t2, String.valueOf(df.fI[7]) + bn2.f, gD + 22, gE + this.fL * (cK + cK / 2) + 16, 0);
                            dd.k.a(t2, String.valueOf(df.fI[11]) + bn2.g, gD + 22, gE + this.fL * (cK + cK / 2) + 26, 0);
                        }
                    }
                    ++this.fL;
                }
                ++n3;
            }
            aa.a(this.fL, cK + cK / 2, gD, gE, cf - 3, cK * 5 + 4, true, 1);
            cM = this.fL;
            dg.n(t2);
            return;
        }
        if (W == 2) {
            gD = ce + 3;
            gE = cd + 32;
            t2.a(6425);
            t2.c(gD - 1, gE - 1, gJ * cK + 3, 5 * cK + 3);
            by[] byArray = null;
            byArray = bp.ae == null || bp.ae.p == null ? new by[30] : bp.ae.p;
            this.a(t2, byArray);
            return;
        }
        if (W == 3) {
            if (bp.ae == null || bp.ae.a == null || bp.ae.a.equals("") || bp.ae.l.equals("")) {
                cM = 1;
                dd.i.a(t2, df.go, ce + cf / 2, cd + 40, 2);
                return;
            }
            cM = 1;
            gD = ce + 17;
            gE = cd + 34;
            gS = cf - 30;
            aa.a(t2);
            if (this.fN == null) {
                this.fN = dg.a(dd.i, bp.ae.l);
            }
            this.a(t2, dd.i, this.fN, gD, gE, 0);
            if (cL == 1 && V >= 0) {
                ab.a(t2, 942, gD - 8, cd + 34 + 2 + V * 12, 0, ch.b);
            }
            aa.a(cM, 12, ce, cd + 35, cf, cg - 44, true, 1);
            return;
        }
        if (W == 4) {
            this.Q(t2);
        }
    }

    private static void n(t t2) {
        dg.b(t2);
        int n2 = V;
        if (dH) {
            n2 = U;
        }
        if (n2 >= 0 && cM > 0) {
            n2 = n2 + 1 < cM ? n2 + 1 : cM;
            dd.j.a(t2, String.valueOf(n2) + "/" + cM, ce + cf / 2, cd + cg - 12, 2, dd.k);
        }
    }

    private void av() {
        block236: {
            int n2;
            block237: {
                if (!aR || W == -1 || main.a.J != null) {
                    return;
                }
                if (cL == 0) {
                    this.l = null;
                    this.k = null;
                    if (W == 0) {
                        this.k = new bd(df.ad, 110221);
                    }
                    if (main.a.n[8]) {
                        cL = 1;
                        U = 0;
                        V = 0;
                        aa.a();
                        cO.a();
                    }
                    if (main.a.n[4]) {
                        U = 0;
                        V = -1;
                        --W;
                        aa.a();
                        cO.a();
                        if (dg.aV.p != bp.d().p) {
                            if (W < 3) {
                                W = 5;
                            }
                        } else if (W < 0) {
                            W = df.cg.length - 1;
                        }
                        this.ae();
                    }
                    if (main.a.n[6]) {
                        U = 0;
                        V = -1;
                        ++W;
                        aa.a();
                        cO.a();
                        if (dg.aV.p != bp.d().p) {
                            if (W > 5) {
                                W = 3;
                            }
                        } else if (W > df.cg.length - 1) {
                            W = 0;
                        }
                        this.ae();
                    }
                    this.J();
                } else if (aQ) {
                    if (main.a.n[2]) {
                        if (--V < 0) {
                            V = cM - 1;
                        }
                        cO.a(V * dg.cO.h);
                    } else if (main.a.n[8]) {
                        if (++V >= cM) {
                            V = 0;
                        }
                        cO.a(V * dg.cO.h);
                    }
                } else if (W == 0) {
                    if (main.a.n[4]) {
                        if (--U < 0) {
                            U = bp.d().aB.length - 1;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U / gJ * dg.aa.h);
                    } else if (main.a.n[6]) {
                        if (++U >= bp.d().aB.length) {
                            U = 0;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U / gJ * dg.aa.h);
                    } else if (main.a.n[8]) {
                        if (U + gJ <= bp.d().aB.length - 1) {
                            U += gJ;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U / gJ * dg.aa.h);
                    } else if (main.a.n[2]) {
                        if (U >= 0 && U < gJ) {
                            cL = 0;
                            U = 0;
                        } else if (U - gJ >= 0) {
                            U -= gJ;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U / gJ * dg.aa.h);
                    }
                } else if (W == 1) {
                    if (main.a.n[2]) {
                        if (cL == 1 && V == -1) {
                            --cL;
                        } else if (cL == 1 && V >= 0) {
                            --V;
                        }
                        cO.a(V * dg.cO.h);
                    } else if (main.a.n[8]) {
                        if (cL == 0) {
                            ++cL;
                        } else if (cL == 1) {
                            if (++V >= cM) {
                                V = 0;
                            }
                            cO.a(V * dg.cO.h);
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                    } else if (main.a.n[4]) {
                        V = -1;
                        if (cL == 1 && --U < 0) {
                            U = bp.d().av.c.length - 1;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U * dg.aa.h);
                        cO.a();
                        V = 0;
                    } else if (main.a.n[6]) {
                        V = -1;
                        if (cL == 1 && ++U >= bp.d().av.c.length) {
                            U = 0;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U * dg.aa.h);
                        cO.a();
                        V = 0;
                    }
                } else if (W == 2) {
                    if (main.a.n[2]) {
                        --cL;
                    } else if (main.a.n[8]) {
                        if (++cL >= 5) {
                            cL = 1;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                    }
                } else if (W == 3) {
                    if (V < 0) {
                        V = 0;
                    }
                    if (main.a.n[2]) {
                        if (V == 0) {
                            --cL;
                            V = -1;
                        } else {
                            --V;
                        }
                        aa.a(V * dg.aa.h);
                    } else if (main.a.n[8]) {
                        if (++V >= cM) {
                            V = 0;
                        }
                        aa.a(V * dg.aa.h);
                    }
                } else if (W == 4) {
                    n2 = U;
                    if (U == 11 || U == 12 || U == 13 || U == 14) {
                        if (main.a.n[2] || main.a.n[4]) {
                            --U;
                        } else if (main.a.n[6] || main.a.n[8]) {
                            ++U;
                        }
                    } else if (U == 9) {
                        if (main.a.n[2]) {
                            U -= 2;
                        } else if (main.a.n[8]) {
                            U = 15;
                        } else if (main.a.n[4]) {
                            --U;
                        } else if (main.a.n[6]) {
                            ++U;
                        }
                    } else if (U == 10) {
                        if (main.a.n[2]) {
                            U -= 2;
                        } else if (main.a.n[4]) {
                            --U;
                        } else if (main.a.n[6] || main.a.n[8]) {
                            ++U;
                        }
                    } else if (U == 15) {
                        if (main.a.n[2]) {
                            U = 9;
                        } else if (main.a.n[4]) {
                            --U;
                        } else if (main.a.n[8] || main.a.n[6]) {
                            U = 0;
                        }
                    } else if (main.a.n[2]) {
                        if (U <= 1) {
                            U = 0;
                            cL = 0;
                        } else {
                            U -= 2;
                        }
                    } else if (main.a.n[8]) {
                        if ((U += 2) > 15) {
                            U = 0;
                        }
                    } else if (main.a.n[4]) {
                        if (--U < 0) {
                            U = 15;
                        }
                    } else if (main.a.n[6] && ++U > 11) {
                        U = 0;
                    }
                    if (n2 != U) {
                        this.l = null;
                        this.k = null;
                        this.J();
                    }
                } else if (W == 5) {
                    if (main.a.n[2]) {
                        if (U == 4) {
                            U = 0;
                            --cL;
                        } else if (--U < 0) {
                            U = 0;
                            --cL;
                        }
                        this.J();
                    } else if (main.a.n[4]) {
                        U = U >= 2 && U != 4 ? 4 : 0;
                        this.J();
                    } else if (main.a.n[6]) {
                        U = U < 2 ? 4 : 2;
                        this.J();
                    } else if (main.a.n[8]) {
                        if (++U >= 4) {
                            U = 0;
                        }
                        this.J();
                    }
                } else if (W == 6) {
                    if (hT == 0) {
                        if (main.a.n[2]) {
                            if (U == 4) {
                                U = 0;
                                --cL;
                            } else if (--U < 0) {
                                U = 0;
                                --cL;
                            }
                            this.J();
                        } else if (main.a.n[4]) {
                            U = U >= 2 && U != 4 ? 4 : 0;
                            this.J();
                        } else if (main.a.n[6]) {
                            U = U < 2 ? 4 : 2;
                            this.J();
                        } else if (main.a.n[8]) {
                            if (++U >= 4) {
                                U = 0;
                            }
                            this.J();
                        }
                    } else if (hT == 1) {
                        if (main.a.n[2]) {
                            --cL;
                        } else if (main.a.n[8]) {
                            if (++cL >= 5) {
                                cL = 1;
                            }
                            this.l = null;
                            this.k = null;
                            this.J();
                        }
                    } else if (main.a.n[2]) {
                        if (cL == 1 && V == -1) {
                            --cL;
                        } else if (cL == 1 && V >= 0) {
                            --V;
                        }
                        cO.a(V * dg.cO.h);
                    } else if (main.a.n[8]) {
                        if (cL == 0) {
                            ++cL;
                        } else if (cL == 1) {
                            if (++V >= cM) {
                                V = 0;
                            }
                            cO.a(V * dg.cO.h);
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                    } else if (main.a.n[4]) {
                        V = -1;
                        if (cL == 1 && --U < 0) {
                            U = bp.d().av.c.length - 1;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U * dg.aa.h);
                        cO.a();
                        V = 0;
                    } else if (main.a.n[6]) {
                        V = -1;
                        if (cL == 1 && ++U >= bp.d().av.c.length) {
                            U = 0;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        aa.a(U * dg.aa.h);
                        cO.a();
                        V = 0;
                    }
                }
                if (!main.a.g || main.a.F.a || main.a.J != null) break block236;
                if (main.a.r && main.a.b(ce, cd, cf, this.hb) && (!aQ || main.a.A >= 320) && main.a.q) {
                    if (main.a.b(d - 90, cd + 5, 60, 40)) {
                        U = 0;
                        --W;
                    }
                    if (main.a.b(d + 20, cd + 5, 60, 40)) {
                        U = 0;
                        ++W;
                    }
                    aQ = false;
                    aa.a();
                    cO.a();
                    if (dg.aV.p != bp.d().p) {
                        if (W < 3) {
                            W = df.cg.length - 1;
                        }
                        if (W > df.cg.length - 1) {
                            W = 3;
                        }
                    } else {
                        if (W < 0) {
                            W = df.cg.length - 1;
                        }
                        if (W > df.cg.length - 1) {
                            W = 0;
                        }
                    }
                    cL = 1;
                    U = -1;
                    this.ae();
                }
                if (!aQ) break block237;
                cn cn2 = cO.b();
                if (cn2.a || cn2.c) {
                    V = cn2.b;
                    cL = 1;
                }
                if (main.a.i) break block236;
            }
            if (W == 0) {
                Object object = aa.b();
                if (((cn)object).a || ((cn)object).c) {
                    if (U != ((cn)object).b) {
                        U = ((cn)object).b;
                        this.l = null;
                        this.k = null;
                        if (main.a.i) {
                            this.J();
                        } else {
                            object = dg.k(3);
                            if (object != null) {
                                this.cQ();
                            } else {
                                aQ = false;
                                this.k = this.gV;
                            }
                        }
                    }
                    cL = 1;
                }
            } else if (W == 1) {
                cn cn3 = aa.b();
                if (cn3.a || cn3.c) {
                    if (U != cn3.b) {
                        U = cn3.b;
                        if (U >= bp.d().av.c.length) {
                            U = -1;
                        }
                        this.l = null;
                        this.k = null;
                        this.J();
                        cO.a();
                        V = 0;
                    }
                    cL = 1;
                } else {
                    cn3 = cO.b();
                    if ((cn3.a || cn3.c) && V != cn3.b) {
                        V = cn3.b;
                    }
                }
            } else if (W == 2) {
                if (main.a.r && main.a.b(ce + 5, cd + 52, cf - 10, 130) && main.a.q) {
                    n2 = (main.a.t - (cd + 52)) / 32;
                    if (++n2 == this.fO) {
                        aa aa2 = new aa();
                        aa2.addElement(new bd(df.aY, 11064));
                        aa2.addElement(new bd(df.aZ, 11065));
                        main.a.F.a(aa2);
                    }
                    cL = n2;
                    this.fO = n2;
                    this.J();
                }
            } else if (W == 3) {
                cn cn4 = aa.b();
                if (cn4.a || cn4.c) {
                    V = cn4.b;
                    cL = 1;
                }
            } else if (W == 4) {
                if (main.a.r) {
                    cL = 1;
                    if (main.a.b(ce + 4, cd + 35, cK, 130)) {
                        n2 = (main.a.t - (cd + 35)) / cK;
                        U = n2 <<= 1;
                        this.l = null;
                        this.k = null;
                        this.J();
                    }
                    if (main.a.b(ce + cf - 30, cd + 35, cK, 130)) {
                        n2 = (main.a.v - (cd + 35)) / cK;
                        U = n2 = (n2 << 1) + 1;
                        this.l = null;
                        this.k = null;
                        this.J();
                    }
                    if (main.a.b(ce + 4, cd + 165, cf - 8, cK)) {
                        n2 = (main.a.u - (ce + 4)) / cK;
                        U = n2 += 10;
                        this.l = null;
                        this.k = null;
                        this.J();
                    }
                }
            } else if (W == 5) {
                if (main.a.r) {
                    n2 = 0;
                    while (n2 < this.ew.length) {
                        if (n2 == 4) {
                            if (main.a.b(this.ew[n2], this.ex[n2], 84, 75) && main.a.q) {
                                cL = 1;
                                U = 4;
                                this.J();
                                if (!main.a.i && this.l != null) {
                                    this.b(this.l.d, this.l.k);
                                }
                            }
                        } else if (main.a.b(this.ew[n2], this.ex[n2], cK, cK) && main.a.q) {
                            cL = 1;
                            U = n2;
                            this.J();
                            if (!main.a.i) {
                                if (dg.aV.aE[U] != null) {
                                    this.b(this.l.d, this.l.k);
                                } else {
                                    aQ = false;
                                }
                            }
                        }
                        ++n2;
                    }
                }
            } else if (W == 6) {
                if (hT == 0) {
                    if (main.a.r) {
                        n2 = 0;
                        while (n2 < this.ew.length) {
                            if (n2 == 4) {
                                if (main.a.b(this.ew[n2], this.ex[n2], 84, 75) && main.a.q) {
                                    cL = 1;
                                    U = 4;
                                    this.J();
                                    if (!main.a.i && this.l != null) {
                                        this.b(this.l.d, this.l.k);
                                    }
                                }
                            } else if (main.a.b(this.ew[n2], this.ex[n2], cK, cK) && main.a.q) {
                                cL = 1;
                                U = n2;
                                this.J();
                                if (!main.a.i) {
                                    if (dg.aV.aF[U] != null) {
                                        this.b(this.l.d, this.l.k);
                                    } else {
                                        aQ = false;
                                    }
                                }
                            }
                            ++n2;
                        }
                    }
                } else if (hT == 1) {
                    if (main.a.r && main.a.b(ce + 5, cd + 52, cf - 10, 130) && main.a.q) {
                        n2 = (main.a.t - (cd + 52)) / 32;
                        if (++n2 == this.fO) {
                            dg.du();
                        }
                        cL = n2;
                        this.fO = n2;
                        this.J();
                    }
                } else {
                    cn cn5 = aa.b();
                    if (cn5.a || cn5.c) {
                        if (U != cn5.b) {
                            U = cn5.b;
                            if (U >= bp.d().av.c.length) {
                                U = -1;
                            }
                            this.l = null;
                            this.k = null;
                            this.J();
                            cO.a();
                            V = 0;
                        }
                        cL = 1;
                    } else {
                        cn5 = cO.b();
                        if ((cn5.a || cn5.c) && V != cn5.b) {
                            V = cn5.b;
                        }
                    }
                }
            }
        }
        main.a.i();
        main.a.h();
    }

    private static bn aw() {
        return (bn)F.elementAt(V);
    }

    private void ax() {
        if (aQ) {
            return;
        }
        this.l = null;
        this.k = null;
        if (W == 0) {
            if (bp.d().ad == 4) {
                this.k = new bd(df.gt[0], 14004);
            }
            if (bp.d().ad == 3) {
                this.k = new bd(df.gt[1], 14004);
            }
            if (bp.d().ad == 2) {
                this.k = new bd(df.gt[2], 14004);
            }
            if (!bp.d().ac.equals("")) {
                if (cL == 1) {
                    this.l = new bd(df.X, 140101);
                    return;
                }
                this.l = new bd(df.gv[3], 14010);
                return;
            }
        } else if (W == 1) {
            bn bn2;
            if (F.size() > 0 && V >= 0 && V < F.size() && (bn2 = dg.aw()) != null) {
                if (bp.d().ad == 4) {
                    this.k = new bd(df.gt[0], 14005);
                }
                if (bp.d().ad == 3) {
                    this.k = new bd(df.gt[1], 14005);
                }
                if (bp.d().ad != 4 && bp.d().ad != 3) {
                    this.k = new bd(df.gt[4], 14005);
                }
                if (!(bn2.d.equals(bp.d().ab) || cR && this.fL == 0)) {
                    this.l = new bd(df.bo, 14006, bn2.d);
                    return;
                }
            }
        } else if (W == 2 && cL == 1) {
            if (bp.ae == null || bp.ae.p == null) {
                return;
            }
            this.k = new bd(df.bo, 1508);
            if (!main.a.j) {
                this.l = new bd(main.a.g ? df.X : "", 1509);
            }
        }
    }

    private void ay() {
        Object object;
        if (!aO || main.a.J != null) {
            return;
        }
        int n2 = 0;
        if (main.a.n[8]) {
            if (++V >= this.eb.size()) {
                V = 0;
            }
            n2 = 1;
        } else if (main.a.n[2]) {
            if (--V < 0) {
                V = this.eb.size() - 1;
            }
            n2 = 1;
        }
        if (n2 != 0) {
            aa.a(V * dg.aa.h);
            main.a.i();
            main.a.h();
        }
        if (main.a.g) {
            object = aa.b();
            if (((cn)object).a || ((cn)object).c) {
                V = ((cn)object).b;
                n2 = 1;
            }
        }
        if (aU && !main.a.g) {
            object = bg.d().e();
            if (((bq)object).a == 2 && V == 0) {
                aw.a().f = new bd(df.I, 120051, object);
            }
        }
        if (n2 != 0 && V >= 0 && V < this.eb.size()) {
            object = (String)this.eb.elementAt(V);
            n2 = 0;
            this.gC = null;
            this.gB = null;
            this.l = null;
            aw.a().f = null;
            n2 = ((String)object).indexOf("http://");
            if (n2 >= 0) {
                this.gB = ((String)object).substring(n2);
                this.l = new bd(df.S, 12000);
                if (!main.a.g) {
                    aw.a().f = new bd(df.S, null, 12000, null);
                    return;
                }
            } else if (((String)object).indexOf("@") >= 0) {
                object = ((String)object).substring(2);
                object = ((String)object).trim();
                n2 = ((String)object).indexOf("@");
                String string = ((String)object).substring(n2);
                int n3 = 0;
                n3 = string.indexOf(" ");
                n3 = n3 <= 0 ? n2 + string.length() : (n3 += n2);
                this.gC = ((String)object).substring(n2 + 1, n3);
                if (!(this.gC.equals("") || this.gC.equals(bp.d().ab) || this.gC.equals(df.hO.substring(0, 5)) || this.gC.equals(df.hO))) {
                    this.l = new bd(df.bo, 12009, this.gC);
                    if (!main.a.g) {
                        aw.a().f = new bd(df.bo, null, 12009, this.gC);
                        return;
                    }
                } else {
                    this.gC = null;
                    this.l = null;
                }
            }
        }
    }

    private void az() {
        if (!aU) {
            return;
        }
        boolean bl2 = false;
        if (main.a.n[4]) {
            bl2 = true;
            bg.d().b();
        } else if (main.a.n[6]) {
            bl2 = true;
            bg.d().a();
        }
        if (bl2) {
            this.ck();
        }
        if (main.a.g && main.a.g && main.a.b(ce, cd, cf, this.hb) && (!aQ || main.a.A >= 320) && main.a.q && main.a.r) {
            if (main.a.b(d - 90, cd + 5, 60, 40)) {
                bg.d().b();
                this.ck();
            }
            if (main.a.b(d + 20, cd + 5, 60, 40)) {
                bg.d().a();
                this.ck();
            }
        }
    }

    private void aA() {
        if (V >= 0 && M.size() > 0) {
            if (bp.d(this.bm) == V) {
                this.k = new bd(df.bp, 14002);
                return;
            }
            this.k = new bd(df.bo, 14003);
            this.l = new bd("", 14003);
            return;
        }
        this.l = null;
        this.k = null;
    }

    private void aB() {
        if (J.size() > 0 && V >= 0 && cM > 0) {
            this.l = new bd(df.v, 14024);
            this.k = new bd(df.w, 14025);
            return;
        }
        this.l = null;
        this.k = null;
    }

    private void aC() {
        if (J.size() > 0 && V >= 0 && cM > 0) {
            this.l = new bd(df.bo, 14021);
            return;
        }
        this.l = null;
    }

    private void aD() {
        if (L.size() > 0 && V >= 0 && cM > 0) {
            this.l = new bd(df.bo, 11078);
            return;
        }
        this.l = null;
    }

    private void aE() {
        if (I.size() > 0 && V >= 0 && cM > 0 && V < I.size()) {
            I.elementAt(V);
            this.l = new bd(df.bo, 11079);
            return;
        }
        this.l = null;
    }

    private void aF() {
        this.l = null;
        if (V == -1) {
            return;
        }
        if (((db)dg.G.elementAt((int)0)).a == bp.d().p) {
            db db2 = (db)G.elementAt(V);
            if (db2.a != bp.d().p) {
                this.l = new bd(df.bo, 11080, db2.d);
                return;
            }
        } else {
            db db3 = (db)G.elementAt(V);
            if (db3.a != bp.d().p) {
                this.l = new bd(df.bo, 12009, db3.d);
            }
        }
    }

    private static boolean aG() {
        return cU || dG || aQ || aR || db || dc || dH || dr || dd || de || df || dg || dh || di || dj || dk || dl || dm || dn || do || dp || dq || ds || dt || du || dv || dw || aN || dx || dB || dJ || dK || dz || dI || dA || aS || aO || dD || aT || cW || dE || cX || cV || aP || cY || cZ || dC || aU || dP || dL || dR || dM || dQ || dN || dO;
    }

    private boolean aH() {
        if (!main.a.g || bp.bG || dD || aT) {
            return true;
        }
        if (aw.a().b) {
            return true;
        }
        if (this.l == this.cj && main.a.j) {
            return true;
        }
        return main.a.J != null || cb.f != null || main.a.F.a || dg.aG();
    }

    public static boolean A() {
        return aT || db || dG || dc || dr || dd || de || df || dg || dh || di || dj || dk || dl || dm || dn || do || dp || dq || ds || dt || du || dv || dw || dH || aN || dx || dB || dJ || dK || dz || dI || dA || aS || dL || dR || dM || dQ || dN || dO;
    }

    private static boolean aI() {
        return aT || aQ || dG || aR || db || dc || dr || dd || de || df || dg || dh || di || dj || dk || dl || dm || dn || do || dp || dq || ds || dt || du || dv || dw || dH || aN || dx || dB || dJ || dK || dz || dI || dA || aS || dL || dR || dM || dQ || dN || dO;
    }

    private static boolean aJ() {
        return cU || aR && W == 6 && hT != 0 || aR && W > 0 && W < 5 || aT || dD || dE && (W == 0 || W == 1 || W == 3 || W == 4) || dC || cW || cX || aP || cY || cZ || cV || aU || aO || dP;
    }

    private static void a(by object) {
        object = new bd(df.bc, 11055, object);
        main.a.L.a(df.ey, (bd)object, 1);
    }

    private static void b(by object) {
        if (((by)object).f > 1) {
            object = new bd(df.bc, 110562, object);
            main.a.L.a(df.ey, (bd)object, 1);
            return;
        }
        main.a.a(df.eI, new bd(df.ah, 11061, object), new bd(df.au, 1));
    }

    private static void aK() {
        bd bd2 = new bd(df.bc, 11042);
        main.a.L.a(df.ex, bd2, 1);
    }

    private static void aL() {
        bd bd2 = new bd(df.bc, 110361);
        main.a.L.a(df.ex, bd2, 1);
    }

    private static void aM() {
        bd bd2 = new bd(df.bc, 11043);
        main.a.L.a(df.ex, bd2, 1);
    }

    public final void B() {
        block324: {
            dg dg2;
            block342: {
                block343: {
                    block341: {
                        block338: {
                            block339: {
                                block340: {
                                    block336: {
                                        block337: {
                                            block334: {
                                                block335: {
                                                    int n2;
                                                    int n3;
                                                    int n4;
                                                    int n5;
                                                    block332: {
                                                        block333: {
                                                            block330: {
                                                                block331: {
                                                                    block328: {
                                                                        block329: {
                                                                            block327: {
                                                                                block326: {
                                                                                    block325: {
                                                                                        if (main.a.J != null || !dg.A()) {
                                                                                            return;
                                                                                        }
                                                                                        if (cL == 0) {
                                                                                            dg2 = this;
                                                                                            dg2.l = null;
                                                                                            this.k = null;
                                                                                            if (!dG) {
                                                                                                block323: {
                                                                                                    if (dA) {
                                                                                                        if (ck.equals("")) {
                                                                                                            if (W == 0) {
                                                                                                                dg2.k = new bd(df.A, 11115);
                                                                                                            } else if (W == 1) {
                                                                                                                dg2.k = new bd(df.A, 11116);
                                                                                                            }
                                                                                                        } else {
                                                                                                            dg2.k = null;
                                                                                                        }
                                                                                                    } else if (W == 1 && aS && dg2.bh == 0) {
                                                                                                        dg2.k = dg2.fY;
                                                                                                    } else if (!(W != 1 || db || dc || dz || dI || dw || dx || dB || dJ || dK || aS || dH || aN || dL || dR || dM || dQ || dN || dO)) {
                                                                                                        dg2.k = new bd(df.ad, 110221);
                                                                                                    }
                                                                                                    if (dI && W == 0) {
                                                                                                        int n6 = 0;
                                                                                                        n5 = 0;
                                                                                                        n4 = 0;
                                                                                                        n3 = 0;
                                                                                                        n2 = 0;
                                                                                                        while (n2 < az.length) {
                                                                                                            by by2 = az[n2];
                                                                                                            if (by2 != null) {
                                                                                                                if (by2.b.a == 455) {
                                                                                                                    ++n6;
                                                                                                                } else if (by2.b.a == 456) {
                                                                                                                    ++n5;
                                                                                                                } else if (by2.b.b == 26) {
                                                                                                                    ++n4;
                                                                                                                    n3 = by2.b.a;
                                                                                                                }
                                                                                                            }
                                                                                                            ++n2;
                                                                                                        }
                                                                                                        if (n6 >= 9 || n5 >= 9 || n3 >= 10 && n6 >= 3 && n4 == 1 || n3 >= 11 && n5 >= 3 && n4 == 1) {
                                                                                                            dg2.k = new bd(df.bV, 1600);
                                                                                                        }
                                                                                                    } else if (dJ) {
                                                                                                        try {
                                                                                                            if (W == 0) {
                                                                                                                if (cL == 1) {
                                                                                                                    if (aJ != null) {
                                                                                                                        dg2.k = new bd(df.bo, 11103);
                                                                                                                    } else {
                                                                                                                        aQ = false;
                                                                                                                    }
                                                                                                                    if (main.a.j) {
                                                                                                                        dg2.a(3, aJ);
                                                                                                                    } else {
                                                                                                                        dg2.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                                                                                                                    }
                                                                                                                } else if (cL == 2) {
                                                                                                                    by by3 = aB[U];
                                                                                                                    if (by3 != null) {
                                                                                                                        if (main.a.j) {
                                                                                                                            dg2.a(3, by3);
                                                                                                                        } else {
                                                                                                                            dg2.l = new bd(main.a.g ? df.X : "", 11104, by3);
                                                                                                                        }
                                                                                                                        dg2.k = new bd(df.aj, 1605);
                                                                                                                    } else {
                                                                                                                        aQ = false;
                                                                                                                    }
                                                                                                                    if (aJ != null) {
                                                                                                                        dg2.k = new bd(df.bo, 1604);
                                                                                                                    }
                                                                                                                }
                                                                                                                break block323;
                                                                                                            }
                                                                                                            if (W != 1) break block323;
                                                                                                            if (bp.d().aB[U] == null) {
                                                                                                                dg2.k = null;
                                                                                                                aQ = false;
                                                                                                                break block323;
                                                                                                            }
                                                                                                            dg2.k = new bd(df.bo, 11106);
                                                                                                        }
                                                                                                        catch (Exception exception) {}
                                                                                                    } else if (dK) {
                                                                                                        if (W == 0) {
                                                                                                            if (cL == 1) {
                                                                                                                if (aJ != null && dg.aJ.j > 13) {
                                                                                                                    dg2.k = new bd(df.bo, 11103);
                                                                                                                } else if (aJ != null) {
                                                                                                                    dg2.k = dg2.fX;
                                                                                                                } else {
                                                                                                                    aQ = false;
                                                                                                                }
                                                                                                                if (main.a.j) {
                                                                                                                    dg2.a(3, aJ);
                                                                                                                } else {
                                                                                                                    dg2.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                                                                                                                }
                                                                                                            } else if (cL == 2) {
                                                                                                                by by4 = aB[U];
                                                                                                                if (by4 != null) {
                                                                                                                    if (main.a.j) {
                                                                                                                        dg2.a(3, by4);
                                                                                                                    } else {
                                                                                                                        dg2.l = new bd(main.a.g ? df.X : "", 11104, by4);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    aQ = false;
                                                                                                                }
                                                                                                                if (aJ != null && dg.aJ.j > 13) {
                                                                                                                    dg2.k = new bd(df.bo, 1604);
                                                                                                                }
                                                                                                            }
                                                                                                        } else if (W == 1) {
                                                                                                            if (bp.d().aB[U] == null) {
                                                                                                                dg2.k = null;
                                                                                                                aQ = false;
                                                                                                            } else {
                                                                                                                dg2.k = new bd(df.bo, 1606);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (dz && W == 0) {
                                                                                                    int n7 = 0;
                                                                                                    n5 = 0;
                                                                                                    while (n5 < az.length) {
                                                                                                        if (az[n5] != null && ++n7 >= 2) {
                                                                                                            dg2.k = new bd(df.bV, 11062);
                                                                                                            break;
                                                                                                        }
                                                                                                        ++n5;
                                                                                                    }
                                                                                                }
                                                                                                if (dw && W == 0 && aI != null) {
                                                                                                    int n8 = 0;
                                                                                                    while (n8 < aA.length) {
                                                                                                        if (aA[n8] != null) {
                                                                                                            dg2.l = new bd("", 110981);
                                                                                                            dg2.k = new bd(df.bV, 110981);
                                                                                                            break;
                                                                                                        }
                                                                                                        ++n8;
                                                                                                    }
                                                                                                }
                                                                                                if (dM && W == 0 && aI != null && aJ != null) {
                                                                                                    int n9 = 0;
                                                                                                    while (n9 < aA.length) {
                                                                                                        if (aA[n9] != null) {
                                                                                                            dg2.l = new bd("", 341);
                                                                                                            dg2.k = new bd(df.bV, 341);
                                                                                                            break;
                                                                                                        }
                                                                                                        ++n9;
                                                                                                    }
                                                                                                }
                                                                                                if (aN && W == 0 && aK != null && dg2.ed != null && !dg2.ed.d().equals("") && bp.d().ar >= 5000) {
                                                                                                    dg2.k = new bd(df.ao, 15002);
                                                                                                }
                                                                                                if (dx && W == 0 && cL == 0) {
                                                                                                    int n10 = 0;
                                                                                                    while (n10 < aE.length) {
                                                                                                        if (aE[n10] == null) {
                                                                                                            dg2.k = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (n10 == aE.length - 1) {
                                                                                                            dg2.k = new bd(df.bV, 140131);
                                                                                                        }
                                                                                                        ++n10;
                                                                                                    }
                                                                                                }
                                                                                                if (dB && W == 0 && aJ != null && dg.aJ.j > 0) {
                                                                                                    dg2.k = new bd(df.bV, 11105);
                                                                                                }
                                                                                                if (aS && W == 0) {
                                                                                                    if (dg2.bh == 0) {
                                                                                                        dg2.k = dg2.fQ;
                                                                                                    } else if (dg2.bh == 1 && dg2.bi >= 1 && (long)dg2.bl - System.currentTimeMillis() / 1000L <= 0L) {
                                                                                                        dg2.k = dg2.fR;
                                                                                                    }
                                                                                                }
                                                                                                if (main.a.n[8]) {
                                                                                                    cL = 1;
                                                                                                    U = 0;
                                                                                                    V = -1;
                                                                                                    aa.a();
                                                                                                    cO.a();
                                                                                                    dg2.C();
                                                                                                }
                                                                                                if (main.a.n[4]) {
                                                                                                    U = 0;
                                                                                                    V = -1;
                                                                                                    --W;
                                                                                                    aa.a();
                                                                                                    cO.a();
                                                                                                    if (dH) {
                                                                                                        if (W < 0) {
                                                                                                            W = df.hN.length - 1;
                                                                                                        }
                                                                                                        dq.a().a((byte)0, 28, 0, W);
                                                                                                        aF = null;
                                                                                                        U = -1;
                                                                                                    } else if (dc || aT) {
                                                                                                        W = 0;
                                                                                                    } else if (W < 0) {
                                                                                                        W = db ? df.cB.length - 1 : 1;
                                                                                                    }
                                                                                                    dg2.l = null;
                                                                                                    dg2.k = null;
                                                                                                    if (db) {
                                                                                                        dg.aO();
                                                                                                    }
                                                                                                    if (dc && av == null && W == 0) {
                                                                                                        dq.a().i(35);
                                                                                                    }
                                                                                                }
                                                                                                if (main.a.n[6]) {
                                                                                                    U = 0;
                                                                                                    V = -1;
                                                                                                    ++W;
                                                                                                    aa.a();
                                                                                                    cO.a();
                                                                                                    if (dH) {
                                                                                                        if (W > df.hN.length - 1) {
                                                                                                            W = 0;
                                                                                                        }
                                                                                                        dq.a().a((byte)0, 28, 0, W);
                                                                                                        aF = null;
                                                                                                        U = -1;
                                                                                                    } else if (dc || aT) {
                                                                                                        W = 0;
                                                                                                    } else if (db) {
                                                                                                        if (W > df.cB.length - 1) {
                                                                                                            W = 0;
                                                                                                        }
                                                                                                    } else if (W > 1) {
                                                                                                        W = 0;
                                                                                                    }
                                                                                                    dg2.l = null;
                                                                                                    dg2.k = null;
                                                                                                    if (db) {
                                                                                                        dg.aO();
                                                                                                    }
                                                                                                    if (dc && av == null && W == 0) {
                                                                                                        dq.a().i(35);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (cL >= 1) {
                                                                                            if (aQ) {
                                                                                                if (main.a.n[2]) {
                                                                                                    if (--V < 0) {
                                                                                                        V = cM - 1;
                                                                                                    }
                                                                                                    cO.a(V * dg.cO.h);
                                                                                                } else if (main.a.n[8]) {
                                                                                                    if (++V >= cM) {
                                                                                                        V = 0;
                                                                                                    }
                                                                                                    cO.a(V * dg.cO.h);
                                                                                                }
                                                                                            } else {
                                                                                                int n11;
                                                                                                if (aT) {
                                                                                                    if (main.a.n[2]) {
                                                                                                        if (--V < 0) {
                                                                                                            V = cM;
                                                                                                        }
                                                                                                        aa.a(V * dg.aa.h);
                                                                                                    } else if (main.a.n[4]) {
                                                                                                        if (V == 0) {
                                                                                                            if ((bp.bs -= 10) < 10) {
                                                                                                                bp.bs = 10;
                                                                                                            }
                                                                                                        } else if (V == 1) {
                                                                                                            if ((bp.bt -= 10) < 10) {
                                                                                                                bp.bt = 10;
                                                                                                            }
                                                                                                        } else if (V == 2 && (bp.bu -= 10) <= 0) {
                                                                                                            bp.bu = 1;
                                                                                                        }
                                                                                                    } else if (main.a.n[6]) {
                                                                                                        if (V == 0) {
                                                                                                            if ((bp.bs += 10) > 90) {
                                                                                                                bp.bs = 90;
                                                                                                            }
                                                                                                        } else if (V == 1) {
                                                                                                            if ((bp.bt += 10) > 90) {
                                                                                                                bp.bt = 90;
                                                                                                            }
                                                                                                        } else if (V == 2) {
                                                                                                            if (bp.bu == 1) {
                                                                                                                bp.bu = 10;
                                                                                                            } else if ((bp.bu += 10) > 70) {
                                                                                                                bp.bu = 70;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if (main.a.n[8]) {
                                                                                                        if (++V > cM) {
                                                                                                            V = 0;
                                                                                                        }
                                                                                                        aa.a(V * dg.aa.h);
                                                                                                    }
                                                                                                    if (!main.a.g) {
                                                                                                        main.a.i();
                                                                                                        main.a.h();
                                                                                                    }
                                                                                                } else if (aS && W == 0) {
                                                                                                    n11 = 0;
                                                                                                    if (cL == 1) {
                                                                                                        if (main.a.n[4]) {
                                                                                                            if (--U < 0) {
                                                                                                                U = 11;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        } else if (main.a.n[6]) {
                                                                                                            if (U == 2) {
                                                                                                                cL = 2;
                                                                                                                U = 0;
                                                                                                            } else if (U == 5) {
                                                                                                                cL = 2;
                                                                                                                U = 3;
                                                                                                            } else if (U == 8) {
                                                                                                                cL = 2;
                                                                                                                U = 6;
                                                                                                            } else if (U == 11) {
                                                                                                                cL = 2;
                                                                                                                U = 9;
                                                                                                            } else if (U == 14) {
                                                                                                                cL = 2;
                                                                                                                U = 12;
                                                                                                            } else if (++U >= 12) {
                                                                                                                U = 0;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        } else if (main.a.n[8]) {
                                                                                                            if (U + 3 <= 11) {
                                                                                                                U += 3;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        } else if (main.a.n[2]) {
                                                                                                            if (U >= 0 && U < 3) {
                                                                                                                cL = 0;
                                                                                                                U = 0;
                                                                                                            } else if (U - 3 >= 0) {
                                                                                                                U -= 3;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        }
                                                                                                    } else if (cL == 2) {
                                                                                                        if (main.a.n[4]) {
                                                                                                            if (U == 0) {
                                                                                                                cL = 1;
                                                                                                                U = 2;
                                                                                                            } else if (U == 3) {
                                                                                                                cL = 1;
                                                                                                                U = 5;
                                                                                                            } else if (U == 6) {
                                                                                                                cL = 1;
                                                                                                                U = 8;
                                                                                                            } else if (U == 9) {
                                                                                                                cL = 1;
                                                                                                                U = 11;
                                                                                                            } else if (U == 12) {
                                                                                                                cL = 1;
                                                                                                                U = 14;
                                                                                                            } else if (--U < 0) {
                                                                                                                U = 11;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        } else if (main.a.n[6]) {
                                                                                                            if (++U >= 12) {
                                                                                                                U = 0;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        } else if (main.a.n[8]) {
                                                                                                            if (U + 3 <= 11) {
                                                                                                                U += 3;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        } else if (main.a.n[2]) {
                                                                                                            if (U >= 0 && U < 3) {
                                                                                                                cL = 0;
                                                                                                                U = 0;
                                                                                                            } else if (U - 3 >= 0) {
                                                                                                                U -= 3;
                                                                                                            }
                                                                                                            this.l = null;
                                                                                                            this.k = null;
                                                                                                            this.C();
                                                                                                        }
                                                                                                    }
                                                                                                    if (!main.a.g) {
                                                                                                        main.a.i();
                                                                                                        main.a.h();
                                                                                                    }
                                                                                                } else if (dG) {
                                                                                                    if (main.a.n[4]) {
                                                                                                        if (--U < 0) {
                                                                                                            U = 8;
                                                                                                        }
                                                                                                    } else if (main.a.n[6]) {
                                                                                                        if (++U > 8) {
                                                                                                            U = 0;
                                                                                                        }
                                                                                                    } else if (main.a.n[8]) {
                                                                                                        if (U + 3 < 9) {
                                                                                                            U += 3;
                                                                                                        }
                                                                                                    } else if (main.a.n[2] && U - 3 >= 0) {
                                                                                                        U -= 3;
                                                                                                    }
                                                                                                    if (!main.a.g) {
                                                                                                        main.a.i();
                                                                                                        main.a.h();
                                                                                                    }
                                                                                                } else if (aN && W == 0) {
                                                                                                    if (main.a.n[2]) {
                                                                                                        if (--cL < 0) {
                                                                                                            cL = 0;
                                                                                                        }
                                                                                                    } else if (main.a.n[8] && ++cL > 2) {
                                                                                                        cL = 2;
                                                                                                    }
                                                                                                    this.C();
                                                                                                } else if (dH) {
                                                                                                    if (main.a.n[4]) {
                                                                                                        if (aF != null) {
                                                                                                            if ((U -= 5) < 0) {
                                                                                                                U = aF.length - 1;
                                                                                                            }
                                                                                                            aa.a(U * dg.aa.h);
                                                                                                            this.C();
                                                                                                        }
                                                                                                    } else if (main.a.n[6]) {
                                                                                                        if (aF != null) {
                                                                                                            if ((U += 5) >= aF.length) {
                                                                                                                U = 0;
                                                                                                            }
                                                                                                            aa.a(U * dg.aa.h);
                                                                                                            this.C();
                                                                                                        }
                                                                                                    } else if (main.a.n[8]) {
                                                                                                        if (aF != null) {
                                                                                                            if (++U >= aF.length) {
                                                                                                                U = 0;
                                                                                                            }
                                                                                                            aa.a(U * dg.aa.h);
                                                                                                            this.C();
                                                                                                        }
                                                                                                    } else if (main.a.n[2] && aF != null) {
                                                                                                        if (--U < 0) {
                                                                                                            cL = 0;
                                                                                                        }
                                                                                                        aa.a(U * dg.aa.h);
                                                                                                        this.C();
                                                                                                    }
                                                                                                    main.a.i();
                                                                                                    main.a.h();
                                                                                                } else if ((dQ || dM || dw || dx) && cL == 1 && W == 0) {
                                                                                                    if (main.a.n[4]) {
                                                                                                        if (--U < 0) {
                                                                                                            U = 1;
                                                                                                        }
                                                                                                        this.l = null;
                                                                                                        this.k = null;
                                                                                                        this.C();
                                                                                                    } else if (main.a.n[6]) {
                                                                                                        if (++U > 1) {
                                                                                                            U = 0;
                                                                                                        }
                                                                                                        this.l = null;
                                                                                                        this.k = null;
                                                                                                        this.C();
                                                                                                    } else if (main.a.n[8]) {
                                                                                                        cL = 2;
                                                                                                        U = 0;
                                                                                                        this.l = null;
                                                                                                        this.k = null;
                                                                                                        this.C();
                                                                                                    } else if (main.a.n[2]) {
                                                                                                        cL = 0;
                                                                                                        U = 0;
                                                                                                        this.l = null;
                                                                                                        this.k = null;
                                                                                                        this.C();
                                                                                                    }
                                                                                                    if (!main.a.g) {
                                                                                                        main.a.i();
                                                                                                        main.a.h();
                                                                                                    }
                                                                                                } else if ((dB || dJ || dK || dL || dR) && cL == 1 && W == 0) {
                                                                                                    if (main.a.n[8]) {
                                                                                                        cL = 2;
                                                                                                        U = 0;
                                                                                                        this.l = null;
                                                                                                        this.k = null;
                                                                                                        this.C();
                                                                                                    } else if (main.a.n[2]) {
                                                                                                        cL = 0;
                                                                                                        U = 0;
                                                                                                        this.l = null;
                                                                                                        this.k = null;
                                                                                                        this.C();
                                                                                                    }
                                                                                                    main.a.i();
                                                                                                    main.a.h();
                                                                                                } else if ((dN || dO) && W == 0) {
                                                                                                    if (main.a.n[2]) {
                                                                                                        if (--cL < 0) {
                                                                                                            cL = 0;
                                                                                                        }
                                                                                                    } else if (main.a.n[8] && ++cL > 1) {
                                                                                                        cL = 1;
                                                                                                    }
                                                                                                    this.C();
                                                                                                }
                                                                                                n11 = dg.aN();
                                                                                                if (main.a.n[4]) {
                                                                                                    if (--U < 0) {
                                                                                                        U = n11 - 1;
                                                                                                    }
                                                                                                    this.l = null;
                                                                                                    this.k = null;
                                                                                                    this.C();
                                                                                                    aa.a(U / gJ * dg.aa.h);
                                                                                                } else if (main.a.n[6]) {
                                                                                                    if (++U >= n11) {
                                                                                                        U = 0;
                                                                                                    }
                                                                                                    this.l = null;
                                                                                                    this.k = null;
                                                                                                    this.C();
                                                                                                    aa.a(U / gJ * dg.aa.h);
                                                                                                } else if (main.a.n[8]) {
                                                                                                    if (U + gJ <= n11 - 1) {
                                                                                                        U += gJ;
                                                                                                    }
                                                                                                    this.l = null;
                                                                                                    this.k = null;
                                                                                                    this.C();
                                                                                                    aa.a(U / gJ * dg.aa.h);
                                                                                                } else if (main.a.n[2]) {
                                                                                                    if (U >= 0 && U < gJ) {
                                                                                                        cL = 0;
                                                                                                        U = 0;
                                                                                                        if ((dM || dw || dB || dJ || dK || dx || dL || dR) && W == 0) {
                                                                                                            cL = 1;
                                                                                                        }
                                                                                                    } else if (U - gJ >= 0) {
                                                                                                        U -= gJ;
                                                                                                    }
                                                                                                    this.l = null;
                                                                                                    this.k = null;
                                                                                                    this.C();
                                                                                                    aa.a(U / gJ * dg.aa.h);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!main.a.g) break block324;
                                                                                        dg2 = this;
                                                                                        if (main.a.F.a || main.a.J != null) break block324;
                                                                                        if (main.a.r && main.a.b(ce, cd, cf, dg2.hb) && (!aQ || main.a.A >= 320) && main.a.q) {
                                                                                            if (main.a.b(d - 80, cd + 5, 60, 40)) {
                                                                                                U = 0;
                                                                                                --W;
                                                                                                dg2.C();
                                                                                            }
                                                                                            if (main.a.b(d + 10, cd + 5, 60, 40)) {
                                                                                                U = 0;
                                                                                                ++W;
                                                                                                dg2.C();
                                                                                            }
                                                                                            cL = 0;
                                                                                            if (!dg.A()) {
                                                                                                if (W < 0) {
                                                                                                    W = df.cg.length - 1;
                                                                                                }
                                                                                                if (W > df.cg.length - 1) {
                                                                                                    W = 0;
                                                                                                }
                                                                                            } else {
                                                                                                if (db) {
                                                                                                    if (W < 0) {
                                                                                                        W = df.cB.length - 1;
                                                                                                    } else if (W > df.cB.length - 1) {
                                                                                                        W = 0;
                                                                                                    }
                                                                                                    dg.aO();
                                                                                                } else if (dH) {
                                                                                                    if (W < 0) {
                                                                                                        W = df.hN.length - 1;
                                                                                                    } else if (W > df.hN.length - 1) {
                                                                                                        W = 0;
                                                                                                    }
                                                                                                    dq.a().a((byte)0, 28, 0, W);
                                                                                                    U = -1;
                                                                                                } else if (dc || aT) {
                                                                                                    W = 0;
                                                                                                } else if (W < 0) {
                                                                                                    W = 1;
                                                                                                } else if (W > 1) {
                                                                                                    W = 0;
                                                                                                }
                                                                                                if (dc) {
                                                                                                    W = 0;
                                                                                                }
                                                                                            }
                                                                                            aQ = false;
                                                                                            aa.a();
                                                                                        }
                                                                                        if (!aQ) break block325;
                                                                                        cn cn2 = cO.b();
                                                                                        if (cn2.a || cn2.c) {
                                                                                            V = cn2.b;
                                                                                            cL = 1;
                                                                                        }
                                                                                        if (!main.a.j) break block324;
                                                                                    }
                                                                                    if (!aT) break block326;
                                                                                    cn cn3 = aa.b();
                                                                                    if ((cn3.c || cn3.a) && U != cn3.b) {
                                                                                        cL = 1;
                                                                                        V = cn3.b;
                                                                                        dg2.C();
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 5, 16, 16, aa) && main.a.q) {
                                                                                        boolean bl2 = bp.bi = !bp.bi;
                                                                                        if (bI == 1) {
                                                                                            bp.bi = false;
                                                                                            ae.a(df.if, 20, dd.j);
                                                                                        }
                                                                                        main.a.p = false;
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 35, 16, 16, aa) && main.a.q) {
                                                                                        boolean bl3 = bp.bj = !bp.bj;
                                                                                        if (bI == 1) {
                                                                                            bp.bj = false;
                                                                                            ae.a(df.if, 20, dd.j);
                                                                                        }
                                                                                        main.a.p = false;
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 65, 16, 16, aa) && main.a.q) {
                                                                                        boolean bl4 = bp.bk = !bp.bk;
                                                                                        if (bI == 1) {
                                                                                            bp.bk = false;
                                                                                            ae.a(df.if, 20, dd.j);
                                                                                        }
                                                                                        main.a.p = false;
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 95, 16, 16, aa) && main.a.q) {
                                                                                        bp.bl = !bp.bl;
                                                                                        main.a.p = false;
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 125, 16, 16, aa) && main.a.q) {
                                                                                        bp.bm = !bp.bm;
                                                                                        main.a.p = false;
                                                                                        if (bp.bm) {
                                                                                            bp.bp = false;
                                                                                            bp.bo = false;
                                                                                            bp.bn = false;
                                                                                        }
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 155, 16, 16, aa) && main.a.q) {
                                                                                        bp.bn = !bp.bn;
                                                                                        main.a.p = false;
                                                                                        if (bp.bn) {
                                                                                            bp.bp = false;
                                                                                            bp.bo = false;
                                                                                            bp.bm = false;
                                                                                        }
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 185, 16, 16, aa) && main.a.q) {
                                                                                        bp.bo = !bp.bo;
                                                                                        main.a.p = false;
                                                                                        if (bp.bo) {
                                                                                            bp.bp = false;
                                                                                            bp.bn = false;
                                                                                            bp.bm = false;
                                                                                        }
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 16, dg.aa.d + 215, 16, 16, aa) && main.a.q) {
                                                                                        bp.bp = !bp.bp;
                                                                                        main.a.p = false;
                                                                                        if (bp.bp) {
                                                                                            bp.bo = false;
                                                                                            bp.bn = false;
                                                                                            bp.bm = false;
                                                                                        }
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 131, dg.aa.d + 2, 30, 20, aa) && main.a.q && bp.bi) {
                                                                                        main.a.L.a(df.id, new bd(df.ax, 1511), 1);
                                                                                        main.a.p = false;
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 131, dg.aa.d + 32, 30, 20, aa) && main.a.q && bp.bj) {
                                                                                        main.a.L.a(df.id, new bd(df.ax, 1512), 1);
                                                                                        main.a.p = false;
                                                                                    }
                                                                                    if (main.a.a(dg.aa.c + 131, dg.aa.d + 62, 30, 20, aa) && main.a.q && bp.bk) {
                                                                                        aa aa2 = new aa();
                                                                                        aa2.addElement(new bd(df.ie[0], 15130));
                                                                                        aa2.addElement(new bd(df.ie[1], 15131));
                                                                                        aa2.addElement(new bd(df.ie[2], 15132));
                                                                                        aa2.addElement(new bd(df.ie[3], 15133));
                                                                                        aa2.addElement(new bd(df.ie[4], 15134));
                                                                                        aa2.addElement(new bd(df.ie[5], 15135));
                                                                                        aa2.addElement(new bd(df.ie[6], 15136));
                                                                                        aa2.addElement(new bd(df.ie[7], 15137));
                                                                                        main.a.F.a(aa2);
                                                                                        main.a.F.c = true;
                                                                                    }
                                                                                    break block324;
                                                                                }
                                                                                if (!dc && !db && !dA && !du && !dv && !ds && !dt && !dd && !de && !df && !dg && !dh && !di && !dj && !dk && !dl && !dm && !dr && !dn && !do && !dp && !dq) break block327;
                                                                                cn cn4 = aa.b();
                                                                                if ((cn4.c || cn4.a) && U != cn4.b) {
                                                                                    cL = 1;
                                                                                    U = cn4.b;
                                                                                    dg2.l = null;
                                                                                    dg2.k = null;
                                                                                    aQ = false;
                                                                                    dg2.C();
                                                                                }
                                                                                break block324;
                                                                            }
                                                                            if (!aS) break block328;
                                                                            if (W != 0) break block329;
                                                                            dg2.a(ce + 4, cd + dg2.hb + 15, 3, 4, 1);
                                                                            dg2.a(ce + cf - 3 - 3 * cK, cd + dg2.hb + 15, 3, 4, 2);
                                                                            break block324;
                                                                        }
                                                                        if (W != 1) break block324;
                                                                        cn cn5 = aa.b();
                                                                        if (!cn5.c && !cn5.a || U == cn5.b) break block324;
                                                                        cL = 1;
                                                                        U = cn5.b;
                                                                        dg2.C();
                                                                        break block324;
                                                                    }
                                                                    if (!dz && !dI) break block330;
                                                                    if (W != 0) break block331;
                                                                    dg2.a(ce + 4, cd + dg2.hb + 3, 6, 4, 1);
                                                                    break block324;
                                                                }
                                                                if (W != 1) break block324;
                                                                cn cn6 = aa.b();
                                                                if (!cn6.c && !cn6.a || U == cn6.b) break block324;
                                                                cL = 1;
                                                                U = cn6.b;
                                                                dg2.C();
                                                                break block324;
                                                            }
                                                            if (!dB && !dJ && !dK && !dL) break block332;
                                                            if (W != 0) break block333;
                                                            if (main.a.b(ce + 74, gE - cK - 3, cK, cK)) {
                                                                cL = 1;
                                                                U = 0;
                                                                dg2.C();
                                                            }
                                                            dg2.a(ce + 4, cd + 2 * dg2.hb + 5, 6, 4, 2);
                                                            break block324;
                                                        }
                                                        if (W != 1) break block324;
                                                        cn cn7 = aa.b();
                                                        if (!cn7.c && !cn7.a || U == cn7.b) break block324;
                                                        cL = 1;
                                                        U = cn7.b;
                                                        dg2.C();
                                                        break block324;
                                                    }
                                                    if (!dw && !dx && !dM) break block334;
                                                    if (W != 0) break block335;
                                                    dg dg3 = dg2;
                                                    n5 = ce + 45;
                                                    n4 = cd + 32;
                                                    n3 = ce + 100;
                                                    if (!main.a.r) break block324;
                                                    if (main.a.b(n5, n4, 29, 29)) {
                                                        cL = 1;
                                                        U = 0;
                                                        dg3.C();
                                                    }
                                                    if (main.a.b(n3, n4, 29, 29)) {
                                                        cL = 1;
                                                        U = 1;
                                                        dg3.C();
                                                        if (dz && W == 0) {
                                                            n2 = 0;
                                                            while (n2 < az.length) {
                                                                if (az[n2] != null) {
                                                                    dg3.l = new bd(df.bc, 11062);
                                                                    break;
                                                                }
                                                                ++n2;
                                                            }
                                                        }
                                                    }
                                                    if (!main.a.b(ce, cd + 2 * dg3.hb + 5, cf, cg - dg3.hb * 3)) break block324;
                                                    dg3.a(ce, cd + 2 * dg3.hb + 5, 6, 3, 2);
                                                    break block324;
                                                }
                                                if (W != 1) break block324;
                                                cn cn8 = aa.b();
                                                if (!cn8.c && !cn8.a || U == cn8.b) break block324;
                                                cL = 1;
                                                U = cn8.b;
                                                dg2.C();
                                                break block324;
                                            }
                                            if (!dQ) break block336;
                                            if (W != 0) break block337;
                                            cn cn9 = aa.b();
                                            if ((cn9.c || cn9.a) && U != cn9.b) {
                                                cL = 1;
                                                U = cn9.b;
                                                dg2.l = null;
                                                dg2.k = null;
                                                aQ = false;
                                                dg2.C();
                                            }
                                            break block324;
                                        }
                                        if (W != 1) break block324;
                                        cn cn10 = aa.b();
                                        if (!cn10.c && !cn10.a || U == cn10.b) break block324;
                                        cL = 1;
                                        U = cn10.b;
                                        dg2.C();
                                        break block324;
                                    }
                                    if (!aN) break block338;
                                    if (W != 0) break block339;
                                    if (!main.a.b(ce + 75, cd + 69, cK, cK)) break block340;
                                    if (main.a.q && main.a.r) {
                                        cL = 1;
                                        dg2.C();
                                    }
                                    break block324;
                                }
                                if (!main.a.b(dg2.ed.a, dg2.ed.b, dg2.ed.c, dg2.ed.d) || !main.a.q || !main.a.r) break block324;
                                cL = 2;
                                dg2.ed.a();
                                dg2.C();
                                break block324;
                            }
                            if (W != 1) break block324;
                            cn cn11 = aa.b();
                            if (!cn11.c && !cn11.a || U == cn11.b) break block324;
                            cL = 1;
                            U = cn11.b;
                            dg2.C();
                            break block324;
                        }
                        if (!dG) break block341;
                        if (main.a.b(gD, gE, 120, 120) && main.a.r && main.a.q) {
                            int n12;
                            U = n12 = (main.a.u - gD) / 40 + (main.a.v - gE) / 40 * 3;
                            cL = 1;
                            dg2.C();
                            dg2.aY();
                        }
                        break block324;
                    }
                    if (!dN && !dO) break block342;
                    if (W != 0) break block343;
                    if (main.a.b(ce + 75, cd + 69, cK, cK) && main.a.q && main.a.r) {
                        cL = 1;
                        dg2.C();
                    }
                    break block324;
                }
                if (W != 1) break block324;
                cn cn12 = aa.b();
                if (!cn12.c && !cn12.a || U == cn12.b) break block324;
                cL = 1;
                U = cn12.b;
                dg2.C();
                break block324;
            }
            if (dR) {
                if (W == 1) {
                    cn cn13 = aa.b();
                    if ((cn13.c || cn13.a) && U != cn13.b) {
                        cL = 1;
                        U = cn13.b;
                        dg2.C();
                    }
                }
                if (W == 0) {
                    int n13 = 0;
                    while (n13 < dg2.hP.length) {
                        if (main.a.b(dg2.hP[n13], dg2.hQ[n13], cK, cK) && main.a.q && main.a.r) {
                            dg2.hR = n13;
                        }
                        ++n13;
                    }
                }
            }
        }
        main.a.i();
        main.a.h();
    }

    private static int aN() {
        int n2 = 0;
        try {
            if (dc) {
                n2 = av.length % gJ == 0 ? av.length : (av.length / gJ + 1) * gJ;
            } else if (db) {
                if (W == 0) {
                    n2 = au.length % gJ == 0 ? au.length : (au.length / gJ + 1) * gJ;
                } else if (W == 1) {
                    n2 = ax.length % gJ == 0 ? ax.length : (ax.length / gJ + 1) * gJ;
                } else if (W == 2) {
                    n2 = ay.length % gJ == 0 ? ay.length : (ay.length / gJ + 1) * gJ;
                } else if (W == 52) {
                    n2 = ay.length % gJ == 0 ? ay.length : (ay.length / gJ + 1) * gJ;
                }
            } else if (dd) {
                n2 = ab.length % gJ == 0 ? ab.length : (ab.length / gJ + 1) * gJ;
            } else if (de) {
                n2 = ac.length % gJ == 0 ? ac.length : (ac.length / gJ + 1) * gJ;
            } else if (df) {
                n2 = ad.length % gJ == 0 ? ad.length : (ad.length / gJ + 1) * gJ;
            } else if (dg) {
                n2 = ae.length % gJ == 0 ? ae.length : (ae.length / gJ + 1) * gJ;
            } else if (dh) {
                n2 = af.length % gJ == 0 ? af.length : (af.length / gJ + 1) * gJ;
            } else if (di) {
                n2 = ag.length % gJ == 0 ? ag.length : (ag.length / gJ + 1) * gJ;
            } else if (dj) {
                n2 = ah.length % gJ == 0 ? ah.length : (ah.length / gJ + 1) * gJ;
            } else if (dk) {
                n2 = ai.length % gJ == 0 ? ai.length : (ai.length / gJ + 1) * gJ;
            } else if (dl) {
                n2 = aj.length % gJ == 0 ? aj.length : (aj.length / gJ + 1) * gJ;
            } else if (dm) {
                n2 = ak.length % gJ == 0 ? ak.length : (ak.length / gJ + 1) * gJ;
            } else if (dn) {
                n2 = al.length % gJ == 0 ? al.length : (al.length / gJ + 1) * gJ;
            } else if (do) {
                n2 = am.length % gJ == 0 ? am.length : (am.length / gJ + 1) * gJ;
            } else if (dp) {
                n2 = an.length % gJ == 0 ? an.length : (an.length / gJ + 1) * gJ;
            } else if (dq) {
                n2 = ao.length % gJ == 0 ? ao.length : (ao.length / gJ + 1) * gJ;
            } else if (dr) {
                n2 = ap.length % gJ == 0 ? ap.length : (ap.length / gJ + 1) * gJ;
            } else if (ds) {
                n2 = aq.length % gJ == 0 ? aq.length : (aq.length / gJ + 1) * gJ;
            } else if (dt) {
                n2 = ar.length % gJ == 0 ? ar.length : (ar.length / gJ + 1) * gJ;
            } else if (du) {
                n2 = as.length % gJ == 0 ? as.length : (as.length / gJ + 1) * gJ;
            } else if (dv) {
                n2 = at.length % gJ == 0 ? at.length : (at.length / gJ + 1) * gJ;
            }
            if (dA) {
                n2 = bp.d().aC.length;
            }
            if (W == 1 && !db) {
                n2 = bp.d().aB.length;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        if ((dz || dI || dB || dJ || dK || dL || dR) && W == 0) {
            n2 = 24;
        } else if ((dM || dw || dx) && W == 0) {
            n2 = 18;
        } else if (n2 < 30) {
            n2 = 30;
        }
        return n2;
    }

    private static void aO() {
        if (W == 0) {
            dq.a().i(14);
            return;
        }
        if (W == 1) {
            dq.a().i(15);
            return;
        }
        if (W == 2) {
            dq.a().i(32);
            return;
        }
        if (W == 3) {
            dq.a().i(34);
            return;
        }
        if (W == 52) {
            dq.a().i(32);
        }
    }

    private void aP() {
        if (bp.d().aB[dg.U].f > 1) {
            this.k = new bd(df.ao, 11072);
            return;
        }
        this.k = new bd(df.ao, 11073);
    }

    public final void C() {
        block447: {
            this.l = null;
            this.k = null;
            if (U < 0) {
                return;
            }
            if (aT) {
                if (cL == 1 && !main.a.g) {
                    this.k = new bd(df.bo, 1510);
                }
                return;
            }
            if (dG) {
                if (cL == 1) {
                    this.k = new bd(df.bo, 1506);
                    this.l = new bd("", 1507);
                }
                return;
            }
            if (dc) {
                by by2;
                if (W == 0 && (by2 = dg.k(35)) != null) {
                    this.k = this.gf;
                    if (!main.a.j) {
                        this.l = this.gg;
                        return;
                    }
                    this.d((byte)35);
                }
                return;
            }
            if (db) {
                by by3;
                if (W == 52) {
                    by by4 = dg.k(32);
                    if (by4 != null) {
                        this.k = this.gn;
                        if (!main.a.j) {
                            this.l = this.go;
                            return;
                        }
                        this.d((byte)32);
                        return;
                    }
                } else if (W == 0) {
                    by by5 = dg.k(14);
                    if (by5 != null) {
                        this.k = this.gh;
                        if (!main.a.j) {
                            this.l = this.gi;
                            return;
                        }
                        this.d((byte)14);
                        return;
                    }
                } else if (W == 1) {
                    by by6 = dg.k(15);
                    if (by6 != null) {
                        this.k = this.gl;
                        if (!main.a.j) {
                            this.l = this.gm;
                            return;
                        }
                        this.d((byte)15);
                        return;
                    }
                } else if (W == 2) {
                    by by7 = dg.k(32);
                    if (by7 != null) {
                        this.k = this.gn;
                        if (!main.a.j) {
                            this.l = this.go;
                            return;
                        }
                        this.d((byte)32);
                        return;
                    }
                } else if (W == 3 && (by3 = dg.k(34)) != null) {
                    this.k = this.gj;
                    if (!main.a.j) {
                        this.l = this.gk;
                        return;
                    }
                    this.d((byte)34);
                }
                return;
            }
            if (dd) {
                if (W == 0) {
                    by by8 = dg.k(20);
                    if (by8 != null) {
                        this.k = this.gp;
                        if (!main.a.j) {
                            this.l = this.gq;
                        } else {
                            this.d((byte)20);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (de) {
                if (W == 0) {
                    by by9 = dg.k(21);
                    if (by9 != null) {
                        this.k = this.gr;
                        if (!main.a.j) {
                            this.l = this.gs;
                        } else {
                            this.d((byte)21);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (df) {
                if (W == 0) {
                    by by10 = dg.k(22);
                    if (by10 != null) {
                        this.k = this.gt;
                        if (!main.a.j) {
                            this.l = this.gu;
                        } else {
                            this.d((byte)22);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dg) {
                if (W == 0) {
                    by by11 = dg.k(23);
                    if (by11 != null) {
                        this.k = this.gv;
                        if (!main.a.j) {
                            this.l = this.gw;
                        } else {
                            this.d((byte)23);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dh) {
                if (W == 0) {
                    by by12 = dg.k(24);
                    if (by12 != null) {
                        this.k = this.gx;
                        if (!main.a.j) {
                            this.l = this.gy;
                        } else {
                            this.d((byte)24);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (di) {
                if (W == 0) {
                    by by13 = dg.k(25);
                    if (by13 != null) {
                        this.k = this.gz;
                        if (!main.a.j) {
                            this.l = this.gA;
                        } else {
                            this.d((byte)25);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dj) {
                if (W == 0) {
                    by by14 = dg.k(26);
                    if (by14 != null) {
                        this.k = new bd(df.as, 11092, by14);
                        if (!main.a.j) {
                            this.l = new bd(main.a.g ? df.X : "", 11088, by14);
                        } else {
                            this.a(26, by14);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dk) {
                if (W == 0) {
                    by by15 = dg.k(27);
                    if (by15 != null) {
                        this.k = new bd(df.as, 11092, by15);
                        if (!main.a.j) {
                            this.l = new bd(main.a.g ? df.X : "", 11089);
                        } else {
                            this.a(27, by15);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dl) {
                if (W == 0) {
                    by by16 = dg.k(28);
                    if (by16 != null) {
                        this.k = new bd(df.as, 11092, by16);
                        if (!main.a.j) {
                            this.l = new bd(main.a.g ? df.X : "", 11090);
                        } else {
                            this.a(28, by16);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dm) {
                if (W == 0) {
                    by by17 = dg.k(29);
                    if (by17 != null) {
                        this.k = new bd(df.as, 11092, by17);
                        if (!main.a.j) {
                            this.l = new bd(main.a.g ? df.X : "", 11091);
                        } else {
                            this.a(29, by17);
                        }
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dn) {
                if (W == 0) {
                    by by18 = dg.k(16);
                    if (by18 != null) {
                        this.k = new bd(df.as, 11092, by18);
                        if (main.a.j) {
                            this.a(16, by18);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 110923);
                        }
                    } else {
                        aQ = false;
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (do) {
                if (W == 0) {
                    by by19 = dg.k(17);
                    if (by19 != null) {
                        this.k = new bd(df.as, 11092, by19);
                        if (main.a.j) {
                            this.a(17, by19);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 110924);
                        }
                    } else {
                        aQ = false;
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dp) {
                if (W == 0) {
                    by by20 = dg.k(18);
                    if (by20 != null) {
                        this.k = new bd(df.as, 11092, by20);
                        if (main.a.j) {
                            this.a(18, by20);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 110925);
                        }
                    } else {
                        aQ = false;
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dq) {
                if (W == 0) {
                    by by21 = dg.k(19);
                    if (by21 != null) {
                        this.k = new bd(df.as, 11092, by21);
                        if (main.a.j) {
                            this.a(19, by21);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 110926);
                        }
                    } else {
                        aQ = false;
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (dr) {
                if (W == 0) {
                    by by22 = dg.k(2);
                    if (by22 != null) {
                        this.k = new bd(df.as, 11092, by22);
                        if (main.a.j) {
                            this.a(2, by22);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 11093);
                        }
                    } else {
                        aQ = false;
                    }
                } else if (W == 1 && bp.d().aB[U] != null) {
                    this.aP();
                }
            } else if (ds) {
                if (W == 0) {
                    by by23 = dg.k(6);
                    if (by23 != null) {
                        this.k = new bd(df.as, 11092, by23);
                        if (main.a.j) {
                            this.a(6, by23);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 11094);
                        }
                    }
                } else if (W == 1) {
                    if (bp.d().aB[U] != null) {
                        this.aP();
                    } else {
                        this.k = this.gV;
                    }
                }
            } else if (dt) {
                if (W == 0) {
                    by by24 = dg.k(7);
                    if (by24 != null) {
                        this.k = new bd(df.as, 11092, by24);
                        if (main.a.j) {
                            this.a(7, by24);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 11095);
                        }
                    }
                } else if (W == 1) {
                    if (bp.d().aB[U] != null) {
                        this.aP();
                    } else {
                        this.k = this.gV;
                    }
                }
            } else if (du) {
                if (W == 0) {
                    by by25 = dg.k(8);
                    if (by25 != null) {
                        this.k = new bd(df.as, 11092, by25);
                        if (main.a.j) {
                            this.a(8, by25);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 11096);
                        }
                    }
                } else if (W == 1) {
                    if (bp.d().aB[U] != null) {
                        this.aP();
                    } else {
                        this.k = this.gV;
                    }
                }
            } else if (dv) {
                if (W == 0) {
                    by by26 = dg.k(9);
                    if (by26 != null) {
                        this.k = new bd(df.as, 11092, by26);
                        if (main.a.j) {
                            this.a(9, by26);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 11097);
                        }
                    }
                } else if (W == 1) {
                    if (bp.d().aB[U] != null) {
                        this.aP();
                    } else {
                        this.k = this.gV;
                    }
                }
            } else if (dw) {
                if (W == 0) {
                    if (cL == 1) {
                        if (aI != null) {
                            if (U == 0) {
                                this.k = new bd(df.bo, 11098);
                                if (main.a.j) {
                                    cQ = false;
                                    this.a(3, aI);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 11099);
                                }
                            } else if (U == 1 && !aI.p()) {
                                if (main.a.j) {
                                    cQ = true;
                                    this.a(3, aI);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 110991);
                                }
                            }
                        } else {
                            aQ = false;
                        }
                    } else if (cL == 2) {
                        by by27 = dg.k(10);
                        cQ = false;
                        if (by27 != null) {
                            this.k = new bd(df.bo, 11100);
                            if (main.a.j) {
                                this.a(3, by27);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 11101);
                            }
                        } else {
                            this.k = null;
                            aQ = false;
                            if (aI != null) {
                                int n2 = 0;
                                while (n2 < aA.length) {
                                    if (aA[n2] != null) {
                                        this.k = new bd(df.bV, 110981);
                                        break;
                                    }
                                    ++n2;
                                }
                            }
                        }
                    }
                } else if (W == 1) {
                    this.k = bp.d().aB[U] != null ? new bd(df.bo, 11102) : null;
                }
            } else if (dx) {
                if (W == 0) {
                    if (cL == 1) {
                        if (U == 0) {
                            if (aE[0] != null) {
                                this.k = new bd(df.bo, 14013);
                                if (main.a.j) {
                                    this.a(3, aE[U]);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 14016);
                                }
                            }
                        } else if (U == 1) {
                            if (aE[1] != null) {
                                this.k = new bd(df.bo, 14013);
                                if (main.a.j) {
                                    this.a(3, aE[U]);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 14016);
                                }
                            }
                        } else {
                            aQ = false;
                        }
                    } else if (cL == 2) {
                        by by28 = null;
                        int n3 = U + 2;
                        if (n3 <= aE.length - 1) {
                            by28 = aE[n3];
                        }
                        if (by28 != null) {
                            this.k = new bd(df.aj, 140151);
                            if (main.a.j) {
                                this.a(3, by28);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 140161);
                            }
                        } else {
                            this.k = new bd(df.bV, 140131);
                            int n4 = 0;
                            while (n4 < aE.length) {
                                if (aE[n4] == null) {
                                    this.k = null;
                                    break;
                                }
                                ++n4;
                            }
                            aQ = false;
                        }
                    }
                } else if (W == 1) {
                    this.k = bp.d().aB[U] != null ? new bd(df.bo, 14012) : null;
                }
            } else if (aN) {
                if (W == 0) {
                    if (cL == 2) {
                        this.ed.e = true;
                        this.m = this.ed.l;
                    } else {
                        this.ed.e = false;
                        this.m = this.ge;
                    }
                    int n5 = 0;
                    try {
                        n5 = Integer.parseInt(this.ed.d());
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    if (aK != null && n5 > 0 && bp.d().ar >= 5000) {
                        this.k = new bd(df.ao, 15002);
                    }
                    if (cL == 1 && aK != null) {
                        this.k = new bd(df.bo, 1500);
                        if (main.a.j) {
                            this.a(3, aK);
                        } else {
                            this.l = new bd(main.a.g ? df.X : "", 1501);
                        }
                    }
                } else if (W == 1) {
                    this.m = this.ge;
                    if (bp.d().aB[U] != null) {
                        this.k = new bd(df.bo, 1503);
                    } else {
                        this.k = null;
                        aQ = false;
                    }
                }
            } else {
                if (dH) {
                    bu bu2;
                    if (cL == 1 && aF != null && U >= 0 && U < aF.length && (bu2 = aF[U]) != null) {
                        this.k = new bd(df.bo, 1504);
                        if (main.a.j) {
                            this.b(1505, null);
                            return;
                        }
                        this.l = new bd(main.a.g ? df.X : "", 1505);
                    }
                    return;
                }
                if (dB) {
                    if (W == 0) {
                        if (cL == 1) {
                            if (aJ != null && dg.aJ.j > 0) {
                                this.k = new bd(df.bo, 11103);
                            } else if (aJ != null) {
                                this.k = this.fX;
                            } else {
                                aQ = false;
                            }
                            if (main.a.j) {
                                this.a(3, aJ);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                            }
                        } else if (cL == 2) {
                            by by29 = aB[U];
                            if (by29 != null) {
                                if (main.a.j) {
                                    this.a(3, by29);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 11104, by29);
                                }
                            } else {
                                aQ = false;
                            }
                            if (aJ != null && dg.aJ.j > 0) {
                                this.k = new bd(df.bV, 11105);
                            }
                        }
                    } else if (W == 1) {
                        if (bp.d().aB[U] == null) {
                            this.k = null;
                            aQ = false;
                        } else {
                            this.k = new bd(df.bo, 11106);
                        }
                    }
                } else if (dJ) {
                    try {
                        if (W == 0) {
                            if (cL == 1) {
                                if (aJ != null) {
                                    this.k = new bd(df.bo, 11103);
                                } else {
                                    aQ = false;
                                }
                                if (main.a.j) {
                                    this.a(3, aJ);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                                }
                            } else if (cL == 2) {
                                by by30 = aB[U];
                                if (by30 != null) {
                                    if (main.a.j) {
                                        this.a(3, by30);
                                    } else {
                                        this.l = new bd(main.a.g ? df.X : "", 11104, by30);
                                    }
                                    this.k = new bd(df.aj, 1605);
                                } else {
                                    aQ = false;
                                }
                                if (aJ != null) {
                                    this.k = new bd(df.bo, 1604);
                                }
                            }
                            break block447;
                        }
                        if (W != 1) break block447;
                        if (bp.d().aB[U] == null) {
                            this.k = null;
                            aQ = false;
                            break block447;
                        }
                        this.k = new bd(df.bo, 11106);
                    }
                    catch (Exception exception) {}
                } else if (dK) {
                    if (W == 0) {
                        if (cL == 1) {
                            if (aJ != null && dg.aJ.j > 11) {
                                this.k = new bd(df.bo, 11103);
                            } else if (aJ != null) {
                                this.k = this.fX;
                            } else {
                                aQ = false;
                            }
                            if (main.a.j) {
                                this.a(3, aJ);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                            }
                        } else if (cL == 2) {
                            by by31 = aB[U];
                            if (by31 != null) {
                                if (main.a.j) {
                                    this.a(3, by31);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 11104, by31);
                                }
                            } else {
                                aQ = false;
                            }
                            if (aJ != null && dg.aJ.j > 11) {
                                this.k = new bd(df.bo, 1604);
                            }
                        }
                    } else if (W == 1) {
                        if (bp.d().aB[U] == null) {
                            this.k = null;
                            aQ = false;
                        } else {
                            this.k = new bd(df.bo, 1606);
                        }
                    }
                } else if (dz) {
                    if (W == 0) {
                        by by32;
                        int n6 = 0;
                        int n7 = 0;
                        while (n7 < az.length) {
                            if (az[n7] != null && ++n6 >= 2) break;
                            ++n7;
                        }
                        if ((by32 = dg.k(11)) != null) {
                            this.k = n6 >= 2 ? new bd(df.bo, 11107) : new bd(df.aj, 111071);
                            if (main.a.j) {
                                this.a(3, by32);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 11108);
                            }
                        } else {
                            aQ = false;
                            if (n6 >= 2) {
                                this.k = new bd(df.bV, 11062);
                            }
                        }
                    } else if (W == 1) {
                        if (bp.d().aB[U] != null) {
                            this.k = new bd(df.bo, 11109);
                        } else {
                            aQ = false;
                            this.k = null;
                        }
                    }
                } else if (dI) {
                    if (W == 0) {
                        by by33;
                        int n8 = 0;
                        int n9 = 0;
                        int n10 = 0;
                        int n11 = 0;
                        int n12 = 0;
                        while (n12 < az.length) {
                            by by34 = az[n12];
                            if (by34 != null) {
                                if (by34.b.a == 455) {
                                    ++n8;
                                } else if (by34.b.a == 456) {
                                    ++n9;
                                } else if (by34.b.b == 26) {
                                    n11 = by34.b.a;
                                    ++n10;
                                }
                            }
                            if (n8 >= 9 || n9 >= 9 || n11 == 10 && n8 >= 3 || n11 == 11 && n9 >= 3) break;
                            ++n12;
                        }
                        if ((by33 = dg.k(43)) != null) {
                            this.k = n8 == 9 || n9 == 9 || n11 == 10 && n8 == 3 && n10 == 1 || n11 == 11 && n9 == 3 && n10 == 1 ? new bd(df.bo, 1601) : new bd(df.aj, 111071);
                            if (main.a.j) {
                                this.a(43, by33);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 1602);
                            }
                        } else {
                            aQ = false;
                            if (n8 >= 9 || n9 >= 9 || n11 >= 10 && (n8 >= 3 || n9 >= 3)) {
                                this.k = new bd(df.bV, 1600);
                            }
                        }
                    } else if (W == 1) {
                        if (bp.d().aB[U] != null) {
                            this.k = new bd(df.bo, 1603);
                        } else {
                            aQ = false;
                            this.k = null;
                        }
                    }
                } else if (aS) {
                    if (W == 0) {
                        by by35;
                        by by36;
                        if (cL == 1) {
                            by36 = aC[U];
                            if (by36 != null) {
                                if (this.bh == 0) {
                                    this.k = this.gd;
                                } else if (this.bh == 1 && this.bi >= 1 && (long)this.bl - System.currentTimeMillis() / 1000L <= 0L) {
                                    this.k = this.fR;
                                }
                                if (main.a.j) {
                                    by35 = aC[U];
                                    this.a(3, by35);
                                } else {
                                    this.l = this.ga;
                                }
                            } else {
                                aQ = false;
                                if (this.bh == 0) {
                                    this.k = this.fQ;
                                } else if (this.bh == 1 && this.bi >= 1 && (long)this.bl - System.currentTimeMillis() / 1000L <= 0L) {
                                    this.k = this.fR;
                                }
                            }
                        }
                        if (cL == 2) {
                            by36 = aD[U];
                            if (by36 != null) {
                                if (main.a.j) {
                                    by35 = aD[U];
                                    this.a(30, by35);
                                } else {
                                    this.l = new bd(main.a.g ? df.X : "", 11110);
                                }
                            } else {
                                aQ = false;
                            }
                        }
                    } else if (W == 1 && this.bh == 0) {
                        this.k = bp.d().aB[U] != null ? this.gc : this.fY;
                    }
                } else if (dA) {
                    if (W == 0) {
                        by by37 = dg.k(4);
                        if (by37 != null) {
                            String string = df.ai;
                            if (!ck.equals("")) {
                                string = cl;
                            }
                            this.k = new bd(string, 111101);
                            if (main.a.j) {
                                this.a(4, by37);
                            } else {
                                this.l = new bd(main.a.g ? df.X : "", 11111);
                            }
                        } else if (ck.equals("")) {
                            this.k = new bd(df.ad, 11112);
                        }
                    } else if (W == 1) {
                        this.k = bp.d().aB[U] != null ? new bd(df.an, 11113) : this.gV;
                    }
                } else if (!dR) {
                    if (dL) {
                        dg dg2 = this;
                        try {
                            if (W == 0) {
                                if (cL == 1) {
                                    if (aJ != null) {
                                        dg2.k = new bd(df.bo, 11103);
                                    } else {
                                        aQ = false;
                                    }
                                    if (main.a.j) {
                                        dg2.a(3, aJ);
                                    } else {
                                        dg2.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                                    }
                                } else if (cL == 2) {
                                    by by38 = aB[U];
                                    if (by38 != null) {
                                        if (main.a.j) {
                                            dg2.a(3, by38);
                                        } else {
                                            dg2.l = new bd(main.a.g ? df.X : "", 11104, by38);
                                        }
                                        dg2.k = new bd(df.aj, 1605);
                                    } else {
                                        aQ = false;
                                    }
                                    if (aJ != null) {
                                        dg2.k = new bd(df.bo, 1604);
                                    }
                                }
                                break block447;
                            }
                            if (W != 1) break block447;
                            if (bp.d().aB[U] == null) {
                                dg2.k = null;
                                aQ = false;
                                break block447;
                            }
                            dg2.k = new bd(df.bo, 222);
                        }
                        catch (Exception exception) {}
                    } else if (dM) {
                        dg dg3 = this;
                        if (W == 0) {
                            if (cL == 1) {
                                if (aJ != null && U == 0) {
                                    dg3.k = new bd(df.bo, 338);
                                    if (main.a.j) {
                                        cQ = false;
                                        dg3.a(3, aJ);
                                    } else {
                                        dg3.l = new bd(main.a.g ? df.X : "", 335);
                                    }
                                }
                                if (aI != null && U == 1) {
                                    dg3.k = new bd(df.bo, 344);
                                    if (main.a.j) {
                                        cQ = false;
                                        dg3.a(3, aI);
                                    } else {
                                        dg3.l = new bd(main.a.g ? df.X : "", 336);
                                    }
                                }
                                if (aJ == null && aI == null) {
                                    aQ = false;
                                }
                            } else if (cL == 2) {
                                by by39 = dg.k(47);
                                cQ = false;
                                if (by39 != null) {
                                    dg3.k = new bd(df.bo, 345);
                                    if (main.a.j) {
                                        dg3.a(3, by39);
                                    } else {
                                        dg3.l = new bd(main.a.g ? df.X : "", 11101);
                                    }
                                } else {
                                    dg3.k = null;
                                    aQ = false;
                                    if (aI != null && aJ != null) {
                                        int n13 = 0;
                                        while (n13 < aA.length) {
                                            if (aA[n13] != null) {
                                                dg3.k = new bd(df.bV, 341);
                                                break;
                                            }
                                            ++n13;
                                        }
                                    }
                                }
                            }
                        } else if (W == 1) {
                            dg3.k = bp.d().aB[U] != null ? new bd(df.bo, 337) : null;
                        }
                    } else if (dQ) {
                        dg dg4 = this;
                        if (W == 0) {
                            by by40 = dg.k(48);
                            cQ = false;
                            if (by40 != null) {
                                dg4.k = new bd(df.bo, 401);
                                if (main.a.j) {
                                    dg4.a(3, by40);
                                } else {
                                    dg4.l = new bd(main.a.g ? df.X : "", 11101);
                                }
                            } else {
                                int n14 = 0;
                                while (n14 < aB.length) {
                                    if (aB[n14] != null) {
                                        dg4.k = new bd(df.cL[0], 403);
                                        break;
                                    }
                                    ++n14;
                                }
                            }
                        } else if (W == 1) {
                            dg4.k = bp.d().aB[U] != null ? new bd(df.bo, 400) : null;
                        }
                    } else if (dN || dO) {
                        dg dg5 = this;
                        if (W == 0) {
                            if (aJ != null) {
                                dg5.k = new bd(df.bo, 11103);
                            } else {
                                aQ = false;
                            }
                            if (main.a.j) {
                                dg5.a(3, aJ);
                            } else {
                                dg5.l = new bd(main.a.g ? df.X : "", 11104, aJ);
                            }
                        } else if (W == 1) {
                            if (bp.d().aB[U] == null) {
                                dg5.k = null;
                                aQ = false;
                            } else {
                                dg5.k = new bd(df.bo, 405);
                            }
                        }
                    }
                }
            }
        }
        if (dg.A() && W == 1 && bp.d().aB[U] != null) {
            if (main.a.j) {
                this.a(3, bp.d().aB[U]);
                return;
            }
            this.l = new bd(main.a.g ? df.X : "", 11114);
        }
    }

    public static void b(int n2, int n3) {
        if (main.a.A == 128 || main.a.B <= 208) {
            n2 = 126;
            n3 = 160;
        }
        cf = n2;
        cg = n3;
        ce = d - n2 / 2;
        cd = f - n3 / 2;
        if (main.a.B <= 250) {
            cd -= 10;
        }
        if (main.a.j && !dg.aJ() && main.a.E instanceof dg) {
            cf = 310;
            ce = b / 2 - cf / 2;
        }
        if (cd < -10) {
            cd = -10;
        }
        if (main.a.B > 208 && cd < 0) {
            cd = 0;
        }
        if (main.a.B == 208 && cd < 10) {
            cd = 10;
        }
    }

    private void a(t object, z z2) {
        if (bp.d().w >= z2.d) {
            dd.i.a((t)object, String.valueOf(df.du) + " " + z2.d, gD + 5, this.gL += 12, 0);
        } else {
            dd.l.a((t)object, String.valueOf(df.du) + " " + z2.d, gD + 5, this.gL += 12, 0);
        }
        if (z2.a.d != 0) {
            String string;
            cM += 4;
            dd.i.a((t)object, String.valueOf(df.fa) + ": " + z2.i, gD + 5, this.gL += 12, 0);
            dd.i.a((t)object, String.valueOf(df.fc) + ": " + z2.j, gD + 5, this.gL += 12, 0);
            dd.i.a((t)object, String.valueOf(df.fb) + ": " + z2.g, gD + 5, this.gL += 12, 0);
            t t2 = object;
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(df.fd)).append(": ");
            object = z2;
            if (((z)object).e % 1000 == 0) {
                string = String.valueOf(((z)object).e / 1000);
            } else {
                int n2 = ((z)object).e % 1000;
                string = String.valueOf(((z)object).e / 1000) + "." + (n2 % 100 == 0 ? n2 / 100 : n2 / 10);
            }
            dd.i.a(t2, stringBuffer.append(string).append(" ").append(df.eY).toString(), gD + 5, this.gL += 12, 0);
        }
        ++cM;
    }

    private void b(t t2, z crArray) {
        crArray = crArray.k;
        int n2 = 0;
        while (n2 < crArray.length) {
            Object object = crArray[n2];
            if (dd.i.a(((cr)object).a()) > 145) {
                object = dd.i.a(((cr)object).a(), 145);
                int n3 = 0;
                while (n3 < ((Vector)object).size()) {
                    dd.i.a(t2, ((aa)object).elementAt(n3).toString(), gD + 5, this.gL += 12, 0);
                    ++cM;
                    ++n3;
                }
            } else {
                dd.i.a(t2, ((cr)object).a(), gD + 5, this.gL += 12, 0);
                ++cM;
            }
            ++n2;
        }
    }

    private void o(t t2) {
        if (W != 1) {
            return;
        }
        dg.b(t2);
        ay.a(ce, cd, cf, cg, t2);
        dg.a(t2, df.cg[W], true);
        dd.e.a(t2, df.ed, ce + 10, cd + 32, 0);
        dd.e.a(t2, "" + bp.d().G, ce + cf - 10, cd + 32, 1);
        t2.a(0);
        t2.c(ce + 4, cd + 44, cf - 7, cK + 3);
        t2.a(0xBB6611);
        t2.b(ce + 5, cd + 45, cf - 10, cK);
        if (cL >= 1) {
            t2.a(ay.d);
            t2.b(ce + 5, cd + 48 + cK, cf - 10, cg - 64 - cK);
        }
        int n2 = bp.d().av.c.length;
        gD = ce + 5;
        gE = cd + 45;
        aa.a(n2, cK + 2, gD + 1, gE, cf - 12, cK + 2, false, 1);
        aa.a(t2);
        int n3 = 0;
        while (n3 < n2) {
            ab.a(t2, bp.d().av.c[n3].e, gD + n3 * (cK + 2) + cK / 2, gE + cK / 2, 0, 3);
            if (cL == 1 && n3 == U) {
                t2.a(0xFFFFFF);
                t2.b(gD + n3 * (cK + 2) + 2, gE + 2, cK - 4, cK - 4);
                dg.a(gD + n3 * (cK + 2), gE, t2);
            }
            ++n3;
        }
        gD += 8;
        gE += 6;
        if (cL == 1 && U >= 0) {
            dg.b(t2);
            j j2 = bp.d().av.c[U];
            cM = 4 + j2.f.length;
            z z2 = bp.d().a(j2);
            int n4 = ce;
            int n5 = gE + cK + 2;
            int n6 = cf - 6;
            int n7 = cg - 70 - cK;
            cO.a(t2, n4, n5, n6, n7);
            this.gL = gE + 18;
            if (z2 == null) {
                z2 = j2.g.length > 1 ? j2.g[1] : j2.g[0];
                dd.a.a(t2, j2.b, gD + 5, this.gL += 12, 0);
                int n8 = 0;
                while (n8 < j2.f.length) {
                    dd.i.a(t2, j2.f[n8], gD + 5, this.gL += 12, 0);
                    ++n8;
                }
                dd.i.a(t2, df.dO[j2.d], gD + 5, this.gL += 12, 0);
                dd.i.a(t2, String.valueOf(df.ds) + ": " + j2.c, gD + 5, this.gL += 12, 0);
                dd.l.a(t2, df.a(df.dq, String.valueOf(z2.c)), gD + 5, this.gL += 12, 0);
                this.a(t2, z2);
                this.b(t2, z2);
            } else {
                dd.e.a(t2, j2.b, gD + 5, this.gL += 12, 0);
                int n9 = 0;
                while (n9 < j2.f.length) {
                    dd.i.a(t2, j2.f[n9], gD + 5, this.gL += 12, 0);
                    ++n9;
                }
                dd.i.a(t2, df.dO[j2.d], gD + 5, this.gL += 12, 0);
                dd.i.a(t2, String.valueOf(df.ds) + ": " + j2.c, gD + 5, this.gL += 12, 0);
                if (z2.c == j2.c) {
                    dd.m.a(t2, df.dt, gD + 5, this.gL += 12, 0);
                    this.a(t2, z2);
                    this.b(t2, z2);
                } else {
                    dd.m.a(t2, df.a(df.dr, String.valueOf(z2.c)), gD + 5, this.gL += 12, 0);
                    this.a(t2, z2);
                    this.b(t2, z2);
                    n9 = 0;
                    while (n9 < j2.g.length) {
                        if (j2.g[n9].equals(z2)) {
                            ++n9;
                            break;
                        }
                        ++n9;
                    }
                    dd.l.a(t2, df.a(df.dq, String.valueOf(j2.g[n9].c)), gD + 5, this.gL += 12, 0);
                    this.a(t2, j2.g[n9]);
                    ++cM;
                    this.b(t2, j2.g[n9]);
                }
            }
            cO.a(cM, 12, n4, n5, n6, n7, true, 1);
            if (V >= 0) {
                ab.a(t2, 942, gD + 2, gE + 32 + V * 12, 0, ch.c);
            }
        }
    }

    private void a(t t2, String[] stringArray) {
        try {
            dg.b(t2);
            ((dg)((Object)exception2)).a(t2, stringArray, true);
            super.a(t2, bp.d().aB);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void a(t t2, by[] byArray) {
        gK = byArray.length / gJ;
        aa.a(gK, cK, gD, gE, gJ * cK, 5 * cK, true, 6);
        aa.a(t2, gD, gE, dg.aa.e + 2, dg.aa.f + 2);
        int n2 = 0;
        while (n2 < gK) {
            int n3 = 0;
            while (n3 < gJ) {
                ab.a(t2, 154, gD + n3 * cK + cK / 2, gE + n2 * cK + cK / 2, 0, 3);
                t2.a(0xBB6611);
                t2.b(gD + n3 * cK, gE + n2 * cK, cK, cK);
                ++n3;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < byArray.length) {
            by by2 = byArray[n2];
            if (by2 != null) {
                int n4 = by2.e / gJ;
                int n5 = by2.e - n4 * gJ;
                this.a(t2, by2, gD + n5 * cK, gE + n4 * cK);
                if (by2.f > 1) {
                    dd.p.a(t2, "" + by2.f, gD + n5 * cK + cK, gE + n4 * cK + cK - dd.p.c(), 1);
                }
            }
            ++n2;
        }
        if (cL > 0 && U >= 0) {
            n2 = U / gJ;
            int n6 = U - n2 * gJ;
            t2.a(0xFFFFFF);
            t2.b(gD + n6 * cK, gE + n2 * cK, cK, cK);
            dg.a(gD + n6 * cK, gE + n2 * cK, t2);
        }
    }

    private static void a(int n2, int n3, t t2) {
        t2.a(es, n2 - 5, n3 - 5, 0);
    }

    private static int i(int n2) {
        int n3 = cK - 2;
        if ((n2 %= n3 * 4) >= 0 && n2 < n3) {
            return 0;
        }
        if (n3 <= n2 && n2 < n3 << 1) {
            return n2 % n3;
        }
        if (n3 << 1 <= n2 && n2 < n3 * 3) {
            return n3;
        }
        return n3 - n2 % n3;
    }

    private static int j(int n2) {
        int n3 = cK - 2;
        if ((n2 %= n3 * 4) >= 0 && n2 < n3) {
            return n2 % n3;
        }
        if (n3 <= n2 && n2 < n3 << 1) {
            return n3;
        }
        if (n3 << 1 <= n2 && n2 < n3 * 3) {
            return n3 - n2 % n3;
        }
        return 0;
    }

    private void b(t t2, by[] byArray) {
        try {
            dg.b(t2);
            boolean bl2 = true;
            String string = gP;
            Object object = t2;
            dg dg2 = this;
            ay.a(ce, cd, cf, cg, (t)object);
            dd.i.a((t)object, String.valueOf(df.eA) + ": " + at.a(String.valueOf(bp.d().ar)), ce + 6, cd + cg - 26, 0);
            dd.i.a((t)object, String.valueOf(df.eB) + ": " + at.a(String.valueOf(bp.d().at)), ce + cf - 6, cd + cg - 26, 1);
            if (aS) {
                if (main.a.w % 10 > 4) {
                    dd.j.a((t)object, df.bY, ce + cf / 2, cd + cg - 14, 2);
                }
            } else if (dz) {
                if (main.a.w % 10 > 4) {
                    dd.j.a((t)object, df.bW, ce + cf / 2, cd + cg - 14, 2);
                }
            } else if (dB) {
                if (main.a.w % 10 > 4) {
                    dd.j.a((t)object, df.bX, ce + cf / 2, cd + cg - 14, 2);
                }
            } else {
                dd.j.a((t)object, String.valueOf(df.eC) + ": " + at.a(String.valueOf(bp.d().au)), ce + cf / 2, cd + cg - 14, 2);
            }
            dg.a((t)object, string, false);
            gD = ce + 3;
            gE = cd + 32;
            ((t)object).a(6425);
            ((t)object).c(gD - 1, gE - 1, gJ * cK + 3, 5 * cK + 3);
            if (byArray == null) {
                main.a.a(ce + 90, cd + 75, t2, false);
                dd.e.a(t2, df.y, ce + 90, cd + 90, 2);
                return;
            }
            gK = byArray.length <= 30 ? 5 : (byArray.length % gJ == 0 ? byArray.length / gJ : byArray.length / gJ + 1);
            aa.a(gK, cK, gD, gE, gJ * cK, 5 * cK, true, 6);
            aa.a(t2, gD, gE, dg.aa.e + 2, dg.aa.f + 2);
            int n2 = 0;
            while (n2 < gK) {
                int n3 = 0;
                while (n3 < gJ) {
                    ab.a(t2, 154, gD + n3 * cK + cK / 2, gE + n2 * cK + cK / 2, 0, 3);
                    t2.a(0xBB6611);
                    t2.b(gD + n3 * cK, gE + n2 * cK, cK, cK);
                    ++n3;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < byArray.length) {
                object = byArray[n2];
                if (object != null) {
                    int n4 = ((by)object).e / gJ;
                    int n5 = ((by)object).e - n4 * gJ;
                    if (!((by)object).h) {
                        t2.a(12083);
                        t2.c(gD + n5 * cK + 1, gE + n4 * cK + 1, cK - 1, cK - 1);
                        ab.a(t2, 154, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3);
                    }
                    ab.a(t2, ((by)object).b.g, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3);
                }
                ++n2;
            }
            if (cL > 0 && U >= 0) {
                n2 = U / gJ;
                int n6 = U - n2 * gJ;
                t2.a(0xFFFFFF);
                t2.b(gD + n6 * cK, gE + n2 * cK, cK, cK);
                dg.a(gD + n6 * cK, gE + n2 * cK, t2);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private void a(t t2, String[] stringArray, by[] byArray) {
        try {
            dg.b(t2);
            this.a(t2, stringArray, true);
            if (byArray == null) {
                main.a.a(ce + 90, cd + 75, t2, false);
                dd.e.a(t2, df.y, ce + 90, cd + 90, 2);
                return;
            }
            gK = byArray.length <= 30 ? 5 : (byArray.length % gJ == 0 ? byArray.length / gJ : byArray.length / gJ + 1);
            aa.a(gK, cK, gD, gE, gJ * cK, 5 * cK, true, 6);
            aa.a(t2, gD, gE, dg.aa.e + 2, dg.aa.f + 2);
            int n2 = 0;
            while (n2 < gK) {
                int n3 = 0;
                while (n3 < gJ) {
                    ab.a(t2, 154, gD + n3 * cK + cK / 2, gE + n2 * cK + cK / 2, 0, 3);
                    t2.a(0xBB6611);
                    t2.b(gD + n3 * cK, gE + n2 * cK, cK, cK);
                    ++n3;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < byArray.length) {
                by by2 = byArray[n2];
                if (by2 != null) {
                    int n4 = by2.e / gJ;
                    int n5 = by2.e - n4 * gJ;
                    if (!by2.h) {
                        t2.a(12083);
                        t2.c(gD + n5 * cK + 1, gE + n4 * cK + 1, cK - 1, cK - 1);
                        ab.a(t2, 154, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3);
                    }
                    if (main.a.w % 6 == 0) {
                        by2.a = (by2.a + 1) % 3;
                    }
                    if (by2.u()) {
                        t2.a(main.a.Y, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 3);
                    }
                    ab.a(t2, by2.b.g, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3, by2.a);
                }
                ++n2;
            }
            if (cL > 0 && U >= 0) {
                n2 = U / gJ;
                int n6 = U - n2 * gJ;
                t2.a(0xFFFFFF);
                t2.b(gD + n6 * cK, gE + n2 * cK, cK, cK);
                dg.a(gD + n6 * cK, gE + n2 * cK, t2);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private void a(t t2, String[] stringArray, boolean bl2) {
        ay.a(ce, cd, cf, cg, t2);
        if (bl2) {
            dd.i.a(t2, String.valueOf(df.eA) + ": " + at.a(String.valueOf(bp.d().ar)), ce + 6, cd + cg - 26, 0);
            dd.i.a(t2, String.valueOf(df.eB) + ": " + at.a(String.valueOf(bp.d().at)), ce + cf - 6, cd + cg - 26, 1);
            if (aS) {
                if (main.a.w % 10 > 4) {
                    dd.j.a(t2, df.bY, ce + cf / 2, cd + cg - 14, 2);
                }
            } else if (dz) {
                if (main.a.w % 10 > 4) {
                    dd.j.a(t2, df.bW, ce + cf / 2, cd + cg - 14, 2);
                }
            } else if (dB) {
                if (main.a.w % 10 > 4) {
                    dd.j.a(t2, df.bX, ce + cf / 2, cd + cg - 14, 2);
                }
            } else {
                dd.j.a(t2, String.valueOf(df.eC) + ": " + at.a(String.valueOf(bp.d().au)), ce + cf / 2, cd + cg - 14, 2);
            }
        }
        dg.a(t2, stringArray[W], stringArray.length > 1);
        gD = ce + 3;
        gE = cd + 32;
        t2.a(6425);
        t2.c(gD - 1, gE - 1, gJ * cK + 3, 5 * cK + 3);
    }

    private void a(t t2, by by2, int n2, int n3) {
        this.a(t2, by2, n2, n3, 0, 0);
    }

    private void a(t t2, by by2, int n2, int n3, int n4, int n5) {
        if (!by2.c()) {
            if ((n4 = by2.j + n4) > 0) {
                if (n4 >= 4) {
                    t2.a(this.gM[n4 > 16 ? 16 : n4]);
                    t2.c(n2 + 1 + n5, n3 + 1 + n5, cK - 1 - n5 * 2, cK - 1 - n5 * 2);
                    ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
                } else {
                    dg.a(t2, by2, n2, n3, n5);
                }
                if (n4 >= 1) {
                    int n6;
                    int n7;
                    t t3 = t2;
                    int n8 = n4;
                    n5 = n3 + cK / 2;
                    n4 = n2 + cK / 2;
                    int n9 = cK - 2;
                    int n10 = n8 < 4 ? 0 : (n8 < 8 ? 1 : (n8 < 12 ? 2 : (n8 <= 14 ? 3 : 4)));
                    int n11 = 0;
                    while (n11 < this.gO.length) {
                        n7 = n4 - n9 / 2 + dg.j(main.a.w - (n11 << 2));
                        n6 = n5 - n9 / 2 + dg.i(main.a.w - (n11 << 2));
                        t3.a(this.gN[n10][n11]);
                        t3.c(n7 - this.gO[n11] / 2, n6 - this.gO[n11] / 2, this.gO[n11], this.gO[n11]);
                        ++n11;
                    }
                    if (n8 == 4 || n8 == 8) {
                        n11 = 0;
                        while (n11 < this.gO.length) {
                            n7 = n4 - n9 / 2 + dg.j(main.a.w - (n9 << 1) - (n11 << 2));
                            n6 = n5 - n9 / 2 + dg.i(main.a.w - (n9 << 1) - (n11 << 2));
                            t3.a(this.gN[n10 - 1][n11]);
                            t3.c(n7 - this.gO[n11] / 2, n6 - this.gO[n11] / 2, this.gO[n11], this.gO[n11]);
                            ++n11;
                        }
                    }
                    if (n8 != 1 && n8 != 4 && n8 != 8) {
                        n11 = 0;
                        while (n11 < this.gO.length) {
                            n7 = n4 - n9 / 2 + dg.j(main.a.w - (n9 << 1) - (n11 << 2));
                            n6 = n5 - n9 / 2 + dg.i(main.a.w - (n9 << 1) - (n11 << 2));
                            t3.a(this.gN[n10][n11]);
                            t3.c(n7 - this.gO[n11] / 2, n6 - this.gO[n11] / 2, this.gO[n11], this.gO[n11]);
                            ++n11;
                        }
                    }
                    if (n8 != 1 && n8 != 4 && n8 != 8 && n8 != 12 && n8 != 2 && n8 != 5 && n8 != 9) {
                        n11 = 0;
                        while (n11 < this.gO.length) {
                            n7 = n4 - n9 / 2 + dg.j(main.a.w - n9 - (n11 << 2));
                            n6 = n5 - n9 / 2 + dg.i(main.a.w - n9 - (n11 << 2));
                            t3.a(this.gN[n10][n11]);
                            t3.c(n7 - this.gO[n11] / 2, n6 - this.gO[n11] / 2, this.gO[n11], this.gO[n11]);
                            ++n11;
                        }
                    }
                    if (n8 != 1 && n8 != 4 && n8 != 8 && n8 != 12 && n8 != 2 && n8 != 5 && n8 != 9 && n8 != 13 && n8 != 3 && n8 != 6 && n8 != 10 && n8 != 15) {
                        n11 = 0;
                        while (n11 < this.gO.length) {
                            n7 = n4 - n9 / 2 + dg.j(main.a.w - n9 * 3 - (n11 << 2));
                            n6 = n5 - n9 / 2 + dg.i(main.a.w - n9 * 3 - (n11 << 2));
                            t3.a(this.gN[n10][n11]);
                            t3.c(n7 - this.gO[n11] / 2, n6 - this.gO[n11] / 2, this.gO[n11], this.gO[n11]);
                            ++n11;
                        }
                    }
                }
            } else {
                dg.a(t2, by2, n2, n3, n5);
            }
        }
        if (main.a.w % 6 == 0) {
            by2.a = (by2.a + 1) % 3;
        }
        if (by2.u()) {
            t2.a(main.a.Y, n2 + cK / 2, n3 + cK / 2, 3);
        }
        ab.a(t2, by2.b.g, n2 + cK / 2, n3 + cK / 2, 0, 3, by2.a);
    }

    private static void a(t t2, by by2, int n2, int n3, int n4) {
        if (!by2.h) {
            t2.a(12083);
        } else {
            t2.a(6425);
        }
        t2.c(n2 + 1 + n4, n3 + 1 + n4, cK - 2 - n4 * 2, cK - 2 - n4 * 2);
        ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
    }

    private void b(t t2, String[] object) {
        try {
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, object[W], ((String[])object).length > 1);
            gD = ce + 3;
            gE = cd + 34 + cK;
            int n2 = ce + 74;
            int n3 = gE - cK - 3;
            gK = 4;
            if (aJ != null) {
                this.a(t2, aJ, n2, n3);
            } else {
                t2.a(6425);
                t2.c(n2 - 1, n3 - 1, cK + 3, cK + 3);
                ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
            }
            t2.a(0xBB6611);
            t2.b(n2, n3, cK, cK);
            t2.a(6425);
            t2.c(gD - 1, gE - 1, cK * gJ + 3, cK * gK + 3);
            int n4 = 0;
            while (n4 < gK) {
                int n5 = 0;
                while (n5 < gJ) {
                    ab.a(t2, 154, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3);
                    t2.a(0xBB6611);
                    t2.b(gD + n5 * cK, gE + n4 * cK, cK, cK);
                    ++n5;
                }
                ++n4;
            }
            n4 = 0;
            while (n4 < aB.length) {
                by by2 = aB[n4];
                if (by2 != null) {
                    int n6 = n4 / gJ;
                    int n7 = n4 - n6 * gJ;
                    if (!by2.h) {
                        t2.a(12083);
                        t2.c(gD + n7 * cK + 1, gE + n6 * cK + 1, cK - 1, cK - 1);
                    }
                    ab.a(t2, by2.b.g, gD + n7 * cK + cK / 2, gE + n6 * cK + cK / 2, 0, 3);
                }
                ++n4;
            }
            if (cL == 1) {
                t2.a(0xFFFFFF);
                t2.b(n2, n3, cK, cK);
            } else if (cL == 2) {
                n4 = U / gJ;
                int n8 = U - n4 * gJ;
                t2.a(0xFFFFFF);
                t2.b(gD + n8 * cK, gE + n4 * cK, cK, cK);
            }
            if (ci != null) {
                ab.a(t2, dg.ci.b[dg.ch].c, n2 + cK / 2 + dg.ci.b[dg.ch].a, n3 + cK / 2 + dg.ci.b[dg.ch].b, 0, 3);
                if (main.a.w % 2 == 0 && ++ch >= dg.ci.b.length) {
                    ch = 0;
                    ci = null;
                }
            }
            if (dJ && aJ != null) {
                cg cg2 = null;
                int n9 = 0;
                while (n9 < dg.aJ.c.size()) {
                    cg2 = (cg)dg.aJ.c.elementAt(n9);
                    if (cg2.c.a == 85) break;
                    cg2 = null;
                    ++n9;
                }
                if (cg2 != null) {
                    int[] nArray = new int[]{60, 45, 34, 26, 20, 15, 11, 8, 6};
                    int[] nArray2 = new int[]{150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035};
                    byte[] byArray = new byte[]{3, 5, 9, 4, 7, 10, 5, 7, 9};
                    dd.j.a(t2, String.valueOf(df.iv) + ": " + at.a(String.valueOf(cg2.a + 1)), gD + 1, gE + 114, 0);
                    dd.j.a(t2, String.valueOf(df.cX) + nArray[cg2.a] + "%)", gD + 70, gE + 114, 0);
                    dd.j.a(t2, String.valueOf(df.B) + ": " + at.a(String.valueOf(nArray2[cg2.a])) + " " + df.eB + ", " + byArray[cg2.a] + " " + (cg2.a < 3 ? df.iz[1] : (cg2.a < 6 ? df.iz[2] : df.iz[3])), gD + 1, gE + 126, 0);
                    return;
                }
                dd.l.a(t2, df.ir, gD + 1, gE + 120, 0);
                return;
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
    }

    private void c(t t2, String[] stringArray) {
        try {
            int n2;
            int n3;
            dg.b(t2);
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, stringArray[W], stringArray.length > 1);
            gD = ce + 3;
            gE = cd + 32;
            t2.a(6425);
            gK = 4;
            if (dz) {
                int n4 = 0;
                int n5 = 0;
                n3 = 0;
                n2 = 0;
                int n6 = 0;
                while (n6 < az.length) {
                    if (az[n6] != null) {
                        if (dg.az[n6].h) {
                            n2 = 1;
                        }
                        n4 += aX[dg.az[n6].b.a];
                        ++n5;
                    }
                    ++n6;
                }
                if (n4 > 0) {
                    n3 = aX.length - 1;
                    while (n3 >= 0) {
                        if (n4 > aX[n3]) break;
                        --n3;
                    }
                }
                if (n3 >= aX.length - 1) {
                    n3 = aX.length - 2;
                }
                if (cP) {
                    if (n5 > 1) {
                        dd.j.a(t2, String.valueOf(df.cS) + " " + (n3 + 2) + " " + (n2 != 0 ? df.M : ""), gD + 3, gE + gK * cK + 9, 0);
                        if (bb[n3 + 1] > bp.d().ar) {
                            dd.l.a(t2, df.a(df.cV, at.a(String.valueOf(bb[n3 + 1]))), gD + 3, gE + gK * cK + 21, 0);
                        } else {
                            dd.j.a(t2, df.a(df.cV, at.a(String.valueOf(bb[n3 + 1]))), gD + 3, gE + gK * cK + 21, 0);
                        }
                        dd.j.a(t2, String.valueOf(df.cW) + ": " + n4 * 100 / aX[n3 + 1] + "%", gD + 3, gE + gK * cK + 33, 0);
                    } else {
                        n6 = 1;
                        while (n6 <= 2) {
                            dd.i.a(t2, df.cO[n6], gD + 3, gE + gK * cK + 5 + (n6 - 1) * 12, 0);
                            ++n6;
                        }
                    }
                } else if (n5 > 1) {
                    dd.j.a(t2, String.valueOf(df.cS) + " " + (n3 + 2) + " " + df.M, gD + 3, gE + gK * cK + 9, 0);
                    if (bb[n3 + 1] > bp.d().ar + bp.d().at) {
                        dd.l.a(t2, df.a(df.cT, at.a(String.valueOf(bb[n3 + 1]))), gD + 3, gE + gK * cK + 21, 0);
                    } else {
                        dd.j.a(t2, df.a(df.cT, at.a(String.valueOf(bb[n3 + 1]))), gD + 3, gE + gK * cK + 21, 0);
                    }
                    dd.j.a(t2, String.valueOf(df.cW) + ": " + n4 * 100 / aX[n3 + 1] + "%", gD + 3, gE + gK * cK + 33, 0);
                } else {
                    n6 = 0;
                    while (n6 < 3) {
                        dd.i.a(t2, df.cO[n6], gD + 3, gE + gK * cK + 5 + n6 * 12, 0);
                        ++n6;
                    }
                }
            } else {
                dd.i.a(t2, df.ii[0], gD + 3, gE + gK * cK + 9, 0);
                dd.i.a(t2, df.ii[1], gD + 3, gE + gK * cK + 21, 0);
                dd.i.a(t2, df.ii[2], gD + 3, gE + gK * cK + 33, 0);
            }
            t2.a(0);
            t2.c(gD, gE, gJ * cK + 1, gK * cK + 1);
            int n7 = 0;
            while (n7 < gK) {
                int n8 = 0;
                while (n8 < gJ) {
                    ab.a(t2, 154, gD + n8 * cK + cK / 2, gE + n7 * cK + cK / 2, 0, 3);
                    t2.a(0xBB6611);
                    t2.b(gD + n8 * cK, gE + n7 * cK, cK, cK);
                    ++n8;
                }
                ++n7;
            }
            n7 = 0;
            while (n7 < az.length) {
                by by2 = az[n7];
                if (by2 != null) {
                    n3 = n7 / gJ;
                    n2 = n7 - n3 * gJ;
                    if (!by2.h) {
                        t2.a(0x455555);
                        t2.c(gD + n2 * cK + 1, gE + n3 * cK + 1, cK - 1, cK - 1);
                    }
                    ab.a(t2, by2.b.g, gD + n2 * cK + cK / 2, gE + n3 * cK + cK / 2, 0, 3);
                }
                ++n7;
            }
            if (cL > 0) {
                n7 = U / gJ;
                int n9 = U - n7 * gJ;
                t2.a(0xFFFFFF);
                t2.b(gD + n9 * cK, gE + n7 * cK, cK, cK);
            }
            if (ci != null) {
                ab.a(t2, dg.ci.b[dg.ch].c, gD + cK / 2 + dg.ci.b[dg.ch].a + 1, gE + cK / 2 + 9 + dg.ci.b[dg.ch].b, 0, 3);
                if (main.a.w % 2 == 0 && ++ch >= dg.ci.b.length) {
                    ch = 0;
                    ci = null;
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
     * Unable to fully structure code
     */
    private void p(t var1_1) {
        block12: {
            if (!dg.dG) break block12;
            dg.b(var1_1);
            ay.a(dg.ce, dg.cd, dg.cf, dg.cg, var1_1);
            var2_2 = dg.cf;
            if (main.a.j) {
                var2_2 = dg.cf / 2 + 20;
            }
            var1_1.a(0);
            var1_1.c(dg.ce + 7, dg.cd + 31, var2_2 - 14, dg.cg - 58);
            var1_1.a(-3170504);
            var1_1.b(dg.ce + 8, dg.cd + 32, var2_2 - 16, dg.cg - 60);
            var1_1.a(ay.a);
            var1_1.c(dg.ce + 9, dg.cd + 33, var2_2 - 18, dg.cg - 62);
            dg.a(var1_1, df.hQ, false);
            dg.gD = dg.ce + 33;
            dg.gE = dg.cd + 40;
            var2_2 = 0;
            while (var2_2 < 3) {
                var3_3 = 0;
                while (var3_3 < 3) {
                    var1_1.a(ay.c);
                    var1_1.c(dg.gD + var3_3 * 40, dg.gE + 10 + var2_2 * 40, 29, 29);
                    var1_1.a(-6527695);
                    var1_1.b(dg.gD + var3_3 * 40, dg.gE + 10 + var2_2 * 40, 29, 29);
                    var1_1.a(-6737152);
                    var1_1.c(dg.gD + var3_3 * 40 + 2, dg.gE + 12 + var2_2 * 40, 26, 26);
                    var1_1.a(ay.c);
                    var1_1.c(dg.gD + var3_3 * 40 + 4, dg.gE + 14 + var2_2 * 40, 22, 22);
                    ab.a(var1_1, 1414, dg.gD + var3_3 * 40 + 20 - 5, dg.gE + var2_2 * 40 + 20 + 4, 0, ch.g);
                    ++var3_3;
                }
                ++var2_2;
            }
            var2_2 = 0;
            while (var2_2 < 9) {
                block16: {
                    block18: {
                        block13: {
                            block19: {
                                block17: {
                                    block15: {
                                        block14: {
                                            var3_3 = var2_2 / 3;
                                            var4_4 = var2_2 - var3_3 * 3;
                                            if (dg.aG == null) break block13;
                                            var1_1.a(-16770791);
                                            var1_1.c(dg.gD + var4_4 * 40 + 4, dg.gE + 14 + var3_3 * 40, 22, 22);
                                            var1_1.a(var2_2 == dg.U ? -1 : -6527695);
                                            var1_1.b(dg.gD + var4_4 * 40 + 4, dg.gE + 14 + var3_3 * 40, 21, 21);
                                            ab.a(var1_1, 154, dg.gD + var4_4 * 40 + 17 - 3, dg.gE + 7 + var3_3 * 40 + 17, 0, 3);
                                            if (System.currentTimeMillis() - this.bJ >= 1000L) break block14;
                                            if (var2_2 == dg.X) {
                                                ab.a(var1_1, e.b(dg.aG[dg.X]), dg.gD + var4_4 * 40 + 17 - 3, dg.gE + 7 + var3_3 * 40 + 17, 0, 3);
                                            } else {
                                                ab.a(var1_1, 1414, dg.gD + var4_4 * 40 + 17 - 2, dg.gE + 7 + var3_3 * 40 + 17, 0, ch.g);
                                            }
                                            break block15;
                                        }
                                        if (dg.aG[var2_2] < 0) ** GOTO lbl-1000
                                        var5_5 = e.a;
                                        if (dg.aG[var2_2] >= var5_5.a.size()) lbl-1000:
                                        // 2 sources

                                        {
                                            ab.a(var1_1, e.b((short)242), dg.gD + var4_4 * 40 + 17 - 3, dg.gE + 7 + var3_3 * 40 + 17, 0, 3);
                                        } else {
                                            ab.a(var1_1, e.b(dg.aG[var2_2]), dg.gD + var4_4 * 40 + 17 - 3, dg.gE + 7 + var3_3 * 40 + 17, 0, 3);
                                        }
                                    }
                                    if (dg.X == var2_2 && this.bL > 0) {
                                        this.bN[var2_2] = String.valueOf(this.bL);
                                    }
                                    if (dg.cL != 1) break block16;
                                    if (dg.X != var2_2 || main.a.w % 10 <= 4) break block17;
                                    v0 = var1_1;
                                    v1 = -3368653;
                                    break block18;
                                }
                                if (var2_2 != dg.U) break block19;
                                v0 = var1_1;
                                v1 = -1;
                                break block18;
                            }
                            v0 = var1_1;
                            ** GOTO lbl-1000
                        }
                        if (dg.cL == 1) {
                            v0 = var1_1;
                            ** if (var2_2 != dg.U) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                v1 = -1;
                                ** GOTO lbl80
                            }
                        }
                        break block16;
lbl-1000:
                        // 2 sources

                        {
                            v1 = ay.b;
                        }
                    }
                    v0.a(v1);
                    var1_1.b(dg.gD + var4_4 * 40, dg.gE + 10 + var3_3 * 40, 29, 29);
                }
                ++var2_2;
            }
            dd.j.a(var1_1, String.valueOf(df.hR) + this.aH, dg.ce + dg.cf / 2, dg.cd + dg.cg - 20, 2);
        }
    }

    private void q(t t2) {
        if (ds) {
            if (W == 0) {
                this.a(t2, df.cs, aq);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cs);
            }
        }
    }

    private void r(t t2) {
        if (dt) {
            if (W == 0) {
                this.a(t2, df.ct, ar);
                return;
            }
            if (W == 1) {
                this.a(t2, df.ct);
            }
        }
    }

    private void s(t t2) {
        if (du) {
            if (W == 0) {
                this.a(t2, df.cu, as);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cu);
            }
        }
    }

    private void t(t t2) {
        if (dv) {
            if (W == 0) {
                this.a(t2, df.cv, at);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cv);
            }
        }
    }

    private void u(t t2) {
        block40: {
            block41: {
                block39: {
                    if (!dw) break block40;
                    if (W != 0) break block41;
                    Object object = df.cw;
                    try {
                        int n2;
                        int n3;
                        int n4;
                        int n5;
                        block44: {
                            block42: {
                                int n6;
                                block46: {
                                    block45: {
                                        block43: {
                                            gK = 3;
                                            ay.a(ce, cd, cf, cg, t2);
                                            dg.a(t2, object[W], ((String[])object).length > 1);
                                            gD = ce + 3;
                                            gE = cd + 34 + cK;
                                            n5 = ce + 45;
                                            n4 = ce + 100;
                                            n3 = gE - cK - 3;
                                            if (aI != null) {
                                                this.a(t2, aI, n5, n3);
                                                t2.a(0xBB6611);
                                                t2.b(n5, n3, cK, cK);
                                                dd.j.a(t2, "(+" + dg.aI.j + ")", n5 - 5, n3 + cK / 2 - 5, 1);
                                            } else {
                                                t2.a(6425);
                                                t2.c(n5 - 1, n3 - 1, cK + 3, cK + 3);
                                                ab.a(t2, 154, n5 + cK / 2, n3 + cK / 2, 0, 3);
                                                t2.a(0xBB6611);
                                                t2.b(n5, n3, cK, cK);
                                            }
                                            ab.a(t2, 942, n5 + 43, gE - 15, 0, ch.g);
                                            if (aI != null && !aI.p()) {
                                                this.a(t2, aI, n4, n3, 1, 0);
                                                t2.a(0xBB6611);
                                                t2.b(n4, n3, cK, cK);
                                                dd.j.a(t2, "(+" + (dg.aI.j + 1) + ")", n4 + cK + 10, n3 + cK / 2 - 5, 0);
                                            } else {
                                                t2.a(6425);
                                                t2.c(n4 - 1, n3 - 1, cK + 3, cK + 3);
                                                ab.a(t2, 154, n4 + cK / 2, n3 + cK / 2, 0, 3);
                                                t2.a(0xBB6611);
                                                t2.b(n4, n3, cK, cK);
                                            }
                                            if (cL == 1) {
                                                if (U == 0) {
                                                    t2.a(0xFFFFFF);
                                                    t2.b(n5, n3, cK, cK);
                                                }
                                                if (U == 1) {
                                                    t2.a(0xFFFFFF);
                                                    t2.b(n4, n3, cK, cK);
                                                }
                                            }
                                            if (aI == null) break block42;
                                            if (!aI.p()) break block43;
                                            if (!main.a.j) {
                                                dd.j.a(t2, df.cP[3], ce + cf / 2, gE + gK * cK + 5, 2);
                                            } else {
                                                dd.j.a(t2, df.cP[3], ce + 7, gE + gK * cK + 5, 0);
                                            }
                                            break block44;
                                        }
                                        n6 = 0;
                                        n4 = 0;
                                        while (n4 < aA.length) {
                                            if (aA[n4] != null && dg.aA[n4].b.b == 26) {
                                                n6 += aX[dg.aA[n4].b.a];
                                            }
                                            ++n4;
                                        }
                                        n2 = 0;
                                        if (!aI.r()) break block45;
                                        n4 = n6 * 100 / aY[dg.aI.j];
                                        if (n4 > bf[dg.aI.j]) {
                                            n4 = bf[dg.aI.j];
                                        }
                                        if (dy) {
                                            n4 = (int)((double)n4 * 1.5);
                                            n2 = bg[dg.aI.j];
                                        }
                                        if (bc[dg.aI.j] > bp.d().ar + bp.d().at) {
                                            dd.l.a(t2, df.a(df.cT, at.a(String.valueOf(bc[dg.aI.j]))), gD, gE + gK * cK + 5, 0);
                                        } else {
                                            dd.j.a(t2, df.a(df.cT, at.a(String.valueOf(bc[dg.aI.j]))), gD, gE + gK * cK + 5, 0);
                                        }
                                        if (n2 > bp.d().au) {
                                            dd.l.a(t2, df.a(df.cU, String.valueOf(n2)), gD, gE + gK * cK + 17, 0);
                                        } else {
                                            dd.j.a(t2, df.a(df.cU, String.valueOf(n2)), gD, gE + gK * cK + 17, 0);
                                        }
                                        dd.j.a(t2, String.valueOf(df.cW) + ": " + n4 + "%", gD, gE + gK * cK + 29, 0);
                                        break block44;
                                    }
                                    if (!aI.s()) break block46;
                                    n4 = n6 * 100 / aZ[dg.aI.j];
                                    if (n4 > bf[dg.aI.j]) {
                                        n4 = bf[dg.aI.j];
                                    }
                                    if (dy) {
                                        n4 = (int)((double)n4 * 1.5);
                                        n2 = bg[dg.aI.j];
                                    }
                                    if (bd[dg.aI.j] > bp.d().ar + bp.d().at) {
                                        dd.l.a(t2, df.a(df.cT, at.a(String.valueOf(bd[dg.aI.j]))), gD, gE + gK * cK + 5, 0);
                                    } else {
                                        dd.j.a(t2, df.a(df.cT, at.a(String.valueOf(bd[dg.aI.j]))), gD, gE + gK * cK + 5, 0);
                                    }
                                    if (n2 > bp.d().au) {
                                        dd.l.a(t2, df.a(df.cU, String.valueOf(n2)), gD, gE + gK * cK + 17, 0);
                                    } else {
                                        dd.j.a(t2, df.a(df.cU, String.valueOf(n2)), gD, gE + gK * cK + 17, 0);
                                    }
                                    dd.j.a(t2, String.valueOf(df.cW) + ": " + n4 + "%", gD, gE + gK * cK + 29, 0);
                                    break block44;
                                }
                                if (!aI.t()) break block44;
                                n4 = n6 * 100 / ba[dg.aI.j];
                                if (n4 > bf[dg.aI.j]) {
                                    n4 = bf[dg.aI.j];
                                }
                                if (dy) {
                                    n4 = (int)((double)n4 * 1.5);
                                    n2 = bg[dg.aI.j];
                                }
                                if (be[dg.aI.j] > bp.d().ar + bp.d().at) {
                                    dd.l.a(t2, df.a(df.cT, at.a(String.valueOf(be[dg.aI.j]))), gD, gE + gK * cK + 5, 0);
                                } else {
                                    dd.j.a(t2, df.a(df.cT, at.a(String.valueOf(be[dg.aI.j]))), gD, gE + gK * cK + 5, 0);
                                }
                                if (n2 > bp.d().au) {
                                    dd.l.a(t2, df.a(df.cU, String.valueOf(n2)), gD, gE + gK * cK + 17, 0);
                                } else {
                                    dd.j.a(t2, df.a(df.cU, String.valueOf(n2)), gD, gE + gK * cK + 17, 0);
                                }
                                dd.j.a(t2, String.valueOf(df.cW) + ": " + n4 + "%", gD, gE + gK * cK + 29, 0);
                                break block44;
                            }
                            int n7 = 0;
                            while (n7 < 3) {
                                dd.i.a(t2, df.cP[n7], gD, gE + gK * cK + 5 + n7 * 12, 0);
                                ++n7;
                            }
                        }
                        t2.a(0);
                        t2.c(gD - 1, gE - 1, gJ * cK + 3, gK * cK + 3);
                        int n8 = 0;
                        while (n8 < gK) {
                            n4 = 0;
                            while (n4 < gJ) {
                                ab.a(t2, 154, gD + n4 * cK + cK / 2, gE + n8 * cK + cK / 2, 0, 3);
                                t2.a(0xBB6611);
                                t2.b(gD + n4 * cK, gE + n8 * cK, cK, cK);
                                ++n4;
                            }
                            ++n8;
                        }
                        if (cL == 2) {
                            n8 = U / gJ;
                            n4 = U - n8 * gJ;
                            t2.a(0xFFFFFF);
                            t2.b(gD + n4 * cK, gE + n8 * cK, cK, cK);
                        }
                        n8 = 0;
                        while (n8 < aA.length) {
                            by by2 = aA[n8];
                            if (by2 != null) {
                                n2 = n8 / gJ;
                                int n9 = n8 - n2 * gJ;
                                if (!by2.h) {
                                    t2.a(12083);
                                    t2.c(gD + n9 * cK + 1, gE + n2 * cK + 1, cK - 1, cK - 1);
                                }
                                ab.a(t2, by2.b.g, gD + n9 * cK + cK / 2, gE + n2 * cK + cK / 2, 0, 3);
                            }
                            ++n8;
                        }
                        if (ci == null) break block39;
                        ab.a(t2, dg.ci.b[dg.ch].c, n5 + cK / 2 + dg.ci.b[dg.ch].a + 1, n3 + cK / 2 + 9 + dg.ci.b[dg.ch].b, 0, 3);
                        if (main.a.w % 2 != 0 || ++ch < dg.ci.b.length) break block39;
                        ch = 0;
                        ci = null;
                        break block40;
                    }
                    catch (Exception exception) {
                        object = exception;
                        exception.printStackTrace();
                    }
                }
                return;
            }
            if (W == 1) {
                this.a(t2, df.cw);
            }
        }
    }

    private void v(t t2) {
        if (aN) {
            if (W == 0) {
                String[] stringArray = df.cx;
                try {
                    gK = 5;
                    ay.a(ce, cd, cf, cg, t2);
                    this.a(t2, stringArray, false);
                    t2.a(0x662200);
                    t2.c(ce + 3, cd + 32, 168, 140);
                    t2.a(0xCC9933);
                    t2.b(ce + 3, cd + 32, 168, 140);
                    int n2 = ce + 74;
                    int n3 = cd + 40 + cK;
                    dd.i.a(t2, df.fU, n2 + cK / 2, n3 - cK / 2 - 4, 2);
                    if (aK != null) {
                        t2.a(6425);
                        t2.c(n2 - 1, n3 - 1, cK + 3, cK + 3);
                        ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
                        this.a(t2, aK, n2, n3);
                        if (dg.aK.f > 1) {
                            dd.p.a(t2, String.valueOf(dg.aK.f), n2 + cK, n3 + cK / 2 + 6, 1);
                        }
                        t2.a(cL == 1 ? 0xFFFFFF : 0xBB6611);
                        t2.b(n2, n3, cK, cK);
                    } else {
                        t2.a(6425);
                        t2.c(n2 - 1, n3 - 1, cK + 3, cK + 3);
                        ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
                        t2.a(0xBB6611);
                        t2.b(n2, n3, cK, cK);
                    }
                    dd.i.a(t2, df.fV, n2 + cK / 2, n3 + 3 * cK / 2 + 2, 2);
                    if (bp.d().ar < 5000) {
                        dd.l.a(t2, df.hF, n2 + cK / 2, cd + cg - 25, 2);
                        dd.l.a(t2, df.hG, n2 + cK / 2, cd + cg - 13, 2);
                    } else {
                        dd.i.a(t2, df.hF, n2 + cK / 2, cd + cg - 25, 2);
                        dd.i.a(t2, df.hG, n2 + cK / 2, cd + cg - 13, 2);
                    }
                    this.ed.a = ce + 40;
                    this.ed.b = cd + 130;
                    this.ed.a(t2);
                }
                catch (Exception exception) {
                    stringArray = exception;
                    exception.printStackTrace();
                    return;
                }
            } else if (W == 1) {
                this.a(t2, df.cx);
            }
        }
    }

    private void w(t t2) {
        block18: {
            if (dx) {
                if (W == 0) {
                    block17: {
                        Object object = df.cy;
                        try {
                            gK = 3;
                            ay.a(ce, cd, cf, cg, t2);
                            dg.a(t2, object[W], ((String[])object).length > 1);
                            gD = ce + 3;
                            gE = cd + 34 + cK;
                            int n2 = ce + 45;
                            int n3 = ce + 100;
                            int n4 = gE - cK - 3;
                            if (aE[0] != null) {
                                this.a(t2, aE[0], n2, n4);
                                t2.a(0xBB6611);
                                t2.b(n2, n4, cK, cK);
                                dd.j.a(t2, "(+" + dg.aE[0].j + ")", n2 - 5, n4 + cK / 2 - 5, 1);
                            } else {
                                t2.a(6425);
                                t2.c(n2 - 1, n4 - 1, cK + 3, cK + 3);
                                ab.a(t2, 154, n2 + cK / 2, n4 + cK / 2, 0, 3);
                                t2.a(0xBB6611);
                                t2.b(n2, n4, cK, cK);
                            }
                            ab.a(t2, 942, n2 + 43, gE - 15, 0, ch.g);
                            if (aE[1] != null) {
                                by by2 = aE[1].a();
                                if (aE[0] != null && dg.aE[0].b.b == by2.b.b && dg.aE[1].b.f >= dg.aE[0].b.f) {
                                    by2.j = dg.aE[0].j;
                                }
                                this.a(t2, by2, n3, n4);
                                t2.a(0xBB6611);
                                t2.b(n3, n4, cK, cK);
                                dd.j.a(t2, "(+" + by2.j + ")", n3 + cK + 10, n4 + cK / 2 - 5, 0);
                            } else {
                                t2.a(6425);
                                t2.c(n3 - 1, n4 - 1, cK + 3, cK + 3);
                                ab.a(t2, 154, n3 + cK / 2, n4 + cK / 2, 0, 3);
                                t2.a(0xBB6611);
                                t2.b(n3, n4, cK, cK);
                            }
                            if (cL == 1) {
                                if (U == 0) {
                                    t2.a(0xFFFFFF);
                                    t2.b(n2, n4, cK, cK);
                                }
                                if (U == 1) {
                                    t2.a(0xFFFFFF);
                                    t2.b(n3, n4, cK, cK);
                                }
                            }
                            t2.a(0);
                            t2.c(gD - 1, gE - 1, gJ * cK + 3, gK * cK + 3);
                            int n5 = 0;
                            while (n5 < gK) {
                                int n6 = 0;
                                while (n6 < gJ) {
                                    ab.a(t2, 154, gD + n6 * cK + cK / 2, gE + n5 * cK + cK / 2, 0, 3);
                                    t2.a(0xBB6611);
                                    t2.b(gD + n6 * cK, gE + n5 * cK, cK, cK);
                                    ++n6;
                                }
                                ++n5;
                            }
                            by by3 = aE[2];
                            if (by3 != null) {
                                int n7 = 0 / gJ;
                                n2 = 0 - n7 * gJ;
                                if (!by3.h) {
                                    t2.a(12083);
                                    t2.c(gD + n2 * cK + 1, gE + n7 * cK + 1, cK - 1, cK - 1);
                                }
                                ab.a(t2, by3.b.g, gD + n2 * cK + cK / 2, gE + n7 * cK + cK / 2, 0, 3);
                            }
                            dd.i.a(t2, "- " + df.bQ[0], gD, gE + gK * cK + 10, 0);
                            dd.i.a(t2, "  " + df.bQ[1], gD, gE + gK * cK + 22, 0);
                            dd.i.a(t2, "- " + df.bQ[2], gD, gE + gK * cK + 34, 0);
                            if (cL != 2) break block17;
                            int n8 = U / gJ;
                            n2 = U - n8 * gJ;
                            t2.a(0xFFFFFF);
                            t2.b(gD + n2 * cK, gE + n8 * cK, cK, cK);
                            break block18;
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                    }
                    return;
                }
                if (W == 1) {
                    this.a(t2, df.cw);
                }
            }
        }
    }

    private void x(t t2) {
        if (dB) {
            if (W == 0) {
                this.b(t2, df.cD);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cD);
            }
        }
    }

    private void y(t t2) {
        if (dK) {
            if (W == 0) {
                this.b(t2, df.cG);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cG);
            }
        }
    }

    private void z(t t2) {
        if (dJ) {
            if (W == 0) {
                this.b(t2, df.cH);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cH);
            }
        }
    }

    private void A(t t2) {
        block42: {
            if (aS) {
                if (W == 0) {
                    block43: {
                        Object object = df.cE;
                        try {
                            int n2;
                            int n3;
                            ay.a(ce, cd, cf, cg, t2);
                            dg.a(t2, object[W], ((String[])object).length > 1);
                            gD = ce + 3;
                            gE = cd + 45;
                            gK = 4;
                            dd.j.a(t2, bp.d().ab, gD + 1, gE - 12, 0);
                            int n4 = gD;
                            int n5 = 0;
                            while (n5 < 3) {
                                if (n5 == this.bh) {
                                    dd.h.a(t2, String.valueOf(n5 + 1), n4 + 2 + n5 * 20, gE + gK * (cK + 3) + 8, 0);
                                } else {
                                    dd.k.a(t2, String.valueOf(n5 + 1), n4 + 2 + n5 * 20, gE + gK * (cK + 3) + 8, 0);
                                }
                                if (n5 < 2) {
                                    ab.a(t2, 942, n4 + 14 + n5 * 20, gE + gK * (cK + 3) + 13, 0, ch.g);
                                }
                                ++n5;
                            }
                            dd.i.a(t2, String.valueOf(at.a(String.valueOf(this.bj))) + " " + df.eA, gD, gE + gK * cK + 4, 0);
                            if (this.bh == 0) {
                                t2.a(0);
                            }
                            if (this.bh == 1) {
                                t2.a(210986);
                            }
                            if (this.bh == 2) {
                                t2.a(805690);
                            }
                            t2.c(gD - 1, gE - 1, cK * 3 + 3, (cK << 2) + 3);
                            n5 = 0;
                            while (n5 < gK) {
                                n4 = 0;
                                while (n4 < 3) {
                                    ab.a(t2, 154, gD + n4 * cK + cK / 2, gE + n5 * cK + cK / 2, 0, 3);
                                    t2.a(0xBB6611);
                                    t2.b(gD + n4 * cK, gE + n5 * cK, cK, cK);
                                    ++n4;
                                }
                                ++n5;
                            }
                            if (cL == 1) {
                                n5 = U / 3;
                                n4 = U - n5 * 3;
                                t2.a(0xFFFFFF);
                                t2.b(gD + n4 * cK, gE + n5 * cK, cK, cK);
                            }
                            if (aC != null) {
                                n5 = 0;
                                while (n5 < aC.length) {
                                    by by2 = aC[n5];
                                    if (by2 != null) {
                                        n3 = n5 / 3;
                                        n2 = n5 - n3 * 3;
                                        if (!by2.h) {
                                            t2.a(12083);
                                            t2.c(gD + n2 * cK + 1, gE + n3 * cK + 1, cK - 1, cK - 1);
                                        }
                                        if (main.a.w % 6 == 0) {
                                            by2.a = (by2.a + 1) % 3;
                                        }
                                        if (by2.u()) {
                                            t2.a(main.a.Y, gD + n2 * cK + cK / 2, gE + n3 * cK + cK / 2, 3);
                                        }
                                        ab.a(t2, by2.b.g, gD + n2 * cK + cK / 2, gE + n3 * cK + cK / 2, 0, 3, by2.a);
                                        if (by2.f > 1) {
                                            dd.p.a(t2, String.valueOf(by2.f), gD + n2 * cK + cK, gE + n3 * cK + cK - dd.p.c(), 1);
                                        }
                                        if (by2.f > 1) {
                                            dd.p.a(t2, String.valueOf(by2.f), gD + n2 * cK + cK, gE + n3 * cK + cK - dd.p.c(), 1);
                                        }
                                    }
                                    ++n5;
                                }
                            }
                            gD = ce + cf - 2 - cK * 3;
                            gK = 4;
                            dd.j.a(t2, this.bE, ce + cf - 2, gE - 12, 1);
                            int n6 = ce + cf - 3 - 60;
                            n5 = 0;
                            while (n5 < 3) {
                                if (n5 == this.bi) {
                                    dd.h.a(t2, String.valueOf(n5 + 1), n6 + 2 + n5 * 20, gE + gK * (cK + 3) + 8, 0);
                                } else {
                                    dd.k.a(t2, String.valueOf(n5 + 1), n6 + 2 + n5 * 20, gE + gK * (cK + 3) + 8, 0);
                                }
                                if (n5 < 2) {
                                    ab.a(t2, 942, n6 + 14 + n5 * 20, gE + gK * (cK + 3) + 13, 0, ch.g);
                                }
                                ++n5;
                            }
                            dd.i.a(t2, String.valueOf(at.a(String.valueOf(this.bk))) + " " + df.eA, ce + cf - 2, gE + gK * cK + 4, 1);
                            if (this.bi == 0) {
                                t2.a(0);
                            }
                            if (this.bi == 1) {
                                t2.a(210986);
                            }
                            if (this.bi == 2) {
                                t2.a(805690);
                            }
                            t2.c(gD - 1, gE - 1, cK * 3 + 3, (cK << 2) + 3);
                            n5 = 0;
                            while (n5 < gK) {
                                n6 = 0;
                                while (n6 < 3) {
                                    ab.a(t2, 154, gD + n6 * cK + cK / 2, gE + n5 * cK + cK / 2, 0, 3);
                                    t2.a(0xBB6611);
                                    t2.b(gD + n6 * cK, gE + n5 * cK, cK, cK);
                                    ++n6;
                                }
                                ++n5;
                            }
                            if (cL == 2) {
                                n5 = U / 3;
                                n6 = U - n5 * 3;
                                t2.a(0xFFFFFF);
                                t2.b(gD + n6 * cK, gE + n5 * cK, cK, cK);
                            }
                            if (aD != null) {
                                n5 = 0;
                                while (n5 < aD.length) {
                                    by by3 = aD[n5];
                                    if (by3 != null) {
                                        n3 = n5 / 3;
                                        n2 = n5 - n3 * 3;
                                        if (!by3.h) {
                                            t2.a(12083);
                                            t2.c(gD + n2 * cK + 1, gE + n3 * cK + 1, cK - 1, cK - 1);
                                        }
                                        if (main.a.w % 6 == 0) {
                                            by3.a = (by3.a + 1) % 3;
                                        }
                                        if (by3.u()) {
                                            t2.a(main.a.Y, gD + n2 * cK + cK / 2, gE + n3 * cK + cK / 2, 3);
                                        }
                                        ab.a(t2, by3.b.g, gD + n2 * cK + cK / 2, gE + n3 * cK + cK / 2, 0, 3, by3.a);
                                        if (by3.f > 1) {
                                            dd.p.a(t2, String.valueOf(by3.f), gD + n2 * cK + cK, gE + n3 * cK + cK - dd.p.c(), 1);
                                        }
                                        if (by3.f > 1) {
                                            dd.p.a(t2, String.valueOf(by3.f), gD + n2 * cK + cK, gE + n3 * cK + cK - dd.p.c(), 1);
                                        }
                                    }
                                    ++n5;
                                }
                            }
                            if (this.bl - (n5 = (int)(System.currentTimeMillis() / 1000L)) > 0 && this.bh == 1 && this.bi == 1) {
                                dd.i.a(t2, String.valueOf(df.z) + " " + (this.bl - n5) + " " + df.eY, ce + cf / 2, cd + cg - 13, 2);
                                break block42;
                            }
                            if (this.bh != 0) break block43;
                            dd.i.a(t2, df.bZ, ce + cf / 2, cd + cg - 13, 2);
                            break block42;
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                    }
                    return;
                }
                if (W == 1) {
                    this.a(t2, df.cE);
                }
            }
        }
    }

    private void B(t t2) {
        if (dz) {
            if (W == 0) {
                this.c(t2, df.cz);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cz);
            }
        }
    }

    private void C(t t2) {
        if (dI) {
            if (W == 0) {
                this.c(t2, df.cF);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cF);
            }
        }
    }

    private void D(t t2) {
        if (dA) {
            if (W == 0) {
                String[] stringArray = df.cA;
                try {
                    dg.b(t2);
                    ((dg)((Object)exception2)).a(t2, stringArray, false);
                    if (bp.d().aC == null) {
                        main.a.a(ce + 90, cd + 75, t2, false);
                        dd.e.a(t2, df.y, ce + 90, cd + 90, 2);
                    }
                    dd.i.a(t2, String.valueOf(df.bU) + ": " + at.a(String.valueOf(bp.d().as)), ce + cf / 2, cd + cg - 18, 2);
                    super.a(t2, bp.d().aC);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    return;
                }
            } else if (W == 1) {
                ((dg)((Object)exception2)).a(t2, df.cA);
            }
        }
    }

    private void E(t t2) {
        if (W != 2) {
            return;
        }
        t2.a(-t2.a(), -t2.b());
        ay.a(ce, cd, cf, cg, t2);
        dg.a(t2, df.cg[W], true);
        dd.o.a(t2, df.ec, ce + 10, cd + 33, 0);
        dd.o.a(t2, "" + bp.d().F, ce + cf - 10, cd + 33, 1);
        int n2 = (cg - 80) / 5;
        int n3 = 0;
        while (n3 < bp.d().aa.length) {
            t2.a(ay.d);
            if (cL > 0 && cL - 1 == n3) {
                t2.a(ay.c);
                t2.c(ce + 5, cd + 52 + n3 * (n2 + 4), cf - 10, n2);
                t2.a(ay.e);
            }
            t2.b(ce + 5, cd + 52 + n3 * (n2 + 4), cf - 10, n2);
            dd.e.a(t2, "" + bp.d().aa[n3], ce + cf - 10, cd + 52 + (n2 - 10) / 2 + n3 * (n2 + 4), 1);
            dd.e.a(t2, df.dV[n3], ce + 10, cd + 52 + (n2 - 10) / 2 + n3 * (n2 + 4), 0);
            ++n3;
        }
        if (cL > 0) {
            switch (bp.d().av.a) {
                case 0: {
                    dd.n.a(t2, df.gE[0], ce + 10, cd + 52 + (n2 - 10) / 2 + 4 * (n2 + 4), 0);
                    return;
                }
                case 1: 
                case 3: 
                case 5: {
                    dd.n.a(t2, df.gF[cL - 1], ce + 10, cd + 52 + (n2 - 10) / 2 + 4 * (n2 + 4), 0);
                    return;
                }
                case 2: 
                case 4: 
                case 6: {
                    dd.n.a(t2, df.gG[cL - 1], ce + 10, cd + 52 + (n2 - 10) / 2 + 4 * (n2 + 4), 0);
                }
            }
        }
    }

    private static by k(int n2) {
        block66: {
            try {
                if (U >= 0) break block66;
                return null;
            }
            catch (Exception exception) {}
        }
        switch (n2) {
            case 3: {
                return bp.d().aB[U];
            }
            case 4: {
                return bp.d().aC[U];
            }
            case 5: {
                return dg.aV.aD[U + fJ];
            }
            case 20: {
                if (ab.length > U) {
                    return ab[U];
                }
                return null;
            }
            case 21: {
                if (ac.length > U) {
                    return ac[U];
                }
                return null;
            }
            case 22: {
                if (ad.length > U) {
                    return ad[U];
                }
                return null;
            }
            case 23: {
                if (ae.length > U) {
                    return ae[U];
                }
                return null;
            }
            case 24: {
                if (af.length > U) {
                    return af[U];
                }
                return null;
            }
            case 25: {
                if (ag.length > U) {
                    return ag[U];
                }
                return null;
            }
            case 26: {
                if (ah.length > U) {
                    return ah[U];
                }
                return null;
            }
            case 27: {
                if (ai.length > U) {
                    return ai[U];
                }
                return null;
            }
            case 28: {
                if (aj.length > U) {
                    return aj[U];
                }
                return null;
            }
            case 29: {
                if (ak.length > U) {
                    return ak[U];
                }
                return null;
            }
            case 16: {
                if (al.length > U) {
                    return al[U];
                }
                return null;
            }
            case 17: {
                if (am.length > U) {
                    return am[U];
                }
                return null;
            }
            case 18: {
                if (an.length > U) {
                    return an[U];
                }
                return null;
            }
            case 19: {
                if (ao.length > U) {
                    return ao[U];
                }
                return null;
            }
            case 2: {
                if (ap.length > U) {
                    return ap[U];
                }
                return null;
            }
            case 6: {
                if (aq.length > U) {
                    return aq[U];
                }
                return null;
            }
            case 7: {
                if (ar.length > U) {
                    return ar[U];
                }
                return null;
            }
            case 8: {
                if (as.length > U) {
                    return as[U];
                }
                return null;
            }
            case 9: {
                if (at.length > U) {
                    return at[U];
                }
                return null;
            }
            case 14: {
                if (au.length > U) {
                    return au[U];
                }
                return null;
            }
            case 35: {
                if (av.length > U) {
                    return av[U];
                }
                return null;
            }
            case 15: {
                if (ax.length > U) {
                    return ax[U];
                }
                return null;
            }
            case 52: {
                if (ay.length > U) {
                    return ay[U];
                }
                return null;
            }
            case 32: {
                if (ay.length > U) {
                    return ay[U];
                }
                return null;
            }
            case 11: {
                return az[U];
            }
            case 43: {
                return az[U];
            }
            case 44: {
                return aB[U];
            }
            case 45: {
                return aB[U];
            }
            case 10: {
                return aA[U];
            }
            case 34: {
                if (aw.length > U) {
                    return aw[U];
                }
                return null;
            }
            case 46: {
                return aB[U];
            }
            case 47: {
                return aA[U];
            }
            case 48: {
                return aB[U];
            }
        }
        return null;
    }

    public static void D() {
        af.d();
    }

    private static void a(t t2, String string, boolean bl2) {
        int n2 = 0;
        if (!ck.equals("")) {
            string = ck;
        }
        n2 = b / 2;
        t2.a(ay.c);
        t2.b(n2 - dd.o.a(string) / 2 - 12, cd + 4, dd.o.a(string) + 22, 24, 6, 6);
        if ((cL == 0 || main.a.g) && bl2) {
            ab.a(t2, 989, n2 - dd.o.a(string) / 2 - 15 - 7 - (main.a.w % 8 <= 3 ? 2 : 0), cd + 16, 2, ch.g);
            ab.a(t2, 989, n2 + dd.o.a(string) / 2 + 15 + 5 + (main.a.w % 8 <= 3 ? 2 : 0), cd + 16, 0, ch.g);
        }
        if (cL == 0) {
            t2.a(ay.e);
        } else {
            t2.a(ay.d);
        }
        t2.a(n2 - dd.o.a(string) / 2 - 12, cd + 4, dd.o.a(string) + 22, 24, 6, 6);
        dd.o.a(t2, string, n2, cd + 9, 2);
    }

    private void F(t t2) {
        if (!dD) {
            return;
        }
        dg.b(t2);
        this.a(t2, new String[]{df.fC}, false);
        dd.j.a(t2, af.k, ce + cf / 2, cd + cg - 25, 2);
        if (U >= 0 && U < this.dU.length) {
            dd.i.a(t2, String.valueOf(df.fD) + ": " + this.dU[U] + ", " + df.fE + ": " + this.dV[U], ce + cf / 2, cd + cg - 13, 2);
        }
        int n2 = U / this.dT;
        int n3 = U % this.dT;
        gK = this.dU.length / this.dT;
        if (this.dU.length % this.dT > 0) {
            ++gK;
        }
        if (gK < 5) {
            gK = 5;
        }
        aa.a(gK, cK, gD, gE, gJ * cK + 2, 5 * cK + 2, true, 6);
        aa.a(t2);
        int n4 = 0;
        int n5 = 0;
        while (n5 < gK) {
            int n6 = 0;
            while (n6 < this.dT) {
                t2.a(0xBB6611);
                t2.b(gD + n6 * cK, gE + n5 * cK, cK, cK);
                if (n4 < this.dU.length) {
                    ab.a(t2, 154, gD + n6 * cK + cK / 2, gE + n5 * cK + cK / 2, 0, 3);
                    if (this.dU[n4] >= 20) {
                        dd.a.a(t2, "" + n4, gD + n6 * cK + cK / 2, gE + n5 * cK + cK / 2 - 4, 2);
                    } else if (this.dU[n4] >= 15) {
                        dd.d.a(t2, "" + n4, gD + n6 * cK + cK / 2, gE + n5 * cK + cK / 2 - 4, 2);
                    } else {
                        dd.e.a(t2, "" + n4, gD + n6 * cK + cK / 2, gE + n5 * cK + cK / 2 - 4, 2);
                    }
                    ++n4;
                }
                ++n6;
            }
            ++n5;
        }
        if (U >= 0) {
            t2.a(0xFFFFFF);
            t2.b(gD + n3 * cK, gE + n2 * cK, cK, cK);
        }
    }

    private static void aQ() {
        int n2 = 0;
        int n3 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        int n4 = 0;
        while (n4 < az.length) {
            if (az[n4] != null) {
                ++n2;
                n3 += aX[dg.az[n4].b.a];
                if (dg.az[n4].b.a == 11) {
                    main.a.K.a(df.fi, null, new bd(df.H, 1), null);
                    br br2 = main.a.K;
                    main.a.J = br2;
                    return;
                }
            }
            if (az[n4] != null && dg.az[n4].h) {
                bl2 = true;
            }
            if (az[n4] != null && !dg.az[n4].h) {
                bl3 = true;
            }
            ++n4;
        }
        if (n2 <= 1) {
            main.a.K.a(df.fe, null, new bd(df.H, 1), null);
            br br3 = main.a.K;
            main.a.J = br3;
            return;
        }
        n4 = aX.length - 1;
        while (n4 >= 0) {
            if (n3 > aX[n4]) break;
            --n4;
        }
        if (n4 >= aX.length - 1) {
            n4 = aX.length - 2;
        }
        if (cP) {
            if (bb[n4 + 1] > bp.d().ar) {
                main.a.K.a(df.fk, null, new bd(df.H, 1), null);
                br br4 = main.a.K;
                main.a.J = br4;
                return;
            }
            if (bl2) {
                main.a.a(df.fj, 88813, az, 8882, null);
                return;
            }
            dq.a().a(az);
            return;
        }
        if (bb[n4 + 1] > bp.d().ar + bp.d().at) {
            main.a.K.a(df.fk, null, new bd(df.H, 1), null);
            br br5 = main.a.K;
            main.a.J = br5;
            return;
        }
        if (bl3) {
            main.a.a(df.fj, 88814, az, 8882, null);
            return;
        }
        dq.a().b(az);
    }

    private static void aR() {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (n6 < az.length) {
            by by2 = az[n6];
            if (by2 != null) {
                if (by2.b.a == 455) {
                    ++n2;
                } else if (by2.b.a == 456) {
                    ++n3;
                } else if (by2.b.b == 26) {
                    ++n4;
                    n5 = by2.b.a;
                }
            }
            ++n6;
        }
        if (n4 > 1) {
            main.a.a(df.il);
            return;
        }
        if (n2 > 9 || n3 > 9 || n5 >= 10 && (n2 > 3 || n3 > 3)) {
            main.a.a(df.iq);
            return;
        }
        if (n2 + n3 < 3) {
            main.a.a(df.ip);
            return;
        }
        if (n5 == 10 && n3 == 3 || n5 == 11 && n2 == 3) {
            main.a.a(df.im);
            return;
        }
        dq.a().c(az);
    }

    public static byte E() {
        if (bp.d().r >= bo.length) {
            return -3;
        }
        int n2 = 0;
        n2 = bp.d().aA == null ? bp[bp.d().r][0] : bp[bp.d().r][bp.d().aA.a + 1];
        if (n2 == -1) {
            if (bp.d().av.a == 0 && bp.d().r == 9) {
                n2 = -2;
            } else if (bp.d().av.a == 0 || bp.d().av.a == 1 || bp.d().av.a == 2) {
                n2 = 1;
            } else if (bp.d().av.a == 3 || bp.d().av.a == 4) {
                n2 = 72;
            } else if (bp.d().av.a == 5 || bp.d().av.a == 6) {
                n2 = 27;
            }
        }
        return (byte)n2;
    }

    public static byte F() {
        block11: {
            try {
                if (bp.d().r < bo.length) break block11;
                return -3;
            }
            catch (Exception exception) {
                return -1;
            }
        }
        int n2 = 0;
        n2 = bp.d().aA == null ? bo[bp.d().r][0] : bo[bp.d().r][bp.d().aA.a + 1];
        if (n2 == -1) {
            if (bp.d().av.a == 0 && bp.d().r == 9) {
                n2 = -2;
            } else if (bp.d().av.a == 0 || bp.d().av.a == 1 || bp.d().av.a == 2) {
                n2 = 9;
            } else if (bp.d().av.a == 3 || bp.d().av.a == 4) {
                n2 = 10;
            } else if (bp.d().av.a == 5 || bp.d().av.a == 6) {
                n2 = 11;
            }
        }
        return (byte)n2;
    }

    private void aS() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < aA.length) {
            if (aA[n3] != null && dg.aA[n3].b.b == 26) {
                n2 += aX[dg.aA[n3].b.a];
            }
            ++n3;
        }
        n3 = 0;
        boolean bl2 = false;
        int n4 = 0;
        if (aI.r()) {
            if (bc[dg.aI.j] > bp.d().ar + bp.d().at) {
                n3 = 1;
            }
            n4 = n2 * 100 / aY[dg.aI.j];
        } else if (aI.s()) {
            if (bd[dg.aI.j] > bp.d().ar + bp.d().at) {
                n3 = 1;
            }
            n4 = n2 * 100 / aZ[dg.aI.j];
        } else if (aI.t()) {
            if (be[dg.aI.j] > bp.d().ar + bp.d().at) {
                n3 = 1;
            }
            n4 = n2 * 100 / ba[dg.aI.j];
        }
        if (dy && bg[dg.aI.j] > bp.d().au) {
            bl2 = true;
        }
        if (n3 != 0) {
            ae.a(df.fm, 15, dd.l);
            return;
        }
        if (bl2) {
            ae.a(df.fl, 15, dd.l);
            return;
        }
        if (n4 > 250) {
            main.a.a(df.fn, 88815, null, 8882, null);
            return;
        }
        dg.G();
    }

    public static void G() {
        if (!dg.aI.h) {
            main.a.a(df.fo, new bd(df.ah, 11063), new bd(df.au, 1));
            return;
        }
        dq.a().a(aI, aA, dy);
    }

    private static void aT() {
        if (!dR) {
            if (dL) {
                dq.a().a((byte)1, null, aJ, aB);
                return;
            }
            if (dJ) {
                dq.a().a(aJ, aB);
                return;
            }
            if (dK) {
                dq.a().b(aJ, aB);
                return;
            }
            if (dg.aJ.j == 0) {
                main.a.K.a(df.fp, null, new bd(df.H, 1), null);
                br br2 = main.a.K;
                main.a.J = br2;
                return;
            }
            int n2 = -1;
            int n3 = 0;
            int n4 = 0;
            while (n4 < bp.d().aB.length) {
                if (bp.d().aB[n4] == null) {
                    ++n2;
                }
                ++n4;
            }
            n4 = 0;
            while (n4 < aB.length) {
                if (aB[n4] != null) {
                    ++n3;
                }
                ++n4;
            }
            if (n3 > n2) {
                main.a.K.a(df.fq, null, new bd(df.H, 1), null);
                br br3 = main.a.K;
                main.a.J = br3;
                return;
            }
            main.a.a(df.fr, new bd(df.ah, 11087, aJ), new bd(df.au, 1));
        }
    }

    private void a(int n2, by by2, bd bd2, bd bd3) {
        this.a(3, by2);
        if (bd2 != null) {
            this.k = new bd(bd2.a, 11040);
        }
    }

    private void a(int n2, by by2) {
        if (by2 == null) {
            return;
        }
        this.cN = by2;
        gS = 120;
        gT = 120;
        if (main.a.g && !main.a.i) {
            gT += 18;
        }
        aQ = true;
        cO.a();
        V = 0;
        if (by2.g == 0L) {
            if (dJ || dK || dL || dR || dM || dO || dN) {
                dq.a().c(by2.o, by2.e);
            }
            if (dH) {
                dq.a().O(by2.d);
            } else if (dg.aV.p == bp.d().p) {
                dq.a().c(n2, by2.e);
            } else {
                dq.a().d(dg.aV.p, by2.e);
            }
        }
        if (n2 == 5) {
            bp.d().w();
        }
        if (!main.a.g || main.a.g && main.a.i || aR && W > 0 && W < 4 || dE && W == 0) {
            this.l = this.gW;
            this.m = null;
            this.k = null;
        }
        main.a.i();
        main.a.h();
    }

    public final void a(String string, String string2, boolean bl2) {
        b.b();
        aO = true;
        this.ea = true;
        V = 0;
        dg.b(175, 200);
        if (bl2) {
            cg -= 60;
        }
        this.m = new bd(df.H, 3);
        this.l = null;
        this.k = null;
        this.ec = string;
        this.eb = dd.g.a(string2, cf - 30);
    }

    public final void H() {
        aO = false;
        this.ec = null;
        this.eb = null;
        this.l = null;
        this.v();
    }

    public final void I() {
        cM = this.eb.size();
        aa.a(cM, 12, ce, gE + 12, cf, cg - 42 - (this.ec != null ? 10 : 0), true, 1);
        V = this.eb.size() - 1;
        aa.a(V * dg.aa.h);
    }

    private void G(t t2) {
        if (this.eb == null || !aO) {
            return;
        }
        dg.b(t2);
        ay.a(ce, cd, cf, cg, t2);
        if (this.ec != null) {
            dg.a(t2, this.ec, aU);
        }
        gD = ce + 15;
        gE = cd + 15;
        if (this.ec != null) {
            gE += 10;
        }
        cM = this.eb.size();
        aa.a(cM, 12, ce, gE + 12, cf, cg - 42 - (this.ec != null ? 10 : 0), true, 1);
        aa.a(t2);
        this.gL = gE;
        dd dd2 = dd.i;
        int n2 = 0;
        while (n2 < this.eb.size()) {
            String string = (String)this.eb.elementAt(n2);
            if (string == null || this.eb == null || dd2 == null) break;
            if (string.startsWith("c")) {
                if (string.startsWith("c0")) {
                    string = string.substring(2);
                    dd2 = dd.i;
                } else if (string.startsWith("c1")) {
                    string = string.substring(2);
                    dd2 = dd.d;
                } else if (string.startsWith("c2")) {
                    string = string.substring(2);
                    dd2 = dd.e;
                } else if (string.startsWith("c3")) {
                    string = string.substring(2);
                    dd2 = dd.j;
                } else if (string.startsWith("c4")) {
                    string = string.substring(2);
                    dd2 = dd.a;
                } else if (string.startsWith("c5")) {
                    string = string.substring(2);
                    dd2 = dd.l;
                } else if (string.startsWith("c6")) {
                    string = string.substring(2);
                    dd2 = dd.k;
                } else if (string.startsWith("c7")) {
                    string = string.substring(2);
                    dd2 = dd.b;
                } else if (string.startsWith("c8")) {
                    string = string.substring(2);
                    dd2 = dd.m;
                } else if (string.startsWith("c9")) {
                    string = string.substring(2);
                    dd2 = dd.n;
                }
            }
            dd2.a(t2, string, gD + 5, this.gL += 12, 0);
            ++n2;
        }
        if (V >= 0) {
            ab.a(t2, 942, gD - 5, gE + 12 + 1 + V * 12, 0, ch.b);
        }
    }

    private void H(t t2) {
        if (cX) {
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.dE, false);
            gD = ce + 5;
            gE = cd + 40;
            if (H.size() == 0) {
                dd.i.a(t2, df.gp, ce + cf / 2, cd + 40, 2);
            } else {
                t2.a(6425);
                t2.c(gD - 2, gE - 2, cf - 6, cK * 5 + 8);
                dg.b(t2);
                aa.a(H.size(), cK, gD, gE, cf - 3, cK * 5 + 4, true, 1);
                aa.a(t2, gD, gE, cf - 3, cK * 5 + 6);
                cM = H.size();
                int n2 = 0;
                while (n2 < H.size()) {
                    db db2 = (db)H.elementAt(n2);
                    if (V == n2) {
                        t2.a(ay.b);
                        t2.c(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                        t2.a(0xFFFFFF);
                        t2.b(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                    } else {
                        t2.a(ay.a);
                        t2.c(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                        t2.a(13932896);
                        t2.b(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                    }
                    ab.a(t2, 647, gD + 12, gE + n2 * cK + cK / 2, 0, 3);
                    dd.i.a(t2, String.valueOf(db2.d) + " - " + df.bv + ": " + db2.b + " (" + db2.g + ")", gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                    ++n2;
                }
            }
            dg.n(t2);
        }
    }

    private void I(t t2) {
        if (cW) {
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.dD, false);
            gD = ce + 5;
            gE = cd + 40;
            if (G.size() == 0) {
                dd.i.a(t2, df.gn, ce + cf / 2, cd + 40, 2);
            } else {
                t2.a(6425);
                t2.c(gD - 2, gE - 2, cf - 6, cK * 5 + 8);
                dg.b(t2);
                aa.a(G.size(), cK, gD, gE, cf - 3, cK * 5 + 4, true, 1);
                aa.a(t2, gD, gE, cf - 3, cK * 5 + 6);
                cM = G.size();
                int n2 = 0;
                while (n2 < G.size()) {
                    db db2 = (db)G.elementAt(n2);
                    if (V == n2) {
                        t2.a(ay.b);
                        t2.c(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                        t2.a(0xFFFFFF);
                        t2.b(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                    } else {
                        t2.a(ay.a);
                        t2.c(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                        t2.a(13932896);
                        t2.b(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                    }
                    ab.a(t2, db2.c, gD + 12, gE + n2 * cK + cK / 2, 0, 3);
                    if (db2.f == null) {
                        dd.n.a(t2, db2.d, gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                    } else if (n2 == 0) {
                        dd.j.a(t2, String.valueOf(db2.d) + " - " + df.bv + ": " + db2.f.w, gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                    } else {
                        dd.i.a(t2, String.valueOf(db2.d) + " - " + df.bv + ": " + db2.f.w, gD + 22, gE + n2 * cK + cK / 2 - 6, 0);
                    }
                    ++n2;
                }
            }
            dg.n(t2);
        }
    }

    private void J(t t2) {
        if (dH) {
            int n2 = cf;
            if (main.a.j) {
                n2 = cf / 2 + 20;
            }
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.hN[W], main.a.g ? true : cL == 0);
            t2.a(6425);
            t2.c(gD - 2, gE - 2, n2 - 6, cK * 5 + 4);
            if (aF == null) {
                main.a.a(ce + 90, cd + 75, t2, false);
                dd.e.a(t2, df.y, ce + 90, cd + 90, 2);
                return;
            }
            bu[] buArray = aF;
            gD = ce + 5;
            gE = cd + 33;
            if (buArray.length > 0) {
                cM = buArray.length;
                dg.b(t2);
                aa.a(cM, cK, gD, gE, n2 - 3, cK * 5, true, 1);
                aa.a(t2, gD, gE, n2 - 3, cK * 5 + 2);
                int n3 = 0;
                while (n3 < buArray.length) {
                    bu bu2 = buArray[n3];
                    if (bu2 != null && bu2.a != null && bu2.a.b != null) {
                        int n4 = (int)(System.currentTimeMillis() / 1000L);
                        if (n3 * cK >= dg.aa.b - cK && n3 * cK < dg.aa.b + (cK * 5 + 4)) {
                            if (U == n3) {
                                t2.a(ay.b);
                                t2.c(gD + 2, gE + U * cK + 2, n2 - 15, cK - 4);
                                t2.a(0xFFFFFF);
                                t2.b(gD + 2, gE + U * cK + 2, n2 - 15, cK - 4);
                            } else {
                                t2.a(ay.a);
                                t2.c(gD + 2, gE + n3 * cK + 2, n2 - 15, cK - 4);
                                t2.a(13932896);
                                t2.b(gD + 2, gE + n3 * cK + 2, n2 - 15, cK - 4);
                            }
                            t2.a(0);
                            t2.c(gD + 4, gE + n3 * cK + 4, cK - 1, cK - 8);
                            t2.a(U == n3 ? 0xFFFFFF : 0xBB6611);
                            t2.b(gD + 4, gE + n3 * cK + 4, cK - 1, cK - 8);
                            if (main.a.w % 6 == 0) {
                                bu2.a.a = (bu2.a.a + 1) % 3;
                            }
                            t2.a(11403519);
                            if (bu2.a.u()) {
                                t2.b(gD + 5, gE + n3 * cK + 5, cK - 3, cK - 10);
                            }
                            ab.a(t2, bu2.a.b.g, gD + cK / 2, gE + n3 * cK + cK / 2, 0, 3, bu2.a.a);
                            if (bu2.a.f > 1) {
                                dd.p.a(t2, String.valueOf(bu2.a.f), gD + cK, gE + n3 * cK + cK / 2 + 2, 1);
                            }
                            n4 = bu2.c - (n4 - bu2.d);
                            dd.i.a(t2, String.valueOf(df.hJ) + ": " + bu2.e, gD + cK + 7, gE + n3 * cK + cK / 2 - dd.p.c() - 2, 0);
                            dd.i.a(t2, String.valueOf(df.ar) + ": " + at.a(String.valueOf(bu2.b)) + " " + df.eA, gD + cK + 7, gE + n3 * cK + cK / 2 - dd.p.c() + 9, 0);
                            if (n4 < 60) {
                                dd.m.a(t2, df.hL, gD + n2 - 30, gE + n3 * cK + cK / 2 - dd.p.c() - 2, 2);
                                dd.m.a(t2, df.hM, gD + n2 - 30, gE + n3 * cK + cK / 2 - dd.p.c() + 9, 2);
                            } else {
                                dd.n.a(t2, df.hK, gD + n2 - 30, gE + n3 * cK + cK / 2 - dd.p.c() - 2, 2);
                                dd.n.a(t2, at.b(n4), gD + n2 - 30, gE + n3 * cK + cK / 2 - dd.p.c() + 9, 2);
                            }
                        }
                    }
                    ++n3;
                }
            } else {
                cM = buArray.length;
                dd.i.a(t2, df.go, ce + n2 / 2, cd + 40, 2);
            }
            dg.n(t2);
        }
    }

    private void K(t t2) {
        if (aP || cZ) {
            String string = aP ? df.dG[0] : df.dG[1];
            aa aa2 = aP ? I : L;
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, string, false);
            if (aa2.size() > 0) {
                gD = ce + 5;
                gE = cd + 40;
                t2.a(6425);
                t2.c(gD - 2, gE - 2, cf - 6, cK * 5 + 8);
                dg.b(t2);
                aa.a(aa2.size(), cK, gD, gE, cf - 3, cK * 5 + 4, true, 1);
                aa.a(t2, gD, gE, cf - 3, cK * 5 + 6);
                cM = aa2.size();
                int n2 = 0;
                int n3 = 0;
                while (n3 < aa2.size()) {
                    cz cz2 = (cz)aa2.elementAt(n3);
                    if (!cR || cz2.b == 3) {
                        dd dd2 = dd.k;
                        if (cz2.b == 1 || cz2.b == 2) {
                            dd2 = dd.n;
                        } else if (cz2.b == 3) {
                            dd2 = dd.i;
                        } else if (cz2.b == 4) {
                            dd2 = dd.l;
                        }
                        if (n3 * cK >= dg.aa.b - cK && n3 * cK < dg.aa.b + (cK * 5 + 8)) {
                            if (V == n3) {
                                t2.a(ay.b);
                                t2.c(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                                t2.a(0xFFFFFF);
                                t2.b(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                            } else {
                                t2.a(ay.a);
                                t2.c(gD + 2, gE + n3 * cK + 2, cf - 15, cK - 4);
                                t2.a(13932896);
                                t2.b(gD + 2, gE + n3 * cK + 2, cf - 15, cK - 4);
                            }
                            if (cz2.b == 4) {
                                if (main.a.w % 10 > 7) {
                                    dd2.a(t2, cz2.a, gD + 8, gE + n3 * cK + cK / 2 - 6, 0);
                                } else {
                                    dd.j.a(t2, cz2.a, gD + 8, gE + n3 * cK + cK / 2 - 6, 0);
                                }
                                dd.m.a(t2, df.dI, gD + cf - 15, gE + n3 * cK + cK / 2 - 6, 1);
                            } else {
                                dd2.a(t2, cz2.a, gD + 8, gE + n3 * cK + cK / 2 - 6, 0);
                            }
                        }
                        ++n2;
                    }
                    ++n3;
                }
                cM = n2;
                aa.a(n2, cK, gD, gE, cf - 3, cK * 5 + 4, true, 1);
            } else {
                dd.i.a(t2, aP ? df.dH : df.dW, ce + cf / 2, cd + 40, 2);
            }
            dg.n(t2);
        }
    }

    private void L(t t2) {
        if (cV) {
            cM = 0;
            dg.b(t2);
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.dw[W], false);
            gD = ce + 10;
            gE = cd + 32;
            if (W == 0) {
                int n2 = 0;
                aa.a(cM, 12, ce, cd + 32, cf, cg - 40, true, 1);
                aa.a(t2);
                if (bp.d().aA != null) {
                    int n3 = 0;
                    while (n3 < bp.d().aA.c.length) {
                        this.gL = gE;
                        dd.e.a(t2, bp.d().aA.c[n3], gD, this.gL, 0);
                        ++cM;
                        ++n3;
                    }
                    n3 = 0;
                    String string = null;
                    int n4 = 0;
                    while (n4 < bp.d().aA.e.length) {
                        dd dd2;
                        if (bp.d().aA.e[n4] != null) {
                            n3 = n4;
                            string = "- " + bp.d().aA.e[n4];
                            if (bp.d().aA.b[n4] != -1) {
                                if (bp.d().aA.a == n4) {
                                    string = String.valueOf(string) + " " + bp.d().aA.f + "/" + bp.d().aA.b[n4];
                                    if (bp.d().aA.f == bp.d().aA.b[n4]) {
                                        dd.i.a(t2, string, gD + 5, this.gL += 12, 0);
                                    } else {
                                        dd2 = dd.k;
                                        if (n2 == 0) {
                                            n2 = 1;
                                            dd2 = dd.j;
                                        }
                                        dd2.a(t2, string, gD + 5, this.gL += 12, 0);
                                    }
                                } else if (bp.d().aA.a > n4) {
                                    string = String.valueOf(string) + " " + bp.d().aA.b[n4] + "/" + bp.d().aA.b[n4];
                                    dd.i.a(t2, string, gD + 5, this.gL += 12, 0);
                                } else {
                                    string = String.valueOf(string) + " 0/" + bp.d().aA.b[n4];
                                    dd2 = dd.k;
                                    if (n2 == 0) {
                                        n2 = 1;
                                        dd2 = dd.j;
                                    }
                                    dd2.a(t2, string, gD + 5, this.gL += 12, 0);
                                }
                            } else if (bp.d().aA.a > n4) {
                                dd.i.a(t2, string, gD + 5, this.gL += 12, 0);
                            } else {
                                dd2 = dd.k;
                                if (n2 == 0) {
                                    n2 = 1;
                                    dd2 = dd.j;
                                }
                                dd2.a(t2, string, gD + 5, this.gL += 12, 0);
                            }
                            ++cM;
                        } else if (bp.d().aA.a <= n4) {
                            string = "- " + bp.d().aA.e[n3];
                            dd2 = dd.k;
                            if (n2 == 0) {
                                n2 = 1;
                                dd2 = dd.j;
                            }
                            dd2.a(t2, string, gD + 5, this.gL, 0);
                        }
                        ++n4;
                    }
                    this.gL += 5;
                    n4 = 0;
                    while (n4 < bp.d().aA.d.length) {
                        dd.i.a(t2, bp.d().aA.d[n4], gD, this.gL += 12, 0);
                        ++cM;
                        ++n4;
                    }
                } else {
                    byte by2 = dg.E();
                    byte by3 = dg.F();
                    String string = null;
                    if (by2 == -3 || by3 == -3) {
                        string = df.gd[3];
                    } else if (bp.d().aA == null && bp.d().r == 9 && bp.d().av.a == 0) {
                        string = df.gf;
                    } else if (by3 >= 0 && by2 >= 0) {
                        string = String.valueOf(df.gd[0]) + cy.cn[by3].b + df.gd[1] + af.u[by2] + df.gd[2];
                    } else {
                        return;
                    }
                    String[] stringArray = dd.i.b(string, 150);
                    n2 = 0;
                    while (n2 < stringArray.length) {
                        if (n2 == 0) {
                            this.gL = gE;
                            dd.i.a(t2, stringArray[n2], gD + 5, this.gL, 0);
                        } else {
                            dd.i.a(t2, stringArray[n2], gD + 5, this.gL += 12, 0);
                        }
                        ++cM;
                        ++n2;
                    }
                }
                if (cL == 1 && V >= 0 && cM > 0) {
                    ab.a(t2, 942, gD - 8, gE + 2 + V * 12, 0, ch.b);
                }
                aa.a(cM, 12, ce, cd + 32, cf, cg - 44, true, 1);
                return;
            }
            if (W == 1) {
                this.gL = gE - 12;
                aa.a(bp.d().bw.size(), 12, ce, cd + 32, cf, cg - 44, true, 1);
                aa.a(t2);
                cM = 0;
                int n5 = 0;
                while (n5 < bp.d().bw.size()) {
                    av av2 = (av)bp.d().bw.elementAt(n5);
                    dd.e.a(t2, av2.d, gD + 5, this.gL += 12, 0);
                    String string = "";
                    if (av2.a == 0 || av2.a == 3) {
                        string = String.valueOf(df.dc) + " " + ci.b[av2.f].g;
                    } else if (av2.a == 1) {
                        string = String.valueOf(df.dd) + " " + ci.b[av2.f].g;
                    } else if (av2.a == 2) {
                        string = df.hP;
                    } else if (av2.a == 4) {
                        string = String.valueOf(df.de) + " " + ci.b[av2.f].g;
                    } else if (av2.a == 5) {
                        string = String.valueOf(df.df) + " " + ci.b[av2.f].g;
                    } else if (av2.a == 6) {
                        string = df.dg;
                    }
                    if (av2.a == 6) {
                        if (av2.b == av2.c) {
                            dd.i.a(t2, string, gD + 5, this.gL += 12, 0);
                        } else {
                            dd.j.a(t2, string, gD + 5, this.gL += 12, 0);
                        }
                    } else if (av2.b == av2.c) {
                        dd.i.a(t2, String.valueOf(string) + " " + av2.b + "/" + av2.c, gD + 5, this.gL += 12, 0);
                    } else {
                        dd.j.a(t2, String.valueOf(string) + " " + av2.b + "/" + av2.c, gD + 5, this.gL += 12, 0);
                    }
                    cM += 3;
                    gS = cf - 25;
                    this.a(t2, dd.i, av2.e, gD + 5, this.gL += 12, 0);
                    this.gL += 12;
                    ++n5;
                }
                if (this.bM > 0) {
                    dd.i.a(t2, df.e, gD + 5, this.gL += 12, 0);
                    switch (this.bM) {
                        case 1: {
                            dd.i.a(t2, df.f, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 2: {
                            dd.i.a(t2, df.g, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 3: {
                            dd.i.a(t2, df.h, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 4: {
                            dd.i.a(t2, df.i, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 5: {
                            dd.i.a(t2, df.j, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 6: {
                            dd.i.a(t2, df.k, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 7: {
                            dd.i.a(t2, df.l, gD + 5, this.gL += 12, 0);
                            break;
                        }
                        case 8: {
                            dd.i.a(t2, df.m, gD + 5, this.gL += 12, 0);
                        }
                    }
                }
                if (cL == 1 && V >= 0 && cM > 0) {
                    ab.a(t2, 942, gD - 8, gE + 2 + V * 12, 0, ch.b);
                }
                aa.a(++cM, 12, ce, cd + 32, cf, cg - 44, true, 1);
            }
        }
    }

    private static String[] a(dd stringArray, String string) {
        stringArray = stringArray.b(string, cf - 20);
        return stringArray;
    }

    private void a(t t2, dd dd2, String[] stringArray, int n2, int n3, int n4) {
        n4 = n3;
        int n5 = 0;
        while (n5 < stringArray.length) {
            String string = stringArray[n5];
            if (string.startsWith("c")) {
                if (string.startsWith("c0")) {
                    string = string.substring(2);
                    dd2 = dd.i;
                } else if (string.startsWith("c1")) {
                    string = string.substring(2);
                    dd2 = dd.j;
                } else if (string.startsWith("c2")) {
                    string = string.substring(2);
                    dd2 = dd.n;
                }
            }
            if (n5 == 0) {
                dd2.a(t2, string, n2, n3, 0);
            } else {
                if (n5 * dg.aa.h + n4 >= dg.aa.b - 12 && n5 * dg.aa.h < dg.aa.b + cg - 44) {
                    dd2.a(t2, string, n2, n3 += 12, 0);
                } else {
                    n3 += 12;
                }
                this.gL += 12;
                ++cM;
            }
            ++n5;
        }
    }

    private void a(t t2, dd dd2, String stringArray, int n2, int n3, int n4) {
        try {
            int n5 = main.a.g && main.a.A >= 320 ? 20 : 10;
            int n6 = n3;
            stringArray = dd2.b((String)stringArray, gS - n5);
            n5 = 0;
            while (n5 < stringArray.length) {
                if (n5 == 0) {
                    dd2.a(t2, stringArray[n5], n2, n3, n4);
                } else {
                    if (n5 * dg.aa.h + n6 >= dg.aa.b - 12 && n5 * dg.aa.h < dg.aa.b + cg - 44) {
                        dd2.a(t2, stringArray[n5], n2, n3 += 12, n4);
                        this.gL += 12;
                    } else {
                        n3 += 12;
                    }
                    ++cM;
                }
                ++n5;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("loi  " + exception.toString());
            return;
        }
    }

    private void a(t t2, dd dd2, String stringArray, int n2, int n3, int n4, int n5) {
        n4 = n3;
        stringArray = dd2.b((String)stringArray, n5);
        n5 = 0;
        while (n5 < stringArray.length) {
            if (n5 == 0) {
                dd2.a(t2, stringArray[n5], n2, n3, 0);
            } else {
                if (n5 * dg.aa.h + n4 >= dg.aa.b - 12 && n5 * dg.aa.h < dg.aa.b + cg - 44) {
                    dd2.a(t2, stringArray[n5], n2, n3 += 12, 0);
                    this.gL += 12;
                } else {
                    n3 += 12;
                }
                ++cM;
            }
            ++n5;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void M(t var1_1) {
        block188: {
            if (main.a.j && !dg.aJ() && (dg.aI() || dg.aG() || dg.A())) {
                dg.aU();
                dg.N(var1_1);
                dg.b(var1_1);
                this.a(var1_1, dd.i, df.bq, dg.gQ + dg.gS / 2, dg.gR + dg.gT / 2 - 20, 2);
            }
            if (!dg.aQ || this.cN == null || this.cN.b == null) {
                return;
            }
            var2_2 = this.cN;
            if (dg.cQ && !this.cN.p() && dg.W == 0) {
                var2_2 = this.cN.a(this.cN.j + 1);
            }
            if (dg.dx && dg.W == 0 && dg.cL == 1 && var2_2.b() && var2_2.j == 0 && dg.aE[0] != null && dg.aE[0].b.b == dg.aE[1].b.b && dg.aE[1].b.f >= dg.aE[0].b.f) {
                var2_2 = this.cN.a(dg.aE[0].j);
            }
            dg.b(var1_1);
            if (var2_2.g != 0L && var2_2.c != null && var2_2.c.size() > 0) {
                var4_3 = 0;
                while (var4_3 < var2_2.c.size()) {
                    var5_19 = (String[])var2_2.c.elementAt(var4_3);
                    var3_13 = var5_19.a().length() * 5;
                    if (var3_13 > dg.gS && !main.a.j) {
                        dg.gS = var3_13;
                    }
                    ++var4_3;
                }
            }
            if ((var3_13 = dd.e.a(var2_2.b.d) + 10) > dg.gS && !main.a.j) {
                dg.gS = var3_13;
            }
            if (dg.gS > main.a.A - 4) {
                dg.gS = main.a.A - 4;
            }
            if (dg.gT > main.a.B - 4) {
                dg.gS = main.a.B - 4;
            }
            dg.gQ = dg.b / 2 - dg.gS / 2;
            dg.gR = dg.c / 2 - dg.gT / 2;
            dg.aU();
            if (dg.gQ < 2) {
                dg.gQ = 2;
            }
            if (dg.gR < 2) {
                dg.gR = 2;
            }
            dg.N(var1_1);
            if (dg.dE && dg.W == 0) {
                if (bp.ae == null) {
                    return;
                }
                this.gL = dg.gR - 9;
                dg.cM = 2;
                dg.cO.a(var1_1, dg.gQ, dg.gR + 2, dg.gS, dg.gT - 2);
                dg.gS = dd.i.a(df.hY[bp.ae.e][1]) + 10;
                var4_3 = 0;
                while (var4_3 < 2) {
                    dd.i.a(var1_1, df.hY[bp.ae.e][var4_3], dg.gQ + 8, this.gL += 12, 0);
                    ++var4_3;
                }
                if (dg.V >= 0 && (!main.a.g || main.a.g && main.a.A < 320)) {
                    ab.a(var1_1, 942, dg.gQ + 1, dg.gR + 5 + dg.V * 12, 0, ch.b);
                }
                dg.cO.a(dg.cM, 12, dg.gQ, dg.gR + 2, dg.gS, dg.gT - 4, true, 1);
                return;
            }
            dg.cO.a(var1_1, dg.gQ, dg.gR + 2, dg.gS, dg.gT - 2);
            dg.cM = 3;
            this.gL = dg.gR + 3;
            var4_4 = dd.e;
            if (var2_2.c()) {
                if (var2_2.i >= 1 && var2_2.i < 4) {
                    var4_4 = dd.b;
                } else if (var2_2.i >= 4 && var2_2.i < 8) {
                    var4_4 = dd.f;
                } else if (var2_2.i >= 8 && var2_2.i < 12) {
                    var4_4 = dd.d;
                } else if (var2_2.i >= 12 && var2_2.i < 15) {
                    var4_4 = dd.c;
                } else if (var2_2.i >= 15) {
                    var4_4 = dd.a;
                }
            } else if (var2_2.j >= 1 && var2_2.j < 4) {
                var4_4 = dd.b;
            } else if (var2_2.j >= 4 && var2_2.j < 8) {
                var4_4 = dd.f;
            } else if (var2_2.j >= 8 && var2_2.j < 12) {
                var4_4 = dd.d;
            } else if (var2_2.j >= 12 && var2_2.j < 15) {
                var4_4 = dd.c;
            } else if (var2_2.j >= 15) {
                var4_4 = dd.a;
            }
            if (var2_2.s != null) {
                var1_1.a(var2_2.s, 0, 0, t.a(var2_2.s), t.b(var2_2.s), 0, dg.gQ + dg.gS / 2, this.gL + dg.gT - 10, 33);
            }
            if (var2_2.c()) {
                this.a(var1_1, var4_4, String.valueOf(var2_2.b.d) + " + " + (var2_2.i + 1), dg.gQ + 8, this.gL, 0);
            } else {
                this.a(var1_1, var4_4, String.valueOf(var2_2.b.d) + (var2_2.j > 0 ? " +" + var2_2.j : ""), dg.gQ + 8, this.gL, 0);
            }
            if (var2_2.j >= 15 && !dg.cT && !var2_2.c()) {
                var5_19 = var4_4.b(String.valueOf(var2_2.b.d) + (var2_2.j > 0 ? " +" + var2_2.j : ""), dg.gS - (main.a.g != false && main.a.A >= 320 ? 20 : 10));
                if (var5_19.length > 1) {
                    this.gL -= 12;
                }
                if (var2_2.c()) {
                    this.a(var1_1, dd.e, var2_2.b.d, dg.gQ + 8, this.gL, 0);
                } else {
                    this.a(var1_1, dd.e, String.valueOf(var2_2.b.d) + (var2_2.j > 0 ? " +" + var2_2.j : ""), dg.gQ + 8, this.gL, 0);
                }
            }
            if (var2_2.b()) {
                this.gL += 12;
                ++dg.cM;
                if (dg.cT && main.a.w % 5 == 0) {
                    dg.cT = dg.cT == false;
                } else if (!dg.cT && main.a.w % 5 == 0) {
                    dg.cT = dg.cT == false;
                }
                var5_20 = var2_2.j / 2 + 1;
                if (var2_2.j == 0) {
                    var4_5 = 0;
                    while (var4_5 < var5_20) {
                        ab.a(var1_1, 633, dg.gQ + 12 + var4_5 * 10, this.gL + 5, 0, ch.g);
                        ++var4_5;
                    }
                } else if (var2_2.j >= 1 && var2_2.j < 4) {
                    var4_6 = 0;
                    while (var4_6 < var5_20) {
                        ab.a(var1_1, 625, dg.gQ + 12 + var4_6 * 10, this.gL + 5, 0, ch.g);
                        ++var4_6;
                    }
                    if (var2_2.j == 3) {
                        ab.a(var1_1, 635, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                    }
                } else if (var2_2.j >= 4 && var2_2.j < 8) {
                    var4_7 = 0;
                    while (var4_7 < var5_20) {
                        ab.a(var1_1, 626, dg.gQ + 12 + var4_7 * 10, this.gL + 5, 0, ch.g);
                        ++var4_7;
                    }
                    if (var2_2.j % 2 != 0) {
                        ab.a(var1_1, 636, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                    }
                } else if (var2_2.j >= 8 && var2_2.j < 12) {
                    var4_8 = 0;
                    while (var4_8 < var5_20) {
                        if (dg.cT) {
                            ab.a(var1_1, 627, dg.gQ + 12 + var4_8 * 10, this.gL + 5, 0, ch.g);
                        } else {
                            ab.a(var1_1, 628, dg.gQ + 12 + var4_8 * 10, this.gL + 5, 0, ch.g);
                        }
                        ++var4_8;
                    }
                    if (var2_2.j % 2 != 0) {
                        if (dg.cT) {
                            ab.a(var1_1, 637, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                        } else {
                            ab.a(var1_1, 638, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                        }
                    }
                } else if (var2_2.j >= 12 && var2_2.j < 15) {
                    var4_9 = 0;
                    while (var4_9 < var5_20) {
                        if (dg.cT) {
                            ab.a(var1_1, 629, dg.gQ + 12 + var4_9 * 10, this.gL + 5, 0, ch.g);
                        } else {
                            ab.a(var1_1, 630, dg.gQ + 12 + var4_9 * 10, this.gL + 5, 0, ch.g);
                        }
                        ++var4_9;
                    }
                    if (var2_2.j % 2 != 0) {
                        if (dg.cT) {
                            ab.a(var1_1, 639, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                        } else {
                            ab.a(var1_1, 640, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                        }
                    }
                } else {
                    var4_10 = 0;
                    while (var4_10 < var5_20) {
                        if (dg.cT) {
                            ab.a(var1_1, 631, dg.gQ + 12 + var4_10 * 10, this.gL + 5, 0, ch.g);
                        } else {
                            ab.a(var1_1, 632, dg.gQ + 12 + var4_10 * 10, this.gL + 5, 0, ch.g);
                        }
                        ++var4_10;
                    }
                    if (var2_2.j % 2 != 0) {
                        if (dg.cT) {
                            ab.a(var1_1, 641, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                        } else {
                            ab.a(var1_1, 642, dg.gQ + 12 + var5_20 * 10, this.gL + 5, 0, ch.g);
                        }
                    }
                }
            } else if (var2_2.c()) {
                this.gL += 12;
                var5_21 = var2_2.i + 1;
                var4_11 = 0;
                while (var4_11 < var5_21) {
                    ab.a(var1_1, 633, dg.gQ + 12 + var4_11 * 10, this.gL + 5, 0, ch.g);
                    ++var4_11;
                }
            }
            var3_14 = var2_2;
            dd.i.a(var1_1, var3_14.h != false ? df.db : df.dh, dg.gQ + 8, this.gL += 12, 0);
            if (var2_2.b() || var2_2.c()) {
                var3_14 = var2_2;
                if ((var3_14.b.b == 12 ? df.bN : (var3_14.b.f < 10 || var3_14.b.b >= 10 ? df.bM : (var5_22 = var3_14.j == 0 ? df.bL : null))) != null) {
                    this.a(var1_1, dd.i, var5_22, dg.gQ + 8, this.gL += 12, 0);
                    ++dg.cM;
                }
            }
            if (var2_2.b.c == 0 || var2_2.b.c == 1) {
                if (var2_2.b.c == bp.d().q) {
                    dd.i.a(var1_1, df.fB[var2_2.b.c], dg.gQ + 8, this.gL += 12, 0);
                    ++dg.cM;
                } else {
                    dd.l.a(var1_1, df.fB[var2_2.b.c], dg.gQ + 8, this.gL += 12, 0);
                    ++dg.cM;
                }
            }
            if (bp.d().w != -1) {
                if (bp.d().w >= var2_2.b.f) {
                    this.a(var1_1, dd.i, String.valueOf(df.du) + " " + var2_2.b.f, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    this.a(var1_1, dd.l, String.valueOf(df.du) + " " + var2_2.b.f, dg.gQ + 8, this.gL += 12, 0);
                }
            }
            if (var2_2.b.a >= 40 && var2_2.b.a <= 48 || var2_2.b.a == 311 || var2_2.b.a == 375 || var2_2.b.a == 397 || var2_2.b.a == 552 || var2_2.b.a == 558) {
                var5_23 = false;
                if (bp.d().av.a == 1) {
                    dd.i.a(var1_1, String.valueOf(df.dv) + " " + dg.T[1].b, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.l.a(var1_1, String.valueOf(df.dv) + " " + dg.T[1].b, dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            } else if (var2_2.b.a >= 49 && var2_2.b.a <= 57 || var2_2.b.a == 312 || var2_2.b.a == 376 || var2_2.b.a == 398 || var2_2.b.a == 553 || var2_2.b.a == 559) {
                var5_24 = false;
                if (bp.d().av.a == 2) {
                    dd.i.a(var1_1, String.valueOf(df.dv) + " " + dg.T[2].b, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.l.a(var1_1, String.valueOf(df.dv) + " " + dg.T[2].b, dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            } else if (var2_2.b.a >= 58 && var2_2.b.a <= 66 || var2_2.b.a == 313 || var2_2.b.a == 377 || var2_2.b.a == 399 || var2_2.b.a == 554 || var2_2.b.a == 560) {
                var5_25 = false;
                if (bp.d().av.a == 3) {
                    dd.i.a(var1_1, String.valueOf(df.dv) + " " + dg.T[3].b, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.l.a(var1_1, String.valueOf(df.dv) + " " + dg.T[3].b, dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            } else if (var2_2.b.a >= 67 && var2_2.b.a <= 75 || var2_2.b.a == 314 || var2_2.b.a == 378 || var2_2.b.a == 400 || var2_2.b.a == 555 || var2_2.b.a == 561) {
                var5_26 = false;
                if (bp.d().av.a == 4) {
                    dd.i.a(var1_1, String.valueOf(df.dv) + " " + dg.T[4].b, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.l.a(var1_1, String.valueOf(df.dv) + " " + dg.T[4].b, dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            } else if (var2_2.b.a >= 76 && var2_2.b.a <= 84 || var2_2.b.a == 315 || var2_2.b.a == 379 || var2_2.b.a == 401 || var2_2.b.a == 556 || var2_2.b.a == 562) {
                var5_27 = false;
                if (bp.d().av.a == 5) {
                    dd.i.a(var1_1, String.valueOf(df.dv) + " " + dg.T[5].b, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.l.a(var1_1, String.valueOf(df.dv) + " " + dg.T[5].b, dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            } else if (var2_2.b.a >= 85 && var2_2.b.a <= 93 || var2_2.b.a == 316 || var2_2.b.a == 380 || var2_2.b.a == 402 || var2_2.b.a == 557 || var2_2.b.a == 563) {
                var5_28 = false;
                if (bp.d().av.a == 6) {
                    dd.i.a(var1_1, String.valueOf(df.dv) + " " + dg.T[6].b, dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.l.a(var1_1, String.valueOf(df.dv) + " " + dg.T[6].b, dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            }
            if (!var2_2.c()) {
                if (var2_2.b.a == 420) {
                    if (bp.d().av.a == 1 || bp.d().av.a == 2) {
                        dd.i.a(var1_1, df.eL[1], dg.gQ + 8, this.gL += 12, 0);
                    } else {
                        dd.l.a(var1_1, df.eL[1], dg.gQ + 8, this.gL += 12, 0);
                    }
                    ++dg.cM;
                } else if (var2_2.b.a == 421) {
                    if (bp.d().av.a == 3 || bp.d().av.a == 4) {
                        dd.i.a(var1_1, df.eL[2], dg.gQ + 8, this.gL += 12, 0);
                    } else {
                        dd.l.a(var1_1, df.eL[2], dg.gQ + 8, this.gL += 12, 0);
                    }
                    ++dg.cM;
                } else if (var2_2.b.a == 422) {
                    if (bp.d().av.a == 5 || bp.d().av.a == 6) {
                        dd.i.a(var1_1, df.eL[3], dg.gQ + 8, this.gL += 12, 0);
                    } else {
                        dd.l.a(var1_1, df.eL[3], dg.gQ + 8, this.gL += 12, 0);
                    }
                    ++dg.cM;
                }
            }
            if (var2_2.g <= 0L) break block188;
            if (var2_2.j() || var2_2.k() || var2_2.l() || var2_2.m() || var2_2.n() || var2_2.o()) ** GOTO lbl-1000
            var3_14 = var2_2;
            if (var3_14.o == 39) lbl-1000:
            // 2 sources

            {
                if ((var3_15 = dd.g.a(String.valueOf(df.di) + ": " + var2_2.f()) + 10) > dg.gS && !main.a.j) {
                    dg.gS = var3_15;
                }
                this.a(var1_1, dd.j, String.valueOf(df.di) + ": " + var2_2.f(), dg.gQ + 8, this.gL += 12, 0);
            } else {
                var3_15 = dd.g.a(String.valueOf(df.di) + ": " + var2_2.e()) + 10;
                if (var3_15 > dg.gS && !main.a.j) {
                    dg.gS = var3_15;
                }
                this.a(var1_1, dd.j, String.valueOf(df.di) + ": " + var2_2.e(), dg.gQ + 8, this.gL += 12, 0);
            }
            ++dg.cM;
        }
        if (!var2_2.b.e.equals("")) {
            this.a(var1_1, dd.i, var2_2.b.e, dg.gQ + 8, this.gL += 12, 0);
            ++dg.cM;
        }
        if (var2_2.h() || var2_2.o == 37) {
            dd.j.a(var1_1, df.a(df.dj, at.a(String.valueOf(var2_2.n))), dg.gQ + 8, this.gL += 12, 0);
            ++dg.cM;
        } else if (var2_2.j() || var2_2.k() || var2_2.l() || var2_2.m() || var2_2.n() || var2_2.o()) {
            if (var2_2.k > 0) {
                if (var2_2.o()) {
                    var3_16 = dd.g.a(df.a(df.dl, at.a(String.valueOf(var2_2.k)))) + 10;
                    if (var3_16 > dg.gS && !main.a.j) {
                        dg.gS = var3_16;
                    }
                    dd.j.a(var1_1, df.a(df.dl, at.a(String.valueOf(var2_2.k))), dg.gQ + 8, this.gL += 12, 0);
                } else {
                    dd.j.a(var1_1, df.a(df.dk, at.a(String.valueOf(var2_2.k))), dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
            } else if (var2_2.l > 0) {
                dd.j.a(var1_1, df.a(df.dm, at.a(String.valueOf(var2_2.l))), dg.gQ + 8, this.gL += 12, 0);
                ++dg.cM;
            } else if (var2_2.m > 0) {
                dd.j.a(var1_1, df.a(df.dn, at.a(String.valueOf(var2_2.m))), dg.gQ + 8, this.gL += 12, 0);
                ++dg.cM;
            }
        }
        if (var2_2.b.b == 33) {
            dd.j.a(var1_1, String.valueOf(df.bu) + ": " + (var2_2.j + 1), dg.gQ + 8, this.gL += 12, 0);
            ++dg.cM;
        }
        if (var2_2.b() && var2_2.i != 0) {
            dd.h.a(var1_1, df.eL[var2_2.i], dg.gQ + 8, this.gL += 12, 0);
            ++dg.cM;
        }
        if (var2_2.g != 0L && var2_2.c != null && var2_2.c.size() > 0) {
            var5_29 = false;
            var4_12 = false;
            var6_30 = 0;
            while (var6_30 < var2_2.c.size()) {
                var7_31 = (cg)var2_2.c.elementAt(var6_30);
                if (!var5_29 && var7_31.c.c == 2) {
                    var5_29 = true;
                    var8_32 = String.valueOf(df.fO[0]) + ": ";
                    if (var2_2.b.b == 1) {
                        var8_32 = String.valueOf(var8_32) + df.fN[var2_2.b.b] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 0) {
                        var8_32 = String.valueOf(var8_32) + df.fN[6] + "(" + df.fP[this.cN.i] + "), " + df.fN[5] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 6) {
                        var8_32 = String.valueOf(var8_32) + df.fN[0] + "(" + df.fP[this.cN.i] + "), " + df.fN[5] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 5) {
                        var8_32 = String.valueOf(var8_32) + df.fN[0] + "(" + df.fP[this.cN.i] + "), " + df.fN[6] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 2) {
                        var8_32 = String.valueOf(var8_32) + df.fN[8] + "(" + df.fP[this.cN.i] + "), " + df.fN[7] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 8) {
                        var8_32 = String.valueOf(var8_32) + df.fN[2] + "(" + df.fP[this.cN.i] + "), " + df.fN[7] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 7) {
                        var8_32 = String.valueOf(var8_32) + df.fN[2] + "(" + df.fP[this.cN.i] + "), " + df.fN[8] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 4) {
                        var8_32 = String.valueOf(var8_32) + df.fN[3] + "(" + df.fP[this.cN.i] + "), " + df.fN[9] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 3) {
                        var8_32 = String.valueOf(var8_32) + df.fN[4] + "(" + df.fP[this.cN.i] + "), " + df.fN[9] + "(" + df.fP[this.cN.i] + ")";
                    } else if (var2_2.b.b == 9) {
                        var8_32 = String.valueOf(var8_32) + df.fN[4] + "(" + df.fP[this.cN.i] + "), " + df.fN[3] + "(" + df.fP[this.cN.i] + ")";
                    }
                    var3_17 = dd.i.a(var8_32) + 15;
                    if (var3_17 > dg.gS && !main.a.j) {
                        dg.gS = var3_17;
                    }
                    this.a(var1_1, dd.i, var8_32, dg.gQ + 8, this.gL += 12, 0);
                    ++dg.cM;
                }
                if (!var4_12 && var7_31.c.c > 2 && var7_31.c.c < 8) {
                    var4_12 = true;
                    dd.i.a(var1_1, df.fO[1], dg.gQ + 8, this.gL += 12, 0);
                    ++dg.cM;
                }
                if (var7_31.c.a == 65) {
                    this.a(var1_1, dd.m, var2_2.b.a == 485 ? at.a(var7_31.a(), df.da, df.iw) : var7_31.a(), dg.gQ + 8, this.gL += 12, 0);
                } else if (var7_31.c.a == 66) {
                    this.a(var1_1, dd.h, var2_2.b.a == 485 ? at.a(var7_31.a(), df.ig, df.ix) : var7_31.a(), dg.gQ + 8, this.gL += 12, 0);
                } else if (var7_31.c.c == 0) {
                    this.a(var1_1, dd.h, var2_2.i() != false ? var7_31.b() : var7_31.a(), dg.gQ + 8, this.gL += 12, 0);
                } else if (var7_31.c.c == 1) {
                    this.a(var1_1, dd.n, var2_2.i() != false ? var7_31.b() : var7_31.a(), dg.gQ + 8, this.gL += 12, 0);
                } else if (var7_31.c.c == 8) {
                    if (var7_31.c.a == 85) {
                        if (var2_2.i()) {
                            v0 = var7_31.b();
                        } else {
                            var3_18 = var7_31;
                            v0 = var3_18 = at.a(var3_18.c.b, "#", String.valueOf(var3_18.a));
                        }
                        this.a(var1_1, dd.j, (String)v0, dg.gQ + 8, this.gL += 12, 0);
                    } else {
                        var2_2.i();
                        this.a(var1_1, dd.b, var7_31.b(), dg.gQ + 8, this.gL += 12, 0);
                    }
                } else if (var7_31.c.c == 2 && var2_2.o == 5 && var7_31.b == 1 || var7_31.c.c == 3 && var2_2.j >= 4 || var7_31.c.c == 4 && var2_2.j >= 8 || var7_31.c.c == 5 && var2_2.j >= 12 || var7_31.c.c == 6 && var2_2.j >= 14 || var7_31.c.c == 7 && var2_2.j >= 16) {
                    this.a(var1_1, dd.n, var2_2.i() != false ? var7_31.b() : var7_31.a(), dg.gQ + 8, this.gL += 12, 0);
                } else {
                    this.a(var1_1, dd.k, var2_2.i() != false ? var7_31.b() : var7_31.a(), dg.gQ + 8, this.gL += 12, 0);
                }
                ++dg.cM;
                ++var6_30;
            }
        }
        if (dg.dG) {
            if (var2_2.b.a == 12) {
                dd.l.a(var1_1, String.valueOf(at.a(this.bN[dg.U])) + " " + df.eB, dg.gQ + 8, this.gL += 12, 0);
            }
            if (var2_2.b.b >= 0 && var2_2.b.b <= 9) {
                dd.j.a(var1_1, df.hT, dg.gQ + 8, this.gL += 12, 0);
            }
            ++dg.cM;
        }
        if (dg.V >= 0 && (!main.a.g || main.a.g && main.a.A < 320)) {
            ab.a(var1_1, 942, dg.gQ + 1, dg.gR + 5 + dg.V * 12, 0, ch.b);
        }
        dg.cO.a(dg.cM, 12, dg.gQ, dg.gR + 2, dg.gS, dg.gT - 4, true, 1);
    }

    private static void N(t t2) {
        dg.b(t2);
        t2.a(0);
        t2.c(gQ - 2, gR - 2, gS + 5, gT + 5);
        t2.a(13606712);
        t2.b(gQ - 1, gR - 1, gS + 2, gT + 2);
        t2.a(ay.a);
        t2.c(gQ, gR, gS, gT);
    }

    private static void aU() {
        if (!main.a.j || dE && W == 0) {
            return;
        }
        gQ = ce + 175;
        gS = cf - 179;
        gR = cd + 33;
        gT = 138;
        if (aS && W == 0) {
            gQ = ce + 6 + 3 * cK;
            gS = cf - (11 + 6 * cK);
        }
        if (aR) {
            if (W == 4) {
                gQ = ce + 33;
                gR = cd + 87;
                gS = cf - 67;
                gT = 75;
                return;
            }
            if (W == 5) {
                gT = 161;
            }
        }
    }

    public final void J() {
        this.l = null;
        if (cL == 0 && (W == 1 || W == 3 || W == 4)) {
            this.k = null;
            return;
        }
        switch (W) {
            case 0: {
                if (cL != 1) break;
                by by2 = dg.k(3);
                if (by2 != null) {
                    this.k = this.ha;
                    if ((!main.a.g || main.a.A >= 320) && main.a.g) break;
                    this.l = this.gZ;
                    break;
                }
                aQ = false;
                this.k = this.gV;
                break;
            }
            case 1: {
                if (cL != 1) break;
                this.k = null;
                if (U < 0) break;
                j j2 = bp.d().av.c[U];
                z z2 = bp.d().a(j2);
                if (z2 == null) break;
                if (z2.c < j2.c) {
                    this.k = new bd(df.aY, 14001);
                }
                if (z2.a.d == 1 || z2.a.d == 4 || z2.a.d == 2 || z2.a.d == 3) {
                    this.l = new bd(df.br, 11081);
                    break;
                }
                this.l = null;
                break;
            }
            case 2: {
                if (cL < 1) break;
                this.k = new bd(df.aY, 11084);
                this.l = new bd("", 11084);
                break;
            }
            case 3: {
                this.k = null;
                this.l = new bd(df.ca, 110854);
                break;
            }
            case 4: {
                if (cL != 1) break;
                this.k = null;
                by by3 = dg.k(5);
                if (by3 != null) {
                    if (dg.aV.p == bp.d().p) {
                        this.k = new bd(df.bo, 11082);
                        if (main.a.j) {
                            this.a(5, by3);
                            break;
                        }
                        this.l = new bd(df.X, 11083);
                        break;
                    }
                    if (main.a.j) {
                        this.a(5, by3);
                        break;
                    }
                    this.l = new bd(df.X, 11083);
                    break;
                }
                aQ = false;
                if (main.a.g || fJ <= 0) break;
                this.k = new bd(df.iI, 2003);
                break;
            }
            case 5: {
                this.k = null;
                if (cL != 1 || U < 0 || dg.aV.aE[U] == null) break;
                if (bp.d().p == dg.aV.p) {
                    this.k = new bd(df.aj, 1516);
                }
                this.l = new bd(main.a.j ? "" : df.X, 1515);
                break;
            }
            case 6: {
                z z3;
                j j3;
                if (hT == 0) {
                    this.k = null;
                    if (cL != 1 || U < 0 || dg.aV.aF[U] == null) break;
                    if (bp.d().p == dg.aV.p) {
                        this.k = new bd(df.aj, 508);
                    }
                    this.l = new bd(main.a.j ? "" : df.X, 503);
                    break;
                }
                if (hT == 1) {
                    if (cL < 1) break;
                    this.k = new bd(df.aY, 504);
                    break;
                }
                if (cL == 1) {
                    this.k = null;
                    if (U >= 0) {
                        j3 = bp.d().av.c[U];
                        z3 = bp.d().a(j3);
                        if (z3 != null) {
                            if (z3.c < j3.c) {
                                this.k = new bd(df.aY, 14001);
                            }
                            this.l = z3.a.d == 1 || z3.a.d == 4 || z3.a.d == 2 || z3.a.d == 3 ? new bd(df.br, 11081) : null;
                        }
                    }
                }
                if (cL != 1) break;
                this.k = null;
                if (U < 0) break;
                j3 = bp.d().av.c[U];
                z3 = bp.d().a(j3);
                if (z3 == null) break;
                if (z3.c < j3.c) {
                    this.k = new bd(df.aY, 505);
                }
                this.l = null;
            }
        }
        if (W != 6 && dg.aV.p == bp.d().p) {
            this.m = new bd(df.bE, 11086);
            return;
        }
        this.m = this.ge;
    }

    public final void d(int n2) {
        cL = 0;
        this.m = this.ge;
        switch (n2) {
            case 52: {
                db = true;
                W = 52;
                dq.a().i(52);
                break;
            }
            case 40: {
                aT = true;
                cL = 1;
                V = 0;
                this.C();
                break;
            }
            case 38: {
                aG = null;
                dG = true;
                cL = 1;
                this.C();
                break;
            }
            case 14: {
                db = true;
                W = 0;
                if (au != null) break;
                dq.a().i(14);
                break;
            }
            case 35: {
                dc = true;
                W = 0;
                if (av != null) break;
                dq.a().i(35);
                break;
            }
            case 15: {
                db = true;
                W = 1;
                if (ax != null) break;
                dq.a().i(15);
                break;
            }
            case 32: {
                db = true;
                W = 2;
                if (ay != null) break;
                dq.a().i(32);
                break;
            }
            case 34: {
                db = true;
                W = 3;
                if (aw != null) break;
                dq.a().i(34);
                break;
            }
            case 2: {
                W = 0;
                dr = true;
                if (ap != null) break;
                dq.a().i(2);
                break;
            }
            case 20: {
                W = 0;
                dd = true;
                if (ab != null) break;
                dq.a().i(20);
                break;
            }
            case 21: {
                W = 0;
                de = true;
                if (ac != null) break;
                dq.a().i(21);
                break;
            }
            case 22: {
                W = 0;
                df = true;
                if (ad != null) break;
                dq.a().i(22);
                break;
            }
            case 23: {
                W = 0;
                dg = true;
                if (ae != null) break;
                dq.a().i(23);
                break;
            }
            case 24: {
                W = 0;
                dh = true;
                if (af != null) break;
                dq.a().i(24);
                break;
            }
            case 25: {
                W = 0;
                di = true;
                if (ag != null) break;
                dq.a().i(25);
                break;
            }
            case 26: {
                W = 0;
                dj = true;
                if (ah != null) break;
                dq.a().i(26);
                break;
            }
            case 27: {
                W = 0;
                dk = true;
                if (ai != null) break;
                dq.a().i(27);
                break;
            }
            case 28: {
                W = 0;
                dl = true;
                if (aj != null) break;
                dq.a().i(28);
                break;
            }
            case 29: {
                W = 0;
                dm = true;
                if (ak != null) break;
                dq.a().i(29);
                break;
            }
            case 16: {
                W = 0;
                dn = true;
                if (al != null) break;
                dq.a().i(16);
                break;
            }
            case 17: {
                W = 0;
                do = true;
                if (am != null) break;
                dq.a().i(17);
                break;
            }
            case 18: {
                W = 0;
                dp = true;
                if (an != null) break;
                dq.a().i(18);
                break;
            }
            case 19: {
                W = 0;
                dq = true;
                if (ao != null) break;
                dq.a().i(19);
                break;
            }
            case 6: {
                W = 0;
                ds = true;
                if (aq != null) break;
                dq.a().i(6);
                break;
            }
            case 7: {
                W = 0;
                dt = true;
                if (ar != null) break;
                dq.a().i(7);
                break;
            }
            case 8: {
                W = 0;
                du = true;
                if (as != null) break;
                dq.a().i(8);
                break;
            }
            case 9: {
                W = 0;
                dv = true;
                if (at != null) break;
                dq.a().i(9);
                break;
            }
            case 4: {
                W = 0;
                dA = true;
                if (bp.d().aC != null) break;
                dq.a().i(4);
                break;
            }
            case 10: {
                W = 0;
                dw = true;
                aA = new by[18];
                break;
            }
            case 36: {
                W = 0;
                dg dg2 = this;
                aN = true;
                aK = null;
                dg2.ed = new ad();
                dg2.ed.b(9);
                dg2.ed.c(1);
                dg2.ed.c = 100;
                dg2.ed.d = ag.n + 2;
                break;
            }
            case 37: {
                dH = true;
                this.C();
                break;
            }
            case 33: {
                W = 0;
                dx = true;
                aE = new by[3];
                break;
            }
            case 31: {
                W = 0;
                dw = true;
                dy = true;
                aA = new by[18];
                break;
            }
            case 11: {
                W = 0;
                dz = true;
                cP = true;
                az = new by[24];
                break;
            }
            case 12: {
                W = 0;
                dz = true;
                cP = false;
                az = new by[24];
                break;
            }
            case 13: {
                W = 0;
                dB = true;
                aB = new by[24];
                break;
            }
            case 43: {
                W = 0;
                dI = true;
                az = new by[24];
                break;
            }
            case 44: {
                W = 0;
                dJ = true;
                aB = new by[24];
                break;
            }
            case 45: {
                W = 0;
                dK = true;
                aB = new by[24];
                break;
            }
            case 46: {
                W = 0;
                dL = true;
                aB = new by[24];
                break;
            }
            case 53: {
                W = 0;
                dR = true;
                aB = new by[24];
                break;
            }
            case 47: {
                W = 0;
                dM = true;
                aA = new by[18];
                break;
            }
            case 48: {
                W = 0;
                dQ = true;
                aB = new by[18];
                break;
            }
            case 49: {
                W = 0;
                dN = true;
                aJ = null;
                break;
            }
            case 50: {
                W = 0;
                dO = true;
                aJ = null;
            }
        }
        dg.b(175, 200);
        dg dg3 = this;
        this.hP = new int[9];
        dg3.hQ = new int[9];
        int n3 = ce + 3;
        int n4 = cd + 34 + cK;
        dg3.hP[0] = ce + 74;
        dg3.hQ[0] = n4 + 4;
        dg3.hP[1] = n3 + 1;
        dg3.hQ[1] = n4 - cK;
        dg3.hP[2] = n3 + cf / 2 - cK / 2 - 2;
        dg3.hQ[2] = n4 - cK;
        dg3.hP[3] = dg3.hP[1];
        dg3.hP[4] = dg3.hP[0];
        dg3.hP[5] = dg3.hP[2];
        dg3.hQ[3] = dg3.hQ[1] + cK * 3 - 2;
        dg3.hQ[4] = dg3.hQ[1] + cK * 3 - 2;
        dg3.hQ[5] = dg3.hQ[1] + cK * 3 - 2;
        dg3.hP[6] = dg3.hP[1];
        dg3.hP[7] = dg3.hP[0];
        dg3.hP[8] = dg3.hP[2];
        dg3.hQ[6] = dg3.hQ[1] + (cK << 2) + 10;
        dg3.hQ[7] = dg3.hQ[1] + (cK << 2) + 10;
        dg3.hQ[8] = dg3.hQ[1] + (cK << 2) + 10;
    }

    public static bp e(int n2) {
        int n3 = 0;
        while (n3 < M.size()) {
            bp bp2 = (bp)M.elementAt(n3);
            if (bp2.p == n2) {
                return bp2;
            }
            ++n3;
        }
        return null;
    }

    public static dk f(int n2) {
        if (S.size() > 0) {
            return (dk)S.elementAt(n2);
        }
        return null;
    }

    public final void a(String string, String string2) {
        if (!aU || main.a.g) {
            aw.a().b = false;
        }
        eG = (byte)5;
        if (string.equals("")) {
            return;
        }
        if (string2.equals(df.gI[0])) {
            dq.a().c(string);
            return;
        }
        if (string2.equals(df.gJ[0])) {
            if (G.size() == 0) {
                bg.d().e().a(df.fF);
                return;
            }
            dq.a().j(string);
            return;
        }
        if (string2.equals(df.gK[0])) {
            dq.a().k(string);
            return;
        }
        if (string2.equals(df.gL[0])) {
            if (bp.d().ac.equals("")) {
                bg.d().e().a(df.fK);
                return;
            }
            dq.a().l(string);
            return;
        }
        bg.d().a(string2, bp.d().ab, string);
        dq.a().a(string2, string);
    }

    public final void K() {
        if (aU) {
            this.H();
            aU = false;
            aw.a().f = null;
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        if (dz || dI || dJ || dK || dB || aS || dw || dx || aN || dL || dR || dM || dN || dO) {
            int n7 = n4 * cK;
            aa.a();
            if (main.a.b(n2, n3, n7, n5 *= cK)) {
                cL = n6;
                if (main.a.q) {
                    if ((n2 = (main.a.u - n2) / cK + (main.a.v - n3) / cK * n4) / gJ < gK) {
                        U = n2;
                    }
                    this.l = null;
                    this.k = null;
                    if (aS) {
                        if (U < 0) {
                            U = 11;
                        }
                        if (U > 11) {
                            U = 11;
                        }
                    }
                    this.C();
                }
            }
        }
    }

    public final void b(int n2, Object object) {
        Object object2 = null;
        object2 = null;
        aa aa2 = null;
        switch (n2) {
            case 2004: {
                return;
            }
            case 2003: {
                if (fJ == 0) {
                    fJ = 16;
                    ((dg)object3).cG.a = df.iI;
                    return;
                }
                fJ = 0;
                ((dg)object3).cG.a = df.iJ;
                if (main.a.g) break;
                ((ag)object3).k = new bd(df.bo, 11082);
                return;
            }
            case 2002: {
                main.a.j();
                return;
            }
            case 2001: {
                dq.a().r(U);
                return;
            }
            case 1100181: {
                main.a.a(df.d, new bd(df.iG, 1100182), new bd(df.au, main.a.k, 8882, null));
                return;
            }
            case 1100182: {
                main.a.J = null;
                main.a.H.a(true);
                return;
            }
            case 909090: {
                ((dg)object3).d(38);
                return;
            }
            case 1: {
                main.a.j();
                return;
            }
            case 2: {
                main.a.j();
                ((ag)object3).l = null;
                ((ag)object3).k = null;
                ((dg)object3).C();
                return;
            }
            case 3: {
                ((dg)object3).H();
                return;
            }
            case 1000: {
                dq.a().F();
                ((dg)object3).v();
                return;
            }
            case 2000: {
                dq.a().G();
                ((dg)object3).v();
                return;
            }
            case 11000: {
                dg.ah();
                return;
            }
            case 110001: {
                ((dg)object3).af();
                return;
            }
            case 1100011: {
                ((dg)object3).R();
                return;
            }
            case 1100012: {
                ((dg)object3).S();
                return;
            }
            case 1100013: {
                ((dg)object3).T();
                return;
            }
            case 1100014: {
                ((dg)object3).U();
                return;
            }
            case 1100015: {
                ((dg)object3).V();
                return;
            }
            case 1100016: {
                ((dg)object3).W();
                return;
            }
            case 1100017: {
                ((dg)object3).X();
                return;
            }
            case 110002: {
                dg.ao();
                return;
            }
            case 110003: {
                dg.ag();
                return;
            }
            case 1100032: {
                ((dg)object3).ai();
                return;
            }
            case 1100033: {
                dg.bv();
                return;
            }
            case 1100034: {
                dg.df();
                return;
            }
            case 110004: {
                dg.cA();
                return;
            }
            case 1100041: {
                dg.cz();
                return;
            }
            case 110005: {
                ((dg)object3).d(14);
                return;
            }
            case 110006: {
                dg.cw();
                return;
            }
            case 1100061: {
                ((dg)object3).aj();
                return;
            }
            case 1100062: {
                ((dg)object3).al();
                return;
            }
            case 1100063: {
                ((dg)object3).am();
                return;
            }
            case 1100064: {
                ((dg)object3).an();
                return;
            }
            case 1100065: {
                dg.cv();
                return;
            }
            case 11000651: {
                dg.m(1);
                return;
            }
            case 11000652: {
                dg.m(2);
                return;
            }
            case 11000653: {
                dg.m(3);
                return;
            }
            case 1100067: {
                dg.bk();
                return;
            }
            case 11000671: {
                main.a.a(df.gW, 88836, null, 8882, null);
                return;
            }
            case 11000672: {
                main.a.L.d.b(6);
                main.a.L.a(df.gX, new bd(df.bc, main.a.k, 88837, null), 1);
                return;
            }
            case 11000673: {
                main.a.M.a(df.hd, df.he);
                main.a.M.d.b(6);
                main.a.M.e.b(6);
                main.a.M.a(df.gX, new bd(df.H, main.a.k, 8882, null), new bd(df.bc, main.a.k, 88838, null), 1, 1);
                return;
            }
            case 11000674: {
                main.a.L.d.b(6);
                main.a.L.a(df.gX, new bd(df.bc, main.a.k, 88839, null), 1);
                return;
            }
            case 1100068: {
                ((dg)object3).d(40);
                return;
            }
            case 11000661: {
                W = 0;
                ((dg)object3).bu();
                return;
            }
            case 11000662: {
                W = 1;
                ((dg)object3).bu();
                dq.a().x();
                return;
            }
            case 11000663: {
                W = 2;
                ((dg)object3).bu();
                dq.a().y();
                return;
            }
            case 11000664: {
                W = 3;
                ((dg)object3).bu();
                dq.a().z();
                return;
            }
            case 11000665: {
                if (aL = !aL) {
                    w.a(String.valueOf(bp.d().ab) + "vci", 1);
                    return;
                }
                w.a(String.valueOf(bp.d().ab) + "vci", 0);
                return;
            }
            case 11000666: {
                W = 4;
                ((dg)object3).bu();
                dq.a().y();
                return;
            }
            case 110007: {
                ((dg)object3).d(7);
                return;
            }
            case 110008: {
                ((dg)object3).d(6);
                return;
            }
            case 110009: {
                ((dg)object3).d(9);
                return;
            }
            case 110010: {
                ((dg)object3).d(8);
                return;
            }
            case 110011: {
                ((dg)object3).d(10);
                return;
            }
            case 110012: {
                ((dg)object3).d(11);
                return;
            }
            case 110013: {
                ((dg)object3).d(12);
                return;
            }
            case 110014: {
                ((dg)object3).d(4);
                return;
            }
            case 110015: {
                ((dg)object3).d(13);
                return;
            }
            case 110016: {
                dq.a().e();
                return;
            }
            case 110017: {
                ((dg)object3).u();
                return;
            }
            case 110018: {
                dg.cj();
                return;
            }
            case 110019: {
                ((dg)object3).by();
                return;
            }
            case 11001: {
                bp.d().u();
                return;
            }
            case 11002: {
                dg.de();
                return;
            }
            case 11003: {
                dg.dd();
                return;
            }
            case 11004: {
                ((dg)object3).d((byte)25);
                return;
            }
            case 11005: {
                dg.db();
                return;
            }
            case 110051: {
                dg.b((byte)25);
                return;
            }
            case 110052: {
                ((dg)object3).c((byte)25);
                return;
            }
            case 11006: {
                dg.dc();
                return;
            }
            case 11007: {
                ((dg)object3).d((byte)24);
                return;
            }
            case 11008: {
                dg.da();
                return;
            }
            case 110081: {
                dg.b((byte)24);
                return;
            }
            case 110082: {
                ((dg)object3).c((byte)24);
                return;
            }
            case 11009: {
                ((dg)object3).d((byte)23);
                return;
            }
            case 11010: {
                dg.cZ();
                return;
            }
            case 110101: {
                dg.b((byte)23);
                return;
            }
            case 110102: {
                ((dg)object3).c((byte)23);
                return;
            }
            case 11011: {
                ((dg)object3).d((byte)22);
                return;
            }
            case 11012: {
                dg.cY();
                return;
            }
            case 110121: {
                dg.b((byte)22);
                return;
            }
            case 110122: {
                ((dg)object3).c((byte)22);
                return;
            }
            case 11013: {
                ((dg)object3).d((byte)21);
                return;
            }
            case 11014: {
                dg.cX();
                return;
            }
            case 110141: {
                dg.b((byte)21);
                return;
            }
            case 110142: {
                ((dg)object3).c((byte)21);
                return;
            }
            case 11015: {
                ((dg)object3).d((byte)20);
                return;
            }
            case 11016: {
                dg.cW();
                return;
            }
            case 110161: {
                dg.b((byte)20);
                return;
            }
            case 110162: {
                ((dg)object3).c((byte)20);
                return;
            }
            case 11017: {
                ((dg)object3).d((byte)15);
                return;
            }
            case 11018: {
                dg.cU();
                return;
            }
            case 110181: {
                dg.b((byte)15);
                return;
            }
            case 110182: {
                ((dg)object3).c((byte)15);
                return;
            }
            case 11019: {
                ((dg)object3).d((byte)14);
                return;
            }
            case 11020: {
                dg.cT();
                return;
            }
            case 110201: {
                dg.b((byte)14);
                return;
            }
            case 110202: {
                ((dg)object3).c((byte)14);
                return;
            }
            case 11021: {
                ck = "";
                cl = "";
                ((dg)object3).v();
                return;
            }
            case 11022: {
                ((dg)object3).cR();
                return;
            }
            case 110221: {
                dg.cC();
                return;
            }
            case 11023: {
                ((dg)object3).cQ();
                return;
            }
            case 11024: {
                dg.cP();
                return;
            }
            case 110244: {
                dg.cO();
                return;
            }
            case 11025: {
                ((dg)object3).aa();
                return;
            }
            case 11026: {
                dg.cN();
                return;
            }
            case 11027: {
                ((dg)object3).cM();
                return;
            }
            case 11028: {
                ((dg)object3).cL();
                return;
            }
            case 11029: {
                ((dg)object3).cK();
                return;
            }
            case 11030: {
                ((dg)object3).cJ();
                return;
            }
            case 11032: {
                ((dg)object3).cI();
                return;
            }
            case 11033: {
                ((dg)object3).cH();
                return;
            }
            case 11034: {
                ((dg)object3).cF();
                return;
            }
            case 11035: {
                ((dg)object3).cE();
                return;
            }
            case 11036: {
                dg.aL();
                return;
            }
            case 110361: {
                ((dg)object3).ct();
                return;
            }
            case 11037: {
                ((dg)object3).cD();
                return;
            }
            case 11038: {
                dg.cB();
                return;
            }
            case 110382: {
                dq.a().k();
                return;
            }
            case 110383: {
                dq.a().l();
                return;
            }
            case 110391: {
                ((dg)object3).n(1);
                return;
            }
            case 110392: {
                ((dg)object3).n(2);
                return;
            }
            case 110393: {
                ((dg)object3).n(3);
                return;
            }
            case 110394: {
                ((dg)object3).n(4);
                return;
            }
            case 110395: {
                ((dg)object3).n(5);
                return;
            }
            case 110396: {
                ((dg)object3).n(6);
                return;
            }
            case 110397: {
                ((dg)object3).n(7);
                return;
            }
            case 110398: {
                ((dg)object3).n(8);
                return;
            }
            case 110399: {
                ((dg)object3).n(9);
                return;
            }
            case 1103991: {
                ((dg)object3).n(10);
                return;
            }
            case 11040: {
                ((dg)object3).cy();
                return;
            }
            case 11041: {
                ((dg)object3).cx();
                return;
            }
            case 11042: {
                dg.cu();
                return;
            }
            case 11043: {
                dg.cs();
                return;
            }
            case 11044: {
                dg.bj();
                return;
            }
            case 110441: {
                ((dg)object3).ad();
                return;
            }
            case 11045: {
                dg.bp();
                return;
            }
            case 110451: {
                dg.cr();
                return;
            }
            case 110452: {
                dg.cq();
                return;
            }
            case 11046: {
                dg.bo();
                return;
            }
            case 11047: {
                dg.bl();
                return;
            }
            case 110471: {
                dg.cp();
                return;
            }
            case 11048: {
                dg.co();
                return;
            }
            case 11049: {
                dg.aK();
                return;
            }
            case 11050: {
                dg.aM();
                return;
            }
            case 11051: {
                dg.cn();
                return;
            }
            case 11052: {
                Object object3 = (by)object;
                dq.a().h(((by)object3).e, main.a.F.b);
                return;
            }
            case 11053: {
                Object object3 = (by)object;
                dg.g((by)object3);
                return;
            }
            case 110531: {
                Object object3 = (by)object;
                dq.a().h(((by)object3).e, main.a.F.b + 3);
                return;
            }
            case 11054: {
                ((dg)object3).ch();
                return;
            }
            case 11055: {
                Object object3 = (by)object;
                dg.f((by)object3);
                return;
            }
            case 110561: {
                main.a.j();
                ((dg)object3).C();
                return;
            }
            case 110562: {
                Object object3 = (by)object;
                dg.e((by)object3);
                return;
            }
            case 11057: {
                Object object3 = (cy)object;
                dq.a().b(((cy)object3).cm.a, main.a.F.b, -1);
                return;
            }
            case 11058: {
                Object object3 = (by)object;
                main.a.j();
                dq.a().g(((by)object3).e, Integer.parseInt(main.a.L.d.d()));
                return;
            }
            case 11059: {
                ((dg)object3).cg();
                return;
            }
            case 11060: {
                ((dg)object3).cf();
                return;
            }
            case 11061: {
                Object object3 = (by)object;
                dg.d((by)object3);
                return;
            }
            case 11062: {
                dg.aQ();
                return;
            }
            case 11063: {
                dg.ce();
                return;
            }
            case 11064: {
                dq.a().e(cL - 1, 1);
                ((dg)object3).J();
                return;
            }
            case 11065: {
                ((dg)object3).ab();
                return;
            }
            case 11066: {
                ((dg)object3).H();
                aU = false;
                aM = false;
                aw.a().f = null;
                return;
            }
            case 11067: {
                if (af.l != U) {
                    dq.a().a(U, ((dg)object3).dZ);
                    return;
                }
                ae.a(df.gc);
                return;
            }
            case 11068: {
                object2 = (String)object;
                super.f((String)object2);
                return;
            }
            case 11069: {
                ((dg)object3).cd();
                return;
            }
            case 11070: {
                Object object3 = (db)object;
                dg.a((db)object3);
                return;
            }
            case 110701: {
                dq.a().t();
                return;
            }
            case 110702: {
                dq.a().a(true);
                return;
            }
            case 110703: {
                dq.a().a(false);
                return;
            }
            case 11071: {
                dq.a().t();
                return;
            }
            case 11072: {
                dg.cc();
                return;
            }
            case 110721: {
                dq.a().g(U, 1);
                return;
            }
            case 110722: {
                dg.b(bp.d().aB[U]);
                return;
            }
            case 110723: {
                dq.a().g(U, bp.d().aB[dg.U].f);
                return;
            }
            case 11073: {
                dg.b(bp.d().aB[U]);
                return;
            }
            case 11074: {
                Object object4 = (aa)object;
                short s2 = Short.parseShort(String.valueOf(((aa)object4).elementAt(0)));
                object4 = String.valueOf(((aa)object4).elementAt(1));
                super.a(s2, (String)object4);
                return;
            }
            case 11075: {
                ((dg)object3).cb();
                return;
            }
            case 11076: {
                object2 = (String)object;
                dq.a().f((String)object2);
                return;
            }
            case 11077: {
                object2 = (String)object;
                dg.e((String)object2);
                return;
            }
            case 110771: {
                object2 = (String)object;
                main.a.j();
                dq.a().g((String)object2);
                return;
            }
            case 11078: {
                dg.ca();
                return;
            }
            case 11079: {
                dg.bY();
                return;
            }
            case 110791: {
                object2 = (String)object;
                dq.a().f((String)object2);
                return;
            }
            case 110792: {
                object2 = (String)object;
                dg.d((String)object2);
                return;
            }
            case 1107921: {
                object2 = (String)object;
                main.a.j();
                dq.a().g((String)object2);
                dg.a((String)object2);
                return;
            }
            case 1107931: {
                object2 = (String)object;
                dq.a().e((String)object2);
                return;
            }
            case 1107932: {
                object2 = (String)object;
                dg.a((String)object2);
                return;
            }
            case 11080: {
                object2 = (String)object;
                dg.c((String)object2);
                return;
            }
            case 110801: {
                dq.a().B(V);
                return;
            }
            case 110802: {
                dq.a().A(V);
                return;
            }
            case 110803: {
                object2 = (String)object;
                dq.a().e((String)object2);
                return;
            }
            case 110804: {
                dg.bz();
                return;
            }
            case 1108041: {
                object2 = (String)object;
                dq.a().a((String)object2, 0);
                dg.n().v();
                return;
            }
            case 110805: {
                ((dg)object3).br();
                return;
            }
            case 11081: {
                dg.bW();
                return;
            }
            case 110811: {
                Object object3 = bp.d().av.c[U];
                dg.b((j)object3);
                return;
            }
            case 110812: {
                Object object3 = bp.d().av.c[U];
                dg.a((j)object3);
                return;
            }
            case 11082: {
                dg.bV();
                return;
            }
            case 110821: {
                dq.a().b(U + fJ);
                return;
            }
            case 11083: {
                ((dg)object3).d((byte)5);
                return;
            }
            case 11084: {
                dg.bU();
                return;
            }
            case 110841: {
                dq.a().e(cL - 1, 1);
                ((dg)object3).J();
                return;
            }
            case 110842: {
                ((dg)object3).ab();
                return;
            }
            case 11085: {
                dg.bT();
                return;
            }
            case 110851: {
                Object object3 = (by)object;
                dq.a().a(((by)object3).o, ((by)object3).e, 1);
                return;
            }
            case 110852: {
                Object object3 = (by)object;
                dg.a((by)object3);
                return;
            }
            case 110854: {
                dg.bR();
                return;
            }
            case 11086: {
                ((dg)object3).bS();
                return;
            }
            case 11087: {
                Object object3 = (by)object;
                main.a.j();
                dq.a().a((by)object3);
                return;
            }
            case 11088: {
                ((dg)object3).d((byte)26);
                return;
            }
            case 11089: {
                ((dg)object3).d((byte)27);
                return;
            }
            case 11090: {
                ((dg)object3).d((byte)28);
                return;
            }
            case 11091: {
                ((dg)object3).d((byte)29);
                return;
            }
            case 11092: {
                Object object3 = (by)object;
                dg.c((by)object3);
                return;
            }
            case 110921: {
                Object object3 = (by)object;
                dq.a().a(((by)object3).o, ((by)object3).e, 1);
                return;
            }
            case 110922: {
                Object object3 = (by)object;
                dg.a((by)object3);
                return;
            }
            case 110923: {
                ((dg)object3).d((byte)16);
                return;
            }
            case 110924: {
                ((dg)object3).d((byte)17);
                return;
            }
            case 110925: {
                ((dg)object3).d((byte)18);
                return;
            }
            case 110926: {
                ((dg)object3).d((byte)19);
                return;
            }
            case 11093: {
                ((dg)object3).d((byte)2);
                return;
            }
            case 11094: {
                ((dg)object3).d((byte)6);
                return;
            }
            case 11095: {
                ((dg)object3).d((byte)7);
                return;
            }
            case 11096: {
                ((dg)object3).d((byte)8);
                return;
            }
            case 11097: {
                ((dg)object3).d((byte)9);
                return;
            }
            case 11098: {
                ((dg)object3).bQ();
                return;
            }
            case 110981: {
                ((dg)object3).aS();
                return;
            }
            case 11099: {
                cQ = false;
                super.a(3, aI);
                return;
            }
            case 110991: {
                cQ = true;
                super.a(3, aI);
                return;
            }
            case 11100: {
                dg.bO();
                return;
            }
            case 111001: {
                ((dg)object3).bN();
                return;
            }
            case 11101: {
                object2 = dg.k(10);
                super.a(3, (by)object2);
                return;
            }
            case 11102: {
                ((dg)object3).bJ();
                return;
            }
            case 11103: {
                ((dg)object3).bI();
                return;
            }
            case 111031: {
                if (dJ) {
                    dq.a().a(aJ, aB);
                    return;
                }
                if (dK) {
                    dq.a().b(aJ, aB);
                    return;
                }
                if (dL) {
                    dq.a().a((byte)1, null, aJ, aB);
                    return;
                }
                if (dN) {
                    dq.a().a((byte)2, null, aJ, null);
                    return;
                }
                if (!dO) break;
                dq.a().a((byte)3, null, aJ, null);
                return;
            }
            case 11104: {
                ((dg)object3).a(3, (by)object);
                return;
            }
            case 11105: {
                dg.aT();
                return;
            }
            case 11106: {
                ((dg)object3).bH();
                return;
            }
            case 11107: {
                dg.bG();
                return;
            }
            case 111071: {
                ((dg)object3).bE();
                return;
            }
            case 11108: {
                ((dg)object3).d((byte)3);
                return;
            }
            case 11109: {
                ((dg)object3).bD();
                return;
            }
            case 11110: {
                object2 = aD[U];
                super.a(30, (by)object2);
                return;
            }
            case 111101: {
                object2 = dg.k(4);
                dq.a().d(((by)object2).e);
                return;
            }
            case 11111: {
                object2 = dg.k(4);
                super.a(4, (by)object2);
                return;
            }
            case 11112: {
                dq.a().g();
                return;
            }
            case 11113: {
                dq.a().e(bp.d().aB[dg.U].e);
                return;
            }
            case 11114: {
                ((dg)object3).a(3, bp.d().aB[U]);
                return;
            }
            case 11115: {
                dg.bB();
                return;
            }
            case 11116: {
                dg.bA();
                return;
            }
            case 11120: {
                Object object3 = (Object[])object;
                z z2 = (z)object3[0];
                int n3 = Integer.parseInt((String)object3[1]);
                dg.ez[n3] = z2;
                dg.P();
                return;
            }
            case 11121: {
                Object object3 = (Object[])object;
                z z3 = (z)object3[0];
                int n4 = Integer.parseInt((String)object3[1]);
                dg.ey[n4] = z3;
                dg.Q();
                return;
            }
            case 12000: {
                ((dg)object3).cm();
                return;
            }
            case 12001: {
                bg.d().a((Integer)object);
                super.ck();
                return;
            }
            case 12002: 
            case 12004: {
                object2 = (String)object;
                bq bq2 = bg.d().a((String)object2);
                if (bq2 == null) {
                    bg.d().b((String)object2);
                    bg.d().c();
                } else {
                    bg.d().a(bq2);
                }
                super.ck();
                cX = false;
                dE = false;
                cZ = false;
                aP = false;
                cW = false;
                aw.a().f = null;
                return;
            }
            case 12003: {
                ((dg)object3).am();
                return;
            }
            case 12005: {
                ((dg)object3).cl();
                return;
            }
            case 120051: {
                bq bq3 = (bq)object;
                bg.d().a.removeElement(bq3);
                if (bg.d().b > bg.d().a.size() - 1) {
                    bg.d().b();
                }
                if ((bq3 = bg.d().e()) != null) {
                    super.ck();
                    return;
                }
                aw.a().b = false;
                ((dg)object3).v();
                return;
            }
            case 12006: {
                dg.ci();
                return;
            }
            case 120061: {
                bg.c = !bg.c;
                main.a.a(String.valueOf(df.gM) + (bg.c ? df.Q : df.R));
                return;
            }
            case 120062: {
                bg.d = !bg.d;
                main.a.a(String.valueOf(df.gN) + (bg.d ? df.Q : df.R));
                return;
            }
            case 12007: {
                ((dg)object3).hc = 1;
                ((dg)object3).hd = "";
                super.bg();
                return;
            }
            case 120071: {
                ((dg)object3).hc = 2;
                if (main.a.M.d.d().equals("")) {
                    main.a.a(df.er);
                    return;
                }
                if (main.a.M.e.d().equals("")) {
                    main.a.a(df.es);
                    return;
                }
                ((dg)object3).hd = "Lo\u1ea1i th\u1ebb: " + main.a.M.d.d();
                ((dg)object3).hd = String.valueOf(((dg)object3).hd) + ", M\u1ec7nh gi\u00e1: " + main.a.M.e.d();
                main.a.j();
                super.bg();
                return;
            }
            case 120072: {
                if (main.a.M.d.d().equals("")) {
                    main.a.a(df.et);
                    return;
                }
                if (main.a.M.e.d().equals("")) {
                    main.a.a(df.eu);
                    return;
                }
                ((dg)object3).hd = String.valueOf(((dg)object3).hd) + ", S\u1ed1 seri: " + main.a.M.d.d();
                ((dg)object3).hd = String.valueOf(((dg)object3).hd) + ", Kho\u1ea3ng th\u1eddi gian n\u1ea1p: " + main.a.M.e.d();
                dq.a().d(((dg)object3).hd);
                main.a.j();
                return;
            }
            case 12008: {
                dg.bf();
                return;
            }
            case 120081: {
                main.a.L.d.b(11);
                main.a.L.a(df.gY, new bd("OK", null, 120082, null), 1);
                return;
            }
            case 120082: {
                object2 = main.a.L.d.d();
                if (((String)object2).equals("")) {
                    main.a.a(df.gZ);
                    return;
                }
                dq.a().d("S\u1ed1 \u0111i\u1ec7n tho\u1ea1i \u0111\u0103ng k\u00fd: " + (String)object2);
                main.a.j();
                return;
            }
            case 12009: {
                object2 = (String)object;
                Object object3 = new aa();
                ((aa)object3).addElement(new bd(df.gb[7], 12002, object2));
                ((aa)object3).addElement(new bd(df.gx[2], 110803, object2));
                if (cW) {
                    ((aa)object3).addElement(new bd(df.gb[6], 110804));
                }
                if (aU) {
                    ((aa)object3).addElement(new bd(df.C, 14020, object2));
                    ((aa)object3).addElement(new bd(df.gb[6], 1108041, object2));
                }
                main.a.F.a((aa)object3);
                return;
            }
            case 130011: {
                cy cy2 = (cy)object;
                dq.a().b(cy2.cm.a, 0, -1);
                cy2.f = null;
                ((dg)object3).v();
                return;
            }
            case 130012: {
                cy cy3 = (cy)object;
                ((cy)object).f = null;
                ((dg)object3).v();
                return;
            }
            case 13001: {
                ((dg)object3).d((byte)32);
                return;
            }
            case 13002: {
                dg.cV();
                return;
            }
            case 130021: {
                dg.b((byte)32);
                return;
            }
            case 130022: {
                ((dg)object3).c((byte)32);
                return;
            }
            case 14001: {
                dg.bX();
                return;
            }
            case 140011: {
                dq.a().f(bp.d().av.c[dg.U].a, 1);
                ((dg)object3).J();
                return;
            }
            case 140012: {
                ((dg)object3).ac();
                return;
            }
            case 14002: {
                ((dg)object3).bw();
                return;
            }
            case 14003: {
                ((dg)object3).bx();
                return;
            }
            case 14004: {
                dg.bn();
                return;
            }
            case 140041: {
                main.a.L.d.b(180);
                main.a.L.a(df.hg, new bd(df.bc, main.a.k, 88832, null), 0);
                return;
            }
            case 140042: {
                dq.a().B();
                return;
            }
            case 140043: {
                main.a.L.a(df.hh, new bd(df.bc, main.a.k, 88834, null), 0);
                return;
            }
            case 140044: {
                dq.a().E();
                return;
            }
            case 14005: {
                ((dg)object3).bs();
                return;
            }
            case 14006: {
                object2 = (String)object;
                dg.b((String)object2);
                return;
            }
            case 14007: {
                dg.bh();
                return;
            }
            case 140071: {
                V = 0;
                U = 0;
                aa.a();
                cR = !cR;
                dg.y();
                return;
            }
            case 140072: {
                V = 0;
                U = 0;
                aa.a();
                cS = !cS;
                dg.y();
                return;
            }
            case 14008: {
                main.a.a(df.eG, new bd(df.ah, 140081), new bd(df.au, 1));
                return;
            }
            case 140081: {
                dq.a().A();
                main.a.j();
                return;
            }
            case 14009: {
                dg.bq();
                return;
            }
            case 140091: {
                dq.a().c(((bn)dg.F.elementAt((int)dg.V)).d, 3);
                return;
            }
            case 140092: {
                dq.a().c(((bn)dg.F.elementAt((int)dg.V)).d, 2);
                return;
            }
            case 140093: {
                main.a.a(df.eE, new bd(df.ah, 1400931), new bd(df.au, 1));
                return;
            }
            case 140094: {
                main.a.a(df.eF, new bd(df.ah, 1400941), new bd(df.au, 1));
                return;
            }
            case 1400931: {
                dq.a().c(((bn)dg.F.elementAt((int)dg.V)).d, 0);
                main.a.j();
                return;
            }
            case 1400941: {
                dq.a().o(((bn)dg.F.elementAt((int)dg.V)).d);
                main.a.j();
                return;
            }
            case 140095: {
                Object object3 = (bn)F.elementAt(V);
                dq.a().p(((bn)object3).d);
                return;
            }
            case 140096: {
                aa2 = new aa();
                aa2.addElement(new bd(df.hU, 1400961));
                aa2.addElement(new bd(df.hV, 1400962));
                main.a.F.a(aa2);
                return;
            }
            case 1400961: {
                Object object3 = (bn)F.elementAt(V);
                dq.a().q(((bn)object3).d);
                return;
            }
            case 1400962: {
                dq.a().D();
                return;
            }
            case 14010: {
                main.a.L.a(df.hi, new bd(df.bc, main.a.k, 88833, null), 1);
                return;
            }
            case 140101: {
                object2 = new by();
                new by().b = e.a((short)0);
                ((by)object2).g = -1L;
                super.a(39, (by)object2);
                return;
            }
            case 14011: {
                aM = false;
                return;
            }
            case 14012: {
                ((dg)object3).bK();
                return;
            }
            case 14013: {
                ((dg)object3).bP();
                return;
            }
            case 140131: {
                main.a.a(df.fs, new bd(df.ah, 140132), new bd(df.au, 1));
                return;
            }
            case 140132: {
                dg.bm();
                return;
            }
            case 14014: {
                ((dg)object3).cG();
                return;
            }
            case 14015: {
                ((dg)object3).bM();
                return;
            }
            case 140151: {
                ((dg)object3).bL();
                return;
            }
            case 14016: {
                ((dg)object3).a(3, aE[U]);
                return;
            }
            case 140161: {
                ((dg)object3).a(3, aE[2]);
                return;
            }
            case 14017: {
                dg.bi();
                return;
            }
            case 14018: {
                ((dg)object3).d((byte)34);
                return;
            }
            case 14019: {
                dg.be();
                return;
            }
            case 140191: {
                dg.b((byte)34);
                return;
            }
            case 140192: {
                ((dg)object3).c((byte)34);
                return;
            }
            case 14020: {
                if (dg.bt()) {
                    object2 = (String)object;
                    dq.a().a((short)1, (String)object2);
                    return;
                }
                main.a.a(df.gV);
                return;
            }
            case 14021: {
                dg.bZ();
                return;
            }
            case 14022: {
                dg.cS();
                return;
            }
            case 140221: {
                dg.b((byte)35);
                return;
            }
            case 140222: {
                ((dg)object3).c((byte)35);
                return;
            }
            case 14023: {
                ((dg)object3).d((byte)35);
                return;
            }
            case 14024: {
                ((dg)object3).a((byte)1);
                return;
            }
            case 14025: {
                ((dg)object3).a((byte)0);
                return;
            }
            case 1500: {
                aa2 = new aa();
                aa2.addElement(new bd(df.aj, 15001));
                if (bp.d().ar >= 5000) {
                    aa2.addElement(new bd(df.ao, 15002));
                }
                main.a.F.a(aa2);
                return;
            }
            case 15001: {
                ((dg)object3).bc();
                return;
            }
            case 15002: {
                try {
                    n2 = Integer.parseInt(((dg)object3).ed.d());
                    if (n2 <= 0) {
                        main.a.a(df.hz);
                    }
                    main.a.a(df.a(df.hH, at.a(String.valueOf(n2))), new bd(df.ah, 150021), new bd(df.au, 1));
                    return;
                }
                catch (Exception exception) {
                    main.a.a(df.hz);
                    return;
                }
            }
            case 150021: {
                main.a.k();
                n2 = 0;
                try {
                    n2 = Integer.parseInt(((dg)object3).ed.d());
                }
                catch (Exception exception) {
                    // empty catch block
                }
                dq.a().a(aK, n2);
                return;
            }
            case 1501: {
                ((dg)object3).a(3, aK);
                return;
            }
            case 1502: {
                ((dg)object3).ed.a();
                return;
            }
            case 1503: {
                dg.bd();
                return;
            }
            case 1504: {
                dg.bb();
                return;
            }
            case 15041: {
                dg.ba();
                return;
            }
            case 150411: {
                ((dg)object3).dX = 0;
                ((dg)object3).dY = 0;
                if (((dg)object3).dW == 0) {
                    ((dg)object3).dW = 1;
                } else if (((dg)object3).dW == 1) {
                    ((dg)object3).dW = 2;
                } else if (((dg)object3).dW == 2) {
                    ((dg)object3).dW = 1;
                }
                super.aZ();
                return;
            }
            case 150412: {
                ((dg)object3).dX = 0;
                ((dg)object3).dW = 0;
                if (((dg)object3).dY == 0) {
                    ((dg)object3).dY = 1;
                } else if (((dg)object3).dY == 1) {
                    ((dg)object3).dY = 2;
                } else if (((dg)object3).dY == 2) {
                    ((dg)object3).dY = 1;
                }
                super.aZ();
                return;
            }
            case 150413: {
                ((dg)object3).dW = 0;
                ((dg)object3).dY = 0;
                if (((dg)object3).dX == 0) {
                    ((dg)object3).dX = 1;
                } else if (((dg)object3).dX == 1) {
                    ((dg)object3).dX = 2;
                } else if (((dg)object3).dX == 2) {
                    ((dg)object3).dX = 1;
                }
                super.aZ();
                return;
            }
            case 15042: {
                main.a.a(df.a(df.hI, at.a(String.valueOf(dg.aF[dg.U].b))), new bd(df.ah, 150421), new bd(df.au, 1));
                return;
            }
            case 150421: {
                main.a.j();
                dq.a().P(dg.aF[dg.U].a.d);
                return;
            }
            case 1505: {
                ((dg)object3).a(3, dg.aF[dg.U].a);
                return;
            }
            case 1506: {
                if (aG != null) {
                    ((dg)object3).bL = 0;
                    aQ = false;
                    X = -1;
                    aG = null;
                    dg.n().k = new bd(df.bo, 1506);
                    return;
                }
                X = U;
                dq.a().H();
                main.a.l();
                return;
            }
            case 1507: {
                ((dg)object3).aY();
                return;
            }
            case 1508: {
                aa2 = new aa();
                object2 = bp.ae.p[U];
                if (object2 == null) break;
                if (((by)object2).b.a == 281) {
                    aa2.addElement(new bd(df.ac, 15081));
                } else {
                    aa2.addElement(new bd(df.fL, 15082));
                }
                main.a.F.a(aa2);
                return;
            }
            case 15081: {
                dq.a().I();
                return;
            }
            case 15082: {
                main.a.L.a(df.hX, new bd(df.ax, main.a.k, 88843, new Integer(U)), 0);
                return;
            }
            case 1509: {
                if (U >= 0 && bp.ae != null) {
                    super.a(39, bp.ae.p[U]);
                    return;
                }
                aQ = false;
                return;
            }
            case 1510: {
                dg.aX();
                return;
            }
            case 1511: {
                object2 = main.a.L.d.d();
                main.a.j();
                try {
                    if (((String)object2).equals("")) {
                        main.a.a(df.hz);
                        return;
                    }
                    int n5 = Integer.valueOf((String)object2);
                    if (n5 < 10 || n5 > 90) {
                        main.a.a(df.hz);
                        return;
                    }
                    bp.bs = n5;
                    return;
                }
                catch (Exception exception) {
                    main.a.a(df.hz);
                    return;
                }
            }
            case 1512: {
                object2 = main.a.L.d.d();
                main.a.j();
                try {
                    if (((String)object2).equals("")) {
                        main.a.a(df.hz);
                        return;
                    }
                    int n6 = Integer.valueOf((String)object2);
                    if (n6 < 10 || n6 > 90) {
                        main.a.a(df.hz);
                        return;
                    }
                    bp.bt = n6;
                    return;
                }
                catch (Exception exception) {
                    main.a.a(df.hz);
                    return;
                }
            }
            case 151301: {
                dq.a().Q(bp.d().aR.c().e);
                return;
            }
            case 15130: {
                bp.bu = 1;
                return;
            }
            case 15131: {
                bp.bu = 10;
                return;
            }
            case 15132: {
                bp.bu = 20;
                return;
            }
            case 15133: {
                bp.bu = 30;
                return;
            }
            case 15134: {
                bp.bu = 40;
                return;
            }
            case 15135: {
                bp.bu = 50;
                return;
            }
            case 15136: {
                bp.bu = 60;
                return;
            }
            case 15137: {
                bp.bu = 70;
                return;
            }
            case 1515: {
                ((dg)object3).a(41, dg.aV.aE[U]);
                return;
            }
            case 1516: {
                dq.a().c(U);
                return;
            }
            case 1600: {
                dg.aR();
                return;
            }
            case 1601: {
                dg.bF();
                return;
            }
            case 1602: {
                object2 = dg.k(43);
                super.a(3, (by)object2);
                return;
            }
            case 1603: {
                ((dg)object3).bC();
                return;
            }
            case 1604: {
                aa2 = new aa();
                if (aB[U] != null) {
                    aa2.addElement(new bd(df.aj, 1605));
                }
                aa2.addElement(new bd(df.bV, 11105));
                main.a.F.a(aa2);
                return;
            }
            case 1605: {
                ((dg)object3).aW();
                return;
            }
            case 1606: {
                ((dg)object3).aV();
                return;
            }
            case 999: {
                ((dg)object3).d(35);
                return;
            }
            case 9999: {
                ((dg)object3).d(37);
                return;
            }
            case 1700: {
                ((dg)object3).dg();
                return;
            }
            case 1701: {
                dg.dh();
                return;
            }
            case 1702: {
                ((dg)object3).di();
                return;
            }
            case 222: {
                ((dg)object3).dk();
                return;
            }
            case 333: {
                ((dg)object3).d(47);
                return;
            }
            case 334: {
                ((dg)object3).bJ();
                return;
            }
            case 335: {
                cQ = false;
                super.a(3, aJ);
                return;
            }
            case 336: {
                cQ = false;
                super.a(3, aI);
                return;
            }
            case 337: {
                ((dg)object3).dl();
                return;
            }
            case 338: {
                ((dg)object3).o(0);
                return;
            }
            case 344: {
                ((dg)object3).o(1);
                return;
            }
            case 345: {
                ((dg)object3).o(2);
                return;
            }
            case 339: {
                ((dg)object3).p(0);
                return;
            }
            case 340: {
                ((dg)object3).p(1);
                return;
            }
            case 343: {
                ((dg)object3).p(2);
                return;
            }
            case 341: {
                ((dg)object3).dm();
                return;
            }
            case 342: {
                dg.dn();
                return;
            }
            case 400: {
                ((dg)object3).dp();
                return;
            }
            case 401: {
                ((dg)object3).dq();
                return;
            }
            case 402: {
                ((dg)object3).dr();
                return;
            }
            case 403: {
                dg.ds();
                return;
            }
            case 405: {
                dg.do();
                return;
            }
            case 508: {
                dq.a().S(U);
                return;
            }
            case 500: {
                ((dg)object3).dt();
                return;
            }
            case 501: {
                dq.a().c(U);
                return;
            }
            case 502: {
                ((dg)object3).X();
                return;
            }
            case 5021: {
                ((dg)object3).Y();
                return;
            }
            case 5022: {
                ((dg)object3).Z();
                return;
            }
            case 503: {
                ((dg)object3).a(51, dg.aV.aF[U]);
                return;
            }
            case 504: {
                dg.du();
                return;
            }
            case 5041: {
                dq.a().e(cL - 1, 1);
                ((dg)object3).J();
                return;
            }
            case 5042: {
                ((dg)object3).dv();
                return;
            }
            case 5043: {
                dg.dw();
                return;
            }
            case 505: {
                dg.dx();
                return;
            }
            case 5051: {
                dq.a().f(bp.d().av.c[dg.U].a, 1);
                ((dg)object3).J();
                return;
            }
            case 5052: {
                ((dg)object3).dy();
                return;
            }
            case 5053: {
                dg.dz();
            }
        }
    }

    private void aV() {
        try {
            if (bp.d().aB[dg.U].b.a == 454) {
                if (aB == null) {
                    aB = new by[24];
                }
                int n2 = 0;
                while (n2 < aB.length) {
                    if (n2 == 20) {
                        main.a.a(df.eo);
                        return;
                    }
                    if (aB[n2] == null) {
                        dg.aB[n2] = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                        this.l = null;
                        this.k = null;
                        this.C();
                        return;
                    }
                    ++n2;
                }
                return;
            }
            if (bp.d().aB[dg.U].j > 11) {
                if (aJ == null) {
                    aJ = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                } else {
                    by by2 = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    bp.d().aB[dg.aJ.e] = aJ;
                    aJ = by2;
                }
                dq.a().c(dg.aJ.o, dg.aJ.e);
                return;
            }
            main.a.a(df.it);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void aW() {
        by by2 = dg.k(44);
        dg.aB[dg.U] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private static void aX() {
        if (V == 0) {
            boolean bl2 = bp.bi = !bp.bi;
            if (bI == 1) {
                bp.bi = false;
                ae.a(df.if, 20, dd.j);
                return;
            }
        } else if (V == 1) {
            boolean bl3 = bp.bj = !bp.bj;
            if (bI == 1) {
                bp.bj = false;
                ae.a(df.if, 20, dd.j);
                return;
            }
        } else if (V == 2) {
            boolean bl4 = bp.bk = !bp.bk;
            if (bI == 1) {
                bp.bk = false;
                ae.a(df.if, 20, dd.j);
                return;
            }
        } else {
            if (V == 3) {
                bp.bl = !bp.bl;
                return;
            }
            if (V == 4) {
                if (bp.bm = !bp.bm) {
                    bp.bp = false;
                    bp.bo = false;
                    bp.bn = false;
                    return;
                }
            } else if (V == 5) {
                if (bp.bn = !bp.bn) {
                    bp.bp = false;
                    bp.bo = false;
                    bp.bm = false;
                    return;
                }
            } else if (V == 6) {
                if (bp.bo = !bp.bo) {
                    bp.bp = false;
                    bp.bn = false;
                    bp.bm = false;
                    return;
                }
            } else if (V == 7 && (bp.bp = !bp.bp)) {
                bp.bo = false;
                bp.bn = false;
                bp.bm = false;
            }
        }
    }

    private void aY() {
        if (aG != null) {
            by by2 = new by();
            new by().b = e.a(aG[U]);
            this.a(38, by2);
        }
    }

    private void aZ() {
        if (this.dX == 0 && this.dW == 0 && this.dY == 0) {
            return;
        }
        int n2 = 0;
        while (n2 < aF.length - 1) {
            int n3 = n2 + 1;
            while (n3 < aF.length) {
                bu bu2;
                if (this.dW == 1) {
                    if (dg.aF[n2].b < dg.aF[n3].b) {
                        bu2 = aF[n2];
                        dg.aF[n2] = aF[n3];
                        dg.aF[n3] = bu2;
                    }
                } else if (this.dW == 2 && dg.aF[n2].b > dg.aF[n3].b) {
                    bu2 = aF[n2];
                    dg.aF[n2] = aF[n3];
                    dg.aF[n3] = bu2;
                }
                if (this.dY == 1) {
                    if (!dg.aF[n2].a.b.d.equals(dg.aF[n3].a.b.d) && dg.aF[n2].a.b.d.compareTo(dg.aF[n3].a.b.d) > 0) {
                        bu2 = aF[n2];
                        dg.aF[n2] = aF[n3];
                        dg.aF[n3] = bu2;
                    }
                } else if (this.dY == 2 && !dg.aF[n2].a.b.d.equals(dg.aF[n3].a.b.d) && dg.aF[n2].a.b.d.compareTo(dg.aF[n3].a.b.d) < 0) {
                    bu2 = aF[n2];
                    dg.aF[n2] = aF[n3];
                    dg.aF[n3] = bu2;
                }
                if (this.dX == 1) {
                    if (dg.aF[n2].a.b.f < dg.aF[n3].a.b.f) {
                        bu2 = aF[n2];
                        dg.aF[n2] = aF[n3];
                        dg.aF[n3] = bu2;
                    }
                } else if (this.dX == 2 && dg.aF[n2].a.b.f > dg.aF[n3].a.b.f) {
                    bu2 = aF[n2];
                    dg.aF[n2] = aF[n3];
                    dg.aF[n3] = bu2;
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void ba() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.hB, 150411));
        aa2.addElement(new bd(df.hD, 150412));
        aa2.addElement(new bd(df.hC, 150413));
        main.a.F.a(aa2);
    }

    private static void bb() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.ad, 15041));
        aa2.addElement(new bd(df.as, 15042));
        main.a.F.a(aa2);
    }

    private void bc() {
        bp.d().aB[dg.aK.e] = aK;
        aK = null;
        this.l = null;
        this.k = null;
    }

    private static void bd() {
        by by2 = bp.d().aB[U];
        if (by2 == null) {
            return;
        }
        if (by2.h || by2.p) {
            main.a.a(df.eg);
            return;
        }
        if (aK == null) {
            aK = bp.d().aB[U];
            bp.d().aB[dg.U] = null;
            return;
        }
        by2 = bp.d().aB[U];
        bp.d().aB[dg.U] = null;
        bp.d().aB[dg.aK.e] = aK;
        aK = by2;
    }

    private static void be() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 140191));
        aa2.addElement(new bd(df.at, 140192));
        main.a.F.a(aa2);
    }

    private static void bf() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.Z, null, 120081, null));
        aa2.addElement(new bd(df.aa, null, 12007, null));
        main.a.F.a(aa2);
    }

    private void bg() {
        if (this.hc == 1) {
            main.a.M.a(df.hn, df.hm);
            main.a.M.a(df.hj, new bd(df.H, main.a.a(), 8882, null), new bd(df.ab, null, 120071, null), 0, 0);
            return;
        }
        main.a.M.a(df.ho, df.hp);
        main.a.M.a(df.hk, new bd(df.H, main.a.a(), 8882, null), new bd(df.ax, null, 120072, null), 0, 0);
    }

    public static void a(String string) {
        cz cz2;
        int n2 = 0;
        while (n2 < I.size()) {
            cz2 = (cz)I.elementAt(n2);
            if (cz2.a.equals(string) && cz2.b == 4) {
                I.removeElementAt(n2);
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < K.size()) {
            cz2 = (cz)K.elementAt(n2);
            if (cz2.a.equals(string)) {
                K.removeElementAt(n2);
                return;
            }
            ++n2;
        }
    }

    private static void bh() {
        aa aa2 = new aa();
        aa2.addElement(new bd(String.valueOf(df.gv[0]) + ": " + (cR ? df.R : df.Q), 140071));
        aa2.addElement(new bd(df.gw, 140072));
        main.a.F.a(aa2);
    }

    private static void bi() {
        aa aa2 = new aa();
        aa2.addElement(new bd(String.valueOf(df.gv[0]) + ": " + (cR ? df.R : df.Q), 140071));
        main.a.F.a(aa2);
    }

    private static void bj() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gB, 110441));
        aa2.addElement(new bd(String.valueOf(df.gv[0]) + ": " + (cR ? df.R : df.Q), 140071));
        main.a.F.a(aa2);
    }

    private static void bk() {
        aa aa2 = new aa();
        if (bI == 0) {
            aa2.addElement(new bd(df.U, 11000671));
        } else if (bI == 1) {
            aa2.addElement(new bd(df.N, 11000672));
        }
        if (bI == 1 || bI == 2) {
            aa2.addElement(new bd(df.hc, 11000674));
            aa2.addElement(new bd(df.hb, 11000673));
        }
        main.a.F.a(aa2);
    }

    private static void bl() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gg, 110471));
        aa2.addElement(new bd(df.gr[4], 1100061));
        main.a.F.a(aa2);
    }

    private static void bm() {
        main.a.j();
        dq.a().c(dg.aE[0].e, dg.aE[1].e, dg.aE[2].e);
    }

    private static void bn() {
        aa aa2 = new aa();
        if (bp.d().ad == 3 || bp.d().ad == 4) {
            if (cL == 1) {
                aa2.addElement(new bd(df.gv[8], 140044));
            }
            aa2.addElement(new bd(df.gv[2], 140041));
            aa2.addElement(new bd(df.gv[5], 140042));
            if (bp.d().ad == 4) {
                aa2.addElement(new bd(df.gv[4], 140043));
            }
            aa2.addElement(new bd(String.valueOf(df.gb[10]) + ": " + (aL ? df.R : df.Q), 11000665));
        }
        main.a.F.a(aa2);
    }

    private static void bo() {
        db db2 = (db)H.elementAt(V);
        if (db2 != null && !bp.d().ab.equals(db2.d)) {
            aa aa2 = new aa();
            aa2.addElement(new bd(df.gb[6], 1108041, db2.d));
            aa2.addElement(new bd(df.aw, 12002, db2.d));
            aa2.addElement(new bd(df.gx[2], 110803, db2.d));
            main.a.F.a(aa2);
        }
    }

    private static void bp() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gm, 110452));
        if (H.size() > 0) {
            aa2.addElement(new bd(df.gl, 110451));
        }
        main.a.F.a(aa2);
    }

    private static void bq() {
        bn bn2 = (bn)F.elementAt(V);
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gt[1], 140091, bn2.d));
        aa2.addElement(new bd(df.gt[2], 140092, bn2.d));
        main.a.F.a(aa2);
    }

    private void br() {
        if (V >= 0 && V < F.size() && (this = dg.aw()) != null && !((bn)this).d.equals("")) {
            dq.a().a(((bn)this).d, 0);
            dE = false;
            dg.n().v();
        }
    }

    private void bs() {
        bn bn2 = dg.aw();
        aa aa2 = new aa();
        if (bp.d().ad == 4) {
            if (bn2.c != 4) {
                if (bn2.c != 3 && bn2.c != 2) {
                    aa2.addElement(new bd(df.gO, 14009, bn2.d));
                } else {
                    aa2.addElement(new bd(df.gP, 140093, bn2.d));
                }
                if (af.o == 98 || af.o == 104) {
                    aa2.addElement(new bd(df.gv[7], 140096, bn2.d));
                } else {
                    aa2.addElement(new bd(df.gv[6], 140095, bn2.d));
                }
                aa2.addElement(new bd(df.gQ, 140094, bn2.d));
            }
            aa2.addElement(new bd(df.V, 14007));
        } else if (bp.d().ad == 3) {
            if (bn2.c != 4 && !bn2.d.equals(bp.d().ab)) {
                aa2.addElement(new bd(df.gQ, 140094, bn2.d));
                if (af.o == 98 || af.o == 104) {
                    aa2.addElement(new bd(df.gv[7], 140096, bn2.d));
                } else {
                    aa2.addElement(new bd(df.gv[6], 140095, bn2.d));
                }
            }
            aa2.addElement(new bd(df.V, 14007));
            aa2.addElement(new bd(df.gv[1], 14008, bn2.d));
        } else {
            aa2.addElement(new bd(df.V, 14007));
            aa2.addElement(new bd(df.gv[1], 14008, bn2.d));
        }
        main.a.F.a(aa2);
    }

    private static boolean bt() {
        int n2 = 0;
        while (n2 < bp.d().aB.length) {
            by by2 = bp.d().aB[n2];
            if (by2 != null && by2.b.a == 279 && by2.b.f <= bp.d().w) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static void b(String string) {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gb[6], 110805));
        aa2.addElement(new bd(df.aw, 12002, string));
        aa2.addElement(new bd(df.gA, 110791, string));
        aa2.addElement(new bd(df.C, 14020, string));
        aa2.addElement(new bd(df.gx[2], 110803, string));
        main.a.F.a(aa2);
    }

    private void bu() {
        dE = true;
        dF = true;
        cS = false;
        this.fN = null;
        this.fM = null;
        dg.b(175, 200);
        this.C();
        this.m = this.ge;
        dq.a().w();
    }

    private static void bv() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.fH[0], 11000661));
        aa2.addElement(new bd(df.fH[1], 11000662));
        aa2.addElement(new bd(df.fH[2], 11000663));
        aa2.addElement(new bd(df.fH[3], 11000664));
        aa2.addElement(new bd(df.fH[4], 11000666));
        main.a.F.a(aa2);
    }

    private void bw() {
        bp.d().aV = null;
        bp.cg = false;
        this.bm = -1;
        dC = false;
        this.v();
    }

    private void bx() {
        bp bp2 = (bp)M.elementAt(V);
        if (!bp2.B()) {
            this.bm = bp2.p;
            bp.d().aR = null;
            bp.d().v();
            bp.d().aW = null;
            bp.d();
            bp.cg = true;
            dC = false;
            bp.d().aV = bp2;
        }
        this.v();
    }

    private void by() {
        W = W == 0 ? 1 : 0;
        V = 0;
        this.cH = W;
    }

    private static void bz() {
        db db2 = (db)G.elementAt(V);
        if (db2.f != null && db2.f != bp.d()) {
            dq.a().a(db2.f.ab, 0);
            cW = false;
            dg.n().v();
        }
    }

    private static void bA() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.ad, 110221));
        aa2.addElement(new bd(df.al, 11050));
        main.a.F.a(aa2);
    }

    private static void bB() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.ad, 11048));
        aa2.addElement(new bd(df.ak, 11049));
        main.a.F.a(aa2);
    }

    private void bC() {
        if (bp.d().aB[dg.U].b.b == 26 || bp.d().aB[dg.U].b.a == 455 || bp.d().aB[dg.U].b.a == 456) {
            if (bp.d().aB[dg.U].b.b == 26 && bp.d().aB[dg.U].b.a < 10) {
                main.a.a(df.in);
                return;
            }
            short s2 = 0;
            int n2 = 0;
            boolean bl2 = az[12] != null;
            int n3 = 0;
            while (n3 < az.length) {
                if (az[n3] != null && dg.az[n3].b.b != 26) {
                    s2 = dg.az[n3].b.a;
                    ++n2;
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < az.length) {
                if (az[n3] == null) {
                    if (bp.d().aB[dg.U].b.b == 26) {
                        if (az[12] == null) {
                            dg.az[12] = bp.d().aB[U];
                            bp.d().aB[dg.U] = null;
                        } else {
                            by by2 = bp.d().aB[U];
                            bp.d().aB[dg.U] = null;
                            bp.d().aB[dg.az[12].e] = az[12];
                            dg.az[12] = by2;
                        }
                    } else if (s2 > 0 && bp.d().aB[dg.U].b.a != s2) {
                        main.a.a(df.io);
                    } else if (bl2 && n2 >= 3 || n2 >= 9) {
                        main.a.a(df.iq);
                    } else {
                        dg.az[n3] = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                    }
                    ((ag)((Object)br2)).l = null;
                    ((ag)((Object)br2)).k = null;
                    ((dg)((Object)br2)).C();
                    return;
                }
                ++n3;
            }
            main.a.K.a(df.eo, null, new bd(df.H, 2), null);
        } else if (bp.d().aB[dg.U].b.a == 457) {
            main.a.K.a(df.ij, null, new bd(df.H, 2), null);
        } else {
            main.a.K.a(df.ik, null, new bd(df.H, 2), null);
        }
        br br2 = main.a.K;
        main.a.J = br2;
    }

    private void bD() {
        Object object;
        if (bp.d().aB[dg.U].b.b == 26) {
            int n2 = 0;
            while (n2 < az.length) {
                if (az[n2] == null) {
                    dg.az[n2] = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    ((ag)object).l = null;
                    ((ag)object).k = null;
                    ((dg)object).C();
                    return;
                }
                ++n2;
            }
            main.a.K.a(df.eo, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        main.a.K.a(df.eh, null, new bd(df.H, 2), null);
        object = main.a.K;
        main.a.J = object;
    }

    private void bE() {
        by by2 = dg.k(11);
        dg.az[dg.U] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private static void bF() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aj, 111071));
        int n2 = 0;
        while (n2 < az.length) {
            if (az[n2] != null) {
                aa2.addElement(new bd(df.bV, 1600));
                break;
            }
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private static void bG() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aj, 111071));
        int n2 = 0;
        while (n2 < az.length) {
            if (az[n2] != null) {
                aa2.addElement(new bd(df.bV, 11062));
                break;
            }
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private void bH() {
        Object object;
        try {
            if (dJ) {
                if (bp.d().aB[U].b() || bp.d().aB[U].c() || bp.d().aB[dg.U].b.a == 455 || bp.d().aB[dg.U].b.a == 456 || bp.d().aB[dg.U].b.a == 457) {
                    if (bp.d().aB[dg.U].b.a == 455 || bp.d().aB[dg.U].b.a == 456 || bp.d().aB[dg.U].b.a == 457) {
                        if (aB == null) {
                            aB = new by[24];
                        }
                        int n2 = 0;
                        while (n2 < aB.length) {
                            if (aB[n2] == null) {
                                dg.aB[n2] = bp.d().aB[U];
                                bp.d().aB[dg.U] = null;
                                ((ag)object).l = null;
                                ((ag)object).k = null;
                                ((dg)object).C();
                                return;
                            }
                            if (n2 == aB.length - 1) {
                                main.a.a(df.eo);
                            }
                            ++n2;
                        }
                        return;
                    }
                    cg cg2 = null;
                    int n3 = 0;
                    while (n3 < bp.d().aB[dg.U].c.size()) {
                        cg2 = (cg)bp.d().aB[dg.U].c.elementAt(n3);
                        if (cg2.c.a == 85) break;
                        cg2 = null;
                        ++n3;
                    }
                    if (cg2 != null && cg2.a >= 9) {
                        main.a.a(df.iA);
                        return;
                    }
                    if (aJ == null) {
                        aJ = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                    } else {
                        by by2 = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                        bp.d().aB[dg.aJ.e] = aJ;
                        aJ = by2;
                    }
                    dq.a().c(dg.aJ.o, dg.aJ.e);
                    return;
                }
                main.a.K.a(df.ir, null, new bd(df.H, 2), null);
                object = main.a.K;
                main.a.J = object;
                return;
            }
            if (bp.d().aB[U].b() && bp.d().aB[dg.U].j > 0) {
                if (aJ == null) {
                    aJ = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                } else {
                    by by3 = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    bp.d().aB[dg.aJ.e] = aJ;
                    aJ = by3;
                }
                if (aJ != null) {
                    int n4;
                    int n5 = 0;
                    if (aJ.r()) {
                        n4 = 0;
                        while (n4 < dg.aJ.j) {
                            n5 += aY[n4];
                            ++n4;
                        }
                    } else if (aJ.s()) {
                        n4 = 0;
                        while (n4 < dg.aJ.j) {
                            n5 += aZ[n4];
                            ++n4;
                        }
                    } else if (aJ.t()) {
                        n4 = 0;
                        while (n4 < dg.aJ.j) {
                            n5 += ba[n4];
                            ++n4;
                        }
                    }
                    n5 /= 2;
                    n4 = 0;
                    aB = new by[24];
                    int n6 = aX.length - 1;
                    while (n6 >= 0) {
                        if (n5 >= aX[n6]) {
                            dg.aB[n4] = new by();
                            dg.aB[n4].o = 3;
                            dg.aB[n4].b = e.a((short)n6);
                            dg.aB[n4].h = dg.aJ.h;
                            dg.aB[n4].g = -1L;
                            n5 -= aX[n6];
                            ++n6;
                            ++n4;
                        }
                        --n6;
                    }
                }
                ((ag)object).l = null;
                ((ag)object).k = null;
                ((dg)object).C();
                return;
            }
            main.a.K.a(df.em, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        catch (Exception exception) {
            main.a.K.a(df.ir, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
    }

    private void bI() {
        aa aa2 = new aa();
        aa2.addElement(this.fX);
        if (aJ != null) {
            aa2.addElement(new bd(df.bV, 111031));
        }
        main.a.F.a(aa2);
    }

    private void bJ() {
        Object object;
        if (bp.d().aB[U].b()) {
            if (bp.d().aB[dg.U].b.f < 10 || bp.d().aB[dg.U].b.b >= 10) {
                main.a.K.a(df.ek, null, new bd(df.H, 2), null);
                object = main.a.K;
                main.a.J = object;
                return;
            }
            if (bp.d().aB[dg.U].j >= bp.d().aB[U].q()) {
                main.a.K.a(df.el, null, new bd(df.H, 2), null);
                object = main.a.K;
                main.a.J = object;
                return;
            }
            if (aI == null) {
                aI = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
            } else {
                by by2 = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
                bp.d().aB[dg.aI.e] = aI;
                aI = by2;
            }
            ((ag)object).l = null;
            ((ag)object).k = null;
            ((dg)object).C();
            return;
        }
        if (bp.d().aB[dg.U].b.b == 26 || bp.d().aB[dg.U].b.b == 28) {
            int n2;
            if (bp.d().aB[dg.U].b.b == 28) {
                n2 = 0;
                while (n2 < aA.length) {
                    if (aA[n2] != null && dg.aA[n2].b.b == 28) {
                        object = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                        bp.d().aB[dg.aA[n2].e] = aA[n2];
                        dg.aA[n2] = object;
                        return;
                    }
                    ++n2;
                }
            }
            n2 = 0;
            while (n2 < aA.length) {
                if (aA[n2] == null) {
                    dg.aA[n2] = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    ((ag)object).l = null;
                    ((ag)object).k = null;
                    ((dg)object).C();
                    return;
                }
                ++n2;
            }
            main.a.K.a(df.eo, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        main.a.K.a(df.ei, null, new bd(df.H, 2), null);
        object = main.a.K;
        main.a.J = object;
    }

    private void l(int n2) {
        if (aE[n2] == null) {
            dg.aE[n2] = bp.d().aB[U];
            bp.d().aB[dg.U] = null;
        } else {
            by by2 = bp.d().aB[U];
            bp.d().aB[dg.U] = null;
            bp.d().aB[dg.aE[n2].e] = aE[n2];
            dg.aE[n2] = by2;
        }
        this.l = null;
        this.k = null;
        this.C();
    }

    private void bK() {
        if (bp.d().aB[U].b()) {
            if (bp.d().aB[dg.U].j > 0) {
                ((dg)((Object)br2)).l(0);
                return;
            }
            ((dg)((Object)br2)).l(1);
            return;
        }
        if (bp.d().aB[dg.U].b.a == 269 || bp.d().aB[dg.U].b.a == 270 || bp.d().aB[dg.U].b.a == 271) {
            ((dg)((Object)br2)).l(2);
            return;
        }
        main.a.K.a(df.ej, null, new bd(df.H, 2), null);
        br br2 = main.a.K;
        main.a.J = br2;
    }

    private void bL() {
        by by2 = null;
        by2 = aE[2];
        dg.aE[2] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private void bM() {
        by by2 = null;
        by2 = aE[U];
        dg.aE[dg.U] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private void bN() {
        by by2 = dg.k(10);
        dg.aA[dg.U] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private static void bO() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aj, 111001));
        if (aI != null) {
            int n2 = 0;
            while (n2 < aA.length) {
                if (aA[n2] != null) {
                    aa2.addElement(new bd(df.bV, 110981));
                    break;
                }
                ++n2;
            }
        }
        main.a.F.a(aa2);
    }

    private void bP() {
        aa aa2 = new aa();
        aa2.addElement(this.fW);
        int n2 = 0;
        while (n2 < aE.length) {
            if (aE[n2] == null) {
                this.k = null;
                break;
            }
            if (n2 == aE.length - 1) {
                aa2.addElement(new bd(df.bV, 140131));
            }
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private void bQ() {
        aa aa2 = new aa();
        aa2.addElement(this.fV);
        int n2 = 0;
        while (n2 < aA.length) {
            if (aA[n2] != null) {
                aa2.addElement(new bd(df.bV, 110981));
                break;
            }
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private static void c(by by2) {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110921, by2));
        aa2.addElement(new bd(df.at, 110922, by2));
        main.a.F.a(aa2);
    }

    private static void bR() {
        V = 0;
        aa.a();
        if (et == 0) {
            et = 1;
            return;
        }
        et = 0;
    }

    private void bS() {
        W = 0;
        aR = false;
        this.k = this.eA;
        this.m = this.cE;
        this.l = null;
        System.gc();
        this.v();
        this.af();
    }

    private static void bT() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110851));
        aa2.addElement(new bd(df.at, 110852));
        main.a.F.a(aa2);
    }

    private static void bU() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aY, 110841));
        aa2.addElement(new bd(df.aZ, 110842));
        main.a.F.a(aa2);
    }

    private static void bV() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.eD, 110821));
        if (!main.a.g) {
            if (fJ == 0) {
                aa2.addElement(new bd(df.iJ, 2003));
            } else {
                aa2.addElement(new bd(df.iI, 2003));
            }
        }
        main.a.F.a(aa2);
    }

    private static void bW() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.hs[0], 110811));
        aa2.addElement(new bd(df.hs[1], 110812));
        main.a.F.a(aa2);
    }

    private static void c(String string) {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gx[0], 110801));
        aa2.addElement(new bd(df.gx[1], 110802));
        aa2.addElement(new bd(df.gx[2], 110803, string));
        aa2.addElement(new bd(df.gb[7], 12002, string));
        aa2.addElement(new bd(df.gb[6], 110804));
        main.a.F.a(aa2);
    }

    private static void bX() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aY, 140011));
        aa2.addElement(new bd(df.aZ, 140012));
        main.a.F.a(aa2);
    }

    private static void d(String string) {
        main.a.a(df.gD, new bd(df.ah, 1107921, string), new bd(df.au, 1));
    }

    private static void bY() {
        cz cz2 = (cz)I.elementAt(V);
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gb[6], 1108041, cz2.a));
        aa2.addElement(new bd(df.aw, 12002, cz2.a));
        if (cz2.b == 4) {
            aa2.addElement(new bd(df.bc, 1107931, cz2.a));
            aa2.addElement(new bd(df.bd, 1107932, cz2.a));
        } else {
            aa2.addElement(new bd(df.gA, 110791, cz2.a));
            aa2.addElement(new bd(df.C, 14020, cz2.a));
            aa2.addElement(new bd(df.W, 110792, cz2.a));
        }
        main.a.F.a(aa2);
    }

    private void a(byte by2) {
        if (V < 0 || V >= J.size()) {
            return;
        }
        cf cf2 = null;
        try {
            cf2 = (cf)J.elementAt(V);
            String string = null;
            string = cf2 != null ? cf2.b : "raned=null";
            dq.a().a(by2, string);
            this.v();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void bZ() {
        if (V < 0 || V >= J.size()) {
            return;
        }
        int n2 = ((dv)dg.J.elementAt((int)dg.V)).a;
        dq.a().C(n2);
    }

    private static void ca() {
        cz cz2 = (cz)L.elementAt(V);
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gb[6], 1108041, cz2.a));
        aa2.addElement(new bd(df.aw, 12002, cz2.a));
        aa2.addElement(new bd(df.gA, 11076, cz2.a));
        aa2.addElement(new bd(df.C, 14020, cz2.a));
        aa2.addElement(new bd(df.W, 11077, cz2.a));
        main.a.F.a(aa2);
    }

    private static void e(String string) {
        main.a.a(df.gD, new bd(df.ah, 110771, string), new bd(df.au, 1));
    }

    private void cb() {
        aO = false;
        this.ec = null;
        this.eb = null;
        this.l = null;
        this.v();
    }

    private void a(short s2, String string) {
        at.a(string, s2);
        aO = false;
        this.ec = null;
        this.eb = null;
        this.l = null;
        this.v();
    }

    private static void cc() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.ao, 110721));
        aa2.addElement(new bd(df.ap, 110722));
        aa2.addElement(new bd(df.aq, 110723));
        main.a.F.a(aa2);
    }

    private static void a(db db2) {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gh, 110701));
        if (!db2.e) {
            aa2.addElement(new bd(df.gj, 110702));
        } else {
            aa2.addElement(new bd(df.gk, 110703));
        }
        main.a.F.a(aa2);
    }

    private void cd() {
        aO = false;
        this.ec = null;
        this.eb = null;
        this.l = null;
        this.v();
    }

    private void f(String string) {
        at.b(string);
        aO = false;
        this.ec = null;
        this.eb = null;
        this.l = null;
        this.v();
    }

    private static void ce() {
        main.a.j();
        dq.a().a(aI, aA, dy);
    }

    private static void d(by by2) {
        main.a.j();
        dq.a().g(by2.e, 1);
    }

    private void cf() {
        W = 0;
        aR = false;
        this.v();
        if (dg.aV.p == bp.d().p) {
            this.af();
        }
    }

    private void cg() {
        if (this.eJ < 0 || this.eJ >= ez.length) {
            return;
        }
        z z2 = ez[this.eJ];
        this.a(z2, false, true);
    }

    private static void e(by by2) {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        if (n2 > by2.f) {
            main.a.a(df.eR);
            return;
        }
        main.a.j();
        main.a.a(df.eI, new bd(df.ah, 11058, by2), new bd(df.au, 1));
    }

    private static void f(by object) {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.K.a(df.eN, null, new bd(df.H, 1), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        dq.a().a(((by)object).o, ((by)object).e, n2);
        main.a.j();
    }

    private void ch() {
        int n2 = U;
        this.v();
        this.dZ = n2;
        dq.a().e();
    }

    private static void g(by by2) {
        aa aa2 = new aa();
        int n2 = 1;
        while (n2 < df.fM[3].length) {
            aa2.addElement(new bd(df.fM[3][n2], 110531, by2));
            ++n2;
        }
        main.a.F.a(aa2);
    }

    private static void ci() {
        aa aa2 = new aa();
        aa2.addElement(new bd(String.valueOf(df.gM) + (bg.c ? df.Q : df.R), 120061));
        aa2.addElement(new bd(String.valueOf(df.gN) + (bg.d ? df.Q : df.R), 120062));
        main.a.F.a(aa2);
    }

    private static void cj() {
        aa aa2 = new aa();
        int n2 = 0;
        while (n2 < bg.d().a.size()) {
            bq bq2 = (bq)bg.d().a.elementAt(n2);
            aa2.addElement(new bd(bq2.b, 12001, new Integer(n2)));
            ++n2;
        }
        aa2.addElement(new bd(df.hq, 12006));
        aa2.addElement(new bd(df.hr, 12008));
        main.a.F.a(aa2);
        aM = true;
    }

    private void ck() {
        bq bq2 = bg.d().e();
        aO = true;
        aU = true;
        this.ea = true;
        dg.b(175, 200);
        if (main.a.B - cg < 40 && !main.a.g) {
            cg -= 52;
        }
        this.m = new bd(df.H, 11066);
        this.l = null;
        this.k = null;
        if (!main.a.g) {
            this.cl();
        } else {
            this.k = new bd(df.aw, 12005);
        }
        if (bq2.a == 2) {
            this.l = new bd(df.I, 120051, bq2);
        }
        aw.a().f = null;
        this.ec = bq2.b;
        this.eb = bq2.c;
        bg.d().e(bq2.b);
        if (bq2.a == 1) {
            bg.f = false;
        }
        if (bq2.a == 4) {
            bg.e = false;
        }
        this.I();
    }

    private void cl() {
        bq bq2 = bg.d().e();
        if (bq2.a == 0) {
            aw.a().a(df.gI[0]);
        }
        if (bq2.a == 1) {
            aw.a().a(df.gJ[0]);
        }
        if (bq2.a == 2) {
            aw.a().a(bq2.b);
        }
        if (bq2.a == 3) {
            aw.a().a(df.gK[0]);
        }
        if (bq2.a == 4) {
            aw.a().a(df.gL[0]);
        }
    }

    private void cm() {
        try {
            GameMidlet.g.platformRequest(object.gB);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            Object object = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    private static void cn() {
        main.a.j();
        dq.a().f(U);
    }

    private static void co() {
        dq.a().g();
    }

    private static void cp() {
        dq.a().s();
    }

    private static void cq() {
        V = 0;
        dq.a().d();
    }

    private static void cr() {
        db db2;
        if (V >= 0 && V < H.size() && (db2 = (db)H.elementAt(V)) != null) {
            dq.a().h(db2.d);
        }
    }

    private static void m(int n2) {
        switch (n2) {
            case 1: {
                dq.a().z(0);
                return;
            }
            case 2: {
                dq.a().z(1);
                return;
            }
            case 3: {
                dq.a().z(3);
            }
        }
    }

    private static void cs() {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.j();
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        if (bp.d().ar == 0 || n2 > bp.d().ar) {
            main.a.a(df.eP);
            return;
        }
        dq.a().j(n2);
        main.a.j();
    }

    private void ct() {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.j();
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        if (bp.d().ar == 0 || n2 > bp.d().ar) {
            main.a.a(df.eO);
            return;
        }
        this.bj += n2;
        bp.d().ar -= n2;
        main.a.j();
    }

    private static void cu() {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.j();
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        if (bp.d().as == 0 || n2 > bp.d().as) {
            main.a.a(df.eQ);
            return;
        }
        dq.a().k(n2);
        main.a.j();
    }

    private static void cv() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gq[0], 11000651));
        aa2.addElement(new bd(df.gq[1], 11000652));
        aa2.addElement(new bd(df.gq[3], 11000653));
        main.a.F.a(aa2);
    }

    private static void cw() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.gr[6], 1100067));
        aa2.addElement(new bd(df.gr[3], 1100062));
        aa2.addElement(new bd(df.gr[1], 1100063));
        aa2.addElement(new bd(df.gr[2], 1100064));
        aa2.addElement(new bd(df.gr[0], 1100065));
        aa2.addElement(new bd(df.gr[7], 1100068));
        main.a.F.a(aa2);
    }

    private void cx() {
        this.aa();
        if (this.m != null) {
            this.m.a();
        }
    }

    private void cy() {
        this.aa();
        if (this.k != null) {
            this.k.a();
        }
    }

    private void n(int n2) {
        if (bp.d().aV != null && !bp.d().aV.B()) {
            switch (n2) {
                case 1: {
                    dq.a().f(bp.d().aV.ab);
                    return;
                }
                case 2: {
                    dq.a().s(bp.d().aV.p);
                    return;
                }
                case 3: {
                    dq.a().v(bp.d().aV.p);
                    return;
                }
                case 4: {
                    dq.a().w(bp.d().aV.p);
                    return;
                }
                case 5: {
                    this.g(bp.d().aV.p);
                    return;
                }
                case 6: {
                    dq.a().e(bp.d().aV.ab);
                    return;
                }
                case 7: {
                    dq.a().a(bp.d().aV.ab, 0);
                    dg.n().v();
                    return;
                }
                case 8: {
                    dq.a().F(bp.d().aV.p);
                    return;
                }
                case 9: {
                    dq.a().G(bp.d().aV.p);
                    return;
                }
                case 10: {
                    bp.bq = !bp.bq;
                    bp.bv = bp.d().aV.p;
                }
            }
        }
    }

    public final void g(int n2) {
        if (System.currentTimeMillis() - this.he > 500L) {
            dq.a().x(n2);
            this.he = System.currentTimeMillis();
        }
        if ((af.a(bp.d().i, bp.d().j) & 2) == 2) {
            bp.d().a(A[49], 0);
            return;
        }
        bp.d().a(A[49], 1);
    }

    private static void cz() {
        main.a.k();
        bg.d();
        bg.f();
        dh.a().c();
        long l2 = 1000L;
        int n2 = 9999;
        Object var0_2 = null;
        bf.a = 9999;
        bf.b = System.currentTimeMillis() + l2;
        bf.c = true;
    }

    private static void cA() {
        main.a.a(df.bw, new bd(df.ah, 1100041), new bd(df.au, 1));
    }

    private static void cB() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.ge[1], 110381));
        aa2.addElement(new bd(df.ge[2], 110382));
        aa2.addElement(new bd(df.ge[3], 110383));
        main.a.F.a(aa2);
    }

    private static void cC() {
        dq.a().f();
    }

    private void cD() {
        by by2 = aC[U];
        dg.aC[dg.U] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private void cE() {
        by by2;
        bp.d().aB[by2.e] = by2 = aJ;
        aJ = null;
        if (!(dJ || dK || dL || dR || aB == null)) {
            int n2 = 0;
            while (n2 < aB.length) {
                dg.aB[n2] = null;
                ++n2;
            }
        }
        this.l = null;
        this.k = null;
        this.C();
    }

    private void cF() {
        by by2;
        bp.d().aB[by2.e] = by2 = aI;
        aI = null;
        this.l = null;
        this.k = null;
        this.C();
    }

    private void cG() {
        by by2;
        bp.d().aB[by2.e] = by2 = aE[U];
        dg.aE[dg.U] = null;
        this.l = null;
        this.k = null;
        this.C();
    }

    private void cH() {
        dq.a().j();
        this.bh = 2;
        if (dg.n().bh >= 2 && dg.n().bi >= 2) {
            b.a();
        }
    }

    private void cI() {
        dq.a().a(this.bj, aC);
        this.bh = 1;
        if (dg.n().bh == 1 && dg.n().bi == 1) {
            dg.n().bl = (int)(System.currentTimeMillis() / 1000L + 5L);
        }
        this.k = this.fR;
    }

    private void cJ() {
        by by2 = aC[U];
        this.a(3, by2);
    }

    private void cK() {
        Object object;
        if (!bp.d().aB[dg.U].h) {
            int n2 = 0;
            while (n2 < aC.length) {
                if (aC[n2] == null) {
                    dg.aC[n2] = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    ((ag)object).l = null;
                    ((ag)object).k = null;
                    ((dg)object).C();
                    return;
                }
                ++n2;
            }
            main.a.K.a(df.en, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        main.a.K.a(df.ef, null, new bd(df.H, 2), null);
        object = main.a.K;
        main.a.J = object;
    }

    private void cL() {
        aa aa2 = new aa();
        aa2.addElement(this.gb);
        aa2.addElement(this.fY);
        main.a.F.a(aa2);
    }

    private void cM() {
        aa aa2 = new aa();
        aa2.addElement(this.fZ);
        if (this.bh == 0) {
            aa2.addElement(this.fQ);
        } else if (this.bh == 1 && this.bi >= 1 && (long)this.bl - System.currentTimeMillis() / 1000L <= 0L) {
            aa2.addElement(this.fR);
        }
        main.a.F.a(aa2);
    }

    private static void cN() {
        try {
            Object object = dg.k(3);
            if (((by)object).b.c != 2 && ((by)object).b.c != bp.d().q) {
                main.a.K.a(df.ff, null, new bd(df.H, 1), null);
                object = main.a.K;
                main.a.J = object;
                return;
            }
            if (((by)object).b.f > bp.d().w) {
                main.a.K.a(df.fh, null, new bd(df.H, 1), null);
                object = main.a.K;
                main.a.J = object;
                return;
            }
            if ((((by)object).b() || ((by)object).c()) && !((by)object).h) {
                main.a.a(df.eH, new bd(df.ah, 11051, null), new bd(df.au, 1));
                return;
            }
            if (((by)object).b.a == 35 || ((by)object).b.a == 37) {
                aa aa2 = new aa();
                int n2 = 0;
                while (n2 < 3) {
                    aa2.addElement(new bd(df.fM[n2][0], 11052, object));
                    ++n2;
                }
                aa2.addElement(new bd(df.fM[3][0], 11053, object));
                aa2.addElement(new bd(df.fM[4][0], 11054));
                main.a.F.a(aa2);
                return;
            }
            if (((by)object).b.a == 514) {
                main.a.M.a("\u0110\u1ebfn: ", "L\u1eddi ch\u00fac: ");
                main.a.M.a("Ch\u00fac t\u1ebft", new bd(df.H, main.a.k, 8882, null), new bd("G\u1eedi", main.a.k, 1608, null), 0, 0);
                return;
            }
            if (((by)object).b.a == 515) {
                main.a.M.a("\u0110\u1ebfn: ", "L\u1eddi ch\u00fac: ");
                main.a.M.a("Ch\u00fac t\u1ebft", new bd(df.H, main.a.k, 8882, null), new bd("G\u1eedi", main.a.k, 16081, null), 0, 0);
                return;
            }
            dq.a().f(U);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void cO() {
        if (bp.d().aB[U] == null || bp.d().aB[dg.U].f <= 1) {
            return;
        }
        main.a.L.a(df.hl, new bd(df.ax, main.a.k, 88835, String.valueOf(U)), 1);
    }

    private static void cP() {
        if (bp.d().aB[U] == null) {
            return;
        }
        if (bp.d().aB[dg.U].h) {
            ae.a(df.fT);
            return;
        }
        main.a.a(df.cY, new bd(df.ah, 2001), new bd(df.au, 2002));
    }

    private void cQ() {
        if (cL == 1) {
            by by2 = dg.k(3);
            if (main.a.j) {
                this.a(3, by2, this.gU, null);
                return;
            }
            this.a(3, by2, null, null);
        }
    }

    private void cR() {
        aa aa2 = new aa();
        aa2.addElement(this.gU);
        aa2.addElement(this.gX);
        if (bp.d().aB[U] != null && bp.d().aB[dg.U].f > 1) {
            aa2.addElement(this.gY);
        }
        aa2.addElement(new bd(df.ad, 110221));
        main.a.F.a(aa2);
    }

    private static void cS() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 140221));
        aa2.addElement(new bd(df.at, 140222));
        main.a.F.a(aa2);
    }

    private static void cT() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110201));
        aa2.addElement(new bd(df.at, 110202));
        main.a.F.a(aa2);
    }

    private static void cU() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110181));
        aa2.addElement(new bd(df.at, 110182));
        main.a.F.a(aa2);
    }

    private static void cV() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 130021));
        aa2.addElement(new bd(df.at, 130022));
        main.a.F.a(aa2);
    }

    private static void cW() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110161));
        aa2.addElement(new bd(df.at, 110162));
        main.a.F.a(aa2);
    }

    private static void cX() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110141));
        aa2.addElement(new bd(df.at, 110142));
        main.a.F.a(aa2);
    }

    private static void cY() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110121));
        aa2.addElement(new bd(df.at, 110122));
        main.a.F.a(aa2);
    }

    private static void cZ() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110101));
        aa2.addElement(new bd(df.at, 110102));
        main.a.F.a(aa2);
    }

    private static void da() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110081));
        aa2.addElement(new bd(df.at, 110082));
        main.a.F.a(aa2);
    }

    private static void db() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.as, 110051));
        aa2.addElement(new bd(df.at, 110052));
        main.a.F.a(aa2);
    }

    private static void b(byte by2) {
        by by3 = dg.k(by2);
        dq.a().a(by3.o, by3.e, 1);
    }

    private void c(byte by2) {
        by by3 = dg.k(by2);
        dg.a(by3);
    }

    private void d(byte by2) {
        by by3 = dg.k(by2);
        this.a(by3.o, by3);
    }

    private static void dc() {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.a(df.eq);
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        if (bp.d().F == 0 || n2 > bp.d().F) {
            main.a.a(df.ep);
            return;
        }
        dq.a().e(cL - 1, n2);
        main.a.j();
    }

    private static void dd() {
        Object object = main.a.L.d.d();
        if (((String)object).trim().equals("")) {
            main.a.a(df.eq);
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt((String)object);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (bp.d().G == 0 || n2 > bp.d().G) {
            main.a.a(df.eq);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        dq.a().f(bp.d().av.c[dg.U].a, n2);
        main.a.j();
    }

    private static void de() {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.a(df.ev);
            return;
        }
        dq.a().e(string);
        main.a.j();
    }

    public final void a(int n2, Object object) {
        if (n2 == 9999) {
            main.a.k.n();
        }
    }

    public final void L() {
        this.J();
        W = 3;
        aR = true;
        dg.b(175, 200);
        this.m = this.ge;
    }

    public static void M() {
        hh = new int[Q.size()];
        hi = new int[Q.size()];
        int n2 = 0;
        while (n2 < Q.size()) {
            if (n2 != hg) {
                int n3;
                int n4;
                ci ci2 = (ci)Q.elementAt(n2);
                if (!bY) {
                    dg.hh[n2] = n4 = Math.abs(ci2.i - cm);
                    dg.hi[n2] = n3 = Math.abs(ci2.j - cn);
                } else {
                    dg.hh[n2] = n4 = Math.abs(ci2.i - bp.d().i);
                    dg.hi[n2] = n3 = Math.abs(ci2.j - bp.d().j);
                    co = 700;
                }
            }
            ++n2;
        }
        if (cb != 1 || bp.d().aR != null || bp.d().aU != null || bp.d().aR != null || bp.d().n == 14 || bp.d().x <= 0 || bp.d().aW != null) {
            return;
        }
        if (System.currentTimeMillis() - hf + 2000L >= 0L) {
            if (!(bY || bp.d().aR == null || bp.d().i >= cm - co && bp.d().j <= cm + co && bp.d().j >= cn - co && bp.d().j <= cn + co)) {
                bp.d().i = cm;
                bp.d().j = cn;
            }
            n2 = 0;
            while (n2 < Q.size()) {
                if (n2 != hg && hh[n2] < co && hi[n2] < co && bp.d().aR == null) {
                    ci ci3 = (ci)Q.elementAt(n2);
                    if (ci3.h != 0 && ci3.h != 1 && ci3.w != 3) {
                        ap.a(141, bp.d().i, bp.d().j, 2);
                        bp.d().i = ci3.i;
                        bp.d().j = ci3.j;
                        bp.d().n = 4;
                        bp.d().aR = ci3;
                        ap.a(141, bp.d().i, bp.d().j, 2);
                        bp.d().bB = ci3.i;
                        bp.d().bC = ci3.j;
                        dq.a().b(ci3.m);
                        hg = n2;
                        hf = System.currentTimeMillis();
                    }
                }
                ++n2;
            }
        }
    }

    private void O(t t2) {
        if (cU) {
            ay.a(ce, cd, cf, cg, t2);
            dg.a(t2, df.v, false);
            gD = ce + 5;
            gE = cd + 40;
            if (J.size() == 0) {
                dd.i.a(t2, df.go, ce + cf / 2, cd + 40, 2);
                return;
            }
            t2.a(-16770791);
            t2.c(gD - 2, gE - 2, cf - 6, cK * 3 + 8);
            dg.b(t2);
            aa.a(J.size(), cK, gD, gE, cf - 3, cK * 3 + 4, true, 1);
            aa.a(t2, gD, gE, cf - 3, cK * 3 + 6);
            cM = J.size();
            int n2 = 0;
            while (n2 < J.size()) {
                cf cf2 = null;
                try {
                    cf2 = (cf)J.elementAt(n2);
                }
                catch (Exception exception) {}
                if (cf2 != null) {
                    if (V == n2) {
                        t2.a(ay.b);
                        t2.c(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                        t2.a(0xFFFFFF);
                        t2.b(gD + 2, gE + V * cK + 2, cf - 15, cK - 4);
                    } else {
                        t2.a(ay.a);
                        t2.c(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                        t2.a(13932896);
                        t2.b(gD + 2, gE + n2 * cK + 2, cf - 15, cK - 4);
                    }
                    dd.j.a(t2, cf2.b, gD + (cf - 10) / 2 - cf / 4, gE + n2 * cK + cK / 2 - 10, 2);
                    dd.j.a(t2, "-", gD + (cf - 10) / 2, gE + n2 * cK + cK / 2 - 10, 2);
                    dd.j.a(t2, String.valueOf(df.u) + ": " + cf2.a, gD + (cf - 10) / 2 + cf / 4, gE + n2 * cK + cK / 2 - 10, 2);
                    dd.i.a(t2, cf2.c, gD + cf / 2, gE + n2 * cK + cK / 2 + 5, 2);
                }
                ++n2;
            }
        }
    }

    private static void df() {
        dq.a().a((short)102, "", cp);
    }

    private void dg() {
        this.ht = true;
        dq.a().a((short)101, "", cp);
    }

    private static void dh() {
        Short s2 = new Short(1);
        main.a.L.a(df.s, new bd(df.t, main.a.k, 1700, s2), 1);
    }

    public final void a(String string, short s2, String string2, short s3, String string3, short s4, String string4, String string5, byte by2) {
        b.b();
        dP = true;
        this.ea = true;
        V = 0;
        dg.b(175, 200);
        this.k = null;
        this.l = new bd(df.t, 1701);
        this.m = new bd(df.H, 1702);
        cp = by2;
        this.ec = string;
        this.hk = s2;
        this.ho = string2;
        this.hl = s3;
        this.hp = string3;
        this.hm = s4;
        this.hq = string4;
        this.hr = string5;
        string = this.hr == "" ? "" : String.valueOf(df.q) + this.hr + df.eA;
        string = "c3" + this.ho + "\n" + df.r + s4 + "\n" + string + "\n\n" + "c0" + this.hq;
        this.eb = dd.g.a(string, cf - 30);
        this.hs = System.currentTimeMillis();
        this.hn = dg.a(this.hs, (int)this.hk);
        this.ht = false;
    }

    private static String a(long l2, int n2) {
        String string = null;
        long l3 = (l2 + (long)(n2 * 1000) - System.currentTimeMillis()) / 1000L;
        if (l3 <= 0L) {
            return "";
        }
        long l4 = l3 / 60L;
        long l5 = l3;
        string = l4 > 0L ? (l4 < 10L ? (l3 % 60L >= 0L && l3 % 60L < 10L ? "0" + l4 + ":" + "0" + l3 % 60L : "0" + l4 + ":" + l3 % 60L) : (l3 % 60L >= 0L && l3 % 60L < 10L ? String.valueOf(l4) + ":" + "0" + l3 % 60L : String.valueOf(l4) + ":" + l3 % 60L)) : (l5 < 10L ? "0" + l5 + "s" : String.valueOf(l5) + "s");
        return string;
    }

    private void di() {
        dP = false;
        this.ec = null;
        this.eb = null;
        this.l = null;
        this.k = null;
        this.m = null;
        this.v();
    }

    private void P(t t2) {
        if (this.eb == null || !dP) {
            return;
        }
        dg dg2 = this;
        if (!dg2.ht) {
            long l2;
            if (dg2.hm > 1) {
                dg2.hn = dg.a(dg2.hs, (int)dg2.hk);
            }
            if (dg2.hn == "") {
                dg2.dg();
            }
            if ((l2 = (dg2.hs + (long)(dg2.hk * 1000) - System.currentTimeMillis()) / 1000L) > 8L && l2 % 5L == 0L) {
                dg2.dg();
            }
            if (l2 <= 10L) {
                dg2.l = null;
            }
            dg2.hu = l2 <= 20L ? dd.a : dd.d;
        }
        dg.b(t2);
        ay.a(ce, cd, cf, cg, t2);
        if (this.ec != null) {
            dg.a(t2, this.ec, aU);
        }
        gD = ce + 15;
        gE = cd + 15;
        if (this.ec != null) {
            gE += 10;
        }
        this.hu.a(t2, this.hn, ce + cf / 2, gE + 12, 2);
        dd.j.a(t2, df.p, ce + cf / 2, gE + 30, 2);
        String string = String.valueOf(this.hl) + "." + this.hp + "%";
        int n2 = 12;
        int n3 = cf / 2;
        int n4 = gE + 42;
        int n5 = ce + cf / 2;
        int n6 = this.hl;
        Object object = t2;
        ((t)object).a(0);
        ((t)object).c(n5 - n3 / 2, n4, n3, 12);
        n6 = n6 * n3 / 100;
        if (n6 < 1) {
            n6 = 1;
        }
        ((t)object).d(n5 - n3 / 2, n4, n6, 12);
        ((t)object).a(0xFF0000);
        ((t)object).c(n5 - n3 / 2, n4, n3, 12);
        dg.b((t)object);
        dd.j.a((t)object, string, ce + cf / 2, n4, 2);
        cM = this.eb.size();
        aa.a(cM, 12, ce, gE + 48, cf, cg - 42 - (this.ec != null ? 10 : 0), true, 1);
        aa.a(t2);
        this.gL = gE + 48;
        object = dd.i;
        n4 = 0;
        while (n4 < this.eb.size()) {
            String string2 = (String)this.eb.elementAt(n4);
            if (string2 == null || this.eb == null || object == null) break;
            if (string2.startsWith("c")) {
                if (string2.startsWith("c0")) {
                    string2 = string2.substring(2);
                    object = dd.i;
                } else if (string2.startsWith("c1")) {
                    string2 = string2.substring(2);
                    object = dd.d;
                } else if (string2.startsWith("c2")) {
                    string2 = string2.substring(2);
                    object = dd.e;
                } else if (string2.startsWith("c3")) {
                    string2 = string2.substring(2);
                    object = dd.j;
                } else if (string2.startsWith("c4")) {
                    string2 = string2.substring(2);
                    object = dd.a;
                } else if (string2.startsWith("c5")) {
                    string2 = string2.substring(2);
                    object = dd.l;
                } else if (string2.startsWith("c6")) {
                    string2 = string2.substring(2);
                    object = dd.k;
                } else if (string2.startsWith("c7")) {
                    string2 = string2.substring(2);
                    object = dd.b;
                } else if (string2.startsWith("c8")) {
                    string2 = string2.substring(2);
                    object = dd.m;
                } else if (string2.startsWith("c9")) {
                    string2 = string2.substring(2);
                    object = dd.n;
                }
            }
            ((dd)object).a(t2, string2, ce + cf / 2, this.gL += 12, 2);
            ++n4;
        }
    }

    public final void a() {
        super.a();
    }

    public final void N() {
        this.hv = new byte[]{-1, -1, -1, -1, -1, -1};
    }

    private void dj() {
        if (main.a.o[4]) {
            this.e((byte)0);
            main.a.i();
            return;
        }
        if (main.a.o[2]) {
            this.e((byte)1);
            main.a.i();
            return;
        }
        if (main.a.o[6]) {
            this.e((byte)2);
            main.a.i();
        }
    }

    private void e(byte by2) {
        int n2 = 0;
        while (n2 < this.hv.length) {
            if (n2 != this.hv.length - 1) {
                this.hv[n2] = this.hv[n2 + 1];
            } else {
                this.hv[n2] = by2;
                dq.a().a(by2);
            }
            ++n2;
        }
    }

    private void Q(t t2) {
        try {
            block9: {
                Object object;
                block7: {
                    block8: {
                        object = this;
                        cM = 1;
                        ((dg)object).hA = cf;
                        ((dg)object).hB = cg;
                        ((dg)object).hy = ce;
                        ((dg)object).hz = cd;
                        ((dg)object).hJ = ((dg)object).hy + 25;
                        ((dg)object).hK = ((dg)object).hz + 60;
                        ((dg)object).hL = ((dg)object).hA - 50;
                        ((dg)object).hM = 70;
                        ((dg)object).hE = ((dg)object).hA - 49;
                        ((dg)object).hF = 10;
                        ((dg)object).hC = main.a.C - ((dg)object).hE / 2;
                        ((dg)object).hD = ((dg)object).hK + ((dg)object).hM - ((dg)object).hF;
                        ((dg)object).hI = 18;
                        ((dg)object).hG = main.a.C - (((dg)object).hx.size() - 1) * ((((dg)object).hI + 5) / 2);
                        ((dg)object).hH = ((dg)object).hz + ((dg)object).hB - ((dg)object).hI / 2 - 5;
                        object = this.hx.size() > 0 && this.hw <= this.hx.size() ? (o)this.hx.elementAt(this.hw) : null;
                        if (object == null) {
                            t2.a(13606712);
                            t2.b(this.hJ - 1, this.hK - 1, this.hL + 1, this.hM + 1);
                            t2.d(this.hJ, this.hK, this.hL, this.hM);
                            t2.a(6425);
                            t2.c(this.hJ, this.hK, this.hL, this.hM);
                            return;
                        }
                        dd.e.a(t2, ((o)object).a, main.a.C, this.hz + 35, 2);
                        t2.a(13606712);
                        t2.b(this.hJ - 1, this.hK - 1, this.hL + 1, this.hM + 1);
                        t2.d(this.hJ, this.hK, this.hL, this.hM);
                        t2.a(6425);
                        t2.c(this.hJ, this.hK, this.hL, this.hM);
                        ab.a(t2, ((o)object).d, this.hJ + this.hL / 2, this.hK + this.hM / 2 - 10, 0, 3);
                        dg.b(t2);
                        if (((o)object).e < 0) break block7;
                        this.hO = am.a(((o)object).j, ((o)object).e);
                        if (this.hO.equals("")) break block8;
                        dd.j.a(t2, String.valueOf(((o)object).f) + " " + this.hO, this.hJ, this.hD + 15, 0);
                        break block9;
                    }
                    --this.hN;
                    if (this.hN > 0) break block9;
                    dq.a().y();
                    this.hN = 100;
                    break block9;
                }
                int n2 = 0;
                while (n2 < ((o)object).b) {
                    ab.a(t2, 628, this.hy + 95 + n2 * 12 - ((o)object).b * 6, this.hz + 50, 0, 3);
                    ++n2;
                }
                n2 = ((o)object).h * this.hE / ((o)object).i;
                t2.a(2506246);
                t2.c(this.hC, this.hD, this.hE, this.hF);
                t2.a(371981);
                t2.c(this.hC, this.hD, n2, this.hF);
                t2.a(13606712);
                t2.b(this.hC, this.hD, this.hE, this.hF);
                dd.i.a(t2, String.valueOf(((o)object).h) + "/" + ((o)object).i, this.hC + this.hE / 2, this.hD, 2);
                int n3 = 0;
                while (n3 < ((o)object).g.size()) {
                    String string = (String)((o)object).g.elementAt(n3);
                    dd.j.a(t2, string, this.hJ + this.hL / 2, this.hD + 15 + n3 * 10, 2);
                    ++n3;
                }
            }
            int n4 = 0;
            while (n4 < this.hx.size()) {
                o o2 = this.hx.size() > 0 && n4 <= this.hx.size() ? (o)this.hx.elementAt(n4) : null;
                if (o2 != null) {
                    t2.a(0);
                    t2.c(this.hG + n4 * (this.hI + 5) - this.hI / 2, this.hH - this.hI / 2, this.hI, this.hI);
                    ab.a(t2, 154, this.hG + n4 * (this.hI + 5), this.hH, 0, 3);
                    t2.a(0xBB6611);
                    t2.b(this.hG + n4 * (this.hI + 5) - this.hI / 2, this.hH - this.hI / 2, this.hI, this.hI);
                    ab.a(t2, o2.c, this.hG + n4 * (this.hI + 5), this.hH, 0, 3);
                }
                ++n4;
            }
            t2.a(0xFFFFFF);
            t2.b(this.hG + this.hw * (this.hI + 5) - this.hI / 2, this.hH - this.hI / 2, this.hI, this.hI);
            return;
        }
        catch (Exception exception) {
            System.out.println("e:" + exception.toString());
            return;
        }
    }

    public final void a(o o2) {
        this.hx.addElement(o2);
    }

    public final void O() {
        this.hx.removeAllElements();
    }

    private void dk() {
        Object object;
        try {
            if (dL && bp.d().aB[U].d()) {
                if (aJ == null) {
                    if (bp.d().aB[dg.U].j < 10) {
                        aJ = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                        return;
                    }
                    main.a.K.a(df.b, null, new bd(df.H, 2), null);
                    object = main.a.K;
                    main.a.J = object;
                    return;
                }
                if (aB == null) {
                    aB = new by[24];
                }
                int n2 = 0;
                while (n2 < aB.length) {
                    if (aB[n2] == null) {
                        dg.aB[n2] = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                        ((ag)object).l = null;
                        ((ag)object).k = null;
                        ((dg)object).C();
                        return;
                    }
                    if (n2 == aB.length - 1) {
                        main.a.a(df.eo);
                    }
                    ++n2;
                }
                return;
            }
        }
        catch (Exception exception) {
            main.a.K.a(df.b, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            exception.printStackTrace();
        }
    }

    private void dl() {
        Object object;
        if (bp.d().aB[U].d()) {
            if (aJ == null) {
                aJ = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
            } else {
                by by2 = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
                bp.d().aB[dg.aJ.e] = aJ;
                aJ = by2;
            }
            ((ag)object).l = null;
            ((ag)object).k = null;
            ((dg)object).C();
            return;
        }
        if (bp.d().aB[U].b()) {
            if (aI == null) {
                aI = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
            } else {
                by by3 = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
                bp.d().aB[dg.aI.e] = aI;
                aI = by3;
            }
            ((ag)object).l = null;
            ((ag)object).k = null;
            ((dg)object).C();
            return;
        }
        if (bp.d().aB[dg.U].b.b == 26 || bp.d().aB[dg.U].b.b == 28) {
            int n2;
            if (bp.d().aB[dg.U].b.b == 28) {
                n2 = 0;
                while (n2 < aA.length) {
                    if (aA[n2] != null && dg.aA[n2].b.b == 28) {
                        object = bp.d().aB[U];
                        bp.d().aB[dg.U] = null;
                        bp.d().aB[dg.aA[n2].e] = aA[n2];
                        dg.aA[n2] = object;
                        return;
                    }
                    ++n2;
                }
            }
            n2 = 0;
            while (n2 < aA.length) {
                if (aA[n2] == null) {
                    dg.aA[n2] = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    ((ag)object).l = null;
                    ((ag)object).k = null;
                    ((dg)object).C();
                    return;
                }
                ++n2;
            }
            main.a.K.a(df.eo, null, new bd(df.H, 2), null);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        main.a.K.a(df.ei, null, new bd(df.H, 2), null);
        object = main.a.K;
        main.a.J = object;
    }

    private void o(int n2) {
        aa aa2 = new aa();
        if (n2 == 0) {
            aa2.addElement(this.fS);
        } else if (n2 == 1) {
            aa2.addElement(this.fT);
        } else if (n2 == 2) {
            aa2.addElement(this.fU);
        }
        if (aI != null && aJ != null) {
            int n3 = 0;
            while (n3 < aA.length) {
                if (aA[n3] != null) {
                    aa2.addElement(new bd(df.bV, 341));
                    break;
                }
                ++n3;
            }
        }
        main.a.F.a(aa2);
    }

    private void p(int n2) {
        by by2 = aJ;
        if (n2 == 1) {
            by2 = aI;
            aI = null;
        } else if (n2 == 2) {
            by2 = dg.k(47);
            dg.aA[dg.U] = null;
        } else {
            aJ = null;
        }
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private void dm() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < aA.length) {
            if (aA[n3] != null && dg.aA[n3].b.b == 26) {
                n2 += aX[dg.aA[n3].b.a];
            }
            ++n3;
        }
        n3 = 0;
        int n4 = 0;
        if (aJ != null) {
            if (be[dg.aJ.j] > bp.d().ar + bp.d().at) {
                n3 = 1;
            }
            n4 = n2 * 100 / ba[dg.aJ.j];
        }
        if (n3 != 0) {
            ae.a(df.fm, 15, dd.l);
            return;
        }
        if (n4 > 250) {
            main.a.a(df.fn, new bd(df.ah, 342), new bd(df.au, 1));
            return;
        }
        if (aJ != null && aI != null && aA.length > 0) {
            if (!dg.aI.h) {
                main.a.a(df.fo, new bd(df.ah, 342), new bd(df.au, 1));
                return;
            }
            dq.a().a((byte)0, aI, aJ, aA);
        }
    }

    private static void dn() {
        main.a.j();
        if (aJ != null && aI != null && aA.length > 0) {
            dq.a().a((byte)0, aI, aJ, aA);
        }
    }

    private void R(t t2) {
        block23: {
            if (dL) {
                if (W == 0) {
                    block24: {
                        Object object = df.cJ;
                        try {
                            Object object2;
                            int n2;
                            int n3;
                            ay.a(ce, cd, cf, cg, t2);
                            dg.a(t2, object[W], ((String[])object).length > 1);
                            gD = ce + 3;
                            gE = cd + 34 + cK;
                            int n4 = ce + 74;
                            int n5 = gE - cK - 3;
                            gK = 4;
                            if (aJ != null) {
                                int n6;
                                this.a(t2, aJ, n4, n5);
                                n3 = n5 + 25;
                                n2 = n4 + 35;
                                object2 = t2;
                                dg dg2 = this;
                                int n7 = dg2.hS[dg.aJ.j][0];
                                int n8 = 0;
                                cg cg2 = null;
                                if (dg.aJ.c != null) {
                                    n6 = 0;
                                    while (n6 < dg.aJ.c.size()) {
                                        cg2 = (cg)dg.aJ.c.elementAt(n6);
                                        if (cg2.c.a == 104) {
                                            n8 = cg2.a;
                                        }
                                        ++n6;
                                    }
                                }
                                n6 = 0;
                                int n9 = 0;
                                while (n9 < aB.length) {
                                    by by2 = aB[n9];
                                    if (by2 != null) {
                                        n6 += dg2.hS[by2.j][1];
                                    }
                                    ++n9;
                                }
                                int n10 = 0;
                                ((t)object2).a(0);
                                ((t)object2).c(n2, n3 - 5, 60, 5);
                                n9 = n8 * 60 / n7;
                                if (n9 <= 0) {
                                    n9 = 0;
                                } else if (n9 > 60) {
                                    n9 = 60;
                                }
                                ((t)object2).a(-16711936);
                                ((t)object2).c(n2, n3 - 5, n9, 5);
                                n10 = n6 * 60 / n7;
                                if (n10 >= 60 - n9) {
                                    n10 = 60 - n9;
                                }
                                ((t)object2).a(-16346586);
                                ((t)object2).c(n2 + n9, n3 - 5, n10, 5);
                                dd.j.a((t)object2, String.valueOf(n6 + n8) + "/" + n7, n2 + 30, n3 - 5 - 15, 2);
                            } else {
                                t2.a(6425);
                                t2.c(n4 - 1, n5 - 1, cK + 3, cK + 3);
                                ab.a(t2, 154, n4 + cK / 2, n5 + cK / 2, 0, 3);
                            }
                            t2.a(0xBB6611);
                            t2.b(n4, n5, cK, cK);
                            t2.a(6425);
                            t2.c(gD - 1, gE - 1, cK * gJ + 3, cK * gK + 3);
                            int n11 = 0;
                            while (n11 < gK) {
                                int n12 = 0;
                                while (n12 < gJ) {
                                    ab.a(t2, 154, gD + n12 * cK + cK / 2, gE + n11 * cK + cK / 2, 0, 3);
                                    t2.a(0xBB6611);
                                    t2.b(gD + n12 * cK, gE + n11 * cK, cK, cK);
                                    ++n12;
                                }
                                ++n11;
                            }
                            n11 = 0;
                            while (n11 < aB.length) {
                                object2 = aB[n11];
                                if (object2 != null) {
                                    n2 = n11 / gJ;
                                    n3 = n11 - n2 * gJ;
                                    if (!((by)object2).h) {
                                        t2.a(12083);
                                        t2.c(gD + n3 * cK + 1, gE + n2 * cK + 1, cK - 1, cK - 1);
                                    }
                                    this.a(t2, (by)object2, gD + n3 * cK, gE + n2 * cK);
                                    if (((by)object2).f > 1) {
                                        dd.p.a(t2, String.valueOf(((by)object2).f), gD + n3 * cK + cK, gE + n2 * cK + cK - dd.p.c(), 1);
                                    }
                                }
                                ++n11;
                            }
                            if (cL == 1) {
                                t2.a(0xFFFFFF);
                                t2.b(n4, n5, cK, cK);
                                break block23;
                            }
                            if (cL != 2) break block24;
                            n11 = U / gJ;
                            int n13 = U - n11 * gJ;
                            t2.a(0xFFFFFF);
                            t2.b(gD + n13 * cK, gE + n11 * cK, cK, cK);
                            break block23;
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                    }
                    return;
                }
                if (W == 1) {
                    this.a(t2, df.cJ);
                }
            }
        }
    }

    private void S(t t2) {
        block12: {
            if (dR) {
                if (W == 0) {
                    block11: {
                        Object object = df.cK;
                        try {
                            ay.a(ce, cd, cf, cg, t2);
                            dg.a(t2, object[W], ((String[])object).length > 1);
                            gD = ce + 3;
                            gE = cd + 34 + cK;
                            int n2 = ce + 74;
                            int n3 = gE - cK - 3;
                            gK = 4;
                            int n4 = 0;
                            while (n4 < this.hP.length) {
                                t2.a(6425);
                                t2.c(this.hP[n4] - 1, this.hQ[n4] - 1, cK + 3, cK + 3);
                                t2.a(0xBB6611);
                                t2.b(this.hP[n4], this.hQ[n4], cK, cK);
                                ab.a(t2, 154, this.hP[n4] + cK / 2, this.hQ[n4] + cK / 2, 0, 3);
                                ++n4;
                            }
                            n4 = 0;
                            while (n4 < aB.length) {
                                by by2 = aB[n4];
                                if (by2 != null) {
                                    int n5 = n4 / gJ;
                                    int n6 = n4 - n5 * gJ;
                                    if (!by2.h) {
                                        t2.a(12083);
                                        t2.c(gD + n6 * cK + 1, gE + n5 * cK + 1, cK - 1, cK - 1);
                                    }
                                    this.a(t2, by2, gD + n6 * cK, gE + n5 * cK);
                                    if (by2.f > 1) {
                                        dd.p.a(t2, String.valueOf(by2.f), gD + n6 * cK + cK, gE + n5 * cK + cK - dd.p.c(), 1);
                                    }
                                }
                                ++n4;
                            }
                            if (W == 0 && this.hR >= 0) {
                                t2.a(0xFFFFFF);
                                t2.b(this.hP[this.hR], this.hQ[this.hR], cK, cK);
                            }
                            if (cL != 1) break block11;
                            t2.a(0xFFFFFF);
                            t2.b(n2, n3, cK, cK);
                            break block12;
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                    }
                    return;
                }
                if (W == 1) {
                    this.a(t2, df.cK);
                }
            }
        }
    }

    private void T(t t2) {
        block31: {
            if (dM) {
                if (W == 0) {
                    block30: {
                        Object object = df.cI;
                        try {
                            int n2;
                            gK = 3;
                            ay.a(ce, cd, cf, cg, t2);
                            dg.a(t2, object[W], ((String[])object).length > 1);
                            gD = ce + 3;
                            gE = cd + 34 + cK;
                            int n3 = ce + 45;
                            int n4 = ce + 100;
                            int n5 = gE - cK - 3;
                            if (aJ != null) {
                                this.a(t2, aJ, n3, n5);
                            } else {
                                t2.a(6425);
                                t2.c(n3 - 1, n5 - 1, cK + 3, cK + 3);
                                ab.a(t2, 154, n3 + cK / 2, n5 + cK / 2, 0, 3);
                            }
                            t2.a(0xBB6611);
                            t2.b(n3, n5, cK, cK);
                            if (aI != null) {
                                this.a(t2, aI, n4, n5);
                            } else {
                                t2.a(6425);
                                t2.c(n4 - 1, n5 - 1, cK + 3, cK + 3);
                                ab.a(t2, 154, n4 + cK / 2, n5 + cK / 2, 0, 3);
                            }
                            t2.a(0xBB6611);
                            t2.b(n3, n5, cK, cK);
                            t2.b(n4, n5, cK, cK);
                            dd.d.a(t2, "+", n3 + cK + 15, n5 + cK / 2 - 5, 2);
                            if (cL == 1) {
                                if (U == 0) {
                                    t2.a(0xFFFFFF);
                                    t2.b(n3, n5, cK, cK);
                                }
                                if (U == 1) {
                                    t2.a(0xFFFFFF);
                                    t2.b(n4, n5, cK, cK);
                                }
                            }
                            int n6 = 0;
                            while (n6 < gK) {
                                n3 = 0;
                                while (n3 < gJ) {
                                    t2.a(6425);
                                    t2.c(gD + n3 * cK, gE + n6 * cK, cK + 3, cK + 3);
                                    ab.a(t2, 154, gD + n3 * cK + cK / 2, gE + n6 * cK + cK / 2, 0, 3);
                                    t2.a(0xBB6611);
                                    t2.b(gD + n3 * cK, gE + n6 * cK, cK, cK);
                                    ++n3;
                                }
                                ++n6;
                            }
                            if (cL == 2) {
                                n6 = U / gJ;
                                n3 = U - n6 * gJ;
                                t2.a(0xFFFFFF);
                                t2.b(gD + n3 * cK, gE + n6 * cK, cK, cK);
                            }
                            n6 = 0;
                            while (n6 < aA.length) {
                                by by2 = aA[n6];
                                if (by2 != null) {
                                    int n7 = n6 / gJ;
                                    n2 = n6 - n7 * gJ;
                                    if (!by2.h) {
                                        t2.a(12083);
                                        t2.c(gD + n2 * cK + 1, gE + n7 * cK + 1, cK - 1, cK - 1);
                                    }
                                    ab.a(t2, by2.b.g, gD + n2 * cK + cK / 2, gE + n7 * cK + cK / 2, 0, 3);
                                }
                                ++n6;
                            }
                            if (aI != null && aJ != null) {
                                n6 = 0;
                                int n8 = 0;
                                while (n8 < aA.length) {
                                    if (aA[n8] != null && dg.aA[n8].b.b == 26) {
                                        n6 += aX[dg.aA[n8].b.a];
                                    }
                                    ++n8;
                                }
                                n8 = n6 * 100 / ba[dg.aJ.j];
                                if (n8 > bf[dg.aJ.j]) {
                                    n8 = bf[dg.aJ.j];
                                }
                                if (dy) {
                                    n8 = (int)((double)n8 * 1.5);
                                }
                                dd dd2 = dd.j;
                                n2 = 0;
                                cg cg2 = null;
                                if (dg.aJ.c != null) {
                                    int n9 = 0;
                                    while (n9 < dg.aJ.c.size()) {
                                        cg2 = (cg)dg.aJ.c.elementAt(n9);
                                        if (cg2.c.a == 123) {
                                            n2 = cg2.a;
                                        }
                                        ++n9;
                                    }
                                } else {
                                    dq.a().c(dg.aJ.o, dg.aJ.e);
                                }
                                if (n2 > bp.d().ar + bp.d().at) {
                                    dd2 = dd.l;
                                }
                                dd2.a(t2, df.a(df.cT, at.a(String.valueOf(n2))), gD, gE + gK * cK + 5, 0);
                                dd.j.a(t2, String.valueOf(df.cW) + ": " + n8 + "%", gD, gE + gK * cK + 17, 0);
                            } else {
                                n6 = 0;
                                while (n6 < df.cQ.length) {
                                    dd.i.a(t2, df.cQ[n6], gD, gE + gK * cK + 5 + n6 * 12, 0);
                                    ++n6;
                                }
                            }
                            if (ci == null) break block30;
                            ab.a(t2, dg.ci.b[dg.ch].c, n4 + cK / 2 + dg.ci.b[dg.ch].a + 1, n5 + cK / 2 + 9 + dg.ci.b[dg.ch].b, 0, 3);
                            if (main.a.w % 2 != 0 || ++ch < dg.ci.b.length) break block30;
                            ch = 0;
                            ci = null;
                            break block31;
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                    }
                    return;
                }
                if (W == 1) {
                    this.a(t2, df.cI);
                }
            }
        }
    }

    private void U(t t2) {
        if (dN) {
            if (W == 0) {
                this.a(t2, df.cM, (byte)0);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cM);
            }
        }
    }

    private void V(t t2) {
        if (dO) {
            if (W == 0) {
                this.a(t2, df.cN, (byte)1);
                return;
            }
            if (W == 1) {
                this.a(t2, df.cN);
            }
        }
    }

    private void a(t t2, String[] stringArray, byte by2) {
        try {
            gK = 5;
            ay.a(ce, cd, cf, cg, t2);
            this.a(t2, stringArray, false);
            t2.a(0x662200);
            t2.c(ce + 3, cd + 32, 168, 140);
            t2.a(0xCC9933);
            t2.b(ce + 3, cd + 32, 168, 140);
            int n2 = ce + 74;
            int n3 = cd + 40 + cK;
            if (aJ != null) {
                t2.a(6425);
                t2.c(n2 - 1, n3 - 1, cK + 3, cK + 3);
                ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
                this.a(t2, aJ, n2, n3);
                if (dg.aJ.f > 1) {
                    dd.p.a(t2, "" + dg.aJ.f, n2 + cK, n3 + cK / 2 + 6, 1);
                }
                t2.a(cL == 1 ? 0xFFFFFF : 0xBB6611);
                t2.b(n2, n3, cK, cK);
            } else {
                t2.a(6425);
                t2.c(n2 - 1, n3 - 1, cK + 3, cK + 3);
                ab.a(t2, 154, n2 + cK / 2, n3 + cK / 2, 0, 3);
                t2.a(0xBB6611);
                t2.b(n2, n3, cK, cK);
            }
            if (aJ != null) {
                int n4 = 0;
                Object object = null;
                if (dg.aJ.c != null) {
                    int n5 = 0;
                    while (n5 < dg.aJ.c.size()) {
                        object = (cg)dg.aJ.c.elementAt(n5);
                        if (((cg)object).c.a == 122) {
                            n4 = ((cg)object).a;
                        }
                        ++n5;
                    }
                } else {
                    dq.a().c(dg.aJ.o, dg.aJ.e);
                }
                String string = df.fW;
                String[] stringArray2 = String.valueOf(n4) + df.eB;
                object = df.o;
                if (by2 == 0) {
                    string = df.fV;
                    stringArray2 = String.valueOf(dS[dg.aJ.j]) + df.eA;
                    object = df.n;
                }
                dd.i.a(t2, string, n2 + cK / 2, n3 + 3 * cK / 2 + 2, 2);
                dd.j.a(t2, (String)stringArray2, n2 + cK / 2, n3 + 3 * cK / 2 + 14, 2);
                stringArray2 = dd.i.b((String)object, 130);
                by2 = 0;
                while (by2 < stringArray2.length) {
                    dd.i.a(t2, stringArray2[by2], n2 + cK / 2, cd + cg - 25 + by2 * 12 - 2, 2);
                    by2 = (byte)(by2 + 1);
                }
                return;
            }
        }
        catch (Exception exception) {
            stringArray = exception;
            exception.printStackTrace();
        }
    }

    private static void do() {
        try {
            if (dN) {
                if (bp.d().aB[U].d()) {
                    aJ = bp.d().aB[U];
                    bp.d().aB[dg.U] = null;
                    return;
                }
            } else if (dO && bp.d().aB[U].b()) {
                aJ = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
                return;
            }
        }
        catch (Exception exception) {
            main.a.K.a(df.c, null, new bd(df.H, 2), null);
            br br2 = main.a.K;
            main.a.J = br2;
        }
    }

    private void W(t t2) {
        block11: {
            if (dQ) {
                if (W == 0) {
                    block12: {
                        by[] byArray = aB;
                        String[] stringArray = df.cL;
                        try {
                            dg.b(t2);
                            this.a(t2, stringArray, true);
                            if (byArray == null) {
                                main.a.a(ce + 90, cd + 75, t2, false);
                                dd.e.a(t2, df.y, ce + 90, cd + 90, 2);
                                break block11;
                            }
                            gK = byArray.length <= 30 ? 5 : (byArray.length % gJ == 0 ? byArray.length / gJ : byArray.length / gJ + 1);
                            aa.a(gK, cK, gD, gE, gJ * cK, 5 * cK, true, 6);
                            aa.a(t2, gD, gE, dg.aa.e + 2, dg.aa.f + 2);
                            int n2 = 0;
                            while (n2 < gK) {
                                int n3 = 0;
                                while (n3 < gJ) {
                                    ab.a(t2, 154, gD + n3 * cK + cK / 2, gE + n2 * cK + cK / 2, 0, 3);
                                    t2.a(0xBB6611);
                                    t2.b(gD + n3 * cK, gE + n2 * cK, cK, cK);
                                    ++n3;
                                }
                                ++n2;
                            }
                            n2 = 0;
                            while (n2 < byArray.length) {
                                by by2 = byArray[n2];
                                if (by2 != null) {
                                    int n4 = n2 / gJ;
                                    int n5 = n2 - n4 * gJ;
                                    if (!by2.h) {
                                        t2.a(12083);
                                        t2.c(gD + n5 * cK + 1, gE + n4 * cK + 1, cK - 1, cK - 1);
                                        ab.a(t2, 154, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3);
                                    }
                                    ab.a(t2, by2.b.g, gD + n5 * cK + cK / 2, gE + n4 * cK + cK / 2, 0, 3);
                                }
                                ++n2;
                            }
                            if (cL <= 0 || U < 0) break block12;
                            n2 = U / gJ;
                            int n6 = U - n2 * gJ;
                            t2.a(0xFFFFFF);
                            t2.b(gD + n6 * cK, gE + n2 * cK, cK, cK);
                            dg.a(gD + n6 * cK, gE + n2 * cK, t2);
                            break block11;
                        }
                        catch (Exception exception) {}
                    }
                    return;
                }
                if (W == 1) {
                    this.a(t2, df.cL);
                }
            }
        }
    }

    private void dp() {
        int n2 = 0;
        while (n2 < aB.length) {
            if (aB[n2] == null) {
                dg.aB[n2] = bp.d().aB[U];
                bp.d().aB[dg.U] = null;
                this.l = null;
                this.k = null;
                this.C();
                return;
            }
            ++n2;
        }
    }

    private void dq() {
        aa aa2 = new aa();
        int n2 = 0;
        while (n2 < aB.length) {
            if (aB[n2] != null) {
                aa2.addElement(this.fP);
                break;
            }
            ++n2;
        }
        if (aB.length > 0) {
            aa2.addElement(new bd(df.cL[0], 403));
        }
        main.a.F.a(aa2);
    }

    private void dr() {
        by by2 = dg.k(48);
        dg.aB[dg.U] = null;
        bp.d().aB[by2.e] = by2;
        this.l = null;
        this.k = null;
        this.C();
    }

    private static void ds() {
        dq.a().d(aB);
    }

    private void X(t t2) {
        int n2;
        int n3;
        int n4;
        if (W != 6) {
            return;
        }
        t2.a(-t2.a(), -t2.b());
        ay.a(ce, cd, cf, cg, t2);
        t2.a(ay.a);
        dg.a(t2, df.cg[W], true);
        dg.b(t2);
        t2.a(0);
        t2.c(ce + 2, cd + 31, 171, cg - 34);
        t2.a(13606712);
        t2.b(ce + 3, cd + 32, 168, cg - 37);
        t2.a(ay.a);
        t2.c(ce + 4, cd + 34, 166, cg - 39);
        if (dg.aV.aF[4] != null) {
            dd.e.a(t2, dg.aV.aF[4].b.d, ce + 90, gE + 2, 2);
            n4 = dg.aV.aF[4].i + 1;
            n3 = 0;
            while (n3 < n4) {
                ab.a(t2, 628, ce + 90 + n3 * 12 - n4 * 6, gE + 20, 0, 3);
                ++n3;
            }
        }
        n4 = 0;
        while (n4 < dg.aV.aF.length - 1) {
            if (dg.aV.aF[n4] != null) {
                this.a(t2, dg.aV.aF[n4], this.ew[n4], this.ex[n4]);
            } else {
                t2.a(6425);
                t2.c(this.ew[n4] - 1, this.ex[n4] - 1, cK + 3, cK + 3);
                dd.k.a(t2, df.eJ[n4 + 24][0], this.ew[n4] + cK / 2, this.ex[n4] + cK / 2 - 10, 2);
                dd.k.a(t2, df.eJ[n4 + 24][1], this.ew[n4] + cK / 2, this.ex[n4] + cK / 2 + 2, 2);
            }
            if (U == n4 && cL == 1 && U < 4) {
                t2.a(0xFFFFFF);
            } else {
                t2.a(0xBB6611);
            }
            t2.b(this.ew[n4], this.ex[n4], cK, cK);
            ++n4;
        }
        n4 = this.ew[0] + cK + 7;
        n3 = this.ex[0] - 5;
        t2.a(6425);
        t2.c(n4, n3, 84, 75);
        if (U == 4) {
            t2.a(0xFFFFFF);
        } else {
            t2.a(0xBB6611);
        }
        t2.b(n4, n3, 84, 75);
        if (dg.aV.aT != null) {
            dg.aV.aT.b(t2, n4 + 35, n3 + 55);
            dg.aV.aT.a(t2, n4 + 35, n3 + 55);
        }
        int n5 = 0;
        n4 = 0;
        n3 = 0;
        if (dg.aV.aF[4] != null) {
            if (dg.aV.aF[4].c != null) {
                n2 = 0;
                while (n2 < dg.aV.aF[4].c.size()) {
                    cg cg2 = (cg)dg.aV.aF[4].c.elementAt(n2);
                    if (cg2.c.a == 151) {
                        n5 = cg2.a;
                    } else if (cg2.c.a == 150) {
                        n4 = cg2.a;
                    }
                    ++n2;
                }
            }
            n3 = dg.aV.aF[4].j;
        }
        n2 = gD + 5;
        int n6 = gE + 112;
        dd.e.a(t2, String.valueOf(df.bu) + ": ", n2, n6, 0);
        dd.e.a(t2, String.valueOf(n3), n2 + 70, n6, 0);
        dd.e.a(t2, String.valueOf(df.dV[2]) + ": ", n2, n6 += 15, 0);
        dd.e.a(t2, String.valueOf(n4), n2 + 70, n6, 0);
        dd.e.a(t2, String.valueOf(df.da) + ": ", n2, n6 += 17, 0);
        dd.e.a(t2, String.valueOf(n5), n2 + 70, n6, 0);
    }

    private void dt() {
        aa aa2 = new aa();
        if (hT == 0) {
            aa2.addElement(new bd(df.ec, 5021));
            aa2.addElement(new bd(df.cg[1], 5022));
            aa2.addElement(this.ge);
        } else if (hT == 1) {
            aa2.addElement(new bd(df.cg[W], 502));
            aa2.addElement(new bd(df.cg[1], 5022));
            aa2.addElement(this.ge);
        } else if (hT == 2) {
            aa2.addElement(new bd(df.cg[W], 502));
            aa2.addElement(new bd(df.ec, 5021));
            aa2.addElement(this.ge);
        }
        main.a.F.a(aa2);
    }

    private static void du() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aY, 5041));
        aa2.addElement(new bd(df.aZ, 5042));
        main.a.F.a(aa2);
    }

    private void dv() {
        if (!(cL > 0 && cL <= 4 || main.a.g)) {
            return;
        }
        main.a.L.a(df.ew, this.eE, 1);
    }

    private static void dw() {
        String string = main.a.L.d.d();
        if (string.trim().equals("")) {
            main.a.a(df.eq);
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (n2 <= 0) {
            main.a.j();
            return;
        }
        if (bp.d().F == 0 || n2 > bp.d().F) {
            main.a.a(df.ep);
            return;
        }
        dq.a().e(cL - 1, n2);
        main.a.j();
    }

    private static void dx() {
        aa aa2 = new aa();
        aa2.addElement(new bd(df.aY, 5051));
        aa2.addElement(new bd(df.aZ, 5052));
        main.a.F.a(aa2);
    }

    private void dy() {
        if (cL <= 0 || cL > 4) {
            return;
        }
        main.a.L.a(df.ew, this.eF, 1);
    }

    private static void dz() {
        Object object = main.a.L.d.d();
        if (((String)object).trim().equals("")) {
            main.a.a(df.eq);
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt((String)object);
        }
        catch (Exception exception) {
            main.a.j();
            return;
        }
        if (bp.d().G == 0 || n2 > bp.d().G) {
            main.a.a(df.eq);
            object = main.a.K;
            main.a.J = object;
            return;
        }
        dq.a().f(bp.d().av.c[dg.U].a, n2);
        main.a.j();
    }
}

