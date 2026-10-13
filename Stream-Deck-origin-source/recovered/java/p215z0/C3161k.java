package p215z0;

/* JADX INFO: renamed from: z0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3161k extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38802a;

    public C3161k(String str) {
        this.f38802a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f38802a;
    }
}
