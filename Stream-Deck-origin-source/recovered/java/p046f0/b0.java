package p046f0;

import A1.b;
import C6.G;
import L0.i;
import Q6.k;
import W6.n;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;
import p055g0.B;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f21429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21431p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f21433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f21434c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, a0 a0Var) {
            super(1);
            this.f21433b = i8;
            this.f21434c = a0Var;
        }

        public final void b(a0.a aVar) {
            int iK = n.k(b0.this.d2().m(), 0, this.f21433b);
            int i8 = b0.this.e2() ? iK - this.f21433b : -iK;
            a0.a.n(aVar, this.f21434c, b0.this.f2() ? 0 : i8, b0.this.f2() ? i8 : 0, 0.0f, null, 12, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public b0(a0 a0Var, boolean z8, boolean z9) {
        this.f21429n = a0Var;
        this.f21430o = z8;
        this.f21431p = z9;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        AbstractC2283k.a(j9, this.f21431p ? B.Vertical : B.Horizontal);
        a0 a0VarJ = g8.J(b.e(j9, 0, this.f21431p ? b.n(j9) : Integer.MAX_VALUE, 0, this.f21431p ? Integer.MAX_VALUE : b.m(j9), 5, null));
        int iG = n.g(a0VarJ.y0(), b.n(j9));
        int iG2 = n.g(a0VarJ.h0(), b.m(j9));
        int iH0 = a0VarJ.h0() - iG2;
        int iY0 = a0VarJ.y0() - iG;
        if (!this.f21431p) {
            iH0 = iY0;
        }
        this.f21429n.n(iH0);
        this.f21429n.p(this.f21431p ? iG2 : iG);
        return J.X0(j8, iG, iG2, null, new a(iH0, a0VarJ), 4, null);
    }

    public final a0 d2() {
        return this.f21429n;
    }

    public final boolean e2() {
        return this.f21430o;
    }

    public final boolean f2() {
        return this.f21431p;
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f21431p ? interfaceC2243n.G(Integer.MAX_VALUE) : interfaceC2243n.G(i8);
    }

    public final void g2(boolean z8) {
        this.f21430o = z8;
    }

    public final void h2(a0 a0Var) {
        this.f21429n = a0Var;
    }

    public final void i2(boolean z8) {
        this.f21431p = z8;
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f21431p ? interfaceC2243n.W(i8) : interfaceC2243n.W(Integer.MAX_VALUE);
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f21431p ? interfaceC2243n.F(Integer.MAX_VALUE) : interfaceC2243n.F(i8);
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return this.f21431p ? interfaceC2243n.g(i8) : interfaceC2243n.g(Integer.MAX_VALUE);
    }
}
