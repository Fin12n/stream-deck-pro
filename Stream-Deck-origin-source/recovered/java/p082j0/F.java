package p082j0;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27839p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f27841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f27842c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, J j8) {
            super(1);
            this.f27841b = a0Var;
            this.f27842c = j8;
        }

        public final void b(a0.a aVar) {
            if (F.this.d2()) {
                a0.a.j(aVar, this.f27841b, this.f27842c.V0(F.this.e2()), this.f27842c.V0(F.this.f2()), 0.0f, 4, null);
            } else {
                a0.a.f(aVar, this.f27841b, this.f27842c.V0(F.this.e2()), this.f27842c.V0(F.this.f2()), 0.0f, 4, null);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ F(float f8, float f9, boolean z8, AbstractC2633k abstractC2633k) {
        this(f8, f9, z8);
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        a0 a0VarJ = g8.J(j9);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ, j8), 4, null);
    }

    public final boolean d2() {
        return this.f27839p;
    }

    public final float e2() {
        return this.f27837n;
    }

    public final float f2() {
        return this.f27838o;
    }

    public final void g2(boolean z8) {
        this.f27839p = z8;
    }

    public final void h2(float f8) {
        this.f27837n = f8;
    }

    public final void i2(float f8) {
        this.f27838o = f8;
    }

    public F(float f8, float f9, boolean z8) {
        this.f27837n = f8;
        this.f27838o = f9;
        this.f27839p = z8;
    }
}
