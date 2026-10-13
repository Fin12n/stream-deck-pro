package J7;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1035f f4393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deflater f4394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4395c;

    public i(InterfaceC1035f sink, Deflater deflater) {
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(deflater, "deflater");
        this.f4393a = sink;
        this.f4394b = deflater;
    }

    @Override // J7.A
    public void I1(C1034e source, long j8) throws IOException {
        kotlin.jvm.internal.t.g(source, "source");
        AbstractC1031b.b(source.size(), 0L, j8);
        while (j8 > 0) {
            x xVar = source.f4378a;
            kotlin.jvm.internal.t.d(xVar);
            int iMin = (int) Math.min(j8, xVar.f4432c - xVar.f4431b);
            this.f4394b.setInput(xVar.f4430a, xVar.f4431b, iMin);
            b(false);
            long j9 = iMin;
            source.q1(source.size() - j9);
            int i8 = xVar.f4431b + iMin;
            xVar.f4431b = i8;
            if (i8 == xVar.f4432c) {
                source.f4378a = xVar.b();
                y.b(xVar);
            }
            j8 -= j9;
        }
    }

    public final void b(boolean z8) throws IOException {
        x xVarC1;
        int iDeflate;
        C1034e c1034eL = this.f4393a.l();
        while (true) {
            xVarC1 = c1034eL.C1(1);
            if (z8) {
                try {
                    Deflater deflater = this.f4394b;
                    byte[] bArr = xVarC1.f4430a;
                    int i8 = xVarC1.f4432c;
                    iDeflate = deflater.deflate(bArr, i8, 8192 - i8, 2);
                } catch (NullPointerException e8) {
                    throw new IOException("Deflater already closed", e8);
                }
            } else {
                Deflater deflater2 = this.f4394b;
                byte[] bArr2 = xVarC1.f4430a;
                int i9 = xVarC1.f4432c;
                iDeflate = deflater2.deflate(bArr2, i9, 8192 - i9);
            }
            if (iDeflate > 0) {
                xVarC1.f4432c += iDeflate;
                c1034eL.q1(c1034eL.size() + ((long) iDeflate));
                this.f4393a.o0();
            } else if (this.f4394b.needsInput()) {
                break;
            }
        }
        if (xVarC1.f4431b == xVarC1.f4432c) {
            c1034eL.f4378a = xVarC1.b();
            y.b(xVarC1);
        }
    }

    public final void c() throws IOException {
        this.f4394b.finish();
        b(false);
    }

    @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f4395c) {
            return;
        }
        c();
        th = null;
        try {
            this.f4394b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f4393a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4395c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // J7.A, java.io.Flushable
    public void flush() throws IOException {
        b(true);
        this.f4393a.flush();
    }

    @Override // J7.A
    public D r() {
        return this.f4393a.r();
    }

    public String toString() {
        return "DeflaterSink(" + this.f4393a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(A sink, Deflater deflater) {
        this(p.c(sink), deflater);
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(deflater, "deflater");
    }
}
