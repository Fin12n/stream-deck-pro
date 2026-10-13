package p056g1;

import A1.s;
import L0.i;
import Q6.k;
import R0.C1598l0;
import R0.F0;
import R0.G0;
import R0.InterfaceC1586f0;
import R0.M;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2230a;
import p038e1.C2242m;
import p038e1.I;
import p038e1.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B extends X {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final a f23308Y = new a(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final F0 f23309Z;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public A f23310V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public A1.b f23311W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public P f23312X;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b extends P {
        public b() {
            super(B.this);
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int F(int i8) {
            A aB3 = B.this.b3();
            P pE2 = B.this.c3().e2();
            t.d(pE2);
            return aB3.o(this, pE2, i8);
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int G(int i8) {
            A aB3 = B.this.b3();
            P pE2 = B.this.c3().e2();
            t.d(pE2);
            return aB3.g(this, pE2, i8);
        }

        @Override // p038e1.G
        public a0 J(long j8) {
            B b8 = B.this;
            J0(j8);
            b8.f23311W = A1.b.b(j8);
            A aB3 = b8.b3();
            P pE2 = b8.c3().e2();
            t.d(pE2);
            N1(aB3.c(this, pE2, j8));
            return this;
        }

        @Override // p056g1.O
        public int L0(AbstractC2230a abstractC2230a) {
            int iB = C.b(this, abstractC2230a);
            E1().put(abstractC2230a, Integer.valueOf(iB));
            return iB;
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int W(int i8) {
            A aB3 = B.this.b3();
            P pE2 = B.this.c3().e2();
            t.d(pE2);
            return aB3.n(this, pE2, i8);
        }

        @Override // p056g1.P, p038e1.InterfaceC2243n
        public int g(int i8) {
            A aB3 = B.this.b3();
            P pE2 = B.this.c3().e2();
            t.d(pE2);
            return aB3.t(this, pE2, i8);
        }
    }

    static {
        F0 f0A = M.a();
        f0A.t(C1598l0.f9405b.b());
        f0A.w(1.0f);
        f0A.s(G0.f9302a.b());
        f23309Z = f0A;
    }

    public B(F f8, A a8) {
        super(f8);
        this.f23310V = a8;
        this.f23312X = f8.Z() != null ? new b() : null;
    }

    @Override // p056g1.X, p038e1.a0
    public void D0(long j8, float f8, k kVar) {
        super.D0(j8, f8, kVar);
        if (n1()) {
            return;
        }
        C2();
        T0().d();
    }

    @Override // p056g1.X
    public void E2(InterfaceC1586f0 interfaceC1586f0) {
        c3().S1(interfaceC1586f0);
        if (J.b(h1()).getShowLayoutBounds()) {
            T1(interfaceC1586f0, f23309Z);
        }
    }

    @Override // p038e1.InterfaceC2243n
    public int F(int i8) {
        A a8 = this.f23310V;
        C2242m c2242m = a8 instanceof C2242m ? (C2242m) a8 : null;
        return c2242m != null ? c2242m.l2(this, c3(), i8) : a8.o(this, c3(), i8);
    }

    @Override // p038e1.InterfaceC2243n
    public int G(int i8) {
        A a8 = this.f23310V;
        C2242m c2242m = a8 instanceof C2242m ? (C2242m) a8 : null;
        return c2242m != null ? c2242m.j2(this, c3(), i8) : a8.g(this, c3(), i8);
    }

    @Override // p038e1.G
    public a0 J(long j8) {
        B b8;
        I iC;
        J0(j8);
        A aB3 = b3();
        if (aB3 instanceof C2242m) {
            C2242m c2242m = (C2242m) aB3;
            X xC3 = c3();
            P pE2 = e2();
            t.d(pE2);
            I iT0 = pE2.T0();
            long jA = s.a(iT0.g(), iT0.f());
            A1.b bVar = this.f23311W;
            t.d(bVar);
            b8 = this;
            iC = c2242m.g2(b8, xC3, j8, jA, bVar.s());
        } else {
            b8 = this;
            iC = aB3.c(this, c3(), j8);
        }
        J2(iC);
        B2();
        return b8;
    }

    @Override // p056g1.O
    public int L0(AbstractC2230a abstractC2230a) {
        P pE2 = e2();
        return pE2 != null ? pE2.D1(abstractC2230a) : C.b(this, abstractC2230a);
    }

    @Override // p056g1.X
    public void V1() {
        if (e2() == null) {
            e3(new b());
        }
    }

    @Override // p038e1.InterfaceC2243n
    public int W(int i8) {
        A a8 = this.f23310V;
        C2242m c2242m = a8 instanceof C2242m ? (C2242m) a8 : null;
        return c2242m != null ? c2242m.k2(this, c3(), i8) : a8.n(this, c3(), i8);
    }

    public final A b3() {
        return this.f23310V;
    }

    public final X c3() {
        X xJ2 = j2();
        t.d(xJ2);
        return xJ2;
    }

    public final void d3(A a8) {
        this.f23310V = a8;
    }

    @Override // p056g1.X
    public P e2() {
        return this.f23312X;
    }

    public void e3(P p8) {
        this.f23312X = p8;
    }

    @Override // p038e1.InterfaceC2243n
    public int g(int i8) {
        A a8 = this.f23310V;
        C2242m c2242m = a8 instanceof C2242m ? (C2242m) a8 : null;
        return c2242m != null ? c2242m.i2(this, c3(), i8) : a8.t(this, c3(), i8);
    }

    @Override // p056g1.X
    public i.c i2() {
        return this.f23310V.I0();
    }
}
