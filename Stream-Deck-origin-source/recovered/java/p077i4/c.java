package p077i4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f24733b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24734a;

    public c(Object obj) {
        this.f24734a = obj;
    }

    public static b a(Object obj) {
        return new c(e.c(obj, "instance cannot be null"));
    }

    @Override // B6.a
    public Object get() {
        return this.f24734a;
    }
}
