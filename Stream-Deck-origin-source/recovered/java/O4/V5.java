package O4;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V5 extends Q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient P5 f8073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient N5 f8074d;

    public V5(P5 p8, N5 n8) {
        this.f8073c = p8;
        this.f8074d = n8;
    }

    @Override // O4.M4
    public final int c(Object[] objArr, int i8) {
        return this.f8074d.c(objArr, 0);
    }

    @Override // O4.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8073c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f8074d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8073c.size();
    }
}
