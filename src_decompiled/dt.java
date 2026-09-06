/*
 * Decompiled with CFR 0.152.
 */
final class dt
implements Runnable {
    dt() {
    }

    public final void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException interruptedException) {}
        if (dh.a.g) {
            try {
                dh.a.e.close();
            }
            catch (Exception exception) {}
            dh.p = true;
            dh.a.g = false;
            dh.a.f = false;
            dh.a.d.b();
        }
    }
}

