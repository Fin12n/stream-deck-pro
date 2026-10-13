package D6;

import T0.Vl.PCRzgdeK;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: D6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C0930j extends AbstractC0925e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1949d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f1950e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f1952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1953c;

    /* JADX INFO: renamed from: D6.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public C0930j(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = f1950e;
        } else {
            if (i8 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i8);
            }
            objArr = new Object[i8];
        }
        this.f1952b = objArr;
    }

    private final void D(int i8) {
        if (i8 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1952b;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr == f1950e) {
            this.f1952b = new Object[W6.n.d(i8, 10)];
        } else {
            y(AbstractC0922b.f1937a.e(objArr.length, i8));
        }
    }

    public final int A(int i8) {
        return i8 == 0 ? C0934n.T(this.f1952b) : i8 - 1;
    }

    public final int E(int i8) {
        if (i8 == C0934n.T(this.f1952b)) {
            return 0;
        }
        return i8 + 1;
    }

    public final Object F() {
        if (isEmpty()) {
            return null;
        }
        return this.f1952b[I(this.f1951a + r.p(this))];
    }

    public final int G(int i8) {
        return i8 < 0 ? i8 + this.f1952b.length : i8;
    }

    public final void H(int i8, int i9) {
        if (i8 < i9) {
            C0933m.s(this.f1952b, null, i8, i9);
            return;
        }
        Object[] objArr = this.f1952b;
        C0933m.s(objArr, null, i8, objArr.length);
        C0933m.s(this.f1952b, null, 0, i9);
    }

    public final int I(int i8) {
        Object[] objArr = this.f1952b;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    public final void J() {
        ((AbstractList) this).modCount++;
    }

    public final Object K() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object L() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final void M(int i8, int i9) {
        int I8 = I(this.f1951a + (i8 - 1));
        int I9 = I(this.f1951a + (i9 - 1));
        while (i8 > 0) {
            int i10 = I8 + 1;
            int iMin = Math.min(i8, Math.min(i10, I9 + 1));
            Object[] objArr = this.f1952b;
            int i11 = I9 - iMin;
            int i12 = I8 - iMin;
            C0933m.i(objArr, objArr, i11 + 1, i12 + 1, i10);
            I8 = G(i12);
            I9 = G(i11);
            i8 -= iMin;
        }
    }

    public final void N(int i8, int i9) {
        int I8 = I(this.f1951a + i9);
        int I9 = I(this.f1951a + i8);
        int size = size();
        while (true) {
            size -= i9;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f1952b;
            i9 = Math.min(size, Math.min(objArr.length - I8, objArr.length - I9));
            Object[] objArr2 = this.f1952b;
            int i10 = I8 + i9;
            C0933m.i(objArr2, objArr2, I9, I8, i10);
            I8 = I(i10);
            I9 = I(I9 + i9);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        J();
        D(size() + elements.size());
        t(I(this.f1951a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        J();
        D(size() + 1);
        int iA = A(this.f1951a);
        this.f1951a = iA;
        this.f1952b[iA] = obj;
        this.f1953c = size() + 1;
    }

    public final void addLast(Object obj) {
        J();
        D(size() + 1);
        this.f1952b[I(this.f1951a + size())] = obj;
        this.f1953c = size() + 1;
    }

    @Override // D6.AbstractC0925e
    public int c() {
        return this.f1953c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            J();
            H(this.f1951a, I(this.f1951a + size()));
        }
        this.f1951a = 0;
        this.f1953c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f1952b[this.f1951a];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC0922b.f1937a.b(i8, size());
        return this.f1952b[I(this.f1951a + i8)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int I8 = I(this.f1951a + size());
        int length = this.f1951a;
        if (length < I8) {
            while (length < I8) {
                if (kotlin.jvm.internal.t.c(obj, this.f1952b[length])) {
                    i8 = this.f1951a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < I8) {
            return -1;
        }
        int length2 = this.f1952b.length;
        while (length < length2) {
            if (kotlin.jvm.internal.t.c(obj, this.f1952b[length])) {
                i8 = this.f1951a;
            } else {
                length++;
            }
        }
        for (int i9 = 0; i9 < I8; i9++) {
            if (kotlin.jvm.internal.t.c(obj, this.f1952b[i9])) {
                length = i9 + this.f1952b.length;
                i8 = this.f1951a;
            }
        }
        return -1;
        return length - i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f1952b[I(this.f1951a + r.p(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iT;
        int i8;
        int I8 = I(this.f1951a + size());
        int i9 = this.f1951a;
        if (i9 < I8) {
            iT = I8 - 1;
            if (i9 <= iT) {
                while (!kotlin.jvm.internal.t.c(obj, this.f1952b[iT])) {
                    if (iT != i9) {
                        iT--;
                    }
                }
                i8 = this.f1951a;
                return iT - i8;
            }
            return -1;
        }
        if (i9 > I8) {
            for (int i10 = I8 - 1; -1 < i10; i10--) {
                if (kotlin.jvm.internal.t.c(obj, this.f1952b[i10])) {
                    iT = i10 + this.f1952b.length;
                    i8 = this.f1951a;
                    return iT - i8;
                }
            }
            iT = C0934n.T(this.f1952b);
            int i11 = this.f1951a;
            if (i11 <= iT) {
                while (!kotlin.jvm.internal.t.c(obj, this.f1952b[iT])) {
                    if (iT != i11) {
                        iT--;
                    }
                }
                i8 = this.f1951a;
                return iT - i8;
            }
        }
        return -1;
    }

    @Override // D6.AbstractC0925e
    public Object o(int i8) {
        AbstractC0922b.f1937a.b(i8, size());
        if (i8 == r.p(this)) {
            return removeLast();
        }
        if (i8 == 0) {
            return removeFirst();
        }
        J();
        int I8 = I(this.f1951a + i8);
        Object obj = this.f1952b[I8];
        if (i8 < (size() >> 1)) {
            int i9 = this.f1951a;
            if (I8 >= i9) {
                Object[] objArr = this.f1952b;
                C0933m.i(objArr, objArr, i9 + 1, i9, I8);
            } else {
                Object[] objArr2 = this.f1952b;
                C0933m.i(objArr2, objArr2, 1, 0, I8);
                Object[] objArr3 = this.f1952b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f1951a;
                C0933m.i(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f1952b;
            int i11 = this.f1951a;
            objArr4[i11] = null;
            this.f1951a = E(i11);
        } else {
            int I9 = I(this.f1951a + r.p(this));
            if (I8 <= I9) {
                Object[] objArr5 = this.f1952b;
                C0933m.i(objArr5, objArr5, I8, I8 + 1, I9 + 1);
            } else {
                Object[] objArr6 = this.f1952b;
                C0933m.i(objArr6, objArr6, I8, I8 + 1, objArr6.length);
                Object[] objArr7 = this.f1952b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C0933m.i(objArr7, objArr7, 0, 1, I9 + 1);
            }
            this.f1952b[I9] = null;
        }
        this.f1953c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int I8;
        kotlin.jvm.internal.t.g(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f1952b.length != 0) {
            int I9 = I(this.f1951a + size());
            int i8 = this.f1951a;
            if (i8 < I9) {
                I8 = i8;
                while (i8 < I9) {
                    Object obj = this.f1952b[i8];
                    if (elements.contains(obj)) {
                        z8 = true;
                    } else {
                        this.f1952b[I8] = obj;
                        I8++;
                    }
                    i8++;
                }
                C0933m.s(this.f1952b, null, I8, I9);
            } else {
                int length = this.f1952b.length;
                boolean z9 = false;
                int i9 = i8;
                while (i8 < length) {
                    Object[] objArr = this.f1952b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        z9 = true;
                    } else {
                        this.f1952b[i9] = obj2;
                        i9++;
                    }
                    i8++;
                }
                I8 = I(i9);
                for (int i10 = 0; i10 < I9; i10++) {
                    Object[] objArr2 = this.f1952b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        z9 = true;
                    } else {
                        this.f1952b[I8] = obj3;
                        I8 = E(I8);
                    }
                }
                z8 = z9;
            }
            if (z8) {
                J();
                this.f1953c = G(I8 - this.f1951a);
            }
        }
        return z8;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        J();
        Object[] objArr = this.f1952b;
        int i8 = this.f1951a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f1951a = E(i8);
        this.f1953c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i8, int i9) {
        AbstractC0922b.f1937a.d(i8, i9, size());
        int i10 = i9 - i8;
        if (i10 == 0) {
            return;
        }
        if (i10 == size()) {
            clear();
            return;
        }
        if (i10 == 1) {
            remove(i8);
            return;
        }
        J();
        if (i8 < size() - i9) {
            M(i8, i9);
            int I8 = I(this.f1951a + i10);
            H(this.f1951a, I8);
            this.f1951a = I8;
        } else {
            N(i8, i9);
            int I9 = I(this.f1951a + size());
            H(G(I9 - i10), I9);
        }
        this.f1953c = size() - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int I8;
        kotlin.jvm.internal.t.g(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f1952b.length != 0) {
            int I9 = I(this.f1951a + size());
            int i8 = this.f1951a;
            if (i8 < I9) {
                I8 = i8;
                while (i8 < I9) {
                    Object obj = this.f1952b[i8];
                    if (elements.contains(obj)) {
                        this.f1952b[I8] = obj;
                        I8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                C0933m.s(this.f1952b, null, I8, I9);
            } else {
                int length = this.f1952b.length;
                boolean z9 = false;
                int i9 = i8;
                while (i8 < length) {
                    Object[] objArr = this.f1952b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        this.f1952b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                I8 = I(i9);
                for (int i10 = 0; i10 < I9; i10++) {
                    Object[] objArr2 = this.f1952b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f1952b[I8] = obj3;
                        I8 = E(I8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                J();
                this.f1953c = G(I8 - this.f1951a);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        AbstractC0922b.f1937a.b(i8, size());
        int I8 = I(this.f1951a + i8);
        Object[] objArr = this.f1952b;
        Object obj2 = objArr[I8];
        objArr[I8] = obj;
        return obj2;
    }

    public final void t(int i8, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1952b.length;
        while (i8 < length && it.hasNext()) {
            this.f1952b[i8] = it.next();
            i8++;
        }
        int i9 = this.f1951a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f1952b[i10] = it.next();
        }
        this.f1953c = size() + collection.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.t.g(array, "array");
        if (array.length < size()) {
            array = C0931k.a(array, size());
        }
        Object[] objArr = array;
        int I8 = I(this.f1951a + size());
        int i8 = this.f1951a;
        if (i8 < I8) {
            C0933m.m(this.f1952b, objArr, 0, i8, I8, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1952b;
            C0933m.i(objArr2, objArr, 0, this.f1951a, objArr2.length);
            Object[] objArr3 = this.f1952b;
            C0933m.i(objArr3, objArr, objArr3.length - this.f1951a, 0, I8);
        }
        return C0937q.g(size(), objArr);
    }

    public final void y(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f1952b;
        C0933m.i(objArr2, objArr, 0, this.f1951a, objArr2.length);
        Object[] objArr3 = this.f1952b;
        int length = objArr3.length;
        int i9 = this.f1951a;
        C0933m.i(objArr3, objArr, length - i9, 0, i9);
        this.f1951a = 0;
        this.f1952b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        AbstractC0922b.f1937a.c(i8, size());
        if (i8 == size()) {
            addLast(obj);
            return;
        }
        if (i8 == 0) {
            addFirst(obj);
            return;
        }
        J();
        D(size() + 1);
        int I8 = I(this.f1951a + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int iA = A(I8);
            int iA2 = A(this.f1951a);
            int i9 = this.f1951a;
            if (iA >= i9) {
                Object[] objArr = this.f1952b;
                objArr[iA2] = objArr[i9];
                C0933m.i(objArr, objArr, i9, i9 + 1, iA + 1);
            } else {
                Object[] objArr2 = this.f1952b;
                C0933m.i(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f1952b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C0933m.i(objArr3, objArr3, 0, 1, iA + 1);
            }
            this.f1952b[iA] = obj;
            this.f1951a = iA2;
        } else {
            int I9 = I(this.f1951a + size());
            if (I8 < I9) {
                Object[] objArr4 = this.f1952b;
                C0933m.i(objArr4, objArr4, I8 + 1, I8, I9);
            } else {
                Object[] objArr5 = this.f1952b;
                C0933m.i(objArr5, objArr5, 1, 0, I9);
                Object[] objArr6 = this.f1952b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C0933m.i(objArr6, objArr6, I8 + 1, I8, objArr6.length - 1);
            }
            this.f1952b[I8] = obj;
        }
        this.f1953c = size() + 1;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            J();
            int I8 = I(this.f1951a + r.p(this));
            Object[] objArr = this.f1952b;
            Object obj = objArr[I8];
            objArr[I8] = null;
            this.f1953c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException(PCRzgdeK.wnlVeEE);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        kotlin.jvm.internal.t.g(collection, uYOhHhTXuF.znvujKWbk);
        AbstractC0922b.f1937a.c(i8, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(collection);
        }
        J();
        D(size() + collection.size());
        int I8 = I(this.f1951a + size());
        int I9 = I(this.f1951a + i8);
        int size = collection.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f1951a;
            int length = i9 - size;
            if (I9 < i9) {
                Object[] objArr = this.f1952b;
                C0933m.i(objArr, objArr, length, i9, objArr.length);
                if (size >= I9) {
                    Object[] objArr2 = this.f1952b;
                    C0933m.i(objArr2, objArr2, objArr2.length - size, 0, I9);
                } else {
                    Object[] objArr3 = this.f1952b;
                    C0933m.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1952b;
                    C0933m.i(objArr4, objArr4, 0, size, I9);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f1952b;
                C0933m.i(objArr5, objArr5, length, i9, I9);
            } else {
                Object[] objArr6 = this.f1952b;
                length += objArr6.length;
                int i10 = I9 - i9;
                int length2 = objArr6.length - length;
                if (length2 >= i10) {
                    C0933m.i(objArr6, objArr6, length, i9, I9);
                } else {
                    C0933m.i(objArr6, objArr6, length, i9, i9 + length2);
                    Object[] objArr7 = this.f1952b;
                    C0933m.i(objArr7, objArr7, 0, this.f1951a + length2, I9);
                }
            }
            this.f1951a = length;
            t(G(I9 - size), collection);
        } else {
            int i11 = I9 + size;
            if (I9 < I8) {
                int i12 = size + I8;
                Object[] objArr8 = this.f1952b;
                if (i12 <= objArr8.length) {
                    C0933m.i(objArr8, objArr8, i11, I9, I8);
                } else if (i11 >= objArr8.length) {
                    C0933m.i(objArr8, objArr8, i11 - objArr8.length, I9, I8);
                } else {
                    int length3 = I8 - (i12 - objArr8.length);
                    C0933m.i(objArr8, objArr8, 0, length3, I8);
                    Object[] objArr9 = this.f1952b;
                    C0933m.i(objArr9, objArr9, i11, I9, length3);
                }
            } else {
                Object[] objArr10 = this.f1952b;
                C0933m.i(objArr10, objArr10, size, 0, I8);
                Object[] objArr11 = this.f1952b;
                if (i11 >= objArr11.length) {
                    C0933m.i(objArr11, objArr11, i11 - objArr11.length, I9, objArr11.length);
                } else {
                    C0933m.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1952b;
                    C0933m.i(objArr12, objArr12, i11, I9, objArr12.length - size);
                }
            }
            t(I9, collection);
        }
        return true;
    }

    public C0930j() {
        this.f1952b = f1950e;
    }

    public C0930j(Collection<Object> elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f1952b = array;
        this.f1953c = array.length;
        if (array.length == 0) {
            this.f1952b = f1950e;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
