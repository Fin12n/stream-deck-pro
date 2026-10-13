package p215z0;

import H0.e;
import H0.f;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: z0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3186x {
    public static final boolean a(InterfaceC3183v0 interfaceC3183v0, AbstractC3180u abstractC3180u) {
        t.e(abstractC3180u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return interfaceC3183v0.containsKey(abstractC3180u);
    }

    public static final Object b(InterfaceC3183v0 interfaceC3183v0, AbstractC3180u abstractC3180u) {
        t.e(abstractC3180u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        q1 q1Var = (q1) interfaceC3183v0.get(abstractC3180u);
        if (q1Var != null) {
            return q1Var.getValue();
        }
        return null;
    }

    public static final Object c(InterfaceC3183v0 interfaceC3183v0, AbstractC3180u abstractC3180u) {
        return a(interfaceC3183v0, abstractC3180u) ? b(interfaceC3183v0, abstractC3180u) : abstractC3180u.a().getValue();
    }

    public static final InterfaceC3183v0 d(C0[] c0Arr, InterfaceC3183v0 interfaceC3183v0, InterfaceC3183v0 interfaceC3183v1) {
        e.a aVarBuilder = f.a().builder();
        for (C0 c8 : c0Arr) {
            AbstractC3180u abstractC3180uB = c8.b();
            t.e(abstractC3180uB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            B0 b8 = (B0) abstractC3180uB;
            if (c8.a() || !a(interfaceC3183v0, b8)) {
                aVarBuilder.put(b8, b8.b(c8.c(), (q1) interfaceC3183v1.get(b8)));
            }
        }
        return aVarBuilder.build();
    }

    public static /* synthetic */ InterfaceC3183v0 e(C0[] c0Arr, InterfaceC3183v0 interfaceC3183v0, InterfaceC3183v0 interfaceC3183v1, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            interfaceC3183v1 = f.a();
        }
        return d(c0Arr, interfaceC3183v0, interfaceC3183v1);
    }
}
