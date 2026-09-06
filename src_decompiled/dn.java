/*
 * Decompiled with CFR 0.152.
 */
import main.a;

final class dn
implements Runnable {
    private dh a;

    dn(dh dh2) {
        this.a = dh2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block19: {
            try lbl-1000:
            // 4 sources

            {
                while (true) {
                    if (!this.a.b()) break;
                    var1_1 = this;
                    var2_2 = var1_1.a.c.readByte();
                    if (var1_1.a.l) {
                        var2_2 = dh.a(var1_1.a, var2_2);
                    }
                    if (var2_2 == -32) {
                        var2_2 = var1_1.a.c.readByte();
                        if (var1_1.a.l) {
                            var2_2 = dh.a(var1_1.a, var2_2);
                        }
                        var4_5 = dh.a(var1_1.a, var1_1.a.c.readByte());
                        var5_7 = dh.a(var1_1.a, var1_1.a.c.readByte());
                        var6_8 = dh.a(var1_1.a, var1_1.a.c.readByte());
                        var7_10 = dh.a(var1_1.a, var1_1.a.c.readByte());
                        var3_3 = (var4_5 & 255) << 24 | (var5_7 & 255) << 16 | (var6_8 & 255) << 8 | var7_10 & 255;
                    } else if (var1_1.a.l) {
                        var4_6 = var1_1.a.c.readByte();
                        var5_7 = var1_1.a.c.readByte();
                        var3_3 = (dh.a(var1_1.a, var4_6) & 255) << 8 | dh.a(var1_1.a, (byte)var5_7) & 255;
                    } else {
                        var3_3 = var1_1.a.c.readUnsignedShort();
                    }
                    var4_4 = new byte[var3_3];
                    var5_7 = 0;
                    var6_8 = 0;
                    while (true) {
                        block20: {
                            if (var5_7 != -1 && var6_8 < var3_3) break block20;
                            if (!var1_1.a.l) break block19;
                            var7_10 = 0;
                            if (true) ** GOTO lbl54
                        }
                        var5_7 = var1_1.a.c.read(var4_4, var6_8, var3_3 - var6_8);
                        if (var5_7 <= 0) continue;
                        var1_1.a.k += (var6_8 += var5_7) + 5;
                        var7_10 = dh.a().k + dh.a().j;
                        var1_1.a.o = String.valueOf(var7_10 / 1024) + "." + var7_10 % 1024 / 102 + "Kb";
                    }
                    break;
                }
            }
            catch (Exception v0) {}
            if (this.a.f) {
                if (this.a.d != null) {
                    if (System.currentTimeMillis() - this.a.n > 500L) {
                        var1_1 = this.a.d;
                        main.a.k.n();
                    } else {
                        this.a.d.b();
                    }
                }
                if (this.a.e != null) {
                    dh.c(this.a);
                }
            }
            return;
            do {
                var4_4[var7_10] = dh.a(var1_1.a, var4_4[var7_10]);
                ++var7_10;
lbl54:
                // 2 sources

            } while (var7_10 < var4_4.length);
        }
        var7_9 = new ce(var2_2, var4_4);
        var1_1 = var7_9;
        try {
            block21: {
                if (var1_1.a != -27) break block21;
                this.a((ce)var1_1);
                ** GOTO lbl-1000
            }
            this.a.d.a((ce)var1_1);
            ** GOTO lbl-1000
        }
        catch (Exception v1) {
            var1_1 = v1;
            v1.printStackTrace();
            ** continue;
        }
    }

    private void a(ce ce2) {
        int n2 = ce2.b().readByte();
        this.a.m = new byte[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.a.m[n3] = ce2.b().readByte();
            ++n3;
        }
        n3 = 0;
        while (n3 < this.a.m.length - 1) {
            int n4 = n3 + 1;
            this.a.m[n4] = (byte)(this.a.m[n4] ^ this.a.m[n3]);
            ++n3;
        }
        this.a.l = true;
    }
}

