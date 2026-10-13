package p091k0;

import A1.b;
import C6.G;
import L0.i;
import Q6.k;
import S6.c;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A extends i.c implements p056g1.A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f28385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q1 f28386o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q1 f28387p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f28388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f28388a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.f(aVar, this.f28388a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ A(float f8, q1 q1Var, q1 q1Var2, int i8, AbstractC2633k abstractC2633k) {
        this(f8, (i8 & 2) != 0 ? null : q1Var, (i8 & 4) != 0 ? null : q1Var2);
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        q1 q1Var = this.f28386o;
        int iD = (q1Var == null || ((Number) q1Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : c.d(((Number) q1Var.getValue()).floatValue() * this.f28385n);
        q1 q1Var2 = this.f28387p;
        int iD2 = (q1Var2 == null || ((Number) q1Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : c.d(((Number) q1Var2.getValue()).floatValue() * this.f28385n);
        int iP = iD != Integer.MAX_VALUE ? iD : b.p(j9);
        int iO = iD2 != Integer.MAX_VALUE ? iD2 : b.o(j9);
        if (iD == Integer.MAX_VALUE) {
            iD = b.n(j9);
        }
        if (iD2 == Integer.MAX_VALUE) {
            iD2 = b.m(j9);
        }
        a0 a0VarJ = g8.J(A1.c.a(iP, iD, iO, iD2));
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final void d2(float f8) {
        this.f28385n = f8;
    }

    public final void e2(q1 q1Var) {
        this.f28387p = q1Var;
    }

    public final void f2(q1 q1Var) {
        this.f28386o = q1Var;
    }

    public A(float f8, q1 q1Var, q1 q1Var2) {
        this.f28385n = f8;
        this.f28386o = q1Var;
        this.f28387p = q1Var2;
    }
}
