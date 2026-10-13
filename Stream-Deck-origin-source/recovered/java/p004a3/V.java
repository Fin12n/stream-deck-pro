package p004a3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum V {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13214a;

        static {
            int[] iArr = new int[V.values().length];
            f13214a = iArr;
            try {
                iArr[V.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13214a[V.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13214a[V.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean b(int i8, boolean z8, int i9) {
        int i10 = a.f13214a[ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return (z8 && i8 < 28) || i9 > 4 || i8 <= 25;
        }
        return true;
    }
}
