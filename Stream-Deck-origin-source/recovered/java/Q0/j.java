package Q0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9093i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f9094j = k.c(0.0f, 0.0f, 0.0f, 0.0f, Q0.a.f9076a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9102h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ j(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, j8, j9, j10, j11);
    }

    public final float a() {
        return this.f9098d;
    }

    public final long b() {
        return this.f9102h;
    }

    public final long c() {
        return this.f9101g;
    }

    public final float d() {
        return this.f9098d - this.f9096b;
    }

    public final float e() {
        return this.f9095a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f9095a, jVar.f9095a) == 0 && Float.compare(this.f9096b, jVar.f9096b) == 0 && Float.compare(this.f9097c, jVar.f9097c) == 0 && Float.compare(this.f9098d, jVar.f9098d) == 0 && Q0.a.c(this.f9099e, jVar.f9099e) && Q0.a.c(this.f9100f, jVar.f9100f) && Q0.a.c(this.f9101g, jVar.f9101g) && Q0.a.c(this.f9102h, jVar.f9102h);
    }

    public final float f() {
        return this.f9097c;
    }

    public final float g() {
        return this.f9096b;
    }

    public final long h() {
        return this.f9099e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f9095a) * 31) + Float.hashCode(this.f9096b)) * 31) + Float.hashCode(this.f9097c)) * 31) + Float.hashCode(this.f9098d)) * 31) + Q0.a.f(this.f9099e)) * 31) + Q0.a.f(this.f9100f)) * 31) + Q0.a.f(this.f9101g)) * 31) + Q0.a.f(this.f9102h);
    }

    public final long i() {
        return this.f9100f;
    }

    public final float j() {
        return this.f9097c - this.f9095a;
    }

    public String toString() {
        long j8 = this.f9099e;
        long j9 = this.f9100f;
        long j10 = this.f9101g;
        long j11 = this.f9102h;
        String str = c.a(this.f9095a, 1) + ", " + c.a(this.f9096b, 1) + ", " + c.a(this.f9097c, 1) + ", " + c.a(this.f9098d, 1);
        if (!Q0.a.c(j8, j9) || !Q0.a.c(j9, j10) || !Q0.a.c(j10, j11)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) Q0.a.g(j8)) + ", topRight=" + ((Object) Q0.a.g(j9)) + ", bottomRight=" + ((Object) Q0.a.g(j10)) + ", bottomLeft=" + ((Object) Q0.a.g(j11)) + ')';
        }
        if (Q0.a.d(j8) == Q0.a.e(j8)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(Q0.a.d(j8), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(Q0.a.d(j8), 1) + ", y=" + c.a(Q0.a.e(j8), 1) + ')';
    }

    public j(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11) {
        this.f9095a = f8;
        this.f9096b = f9;
        this.f9097c = f10;
        this.f9098d = f11;
        this.f9099e = j8;
        this.f9100f = j9;
        this.f9101g = j10;
        this.f9102h = j11;
    }

    public /* synthetic */ j(float f8, float f9, float f10, float f11, long j8, long j9, long j10, long j11, int i8, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, (i8 & 16) != 0 ? Q0.a.f9076a.a() : j8, (i8 & 32) != 0 ? Q0.a.f9076a.a() : j9, (i8 & 64) != 0 ? Q0.a.f9076a.a() : j10, (i8 & 128) != 0 ? Q0.a.f9076a.a() : j11, null);
    }
}
