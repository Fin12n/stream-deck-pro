package p219z4;

/* JADX INFO: renamed from: z4.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3208q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3208q f39244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f39245c = new r(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f39246a;

    public static synchronized C3208q b() {
        try {
            if (f39244b == null) {
                f39244b = new C3208q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39244b;
    }

    public r a() {
        return this.f39246a;
    }

    public final synchronized void c(r rVar) {
        try {
            if (rVar == null) {
                this.f39246a = f39245c;
                return;
            }
            r rVar2 = this.f39246a;
            if (rVar2 == null || rVar2.e() < rVar.e()) {
                this.f39246a = rVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
