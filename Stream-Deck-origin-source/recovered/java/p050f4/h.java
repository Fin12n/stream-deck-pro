package p050f4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21898a;

    public h(long j8) {
        this.f21898a = j8;
    }

    @Override // p050f4.n
    public long c() {
        return this.f21898a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f21898a == ((n) obj).c();
    }

    public int hashCode() {
        long j8 = this.f21898a;
        return ((int) (j8 ^ (j8 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f21898a + "}";
    }
}
