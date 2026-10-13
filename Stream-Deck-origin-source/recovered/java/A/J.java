package A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f87c = new J(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f88d = new J(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J f89e = new J(2, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J f90f = new J(3, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final J f91g = new J(4, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f92h = new J(5, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J f93i = new J(6, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f94j = new J(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96b;

    public J(int i8, int i9) {
        this.f95a = i8;
        this.f96b = i9;
    }

    public static String c(int i8) {
        switch (i8) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f96b;
    }

    public int b() {
        return this.f95a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j8 = (J) obj;
            if (this.f95a == j8.b() && this.f96b == j8.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f95a ^ 1000003) * 1000003) ^ this.f96b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f95a) + ", bitDepth=" + this.f96b + "}";
    }
}
