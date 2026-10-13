package O4;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I2 extends AbstractC1394d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7905b;

    public I2(int i8, int i9) {
        G1.b(i9, i8, "index");
        this.f7904a = i8;
        this.f7905b = i9;
    }

    public abstract Object b(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7905b < this.f7904a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7905b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f7905b;
        this.f7905b = i8 + 1;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7905b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f7905b - 1;
        this.f7905b = i8;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7905b - 1;
    }
}
