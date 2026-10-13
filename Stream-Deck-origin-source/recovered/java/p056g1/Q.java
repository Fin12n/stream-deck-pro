package p056g1;

import B0.d;
import C6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f23478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2350n f23479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f23481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f23482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f23484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A1.b f23485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M f23486i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F f23487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23489c;

        public a(F f8, boolean z8, boolean z9) {
            this.f23487a = f8;
            this.f23488b = z8;
            this.f23489c = z9;
        }

        public final F a() {
            return this.f23487a;
        }

        public final boolean b() {
            return this.f23489c;
        }

        public final boolean c() {
            return this.f23488b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23490a;

        static {
            int[] iArr = new int[F.e.values().length];
            try {
                iArr[F.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[F.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23490a = iArr;
        }
    }

    public Q(F f8) {
        this.f23478a = f8;
        h0.a aVar = h0.f23615R;
        C2350n c2350n = new C2350n(aVar.a());
        this.f23479b = c2350n;
        this.f23481d = new f0();
        this.f23482e = new d(new h0.b[16], 0);
        this.f23483f = 1L;
        d dVar = new d(new a[16], 0);
        this.f23484g = dVar;
        this.f23486i = aVar.a() ? new M(f8, c2350n, dVar.k()) : null;
    }

    public static /* synthetic */ boolean A(Q q8, F f8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return q8.z(f8, z8);
    }

    public static /* synthetic */ boolean C(Q q8, F f8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return q8.B(f8, z8);
    }

    public static /* synthetic */ boolean F(Q q8, F f8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return q8.E(f8, z8);
    }

    public static /* synthetic */ boolean H(Q q8, F f8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return q8.G(f8, z8);
    }

    public static /* synthetic */ void d(Q q8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        q8.c(z8);
    }

    public static /* synthetic */ boolean w(Q q8, F f8, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        if ((i8 & 4) != 0) {
            z9 = true;
        }
        return q8.v(f8, z8, z9);
    }

    public final boolean B(F f8, boolean z8) {
        F fM0;
        F fM1;
        if (f8.Z() == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i8 = b.f23490a[f8.V().ordinal()];
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3 && i8 != 4) {
                if (i8 != 5) {
                    throw new m();
                }
                if (f8.X() && !z8) {
                    return false;
                }
                f8.S0();
                f8.T0();
                if (f8.J0()) {
                    return false;
                }
                if ((t.c(f8.L0(), Boolean.TRUE) || j(f8)) && ((fM0 = f8.m0()) == null || !fM0.X())) {
                    this.f23479b.c(f8, true);
                } else if ((f8.f() || i(f8)) && ((fM1 = f8.m0()) == null || !fM1.c0())) {
                    this.f23479b.c(f8, false);
                }
                return !this.f23480c;
            }
            this.f23484g.d(new a(f8, true, z8));
            M m8 = this.f23486i;
            if (m8 != null) {
                m8.a();
            }
        }
        return false;
    }

    public final void D(F f8) {
        this.f23481d.d(f8);
    }

    public final boolean E(F f8, boolean z8) {
        F fM0;
        int i8 = b.f23490a[f8.V().ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4) {
            M m8 = this.f23486i;
            if (m8 != null) {
                m8.a();
            }
            return false;
        }
        if (i8 != 5) {
            throw new m();
        }
        if (!z8 && f8.f() == f8.K0() && (f8.c0() || f8.U())) {
            M m9 = this.f23486i;
            if (m9 != null) {
                m9.a();
            }
            return false;
        }
        f8.Q0();
        if (f8.J0()) {
            return false;
        }
        if (f8.K0() && (((fM0 = f8.m0()) == null || !fM0.U()) && (fM0 == null || !fM0.c0()))) {
            this.f23479b.c(f8, false);
        }
        return !this.f23480c;
    }

    public final boolean G(F f8, boolean z8) {
        F fM0;
        int i8 = b.f23490a[f8.V().ordinal()];
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3 && i8 != 4) {
                if (i8 != 5) {
                    throw new m();
                }
                if (f8.c0() && !z8) {
                    return false;
                }
                f8.T0();
                if (f8.J0()) {
                    return false;
                }
                if ((f8.f() || i(f8)) && ((fM0 = f8.m0()) == null || !fM0.c0())) {
                    this.f23479b.c(f8, false);
                }
                return !this.f23480c;
            }
            this.f23484g.d(new a(f8, false, z8));
            M m8 = this.f23486i;
            if (m8 != null) {
                m8.a();
            }
        }
        return false;
    }

    public final void I(long j8) {
        A1.b bVar = this.f23485h;
        if (bVar == null ? false : A1.b.g(bVar.s(), j8)) {
            return;
        }
        if (this.f23480c) {
            throw new IllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.f23485h = A1.b.b(j8);
        if (this.f23478a.Z() != null) {
            this.f23478a.S0();
        }
        this.f23478a.T0();
        C2350n c2350n = this.f23479b;
        F f8 = this.f23478a;
        c2350n.c(f8, f8.Z() != null);
    }

    public final void b() {
        d dVar = this.f23482e;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                ((h0.b) objArrR[i8]).b();
                i8++;
            } while (i8 < iS);
        }
        this.f23482e.m();
    }

    public final void c(boolean z8) {
        if (z8) {
            this.f23481d.e(this.f23478a);
        }
        this.f23481d.a();
    }

    public final boolean e(F f8, A1.b bVar) {
        if (f8.Z() == null) {
            return false;
        }
        boolean zN0 = bVar != null ? f8.N0(bVar) : F.O0(f8, null, 1, null);
        F fM0 = f8.m0();
        if (zN0 && fM0 != null) {
            if (fM0.Z() == null) {
                H(this, fM0, false, 2, null);
                return zN0;
            }
            if (f8.f0() == F.g.InMeasureBlock) {
                C(this, fM0, false, 2, null);
                return zN0;
            }
            if (f8.f0() == F.g.InLayoutBlock) {
                A(this, fM0, false, 2, null);
            }
        }
        return zN0;
    }

    public final boolean f(F f8, A1.b bVar) {
        boolean zA1 = bVar != null ? f8.a1(bVar) : F.b1(f8, null, 1, null);
        F fM0 = f8.m0();
        if (zA1 && fM0 != null) {
            if (f8.e0() == F.g.InMeasureBlock) {
                H(this, fM0, false, 2, null);
                return zA1;
            }
            if (f8.e0() == F.g.InLayoutBlock) {
                F(this, fM0, false, 2, null);
            }
        }
        return zA1;
    }

    public final void g(F f8, boolean z8) {
        if (this.f23479b.g(z8)) {
            return;
        }
        if (!this.f23480c) {
            throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (s(f8, z8)) {
            throw new IllegalArgumentException("node not yet measured");
        }
        h(f8, z8);
    }

    public final void h(F f8, boolean z8) {
        d dVarU0 = f8.u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            Object[] objArrR = dVarU0.r();
            int i8 = 0;
            do {
                F f9 = (F) objArrR[i8];
                if ((!z8 && m(f9)) || (z8 && n(f9))) {
                    if (L.a(f9) && !z8) {
                        if (f9.X() && this.f23479b.e(f9, true)) {
                            v(f9, true, false);
                        } else {
                            g(f9, true);
                        }
                    }
                    u(f9, z8);
                    if (!s(f9, z8)) {
                        h(f9, z8);
                    }
                }
                i8++;
            } while (i8 < iS);
        }
        u(f8, z8);
    }

    public final boolean i(F f8) {
        return f8.c0() && m(f8);
    }

    public final boolean j(F f8) {
        return f8.X() && n(f8);
    }

    public final boolean k() {
        return this.f23479b.h();
    }

    public final boolean l() {
        return this.f23481d.c();
    }

    public final boolean m(F f8) {
        return f8.e0() == F.g.InMeasureBlock || f8.T().r().c().k();
    }

    public final boolean n(F f8) {
        InterfaceC2338b interfaceC2338bB;
        AbstractC2337a abstractC2337aC;
        return f8.f0() == F.g.InMeasureBlock || !((interfaceC2338bB = f8.T().B()) == null || (abstractC2337aC = interfaceC2338bB.c()) == null || !abstractC2337aC.k());
    }

    public final long o() {
        if (this.f23480c) {
            return this.f23483f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    public final boolean p(Function0 function0) throws Throwable {
        Q q8;
        Throwable th;
        boolean z8;
        F fE;
        if (!this.f23478a.I0()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.f23478a.f()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.f23480c) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z9 = false;
        if (this.f23485h != null) {
            this.f23480c = true;
            try {
                if (this.f23479b.h()) {
                    C2350n c2350n = this.f23479b;
                    z8 = false;
                    while (c2350n.h()) {
                        boolean zD = c2350n.f23642a.d();
                        boolean z10 = !zD;
                        if (zD) {
                            fE = c2350n.f23643b.e();
                        } else {
                            try {
                                fE = c2350n.f23642a.e();
                            } catch (Throwable th2) {
                                th = th2;
                                q8 = this;
                                q8.f23480c = false;
                                throw th;
                            }
                        }
                        F f8 = fE;
                        q8 = this;
                        try {
                            boolean zW = w(q8, f8, z10, false, 4, null);
                            if (f8 == this.f23478a && zW) {
                                z8 = true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            q8.f23480c = false;
                            throw th;
                        }
                    }
                    q8 = this;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    q8 = this;
                    z8 = false;
                }
                q8.f23480c = false;
                M m8 = q8.f23486i;
                if (m8 != null) {
                    m8.a();
                }
                z9 = z8;
            } catch (Throwable th4) {
                th = th4;
                q8 = this;
            }
        }
        b();
        return z9;
    }

    public final void q(F f8, long j8) {
        if (f8.J0()) {
            return;
        }
        if (t.c(f8, this.f23478a)) {
            throw new IllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.f23478a.I0()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.f23478a.f()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.f23480c) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.f23485h != null) {
            this.f23480c = true;
            try {
                this.f23479b.i(f8);
                boolean zE = e(f8, A1.b.b(j8));
                f(f8, A1.b.b(j8));
                if (zE || f8.W()) {
                    if (t.c(f8.L0(), Boolean.TRUE)) {
                        f8.P0();
                    }
                }
                if (f8.U() && f8.f()) {
                    f8.e1();
                    this.f23481d.d(f8);
                }
                this.f23480c = false;
                M m8 = this.f23486i;
                if (m8 != null) {
                    m8.a();
                }
            } catch (Throwable th) {
                this.f23480c = false;
                throw th;
            }
        }
        b();
    }

    public final void r() {
        if (this.f23479b.h()) {
            if (!this.f23478a.I0()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.f23478a.f()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.f23480c) {
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.f23485h != null) {
                this.f23480c = true;
                try {
                    if (!this.f23479b.g(true)) {
                        if (this.f23478a.Z() != null) {
                            y(this.f23478a, true);
                        } else {
                            x(this.f23478a);
                        }
                    }
                    y(this.f23478a, false);
                    this.f23480c = false;
                    M m8 = this.f23486i;
                    if (m8 != null) {
                        m8.a();
                    }
                } catch (Throwable th) {
                    this.f23480c = false;
                    throw th;
                }
            }
        }
    }

    public final boolean s(F f8, boolean z8) {
        return z8 ? f8.X() : f8.c0();
    }

    public final void t(F f8) {
        this.f23479b.i(f8);
    }

    public final void u(F f8, boolean z8) {
        if (s(f8, z8) && this.f23479b.e(f8, z8)) {
            v(f8, z8, false);
        }
    }

    public final boolean v(F f8, boolean z8, boolean z9) {
        A1.b bVar;
        boolean zE;
        boolean zF;
        F fM0;
        int i8 = 0;
        if (f8.J0()) {
            return false;
        }
        if (!f8.f() && !f8.K0() && !i(f8) && !t.c(f8.L0(), Boolean.TRUE) && !j(f8) && !f8.B()) {
            return false;
        }
        if (f8.X() || f8.c0()) {
            if (f8 == this.f23478a) {
                bVar = this.f23485h;
                t.d(bVar);
            } else {
                bVar = null;
            }
            zE = (f8.X() && z8) ? e(f8, bVar) : false;
            zF = f(f8, bVar);
        } else {
            zF = false;
            zE = false;
        }
        if (z9) {
            if ((zE || f8.W()) && t.c(f8.L0(), Boolean.TRUE) && z8) {
                f8.P0();
            }
            if (f8.U() && (f8 == this.f23478a || ((fM0 = f8.m0()) != null && fM0.f() && f8.K0()))) {
                if (f8 == this.f23478a) {
                    f8.Y0(0, 0);
                } else {
                    f8.e1();
                }
                this.f23481d.d(f8);
                M m8 = this.f23486i;
                if (m8 != null) {
                    m8.a();
                }
            }
        }
        if (this.f23484g.v()) {
            d dVar = this.f23484g;
            int iS = dVar.s();
            if (iS > 0) {
                Object[] objArrR = dVar.r();
                do {
                    a aVar = (a) objArrR[i8];
                    if (aVar.a().I0()) {
                        if (aVar.c()) {
                            B(aVar.a(), aVar.b());
                        } else {
                            G(aVar.a(), aVar.b());
                        }
                    }
                    i8++;
                } while (i8 < iS);
            }
            this.f23484g.m();
        }
        return zF;
    }

    public final void x(F f8) {
        d dVarU0 = f8.u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            Object[] objArrR = dVarU0.r();
            int i8 = 0;
            do {
                F f9 = (F) objArrR[i8];
                if (m(f9)) {
                    if (L.a(f9)) {
                        y(f9, true);
                    } else {
                        x(f9);
                    }
                }
                i8++;
            } while (i8 < iS);
        }
    }

    public final void y(F f8, boolean z8) {
        A1.b bVar;
        if (f8 == this.f23478a) {
            bVar = this.f23485h;
            t.d(bVar);
        } else {
            bVar = null;
        }
        if (z8) {
            e(f8, bVar);
        } else {
            f(f8, bVar);
        }
    }

    public final boolean z(F f8, boolean z8) {
        int i8 = b.f23490a[f8.V().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4 && i8 != 5) {
                        throw new m();
                    }
                }
            }
            if ((f8.X() || f8.W()) && !z8) {
                M m8 = this.f23486i;
                if (m8 != null) {
                    m8.a();
                }
                return false;
            }
            f8.R0();
            f8.Q0();
            if (f8.J0()) {
                return false;
            }
            F fM0 = f8.m0();
            if (t.c(f8.L0(), Boolean.TRUE) && ((fM0 == null || !fM0.X()) && (fM0 == null || !fM0.W()))) {
                this.f23479b.c(f8, true);
            } else if (f8.f() && ((fM0 == null || !fM0.U()) && (fM0 == null || !fM0.c0()))) {
                this.f23479b.c(f8, false);
            }
            return !this.f23480c;
        }
        M m9 = this.f23486i;
        if (m9 != null) {
            m9.a();
        }
        return false;
    }
}
