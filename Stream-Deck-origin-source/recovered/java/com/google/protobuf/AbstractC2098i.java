package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2098i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile int f19297f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2099j f19301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19302e;

    /* JADX INFO: renamed from: com.google.protobuf.i$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends AbstractC2098i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f19303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f19304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19306j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19307k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19308l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19309m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f19310n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f19311o;

        @Override // com.google.protobuf.AbstractC2098i
        public void A(T.a aVar, C2106q c2106q) throws B {
            int iB = B();
            b();
            int iP = p(iB);
            this.f19298a++;
            aVar.mergeFrom(this, c2106q);
            a(0);
            this.f19298a--;
            if (e() != 0) {
                throw B.n();
            }
            o(iP);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int B() {
            int i8;
            int i9 = this.f19307k;
            int i10 = this.f19305i;
            if (i10 != i9) {
                byte[] bArr = this.f19303g;
                int i11 = i9 + 1;
                byte b8 = bArr[i9];
                if (b8 >= 0) {
                    this.f19307k = i11;
                    return b8;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i9 + 2;
                    int i13 = (bArr[i11] << 7) ^ b8;
                    if (i13 < 0) {
                        i8 = i13 ^ (-128);
                    } else {
                        int i14 = i9 + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            i8 = i15 ^ 16256;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                i8 = (-2080896) ^ i17;
                            } else {
                                i14 = i9 + 5;
                                byte b9 = bArr[i16];
                                int i18 = (i17 ^ (b9 << 28)) ^ 266354560;
                                if (b9 < 0) {
                                    i16 = i9 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i9 + 7;
                                        if (bArr[i16] < 0) {
                                            i16 = i9 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i9 + 9;
                                                if (bArr[i16] < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i12 = i19;
                                                        i8 = i18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i18;
                                }
                                i8 = i18;
                            }
                            i12 = i16;
                        }
                        i12 = i14;
                    }
                    this.f19307k = i12;
                    return i8;
                }
            }
            return (int) S();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int D() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long E() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int F() {
            return AbstractC2098i.c(B());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long G() {
            return AbstractC2098i.d(R());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public String H() throws B {
            int iB = B();
            if (iB > 0) {
                int i8 = this.f19305i;
                int i9 = this.f19307k;
                if (iB <= i8 - i9) {
                    String str = new String(this.f19303g, i9, iB, A.f19048b);
                    this.f19307k += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw B.g();
            }
            throw B.n();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public String I() throws B {
            int iB = B();
            if (iB > 0) {
                int i8 = this.f19305i;
                int i9 = this.f19307k;
                if (iB <= i8 - i9) {
                    String strH = A0.h(this.f19303g, i9, iB);
                    this.f19307k += iB;
                    return strH;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw B.g();
            }
            throw B.n();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int J() throws B {
            if (g()) {
                this.f19309m = 0;
                return 0;
            }
            int iB = B();
            this.f19309m = iB;
            if (C0.a(iB) != 0) {
                return this.f19309m;
            }
            throw B.c();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long L() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean M(int i8) throws B {
            int iB = C0.b(i8);
            if (iB == 0) {
                W();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(B());
                return true;
            }
            if (iB == 3) {
                U();
                a(C0.c(C0.a(i8), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            V(4);
            return true;
        }

        public byte N() throws B {
            int i8 = this.f19307k;
            if (i8 == this.f19305i) {
                throw B.n();
            }
            byte[] bArr = this.f19303g;
            this.f19307k = i8 + 1;
            return bArr[i8];
        }

        public byte[] O(int i8) throws B {
            if (i8 > 0) {
                int i9 = this.f19305i;
                int i10 = this.f19307k;
                if (i8 <= i9 - i10) {
                    int i11 = i8 + i10;
                    this.f19307k = i11;
                    return Arrays.copyOfRange(this.f19303g, i10, i11);
                }
            }
            if (i8 > 0) {
                throw B.n();
            }
            if (i8 == 0) {
                return A.f19050d;
            }
            throw B.g();
        }

        public int P() throws B {
            int i8 = this.f19307k;
            if (this.f19305i - i8 < 4) {
                throw B.n();
            }
            byte[] bArr = this.f19303g;
            this.f19307k = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        public long Q() throws B {
            int i8 = this.f19307k;
            if (this.f19305i - i8 < 8) {
                throw B.n();
            }
            byte[] bArr = this.f19303g;
            this.f19307k = i8 + 8;
            return ((((long) bArr[i8 + 7]) & 255) << 56) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48);
        }

        public long R() {
            long j8;
            long j9;
            long j10;
            int i8 = this.f19307k;
            int i9 = this.f19305i;
            if (i9 != i8) {
                byte[] bArr = this.f19303g;
                int i10 = i8 + 1;
                byte b8 = bArr[i8];
                if (b8 >= 0) {
                    this.f19307k = i10;
                    return b8;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b8;
                    if (i12 < 0) {
                        j8 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            j8 = i14 ^ 16256;
                            i11 = i13;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                long j11 = (-2080896) ^ i16;
                                i11 = i15;
                                j8 = j11;
                            } else {
                                long j12 = i16;
                                i11 = i8 + 5;
                                long j13 = j12 ^ (((long) bArr[i15]) << 28);
                                if (j13 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    int i17 = i8 + 6;
                                    long j14 = j13 ^ (((long) bArr[i11]) << 35);
                                    if (j14 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        i11 = i8 + 7;
                                        j13 = j14 ^ (((long) bArr[i17]) << 42);
                                        if (j13 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            i17 = i8 + 8;
                                            j14 = j13 ^ (((long) bArr[i11]) << 49);
                                            if (j14 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                i11 = i8 + 9;
                                                long j15 = (j14 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i18;
                                                    }
                                                }
                                                j8 = j15;
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j9;
                                    i11 = i17;
                                }
                                j8 = j13 ^ j10;
                            }
                        }
                    }
                    this.f19307k = i11;
                    return j8;
                }
            }
            return S();
        }

        public long S() throws B {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte bN = N();
                j8 |= ((long) (bN & 127)) << i8;
                if ((bN & 128) == 0) {
                    return j8;
                }
            }
            throw B.f();
        }

        public final void T() {
            int i8 = this.f19305i + this.f19306j;
            this.f19305i = i8;
            int i9 = i8 - this.f19308l;
            int i10 = this.f19311o;
            if (i9 <= i10) {
                this.f19306j = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f19306j = i11;
            this.f19305i = i8 - i11;
        }

        public void U() throws B {
            int iJ;
            do {
                iJ = J();
                if (iJ == 0) {
                    return;
                }
            } while (M(iJ));
        }

        public void V(int i8) throws B {
            if (i8 >= 0) {
                int i9 = this.f19305i;
                int i10 = this.f19307k;
                if (i8 <= i9 - i10) {
                    this.f19307k = i10 + i8;
                    return;
                }
            }
            if (i8 >= 0) {
                throw B.n();
            }
            throw B.g();
        }

        public final void W() throws B {
            if (this.f19305i - this.f19307k >= 10) {
                X();
            } else {
                Y();
            }
        }

        public final void X() throws B {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.f19303g;
                int i9 = this.f19307k;
                this.f19307k = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        public final void Y() throws B {
            for (int i8 = 0; i8 < 10; i8++) {
                if (N() >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void a(int i8) throws B {
            if (this.f19309m != i8) {
                throw B.b();
            }
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int e() {
            int i8 = this.f19311o;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - f();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int f() {
            return this.f19307k - this.f19308l;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean g() {
            return this.f19307k == this.f19305i;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void o(int i8) {
            this.f19311o = i8;
            T();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int p(int i8) throws B {
            if (i8 < 0) {
                throw B.g();
            }
            int iF = i8 + f();
            if (iF < 0) {
                throw B.h();
            }
            int i9 = this.f19311o;
            if (iF > i9) {
                throw B.n();
            }
            this.f19311o = iF;
            T();
            return i9;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean q() {
            return R() != 0;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public AbstractC2097h r() {
            int iB = B();
            if (iB > 0) {
                int i8 = this.f19305i;
                int i9 = this.f19307k;
                if (iB <= i8 - i9) {
                    AbstractC2097h abstractC2097hX = (this.f19304h && this.f19310n) ? AbstractC2097h.X(this.f19303g, i9, iB) : AbstractC2097h.D(this.f19303g, i9, iB);
                    this.f19307k += iB;
                    return abstractC2097hX;
                }
            }
            return iB == 0 ? AbstractC2097h.f19285b : AbstractC2097h.W(O(iB));
        }

        @Override // com.google.protobuf.AbstractC2098i
        public double s() {
            return Double.longBitsToDouble(Q());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int u() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long v() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public float w() {
            return Float.intBitsToFloat(P());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void x(int i8, T.a aVar, C2106q c2106q) throws B {
            b();
            this.f19298a++;
            aVar.mergeFrom(this, c2106q);
            a(C0.c(i8, 4));
            this.f19298a--;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long z() {
            return R();
        }

        public b(byte[] bArr, int i8, int i9, boolean z8) {
            super();
            this.f19311o = Integer.MAX_VALUE;
            this.f19303g = bArr;
            this.f19305i = i9 + i8;
            this.f19307k = i8;
            this.f19308l = i8;
            this.f19304h = z8;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends AbstractC2098i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InputStream f19312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f19313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19316k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19317l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19318m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19319n;

        public static int N(InputStream inputStream) throws B {
            try {
                return inputStream.available();
            } catch (B e8) {
                e8.j();
                throw e8;
            }
        }

        public static int O(InputStream inputStream, byte[] bArr, int i8, int i9) throws B {
            try {
                return inputStream.read(bArr, i8, i9);
            } catch (B e8) {
                e8.j();
                throw e8;
            }
        }

        private void Y() {
            int i8 = this.f19314i + this.f19315j;
            this.f19314i = i8;
            int i9 = this.f19318m + i8;
            int i10 = this.f19319n;
            if (i9 <= i10) {
                this.f19315j = 0;
                return;
            }
            int i11 = i9 - i10;
            this.f19315j = i11;
            this.f19314i = i8 - i11;
        }

        public static long a0(InputStream inputStream, long j8) throws B {
            try {
                return inputStream.skip(j8);
            } catch (B e8) {
                e8.j();
                throw e8;
            }
        }

        private void e0() throws B {
            if (this.f19314i - this.f19316k >= 10) {
                f0();
            } else {
                g0();
            }
        }

        private void f0() throws B {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.f19313h;
                int i9 = this.f19316k;
                this.f19316k = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private void g0() throws B {
            for (int i8 = 0; i8 < 10; i8++) {
                if (Q() >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void A(T.a aVar, C2106q c2106q) throws B {
            int iB = B();
            b();
            int iP = p(iB);
            this.f19298a++;
            aVar.mergeFrom(this, c2106q);
            a(0);
            this.f19298a--;
            if (e() != 0) {
                throw B.n();
            }
            o(iP);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int B() {
            int i8;
            int i9 = this.f19316k;
            int i10 = this.f19314i;
            if (i10 != i9) {
                byte[] bArr = this.f19313h;
                int i11 = i9 + 1;
                byte b8 = bArr[i9];
                if (b8 >= 0) {
                    this.f19316k = i11;
                    return b8;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i9 + 2;
                    int i13 = (bArr[i11] << 7) ^ b8;
                    if (i13 < 0) {
                        i8 = i13 ^ (-128);
                    } else {
                        int i14 = i9 + 3;
                        int i15 = (bArr[i12] << 14) ^ i13;
                        if (i15 >= 0) {
                            i8 = i15 ^ 16256;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                i8 = (-2080896) ^ i17;
                            } else {
                                i14 = i9 + 5;
                                byte b9 = bArr[i16];
                                int i18 = (i17 ^ (b9 << 28)) ^ 266354560;
                                if (b9 < 0) {
                                    i16 = i9 + 6;
                                    if (bArr[i14] < 0) {
                                        i14 = i9 + 7;
                                        if (bArr[i16] < 0) {
                                            i16 = i9 + 8;
                                            if (bArr[i14] < 0) {
                                                i14 = i9 + 9;
                                                if (bArr[i16] < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i12 = i19;
                                                        i8 = i18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i18;
                                }
                                i8 = i18;
                            }
                            i12 = i16;
                        }
                        i12 = i14;
                    }
                    this.f19316k = i12;
                    return i8;
                }
            }
            return (int) X();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int D() {
            return U();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long E() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int F() {
            return AbstractC2098i.c(B());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long G() {
            return AbstractC2098i.d(W());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public String H() throws B {
            int iB = B();
            if (iB > 0) {
                int i8 = this.f19314i;
                int i9 = this.f19316k;
                if (iB <= i8 - i9) {
                    String str = new String(this.f19313h, i9, iB, A.f19048b);
                    this.f19316k += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB > this.f19314i) {
                return new String(R(iB, false), A.f19048b);
            }
            Z(iB);
            String str2 = new String(this.f19313h, this.f19316k, iB, A.f19048b);
            this.f19316k += iB;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public String I() throws IOException {
            byte[] bArrR;
            int iB = B();
            int i8 = this.f19316k;
            int i9 = this.f19314i;
            if (iB <= i9 - i8 && iB > 0) {
                bArrR = this.f19313h;
                this.f19316k = i8 + iB;
            } else {
                if (iB == 0) {
                    return "";
                }
                i8 = 0;
                if (iB <= i9) {
                    Z(iB);
                    bArrR = this.f19313h;
                    this.f19316k = iB;
                } else {
                    bArrR = R(iB, false);
                }
            }
            return A0.h(bArrR, i8, iB);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int J() throws B {
            if (g()) {
                this.f19317l = 0;
                return 0;
            }
            int iB = B();
            this.f19317l = iB;
            if (C0.a(iB) != 0) {
                return this.f19317l;
            }
            throw B.c();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long L() {
            return W();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean M(int i8) throws B {
            int iB = C0.b(i8);
            if (iB == 0) {
                e0();
                return true;
            }
            if (iB == 1) {
                c0(8);
                return true;
            }
            if (iB == 2) {
                c0(B());
                return true;
            }
            if (iB == 3) {
                b0();
                a(C0.c(C0.a(i8), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            c0(4);
            return true;
        }

        public final AbstractC2097h P(int i8) throws IOException {
            byte[] bArrS = S(i8);
            if (bArrS != null) {
                return AbstractC2097h.A(bArrS);
            }
            int i9 = this.f19316k;
            int i10 = this.f19314i;
            int length = i10 - i9;
            this.f19318m += i10;
            this.f19316k = 0;
            this.f19314i = 0;
            List<byte[]> listT = T(i8 - length);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f19313h, i9, bArr, 0, length);
            for (byte[] bArr2 : listT) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2097h.W(bArr);
        }

        public byte Q() throws B {
            if (this.f19316k == this.f19314i) {
                Z(1);
            }
            byte[] bArr = this.f19313h;
            int i8 = this.f19316k;
            this.f19316k = i8 + 1;
            return bArr[i8];
        }

        public final byte[] R(int i8, boolean z8) throws IOException {
            byte[] bArrS = S(i8);
            if (bArrS != null) {
                return z8 ? (byte[]) bArrS.clone() : bArrS;
            }
            int i9 = this.f19316k;
            int i10 = this.f19314i;
            int length = i10 - i9;
            this.f19318m += i10;
            this.f19316k = 0;
            this.f19314i = 0;
            List<byte[]> listT = T(i8 - length);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f19313h, i9, bArr, 0, length);
            for (byte[] bArr2 : listT) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] S(int i8) throws B {
            if (i8 == 0) {
                return A.f19050d;
            }
            if (i8 < 0) {
                throw B.g();
            }
            int i9 = this.f19318m;
            int i10 = this.f19316k;
            int i11 = i9 + i10 + i8;
            if (i11 - this.f19300c > 0) {
                throw B.l();
            }
            int i12 = this.f19319n;
            if (i11 > i12) {
                c0((i12 - i9) - i10);
                throw B.n();
            }
            int i13 = this.f19314i - i10;
            int i14 = i8 - i13;
            if (i14 >= 4096 && i14 > N(this.f19312g)) {
                return null;
            }
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f19313h, this.f19316k, bArr, 0, i13);
            this.f19318m += this.f19314i;
            this.f19316k = 0;
            this.f19314i = 0;
            while (i13 < i8) {
                int iO = O(this.f19312g, bArr, i13, i8 - i13);
                if (iO == -1) {
                    throw B.n();
                }
                this.f19318m += iO;
                i13 += iO;
            }
            return bArr;
        }

        public final List T(int i8) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i8 > 0) {
                int iMin = Math.min(i8, 4096);
                byte[] bArr = new byte[iMin];
                int i9 = 0;
                while (i9 < iMin) {
                    int i10 = this.f19312g.read(bArr, i9, iMin - i9);
                    if (i10 == -1) {
                        throw B.n();
                    }
                    this.f19318m += i10;
                    i9 += i10;
                }
                i8 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int U() throws B {
            int i8 = this.f19316k;
            if (this.f19314i - i8 < 4) {
                Z(4);
                i8 = this.f19316k;
            }
            byte[] bArr = this.f19313h;
            this.f19316k = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        public long V() throws B {
            int i8 = this.f19316k;
            if (this.f19314i - i8 < 8) {
                Z(8);
                i8 = this.f19316k;
            }
            byte[] bArr = this.f19313h;
            this.f19316k = i8 + 8;
            return ((((long) bArr[i8 + 7]) & 255) << 56) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48);
        }

        public long W() {
            long j8;
            long j9;
            long j10;
            int i8 = this.f19316k;
            int i9 = this.f19314i;
            if (i9 != i8) {
                byte[] bArr = this.f19313h;
                int i10 = i8 + 1;
                byte b8 = bArr[i8];
                if (b8 >= 0) {
                    this.f19316k = i10;
                    return b8;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b8;
                    if (i12 < 0) {
                        j8 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            j8 = i14 ^ 16256;
                            i11 = i13;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                long j11 = (-2080896) ^ i16;
                                i11 = i15;
                                j8 = j11;
                            } else {
                                long j12 = i16;
                                i11 = i8 + 5;
                                long j13 = j12 ^ (((long) bArr[i15]) << 28);
                                if (j13 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    int i17 = i8 + 6;
                                    long j14 = j13 ^ (((long) bArr[i11]) << 35);
                                    if (j14 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        i11 = i8 + 7;
                                        j13 = j14 ^ (((long) bArr[i17]) << 42);
                                        if (j13 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            i17 = i8 + 8;
                                            j14 = j13 ^ (((long) bArr[i11]) << 49);
                                            if (j14 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                i11 = i8 + 9;
                                                long j15 = (j14 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i11] >= 0) {
                                                        i11 = i18;
                                                    }
                                                }
                                                j8 = j15;
                                            }
                                        }
                                    }
                                    j8 = j14 ^ j9;
                                    i11 = i17;
                                }
                                j8 = j13 ^ j10;
                            }
                        }
                    }
                    this.f19316k = i11;
                    return j8;
                }
            }
            return X();
        }

        public long X() throws B {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte bQ = Q();
                j8 |= ((long) (bQ & 127)) << i8;
                if ((bQ & 128) == 0) {
                    return j8;
                }
            }
            throw B.f();
        }

        public final void Z(int i8) throws B {
            if (h0(i8)) {
                return;
            }
            if (i8 <= (this.f19300c - this.f19318m) - this.f19316k) {
                throw B.n();
            }
            throw B.l();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void a(int i8) throws B {
            if (this.f19317l != i8) {
                throw B.b();
            }
        }

        public void b0() throws B {
            int iJ;
            do {
                iJ = J();
                if (iJ == 0) {
                    return;
                }
            } while (M(iJ));
        }

        public void c0(int i8) throws B {
            int i9 = this.f19314i;
            int i10 = this.f19316k;
            if (i8 > i9 - i10 || i8 < 0) {
                d0(i8);
            } else {
                this.f19316k = i10 + i8;
            }
        }

        public final void d0(int i8) throws B {
            if (i8 < 0) {
                throw B.g();
            }
            int i9 = this.f19318m;
            int i10 = this.f19316k;
            int i11 = i9 + i10 + i8;
            int i12 = this.f19319n;
            if (i11 > i12) {
                c0((i12 - i9) - i10);
                throw B.n();
            }
            this.f19318m = i9 + i10;
            int i13 = this.f19314i - i10;
            this.f19314i = 0;
            this.f19316k = 0;
            while (i13 < i8) {
                try {
                    long j8 = i8 - i13;
                    long jA0 = a0(this.f19312g, j8);
                    if (jA0 < 0 || jA0 > j8) {
                        throw new IllegalStateException(this.f19312g.getClass() + "#skip returned invalid result: " + jA0 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jA0 == 0) {
                        break;
                    } else {
                        i13 += (int) jA0;
                    }
                } catch (Throwable th) {
                    this.f19318m += i13;
                    Y();
                    throw th;
                }
            }
            this.f19318m += i13;
            Y();
            if (i13 >= i8) {
                return;
            }
            int i14 = this.f19314i;
            int i15 = i14 - this.f19316k;
            this.f19316k = i14;
            Z(1);
            while (true) {
                int i16 = i8 - i15;
                int i17 = this.f19314i;
                if (i16 <= i17) {
                    this.f19316k = i16;
                    return;
                } else {
                    i15 += i17;
                    this.f19316k = i17;
                    Z(1);
                }
            }
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int e() {
            int i8 = this.f19319n;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - (this.f19318m + this.f19316k);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int f() {
            return this.f19318m + this.f19316k;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean g() {
            return this.f19316k == this.f19314i && !h0(1);
        }

        public final boolean h0(int i8) throws B {
            int i9 = this.f19316k;
            int i10 = i9 + i8;
            int i11 = this.f19314i;
            if (i10 <= i11) {
                throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
            }
            int i12 = this.f19300c;
            int i13 = this.f19318m;
            if (i8 > (i12 - i13) - i9 || i13 + i9 + i8 > this.f19319n) {
                return false;
            }
            if (i9 > 0) {
                if (i11 > i9) {
                    byte[] bArr = this.f19313h;
                    System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                }
                this.f19318m += i9;
                this.f19314i -= i9;
                this.f19316k = 0;
            }
            InputStream inputStream = this.f19312g;
            byte[] bArr2 = this.f19313h;
            int i14 = this.f19314i;
            int iO = O(inputStream, bArr2, i14, Math.min(bArr2.length - i14, (this.f19300c - this.f19318m) - i14));
            if (iO == 0 || iO < -1 || iO > this.f19313h.length) {
                throw new IllegalStateException(this.f19312g.getClass() + "#read(byte[]) returned invalid result: " + iO + "\nThe InputStream implementation is buggy.");
            }
            if (iO <= 0) {
                return false;
            }
            this.f19314i += iO;
            Y();
            if (this.f19314i >= i8) {
                return true;
            }
            return h0(i8);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void o(int i8) {
            this.f19319n = i8;
            Y();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int p(int i8) throws B {
            if (i8 < 0) {
                throw B.g();
            }
            int i9 = i8 + this.f19318m + this.f19316k;
            int i10 = this.f19319n;
            if (i9 > i10) {
                throw B.n();
            }
            this.f19319n = i9;
            Y();
            return i10;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean q() {
            return W() != 0;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public AbstractC2097h r() {
            int iB = B();
            int i8 = this.f19314i;
            int i9 = this.f19316k;
            if (iB > i8 - i9 || iB <= 0) {
                return iB == 0 ? AbstractC2097h.f19285b : P(iB);
            }
            AbstractC2097h abstractC2097hD = AbstractC2097h.D(this.f19313h, i9, iB);
            this.f19316k += iB;
            return abstractC2097hD;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public double s() {
            return Double.longBitsToDouble(V());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int u() {
            return U();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long v() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public float w() {
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void x(int i8, T.a aVar, C2106q c2106q) throws B {
            b();
            this.f19298a++;
            aVar.mergeFrom(this, c2106q);
            a(C0.c(i8, 4));
            this.f19298a--;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long z() {
            return W();
        }

        public c(InputStream inputStream, int i8) {
            super();
            this.f19319n = Integer.MAX_VALUE;
            A.b(inputStream, "input");
            this.f19312g = inputStream;
            this.f19313h = new byte[i8];
            this.f19314i = 0;
            this.f19316k = 0;
            this.f19318m = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends AbstractC2098i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ByteBuffer f19320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f19321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f19322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f19323j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f19324k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f19325l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f19326m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19327n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f19328o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19329p;

        public static boolean O() {
            return z0.J();
        }

        private void U() {
            long j8 = this.f19323j + ((long) this.f19326m);
            this.f19323j = j8;
            int i8 = (int) (j8 - this.f19325l);
            int i9 = this.f19329p;
            if (i8 <= i9) {
                this.f19326m = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f19326m = i10;
            this.f19323j = j8 - ((long) i10);
        }

        private void Y() throws B {
            if (V() >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws B {
            for (int i8 = 0; i8 < 10; i8++) {
                long j8 = this.f19324k;
                this.f19324k = 1 + j8;
                if (z0.w(j8) >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        private void a0() throws B {
            for (int i8 = 0; i8 < 10; i8++) {
                if (P() >= 0) {
                    return;
                }
            }
            throw B.f();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void A(T.a aVar, C2106q c2106q) throws B {
            int iB = B();
            b();
            int iP = p(iB);
            this.f19298a++;
            aVar.mergeFrom(this, c2106q);
            a(0);
            this.f19298a--;
            if (e() != 0) {
                throw B.n();
            }
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.z0.w(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.AbstractC2098i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int B() {
            int i8;
            long j8 = this.f19324k;
            if (this.f19323j != j8) {
                long j9 = 1 + j8;
                byte bW = z0.w(j8);
                if (bW >= 0) {
                    this.f19324k = j9;
                    return bW;
                }
                if (this.f19323j - j9 >= 9) {
                    long j10 = 2 + j8;
                    int iW = (z0.w(j9) << 7) ^ bW;
                    if (iW < 0) {
                        i8 = iW ^ (-128);
                    } else {
                        long j11 = 3 + j8;
                        int iW2 = iW ^ (z0.w(j10) << 14);
                        if (iW2 >= 0) {
                            i8 = iW2 ^ 16256;
                        } else {
                            j10 = 4 + j8;
                            int iW3 = iW2 ^ (z0.w(j11) << 21);
                            if (iW3 < 0) {
                                i8 = (-2080896) ^ iW3;
                            } else {
                                j11 = 5 + j8;
                                byte bW2 = z0.w(j10);
                                int i9 = (iW3 ^ (bW2 << 28)) ^ 266354560;
                                if (bW2 < 0) {
                                    j10 = 6 + j8;
                                    if (z0.w(j11) < 0) {
                                        j11 = 7 + j8;
                                        if (z0.w(j10) < 0) {
                                            j10 = 8 + j8;
                                            if (z0.w(j11) < 0) {
                                                j11 = j8 + 9;
                                                if (z0.w(j10) < 0) {
                                                    j10 = 10 + j8;
                                                }
                                            }
                                        }
                                    }
                                    i8 = i9;
                                }
                                i8 = i9;
                            }
                        }
                        j10 = j11;
                    }
                    this.f19324k = j10;
                    return i8;
                }
            }
            return (int) T();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int D() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long E() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int F() {
            return AbstractC2098i.c(B());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long G() {
            return AbstractC2098i.d(S());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public String H() throws B {
            int iB = B();
            if (iB <= 0 || iB > V()) {
                if (iB == 0) {
                    return "";
                }
                if (iB < 0) {
                    throw B.g();
                }
                throw B.n();
            }
            byte[] bArr = new byte[iB];
            long j8 = iB;
            z0.p(this.f19324k, bArr, 0L, j8);
            String str = new String(bArr, A.f19048b);
            this.f19324k += j8;
            return str;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public String I() throws B {
            int iB = B();
            if (iB > 0 && iB <= V()) {
                String strG = A0.g(this.f19320g, N(this.f19324k), iB);
                this.f19324k += (long) iB;
                return strG;
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw B.g();
            }
            throw B.n();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int J() throws B {
            if (g()) {
                this.f19327n = 0;
                return 0;
            }
            int iB = B();
            this.f19327n = iB;
            if (C0.a(iB) != 0) {
                return this.f19327n;
            }
            throw B.c();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long L() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean M(int i8) throws B {
            int iB = C0.b(i8);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(B());
                return true;
            }
            if (iB == 3) {
                W();
                a(C0.c(C0.a(i8), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            X(4);
            return true;
        }

        public final int N(long j8) {
            return (int) (j8 - this.f19322i);
        }

        public byte P() throws B {
            long j8 = this.f19324k;
            if (j8 == this.f19323j) {
                throw B.n();
            }
            this.f19324k = 1 + j8;
            return z0.w(j8);
        }

        public int Q() throws B {
            long j8 = this.f19324k;
            if (this.f19323j - j8 < 4) {
                throw B.n();
            }
            this.f19324k = 4 + j8;
            return ((z0.w(j8 + 3) & 255) << 24) | (z0.w(j8) & 255) | ((z0.w(1 + j8) & 255) << 8) | ((z0.w(2 + j8) & 255) << 16);
        }

        public long R() throws B {
            long j8 = this.f19324k;
            if (this.f19323j - j8 < 8) {
                throw B.n();
            }
            this.f19324k = 8 + j8;
            return ((((long) z0.w(j8 + 7)) & 255) << 56) | (((long) z0.w(j8)) & 255) | ((((long) z0.w(1 + j8)) & 255) << 8) | ((((long) z0.w(2 + j8)) & 255) << 16) | ((((long) z0.w(3 + j8)) & 255) << 24) | ((((long) z0.w(4 + j8)) & 255) << 32) | ((((long) z0.w(5 + j8)) & 255) << 40) | ((((long) z0.w(6 + j8)) & 255) << 48);
        }

        public long S() {
            long j8;
            long j9;
            long j10;
            int i8;
            long j11 = this.f19324k;
            if (this.f19323j != j11) {
                long j12 = 1 + j11;
                byte bW = z0.w(j11);
                if (bW >= 0) {
                    this.f19324k = j12;
                    return bW;
                }
                if (this.f19323j - j12 >= 9) {
                    long j13 = 2 + j11;
                    int iW = (z0.w(j12) << 7) ^ bW;
                    if (iW >= 0) {
                        long j14 = 3 + j11;
                        int iW2 = iW ^ (z0.w(j13) << 14);
                        if (iW2 >= 0) {
                            j8 = iW2 ^ 16256;
                            j13 = j14;
                        } else {
                            j13 = 4 + j11;
                            int iW3 = iW2 ^ (z0.w(j14) << 21);
                            if (iW3 < 0) {
                                i8 = (-2080896) ^ iW3;
                            } else {
                                long j15 = 5 + j11;
                                long jW = ((long) iW3) ^ (((long) z0.w(j13)) << 28);
                                if (jW >= 0) {
                                    j10 = 266354560;
                                } else {
                                    long j16 = 6 + j11;
                                    long jW2 = jW ^ (((long) z0.w(j15)) << 35);
                                    if (jW2 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        j15 = 7 + j11;
                                        jW = jW2 ^ (((long) z0.w(j16)) << 42);
                                        if (jW >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            j16 = 8 + j11;
                                            jW2 = jW ^ (((long) z0.w(j15)) << 49);
                                            if (jW2 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                long j17 = j11 + 9;
                                                long jW3 = (jW2 ^ (((long) z0.w(j16)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j18 = j11 + 10;
                                                    if (z0.w(j17) >= 0) {
                                                        j13 = j18;
                                                        j8 = jW3;
                                                    }
                                                } else {
                                                    j8 = jW3;
                                                    j13 = j17;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j9 ^ jW2;
                                    j13 = j16;
                                }
                                j8 = j10 ^ jW;
                                j13 = j15;
                            }
                        }
                        this.f19324k = j13;
                        return j8;
                    }
                    i8 = iW ^ (-128);
                    j8 = i8;
                    this.f19324k = j13;
                    return j8;
                }
            }
            return T();
        }

        public long T() throws B {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte bP = P();
                j8 |= ((long) (bP & 127)) << i8;
                if ((bP & 128) == 0) {
                    return j8;
                }
            }
            throw B.f();
        }

        public final int V() {
            return (int) (this.f19323j - this.f19324k);
        }

        public void W() throws B {
            int iJ;
            do {
                iJ = J();
                if (iJ == 0) {
                    return;
                }
            } while (M(iJ));
        }

        public void X(int i8) throws B {
            if (i8 >= 0 && i8 <= V()) {
                this.f19324k += (long) i8;
            } else {
                if (i8 >= 0) {
                    throw B.n();
                }
                throw B.g();
            }
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void a(int i8) throws B {
            if (this.f19327n != i8) {
                throw B.b();
            }
        }

        public final ByteBuffer b0(long j8, long j9) {
            int iPosition = this.f19320g.position();
            int iLimit = this.f19320g.limit();
            ByteBuffer byteBuffer = this.f19320g;
            try {
                try {
                    byteBuffer.position(N(j8));
                    byteBuffer.limit(N(j9));
                    ByteBuffer byteBufferSlice = this.f19320g.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e8) {
                    B bN = B.n();
                    bN.initCause(e8);
                    throw bN;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int e() {
            int i8 = this.f19329p;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - f();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int f() {
            return (int) (this.f19324k - this.f19325l);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean g() {
            return this.f19324k == this.f19323j;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void o(int i8) {
            this.f19329p = i8;
            U();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int p(int i8) throws B {
            if (i8 < 0) {
                throw B.g();
            }
            int iF = i8 + f();
            int i9 = this.f19329p;
            if (iF > i9) {
                throw B.n();
            }
            this.f19329p = iF;
            U();
            return i9;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public boolean q() {
            return S() != 0;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public AbstractC2097h r() throws B {
            int iB = B();
            if (iB <= 0 || iB > V()) {
                if (iB == 0) {
                    return AbstractC2097h.f19285b;
                }
                if (iB < 0) {
                    throw B.g();
                }
                throw B.n();
            }
            if (this.f19321h && this.f19328o) {
                long j8 = this.f19324k;
                long j9 = iB;
                ByteBuffer byteBufferB0 = b0(j8, j8 + j9);
                this.f19324k += j9;
                return AbstractC2097h.V(byteBufferB0);
            }
            byte[] bArr = new byte[iB];
            long j10 = iB;
            z0.p(this.f19324k, bArr, 0L, j10);
            this.f19324k += j10;
            return AbstractC2097h.W(bArr);
        }

        @Override // com.google.protobuf.AbstractC2098i
        public double s() {
            return Double.longBitsToDouble(R());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int u() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long v() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public float w() {
            return Float.intBitsToFloat(Q());
        }

        @Override // com.google.protobuf.AbstractC2098i
        public void x(int i8, T.a aVar, C2106q c2106q) throws B {
            b();
            this.f19298a++;
            aVar.mergeFrom(this, c2106q);
            a(C0.c(i8, 4));
            this.f19298a--;
        }

        @Override // com.google.protobuf.AbstractC2098i
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC2098i
        public long z() {
            return S();
        }

        public d(ByteBuffer byteBuffer, boolean z8) {
            super();
            this.f19329p = Integer.MAX_VALUE;
            this.f19320g = byteBuffer;
            long jK = z0.k(byteBuffer);
            this.f19322i = jK;
            this.f19323j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f19324k = jPosition;
            this.f19325l = jPosition;
            this.f19321h = z8;
        }
    }

    public static int C(int i8, InputStream inputStream) throws IOException {
        if ((i8 & 128) == 0) {
            return i8;
        }
        int i9 = i8 & 127;
        int i10 = 7;
        while (i10 < 32) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw B.n();
            }
            i9 |= (i11 & 127) << i10;
            if ((i11 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        while (i10 < 64) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw B.n();
            }
            if ((i12 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        throw B.f();
    }

    public static int c(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long d(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static AbstractC2098i h(InputStream inputStream) {
        return i(inputStream, 4096);
    }

    public static AbstractC2098i i(InputStream inputStream, int i8) {
        if (i8 > 0) {
            return inputStream == null ? l(A.f19050d) : new c(inputStream, i8);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2098i j(ByteBuffer byteBuffer) {
        return k(byteBuffer, false);
    }

    public static AbstractC2098i k(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return n(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z8);
        }
        if (byteBuffer.isDirect() && d.O()) {
            return new d(byteBuffer, z8);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return n(bArr, 0, iRemaining, true);
    }

    public static AbstractC2098i l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC2098i m(byte[] bArr, int i8, int i9) {
        return n(bArr, i8, i9, false);
    }

    public static AbstractC2098i n(byte[] bArr, int i8, int i9, boolean z8) {
        b bVar = new b(bArr, i8, i9, z8);
        try {
            bVar.p(i9);
            return bVar;
        } catch (B e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract void A(T.a aVar, C2106q c2106q);

    public abstract int B();

    public abstract int D();

    public abstract long E();

    public abstract int F();

    public abstract long G();

    public abstract String H();

    public abstract String I();

    public abstract int J();

    public abstract int K();

    public abstract long L();

    public abstract boolean M(int i8);

    public abstract void a(int i8);

    public void b() throws B {
        if (this.f19298a >= this.f19299b) {
            throw B.i();
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void o(int i8);

    public abstract int p(int i8);

    public abstract boolean q();

    public abstract AbstractC2097h r();

    public abstract double s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public abstract float w();

    public abstract void x(int i8, T.a aVar, C2106q c2106q);

    public abstract int y();

    public abstract long z();

    public AbstractC2098i() {
        this.f19299b = f19297f;
        this.f19300c = Integer.MAX_VALUE;
        this.f19302e = false;
    }
}
