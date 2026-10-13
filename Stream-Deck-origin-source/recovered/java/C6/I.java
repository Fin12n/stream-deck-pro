package C6;

import Z6.C1694a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public static final int a(int i8, int i9) {
        return kotlin.jvm.internal.t.h(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j8, long j9) {
        return kotlin.jvm.internal.t.i(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
    }

    public static final double c(long j8) {
        return ((j8 >>> 11) * ((double) 2048)) + (j8 & 2047);
    }

    public static final String d(long j8, int i8) {
        if (j8 >= 0) {
            String string = Long.toString(j8, C1694a.a(i8));
            kotlin.jvm.internal.t.f(string, "toString(...)");
            return string;
        }
        long j9 = i8;
        long j10 = ((j8 >>> 1) / j9) << 1;
        long j11 = j8 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j10, C1694a.a(i8));
        kotlin.jvm.internal.t.f(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j11, C1694a.a(i8));
        kotlin.jvm.internal.t.f(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
