package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static X9 f7026a;

    public static synchronized N9 a(F9 f9) {
        try {
            if (f7026a == null) {
                f7026a = new X9(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (N9) f7026a.b(f9);
    }

    public static synchronized N9 b(String str) {
        return a(F9.d(str).c());
    }
}
