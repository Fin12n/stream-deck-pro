package p048f2;

/* JADX INFO: renamed from: f2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2304g extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21580c;

    public C2304g(Object obj, int i8, int i9) {
        super(i9, null);
        this.f21579b = obj;
        this.f21580c = i8;
    }

    public final void b() {
        Object obj = this.f21579b;
        if ((obj != null ? obj.hashCode() : 0) != this.f21580c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f21579b;
    }
}
