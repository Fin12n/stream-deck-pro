package p091k0;

import p109m0.InterfaceC2674l;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final InterfaceC2674l a(y yVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
        interfaceC3163l.f(-1877443446);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1877443446, i9, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        Integer numValueOf = Integer.valueOf(i8);
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(numValueOf) | interfaceC3163l.R(yVar);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new f(yVar, i8);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        f fVar = (f) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return fVar;
    }
}
