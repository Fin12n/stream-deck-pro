package N4;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B0 extends AbstractC1219m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1207l0 f6225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractC1183j0 f6226d;

    public B0(AbstractC1207l0 abstractC1207l0, AbstractC1183j0 abstractC1183j0) {
        this.f6225c = abstractC1207l0;
        this.f6226d = abstractC1183j0;
    }

    @Override // N4.AbstractC1123e0
    public final int c(Object[] objArr, int i8) {
        return this.f6226d.c(objArr, i8);
    }

    @Override // N4.AbstractC1123e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f6225c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f6226d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
