package p191w0;

import R0.AbstractC1602n0;
import R0.C1598l0;
import R0.T0;
import p207y0.g;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f36360a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36361b = 0;

    public final C3080q a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1876034303);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1876034303, i8, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:448)");
        }
        C3080q c3080qD = d(Z.f35786a.a(interfaceC3163l, 6));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3080qD;
    }

    public final C3080q b(long j8, long j9, long j10, long j11, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1589582123);
        long jE = (i9 & 1) != 0 ? C1598l0.f9405b.e() : j8;
        long jC = (i9 & 2) != 0 ? AbstractC3091w.c(jE, interfaceC3163l, i8 & 14) : j9;
        long jE2 = (i9 & 4) != 0 ? C1598l0.f9405b.e() : j10;
        long jO = (i9 & 8) != 0 ? C1598l0.o(jC, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1589582123, i8, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:465)");
        }
        C3080q c3080qC = d(Z.f35786a.a(interfaceC3163l, 6)).c(jE, jC, jE2, jO);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3080qC;
    }

    public final C3083s c(float f8, float f9, float f10, float f11, float f12, float f13, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-574898487);
        if ((i9 & 1) != 0) {
            f8 = g.f37723a.b();
        }
        float f14 = f8;
        if ((i9 & 2) != 0) {
            f9 = g.f37723a.i();
        }
        float f15 = f9;
        if ((i9 & 4) != 0) {
            f10 = g.f37723a.g();
        }
        float f16 = f10;
        if ((i9 & 8) != 0) {
            f11 = g.f37723a.h();
        }
        float f17 = f11;
        float f18 = (i9 & 16) != 0 ? g.f37723a.f() : f12;
        float fE = (i9 & 32) != 0 ? g.f37723a.e() : f13;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-574898487, i8, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:378)");
        }
        C3083s c3083s = new C3083s(f14, f15, f16, f17, f18, fE, null);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3083s;
    }

    public final C3080q d(C3089v c3089v) {
        C3080q c3080qC = c3089v.c();
        if (c3080qC != null) {
            return c3080qC;
        }
        g gVar = g.f37723a;
        C3080q c3080q = new C3080q(AbstractC3091w.f(c3089v, gVar.a()), AbstractC3091w.b(c3089v, AbstractC3091w.f(c3089v, gVar.a())), AbstractC1602n0.f(C1598l0.o(AbstractC3091w.f(c3089v, gVar.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC3091w.l(c3089v, gVar.e())), C1598l0.o(AbstractC3091w.b(c3089v, AbstractC3091w.f(c3089v, gVar.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c3089v.T(c3080q);
        return c3080q;
    }

    public final T0 e(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1266660211);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1266660211, i8, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:352)");
        }
        T0 t0D = z0.d(g.f37723a.c(), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return t0D;
    }
}
