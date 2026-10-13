package p197w6;

import C6.C0920i;
import Z6.C1694a;
import Z6.w;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final long a(ByteBuffer byteBuffer, char[] out, int i8, int i9) {
        t.g(byteBuffer, "<this>");
        t.g(out, "out");
        return byteBuffer.hasArray() ? b(byteBuffer, out, i8, i9) : c(byteBuffer, out, i8, i9);
    }

    public static final long b(ByteBuffer byteBuffer, char[] cArr, int i8, int i9) throws Throwable {
        long jD;
        boolean z8;
        char c8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int iRemaining = byteBuffer.remaining() + iArrayOffset;
        if (iArrayOffset > iRemaining) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRemaining > bArrArray.length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = i8 + i9;
        if (i10 > cArr.length) {
            throw f(i8, i9, cArr.length);
        }
        int i11 = i8;
        boolean z13 = false;
        while (true) {
            if (iArrayOffset >= iRemaining || i11 >= i10) {
                byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                jD = d(i11 - i8, 0);
                break;
            }
            int i12 = iArrayOffset + 1;
            byte b8 = bArrArray[iArrayOffset];
            if (b8 >= 0) {
                char c9 = (char) b8;
                if (c9 == '\r') {
                    z13 = true;
                    z8 = true;
                } else {
                    if (c9 == '\n') {
                        z13 = false;
                    } else if (!z13) {
                        z8 = true;
                    }
                    z8 = false;
                }
                if (!z8) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jD = d(i11 - i8, -1);
                    break;
                }
                cArr[i11] = c9;
                i11++;
                iArrayOffset = i12;
            } else if ((b8 & 224) == 192) {
                if (i12 >= iRemaining) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jD = d(i11 - i8, 2);
                    break;
                }
                int i13 = iArrayOffset + 2;
                char c10 = (char) ((bArrArray[i12] & 63) | ((b8 & 31) << 6));
                if (c10 == '\r') {
                    z13 = true;
                    z12 = true;
                } else {
                    if (c10 == '\n') {
                        z13 = false;
                    } else if (!z13) {
                        z12 = true;
                    }
                    z12 = false;
                }
                if (!z12) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jD = d(i11 - i8, -1);
                    break;
                }
                cArr[i11] = c10;
                i11++;
                iArrayOffset = i13;
            } else {
                if ((b8 & 240) != 224) {
                    if ((b8 & 248) != 240) {
                        k(b8);
                        throw new C0920i();
                    }
                    if (iRemaining - i12 < 3) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        jD = d(i11 - i8, 4);
                        break;
                    }
                    byte b9 = bArrArray[i12];
                    i12 = iArrayOffset + 4;
                    int i14 = ((bArrArray[iArrayOffset + 2] & 63) << 6) | ((b9 & 63) << 12) | ((b8 & 7) << 18) | (bArrArray[iArrayOffset + 3] & 63);
                    if (!h(i14)) {
                        j(i14);
                        throw new C0920i();
                    }
                    if (i10 - i11 < 2) {
                        byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                        jD = d(i11 - i8, 0);
                        break;
                    }
                    char cE = (char) e(i14);
                    char cI = (char) i(i14);
                    if (cE == '\r') {
                        z13 = true;
                        z9 = true;
                        c8 = '\n';
                    } else {
                        c8 = '\n';
                        if (cE == '\n') {
                            z13 = false;
                        } else if (!z13) {
                            z9 = true;
                        }
                        z9 = false;
                    }
                    if (z9) {
                        if (cI == '\r') {
                            z13 = true;
                            z10 = true;
                        } else {
                            if (cI == c8) {
                                z13 = false;
                            } else if (!z13) {
                                z10 = true;
                            }
                            z10 = false;
                        }
                        if (z10) {
                            int i15 = i11 + 1;
                            cArr[i11] = cE;
                            i11 += 2;
                            cArr[i15] = cI;
                            iArrayOffset = i12;
                        }
                    }
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jD = d(i11 - i8, -1);
                    break;
                }
                if (iRemaining - i12 < 2) {
                    byteBuffer.position(iArrayOffset - byteBuffer.arrayOffset());
                    jD = d(i11 - i8, 3);
                    break;
                }
                byte b10 = bArrArray[i12];
                int i16 = iArrayOffset + 3;
                int i17 = b8 & 15;
                int i18 = (bArrArray[iArrayOffset + 2] & 63) | ((b10 & 63) << 6) | (i17 << 12);
                if (i17 != 0 && !g(i18)) {
                    j(i18);
                    throw new C0920i();
                }
                char c11 = (char) i18;
                if (c11 == '\r') {
                    z13 = true;
                    z11 = true;
                } else {
                    if (c11 == '\n') {
                        z13 = false;
                    } else if (!z13) {
                        z11 = true;
                    }
                    z11 = false;
                }
                if (!z11) {
                    byteBuffer.position((iArrayOffset - 1) - byteBuffer.arrayOffset());
                    jD = d(i11 - i8, -1);
                    break;
                }
                cArr[i11] = c11;
                i11++;
                iArrayOffset = i16;
            }
        }
        int i19 = (int) (4294967295L & jD);
        if (i19 == -1) {
            int i20 = (int) (jD >> 32);
            if (z13) {
                return d(i20 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i20 > 0) {
                int i21 = i20 - 1;
                if (cArr[i21] == '\r') {
                    return d(i21, -1);
                }
            }
        } else if (i19 == 0 && z13) {
            int i22 = (int) (jD >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return d(i22 - 1, 2);
        }
        return jD;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x015e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:88:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    public static final long c(ByteBuffer byteBuffer, char[] cArr, int i8, int i9) throws Throwable {
        long jD;
        boolean z8;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = i8 + i9;
        if (i11 > cArr.length) {
            throw f(i8, i9, cArr.length);
        }
        int i12 = i8;
        boolean z13 = false;
        while (true) {
            if (!byteBuffer.hasRemaining() || i12 >= i11) {
                jD = d(i12 - i8, 0);
                break;
            }
            byte b8 = byteBuffer.get();
            if (b8 >= 0) {
                char c8 = (char) b8;
                if (c8 == '\r') {
                    z13 = true;
                } else {
                    if (c8 == '\n') {
                        z13 = false;
                    } else {
                        z8 = !z13;
                    }
                    if (!z8) {
                        byteBuffer.position(byteBuffer.position() - 1);
                        jD = d(i12 - i8, -1);
                        break;
                    }
                    i10 = i12 + 1;
                    cArr[i12] = c8;
                    i12 = i10;
                }
                z8 = z13;
                if (!z8) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    jD = d(i12 - i8, -1);
                    break;
                }
                i10 = i12 + 1;
                cArr[i12] = c8;
                i12 = i10;
            } else if ((b8 & 224) == 192) {
                if (!byteBuffer.hasRemaining()) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    jD = d(i12 - i8, 2);
                    break;
                }
                char c9 = (char) (((b8 & 31) << 6) | (byteBuffer.get() & 63));
                if (c9 == '\r') {
                    z13 = true;
                } else {
                    if (c9 == '\n') {
                        z13 = false;
                    } else {
                        z9 = !z13;
                    }
                    if (!z9) {
                        byteBuffer.position(byteBuffer.position() - 2);
                        jD = d(i12 - i8, -1);
                        break;
                    }
                    i10 = i12 + 1;
                    cArr[i12] = c9;
                    i12 = i10;
                }
                z9 = z13;
                if (!z9) {
                    byteBuffer.position(byteBuffer.position() - 2);
                    jD = d(i12 - i8, -1);
                    break;
                }
                i10 = i12 + 1;
                cArr[i12] = c9;
                i12 = i10;
            } else {
                if ((b8 & 240) != 224) {
                    if ((b8 & 248) != 240) {
                        k(b8);
                        throw new C0920i();
                    }
                    if (byteBuffer.remaining() < 3) {
                        byteBuffer.position(byteBuffer.position() - 1);
                        jD = d(i12 - i8, 4);
                        break;
                    }
                    int i13 = ((b8 & 7) << 18) | ((byteBuffer.get() & 63) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                    if (!h(i13)) {
                        j(i13);
                        throw new C0920i();
                    }
                    if (i11 - i12 < 2) {
                        byteBuffer.position(byteBuffer.position() - 4);
                        jD = d(i12 - i8, 0);
                        break;
                    }
                    char cE = (char) e(i13);
                    char cI = (char) i(i13);
                    if (cE != '\r') {
                        if (cE == '\n') {
                            z13 = false;
                        } else {
                            z11 = !z13;
                        }
                        if (!z11) {
                            if (cI == '\r') {
                                z13 = true;
                            } else {
                                if (cI == '\n') {
                                    z13 = false;
                                } else if (z13) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (!z12) {
                                    int i14 = i12 + 1;
                                    cArr[i12] = cE;
                                    i12 += 2;
                                    cArr[i14] = cI;
                                }
                            }
                            z12 = z13;
                            if (!z12) {
                                int i15 = i12 + 1;
                                cArr[i12] = cE;
                                i12 += 2;
                                cArr[i15] = cI;
                            }
                        }
                        byteBuffer.position(byteBuffer.position() - 4);
                        jD = d(i12 - i8, -1);
                        break;
                    }
                    z13 = true;
                    z11 = z13;
                    if (!z11) {
                        if (cI == '\r') {
                            z13 = true;
                        } else {
                            if (cI == '\n') {
                                z13 = false;
                            } else if (z13) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z12) {
                                int i16 = i12 + 1;
                                cArr[i12] = cE;
                                i12 += 2;
                                cArr[i16] = cI;
                            }
                        }
                        z12 = z13;
                        if (!z12) {
                            int i17 = i12 + 1;
                            cArr[i12] = cE;
                            i12 += 2;
                            cArr[i17] = cI;
                        }
                    }
                    byteBuffer.position(byteBuffer.position() - 4);
                    jD = d(i12 - i8, -1);
                    break;
                }
                if (byteBuffer.remaining() < 2) {
                    byteBuffer.position(byteBuffer.position() - 1);
                    jD = d(i12 - i8, 3);
                    break;
                }
                int i18 = b8 & 15;
                int i19 = (i18 << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63);
                if (i18 != 0 && !g(i19)) {
                    j(i19);
                    throw new C0920i();
                }
                char c10 = (char) i19;
                if (c10 == '\r') {
                    z13 = true;
                } else {
                    if (c10 == '\n') {
                        z13 = false;
                    } else {
                        z10 = !z13;
                    }
                    if (!z10) {
                        byteBuffer.position(byteBuffer.position() - 3);
                        jD = d(i12 - i8, -1);
                        break;
                    }
                    i10 = i12 + 1;
                    cArr[i12] = c10;
                    i12 = i10;
                }
                z10 = z13;
                if (!z10) {
                    byteBuffer.position(byteBuffer.position() - 3);
                    jD = d(i12 - i8, -1);
                    break;
                }
                i10 = i12 + 1;
                cArr[i12] = c10;
                i12 = i10;
            }
        }
        int i20 = (int) (4294967295L & jD);
        if (i20 == -1) {
            int i21 = (int) (jD >> 32);
            if (z13) {
                return d(i21 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i21 > 0) {
                int i22 = i21 - 1;
                if (cArr[i22] == '\r') {
                    return d(i22, -1);
                }
            }
        } else if (i20 == 0 && z13) {
            int i23 = (int) (jD >> 32);
            byteBuffer.position(byteBuffer.position() - 1);
            return d(i23 - 1, 2);
        }
        return jD;
    }

    public static final long d(int i8, int i9) {
        return (((long) i9) & 4294967295L) | (((long) i8) << 32);
    }

    public static final int e(int i8) {
        return (i8 >>> 10) + 55232;
    }

    public static final Throwable f(int i8, int i9, int i10) {
        return new IndexOutOfBoundsException(i8 + " (offset) + " + i9 + " (length) > " + i10 + " (array.length)");
    }

    public static final boolean g(int i8) {
        return (i8 >>> 16) == 0;
    }

    public static final boolean h(int i8) {
        return i8 <= 1114111;
    }

    public static final int i(int i8) {
        return (i8 & 1023) + 56320;
    }

    public static final Void j(int i8) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i8) + " found");
    }

    public static final Void k(byte b8) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported byte code, first byte is 0x");
        String string = Integer.toString(b8 & 255, C1694a.a(16));
        t.f(string, "toString(this, checkRadix(radix))");
        sb.append(w.k0(string, 2, '0'));
        throw new IllegalStateException(sb.toString().toString());
    }
}
