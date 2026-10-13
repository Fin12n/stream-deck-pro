package p151r0;

import A1.d;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0702a f32181a = new C0702a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f32182b = b(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0702a {
        public /* synthetic */ C0702a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return a.f32182b;
        }

        public C0702a() {
        }
    }

    public static long b(float f8, float f9) {
        return c((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    public static long d(d dVar) {
        return b(dVar.getDensity(), dVar.x0());
    }

    public static final boolean e(long j8, long j9) {
        return j8 == j9;
    }

    public static long c(long j8) {
        return j8;
    }
}
