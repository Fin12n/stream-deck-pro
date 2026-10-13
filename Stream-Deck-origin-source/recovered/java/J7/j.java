package J7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f4396a;

    public j(A delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f4396a = delegate;
    }

    @Override // J7.A
    public void I1(C1034e source, long j8) {
        kotlin.jvm.internal.t.g(source, "source");
        this.f4396a.I1(source, j8);
    }

    @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4396a.close();
    }

    @Override // J7.A, java.io.Flushable
    public void flush() {
        this.f4396a.flush();
    }

    @Override // J7.A
    public D r() {
        return this.f4396a.r();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f4396a + ')';
    }
}
