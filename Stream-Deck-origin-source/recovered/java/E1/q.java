package E1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2159a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f2155a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2159a = iArr;
        }
    }

    public static final boolean a(p pVar, boolean z8) {
        int i8 = a.f2159a[pVar.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            return true;
        }
        if (i8 == 3) {
            return z8;
        }
        throw new C6.m();
    }
}
