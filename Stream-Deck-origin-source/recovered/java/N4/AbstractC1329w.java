package N4;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: N4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1329w extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7360b;

    public AbstractC1329w(int i8, int i9) {
        AbstractC1296t.b(i9, i8, "index");
        this.f7359a = i8;
        this.f7360b = i9;
    }

    public abstract Object b(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7360b < this.f7359a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7360b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f7360b;
        this.f7360b = i8 + 1;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7360b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f7360b - 1;
        this.f7360b = i8;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7360b - 1;
    }
}
