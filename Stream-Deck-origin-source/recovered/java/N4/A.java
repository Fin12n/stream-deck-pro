package N4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC1297t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Map f6203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f6204d;

    public A(I i8, Map map) {
        this.f6204d = i8;
        this.f6203c = map;
    }

    @Override // N4.AbstractC1297t0
    public final Set a() {
        return new C1351y(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) AbstractC1308u0.a(this.f6203c, obj);
        if (collection == null) {
            return null;
        }
        return this.f6204d.h(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        I i8 = this.f6204d;
        if (this.f6203c == i8.f6311c) {
            i8.p();
        } else {
            AbstractC1231n0.a(new C1362z(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC1308u0.b(this.f6203c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f6203c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f6203c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f6204d.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f6203c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f6204d.g();
        collectionG.addAll(collection);
        this.f6204d.f6312d -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6203c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f6203c.toString();
    }
}
