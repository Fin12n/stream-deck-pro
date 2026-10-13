package D0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1708c;

    public i(Object obj, int i8) {
        super(i8, 1);
        this.f1708c = obj;
    }

    @Override // D0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        f(d() + 1);
        return this.f1708c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        c();
        f(d() - 1);
        return this.f1708c;
    }
}
