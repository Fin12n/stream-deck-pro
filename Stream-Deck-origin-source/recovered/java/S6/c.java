package S6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    public static int a(int i8) {
        return Integer.signum(i8);
    }

    public static int b(long j8) {
        return Long.signum(j8);
    }

    public static int c(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d8 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d8 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d8);
    }

    public static int d(float f8) {
        if (Float.isNaN(f8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f8);
    }

    public static long e(double d8) {
        if (Double.isNaN(d8)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d8);
    }

    public static long f(float f8) {
        return e(f8);
    }
}
