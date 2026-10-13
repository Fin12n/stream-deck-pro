package N4;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class H extends F implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I f6288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i8, Object obj, List list, F f8) {
        super(i8, obj, list, f8);
        this.f6288f = i8;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        zzb();
        boolean zIsEmpty = this.f6269b.isEmpty();
        ((List) this.f6269b).add(i8, obj);
        this.f6288f.f6312d++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f6269b).addAll(i8, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f6269b.size();
        this.f6288f.f6312d += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        zzb();
        return ((List) this.f6269b).get(i8);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f6269b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f6269b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new G(this);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        zzb();
        Object objRemove = ((List) this.f6269b).remove(i8);
        this.f6288f.f6312d--;
        m();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        zzb();
        return ((List) this.f6269b).set(i8, obj);
    }

    @Override // java.util.List
    public final List subList(int i8, int i9) {
        zzb();
        List listSubList = ((List) this.f6269b).subList(i8, i9);
        F f8 = this.f6270c;
        if (f8 == null) {
            f8 = this;
        }
        return this.f6288f.k(this.f6268a, listSubList, f8);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        zzb();
        return new G(this, i8);
    }
}
