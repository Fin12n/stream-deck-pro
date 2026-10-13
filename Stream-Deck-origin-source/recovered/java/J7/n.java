package J7;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f4405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4407d;

    public n(g source, Inflater inflater) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(inflater, kDsnNkYbBsI.cMoPpWQhHI);
        this.f4404a = source;
        this.f4405b = inflater;
    }

    @Override // J7.C
    public long K0(C1034e sink, long j8) throws IOException {
        kotlin.jvm.internal.t.g(sink, "sink");
        do {
            long jB = b(sink, j8);
            if (jB > 0) {
                return jB;
            }
            if (this.f4405b.finished() || this.f4405b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f4404a.f0());
        throw new EOFException("source exhausted prematurely");
    }

    public final long b(C1034e sink, long j8) throws IOException {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (this.f4407d) {
            throw new IllegalStateException("closed");
        }
        if (j8 == 0) {
            return 0L;
        }
        try {
            x xVarC1 = sink.C1(1);
            int iMin = (int) Math.min(j8, 8192 - xVarC1.f4432c);
            c();
            int iInflate = this.f4405b.inflate(xVarC1.f4430a, xVarC1.f4432c, iMin);
            j();
            if (iInflate > 0) {
                xVarC1.f4432c += iInflate;
                long j9 = iInflate;
                sink.q1(sink.size() + j9);
                return j9;
            }
            if (xVarC1.f4431b == xVarC1.f4432c) {
                sink.f4378a = xVarC1.b();
                y.b(xVarC1);
            }
            return 0L;
        } catch (DataFormatException e8) {
            throw new IOException(e8);
        }
    }

    public final boolean c() {
        if (!this.f4405b.needsInput()) {
            return false;
        }
        if (this.f4404a.f0()) {
            return true;
        }
        x xVar = this.f4404a.l().f4378a;
        kotlin.jvm.internal.t.d(xVar);
        int i8 = xVar.f4432c;
        int i9 = xVar.f4431b;
        int i10 = i8 - i9;
        this.f4406c = i10;
        this.f4405b.setInput(xVar.f4430a, i9, i10);
        return false;
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4407d) {
            return;
        }
        this.f4405b.end();
        this.f4407d = true;
        this.f4404a.close();
    }

    public final void j() {
        int i8 = this.f4406c;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.f4405b.getRemaining();
        this.f4406c -= remaining;
        this.f4404a.skip(remaining);
    }

    @Override // J7.C
    public D r() {
        return this.f4404a.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(C source, Inflater inflater) {
        this(p.d(source), inflater);
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(inflater, "inflater");
    }
}
