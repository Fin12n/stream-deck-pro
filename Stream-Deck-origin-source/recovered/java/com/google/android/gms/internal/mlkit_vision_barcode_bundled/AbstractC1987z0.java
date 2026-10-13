package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import M6.eLZq.eGwOBWCdOTaKus;
import com.elgato.streamdeck.vsd2.KnownHost;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1987z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f18716a = 100;

    public static int a(byte[] bArr, int i8, C1982y0 c1982y0) throws C1963u1 {
        int iJ = j(bArr, i8, c1982y0);
        int i9 = c1982y0.f18695a;
        if (i9 < 0) {
            throw new C1963u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i9 > bArr.length - iJ) {
            throw new C1963u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i9 == 0) {
            c1982y0.f18697c = J0.f17985b;
            return iJ;
        }
        c1982y0.f18697c = J0.N(bArr, iJ, i9);
        return iJ + i9;
    }

    public static int b(int i8, byte[] bArr, int i9, int i10, AbstractC1899h1 abstractC1899h1, C1909j1 c1909j1, AbstractC1954s2 abstractC1954s2, C1982y0 c1982y0) throws C1963u1 {
        C1864a1 c1864a1 = abstractC1899h1.zzb;
        G2 g8 = c1909j1.f18584b.f18581b;
        Object objValueOf = null;
        if (g8 == G2.f17966o) {
            j(bArr, i9, c1982y0);
            throw null;
        }
        switch (g8.ordinal()) {
            case 0:
                i9 += 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(q(bArr, i9)));
                break;
            case 1:
                i9 += 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(c(bArr, i9)));
                break;
            case 2:
            case 3:
                i9 = m(bArr, i9, c1982y0);
                objValueOf = Long.valueOf(c1982y0.f18696b);
                break;
            case 4:
            case 12:
                i9 = j(bArr, i9, c1982y0);
                objValueOf = Integer.valueOf(c1982y0.f18695a);
                break;
            case 5:
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                i9 += 8;
                objValueOf = Long.valueOf(q(bArr, i9));
                break;
            case 6:
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                i9 += 4;
                objValueOf = Integer.valueOf(c(bArr, i9));
                break;
            case 7:
                i9 = m(bArr, i9, c1982y0);
                objValueOf = Boolean.valueOf(c1982y0.f18696b != 0);
                break;
            case 8:
                i9 = h(bArr, i9, c1982y0);
                objValueOf = c1982y0.f18697c;
                break;
            case 9:
                int i11 = ((i8 >>> 3) << 3) | 4;
                InterfaceC1890f2 interfaceC1890f2B = U1.a().b(c1909j1.f18583a.getClass());
                Object objE = c1864a1.e(c1909j1.f18584b);
                if (objE == null) {
                    objE = interfaceC1890f2B.f();
                    c1864a1.i(c1909j1.f18584b, objE);
                }
                return n(objE, interfaceC1890f2B, bArr, i9, i10, i11, c1982y0);
            case 10:
                InterfaceC1890f2 interfaceC1890f2B2 = U1.a().b(c1909j1.f18583a.getClass());
                Object objE2 = c1864a1.e(c1909j1.f18584b);
                if (objE2 == null) {
                    objE2 = interfaceC1890f2B2.f();
                    c1864a1.i(c1909j1.f18584b, objE2);
                }
                return o(objE2, interfaceC1890f2B2, bArr, i9, i10, c1982y0);
            case 11:
                i9 = a(bArr, i9, c1982y0);
                objValueOf = c1982y0.f18697c;
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i9 = j(bArr, i9, c1982y0);
                objValueOf = Integer.valueOf(N0.a(c1982y0.f18695a));
                break;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                i9 = m(bArr, i9, c1982y0);
                objValueOf = Long.valueOf(N0.b(c1982y0.f18696b));
                break;
        }
        c1864a1.i(c1909j1.f18584b, objValueOf);
        return i9;
    }

    public static int c(byte[] bArr, int i8) {
        int i9 = bArr[i8] & 255;
        int i10 = bArr[i8 + 1] & 255;
        int i11 = bArr[i8 + 2] & 255;
        return ((bArr[i8 + 3] & 255) << 24) | (i10 << 8) | i9 | (i11 << 16);
    }

    public static int d(InterfaceC1890f2 interfaceC1890f2, byte[] bArr, int i8, int i9, int i10, C1982y0 c1982y0) throws C1963u1 {
        Object objF = interfaceC1890f2.f();
        int iN = n(objF, interfaceC1890f2, bArr, i8, i9, i10, c1982y0);
        interfaceC1890f2.a(objF);
        c1982y0.f18697c = objF;
        return iN;
    }

    public static int e(InterfaceC1890f2 interfaceC1890f2, byte[] bArr, int i8, int i9, C1982y0 c1982y0) throws C1963u1 {
        Object objF = interfaceC1890f2.f();
        int iO = o(objF, interfaceC1890f2, bArr, i8, i9, c1982y0);
        interfaceC1890f2.a(objF);
        c1982y0.f18697c = objF;
        return iO;
    }

    public static int f(InterfaceC1890f2 interfaceC1890f2, int i8, byte[] bArr, int i9, int i10, InterfaceC1948r1 interfaceC1948r1, C1982y0 c1982y0) throws C1963u1 {
        int iE = e(interfaceC1890f2, bArr, i9, i10, c1982y0);
        interfaceC1948r1.add(c1982y0.f18697c);
        while (iE < i10) {
            int iJ = j(bArr, iE, c1982y0);
            if (i8 != c1982y0.f18695a) {
                break;
            }
            iE = e(interfaceC1890f2, bArr, iJ, i10, c1982y0);
            interfaceC1948r1.add(c1982y0.f18697c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i8, InterfaceC1948r1 interfaceC1948r1, C1982y0 c1982y0) throws C1963u1 {
        C1919l1 c1919l1 = (C1919l1) interfaceC1948r1;
        int iJ = j(bArr, i8, c1982y0);
        int i9 = c1982y0.f18695a + iJ;
        while (iJ < i9) {
            iJ = j(bArr, iJ, c1982y0);
            c1919l1.s(c1982y0.f18695a);
        }
        if (iJ == i9) {
            return iJ;
        }
        throw new C1963u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int h(byte[] bArr, int i8, C1982y0 c1982y0) throws C1963u1 {
        int iJ = j(bArr, i8, c1982y0);
        int i9 = c1982y0.f18695a;
        if (i9 < 0) {
            throw new C1963u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i9 == 0) {
            c1982y0.f18697c = "";
            return iJ;
        }
        c1982y0.f18697c = new String(bArr, iJ, i9, AbstractC1953s1.f18650a);
        return iJ + i9;
    }

    public static int j(byte[] bArr, int i8, C1982y0 c1982y0) {
        int i9 = i8 + 1;
        byte b8 = bArr[i8];
        if (b8 < 0) {
            return k(b8, bArr, i9, c1982y0);
        }
        c1982y0.f18695a = b8;
        return i9;
    }

    public static int k(int i8, byte[] bArr, int i9, C1982y0 c1982y0) {
        byte b8 = bArr[i9];
        int i10 = i9 + 1;
        int i11 = i8 & 127;
        if (b8 >= 0) {
            c1982y0.f18695a = i11 | (b8 << 7);
            return i10;
        }
        int i12 = i11 | ((b8 & 127) << 7);
        int i13 = i9 + 2;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            c1982y0.f18695a = i12 | (b9 << 14);
            return i13;
        }
        int i14 = i12 | ((b9 & 127) << 14);
        int i15 = i9 + 3;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            c1982y0.f18695a = i14 | (b10 << 21);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 21);
        int i17 = i9 + 4;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c1982y0.f18695a = i16 | (b11 << 28);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                c1982y0.f18695a = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    public static int l(int i8, byte[] bArr, int i9, int i10, InterfaceC1948r1 interfaceC1948r1, C1982y0 c1982y0) {
        C1919l1 c1919l1 = (C1919l1) interfaceC1948r1;
        int iJ = j(bArr, i9, c1982y0);
        c1919l1.s(c1982y0.f18695a);
        while (iJ < i10) {
            int iJ2 = j(bArr, iJ, c1982y0);
            if (i8 != c1982y0.f18695a) {
                break;
            }
            iJ = j(bArr, iJ2, c1982y0);
            c1919l1.s(c1982y0.f18695a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i8, C1982y0 c1982y0) {
        long j8 = bArr[i8];
        int i9 = i8 + 1;
        if (j8 >= 0) {
            c1982y0.f18696b = j8;
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
        c1982y0.f18696b = j9;
        return i10;
    }

    public static int n(Object obj, InterfaceC1890f2 interfaceC1890f2, byte[] bArr, int i8, int i9, int i10, C1982y0 c1982y0) throws C1963u1 {
        int i11 = c1982y0.f18699e + 1;
        c1982y0.f18699e = i11;
        r(i11);
        int iY = ((P1) interfaceC1890f2).y(obj, bArr, i8, i9, i10, c1982y0);
        c1982y0.f18699e--;
        c1982y0.f18697c = obj;
        return iY;
    }

    public static int o(Object obj, InterfaceC1890f2 interfaceC1890f2, byte[] bArr, int i8, int i9, C1982y0 c1982y0) throws C1963u1 {
        int iK = i8 + 1;
        int i10 = bArr[i8];
        if (i10 < 0) {
            iK = k(i10, bArr, iK, c1982y0);
            i10 = c1982y0.f18695a;
        }
        int i11 = iK;
        if (i10 < 0 || i10 > i9 - i11) {
            throw new C1963u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = c1982y0.f18699e + 1;
        c1982y0.f18699e = i12;
        r(i12);
        int i13 = i11 + i10;
        interfaceC1890f2.h(obj, bArr, i11, i13, c1982y0);
        c1982y0.f18699e--;
        c1982y0.f18697c = obj;
        return i13;
    }

    public static int p(int i8, byte[] bArr, int i9, int i10, C1982y0 c1982y0) throws C1963u1 {
        if ((i8 >>> 3) == 0) {
            throw new C1963u1("Protocol message contained an invalid tag (zero).");
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            return m(bArr, i9, c1982y0);
        }
        if (i11 == 1) {
            return i9 + 8;
        }
        if (i11 == 2) {
            return j(bArr, i9, c1982y0) + c1982y0.f18695a;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                return i9 + 4;
            }
            throw new C1963u1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = (i8 & (-8)) | 4;
        int i13 = 0;
        while (i9 < i10) {
            i9 = j(bArr, i9, c1982y0);
            i13 = c1982y0.f18695a;
            if (i13 == i12) {
                break;
            }
            i9 = p(i13, bArr, i9, i10, c1982y0);
        }
        if (i9 > i10 || i13 != i12) {
            throw new C1963u1("Failed to parse the message.");
        }
        return i9;
    }

    public static long q(byte[] bArr, int i8) {
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
    }

    public static void r(int i8) throws C1963u1 {
        if (i8 >= f18716a) {
            throw new C1963u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static int i(int i8, byte[] bArr, int i9, int i10, C1959t2 c1959t2, C1982y0 c1982y0) throws C1963u1 {
        if ((i8 >>> 3) == 0) {
            throw new C1963u1("Protocol message contained an invalid tag (zero).");
        }
        int i11 = i8 & 7;
        if (i11 == 0) {
            int iM = m(bArr, i9, c1982y0);
            c1959t2.j(i8, Long.valueOf(c1982y0.f18696b));
            return iM;
        }
        if (i11 == 1) {
            c1959t2.j(i8, Long.valueOf(q(bArr, i9)));
            return i9 + 8;
        }
        if (i11 == 2) {
            int iJ = j(bArr, i9, c1982y0);
            int i12 = c1982y0.f18695a;
            if (i12 < 0) {
                throw new C1963u1(eGwOBWCdOTaKus.ndJFroRz);
            }
            if (i12 > bArr.length - iJ) {
                throw new C1963u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i12 == 0) {
                c1959t2.j(i8, J0.f17985b);
            } else {
                c1959t2.j(i8, J0.N(bArr, iJ, i12));
            }
            return iJ + i12;
        }
        if (i11 != 3) {
            if (i11 != 5) {
                throw new C1963u1("Protocol message contained an invalid tag (zero).");
            }
            c1959t2.j(i8, Integer.valueOf(c(bArr, i9)));
            return i9 + 4;
        }
        int i13 = (i8 & (-8)) | 4;
        C1959t2 c1959t2F = C1959t2.f();
        int i14 = c1982y0.f18699e + 1;
        c1982y0.f18699e = i14;
        r(i14);
        int i15 = 0;
        while (i9 < i10) {
            int iJ2 = j(bArr, i9, c1982y0);
            int i16 = c1982y0.f18695a;
            if (i16 == i13) {
                i15 = i16;
                i9 = iJ2;
                break;
            }
            i9 = i(i16, bArr, iJ2, i10, c1959t2F, c1982y0);
            i15 = i16;
        }
        c1982y0.f18699e--;
        if (i9 > i10 || i15 != i13) {
            throw new C1963u1("Failed to parse the message.");
        }
        c1959t2.j(i8, c1959t2F);
        return i9;
    }
}
