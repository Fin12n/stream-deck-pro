package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2100k extends AbstractC2096g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f19342c = Logger.getLogger(AbstractC2100k.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f19343d = z0.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2101l f19344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19345b;

    /* JADX INFO: renamed from: com.google.protobuf.k$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b extends AbstractC2100k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f19346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19348g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19349h;

        public b(int i8) {
            super();
            if (i8 < 0) {
                throw new IllegalArgumentException(bGZGhbtQmA.wCCJTwfM);
            }
            byte[] bArr = new byte[Math.max(i8, 20)];
            this.f19346e = bArr;
            this.f19347f = bArr.length;
        }

        public final void b1(byte b8) {
            byte[] bArr = this.f19346e;
            int i8 = this.f19348g;
            this.f19348g = i8 + 1;
            bArr[i8] = b8;
            this.f19349h++;
        }

        public final void c1(int i8) {
            byte[] bArr = this.f19346e;
            int i9 = this.f19348g;
            int i10 = i9 + 1;
            this.f19348g = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f19348g = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f19348g = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f19348g = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
            this.f19349h += 4;
        }

        public final void d1(long j8) {
            byte[] bArr = this.f19346e;
            int i8 = this.f19348g;
            int i9 = i8 + 1;
            this.f19348g = i9;
            bArr[i8] = (byte) (j8 & 255);
            int i10 = i8 + 2;
            this.f19348g = i10;
            bArr[i9] = (byte) ((j8 >> 8) & 255);
            int i11 = i8 + 3;
            this.f19348g = i11;
            bArr[i10] = (byte) ((j8 >> 16) & 255);
            int i12 = i8 + 4;
            this.f19348g = i12;
            bArr[i11] = (byte) (255 & (j8 >> 24));
            int i13 = i8 + 5;
            this.f19348g = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f19348g = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f19348g = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f19348g = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            this.f19349h += 8;
        }

        public final void e1(int i8) {
            if (i8 >= 0) {
                g1(i8);
            } else {
                h1(i8);
            }
        }

        public final void f1(int i8, int i9) {
            g1(C0.c(i8, i9));
        }

        public final void g1(int i8) {
            if (!AbstractC2100k.f19343d) {
                while ((i8 & (-128)) != 0) {
                    byte[] bArr = this.f19346e;
                    int i9 = this.f19348g;
                    this.f19348g = i9 + 1;
                    bArr[i9] = (byte) ((i8 & 127) | 128);
                    this.f19349h++;
                    i8 >>>= 7;
                }
                byte[] bArr2 = this.f19346e;
                int i10 = this.f19348g;
                this.f19348g = i10 + 1;
                bArr2[i10] = (byte) i8;
                this.f19349h++;
                return;
            }
            long j8 = this.f19348g;
            while ((i8 & (-128)) != 0) {
                byte[] bArr3 = this.f19346e;
                int i11 = this.f19348g;
                this.f19348g = i11 + 1;
                z0.O(bArr3, i11, (byte) ((i8 & 127) | 128));
                i8 >>>= 7;
            }
            byte[] bArr4 = this.f19346e;
            int i12 = this.f19348g;
            this.f19348g = i12 + 1;
            z0.O(bArr4, i12, (byte) i8);
            this.f19349h += (int) (((long) this.f19348g) - j8);
        }

        public final void h1(long j8) {
            if (!AbstractC2100k.f19343d) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f19346e;
                    int i8 = this.f19348g;
                    this.f19348g = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) & 127) | 128);
                    this.f19349h++;
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f19346e;
                int i9 = this.f19348g;
                this.f19348g = i9 + 1;
                bArr2[i9] = (byte) j8;
                this.f19349h++;
                return;
            }
            long j9 = this.f19348g;
            while ((j8 & (-128)) != 0) {
                byte[] bArr3 = this.f19346e;
                int i10 = this.f19348g;
                this.f19348g = i10 + 1;
                z0.O(bArr3, i10, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            byte[] bArr4 = this.f19346e;
            int i11 = this.f19348g;
            this.f19348g = i11 + 1;
            z0.O(bArr4, i11, (byte) j8);
            this.f19349h += (int) (((long) this.f19348g) - j9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends IOException {
        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OutputStream f19354i;

        public e(OutputStream outputStream, int i8) {
            super(i8);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f19354i = outputStream;
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void E0(int i8, int i9) throws IOException {
            j1(20);
            f1(i8, 0);
            e1(i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void F0(int i8) throws IOException {
            if (i8 >= 0) {
                Y0(i8);
            } else {
                a1(i8);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void I0(int i8, T t8, n0 n0Var) throws IOException {
            W0(i8, 2);
            n1(t8, n0Var);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void J0(T t8) throws IOException {
            Y0(t8.getSerializedSize());
            t8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void K0(int i8, T t8) throws IOException {
            W0(1, 3);
            X0(2, i8);
            m1(3, t8);
            W0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void L0(int i8, AbstractC2097h abstractC2097h) throws IOException {
            W0(1, 3);
            X0(2, i8);
            o0(3, abstractC2097h);
            W0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void U0(int i8, String str) throws IOException {
            W0(i8, 2);
            V0(str);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void V0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iX = AbstractC2100k.X(length);
                int i8 = iX + length;
                int i9 = this.f19347f;
                if (i8 > i9) {
                    byte[] bArr = new byte[length];
                    int i10 = A0.i(str, bArr, 0, length);
                    Y0(i10);
                    b(bArr, 0, i10);
                    return;
                }
                if (i8 > i9 - this.f19348g) {
                    i1();
                }
                int iX2 = AbstractC2100k.X(str.length());
                int i11 = this.f19348g;
                try {
                    if (iX2 == iX) {
                        int i12 = i11 + iX2;
                        this.f19348g = i12;
                        int i13 = A0.i(str, this.f19346e, i12, this.f19347f - i12);
                        this.f19348g = i11;
                        iJ = (i13 - i11) - iX2;
                        g1(iJ);
                        this.f19348g = i13;
                    } else {
                        iJ = A0.j(str);
                        g1(iJ);
                        this.f19348g = A0.i(str, this.f19346e, this.f19348g, iJ);
                    }
                    this.f19349h += iJ;
                } catch (A0.d e8) {
                    this.f19349h -= this.f19348g - i11;
                    this.f19348g = i11;
                    throw e8;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    throw new d(e9);
                }
            } catch (A0.d e10) {
                d0(str, e10);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void W0(int i8, int i9) throws IOException {
            Y0(C0.c(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void X0(int i8, int i9) throws IOException {
            j1(20);
            f1(i8, 0);
            g1(i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void Y0(int i8) throws IOException {
            j1(5);
            g1(i8);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void Z0(int i8, long j8) throws IOException {
            j1(20);
            f1(i8, 0);
            h1(j8);
        }

        @Override // com.google.protobuf.AbstractC2096g
        public void a(ByteBuffer byteBuffer) throws IOException {
            k1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void a1(long j8) throws IOException {
            j1(10);
            h1(j8);
        }

        @Override // com.google.protobuf.AbstractC2100k, com.google.protobuf.AbstractC2096g
        public void b(byte[] bArr, int i8, int i9) throws IOException {
            l1(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void c0() throws IOException {
            if (this.f19348g > 0) {
                i1();
            }
        }

        public final void i1() throws IOException {
            this.f19354i.write(this.f19346e, 0, this.f19348g);
            this.f19348g = 0;
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void j0(byte b8) throws IOException {
            if (this.f19348g == this.f19347f) {
                i1();
            }
            b1(b8);
        }

        public final void j1(int i8) throws IOException {
            if (this.f19347f - this.f19348g < i8) {
                i1();
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void k0(int i8, boolean z8) throws IOException {
            j1(11);
            f1(i8, 0);
            b1(z8 ? (byte) 1 : (byte) 0);
        }

        public void k1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i8 = this.f19347f;
            int i9 = this.f19348g;
            if (i8 - i9 >= iRemaining) {
                byteBuffer.get(this.f19346e, i9, iRemaining);
                this.f19348g += iRemaining;
                this.f19349h += iRemaining;
                return;
            }
            int i10 = i8 - i9;
            byteBuffer.get(this.f19346e, i9, i10);
            int i11 = iRemaining - i10;
            this.f19348g = this.f19347f;
            this.f19349h += i10;
            i1();
            while (true) {
                int i12 = this.f19347f;
                if (i11 <= i12) {
                    byteBuffer.get(this.f19346e, 0, i11);
                    this.f19348g = i11;
                    this.f19349h += i11;
                    return;
                } else {
                    byteBuffer.get(this.f19346e, 0, i12);
                    this.f19354i.write(this.f19346e, 0, this.f19347f);
                    int i13 = this.f19347f;
                    i11 -= i13;
                    this.f19349h += i13;
                }
            }
        }

        public void l1(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = this.f19347f;
            int i11 = this.f19348g;
            if (i10 - i11 >= i9) {
                System.arraycopy(bArr, i8, this.f19346e, i11, i9);
                this.f19348g += i9;
                this.f19349h += i9;
                return;
            }
            int i12 = i10 - i11;
            System.arraycopy(bArr, i8, this.f19346e, i11, i12);
            int i13 = i8 + i12;
            int i14 = i9 - i12;
            this.f19348g = this.f19347f;
            this.f19349h += i12;
            i1();
            if (i14 <= this.f19347f) {
                System.arraycopy(bArr, i13, this.f19346e, 0, i14);
                this.f19348g = i14;
            } else {
                this.f19354i.write(bArr, i13, i14);
            }
            this.f19349h += i14;
        }

        public void m1(int i8, T t8) throws IOException {
            W0(i8, 2);
            J0(t8);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void n0(byte[] bArr, int i8, int i9) throws IOException {
            Y0(i9);
            l1(bArr, i8, i9);
        }

        public void n1(T t8, n0 n0Var) throws IOException {
            Y0(((AbstractC2086a) t8).getSerializedSize(n0Var));
            n0Var.b(t8, this.f19344a);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void o0(int i8, AbstractC2097h abstractC2097h) throws IOException {
            W0(i8, 2);
            p0(abstractC2097h);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void p0(AbstractC2097h abstractC2097h) throws IOException {
            Y0(abstractC2097h.size());
            abstractC2097h.Y(this);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void u0(int i8, int i9) throws IOException {
            j1(14);
            f1(i8, 5);
            c1(i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void v0(int i8) throws IOException {
            j1(4);
            c1(i8);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void w0(int i8, long j8) throws IOException {
            j1(18);
            f1(i8, 1);
            d1(j8);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void x0(long j8) throws IOException {
            j1(8);
            d1(j8);
        }
    }

    public static int A(int i8, F f8) {
        return (V(1) * 2) + W(2, i8) + B(3, f8);
    }

    public static int B(int i8, F f8) {
        return V(i8) + C(f8);
    }

    public static int C(F f8) {
        return D(f8.c());
    }

    public static int D(int i8) {
        return X(i8) + i8;
    }

    public static int E(int i8, T t8) {
        return (V(1) * 2) + W(2, i8) + F(3, t8);
    }

    public static int F(int i8, T t8) {
        return V(i8) + H(t8);
    }

    public static int G(int i8, T t8, n0 n0Var) {
        return V(i8) + I(t8, n0Var);
    }

    public static int H(T t8) {
        return D(t8.getSerializedSize());
    }

    public static int I(T t8, n0 n0Var) {
        return D(((AbstractC2086a) t8).getSerializedSize(n0Var));
    }

    public static int J(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    public static int K(int i8, AbstractC2097h abstractC2097h) {
        return (V(1) * 2) + W(2, i8) + h(3, abstractC2097h);
    }

    public static int L(int i8, int i9) {
        return V(i8) + M(i9);
    }

    public static int M(int i8) {
        return 4;
    }

    public static int N(int i8, long j8) {
        return V(i8) + O(j8);
    }

    public static int O(long j8) {
        return 8;
    }

    public static int P(int i8, int i9) {
        return V(i8) + Q(i9);
    }

    public static int Q(int i8) {
        return X(a0(i8));
    }

    public static int R(int i8, long j8) {
        return V(i8) + S(j8);
    }

    public static int S(long j8) {
        return Z(b0(j8));
    }

    public static int T(int i8, String str) {
        return V(i8) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = A0.j(str);
        } catch (A0.d unused) {
            length = str.getBytes(A.f19048b).length;
        }
        return D(length);
    }

    public static int V(int i8) {
        return X(C0.c(i8, 0));
    }

    public static int W(int i8, int i9) {
        return V(i8) + X(i9);
    }

    public static int X(int i8) {
        if ((i8 & (-128)) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Y(int i8, long j8) {
        return V(i8) + Z(j8);
    }

    public static int Z(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i8 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public static int a0(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public static long b0(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static int e(int i8, boolean z8) {
        return V(i8) + f(z8);
    }

    public static int f(boolean z8) {
        return 1;
    }

    public static AbstractC2100k f0(OutputStream outputStream, int i8) {
        return new e(outputStream, i8);
    }

    public static int g(byte[] bArr) {
        return D(bArr.length);
    }

    public static AbstractC2100k g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(int i8, AbstractC2097h abstractC2097h) {
        return V(i8) + i(abstractC2097h);
    }

    public static AbstractC2100k h0(byte[] bArr, int i8, int i9) {
        return new c(bArr, i8, i9);
    }

    public static int i(AbstractC2097h abstractC2097h) {
        return D(abstractC2097h.size());
    }

    public static int j(int i8, double d8) {
        return V(i8) + k(d8);
    }

    public static int k(double d8) {
        return 8;
    }

    public static int l(int i8, int i9) {
        return V(i8) + m(i9);
    }

    public static int m(int i8) {
        return x(i8);
    }

    public static int n(int i8, int i9) {
        return V(i8) + o(i9);
    }

    public static int o(int i8) {
        return 4;
    }

    public static int p(int i8, long j8) {
        return V(i8) + q(j8);
    }

    public static int q(long j8) {
        return 8;
    }

    public static int r(int i8, float f8) {
        return V(i8) + s(f8);
    }

    public static int s(float f8) {
        return 4;
    }

    public static int t(int i8, T t8, n0 n0Var) {
        return (V(i8) * 2) + v(t8, n0Var);
    }

    public static int u(T t8) {
        return t8.getSerializedSize();
    }

    public static int v(T t8, n0 n0Var) {
        return ((AbstractC2086a) t8).getSerializedSize(n0Var);
    }

    public static int w(int i8, int i9) {
        return V(i8) + x(i9);
    }

    public static int x(int i8) {
        if (i8 >= 0) {
            return X(i8);
        }
        return 10;
    }

    public static int y(int i8, long j8) {
        return V(i8) + z(j8);
    }

    public static int z(long j8) {
        return Z(j8);
    }

    public final void A0(int i8, T t8) {
        W0(i8, 3);
        C0(t8);
        W0(i8, 4);
    }

    public final void B0(int i8, T t8, n0 n0Var) {
        W0(i8, 3);
        D0(t8, n0Var);
        W0(i8, 4);
    }

    public final void C0(T t8) {
        t8.writeTo(this);
    }

    public final void D0(T t8, n0 n0Var) {
        n0Var.b(t8, this.f19344a);
    }

    public abstract void E0(int i8, int i9);

    public abstract void F0(int i8);

    public final void G0(int i8, long j8) {
        Z0(i8, j8);
    }

    public final void H0(long j8) {
        a1(j8);
    }

    public abstract void I0(int i8, T t8, n0 n0Var);

    public abstract void J0(T t8);

    public abstract void K0(int i8, T t8);

    public abstract void L0(int i8, AbstractC2097h abstractC2097h);

    public final void M0(int i8, int i9) {
        u0(i8, i9);
    }

    public final void N0(int i8) {
        v0(i8);
    }

    public final void O0(int i8, long j8) {
        w0(i8, j8);
    }

    public final void P0(long j8) {
        x0(j8);
    }

    public final void Q0(int i8, int i9) {
        X0(i8, a0(i9));
    }

    public final void R0(int i8) {
        Y0(a0(i8));
    }

    public final void S0(int i8, long j8) {
        Z0(i8, b0(j8));
    }

    public final void T0(long j8) {
        a1(b0(j8));
    }

    public abstract void U0(int i8, String str);

    public abstract void V0(String str);

    public abstract void W0(int i8, int i9);

    public abstract void X0(int i8, int i9);

    public abstract void Y0(int i8);

    public abstract void Z0(int i8, long j8);

    public abstract void a1(long j8);

    @Override // com.google.protobuf.AbstractC2096g
    public abstract void b(byte[] bArr, int i8, int i9);

    public abstract void c0();

    public final void d() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void d0(String str, A0.d dVar) throws d {
        f19342c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(A.f19048b);
        try {
            Y0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new d(e8);
        }
    }

    public boolean e0() {
        return this.f19345b;
    }

    public abstract int i0();

    public abstract void j0(byte b8);

    public abstract void k0(int i8, boolean z8);

    public final void l0(boolean z8) {
        j0(z8 ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) {
        n0(bArr, 0, bArr.length);
    }

    public abstract void n0(byte[] bArr, int i8, int i9);

    public abstract void o0(int i8, AbstractC2097h abstractC2097h);

    public abstract void p0(AbstractC2097h abstractC2097h);

    public final void q0(int i8, double d8) {
        w0(i8, Double.doubleToRawLongBits(d8));
    }

    public final void r0(double d8) {
        x0(Double.doubleToRawLongBits(d8));
    }

    public final void s0(int i8, int i9) {
        E0(i8, i9);
    }

    public final void t0(int i8) {
        F0(i8);
    }

    public abstract void u0(int i8, int i9);

    public abstract void v0(int i8);

    public abstract void w0(int i8, long j8);

    public abstract void x0(long j8);

    public final void y0(int i8, float f8) {
        u0(i8, Float.floatToRawIntBits(f8));
    }

    public final void z0(float f8) {
        v0(Float.floatToRawIntBits(f8));
    }

    public AbstractC2100k() {
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends AbstractC2100k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f19350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19353h;

        public c(byte[] bArr, int i8, int i9) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i10 = i8 + i9;
            if ((i8 | i9 | (bArr.length - i10)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            this.f19350e = bArr;
            this.f19351f = i8;
            this.f19353h = i8;
            this.f19352g = i10;
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void E0(int i8, int i9) throws d {
            W0(i8, 0);
            F0(i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void F0(int i8) throws d {
            if (i8 >= 0) {
                Y0(i8);
            } else {
                a1(i8);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void I0(int i8, T t8, n0 n0Var) throws d {
            W0(i8, 2);
            Y0(((AbstractC2086a) t8).getSerializedSize(n0Var));
            n0Var.b(t8, this.f19344a);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void J0(T t8) throws d {
            Y0(t8.getSerializedSize());
            t8.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void K0(int i8, T t8) throws d {
            W0(1, 3);
            X0(2, i8);
            d1(3, t8);
            W0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void L0(int i8, AbstractC2097h abstractC2097h) throws d {
            W0(1, 3);
            X0(2, i8);
            o0(3, abstractC2097h);
            W0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void U0(int i8, String str) throws d {
            W0(i8, 2);
            V0(str);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void V0(String str) throws d {
            int i8 = this.f19353h;
            try {
                int iX = AbstractC2100k.X(str.length() * 3);
                int iX2 = AbstractC2100k.X(str.length());
                if (iX2 != iX) {
                    Y0(A0.j(str));
                    this.f19353h = A0.i(str, this.f19350e, this.f19353h, i0());
                    return;
                }
                int i9 = i8 + iX2;
                this.f19353h = i9;
                int i10 = A0.i(str, this.f19350e, i9, i0());
                this.f19353h = i8;
                Y0((i10 - i8) - iX2);
                this.f19353h = i10;
            } catch (A0.d e8) {
                this.f19353h = i8;
                d0(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new d(e9);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void W0(int i8, int i9) throws d {
            Y0(C0.c(i8, i9));
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void X0(int i8, int i9) throws d {
            W0(i8, 0);
            Y0(i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void Y0(int i8) throws d {
            while ((i8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f19350e;
                    int i9 = this.f19353h;
                    this.f19353h = i9 + 1;
                    bArr[i9] = (byte) ((i8 & 127) | 128);
                    i8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), 1), e8);
                }
            }
            byte[] bArr2 = this.f19350e;
            int i10 = this.f19353h;
            this.f19353h = i10 + 1;
            bArr2[i10] = (byte) i8;
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void Z0(int i8, long j8) throws d {
            W0(i8, 0);
            a1(j8);
        }

        @Override // com.google.protobuf.AbstractC2096g
        public final void a(ByteBuffer byteBuffer) throws d {
            b1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void a1(long j8) throws d {
            if (AbstractC2100k.f19343d && i0() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.f19350e;
                    int i8 = this.f19353h;
                    this.f19353h = i8 + 1;
                    z0.O(bArr, i8, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.f19350e;
                int i9 = this.f19353h;
                this.f19353h = i9 + 1;
                z0.O(bArr2, i9, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f19350e;
                    int i10 = this.f19353h;
                    this.f19353h = i10 + 1;
                    bArr3[i10] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), 1), e8);
                }
            }
            byte[] bArr4 = this.f19350e;
            int i11 = this.f19353h;
            this.f19353h = i11 + 1;
            bArr4[i11] = (byte) j8;
        }

        @Override // com.google.protobuf.AbstractC2100k, com.google.protobuf.AbstractC2096g
        public final void b(byte[] bArr, int i8, int i9) throws d {
            c1(bArr, i8, i9);
        }

        public final void b1(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f19350e, this.f19353h, iRemaining);
                this.f19353h += iRemaining;
            } catch (IndexOutOfBoundsException e8) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), Integer.valueOf(iRemaining)), e8);
            }
        }

        public final void c1(byte[] bArr, int i8, int i9) throws d {
            try {
                System.arraycopy(bArr, i8, this.f19350e, this.f19353h, i9);
                this.f19353h += i9;
            } catch (IndexOutOfBoundsException e8) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), Integer.valueOf(i9)), e8);
            }
        }

        public final void d1(int i8, T t8) throws d {
            W0(i8, 2);
            J0(t8);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final int i0() {
            return this.f19352g - this.f19353h;
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void j0(byte b8) throws d {
            try {
                byte[] bArr = this.f19350e;
                int i8 = this.f19353h;
                this.f19353h = i8 + 1;
                bArr[i8] = b8;
            } catch (IndexOutOfBoundsException e8) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), 1), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void k0(int i8, boolean z8) throws d {
            W0(i8, 0);
            j0(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void n0(byte[] bArr, int i8, int i9) throws d {
            Y0(i9);
            c1(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void o0(int i8, AbstractC2097h abstractC2097h) throws d {
            W0(i8, 2);
            p0(abstractC2097h);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void p0(AbstractC2097h abstractC2097h) throws d {
            Y0(abstractC2097h.size());
            abstractC2097h.Y(this);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void u0(int i8, int i9) throws d {
            W0(i8, 5);
            v0(i9);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void v0(int i8) throws d {
            try {
                byte[] bArr = this.f19350e;
                int i9 = this.f19353h;
                int i10 = i9 + 1;
                this.f19353h = i10;
                bArr[i9] = (byte) (i8 & 255);
                int i11 = i9 + 2;
                this.f19353h = i11;
                bArr[i10] = (byte) ((i8 >> 8) & 255);
                int i12 = i9 + 3;
                this.f19353h = i12;
                bArr[i11] = (byte) ((i8 >> 16) & 255);
                this.f19353h = i9 + 4;
                bArr[i12] = (byte) ((i8 >> 24) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), 1), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void w0(int i8, long j8) throws d {
            W0(i8, 1);
            x0(j8);
        }

        @Override // com.google.protobuf.AbstractC2100k
        public final void x0(long j8) throws d {
            try {
                byte[] bArr = this.f19350e;
                int i8 = this.f19353h;
                int i9 = i8 + 1;
                this.f19353h = i9;
                bArr[i8] = (byte) (((int) j8) & 255);
                int i10 = i8 + 2;
                this.f19353h = i10;
                bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
                int i11 = i8 + 3;
                this.f19353h = i11;
                bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
                int i12 = i8 + 4;
                this.f19353h = i12;
                bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
                int i13 = i8 + 5;
                this.f19353h = i13;
                bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
                int i14 = i8 + 6;
                this.f19353h = i14;
                bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
                int i15 = i8 + 7;
                this.f19353h = i15;
                bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
                this.f19353h = i8 + 8;
                bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19353h), Integer.valueOf(this.f19352g), 1), e8);
            }
        }

        @Override // com.google.protobuf.AbstractC2100k
        public void c0() {
        }
    }
}
