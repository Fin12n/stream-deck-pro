package p183v0;

import A1.h;
import R0.C1598l0;
import p037e0.D;
import p037e0.InterfaceC2213i;
import p037e0.i0;
import p046f0.E;
import p073i0.b;
import p073i0.d;
import p073i0.g;
import p073i0.j;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f35029a = new i0(15, 0, D.e(), 2, null);

    public static final InterfaceC2213i c(j jVar) {
        if (jVar instanceof g) {
            return f35029a;
        }
        if (jVar instanceof d) {
            return new i0(45, 0, D.e(), 2, null);
        }
        return jVar instanceof b ? new i0(45, 0, D.e(), 2, null) : f35029a;
    }

    public static final InterfaceC2213i d(j jVar) {
        if (jVar instanceof g) {
            return f35029a;
        }
        if (jVar instanceof d) {
            return f35029a;
        }
        return jVar instanceof b ? new i0(150, 0, D.e(), 2, null) : f35029a;
    }

    public static final E e(boolean z8, float f8, long j8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(1635163520);
        if ((i9 & 1) != 0) {
            z8 = true;
        }
        if ((i9 & 2) != 0) {
            f8 = h.f432b.c();
        }
        if ((i9 & 4) != 0) {
            j8 = C1598l0.f9405b.e();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1635163520, i8, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:80)");
        }
        q1 q1VarP = g1.p(C1598l0.g(j8), interfaceC3163l, (i8 >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z8);
        h hVarD = h.d(f8);
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(boolValueOf) | interfaceC3163l.R(hVarD);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new d(z8, f8, q1VarP, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        d dVar = (d) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return dVar;
    }
}
