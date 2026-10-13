package C6;

import D6.C0934n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E implements Collection, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short[] f1416a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short[] f1417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1418b;

        public a(short[] array) {
            kotlin.jvm.internal.t.g(array, "array");
            this.f1417a = array;
        }

        public short b() {
            int i8 = this.f1418b;
            short[] sArr = this.f1417a;
            if (i8 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f1418b));
            }
            this.f1418b = i8 + 1;
            return D.b(sArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1418b < this.f1417a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return D.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ E(short[] sArr) {
        this.f1416a = sArr;
    }

    public static final short A(short[] sArr, int i8) {
        return D.b(sArr[i8]);
    }

    public static int E(short[] sArr) {
        return sArr.length;
    }

    public static int F(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean G(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator H(short[] sArr) {
        return new a(sArr);
    }

    public static final void I(short[] sArr, int i8, short s8) {
        sArr[i8] = s8;
    }

    public static String J(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ E c(short[] sArr) {
        return new E(sArr);
    }

    public static short[] m(int i8) {
        return o(new short[i8]);
    }

    public static short[] o(short[] storage) {
        kotlin.jvm.internal.t.g(storage, "storage");
        return storage;
    }

    public static boolean t(short[] sArr, short s8) {
        return C0934n.J(sArr, s8);
    }

    public static boolean u(short[] sArr, Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof D) || !C0934n.J(sArr, ((D) obj).j())) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(short[] sArr, Object obj) {
        return (obj instanceof E) && kotlin.jvm.internal.t.c(sArr, ((E) obj).K());
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int size() {
        return E(this.f1416a);
    }

    public final /* synthetic */ short[] K() {
        return this.f1416a;
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
        if (obj instanceof D) {
            return s(((D) obj).j());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return u(this.f1416a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return y(this.f1416a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return F(this.f1416a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.f1416a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return H(this.f1416a);
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

    public boolean s(short s8) {
        return t(this.f1416a, s8);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return J(this.f1416a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }
}
