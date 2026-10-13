package p082j0;

import A1.n;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f27843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27844o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f27846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f27847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8, a0 a0Var) {
            super(1);
            this.f27846b = j8;
            this.f27847c = a0Var;
        }

        public final void b(a0.a aVar) {
            long jN = ((n) G.this.d2().invoke(this.f27846b)).n();
            if (G.this.e2()) {
                a0.a.n(aVar, this.f27847c, n.j(jN), n.k(jN), 0.0f, null, 12, null);
            } else {
                a0.a.r(aVar, this.f27847c, n.j(jN), n.k(jN), 0.0f, null, 12, null);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return C6.G.f1419a;
        }
    }

    public G(k kVar, boolean z8) {
        this.f27843n = kVar;
        this.f27844o = z8;
    }

    @Override // p056g1.A
    public I c(J j8, p038e1.G g8, long j9) {
        a0 a0VarJ = g8.J(j9);
        return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(j8, a0VarJ), 4, null);
    }

    public final k d2() {
        return this.f27843n;
    }

    public final boolean e2() {
        return this.f27844o;
    }

    public final void f2(k kVar) {
        this.f27843n = kVar;
    }

    public final void g2(boolean z8) {
        this.f27844o = z8;
    }
}
