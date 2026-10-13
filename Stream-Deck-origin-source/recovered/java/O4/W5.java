package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W5 extends N5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f8093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f8094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f8095e;

    public W5(Object[] objArr, int i8, int i9) {
        this.f8093c = objArr;
        this.f8094d = i8;
        this.f8095e = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        G1.a(i8, this.f8095e, "index");
        Object obj = this.f8093c[i8 + i8 + this.f8094d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8095e;
    }
}
