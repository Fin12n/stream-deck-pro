package p056g1;

import kotlin.jvm.internal.C2635m;

/* JADX INFO: renamed from: g1.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2352p {
    public static final int a(long j8, long j9) {
        boolean zD = d(j8);
        if (zD != d(j9)) {
            return zD ? -1 : 1;
        }
        return (int) Math.signum(c(j8) - c(j9));
    }

    public static final float c(long j8) {
        C2635m c2635m = C2635m.f28814a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final boolean d(long j8) {
        return ((int) (j8 & 4294967295L)) != 0;
    }

    public static long b(long j8) {
        return j8;
    }
}
