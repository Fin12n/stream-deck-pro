package N4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends AbstractC1183j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f6235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f6236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f6237e = 1;

    public C0(Object[] objArr, int i8, int i9) {
        this.f6235c = objArr;
        this.f6236d = i8;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1296t.a(i8, this.f6237e, "index");
        Object obj = this.f6235c[i8 + i8 + this.f6236d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6237e;
    }
}
