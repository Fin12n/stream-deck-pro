package P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public enum m implements l {
    Active,
    ActiveParent,
    f8855c,
    Inactive;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8858a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.f8855c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8858a = iArr;
        }
    }

    @Override // P0.l
    public boolean a() {
        int i8 = a.f8858a[ordinal()];
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        if (i8 == 3 || i8 == 4) {
            return false;
        }
        throw new C6.m();
    }

    public boolean c() {
        int i8 = a.f8858a[ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            return true;
        }
        if (i8 == 4) {
            return false;
        }
        throw new C6.m();
    }
}
