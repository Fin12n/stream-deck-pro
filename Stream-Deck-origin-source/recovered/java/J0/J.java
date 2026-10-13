package J0;

import C6.C0920i;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J implements List, R6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f3932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3935d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements ListIterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.H f3936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f3937b;

        public a(kotlin.jvm.internal.H h8, J j8) {
            this.f3936a = h8;
            this.f3937b = j8;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void add(Object obj) {
            w.f();
            throw new C0920i();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            w.f();
            throw new C0920i();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void set(Object obj) {
            w.f();
            throw new C0920i();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f3936a.f28777a < this.f3937b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f3936a.f28777a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i8 = this.f3936a.f28777a + 1;
            w.g(i8, this.f3937b.size());
            this.f3936a.f28777a = i8;
            return this.f3937b.get(i8);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f3936a.f28777a + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i8 = this.f3936a.f28777a;
            w.g(i8, this.f3937b.size());
            this.f3936a.f28777a = i8 - 1;
            return this.f3937b.get(i8);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f3936a.f28777a;
        }
    }

    public J(v vVar, int i8, int i9) {
        this.f3932a = vVar;
        this.f3933b = i8;
        this.f3934c = vVar.u();
        this.f3935d = i9 - i8;
    }

    private final void o() {
        if (this.f3932a.u() != this.f3934c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        o();
        this.f3932a.add(this.f3933b + size(), obj);
        this.f3935d = size() + 1;
        this.f3934c = this.f3932a.u();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        o();
        boolean zAddAll = this.f3932a.addAll(i8 + this.f3933b, collection);
        if (zAddAll) {
            this.f3935d = size() + collection.size();
            this.f3934c = this.f3932a.u();
        }
        return zAddAll;
    }

    public int c() {
        return this.f3935d;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            o();
            v vVar = this.f3932a;
            int i8 = this.f3933b;
            vVar.D(i8, size() + i8);
            this.f3935d = 0;
            this.f3934c = this.f3932a.u();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i8) {
        o();
        w.g(i8, size());
        return this.f3932a.get(this.f3933b + i8);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        o();
        int i8 = this.f3933b;
        Iterator it = W6.n.v(i8, size() + i8).iterator();
        while (it.hasNext()) {
            int iNextInt = ((D6.I) it).nextInt();
            if (kotlin.jvm.internal.t.c(obj, this.f3932a.get(iNextInt))) {
                return iNextInt - this.f3933b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        o();
        int size = this.f3933b + size();
        do {
            size--;
            if (size < this.f3933b) {
                return -1;
            }
        } while (!kotlin.jvm.internal.t.c(obj, this.f3932a.get(size)));
        return size - this.f3933b;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object m(int i8) {
        o();
        Object objRemove = this.f3932a.remove(this.f3933b + i8);
        this.f3935d = size() - 1;
        this.f3934c = this.f3932a.u();
        return objRemove;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i8) {
        return m(i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z8 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        o();
        v vVar = this.f3932a;
        int i8 = this.f3933b;
        int iE = vVar.E(collection, i8, size() + i8);
        if (iE > 0) {
            this.f3934c = this.f3932a.u();
            this.f3935d = size() - iE;
        }
        return iE > 0;
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        w.g(i8, size());
        o();
        Object obj2 = this.f3932a.set(i8 + this.f3933b, obj);
        this.f3934c = this.f3932a.u();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        if (i8 < 0 || i8 > i9 || i9 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        o();
        v vVar = this.f3932a;
        int i10 = this.f3933b;
        return new J(vVar, i8 + i10, i9 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        o();
        kotlin.jvm.internal.H h8 = new kotlin.jvm.internal.H();
        h8.f28777a = i8 - 1;
        return new a(h8, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC2632j.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        o();
        this.f3932a.add(this.f3933b + i8, obj);
        this.f3935d = size() + 1;
        this.f3934c = this.f3932a.u();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
