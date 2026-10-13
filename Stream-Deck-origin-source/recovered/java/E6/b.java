package E6;

import D6.AbstractC0922b;
import D6.AbstractC0925e;
import D6.C0933m;
import D6.C0937q;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0925e implements List, RandomAccess, Serializable, R6.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0104b f2236d = new C0104b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f2237e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f2238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2240c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractC0925e implements List, RandomAccess, Serializable, R6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f2241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f2244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f2245e;

        /* JADX INFO: renamed from: E6.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0103a implements ListIterator, R6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f2246a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2248c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2249d;

            public C0103a(a list, int i8) {
                t.g(list, "list");
                this.f2246a = list;
                this.f2247b = i8;
                this.f2248c = -1;
                this.f2249d = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) this.f2246a.f2245e).modCount != this.f2249d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                b();
                a aVar = this.f2246a;
                int i8 = this.f2247b;
                this.f2247b = i8 + 1;
                aVar.add(i8, obj);
                this.f2248c = -1;
                this.f2249d = ((AbstractList) this.f2246a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f2247b < this.f2246a.f2243c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f2247b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                b();
                if (this.f2247b >= this.f2246a.f2243c) {
                    throw new NoSuchElementException();
                }
                int i8 = this.f2247b;
                this.f2247b = i8 + 1;
                this.f2248c = i8;
                return this.f2246a.f2241a[this.f2246a.f2242b + this.f2248c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f2247b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                b();
                int i8 = this.f2247b;
                if (i8 <= 0) {
                    throw new NoSuchElementException();
                }
                int i9 = i8 - 1;
                this.f2247b = i9;
                this.f2248c = i9;
                return this.f2246a.f2241a[this.f2246a.f2242b + this.f2248c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f2247b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i8 = this.f2248c;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f2246a.remove(i8);
                this.f2247b = this.f2248c;
                this.f2248c = -1;
                this.f2249d = ((AbstractList) this.f2246a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                b();
                int i8 = this.f2248c;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f2246a.set(i8, obj);
            }
        }

        public a(Object[] backing, int i8, int i9, a aVar, b root) {
            t.g(backing, "backing");
            t.g(root, "root");
            this.f2241a = backing;
            this.f2242b = i8;
            this.f2243c = i9;
            this.f2244d = aVar;
            this.f2245e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void H() {
            if (((AbstractList) this.f2245e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void L() {
            ((AbstractList) this).modCount++;
        }

        public final void F(int i8, Collection collection, int i9) {
            L();
            a aVar = this.f2244d;
            if (aVar != null) {
                aVar.F(i8, collection, i9);
            } else {
                this.f2245e.J(i8, collection, i9);
            }
            this.f2241a = this.f2245e.f2238a;
            this.f2243c += i9;
        }

        public final void G(int i8, Object obj) {
            L();
            a aVar = this.f2244d;
            if (aVar != null) {
                aVar.G(i8, obj);
            } else {
                this.f2245e.K(i8, obj);
            }
            this.f2241a = this.f2245e.f2238a;
            this.f2243c++;
        }

        public final void I() {
            if (K()) {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean J(List list) {
            return E6.c.h(this.f2241a, this.f2242b, this.f2243c, list);
        }

        public final boolean K() {
            return this.f2245e.f2240c;
        }

        public final Object M(int i8) {
            L();
            a aVar = this.f2244d;
            Object objM = aVar != null ? aVar.M(i8) : this.f2245e.S(i8);
            this.f2243c--;
            return objM;
        }

        public final void N(int i8, int i9) {
            if (i9 > 0) {
                L();
            }
            a aVar = this.f2244d;
            if (aVar != null) {
                aVar.N(i8, i9);
            } else {
                this.f2245e.T(i8, i9);
            }
            this.f2243c -= i9;
        }

        public final int O(int i8, int i9, Collection collection, boolean z8) {
            a aVar = this.f2244d;
            int iO = aVar != null ? aVar.O(i8, i9, collection, z8) : this.f2245e.U(i8, i9, collection, z8);
            if (iO > 0) {
                L();
            }
            this.f2243c -= iO;
            return iO;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            I();
            H();
            G(this.f2242b + this.f2243c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            t.g(elements, "elements");
            I();
            H();
            int size = elements.size();
            F(this.f2242b + this.f2243c, elements, size);
            return size > 0;
        }

        @Override // D6.AbstractC0925e
        public int c() {
            H();
            return this.f2243c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            I();
            H();
            N(this.f2242b, this.f2243c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            H();
            if (obj != this) {
                return (obj instanceof List) && J((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            H();
            AbstractC0922b.f1937a.b(i8, this.f2243c);
            return this.f2241a[this.f2242b + i8];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            H();
            return E6.c.i(this.f2241a, this.f2242b, this.f2243c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            H();
            for (int i8 = 0; i8 < this.f2243c; i8++) {
                if (t.c(this.f2241a[this.f2242b + i8], obj)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            H();
            return this.f2243c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            H();
            for (int i8 = this.f2243c - 1; i8 >= 0; i8--) {
                if (t.c(this.f2241a[this.f2242b + i8], obj)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // D6.AbstractC0925e
        public Object o(int i8) {
            I();
            H();
            AbstractC0922b.f1937a.b(i8, this.f2243c);
            return M(this.f2242b + i8);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            I();
            H();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            t.g(elements, "elements");
            I();
            H();
            return O(this.f2242b, this.f2243c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            t.g(elements, "elements");
            I();
            H();
            return O(this.f2242b, this.f2243c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i8, Object obj) {
            I();
            H();
            AbstractC0922b.f1937a.b(i8, this.f2243c);
            Object[] objArr = this.f2241a;
            int i9 = this.f2242b;
            Object obj2 = objArr[i9 + i8];
            objArr[i9 + i8] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i8, int i9) {
            AbstractC0922b.f1937a.d(i8, i9, this.f2243c);
            return new a(this.f2241a, this.f2242b + i8, i9 - i8, this, this.f2245e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            t.g(array, "array");
            H();
            int length = array.length;
            int i8 = this.f2243c;
            if (length >= i8) {
                Object[] objArr = this.f2241a;
                int i9 = this.f2242b;
                C0933m.i(objArr, array, 0, i9, i8 + i9);
                return C0937q.g(this.f2243c, array);
            }
            Object[] objArr2 = this.f2241a;
            int i10 = this.f2242b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i10, i8 + i10, array.getClass());
            t.f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            H();
            return E6.c.j(this.f2241a, this.f2242b, this.f2243c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i8) {
            H();
            AbstractC0922b.f1937a.c(i8, this.f2243c);
            return new C0103a(this, i8);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, Object obj) {
            I();
            H();
            AbstractC0922b.f1937a.c(i8, this.f2243c);
            G(this.f2242b + i8, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i8, Collection elements) {
            t.g(elements, "elements");
            I();
            H();
            AbstractC0922b.f1937a.c(i8, this.f2243c);
            int size = elements.size();
            F(this.f2242b + i8, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            H();
            Object[] objArr = this.f2241a;
            int i8 = this.f2242b;
            return C0933m.o(objArr, i8, this.f2243c + i8);
        }
    }

    /* JADX INFO: renamed from: E6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0104b {
        public /* synthetic */ C0104b(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0104b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements ListIterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f2250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2253d;

        private final void b() {
            if (((AbstractList) this.f2250a).modCount != this.f2253d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            b bVar = this.f2250a;
            int i8 = this.f2251b;
            this.f2251b = i8 + 1;
            bVar.add(i8, obj);
            this.f2252c = -1;
            this.f2253d = ((AbstractList) this.f2250a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f2251b < this.f2250a.f2239b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f2251b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (this.f2251b >= this.f2250a.f2239b) {
                throw new NoSuchElementException();
            }
            int i8 = this.f2251b;
            this.f2251b = i8 + 1;
            this.f2252c = i8;
            return this.f2250a.f2238a[this.f2252c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f2251b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            int i8 = this.f2251b;
            if (i8 <= 0) {
                throw new NoSuchElementException();
            }
            int i9 = i8 - 1;
            this.f2251b = i9;
            this.f2252c = i9;
            return this.f2250a.f2238a[this.f2252c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f2251b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i8 = this.f2252c;
            if (i8 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f2250a.remove(i8);
            this.f2251b = this.f2252c;
            this.f2252c = -1;
            this.f2253d = ((AbstractList) this.f2250a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            int i8 = this.f2252c;
            if (i8 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f2250a.set(i8, obj);
        }

        public c(b bVar, int i8) {
            t.g(bVar, vHKCAgr.ADIdHPXCXAAJClF);
            this.f2250a = bVar;
            this.f2251b = i8;
            this.f2252c = -1;
            this.f2253d = ((AbstractList) bVar).modCount;
        }
    }

    static {
        b bVar = new b(0);
        bVar.f2240c = true;
        f2237e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i8, Collection collection, int i9) {
        R();
        Q(i8, i9);
        Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            this.f2238a[i8 + i10] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i8, Object obj) {
        R();
        Q(i8, 1);
        this.f2238a[i8] = obj;
    }

    private final void M() {
        if (this.f2240c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean N(List list) {
        return E6.c.h(this.f2238a, 0, this.f2239b, list);
    }

    private final void R() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S(int i8) {
        R();
        Object[] objArr = this.f2238a;
        Object obj = objArr[i8];
        C0933m.i(objArr, objArr, i8, i8 + 1, this.f2239b);
        E6.c.f(this.f2238a, this.f2239b - 1);
        this.f2239b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int i8, int i9) {
        if (i9 > 0) {
            R();
        }
        Object[] objArr = this.f2238a;
        C0933m.i(objArr, objArr, i8, i8 + i9, this.f2239b);
        Object[] objArr2 = this.f2238a;
        int i10 = this.f2239b;
        E6.c.g(objArr2, i10 - i9, i10);
        this.f2239b -= i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U(int i8, int i9, Collection collection, boolean z8) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i8 + i10;
            if (collection.contains(this.f2238a[i12]) == z8) {
                Object[] objArr = this.f2238a;
                i10++;
                objArr[i11 + i8] = objArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        Object[] objArr2 = this.f2238a;
        C0933m.i(objArr2, objArr2, i8 + i11, i9 + i8, this.f2239b);
        Object[] objArr3 = this.f2238a;
        int i14 = this.f2239b;
        E6.c.g(objArr3, i14 - i13, i14);
        if (i13 > 0) {
            R();
        }
        this.f2239b -= i13;
        return i13;
    }

    public final List L() {
        M();
        this.f2240c = true;
        return this.f2239b > 0 ? this : f2237e;
    }

    public final void O(int i8) {
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2238a;
        if (i8 > objArr.length) {
            this.f2238a = E6.c.e(this.f2238a, AbstractC0922b.f1937a.e(objArr.length, i8));
        }
    }

    public final void P(int i8) {
        O(this.f2239b + i8);
    }

    public final void Q(int i8, int i9) {
        P(i9);
        Object[] objArr = this.f2238a;
        C0933m.i(objArr, objArr, i8 + i9, i8, this.f2239b);
        this.f2239b += i9;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        M();
        K(this.f2239b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        M();
        int size = elements.size();
        J(this.f2239b, elements, size);
        return size > 0;
    }

    @Override // D6.AbstractC0925e
    public int c() {
        return this.f2239b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        M();
        T(0, this.f2239b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && N((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC0922b.f1937a.b(i8, this.f2239b);
        return this.f2238a[i8];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return E6.c.i(this.f2238a, 0, this.f2239b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i8 = 0; i8 < this.f2239b; i8++) {
            if (t.c(this.f2238a[i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f2239b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i8 = this.f2239b - 1; i8 >= 0; i8--) {
            if (t.c(this.f2238a[i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // D6.AbstractC0925e
    public Object o(int i8) {
        M();
        AbstractC0922b.f1937a.b(i8, this.f2239b);
        return S(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        M();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        t.g(elements, "elements");
        M();
        return U(0, this.f2239b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        t.g(elements, "elements");
        M();
        return U(0, this.f2239b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        M();
        AbstractC0922b.f1937a.b(i8, this.f2239b);
        Object[] objArr = this.f2238a;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i8, int i9) {
        AbstractC0922b.f1937a.d(i8, i9, this.f2239b);
        return new a(this.f2238a, i8, i9 - i8, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        t.g(array, "array");
        int length = array.length;
        int i8 = this.f2239b;
        if (length >= i8) {
            C0933m.i(this.f2238a, array, 0, 0, i8);
            return C0937q.g(this.f2239b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f2238a, 0, i8, array.getClass());
        t.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return E6.c.j(this.f2238a, 0, this.f2239b, this);
    }

    public b(int i8) {
        this.f2238a = E6.c.d(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        AbstractC0922b.f1937a.c(i8, this.f2239b);
        return new c(this, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        M();
        AbstractC0922b.f1937a.c(i8, this.f2239b);
        K(i8, obj);
    }

    public /* synthetic */ b(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 10 : i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        t.g(elements, "elements");
        M();
        AbstractC0922b.f1937a.c(i8, this.f2239b);
        int size = elements.size();
        J(i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return C0933m.o(this.f2238a, 0, this.f2239b);
    }
}
