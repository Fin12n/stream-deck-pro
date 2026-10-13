package p191w0;

import R0.C1598l0;
import R0.T0;
import io.sentry.exception.uXy.SZCvugJaXc;
import p046f0.AbstractC2281i;
import p046f0.C2280h;
import p207y0.i;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f35388a = new K();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f35389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f35390c;

    static {
        i iVar = i.f37822a;
        f35389b = iVar.a();
        f35390c = iVar.p();
    }

    public final C2280h a(boolean z8, boolean z9, long j8, long j9, long j10, long j11, float f8, float f9, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1138342447);
        long jI = (i9 & 4) != 0 ? AbstractC3091w.i(i.f37822a.n(), interfaceC3163l, 6) : j8;
        long jD = (i9 & 8) != 0 ? C1598l0.f9405b.d() : j9;
        long jO = (i9 & 16) != 0 ? C1598l0.o(AbstractC3091w.i(i.f37822a.h(), interfaceC3163l, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jD2 = (i9 & 32) != 0 ? C1598l0.f9405b.d() : j11;
        float fO = (i9 & 64) != 0 ? i.f37822a.o() : f8;
        float fL = (i9 & 128) != 0 ? i.f37822a.l() : f9;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1138342447, i8, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1331)");
        }
        if (!z8) {
            jI = z9 ? jD2 : jO;
        } else if (z9) {
            jI = jD;
        }
        if (z9) {
            fO = fL;
        }
        C2280h c2280hA = AbstractC2281i.a(fO, jI);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c2280hA;
    }

    public final C3092w0 c(float f8, float f9, float f10, float f11, float f12, float f13, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-757972185);
        if ((i9 & 1) != 0) {
            f8 = i.f37822a.f();
        }
        float f14 = f8;
        if ((i9 & 2) != 0) {
            f9 = i.f37822a.m();
        }
        float f15 = f9;
        if ((i9 & 4) != 0) {
            f10 = i.f37822a.j();
        }
        float f16 = f10;
        if ((i9 & 8) != 0) {
            f11 = i.f37822a.k();
        }
        float f17 = f11;
        float fE = (i9 & 16) != 0 ? i.f37822a.e() : f12;
        float f18 = (i9 & 32) != 0 ? f14 : f13;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-757972185, i8, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1294)");
        }
        C3092w0 c3092w0 = new C3092w0(f14, f15, f16, f17, fE, f18, null);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3092w0;
    }

    public final C3090v0 d(C3089v c3089v) {
        C3090v0 c3090v0E = c3089v.e();
        if (c3090v0E != null) {
            return c3090v0E;
        }
        C1598l0.a aVar = C1598l0.f9405b;
        long jD = aVar.d();
        i iVar = i.f37822a;
        C3090v0 c3090v0 = new C3090v0(jD, AbstractC3091w.f(c3089v, iVar.u()), AbstractC3091w.f(c3089v, iVar.r()), AbstractC3091w.f(c3089v, iVar.r()), aVar.d(), C1598l0.o(AbstractC3091w.f(c3089v, iVar.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), C1598l0.o(AbstractC3091w.f(c3089v, iVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), C1598l0.o(AbstractC3091w.f(c3089v, iVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC3091w.f(c3089v, iVar.i()), C1598l0.o(AbstractC3091w.f(c3089v, iVar.g()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC3091w.f(c3089v, iVar.s()), AbstractC3091w.f(c3089v, iVar.t()), AbstractC3091w.f(c3089v, iVar.t()), null);
        c3089v.V(c3090v0);
        return c3090v0;
    }

    public final float e() {
        return f35389b;
    }

    public final T0 f(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1598643637);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1598643637, i8, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1452)");
        }
        T0 t0D = z0.d(i.f37822a.b(), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return t0D;
    }

    public final C3090v0 b(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1743772077);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1743772077, i8, -1, SZCvugJaXc.paxjpZvIeemZRR);
        }
        C3090v0 c3090v0D = d(Z.f35786a.a(interfaceC3163l, 6));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3090v0D;
    }
}
