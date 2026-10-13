package J7;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f4414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f4415b;

    public t(OutputStream out, D timeout) {
        kotlin.jvm.internal.t.g(out, "out");
        kotlin.jvm.internal.t.g(timeout, "timeout");
        this.f4414a = out;
        this.f4415b = timeout;
    }

    @Override // J7.A
    public void I1(C1034e source, long j8) throws IOException {
        kotlin.jvm.internal.t.g(source, "source");
        AbstractC1031b.b(source.size(), 0L, j8);
        while (j8 > 0) {
            this.f4415b.f();
            x xVar = source.f4378a;
            kotlin.jvm.internal.t.d(xVar);
            int iMin = (int) Math.min(j8, xVar.f4432c - xVar.f4431b);
            this.f4414a.write(xVar.f4430a, xVar.f4431b, iMin);
            xVar.f4431b += iMin;
            long j9 = iMin;
            j8 -= j9;
            source.q1(source.size() - j9);
            if (xVar.f4431b == xVar.f4432c) {
                source.f4378a = xVar.b();
                y.b(xVar);
            }
        }
    }

    @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4414a.close();
    }

    @Override // J7.A, java.io.Flushable
    public void flush() throws IOException {
        this.f4414a.flush();
    }

    @Override // J7.A
    public D r() {
        return this.f4415b;
    }

    public String toString() {
        return "sink(" + this.f4414a + ')';
    }
}
