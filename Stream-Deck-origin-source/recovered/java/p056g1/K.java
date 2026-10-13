package p056g1;

import A1.n;
import A1.r;
import A1.s;
import Q6.k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2230a;
import p038e1.G;
import p038e1.a0;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f23375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23376b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23388n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f23390p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F.e f23377c = F.e.Idle;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f23389o = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23391q = A1.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Function0 f23392r = new d();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a extends a0 implements G, InterfaceC2338b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23393f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f23397j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f23398k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f23399l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public A1.b f23400m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f23402o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public k f23403p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f23404q;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f23408u;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f23411x;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23394g = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f23395h = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public F.g f23396i = F.g.NotUsed;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f23401n = n.f446b.a();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final AbstractC2337a f23405r = new N(this);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final B0.d f23406s = new B0.d(new a[16], 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f23407t = true;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f23409v = true;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f23410w = k1().e();

        /* JADX INFO: renamed from: g1.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0540a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f23414b;

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
                    iArr[F.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[F.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f23413a = iArr;
                int[] iArr2 = new int[F.g.values().length];
                try {
                    iArr2[F.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[F.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f23414b = iArr2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ P f23416b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ K f23417c;

            /* JADX INFO: renamed from: g1.K$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0541a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0541a f23418a = new C0541a();

                public C0541a() {
                    super(1);
                }

                public final void b(InterfaceC2338b interfaceC2338b) {
                    interfaceC2338b.c().t(false);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((InterfaceC2338b) obj);
                    return C6.G.f1419a;
                }
            }

            /* JADX INFO: renamed from: g1.K$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0542b extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0542b f23419a = new C0542b();

                public C0542b() {
                    super(1);
                }

                public final void b(InterfaceC2338b interfaceC2338b) {
                    interfaceC2338b.c().q(interfaceC2338b.c().l());
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((InterfaceC2338b) obj);
                    return C6.G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(P p8, K k8) {
                super(0);
                this.f23416b = p8;
                this.f23417c = k8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m201invoke();
                return C6.G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m201invoke() {
                a.this.T0();
                a.this.P(C0541a.f23418a);
                P pE2 = a.this.q().e2();
                if (pE2 != null) {
                    boolean zK1 = pE2.k1();
                    List listF = this.f23417c.f23375a.F();
                    int size = listF.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        P pE3 = ((F) listF.get(i8)).k0().e2();
                        if (pE3 != null) {
                            pE3.q1(zK1);
                        }
                    }
                }
                this.f23416b.T0().d();
                P pE4 = a.this.q().e2();
                if (pE4 != null) {
                    pE4.k1();
                    List listF2 = this.f23417c.f23375a.F();
                    int size2 = listF2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        P pE5 = ((F) listF2.get(i9)).k0().e2();
                        if (pE5 != null) {
                            pE5.q1(false);
                        }
                    }
                }
                a.this.Q0();
                a.this.P(C0542b.f23419a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ K f23420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f23421b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f23422c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(K k8, h0 h0Var, long j8) {
                super(0);
                this.f23420a = k8;
                this.f23421b = h0Var;
                this.f23422c = j8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m202invoke();
                return C6.G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m202invoke() {
                P pE2;
                a0.a aVarD1 = null;
                if (L.a(this.f23420a.f23375a)) {
                    X xK2 = this.f23420a.H().k2();
                    if (xK2 != null) {
                        aVarD1 = xK2.d1();
                    }
                } else {
                    X xK3 = this.f23420a.H().k2();
                    if (xK3 != null && (pE2 = xK3.e2()) != null) {
                        aVarD1 = pE2.d1();
                    }
                }
                if (aVarD1 == null) {
                    aVarD1 = this.f23421b.getPlacementScope();
                }
                K k8 = this.f23420a;
                long j8 = this.f23422c;
                P pE3 = k8.H().e2();
                t.d(pE3);
                a0.a.h(aVarD1, pE3, j8, 0.0f, 2, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f23423a = new d();

            public d() {
                super(1);
            }

            public final void b(InterfaceC2338b interfaceC2338b) {
                interfaceC2338b.c().u(false);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((InterfaceC2338b) obj);
                return C6.G.f1419a;
            }
        }

        public a() {
        }

        public final void A1() {
            boolean zF = f();
            M1(true);
            int i8 = 0;
            if (!zF && K.this.D()) {
                F.i1(K.this.f23375a, true, false, 2, null);
            }
            B0.d dVarU0 = K.this.f23375a.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                do {
                    F f8 = (F) objArrR[i8];
                    if (f8.n0() != Integer.MAX_VALUE) {
                        a aVarY = f8.Y();
                        t.d(aVarY);
                        aVarY.A1();
                        f8.n1(f8);
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        public final void B1() {
            if (f()) {
                int i8 = 0;
                M1(false);
                B0.d dVarU0 = K.this.f23375a.u0();
                int iS = dVarU0.s();
                if (iS > 0) {
                    Object[] objArrR = dVarU0.r();
                    do {
                        a aVarE = ((F) objArrR[i8]).T().E();
                        t.d(aVarE);
                        aVarE.B1();
                        i8++;
                    } while (i8 < iS);
                }
            }
        }

        public final void C1() {
            B0.d dVarU0;
            int iS;
            if (K.this.s() <= 0 || (iS = (dVarU0 = K.this.f23375a.u0()).s()) <= 0) {
                return;
            }
            Object[] objArrR = dVarU0.r();
            int i8 = 0;
            do {
                F f8 = (F) objArrR[i8];
                K kT = f8.T();
                if ((kT.u() || kT.t()) && !kT.z()) {
                    F.g1(f8, false, 1, null);
                }
                a aVarE = kT.E();
                if (aVarE != null) {
                    aVarE.C1();
                }
                i8++;
            } while (i8 < iS);
        }

        @Override // p038e1.a0
        public void D0(long j8, float f8, k kVar) {
            if (K.this.f23375a.J0()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            K.this.f23377c = F.e.LookaheadLayingOut;
            this.f23398k = true;
            this.f23411x = false;
            if (!n.i(j8, this.f23401n)) {
                if (K.this.t() || K.this.u()) {
                    K.this.f23382h = true;
                }
                C1();
            }
            h0 h0VarB = J.b(K.this.f23375a);
            if (K.this.C() || !f()) {
                K.this.U(false);
                c().r(false);
                j0.d(h0VarB.getSnapshotObserver(), K.this.f23375a, false, new c(K.this, h0VarB, j8), 2, null);
            } else {
                P pE2 = K.this.H().e2();
                t.d(pE2);
                pE2.K1(j8);
                G1();
            }
            this.f23401n = j8;
            this.f23402o = f8;
            this.f23403p = kVar;
            K.this.f23377c = F.e.Idle;
        }

        public final void D1() {
            F f8 = K.this.f23375a;
            K k8 = K.this;
            B0.d dVarU0 = f8.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    F f9 = (F) objArrR[i8];
                    if (f9.X() && f9.f0() == F.g.InMeasureBlock) {
                        a aVarE = f9.T().E();
                        t.d(aVarE);
                        A1.b bVarY = f9.T().y();
                        t.d(bVarY);
                        if (aVarE.H1(bVarY.s())) {
                            F.i1(k8.f23375a, false, false, 3, null);
                        }
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        public final void E1() {
            F.g gVarS;
            F.i1(K.this.f23375a, false, false, 3, null);
            F fM0 = K.this.f23375a.m0();
            if (fM0 == null || K.this.f23375a.S() != F.g.NotUsed) {
                return;
            }
            F f8 = K.this.f23375a;
            int i8 = C0540a.f23413a[fM0.V().ordinal()];
            if (i8 != 2) {
                gVarS = i8 != 3 ? fM0.S() : F.g.InLayoutBlock;
            } else {
                gVarS = F.g.InMeasureBlock;
            }
            f8.t1(gVarS);
        }

        @Override // p038e1.InterfaceC2243n
        public int F(int i8) {
            E1();
            P pE2 = K.this.H().e2();
            t.d(pE2);
            return pE2.F(i8);
        }

        public final void F1() {
            this.f23395h = Integer.MAX_VALUE;
            this.f23394g = Integer.MAX_VALUE;
            M1(false);
        }

        @Override // p038e1.InterfaceC2243n
        public int G(int i8) {
            E1();
            P pE2 = K.this.H().e2();
            t.d(pE2);
            return pE2.G(i8);
        }

        public final void G1() {
            this.f23411x = true;
            F fM0 = K.this.f23375a.m0();
            if (!f()) {
                A1();
                if (this.f23393f && fM0 != null) {
                    F.g1(fM0, false, 1, null);
                }
            }
            if (fM0 == null) {
                this.f23395h = 0;
            } else if (!this.f23393f && (fM0.V() == F.e.LayingOut || fM0.V() == F.e.LookaheadLayingOut)) {
                if (this.f23395h != Integer.MAX_VALUE) {
                    throw new IllegalStateException(bGZGhbtQmA.BzCTo);
                }
                this.f23395h = fM0.T().f23384j;
                fM0.T().f23384j++;
            }
            R();
        }

        public final boolean H1(long j8) {
            if (K.this.f23375a.J0()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            F fM0 = K.this.f23375a.m0();
            K.this.f23375a.q1(K.this.f23375a.C() || (fM0 != null && fM0.C()));
            if (!K.this.f23375a.X()) {
                A1.b bVar = this.f23400m;
                if (bVar == null ? false : A1.b.g(bVar.s(), j8)) {
                    h0 h0VarL0 = K.this.f23375a.l0();
                    if (h0VarL0 != null) {
                        h0VarL0.b(K.this.f23375a, true);
                    }
                    K.this.f23375a.p1();
                    return false;
                }
            }
            this.f23400m = A1.b.b(j8);
            J0(j8);
            c().s(false);
            P(d.f23423a);
            long jU0 = this.f23399l ? u0() : s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f23399l = true;
            P pE2 = K.this.H().e2();
            if (!(pE2 != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            K.this.Q(j8);
            I0(s.a(pE2.y0(), pE2.h0()));
            return (r.g(jU0) == pE2.y0() && r.f(jU0) == pE2.h0()) ? false : true;
        }

        public final void I1() {
            F fM0;
            try {
                this.f23393f = true;
                if (!this.f23398k) {
                    throw new IllegalStateException("replace() called on item that was not placed");
                }
                this.f23411x = false;
                boolean zF = f();
                D0(this.f23401n, 0.0f, null);
                if (zF && !this.f23411x && (fM0 = K.this.f23375a.m0()) != null) {
                    F.g1(fM0, false, 1, null);
                }
                this.f23393f = false;
            } catch (Throwable th) {
                this.f23393f = false;
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // p038e1.G
        public a0 J(long j8) {
            F fM0 = K.this.f23375a.m0();
            if ((fM0 != null ? fM0.V() : null) == F.e.LookaheadMeasuring) {
                K.this.f23376b = false;
            } else {
                F fM1 = K.this.f23375a.m0();
                if ((fM1 != null ? fM1.V() : null) == F.e.LookaheadLayingOut) {
                    K.this.f23376b = false;
                }
            }
            N1(K.this.f23375a);
            if (K.this.f23375a.S() == F.g.NotUsed) {
                K.this.f23375a.u();
            }
            H1(j8);
            return this;
        }

        public final void J1(boolean z8) {
            this.f23407t = z8;
        }

        public final void K1(F.g gVar) {
            this.f23396i = gVar;
        }

        public final void L1(int i8) {
            this.f23395h = i8;
        }

        public void M1(boolean z8) {
            this.f23404q = z8;
        }

        public final void N1(F f8) {
            F.g gVar;
            F fM0 = f8.m0();
            if (fM0 == null) {
                this.f23396i = F.g.NotUsed;
                return;
            }
            if (this.f23396i != F.g.NotUsed && !f8.C()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i8 = C0540a.f23413a[fM0.V().ordinal()];
            if (i8 == 1 || i8 == 2) {
                gVar = F.g.InMeasureBlock;
            } else {
                if (i8 != 3 && i8 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + fM0.V());
                }
                gVar = F.g.InLayoutBlock;
            }
            this.f23396i = gVar;
        }

        public final boolean O1() {
            if (e() == null) {
                P pE2 = K.this.H().e2();
                t.d(pE2);
                if (pE2.e() == null) {
                    return false;
                }
            }
            if (!this.f23409v) {
                return false;
            }
            this.f23409v = false;
            P pE3 = K.this.H().e2();
            t.d(pE3);
            this.f23410w = pE3.e();
            return true;
        }

        @Override // p056g1.InterfaceC2338b
        public void P(k kVar) {
            B0.d dVarU0 = K.this.f23375a.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    InterfaceC2338b interfaceC2338bB = ((F) objArrR[i8]).T().B();
                    t.d(interfaceC2338bB);
                    kVar.invoke(interfaceC2338bB);
                    i8++;
                } while (i8 < iS);
            }
        }

        @Override // p038e1.K
        public int Q(AbstractC2230a abstractC2230a) {
            F fM0 = K.this.f23375a.m0();
            if ((fM0 != null ? fM0.V() : null) == F.e.LookaheadMeasuring) {
                c().u(true);
            } else {
                F fM1 = K.this.f23375a.m0();
                if ((fM1 != null ? fM1.V() : null) == F.e.LookaheadLayingOut) {
                    c().t(true);
                }
            }
            this.f23397j = true;
            P pE2 = K.this.H().e2();
            t.d(pE2);
            int iQ = pE2.Q(abstractC2230a);
            this.f23397j = false;
            return iQ;
        }

        public final void Q0() {
            B0.d dVarU0 = K.this.f23375a.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    a aVarE = ((F) objArrR[i8]).T().E();
                    t.d(aVarE);
                    int i9 = aVarE.f23394g;
                    int i10 = aVarE.f23395h;
                    if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                        aVarE.B1();
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        @Override // p056g1.InterfaceC2338b
        public void R() {
            this.f23408u = true;
            c().o();
            if (K.this.C()) {
                D1();
            }
            P pE2 = q().e2();
            t.d(pE2);
            if (K.this.f23383i || (!this.f23397j && !pE2.k1() && K.this.C())) {
                K.this.f23382h = false;
                F.e eVarA = K.this.A();
                K.this.f23377c = F.e.LookaheadLayingOut;
                h0 h0VarB = J.b(K.this.f23375a);
                K.this.V(false);
                j0.f(h0VarB.getSnapshotObserver(), K.this.f23375a, false, new b(pE2, K.this), 2, null);
                K.this.f23377c = eVarA;
                if (K.this.u() && pE2.k1()) {
                    requestLayout();
                }
                K.this.f23383i = false;
            }
            if (c().l()) {
                c().q(true);
            }
            if (c().g() && c().k()) {
                c().n();
            }
            this.f23408u = false;
        }

        public final void T0() {
            int i8 = 0;
            K.this.f23384j = 0;
            B0.d dVarU0 = K.this.f23375a.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                do {
                    a aVarE = ((F) objArrR[i8]).T().E();
                    t.d(aVarE);
                    aVarE.f23394g = aVarE.f23395h;
                    aVarE.f23395h = Integer.MAX_VALUE;
                    if (aVarE.f23396i == F.g.InLayoutBlock) {
                        aVarE.f23396i = F.g.NotUsed;
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        @Override // p056g1.InterfaceC2338b
        public void V() {
            F.i1(K.this.f23375a, false, false, 3, null);
        }

        @Override // p038e1.InterfaceC2243n
        public int W(int i8) {
            E1();
            P pE2 = K.this.H().e2();
            t.d(pE2);
            return pE2.W(i8);
        }

        @Override // p056g1.InterfaceC2338b
        public AbstractC2337a c() {
            return this.f23405r;
        }

        public final List d1() {
            K.this.f23375a.F();
            if (!this.f23407t) {
                return this.f23406s.k();
            }
            F f8 = K.this.f23375a;
            B0.d dVar = this.f23406s;
            B0.d dVarU0 = f8.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    F f9 = (F) objArrR[i8];
                    if (dVar.s() <= i8) {
                        a aVarE = f9.T().E();
                        t.d(aVarE);
                        dVar.d(aVarE);
                    } else {
                        a aVarE2 = f9.T().E();
                        t.d(aVarE2);
                        dVar.G(i8, aVarE2);
                    }
                    i8++;
                } while (i8 < iS);
            }
            dVar.E(f8.F().size(), dVar.s());
            this.f23407t = false;
            return this.f23406s.k();
        }

        @Override // p038e1.K, p038e1.InterfaceC2243n
        public Object e() {
            return this.f23410w;
        }

        @Override // p056g1.InterfaceC2338b
        public boolean f() {
            return this.f23404q;
        }

        public final A1.b f1() {
            return this.f23400m;
        }

        @Override // p038e1.InterfaceC2243n
        public int g(int i8) {
            E1();
            P pE2 = K.this.H().e2();
            t.d(pE2);
            return pE2.g(i8);
        }

        public final boolean g1() {
            return this.f23408u;
        }

        @Override // p038e1.a0
        public int k0() {
            P pE2 = K.this.H().e2();
            t.d(pE2);
            return pE2.k0();
        }

        public final b k1() {
            return K.this.F();
        }

        @Override // p056g1.InterfaceC2338b
        public Map m() {
            if (!this.f23397j) {
                if (K.this.A() == F.e.LookaheadMeasuring) {
                    c().s(true);
                    if (c().g()) {
                        K.this.M();
                    }
                } else {
                    c().r(true);
                }
            }
            P pE2 = q().e2();
            if (pE2 != null) {
                pE2.q1(true);
            }
            R();
            P pE3 = q().e2();
            if (pE3 != null) {
                pE3.q1(false);
            }
            return c().h();
        }

        public final F.g n1() {
            return this.f23396i;
        }

        public final boolean o1() {
            return this.f23398k;
        }

        @Override // p056g1.InterfaceC2338b
        public X q() {
            return K.this.f23375a.O();
        }

        public final void q1(boolean z8) {
            F fM0;
            F fM1 = K.this.f23375a.m0();
            F.g gVarS = K.this.f23375a.S();
            if (fM1 == null || gVarS == F.g.NotUsed) {
                return;
            }
            while (fM1.S() == gVarS && (fM0 = fM1.m0()) != null) {
                fM1 = fM0;
            }
            int i8 = C0540a.f23414b[gVarS.ordinal()];
            if (i8 == 1) {
                if (fM1.Z() != null) {
                    F.i1(fM1, z8, false, 2, null);
                    return;
                } else {
                    F.m1(fM1, z8, false, 2, null);
                    return;
                }
            }
            if (i8 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (fM1.Z() != null) {
                fM1.f1(z8);
            } else {
                fM1.j1(z8);
            }
        }

        @Override // p056g1.InterfaceC2338b
        public void requestLayout() {
            F.g1(K.this.f23375a, false, 1, null);
        }

        public final void t1() {
            this.f23409v = true;
        }

        @Override // p056g1.InterfaceC2338b
        public InterfaceC2338b u() {
            K kT;
            F fM0 = K.this.f23375a.m0();
            if (fM0 == null || (kT = fM0.T()) == null) {
                return null;
            }
            return kT.B();
        }

        @Override // p038e1.a0
        public int v0() {
            P pE2 = K.this.H().e2();
            t.d(pE2);
            return pE2.v0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b extends a0 implements G, InterfaceC2338b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public k f23424A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public long f23425B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public float f23426C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final Function0 f23427D;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23429f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f23432i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f23433j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f23435l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f23436m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public k f23437n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f23438o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f23439p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f23440q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f23441r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f23442s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final AbstractC2337a f23443t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final B0.d f23444u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f23445v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f23446w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Function0 f23447x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f23448y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f23449z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23430g = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f23431h = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public F.g f23434k = F.g.NotUsed;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23450a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f23451b;

            static {
                int[] iArr = new int[F.e.values().length];
                try {
                    iArr[F.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[F.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f23450a = iArr;
                int[] iArr2 = new int[F.g.values().length];
                try {
                    iArr2[F.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[F.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f23451b = iArr2;
            }
        }

        /* JADX INFO: renamed from: g1.K$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0543b extends u implements Function0 {

            /* JADX INFO: renamed from: g1.K$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f23453a = new a();

                public a() {
                    super(1);
                }

                public final void b(InterfaceC2338b interfaceC2338b) {
                    interfaceC2338b.c().t(false);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((InterfaceC2338b) obj);
                    return C6.G.f1419a;
                }
            }

            /* JADX INFO: renamed from: g1.K$b$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0544b extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0544b f23454a = new C0544b();

                public C0544b() {
                    super(1);
                }

                public final void b(InterfaceC2338b interfaceC2338b) {
                    interfaceC2338b.c().q(interfaceC2338b.c().l());
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((InterfaceC2338b) obj);
                    return C6.G.f1419a;
                }
            }

            public C0543b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m203invoke();
                return C6.G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m203invoke() {
                b.this.g1();
                b.this.P(a.f23453a);
                b.this.q().T0().d();
                b.this.f1();
                b.this.P(C0544b.f23454a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ K f23455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f23456b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(K k8, b bVar) {
                super(0);
                this.f23455a = k8;
                this.f23456b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m204invoke();
                return C6.G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m204invoke() {
                a0.a placementScope;
                X xK2 = this.f23455a.H().k2();
                if (xK2 == null || (placementScope = xK2.d1()) == null) {
                    placementScope = J.b(this.f23455a.f23375a).getPlacementScope();
                }
                a0.a aVar = placementScope;
                b bVar = this.f23456b;
                K k8 = this.f23455a;
                k kVar = bVar.f23424A;
                if (kVar == null) {
                    aVar.g(k8.H(), bVar.f23425B, bVar.f23426C);
                } else {
                    aVar.s(k8.H(), bVar.f23425B, bVar.f23426C, kVar);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f23457a = new d();

            public d() {
                super(1);
            }

            public final void b(InterfaceC2338b interfaceC2338b) {
                interfaceC2338b.c().u(false);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((InterfaceC2338b) obj);
                return C6.G.f1419a;
            }
        }

        public b() {
            n.a aVar = n.f446b;
            this.f23436m = aVar.a();
            this.f23439p = true;
            this.f23443t = new G(this);
            this.f23444u = new B0.d(new b[16], 0);
            this.f23445v = true;
            this.f23447x = new C0543b();
            this.f23425B = aVar.a();
            this.f23427D = new c(K.this, this);
        }

        private final void F1() {
            boolean zF = f();
            R1(true);
            F f8 = K.this.f23375a;
            int i8 = 0;
            if (!zF) {
                if (f8.c0()) {
                    F.m1(f8, true, false, 2, null);
                } else if (f8.X()) {
                    F.i1(f8, true, false, 2, null);
                }
            }
            X xJ2 = f8.O().j2();
            for (X xK0 = f8.k0(); !t.c(xK0, xJ2) && xK0 != null; xK0 = xK0.j2()) {
                if (xK0.b2()) {
                    xK0.t2();
                }
            }
            B0.d dVarU0 = f8.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                do {
                    F f9 = (F) objArrR[i8];
                    if (f9.n0() != Integer.MAX_VALUE) {
                        f9.b0().F1();
                        f8.n1(f9);
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        private final void G1() {
            if (f()) {
                int i8 = 0;
                R1(false);
                B0.d dVarU0 = K.this.f23375a.u0();
                int iS = dVarU0.s();
                if (iS > 0) {
                    Object[] objArrR = dVarU0.r();
                    do {
                        ((F) objArrR[i8]).b0().G1();
                        i8++;
                    } while (i8 < iS);
                }
            }
        }

        private final void I1() {
            F f8 = K.this.f23375a;
            K k8 = K.this;
            B0.d dVarU0 = f8.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    F f9 = (F) objArrR[i8];
                    if (f9.c0() && f9.e0() == F.g.InMeasureBlock && F.b1(f9, null, 1, null)) {
                        F.m1(k8.f23375a, false, false, 3, null);
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        private final void J1() {
            F.g gVarS;
            F.m1(K.this.f23375a, false, false, 3, null);
            F fM0 = K.this.f23375a.m0();
            if (fM0 == null || K.this.f23375a.S() != F.g.NotUsed) {
                return;
            }
            F f8 = K.this.f23375a;
            int i8 = a.f23450a[fM0.V().ordinal()];
            if (i8 != 1) {
                gVarS = i8 != 2 ? fM0.S() : F.g.InLayoutBlock;
            } else {
                gVarS = F.g.InMeasureBlock;
            }
            f8.t1(gVarS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f1() {
            F f8 = K.this.f23375a;
            B0.d dVarU0 = f8.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    F f9 = (F) objArrR[i8];
                    if (f9.b0().f23430g != f9.n0()) {
                        f8.X0();
                        f8.C0();
                        if (f9.n0() == Integer.MAX_VALUE) {
                            f9.b0().G1();
                        }
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g1() {
            K.this.f23385k = 0;
            B0.d dVarU0 = K.this.f23375a.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    b bVarB0 = ((F) objArrR[i8]).b0();
                    bVarB0.f23430g = bVarB0.f23431h;
                    bVarB0.f23431h = Integer.MAX_VALUE;
                    bVarB0.f23442s = false;
                    if (bVarB0.f23434k == F.g.InLayoutBlock) {
                        bVarB0.f23434k = F.g.NotUsed;
                    }
                    i8++;
                } while (i8 < iS);
            }
        }

        public final float A1() {
            return this.f23448y;
        }

        public final void B1(boolean z8) {
            F fM0;
            F fM1 = K.this.f23375a.m0();
            F.g gVarS = K.this.f23375a.S();
            if (fM1 == null || gVarS == F.g.NotUsed) {
                return;
            }
            while (fM1.S() == gVarS && (fM0 = fM1.m0()) != null) {
                fM1 = fM0;
            }
            int i8 = a.f23451b[gVarS.ordinal()];
            if (i8 == 1) {
                F.m1(fM1, z8, false, 2, null);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                fM1.j1(z8);
            }
        }

        public final void C1() {
            this.f23439p = true;
        }

        @Override // p038e1.a0
        public void D0(long j8, float f8, k kVar) {
            a0.a placementScope;
            this.f23442s = true;
            if (!n.i(j8, this.f23436m)) {
                if (K.this.t() || K.this.u()) {
                    K.this.f23379e = true;
                }
                H1();
            }
            if (L.a(K.this.f23375a)) {
                X xK2 = K.this.H().k2();
                if (xK2 == null || (placementScope = xK2.d1()) == null) {
                    placementScope = J.b(K.this.f23375a).getPlacementScope();
                }
                a0.a aVar = placementScope;
                K k8 = K.this;
                a aVarE = k8.E();
                t.d(aVarE);
                F fM0 = k8.f23375a.m0();
                if (fM0 != null) {
                    fM0.T().f23384j = 0;
                }
                aVarE.L1(Integer.MAX_VALUE);
                a0.a.f(aVar, aVarE, n.j(j8), n.k(j8), 0.0f, 4, null);
            }
            a aVarE2 = K.this.E();
            if ((aVarE2 == null || aVarE2.o1()) ? false : true) {
                throw new IllegalArgumentException("Error: Placement happened before lookahead.");
            }
            M1(j8, f8, kVar);
        }

        public final boolean D1() {
            return this.f23442s;
        }

        public final void E1() {
            K.this.f23376b = true;
        }

        @Override // p038e1.InterfaceC2243n
        public int F(int i8) {
            J1();
            return K.this.H().F(i8);
        }

        @Override // p038e1.InterfaceC2243n
        public int G(int i8) {
            J1();
            return K.this.H().G(i8);
        }

        public final void H1() {
            B0.d dVarU0;
            int iS;
            if (K.this.s() <= 0 || (iS = (dVarU0 = K.this.f23375a.u0()).s()) <= 0) {
                return;
            }
            Object[] objArrR = dVarU0.r();
            int i8 = 0;
            do {
                F f8 = (F) objArrR[i8];
                K kT = f8.T();
                if ((kT.u() || kT.t()) && !kT.z()) {
                    F.k1(f8, false, 1, null);
                }
                kT.F().H1();
                i8++;
            } while (i8 < iS);
        }

        @Override // p038e1.G
        public a0 J(long j8) {
            F.g gVarS = K.this.f23375a.S();
            F.g gVar = F.g.NotUsed;
            if (gVarS == gVar) {
                K.this.f23375a.u();
            }
            if (L.a(K.this.f23375a)) {
                a aVarE = K.this.E();
                t.d(aVarE);
                aVarE.K1(gVar);
                aVarE.J(j8);
            }
            S1(K.this.f23375a);
            N1(j8);
            return this;
        }

        public final void K1() {
            this.f23431h = Integer.MAX_VALUE;
            this.f23430g = Integer.MAX_VALUE;
            R1(false);
        }

        public final void L1() {
            this.f23449z = true;
            F fM0 = K.this.f23375a.m0();
            float fL2 = q().l2();
            F f8 = K.this.f23375a;
            X xK0 = f8.k0();
            X xO = f8.O();
            while (xK0 != xO) {
                t.e(xK0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                B b8 = (B) xK0;
                fL2 += b8.l2();
                xK0 = b8.j2();
            }
            if (fL2 != this.f23448y) {
                this.f23448y = fL2;
                if (fM0 != null) {
                    fM0.X0();
                }
                if (fM0 != null) {
                    fM0.C0();
                }
            }
            if (!f()) {
                if (fM0 != null) {
                    fM0.C0();
                }
                F1();
                if (this.f23429f && fM0 != null) {
                    F.k1(fM0, false, 1, null);
                }
            }
            if (fM0 == null) {
                this.f23431h = 0;
            } else if (!this.f23429f && fM0.V() == F.e.LayingOut) {
                if (this.f23431h != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                this.f23431h = fM0.T().f23385k;
                fM0.T().f23385k++;
            }
            R();
        }

        public final void M1(long j8, float f8, k kVar) {
            if (K.this.f23375a.J0()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            K.this.f23377c = F.e.LayingOut;
            this.f23436m = j8;
            this.f23438o = f8;
            this.f23437n = kVar;
            this.f23433j = true;
            this.f23449z = false;
            h0 h0VarB = J.b(K.this.f23375a);
            if (K.this.z() || !f()) {
                c().r(false);
                K.this.U(false);
                this.f23424A = kVar;
                this.f23425B = j8;
                this.f23426C = f8;
                h0VarB.getSnapshotObserver().c(K.this.f23375a, false, this.f23427D);
                this.f23424A = null;
            } else {
                K.this.H().G2(j8, f8, kVar);
                L1();
            }
            K.this.f23377c = F.e.Idle;
        }

        public final boolean N1(long j8) {
            if (K.this.f23375a.J0()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            h0 h0VarB = J.b(K.this.f23375a);
            F fM0 = K.this.f23375a.m0();
            boolean z8 = true;
            K.this.f23375a.q1(K.this.f23375a.C() || (fM0 != null && fM0.C()));
            if (!K.this.f23375a.c0() && A1.b.g(w0(), j8)) {
                h0.d(h0VarB, K.this.f23375a, false, 2, null);
                K.this.f23375a.p1();
                return false;
            }
            c().s(false);
            P(d.f23457a);
            this.f23432i = true;
            long jA = K.this.H().a();
            J0(j8);
            K.this.R(j8);
            if (r.e(K.this.H().a(), jA) && K.this.H().y0() == y0() && K.this.H().h0() == h0()) {
                z8 = false;
            }
            I0(s.a(K.this.H().y0(), K.this.H().h0()));
            return z8;
        }

        public final void O1() {
            F fM0;
            try {
                this.f23429f = true;
                if (!this.f23433j) {
                    throw new IllegalStateException("replace called on unplaced item");
                }
                boolean zF = f();
                M1(this.f23436m, this.f23438o, this.f23437n);
                if (zF && !this.f23449z && (fM0 = K.this.f23375a.m0()) != null) {
                    F.k1(fM0, false, 1, null);
                }
                this.f23429f = false;
            } catch (Throwable th) {
                this.f23429f = false;
                throw th;
            }
        }

        @Override // p056g1.InterfaceC2338b
        public void P(k kVar) {
            B0.d dVarU0 = K.this.f23375a.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    kVar.invoke(((F) objArrR[i8]).T().r());
                    i8++;
                } while (i8 < iS);
            }
        }

        public final void P1(boolean z8) {
            this.f23445v = z8;
        }

        @Override // p038e1.K
        public int Q(AbstractC2230a abstractC2230a) {
            F fM0 = K.this.f23375a.m0();
            if ((fM0 != null ? fM0.V() : null) == F.e.Measuring) {
                c().u(true);
            } else {
                F fM1 = K.this.f23375a.m0();
                if ((fM1 != null ? fM1.V() : null) == F.e.LayingOut) {
                    c().t(true);
                }
            }
            this.f23435l = true;
            int iQ = K.this.H().Q(abstractC2230a);
            this.f23435l = false;
            return iQ;
        }

        public final void Q1(F.g gVar) {
            this.f23434k = gVar;
        }

        @Override // p056g1.InterfaceC2338b
        public void R() {
            this.f23446w = true;
            c().o();
            if (K.this.z()) {
                I1();
            }
            if (K.this.f23380f || (!this.f23435l && !q().k1() && K.this.z())) {
                K.this.f23379e = false;
                F.e eVarA = K.this.A();
                K.this.f23377c = F.e.LayingOut;
                K.this.V(false);
                F f8 = K.this.f23375a;
                J.b(f8).getSnapshotObserver().e(f8, false, this.f23447x);
                K.this.f23377c = eVarA;
                if (q().k1() && K.this.u()) {
                    requestLayout();
                }
                K.this.f23380f = false;
            }
            if (c().l()) {
                c().q(true);
            }
            if (c().g() && c().k()) {
                c().n();
            }
            this.f23446w = false;
        }

        public void R1(boolean z8) {
            this.f23441r = z8;
        }

        public final void S1(F f8) {
            F.g gVar;
            F fM0 = f8.m0();
            if (fM0 == null) {
                this.f23434k = F.g.NotUsed;
                return;
            }
            if (this.f23434k != F.g.NotUsed && !f8.C()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i8 = a.f23450a[fM0.V().ordinal()];
            if (i8 == 1) {
                gVar = F.g.InMeasureBlock;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + fM0.V());
                }
                gVar = F.g.InLayoutBlock;
            }
            this.f23434k = gVar;
        }

        public final boolean T1() {
            if ((e() == null && K.this.H().e() == null) || !this.f23439p) {
                return false;
            }
            this.f23439p = false;
            this.f23440q = K.this.H().e();
            return true;
        }

        @Override // p056g1.InterfaceC2338b
        public void V() {
            F.m1(K.this.f23375a, false, false, 3, null);
        }

        @Override // p038e1.InterfaceC2243n
        public int W(int i8) {
            J1();
            return K.this.H().W(i8);
        }

        @Override // p056g1.InterfaceC2338b
        public AbstractC2337a c() {
            return this.f23443t;
        }

        @Override // p038e1.K, p038e1.InterfaceC2243n
        public Object e() {
            return this.f23440q;
        }

        @Override // p056g1.InterfaceC2338b
        public boolean f() {
            return this.f23441r;
        }

        @Override // p038e1.InterfaceC2243n
        public int g(int i8) {
            J1();
            return K.this.H().g(i8);
        }

        @Override // p038e1.a0
        public int k0() {
            return K.this.H().k0();
        }

        public final List k1() {
            K.this.f23375a.A1();
            if (!this.f23445v) {
                return this.f23444u.k();
            }
            F f8 = K.this.f23375a;
            B0.d dVar = this.f23444u;
            B0.d dVarU0 = f8.u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    F f9 = (F) objArrR[i8];
                    if (dVar.s() <= i8) {
                        dVar.d(f9.T().F());
                    } else {
                        dVar.G(i8, f9.T().F());
                    }
                    i8++;
                } while (i8 < iS);
            }
            dVar.E(f8.F().size(), dVar.s());
            this.f23445v = false;
            return this.f23444u.k();
        }

        @Override // p056g1.InterfaceC2338b
        public Map m() {
            if (!this.f23435l) {
                if (K.this.A() == F.e.Measuring) {
                    c().s(true);
                    if (c().g()) {
                        K.this.L();
                    }
                } else {
                    c().r(true);
                }
            }
            q().q1(true);
            R();
            q().q1(false);
            return c().h();
        }

        public final A1.b n1() {
            if (this.f23432i) {
                return A1.b.b(w0());
            }
            return null;
        }

        public final boolean o1() {
            return this.f23446w;
        }

        @Override // p056g1.InterfaceC2338b
        public X q() {
            return K.this.f23375a.O();
        }

        public final F.g q1() {
            return this.f23434k;
        }

        @Override // p056g1.InterfaceC2338b
        public void requestLayout() {
            F.k1(K.this.f23375a, false, 1, null);
        }

        public final int t1() {
            return this.f23431h;
        }

        @Override // p056g1.InterfaceC2338b
        public InterfaceC2338b u() {
            K kT;
            F fM0 = K.this.f23375a.m0();
            if (fM0 == null || (kT = fM0.T()) == null) {
                return null;
            }
            return kT.r();
        }

        @Override // p038e1.a0
        public int v0() {
            return K.this.H().v0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f23459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8) {
            super(0);
            this.f23459b = j8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m205invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m205invoke() {
            P pE2 = K.this.H().e2();
            t.d(pE2);
            pE2.J(this.f23459b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m206invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m206invoke() {
            K.this.H().J(K.this.f23391q);
        }
    }

    public K(F f8) {
        this.f23375a = f8;
    }

    public final F.e A() {
        return this.f23377c;
    }

    public final InterfaceC2338b B() {
        return this.f23390p;
    }

    public final boolean C() {
        return this.f23382h;
    }

    public final boolean D() {
        return this.f23381g;
    }

    public final a E() {
        return this.f23390p;
    }

    public final b F() {
        return this.f23389o;
    }

    public final boolean G() {
        return this.f23378d;
    }

    public final X H() {
        return this.f23375a.j0().o();
    }

    public final int I() {
        return this.f23389o.y0();
    }

    public final void J() {
        this.f23389o.C1();
        a aVar = this.f23390p;
        if (aVar != null) {
            aVar.t1();
        }
    }

    public final void K() {
        this.f23389o.P1(true);
        a aVar = this.f23390p;
        if (aVar != null) {
            aVar.J1(true);
        }
    }

    public final void L() {
        this.f23379e = true;
        this.f23380f = true;
    }

    public final void M() {
        this.f23382h = true;
        this.f23383i = true;
    }

    public final void N() {
        this.f23381g = true;
    }

    public final void O() {
        this.f23378d = true;
    }

    public final void P() {
        F.e eVarV = this.f23375a.V();
        if (eVarV == F.e.LayingOut || eVarV == F.e.LookaheadLayingOut) {
            if (this.f23389o.o1()) {
                V(true);
            } else {
                U(true);
            }
        }
        if (eVarV == F.e.LookaheadLayingOut) {
            a aVar = this.f23390p;
            if (aVar == null || !aVar.g1()) {
                U(true);
            } else {
                V(true);
            }
        }
    }

    public final void Q(long j8) {
        this.f23377c = F.e.LookaheadMeasuring;
        this.f23381g = false;
        j0.h(J.b(this.f23375a).getSnapshotObserver(), this.f23375a, false, new c(j8), 2, null);
        M();
        if (L.a(this.f23375a)) {
            L();
        } else {
            O();
        }
        this.f23377c = F.e.Idle;
    }

    public final void R(long j8) {
        F.e eVar = this.f23377c;
        F.e eVar2 = F.e.Idle;
        if (eVar != eVar2) {
            throw new IllegalStateException("layout state is not idle before measure starts");
        }
        F.e eVar3 = F.e.Measuring;
        this.f23377c = eVar3;
        this.f23378d = false;
        this.f23391q = j8;
        J.b(this.f23375a).getSnapshotObserver().g(this.f23375a, false, this.f23392r);
        if (this.f23377c == eVar3) {
            L();
            this.f23377c = eVar2;
        }
    }

    public final void S() {
        AbstractC2337a abstractC2337aC;
        this.f23389o.c().p();
        a aVar = this.f23390p;
        if (aVar == null || (abstractC2337aC = aVar.c()) == null) {
            return;
        }
        abstractC2337aC.p();
    }

    public final void T(int i8) {
        int i9 = this.f23388n;
        this.f23388n = i8;
        if ((i9 == 0) != (i8 == 0)) {
            F fM0 = this.f23375a.m0();
            K kT = fM0 != null ? fM0.T() : null;
            if (kT != null) {
                if (i8 == 0) {
                    kT.T(kT.f23388n - 1);
                } else {
                    kT.T(kT.f23388n + 1);
                }
            }
        }
    }

    public final void U(boolean z8) {
        if (this.f23387m != z8) {
            this.f23387m = z8;
            if (z8 && !this.f23386l) {
                T(this.f23388n + 1);
            } else {
                if (z8 || this.f23386l) {
                    return;
                }
                T(this.f23388n - 1);
            }
        }
    }

    public final void V(boolean z8) {
        if (this.f23386l != z8) {
            this.f23386l = z8;
            if (z8 && !this.f23387m) {
                T(this.f23388n + 1);
            } else {
                if (z8 || this.f23387m) {
                    return;
                }
                T(this.f23388n - 1);
            }
        }
    }

    public final void W() {
        F fM0;
        if (this.f23389o.T1() && (fM0 = this.f23375a.m0()) != null) {
            F.m1(fM0, false, false, 3, null);
        }
        a aVar = this.f23390p;
        if (aVar == null || !aVar.O1()) {
            return;
        }
        if (L.a(this.f23375a)) {
            F fM1 = this.f23375a.m0();
            if (fM1 != null) {
                F.m1(fM1, false, false, 3, null);
                return;
            }
            return;
        }
        F fM2 = this.f23375a.m0();
        if (fM2 != null) {
            F.i1(fM2, false, false, 3, null);
        }
    }

    public final void q() {
        if (this.f23390p == null) {
            this.f23390p = new a();
        }
    }

    public final InterfaceC2338b r() {
        return this.f23389o;
    }

    public final int s() {
        return this.f23388n;
    }

    public final boolean t() {
        return this.f23387m;
    }

    public final boolean u() {
        return this.f23386l;
    }

    public final boolean v() {
        return this.f23376b;
    }

    public final int w() {
        return this.f23389o.h0();
    }

    public final A1.b x() {
        return this.f23389o.n1();
    }

    public final A1.b y() {
        a aVar = this.f23390p;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public final boolean z() {
        return this.f23379e;
    }
}
