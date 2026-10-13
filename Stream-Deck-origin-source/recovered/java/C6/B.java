package C6;

import D6.C0934n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements Collection, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f1410a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f1411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1412b;

        public a(long[] array) {
            kotlin.jvm.internal.t.g(array, "array");
            this.f1411a = array;
        }

        public long b() {
            int i8 = this.f1412b;
            long[] jArr = this.f1411a;
            if (i8 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f1412b));
            }
            this.f1412b = i8 + 1;
            return A.b(jArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1412b < this.f1411a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return A.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ B(long[] jArr) {
        this.f1410a = jArr;
    }

    public static final long A(long[] jArr, int i8) {
        return A.b(jArr[i8]);
    }

    public static int E(long[] jArr) {
        return jArr.length;
    }

    public static int F(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean G(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator H(long[] jArr) {
        return new a(jArr);
    }

    public static final void I(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    public static String J(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ B c(long[] jArr) {
        return new B(jArr);
    }

    public static long[] m(int i8) {
        return o(new long[i8]);
    }

    public static long[] o(long[] storage) {
        kotlin.jvm.internal.t.g(storage, "storage");
        return storage;
    }

    public static boolean t(long[] jArr, long j8) {
        return C0934n.H(jArr, j8);
    }

    public static boolean u(long[] jArr, Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof A) || !C0934n.H(jArr, ((A) obj).m())) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(long[] jArr, Object obj) {
        return (obj instanceof B) && kotlin.jvm.internal.t.c(jArr, ((B) obj).K());
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int size() {
        return E(this.f1410a);
    }

    public final /* synthetic */ long[] K() {
        return this.f1410a;
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
        if (obj instanceof A) {
            return s(((A) obj).m());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return u(this.f1410a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return y(this.f1410a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return F(this.f1410a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.f1410a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return H(this.f1410a);
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

    public boolean s(long j8) {
        return t(this.f1410a, j8);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return J(this.f1410a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }
}
