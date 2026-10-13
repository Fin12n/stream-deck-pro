package p056g1;

import B0.d;
import Q6.k;
import R0.C1598l0;
import R0.F0;
import R0.G0;
import R0.InterfaceC1586f0;
import R0.M;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2230a;
import p038e1.a0;

/* JADX INFO: renamed from: g1.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2357v extends X {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f23660X = new a(null);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final F0 f23661Y;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final s0 f23662V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public P f23663W;

    /* JADX INFO: renamed from: g1.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: g1.v$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b extends P {
        public b() {
            super(C2357v.this);
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int F(int i8) {
            return h1().R().j(i8);
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int G(int i8) {
            return h1().R().e(i8);
        }

        @Override // p056g1.P
        public void I1() {
            K.a aVarY = h1().Y();
            t.d(aVarY);
            aVarY.G1();
        }

        @Override // p038e1.G
        public a0 J(long j8) {
            J0(j8);
            d dVarU0 = h1().u0();
            int iS = dVarU0.s();
            if (iS > 0) {
                Object[] objArrR = dVarU0.r();
                int i8 = 0;
                do {
                    K.a aVarY = ((F) objArrR[i8]).Y();
                    t.d(aVarY);
                    aVarY.K1(F.g.NotUsed);
                    i8++;
                } while (i8 < iS);
            }
            N1(h1().d0().d(this, h1().D(), j8));
            return this;
        }

        @Override // p056g1.O
        public int L0(AbstractC2230a abstractC2230a) {
            Integer num = (Integer) C1().m().get(abstractC2230a);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            E1().put(abstractC2230a, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int W(int i8) {
            return h1().R().i(i8);
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int g(int i8) {
            return h1().R().d(i8);
        }
    }

    static {
        F0 f0A = M.a();
        f0A.t(C1598l0.f9405b.c());
        f0A.w(1.0f);
        f0A.s(G0.f9302a.b());
        f23661Y = f0A;
    }

    public C2357v(F f8) {
        super(f8);
        this.f23662V = new s0();
        i2().c2(this);
        this.f23663W = f8.Z() != null ? new b() : null;
    }

    @Override // p056g1.X, p038e1.a0
    public void D0(long j8, float f8, k kVar) {
        super.D0(j8, f8, kVar);
        if (n1()) {
            return;
        }
        C2();
        h1().b0().L1();
    }

    @Override // p056g1.X
    public void E2(InterfaceC1586f0 interfaceC1586f0) {
        h0 h0VarB = J.b(h1());
        d dVarT0 = h1().t0();
        int iS = dVarT0.s();
        if (iS > 0) {
            Object[] objArrR = dVarT0.r();
            int i8 = 0;
            do {
                F f8 = (F) objArrR[i8];
                if (f8.f()) {
                    f8.A(interfaceC1586f0);
                }
                i8++;
            } while (i8 < iS);
        }
        if (h0VarB.getShowLayoutBounds()) {
            T1(interfaceC1586f0, f23661Y);
        }
    }

    @Override // p038e1.InterfaceC2243n
    public int F(int i8) {
        return h1().R().h(i8);
    }

    @Override // p038e1.InterfaceC2243n
    public int G(int i8) {
        return h1().R().c(i8);
    }

    @Override // p038e1.G
    public a0 J(long j8) {
        J0(j8);
        d dVarU0 = h1().u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            Object[] objArrR = dVarU0.r();
            int i8 = 0;
            do {
                ((F) objArrR[i8]).b0().Q1(F.g.NotUsed);
                i8++;
            } while (i8 < iS);
        }
        J2(h1().d0().d(this, h1().E(), j8));
        B2();
        return this;
    }

    @Override // p056g1.O
    public int L0(AbstractC2230a abstractC2230a) {
        P pE2 = e2();
        if (pE2 != null) {
            return pE2.L0(abstractC2230a);
        }
        Integer num = (Integer) Z1().m().get(abstractC2230a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p056g1.X
    public void V1() {
        if (e2() == null) {
            a3(new b());
        }
    }

    @Override // p038e1.InterfaceC2243n
    public int W(int i8) {
        return h1().R().g(i8);
    }

    @Override // p056g1.X
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public s0 i2() {
        return this.f23662V;
    }

    public void a3(P p8) {
        this.f23663W = p8;
    }

    @Override // p056g1.X
    public P e2() {
        return this.f23663W;
    }

    @Override // p038e1.InterfaceC2243n
    public int g(int i8) {
        return h1().R().b(i8);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    @Override // p056g1.X
    public void s2(X.f fVar, long j8, C2355t c2355t, boolean z8, boolean z9) {
        boolean z10;
        boolean z11 = false;
        if (fVar.d(h1())) {
            if (Y2(j8)) {
                z10 = z9;
            } else {
                if (z8) {
                    float fR1 = R1(j8, f2());
                    if (!Float.isInfinite(fR1) && !Float.isNaN(fR1)) {
                        z10 = false;
                    }
                }
                z10 = z9;
            }
            z11 = true;
        } else {
            z10 = z9;
        }
        if (z11) {
            int i8 = c2355t.f23647c;
            d dVarT0 = h1().t0();
            int iS = dVarT0.s();
            if (iS > 0) {
                Object[] objArrR = dVarT0.r();
                int i9 = iS - 1;
                do {
                    F f8 = (F) objArrR[i9];
                    if (f8.f()) {
                        fVar.c(f8, j8, c2355t, z8, z10);
                        if (!c2355t.E()) {
                            i9--;
                        } else {
                            if (!f8.k0().N2()) {
                                break;
                            }
                            c2355t.c();
                            i9--;
                        }
                    } else {
                        i9--;
                    }
                } while (i9 >= 0);
            }
            c2355t.f23647c = i8;
        }
    }
}
