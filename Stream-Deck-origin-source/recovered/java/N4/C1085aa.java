package N4;

/* JADX INFO: renamed from: N4.aa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1085aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1085aa f7051a;

    public static synchronized C1085aa a() {
        try {
            if (f7051a == null) {
                f7051a = new C1085aa();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7051a;
    }
}
