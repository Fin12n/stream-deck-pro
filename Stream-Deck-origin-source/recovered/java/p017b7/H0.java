package p017b7;

import p062g7.AbstractC2376o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H0 extends F {
    @Override // p017b7.F
    public F k1(int i8) {
        AbstractC2376o.a(i8);
        return this;
    }

    public abstract H0 o1();

    public final String q1() {
        H0 h0O1;
        H0 h0C = Z.c();
        if (this == h0C) {
            return "Dispatchers.Main";
        }
        try {
            h0O1 = h0C.o1();
        } catch (UnsupportedOperationException unused) {
            h0O1 = null;
        }
        if (this == h0O1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p017b7.F
    public String toString() {
        String strQ1 = q1();
        if (strQ1 != null) {
            return strQ1;
        }
        return N.a(this) + '@' + N.b(this);
    }
}
