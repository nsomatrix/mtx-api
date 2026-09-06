/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.wireless.messaging.Message
 *  javax.wireless.messaging.MessageConnection
 *  javax.wireless.messaging.TextMessage
 */
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class du
implements Runnable {
    private final String a;
    private final String b;
    private final String c;
    private final bd d;
    private final bd e;

    du(String string, String string2, String string3, bd bd2, bd bd3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = bd2;
        this.e = bd3;
    }

    public final void run() {
        try {
            MessageConnection messageConnection = null;
            messageConnection = (MessageConnection)Connector.open((String)this.a);
            TextMessage textMessage = (TextMessage)messageConnection.newMessage("text");
            textMessage.setAddress(this.a);
            textMessage.setPayloadText(this.b);
            messageConnection.send((Message)textMessage);
            System.out.println("SMS data: " + this.b + ", to: " + this.c);
            this.d.a();
            return;
        }
        catch (Exception exception) {
            this.e.a();
            return;
        }
    }
}

