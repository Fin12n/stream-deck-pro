package p143q0;

import A1.b;
import A1.t;
import C6.G;
import Q6.k;
import S6.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.InterfaceC2253y;
import p038e1.J;
import p038e1.a0;
import p055g0.B;
import p176u1.W;

/* JADX INFO: renamed from: q0.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2816p implements InterfaceC2253y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f31881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f31883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f31884e;

    /* JADX INFO: renamed from: q0.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f31885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2816p f31886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f31887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f31888d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j8, C2816p c2816p, a0 a0Var, int i8) {
            super(1);
            this.f31885a = j8;
            this.f31886b = c2816p;
            this.f31887c = a0Var;
            this.f31888d = i8;
        }

        public final void b(a0.a aVar) {
            J j8 = this.f31885a;
            int iK = this.f31886b.k();
            W wS = this.f31886b.s();
            X x8 = (X) this.f31886b.r().invoke();
            this.f31886b.p().j(B.Horizontal, Q.b(j8, iK, wS, x8 != null ? x8.f() : null, this.f31885a.getLayoutDirection() == t.Rtl, this.f31887c.y0()), this.f31888d, this.f31887c.y0());
            a0.a.j(aVar, this.f31887c, c.d(-this.f31886b.p().d()), 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public C2816p(S s8, int i8, W w8, Function0 function0) {
        this.f31881b = s8;
        this.f31882c = i8;
        this.f31883d = w8;
        this.f31884e = function0;
    }

    @Override // p038e1.InterfaceC2253y
    public I c(J j8, p038e1.G g8, long j9) {
        long j10;
        if (g8.G(b.m(j9)) < b.n(j9)) {
            j10 = j9;
        } else {
            j10 = j9;
            j9 = b.e(j10, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        a0 a0VarJ = g8.J(j9);
        int iMin = Math.min(a0VarJ.y0(), b.n(j10));
        return J.X0(j8, iMin, a0VarJ.h0(), null, new a(j8, this, a0VarJ, iMin), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2816p)) {
            return false;
        }
        C2816p c2816p = (C2816p) obj;
        return kotlin.jvm.internal.t.c(this.f31881b, c2816p.f31881b) && this.f31882c == c2816p.f31882c && kotlin.jvm.internal.t.c(this.f31883d, c2816p.f31883d) && kotlin.jvm.internal.t.c(this.f31884e, c2816p.f31884e);
    }

    public int hashCode() {
        return (((((this.f31881b.hashCode() * 31) + Integer.hashCode(this.f31882c)) * 31) + this.f31883d.hashCode()) * 31) + this.f31884e.hashCode();
    }

    public final int k() {
        return this.f31882c;
    }

    public final S p() {
        return this.f31881b;
    }

    public final Function0 r() {
        return this.f31884e;
    }

    public final W s() {
        return this.f31883d;
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f31881b + ", cursorOffset=" + this.f31882c + ", transformedText=" + this.f31883d + ", textLayoutResultProvider=" + this.f31884e + ')';
    }
}
