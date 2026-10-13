package p109m0;

import A1.t;
import L0.i;
import p055g0.B;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: m0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2673k {
    public static final i b(i iVar, InterfaceC2674l interfaceC2674l, C2671i c2671i, boolean z8, t tVar, B b8, boolean z9, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1331498025);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1331498025, i8, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z9) {
            Object[] objArr = {interfaceC2674l, c2671i, Boolean.valueOf(z8), tVar, b8};
            interfaceC3163l.f(-568225417);
            boolean zR = false;
            for (int i9 = 0; i9 < 5; i9++) {
                zR |= interfaceC3163l.R(objArr[i9]);
            }
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                C2672j c2672j = new C2672j(interfaceC2674l, c2671i, z8, tVar, b8);
                interfaceC3163l.H(c2672j);
                objG = c2672j;
            }
            interfaceC3163l.N();
            iVar = iVar.j((i) objG);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iVar;
    }

    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
