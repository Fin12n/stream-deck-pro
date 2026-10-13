package C6;

import D6.C0934n;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Collection, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1457a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f1458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1459b;

        public a(byte[] array) {
            kotlin.jvm.internal.t.g(array, "array");
            this.f1458a = array;
        }

        public byte b() {
            int i8 = this.f1459b;
            byte[] bArr = this.f1458a;
            if (i8 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f1459b));
            }
            this.f1459b = i8 + 1;
            return w.b(bArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1459b < this.f1458a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return w.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ x(byte[] bArr) {
        this.f1457a = bArr;
    }

    public static final byte A(byte[] bArr, int i8) {
        return w.b(bArr[i8]);
    }

    public static int E(byte[] bArr) {
        return bArr.length;
    }

    public static int F(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean G(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator H(byte[] bArr) {
        return new a(bArr);
    }

    public static final void I(byte[] bArr, int i8, byte b8) {
        bArr[i8] = b8;
    }

    public static final /* synthetic */ x c(byte[] bArr) {
        return new x(bArr);
    }

    public static byte[] m(int i8) {
        return o(new byte[i8]);
    }

    public static byte[] o(byte[] storage) {
        kotlin.jvm.internal.t.g(storage, "storage");
        return storage;
    }

    public static boolean t(byte[] bArr, byte b8) {
        return C0934n.F(bArr, b8);
    }

    public static boolean u(byte[] bArr, Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof w) || !C0934n.F(bArr, ((w) obj).m())) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(byte[] bArr, Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.t.c(bArr, ((x) obj).K());
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public int size() {
        return E(this.f1457a);
    }

    public final /* synthetic */ byte[] K() {
        return this.f1457a;
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
        if (obj instanceof w) {
            return s(((w) obj).m());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return u(this.f1457a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return y(this.f1457a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return F(this.f1457a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return G(this.f1457a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return H(this.f1457a);
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

    public boolean s(byte b8) {
        return t(this.f1457a, b8);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return J(this.f1457a);
    }

    public static String J(byte[] bArr) {
        return WqXA.EqifgLsDyKQ + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        return AbstractC2632j.b(this, array);
    }
}
