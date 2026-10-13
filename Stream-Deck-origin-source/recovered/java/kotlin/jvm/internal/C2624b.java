package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2624b implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f28799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28800b;

    public C2624b(Object[] array) {
        t.g(array, "array");
        this.f28799a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28800b < this.f28799a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f28799a;
            int i8 = this.f28800b;
            this.f28800b = i8 + 1;
            return objArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f28800b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
