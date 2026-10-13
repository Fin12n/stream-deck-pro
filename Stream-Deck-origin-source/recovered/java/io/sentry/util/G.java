package io.sentry.util;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G {
    public static long a() {
        byte[] bArr = new byte[8];
        z.a().c(bArr);
        byte b8 = (byte) (bArr[6] & 15);
        bArr[6] = b8;
        bArr[6] = (byte) (b8 | 64);
        long j8 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j8 = (j8 << 8) | ((long) (bArr[i8] & 255));
        }
        return j8;
    }

    public static UUID b() {
        byte[] bArr = new byte[16];
        z.a().c(bArr);
        byte b8 = (byte) (bArr[6] & 15);
        bArr[6] = b8;
        bArr[6] = (byte) (b8 | 64);
        byte b9 = (byte) (bArr[8] & 63);
        bArr[8] = b9;
        bArr[8] = (byte) (b9 | (-128));
        long j8 = 0;
        long j9 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            j9 = (j9 << 8) | ((long) (bArr[i8] & 255));
        }
        for (int i9 = 8; i9 < 16; i9++) {
            j8 = (j8 << 8) | ((long) (bArr[i9] & 255));
        }
        return new UUID(j9, j8);
    }
}
