package J7;

import Z6.C1694a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f4425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1034e f4426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4427c;

    public w(C source) {
        kotlin.jvm.internal.t.g(source, "source");
        this.f4425a = source;
        this.f4426b = new C1034e();
    }

    @Override // J7.g
    public long C0(h bytes) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        return j(bytes, 0L);
    }

    @Override // J7.g
    public long G1(h targetBytes) {
        kotlin.jvm.internal.t.g(targetBytes, "targetBytes");
        return o(targetBytes, 0L);
    }

    @Override // J7.g
    public C1034e H() {
        return this.f4426b;
    }

    @Override // J7.g
    public h I(long j8) throws EOFException {
        S1(j8);
        return this.f4426b.I(j8);
    }

    @Override // J7.C
    public long K0(C1034e sink, long j8) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        if (this.f4426b.size() == 0 && this.f4425a.K0(this.f4426b, 8192L) == -1) {
            return -1L;
        }
        return this.f4426b.K0(sink, Math.min(j8, this.f4426b.size()));
    }

    @Override // J7.g
    public void S1(long j8) throws EOFException {
        if (!request(j8)) {
            throw new EOFException();
        }
    }

    @Override // J7.g
    public long W1() throws EOFException {
        S1(1L);
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            if (!request(i9)) {
                break;
            }
            byte bW0 = this.f4426b.w0(i8);
            if ((bW0 < 48 || bW0 > 57) && ((bW0 < 97 || bW0 > 102) && (bW0 < 65 || bW0 > 70))) {
                if (i8 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bW0, C1694a.a(16));
                kotlin.jvm.internal.t.f(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i8 = i9;
        }
        return this.f4426b.W1();
    }

    @Override // J7.g
    public void Y0(C1034e sink, long j8) throws EOFException {
        kotlin.jvm.internal.t.g(sink, "sink");
        try {
            S1(j8);
            this.f4426b.Y0(sink, j8);
        } catch (EOFException e8) {
            sink.M(this.f4426b);
            throw e8;
        }
    }

    @Override // J7.g
    public InputStream Y1() {
        return new a();
    }

    public long b(byte b8) {
        return c(b8, 0L, Long.MAX_VALUE);
    }

    public long c(byte b8, long j8, long j9) {
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        long jMax = j8;
        while (jMax < j9) {
            byte b9 = b8;
            long j10 = j9;
            long jA0 = this.f4426b.A0(b9, jMax, j10);
            if (jA0 != -1) {
                return jA0;
            }
            long size = this.f4426b.size();
            if (size >= j10 || this.f4425a.K0(this.f4426b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b8 = b9;
            j9 = j10;
        }
        return -1L;
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f4427c) {
            return;
        }
        this.f4427c = true;
        this.f4425a.close();
        this.f4426b.b();
    }

    @Override // J7.g
    public boolean f0() {
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        return this.f4426b.f0() && this.f4425a.K0(this.f4426b, 8192L) == -1;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f4427c;
    }

    public long j(h bytes, long j8) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jH0 = this.f4426b.H0(bytes, j8);
            if (jH0 != -1) {
                return jH0;
            }
            long size = this.f4426b.size();
            if (this.f4425a.K0(this.f4426b, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, (size - ((long) bytes.H())) + 1);
        }
    }

    @Override // J7.g, J7.InterfaceC1035f
    public C1034e l() {
        return this.f4426b;
    }

    @Override // J7.g
    public String n1() {
        return s0(Long.MAX_VALUE);
    }

    public long o(h targetBytes, long j8) {
        kotlin.jvm.internal.t.g(targetBytes, "targetBytes");
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jJ0 = this.f4426b.J0(targetBytes, j8);
            if (jJ0 != -1) {
                return jJ0;
            }
            long size = this.f4426b.size();
            if (this.f4425a.K0(this.f4426b, 8192L) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, size);
        }
    }

    @Override // J7.g
    public long p0() throws EOFException {
        S1(1L);
        long j8 = 0;
        while (true) {
            long j9 = j8 + 1;
            if (!request(j9)) {
                break;
            }
            byte bW0 = this.f4426b.w0(j8);
            if ((bW0 < 48 || bW0 > 57) && !(j8 == 0 && bW0 == 45)) {
                if (j8 != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bW0, C1694a.a(16));
                kotlin.jvm.internal.t.f(string, "toString(...)");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j8 = j9;
        }
        return this.f4426b.p0();
    }

    @Override // J7.g
    public g peek() {
        return p.d(new u(this));
    }

    @Override // J7.C
    public D r() {
        return this.f4425a.r();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (this.f4426b.size() == 0 && this.f4425a.K0(this.f4426b, 8192L) == -1) {
            return -1;
        }
        return this.f4426b.read(sink);
    }

    @Override // J7.g
    public byte readByte() throws EOFException {
        S1(1L);
        return this.f4426b.readByte();
    }

    @Override // J7.g
    public void readFully(byte[] sink) throws EOFException {
        kotlin.jvm.internal.t.g(sink, "sink");
        try {
            S1(sink.length);
            this.f4426b.readFully(sink);
        } catch (EOFException e8) {
            int i8 = 0;
            while (this.f4426b.size() > 0) {
                C1034e c1034e = this.f4426b;
                int i9 = c1034e.read(sink, i8, (int) c1034e.size());
                if (i9 == -1) {
                    throw new AssertionError();
                }
                i8 += i9;
            }
            throw e8;
        }
    }

    @Override // J7.g
    public int readInt() throws EOFException {
        S1(4L);
        return this.f4426b.readInt();
    }

    @Override // J7.g
    public long readLong() throws EOFException {
        S1(8L);
        return this.f4426b.readLong();
    }

    @Override // J7.g
    public short readShort() throws EOFException {
        S1(2L);
        return this.f4426b.readShort();
    }

    @Override // J7.g
    public boolean request(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        while (this.f4426b.size() < j8) {
            if (this.f4425a.K0(this.f4426b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // J7.g
    public String s0(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j8).toString());
        }
        long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long jC = c((byte) 10, 0L, j9);
        if (jC != -1) {
            return K7.a.d(this.f4426b, jC);
        }
        if (j9 < Long.MAX_VALUE && request(j9) && this.f4426b.w0(j9 - 1) == 13 && request(j9 + 1) && this.f4426b.w0(j9) == 10) {
            return K7.a.d(this.f4426b, j9);
        }
        C1034e c1034e = new C1034e();
        C1034e c1034e2 = this.f4426b;
        c1034e2.i0(c1034e, 0L, Math.min(32, c1034e2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f4426b.size(), j8) + " content=" + c1034e.a1().x() + (char) 8230);
    }

    @Override // J7.g
    public byte[] s1(long j8) throws EOFException {
        S1(j8);
        return this.f4426b.s1(j8);
    }

    @Override // J7.g
    public void skip(long j8) throws EOFException {
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        while (j8 > 0) {
            if (this.f4426b.size() == 0 && this.f4425a.K0(this.f4426b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j8, this.f4426b.size());
            this.f4426b.skip(jMin);
            j8 -= jMin;
        }
    }

    public int t() throws EOFException {
        S1(4L);
        return this.f4426b.g1();
    }

    public String toString() {
        return "buffer(" + this.f4425a + ')';
    }

    public short v() throws EOFException {
        S1(2L);
        return this.f4426b.i1();
    }

    @Override // J7.g
    public int y0(s options) throws EOFException {
        kotlin.jvm.internal.t.g(options, "options");
        if (this.f4427c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iE = K7.a.e(this.f4426b, options, true);
            if (iE != -2) {
                if (iE == -1) {
                    return -1;
                }
                this.f4426b.skip(options.y()[iE].H());
                return iE;
            }
        } while (this.f4425a.K0(this.f4426b, 8192L) != -1);
        return -1;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            w wVar = w.this;
            if (wVar.f4427c) {
                throw new IOException("closed");
            }
            return (int) Math.min(wVar.f4426b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            w.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            w wVar = w.this;
            if (wVar.f4427c) {
                throw new IOException("closed");
            }
            if (wVar.f4426b.size() == 0) {
                w wVar2 = w.this;
                if (wVar2.f4425a.K0(wVar2.f4426b, 8192L) == -1) {
                    return -1;
                }
            }
            return w.this.f4426b.readByte() & 255;
        }

        public String toString() {
            return w.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i8, int i9) throws IOException {
            kotlin.jvm.internal.t.g(data, "data");
            if (!w.this.f4427c) {
                AbstractC1031b.b(data.length, i8, i9);
                if (w.this.f4426b.size() == 0) {
                    w wVar = w.this;
                    if (wVar.f4425a.K0(wVar.f4426b, 8192L) == -1) {
                        return -1;
                    }
                }
                return w.this.f4426b.read(data, i8, i9);
            }
            throw new IOException("closed");
        }
    }
}
