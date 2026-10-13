package p082j0;

import A1.c;
import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public J f27860n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f27861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f27862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L f27863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, J j8, L l8) {
            super(1);
            this.f27861a = a0Var;
            this.f27862b = j8;
            this.f27863c = l8;
        }

        public final void b(a0.a aVar) {
            a0.a.f(aVar, this.f27861a, this.f27862b.V0(this.f27863c.d2().c(this.f27862b.getLayoutDirection())), this.f27862b.V0(this.f27863c.d2().d()), 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public L(J j8) {
        this.f27860n = j8;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        float f8 = 0;
        if (h.j(this.f27860n.c(j8.getLayoutDirection()), h.m(f8)) < 0 || h.j(this.f27860n.d(), h.m(f8)) < 0 || h.j(this.f27860n.b(j8.getLayoutDirection()), h.m(f8)) < 0 || h.j(this.f27860n.a(), h.m(f8)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iV0 = j8.V0(this.f27860n.c(j8.getLayoutDirection())) + j8.V0(this.f27860n.b(j8.getLayoutDirection()));
        int iV1 = j8.V0(this.f27860n.d()) + j8.V0(this.f27860n.a());
        a0 a0VarJ = g8.J(c.i(j9, -iV0, -iV1));
        return J.X0(j8, c.g(j9, a0VarJ.y0() + iV0), c.f(j9, a0VarJ.h0() + iV1), null, new a(a0VarJ, j8, this), 4, null);
    }

    public final J d2() {
        return this.f27860n;
    }

    public final void e2(J j8) {
        this.f27860n = j8;
    }
}
