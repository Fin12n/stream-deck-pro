package p010b0;

import R6.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: b0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1752e implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15595c;

    public AbstractC1752e(int i8) {
        this.f15593a = i8;
    }

    public abstract Object b(int i8);

    public abstract void c(int i8);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f15594b < this.f15593a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = b(this.f15594b);
        this.f15594b++;
        this.f15595c = true;
        return objB;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f15595c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i8 = this.f15594b - 1;
        this.f15594b = i8;
        c(i8);
        this.f15593a--;
        this.f15595c = false;
    }
}
