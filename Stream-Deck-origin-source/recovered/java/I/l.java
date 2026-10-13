package I;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3660b;

    public l(long j8, long j9) {
        this.f3659a = j8;
        this.f3660b = j9;
    }

    public long a() {
        return this.f3660b;
    }

    public long b() {
        return this.f3659a;
    }

    public String toString() {
        return this.f3659a + "/" + this.f3660b;
    }

    public l(double d8) {
        this((long) (d8 * 10000.0d), 10000L);
    }
}
