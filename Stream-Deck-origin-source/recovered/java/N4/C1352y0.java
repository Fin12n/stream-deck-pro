package N4;

import java.util.Objects;

/* JADX INFO: renamed from: N4.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1352y0 extends AbstractC1183j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1183j0 f7383e = new C1352y0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f7384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7385d;

    public C1352y0(Object[] objArr, int i8) {
        this.f7384c = objArr;
        this.f7385d = i8;
    }

    @Override // N4.AbstractC1183j0, N4.AbstractC1123e0
    public final int c(Object[] objArr, int i8) {
        System.arraycopy(this.f7384c, 0, objArr, i8, this.f7385d);
        return i8 + this.f7385d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1296t.a(i8, this.f7385d, "index");
        Object obj = this.f7384c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // N4.AbstractC1123e0
    public final int o() {
        return this.f7385d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7385d;
    }

    @Override // N4.AbstractC1123e0
    public final int t() {
        return 0;
    }

    @Override // N4.AbstractC1123e0
    public final Object[] y() {
        return this.f7384c;
    }
}
