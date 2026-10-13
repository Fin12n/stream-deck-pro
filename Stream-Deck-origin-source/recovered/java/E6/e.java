package E6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2275a;

    public e(d backing) {
        t.g(backing, "backing");
        this.f2275a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        t.g(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // D6.AbstractC0927g
    public int c() {
        return this.f2275a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f2275a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        return this.f2275a.p(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2275a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f2275a.x();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        t.g(elements, "elements");
        this.f2275a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        t.g(elements, "elements");
        this.f2275a.n();
        return super.retainAll(elements);
    }

    @Override // E6.a
    public boolean t(Map.Entry element) {
        t.g(element, "element");
        return this.f2275a.r(element);
    }

    @Override // E6.a
    public boolean y(Map.Entry element) {
        t.g(element, "element");
        return this.f2275a.O(element);
    }
}
