package p019c0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16026a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f16027b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f16028c = new Object[0];

    public static final int a(int[] array, int i8, int i9) {
        t.g(array, "array");
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = array[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final int b(long[] array, int i8, long j8) {
        t.g(array, "array");
        int i9 = i8 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            long j9 = array[i11];
            if (j9 < j8) {
                i10 = i11 + 1;
            } else {
                if (j9 <= j8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final boolean c(Object obj, Object obj2) {
        return t.c(obj, obj2);
    }

    public static final int d(int i8) {
        for (int i9 = 4; i9 < 32; i9++) {
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                return i10;
            }
        }
        return i8;
    }

    public static final int e(int i8) {
        return d(i8 * 4) / 4;
    }

    public static final int f(int i8) {
        return d(i8 * 8) / 8;
    }
}
