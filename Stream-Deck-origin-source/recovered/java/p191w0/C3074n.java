package p191w0;

import A1.h;
import R0.C1598l0;
import R0.T0;
import androidx.compose.foundation.layout.e;
import p082j0.J;
import p201x2.vAk.hJroAgFztiMK;
import p207y0.f;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: w0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3074n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3074n f36246a = new C3074n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f36247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f36248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f36249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f36250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J f36251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f36252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f36253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f36254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f36255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f36256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f36257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f36258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f36259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f36260o = 0;

    static {
        float fM = h.m(24);
        f36247b = fM;
        float f8 = 8;
        float fM2 = h.m(f8);
        f36248c = fM2;
        J jD = e.d(fM, fM2, fM, fM2);
        f36249d = jD;
        float f9 = 16;
        float fM3 = h.m(f9);
        f36250e = fM3;
        f36251f = e.d(fM3, fM2, fM, fM2);
        float fM4 = h.m(12);
        f36252g = fM4;
        f36253h = e.d(fM4, jD.d(), fM4, jD.a());
        float fM5 = h.m(f9);
        f36254i = fM5;
        f36255j = e.d(fM4, jD.d(), fM5, jD.a());
        f36256k = h.m(58);
        f36257l = h.m(40);
        f36258m = f.f37701a.i();
        f36259n = h.m(f8);
    }

    public final C3072m b(long j8, long j9, long j10, long j11, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-339300779);
        if ((i9 & 1) != 0) {
            j8 = C1598l0.f9405b.e();
        }
        long j12 = j8;
        long jE = (i9 & 2) != 0 ? C1598l0.f9405b.e() : j9;
        long jE2 = (i9 & 4) != 0 ? C1598l0.f9405b.e() : j10;
        long jE3 = (i9 & 8) != 0 ? C1598l0.f9405b.e() : j11;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-339300779, i8, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:563)");
        }
        C3072m c3072mC = e(Z.f35786a.a(interfaceC3163l, 6)).c(j12, jE, jE2, jE3);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3072mC;
    }

    public final C3076o c(float f8, float f9, float f10, float f11, float f12, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(1827791191);
        if ((i9 & 1) != 0) {
            f8 = f.f37701a.b();
        }
        float f13 = f8;
        if ((i9 & 2) != 0) {
            f9 = f.f37701a.k();
        }
        float f14 = f9;
        if ((i9 & 4) != 0) {
            f10 = f.f37701a.g();
        }
        float f15 = f10;
        if ((i9 & 8) != 0) {
            f11 = f.f37701a.h();
        }
        float f16 = f11;
        if ((i9 & 16) != 0) {
            f12 = f.f37701a.e();
        }
        float f17 = f12;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1827791191, i8, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:772)");
        }
        C3076o c3076o = new C3076o(f13, f14, f15, f16, f17, null);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3076o;
    }

    public final J d() {
        return f36249d;
    }

    public final C3072m e(C3089v c3089v) {
        C3072m c3072mB = c3089v.b();
        if (c3072mB != null) {
            return c3072mB;
        }
        f fVar = f.f37701a;
        C3072m c3072m = new C3072m(AbstractC3091w.f(c3089v, fVar.a()), AbstractC3091w.f(c3089v, fVar.j()), C1598l0.o(AbstractC3091w.f(c3089v, fVar.d()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), C1598l0.o(AbstractC3091w.f(c3089v, fVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c3089v.S(c3072m);
        return c3072m;
    }

    public final float f() {
        return f36257l;
    }

    public final float g() {
        return f36256k;
    }

    public final T0 h(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1234923021);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1234923021, i8, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        T0 t0D = z0.d(f.f37701a.c(), interfaceC3163l, 6);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return t0D;
    }

    public final C3072m a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1449248637);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1449248637, i8, -1, hJroAgFztiMK.sMe);
        }
        C3072m c3072mE = e(Z.f35786a.a(interfaceC3163l, 6));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return c3072mE;
    }
}
