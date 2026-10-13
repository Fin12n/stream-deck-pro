package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2027j extends AbstractC2015g implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2077x f18915b = new C2019h(C2051p.f18994e, 0);

    public static AbstractC2027j E(Object[] objArr, int i8) {
        return i8 == 0 ? C2051p.f18994e : new C2051p(objArr, i8);
    }

    public static AbstractC2027j F(Collection collection) {
        if (collection instanceof AbstractC2015g) {
            AbstractC2027j abstractC2027jY = ((AbstractC2015g) collection).y();
            if (!abstractC2027jY.z()) {
                return abstractC2027jY;
            }
            Object[] array = abstractC2027jY.toArray();
            return E(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (array2[i8] == null) {
                throw new NullPointerException("at index " + i8);
            }
        }
        return E(array2, array2.length);
    }

    public static AbstractC2027j G() {
        return C2051p.f18994e;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC2027j subList(int i8, int i9) {
        AbstractC1995b.d(i8, i9, size());
        int i10 = i9 - i8;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? C2051p.f18994e : new C2023i(this, i8, i10);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final AbstractC2077x listIterator(int i8) {
        AbstractC1995b.b(i8, size(), "index");
        return isEmpty() ? f18915b : new C2019h(this, i8);
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public int c(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i8 = 0; i8 < size; i8++) {
                if (!R2.a(get(i8), list.get(i8))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !R2.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i8 = 0; i8 < size; i8++) {
            iHashCode = (iHashCode * 31) + get(i8).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (obj.equals(get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final AbstractC2027j y() {
        return this;
    }
}
