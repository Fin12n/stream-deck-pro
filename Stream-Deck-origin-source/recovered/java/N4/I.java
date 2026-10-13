package N4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I extends K implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Map f6311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f6312d;

    public I(Map map) {
        AbstractC1296t.c(map.isEmpty());
        this.f6311c = map;
    }

    public static /* bridge */ /* synthetic */ void o(I i8, Object obj) {
        Object objRemove;
        try {
            objRemove = i8.f6311c.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            i8.f6312d -= size;
        }
    }

    @Override // N4.InterfaceC1319v0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f6311c.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f6312d++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f6312d++;
        this.f6311c.put(obj, collectionG);
        return true;
    }

    @Override // N4.K
    public final Map e() {
        return new A(this, this.f6311c);
    }

    @Override // N4.K
    public final Set f() {
        return new C(this, this.f6311c);
    }

    public abstract Collection g();

    public abstract Collection h(Object obj, Collection collection);

    public final Collection j(Object obj) {
        Collection collectionG = (Collection) this.f6311c.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        return h(obj, collectionG);
    }

    public final List k(Object obj, List list, F f8) {
        return list instanceof RandomAccess ? new D(this, obj, list, f8) : new H(this, obj, list, f8);
    }

    public final void p() {
        Iterator it = this.f6311c.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f6311c.clear();
        this.f6312d = 0;
    }
}
