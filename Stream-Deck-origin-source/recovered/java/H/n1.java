package H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements A.z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A.z0 f3162e;

    public n1(long j8, A.z0 z0Var) {
        T1.f.b(j8 >= 0, "Timeout must be non-negative.");
        this.f3161d = j8;
        this.f3162e = z0Var;
    }

    @Override // A.z0
    public long b() {
        return this.f3161d;
    }

    @Override // A.z0
    public A.z0.c e(A.z0.b bVar) {
        A.z0.c cVarE = this.f3162e.e(bVar);
        return (b() <= 0 || bVar.c() < b() - cVarE.b()) ? cVarE : A.z0.c.f350d;
    }
}
