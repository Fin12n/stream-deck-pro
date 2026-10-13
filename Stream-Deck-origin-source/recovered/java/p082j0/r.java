package p082j0;

import A1.b;
import C6.G;
import L0.i;
import Q6.k;
import S6.c;
import W6.n;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EnumC2612p f28054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f28055o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f28056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f28056a = a0Var;
        }

        public final void b(a0.a aVar) {
            a0.a.j(aVar, this.f28056a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public r(EnumC2612p enumC2612p, float f8) {
        this.f28054n = enumC2612p;
        this.f28055o = f8;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        int iP;
        int iN;
        int iM;
        int iK;
        if (!b.j(j9) || this.f28054n == EnumC2612p.Vertical) {
            iP = b.p(j9);
            iN = b.n(j9);
        } else {
            iP = n.k(c.d(b.n(j9) * this.f28055o), b.p(j9), b.n(j9));
            iN = iP;
        }
        if (!b.i(j9) || this.f28054n == EnumC2612p.Horizontal) {
            int iO = b.o(j9);
            iM = b.m(j9);
            iK = iO;
        } else {
            iK = n.k(c.d(b.m(j9) * this.f28055o), b.o(j9), b.m(j9));
            iM = iK;
        }
        a0 a0VarJ = g8.J(A1.c.a(iP, iN, iK, iM));
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final void d2(EnumC2612p enumC2612p) {
        this.f28054n = enumC2612p;
    }

    public final void e2(float f8) {
        this.f28055o = f8;
    }
}
