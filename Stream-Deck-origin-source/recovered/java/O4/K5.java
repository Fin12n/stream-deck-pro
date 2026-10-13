package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static K5 f7948a;

    public static synchronized K5 a() {
        try {
            if (f7948a == null) {
                f7948a = new K5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7948a;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }
}
