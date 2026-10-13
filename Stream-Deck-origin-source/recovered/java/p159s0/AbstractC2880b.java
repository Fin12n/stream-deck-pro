package p159s0;

import Q0.g;
import Q6.k;
import W6.n;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p128o1.C2739d;
import p128o1.E;
import p128o1.G;
import p128o1.H;
import p143q0.B;
import p143q0.C;
import p176u1.D;
import p216z1.i;

/* JADX INFO: renamed from: s0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2880b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32758h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f32759i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f32760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f32762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f32763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L f32764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f32765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2739d f32766g;

    /* JADX INFO: renamed from: s0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC2880b(C2739d c2739d, long j8, E e8, D d8, L l8, AbstractC2633k abstractC2633k) {
        this(c2739d, j8, e8, d8, l8);
    }

    public static /* synthetic */ int h(AbstractC2880b abstractC2880b, E e8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i9 & 1) != 0) {
            i8 = abstractC2880b.W();
        }
        return abstractC2880b.g(e8, i8);
    }

    public static /* synthetic */ int k(AbstractC2880b abstractC2880b, E e8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i9 & 1) != 0) {
            i8 = abstractC2880b.X();
        }
        return abstractC2880b.j(e8, i8);
    }

    public static /* synthetic */ int o(AbstractC2880b abstractC2880b, E e8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i9 & 1) != 0) {
            i8 = abstractC2880b.V();
        }
        return abstractC2880b.n(e8, i8);
    }

    public static /* synthetic */ int s(AbstractC2880b abstractC2880b, E e8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i9 & 1) != 0) {
            i8 = abstractC2880b.V();
        }
        return abstractC2880b.r(e8, i8);
    }

    public final AbstractC2880b A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b C() {
        int iL;
        v().b();
        if (w().length() > 0 && (iL = l()) != -1) {
            T(iL);
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b D() {
        v().b();
        if (w().length() > 0) {
            int iA = B.a(w(), G.k(this.f32765f));
            if (iA == G.k(this.f32765f) && iA != w().length()) {
                iA = B.a(w(), iA + 1);
            }
            T(iA);
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b E() {
        Integer numM;
        v().b();
        if (w().length() > 0 && (numM = m()) != null) {
            T(numM.intValue());
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b F() {
        int iQ;
        v().b();
        if (w().length() > 0 && (iQ = q()) != -1) {
            T(iQ);
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b G() {
        v().b();
        if (w().length() > 0) {
            int iB = B.b(w(), G.l(this.f32765f));
            if (iB == G.l(this.f32765f) && iB != 0) {
                iB = B.b(w(), iB - 1);
            }
            T(iB);
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b H() {
        Integer numT;
        v().b();
        if (w().length() > 0 && (numT = t()) != null) {
            T(numT.intValue());
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b M() {
        Integer numF;
        v().b();
        if (w().length() > 0 && (numF = f()) != null) {
            T(numF.intValue());
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b P() {
        Integer numI;
        v().b();
        if (w().length() > 0 && (numI = i()) != null) {
            T(numI.intValue());
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b Q() {
        E e8;
        if (w().length() > 0 && (e8 = this.f32762c) != null) {
            T(y(e8, -1));
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b S() {
        if (w().length() > 0) {
            this.f32765f = H.b(G.n(this.f32761b), G.i(this.f32765f));
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void T(int i8) {
        U(i8, i8);
    }

    public final void U(int i8, int i9) {
        this.f32765f = H.b(i8, i9);
    }

    public final int V() {
        return this.f32763d.b(G.i(this.f32765f));
    }

    public final int W() {
        return this.f32763d.b(G.k(this.f32765f));
    }

    public final int X() {
        return this.f32763d.b(G.l(this.f32765f));
    }

    public final int a(int i8) {
        return n.g(i8, w().length() - 1);
    }

    public final AbstractC2880b b(k kVar) {
        v().b();
        if (w().length() > 0) {
            if (G.h(this.f32765f)) {
                t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                kVar.invoke(this);
            } else if (x()) {
                T(G.l(this.f32765f));
            } else {
                T(G.k(this.f32765f));
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b c(k kVar) {
        v().b();
        if (w().length() > 0) {
            if (G.h(this.f32765f)) {
                t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                kVar.invoke(this);
            } else if (x()) {
                T(G.k(this.f32765f));
            } else {
                T(G.l(this.f32765f));
            }
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2880b d() {
        v().b();
        if (w().length() > 0) {
            T(G.i(this.f32765f));
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C2739d e() {
        return this.f32766g;
    }

    public final Integer f() {
        E e8 = this.f32762c;
        if (e8 != null) {
            return Integer.valueOf(h(this, e8, 0, 1, null));
        }
        return null;
    }

    public final int g(E e8, int i8) {
        return this.f32763d.a(e8.o(e8.q(i8), true));
    }

    public final Integer i() {
        E e8 = this.f32762c;
        if (e8 != null) {
            return Integer.valueOf(k(this, e8, 0, 1, null));
        }
        return null;
    }

    public final int j(E e8, int i8) {
        return this.f32763d.a(e8.u(e8.q(i8)));
    }

    public final int l() {
        return C.a(this.f32766g.i(), G.i(this.f32765f));
    }

    public final Integer m() {
        E e8 = this.f32762c;
        if (e8 != null) {
            return Integer.valueOf(o(this, e8, 0, 1, null));
        }
        return null;
    }

    public final int n(E e8, int i8) {
        while (i8 < this.f32760a.length()) {
            long jC = e8.C(a(i8));
            if (G.i(jC) > i8) {
                return this.f32763d.a(G.i(jC));
            }
            i8++;
        }
        return this.f32760a.length();
    }

    public final D p() {
        return this.f32763d;
    }

    public final int q() {
        return C.b(this.f32766g.i(), G.i(this.f32765f));
    }

    public final int r(E e8, int i8) {
        while (i8 > 0) {
            long jC = e8.C(a(i8));
            if (G.n(jC) < i8) {
                return this.f32763d.a(G.n(jC));
            }
            i8--;
        }
        return 0;
    }

    public final Integer t() {
        E e8 = this.f32762c;
        if (e8 != null) {
            return Integer.valueOf(s(this, e8, 0, 1, null));
        }
        return null;
    }

    public final long u() {
        return this.f32765f;
    }

    public final L v() {
        return this.f32764e;
    }

    public final String w() {
        return this.f32766g.i();
    }

    public final boolean x() {
        E e8 = this.f32762c;
        return (e8 != null ? e8.y(V()) : null) != i.Rtl;
    }

    public final int y(E e8, int i8) {
        int iV = V();
        if (this.f32764e.a() == null) {
            this.f32764e.c(Float.valueOf(e8.e(iV).i()));
        }
        int iQ = e8.q(iV) + i8;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= e8.n()) {
            return w().length();
        }
        float fM = e8.m(iQ) - 1;
        Float fA = this.f32764e.a();
        t.d(fA);
        float fFloatValue = fA.floatValue();
        if ((x() && fFloatValue >= e8.t(iQ)) || (!x() && fFloatValue <= e8.s(iQ))) {
            return e8.o(iQ, true);
        }
        return this.f32763d.a(e8.x(g.a(fA.floatValue(), fM)));
    }

    public final AbstractC2880b z() {
        E e8;
        if (w().length() > 0 && (e8 = this.f32762c) != null) {
            T(y(e8, 1));
        }
        t.e(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public AbstractC2880b(C2739d c2739d, long j8, E e8, D d8, L l8) {
        this.f32760a = c2739d;
        this.f32761b = j8;
        this.f32762c = e8;
        this.f32763d = d8;
        this.f32764e = l8;
        this.f32765f = j8;
        this.f32766g = c2739d;
    }
}
