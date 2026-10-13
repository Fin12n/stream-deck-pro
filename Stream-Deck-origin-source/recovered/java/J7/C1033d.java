package J7;

import java.io.EOFException;

/* JADX INFO: renamed from: J7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1033d implements A {
    @Override // J7.A
    public void I1(C1034e source, long j8) throws EOFException {
        kotlin.jvm.internal.t.g(source, "source");
        source.skip(j8);
    }

    @Override // J7.A
    public D r() {
        return D.f4357e;
    }

    @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // J7.A, java.io.Flushable
    public void flush() {
    }
}
