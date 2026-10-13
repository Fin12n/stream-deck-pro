package p035d7;

import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final g a(int i8, d dVar, k kVar) {
        if (i8 == -2) {
            return dVar == d.SUSPEND ? new e(g.f19938P.a(), kVar) : new r(1, dVar, kVar);
        }
        if (i8 == -1) {
            if (dVar == d.SUSPEND) {
                return new r(1, d.DROP_OLDEST, kVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i8 == 0) {
            return dVar == d.SUSPEND ? new e(0, kVar) : new r(1, dVar, kVar);
        }
        if (i8 != Integer.MAX_VALUE) {
            return dVar == d.SUSPEND ? new e(i8, kVar) : new r(i8, dVar, kVar);
        }
        return new e(Integer.MAX_VALUE, kVar);
    }

    public static /* synthetic */ g b(int i8, d dVar, k kVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            dVar = d.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            kVar = null;
        }
        return a(i8, dVar, kVar);
    }
}
