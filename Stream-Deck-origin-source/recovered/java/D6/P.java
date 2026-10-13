package D6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC0925e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1930a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements ListIterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator f1931a;

        public a(int i8) {
            this.f1931a = P.this.f1930a.listIterator(x.X(P.this, i8));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f1931a.add(obj);
            this.f1931a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f1931a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1931a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f1931a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return x.W(P.this, this.f1931a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f1931a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return x.W(P.this, this.f1931a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f1931a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f1931a.set(obj);
        }
    }

    public P(List<Object> delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f1930a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        this.f1930a.add(x.X(this, i8), obj);
    }

    @Override // D6.AbstractC0925e
    public int c() {
        return this.f1930a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f1930a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        return this.f1930a.get(x.V(this, i8));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // D6.AbstractC0925e
    public Object o(int i8) {
        return this.f1930a.remove(x.V(this, i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        return this.f1930a.set(x.V(this, i8), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        return new a(i8);
    }
}
