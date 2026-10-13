package E0;

import D6.AbstractC0927g;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0927g implements Set, R6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2011a;

    public j(f fVar) {
        this.f2011a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // D6.AbstractC0927g
    public int c() {
        return this.f2011a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f2011a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f2011a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new k(this.f2011a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f2011a.containsKey(obj)) {
            return false;
        }
        this.f2011a.remove(obj);
        return true;
    }
}
