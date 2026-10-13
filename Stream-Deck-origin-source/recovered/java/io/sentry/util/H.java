package io.sentry.util;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f27722a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f27723b;

    static {
        long[] jArr = new long[128];
        f27723b = jArr;
        Arrays.fill(jArr, -1L);
        jArr[48] = 0;
        jArr[49] = 1;
        jArr[50] = 2;
        jArr[51] = 3;
        jArr[52] = 4;
        jArr[53] = 5;
        jArr[54] = 6;
        jArr[55] = 7;
        jArr[56] = 8;
        jArr[57] = 9;
        jArr[97] = 10;
        jArr[98] = 11;
        jArr[99] = 12;
        jArr[100] = 13;
        jArr[101] = 14;
        jArr[102] = 15;
        jArr[65] = 10;
        jArr[66] = 11;
        jArr[67] = 12;
        jArr[68] = 13;
        jArr[69] = 14;
        jArr[70] = 15;
    }

    public static void a(char[] cArr, long j8) {
        char[] cArr2 = f27722a;
        cArr[0] = cArr2[(int) (((-1152921504606846976L) & j8) >>> 60)];
        cArr[1] = cArr2[(int) ((1080863910568919040L & j8) >>> 56)];
        cArr[2] = cArr2[(int) ((67553994410557440L & j8) >>> 52)];
        cArr[3] = cArr2[(int) ((4222124650659840L & j8) >>> 48)];
        cArr[4] = cArr2[(int) ((263882790666240L & j8) >>> 44)];
        cArr[5] = cArr2[(int) ((16492674416640L & j8) >>> 40)];
        cArr[6] = cArr2[(int) ((1030792151040L & j8) >>> 36)];
        cArr[7] = cArr2[(int) ((64424509440L & j8) >>> 32)];
        cArr[8] = cArr2[(int) ((4026531840L & j8) >>> 28)];
        cArr[9] = cArr2[(int) ((251658240 & j8) >>> 24)];
        cArr[10] = cArr2[(int) ((15728640 & j8) >>> 20)];
        cArr[11] = cArr2[(int) ((983040 & j8) >>> 16)];
        cArr[12] = cArr2[(int) ((61440 & j8) >>> 12)];
        cArr[13] = cArr2[(int) ((3840 & j8) >>> 8)];
        cArr[14] = cArr2[(int) ((240 & j8) >>> 4)];
        cArr[15] = cArr2[(int) (j8 & 15)];
    }

    public static String b(long j8, long j9) {
        char[] cArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & j9) >>> 60)], cArr[(int) ((1080863910568919040L & j9) >>> 56)], cArr[(int) ((67553994410557440L & j9) >>> 52)], cArr[(int) ((4222124650659840L & j9) >>> 48)], cArr[(int) ((263882790666240L & j9) >>> 44)], cArr[(int) ((16492674416640L & j9) >>> 40)], cArr[(int) ((1030792151040L & j9) >>> 36)], cArr[(int) ((64424509440L & j9) >>> 32)], cArr[(int) ((4026531840L & j9) >>> 28)], cArr[(int) ((251658240 & j9) >>> 24)], cArr[(int) ((15728640 & j9) >>> 20)], cArr[(int) ((983040 & j9) >>> 16)], cArr[(int) ((61440 & j9) >>> 12)], cArr[(int) ((3840 & j9) >>> 8)], cArr[(int) ((240 & j9) >>> 4)], cArr[(int) (j9 & 15)]};
        a(cArr, j8);
        char[] cArr2 = f27722a;
        return new String(cArr);
    }

    public static String c(UUID uuid) {
        return b(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    public static String d(long j8) {
        char[] cArr = new char[16];
        a(cArr, j8);
        return new String(cArr);
    }
}
