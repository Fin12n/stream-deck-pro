package J0;

import C6.C0920i;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B implements ListIterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f3917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3919c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3920d;

    public B(v vVar, int i8) {
        this.f3917a = vVar;
        this.f3918b = i8 - 1;
        this.f3920d = vVar.u();
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        b();
        this.f3917a.add(this.f3918b + 1, obj);
        this.f3919c = -1;
        this.f3918b++;
        this.f3920d = this.f3917a.u();
    }

    public final void b() {
        if (this.f3917a.u() != this.f3920d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f3918b < this.f3917a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f3918b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        int i8 = this.f3918b + 1;
        this.f3919c = i8;
        w.g(i8, this.f3917a.size());
        Object obj = this.f3917a.get(i8);
        this.f3918b = i8;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f3918b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        b();
        w.g(this.f3918b, this.f3917a.size());
        int i8 = this.f3918b;
        this.f3919c = i8;
        Object obj = this.f3917a.get(i8);
        this.f3918b--;
        return obj;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f3918b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        this.f3917a.remove(this.f3918b);
        this.f3918b--;
        this.f3919c = -1;
        this.f3920d = this.f3917a.u();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        b();
        int i8 = this.f3919c;
        if (i8 < 0) {
            w.e();
            throw new C0920i();
        }
        this.f3917a.set(i8, obj);
        this.f3920d = this.f3917a.u();
    }
}
