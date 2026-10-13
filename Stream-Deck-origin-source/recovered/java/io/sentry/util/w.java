package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f27738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f27739b;

    static {
        try {
            f27738a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f27738a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f27739b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f27739b = false;
            }
        } catch (Throwable unused2) {
            f27739b = false;
        }
    }

    public static boolean a() {
        return f27738a;
    }

    public static boolean b() {
        return f27739b;
    }

    public static boolean c() {
        return !f27738a;
    }
}
