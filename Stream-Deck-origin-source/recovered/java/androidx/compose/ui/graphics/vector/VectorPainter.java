package androidx.compose.ui.graphics.vector;

import A1.t;
import C6.G;
import Q0.l;
import R0.C1600m0;
import T0.d;
import T0.f;
import U0.b;
import V0.c;
import V0.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3164l0;
import p215z0.X0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class VectorPainter extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f14716n = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3164l0 f14717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3164l0 f14718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f14719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC3160j0 f14720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1600m0 f14722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14723m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m84invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m84invoke() {
            if (VectorPainter.this.f14723m == VectorPainter.this.o()) {
                VectorPainter vectorPainter = VectorPainter.this;
                vectorPainter.s(vectorPainter.o() + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // U0.b
    public boolean a(float f8) {
        this.f14721k = f8;
        return true;
    }

    @Override // U0.b
    public boolean b(C1600m0 c1600m0) {
        this.f14722l = c1600m0;
        return true;
    }

    @Override // U0.b
    public long h() {
        return p();
    }

    @Override // U0.b
    public void j(f fVar) {
        m mVar = this.f14719i;
        C1600m0 c1600m0K = this.f14722l;
        if (c1600m0K == null) {
            c1600m0K = mVar.k();
        }
        if (n() && fVar.getLayoutDirection() == t.Rtl) {
            long jC1 = fVar.c1();
            d dVarK0 = fVar.K0();
            long jD = dVarK0.d();
            dVarK0.c().k();
            dVarK0.a().f(-1.0f, 1.0f, jC1);
            mVar.i(fVar, this.f14721k, c1600m0K);
            dVarK0.c().x();
            dVarK0.b(jD);
        } else {
            mVar.i(fVar, this.f14721k, c1600m0K);
        }
        this.f14723m = o();
    }

    public final boolean n() {
        return ((Boolean) this.f14718h.getValue()).booleanValue();
    }

    public final int o() {
        return this.f14720j.f();
    }

    public final long p() {
        return ((l) this.f14717g.getValue()).m();
    }

    public final void q(boolean z8) {
        this.f14718h.setValue(Boolean.valueOf(z8));
    }

    public final void r(C1600m0 c1600m0) {
        this.f14719i.n(c1600m0);
    }

    public final void s(int i8) {
        this.f14720j.p(i8);
    }

    public final void t(String str) {
        this.f14719i.p(str);
    }

    public final void u(long j8) {
        this.f14717g.setValue(l.c(j8));
    }

    public final void v(long j8) {
        this.f14719i.q(j8);
    }

    public VectorPainter(c cVar) {
        this.f14717g = l1.e(l.c(l.f9103b.b()), null, 2, null);
        this.f14718h = l1.e(Boolean.FALSE, null, 2, null);
        m mVar = new m(cVar);
        mVar.o(new a());
        this.f14719i = mVar;
        this.f14720j = X0.a(0);
        this.f14721k = 1.0f;
        this.f14723m = -1;
    }

    public /* synthetic */ VectorPainter(c cVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new c() : cVar);
    }
}
