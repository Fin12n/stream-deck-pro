package p082j0;

import Q6.k;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.G;
import p038e1.H;
import p038e1.I;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: renamed from: j0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2602f implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0.c f27980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27981b;

    /* JADX INFO: renamed from: j0.f$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f27983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ G f27984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f27985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C2602f f27988f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, G g8, J j8, int i8, int i9, C2602f c2602f) {
            super(1);
            this.f27983a = a0Var;
            this.f27984b = g8;
            this.f27985c = j8;
            this.f27986d = i8;
            this.f27987e = i9;
            this.f27988f = c2602f;
        }

        public final void b(a0.a aVar) {
            AbstractC2601e.f(aVar, this.f27983a, this.f27984b, this.f27985c.getLayoutDirection(), this.f27986d, this.f27987e, this.f27988f.f27980a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: j0.f$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0[] f27989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f27990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f27991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f27992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f27993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C2602f f27994f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0[] a0VarArr, List list, J j8, kotlin.jvm.internal.H h8, kotlin.jvm.internal.H h9, C2602f c2602f) {
            super(1);
            this.f27989a = a0VarArr;
            this.f27990b = list;
            this.f27991c = j8;
            this.f27992d = h8;
            this.f27993e = h9;
            this.f27994f = c2602f;
        }

        public final void b(a0.a aVar) {
            a0[] a0VarArr = this.f27989a;
            List list = this.f27990b;
            J j8 = this.f27991c;
            kotlin.jvm.internal.H h8 = this.f27992d;
            kotlin.jvm.internal.H h9 = this.f27993e;
            C2602f c2602f = this.f27994f;
            int length = a0VarArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                a0 a0Var = a0VarArr[i8];
                t.e(a0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                AbstractC2601e.f(aVar, a0Var, (G) list.get(i9), j8.getLayoutDirection(), h8.f28777a, h9.f28777a, c2602f.f27980a);
                i8++;
                i9++;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return C6.G.f1419a;
        }
    }

    public C2602f(L0.c cVar, boolean z8) {
        this.f27980a = cVar;
        this.f27981b = z8;
    }

    @Override // p038e1.H
    public I d(J j8, List list, long j9) {
        long j10;
        int iP;
        int iO;
        a0 a0VarJ;
        if (list.isEmpty()) {
            return J.X0(j8, A1.b.p(j9), A1.b.o(j9), null, a.f27982a, 4, null);
        }
        if (this.f27981b) {
            j10 = j9;
        } else {
            j10 = j9;
            j9 = A1.b.e(j10, 0, 0, 0, 0, 10, null);
        }
        if (list.size() == 1) {
            G g8 = (G) list.get(0);
            if (AbstractC2601e.e(g8)) {
                iP = A1.b.p(j10);
                iO = A1.b.o(j10);
                a0VarJ = g8.J(A1.b.f422b.c(A1.b.p(j10), A1.b.o(j10)));
            } else {
                a0VarJ = g8.J(j9);
                iP = Math.max(A1.b.p(j10), a0VarJ.y0());
                iO = Math.max(A1.b.o(j10), a0VarJ.h0());
            }
            int i8 = iP;
            int i9 = iO;
            return J.X0(j8, i8, i9, null, new b(a0VarJ, g8, j8, i8, i9, this), 4, null);
        }
        a0[] a0VarArr = new a0[list.size()];
        kotlin.jvm.internal.H h8 = new kotlin.jvm.internal.H();
        h8.f28777a = A1.b.p(j10);
        kotlin.jvm.internal.H h9 = new kotlin.jvm.internal.H();
        h9.f28777a = A1.b.o(j10);
        int size = list.size();
        boolean z8 = false;
        for (int i10 = 0; i10 < size; i10++) {
            G g9 = (G) list.get(i10);
            if (AbstractC2601e.e(g9)) {
                z8 = true;
            } else {
                a0 a0VarJ2 = g9.J(j9);
                a0VarArr[i10] = a0VarJ2;
                h8.f28777a = Math.max(h8.f28777a, a0VarJ2.y0());
                h9.f28777a = Math.max(h9.f28777a, a0VarJ2.h0());
            }
        }
        if (z8) {
            int i11 = h8.f28777a;
            int i12 = i11 != Integer.MAX_VALUE ? i11 : 0;
            int i13 = h9.f28777a;
            long jA = A1.c.a(i12, i11, i13 != Integer.MAX_VALUE ? i13 : 0, i13);
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                G g10 = (G) list.get(i14);
                if (AbstractC2601e.e(g10)) {
                    a0VarArr[i14] = g10.J(jA);
                }
            }
        }
        return J.X0(j8, h8.f28777a, h9.f28777a, null, new c(a0VarArr, list, j8, h8, h9, this), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2602f)) {
            return false;
        }
        C2602f c2602f = (C2602f) obj;
        return t.c(this.f27980a, c2602f.f27980a) && this.f27981b == c2602f.f27981b;
    }

    public int hashCode() {
        return (this.f27980a.hashCode() * 31) + Boolean.hashCode(this.f27981b);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f27980a + ", propagateMinConstraints=" + this.f27981b + ')';
    }

    /* JADX INFO: renamed from: j0.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27982a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return C6.G.f1419a;
        }

        public final void b(a0.a aVar) {
        }
    }
}
