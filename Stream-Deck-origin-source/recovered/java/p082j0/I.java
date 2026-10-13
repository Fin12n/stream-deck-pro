package p082j0;

import A1.c;
import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27852r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f27854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f27855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, J j8) {
            super(1);
            this.f27854b = a0Var;
            this.f27855c = j8;
        }

        public final void b(a0.a aVar) {
            if (I.this.d2()) {
                a0.a.j(aVar, this.f27854b, this.f27855c.V0(I.this.e2()), this.f27855c.V0(I.this.f2()), 0.0f, 4, null);
            } else {
                a0.a.f(aVar, this.f27854b, this.f27855c.V0(I.this.e2()), this.f27855c.V0(I.this.f2()), 0.0f, 4, null);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ I(float f8, float f9, float f10, float f11, boolean z8, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, z8);
    }

    @Override // p056g1.A
    public p038e1.I c(J j8, p038e1.G g8, long j9) {
        int iV0 = j8.V0(this.f27848n) + j8.V0(this.f27850p);
        int iV1 = j8.V0(this.f27849o) + j8.V0(this.f27851q);
        a0 a0VarJ = g8.J(c.i(j9, -iV0, -iV1));
        return J.X0(j8, c.g(j9, a0VarJ.y0() + iV0), c.f(j9, a0VarJ.h0() + iV1), null, new a(a0VarJ, j8), 4, null);
    }

    public final boolean d2() {
        return this.f27852r;
    }

    public final float e2() {
        return this.f27848n;
    }

    public final float f2() {
        return this.f27849o;
    }

    public final void g2(float f8) {
        this.f27851q = f8;
    }

    public final void h2(float f8) {
        this.f27850p = f8;
    }

    public final void i2(boolean z8) {
        this.f27852r = z8;
    }

    public final void j2(float f8) {
        this.f27848n = f8;
    }

    public final void k2(float f8) {
        this.f27849o = f8;
    }

    public I(float f8, float f9, float f10, float f11, boolean z8) {
        this.f27848n = f8;
        this.f27849o = f9;
        this.f27850p = f10;
        this.f27851q = f11;
        this.f27852r = z8;
    }

    public /* synthetic */ I(float f8, float f9, float f10, float f11, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.m(0) : f8, (i8 & 2) != 0 ? h.m(0) : f9, (i8 & 4) != 0 ? h.m(0) : f10, (i8 & 8) != 0 ? h.m(0) : f11, z8, null);
    }
}
