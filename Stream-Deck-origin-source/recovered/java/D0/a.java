package D0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1685b;

    public a(int i8, int i9) {
        this.f1684a = i8;
        this.f1685b = i9;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f1684a;
    }

    public final int e() {
        return this.f1685b;
    }

    public final void f(int i8) {
        this.f1684a = i8;
    }

    public final void g(int i8) {
        this.f1685b = i8;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f1684a < this.f1685b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f1684a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f1684a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f1684a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
