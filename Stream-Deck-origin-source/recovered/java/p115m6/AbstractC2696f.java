package p115m6;

import Z6.v;
import Z6.w;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: m6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2696f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f30074a;

    static {
        int[] iArr = new int[256];
        for (int i8 = 0; i8 < 256; i8++) {
            iArr[i8] = w.X("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i8, 0, false, 6, null);
        }
        f30074a = iArr;
    }

    public static final String a(byte[] bArr) {
        int i8;
        int i9;
        t.g(bArr, "<this>");
        int i10 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 3;
            if (i13 > bArr.length) {
                break;
            }
            int i14 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            int i15 = 3;
            while (-1 < i15) {
                cArr[i12] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i14 >> (i15 * 6)) & 63);
                i15--;
                i12++;
            }
            i11 = i13;
        }
        int length = bArr.length - i11;
        if (length == 0) {
            return v.r(cArr, 0, i12);
        }
        if (length == 1) {
            i8 = (bArr[i11] & 255) << 16;
        } else {
            i8 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
        }
        int i16 = ((3 - length) * 8) / 6;
        if (i16 <= 3) {
            while (true) {
                i9 = i12 + 1;
                cArr[i12] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i8 >> (i10 * 6)) & 63);
                if (i10 == i16) {
                    break;
                }
                i10--;
                i12 = i9;
            }
            i12 = i9;
        }
        int i17 = 0;
        while (i17 < i16) {
            cArr[i12] = '=';
            i17++;
            i12++;
        }
        return v.r(cArr, 0, i12);
    }
}
