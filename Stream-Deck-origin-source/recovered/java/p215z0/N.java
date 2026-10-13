package p215z0;

import K0.b;
import R6.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class N implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f38631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38634d;

    public N(T0 t8, int i8, int i9) {
        this.f38631a = t8;
        this.f38632b = i9;
        this.f38633c = i8;
        this.f38634d = t8.G();
        if (t8.H()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b next() {
        c();
        int i8 = this.f38633c;
        this.f38633c = V0.I(this.f38631a.y(), i8) + i8;
        return new U0(this.f38631a, i8, this.f38634d);
    }

    public final void c() {
        if (this.f38631a.G() != this.f38634d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38633c < this.f38632b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
