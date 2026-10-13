package R2;

import R6.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Set, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f9488a = new CopyOnWriteArraySet();

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f9488a.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        return this.f9488a.addAll(elements);
    }

    public int c() {
        return this.f9488a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f9488a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f9488a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        return this.f9488a.containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f9488a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Iterator it = this.f9488a.iterator();
        t.f(it, "iterator(...)");
        return it;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f9488a.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        t.g(elements, "elements");
        return this.f9488a.removeAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        t.g(elements, "elements");
        return this.f9488a.retainAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }
}
