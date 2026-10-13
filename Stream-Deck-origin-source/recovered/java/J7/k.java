package J7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f4397a;

    public k(C delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f4397a = delegate;
    }

    @Override // J7.C
    public long K0(C1034e sink, long j8) {
        kotlin.jvm.internal.t.g(sink, "sink");
        return this.f4397a.K0(sink, j8);
    }

    public final C b() {
        return this.f4397a;
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4397a.close();
    }

    @Override // J7.C
    public D r() {
        return this.f4397a.r();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f4397a + ')';
    }
}
