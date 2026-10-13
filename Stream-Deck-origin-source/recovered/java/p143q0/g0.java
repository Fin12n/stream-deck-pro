package p143q0;

import A1.b;
import C6.G;
import Q6.k;
import S6.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2253y;
import p038e1.J;
import p038e1.a0;
import p055g0.B;
import p176u1.W;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements InterfaceC2253y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f31665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f31667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f31668e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f31669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f31670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f31671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f31672d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8, g0 g0Var, a0 a0Var, int i8) {
            super(1);
            this.f31669a = j8;
            this.f31670b = g0Var;
            this.f31671c = a0Var;
            this.f31672d = i8;
        }

        public final void b(a0.a aVar) {
            J j8 = this.f31669a;
            int iK = this.f31670b.k();
            W wS = this.f31670b.s();
            X x8 = (X) this.f31670b.r().invoke();
            this.f31670b.p().j(B.Vertical, Q.b(j8, iK, wS, x8 != null ? x8.f() : null, false, this.f31671c.y0()), this.f31672d, this.f31671c.h0());
            a0.a.j(aVar, this.f31671c, 0, c.d(-this.f31670b.p().d()), 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public g0(S s8, int i8, W w8, Function0 function0) {
        this.f31665b = s8;
        this.f31666c = i8;
        this.f31667d = w8;
        this.f31668e = function0;
    }

    @Override // p038e1.InterfaceC2253y
    public I c(J j8, p038e1.G g8, long j9) {
        a0 a0VarJ = g8.J(b.e(j9, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(a0VarJ.h0(), b.m(j9));
        return J.X0(j8, a0VarJ.y0(), iMin, null, new a(j8, this, a0VarJ, iMin), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return t.c(this.f31665b, g0Var.f31665b) && this.f31666c == g0Var.f31666c && t.c(this.f31667d, g0Var.f31667d) && t.c(this.f31668e, g0Var.f31668e);
    }

    public int hashCode() {
        return (((((this.f31665b.hashCode() * 31) + Integer.hashCode(this.f31666c)) * 31) + this.f31667d.hashCode()) * 31) + this.f31668e.hashCode();
    }

    public final int k() {
        return this.f31666c;
    }

    public final S p() {
        return this.f31665b;
    }

    public final Function0 r() {
        return this.f31668e;
    }

    public final W s() {
        return this.f31667d;
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f31665b + ", cursorOffset=" + this.f31666c + ", transformedText=" + this.f31667d + ", textLayoutResultProvider=" + this.f31668e + ')';
    }
}
