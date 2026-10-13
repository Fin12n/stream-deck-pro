package O4;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I5 {
    public static void a(C1539x5 c1539x5, int i8, int i9, long j8, int i10, int i11, int i12, int i13) {
        c1539x5.c(b(i8, i9, j8, i10, i11, i12, i13), F3.INPUT_IMAGE_CONSTRUCTION);
    }

    public static H5 b(int i8, int i9, long j8, int i10, int i11, int i12, int i13) {
        return new H5(i8, i9, i12, i10, i11, SystemClock.elapsedRealtime() - j8, i13);
    }
}
