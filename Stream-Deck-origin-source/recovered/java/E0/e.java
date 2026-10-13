package E0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u[] f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1998c = true;

    public e(t tVar, u[] uVarArr) {
        this.f1996a = uVarArr;
        uVarArr[0].k(tVar.p(), tVar.m() * 2);
        this.f1997b = 0;
        d();
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final Object c() {
        b();
        return this.f1996a[this.f1997b].b();
    }

    public final void d() {
        if (this.f1996a[this.f1997b].f()) {
            return;
        }
        for (int i8 = this.f1997b; -1 < i8; i8--) {
            int iF = f(i8);
            if (iF == -1 && this.f1996a[i8].g()) {
                this.f1996a[i8].j();
                iF = f(i8);
            }
            if (iF != -1) {
                this.f1997b = iF;
                return;
            }
            if (i8 > 0) {
                this.f1996a[i8 - 1].j();
            }
            this.f1996a[i8].k(t.f2016e.a().p(), 0);
        }
        this.f1998c = false;
    }

    public final u[] e() {
        return this.f1996a;
    }

    public final int f(int i8) {
        if (this.f1996a[i8].f()) {
            return i8;
        }
        if (!this.f1996a[i8].g()) {
            return -1;
        }
        t tVarC = this.f1996a[i8].c();
        if (i8 == 6) {
            this.f1996a[i8 + 1].k(tVarC.p(), tVarC.p().length);
        } else {
            this.f1996a[i8 + 1].k(tVarC.p(), tVarC.m() * 2);
        }
        return f(i8 + 1);
    }

    public final void g(int i8) {
        this.f1997b = i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1998c;
    }

    @Override // java.util.Iterator
    public Object next() {
        b();
        Object next = this.f1996a[this.f1997b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
