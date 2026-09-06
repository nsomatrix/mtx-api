/*
 * Decompiled with CFR 0.152.
 */
public final class r {
    public String a = "";
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public int n;
    public int o;
    public by[] p;

    public r() {
        new aa();
    }

    public final void a(String stringArray) {
        stringArray = at.a((String)stringArray, "\n");
        this.l = "";
        try {
            int n2 = 0;
            while (n2 < stringArray.length) {
                String[] stringArray2 = stringArray[n2].trim();
                if (!stringArray2.equals("")) {
                    try {
                        stringArray2 = at.a((String)stringArray2, ",");
                        String string = stringArray2[0];
                        int n3 = Integer.parseInt(stringArray2[1]);
                        if (n3 == 0) {
                            string = "c0" + string;
                            string = String.valueOf(string) + df.fJ[1] + " " + at.a(stringArray2[2]) + " " + df.fJ[0] + " " + stringArray2[3];
                        } else if (n3 == 1) {
                            string = "c1" + string;
                            string = String.valueOf(string) + " " + df.fJ[2] + " " + at.a(stringArray2[2]) + " " + df.fJ[0] + " " + stringArray2[3];
                        } else if (n3 == 2) {
                            string = "c2" + string;
                            string = String.valueOf(string) + " " + df.fJ[3] + " " + at.a(stringArray2[2]) + " " + df.fJ[0] + " " + stringArray2[3];
                        } else if (n3 == 3) {
                            string = "c1" + string;
                            string = String.valueOf(string) + " " + df.fJ[4] + " " + at.a(stringArray2[2]) + " " + df.fJ[0] + " " + stringArray2[3];
                        } else if (n3 == 4) {
                            string = "c1" + string;
                            string = String.valueOf(string) + df.fJ[5] + " " + at.a(stringArray2[2]) + " " + df.fJ[0] + " " + stringArray2[3];
                        } else if (n3 == 5) {
                            string = "c2" + string;
                            string = String.valueOf(string) + " " + df.fJ[6] + " " + at.a(stringArray2[2]) + " " + df.fJ[0] + " " + stringArray2[3];
                        }
                        this.l = String.valueOf(this.l) + string + "\n";
                    }
                    catch (Exception exception) {}
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

