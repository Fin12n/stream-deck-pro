package M4;

import java.util.Iterator;

/* JADX INFO: renamed from: M4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1061o extends AbstractC1056j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1055i f5577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractC1052f f5578d;

    public C1061o(AbstractC1055i abstractC1055i, AbstractC1052f abstractC1052f) {
        this.f5577c = abstractC1055i;
        this.f5578d = abstractC1052f;
    }

    @Override // M4.AbstractC1049c
    public final int c(Object[] objArr, int i8) {
        return this.f5578d.c(objArr, 0);
    }

    @Override // M4.AbstractC1049c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5577c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5578d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5577c.size();
    }
}
