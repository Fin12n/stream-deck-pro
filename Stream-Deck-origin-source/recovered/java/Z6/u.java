package Z6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class u extends t {
    public static final Void l(String input) {
        kotlin.jvm.internal.t.g(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer m(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return n(str, 10);
    }

    public static final Integer n(String str, int i8) {
        boolean z8;
        int i9;
        int i10;
        kotlin.jvm.internal.t.g(str, "<this>");
        C1694a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (kotlin.jvm.internal.t.h(cCharAt, 48) < 0) {
            i9 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z8 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z8 = true;
            }
        } else {
            z8 = false;
            i9 = 0;
        }
        int i13 = -59652323;
        while (i9 < length) {
            int iB = C1694a.b(str.charAt(i9), i8);
            if (iB < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / i8))) || (i10 = i11 * i8) < i12 + iB) {
                return null;
            }
            i11 = i10 - iB;
            i9++;
        }
        return z8 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long o(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return p(str, 10);
    }

    public static final Long p(String str, int i8) {
        boolean z8;
        kotlin.jvm.internal.t.g(str, "<this>");
        C1694a.a(i8);
        int length = str.length();
        Long l8 = null;
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        long j8 = -9223372036854775807L;
        if (kotlin.jvm.internal.t.h(cCharAt, 48) < 0) {
            z8 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z8 = false;
                i9 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j8 = Long.MIN_VALUE;
                i9 = 1;
            }
        } else {
            z8 = false;
        }
        long j9 = 0;
        long j10 = -256204778801521550L;
        while (i9 < length) {
            int iB = C1694a.b(str.charAt(i9), i8);
            if (iB < 0) {
                return l8;
            }
            if (j9 < j10) {
                if (j10 != -256204778801521550L) {
                    return l8;
                }
                j10 = j8 / ((long) i8);
                if (j9 < j10) {
                    return l8;
                }
            }
            Long l9 = l8;
            int i10 = i9;
            long j11 = j9 * ((long) i8);
            long j12 = iB;
            if (j11 < j8 + j12) {
                return l9;
            }
            j9 = j11 - j12;
            i9 = i10 + 1;
            l8 = l9;
        }
        return z8 ? Long.valueOf(j9) : Long.valueOf(-j9);
    }
}
