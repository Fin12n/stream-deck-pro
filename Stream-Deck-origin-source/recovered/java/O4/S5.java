package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S5 extends N5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N5 f8039e = new S5(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f8040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f8041d;

    public S5(Object[] objArr, int i8) {
        this.f8040c = objArr;
        this.f8041d = i8;
    }

    @Override // O4.N5, O4.M4
    public final int c(Object[] objArr, int i8) {
        System.arraycopy(this.f8040c, 0, objArr, 0, this.f8041d);
        return this.f8041d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        G1.a(i8, this.f8041d, "index");
        Object obj = this.f8040c[i8];
        obj.getClass();
        return obj;
    }

    @Override // O4.M4
    public final int o() {
        return this.f8041d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8041d;
    }

    @Override // O4.M4
    public final int t() {
        return 0;
    }

    @Override // O4.M4
    public final Object[] y() {
        return this.f8040c;
    }
}
