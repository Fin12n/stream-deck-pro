package p056g1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static final void a(int[] iArr, C2358w c2358w) {
        if (!f(iArr)) {
            c2358w.g(h(iArr), i(iArr), d(iArr) - h(iArr));
            return;
        }
        if (g(iArr)) {
            c2358w.g(h(iArr), i(iArr), c(iArr));
        } else if (j(iArr)) {
            c2358w.g(h(iArr), i(iArr) + 1, c(iArr));
        } else {
            c2358w.g(h(iArr) + 1, i(iArr), c(iArr));
        }
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    public static final boolean f(int[] iArr) {
        return e(iArr) - i(iArr) != d(iArr) - h(iArr);
    }

    public static final boolean g(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    public static final boolean j(int[] iArr) {
        return e(iArr) - i(iArr) > d(iArr) - h(iArr);
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }
}
