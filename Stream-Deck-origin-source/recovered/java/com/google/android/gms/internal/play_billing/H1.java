package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H1 {
    public static /* bridge */ /* synthetic */ void a(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i8) throws A0 {
        if (e(b9) || (((b8 << 28) + (b9 + 112)) >> 30) != 0 || e(b10) || e(b11)) {
            throw A0.c();
        }
        int i9 = ((b8 & 7) << 18) | ((b9 & 63) << 12) | ((b10 & 63) << 6) | (b11 & 63);
        cArr[i8] = (char) ((i9 >>> 10) + 55232);
        cArr[i8 + 1] = (char) ((i9 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void b(byte b8, byte b9, byte b10, char[] cArr, int i8) throws A0 {
        if (!e(b9)) {
            if (b8 != -32) {
                if (b8 != -19) {
                    if (!e(b10)) {
                        cArr[i8] = (char) (((b8 & 15) << 12) | ((b9 & 63) << 6) | (b10 & 63));
                        return;
                    }
                } else if (b9 < -96) {
                    b8 = -19;
                    if (!e(b10)) {
                        cArr[i8] = (char) (((b8 & 15) << 12) | ((b9 & 63) << 6) | (b10 & 63));
                        return;
                    }
                }
            } else if (b9 >= -96) {
                b8 = -32;
                if (b8 != -19) {
                    if (!e(b10)) {
                        cArr[i8] = (char) (((b8 & 15) << 12) | ((b9 & 63) << 6) | (b10 & 63));
                        return;
                    }
                } else if (b9 < -96) {
                    b8 = -19;
                    if (!e(b10)) {
                        cArr[i8] = (char) (((b8 & 15) << 12) | ((b9 & 63) << 6) | (b10 & 63));
                        return;
                    }
                }
            }
        }
        throw A0.c();
    }

    public static /* bridge */ /* synthetic */ void c(byte b8, byte b9, char[] cArr, int i8) throws A0 {
        if (b8 < -62 || e(b9)) {
            throw A0.c();
        }
        cArr[i8] = (char) (((b8 & 31) << 6) | (b9 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean d(byte b8) {
        return b8 >= 0;
    }

    public static boolean e(byte b8) {
        return b8 > -65;
    }
}
