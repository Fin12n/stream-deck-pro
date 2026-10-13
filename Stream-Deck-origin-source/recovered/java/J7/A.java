package J7;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface A extends Closeable, Flushable {
    void I1(C1034e c1034e, long j8);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    D r();
}
