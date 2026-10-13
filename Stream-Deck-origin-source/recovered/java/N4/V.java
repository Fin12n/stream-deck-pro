package N4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6593c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f6594d;

    public /* synthetic */ V(Z z8, U u8) {
        this.f6594d = z8;
        this.f6591a = z8.f6725e;
        this.f6592b = z8.h();
    }

    public abstract Object b(int i8);

    public final void c() {
        if (this.f6594d.f6725e != this.f6591a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6592b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f6592b;
        this.f6593c = i8;
        Object objB = b(i8);
        this.f6592b = this.f6594d.i(this.f6592b);
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        AbstractC1296t.e(this.f6593c >= 0, "no calls to next() since the last call to remove()");
        this.f6591a += 32;
        int i8 = this.f6593c;
        Z z8 = this.f6594d;
        z8.remove(Z.j(z8, i8));
        this.f6592b--;
        this.f6593c = -1;
    }
}
