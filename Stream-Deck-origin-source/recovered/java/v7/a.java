package v7;

import J7.C1034e;
import Z6.v;
import Z6.w;
import com.revenuecat.purchases.common.Constants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final boolean a(String str) {
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (t.h(cCharAt, 31) <= 0 || t.h(cCharAt, 127) >= 0 || w.X(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(String str, int i8, int i9, byte[] bArr, int i10) {
        int i11 = i10;
        while (i8 < i9) {
            if (i11 == bArr.length) {
                return false;
            }
            if (i11 != i10) {
                if (str.charAt(i8) != '.') {
                    return false;
                }
                i8++;
            }
            int i12 = i8;
            int i13 = 0;
            while (i12 < i9) {
                char cCharAt = str.charAt(i12);
                if (t.h(cCharAt, 48) < 0 || t.h(cCharAt, 57) > 0) {
                    break;
                }
                if ((i13 == 0 && i8 != i12) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i12++;
            }
            if (i12 - i8 == 0) {
                return false;
            }
            bArr[i11] = (byte) i13;
            i11++;
            i8 = i12;
        }
        return i11 == i10 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[LOOP:1: B:30:0x0064->B:33:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0076 A[EDGE_INSN: B:54:0x0076->B:34:0x0076 BREAK  A[LOOP:1: B:30:0x0064->B:33:0x0070], SYNTHETIC] */
    public static final InetAddress c(String str, int i8, int i9) {
        int i10;
        int i11;
        int I8;
        byte[] bArr = new byte[16];
        int i12 = i8;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        while (i12 < i9) {
            if (i13 == 16) {
                return null;
            }
            int i16 = i12 + 2;
            if (i16 <= i9 && v.G(str, "::", i12, false, 4, null)) {
                if (i14 != -1) {
                    return null;
                }
                i13 += 2;
                if (i16 == i9) {
                    i14 = i13;
                    break;
                }
                i14 = i13;
                i15 = i16;
                i10 = 0;
                i12 = i15;
                while (i12 < i9) {
                    I8 = d.I(str.charAt(i12));
                    if (I8 != -1) {
                        break;
                        break;
                    }
                    i10 = (i10 << 4) + I8;
                    i12++;
                }
                i11 = i12 - i15;
                if (i11 != 0) {
                }
                return null;
            }
            if (i13 != 0) {
                if (!v.G(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, i12, false, 4, null)) {
                    if (!v.G(str, ".", i12, false, 4, null) || !b(str, i15, i9, bArr, i13 - 2)) {
                        return null;
                    }
                    i13 += 2;
                    break;
                }
                i12++;
            }
            i15 = i12;
            i10 = 0;
            i12 = i15;
            while (i12 < i9) {
                I8 = d.I(str.charAt(i12));
                if (I8 != -1) {
                    break;
                }
                i10 = (i10 << 4) + I8;
                i12++;
            }
            i11 = i12 - i15;
            if (i11 != 0 || i11 > 4) {
                return null;
            }
            int i17 = i13 + 1;
            bArr[i13] = (byte) ((i10 >>> 8) & 255);
            i13 += 2;
            bArr[i17] = (byte) (i10 & 255);
        }
        if (i13 != 16) {
            if (i14 == -1) {
                return null;
            }
            int i18 = i13 - i14;
            System.arraycopy(bArr, i14, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i14, (16 - i13) + i14, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final String d(byte[] bArr) {
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10;
            while (i12 < 16 && bArr[i12] == 0 && bArr[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        C1034e c1034e = new C1034e();
        while (i9 < bArr.length) {
            if (i9 == i8) {
                c1034e.writeByte(58);
                i9 += i11;
                if (i9 == 16) {
                    c1034e.writeByte(58);
                }
            } else {
                if (i9 > 0) {
                    c1034e.writeByte(58);
                }
                c1034e.c1((d.d(bArr[i9], 255) << 8) | d.d(bArr[i9 + 1], 255));
                i9 += 2;
            }
        }
        return c1034e.o1();
    }

    public static final String e(String str) {
        t.g(str, "<this>");
        if (!w.M(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                t.f(ascii, "toASCII(host)");
                Locale US = Locale.US;
                t.f(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (v.H(str, "[", false, 2, null) && v.u(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            t.f(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
