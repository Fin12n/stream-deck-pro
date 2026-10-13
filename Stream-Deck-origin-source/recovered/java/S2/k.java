package S2;

import kotlin.jvm.internal.t;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final l a(T2.a screen, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(screen, "screen");
        interfaceC3163l.f(1014940995);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1014940995, i8, -1, "cafe.adriel.voyager.core.lifecycle.rememberScreenLifecycleOwner (ScreenLifecycle.kt:59)");
        }
        String key = screen.getKey();
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(key);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = c.f9692a;
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        l lVar = (l) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return lVar;
    }
}
