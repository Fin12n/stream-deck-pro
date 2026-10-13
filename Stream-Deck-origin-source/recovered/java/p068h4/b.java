package p068h4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f24435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24436b;

    public b(g.a aVar, long j8) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f24435a = aVar;
        this.f24436b = j8;
    }

    @Override // p068h4.g
    public long b() {
        return this.f24436b;
    }

    @Override // p068h4.g
    public g.a c() {
        return this.f24435a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f24435a.equals(gVar.c()) && this.f24436b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f24435a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f24436b;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f24435a + ", nextRequestWaitMillis=" + this.f24436b + "}";
    }
}
