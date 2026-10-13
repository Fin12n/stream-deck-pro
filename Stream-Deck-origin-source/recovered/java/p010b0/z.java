package p010b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f15651a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f15652b = new u(0);

    public static final int a(int i8) {
        if (i8 == 7) {
            return 6;
        }
        return i8 - (i8 / 8);
    }

    public static final u b() {
        return new u(0, 1, null);
    }

    public static final int c(int i8) {
        if (i8 == 0) {
            return 6;
        }
        return (i8 * 2) + 1;
    }

    public static final int d(int i8) {
        if (i8 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i8);
        }
        return 0;
    }

    public static final int e(int i8) {
        if (i8 == 7) {
            return 8;
        }
        return i8 + ((i8 - 1) / 7);
    }
}
