package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static F5 f7879a;

    public static synchronized C1539x5 a(AbstractC1504s5 abstractC1504s5) {
        try {
            if (f7879a == null) {
                f7879a = new F5(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1539x5) f7879a.b(abstractC1504s5);
    }

    public static synchronized C1539x5 b(String str) {
        return a(AbstractC1504s5.d("vision-common").c());
    }
}
