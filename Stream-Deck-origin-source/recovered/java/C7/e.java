package C7;

import Z6.v;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f1513a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J7.h f1514b = J7.h.f4388d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f1515c = {"DATA", "HEADERS", "PRIORITY", yOZfxp.rQrxXnUZi, "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f1516d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f1517e;

    public final String a(int i8, int i9) {
        String str;
        if (i9 == 0) {
            return "";
        }
        if (i8 != 2 && i8 != 3) {
            if (i8 == 4 || i8 == 6) {
                return i9 == 1 ? "ACK" : f1517e[i9];
            }
            if (i8 != 7 && i8 != 8) {
                String[] strArr = f1516d;
                if (i9 < strArr.length) {
                    str = strArr[i9];
                    t.d(str);
                } else {
                    str = f1517e[i9];
                }
                String str2 = str;
                if (i8 != 5 || (i9 & 4) == 0) {
                    return (i8 != 0 || (i9 & 32) == 0) ? str2 : v.D(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return v.D(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f1517e[i9];
    }

    public final String b(int i8) {
        String[] strArr = f1515c;
        return i8 < strArr.length ? strArr[i8] : v7.d.t("0x%02x", Integer.valueOf(i8));
    }

    public final String c(boolean z8, int i8, int i9, int i10, int i11) {
        return v7.d.t("%s 0x%08x %5d %-13s %s", z8 ? "<<" : ">>", Integer.valueOf(i8), Integer.valueOf(i9), b(i10), a(i10, i11));
    }

    static {
        String[] strArr = new String[256];
        for (int i8 = 0; i8 < 256; i8++) {
            String binaryString = Integer.toBinaryString(i8);
            t.f(binaryString, "toBinaryString(it)");
            strArr[i8] = v.C(v7.d.t("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f1517e = strArr;
        String[] strArr2 = f1516d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i9 = iArr[0];
        strArr2[i9 | 8] = strArr2[i9] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            String[] strArr3 = f1516d;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            strArr3[i13 | 8] = strArr3[i12] + '|' + strArr3[i11] + "|PADDED";
        }
        int length = f1516d.length;
        for (int i14 = 0; i14 < length; i14++) {
            String[] strArr4 = f1516d;
            if (strArr4[i14] == null) {
                strArr4[i14] = f1517e[i14];
            }
        }
    }
}
