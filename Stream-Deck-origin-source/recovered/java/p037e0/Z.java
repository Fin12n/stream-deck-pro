package p037e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f20088a = Float.MAX_VALUE;

    public static final long a(float f8, float f9) {
        return Q.a((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final float b() {
        return f20088a;
    }
}
