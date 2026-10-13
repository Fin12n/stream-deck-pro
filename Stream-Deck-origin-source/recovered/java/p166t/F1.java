package p166t;

import A.AbstractC0890p0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F1 {
    public static int a(int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (i8 != 2) {
                AbstractC0890p0.l("LensFacingUtil", "The given lens facing integer: " + i8 + " can not be recognized.");
                return -1;
            }
        }
        return i9;
    }
}
