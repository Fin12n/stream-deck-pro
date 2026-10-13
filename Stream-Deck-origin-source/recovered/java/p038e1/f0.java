package p038e1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20477a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20478b = g0.a(Float.NaN, Float.NaN);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public static final float b(long j8) {
        if (j8 == f20478b) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float c(long j8) {
        if (j8 == f20478b) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static long a(long j8) {
        return j8;
    }
}
