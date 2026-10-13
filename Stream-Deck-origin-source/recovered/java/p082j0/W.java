package p082j0;

import A1.b;
import A1.c;
import A1.d;
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
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27900r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f27901a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f27901a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.j(aVar, this.f27901a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ W(float f8, float f9, float f10, float f11, boolean z8, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, z8);
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        long jA;
        long jD2 = d2(j8);
        if (this.f27900r) {
            jA = c.e(j9, jD2);
        } else {
            float f8 = this.f27896n;
            h.a aVar = h.f432b;
            jA = c.a(!h.t(f8, aVar.c()) ? b.p(jD2) : n.g(b.p(j9), b.n(jD2)), !h.t(this.f27898p, aVar.c()) ? b.n(jD2) : n.d(b.n(j9), b.p(jD2)), !h.t(this.f27897o, aVar.c()) ? b.o(jD2) : n.g(b.o(j9), b.m(jD2)), !h.t(this.f27899q, aVar.c()) ? b.m(jD2) : n.d(b.m(j9), b.o(jD2)));
        }
        a0 a0VarJ = g8.J(jA);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final long d2(d dVar) {
        int iD;
        int iD2;
        float f8 = this.f27898p;
        h.a aVar = h.f432b;
        int i8 = 0;
        int iD3 = !h.t(f8, aVar.c()) ? n.d(dVar.V0(this.f27898p), 0) : Integer.MAX_VALUE;
        int iD4 = !h.t(this.f27899q, aVar.c()) ? n.d(dVar.V0(this.f27899q), 0) : Integer.MAX_VALUE;
        if (h.t(this.f27896n, aVar.c()) || (iD = n.d(n.g(dVar.V0(this.f27896n), iD3), 0)) == Integer.MAX_VALUE) {
            iD = 0;
        }
        if (!h.t(this.f27897o, aVar.c()) && (iD2 = n.d(n.g(dVar.V0(this.f27897o), iD4), 0)) != Integer.MAX_VALUE) {
            i8 = iD2;
        }
        return c.a(iD, iD3, i8, iD4);
    }

    public final void e2(boolean z8) {
        this.f27900r = z8;
    }

    public final void f2(float f8) {
        this.f27899q = f8;
    }

    @Override // p056g1.A
    public int g(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        long jD2 = d2(interfaceC2244o);
        return b.l(jD2) ? b.n(jD2) : c.g(jD2, interfaceC2243n.G(i8));
    }

    public final void g2(float f8) {
        this.f27898p = f8;
    }

    public final void h2(float f8) {
        this.f27897o = f8;
    }

    public final void i2(float f8) {
        this.f27896n = f8;
    }

    @Override // p056g1.A
    public int n(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        long jD2 = d2(interfaceC2244o);
        return b.k(jD2) ? b.m(jD2) : c.f(jD2, interfaceC2243n.W(i8));
    }

    @Override // p056g1.A
    public int o(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        long jD2 = d2(interfaceC2244o);
        return b.l(jD2) ? b.n(jD2) : c.g(jD2, interfaceC2243n.F(i8));
    }

    @Override // p056g1.A
    public int t(InterfaceC2244o interfaceC2244o, InterfaceC2243n interfaceC2243n, int i8) {
        long jD2 = d2(interfaceC2244o);
        return b.k(jD2) ? b.m(jD2) : c.f(jD2, interfaceC2243n.g(i8));
    }

    public /* synthetic */ W(float f8, float f9, float f10, float f11, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.f432b.c() : f8, (i8 & 2) != 0 ? h.f432b.c() : f9, (i8 & 4) != 0 ? h.f432b.c() : f10, (i8 & 8) != 0 ? h.f432b.c() : f11, z8, null);
    }

    public W(float f8, float f9, float f10, float f11, boolean z8) {
        this.f27896n = f8;
        this.f27897o = f9;
        this.f27898p = f10;
        this.f27899q = f11;
        this.f27900r = z8;
    }
}
