package M4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: M4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1060n extends AbstractC1056j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1055i f5574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f5575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f5576e;

    public C1060n(AbstractC1055i abstractC1055i, Object[] objArr, int i8, int i9) {
        this.f5574c = abstractC1055i;
        this.f5575d = objArr;
        this.f5576e = i9;
    }

    @Override // M4.AbstractC1056j
    public final AbstractC1052f A() {
        return new C1059m(this);
    }

    @Override // M4.AbstractC1049c
    public final int c(Object[] objArr, int i8) {
        return z().c(objArr, 0);
    }

    @Override // M4.AbstractC1049c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5574c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return z().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5576e;
    }
}
