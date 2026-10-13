package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F {
    public static int a(byte[] bArr, int i8, E e8) {
        int iH = h(bArr, i8, e8);
        int i9 = e8.f18753a;
        if (i9 < 0) {
            throw A0.d();
        }
        if (i9 > bArr.length - iH) {
            throw A0.g();
        }
        if (i9 == 0) {
            e8.f18755c = S.f18819b;
            return iH;
        }
        e8.f18755c = S.H(bArr, iH, i9);
        return iH + i9;
    }

    public static int b(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public static int c(InterfaceC2017g1 interfaceC2017g1, byte[] bArr, int i8, int i9, int i10, E e8) {
        Object objF = interfaceC2017g1.f();
        int iL = l(objF, interfaceC2017g1, bArr, i8, i9, i10, e8);
        interfaceC2017g1.a(objF);
        e8.f18755c = objF;
        return iL;
    }

    public static int d(InterfaceC2017g1 interfaceC2017g1, byte[] bArr, int i8, int i9, E e8) {
        Object objF = interfaceC2017g1.f();
        int iM = m(objF, interfaceC2017g1, bArr, i8, i9, e8);
        interfaceC2017g1.a(objF);
        e8.f18755c = objF;
        return iM;
    }

    public static int e(InterfaceC2017g1 interfaceC2017g1, int i8, byte[] bArr, int i9, int i10, InterfaceC2078x0 interfaceC2078x0, E e8) {
        int iD = d(interfaceC2017g1, bArr, i9, i10, e8);
        interfaceC2078x0.add(e8.f18755c);
        while (iD < i10) {
            int iH = h(bArr, iD, e8);
            if (i8 != e8.f18753a) {
                break;
            }
            iD = d(interfaceC2017g1, bArr, iH, i10, e8);
            interfaceC2078x0.add(e8.f18755c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i8, InterfaceC2078x0 interfaceC2078x0, E e8) {
        C2059r0 c2059r0 = (C2059r0) interfaceC2078x0;
        int iH = h(bArr, i8, e8);
        int i9 = e8.f18753a + iH;
        while (iH < i9) {
            iH = h(bArr, iH, e8);
            c2059r0.s(e8.f18753a);
        }
        if (iH == i9) {
            return iH;
        }
        throw A0.g();
    }

    public static int g(int i8, byte[] bArr, int i9, int i10, C2079x1 c2079x1, E e8) {
        if ((i8 >>> 3) == 0) {
            throw A0.b();
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int iK = k(bArr, i9, e8);
            c2079x1.j(i8, Long.valueOf(e8.f18754b));
            return iK;
        }
        if (i11 == 1) {
            c2079x1.j(i8, Long.valueOf(n(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int iH = h(bArr, i9, e8);
            int i12 = e8.f18753a;
            if (i12 < 0) {
                throw A0.d();
            }
            if (i12 > bArr.length - iH) {
                throw A0.g();
            }
            if (i12 == 0) {
                c2079x1.j(i8, S.f18819b);
            } else {
                c2079x1.j(i8, S.H(bArr, iH, i12));
            }
            return iH + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw A0.b();
            }
            c2079x1.j(i8, Integer.valueOf(b(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        C2079x1 c2079x1F = C2079x1.f();
        int i14 = 0;
        while (i9 < i10) {
            int iH2 = h(bArr, i9, e8);
            i14 = e8.f18753a;
            if (i14 == i13) {
                i9 = iH2;
                break;
            }
            i9 = g(i14, bArr, iH2, i10, c2079x1F, e8);
        }
        if (i9 > i10 || i14 != i13) {
            throw A0.e();
        }
        c2079x1.j(i8, c2079x1F);
        return i9;
    }

    public static int h(byte[] bArr, int i8, E e8) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return i(b8, bArr, i9, e8);
        }
        e8.f18753a = b8;
        return i9;
    }

    public static int i(int i8, byte[] bArr, int i9, E e8) {
        byte b8 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & 127;
        if (b8 >= 0) {
            e8.f18753a = i11 | (b8 << 7);
            return i10;
        }
        int i12 = i11 | ((b8 & 127) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            e8.f18753a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & 127) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            e8.f18753a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            e8.f18753a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                e8.f18753a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int j(int i8, byte[] bArr, int i9, int i10, InterfaceC2078x0 interfaceC2078x0, E e8) {
        C2059r0 c2059r0 = (C2059r0) interfaceC2078x0;
        int iH = h(bArr, i9, e8);
        c2059r0.s(e8.f18753a);
        while (iH < i10) {
            int iH2 = h(bArr, iH, e8);
            if (i8 != e8.f18753a) {
                break;
            }
            iH = h(bArr, iH2, e8);
            c2059r0.s(e8.f18753a);
        }
        return iH;
    }

    public static int k(byte[] bArr, int i8, E e8) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            e8.f18754b = j8;
            return i9;
        }
        int i10 = i8 + 2;
        byte b8 = bArr[i9];
        long j9 = (j8 & 127) | (((long) (b8 & 127)) << 7);
        int i11 = 7;
        while (b8 < 0) {
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            i11 += 7;
            j9 |= ((long) (b9 & 127)) << i11;
            b8 = b9;
            i10 = i12;
        }
        e8.f18754b = j9;
        return i10;
    }

    public static int l(Object obj, InterfaceC2017g1 interfaceC2017g1, byte[] bArr, int i8, int i9, int i10, E e8) {
        int iY = ((Y0) interfaceC2017g1).y(obj, bArr, i8, i9, i10, e8);
        e8.f18755c = obj;
        return iY;
    }

    public static int m(Object obj, InterfaceC2017g1 interfaceC2017g1, byte[] bArr, int i8, int i9, E e8) {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = i(i11, bArr, i10, e8);
            i11 = e8.f18753a;
        }
        int i12 = i10;
        if (i11 < 0 || i11 > i9 - i12) {
            throw A0.g();
        }
        int i13 = i12 + i11;
        interfaceC2017g1.i(obj, bArr, i12, i13, e8);
        e8.f18755c = obj;
        return i13;
    }

    public static long n(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }
}
