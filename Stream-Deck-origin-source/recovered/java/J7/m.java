package J7;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f4399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f4400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f4401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f4402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f4403e;

    @Override // J7.C
    public long K0(C1034e sink, long j8) throws IOException {
        m mVar;
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (j8 == 0) {
            return 0L;
        }
        if (this.f4399a == 0) {
            c();
            this.f4399a = (byte) 1;
        }
        if (this.f4399a == 1) {
            long size = sink.size();
            long jK0 = this.f4402d.K0(sink, j8);
            if (jK0 != -1) {
                o(sink, size, jK0);
                return jK0;
            }
            mVar = this;
            mVar.f4399a = (byte) 2;
        } else {
            mVar = this;
        }
        if (mVar.f4399a == 2) {
            j();
            mVar.f4399a = (byte) 3;
            if (!mVar.f4400b.f0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void b(String str, int i8, int i9) throws IOException {
        if (i9 == i8) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i9), Integer.valueOf(i8)}, 3));
        kotlin.jvm.internal.t.f(str2, "format(...)");
        throw new IOException(str2);
    }

    public final void c() throws IOException {
        this.f4400b.S1(10L);
        byte bW0 = this.f4400b.f4426b.w0(3L);
        boolean z8 = ((bW0 >> 1) & 1) == 1;
        if (z8) {
            o(this.f4400b.f4426b, 0L, 10L);
        }
        b("ID1ID2", 8075, this.f4400b.readShort());
        this.f4400b.skip(8L);
        if (((bW0 >> 2) & 1) == 1) {
            this.f4400b.S1(2L);
            if (z8) {
                o(this.f4400b.f4426b, 0L, 2L);
            }
            long jI1 = this.f4400b.f4426b.i1() & 65535;
            this.f4400b.S1(jI1);
            if (z8) {
                o(this.f4400b.f4426b, 0L, jI1);
            }
            this.f4400b.skip(jI1);
        }
        if (((bW0 >> 3) & 1) == 1) {
            long jB = this.f4400b.b((byte) 0);
            if (jB == -1) {
                throw new EOFException();
            }
            if (z8) {
                o(this.f4400b.f4426b, 0L, jB + 1);
            }
            this.f4400b.skip(jB + 1);
        }
        if (((bW0 >> 4) & 1) == 1) {
            long jB2 = this.f4400b.b((byte) 0);
            if (jB2 == -1) {
                throw new EOFException();
            }
            if (z8) {
                o(this.f4400b.f4426b, 0L, jB2 + 1);
            }
            this.f4400b.skip(jB2 + 1);
        }
        if (z8) {
            b("FHCRC", this.f4400b.v(), (short) this.f4403e.getValue());
            this.f4403e.reset();
        }
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4402d.close();
    }

    public final void j() throws IOException {
        b("CRC", this.f4400b.t(), (int) this.f4403e.getValue());
        b("ISIZE", this.f4400b.t(), (int) this.f4401c.getBytesWritten());
    }

    public final void o(C1034e c1034e, long j8, long j9) {
        x xVar = c1034e.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        while (true) {
            int i8 = xVar.f4432c;
            int i9 = xVar.f4431b;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= (long) (i8 - i9);
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
        }
        while (j9 > 0) {
            int i10 = (int) (((long) xVar.f4431b) + j8);
            int iMin = (int) Math.min(xVar.f4432c - i10, j9);
            this.f4403e.update(xVar.f4430a, i10, iMin);
            j9 -= (long) iMin;
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
            j8 = 0;
        }
    }

    @Override // J7.C
    public D r() {
        return this.f4400b.r();
    }

    public m(C c8) {
        kotlin.jvm.internal.t.g(c8, hJroAgFztiMK.leio);
        w wVar = new w(c8);
        this.f4400b = wVar;
        Inflater inflater = new Inflater(true);
        this.f4401c = inflater;
        this.f4402d = new n((g) wVar, inflater);
        this.f4403e = new CRC32();
    }
}
