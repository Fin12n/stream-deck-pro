package N4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f6269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f6270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f6271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I f6272e;

    public F(I i8, Object obj, Collection collection, F f8) {
        this.f6272e = i8;
        this.f6268a = obj;
        this.f6269b = collection;
        this.f6270c = f8;
        this.f6271d = f8 == null ? null : f8.f6269b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f6269b.isEmpty();
        boolean zAdd = this.f6269b.add(obj);
        if (zAdd) {
            this.f6272e.f6312d++;
            if (zIsEmpty) {
                c();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f6269b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f6269b.size();
        this.f6272e.f6312d += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }

    public final void c() {
        F f8 = this.f6270c;
        if (f8 != null) {
            f8.c();
            return;
        }
        I i8 = this.f6272e;
        i8.f6311c.put(this.f6268a, this.f6269b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f6269b.clear();
        this.f6272e.f6312d -= size;
        m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f6269b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f6269b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f6269b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f6269b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new E(this);
    }

    public final void m() {
        F f8 = this.f6270c;
        if (f8 != null) {
            f8.m();
        } else if (this.f6269b.isEmpty()) {
            I i8 = this.f6272e;
            i8.f6311c.remove(this.f6268a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f6269b.remove(obj);
        if (zRemove) {
            this.f6272e.f6312d--;
            m();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f6269b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f6269b.size();
            this.f6272e.f6312d += size2 - size;
            m();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f6269b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f6269b.size();
            this.f6272e.f6312d += size2 - size;
            m();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f6269b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f6269b.toString();
    }

    public final void zzb() {
        F f8 = this.f6270c;
        if (f8 != null) {
            f8.zzb();
            F f9 = this.f6270c;
            if (f9.f6269b != this.f6271d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f6269b.isEmpty()) {
            I i8 = this.f6272e;
            Collection collection = (Collection) i8.f6311c.get(this.f6268a);
            if (collection != null) {
                this.f6269b = collection;
            }
        }
    }
}
