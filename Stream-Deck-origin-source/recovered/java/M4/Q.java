package M4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static P f5549a;

    public static synchronized I a(E e8) {
        try {
            if (f5549a == null) {
                f5549a = new P(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (I) f5549a.b(e8);
    }

    public static synchronized I b(String str) {
        return a(E.d("common").c());
    }
}
