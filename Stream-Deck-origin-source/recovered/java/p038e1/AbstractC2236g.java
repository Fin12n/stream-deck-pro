package p038e1;

import Q0.l;

/* JADX INFO: renamed from: e1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2236g {
    public static final float e(long j8, long j9) {
        return l.g(j9) / l.g(j8);
    }

    public static final float f(long j8, long j9) {
        return Math.max(h(j8, j9), e(j8, j9));
    }

    public static final float g(long j8, long j9) {
        return Math.min(h(j8, j9), e(j8, j9));
    }

    public static final float h(long j8, long j9) {
        return l.i(j9) / l.i(j8);
    }
}
