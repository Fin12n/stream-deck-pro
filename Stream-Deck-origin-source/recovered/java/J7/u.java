package J7;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1034e f4417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f4418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4421f;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f4431b) goto L15;
     */
    @Override // J7.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long K0(C1034e sink, long j8) {
        x xVar;
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (this.f4420e) {
            throw new IllegalStateException("closed");
        }
        x xVar2 = this.f4418c;
        if (xVar2 != null) {
            x xVar3 = this.f4417b.f4378a;
            if (xVar2 == xVar3) {
                int i8 = this.f4419d;
                kotlin.jvm.internal.t.d(xVar3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j8 == 0) {
            return 0L;
        }
        if (!this.f4416a.request(this.f4421f + 1)) {
            return -1L;
        }
        if (this.f4418c == null && (xVar = this.f4417b.f4378a) != null) {
            this.f4418c = xVar;
            kotlin.jvm.internal.t.d(xVar);
            this.f4419d = xVar.f4431b;
        }
        long jMin = Math.min(j8, this.f4417b.size() - this.f4421f);
        this.f4417b.i0(sink, this.f4421f, jMin);
        this.f4421f += jMin;
        return jMin;
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4420e = true;
    }

    @Override // J7.C
    public D r() {
        return this.f4416a.r();
    }

    public u(g gVar) {
        kotlin.jvm.internal.t.g(gVar, uYOhHhTXuF.uuPexPWM);
        this.f4416a = gVar;
        C1034e c1034eL = gVar.l();
        this.f4417b = c1034eL;
        x xVar = c1034eL.f4378a;
        this.f4418c = xVar;
        this.f4419d = xVar != null ? xVar.f4431b : -1;
    }
}
