package D0;

import W6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f1703d;

    public g(Object[] objArr, Object[] objArr2, int i8, int i9, int i10) {
        super(i8, i9);
        this.f1702c = objArr2;
        int iD = l.d(i9);
        this.f1703d = new k(objArr, n.g(i8, iD), iD, i10);
    }

    @Override // D0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        if (this.f1703d.hasNext()) {
            f(d() + 1);
            return this.f1703d.next();
        }
        Object[] objArr = this.f1702c;
        int iD = d();
        f(iD + 1);
        return objArr[iD - this.f1703d.e()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        c();
        if (d() <= this.f1703d.e()) {
            f(d() - 1);
            return this.f1703d.previous();
        }
        Object[] objArr = this.f1702c;
        f(d() - 1);
        return objArr[d() - this.f1703d.e()];
    }
}
