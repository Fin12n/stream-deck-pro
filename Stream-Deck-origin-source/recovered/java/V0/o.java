package V0;

import R0.C1598l0;
import R0.C1600m0;
import R0.J0;
import R0.V0;
import R0.W0;
import R0.X;
import R0.Y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f10436a = D6.r.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10437b = V0.f9341a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10438c = W0.f9346a.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10439d = X.f9354a.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10440e = C1598l0.f9405b.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10441f = J0.f9308a.b();

    public static final List a(String str) {
        return str == null ? f10436a : new j().a(str).b();
    }

    public static final int b() {
        return f10441f;
    }

    public static final int c() {
        return f10437b;
    }

    public static final int d() {
        return f10438c;
    }

    public static final List e() {
        return f10436a;
    }

    public static final boolean f(long j8, long j9) {
        return C1598l0.v(j8) == C1598l0.v(j9) && C1598l0.u(j8) == C1598l0.u(j9) && C1598l0.s(j8) == C1598l0.s(j9);
    }

    public static final boolean g(C1600m0 c1600m0) {
        if (!(c1600m0 instanceof Y)) {
            return c1600m0 == null;
        }
        Y y8 = (Y) c1600m0;
        int iB = y8.b();
        X.a aVar = X.f9354a;
        return X.E(iB, aVar.z()) || X.E(y8.b(), aVar.B());
    }
}
