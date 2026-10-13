package Y6;

import C6.G;
import C6.q;
import C6.r;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends i implements Iterator, G6.d, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f12533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G6.d f12534d;

    @Override // Y6.i
    public Object b(Object obj, G6.d dVar) {
        this.f12532b = obj;
        this.f12531a = 3;
        this.f12534d = dVar;
        Object objF = H6.c.f();
        if (objF == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public final Throwable c() {
        int i8 = this.f12531a;
        if (i8 == 4) {
            return new NoSuchElementException();
        }
        if (i8 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f12531a);
    }

    public final Object d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void e(G6.d dVar) {
        this.f12534d = dVar;
    }

    @Override // G6.d
    public G6.g getContext() {
        return G6.h.f2820a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i8 = this.f12531a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.f12533c;
                t.d(it);
                if (it.hasNext()) {
                    this.f12531a = 2;
                    return true;
                }
                this.f12533c = null;
            }
            this.f12531a = 5;
            G6.d dVar = this.f12534d;
            t.d(dVar);
            this.f12534d = null;
            q.a aVar = q.f1441b;
            dVar.resumeWith(q.b(G.f1419a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i8 = this.f12531a;
        if (i8 == 0 || i8 == 1) {
            return d();
        }
        if (i8 == 2) {
            this.f12531a = 1;
            Iterator it = this.f12533c;
            t.d(it);
            return it.next();
        }
        if (i8 != 3) {
            throw c();
        }
        this.f12531a = 0;
        Object obj = this.f12532b;
        this.f12532b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        r.b(obj);
        this.f12531a = 4;
    }
}
