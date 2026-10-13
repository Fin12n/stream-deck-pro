package B0;

import D6.C0933m;
import D6.z;
import P2.Lsk.mHPawN;
import Q6.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3145c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Set, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f891b = new Object[16];

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f892a;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f892a < b.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArrT = b.this.t();
            int i8 = this.f892a;
            this.f892a = i8 + 1;
            Object obj = objArrT[i8];
            t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: B0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0022b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0022b f894a = new C0022b();

        public C0022b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj.toString();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int iM;
        int size = size();
        Object[] objArr = this.f891b;
        if (size > 0) {
            iM = m(obj);
            if (iM >= 0) {
                return false;
            }
        } else {
            iM = -1;
        }
        int i8 = -(iM + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            C0933m.i(objArr, objArr2, i8 + 1, i8, size);
            C0933m.m(objArr, objArr2, 0, 0, i8, 6, null);
            this.f891b = objArr2;
        } else {
            C0933m.i(objArr, objArr, i8 + 1, i8, size);
        }
        this.f891b[i8] = obj;
        this.f890a = size() + 1;
        return true;
    }

    public final void c(Collection collection) {
        Object[] objArr;
        int i8;
        Object obj;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof b)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.f891b;
        b bVar = (b) collection;
        Object[] objArr3 = bVar.f891b;
        int size = size();
        int size2 = bVar.size();
        int i9 = size + size2;
        boolean z8 = this.f891b.length < i9;
        boolean z9 = size == 0 || AbstractC3145c.c(objArr2[size + (-1)]) < AbstractC3145c.c(objArr3[0]);
        if (!z8 && z9) {
            C0933m.i(objArr3, objArr2, size, 0, size2);
            this.f890a = size() + size2;
            return;
        }
        if (z8) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i10 = size - 1;
        int i11 = size2 - 1;
        int i12 = i9 - 1;
        while (true) {
            if (i10 < 0 && i11 < 0) {
                break;
            }
            if (i10 < 0) {
                i8 = i11 - 1;
                obj = objArr3[i11];
            } else if (i11 < 0) {
                i8 = i11;
                obj = objArr2[i10];
                i10--;
            } else {
                Object obj2 = objArr2[i10];
                Object obj3 = objArr3[i11];
                int iC = AbstractC3145c.c(obj2);
                int iC2 = AbstractC3145c.c(obj3);
                if (iC > iC2) {
                    i10--;
                } else {
                    if (iC >= iC2) {
                        if (obj2 == obj3) {
                            i10--;
                            i11--;
                        } else {
                            int i13 = i10 - 1;
                            while (true) {
                                if (i13 >= 0) {
                                    int i14 = i13 - 1;
                                    Object obj4 = objArr2[i13];
                                    if (AbstractC3145c.c(obj4) == iC2) {
                                        if (obj3 == obj4) {
                                            i11--;
                                        } else {
                                            i13 = i14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i8 = i11 - 1;
                    obj = obj3;
                }
                i8 = i11;
                obj = obj2;
            }
            objArr[i12] = obj;
            i11 = i8;
            i12--;
        }
        if (i12 >= 0) {
            C0933m.i(objArr, objArr, 0, i12 + 1, i9);
        }
        int i15 = i9 - (i12 + 1);
        C0933m.s(objArr, null, i15, i9);
        this.f891b = objArr;
        this.f890a = i15;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        C0933m.w(this.f891b, null, 0, 0, 6, null);
        this.f890a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && m(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public final int m(Object obj) {
        int size = size() - 1;
        int iC = AbstractC3145c.c(obj);
        Object[] objArr = this.f891b;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            Object obj2 = objArr[i9];
            int iC2 = AbstractC3145c.c(obj2);
            if (iC2 < iC) {
                i8 = i9 + 1;
            } else {
                if (iC2 <= iC) {
                    return obj2 == obj ? i9 : o(i9, obj, iC);
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public final int o(int i8, Object obj, int i9) {
        Object obj2;
        Object[] objArr = this.f891b;
        int size = size();
        for (int i10 = i8 - 1; -1 < i10; i10--) {
            Object obj3 = objArr[i10];
            if (obj3 == obj) {
                return i10;
            }
            if (AbstractC3145c.c(obj3) != i9) {
                break;
            }
        }
        do {
            i8++;
            if (i8 >= size) {
                return -(size + 1);
            }
            obj2 = objArr[i8];
            if (obj2 == obj) {
                return i8;
            }
        } while (AbstractC3145c.c(obj2) == i9);
        return -(i8 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM = m(obj);
        Object[] objArr = this.f891b;
        int size = size();
        if (iM < 0) {
            return false;
        }
        int i8 = size - 1;
        if (iM < i8) {
            C0933m.i(objArr, objArr, iM, iM + 1, size);
        }
        objArr[i8] = null;
        this.f890a = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s() {
        return this.f890a;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return s();
    }

    public final Object[] t() {
        return this.f891b;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public String toString() {
        return z.r0(this, null, "[", "]", 0, null, C0022b.f894a, 25, null);
    }

    public final boolean u() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(mHPawN.PSNgLdTbzshW);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC2632j.b(this, objArr);
    }
}
