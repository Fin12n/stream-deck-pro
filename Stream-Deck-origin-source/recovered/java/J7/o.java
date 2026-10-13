package J7;

import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class o implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f4408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f4409b;

    @Override // J7.C
    public long K0(C1034e sink, long j8) throws IOException {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j8 == 0) {
            return 0L;
        }
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        try {
            this.f4409b.f();
            x xVarC1 = sink.C1(1);
            int i8 = this.f4408a.read(xVarC1.f4430a, xVarC1.f4432c, (int) Math.min(j8, 8192 - xVarC1.f4432c));
            if (i8 != -1) {
                xVarC1.f4432c += i8;
                long j9 = i8;
                sink.q1(sink.size() + j9);
                return j9;
            }
            if (xVarC1.f4431b != xVarC1.f4432c) {
                return -1L;
            }
            sink.f4378a = xVarC1.b();
            y.b(xVarC1);
            return -1L;
        } catch (AssertionError e8) {
            if (p.e(e8)) {
                throw new IOException(e8);
            }
            throw e8;
        }
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4408a.close();
    }

    @Override // J7.C
    public D r() {
        return this.f4409b;
    }

    public String toString() {
        return "source(" + this.f4408a + ')';
    }

    public o(InputStream input, D d8) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(d8, HRHLwtyqJWz.gFHmudtyAawfaoF);
        this.f4408a = input;
        this.f4409b = d8;
    }
}
