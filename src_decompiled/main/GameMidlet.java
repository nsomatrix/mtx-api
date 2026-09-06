/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.a;
import main.b;

public class GameMidlet
extends MIDlet {
    public static byte a = 1;
    public static byte b = 0;
    public static int c = 14444;
    public static String d = "";
    public static byte e = 0;
    public static String f;
    private static a r;
    public static GameMidlet g;
    public static byte h;
    public static boolean i;
    public static String j;
    public static String k;
    private static String s;
    private static String t;
    public static String[] l;
    public static String[] m;
    public static short[] n;
    public static byte[] o;
    public static byte[] p;
    public static byte[] q;

    static {
        h = 0;
        i = true;
        j = "";
        k = "";
        s = "Tone:112.213.94.205:14444:0:0,Bokken:112.213.84.18:14444:0:0,Shuriken:27.0.14.73:14444:0:0,Tessen:27.0.14.73:14444:1:0,Kunai:112.213.94.135:14444:0:0,Katana:112.213.94.161:14444:0:0,Global-1:52.221.222.194:14444:0:1";
        t = "Tone:nj5.teamobi.com:14444:0:0,Bokken:nj1.teamobi.com:14444:0:0,Shuriken:nj2.teamobi.com:14444:0:0,Tessen:nj2.teamobi.com:14444:1:0,Kunai:nj4.teamobi.com:14444:0:0,Katana:nj3.teamobi.com:14444:0:0,Global-1:nj6.teamobi.com:14444:0:1";
    }

    public GameMidlet() {
        main.b.a = new b();
        dh.a().a(an.a());
        g = this;
        r = new a();
        r.c();
        f = this.b("agent.txt");
        e = Byte.parseByte(this.b("provider.txt"));
        System.out.println("AGENT: " + f + ", PROVIDER: " + e);
        cj.a = 0;
        main.a.E = new cj();
    }

    protected void destroyApp(boolean bl2) {
    }

    protected void pauseApp() {
    }

    protected void startApp() {
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)main.b.a);
    }

    public final void a() {
        main.a.m = false;
        System.gc();
        this.notifyDestroyed();
    }

    public static void a(String object) {
        if (object.equals("")) {
            return;
        }
        try {
            g.platformRequest((String)object);
            g.notifyDestroyed();
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            object = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    private String b(String object) {
        Object object2;
        object = ((Object)object2).getClass().getResourceAsStream("/" + (String)object);
        try {
            object2 = new byte[((InputStream)object).available()];
            ((InputStream)object).read((byte[])object2);
            object2 = new String((byte[])object2, "UTF-8");
        }
        catch (Exception exception) {
            object2 = "";
        }
        return object2;
    }

    public final void b() {
        dq.a().J();
    }

    private static void g() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(l.length);
            int n2 = 0;
            while (n2 < l.length) {
                dataOutputStream.writeUTF(l[n2]);
                dataOutputStream.writeUTF(m[n2]);
                dataOutputStream.writeShort(n[n2]);
                dataOutputStream.writeByte(o[n2]);
                dataOutputStream.writeByte(p[n2]);
                dataOutputStream.writeByte(q[n2]);
                ++n2;
            }
            w.a("NJlink", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            co.b();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void c() {
        Object object = null;
        object = a == 1 ? GameMidlet.c("http://teamobi.com/srvips/NJVI.txt") : GameMidlet.c("http://teamobi.com/srvips/NJEN.txt");
        try {
            if (object.equals("")) {
                object = a == 1 ? s : t;
            }
            object = am.a(object.trim(), ",", 0);
            l = new String[((String[])object).length];
            m = new String[((String[])object).length];
            n = new short[((String[])object).length];
            o = new byte[((String[])object).length];
            p = new byte[((String[])object).length];
            q = new byte[((String[])object).length];
            byte by2 = 0;
            byte by3 = 0;
            int n2 = 0;
            while (n2 < ((String[])object).length) {
                String[] stringArray = am.a(object[n2].trim(), ":", 0);
                GameMidlet.l[n2] = stringArray[0];
                GameMidlet.m[n2] = stringArray[1];
                GameMidlet.n[n2] = Short.parseShort(stringArray[2]);
                GameMidlet.o[n2] = Byte.parseByte(stringArray[3]);
                GameMidlet.p[n2] = Byte.parseByte(stringArray[4]);
                if (p[n2] == 0) {
                    GameMidlet.q[n2] = by2;
                    by2 = (byte)(by2 + 1);
                } else if (p[n2] == 1) {
                    GameMidlet.q[n2] = by3;
                    by3 = (byte)(by3 + 1);
                }
                ++n2;
            }
            GameMidlet.g();
            return;
        }
        catch (Exception exception) {
            l = new String[]{"Sensha (New)", "Sanzu", "Tone", "Bokken", "Shuriken", "Tessen", "Kunai", "Katana", "Hirosaki", "Haruna (NEW)"};
            m = new String[]{"27.0.12.11", "112.213.84.83", "112.213.94.205", "112.213.84.18", "27.0.14.73", "27.0.14.73", "112.213.94.135", "112.213.94.161", "52.221.222.194", "54.255.61.194", "54.151.133.77"};
            n = new short[]{14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444};
            byte[] byArray = new byte[10];
            byArray[5] = 1;
            o = byArray;
            byte[] byArray2 = new byte[10];
            byArray2[8] = 1;
            byArray2[9] = 1;
            p = byArray2;
            byte[] byArray3 = new byte[10];
            byArray3[1] = 1;
            byArray3[2] = 2;
            byArray3[3] = 3;
            byArray3[4] = 4;
            byArray3[5] = 5;
            byArray3[6] = 6;
            byArray3[7] = 7;
            byArray3[9] = 1;
            q = byArray3;
            GameMidlet.g();
            return;
        }
    }

    public static void d() {
        Object object = w.a("NJlink");
        if (object == null) {
            GameMidlet.c();
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            int n2 = object.readByte();
            l = new String[n2];
            m = new String[n2];
            n = new short[n2];
            o = new byte[n2];
            p = new byte[n2];
            q = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                GameMidlet.l[n3] = object.readUTF();
                GameMidlet.m[n3] = object.readUTF();
                GameMidlet.n[n3] = object.readShort();
                GameMidlet.o[n3] = object.readByte();
                GameMidlet.p[n3] = object.readByte();
                GameMidlet.q[n3] = object.readByte();
                ++n3;
            }
            object.close();
            co.b();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static int e() {
        byte by2 = 0;
        if (i) {
            by2 = 1;
        }
        int n2 = 0;
        while (n2 <= p.length - 1) {
            if (p[n2] == by2) {
                return n2;
            }
            ++n2;
        }
        return 0;
    }

    public static int f() {
        int n2 = 0;
        while (n2 <= p.length - 1) {
            if (p[n2] == 1) {
                return n2 - 1;
            }
            ++n2;
        }
        return 0;
    }

    private static String c(String string) {
        Object object = null;
        object = null;
        String string2 = "";
        try {
            object = (HttpConnection)Connector.open((String)string);
            int n2 = object.getResponseCode();
            if (n2 != 200) {
                throw new IOException(object.getResponseMessage());
            }
            object = object.openInputStream();
            new InputStreamReader((InputStream)object, "utf-8");
            while ((n2 = ((InputStream)object).read()) != -1) {
                string2 = String.valueOf(string2) + (char)n2;
            }
        }
        catch (Exception exception) {
            string2 = null;
        }
        return string2;
    }
}

