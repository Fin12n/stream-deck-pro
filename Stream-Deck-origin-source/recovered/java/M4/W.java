package M4;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class W extends AbstractC1065t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5553b;

    public W(int i8, int i9) {
        U.b(i9, i8, "index");
        this.f5552a = i8;
        this.f5553b = i9;
    }

    public abstract Object b(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5553b < this.f5552a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5553b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f5553b;
        this.f5553b = i8 + 1;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5553b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f5553b - 1;
        this.f5553b = i8;
        return b(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5553b - 1;
    }
}
