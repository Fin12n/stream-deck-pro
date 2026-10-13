package Q0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0254a f9076a = new C0254a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9077b = b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: Q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0254a {
        public /* synthetic */ C0254a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final long a() {
            return a.f9077b;
        }

        public C0254a() {
        }
    }

    public static final boolean c(long j8, long j9) {
        return j8 == j9;
    }

    public static final float d(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float e(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static int f(long j8) {
        return Long.hashCode(j8);
    }

    public static String g(long j8) {
        if (d(j8) == e(j8)) {
            return "CornerRadius.circular(" + c.a(d(j8), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(d(j8), 1) + ", " + c.a(e(j8), 1) + ')';
    }

    public static long b(long j8) {
        return j8;
    }
}
