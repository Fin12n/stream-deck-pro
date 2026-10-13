package Q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(float f8, float f9) {
        return a.b((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static /* synthetic */ long b(float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = f8;
        }
        return a(f8, f9);
    }
}
