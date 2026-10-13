package p082j0;

import A1.h;
import C6.G;
import Q6.k;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.InterfaceC2244o;
import p038e1.J;
import p038e1.a0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f27870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2598b.d f27871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2598b.l f27872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f27874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2611o f27875f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ P f27876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f27877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f27878c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(P p8, N n8, J j8) {
            super(1);
            this.f27876a = p8;
            this.f27877b = n8;
            this.f27878c = j8;
        }

        public final void b(a0.a aVar) {
            this.f27876a.f(aVar, this.f27877b, 0, this.f27878c.getLayoutDirection());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ O(C c8, C2598b.d dVar, C2598b.l lVar, float f8, V v8, AbstractC2611o abstractC2611o, AbstractC2633k abstractC2633k) {
        this(c8, dVar, lVar, f8, v8, abstractC2611o);
    }

    @Override // p038e1.H
    public int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return ((Number) M.b(this.f27870a).invoke(list, Integer.valueOf(i8), Integer.valueOf(interfaceC2244o.V0(this.f27873d)))).intValue();
    }

    @Override // p038e1.H
    public int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return ((Number) M.d(this.f27870a).invoke(list, Integer.valueOf(i8), Integer.valueOf(interfaceC2244o.V0(this.f27873d)))).intValue();
    }

    @Override // p038e1.H
    public int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return ((Number) M.a(this.f27870a).invoke(list, Integer.valueOf(i8), Integer.valueOf(interfaceC2244o.V0(this.f27873d)))).intValue();
    }

    @Override // p038e1.H
    public I d(J j8, List list, long j9) throws Throwable {
        int iB;
        int iE;
        P p8 = new P(this.f27870a, this.f27871b, this.f27872c, this.f27873d, this.f27874e, this.f27875f, list, new a0[list.size()], null);
        N nE = p8.e(j8, j9, 0, list.size());
        if (this.f27870a == C.Horizontal) {
            iB = nE.e();
            iE = nE.b();
        } else {
            iB = nE.b();
            iE = nE.e();
        }
        return J.X0(j8, iB, iE, null, new a(p8, nE, j8), 4, null);
    }

    @Override // p038e1.H
    public int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
        return ((Number) M.c(this.f27870a).invoke(list, Integer.valueOf(i8), Integer.valueOf(interfaceC2244o.V0(this.f27873d)))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        return this.f27870a == o8.f27870a && t.c(this.f27871b, o8.f27871b) && t.c(this.f27872c, o8.f27872c) && h.t(this.f27873d, o8.f27873d) && this.f27874e == o8.f27874e && t.c(this.f27875f, o8.f27875f);
    }

    public int hashCode() {
        int iHashCode = this.f27870a.hashCode() * 31;
        C2598b.d dVar = this.f27871b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C2598b.l lVar = this.f27872c;
        return ((((((iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31) + h.u(this.f27873d)) * 31) + this.f27874e.hashCode()) * 31) + this.f27875f.hashCode();
    }

    public String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.f27870a + ", horizontalArrangement=" + this.f27871b + ", verticalArrangement=" + this.f27872c + ", arrangementSpacing=" + ((Object) h.v(this.f27873d)) + ", crossAxisSize=" + this.f27874e + ", crossAxisAlignment=" + this.f27875f + ')';
    }

    public O(C c8, C2598b.d dVar, C2598b.l lVar, float f8, V v8, AbstractC2611o abstractC2611o) {
        this.f27870a = c8;
        this.f27871b = dVar;
        this.f27872c = lVar;
        this.f27873d = f8;
        this.f27874e = v8;
        this.f27875f = abstractC2611o;
    }
}
