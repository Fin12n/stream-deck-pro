package p082j0;

import A1.b;
import A1.c;
import A1.n;
import A1.r;
import A1.s;
import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EnumC2612p f28028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f28030p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f28033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J f28035e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, a0 a0Var, int i9, J j8) {
            super(1);
            this.f28032b = i8;
            this.f28033c = a0Var;
            this.f28034d = i9;
            this.f28035e = j8;
        }

        public final void b(a0.a aVar) {
            a0.a.h(aVar, this.f28033c, ((n) k0.this.d2().invoke(r.b(s.a(this.f28032b - this.f28033c.y0(), this.f28034d - this.f28033c.h0())), this.f28035e.getLayoutDirection())).n(), 0.0f, 2, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public k0(EnumC2612p enumC2612p, boolean z8, o oVar) {
        this.f28028n = enumC2612p;
        this.f28029o = z8;
        this.f28030p = oVar;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        EnumC2612p enumC2612p = this.f28028n;
        EnumC2612p enumC2612p2 = EnumC2612p.Vertical;
        int iP = enumC2612p != enumC2612p2 ? 0 : b.p(j9);
        EnumC2612p enumC2612p3 = this.f28028n;
        EnumC2612p enumC2612p4 = EnumC2612p.Horizontal;
        a0 a0VarJ = g8.J(c.a(iP, (this.f28028n == enumC2612p2 || !this.f28029o) ? b.n(j9) : Integer.MAX_VALUE, enumC2612p3 == enumC2612p4 ? b.o(j9) : 0, (this.f28028n == enumC2612p4 || !this.f28029o) ? b.m(j9) : Integer.MAX_VALUE));
        int iK = W6.n.k(a0VarJ.y0(), b.p(j9), b.n(j9));
        int iK2 = W6.n.k(a0VarJ.h0(), b.o(j9), b.m(j9));
        return J.X0(j8, iK, iK2, null, new a(iK, a0VarJ, iK2, j8), 4, null);
    }

    public final o d2() {
        return this.f28030p;
    }

    public final void e2(o oVar) {
        this.f28030p = oVar;
    }

    public final void f2(EnumC2612p enumC2612p) {
        this.f28028n = enumC2612p;
    }

    public final void g2(boolean z8) {
        this.f28029o = z8;
    }
}
