package H0;

import Z.JTT.ryTuoS;
import kotlin.jvm.internal.t;
import p215z0.D0;
import p215z0.E0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final int a(int i8, int i9) {
        return i8 << (((i9 % 10) * 3) + 1);
    }

    public static final a b(InterfaceC3163l interfaceC3163l, int i8, boolean z8, Object obj) {
        b bVar;
        interfaceC3163l.f(Integer.rotateLeft(i8, 1));
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            bVar = new b(i8, z8, obj);
            interfaceC3163l.H(bVar);
        } else {
            t.e(objG, ryTuoS.cQICSfUBp);
            bVar = (b) objG;
            bVar.l(obj);
        }
        interfaceC3163l.N();
        return bVar;
    }

    public static final a c(int i8, boolean z8, Object obj) {
        return new b(i8, z8, obj);
    }

    public static final int d(int i8) {
        return a(2, i8);
    }

    public static final boolean e(D0 d8, D0 d9) {
        if (d8 == null) {
            return true;
        }
        if (!(d8 instanceof E0) || !(d9 instanceof E0)) {
            return false;
        }
        E0 e8 = (E0) d8;
        return !e8.s() || t.c(d8, d9) || t.c(e8.j(), ((E0) d9).j());
    }

    public static final int f(int i8) {
        return a(1, i8);
    }
}
