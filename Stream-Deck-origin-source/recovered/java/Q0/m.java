package Q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final long a(float f8, float f9) {
        return l.d((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static final long b(long j8) {
        return g.a(l.i(j8) / 2.0f, l.g(j8) / 2.0f);
    }

    public static final h c(long j8) {
        return i.b(f.f9082b.c(), j8);
    }
}
