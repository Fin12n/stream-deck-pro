package C6;

import D6.C0934n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Collection, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1462a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1464b;

        public a(int[] array) {
            kotlin.jvm.internal.t.g(array, "array");
            this.f1463a = array;
        }

        public int b() {
            int i8 = this.f1464b;
            int[] iArr = this.f1463a;
            if (i8 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f1464b));
            }
            this.f1464b = i8 + 1;
            return y.b(iArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1464b < this.f1463a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return y.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ z(int[] iArr) {
        this.f1462a = iArr;
    }

    public static final int A(int[] iArr, int i8) {
        return y.b(iArr[i8]);
    }

    public static int E(int[] iArr) {
        return iArr.length;
    }

    public static int F(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean G(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator H(int[] iArr) {
        return new a(iArr);
    }

    public static final void I(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static String J(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ z c(int[] iArr) {
        return new z(iArr);
    }

    public static int[] m(int i8) {
        return o(new int[i8]);
    }

    public static int[] o(int[] storage) {
        kotlin.jvm.internal.t.g(storage, "storage");
        return storage;
    }

    public static boolean t(int[] iArr, int i8) {
        return C0934n.G(iArr, i8);
    }

    public static boolean u(int[] iArr, Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !C0934n.G(iArr, ((y) obj).j())) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(int[] iArr, Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.t.c(iArr, ((z) obj).K());
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int size() {
        return E(this.f1462a);
    }

    public final /* synthetic */ int[] K() {
        return this.f1462a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y) {
            return s(((y) obj).j());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return u(this.f1462a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return y(this.f1462a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return F(this.f1462a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.f1462a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return H(this.f1462a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean s(int i8) {
        return t(this.f1462a, i8);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return J(this.f1462a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }
}
