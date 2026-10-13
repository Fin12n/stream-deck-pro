package D6;

import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class Q extends AbstractC0922b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1933b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements ListIterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator f1934a;

        public a(int i8) {
            this.f1934a = Q.this.f1933b.listIterator(x.X(Q.this, i8));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f1934a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1934a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f1934a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return x.W(Q.this, this.f1934a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f1934a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return x.W(Q.this, this.f1934a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException(cFAYKUlMj.usg);
        }
    }

    public Q(List<Object> delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.f1933b = delegate;
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f1933b.size();
    }

    @Override // D6.AbstractC0922b, java.util.List
    public Object get(int i8) {
        return this.f1933b.get(x.V(this, i8));
    }

    @Override // D6.AbstractC0922b, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // D6.AbstractC0922b, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // D6.AbstractC0922b, java.util.List
    public ListIterator listIterator(int i8) {
        return new a(i8);
    }
}
