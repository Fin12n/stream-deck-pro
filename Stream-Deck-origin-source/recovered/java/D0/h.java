package D0;

import W6.n;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a implements ListIterator, R6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f1704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f1706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1707f;

    public h(f fVar, int i8) {
        super(i8, fVar.size());
        this.f1704c = fVar;
        this.f1705d = fVar.A();
        this.f1707f = -1;
        l();
    }

    private final void k() {
        g(this.f1704c.size());
        this.f1705d = this.f1704c.A();
        this.f1707f = -1;
        l();
    }

    @Override // D0.a, java.util.ListIterator
    public void add(Object obj) {
        h();
        this.f1704c.add(d(), obj);
        f(d() + 1);
        k();
    }

    public final void h() {
        if (this.f1705d != this.f1704c.A()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void j() {
        if (this.f1707f == -1) {
            throw new IllegalStateException();
        }
    }

    public final void l() {
        Object[] objArrD = this.f1704c.D();
        if (objArrD == null) {
            this.f1706e = null;
            return;
        }
        int iD = l.d(this.f1704c.size());
        int iG = n.g(d(), iD);
        int iE = (this.f1704c.E() / 5) + 1;
        k kVar = this.f1706e;
        if (kVar == null) {
            this.f1706e = new k(objArrD, iG, iD, iE);
        } else {
            t.d(kVar);
            kVar.l(objArrD, iG, iD, iE);
        }
    }

    @Override // D0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        h();
        b();
        this.f1707f = d();
        k kVar = this.f1706e;
        if (kVar == null) {
            Object[] objArrF = this.f1704c.F();
            int iD = d();
            f(iD + 1);
            return objArrF[iD];
        }
        if (kVar.hasNext()) {
            f(d() + 1);
            return kVar.next();
        }
        Object[] objArrF2 = this.f1704c.F();
        int iD2 = d();
        f(iD2 + 1);
        return objArrF2[iD2 - kVar.e()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        h();
        c();
        this.f1707f = d() - 1;
        k kVar = this.f1706e;
        if (kVar == null) {
            Object[] objArrF = this.f1704c.F();
            f(d() - 1);
            return objArrF[d()];
        }
        if (d() <= kVar.e()) {
            f(d() - 1);
            return kVar.previous();
        }
        Object[] objArrF2 = this.f1704c.F();
        f(d() - 1);
        return objArrF2[d() - kVar.e()];
    }

    @Override // D0.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        j();
        this.f1704c.remove(this.f1707f);
        if (this.f1707f < d()) {
            f(this.f1707f);
        }
        k();
    }

    @Override // D0.a, java.util.ListIterator
    public void set(Object obj) {
        h();
        j();
        this.f1704c.set(this.f1707f, obj);
        this.f1705d = this.f1704c.A();
        l();
    }
}
