/*
 * Decompiled with CFR 0.152.
 */
public final class dm {
    public static cq a = new cq();
    public static cq b = new cq();
    public static cq c = new cq();
    public static cq d = new cq();
    public static cq e = new cq();
    public static cq f = new cq();
    private static cq l = new cq();
    public cq g = new cq();
    public static cq h = new cq();
    public int i = 0;
    public int j = 0;
    public int k;

    public static void a(ce ce2) {
        try {
            dm dm2;
            short s2;
            int n2;
            short s3;
            Object object;
            int n3;
            short s4;
            int n4;
            cq cq2 = c;
            cq2.a.clear();
            cq2 = a;
            cq2.a.clear();
            cq2 = b;
            cq2.a.clear();
            cq2 = f;
            cq2.a.clear();
            cq2 = d;
            cq2.a.clear();
            cq2 = e;
            cq2.a.clear();
            cq2 = h;
            cq2.a.clear();
            int n5 = ce2.b().readUnsignedByte();
            int n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readByte();
                s4 = ce2.b().readShort();
                n3 = ce2.b().readShort();
                object = new dm();
                new dm().k = n3;
                n3 = 0;
                while (n3 < n4 - 2) {
                    s3 = ce2.b().readShort();
                    n2 = ce2.b().readShort();
                    s2 = ce2.b().readShort();
                    dm2 = new dm();
                    new dm().i = n2;
                    dm2.j = s2;
                    ((dm)object).g.a(String.valueOf(s3), dm2);
                    n3 += 3;
                }
                a.a(String.valueOf(s4), object);
                ++n6;
            }
            n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readByte();
                s4 = ce2.b().readShort();
                n3 = ce2.b().readShort();
                object = new dm();
                new dm().k = n3;
                n3 = 0;
                while (n3 < n4 - 2) {
                    s3 = ce2.b().readShort();
                    n2 = ce2.b().readShort();
                    s2 = ce2.b().readShort();
                    dm2 = new dm();
                    new dm().i = n2;
                    dm2.j = s2;
                    ((dm)object).g.a(String.valueOf(s3), dm2);
                    n3 += 3;
                }
                b.a(String.valueOf(s4), object);
                ++n6;
            }
            n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readByte();
                s4 = ce2.b().readShort();
                n3 = ce2.b().readShort();
                object = new dm();
                new dm().k = n3;
                n3 = 0;
                while (n3 < n4 - 2) {
                    s3 = ce2.b().readShort();
                    n2 = ce2.b().readShort();
                    s2 = ce2.b().readShort();
                    dm2 = new dm();
                    new dm().i = n2;
                    dm2.j = s2;
                    ((dm)object).g.a(String.valueOf(s3), dm2);
                    n3 += 3;
                }
                c.a(String.valueOf(s4), object);
                ++n6;
            }
            n5 = ce2.b().readUnsignedByte();
            n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readShort();
                s4 = ce2.b().readShort();
                dm dm3 = new dm();
                new dm().k = s4;
                l.a(String.valueOf(n4), dm3);
                n6 += 2;
            }
            n5 = ce2.b().readUnsignedByte();
            n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readByte();
                s4 = ce2.b().readShort();
                int n7 = ce2.b().readShort();
                object = new dm();
                new dm().k = n7;
                n7 = 0;
                while (n7 < n4 - 2) {
                    s3 = ce2.b().readShort();
                    n2 = ce2.b().readShort();
                    s2 = ce2.b().readShort();
                    dm2 = new dm();
                    new dm().i = n2;
                    dm2.j = s2;
                    ((dm)object).g.a(String.valueOf(s3), dm2);
                    n7 += 3;
                }
                d.a(String.valueOf(s4), object);
                ++n6;
            }
            n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readByte();
                s4 = ce2.b().readShort();
                int n8 = ce2.b().readShort();
                object = new dm();
                new dm().k = n8;
                n8 = 0;
                while (n8 < n4 - 2) {
                    s3 = ce2.b().readShort();
                    n2 = ce2.b().readShort();
                    s2 = ce2.b().readShort();
                    dm2 = new dm();
                    new dm().i = n2;
                    dm2.j = s2;
                    ((dm)object).g.a(String.valueOf(s3), dm2);
                    n8 += 3;
                }
                e.a(String.valueOf(s4), object);
                ++n6;
            }
            n6 = 0;
            while (n6 < n5) {
                n4 = ce2.b().readByte();
                s4 = ce2.b().readShort();
                int n9 = ce2.b().readShort();
                object = new dm();
                new dm().k = n9;
                n9 = 0;
                while (n9 < n4 - 2) {
                    s3 = ce2.b().readShort();
                    n2 = ce2.b().readShort();
                    s2 = ce2.b().readShort();
                    dm2 = new dm();
                    new dm().i = n2;
                    dm2.j = s2;
                    ((dm)object).g.a(String.valueOf(s3), dm2);
                    n9 += 3;
                }
                f.a(String.valueOf(s4), object);
                ++n6;
            }
            n6 = ce2.b().readByte();
            n4 = 0;
            while (n4 < n6) {
                s4 = ce2.b().readShort();
                object = new int[6][];
                int n10 = 0;
                while (n10 < 6) {
                    s3 = ce2.b().readByte();
                    object[n10] = new int[s3];
                    n2 = 0;
                    while (n2 < s3) {
                        object[n10][n2] = ce2.b().readShort();
                        ++n2;
                    }
                    ++n10;
                }
                h.a(String.valueOf(s4), object);
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

