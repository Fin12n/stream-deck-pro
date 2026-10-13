package N4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A0 extends AbstractC1219m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1207l0 f6205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f6206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f6207e = 1;

    public A0(AbstractC1207l0 abstractC1207l0, Object[] objArr, int i8, int i9) {
        this.f6205c = abstractC1207l0;
        this.f6206d = objArr;
    }

    @Override // N4.AbstractC1219m0
    public final AbstractC1183j0 A() {
        return new C1363z0(this);
    }

    @Override // N4.AbstractC1123e0
    public final int c(Object[] objArr, int i8) {
        return z().c(objArr, i8);
    }

    @Override // N4.AbstractC1123e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6205c.get(key))) {
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
        return this.f6207e;
    }
}
