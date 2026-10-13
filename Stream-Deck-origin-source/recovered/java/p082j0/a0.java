package p082j0;

import A1.b;
import A1.c;
import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import W6.n;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2243n;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27912o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p038e1.a0 f27913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p038e1.a0 a0Var) {
            super(1);
            this.f27913a = a0Var;
        }

        public final void b(e1.a0.a aVar) {
            e1.a0.a.j(aVar, this.f27913a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((e1.a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ a0(float f8, float f9, AbstractC2633k abstractC2633k) {
        this(f8, f9);
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        float f8 = this.f27911n;
        h.a aVar = h.f432b;
        p038e1.a0 a0VarJ = g8.J(c.a((h.t(f8, aVar.c()) || b.p(j9) != 0) ? b.p(j9) : n.d(n.g(j8.V0(this.f27911n), b.n(j9)), 0), b.n(j9), (h.t(this.f27912o, aVar.c()) || b.o(j9) != 0) ? b.o(j9) : n.d(n.g(j8.V0(this.f27912o), b.m(j9)), 0), b.m(j9)));
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final void d2(float f8) {
        this.f27912o = f8;
    }

    public final void e2(float f8) {
        this.f27911n = f8;
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return n.d(interfaceC2243n.G(i8), !h.t(this.f27911n, h.f432b.c()) ? interfaceC2244o.V0(this.f27911n) : 0);
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return n.d(interfaceC2243n.W(i8), !h.t(this.f27912o, h.f432b.c()) ? interfaceC2244o.V0(this.f27912o) : 0);
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return n.d(interfaceC2243n.F(i8), !h.t(this.f27911n, h.f432b.c()) ? interfaceC2244o.V0(this.f27911n) : 0);
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        return n.d(interfaceC2243n.g(i8), !h.t(this.f27912o, h.f432b.c()) ? interfaceC2244o.V0(this.f27912o) : 0);
    }

    public /* synthetic */ a0(float f8, float f9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.f432b.c() : f8, (i8 & 2) != 0 ? h.f432b.c() : f9, null);
    }

    public a0(float f8, float f9) {
        this.f27911n = f8;
        this.f27912o = f9;
    }
}
