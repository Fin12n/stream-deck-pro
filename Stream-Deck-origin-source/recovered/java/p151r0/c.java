package p151r0;

import A1.b;
import A1.d;
import A1.t;
import D6.r;
import W6.n;
import kotlin.jvm.internal.AbstractC2633k;
import p128o1.I;
import p128o1.J;
import p128o1.s;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32183h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f32184i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static c f32185j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f32187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f32188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3009n.b f32189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f32190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f32191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f32192g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a(c cVar, t tVar, I i8, d dVar, AbstractC3009n.b bVar) {
            if (cVar != null && tVar == cVar.g() && kotlin.jvm.internal.t.c(i8, cVar.f()) && dVar.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            c cVar2 = c.f32185j;
            if (cVar2 != null && tVar == cVar2.g() && kotlin.jvm.internal.t.c(i8, cVar2.f()) && dVar.getDensity() == cVar2.d().getDensity() && bVar == cVar2.e()) {
                return cVar2;
            }
            c cVar3 = new c(tVar, J.d(i8, tVar), dVar, bVar, null);
            c.f32185j = cVar3;
            return cVar3;
        }

        public a() {
        }
    }

    public /* synthetic */ c(t tVar, I i8, d dVar, AbstractC3009n.b bVar, AbstractC2633k abstractC2633k) {
        this(tVar, i8, dVar, bVar);
    }

    public final long c(long j8, int i8) {
        float f8 = this.f32192g;
        float f9 = this.f32191f;
        if (Float.isNaN(f8) || Float.isNaN(f9)) {
            f8 = s.a(d.f32193a, this.f32190e, A1.c.b(0, 0, 0, 0, 15, null), this.f32188c, this.f32189d, (64 & 32) != 0 ? r.n() : null, (64 & 64) != 0 ? r.n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? false : false).f();
            f9 = s.a(d.f32194b, this.f32190e, A1.c.b(0, 0, 0, 0, 15, null), this.f32188c, this.f32189d, (64 & 32) != 0 ? r.n() : null, (64 & 64) != 0 ? r.n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? false : false).f() - f8;
            this.f32192g = f8;
            this.f32191f = f9;
        }
        return A1.c.a(b.p(j8), b.n(j8), i8 != 1 ? n.g(n.d(S6.c.d(f8 + (f9 * (i8 - 1))), 0), b.m(j8)) : b.o(j8), b.m(j8));
    }

    public final d d() {
        return this.f32188c;
    }

    public final AbstractC3009n.b e() {
        return this.f32189d;
    }

    public final I f() {
        return this.f32187b;
    }

    public final t g() {
        return this.f32186a;
    }

    public c(t tVar, I i8, d dVar, AbstractC3009n.b bVar) {
        this.f32186a = tVar;
        this.f32187b = i8;
        this.f32188c = dVar;
        this.f32189d = bVar;
        this.f32190e = J.d(i8, tVar);
        this.f32191f = Float.NaN;
        this.f32192g = Float.NaN;
    }
}
