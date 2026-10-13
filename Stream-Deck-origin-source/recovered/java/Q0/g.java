package Q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final long a(float f8, float f9) {
        return f.g((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final boolean b(long j8) {
        float fO = f.o(j8);
        if (Float.isInfinite(fO) || Float.isNaN(fO)) {
            return false;
        }
        float fP = f.p(j8);
        return (Float.isInfinite(fP) || Float.isNaN(fP)) ? false : true;
    }

    public static final boolean c(long j8) {
        return j8 != f.f9082b.b();
    }

    public static final long d(long j8, long j9, float f8) {
        return a(C1.b.a(f.o(j8), f.o(j9), f8), C1.b.a(f.p(j8), f.p(j9), f8));
    }
}
