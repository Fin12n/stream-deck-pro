package S2;

import kotlin.jvm.internal.t;
import p215z0.AbstractC3169o;
import p215z0.I;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f9696a = new I();

    public static final void a(Object obj, Q6.k effect, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(effect, "effect");
        interfaceC3163l.f(1961347382);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1961347382, i8, -1, "cafe.adriel.voyager.core.lifecycle.DisposableEffectIgnoringConfiguration (DisposableEffect.kt:14)");
        }
        a aVarC = b.c(interfaceC3163l, 0);
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(obj) | interfaceC3163l.R(aVarC);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163l.H(new d(aVarC, effect));
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }
}
