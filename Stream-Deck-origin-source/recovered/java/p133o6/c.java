package p133o6;

import C6.G;
import R6.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Set, f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f30957a = new b(0, 1, null);

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object element) {
            t.g(element, "element");
            if (this.f30957a.containsKey(element)) {
                return false;
            }
            this.f30957a.put(element, G.f1419a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection elements) {
            t.g(elements, "elements");
            Collection collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!add(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int c() {
            return this.f30957a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f30957a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.f30957a.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection elements) {
            t.g(elements, "elements");
            return elements.containsAll(this.f30957a.keySet());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f30957a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f30957a.keySet().iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return (obj == null || this.f30957a.remove(obj) == null) ? false : true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection elements) {
            t.g(elements, "elements");
            Collection collection = elements;
            if (collection.isEmpty()) {
                return true;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!remove(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection elements) {
            t.g(elements, "elements");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : this.f30957a.keySet()) {
                if (!elements.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return removeAll(linkedHashSet);
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

    public static final Set a() {
        return new a();
    }
}
