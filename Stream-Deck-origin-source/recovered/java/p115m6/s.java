package p115m6;

import D6.C0938s;
import Q6.k;
import R6.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class s implements Set, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f30087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f30088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f30089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30090d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f30091a;

        public a() {
            this.f30091a = s.this.f30087a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30091a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return s.this.f30088b.invoke(this.f30091a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f30091a.remove();
        }
    }

    public s(Set<Object> delegate, k convertTo, k convert) {
        t.g(delegate, "delegate");
        t.g(convertTo, "convertTo");
        t.g(convert, "convert");
        this.f30087a = delegate;
        this.f30088b = convertTo;
        this.f30089c = convert;
        this.f30090d = delegate.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f30087a.add(this.f30089c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        return this.f30087a.addAll(o(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f30087a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f30087a.contains(this.f30089c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        return this.f30087a.containsAll(o(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<?> collectionS = s(this.f30087a);
            if (((Set) obj).containsAll(collectionS) && collectionS.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f30087a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f30087a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public Collection o(Collection collection) {
        t.g(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(C0938s.y(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f30089c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f30087a.remove(this.f30089c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        t.g(elements, "elements");
        return this.f30087a.removeAll(o(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        t.g(elements, "elements");
        return this.f30087a.retainAll(o(elements));
    }

    public Collection s(Collection collection) {
        t.g(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(C0938s.y(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f30088b.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return t();
    }

    public int t() {
        return this.f30090d;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return s(this.f30087a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }
}
