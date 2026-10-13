package p020c1;

import A1.y;
import A1.z;
import Q0.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16046a = new c(false, null, 3, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16047b = new c(false, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16048c = f.f9082b.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16049d;

    public final void a(long j8, long j9) {
        this.f16046a.a(j8, f.o(j9));
        this.f16047b.a(j8, f.p(j9));
    }

    public final long b(long j8) {
        if (y.h(j8) > 0.0f && y.i(j8) > 0.0f) {
            return z.a(this.f16046a.d(y.h(j8)), this.f16047b.d(y.i(j8)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(j8))).toString());
    }

    public final long c() {
        return this.f16048c;
    }

    public final long d() {
        return this.f16049d;
    }

    public final void e() {
        this.f16046a.e();
        this.f16047b.e();
        this.f16049d = 0L;
    }

    public final void f(long j8) {
        this.f16048c = j8;
    }

    public final void g(long j8) {
        this.f16049d = j8;
    }
}
