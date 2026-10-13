package Q0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9087e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f9088f = new h(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9092d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            return h.f9088f;
        }

        public a() {
        }
    }

    public h(float f8, float f9, float f10, float f11) {
        this.f9089a = f8;
        this.f9090b = f9;
        this.f9091c = f10;
        this.f9092d = f11;
    }

    public static /* synthetic */ h d(h hVar, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = hVar.f9089a;
        }
        if ((i8 & 2) != 0) {
            f9 = hVar.f9090b;
        }
        if ((i8 & 4) != 0) {
            f10 = hVar.f9091c;
        }
        if ((i8 & 8) != 0) {
            f11 = hVar.f9092d;
        }
        return hVar.c(f8, f9, f10, f11);
    }

    public final boolean b(long j8) {
        return f.o(j8) >= this.f9089a && f.o(j8) < this.f9091c && f.p(j8) >= this.f9090b && f.p(j8) < this.f9092d;
    }

    public final h c(float f8, float f9, float f10, float f11) {
        return new h(f8, f9, f10, f11);
    }

    public final float e() {
        return this.f9092d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f9089a, hVar.f9089a) == 0 && Float.compare(this.f9090b, hVar.f9090b) == 0 && Float.compare(this.f9091c, hVar.f9091c) == 0 && Float.compare(this.f9092d, hVar.f9092d) == 0;
    }

    public final long f() {
        return g.a(this.f9091c, this.f9092d);
    }

    public final long g() {
        return g.a(this.f9089a + (n() / 2.0f), this.f9090b + (h() / 2.0f));
    }

    public final float h() {
        return this.f9092d - this.f9090b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f9089a) * 31) + Float.hashCode(this.f9090b)) * 31) + Float.hashCode(this.f9091c)) * 31) + Float.hashCode(this.f9092d);
    }

    public final float i() {
        return this.f9089a;
    }

    public final float j() {
        return this.f9091c;
    }

    public final long k() {
        return m.a(n(), h());
    }

    public final float l() {
        return this.f9090b;
    }

    public final long m() {
        return g.a(this.f9089a, this.f9090b);
    }

    public final float n() {
        return this.f9091c - this.f9089a;
    }

    public final h o(float f8, float f9, float f10, float f11) {
        return new h(Math.max(this.f9089a, f8), Math.max(this.f9090b, f9), Math.min(this.f9091c, f10), Math.min(this.f9092d, f11));
    }

    public final h p(h hVar) {
        return new h(Math.max(this.f9089a, hVar.f9089a), Math.max(this.f9090b, hVar.f9090b), Math.min(this.f9091c, hVar.f9091c), Math.min(this.f9092d, hVar.f9092d));
    }

    public final boolean q() {
        return this.f9089a >= this.f9091c || this.f9090b >= this.f9092d;
    }

    public final boolean r(h hVar) {
        return this.f9091c > hVar.f9089a && hVar.f9091c > this.f9089a && this.f9092d > hVar.f9090b && hVar.f9092d > this.f9090b;
    }

    public final h s(float f8, float f9) {
        return new h(this.f9089a + f8, this.f9090b + f9, this.f9091c + f8, this.f9092d + f9);
    }

    public final h t(long j8) {
        return new h(this.f9089a + f.o(j8), this.f9090b + f.p(j8), this.f9091c + f.o(j8), this.f9092d + f.p(j8));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f9089a, 1) + ", " + c.a(this.f9090b, 1) + ", " + c.a(this.f9091c, 1) + ", " + c.a(this.f9092d, 1) + ')';
    }
}
