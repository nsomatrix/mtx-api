/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import main.a;

public final class am {
    private static short[] a;
    private static short[] b;
    private static int[] c;
    private static Random d;

    static {
        short[] sArray = new short[91];
        sArray[1] = 18;
        sArray[2] = 36;
        sArray[3] = 54;
        sArray[4] = 71;
        sArray[5] = 89;
        sArray[6] = 107;
        sArray[7] = 125;
        sArray[8] = 143;
        sArray[9] = 160;
        sArray[10] = 178;
        sArray[11] = 195;
        sArray[12] = 213;
        sArray[13] = 230;
        sArray[14] = 248;
        sArray[15] = 265;
        sArray[16] = 282;
        sArray[17] = 299;
        sArray[18] = 316;
        sArray[19] = 333;
        sArray[20] = 350;
        sArray[21] = 367;
        sArray[22] = 384;
        sArray[23] = 400;
        sArray[24] = 416;
        sArray[25] = 433;
        sArray[26] = 449;
        sArray[27] = 465;
        sArray[28] = 481;
        sArray[29] = 496;
        sArray[30] = 512;
        sArray[31] = 527;
        sArray[32] = 543;
        sArray[33] = 558;
        sArray[34] = 573;
        sArray[35] = 587;
        sArray[36] = 602;
        sArray[37] = 616;
        sArray[38] = 630;
        sArray[39] = 644;
        sArray[40] = 658;
        sArray[41] = 672;
        sArray[42] = 685;
        sArray[43] = 698;
        sArray[44] = 711;
        sArray[45] = 724;
        sArray[46] = 737;
        sArray[47] = 749;
        sArray[48] = 761;
        sArray[49] = 773;
        sArray[50] = 784;
        sArray[51] = 796;
        sArray[52] = 807;
        sArray[53] = 818;
        sArray[54] = 828;
        sArray[55] = 839;
        sArray[56] = 849;
        sArray[57] = 859;
        sArray[58] = 868;
        sArray[59] = 878;
        sArray[60] = 887;
        sArray[61] = 896;
        sArray[62] = 904;
        sArray[63] = 912;
        sArray[64] = 920;
        sArray[65] = 928;
        sArray[66] = 935;
        sArray[67] = 943;
        sArray[68] = 949;
        sArray[69] = 956;
        sArray[70] = 962;
        sArray[71] = 968;
        sArray[72] = 974;
        sArray[73] = 979;
        sArray[74] = 984;
        sArray[75] = 989;
        sArray[76] = 994;
        sArray[77] = 998;
        sArray[78] = 1002;
        sArray[79] = 1005;
        sArray[80] = 1008;
        sArray[81] = 1011;
        sArray[82] = 1014;
        sArray[83] = 1016;
        sArray[84] = 1018;
        sArray[85] = 1020;
        sArray[86] = 1022;
        sArray[87] = 1023;
        sArray[88] = 1023;
        sArray[89] = 1024;
        sArray[90] = 1024;
        a = sArray;
        d = new Random();
    }

    public static void a() {
        b = new short[91];
        c = new int[91];
        int n2 = 0;
        while (n2 <= 90) {
            am.b[n2] = a[90 - n2];
            am.c[n2] = b[n2] == 0 ? Integer.MAX_VALUE : (a[n2] << 10) / b[n2];
            ++n2;
        }
    }

    public static final int a(int n2) {
        if ((n2 = am.c(n2)) >= 0 && n2 < 90) {
            return a[n2];
        }
        if (n2 >= 90 && n2 < 180) {
            return a[180 - n2];
        }
        if (n2 >= 180 && n2 < 270) {
            return -a[n2 - 180];
        }
        return -a[360 - n2];
    }

    public static final int b(int n2) {
        if ((n2 = am.c(n2)) >= 0 && n2 < 90) {
            return b[n2];
        }
        if (n2 >= 90 && n2 < 180) {
            return -b[180 - n2];
        }
        if (n2 >= 180 && n2 < 270) {
            return -b[n2 - 180];
        }
        return b[360 - n2];
    }

    public static final int a(int n2, int n3) {
        int n4;
        block6: {
            int n5;
            block7: {
                block5: {
                    block4: {
                        int n6;
                        if (n2 == 0) break block5;
                        n4 = Math.abs((n3 << 10) / n2);
                        int n7 = 0;
                        while (n7 <= 90) {
                            if (c[n7] >= n4) {
                                n6 = n7;
                                break block4;
                            }
                            ++n7;
                        }
                        n6 = n4 = 0;
                    }
                    if (n3 >= 0 && n2 < 0) {
                        n4 = 180 - n4;
                    }
                    if (n3 < 0 && n2 < 0) {
                        n4 += 180;
                    }
                    if (n3 >= 0 || n2 < 0) break block6;
                    n5 = 360 - n4;
                    break block7;
                }
                n5 = n3 > 0 ? 90 : 270;
            }
            n4 = n5;
        }
        return n4;
    }

    public static final int c(int n2) {
        if (n2 >= 360) {
            n2 -= 360;
        }
        if (n2 < 0) {
            n2 += 360;
        }
        return n2;
    }

    public static int b(int n2, int n3) {
        return am.b(am.c(n2)) * n3 >> 10;
    }

    public static int c(int n2, int n3) {
        return am.a(am.c(n2)) * n3 >> 10;
    }

    public static int d(int n2, int n3) {
        return n2 + d.nextInt(n3 - n2);
    }

    public static int a(int n2, int n3, int n4, int n5) {
        if ((n2 = (n2 - n4) * (n2 - n4) + (n3 - n5) * (n3 - n5)) <= 0) {
            return 0;
        }
        n3 = (n2 + 1) / 2;
        while (Math.abs((n4 = n3) - (n3 = n3 / 2 + n2 / (n3 * 2))) > 1) {
        }
        return n3;
    }

    public static int d(int n2) {
        return d.nextInt(n2);
    }

    public static int e(int n2) {
        if (n2 > 0) {
            return n2;
        }
        return -n2;
    }

    public static void a(t t2) {
        t2.a(-t2.a(), -t2.b());
        t2.d(0, 0, main.a.A, main.a.B);
    }

    public static String[] a(String string, String stringArray, int n2) {
        int n3 = string.indexOf((String)stringArray);
        if (n3 >= 0) {
            stringArray = am.a(string.substring(n3 + stringArray.length()), (String)stringArray, n2 + 1);
        } else {
            stringArray = new String[n2 + 1];
            n3 = string.length();
        }
        stringArray[n2] = string.substring(0, n3);
        return stringArray;
    }

    public static String a(long l2, int n2) {
        String string;
        block10: {
            String string2;
            block9: {
                long l3;
                block13: {
                    long l4;
                    block16: {
                        block14: {
                            block15: {
                                block11: {
                                    long l5;
                                    block12: {
                                        block7: {
                                            long l6;
                                            block8: {
                                                string = "";
                                                long l7 = (l2 + (long)n2 - System.currentTimeMillis()) / 1000L;
                                                if (l7 <= 0L) {
                                                    return "";
                                                }
                                                l6 = 0L;
                                                l5 = 0L;
                                                l4 = l7 / 60L;
                                                l3 = l7;
                                                if (l7 >= 86400L) {
                                                    l6 = l7 / 86400L;
                                                    l5 = l7 % 86400L / 3600L;
                                                } else if (l7 >= 3600L) {
                                                    l5 = l7 / 3600L;
                                                    l4 = l7 % 3600L / 60L;
                                                } else if (l7 >= 60L) {
                                                    l4 = l7 / 60L;
                                                    l3 = l7 % 60L;
                                                } else {
                                                    l3 = l7;
                                                }
                                                if (l6 <= 0L) break block7;
                                                if (l6 < 10L) break block8;
                                                string2 = l5 < 1L ? String.valueOf(l6) + "d" : (l5 < 10L ? String.valueOf(l6) + "d" + "0" + l5 + "h" : String.valueOf(l6) + "d" + l5 + "h");
                                                break block9;
                                            }
                                            if (l6 >= 10L) break block10;
                                            string2 = l5 < 1L ? String.valueOf(l6) + "d" : (l5 < 10L ? String.valueOf(l6) + "d" + "0" + l5 + "h" : String.valueOf(l6) + "d" + l5 + "h");
                                            break block9;
                                        }
                                        if (l5 <= 0L) break block11;
                                        if (l5 < 10L) break block12;
                                        string2 = l4 < 1L ? String.valueOf(l5) + "h" : (l4 < 10L ? String.valueOf(l5) + "h" + "0" + l4 + "m" : String.valueOf(l5) + "h" + l4 + "m");
                                        break block9;
                                    }
                                    if (l5 >= 10L) break block10;
                                    string2 = l4 < 1L ? String.valueOf(l5) + "h" : (l4 < 10L ? String.valueOf(l5) + "h" + "0" + l4 + "m" : String.valueOf(l5) + "h" + l4 + "m");
                                    break block9;
                                }
                                if (l4 <= 0L) break block13;
                                if (l4 < 10L) break block14;
                                if (l3 < 10L) break block15;
                                string2 = String.valueOf(l4) + "m" + l3 + "s";
                                break block9;
                            }
                            if (l3 >= 10L) break block10;
                            string2 = String.valueOf(l4) + "m" + "0" + l3 + "s";
                            break block9;
                        }
                        if (l4 >= 10L) break block10;
                        if (l3 < 10L) break block16;
                        string2 = String.valueOf(l4) + "m" + l3 + "s";
                        break block9;
                    }
                    if (l3 >= 10L) break block10;
                    string2 = String.valueOf(l4) + "m" + "0" + l3 + "s";
                    break block9;
                }
                string2 = l3 < 10L ? "0" + l3 + "s" : String.valueOf(l3) + "s";
            }
            string = string2;
        }
        return string;
    }
}

