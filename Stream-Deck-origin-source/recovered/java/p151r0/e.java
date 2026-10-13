package p151r0;

import A1.b;
import A1.c;
import A1.d;
import A1.s;
import A1.t;
import D6.r;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p128o1.C2739d;
import p128o1.C2744i;
import p128o1.C2745j;
import p128o1.D;
import p128o1.E;
import p128o1.I;
import p128o1.J;
import p143q0.F;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2739d f32195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f32196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC3009n.b f32197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f32202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f32203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f32205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2745j f32206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t f32207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E f32208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f32210p;

    public /* synthetic */ e(C2739d c2739d, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, List list, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, i9, z8, i10, i11, list);
    }

    public final d a() {
        return this.f32205k;
    }

    public final E b() {
        return this.f32208n;
    }

    public final E c() {
        E e8 = this.f32208n;
        if (e8 != null) {
            return e8;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i8, t tVar) {
        int i9 = this.f32209o;
        int i10 = this.f32210p;
        if (i8 == i9 && i9 != -1) {
            return i10;
        }
        int iA = F.a(e(c.a(0, i8, 0, Integer.MAX_VALUE), tVar).h());
        this.f32209o = i8;
        this.f32210p = iA;
        return iA;
    }

    public final C2744i e(long j8, t tVar) {
        C2745j c2745jL = l(tVar);
        return new C2744i(c2745jL, b.a(j8, this.f32199e, this.f32198d, c2745jL.h()), b.b(this.f32199e, this.f32198d, this.f32200f), p216z1.t.e(this.f32198d, p216z1.t.f39054a.b()), null);
    }

    public final boolean f(long j8, t tVar) {
        t tVar2;
        if (this.f32201g > 1) {
            c.a aVar = c.f32183h;
            c cVar = this.f32203i;
            I i8 = this.f32196b;
            d dVar = this.f32205k;
            kotlin.jvm.internal.t.d(dVar);
            tVar2 = tVar;
            c cVarA = aVar.a(cVar, tVar2, i8, dVar, this.f32197c);
            this.f32203i = cVarA;
            j8 = cVarA.c(j8, this.f32201g);
        } else {
            tVar2 = tVar;
        }
        if (j(this.f32208n, j8, tVar2)) {
            this.f32208n = m(tVar2, j8, e(j8, tVar2));
            return true;
        }
        E e8 = this.f32208n;
        kotlin.jvm.internal.t.d(e8);
        if (b.g(j8, e8.l().a())) {
            return false;
        }
        E e9 = this.f32208n;
        kotlin.jvm.internal.t.d(e9);
        this.f32208n = m(tVar2, j8, e9.w());
        return true;
    }

    public final void g() {
        this.f32206l = null;
        this.f32208n = null;
        this.f32210p = -1;
        this.f32209o = -1;
    }

    public final int h(t tVar) {
        return F.a(l(tVar).h());
    }

    public final int i(t tVar) {
        return F.a(l(tVar).c());
    }

    public final boolean j(E e8, long j8, t tVar) {
        if (e8 == null || e8.w().j().a() || tVar != e8.l().d()) {
            return true;
        }
        if (b.g(j8, e8.l().a())) {
            return false;
        }
        return b.n(j8) != b.n(e8.l().a()) || ((float) b.m(j8)) < e8.w().h() || e8.w().f();
    }

    public final void k(d dVar) {
        d dVar2 = this.f32205k;
        long jD = dVar != null ? a.d(dVar) : a.f32181a.a();
        if (dVar2 == null) {
            this.f32205k = dVar;
            this.f32204j = jD;
        } else if (dVar == null || !a.e(this.f32204j, jD)) {
            this.f32205k = dVar;
            this.f32204j = jD;
            g();
        }
    }

    public final C2745j l(t tVar) {
        C2745j c2745j = this.f32206l;
        if (c2745j == null || tVar != this.f32207m || c2745j.a()) {
            this.f32207m = tVar;
            C2739d c2739d = this.f32195a;
            I iD = J.d(this.f32196b, tVar);
            d dVar = this.f32205k;
            kotlin.jvm.internal.t.d(dVar);
            AbstractC3009n.b bVar = this.f32197c;
            List listN = this.f32202h;
            if (listN == null) {
                listN = r.n();
            }
            c2745j = new C2745j(c2739d, iD, (List<C2739d.b>) listN, dVar, bVar);
        }
        this.f32206l = c2745j;
        return c2745j;
    }

    public final E m(t tVar, long j8, C2744i c2744i) {
        float fMin = Math.min(c2744i.j().h(), c2744i.z());
        C2739d c2739d = this.f32195a;
        I i8 = this.f32196b;
        List listN = this.f32202h;
        if (listN == null) {
            listN = r.n();
        }
        int i9 = this.f32200f;
        boolean z8 = this.f32199e;
        int i10 = this.f32198d;
        d dVar = this.f32205k;
        kotlin.jvm.internal.t.d(dVar);
        return new E(new D(c2739d, i8, listN, i9, z8, i10, dVar, tVar, this.f32197c, j8, (AbstractC2633k) null), c2744i, c.d(j8, s.a(F.a(fMin), F.a(c2744i.h()))), null);
    }

    public final void n(C2739d c2739d, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, List list) {
        this.f32195a = c2739d;
        this.f32196b = i8;
        this.f32197c = bVar;
        this.f32198d = i9;
        this.f32199e = z8;
        this.f32200f = i10;
        this.f32201g = i11;
        this.f32202h = list;
        g();
    }

    public e(C2739d c2739d, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, List list) {
        this.f32195a = c2739d;
        this.f32196b = i8;
        this.f32197c = bVar;
        this.f32198d = i9;
        this.f32199e = z8;
        this.f32200f = i10;
        this.f32201g = i11;
        this.f32202h = list;
        this.f32204j = a.f32181a.a();
        this.f32209o = -1;
        this.f32210p = -1;
    }

    public /* synthetic */ e(C2739d c2739d, I i8, AbstractC3009n.b bVar, int i9, boolean z8, int i10, int i11, List list, int i12, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, bVar, (i12 & 8) != 0 ? p216z1.t.f39054a.a() : i9, (i12 & 16) != 0 ? true : z8, (i12 & 32) != 0 ? Integer.MAX_VALUE : i10, (i12 & 64) != 0 ? 1 : i11, (i12 & 128) != 0 ? null : list, null);
    }
}
