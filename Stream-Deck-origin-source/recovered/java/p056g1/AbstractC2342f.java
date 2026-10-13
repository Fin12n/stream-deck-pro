package p056g1;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2342f {
    public static final int b(int[] iArr, int i8) {
        return iArr[i8 + c(iArr)];
    }

    public static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i8, int i9) {
        iArr[i8 + c(iArr)] = i9;
    }

    public static int[] a(int[] iArr) {
        return iArr;
    }
}
