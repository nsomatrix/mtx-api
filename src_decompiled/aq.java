/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class aq
implements Runnable {
    final dh a;

    public aq(dh dh2) {
        this.a = dh2;
        dh.a(dh2, new aa());
    }

    public final void run() {
        while (this.a.f) {
            Object object;
            try {
                if (this.a.l) {
                    while (dh.b(this.a).size() > 0) {
                        dg.n();
                        object = (ce)dh.b(this.a).elementAt(0);
                        dh.b(this.a).removeElementAt(0);
                        dh.a(this.a, (ce)object);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException interruptedException) {}
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
        }
    }
}

