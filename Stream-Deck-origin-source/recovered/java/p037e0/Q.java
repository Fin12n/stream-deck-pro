package p037e0;

import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static final float b(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float c(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static long a(long j8) {
        return j8;
    }
}
