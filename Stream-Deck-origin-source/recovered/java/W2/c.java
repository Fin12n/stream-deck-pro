package W2;

import S2.g;
import S2.h;
import java.util.List;
import kotlin.jvm.internal.t;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10830a = new b();

    public static final List a(T2.a screen, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(screen, "screen");
        interfaceC3163l.f(2046230470);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(2046230470, i8, -1, "cafe.adriel.voyager.navigator.internal.getNavigatorScreenLifecycleProvider (LifecycleProvider.kt:16)");
        }
        h hVar = (h) interfaceC3163l.e(g.a());
        if (hVar == null) {
            hVar = f10830a;
        }
        String key = screen.getKey();
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(key);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = hVar.a(screen);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        List list = (List) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return list;
    }
}
