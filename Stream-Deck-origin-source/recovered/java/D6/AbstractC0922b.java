package D6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: D6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0922b extends AbstractC0921a implements List, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1937a = new a(null);

    /* JADX INFO: renamed from: D6.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void a(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("startIndex: " + i8 + ", endIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i8 + " > endIndex: " + i9);
        }

        public final void b(int i8, int i9) {
            if (i8 < 0 || i8 >= i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void c(int i8, int i9) {
            if (i8 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void d(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
        }

        public final int e(int i8, int i9) {
            int i10 = i8 + (i8 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                return i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i10;
        }

        public final boolean f(Collection c8, Collection other) {
            kotlin.jvm.internal.t.g(c8, "c");
            kotlin.jvm.internal.t.g(other, "other");
            if (c8.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c8.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.t.c(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c8) {
            kotlin.jvm.internal.t.g(c8, "c");
            Iterator it = c8.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: D6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0085b implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1938a;

        public C0085b() {
        }

        public final int b() {
            return this.f1938a;
        }

        public final void c(int i8) {
            this.f1938a = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1938a < AbstractC0922b.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0922b abstractC0922b = AbstractC0922b.this;
            int i8 = this.f1938a;
            this.f1938a = i8 + 1;
            return abstractC0922b.get(i8);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: D6.b$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends C0085b implements ListIterator, R6.a {
        public c(int i8) {
            super();
            AbstractC0922b.f1937a.c(i8, AbstractC0922b.this.size());
            c(i8);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0922b abstractC0922b = AbstractC0922b.this;
            c(b() - 1);
            return abstractC0922b.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: D6.b$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends AbstractC0922b implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC0922b f1941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1943d;

        public d(AbstractC0922b list, int i8, int i9) {
            kotlin.jvm.internal.t.g(list, "list");
            this.f1941b = list;
            this.f1942c = i8;
            AbstractC0922b.f1937a.d(i8, i9, list.size());
            this.f1943d = i9 - i8;
        }

        @Override // D6.AbstractC0921a
        public int c() {
            return this.f1943d;
        }

        @Override // D6.AbstractC0922b, java.util.List
        public Object get(int i8) {
            AbstractC0922b.f1937a.b(i8, this.f1943d);
            return this.f1941b.get(this.f1942c + i8);
        }
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f1937a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i8);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f1937a.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.t.c(it.next(), obj)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0085b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.t.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i8, int i9) {
        return new d(this, i8, i9);
    }

    public ListIterator listIterator(int i8) {
        return new c(i8);
    }
}
