package M4;

import java.util.Objects;

/* JADX INFO: renamed from: M4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1062p extends AbstractC1052f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f5579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f5580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f5581e;

    public C1062p(Object[] objArr, int i8, int i9) {
        this.f5579c = objArr;
        this.f5580d = i8;
        this.f5581e = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        U.a(i8, this.f5581e, "index");
        Object obj = this.f5579c[i8 + i8 + this.f5580d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5581e;
    }
}
