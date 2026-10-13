package p062g7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f23820a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f23820a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
