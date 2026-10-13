package O;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeJpegImageQuirk f7532a = (LargeJpegImageQuirk) N.b.b(LargeJpegImageQuirk.class);

    public static int a(byte[] bArr) {
        byte b8;
        int i8 = 2;
        while (i8 + 4 <= bArr.length && (b8 = bArr[i8]) == -1) {
            int i9 = i8 + 2;
            int i10 = ((bArr[i9] & 255) << 8) | (bArr[i8 + 3] & 255);
            if (b8 == -1 && bArr[i8 + 1] == -38) {
                while (true) {
                    int i11 = i9 + 2;
                    if (i11 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i9] == -1 && bArr[i9 + 1] == -39) {
                        return i11;
                    }
                    i9++;
                }
            } else {
                i8 += i10 + 2;
            }
        }
        return -1;
    }

    public int b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f7532a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.h(bArr)) {
            return bArr.length;
        }
        int iA = a(bArr);
        return iA != -1 ? iA : bArr.length;
    }
}
