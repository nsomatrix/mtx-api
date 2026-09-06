/*
 * Decompiled with CFR 0.152.
 */
public final class da {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ce object) {
        try {
            byte by2 = ((ce)object).b().readByte();
            switch (by2) {
                case 0: {
                    Object object2 = object;
                    try {
                        object = null;
                        int n2 = ((ce)object2).b().readInt();
                        object = bp.d().p == n2 ? bp.d() : dg.e(n2);
                        if (object == null) {
                            return;
                        }
                        ((bp)object).aF = new by[5];
                        int n3 = 0;
                        while (true) {
                            if (n3 >= ((bp)object).aF.length) {
                                return;
                            }
                            short s2 = ((ce)object2).b().readShort();
                            if (s2 > -1) {
                                ((bp)object).aF[n3] = new by();
                                ((bp)object).aF[n3].e = n3;
                                ((bp)object).aF[n3].o = 51;
                                ((bp)object).aF[n3].b = e.a(s2);
                                ((bp)object).aF[n3].j = ((ce)object2).b().readByte();
                                ((bp)object).aF[n3].g = ((ce)object2).b().readLong();
                                ((bp)object).aF[n3].i = ((ce)object2).b().readByte();
                                int n4 = ((ce)object2).b().readByte();
                                ((bp)object).aF[n3].c = new aa();
                                int n5 = 0;
                                while (n5 < n4) {
                                    ((bp)object).aF[n3].c.addElement(new cg(((ce)object2).b().readUnsignedByte(), ((ce)object2).b().readInt()));
                                    ++n5;
                                }
                            }
                            ++n3;
                        }
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                case 1: {
                    Object object2 = object;
                    try {
                        object = null;
                        int n6 = ((ce)object2).b().readInt();
                        object = bp.d().p == n6 ? bp.d() : dg.e(n6);
                        if (object == null) {
                            return;
                        }
                        short s3 = ((ce)object2).b().readShort();
                        byte by3 = ((ce)object2).b().readByte();
                        if (s3 <= 0) {
                            ((bp)object).aT = null;
                            return;
                        }
                        short s4 = (short)((bp)object).i;
                        short s5 = (short)(((bp)object).j - 40);
                        ((bp)object).aT = new ci(-1, false, false, false, false, false, s3, 1, 0, 0, 0, s4, s5, 4, 0, by3 != 0, false);
                        ((bp)object).aT.h = 5;
                        return;
                    }
                    catch (Exception exception) {
                        object = exception;
                        exception.printStackTrace();
                        return;
                    }
                }
                case 2: {
                    Object object2;
                    try {
                        s s6;
                        short s7 = ((ce)object).b().readShort();
                        String string = ((ce)object).b().readUTF();
                        int n7 = ((ce)object).b().readInt();
                        short s8 = ((ce)object).b().readShort();
                        byte by4 = ((ce)object).b().readByte();
                        if (n7 < 0) return;
                        int n8 = s7;
                        int n9 = 0;
                        while (true) {
                            if (n9 >= dg.x.size()) {
                                s6 = null;
                                break;
                            }
                            s s9 = (s)dg.x.elementAt(n9);
                            if (s9 != null && s9.d == n8) {
                                s6 = s9;
                                break;
                            }
                            ++n9;
                        }
                        object2 = s6;
                        n8 = n7;
                        if (object2 == null) {
                            object2 = new s(s7, s8, n8, string, by4);
                            dg.x.addElement(object2);
                        }
                        if (object2 == null) return;
                        ((s)object2).b = string;
                        ((s)object2).e = s8;
                        long l2 = n8;
                        Object object3 = object2;
                        ((s)object2).a = System.currentTimeMillis() + l2 * 1000L;
                        if (by4 != -2) return;
                        ((s)object2).c = true;
                        return;
                    }
                    catch (Exception exception) {}
                    return;
                }
            }
            return;
        }
        catch (Exception exception) {}
    }
}

