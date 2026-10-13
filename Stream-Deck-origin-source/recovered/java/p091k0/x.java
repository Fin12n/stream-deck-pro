package p091k0;

import p109m0.E;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final E a(y yVar, boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(596174919);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(596174919, i8, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        Boolean boolValueOf = Boolean.valueOf(z8);
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(boolValueOf) | interfaceC3163l.R(yVar);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = c.a(yVar, z8);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        E e8 = (E) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return e8;
    }
}
