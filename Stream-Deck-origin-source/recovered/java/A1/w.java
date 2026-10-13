package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final long a(float f8, long j8) {
        return i(j8, f8);
    }

    public static final void b(long j8) {
        if (g(j8)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j8, long j9) {
        if (g(j8) || g(j9)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (x.g(v.g(j8), v.g(j9))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) x.i(v.g(j8))) + " and " + ((Object) x.i(v.g(j9)))).toString());
    }

    public static final long d(double d8) {
        return i(4294967296L, (float) d8);
    }

    public static final long e(float f8) {
        return i(4294967296L, f8);
    }

    public static final long f(int i8) {
        return i(4294967296L, i8);
    }

    public static final boolean g(long j8) {
        return v.f(j8) == 0;
    }

    public static final long h(long j8, long j9, float f8) {
        c(j8, j9);
        return i(v.f(j8), C1.b.a(v.h(j8), v.h(j9), f8));
    }

    public static final long i(long j8, float f8) {
        return v.c(j8 | (((long) Float.floatToIntBits(f8)) & 4294967295L));
    }
}
