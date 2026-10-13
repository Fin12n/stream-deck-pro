package p055g0;

import A1.t;
import p028d0.E;
import p037e0.InterfaceC2227x;
import p046f0.AbstractC2274b;
import p046f0.S;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f22820a = new J();

    public final InterfaceC2329j a() {
        return InterfaceC2329j.f23142a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w b(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1107739818);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1107739818, i8, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:538)");
        }
        InterfaceC2227x interfaceC2227xB = E.b(interfaceC3163l, 0);
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(interfaceC2227xB);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new C2332m(interfaceC2227xB, null, 2, 0 == true ? 1 : 0);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        C2332m c2332m = (C2332m) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c2332m;
    }

    public final S c(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1809802212);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1809802212, i8, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:551)");
        }
        S sB = AbstractC2274b.b(interfaceC3163l, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return sB;
    }

    public final boolean d(t tVar, B b8, boolean z8) {
        return (tVar != t.Rtl || b8 == B.Vertical) ? !z8 : z8;
    }
}
