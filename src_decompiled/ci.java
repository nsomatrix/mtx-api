/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class ci
extends as {
    public static a[] b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int E;
    public int g = 1;
    private int F = 1;
    public int h;
    private int G;
    private int H;
    private int I;
    public int i;
    public int j;
    public int k;
    public int l;
    private int J;
    public short m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    private aa K = new aa();
    public int s;
    private bp L;
    private dk M;
    public int t;
    public int u;
    public int v;
    private int N;
    public short w;
    public short x;
    private boolean O;
    private long P = 0L;
    private int Q = 0;
    public static bp y;
    public static aa z;
    private static bt R;
    private static long S;
    private boolean T;
    public boolean A = true;
    private long U;
    public bp B;
    private boolean V;
    private boolean W;
    public bp C;
    public boolean D;
    private ci X;
    private bp Y;
    private short Z;
    private byte aa;
    private byte ab;
    private byte ac;
    private static byte[][] ad;
    private static byte[][] ae;
    private static byte[][] af;
    private int ag;

    static {
        z = new aa();
        byte[][] byArrayArray = new byte[53][];
        byArrayArray[0] = new byte[]{3, 4, 5, 6};
        byArrayArray[1] = new byte[1];
        byArrayArray[2] = new byte[]{2, 2, 2, 2, 3, 3, 3, 3};
        byte[] byArray = new byte[2];
        byArray[1] = 1;
        byArrayArray[3] = byArray;
        byte[] byArray2 = new byte[2];
        byArray2[1] = 1;
        byArrayArray[4] = byArray2;
        byArrayArray[5] = new byte[]{3, 4, 5};
        byArrayArray[6] = new byte[1];
        byArrayArray[7] = new byte[]{3, 3, 4, 4, 5, 5};
        byArrayArray[8] = new byte[1];
        byArrayArray[9] = new byte[]{3, 4, 5};
        byte[] byArray3 = new byte[5];
        byArray3[1] = 1;
        byArray3[2] = 2;
        byArray3[3] = 3;
        byArray3[4] = 4;
        byArrayArray[10] = byArray3;
        byArrayArray[11] = new byte[]{3, 4, 5};
        byArrayArray[12] = new byte[]{4, 5, 6};
        byArrayArray[13] = new byte[1];
        byte[] byArray4 = new byte[2];
        byArray4[1] = 1;
        byArrayArray[14] = byArray4;
        byte[] byArray5 = new byte[2];
        byArray5[1] = 1;
        byArrayArray[15] = byArray5;
        byArrayArray[16] = new byte[]{3, 3, 4, 4, 5, 5};
        byte[] byArray6 = new byte[3];
        byArray6[1] = 1;
        byArray6[2] = 2;
        byArrayArray[17] = byArray6;
        byte[] byArray7 = new byte[3];
        byArray7[1] = 1;
        byArray7[2] = 2;
        byArrayArray[18] = byArray7;
        byArrayArray[19] = new byte[]{5, 6, 7, 8};
        byte[] byArray8 = new byte[3];
        byArray8[1] = 1;
        byArray8[2] = 2;
        byArrayArray[20] = byArray8;
        byte[] byArray9 = new byte[3];
        byArray9[1] = 1;
        byArray9[2] = 2;
        byArrayArray[21] = byArray9;
        byte[] byArray10 = new byte[3];
        byArray10[1] = 1;
        byArray10[2] = 2;
        byArrayArray[22] = byArray10;
        byArrayArray[23] = new byte[]{3, 4, 5, 6};
        byte[] byArray11 = new byte[3];
        byArray11[1] = 1;
        byArray11[2] = 2;
        byArrayArray[24] = byArray11;
        byte[] byArray12 = new byte[4];
        byArray12[1] = 1;
        byArray12[2] = 2;
        byArray12[3] = 3;
        byArrayArray[25] = byArray12;
        byte[] byArray13 = new byte[3];
        byArray13[1] = 1;
        byArray13[2] = 2;
        byArrayArray[26] = byArray13;
        byte[] byArray14 = new byte[3];
        byArray14[1] = 1;
        byArray14[2] = 2;
        byArrayArray[27] = byArray14;
        byte[] byArray15 = new byte[3];
        byArray15[1] = 1;
        byArray15[2] = 2;
        byArrayArray[28] = byArray15;
        byte[] byArray16 = new byte[3];
        byArray16[1] = 1;
        byArray16[2] = 2;
        byArrayArray[29] = byArray16;
        byArrayArray[30] = new byte[1];
        byArrayArray[31] = new byte[1];
        byArrayArray[32] = new byte[1];
        byArrayArray[33] = new byte[1];
        byte[] byArray17 = new byte[3];
        byArray17[1] = 1;
        byArray17[2] = 2;
        byArrayArray[34] = byArray17;
        byArrayArray[35] = new byte[1];
        byArrayArray[36] = new byte[1];
        byte[] byArray18 = new byte[6];
        byArray18[2] = 1;
        byArray18[3] = 1;
        byArray18[4] = 2;
        byArray18[5] = 2;
        byArrayArray[37] = byArray18;
        byte[] byArray19 = new byte[10];
        byArray19[2] = 1;
        byArray19[3] = 1;
        byArray19[4] = 2;
        byArray19[5] = 2;
        byArray19[6] = 3;
        byArray19[7] = 3;
        byArray19[8] = 4;
        byArray19[9] = 4;
        byArrayArray[38] = byArray19;
        byte[] byArray20 = new byte[8];
        byArray20[2] = 1;
        byArray20[3] = 1;
        byArray20[4] = 2;
        byArray20[5] = 2;
        byArray20[6] = 3;
        byArray20[7] = 3;
        byArrayArray[39] = byArray20;
        byte[] byArray21 = new byte[8];
        byArray21[2] = 1;
        byArray21[3] = 1;
        byArray21[4] = 2;
        byArray21[5] = 2;
        byArray21[6] = 3;
        byArray21[7] = 3;
        byArrayArray[40] = byArray21;
        byte[] byArray22 = new byte[8];
        byArray22[2] = 1;
        byArray22[3] = 1;
        byArray22[4] = 2;
        byArray22[5] = 2;
        byArray22[6] = 3;
        byArray22[7] = 3;
        byArrayArray[41] = byArray22;
        byte[] byArray23 = new byte[8];
        byArray23[2] = 1;
        byArray23[3] = 1;
        byArray23[4] = 2;
        byArray23[5] = 2;
        byArray23[6] = 3;
        byArray23[7] = 3;
        byArrayArray[42] = byArray23;
        byte[] byArray24 = new byte[8];
        byArray24[2] = 1;
        byArray24[3] = 1;
        byArray24[4] = 2;
        byArray24[5] = 2;
        byArray24[6] = 3;
        byArray24[7] = 3;
        byArrayArray[43] = byArray24;
        byte[] byArray25 = new byte[8];
        byArray25[2] = 1;
        byArray25[3] = 1;
        byArray25[4] = 2;
        byArray25[5] = 2;
        byArray25[6] = 3;
        byArray25[7] = 3;
        byArrayArray[44] = byArray25;
        byte[] byArray26 = new byte[8];
        byArray26[2] = 1;
        byArray26[3] = 1;
        byArray26[4] = 2;
        byArray26[5] = 2;
        byArray26[6] = 3;
        byArray26[7] = 3;
        byArrayArray[45] = byArray26;
        byte[] byArray27 = new byte[8];
        byArray27[2] = 1;
        byArray27[3] = 1;
        byArray27[4] = 2;
        byArray27[5] = 2;
        byArray27[6] = 3;
        byArray27[7] = 3;
        byArrayArray[46] = byArray27;
        byte[] byArray28 = new byte[8];
        byArray28[2] = 1;
        byArray28[3] = 1;
        byArray28[4] = 2;
        byArray28[5] = 2;
        byArray28[6] = 3;
        byArray28[7] = 3;
        byArrayArray[47] = byArray28;
        byte[] byArray29 = new byte[8];
        byArray29[2] = 1;
        byArray29[3] = 1;
        byArray29[4] = 2;
        byArray29[5] = 2;
        byArray29[6] = 3;
        byArray29[7] = 3;
        byArrayArray[48] = byArray29;
        byte[] byArray30 = new byte[8];
        byArray30[2] = 1;
        byArray30[3] = 1;
        byArray30[4] = 2;
        byArray30[5] = 2;
        byArray30[6] = 3;
        byArray30[7] = 3;
        byArrayArray[49] = byArray30;
        byte[] byArray31 = new byte[8];
        byArray31[2] = 1;
        byArray31[3] = 1;
        byArray31[4] = 2;
        byArray31[5] = 2;
        byArray31[6] = 3;
        byArray31[7] = 3;
        byArrayArray[50] = byArray31;
        byte[] byArray32 = new byte[2];
        byArray32[1] = 1;
        byArrayArray[51] = byArray32;
        byte[] byArray33 = new byte[2];
        byArray33[1] = 1;
        byArrayArray[52] = byArray33;
        ad = byArrayArray;
        byte[][] byArrayArray2 = new byte[52][];
        byte[] byArray34 = new byte[8];
        byArray34[2] = 1;
        byArray34[3] = 1;
        byArray34[4] = 2;
        byArray34[5] = 2;
        byArray34[6] = 3;
        byArray34[7] = 3;
        byArrayArray2[0] = byArray34;
        byte[] byArray35 = new byte[8];
        byArray35[2] = 1;
        byArray35[3] = 1;
        byArray35[4] = 2;
        byArray35[5] = 2;
        byArray35[6] = 3;
        byArray35[7] = 3;
        byArrayArray2[1] = byArray35;
        byte[] byArray36 = new byte[8];
        byArray36[2] = 1;
        byArray36[3] = 1;
        byArray36[4] = 2;
        byArray36[5] = 2;
        byArray36[6] = 3;
        byArray36[7] = 3;
        byArrayArray2[2] = byArray36;
        byte[] byArray37 = new byte[8];
        byArray37[2] = 1;
        byArray37[3] = 1;
        byArray37[4] = 2;
        byArray37[5] = 2;
        byArray37[6] = 3;
        byArray37[7] = 3;
        byArrayArray2[3] = byArray37;
        byte[] byArray38 = new byte[8];
        byArray38[2] = 1;
        byArray38[3] = 1;
        byArray38[4] = 2;
        byArray38[5] = 2;
        byArray38[6] = 3;
        byArray38[7] = 3;
        byArrayArray2[4] = byArray38;
        byte[] byArray39 = new byte[8];
        byArray39[2] = 1;
        byArray39[3] = 1;
        byArray39[4] = 2;
        byArray39[5] = 2;
        byArray39[6] = 3;
        byArray39[7] = 3;
        byArrayArray2[5] = byArray39;
        byte[] byArray40 = new byte[8];
        byArray40[2] = 1;
        byArray40[3] = 1;
        byArray40[4] = 2;
        byArray40[5] = 2;
        byArray40[6] = 3;
        byArray40[7] = 3;
        byArrayArray2[6] = byArray40;
        byte[] byArray41 = new byte[8];
        byArray41[2] = 1;
        byArray41[3] = 1;
        byArray41[4] = 2;
        byArray41[5] = 2;
        byArray41[6] = 3;
        byArray41[7] = 3;
        byArrayArray2[7] = byArray41;
        byte[] byArray42 = new byte[8];
        byArray42[2] = 1;
        byArray42[3] = 1;
        byArray42[4] = 2;
        byArray42[5] = 2;
        byArray42[6] = 3;
        byArray42[7] = 3;
        byArrayArray2[8] = byArray42;
        byte[] byArray43 = new byte[8];
        byArray43[2] = 1;
        byArray43[3] = 1;
        byArray43[4] = 2;
        byArray43[5] = 2;
        byArray43[6] = 3;
        byArray43[7] = 3;
        byArrayArray2[9] = byArray43;
        byte[] byArray44 = new byte[8];
        byArray44[2] = 1;
        byArray44[3] = 1;
        byArray44[4] = 2;
        byArray44[5] = 2;
        byArray44[6] = 3;
        byArray44[7] = 3;
        byArrayArray2[10] = byArray44;
        byte[] byArray45 = new byte[8];
        byArray45[2] = 1;
        byArray45[3] = 1;
        byArray45[4] = 2;
        byArray45[5] = 2;
        byArray45[6] = 3;
        byArray45[7] = 3;
        byArrayArray2[11] = byArray45;
        byte[] byArray46 = new byte[8];
        byArray46[2] = 1;
        byArray46[3] = 1;
        byArray46[4] = 2;
        byArray46[5] = 2;
        byArray46[6] = 3;
        byArray46[7] = 3;
        byArrayArray2[12] = byArray46;
        byte[] byArray47 = new byte[8];
        byArray47[2] = 1;
        byArray47[3] = 1;
        byArray47[4] = 2;
        byArray47[5] = 2;
        byArray47[6] = 3;
        byArray47[7] = 3;
        byArrayArray2[13] = byArray47;
        byte[] byArray48 = new byte[8];
        byArray48[2] = 1;
        byArray48[3] = 1;
        byArray48[4] = 2;
        byArray48[5] = 2;
        byArray48[6] = 3;
        byArray48[7] = 3;
        byArrayArray2[14] = byArray48;
        byte[] byArray49 = new byte[8];
        byArray49[2] = 1;
        byArray49[3] = 1;
        byArray49[4] = 2;
        byArray49[5] = 2;
        byArray49[6] = 3;
        byArray49[7] = 3;
        byArrayArray2[15] = byArray49;
        byte[] byArray50 = new byte[8];
        byArray50[2] = 1;
        byArray50[3] = 1;
        byArray50[4] = 2;
        byArray50[5] = 2;
        byArray50[6] = 3;
        byArray50[7] = 3;
        byArrayArray2[16] = byArray50;
        byte[] byArray51 = new byte[8];
        byArray51[2] = 1;
        byArray51[3] = 1;
        byArray51[4] = 2;
        byArray51[5] = 2;
        byArray51[6] = 3;
        byArray51[7] = 3;
        byArrayArray2[17] = byArray51;
        byte[] byArray52 = new byte[8];
        byArray52[2] = 1;
        byArray52[3] = 1;
        byArray52[4] = 2;
        byArray52[5] = 2;
        byArray52[6] = 3;
        byArray52[7] = 3;
        byArrayArray2[18] = byArray52;
        byte[] byArray53 = new byte[8];
        byArray53[2] = 1;
        byArray53[3] = 1;
        byArray53[4] = 2;
        byArray53[5] = 2;
        byArray53[6] = 3;
        byArray53[7] = 3;
        byArrayArray2[19] = byArray53;
        byte[] byArray54 = new byte[8];
        byArray54[2] = 1;
        byArray54[3] = 1;
        byArray54[4] = 2;
        byArray54[5] = 2;
        byArray54[6] = 3;
        byArray54[7] = 3;
        byArrayArray2[20] = byArray54;
        byte[] byArray55 = new byte[8];
        byArray55[2] = 1;
        byArray55[3] = 1;
        byArray55[4] = 2;
        byArray55[5] = 2;
        byArray55[6] = 3;
        byArray55[7] = 3;
        byArrayArray2[21] = byArray55;
        byte[] byArray56 = new byte[8];
        byArray56[2] = 1;
        byArray56[3] = 1;
        byArray56[4] = 2;
        byArray56[5] = 2;
        byArray56[6] = 3;
        byArray56[7] = 3;
        byArrayArray2[22] = byArray56;
        byte[] byArray57 = new byte[8];
        byArray57[2] = 1;
        byArray57[3] = 1;
        byArray57[4] = 2;
        byArray57[5] = 2;
        byArray57[6] = 3;
        byArray57[7] = 3;
        byArrayArray2[23] = byArray57;
        byte[] byArray58 = new byte[8];
        byArray58[2] = 1;
        byArray58[3] = 1;
        byArray58[4] = 2;
        byArray58[5] = 2;
        byArray58[6] = 3;
        byArray58[7] = 3;
        byArrayArray2[24] = byArray58;
        byte[] byArray59 = new byte[8];
        byArray59[2] = 1;
        byArray59[3] = 1;
        byArray59[4] = 2;
        byArray59[5] = 2;
        byArray59[6] = 3;
        byArray59[7] = 3;
        byArrayArray2[25] = byArray59;
        byte[] byArray60 = new byte[8];
        byArray60[2] = 1;
        byArray60[3] = 1;
        byArray60[4] = 2;
        byArray60[5] = 2;
        byArray60[6] = 3;
        byArray60[7] = 3;
        byArrayArray2[26] = byArray60;
        byte[] byArray61 = new byte[8];
        byArray61[2] = 1;
        byArray61[3] = 1;
        byArray61[4] = 2;
        byArray61[5] = 2;
        byArray61[6] = 3;
        byArray61[7] = 3;
        byArrayArray2[27] = byArray61;
        byte[] byArray62 = new byte[8];
        byArray62[2] = 1;
        byArray62[3] = 1;
        byArray62[4] = 2;
        byArray62[5] = 2;
        byArray62[6] = 3;
        byArray62[7] = 3;
        byArrayArray2[28] = byArray62;
        byte[] byArray63 = new byte[8];
        byArray63[2] = 1;
        byArray63[3] = 1;
        byArray63[4] = 2;
        byArray63[5] = 2;
        byArray63[6] = 3;
        byArray63[7] = 3;
        byArrayArray2[29] = byArray63;
        byte[] byArray64 = new byte[8];
        byArray64[2] = 1;
        byArray64[3] = 1;
        byArray64[4] = 2;
        byArray64[5] = 2;
        byArray64[6] = 3;
        byArray64[7] = 3;
        byArrayArray2[30] = byArray64;
        byte[] byArray65 = new byte[8];
        byArray65[2] = 1;
        byArray65[3] = 1;
        byArray65[4] = 2;
        byArray65[5] = 2;
        byArray65[6] = 3;
        byArray65[7] = 3;
        byArrayArray2[31] = byArray65;
        byte[] byArray66 = new byte[8];
        byArray66[2] = 1;
        byArray66[3] = 1;
        byArray66[4] = 2;
        byArray66[5] = 2;
        byArray66[6] = 3;
        byArray66[7] = 3;
        byArrayArray2[32] = byArray66;
        byte[] byArray67 = new byte[8];
        byArray67[2] = 1;
        byArray67[3] = 1;
        byArray67[4] = 2;
        byArray67[5] = 2;
        byArray67[6] = 3;
        byArray67[7] = 3;
        byArrayArray2[33] = byArray67;
        byte[] byArray68 = new byte[8];
        byArray68[2] = 1;
        byArray68[3] = 1;
        byArray68[4] = 2;
        byArray68[5] = 2;
        byArray68[6] = 3;
        byArray68[7] = 3;
        byArrayArray2[34] = byArray68;
        byte[] byArray69 = new byte[8];
        byArray69[2] = 1;
        byArray69[3] = 1;
        byArray69[4] = 2;
        byArray69[5] = 2;
        byArray69[6] = 3;
        byArray69[7] = 3;
        byArrayArray2[35] = byArray69;
        byte[] byArray70 = new byte[8];
        byArray70[2] = 1;
        byArray70[3] = 1;
        byArray70[4] = 2;
        byArray70[5] = 2;
        byArray70[6] = 3;
        byArray70[7] = 3;
        byArrayArray2[36] = byArray70;
        byte[] byArray71 = new byte[8];
        byArray71[2] = 1;
        byArray71[3] = 1;
        byArray71[4] = 2;
        byArray71[5] = 2;
        byArray71[6] = 3;
        byArray71[7] = 3;
        byArrayArray2[37] = byArray71;
        byte[] byArray72 = new byte[8];
        byArray72[2] = 1;
        byArray72[3] = 1;
        byArray72[4] = 2;
        byArray72[5] = 2;
        byArray72[6] = 3;
        byArray72[7] = 3;
        byArrayArray2[38] = byArray72;
        byte[] byArray73 = new byte[8];
        byArray73[2] = 1;
        byArray73[3] = 1;
        byArray73[4] = 2;
        byArray73[5] = 2;
        byArray73[6] = 3;
        byArray73[7] = 3;
        byArrayArray2[39] = byArray73;
        byte[] byArray74 = new byte[8];
        byArray74[2] = 1;
        byArray74[3] = 1;
        byArray74[4] = 2;
        byArray74[5] = 2;
        byArray74[6] = 3;
        byArray74[7] = 3;
        byArrayArray2[40] = byArray74;
        byte[] byArray75 = new byte[8];
        byArray75[2] = 1;
        byArray75[3] = 1;
        byArray75[4] = 2;
        byArray75[5] = 2;
        byArray75[6] = 3;
        byArray75[7] = 3;
        byArrayArray2[41] = byArray75;
        byte[] byArray76 = new byte[8];
        byArray76[2] = 1;
        byArray76[3] = 1;
        byArray76[4] = 2;
        byArray76[5] = 2;
        byArray76[6] = 3;
        byArray76[7] = 3;
        byArrayArray2[42] = byArray76;
        byte[] byArray77 = new byte[8];
        byArray77[2] = 1;
        byArray77[3] = 1;
        byArray77[4] = 2;
        byArray77[5] = 2;
        byArray77[6] = 3;
        byArray77[7] = 3;
        byArrayArray2[43] = byArray77;
        byte[] byArray78 = new byte[8];
        byArray78[2] = 1;
        byArray78[3] = 1;
        byArray78[4] = 2;
        byArray78[5] = 2;
        byArray78[6] = 3;
        byArray78[7] = 3;
        byArrayArray2[44] = byArray78;
        byte[] byArray79 = new byte[8];
        byArray79[2] = 1;
        byArray79[3] = 1;
        byArray79[4] = 2;
        byArray79[5] = 2;
        byArray79[6] = 3;
        byArray79[7] = 3;
        byArrayArray2[45] = byArray79;
        byte[] byArray80 = new byte[8];
        byArray80[2] = 1;
        byArray80[3] = 1;
        byArray80[4] = 2;
        byArray80[5] = 2;
        byArray80[6] = 3;
        byArray80[7] = 3;
        byArrayArray2[46] = byArray80;
        byte[] byArray81 = new byte[8];
        byArray81[2] = 1;
        byArray81[3] = 1;
        byArray81[4] = 2;
        byArray81[5] = 2;
        byArray81[6] = 3;
        byArray81[7] = 3;
        byArrayArray2[47] = byArray81;
        byte[] byArray82 = new byte[8];
        byArray82[2] = 1;
        byArray82[3] = 1;
        byArray82[4] = 2;
        byArray82[5] = 2;
        byArray82[6] = 3;
        byArray82[7] = 3;
        byArrayArray2[48] = byArray82;
        byte[] byArray83 = new byte[8];
        byArray83[2] = 1;
        byArray83[3] = 1;
        byArray83[4] = 2;
        byArray83[5] = 2;
        byArray83[6] = 3;
        byArray83[7] = 3;
        byArrayArray2[49] = byArray83;
        byte[] byArray84 = new byte[8];
        byArray84[2] = 1;
        byArray84[3] = 1;
        byArray84[4] = 2;
        byArray84[5] = 2;
        byArray84[6] = 3;
        byArray84[7] = 3;
        byArrayArray2[50] = byArray84;
        byArrayArray2[51] = new byte[1];
        ae = byArrayArray2;
        byte[][] byArrayArray3 = new byte[52][];
        byArrayArray3[0] = new byte[]{5, 4, 3, 2, 1};
        byArrayArray3[1] = new byte[0];
        byArrayArray3[2] = new byte[0];
        byArrayArray3[3] = new byte[0];
        byArrayArray3[4] = new byte[0];
        byArrayArray3[5] = new byte[0];
        byArrayArray3[6] = new byte[0];
        byArrayArray3[7] = new byte[]{5, 4, 3, 2, 1};
        byArrayArray3[8] = new byte[]{5, 4, 3, 2, 1};
        byArrayArray3[9] = new byte[]{5, 4, 3, 2, 1};
        byArrayArray3[10] = new byte[0];
        byArrayArray3[11] = new byte[]{5, 4, 3, 2, 1};
        byArrayArray3[12] = new byte[0];
        byArrayArray3[13] = new byte[0];
        byArrayArray3[14] = new byte[0];
        byArrayArray3[15] = new byte[0];
        byArrayArray3[16] = new byte[0];
        byArrayArray3[17] = new byte[0];
        byArrayArray3[18] = new byte[0];
        byArrayArray3[19] = new byte[0];
        byArrayArray3[20] = new byte[0];
        byArrayArray3[21] = new byte[0];
        byArrayArray3[22] = new byte[0];
        byArrayArray3[23] = new byte[0];
        byArrayArray3[24] = new byte[0];
        byArrayArray3[25] = new byte[0];
        byArrayArray3[26] = new byte[0];
        byArrayArray3[27] = new byte[0];
        byArrayArray3[28] = new byte[0];
        byArrayArray3[29] = new byte[0];
        byArrayArray3[30] = new byte[0];
        byArrayArray3[31] = new byte[0];
        byArrayArray3[32] = new byte[0];
        byArrayArray3[33] = new byte[0];
        byArrayArray3[34] = new byte[0];
        byArrayArray3[35] = new byte[0];
        byArrayArray3[36] = new byte[0];
        byArrayArray3[37] = new byte[0];
        byArrayArray3[38] = new byte[0];
        byArrayArray3[39] = new byte[0];
        byArrayArray3[40] = new byte[0];
        byte[] byArray85 = new byte[8];
        byArray85[2] = 1;
        byArray85[3] = 1;
        byArray85[4] = 2;
        byArray85[5] = 2;
        byArray85[6] = 3;
        byArray85[7] = 3;
        byArrayArray3[41] = byArray85;
        byte[] byArray86 = new byte[8];
        byArray86[2] = 1;
        byArray86[3] = 1;
        byArray86[4] = 2;
        byArray86[5] = 2;
        byArray86[6] = 3;
        byArray86[7] = 3;
        byArrayArray3[42] = byArray86;
        byte[] byArray87 = new byte[8];
        byArray87[2] = 1;
        byArray87[3] = 1;
        byArray87[4] = 2;
        byArray87[5] = 2;
        byArray87[6] = 3;
        byArray87[7] = 3;
        byArrayArray3[43] = byArray87;
        byte[] byArray88 = new byte[8];
        byArray88[2] = 1;
        byArray88[3] = 1;
        byArray88[4] = 2;
        byArray88[5] = 2;
        byArray88[6] = 3;
        byArray88[7] = 3;
        byArrayArray3[44] = byArray88;
        byte[] byArray89 = new byte[8];
        byArray89[2] = 1;
        byArray89[3] = 1;
        byArray89[4] = 2;
        byArray89[5] = 2;
        byArray89[6] = 3;
        byArray89[7] = 3;
        byArrayArray3[45] = byArray89;
        byte[] byArray90 = new byte[8];
        byArray90[2] = 1;
        byArray90[3] = 1;
        byArray90[4] = 2;
        byArray90[5] = 2;
        byArray90[6] = 3;
        byArray90[7] = 3;
        byArrayArray3[46] = byArray90;
        byte[] byArray91 = new byte[8];
        byArray91[2] = 1;
        byArray91[3] = 1;
        byArray91[4] = 2;
        byArray91[5] = 2;
        byArray91[6] = 3;
        byArray91[7] = 3;
        byArrayArray3[47] = byArray91;
        byte[] byArray92 = new byte[8];
        byArray92[2] = 1;
        byArray92[3] = 1;
        byArray92[4] = 2;
        byArray92[5] = 2;
        byArray92[6] = 3;
        byArray92[7] = 3;
        byArrayArray3[48] = byArray92;
        byte[] byArray93 = new byte[8];
        byArray93[2] = 1;
        byArray93[3] = 1;
        byArray93[4] = 2;
        byArray93[5] = 2;
        byArray93[6] = 3;
        byArray93[7] = 3;
        byArrayArray3[49] = byArray93;
        byte[] byArray94 = new byte[8];
        byArray94[2] = 1;
        byArray94[3] = 1;
        byArray94[4] = 2;
        byArray94[5] = 2;
        byArray94[6] = 3;
        byArray94[7] = 3;
        byArrayArray3[50] = byArray94;
        byArrayArray3[51] = new byte[1];
        af = byArrayArray3;
    }

    public ci(short s2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, int n2, int n3, int n4, int n5, int n6, short s3, short s4, byte by2, byte by3, boolean bl7, boolean bl8) {
        byte[] byArray = new byte[]{-1, 1};
        this.D = false;
        this.ac = (byte)-1;
        this.ag = 0;
        this.n = bl2;
        this.o = bl3;
        this.p = bl4;
        this.q = bl5;
        this.r = bl6;
        this.v = n3;
        this.m = s2;
        this.s = n2;
        this.c = n4;
        this.x = (short)n5;
        short s5 = s3;
        this.e = s5;
        this.i = s5;
        short s6 = s4;
        this.f = s6;
        this.j = s6;
        this.h = n2 == 168 || n2 == 179 || n2 == 175 || n2 == 177 || n2 == 202 ? 8 : (int)by2;
        this.d = n6;
        this.w = by3;
        this.O = bl7;
        if (n2 == 202) {
            R = new bt(this.i, this.j - 100);
            z.addElement(R);
            bt.f = this;
        }
        if (ci.b[n2].h == null) {
            ci.b[n2].h = new Image[0];
            dq.a().a(n2);
        }
        S = am.d(2000, 3500);
        this.T = bl8;
    }

    /*
     * Unable to fully structure code
     */
    public final void a() {
        block258: {
            block259: {
                block257: {
                    var1_1 = this;
                    if (ci.b[var1_1.s] != null) break block257;
                    v0 = false;
                    break block258;
                }
                if (ci.b[var1_1.s].h != null) break block259;
                v0 = false;
                break block258;
            }
            if (var1_1.O) ** GOTO lbl-1000
            if (var1_1.E >= ci.b[var1_1.s].h.length) {
                v0 = false;
            } else if (ci.b[var1_1.s].h[var1_1.E] == null) {
                v0 = false;
            } else lbl-1000:
            // 2 sources

            {
                v0 = var1_1.h != 0;
            }
        }
        if (!v0) {
            return;
        }
        if (this.L == null && (this.s == 168 || this.s == 179 || this.s == 175)) {
            this.h = 8;
        }
        if (this.K == null && ci.b[this.s].a != 0) {
            return;
        }
        if (this.h != 3 && this.A) {
            if (this.L != null) {
                this.L.a(this.t, this.u, this.O, (int)this.c().e);
                this.L = null;
            }
            this.A = false;
        }
        if (this.c <= 0 && this.m != -1) {
            this.h = 1;
        }
        switch (this.h) {
            case 9: {
                var1_1 = this;
                this.E = var1_1.e(main.a.w);
                if (var1_1.E != 1) break;
                var1_1.h = 8;
                break;
            }
            case 8: {
                var1_1 = this;
                this.E = 0;
                break;
            }
            case 1: {
                this.n = false;
                this.o = false;
                this.p = false;
                this.q = false;
                this.r = false;
                if (this.s != 98 && this.s != 99) {
                    ++this.G;
                    this.f += this.G;
                    if (ci.y != null) {
                        if (ci.y.az != null) {
                            if (ci.y.az.a.a > 72) {
                                if (main.a.w % 9 == 0) {
                                    if (this.H > 1) {
                                        this.H += 5;
                                    } else if (this.H < -1) {
                                        this.H -= 5;
                                    }
                                }
                            } else if (main.a.w % 2 == 0) {
                                if (this.H > 1) {
                                    --this.H;
                                } else if (this.H < -1) {
                                    ++this.H;
                                }
                            }
                        }
                    } else if (bp.d() != null && bp.d().az != null) {
                        if (bp.d().az.a.a > 72) {
                            if (main.a.w % 9 == 0) {
                                if (this.H > 1) {
                                    this.H += 5;
                                } else if (this.H < -1) {
                                    this.H -= 5;
                                }
                            }
                        } else if (main.a.w % 2 == 0) {
                            if (this.H > 1) {
                                --this.H;
                            } else if (this.H < -1) {
                                ++this.H;
                            }
                        }
                    }
                    this.e += this.H;
                    if (this.s == 209 || this.s == 210) {
                        v1 = this;
                        v2 = 6;
                    } else if (this.s == 168 || this.s == 176 || this.s == 177 || this.s == 179 || this.s == 180 || this.s == 191) {
                        v1 = this;
                        v2 = 7;
                    } else if (this.s == 178 || this.s == 181 || this.s == 183 || this.s == 185 || this.s == 188 || this.s == 192 || this.s == 194) {
                        v1 = this;
                        v2 = 4;
                    } else if (this.s == 173 || this.s == 184) {
                        v1 = this;
                        v2 = 6;
                    } else if (this.s == 175) {
                        v1 = this;
                        v2 = 8;
                    } else if (this.s == 170 || this.s == 195 || this.s == 196 || this.s == 197 || this.s == 186 || this.s == 189 || this.s == 190) {
                        v1 = this;
                        v2 = 3;
                    } else if (this.s == 187) {
                        v1 = this;
                        v2 = 9;
                    } else if (this.s == 193) {
                        v1 = this;
                        v2 = 5;
                    } else if (this.s == 174) {
                        v1 = this;
                        v2 = 10;
                    } else {
                        v1 = this;
                        v2 = v1.E = this.O != false ? 10 : 2;
                    }
                    if (this.f > dg.w * 24 || this.e < dg.t * 24 || this.e > dg.v * 24) {
                        this.G = 0;
                        this.H = 0;
                        this.f = 0;
                        this.e = 0;
                        this.c = this.c().f;
                        this.h = 0;
                        this.E = this.s < 168 ? 0 : this.c(main.a.w);
                        this.J = 0;
                        return;
                    }
                    if (this.I == 0 && (af.a(this.e, this.f) & 2) == 2) {
                        this.G = this.G > 4 ? -4 : -this.G;
                        this.I = 16;
                    }
                    if (this.I <= 0) break;
                    --this.I;
                    break;
                }
                var1_2 = System.currentTimeMillis();
                if (var1_2 - this.P <= 1200L) break;
                this.h = 0;
                break;
            }
            case 2: {
                this.J = 0;
                if (this.O && this.s > 210) {
                    var1_1 = this;
                    if (ci.b[var1_1.s].k == null) break;
                    ++var1_1.G;
                    if (main.a.w % 2 == 0) {
                        ++var1_1.Q;
                    }
                    if (var1_1.Q >= ci.b[var1_1.s].k.length) {
                        var1_1.Q = 0;
                    }
                    var1_1.E = ci.b[var1_1.s].k[var1_1.Q];
                    if (var1_1.G <= 10 + var1_1.m % 10 || System.currentTimeMillis() - (var1_1.U + ci.S) < 0L) break;
                    var1_1.h = 5;
                    var1_1.G = 0;
                    break;
                }
                var1_1 = this;
                switch (ci.b[var1_1.s].c) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: {
                        if (var1_1.s == 209 || var1_1.s == 210) {
                            var1_1.E = 1;
                        } else if (var1_1.s == 173 || var1_1.s == 175 || var1_1.s == 176 || var1_1.s == 177 || var1_1.s == 179 || var1_1.s == 180 || var1_1.s == 181 || var1_1.s == 183 || var1_1.s == 184 || var1_1.s == 185) {
                            var1_1.E = 1;
                        } else if (var1_1.s == 168 || var1_1.s == 179) {
                            var1_1.E = 6;
                        } else if (var1_1.s == 174) {
                            var1_1.E = 4;
                        } else {
                            var1_1.s;
                            var1_1.E = 0;
                        }
                        ++var1_1.G;
                        if (var1_1.G > 10 + var1_1.m % 10 && System.currentTimeMillis() - (var1_1.U + ci.S) >= 0L) {
                            var1_1.h = 5;
                        }
                        if (!var1_1.O) break;
                        var1_1.E = main.a.w % 101 > 1 ? 0 : 1;
                        break;
                    }
                    case 4: 
                    case 5: {
                        var1_1.E = !var1_1.O ? (var1_1.s < 168 ? (main.a.w % 4 > 1 ? 0 : 1) : var1_1.b(main.a.w)) : ci.b[var1_1.s].k[var1_1.Q];
                        ++var1_1.G;
                        if (var1_1.G <= var1_1.m % 3) break;
                        var1_1.h = 5;
                    }
                }
                break;
            }
            case 4: {
                this.J = 0;
                this.E = 0;
                ++this.G;
                if (this.G <= 40 + this.m % 5) break;
                this.f -= 2;
                this.h = 5;
                this.G = 0;
                break;
            }
            case 3: {
                if (this.X != null || this.Y != null) ** GOTO lbl618
                if (this.Z >= 0) ** GOTO lbl616
                if (this.O && this.s > 210) {
                    var1_1 = this;
                    if (ci.b[var1_1.s].l == null) break;
                    if (var1_1.G == 0) {
                        var2_3 = 0;
                        var3_5 = 0;
                        if (var1_1.N == 0) {
                            var2_3 = var1_1.L.i;
                            var3_5 = var1_1.L.j;
                        } else if (var1_1.N == 1) {
                            var2_3 = var1_1.M.a;
                            var3_5 = var1_1.M.b;
                        }
                        if (main.a.w % 2 == 0) {
                            ++var1_1.Q;
                        }
                        if (am.e(var2_3 - var1_1.e) < 48 || am.e(var3_5 - var1_1.f) < 10) {
                            if (var1_1.Q >= ci.b[var1_1.s].l[0].length) {
                                var1_1.G = 1;
                                var1_1.Q = 0;
                            }
                            var1_1.E = ci.b[var1_1.s].l[0][var1_1.Q];
                            break;
                        }
                        if (var1_1.Q >= ci.b[var1_1.s].l[1].length) {
                            var1_1.G = 1;
                            var1_1.Q = 0;
                        }
                        var1_1.E = ci.b[var1_1.s].l[1][var1_1.Q];
                        break;
                    }
                    if (var1_1.G != 1) break;
                    if (!(ci.b[var1_1.s].c == 0 || var1_1.o || var1_1.q || var1_1.r)) {
                        var1_1.e += (var1_1.i - var1_1.e) / 4;
                        var1_1.f += (var1_1.j - var1_1.f) / 4;
                    }
                    if (am.e(var1_1.i - var1_1.e) >= 5 || am.e(var1_1.j - var1_1.f) >= 5) break;
                    var1_1.h = 2;
                    var1_1.Q = 0;
                    var1_1.G = 0;
                    var1_1.H = 0;
                    break;
                }
                var1_1 = this;
                if (var1_1.s == 209 || var1_1.s == 210) {
                    v3 = var1_1;
                    v4 = 6;
                } else if (var1_1.s == 176 || var1_1.s == 177 || var1_1.s == 179) {
                    v3 = var1_1;
                    v4 = 6;
                } else if (var1_1.s == 175) {
                    v3 = var1_1;
                    v4 = 7;
                } else if (var1_1.s == 180 || var1_1.s == 181 || var1_1.s == 183 || var1_1.s == 184 || var1_1.s == 173 || var1_1.s == 188 || var1_1.s == 192 || var1_1.s == 194 || var1_1.s == 202) {
                    v3 = var1_1;
                    v4 = 3;
                } else if (var1_1.s == 193) {
                    v3 = var1_1;
                    v4 = 4;
                } else if (var1_1.s == 187 || var1_1.s == 168 || var1_1.s == 175 || var1_1.s == 176 || var1_1.s == 179 || var1_1.s == 174) {
                    v3 = var1_1;
                    v4 = var1_1.d(main.a.w);
                } else {
                    v3 = var1_1;
                    v4 = main.a.w % 4 > 1 ? (ci.b[var1_1.s].c == 5 ? 3 : 0) : (v3.E = 1);
                }
                if (var1_1.G != 0) ** GOTO lbl607
                var2_4 = 0;
                var3_6 = 0;
                if (var1_1.N == 0) {
                    var2_4 = var1_1.L.i;
                    var3_6 = var1_1.L.j;
                } else if (var1_1.N == 1) {
                    var2_4 = var1_1.M.a;
                    var3_6 = var1_1.M.b;
                }
                if (am.e(var2_4 - var1_1.e) >= 24 && am.e(var2_4 - var1_1.e) >= 5 && ci.b[var1_1.s].c != 0) ** GOTO lbl297
                if (var1_1.s != 168 && var1_1.s != 176 && var1_1.s != 177 && var1_1.s != 179) ** GOTO lbl281
                v5 = var1_1;
                v6 = 6;
                ** GOTO lbl297
lbl281:
                // 1 sources

                if (var1_1.s != 175) ** GOTO lbl285
                v5 = var1_1;
                v6 = 7;
                ** GOTO lbl297
lbl285:
                // 1 sources

                if (var1_1.s != 180 && var1_1.s != 181 && var1_1.s != 183 && var1_1.s != 184 && var1_1.s != 173 && var1_1.s != 202) ** GOTO lbl288
                v5 = var1_1;
                ** GOTO lbl-1000
lbl288:
                // 1 sources

                if (var1_1.s == 187 || var1_1.s == 168 || var1_1.s == 179 || var1_1.s == 174) {
                    v5 = var1_1;
                    v6 = var1_1.d(main.a.w);
                } else {
                    v5 = var1_1;
                    if (ci.b[var1_1.s].h.length == 3) {
                        v6 = 0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v6 = v5.E = 3;
                    }
                }
lbl297:
                // 6 sources

                if (var1_1.O && (am.e(var2_4 - var1_1.e) < 48 || am.e(var2_4 - var1_1.e) < 10 || ci.b[var1_1.s].c == 0)) {
                    v7 = var1_1.E = ci.b[var1_1.s].h.length == 3 ? 0 : 3;
                }
                if (var1_1.O) {
                    ++var1_1.Q;
                    if (am.e(var2_4 - var1_1.e) < 48 || am.e(var3_6 - var1_1.f) < 10) {
                        if (var1_1.Q >= ci.b[var1_1.s].l[0].length) {
                            var1_1.Q = 0;
                        }
                        var1_1.E = ci.b[var1_1.s].l[0][var1_1.Q];
                    } else {
                        if (var1_1.Q >= ci.b[var1_1.s].l[1].length) {
                            var1_1.Q = 0;
                        }
                        var1_1.E = ci.b[var1_1.s].l[1][var1_1.Q];
                    }
                }
                if (var1_1.E == 3 || var1_1.E == 6 || var1_1.E == 7) {
                    var1_1.G = 1;
                }
                if (ci.b[var1_1.s].c != 0 && !var1_1.o && var1_1.q && var1_1.r) {
                    var1_1.e += (var2_4 - var1_1.e) / 3;
                }
                if (var1_1.e > var1_1.i + ci.b[var1_1.s].a) {
                    var1_1.G = 1;
                }
                if (var1_1.e < var1_1.i - ci.b[var1_1.s].a) {
                    var1_1.G = 1;
                }
                if (!(ci.b[var1_1.s].c != 4 && ci.b[var1_1.s].c != 5 || var1_1.o)) {
                    var1_1.f += (var3_6 - var1_1.f) / 20;
                }
                ++var1_1.H;
                if (!(var1_1.O != false && am.e(var2_4 - var1_1.e) < 48 && am.e(var3_6 - var1_1.f) < 15 || am.e(var2_4 - var1_1.e) < 12 && am.e(var3_6 - var1_1.f) < 12 || var1_1.H > 12 || var1_1.G == 1) && (ci.b == null || ci.b[var1_1.s].l == null || var1_1.Q != ci.b[var1_1.s].l[0].length - 2 || var1_1.c().e != 166 && var1_1.c().e != 167)) ** GOTO lbl605
                var1_1.G = 1;
                if (var1_1.N != 0) ** GOTO lbl595
                if (!var1_1.O || am.e(var2_4 - var1_1.e) >= 48 || am.e(var3_6 - var1_1.f) >= 15) ** GOTO lbl468
                var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                var1_1.A = false;
                if (var1_1.c().e == 210) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(142, var1_1.e, var1_1.f, 1);
                    } else {
                        ap.a(142, var1_1.e, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 209) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(108, var1_1.e, var1_1.f, 1);
                    } else {
                        ap.a(108, var1_1.e, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 114) {
                    ap.a(79, var1_1.L, 3);
                } else if (var1_1.c().e == 115) {
                    if (var1_1.L == bp.d()) {
                        dg.bZ = 1;
                    }
                    dg.ca = 0;
                    ap.a(81, var1_1.L.i, var1_1.j + af.i, 2);
                    ap.a(81, var1_1.L.i - 40, var1_1.j + af.i, 2);
                    ap.a(81, var1_1.L.i + 40, var1_1.j + af.i, 2);
                } else if (var1_1.c().e == 116) {
                    if (var1_1.L == bp.d()) {
                        dg.bZ = 1;
                        dg.ca = 0;
                    }
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(86, var1_1.e, var1_1.f - var1_1.l / 2 + 5, 1);
                    } else {
                        ap.a(88, var1_1.e, var1_1.f - var1_1.l / 2 + 5, 1);
                    }
                    ap.a(87, var1_1.L.i, var1_1.L.j - var1_1.L.ag / 2, 2);
                    ap.a(87, var1_1.L.i - 40, var1_1.L.j - var1_1.L.ag / 2, 2);
                    ap.a(87, var1_1.L.i + 40, var1_1.L.j - var1_1.L.ag / 2, 2);
                } else if (var1_1.c().e == 138) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(89, var1_1.e + var1_1.k / 2, var1_1.f - var1_1.l / 2 - 5, 1);
                    } else {
                        ap.a(89, var1_1.e - var1_1.k / 2, var1_1.f - var1_1.l / 2 - 5, 1, (byte)-1);
                    }
                    ap.a(90, var1_1.L, 2);
                } else if (var1_1.c().e == 139) {
                    if (var1_1.L == bp.d()) {
                        dg.bZ = 1;
                        dg.ca = 0;
                    }
                    ap.a(91, var1_1.L, 2);
                } else if (var1_1.c().e == 140 || var1_1.c().e == 161) {
                    if (var1_1.L == bp.d()) {
                        dg.bZ = 1;
                        dg.ca = 0;
                    }
                    ap.a(112, var1_1.L, 2);
                    ap.a(109, var1_1.L.i - 40, var1_1.L.j - 40, 1);
                    ap.a(109, var1_1.L.i + 40, var1_1.L.j - 40, 1);
                    ap.a(109, var1_1.L.i - 20, var1_1.L.j, 2);
                    ap.a(109, var1_1.L.i + 20, var1_1.L.j, 2);
                } else if (var1_1.c().e == 141 || var1_1.c().e == 162) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(108, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(108, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                    ap.a(122, var1_1.e, var1_1.f, 1, (byte)var1_1.g);
                    ap.a(91, var1_1.L, 1);
                } else if (var1_1.c().e == 144 || var1_1.c().e == 163) {
                    if (var1_1.L == bp.d()) {
                        dg.bZ = 1;
                        dg.ca = 0;
                    }
                    ap.a(112, var1_1.L, 2);
                    ap.a(109, var1_1.L.i - 40, var1_1.L.j - 40, 1);
                    ap.a(109, var1_1.L.i + 40, var1_1.L.j - 40, 1);
                    ap.a(109, var1_1.L.i - 20, var1_1.L.j, 2);
                    ap.a(109, var1_1.L.i + 20, var1_1.L.j, 2);
                } else if (var1_1.c().e == 160) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(123, var1_1.e + var1_1.k / 2, var1_1.f - 5, 1);
                    } else {
                        ap.a(123, var1_1.e - var1_1.k / 2, var1_1.f - 5, 1, (byte)-1);
                    }
                    ap.a(91, var1_1.L, 1);
                } else if (var1_1.c().e == 164 || var1_1.c().e == 165) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(125, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(125, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                    ap.a(90, var1_1.L, 1);
                } else if (var1_1.c().e == 167) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(125, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(125, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 166) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(108, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(108, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 198) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(143, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(143, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 199) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(144, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(144, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 200) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(142, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(142, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 201) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(144, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                    } else {
                        ap.a(144, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                    }
                } else if (var1_1.c().e == 203) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(159, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                        ap.a(156, var1_1.L.i, var1_1.L.j, 1);
                    } else {
                        ap.a(159, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                        ap.a(156, var1_1.L.i, var1_1.L.j, -1);
                    }
                } else if (var1_1.c().e == 204) {
                    if (var1_1.L.i > var1_1.e) {
                        ap.a(159, var1_1.e + var1_1.k / 2, var1_1.f, 1);
                        ap.a(173, var1_1.L.i, var1_1.L.j, 1);
                    } else {
                        ap.a(159, var1_1.e - var1_1.k / 2, var1_1.f, 1, (byte)-1);
                        ap.a(173, var1_1.L.i, var1_1.L.j, -1);
                    }
                }
                ** GOTO lbl605
lbl468:
                // 1 sources

                if (am.e(var2_4 - var1_1.e) >= 24 || am.e(var3_6 - var1_1.f) >= 15) ** GOTO lbl471
                var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                ** GOTO lbl604
lbl471:
                // 1 sources

                if (var1_1.O) {
                    if (var1_1.c().e == 210) {
                        if (var1_1.L.i > var1_1.e) {
                            ap.a(178, var1_1.L.i, var1_1.L.j, 1);
                        } else {
                            ap.a(178, var1_1.L.i, var1_1.L.j, 1, (byte)-1);
                        }
                    } else if (var1_1.c().e == 209) {
                        if (var1_1.L.i > var1_1.e) {
                            ap.a(179, var1_1.L.i, var1_1.L.j, 1);
                        } else {
                            ap.a(179, var1_1.L.i, var1_1.L.j, 1, (byte)-1);
                        }
                    } else if (var1_1.c().e == 114 || var1_1.c().e == 115) {
                        dp.a(var1_1.e + (var1_1.g - 1) * 15, var1_1.f - 20, var1_1.O, var1_1.w, var1_1.c().e, var1_1.t, var1_1.u, var1_1.L);
                    } else if (var1_1.c().e == 116) {
                        ap.a(84, var1_1.L, 2);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 138) {
                        if (var1_1.L == bp.d()) {
                            dg.bZ = 1;
                            dg.ca = 0;
                        }
                        ap.a(83, var1_1.L, 2);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 139) {
                        dp.a(var1_1.e + (var1_1.g - 1) * 30, var1_1.f - 30, var1_1.O, var1_1.w, var1_1.c().e, var1_1.t, var1_1.u, var1_1.L);
                    } else if (var1_1.c().e == 140 || var1_1.c().e == 161) {
                        if (var1_1.L == bp.d()) {
                            dg.bZ = 1;
                            dg.ca = 0;
                        }
                        ap.a(110, var1_1.L, 2);
                        ap.a(104, var1_1.L.i - 20, var1_1.L.j, 2);
                        ap.a(104, var1_1.L.i + 20, var1_1.L.j, 2);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 141 || var1_1.c().e == 162) {
                        if (var1_1.L == bp.d()) {
                            dg.bZ = 1;
                            dg.ca = 0;
                        }
                        ap.a(121, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 144 || var1_1.c().e == 163) {
                        dp.a(var1_1.e + (var1_1.g - 1) * 15, var1_1.f - 20, var1_1.O, var1_1.w, var1_1.c().e, var1_1.t, var1_1.u, var1_1.L);
                    } else if (var1_1.c().e == 160) {
                        ap.a(124, var1_1.L, 2);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 164 || var1_1.c().e == 165) {
                        ap.a(126, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 167) {
                        ap.a(112, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(112, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(112, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 166) {
                        ap.a(92, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(92, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(92, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 198) {
                        ap.a(142, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(142, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(142, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 199) {
                        ap.a(143, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(143, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(143, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 200) {
                        ap.a(144, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(144, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(144, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 201) {
                        ap.a(108, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(108, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(108, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 203) {
                        ap.a(149, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(149, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(149, var1_1.L, 1);
                        ap.a(156, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    } else if (var1_1.c().e == 204) {
                        ap.a(153, var1_1.L.i + 5, var1_1.L.j, 1);
                        ap.a(153, var1_1.L.i - 5, var1_1.L.j, 1);
                        ap.a(153, var1_1.L, 1);
                        ap.a(173, var1_1.L, 1);
                        var1_1.A = false;
                        var1_1.L.a(var1_1.t, var1_1.u, var1_1.O, (int)var1_1.c().e);
                    }
                } else {
                    dp.a(var1_1.e - 5, var1_1.f + var1_1.g * 10, var1_1.O, var1_1.x, var1_1.c().e, var1_1.t, var1_1.u, var1_1.L);
                }
                var1_1.A = false;
                ** GOTO lbl605
lbl595:
                // 1 sources

                if (var1_1.N != 1) ** GOTO lbl605
                if (am.e(var2_4 - var1_1.e) < 24 && am.e(var3_6 - var1_1.f) < 15) {
                    var3_7 = var1_1.M;
                    var1_1.M.d = true;
                } else if (var1_1.O) {
                    dp.a(var1_1.e - 5, var1_1.f + var1_1.g * 10 - 20, var1_1.M);
                } else {
                    dp.a(var1_1.e - 5, var1_1.f + var1_1.g * 10, var1_1.M);
                }
lbl604:
                // 4 sources

                var1_1.A = false;
lbl605:
                // 34 sources

                var1_1.g = var1_1.e < var2_4 ? 1 : -1;
                break;
lbl607:
                // 1 sources

                if (var1_1.G != 1) break;
                if (!(ci.b[var1_1.s].c == 0 || var1_1.o || var1_1.q || var1_1.r)) {
                    var1_1.e += (var1_1.i - var1_1.e) / 4;
                    var1_1.f += (var1_1.j - var1_1.f) / 4;
                }
                if (am.e(var1_1.i - var1_1.e) >= 5 || am.e(var1_1.j - var1_1.f) >= 5) break;
                var1_1.h = 2;
                var1_1.G = 0;
                var1_1.H = 0;
                break;
lbl616:
                // 1 sources

                this.i();
                break;
lbl618:
                // 1 sources

                this.l();
                break;
            }
            case 5: {
                try {
                    if (main.a.w % 4 == 0 && this.O) {
                        ++this.Q;
                        if (this.Q > ci.b[this.s].k.length - 1) {
                            this.Q = 0;
                        }
                    }
                }
                catch (Exception v8) {}
                this.J = 0;
                this.j();
                break;
            }
            case 6: {
                this.J = 0;
                ++this.G;
                this.f += this.G;
                if (this.f < this.j) break;
                this.f = this.j;
                this.G = 0;
                this.h = 5;
                break;
            }
            case 7: {
                this.h();
            }
        }
        this.k();
        if (this.T && this.c <= 0) {
            dg.Q.removeElement(this);
        }
        this.a((byte)1, this.h);
    }

    public final void b() {
        if (this.c > 0) {
            this.J = 4;
            this.h = 7;
        }
    }

    public final void a(bp bp2) {
        this.A = true;
        this.L = bp2;
        this.G = 0;
        this.H = 0;
        this.h = 3;
        this.Q = this.s == 209 || this.s == 210 ? 0 : (this.s == 168 || this.s == 176 || this.s == 177 || this.s == 179 ? 6 : (this.s == 169 || this.s == 171 || this.s == 172 || this.s == 182 ? 2 : (this.s == 175 ? 7 : (this.s == 181 || this.s == 185 || this.s == 188 || this.s == 194 || this.s == 192 ? 3 : (this.s == 183 || this.s == 170 || this.s == 193 ? 4 : (this.s == 187 || this.s == 168 || this.s == 175 || this.s == 176 || this.s == 179 || this.s == 174 ? this.d(main.a.w) : 0))))));
        this.N = 0;
    }

    public final void a(dk dk2) {
        this.M = dk2;
        this.G = 0;
        this.H = 0;
        this.h = 3;
        this.N = 1;
    }

    private void h() {
        int n2 = this.O ? (this.c().e == 204 ? 9 : (this.c().e == 203 ? 9 : (this.c().e == 139 ? 4 : (this.c().e == 160 ? 12 : 10)))) : (this.E = 2);
        if (this.c().e == 209 || this.c().e == 210) {
            this.E = 3;
        } else if (this.c().e == 141) {
            this.E = 13;
        } else if (this.c().e == 169 || this.c().e == 170 || this.c().e == 171 || this.c().e == 172 || this.c().e == 182) {
            this.E = 3;
        } else if (this.c().e == 168 || this.c().e == 176 || this.c().e == 177 || this.c().e == 179 || this.c().e == 180) {
            this.E = 7;
        } else if (this.c().e == 173 || this.c().e == 184) {
            this.E = 6;
        } else if (this.c().e == 181 || this.c().e == 178 || this.c().e == 185 || this.c().e == 202) {
            this.E = 4;
        } else if (this.c().e == 174) {
            this.E = 10;
        } else if (this.c().e == 183) {
            this.E = 5;
        } else if (this.c().e == 175) {
            this.E = 8;
        }
        --this.J;
        if (this.J <= 0) {
            if (this.C != null && this.D || this.c == 0) {
                this.h = 1;
                this.H = this.C.o << 3;
                this.G = -5;
                this.I = 0;
            } else {
                this.h = 5;
                if (this.C != null) {
                    this.g = -this.C.o;
                    if (am.e(this.e - this.C.i) < 24) {
                        this.h = 2;
                    }
                }
                this.I = 0;
                this.H = 0;
                this.G = 0;
                this.J = 0;
            }
            this.C = null;
            return;
        }
        if (ci.b[this.s].c != 0 && this.e > this.i - ci.b[this.s].a) {
            b[this.s].getClass();
        }
    }

    private void i() {
        if (this.G == 0) {
            int n2 = 0;
            int n3 = 0;
            n2 = this.L.i;
            n3 = this.L.j;
            this.N = this.aa;
            if (ci.b[this.s].b > 0) {
                int n4 = this.g = this.e >= n2 ? 0 : 1;
            }
            if (this.O) {
                ++this.Q;
                if (this.Q >= ci.b[this.s].l[this.N].length) {
                    this.Q = 0;
                    this.h = 2;
                    this.X = null;
                    this.Y = null;
                    this.G = 0;
                    this.H = 0;
                }
                if (this.Q == ci.b[this.s].l[this.N].length - 1) {
                    if (this.ab == 0) {
                        ap.a(this.Z, n2, n3, 1, (byte)(this.g == 0 ? -1 : 1));
                    } else if (this.ab == 1 && this.Z > -1) {
                        bl.a(this.Z, n2, n3, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
                    }
                }
                this.E = ci.b[this.s].l[this.aa][this.Q];
            } else {
                ap.a(this.Z, n2, n3, 1, (byte)(this.g == 0 ? -1 : 1));
            }
            if (ci.b[this.s].c != 0 && !this.o && this.q && this.r) {
                this.e += (n2 - this.e) / 3;
            }
            if (this.e > this.i + ci.b[this.s].a) {
                this.G = 1;
            }
            if (this.e < this.i - ci.b[this.s].a) {
                this.G = 1;
                return;
            }
        } else if (this.G == 1) {
            if (!(ci.b[this.s].c == 0 || this.o || this.q || this.r)) {
                this.e += (this.i - this.e) / 4;
                this.f += (this.j - this.f) / 4;
            }
            if (am.e(this.i - this.e) < 5 && am.e(this.j - this.f) < 5) {
                this.h = 2;
                this.Q = 0;
                this.G = 0;
                this.H = 0;
            }
        }
    }

    public static int a(int n2, int n3, int n4, int n5) {
        n2 -= n4;
        if ((n2 = n2 * n2 + (n3 -= n5) * n3) <= 0) {
            return 0;
        }
        n3 = (n2 + 1) / 2;
        while (Math.abs((n4 = n3) - (n3 = n3 / 2 + n2 / (n3 * 2))) > 1) {
        }
        return n3;
    }

    private void j() {
        try {
            if (this.D) {
                this.h = 1;
                this.H = this.C.o << 3;
                this.G = -5;
                this.I = 0;
            }
            if (this.q) {
                return;
            }
            if (this.o || this.r) {
                this.E = 0;
                return;
            }
            switch (ci.b[this.s].c) {
                case 0: {
                    if (this.s == 176) {
                        this.h = 9;
                    }
                    this.E = 0;
                    return;
                }
                case 1: 
                case 2: 
                case 3: {
                    byte by2 = ci.b[this.s].b;
                    if (by2 == 1) {
                        if (main.a.w % 2 == 1) {
                            return;
                        }
                    } else if (by2 > 2) {
                        by2 = (byte)(by2 + this.m % 2);
                    } else if (main.a.w % 2 == 1 && ci.b[this.s].b != 0) {
                        by2 = (byte)(by2 - 1);
                    }
                    this.e += by2 * this.g;
                    if (am.d(0, ci.b[this.s].a) == ci.b[this.s].a / 3) {
                        this.h = 2;
                        this.U = System.currentTimeMillis();
                    }
                    if (this.e > this.i + ci.b[this.s].a) {
                        this.g = -1;
                        if (this.s == 168 || this.s == 177) {
                            this.h = 9;
                            this.G = 0;
                        }
                    } else if (this.e < this.i - ci.b[this.s].a) {
                        this.g = 1;
                        if (this.s == 168 || this.s == 177) {
                            this.h = 9;
                            this.G = 0;
                        }
                    }
                    if (!this.O) {
                        if (this.s < 168) {
                            this.E = main.a.w % 4 > 1 ? 0 : 1;
                            return;
                        }
                        this.E = this.b(main.a.w);
                        return;
                    }
                    this.E = ci.b[this.s].k[this.Q];
                    return;
                }
                case 4: {
                    if (this.s >= 236) {
                        if (this.B != null) {
                            byte by3 = ci.b[this.s].b;
                            byte by4 = ci.b[this.s].b;
                            if (this.B.n != 1 && this.B.n != 6 && ci.a(this.e, this.f, this.B.i, this.B.j) > ci.b[this.s].a) {
                                by3 = (byte)(ci.b[this.s].b + 2);
                            }
                            by3 = (byte)(by3 + this.m % 2);
                            by4 = (byte)(by4 + this.m % 2);
                            if (this.B.n == 1 || this.B.n == 6) {
                                if (this.e - this.i >= ci.b[this.s].a) {
                                    this.V = true;
                                    this.W = false;
                                } else if (this.i - this.e >= ci.b[this.s].a) {
                                    this.W = true;
                                    this.V = false;
                                }
                            } else {
                                this.W = false;
                                this.V = false;
                                if (this.e > this.i + ci.b[this.s].a) {
                                    this.g = -1;
                                    if (this.s == 179 || this.s == 175) {
                                        this.h = 9;
                                    }
                                    this.G = 0;
                                } else if (this.e < this.i - ci.b[this.s].a) {
                                    this.g = 1;
                                    if (this.s == 179 || this.s == 175) {
                                        this.h = 9;
                                    }
                                    this.G = 0;
                                }
                            }
                            if (this.V) {
                                this.g = -1;
                            }
                            if (this.W) {
                                this.g = 1;
                            }
                            this.e += by3 * this.g;
                            if (main.a.w % 10 > 2 && this.s != 205 && this.s != 206 && this.s != 207 && this.s != 208) {
                                this.ac = (byte)-1;
                                this.f += by4 * this.F;
                            }
                            if (this.f > this.j + 24) {
                                this.F = -1;
                            } else if (this.f < this.j - (20 + main.a.w % 10)) {
                                this.F = 1;
                            }
                            if (!this.O) {
                                if (this.s < 168) {
                                    this.E = main.a.w % 4 > 1 ? 0 : 1;
                                    break;
                                }
                                this.E = this.b(main.a.w);
                            }
                        }
                        return;
                    }
                    byte by5 = ci.b[this.s].b;
                    by5 = (byte)(by5 + this.m % 2);
                    this.e += by5 * this.g;
                    if (main.a.w % 10 > 2 && this.s != 205 && this.s != 206 && this.s != 207 && this.s != 208) {
                        this.ac = (byte)-1;
                        this.f += by5 * this.F;
                    }
                    if (this.e > this.i + ci.b[this.s].a) {
                        this.g = -1;
                        if (this.s == 179 || this.s == 175) {
                            this.h = 9;
                        }
                        this.G = 0;
                    } else if (this.e < this.i - ci.b[this.s].a) {
                        this.g = 1;
                        if (this.s == 179 || this.s == 175) {
                            this.h = 9;
                        }
                        this.G = 0;
                    }
                    if (this.f > this.j + 24) {
                        this.F = -1;
                    } else if (this.f < this.j - (20 + main.a.w % 10)) {
                        this.F = 1;
                    }
                    if (!this.O) {
                        this.E = this.s < 168 ? (main.a.w % 4 > 1 ? 0 : 1) : this.b(main.a.w);
                        break;
                    }
                    this.E = ci.b[this.s].k[this.Q];
                    return;
                }
                case 5: {
                    byte by6 = ci.b[this.s].b;
                    by6 = (byte)(by6 + this.m % 2);
                    this.e += by6 * this.g;
                    by6 = (byte)(by6 + (main.a.w + this.m) % 2);
                    if (main.a.w % 10 > 2) {
                        this.f += by6 * this.F;
                    }
                    if (this.e > this.i + ci.b[this.s].a) {
                        this.g = -1;
                        this.h = this.s == 179 || this.s == 175 ? 9 : 2;
                        this.G = 0;
                    } else if (this.e < this.i - ci.b[this.s].a) {
                        this.g = 1;
                        this.h = this.s == 179 || this.s == 175 ? 9 : 2;
                        this.G = 0;
                    }
                    if (this.f > this.j + 24) {
                        this.F = -1;
                    } else if (this.f < this.j - (20 + main.a.w % 10)) {
                        this.F = 1;
                    }
                    if (af.a(this.e, this.f, 2)) {
                        if (main.a.w % 10 > 5) {
                            this.f = af.b(this.f);
                            this.h = 4;
                            this.G = 0;
                        }
                        this.F = -1;
                    }
                    if (!this.O) {
                        if (this.s < 168) {
                            this.E = main.a.w % 4 > 1 ? 3 : 1;
                            return;
                        }
                        this.E = this.b(main.a.w);
                        return;
                    }
                    this.E = ci.b[this.s].k[this.Q];
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final a c() {
        return b[this.s];
    }

    public final boolean d() {
        if (this.e < dg.i) {
            return false;
        }
        if (this.e > dg.i + dg.b) {
            return false;
        }
        if (this.f < dg.j) {
            return false;
        }
        if (this.f > dg.j + dg.c + 30) {
            return false;
        }
        if (b[this.s] == null) {
            return false;
        }
        if (!this.O) {
            if (this.E >= ci.b[this.s].h.length) {
                return false;
            }
            if (ci.b[this.s].h[this.E] == null) {
                return false;
            }
            if (this.s == 179 || this.s == 175 || this.s == 202 ? this.h == 8 : this.s == 176 && (this.E == 1 || this.E == 0)) {
                return false;
            }
        }
        return this.h != 0;
    }

    public final void a(t t2) {
        int n2;
        if (!this.d()) {
            return;
        }
        int n3 = this.f;
        if (this.s == 205 || this.s == 206 || this.s == 207 || this.s == 208) {
            this.ac = (byte)(this.ac + 1);
            if (this.ac > bp.bN.length - 1) {
                this.ac = 0;
            }
        }
        if (this.ac > -1) {
            n3 += bp.bN[this.ac];
        }
        Object object = b[this.s];
        if (!this.O) {
            if (this.k == 0) {
                this.k = t.a(((a)object).h[0]);
            }
            if (this.l == 0) {
                this.l = t.b(((a)object).h[0]);
            }
        } else {
            this.k = 40;
            this.l = 40;
        }
        this.b(t2, this.e, n3, 0);
        try {
            int n4;
            int n5 = n4 = this.g > 0 ? 0 : 2;
            if (this.s == 219) {
                n4 = 0;
            }
            if ((this.s == 98 || this.s == 99) && this.h == 1) {
                long l2 = System.currentTimeMillis();
                if (l2 - this.P < 400L) {
                    t2.a(((a)object).h[this.E], 0, 0, t.a(((a)object).h[this.E]), t.b(((a)object).h[this.E]), n4, this.e, n3, ch.d);
                } else if (l2 - this.P < 800L) {
                    t2.a(((a)object).h[this.E], 0, 0, t.a(((a)object).h[this.E]), 3 * t.b(((a)object).h[this.E]) / 5, n4, this.e, n3, ch.d);
                } else if (l2 - this.P < 1200L) {
                    t2.a(((a)object).h[this.E], 0, 0, t.a(((a)object).h[this.E]), t.b(((a)object).h[this.E]) / 3, n4, this.e, n3, ch.d);
                }
                if (main.a.w % 8 < 2) {
                    ab.a(t2, 457, this.e, n3, 0, ch.d);
                } else if (main.a.w % 8 < 4) {
                    ab.a(t2, 458, this.e, n3, 0, ch.d);
                } else if (main.a.w % 8 < 6) {
                    ab.a(t2, 459, this.e, n3, 0, ch.d);
                }
            } else if (this.O) {
                if (this.c().j != null) {
                    if (this.s < 236) {
                        ct ct2 = this.c().j[this.E];
                        n2 = 0;
                        while (n2 < ct2.a.length) {
                            byte by2 = ct2.c[n2];
                            a a2 = this.c();
                            object = a2.i[by2];
                            if (this.g > 0) {
                                t2.a(this.c().h[0], ((cv)object).a, ((cv)object).b, ((cv)object).c, ((cv)object).d, 0, this.e + ct2.a[n2], n3 + ct2.b[n2] - 1, 20);
                            } else {
                                t2.a(this.c().h[0], ((cv)object).a, ((cv)object).b, ((cv)object).c, ((cv)object).d, 2, this.e - ct2.a[n2], n3 + ct2.b[n2] - 1, 24);
                            }
                            ++n2;
                        }
                    } else {
                        Object object2;
                        t t3 = t2;
                        object = this;
                        try {
                            if (main.a.w % 2 == 0 && ((ci)object).h != 3) {
                                ++((ci)object).ag;
                                if (((ci)object).ag > ((ci)object).c().k.length - 1) {
                                    ((ci)object).ag = 0;
                                }
                                ((ci)object).E = ((ci)object).c().k[((ci)object).ag];
                            }
                            object2 = ((ci)object).c().j[((ci)object).E];
                            n2 = 0;
                            while (n2 < ((ct)object2).a.length) {
                                if (((ct)object2).e[n2] != 0) {
                                    int n6;
                                    int n7 = ((ct)object2).c[n2];
                                    Object object3 = ((ci)object).c();
                                    object3 = ((a)object3).i[n7];
                                    n7 = ((cv)object3).a;
                                    int n8 = ((cv)object3).b;
                                    int n9 = ((cv)object3).c;
                                    int n10 = ((cv)object3).d;
                                    int n11 = ((ct)object2).a[n2];
                                    short s2 = ((ct)object2).b[n2];
                                    if (n7 > ((ci)object).c().h[0].getWidth()) {
                                        n7 = 0;
                                    }
                                    if (n8 > ((ci)object).c().h[0].getHeight()) {
                                        n8 = 0;
                                    }
                                    if (n7 + n9 > ((ci)object).c().h[0].getWidth()) {
                                        n9 = ((ci)object).c().h[0].getWidth() - n7;
                                    }
                                    if (n8 + n10 > ((ci)object).c().h[0].getHeight()) {
                                        n10 = ((ci)object).c().h[0].getHeight() - n8;
                                    }
                                    int n12 = n6 = ((ct)object2).d[n2] == 1 ? 2 : 0;
                                    if (((ci)object).g == 1) {
                                        if (n6 == 2) {
                                            n6 = 0;
                                            n11 += n9;
                                        } else {
                                            n6 = 2;
                                            n11 = -(n11 + n9);
                                        }
                                    }
                                    t3.a(((ci)object).c().h[0], n7, n8, n9, n10, n6, ((ci)object).e + n11, ((ci)object).f + s2, 0);
                                }
                                ++n2;
                            }
                        }
                        catch (Exception exception) {
                            object2 = exception;
                            exception.printStackTrace();
                            System.err.println("Err paintTopMobNew:" + ((ci)object).s);
                        }
                        this.b(t2);
                    }
                }
            } else if (this.s == 168 && this.h != 8) {
                t2.a(((a)object).h[this.E], 0, 0, t.a(((a)object).h[this.E]), t.b(((a)object).h[this.E]), n4, this.e, n3, ch.d);
            } else {
                t2.a(((a)object).h[this.E], 0, 0, t.a(((a)object).h[this.E]), t.b(((a)object).h[this.E]), n4, this.e, n3, ch.d);
            }
            this.a(t2, this.e, n3, 0);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        int n13 = n3;
        if (bp.d().aR != null && bp.d().aR.equals(this) && this.h != 1) {
            int n14;
            if (this.O) {
                n14 = this.d;
                if (n14 < this.c) {
                    n14 = this.c;
                }
                n2 = (int)((long)this.c * 100L / (long)n14);
                int n15 = this.k;
                n14 = 4;
                if (this.w == 1 || this.w == 2 || this.w == 3 || this.O) {
                    n14 = 6;
                    n15 += n15 / 2;
                }
                if ((n2 = (n15 += 2) * n2 / 100) < 2) {
                    n2 = 2;
                }
                if (this.s == 140 || this.s == 160) {
                    n13 -= 20;
                }
                if (this.s != 142 && this.s != 143) {
                    t2.a(0xFFFFFF);
                    t2.c(this.e - n15 / 2 - 1, n13 - this.l - 12, n15, n14);
                    t2.a(this.e());
                    t2.c(this.e - n15 / 2 - 1, n13 - this.l - 12, n2, n14);
                    t2.a(0);
                    t2.b(this.e - n15 / 2 - 1, n13 - this.l - 12, n15, n14);
                } else {
                    ab.a(t2, 988, this.e, n13 - this.l, 0, 33);
                }
            } else {
                n14 = this.d;
                if (n14 < this.c) {
                    n14 = this.c;
                }
                n2 = (int)((long)this.c * 100L / (long)n14);
                int n16 = this.k;
                if (this.s > 167) {
                    n16 = this.k / 2;
                }
                n14 = 4;
                if (this.w == 1 || this.w == 2 || this.w == 3 || this.O) {
                    n14 = 6;
                    n16 += n16 / 2;
                }
                if ((n2 = (n16 += 2) * n2 / 100) < 2) {
                    n2 = 2;
                }
                if (this.s == 140 || this.s == 160) {
                    n13 -= 20;
                }
                if (this.s != 142 && this.s != 143) {
                    t2.a(0xFFFFFF);
                    t2.c(this.e - n16 / 2 - 1, n13 - this.l - 12, n16, n14);
                    t2.a(this.e());
                    t2.c(this.e - n16 / 2 - 1, n13 - this.l - 12, n2, n14);
                    t2.a(0);
                    t2.b(this.e - n16 / 2 - 1, n13 - this.l - 12, n16, n14);
                } else {
                    ab.a(t2, 988, this.e, n13 - this.l, 0, 33);
                }
            }
            if (this.w > 0) {
                if (this.w == 1) {
                    dd.j.a(t2, df.ea[this.w], this.e, n13 - this.l - 26, 2, dd.k);
                } else if (this.w == 2) {
                    dd.j.a(t2, df.ea[this.w], this.e, n13 - this.l - 26, 2, dd.k);
                } else if (this.w == 3) {
                    dd.h.a(t2, df.ea[this.w], this.e, n13 - this.l - 26, 2, dd.k);
                }
                if (this.n) {
                    ab.a(t2, 494, this.e, n13 - this.l - 28, 0, 33);
                }
            } else if (this.n) {
                ab.a(t2, 494, this.e, n13 - this.l - 15, 0, 33);
            }
        } else if (this.w > 0) {
            if (this.w == 1) {
                dd.j.a(t2, df.ea[this.w], this.e, n13 - this.l - 20, 2, dd.k);
            } else if (this.w == 2) {
                dd.j.a(t2, df.ea[this.w], this.e, n13 - this.l - 20, 2, dd.k);
            } else if (this.w == 3) {
                dd.h.a(t2, df.ea[this.w], this.e, n13 - this.l - 20, 2, dd.k);
            }
            if (this.n) {
                ab.a(t2, 494, this.e, n13 - this.l - 22, 0, 33);
            }
        } else if (this.n) {
            ab.a(t2, 494, this.e, n3 - this.l - 5, 0, 33);
        }
        if (this.o) {
            if (main.a.w % 2 == 0) {
                ab.a(t2, 1082, this.e, n3 - this.l / 2, 0, 3);
            } else {
                ab.a(t2, 1084, this.e, n3 - this.l / 2, 0, 3);
            }
        }
        if (this.q) {
            ab.a(t2, 290, this.e, n3, 0, 33);
        }
        if (this.r) {
            int n17 = main.a.w % 6;
            if (n17 == 0 || n17 == 1) {
                ab.a(t2, 998, this.e, n3 - this.l - 5, 0, 3);
            } else if (n17 == 2 || n17 == 3) {
                ab.a(t2, 999, this.e, n3 - this.l - 5, 0, 3);
            } else if (n17 == 4 || n17 == 5) {
                ab.a(t2, 1000, this.e, n3 - this.l - 5, 0, 3);
            }
        }
        if (this.p) {
            int n18 = main.a.w % 16;
            if (n18 == 0) {
                ab.a(t2, 1013, this.e - this.k / 2, n3 - this.l + this.l / 4, 0, 3);
                return;
            }
            if (n18 == 1) {
                ab.a(t2, 1014, this.e - this.k / 2, n3 - this.l + this.l / 4, 0, 3);
                return;
            }
            if (n18 == 2) {
                ab.a(t2, 1015, this.e - this.k / 2, n3 - this.l + this.l / 4, 0, 3);
                return;
            }
            if (n18 == 3) {
                ab.a(t2, 1016, this.e - this.k / 2, n3 - this.l + this.l / 4, 0, 3);
                return;
            }
            if (n18 == 4) {
                ab.a(t2, 1013, this.e + this.k / 2, n3 - this.l, 0, 3);
                return;
            }
            if (n18 == 5) {
                ab.a(t2, 1014, this.e + this.k / 2, n3 - this.l, 0, 3);
                return;
            }
            if (n18 == 6) {
                ab.a(t2, 1015, this.e + this.k / 2, n3 - this.l, 0, 3);
                return;
            }
            if (n18 == 7) {
                ab.a(t2, 1016, this.e + this.k / 2, n3 - this.l, 0, 3);
                return;
            }
            if (n18 == 8) {
                ab.a(t2, 1013, this.e - this.k / 2, n3, 0, 3);
                return;
            }
            if (n18 == 9) {
                ab.a(t2, 1014, this.e - this.k / 2, n3, 0, 3);
                return;
            }
            if (n18 == 10) {
                ab.a(t2, 1015, this.e - this.k / 2, n3, 0, 3);
                return;
            }
            if (n18 == 11) {
                ab.a(t2, 1016, this.e - this.k / 2, n3, 0, 3);
                return;
            }
            if (n18 == 12) {
                ab.a(t2, 1013, this.e + this.k / 2, n3 - this.l / 4, 0, 3);
                return;
            }
            if (n18 == 13) {
                ab.a(t2, 1014, this.e + this.k / 2, n3 - this.l / 4, 0, 3);
                return;
            }
            if (n18 == 14) {
                ab.a(t2, 1015, this.e + this.k / 2, n3 - this.l / 4, 0, 3);
                return;
            }
            if (n18 == 15) {
                ab.a(t2, 1016, this.e + this.k / 2, n3 - this.l / 4, 0, 3);
            }
        }
    }

    public final int e() {
        if (this.v <= 1) {
            return 0xFF0000;
        }
        if (this.v == 2) {
            return 33023;
        }
        if (this.v == 3) {
            return 7443811;
        }
        return 0xFF0000;
    }

    public final void f() {
        this.c = 0;
        this.P = System.currentTimeMillis();
        if (this.C != null) {
            this.D = true;
            return;
        }
        this.D = true;
        this.c = 0;
        this.h = 1;
        this.G = -5;
        this.H = -this.g << 2;
        this.I = 0;
    }

    public final void a(ci ci2) {
        this.X = ci2;
    }

    public final void b(bp bp2) {
        this.Y = bp2;
    }

    private void k() {
        int n2;
        int n3;
        if (this.X != null) {
            if (this.O) {
                this.h = 3;
            } else {
                n3 = this.X.e - this.e;
                n2 = this.X.f - this.f;
                this.e += n3 / 4;
                this.f += n2 / 4;
                int n4 = this.g = this.e >= this.X.e ? 0 : 1;
                if (this.X.h == 1 || this.X.h == 0 || am.e(n3) < 20 && am.e(n2) < 20) {
                    if (this.ab == 0) {
                        ap.a(this.Z == -1 ? 59 : (int)this.Z, this.X.e, this.X.f, this.g == 0 ? -1 : 1);
                    } else if (this.ab == 1 && this.Z > -1) {
                        bl.a(this.Z, this.X.e, this.X.f, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
                    }
                    this.X = null;
                }
            }
        }
        if (this.Y != null) {
            if (this.O) {
                this.h = 3;
                return;
            }
            n3 = this.Y.i - this.e;
            n2 = this.Y.j - this.f;
            this.e += n3 / 4;
            this.f += n2 / 4;
            int n5 = this.g = this.e >= this.Y.i ? 0 : 1;
            if (this.Y.n == 5 || this.Y.n == 14 || am.e(n3) < 20 && am.e(n2) < 20) {
                if (this.ab == 0) {
                    ap.a(this.Z == -1 ? 59 : (int)this.Z, this.Y.i, this.Y.j, this.g == 0 ? -1 : 1);
                } else if (this.ab == 1 && this.Z > -1) {
                    bl.a(this.Z, this.Y.i, this.Y.j, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
                }
                this.Y = null;
            }
        }
    }

    public final void a(short s2, byte by2, byte by3) {
        this.Z = s2;
        this.aa = by2;
        this.ab = by3;
    }

    public final void g() {
        if (this.s == 116) {
            ap.a(84, bp.d(), 1);
            return;
        }
        if (this.s == 115) {
            ap.a(81, bp.d(), 1);
            return;
        }
        if (this.s == 138) {
            ap.a(90, bp.d(), 1);
            return;
        }
        if (this.s == 139) {
            ap.a(91, bp.d(), 1);
            return;
        }
        if (this.s == 140 || this.s == 161) {
            ap.a(110, bp.d(), 2);
            return;
        }
        if (this.s == 141 || this.s == 162) {
            ap.a(121, bp.d(), 1);
            return;
        }
        if (this.s == 144 || this.s == 163) {
            ap.a(121, bp.d(), 1);
            return;
        }
        if (this.s == 160) {
            ap.a(124, bp.d(), 1);
            return;
        }
        if (this.s == 164 || this.s == 165) {
            ap.a(126, this.L, 1);
            return;
        }
        if (this.s == 166) {
            ap.a(103, this.L, 1);
            return;
        }
        if (this.s == 166) {
            ap.a(105, this.L, 1);
        }
    }

    private int b(int n2) {
        n2 %= ad[this.s - 168].length;
        if (this.s != 198 && this.s != 199 && this.s != 200 && this.s != 201 && this.s != 203 && this.s != 204) {
            return ad[this.s - 168][n2];
        }
        return 0;
    }

    private int c(int n2) {
        try {
            return ae[this.s - 168][n2 %= ae[this.s - 168].length];
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private int d(int n2) {
        n2 %= 5;
        if (this.s == 178) {
            switch (n2) {
                case 0: {
                    return 5;
                }
                case 1: {
                    return 6;
                }
                case 2: {
                    return 7;
                }
                case 3: {
                    return 8;
                }
            }
        } else if (this.s == 168) {
            switch (n2) {
                case 0: {
                    return 1;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        } else if (this.s == 179) {
            switch (n2) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        } else if (this.s == 175) {
            switch (n2) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        } else if (this.s == 176) {
            switch (n2) {
                case 0: {
                    return 2;
                }
                case 1: {
                    return 3;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                case 4: {
                    return 6;
                }
            }
        } else if (this.s == 177) {
            switch (n2) {
                case 0: {
                    return 1;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        } else if (this.s == 174) {
            switch (n2) {
                case 0: {
                    return 5;
                }
                case 1: {
                    return 6;
                }
                case 2: {
                    return 7;
                }
                case 3: {
                    return 8;
                }
                case 4: {
                    return 9;
                }
            }
        }
        return 0;
    }

    private int e(int n2) {
        try {
            return af[this.s - 168][n2 %= af[this.s - 168].length];
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private void l() {
        if (this.G == 0) {
            int n2 = 0;
            int n3 = 0;
            if (this.X != null) {
                n2 = this.X.e;
                n3 = this.X.f;
            }
            if (this.Y != null) {
                n2 = this.Y.i;
                n3 = this.Y.j;
            }
            this.N = this.aa;
            int n4 = this.g = this.e >= n2 ? 0 : 1;
            if (this.O) {
                ++this.Q;
                if (this.Q >= ci.b[this.s].l[this.N].length) {
                    this.Q = 0;
                    this.h = 2;
                    this.X = null;
                    this.Y = null;
                    this.G = 0;
                    this.H = 0;
                }
                if (this.Q == ci.b[this.s].l[this.N].length - 2) {
                    if (this.ab == 0) {
                        ap.a(this.Z == -1 ? 59 : (int)this.Z, n2, n3, 1, (byte)(this.g == 0 ? -1 : 1));
                    } else if (this.ab == 1 && this.Z > -1) {
                        bl.a(this.Z, n2, n3, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
                    }
                }
                this.E = ci.b[this.s].l[this.aa][this.Q];
            }
            if (ci.b[this.s].c != 0 && !this.o && this.q && this.r) {
                this.e += (n2 - this.e) / 3;
            }
            if (this.e > this.i + ci.b[this.s].a) {
                this.G = 1;
            }
            if (this.e < this.i - ci.b[this.s].a) {
                this.G = 1;
                return;
            }
        } else if (this.G == 1) {
            if (!(ci.b[this.s].c == 0 || this.o || this.q || this.r)) {
                this.e += (this.i - this.e) / 4;
                this.f += (this.j - this.f) / 4;
            }
            if (am.e(this.i - this.e) < 5 && am.e(this.j - this.f) < 5) {
                this.h = 2;
                this.Q = 0;
                this.G = 0;
                this.H = 0;
            }
        }
    }

    public static ci a(int n2) {
        int n3 = dg.Q.size() - 1;
        while (n3 >= 0) {
            ci ci2 = (ci)dg.Q.elementAt(n3);
            if (ci2 != null && ci2.m == n2) {
                return ci2;
            }
            --n3;
        }
        return null;
    }

    public final void a(t t2, int n2, int n3) {
        try {
            if (main.a.w % 2 == 0 && this.h != 3) {
                ++this.ag;
                if (this.ag > this.c().k.length - 1) {
                    this.ag = 0;
                }
                this.E = this.c().k[this.ag];
            }
            ct ct2 = this.c().j[this.E];
            int n4 = 0;
            while (n4 < ct2.a.length) {
                if (ct2.e[n4] != 0) {
                    int n5 = ct2.c[n4];
                    Object object = this.c();
                    object = ((a)object).i[n5];
                    n5 = ((cv)object).a;
                    int n6 = ((cv)object).b;
                    int n7 = ((cv)object).c;
                    int n8 = ((cv)object).d;
                    int n9 = ct2.a[n4];
                    short s2 = ct2.b[n4];
                    if (n5 > this.c().h[0].getWidth()) {
                        n5 = 0;
                    }
                    if (n6 > this.c().h[0].getHeight()) {
                        n6 = 0;
                    }
                    if (n5 + n7 > this.c().h[0].getWidth()) {
                        n7 = this.c().h[0].getWidth() - n5;
                    }
                    if (n6 + n8 > this.c().h[0].getHeight()) {
                        n8 = this.c().h[0].getHeight() - n6;
                    }
                    n9 = -(n9 + n7);
                    t2.a(this.c().h[0], n5, n6, n7, n8, 2, n2 + n9, n3 + s2, 0);
                }
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.err.println("Err paintTopMobNew:" + this.s);
            return;
        }
    }

    public final void b(t t2, int n2, int n3) {
        try {
            ct ct2 = this.c().j[this.E];
            int n4 = 0;
            while (n4 < ct2.a.length) {
                if (ct2.e[n4] == 0) {
                    int n5 = ct2.c[n4];
                    Object object = this.c();
                    object = ((a)object).i[n5];
                    n5 = ((cv)object).a;
                    int n6 = ((cv)object).b;
                    int n7 = ((cv)object).c;
                    int n8 = ((cv)object).d;
                    int n9 = ct2.a[n4];
                    short s2 = ct2.b[n4];
                    if (n5 > this.c().h[0].getWidth()) {
                        n5 = 0;
                    }
                    if (n6 > this.c().h[0].getHeight()) {
                        n6 = 0;
                    }
                    if (n5 + n7 > this.c().h[0].getWidth()) {
                        n7 = this.c().h[0].getWidth() - n5;
                    }
                    if (n6 + n8 > this.c().h[0].getHeight()) {
                        n8 = this.c().h[0].getHeight() - n6;
                    }
                    n9 = -(n9 + n7);
                    t2.a(this.c().h[0], n5, n6, n7, n8, 2, n2 + n9, n3 + s2, 0);
                }
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.s);
            return;
        }
    }

    private void b(t t2) {
        try {
            ct ct2 = this.c().j[this.E];
            int n2 = 0;
            while (n2 < ct2.a.length) {
                if (ct2.e[n2] == 0) {
                    int n3;
                    int n4 = ct2.c[n2];
                    Object object = this.c();
                    object = ((a)object).i[n4];
                    n4 = ((cv)object).a;
                    int n5 = ((cv)object).b;
                    int n6 = ((cv)object).c;
                    int n7 = ((cv)object).d;
                    int n8 = ct2.a[n2];
                    short s2 = ct2.b[n2];
                    if (n4 > this.c().h[0].getWidth()) {
                        n4 = 0;
                    }
                    if (n5 > this.c().h[0].getHeight()) {
                        n5 = 0;
                    }
                    if (n4 + n6 > this.c().h[0].getWidth()) {
                        n6 = this.c().h[0].getWidth() - n4;
                    }
                    if (n5 + n7 > this.c().h[0].getHeight()) {
                        n7 = this.c().h[0].getHeight() - n5;
                    }
                    int n9 = n3 = ct2.d[n2] == 1 ? 2 : 0;
                    if (this.g == 1) {
                        if (n3 == 2) {
                            n3 = 0;
                            n8 += n6;
                        } else {
                            n3 = 2;
                            n8 = -(n8 + n6);
                        }
                    }
                    t2.a(this.c().h[0], n4, n5, n6, n7, n3, this.e + n8, this.f + s2, 0);
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.s);
            return;
        }
    }
}

