package J7;

import java.nio.ByteBuffer;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements InterfaceC1035f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f4422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1034e f4423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4424c;

    public v(A sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        this.f4422a = sink;
        this.f4423b = new C1034e();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f I0(String string) {
        kotlin.jvm.internal.t.g(string, "string");
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.I0(string);
        return o0();
    }

    @Override // J7.A
    public void I1(C1034e source, long j8) {
        kotlin.jvm.internal.t.g(source, "source");
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.I1(source, j8);
        o0();
    }

    @Override // J7.InterfaceC1035f
    public long M(C source) {
        kotlin.jvm.internal.t.g(source, "source");
        long j8 = 0;
        while (true) {
            long jK0 = source.K0(this.f4423b, 8192L);
            if (jK0 == -1) {
                return j8;
            }
            j8 += jK0;
            o0();
        }
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f Q() {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f4423b.size();
        if (size > 0) {
            this.f4422a.I1(this.f4423b, size);
        }
        return this;
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f R0(h byteString) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.R0(byteString);
        return o0();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f T1(long j8) {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.T1(j8);
        return o0();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f b1(String string, int i8, int i9) {
        kotlin.jvm.internal.t.g(string, "string");
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.b1(string, i8, i9);
        return o0();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f c1(long j8) {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.c1(j8);
        return o0();
    }

    @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f4424c) {
            return;
        }
        if (this.f4423b.size() > 0) {
            A a8 = this.f4422a;
            C1034e c1034e = this.f4423b;
            a8.I1(c1034e, c1034e.size());
        }
        th = null;
        try {
            this.f4422a.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f4424c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // J7.InterfaceC1035f, J7.A, java.io.Flushable
    public void flush() {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        if (this.f4423b.size() > 0) {
            A a8 = this.f4422a;
            C1034e c1034e = this.f4423b;
            a8.I1(c1034e, c1034e.size());
        }
        this.f4422a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f4424c;
    }

    @Override // J7.InterfaceC1035f
    public C1034e l() {
        return this.f4423b;
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f o0() {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        long jZ = this.f4423b.z();
        if (jZ > 0) {
            this.f4422a.I1(this.f4423b, jZ);
        }
        return this;
    }

    @Override // J7.A
    public D r() {
        return this.f4422a.r();
    }

    public String toString() {
        return "buffer(" + this.f4422a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.t.g(byteBuffer, hJroAgFztiMK.yiYSLvlxZqa);
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f4423b.write(byteBuffer);
        o0();
        return iWrite;
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f writeByte(int i8) {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.writeByte(i8);
        return o0();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f writeInt(int i8) {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.writeInt(i8);
        return o0();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f writeShort(int i8) {
        if (this.f4424c) {
            throw new IllegalStateException("closed");
        }
        this.f4423b.writeShort(i8);
        return o0();
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f write(byte[] source) {
        kotlin.jvm.internal.t.g(source, "source");
        if (!this.f4424c) {
            this.f4423b.write(source);
            return o0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // J7.InterfaceC1035f
    public InterfaceC1035f write(byte[] source, int i8, int i9) {
        kotlin.jvm.internal.t.g(source, "source");
        if (!this.f4424c) {
            this.f4423b.write(source, i8, i9);
            return o0();
        }
        throw new IllegalStateException("closed");
    }
}
