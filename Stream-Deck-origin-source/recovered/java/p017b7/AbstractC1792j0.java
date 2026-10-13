package p017b7;

import p062g7.G;

/* JADX INFO: renamed from: b7.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1792j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f15963a = new G("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f15964b = new G("CLOSED_EMPTY");

    public static final long c(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        if (j8 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j8 * 1000000;
    }
}
