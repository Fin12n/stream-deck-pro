package D0;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1687c;

    public c(Object[] objArr, int i8, int i9) {
        super(i8, i9);
        this.f1687c = objArr;
    }

    @Override // D0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f1687c;
        int iD = d();
        f(iD + 1);
        return objArr[iD];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f1687c;
        f(d() - 1);
        return objArr[d()];
    }
}
