package p010b0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p019c0.a;

/* JADX INFO: renamed from: b0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1748a extends C implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0391a f15577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f15578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f15579f;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class C0391a extends AbstractSet {
        public C0391a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1748a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1748a.this.size();
        }
    }

    /* JADX INFO: renamed from: b0.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b extends AbstractC1752e {
        public b() {
            super(C1748a.this.size());
        }

        @Override // p010b0.AbstractC1752e
        public Object b(int i8) {
            return C1748a.this.f(i8);
        }

        @Override // p010b0.AbstractC1752e
        public void c(int i8) {
            C1748a.this.h(i8);
        }
    }

    /* JADX INFO: renamed from: b0.a$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15584b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15585c;

        public d() {
            this.f15583a = C1748a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f15584b++;
            this.f15585c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f15585c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a.c(entry.getKey(), C1748a.this.f(this.f15584b)) && a.c(entry.getValue(), C1748a.this.j(this.f15584b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f15585c) {
                return C1748a.this.f(this.f15584b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f15585c) {
                return C1748a.this.j(this.f15584b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15584b < this.f15583a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f15585c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objF = C1748a.this.f(this.f15584b);
            Object objJ = C1748a.this.j(this.f15584b);
            return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f15585c) {
                throw new IllegalStateException();
            }
            C1748a.this.h(this.f15584b);
            this.f15584b--;
            this.f15583a--;
            this.f15585c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f15585c) {
                return C1748a.this.i(this.f15584b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + com.amazon.a.a.o.b.f.f16778b + getValue();
        }
    }

    /* JADX INFO: renamed from: b0.a$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class f extends AbstractC1752e {
        public f() {
            super(C1748a.this.size());
        }

        @Override // p010b0.AbstractC1752e
        public Object b(int i8) {
            return C1748a.this.j(i8);
        }

        @Override // p010b0.AbstractC1752e
        public void c(int i8) {
            C1748a.this.h(i8);
        }
    }

    public C1748a() {
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p010b0.C, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // p010b0.C, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0391a c0391a = this.f15577d;
        if (c0391a != null) {
            return c0391a;
        }
        C0391a c0391a2 = new C0391a();
        this.f15577d = c0391a2;
        return c0391a2;
    }

    @Override // p010b0.C, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    public boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f15578e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f15578e = cVar2;
        return cVar2;
    }

    public boolean m(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean n(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p010b0.C, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f15579f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f15579f = eVar2;
        return eVar2;
    }

    public C1748a(int i8) {
        super(i8);
    }

    /* JADX INFO: renamed from: b0.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C1748a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C1748a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C1748a.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C1748a.l(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C1748a.this.size() - 1; size >= 0; size--) {
                Object objF = C1748a.this.f(size);
                iHashCode += objF == null ? 0 : objF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C1748a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1748a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iD = C1748a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            C1748a.this.h(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C1748a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C1748a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C1748a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C1748a.this.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C1748a.this.f(i8);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C1748a.this.f(i8);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: b0.a$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C1748a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C1748a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C1748a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1748a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = C1748a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C1748a.this.h(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C1748a.this.size();
            int i8 = 0;
            boolean z8 = false;
            while (i8 < size) {
                if (collection.contains(C1748a.this.j(i8))) {
                    C1748a.this.h(i8);
                    i8--;
                    size--;
                    z8 = true;
                }
                i8++;
            }
            return z8;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C1748a.this.size();
            int i8 = 0;
            boolean z8 = false;
            while (i8 < size) {
                if (!collection.contains(C1748a.this.j(i8))) {
                    C1748a.this.h(i8);
                    i8--;
                    size--;
                    z8 = true;
                }
                i8++;
            }
            return z8;
        }

        @Override // java.util.Collection
        public int size() {
            return C1748a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C1748a.this.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C1748a.this.j(i8);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = C1748a.this.j(i8);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C1748a(C c8) {
        super(c8);
    }
}
