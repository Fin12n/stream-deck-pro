package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f19055a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void h(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i8) throws B {
            if (m(b9) || (((b8 << 28) + (b9 + 112)) >> 30) != 0 || m(b10) || m(b11)) {
                throw B.d();
            }
            int iR = ((b8 & 7) << 18) | (r(b9) << 12) | (r(b10) << 6) | r(b11);
            cArr[i8] = l(iR);
            cArr[i8 + 1] = q(iR);
        }

        public static void i(byte b8, char[] cArr, int i8) {
            cArr[i8] = (char) b8;
        }

        public static void j(byte b8, byte b9, byte b10, char[] cArr, int i8) throws B {
            if (m(b9) || ((b8 == -32 && b9 < -96) || ((b8 == -19 && b9 >= -96) || m(b10)))) {
                throw B.d();
            }
            cArr[i8] = (char) (((b8 & 15) << 12) | (r(b9) << 6) | r(b10));
        }

        public static void k(byte b8, byte b9, char[] cArr, int i8) throws B {
            if (b8 < -62 || m(b9)) {
                throw B.d();
            }
            cArr[i8] = (char) (((b8 & 31) << 6) | r(b9));
        }

        public static char l(int i8) {
            return (char) ((i8 >>> 10) + 55232);
        }

        public static boolean m(byte b8) {
            return b8 > -65;
        }

        public static boolean n(byte b8) {
            return b8 >= 0;
        }

        public static boolean o(byte b8) {
            return b8 < -16;
        }

        public static boolean p(byte b8) {
            return b8 < -32;
        }

        public static char q(int i8) {
            return (char) ((i8 & 1023) + 56320);
        }

        public static int r(byte b8) {
            return b8 & 63;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static int j(ByteBuffer byteBuffer, int i8, int i9) {
            int iL = i8 + A0.l(byteBuffer, i8, i9);
            while (iL < i9) {
                int i10 = iL + 1;
                byte b8 = byteBuffer.get(iL);
                if (b8 >= 0) {
                    iL = i10;
                } else if (b8 < -32) {
                    if (i10 >= i9) {
                        return b8;
                    }
                    if (b8 < -62 || byteBuffer.get(i10) > -65) {
                        return -1;
                    }
                    iL += 2;
                } else {
                    if (b8 >= -16) {
                        if (i10 >= i9 - 2) {
                            return A0.p(byteBuffer, b8, i10, i9 - i10);
                        }
                        int i11 = iL + 2;
                        byte b9 = byteBuffer.get(i10);
                        if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                            int i12 = iL + 3;
                            if (byteBuffer.get(i11) <= -65) {
                                iL += 4;
                                if (byteBuffer.get(i12) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 1) {
                        return A0.p(byteBuffer, b8, i10, i9 - i10);
                    }
                    int i13 = iL + 2;
                    byte b10 = byteBuffer.get(i10);
                    if (b10 > -65 || ((b8 == -32 && b10 < -96) || ((b8 == -19 && b10 >= -96) || byteBuffer.get(i13) > -65))) {
                        return -1;
                    }
                    iL += 3;
                }
            }
            return 0;
        }

        public final String a(ByteBuffer byteBuffer, int i8, int i9) {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i8, i9) : c(byteBuffer, i8, i9);
        }

        public abstract String b(byte[] bArr, int i8, int i9);

        public final String c(ByteBuffer byteBuffer, int i8, int i9) throws B {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b8 = byteBuffer.get(i8);
                if (!a.n(b8)) {
                    break;
                }
                i8++;
                a.i(b8, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b9 = byteBuffer.get(i8);
                if (a.n(b9)) {
                    int i14 = i12 + 1;
                    a.i(b9, cArr, i12);
                    int i15 = i13;
                    while (i15 < i10) {
                        byte b10 = byteBuffer.get(i15);
                        if (!a.n(b10)) {
                            break;
                        }
                        i15++;
                        a.i(b10, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i15;
                } else if (a.p(b9)) {
                    if (i13 >= i10) {
                        throw B.d();
                    }
                    i8 += 2;
                    a.k(b9, byteBuffer.get(i13), cArr, i12);
                    i12++;
                } else if (a.o(b9)) {
                    if (i13 >= i10 - 1) {
                        throw B.d();
                    }
                    int i16 = i8 + 2;
                    i8 += 3;
                    a.j(b9, byteBuffer.get(i13), byteBuffer.get(i16), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw B.d();
                    }
                    byte b11 = byteBuffer.get(i13);
                    int i17 = i8 + 3;
                    byte b12 = byteBuffer.get(i8 + 2);
                    i8 += 4;
                    a.h(b9, b11, b12, byteBuffer.get(i17), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        public abstract String d(ByteBuffer byteBuffer, int i8, int i9);

        public abstract int e(CharSequence charSequence, byte[] bArr, int i8, int i9);

        public final boolean f(ByteBuffer byteBuffer, int i8, int i9) {
            return h(0, byteBuffer, i8, i9) == 0;
        }

        public final boolean g(byte[] bArr, int i8, int i9) {
            return i(0, bArr, i8, i9) == 0;
        }

        public final int h(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? l(i8, byteBuffer, i9, i10) : k(i8, byteBuffer, i9, i10);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return i(i8, byteBuffer.array(), i9 + iArrayOffset, iArrayOffset + i10);
        }

        public abstract int i(int i8, byte[] bArr, int i9, int i10);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int k(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            byte b8;
            int i11;
            int i12;
            if (i8 != 0) {
                if (i9 >= i10) {
                    return i8;
                }
                byte b9 = (byte) i8;
                if (b9 < -32) {
                    if (b9 >= -62) {
                        i12 = i9 + 1;
                    }
                    return -1;
                }
                if (b9 < -16) {
                    byte b10 = (byte) (~(i8 >> 8));
                    if (b10 == 0) {
                        int i13 = i9 + 1;
                        byte b11 = byteBuffer.get(i9);
                        if (i13 >= i10) {
                            return A0.n(b9, b11);
                        }
                        i9 = i13;
                        b10 = b11;
                    }
                    if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                        i12 = i9 + 1;
                    }
                    return -1;
                }
                byte b12 = (byte) (~(i8 >> 8));
                if (b12 == 0) {
                    i11 = i9 + 1;
                    b12 = byteBuffer.get(i9);
                    if (i11 >= i10) {
                        return A0.n(b9, b12);
                    }
                    b8 = 0;
                } else {
                    b8 = (byte) (i8 >> 16);
                    i11 = i9;
                }
                if (b8 == 0) {
                    int i14 = i11 + 1;
                    byte b13 = byteBuffer.get(i11);
                    if (i14 >= i10) {
                        return A0.o(b9, b12, b13);
                    }
                    b8 = b13;
                    i11 = i14;
                }
                if (b12 <= -65 && (((b9 << 28) + (b12 + 112)) >> 30) == 0 && b8 <= -65) {
                    i9 = i11 + 1;
                }
                return -1;
                i9 = i12;
            }
            return j(byteBuffer, i9, i10);
        }

        public abstract int l(int i8, ByteBuffer byteBuffer, int i9, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends b {
        public static int m(byte[] bArr, int i8, int i9) {
            while (i8 < i9 && bArr[i8] >= 0) {
                i8++;
            }
            if (i8 >= i9) {
                return 0;
            }
            return n(bArr, i8, i9);
        }

        public static int n(byte[] bArr, int i8, int i9) {
            while (i8 < i9) {
                int i10 = i8 + 1;
                byte b8 = bArr[i8];
                if (b8 < 0) {
                    if (b8 < -32) {
                        if (i10 >= i9) {
                            return b8;
                        }
                        if (b8 >= -62) {
                            i8 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b8 >= -16) {
                        if (i10 >= i9 - 2) {
                            return A0.q(bArr, i10, i9);
                        }
                        int i11 = i8 + 2;
                        byte b9 = bArr[i10];
                        if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                            int i12 = i8 + 3;
                            if (bArr[i11] <= -65) {
                                i8 += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 1) {
                        return A0.q(bArr, i10, i9);
                    }
                    int i13 = i8 + 2;
                    byte b10 = bArr[i10];
                    if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                        i8 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                i8 = i10;
            }
            return 0;
        }

        @Override // com.google.protobuf.A0.b
        public String b(byte[] bArr, int i8, int i9) throws B {
            if ((i8 | i9 | ((bArr.length - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b8 = bArr[i8];
                if (!a.n(b8)) {
                    break;
                }
                i8++;
                a.i(b8, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b9 = bArr[i8];
                if (a.n(b9)) {
                    int i14 = i12 + 1;
                    a.i(b9, cArr, i12);
                    int i15 = i13;
                    while (i15 < i10) {
                        byte b10 = bArr[i15];
                        if (!a.n(b10)) {
                            break;
                        }
                        i15++;
                        a.i(b10, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i15;
                } else if (a.p(b9)) {
                    if (i13 >= i10) {
                        throw B.d();
                    }
                    i8 += 2;
                    a.k(b9, bArr[i13], cArr, i12);
                    i12++;
                } else if (a.o(b9)) {
                    if (i13 >= i10 - 1) {
                        throw B.d();
                    }
                    int i16 = i8 + 2;
                    i8 += 3;
                    a.j(b9, bArr[i13], bArr[i16], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw B.d();
                    }
                    byte b11 = bArr[i13];
                    int i17 = i8 + 3;
                    byte b12 = bArr[i8 + 2];
                    i8 += 4;
                    a.h(b9, b11, b12, bArr[i17], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.A0.b
        public String d(ByteBuffer byteBuffer, int i8, int i9) {
            return c(byteBuffer, i8, i9);
        }

        @Override // com.google.protobuf.A0.b
        public int e(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            int i10;
            int i11;
            char cCharAt;
            int length = charSequence.length();
            int i12 = i9 + i8;
            int i13 = 0;
            while (i13 < length && (i11 = i13 + i8) < i12 && (cCharAt = charSequence.charAt(i13)) < 128) {
                bArr[i11] = (byte) cCharAt;
                i13++;
            }
            if (i13 == length) {
                return i8 + length;
            }
            int i14 = i8 + i13;
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < 128 && i14 < i12) {
                    bArr[i14] = (byte) cCharAt2;
                    i14++;
                } else if (cCharAt2 < 2048 && i14 <= i12 - 2) {
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                    i14 += 2;
                    bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i14 > i12 - 3) {
                        if (i14 > i12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i13 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                        }
                        int i16 = i13 + 1;
                        if (i16 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                bArr[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i18 = i14 + 2;
                    bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i14 += 3;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
                i13++;
            }
            return i14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.A0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int i(int i8, byte[] bArr, int i9, int i10) {
            byte b8;
            int i11;
            int i12;
            if (i8 != 0) {
                if (i9 >= i10) {
                    return i8;
                }
                byte b9 = (byte) i8;
                if (b9 < -32) {
                    if (b9 >= -62) {
                        i12 = i9 + 1;
                    }
                    return -1;
                }
                if (b9 < -16) {
                    byte b10 = (byte) (~(i8 >> 8));
                    if (b10 == 0) {
                        int i13 = i9 + 1;
                        byte b11 = bArr[i9];
                        if (i13 >= i10) {
                            return A0.n(b9, b11);
                        }
                        i9 = i13;
                        b10 = b11;
                    }
                    if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                        i12 = i9 + 1;
                    }
                    return -1;
                }
                byte b12 = (byte) (~(i8 >> 8));
                if (b12 == 0) {
                    i11 = i9 + 1;
                    b12 = bArr[i9];
                    if (i11 >= i10) {
                        return A0.n(b9, b12);
                    }
                    b8 = 0;
                } else {
                    b8 = (byte) (i8 >> 16);
                    i11 = i9;
                }
                if (b8 == 0) {
                    int i14 = i11 + 1;
                    byte b13 = bArr[i11];
                    if (i14 >= i10) {
                        return A0.o(b9, b12, b13);
                    }
                    b8 = b13;
                    i11 = i14;
                }
                if (b12 <= -65 && (((b9 << 28) + (b12 + 112)) >> 30) == 0 && b8 <= -65) {
                    i9 = i11 + 1;
                }
                return -1;
                i9 = i12;
            }
            return m(bArr, i9, i10);
        }

        @Override // com.google.protobuf.A0.b
        public int l(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            return k(i8, byteBuffer, i9, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends IllegalArgumentException {
        public d(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends b {
        public static boolean m() {
            return z0.I() && z0.J();
        }

        public static int n(long j8, int i8) {
            int iP = p(j8, i8);
            long j9 = j8 + ((long) iP);
            int i9 = i8 - iP;
            while (true) {
                byte bW = 0;
                while (i9 > 0) {
                    long j10 = j9 + 1;
                    bW = z0.w(j9);
                    if (bW < 0) {
                        j9 = j10;
                        break;
                    }
                    i9--;
                    j9 = j10;
                }
                if (i9 == 0) {
                    return 0;
                }
                int i10 = i9 - 1;
                if (bW < -32) {
                    if (i10 == 0) {
                        return bW;
                    }
                    i9 -= 2;
                    if (bW >= -62) {
                        long j11 = 1 + j9;
                        if (z0.w(j9) <= -65) {
                            j9 = j11;
                        }
                    }
                    return -1;
                }
                if (bW >= -16) {
                    if (i10 < 3) {
                        return r(j9, bW, i10);
                    }
                    i9 -= 4;
                    long j12 = 1 + j9;
                    byte bW2 = z0.w(j9);
                    if (bW2 <= -65 && (((bW << 28) + (bW2 + 112)) >> 30) == 0) {
                        long j13 = 2 + j9;
                        if (z0.w(j12) <= -65) {
                            j9 += 3;
                            if (z0.w(j13) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 < 2) {
                    return r(j9, bW, i10);
                }
                i9 -= 3;
                long j14 = 1 + j9;
                byte bW3 = z0.w(j9);
                if (bW3 <= -65 && ((bW != -32 || bW3 >= -96) && (bW != -19 || bW3 < -96))) {
                    j9 += 2;
                    if (z0.w(j14) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int o(byte[] bArr, long j8, int i8) {
            int iQ = q(bArr, j8, i8);
            int i9 = i8 - iQ;
            long j9 = j8 + ((long) iQ);
            while (true) {
                byte bX = 0;
                while (i9 > 0) {
                    long j10 = j9 + 1;
                    bX = z0.x(bArr, j9);
                    if (bX < 0) {
                        j9 = j10;
                        break;
                    }
                    i9--;
                    j9 = j10;
                }
                if (i9 == 0) {
                    return 0;
                }
                int i10 = i9 - 1;
                if (bX < -32) {
                    if (i10 == 0) {
                        return bX;
                    }
                    i9 -= 2;
                    if (bX >= -62) {
                        long j11 = 1 + j9;
                        if (z0.x(bArr, j9) <= -65) {
                            j9 = j11;
                        }
                    }
                    return -1;
                }
                if (bX >= -16) {
                    if (i10 < 3) {
                        return s(bArr, bX, j9, i10);
                    }
                    i9 -= 4;
                    long j12 = 1 + j9;
                    byte bX2 = z0.x(bArr, j9);
                    if (bX2 <= -65 && (((bX << 28) + (bX2 + 112)) >> 30) == 0) {
                        long j13 = 2 + j9;
                        if (z0.x(bArr, j12) <= -65) {
                            j9 += 3;
                            if (z0.x(bArr, j13) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 < 2) {
                    return s(bArr, bX, j9, i10);
                }
                i9 -= 3;
                long j14 = 1 + j9;
                byte bX3 = z0.x(bArr, j9);
                if (bX3 <= -65 && ((bX != -32 || bX3 >= -96) && (bX != -19 || bX3 < -96))) {
                    j9 += 2;
                    if (z0.x(bArr, j14) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int p(long j8, int i8) {
            if (i8 < 16) {
                return 0;
            }
            int i9 = (int) ((-j8) & 7);
            int i10 = i9;
            while (i10 > 0) {
                long j9 = 1 + j8;
                if (z0.w(j8) < 0) {
                    return i9 - i10;
                }
                i10--;
                j8 = j9;
            }
            int i11 = i8 - i9;
            while (i11 >= 8 && (z0.D(j8) & (-9187201950435737472L)) == 0) {
                j8 += 8;
                i11 -= 8;
            }
            return i8 - i11;
        }

        public static int q(byte[] bArr, long j8, int i8) {
            int i9 = 0;
            if (i8 < 16) {
                return 0;
            }
            int i10 = 8 - (((int) j8) & 7);
            while (i9 < i10) {
                long j9 = 1 + j8;
                if (z0.x(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j9;
            }
            while (true) {
                int i11 = i9 + 8;
                if (i11 > i8 || (z0.E(bArr, z0.f19509h + j8) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j8 += 8;
                i9 = i11;
            }
            while (i9 < i8) {
                long j10 = j8 + 1;
                if (z0.x(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j10;
            }
            return i8;
        }

        public static int r(long j8, int i8, int i9) {
            if (i9 == 0) {
                return A0.m(i8);
            }
            if (i9 == 1) {
                return A0.n(i8, z0.w(j8));
            }
            if (i9 == 2) {
                return A0.o(i8, z0.w(j8), z0.w(j8 + 1));
            }
            throw new AssertionError();
        }

        public static int s(byte[] bArr, int i8, long j8, int i9) {
            if (i9 == 0) {
                return A0.m(i8);
            }
            if (i9 == 1) {
                return A0.n(i8, z0.x(bArr, j8));
            }
            if (i9 == 2) {
                return A0.o(i8, z0.x(bArr, j8), z0.x(bArr, j8 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.A0.b
        public String b(byte[] bArr, int i8, int i9) throws B {
            Charset charset = A.f19048b;
            String str = new String(bArr, i8, i9, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i8, i9 + i8))) {
                throw B.d();
            }
            return str;
        }

        @Override // com.google.protobuf.A0.b
        public String d(ByteBuffer byteBuffer, int i8, int i9) throws B {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            long jK = z0.k(byteBuffer) + ((long) i8);
            long j8 = ((long) i9) + jK;
            char[] cArr = new char[i9];
            int i10 = 0;
            while (jK < j8) {
                byte bW = z0.w(jK);
                if (!a.n(bW)) {
                    break;
                }
                jK++;
                a.i(bW, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (jK < j8) {
                long j9 = jK + 1;
                byte bW2 = z0.w(jK);
                if (a.n(bW2)) {
                    int i12 = i11 + 1;
                    a.i(bW2, cArr, i11);
                    long j10 = j9;
                    while (j10 < j8) {
                        byte bW3 = z0.w(j10);
                        if (!a.n(bW3)) {
                            break;
                        }
                        j10++;
                        a.i(bW3, cArr, i12);
                        i12++;
                    }
                    i11 = i12;
                    jK = j10;
                } else if (a.p(bW2)) {
                    if (j9 >= j8) {
                        throw B.d();
                    }
                    jK += 2;
                    a.k(bW2, z0.w(j9), cArr, i11);
                    i11++;
                } else if (a.o(bW2)) {
                    if (j9 >= j8 - 1) {
                        throw B.d();
                    }
                    long j11 = 2 + jK;
                    jK += 3;
                    a.j(bW2, z0.w(j9), z0.w(j11), cArr, i11);
                    i11++;
                } else {
                    if (j9 >= j8 - 2) {
                        throw B.d();
                    }
                    byte bW4 = z0.w(j9);
                    long j12 = jK + 3;
                    byte bW5 = z0.w(2 + jK);
                    jK += 4;
                    a.h(bW2, bW4, bW5, z0.w(j12), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.A0.b
        public int e(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            long j8;
            long j9;
            long j10;
            int i10;
            char cCharAt;
            long j11 = i8;
            long j12 = ((long) i9) + j11;
            int length = charSequence.length();
            if (length > i9 || bArr.length - i9 < i8) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i8 + i9));
            }
            int i11 = 0;
            while (true) {
                j8 = 1;
                if (i11 >= length || (cCharAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                z0.O(bArr, j11, (byte) cCharAt);
                i11++;
                j11 = 1 + j11;
            }
            if (i11 == length) {
                return (int) j11;
            }
            while (i11 < length) {
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt2 < 128 && j11 < j12) {
                    z0.O(bArr, j11, (byte) cCharAt2);
                    j10 = j12;
                    j9 = j8;
                    j11 += j8;
                } else if (cCharAt2 >= 2048 || j11 > j12 - 2) {
                    j9 = j8;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j11 > j12 - 3) {
                        j10 = j12;
                        if (j11 > j10 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                                throw new d(i11, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j11);
                        }
                        int i12 = i11 + 1;
                        if (i12 != length) {
                            char cCharAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                z0.O(bArr, j11, (byte) ((codePoint >>> 18) | 240));
                                z0.O(bArr, j11 + j9, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j13 = j11 + 3;
                                z0.O(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j11 += 4;
                                z0.O(bArr, j13, (byte) ((codePoint & 63) | 128));
                                i11 = i12;
                            } else {
                                i11 = i12;
                            }
                        }
                        throw new d(i11 - 1, length);
                    }
                    z0.O(bArr, j11, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j14 = j11 + 2;
                    j10 = j12;
                    z0.O(bArr, j11 + j9, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j11 += 3;
                    z0.O(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j9 = j8;
                    long j15 = j11 + j9;
                    z0.O(bArr, j11, (byte) ((cCharAt2 >>> 6) | 960));
                    j11 += 2;
                    z0.O(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                    j10 = j12;
                }
                i11++;
                j8 = j9;
                j12 = j10;
            }
            return (int) j11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.z0.x(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.z0.x(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.A0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int i(int i8, byte[] bArr, int i9, int i10) {
            byte bX;
            long j8;
            if ((i9 | i10 | (bArr.length - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            long j9 = i9;
            long j10 = i10;
            if (i8 != 0) {
                if (j9 >= j10) {
                    return i8;
                }
                byte b8 = (byte) i8;
                if (b8 < -32) {
                    if (b8 >= -62) {
                        long j11 = 1 + j9;
                        if (z0.x(bArr, j9) <= -65) {
                            j9 = j11;
                        }
                    }
                    return -1;
                }
                if (b8 < -16) {
                    byte bX2 = (byte) (~(i8 >> 8));
                    if (bX2 == 0) {
                        long j12 = j9 + 1;
                        bX2 = z0.x(bArr, j9);
                        if (j12 >= j10) {
                            return A0.n(b8, bX2);
                        }
                        j9 = j12;
                    }
                    if (bX2 <= -65 && ((b8 != -32 || bX2 >= -96) && (b8 != -19 || bX2 < -96))) {
                        j8 = j9 + 1;
                    }
                    return -1;
                }
                byte bX3 = (byte) (~(i8 >> 8));
                if (bX3 == 0) {
                    long j13 = j9 + 1;
                    bX3 = z0.x(bArr, j9);
                    if (j13 >= j10) {
                        return A0.n(b8, bX3);
                    }
                    bX = 0;
                    j9 = j13;
                } else {
                    bX = (byte) (i8 >> 16);
                }
                if (bX == 0) {
                    long j14 = j9 + 1;
                    bX = z0.x(bArr, j9);
                    if (j14 >= j10) {
                        return A0.o(b8, bX3, bX);
                    }
                    j9 = j14;
                }
                if (bX3 <= -65 && (((b8 << 28) + (bX3 + 112)) >> 30) == 0 && bX <= -65) {
                    j8 = j9 + 1;
                }
                return -1;
                j9 = j8;
            }
            return o(bArr, j9, (int) (j10 - j9));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.z0.w(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.z0.w(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.z0.w(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.A0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int l(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            byte bW;
            long j8;
            if ((i9 | i10 | (byteBuffer.limit() - i10)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
            long jK = z0.k(byteBuffer) + ((long) i9);
            long j9 = ((long) (i10 - i9)) + jK;
            if (i8 != 0) {
                if (jK >= j9) {
                    return i8;
                }
                byte b8 = (byte) i8;
                if (b8 < -32) {
                    if (b8 >= -62) {
                        j8 = 1 + jK;
                    }
                    return -1;
                }
                if (b8 < -16) {
                    byte bW2 = (byte) (~(i8 >> 8));
                    if (bW2 == 0) {
                        long j10 = jK + 1;
                        bW2 = z0.w(jK);
                        if (j10 >= j9) {
                            return A0.n(b8, bW2);
                        }
                        jK = j10;
                    }
                    if (bW2 <= -65 && ((b8 != -32 || bW2 >= -96) && (b8 != -19 || bW2 < -96))) {
                        j8 = 1 + jK;
                    }
                    return -1;
                }
                byte bW3 = (byte) (~(i8 >> 8));
                if (bW3 == 0) {
                    long j11 = jK + 1;
                    bW3 = z0.w(jK);
                    if (j11 >= j9) {
                        return A0.n(b8, bW3);
                    }
                    bW = 0;
                    jK = j11;
                } else {
                    bW = (byte) (i8 >> 16);
                }
                if (bW == 0) {
                    long j12 = jK + 1;
                    bW = z0.w(jK);
                    if (j12 >= j9) {
                        return A0.o(b8, bW3, bW);
                    }
                    jK = j12;
                }
                if (bW3 <= -65 && (((b8 << 28) + (bW3 + 112)) >> 30) == 0 && bW <= -65) {
                    j8 = 1 + jK;
                }
                return -1;
                jK = j8;
            }
            return n(jK, (int) (j9 - jK));
        }
    }

    static {
        f19055a = (!e.m() || AbstractC2092d.c()) ? new c() : new e();
    }

    public static String g(ByteBuffer byteBuffer, int i8, int i9) {
        return f19055a.a(byteBuffer, i8, i9);
    }

    public static String h(byte[] bArr, int i8, int i9) {
        return f19055a.b(bArr, i8, i9);
    }

    public static int i(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        return f19055a.e(charSequence, bArr, i8, i9);
    }

    public static int j(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int iK = length;
        while (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt >= 2048) {
                iK += k(charSequence, i8);
                break;
            }
            iK += (127 - cCharAt) >>> 31;
            i8++;
        }
        if (iK >= length) {
            return iK;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iK) + 4294967296L));
    }

    public static int k(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        while (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt < 2048) {
                i9 += (127 - cCharAt) >>> 31;
            } else {
                i9 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i8) < 65536) {
                        throw new d(i8, length);
                    }
                    i8++;
                }
            }
            i8++;
        }
        return i9;
    }

    public static int l(ByteBuffer byteBuffer, int i8, int i9) {
        int i10 = i9 - 7;
        int i11 = i8;
        while (i11 < i10 && (byteBuffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        return i11 - i8;
    }

    public static int m(int i8) {
        if (i8 > -12) {
            return -1;
        }
        return i8;
    }

    public static int n(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    public static int o(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }

    public static int p(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        if (i10 == 0) {
            return m(i8);
        }
        if (i10 == 1) {
            return n(i8, byteBuffer.get(i9));
        }
        if (i10 == 2) {
            return o(i8, byteBuffer.get(i9), byteBuffer.get(i9 + 1));
        }
        throw new AssertionError();
    }

    public static int q(byte[] bArr, int i8, int i9) {
        byte b8 = bArr[i8 - 1];
        int i10 = i9 - i8;
        if (i10 == 0) {
            return m(b8);
        }
        if (i10 == 1) {
            return n(b8, bArr[i8]);
        }
        if (i10 == 2) {
            return o(b8, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean r(ByteBuffer byteBuffer) {
        return f19055a.f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean s(byte[] bArr) {
        return f19055a.g(bArr, 0, bArr.length);
    }

    public static boolean t(byte[] bArr, int i8, int i9) {
        return f19055a.g(bArr, i8, i9);
    }
}
