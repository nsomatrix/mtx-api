/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class bs
implements Runnable {
    private final String a;
    private dh b;

    bs(dh dh2, String string) {
        this.b = dh2;
        this.a = string;
    }

    public final void run() {
        dh.p = false;
        new Thread(new dt()).start();
        this.b.g = true;
        Thread.currentThread().setPriority(1);
        this.b.f = true;
        try {
            String string = this.a;
            Object object = this;
            this.b.e = (SocketConnection)Connector.open((String)string);
            dh.a(((bs)object).b, ((bs)object).b.e.openDataOutputStream());
            ((bs)object).b.c = ((bs)object).b.e.openDataInputStream();
            new Thread(dh.a(((bs)object).b)).start();
            ((bs)object).b.i = new Thread(new dn(((bs)object).b));
            ((bs)object).b.i.start();
            ((bs)object).b.n = System.currentTimeMillis();
            dh.a(((bs)object).b, new ce(-27));
            ((bs)object).b.g = false;
            object = this.b.d;
            System.out.println("Connect ok");
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            if (dh.p) {
                return;
            }
            if (this.b.d != null) {
                this.b.c();
                this.b.d.b();
            }
            return;
        }
    }
}

