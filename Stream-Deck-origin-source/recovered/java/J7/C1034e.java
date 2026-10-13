package J7;

import D6.C0933m;
import P2.Lsk.mHPawN;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: J7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1034e implements g, InterfaceC1035f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f4378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4379b;

    /* JADX INFO: renamed from: J7.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1034e f4380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x f4382c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f4384e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f4383d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4385f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4386g = -1;

        public final x b() {
            return this.f4382c;
        }

        public final int c() {
            long j8 = this.f4383d;
            C1034e c1034e = this.f4380a;
            kotlin.jvm.internal.t.d(c1034e);
            if (j8 == c1034e.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j9 = this.f4383d;
            return o(j9 == -1 ? 0L : j9 + ((long) (this.f4386g - this.f4385f)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4380a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f4380a = null;
            t(null);
            this.f4383d = -1L;
            this.f4384e = null;
            this.f4385f = -1;
            this.f4386g = -1;
        }

        public final long j(long j8) {
            C1034e c1034e = this.f4380a;
            if (c1034e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f4381b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c1034e.size();
            if (j8 <= size) {
                if (j8 < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + j8).toString());
                }
                long j9 = size - j8;
                while (j9 > 0) {
                    x xVar = c1034e.f4378a;
                    kotlin.jvm.internal.t.d(xVar);
                    x xVar2 = xVar.f4436g;
                    kotlin.jvm.internal.t.d(xVar2);
                    int i8 = xVar2.f4432c;
                    long j10 = i8 - xVar2.f4431b;
                    if (j10 > j9) {
                        xVar2.f4432c = i8 - ((int) j9);
                        break;
                    }
                    c1034e.f4378a = xVar2.b();
                    y.b(xVar2);
                    j9 -= j10;
                }
                t(null);
                this.f4383d = j8;
                this.f4384e = null;
                this.f4385f = -1;
                this.f4386g = -1;
            } else if (j8 > size) {
                long j11 = j8 - size;
                boolean z8 = true;
                while (j11 > 0) {
                    x xVarC1 = c1034e.C1(1);
                    int iMin = (int) Math.min(j11, 8192 - xVarC1.f4432c);
                    xVarC1.f4432c += iMin;
                    j11 -= (long) iMin;
                    if (z8) {
                        t(xVarC1);
                        this.f4383d = size;
                        this.f4384e = xVarC1.f4430a;
                        int i9 = xVarC1.f4432c;
                        this.f4385f = i9 - iMin;
                        this.f4386g = i9;
                        z8 = false;
                    }
                }
            }
            c1034e.q1(j8);
            return size;
        }

        public final int o(long j8) {
            x xVarC;
            C1034e c1034e = this.f4380a;
            if (c1034e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j8 < -1 || j8 > c1034e.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j8 + " > size=" + c1034e.size());
            }
            if (j8 == -1 || j8 == c1034e.size()) {
                t(null);
                this.f4383d = j8;
                this.f4384e = null;
                this.f4385f = -1;
                this.f4386g = -1;
                return -1;
            }
            long size = c1034e.size();
            x xVarB = c1034e.f4378a;
            long j9 = 0;
            if (b() != null) {
                long j10 = this.f4383d;
                int i8 = this.f4385f;
                x xVarB2 = b();
                kotlin.jvm.internal.t.d(xVarB2);
                long j11 = j10 - ((long) (i8 - xVarB2.f4431b));
                if (j11 > j8) {
                    xVarC = xVarB;
                    xVarB = b();
                    size = j11;
                } else {
                    xVarC = b();
                    j9 = j11;
                }
            } else {
                xVarC = xVarB;
            }
            if (size - j8 > j8 - j9) {
                while (true) {
                    kotlin.jvm.internal.t.d(xVarC);
                    int i9 = xVarC.f4432c;
                    int i10 = xVarC.f4431b;
                    if (j8 < ((long) (i9 - i10)) + j9) {
                        break;
                    }
                    j9 += (long) (i9 - i10);
                    xVarC = xVarC.f4435f;
                }
            } else {
                while (size > j8) {
                    kotlin.jvm.internal.t.d(xVarB);
                    xVarB = xVarB.f4436g;
                    kotlin.jvm.internal.t.d(xVarB);
                    size -= (long) (xVarB.f4432c - xVarB.f4431b);
                }
                j9 = size;
                xVarC = xVarB;
            }
            if (this.f4381b) {
                kotlin.jvm.internal.t.d(xVarC);
                if (xVarC.f4433d) {
                    x xVarF = xVarC.f();
                    if (c1034e.f4378a == xVarC) {
                        c1034e.f4378a = xVarF;
                    }
                    xVarC = xVarC.c(xVarF);
                    x xVar = xVarC.f4436g;
                    kotlin.jvm.internal.t.d(xVar);
                    xVar.b();
                }
            }
            t(xVarC);
            this.f4383d = j8;
            kotlin.jvm.internal.t.d(xVarC);
            this.f4384e = xVarC.f4430a;
            int i11 = xVarC.f4431b + ((int) (j8 - j9));
            this.f4385f = i11;
            int i12 = xVarC.f4432c;
            this.f4386g = i12;
            return i12 - i11;
        }

        public final void t(x xVar) {
            this.f4382c = xVar;
        }
    }

    public static /* synthetic */ a T0(C1034e c1034e, a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = AbstractC1031b.d();
        }
        return c1034e.Q0(aVar);
    }

    public long A0(byte b8, long j8, long j9) {
        x xVar;
        int i8;
        long size = 0;
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        if (j9 > size()) {
            j9 = size();
        }
        if (j8 == j9 || (xVar = this.f4378a) == null) {
            return -1L;
        }
        if (size() - j8 < j8) {
            size = size();
            while (size > j8) {
                xVar = xVar.f4436g;
                kotlin.jvm.internal.t.d(xVar);
                size -= (long) (xVar.f4432c - xVar.f4431b);
            }
            while (size < j9) {
                byte[] bArr = xVar.f4430a;
                int iMin = (int) Math.min(xVar.f4432c, (((long) xVar.f4431b) + j9) - size);
                i8 = (int) ((((long) xVar.f4431b) + j8) - size);
                while (i8 < iMin) {
                    if (bArr[i8] != b8) {
                        i8++;
                    }
                }
                size += (long) (xVar.f4432c - xVar.f4431b);
                xVar = xVar.f4435f;
                kotlin.jvm.internal.t.d(xVar);
                j8 = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (xVar.f4432c - xVar.f4431b)) + size;
            if (j10 > j8) {
                break;
            }
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
            size = j10;
        }
        while (size < j9) {
            byte[] bArr2 = xVar.f4430a;
            int iMin2 = (int) Math.min(xVar.f4432c, (((long) xVar.f4431b) + j9) - size);
            i8 = (int) ((((long) xVar.f4431b) + j8) - size);
            while (i8 < iMin2) {
                if (bArr2[i8] != b8) {
                    i8++;
                }
            }
            size += (long) (xVar.f4432c - xVar.f4431b);
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
            j8 = size;
        }
        return -1L;
        return ((long) (i8 - xVar.f4431b)) + size;
    }

    public final h B1(int i8) {
        if (i8 == 0) {
            return h.f4389e;
        }
        AbstractC1031b.b(size(), 0L, i8);
        x xVar = this.f4378a;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            kotlin.jvm.internal.t.d(xVar);
            int i12 = xVar.f4432c;
            int i13 = xVar.f4431b;
            if (i12 == i13) {
                throw new AssertionError("s.limit == s.pos");
            }
            i10 += i12 - i13;
            i11++;
            xVar = xVar.f4435f;
        }
        byte[][] bArr = new byte[i11][];
        int[] iArr = new int[i11 * 2];
        x xVar2 = this.f4378a;
        int i14 = 0;
        while (i9 < i8) {
            kotlin.jvm.internal.t.d(xVar2);
            bArr[i14] = xVar2.f4430a;
            i9 += xVar2.f4432c - xVar2.f4431b;
            iArr[i14] = Math.min(i9, i8);
            iArr[i14 + i11] = xVar2.f4431b;
            xVar2.f4433d = true;
            i14++;
            xVar2 = xVar2.f4435f;
        }
        return new z(bArr, iArr);
    }

    @Override // J7.g
    public long C0(h bytes) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        return H0(bytes, 0L);
    }

    public final x C1(int i8) {
        if (i8 < 1 || i8 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        x xVar = this.f4378a;
        if (xVar != null) {
            kotlin.jvm.internal.t.d(xVar);
            x xVar2 = xVar.f4436g;
            kotlin.jvm.internal.t.d(xVar2);
            return (xVar2.f4432c + i8 > 8192 || !xVar2.f4434e) ? xVar2.c(y.c()) : xVar2;
        }
        x xVarC = y.c();
        this.f4378a = xVarC;
        xVarC.f4436g = xVarC;
        xVarC.f4435f = xVarC;
        return xVarC;
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public C1034e R0(h byteString) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        byteString.M(this, 0, byteString.H());
        return this;
    }

    @Override // J7.g
    public long G1(h targetBytes) {
        kotlin.jvm.internal.t.g(targetBytes, "targetBytes");
        return J0(targetBytes, 0L);
    }

    @Override // J7.g
    public C1034e H() {
        return this;
    }

    public long H0(h bytes, long j8) {
        int i8;
        long j9 = j8;
        kotlin.jvm.internal.t.g(bytes, "bytes");
        if (bytes.H() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j9 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j9).toString());
        }
        x xVar = this.f4378a;
        if (xVar == null) {
            return -1L;
        }
        if (size() - j9 >= j9) {
            while (true) {
                long j10 = ((long) (xVar.f4432c - xVar.f4431b)) + size;
                if (j10 > j9) {
                    break;
                }
                xVar = xVar.f4435f;
                kotlin.jvm.internal.t.d(xVar);
                size = j10;
            }
            byte[] bArrY = bytes.y();
            byte b8 = bArrY[0];
            int iH = bytes.H();
            long size2 = (size() - ((long) iH)) + 1;
            while (size < size2) {
                byte[] bArr = xVar.f4430a;
                int iMin = (int) Math.min(xVar.f4432c, (((long) xVar.f4431b) + size2) - size);
                i8 = (int) ((((long) xVar.f4431b) + j9) - size);
                while (i8 < iMin) {
                    if (bArr[i8] == b8 && K7.a.c(xVar, i8 + 1, bArrY, 1, iH)) {
                    }
                    i8++;
                }
                size += (long) (xVar.f4432c - xVar.f4431b);
                xVar = xVar.f4435f;
                kotlin.jvm.internal.t.d(xVar);
                j9 = size;
            }
            return -1L;
        }
        size = size();
        while (size > j9) {
            xVar = xVar.f4436g;
            kotlin.jvm.internal.t.d(xVar);
            size -= (long) (xVar.f4432c - xVar.f4431b);
        }
        byte[] bArrY2 = bytes.y();
        byte b9 = bArrY2[0];
        int iH2 = bytes.H();
        long size3 = (size() - ((long) iH2)) + 1;
        while (size < size3) {
            byte[] bArr2 = xVar.f4430a;
            long j11 = size3;
            int iMin2 = (int) Math.min(xVar.f4432c, (((long) xVar.f4431b) + size3) - size);
            i8 = (int) ((((long) xVar.f4431b) + j9) - size);
            while (i8 < iMin2) {
                if (bArr2[i8] != b9 || !K7.a.c(xVar, i8 + 1, bArrY2, 1, iH2)) {
                    i8++;
                }
            }
            size += (long) (xVar.f4432c - xVar.f4431b);
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
            j9 = size;
            size3 = j11;
        }
        return -1L;
        return ((long) (i8 - xVar.f4431b)) + size;
    }

    @Override // J7.A
    public void I1(C1034e source, long j8) {
        x xVar;
        kotlin.jvm.internal.t.g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1031b.b(source.size(), 0L, j8);
        while (j8 > 0) {
            x xVar2 = source.f4378a;
            kotlin.jvm.internal.t.d(xVar2);
            int i8 = xVar2.f4432c;
            x xVar3 = source.f4378a;
            kotlin.jvm.internal.t.d(xVar3);
            if (j8 < i8 - xVar3.f4431b) {
                x xVar4 = this.f4378a;
                if (xVar4 != null) {
                    kotlin.jvm.internal.t.d(xVar4);
                    xVar = xVar4.f4436g;
                } else {
                    xVar = null;
                }
                if (xVar != null && xVar.f4434e) {
                    if ((((long) xVar.f4432c) + j8) - ((long) (xVar.f4433d ? 0 : xVar.f4431b)) <= 8192) {
                        x xVar5 = source.f4378a;
                        kotlin.jvm.internal.t.d(xVar5);
                        xVar5.g(xVar, (int) j8);
                        source.q1(source.size() - j8);
                        q1(size() + j8);
                        return;
                    }
                }
                x xVar6 = source.f4378a;
                kotlin.jvm.internal.t.d(xVar6);
                source.f4378a = xVar6.e((int) j8);
            }
            x xVar7 = source.f4378a;
            kotlin.jvm.internal.t.d(xVar7);
            long j9 = xVar7.f4432c - xVar7.f4431b;
            source.f4378a = xVar7.b();
            x xVar8 = this.f4378a;
            if (xVar8 == null) {
                this.f4378a = xVar7;
                xVar7.f4436g = xVar7;
                xVar7.f4435f = xVar7;
            } else {
                kotlin.jvm.internal.t.d(xVar8);
                x xVar9 = xVar8.f4436g;
                kotlin.jvm.internal.t.d(xVar9);
                xVar9.c(xVar7).a();
            }
            source.q1(source.size() - j9);
            q1(size() + j9);
            j8 -= j9;
        }
    }

    public long J0(h targetBytes, long j8) {
        int i8;
        int i9;
        kotlin.jvm.internal.t.g(targetBytes, "targetBytes");
        long size = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
        }
        x xVar = this.f4378a;
        if (xVar == null) {
            return -1L;
        }
        if (size() - j8 < j8) {
            size = size();
            while (size > j8) {
                xVar = xVar.f4436g;
                kotlin.jvm.internal.t.d(xVar);
                size -= (long) (xVar.f4432c - xVar.f4431b);
            }
            if (targetBytes.H() == 2) {
                byte bE = targetBytes.e(0);
                byte bE2 = targetBytes.e(1);
                while (size < size()) {
                    byte[] bArr = xVar.f4430a;
                    i8 = (int) ((((long) xVar.f4431b) + j8) - size);
                    int i10 = xVar.f4432c;
                    while (true) {
                        if (i8 >= i10) {
                            size += (long) (xVar.f4432c - xVar.f4431b);
                            xVar = xVar.f4435f;
                            kotlin.jvm.internal.t.d(xVar);
                            j8 = size;
                        } else {
                            byte b8 = bArr[i8];
                            if (b8 == bE || b8 == bE2) {
                                i9 = xVar.f4431b;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrY = targetBytes.y();
                while (size < size()) {
                    byte[] bArr2 = xVar.f4430a;
                    i8 = (int) ((((long) xVar.f4431b) + j8) - size);
                    int i11 = xVar.f4432c;
                    while (true) {
                        if (i8 < i11) {
                            byte b9 = bArr2[i8];
                            int length = bArrY.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length) {
                                    i8++;
                                } else if (b9 == bArrY[i12]) {
                                    i9 = xVar.f4431b;
                                } else {
                                    i12++;
                                }
                            }
                        } else {
                            size += (long) (xVar.f4432c - xVar.f4431b);
                            xVar = xVar.f4435f;
                            kotlin.jvm.internal.t.d(xVar);
                            j8 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (xVar.f4432c - xVar.f4431b)) + size;
            if (j9 > j8) {
                break;
            }
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
            size = j9;
        }
        if (targetBytes.H() == 2) {
            byte bE3 = targetBytes.e(0);
            byte bE4 = targetBytes.e(1);
            while (size < size()) {
                byte[] bArr3 = xVar.f4430a;
                i8 = (int) ((((long) xVar.f4431b) + j8) - size);
                int i13 = xVar.f4432c;
                while (true) {
                    if (i8 >= i13) {
                        size += (long) (xVar.f4432c - xVar.f4431b);
                        xVar = xVar.f4435f;
                        kotlin.jvm.internal.t.d(xVar);
                        j8 = size;
                    } else {
                        byte b10 = bArr3[i8];
                        if (b10 == bE3 || b10 == bE4) {
                            i9 = xVar.f4431b;
                        } else {
                            i8++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrY2 = targetBytes.y();
            while (size < size()) {
                byte[] bArr4 = xVar.f4430a;
                i8 = (int) ((((long) xVar.f4431b) + j8) - size);
                int i14 = xVar.f4432c;
                while (true) {
                    if (i8 < i14) {
                        byte b11 = bArr4[i8];
                        int length2 = bArrY2.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length2) {
                                i8++;
                            } else if (b11 == bArrY2[i15]) {
                                i9 = xVar.f4431b;
                            } else {
                                i15++;
                            }
                        }
                    } else {
                        size += (long) (xVar.f4432c - xVar.f4431b);
                        xVar = xVar.f4435f;
                        kotlin.jvm.internal.t.d(xVar);
                        j8 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i8 - i9)) + size;
    }

    @Override // J7.C
    public long K0(C1034e sink, long j8) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j8 > size()) {
            j8 = size();
        }
        sink.I1(this, j8);
        return j8;
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public C1034e write(byte[] source) {
        kotlin.jvm.internal.t.g(source, "source");
        return write(source, 0, source.length);
    }

    public boolean L0(long j8, h bytes) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        return O0(j8, bytes, 0, bytes.H());
    }

    @Override // J7.InterfaceC1035f
    public long M(C source) {
        kotlin.jvm.internal.t.g(source, "source");
        long j8 = 0;
        while (true) {
            long jK0 = source.K0(this, 8192L);
            if (jK0 == -1) {
                return j8;
            }
            j8 += jK0;
        }
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: M1, reason: merged with bridge method [inline-methods] */
    public C1034e write(byte[] source, int i8, int i9) {
        kotlin.jvm.internal.t.g(source, "source");
        long j8 = i9;
        AbstractC1031b.b(source.length, i8, j8);
        int i10 = i9 + i8;
        while (i8 < i10) {
            x xVarC1 = C1(1);
            int iMin = Math.min(i10 - i8, 8192 - xVarC1.f4432c);
            int i11 = i8 + iMin;
            C0933m.d(source, xVarC1.f4430a, xVarC1.f4432c, i8, i11);
            xVarC1.f4432c += iMin;
            i8 = i11;
        }
        q1(size() + j8);
        return this;
    }

    public boolean O0(long j8, h bytes, int i8, int i9) {
        kotlin.jvm.internal.t.g(bytes, "bytes");
        if (j8 < 0 || i8 < 0 || i9 < 0 || size() - j8 < i9 || bytes.H() - i8 < i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (w0(((long) i10) + j8) != bytes.e(i8 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public C1034e writeByte(int i8) {
        x xVarC1 = C1(1);
        byte[] bArr = xVarC1.f4430a;
        int i9 = xVarC1.f4432c;
        xVarC1.f4432c = i9 + 1;
        bArr[i9] = (byte) i8;
        q1(size() + 1);
        return this;
    }

    public final a Q0(a unsafeCursor) {
        kotlin.jvm.internal.t.g(unsafeCursor, "unsafeCursor");
        return K7.a.a(this, unsafeCursor);
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
    public C1034e T1(long j8) {
        boolean z8;
        if (j8 == 0) {
            return writeByte(48);
        }
        int i8 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                return I0("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (j8 < 100000000) {
            if (j8 < 10000) {
                if (j8 >= 100) {
                    i8 = j8 < 1000 ? 3 : 4;
                } else if (j8 >= 10) {
                    i8 = 2;
                }
            } else if (j8 < 1000000) {
                i8 = j8 < 100000 ? 5 : 6;
            } else {
                i8 = j8 < 10000000 ? 7 : 8;
            }
        } else if (j8 < 1000000000000L) {
            if (j8 < 10000000000L) {
                i8 = j8 < 1000000000 ? 9 : 10;
            } else {
                i8 = j8 < 100000000000L ? 11 : 12;
            }
        } else if (j8 < 1000000000000000L) {
            if (j8 < 10000000000000L) {
                i8 = 13;
            } else {
                i8 = j8 < 100000000000000L ? 14 : 15;
            }
        } else if (j8 < 100000000000000000L) {
            i8 = j8 < 10000000000000000L ? 16 : 17;
        } else {
            i8 = j8 < 1000000000000000000L ? 18 : 19;
        }
        if (z8) {
            i8++;
        }
        x xVarC1 = C1(i8);
        byte[] bArr = xVarC1.f4430a;
        int i9 = xVarC1.f4432c + i8;
        while (j8 != 0) {
            long j9 = 10;
            i9--;
            bArr[i9] = K7.a.b()[(int) (j8 % j9)];
            j8 /= j9;
        }
        if (z8) {
            bArr[i9 - 1] = 45;
        }
        xVarC1.f4432c += i8;
        q1(size() + ((long) i8));
        return this;
    }

    @Override // J7.g
    public void S1(long j8) throws EOFException {
        if (this.f4379b < j8) {
            throw new EOFException();
        }
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
    public C1034e c1(long j8) {
        if (j8 == 0) {
            return writeByte(48);
        }
        long j9 = (j8 >>> 1) | j8;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i8 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        x xVarC1 = C1(i8);
        byte[] bArr = xVarC1.f4430a;
        int i9 = xVarC1.f4432c;
        for (int i10 = (i9 + i8) - 1; i10 >= i9; i10--) {
            bArr[i10] = K7.a.b()[(int) (15 & j8)];
            j8 >>>= 4;
        }
        xVarC1.f4432c += i8;
        q1(size() + ((long) i8));
        return this;
    }

    public byte[] V0() {
        return s1(size());
    }

    @Override // J7.g
    public long W1() throws EOFException {
        int i8;
        if (size() == 0) {
            throw new EOFException();
        }
        int i9 = 0;
        boolean z8 = false;
        long j8 = 0;
        do {
            x xVar = this.f4378a;
            kotlin.jvm.internal.t.d(xVar);
            byte[] bArr = xVar.f4430a;
            int i10 = xVar.f4431b;
            int i11 = xVar.f4432c;
            while (i10 < i11) {
                byte b8 = bArr[i10];
                if (b8 >= 48 && b8 <= 57) {
                    i8 = b8 - 48;
                } else if (b8 >= 97 && b8 <= 102) {
                    i8 = b8 - 87;
                } else {
                    if (b8 < 65 || b8 > 70) {
                        if (i9 != 0) {
                            z8 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC1031b.j(b8));
                    }
                    i8 = b8 - 55;
                }
                if (((-1152921504606846976L) & j8) != 0) {
                    throw new NumberFormatException("Number too large: " + new C1034e().c1(j8).writeByte(b8).o1());
                }
                j8 = (j8 << 4) | ((long) i8);
                i10++;
                i9++;
            }
            if (i10 == i11) {
                this.f4378a = xVar.b();
                y.b(xVar);
            } else {
                xVar.f4431b = i10;
            }
            if (z8) {
                break;
            }
        } while (this.f4378a != null);
        q1(size() - ((long) i9));
        return j8;
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public C1034e writeInt(int i8) {
        x xVarC1 = C1(4);
        byte[] bArr = xVarC1.f4430a;
        int i9 = xVarC1.f4432c;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i8 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i8 & 255);
        xVarC1.f4432c = i9 + 4;
        q1(size() + 4);
        return this;
    }

    public final C1034e Y() {
        C1034e c1034e = new C1034e();
        if (size() == 0) {
            return c1034e;
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        x xVarD = xVar.d();
        c1034e.f4378a = xVarD;
        xVarD.f4436g = xVarD;
        xVarD.f4435f = xVarD;
        for (x xVar2 = xVar.f4435f; xVar2 != xVar; xVar2 = xVar2.f4435f) {
            x xVar3 = xVarD.f4436g;
            kotlin.jvm.internal.t.d(xVar3);
            kotlin.jvm.internal.t.d(xVar2);
            xVar3.c(xVar2.d());
        }
        c1034e.q1(size());
        return c1034e;
    }

    @Override // J7.g
    public void Y0(C1034e sink, long j8) throws EOFException {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (size() >= j8) {
            sink.I1(this, j8);
        } else {
            sink.I1(this, size());
            throw new EOFException();
        }
    }

    @Override // J7.g
    public InputStream Y1() {
        return new b();
    }

    public C1034e Z1(long j8) {
        x xVarC1 = C1(8);
        byte[] bArr = xVarC1.f4430a;
        int i8 = xVarC1.f4432c;
        bArr[i8] = (byte) ((j8 >>> 56) & 255);
        bArr[i8 + 1] = (byte) ((j8 >>> 48) & 255);
        bArr[i8 + 2] = (byte) ((j8 >>> 40) & 255);
        bArr[i8 + 3] = (byte) ((j8 >>> 32) & 255);
        bArr[i8 + 4] = (byte) ((j8 >>> 24) & 255);
        bArr[i8 + 5] = (byte) ((j8 >>> 16) & 255);
        bArr[i8 + 6] = (byte) ((j8 >>> 8) & 255);
        bArr[i8 + 7] = (byte) (j8 & 255);
        xVarC1.f4432c = i8 + 8;
        q1(size() + 8);
        return this;
    }

    public h a1() {
        return I(size());
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C1034e writeShort(int i8) {
        x xVarC1 = C1(2);
        byte[] bArr = xVarC1.f4430a;
        int i9 = xVarC1.f4432c;
        bArr[i9] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i8 & 255);
        xVarC1.f4432c = i9 + 2;
        q1(size() + 2);
        return this;
    }

    public final void b() throws EOFException {
        skip(size());
    }

    public C1034e b2(String string, int i8, int i9, Charset charset) {
        kotlin.jvm.internal.t.g(string, "string");
        kotlin.jvm.internal.t.g(charset, "charset");
        if (i8 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i8).toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
        }
        if (i9 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.t.c(charset, Z6.c.f12941b)) {
            return b1(string, i8, i9);
        }
        String strSubstring = string.substring(i8, i9);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.t.f(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public C1034e I0(String string) {
        kotlin.jvm.internal.t.g(string, "string");
        return b1(string, 0, string.length());
    }

    @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public C1034e b1(String string, int i8, int i9) {
        char cCharAt;
        kotlin.jvm.internal.t.g(string, "string");
        if (i8 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i8).toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
        }
        if (i9 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
        }
        while (i8 < i9) {
            char cCharAt2 = string.charAt(i8);
            if (cCharAt2 < 128) {
                x xVarC1 = C1(1);
                byte[] bArr = xVarC1.f4430a;
                int i10 = xVarC1.f4432c - i8;
                int iMin = Math.min(i9, 8192 - i10);
                int i11 = i8 + 1;
                bArr[i8 + i10] = (byte) cCharAt2;
                while (true) {
                    i8 = i11;
                    if (i8 >= iMin || (cCharAt = string.charAt(i8)) >= 128) {
                        break;
                    }
                    i11 = i8 + 1;
                    bArr[i8 + i10] = (byte) cCharAt;
                }
                int i12 = xVarC1.f4432c;
                int i13 = (i10 + i8) - i12;
                xVarC1.f4432c = i12 + i13;
                q1(size() + ((long) i13));
            } else {
                if (cCharAt2 < 2048) {
                    x xVarC2 = C1(2);
                    byte[] bArr2 = xVarC2.f4430a;
                    int i14 = xVarC2.f4432c;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    xVarC2.f4432c = i14 + 2;
                    q1(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    x xVarC3 = C1(3);
                    byte[] bArr3 = xVarC3.f4430a;
                    int i15 = xVarC3.f4432c;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    xVarC3.f4432c = i15 + 3;
                    q1(size() + 3);
                } else {
                    int i16 = i8 + 1;
                    char cCharAt3 = i16 < i9 ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i8 = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        x xVarC4 = C1(4);
                        byte[] bArr4 = xVarC4.f4430a;
                        int i18 = xVarC4.f4432c;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        xVarC4.f4432c = i18 + 4;
                        q1(size() + 4);
                        i8 += 2;
                    }
                }
                i8++;
            }
        }
        return this;
    }

    public C1034e e2(int i8) {
        if (i8 < 128) {
            writeByte(i8);
            return this;
        }
        if (i8 < 2048) {
            x xVarC1 = C1(2);
            byte[] bArr = xVarC1.f4430a;
            int i9 = xVarC1.f4432c;
            bArr[i9] = (byte) ((i8 >> 6) | 192);
            bArr[i9 + 1] = (byte) ((i8 & 63) | 128);
            xVarC1.f4432c = i9 + 2;
            q1(size() + 2);
            return this;
        }
        if (55296 <= i8 && i8 < 57344) {
            writeByte(63);
            return this;
        }
        if (i8 < 65536) {
            x xVarC2 = C1(3);
            byte[] bArr2 = xVarC2.f4430a;
            int i10 = xVarC2.f4432c;
            bArr2[i10] = (byte) ((i8 >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i8 >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i8 & 63) | 128);
            xVarC2.f4432c = i10 + 3;
            q1(size() + 3);
            return this;
        }
        if (i8 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC1031b.k(i8));
        }
        x xVarC3 = C1(4);
        byte[] bArr3 = xVarC3.f4430a;
        int i11 = xVarC3.f4432c;
        bArr3[i11] = (byte) ((i8 >> 18) | 240);
        bArr3[i11 + 1] = (byte) (((i8 >> 12) & 63) | 128);
        bArr3[i11 + 2] = (byte) (((i8 >> 6) & 63) | 128);
        bArr3[i11 + 3] = (byte) ((i8 & 63) | 128);
        xVarC3.f4432c = i11 + 4;
        q1(size() + 4);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1034e)) {
            return false;
        }
        C1034e c1034e = (C1034e) obj;
        if (size() != c1034e.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        x xVar2 = c1034e.f4378a;
        kotlin.jvm.internal.t.d(xVar2);
        int i8 = xVar.f4431b;
        int i9 = xVar2.f4431b;
        long j8 = 0;
        while (j8 < size()) {
            long jMin = Math.min(xVar.f4432c - i8, xVar2.f4432c - i9);
            long j9 = 0;
            while (j9 < jMin) {
                int i10 = i8 + 1;
                int i11 = i9 + 1;
                if (xVar.f4430a[i8] != xVar2.f4430a[i9]) {
                    return false;
                }
                j9++;
                i8 = i10;
                i9 = i11;
            }
            if (i8 == xVar.f4432c) {
                xVar = xVar.f4435f;
                kotlin.jvm.internal.t.d(xVar);
                i8 = xVar.f4431b;
            }
            if (i9 == xVar2.f4432c) {
                xVar2 = xVar2.f4435f;
                kotlin.jvm.internal.t.d(xVar2);
                i9 = xVar2.f4431b;
            }
            j8 += jMin;
        }
        return true;
    }

    @Override // J7.g
    public boolean f0() {
        return this.f4379b == 0;
    }

    @Override // J7.InterfaceC1035f, J7.A, java.io.Flushable
    public void flush() {
    }

    public int g1() {
        return AbstractC1031b.h(readInt());
    }

    public int hashCode() {
        x xVar = this.f4378a;
        if (xVar == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i9 = xVar.f4432c;
            for (int i10 = xVar.f4431b; i10 < i9; i10++) {
                i8 = (i8 * 31) + xVar.f4430a[i10];
            }
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
        } while (xVar != this.f4378a);
        return i8;
    }

    public final C1034e i0(C1034e out, long j8, long j9) {
        kotlin.jvm.internal.t.g(out, "out");
        long j10 = j8;
        AbstractC1031b.b(size(), j10, j9);
        if (j9 != 0) {
            out.q1(out.size() + j9);
            x xVar = this.f4378a;
            while (true) {
                kotlin.jvm.internal.t.d(xVar);
                int i8 = xVar.f4432c;
                int i9 = xVar.f4431b;
                if (j10 < i8 - i9) {
                    break;
                }
                j10 -= (long) (i8 - i9);
                xVar = xVar.f4435f;
            }
            x xVar2 = xVar;
            long j11 = j9;
            while (j11 > 0) {
                kotlin.jvm.internal.t.d(xVar2);
                x xVarD = xVar2.d();
                int i10 = xVarD.f4431b + ((int) j10);
                xVarD.f4431b = i10;
                xVarD.f4432c = Math.min(i10 + ((int) j11), xVarD.f4432c);
                x xVar3 = out.f4378a;
                if (xVar3 == null) {
                    xVarD.f4436g = xVarD;
                    xVarD.f4435f = xVarD;
                    out.f4378a = xVarD;
                } else {
                    kotlin.jvm.internal.t.d(xVar3);
                    x xVar4 = xVar3.f4436g;
                    kotlin.jvm.internal.t.d(xVar4);
                    xVar4.c(xVarD);
                }
                j11 -= (long) (xVarD.f4432c - xVarD.f4431b);
                xVar2 = xVar2.f4435f;
                j10 = 0;
            }
        }
        return this;
    }

    public short i1() {
        return AbstractC1031b.i(readShort());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C1034e Q() {
        return this;
    }

    public String k1(long j8, Charset charset) throws EOFException {
        kotlin.jvm.internal.t.g(charset, "charset");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j8).toString());
        }
        if (this.f4379b < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        int i8 = xVar.f4431b;
        if (((long) i8) + j8 > xVar.f4432c) {
            return new String(s1(j8), charset);
        }
        int i9 = (int) j8;
        String str = new String(xVar.f4430a, i8, i9, charset);
        int i10 = xVar.f4431b + i9;
        xVar.f4431b = i10;
        this.f4379b -= j8;
        if (i10 == xVar.f4432c) {
            this.f4378a = xVar.b();
            y.b(xVar);
        }
        return str;
    }

    @Override // J7.g, J7.InterfaceC1035f
    public C1034e l() {
        return this;
    }

    @Override // J7.g
    public String n1() {
        return s0(Long.MAX_VALUE);
    }

    public String o1() {
        return k1(this.f4379b, Z6.c.f12941b);
    }

    @Override // J7.g
    public long p0() throws EOFException {
        long j8;
        byte b8;
        long j9 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        boolean z8 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z9 = false;
        loop0: while (true) {
            x xVar = this.f4378a;
            kotlin.jvm.internal.t.d(xVar);
            byte[] bArr = xVar.f4430a;
            int i9 = xVar.f4431b;
            int i10 = xVar.f4432c;
            while (true) {
                if (i9 >= i10) {
                    j8 = j9;
                    break;
                }
                b8 = bArr[i9];
                if (b8 >= 48 && b8 <= 57) {
                    int i11 = 48 - b8;
                    if (j10 < -922337203685477580L) {
                        break loop0;
                    }
                    j8 = j9;
                    if (j10 == -922337203685477580L && i11 < j11) {
                        break loop0;
                    }
                    j10 = (j10 * 10) + ((long) i11);
                } else {
                    j8 = j9;
                    if (b8 != 45 || i8 != 0) {
                        z9 = true;
                        break;
                    }
                    j11--;
                    z8 = true;
                }
                i9++;
                i8++;
                j9 = j8;
            }
            if (i9 == i10) {
                this.f4378a = xVar.b();
                y.b(xVar);
            } else {
                xVar.f4431b = i9;
            }
            if (z9 || this.f4378a == null) {
                q1(size() - ((long) i8));
                if (i8 >= (z8 ? 2 : 1)) {
                    return z8 ? j10 : -j10;
                }
                if (size() == j8) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z8 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + AbstractC1031b.j(w0(j8)));
            }
            j9 = j8;
        }
        C1034e c1034eWriteByte = new C1034e().T1(j10).writeByte(b8);
        if (!z8) {
            c1034eWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + c1034eWriteByte.o1());
    }

    public String p1(long j8) throws EOFException {
        return k1(j8, Z6.c.f12941b);
    }

    @Override // J7.g
    public g peek() {
        return p.d(new u(this));
    }

    public final void q1(long j8) {
        this.f4379b = j8;
    }

    @Override // J7.C
    public D r() {
        return D.f4357e;
    }

    @Override // J7.InterfaceC1035f
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C1034e o0() {
        return this;
    }

    public final h r1() {
        if (size() <= 2147483647L) {
            return B1((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        x xVar = this.f4378a;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), xVar.f4432c - xVar.f4431b);
        sink.put(xVar.f4430a, xVar.f4431b, iMin);
        int i8 = xVar.f4431b + iMin;
        xVar.f4431b = i8;
        this.f4379b -= (long) iMin;
        if (i8 == xVar.f4432c) {
            this.f4378a = xVar.b();
            y.b(xVar);
        }
        return iMin;
    }

    @Override // J7.g
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        int i8 = xVar.f4431b;
        int i9 = xVar.f4432c;
        int i10 = i8 + 1;
        byte b8 = xVar.f4430a[i8];
        q1(size() - 1);
        if (i10 != i9) {
            xVar.f4431b = i10;
            return b8;
        }
        this.f4378a = xVar.b();
        y.b(xVar);
        return b8;
    }

    @Override // J7.g
    public void readFully(byte[] sink) throws EOFException {
        kotlin.jvm.internal.t.g(sink, "sink");
        int i8 = 0;
        while (i8 < sink.length) {
            int i9 = read(sink, i8, sink.length - i8);
            if (i9 == -1) {
                throw new EOFException();
            }
            i8 += i9;
        }
    }

    @Override // J7.g
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        int i8 = xVar.f4431b;
        int i9 = xVar.f4432c;
        if (i9 - i8 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = xVar.f4430a;
        int i10 = i8 + 3;
        int i11 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 2] & 255) << 8);
        int i12 = i8 + 4;
        int i13 = (bArr[i10] & 255) | i11;
        q1(size() - 4);
        if (i12 != i9) {
            xVar.f4431b = i12;
            return i13;
        }
        this.f4378a = xVar.b();
        y.b(xVar);
        return i13;
    }

    @Override // J7.g
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        int i8 = xVar.f4431b;
        int i9 = xVar.f4432c;
        if (i9 - i8 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = xVar.f4430a;
        int i10 = i8 + 7;
        long j8 = ((((long) bArr[i8]) & 255) << 56) | ((((long) bArr[i8 + 1]) & 255) << 48) | ((((long) bArr[i8 + 2]) & 255) << 40) | ((((long) bArr[i8 + 3]) & 255) << 32) | ((((long) bArr[i8 + 4]) & 255) << 24) | ((((long) bArr[i8 + 5]) & 255) << 16) | ((((long) bArr[i8 + 6]) & 255) << 8);
        int i11 = i8 + 8;
        long j9 = j8 | (((long) bArr[i10]) & 255);
        q1(size() - 8);
        if (i11 != i9) {
            xVar.f4431b = i11;
            return j9;
        }
        this.f4378a = xVar.b();
        y.b(xVar);
        return j9;
    }

    @Override // J7.g
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        int i8 = xVar.f4431b;
        int i9 = xVar.f4432c;
        if (i9 - i8 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = xVar.f4430a;
        int i10 = i8 + 1;
        int i11 = (bArr[i8] & 255) << 8;
        int i12 = i8 + 2;
        int i13 = (bArr[i10] & 255) | i11;
        q1(size() - 2);
        if (i12 == i9) {
            this.f4378a = xVar.b();
            y.b(xVar);
        } else {
            xVar.f4431b = i12;
        }
        return (short) i13;
    }

    @Override // J7.g
    public boolean request(long j8) {
        return this.f4379b >= j8;
    }

    @Override // J7.g
    public String s0(long j8) throws EOFException {
        if (j8 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j8).toString());
        }
        long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        long jA0 = A0((byte) 10, 0L, j9);
        if (jA0 != -1) {
            return K7.a.d(this, jA0);
        }
        if (j9 < size() && w0(j9 - 1) == 13 && w0(j9) == 10) {
            return K7.a.d(this, j9);
        }
        C1034e c1034e = new C1034e();
        i0(c1034e, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j8) + " content=" + c1034e.a1().x() + (char) 8230);
    }

    @Override // J7.g
    public byte[] s1(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j8).toString());
        }
        if (size() < j8) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j8];
        readFully(bArr);
        return bArr;
    }

    public final long size() {
        return this.f4379b;
    }

    @Override // J7.g
    public void skip(long j8) throws EOFException {
        while (j8 > 0) {
            x xVar = this.f4378a;
            if (xVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j8, xVar.f4432c - xVar.f4431b);
            long j9 = iMin;
            q1(size() - j9);
            j8 -= j9;
            int i8 = xVar.f4431b + iMin;
            xVar.f4431b = i8;
            if (i8 == xVar.f4432c) {
                this.f4378a = xVar.b();
                y.b(xVar);
            }
        }
    }

    public String toString() {
        return r1().toString();
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C1034e clone() {
        return Y();
    }

    public final byte w0(long j8) {
        AbstractC1031b.b(size(), j8, 1L);
        x xVar = this.f4378a;
        if (xVar == null) {
            kotlin.jvm.internal.t.d(null);
            throw null;
        }
        if (size() - j8 < j8) {
            long size = size();
            while (size > j8) {
                xVar = xVar.f4436g;
                kotlin.jvm.internal.t.d(xVar);
                size -= (long) (xVar.f4432c - xVar.f4431b);
            }
            kotlin.jvm.internal.t.d(xVar);
            return xVar.f4430a[(int) ((((long) xVar.f4431b) + j8) - size)];
        }
        long j9 = 0;
        while (true) {
            long j10 = ((long) (xVar.f4432c - xVar.f4431b)) + j9;
            if (j10 > j8) {
                kotlin.jvm.internal.t.d(xVar);
                return xVar.f4430a[(int) ((((long) xVar.f4431b) + j8) - j9)];
            }
            xVar = xVar.f4435f;
            kotlin.jvm.internal.t.d(xVar);
            j9 = j10;
        }
    }

    @Override // J7.g
    public int y0(s options) throws EOFException {
        kotlin.jvm.internal.t.g(options, "options");
        int iF = K7.a.f(this, options, false, 2, null);
        if (iF == -1) {
            return -1;
        }
        skip(options.y()[iF].H());
        return iF;
    }

    public final long z() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        x xVar = this.f4378a;
        kotlin.jvm.internal.t.d(xVar);
        x xVar2 = xVar.f4436g;
        kotlin.jvm.internal.t.d(xVar2);
        int i8 = xVar2.f4432c;
        return (i8 >= 8192 || !xVar2.f4434e) ? size : size - ((long) (i8 - xVar2.f4431b));
    }

    /* JADX INFO: renamed from: J7.e$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C1034e.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C1034e.this.size() > 0) {
                return C1034e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C1034e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i8, int i9) {
            kotlin.jvm.internal.t.g(sink, "sink");
            return C1034e.this.read(sink, i8, i9);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // J7.g
    public h I(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException((mHPawN.XzTwYVh + j8).toString());
        }
        if (size() < j8) {
            throw new EOFException();
        }
        if (j8 < 4096) {
            return new h(s1(j8));
        }
        h hVarB1 = B1((int) j8);
        skip(j8);
        return hVarB1;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.t.g(source, "source");
        int iRemaining = source.remaining();
        int i8 = iRemaining;
        while (i8 > 0) {
            x xVarC1 = C1(1);
            int iMin = Math.min(i8, 8192 - xVarC1.f4432c);
            source.get(xVarC1.f4430a, xVarC1.f4432c, iMin);
            i8 -= iMin;
            xVarC1.f4432c += iMin;
        }
        this.f4379b += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i8, int i9) {
        kotlin.jvm.internal.t.g(sink, "sink");
        AbstractC1031b.b(sink.length, i8, i9);
        x xVar = this.f4378a;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(i9, xVar.f4432c - xVar.f4431b);
        byte[] bArr = xVar.f4430a;
        int i10 = xVar.f4431b;
        C0933m.d(bArr, sink, i8, i10, i10 + iMin);
        xVar.f4431b += iMin;
        q1(size() - ((long) iMin));
        if (xVar.f4431b == xVar.f4432c) {
            this.f4378a = xVar.b();
            y.b(xVar);
        }
        return iMin;
    }
}
