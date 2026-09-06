/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;

final class bb
implements CommandListener {
    private ad a;
    private final TextBox b;

    bb(ad ad2, TextBox textBox) {
        this.a = ad2;
        this.b = textBox;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals(df.ax)) {
            this.a.a(this.b.getString());
        }
        Display.getDisplay((MIDlet)ad.j).setCurrent((Displayable)ad.i);
        ad.i.setFullScreenMode(true);
    }
}

