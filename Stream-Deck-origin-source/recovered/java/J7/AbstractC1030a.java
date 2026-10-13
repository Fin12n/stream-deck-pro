package J7;

import java.util.Arrays;

/* JADX INFO: renamed from: J7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1030a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4362b;

    static {
        h.a aVar = h.f4388d;
        f4361a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").j();
        f4362b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").j();
    }

    public static final byte[] a(String str) {
        int i8;
        char cCharAt;
        kotlin.jvm.internal.t.g(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i9 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i9];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt2 = str.charAt(i13);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i8 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i8 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i8 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i8 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i8 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i11 = (i11 << 6) | i8;
            i10++;
            if (i10 % 4 == 0) {
                bArr[i12] = (byte) (i11 >> 16);
                int i14 = i12 + 2;
                bArr[i12 + 1] = (byte) (i11 >> 8);
                i12 += 3;
                bArr[i14] = (byte) i11;
            }
        }
        int i15 = i10 % 4;
        if (i15 == 1) {
            return null;
        }
        if (i15 == 2) {
            bArr[i12] = (byte) ((i11 << 12) >> 16);
            i12++;
        } else if (i15 == 3) {
            int i16 = i11 << 6;
            int i17 = i12 + 1;
            bArr[i12] = (byte) (i16 >> 16);
            i12 += 2;
            bArr[i17] = (byte) (i16 >> 8);
        }
        if (i12 == i9) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
        kotlin.jvm.internal.t.f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = bArr[i8];
            int i10 = i8 + 2;
            byte b9 = bArr[i8 + 1];
            i8 += 3;
            byte b10 = bArr[i10];
            bArr2[i9] = map[(b8 & 255) >> 2];
            bArr2[i9 + 1] = map[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr2[i9 + 2] = map[((b9 & 15) << 2) | ((b10 & 255) >> 6)];
            i9 += 4;
            bArr2[i11] = map[b10 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b11 = bArr[i8];
            bArr2[i9] = map[(b11 & 255) >> 2];
            bArr2[i9 + 1] = map[(b11 & 3) << 4];
            bArr2[i9 + 2] = 61;
            bArr2[i9 + 3] = 61;
        } else if (length2 == 2) {
            int i12 = i8 + 1;
            byte b12 = bArr[i8];
            byte b13 = bArr[i12];
            bArr2[i9] = map[(b12 & 255) >> 2];
            bArr2[i9 + 1] = map[((b12 & 3) << 4) | ((b13 & 255) >> 4)];
            bArr2[i9 + 2] = map[(b13 & 15) << 2];
            bArr2[i9 + 3] = 61;
        }
        return F.b(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bArr2 = f4361a;
        }
        return b(bArr, bArr2);
    }
}
