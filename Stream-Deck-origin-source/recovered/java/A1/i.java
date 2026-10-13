package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final long a(float f8, float f9) {
        return j.c((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final long b(float f8, float f9) {
        return k.d((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final float c(float f8, float f9, float f10) {
        return h.m(C1.b.a(f8, f9, f10));
    }
}
