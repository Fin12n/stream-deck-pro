package p082j0;

import A1.c;
import C6.G;
import Q6.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2253y;
import p038e1.J;
import p038e1.a0;
import p047f1.d;
import p047f1.j;
import p047f1.l;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: j0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2617v implements InterfaceC2253y, d, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f28066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f28067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f28068d;

    /* JADX INFO: renamed from: j0.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f28069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28071c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, int i8, int i9) {
            super(1);
            this.f28069a = a0Var;
            this.f28070b = i8;
            this.f28071c = i9;
        }

        public final void b(a0.a aVar) {
            a0.a.f(aVar, this.f28069a, this.f28070b, this.f28071c, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public C2617v(d0 d0Var) {
        this.f28066b = d0Var;
        this.f28067c = l1.e(d0Var, null, 2, null);
        this.f28068d = l1.e(d0Var, null, 2, null);
    }

    @Override // p038e1.InterfaceC2253y
    public I c(J j8, p038e1.G g8, long j9) {
        int iC = p().c(j8, j8.getLayoutDirection());
        int iA = p().a(j8);
        int iB = p().b(j8, j8.getLayoutDirection()) + iC;
        int iD = p().d(j8) + iA;
        a0 a0VarJ = g8.J(c.i(j9, -iB, -iD));
        return J.X0(j8, c.g(j9, a0VarJ.y0() + iB), c.f(j9, a0VarJ.h0() + iD), null, new a(a0VarJ, iC, iA), 4, null);
    }

    @Override // p047f1.d
    public void d(p047f1.k kVar) {
        d0 d0Var = (d0) kVar.u(g0.a());
        u(f0.c(this.f28066b, d0Var));
        s(f0.e(d0Var, this.f28066b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2617v) {
            return t.c(((C2617v) obj).f28066b, this.f28066b);
        }
        return false;
    }

    @Override // p047f1.j
    public l getKey() {
        return g0.a();
    }

    public int hashCode() {
        return this.f28066b.hashCode();
    }

    public final d0 k() {
        return (d0) this.f28068d.getValue();
    }

    public final d0 p() {
        return (d0) this.f28067c.getValue();
    }

    @Override // p047f1.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d0 getValue() {
        return k();
    }

    public final void s(d0 d0Var) {
        this.f28068d.setValue(d0Var);
    }

    public final void u(d0 d0Var) {
        this.f28067c.setValue(d0Var);
    }
}
