/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

public final class cq {
    public Hashtable a = new Hashtable();

    public final Object a(Object object) {
        return this.a.get(object);
    }

    public final boolean equals(Object object) {
        return ((Object)this.a).equals(object);
    }

    public final void a(Object object, Object object2) {
        this.a.put(object, object2);
    }
}

