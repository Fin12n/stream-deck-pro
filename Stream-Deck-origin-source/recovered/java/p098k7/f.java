package p098k7;

import p062g7.G;
import p062g7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f28767a = J.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f28768b = new G("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f28769c = new G("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f28770d = new G("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f28771e = new G("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f28772f = J.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final d a(int i8, int i9) {
        return new e(i8, i9);
    }

    public static /* synthetic */ d b(int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return a(i8, i9);
    }

    public static final g j(long j8, g gVar) {
        return new g(j8, gVar, 0);
    }
}
