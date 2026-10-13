package O4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U5 extends Q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient P5 f8058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f8059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f8060e;

    public U5(P5 p8, Object[] objArr, int i8, int i9) {
        this.f8058c = p8;
        this.f8059d = objArr;
        this.f8060e = i9;
    }

    @Override // O4.Q5
    public final N5 A() {
        return new T5(this);
    }

    @Override // O4.M4
    public final int c(Object[] objArr, int i8) {
        return z().c(objArr, 0);
    }

    @Override // O4.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8058c.get(key))) {
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
        return this.f8060e;
    }
}
