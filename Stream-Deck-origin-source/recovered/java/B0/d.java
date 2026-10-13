package B0;

import D6.C0933m;
import D6.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f896d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f899c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements List, R6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f900a;

        public a(d dVar) {
            this.f900a = dVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f900a.d(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection collection) {
            return this.f900a.f(i8, collection);
        }

        public int c() {
            return this.f900a.s();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f900a.m();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f900a.n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f900a.o(collection);
        }

        @Override // java.util.List
        public Object get(int i8) {
            e.c(this, i8);
            return this.f900a.r()[i8];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f900a.t(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f900a.u();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f900a.y(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        public Object m(int i8) {
            e.c(this, i8);
            return this.f900a.D(i8);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i8) {
            return m(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f900a.A(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f900a.F(collection);
        }

        @Override // java.util.List
        public Object set(int i8, Object obj) {
            e.c(this, i8);
            return this.f900a.G(i8, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        public List subList(int i8, int i9) {
            e.d(this, i8, i9);
            return new b(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC2632j.a(this);
        }

        @Override // java.util.List
        public void add(int i8, Object obj) {
            this.f900a.c(i8, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f900a.i(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i8) {
            return new c(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f900a.z(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC2632j.b(this, objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements List, R6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f903c;

        public b(List<Object> list, int i8, int i9) {
            this.f901a = list;
            this.f902b = i8;
            this.f903c = i9;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f901a;
            int i8 = this.f903c;
            this.f903c = i8 + 1;
            list.add(i8, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection collection) {
            this.f901a.addAll(i8 + this.f902b, collection);
            this.f903c += collection.size();
            return collection.size() > 0;
        }

        public int c() {
            return this.f903c - this.f902b;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i8 = this.f903c - 1;
            int i9 = this.f902b;
            if (i9 <= i8) {
                while (true) {
                    this.f901a.remove(i8);
                    if (i8 == i9) {
                        break;
                    } else {
                        i8--;
                    }
                }
            }
            this.f903c = this.f902b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i8 = this.f903c;
            for (int i9 = this.f902b; i9 < i8; i9++) {
                if (t.c(this.f901a.get(i9), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i8) {
            e.c(this, i8);
            return this.f901a.get(i8 + this.f902b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i8 = this.f903c;
            for (int i9 = this.f902b; i9 < i8; i9++) {
                if (t.c(this.f901a.get(i9), obj)) {
                    return i9 - this.f902b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f903c == this.f902b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i8 = this.f903c - 1;
            int i9 = this.f902b;
            if (i9 > i8) {
                return -1;
            }
            while (!t.c(this.f901a.get(i8), obj)) {
                if (i8 == i9) {
                    return -1;
                }
                i8--;
            }
            return i8 - this.f902b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        public Object m(int i8) {
            e.c(this, i8);
            Object objRemove = this.f901a.remove(i8 + this.f902b);
            this.f903c--;
            return objRemove;
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i8) {
            return m(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i8 = this.f903c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i8 != this.f903c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i8 = this.f903c;
            int i9 = i8 - 1;
            int i10 = this.f902b;
            if (i10 <= i9) {
                while (true) {
                    if (!collection.contains(this.f901a.get(i9))) {
                        this.f901a.remove(i9);
                        this.f903c--;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9--;
                }
            }
            return i8 != this.f903c;
        }

        @Override // java.util.List
        public Object set(int i8, Object obj) {
            e.c(this, i8);
            return this.f901a.set(i8 + this.f902b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        public List subList(int i8, int i9) {
            e.d(this, i8, i9);
            return new b(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC2632j.a(this);
        }

        @Override // java.util.List
        public void add(int i8, Object obj) {
            this.f901a.add(i8 + this.f902b, obj);
            this.f903c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i8) {
            return new c(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i8 = this.f903c;
            for (int i9 = this.f902b; i9 < i8; i9++) {
                if (t.c(this.f901a.get(i9), obj)) {
                    this.f901a.remove(i9);
                    this.f903c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC2632j.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f901a.addAll(this.f903c, collection);
            this.f903c += collection.size();
            return collection.size() > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements ListIterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f905b;

        public c(List<Object> list, int i8) {
            this.f904a = list;
            this.f905b = i8;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f904a.add(this.f905b, obj);
            this.f905b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f905b < this.f904a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f905b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f904a;
            int i8 = this.f905b;
            this.f905b = i8 + 1;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f905b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i8 = this.f905b - 1;
            this.f905b = i8;
            return this.f904a.get(i8);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f905b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i8 = this.f905b - 1;
            this.f905b = i8;
            this.f904a.remove(i8);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f904a.set(this.f905b, obj);
        }
    }

    public d(Object[] objArr, int i8) {
        this.f897a = objArr;
        this.f899c = i8;
    }

    public final boolean A(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i8 = this.f899c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z(it.next());
        }
        return i8 != this.f899c;
    }

    public final Object D(int i8) {
        Object[] objArr = this.f897a;
        Object obj = objArr[i8];
        if (i8 != s() - 1) {
            C0933m.i(objArr, objArr, i8, i8 + 1, this.f899c);
        }
        int i9 = this.f899c - 1;
        this.f899c = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void E(int i8, int i9) {
        if (i9 > i8) {
            int i10 = this.f899c;
            if (i9 < i10) {
                Object[] objArr = this.f897a;
                C0933m.i(objArr, objArr, i8, i9, i10);
            }
            int i11 = this.f899c - (i9 - i8);
            int iS = s() - 1;
            if (i11 <= iS) {
                int i12 = i11;
                while (true) {
                    this.f897a[i12] = null;
                    if (i12 == iS) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f899c = i11;
        }
    }

    public final boolean F(Collection collection) {
        int i8 = this.f899c;
        for (int iS = s() - 1; -1 < iS; iS--) {
            if (!collection.contains(r()[iS])) {
                D(iS);
            }
        }
        return i8 != this.f899c;
    }

    public final Object G(int i8, Object obj) {
        Object[] objArr = this.f897a;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public final void H(int i8) {
        this.f899c = i8;
    }

    public final void I(Comparator comparator) {
        C0933m.D(this.f897a, comparator, 0, this.f899c);
    }

    public final void c(int i8, Object obj) {
        p(this.f899c + 1);
        Object[] objArr = this.f897a;
        int i9 = this.f899c;
        if (i8 != i9) {
            C0933m.i(objArr, objArr, i8 + 1, i8, i9);
        }
        objArr[i8] = obj;
        this.f899c++;
    }

    public final boolean d(Object obj) {
        p(this.f899c + 1);
        Object[] objArr = this.f897a;
        int i8 = this.f899c;
        objArr[i8] = obj;
        this.f899c = i8 + 1;
        return true;
    }

    public final boolean e(int i8, d dVar) {
        if (dVar.u()) {
            return false;
        }
        p(this.f899c + dVar.f899c);
        Object[] objArr = this.f897a;
        int i9 = this.f899c;
        if (i8 != i9) {
            C0933m.i(objArr, objArr, dVar.f899c + i8, i8, i9);
        }
        C0933m.i(dVar.f897a, objArr, i8, 0, dVar.f899c);
        this.f899c += dVar.f899c;
        return true;
    }

    public final boolean f(int i8, Collection collection) {
        int i9 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        p(this.f899c + collection.size());
        Object[] objArr = this.f897a;
        if (i8 != this.f899c) {
            C0933m.i(objArr, objArr, collection.size() + i8, i8, this.f899c);
        }
        for (Object obj : collection) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                r.x();
            }
            objArr[i9 + i8] = obj;
            i9 = i10;
        }
        this.f899c += collection.size();
        return true;
    }

    public final boolean i(Collection collection) {
        return f(this.f899c, collection);
    }

    public final List k() {
        List list = this.f898b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f898b = aVar;
        return aVar;
    }

    public final void m() {
        Object[] objArr = this.f897a;
        int iS = s();
        while (true) {
            iS--;
            if (-1 >= iS) {
                this.f899c = 0;
                return;
            }
            objArr[iS] = null;
        }
    }

    public final boolean n(Object obj) {
        int iS = s() - 1;
        if (iS >= 0) {
            for (int i8 = 0; !t.c(r()[i8], obj); i8++) {
                if (i8 != iS) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean o(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!n(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void p(int i8) {
        Object[] objArr = this.f897a;
        if (objArr.length < i8) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i8, objArr.length * 2));
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f897a = objArrCopyOf;
        }
    }

    public final Object q() {
        if (u()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return r()[0];
    }

    public final Object[] r() {
        return this.f897a;
    }

    public final int s() {
        return this.f899c;
    }

    public final int t(Object obj) {
        int i8 = this.f899c;
        if (i8 <= 0) {
            return -1;
        }
        Object[] objArr = this.f897a;
        int i9 = 0;
        while (!t.c(obj, objArr[i9])) {
            i9++;
            if (i9 >= i8) {
                return -1;
            }
        }
        return i9;
    }

    public final boolean u() {
        return this.f899c == 0;
    }

    public final boolean v() {
        return this.f899c != 0;
    }

    public final Object x() {
        if (u()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return r()[s() - 1];
    }

    public final int y(Object obj) {
        int i8 = this.f899c;
        if (i8 <= 0) {
            return -1;
        }
        int i9 = i8 - 1;
        Object[] objArr = this.f897a;
        while (!t.c(obj, objArr[i9])) {
            i9--;
            if (i9 < 0) {
                return -1;
            }
        }
        return i9;
    }

    public final boolean z(Object obj) {
        int iT = t(obj);
        if (iT < 0) {
            return false;
        }
        D(iT);
        return true;
    }
}
