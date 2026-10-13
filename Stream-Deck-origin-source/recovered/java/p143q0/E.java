package p143q0;

import A1.b;
import A1.c;
import A1.d;
import A1.s;
import A1.t;
import D6.r;
import W6.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p128o1.C2739d;
import p128o1.C2744i;
import p128o1.C2745j;
import p128o1.D;
import p128o1.I;
import p128o1.J;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f31391l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f31392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f31393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f31398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC3009n.b f31399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f31400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2745j f31401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f31402k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ E(C2739d c2739d, I i8, int i9, int i10, boolean z8, int i11, d dVar, AbstractC3009n.b bVar, List list, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, i9, i10, z8, i11, dVar, bVar, list);
    }

    public final d a() {
        return this.f31398g;
    }

    public final AbstractC3009n.b b() {
        return this.f31399h;
    }

    public final int c() {
        return F.a(f().h());
    }

    public final int d() {
        return this.f31394c;
    }

    public final int e() {
        return this.f31395d;
    }

    public final C2745j f() {
        C2745j c2745j = this.f31401j;
        if (c2745j != null) {
            return c2745j;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int g() {
        return this.f31397f;
    }

    public final List h() {
        return this.f31400i;
    }

    public final boolean i() {
        return this.f31396e;
    }

    public final I j() {
        return this.f31393b;
    }

    public final C2739d k() {
        return this.f31392a;
    }

    public final p128o1.E l(long j8, t tVar, p128o1.E e8) {
        if (e8 != null && W.a(e8, this.f31392a, this.f31393b, this.f31400i, this.f31394c, this.f31396e, this.f31397f, this.f31398g, tVar, this.f31399h, j8)) {
            return e8.a(new D(e8.l().j(), this.f31393b, e8.l().g(), e8.l().e(), e8.l().h(), e8.l().f(), e8.l().b(), e8.l().d(), e8.l().c(), j8, (AbstractC2633k) null), c.d(j8, s.a(F.a(e8.w().z()), F.a(e8.w().h()))));
        }
        C2744i c2744iN = n(j8, tVar);
        return new p128o1.E(new D(this.f31392a, this.f31393b, this.f31400i, this.f31394c, this.f31396e, this.f31397f, this.f31398g, tVar, this.f31399h, j8, (AbstractC2633k) null), c2744iN, c.d(j8, s.a(F.a(c2744iN.z()), F.a(c2744iN.h()))), null);
    }

    public final void m(t tVar) {
        C2745j c2745j = this.f31401j;
        if (c2745j == null || tVar != this.f31402k || c2745j.a()) {
            this.f31402k = tVar;
            c2745j = new C2745j(this.f31392a, J.d(this.f31393b, tVar), (List<C2739d.b>) this.f31400i, this.f31398g, this.f31399h);
        }
        this.f31401j = c2745j;
    }

    public final C2744i n(long j8, t tVar) {
        m(tVar);
        int iP = b.p(j8);
        int iN = ((this.f31396e || p216z1.t.e(this.f31397f, p216z1.t.f39054a.b())) && b.j(j8)) ? b.n(j8) : Integer.MAX_VALUE;
        int i8 = (this.f31396e || !p216z1.t.e(this.f31397f, p216z1.t.f39054a.b())) ? this.f31394c : 1;
        if (iP != iN) {
            iN = n.k(c(), iP, iN);
        }
        return new C2744i(f(), c.b(0, iN, 0, b.m(j8), 5, null), i8, p216z1.t.e(this.f31397f, p216z1.t.f39054a.b()), null);
    }

    public E(C2739d c2739d, I i8, int i9, int i10, boolean z8, int i11, d dVar, AbstractC3009n.b bVar, List list) {
        this.f31392a = c2739d;
        this.f31393b = i8;
        this.f31394c = i9;
        this.f31395d = i10;
        this.f31396e = z8;
        this.f31397f = i11;
        this.f31398g = dVar;
        this.f31399h = bVar;
        this.f31400i = list;
        if (i9 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i10 > i9) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public /* synthetic */ E(C2739d c2739d, I i8, int i9, int i10, boolean z8, int i11, d dVar, AbstractC3009n.b bVar, List list, int i12, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, (i12 & 4) != 0 ? Integer.MAX_VALUE : i9, (i12 & 8) != 0 ? 1 : i10, (i12 & 16) != 0 ? true : z8, (i12 & 32) != 0 ? p216z1.t.f39054a.a() : i11, dVar, bVar, (i12 & 256) != 0 ? r.n() : list, null);
    }
}
