package p056g1;

import D6.C0933m;
import D6.r;
import L0.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2632j;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: renamed from: g1.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2355t implements List, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23645a = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f23646b = new long[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23647c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23648d;

    /* JADX INFO: renamed from: g1.t$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b implements List, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23654b;

        public b(int i8, int i9) {
            this.f23653a = i8;
            this.f23654b = i9;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i8, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean c(i.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof i.c) {
                return c((i.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((i.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof i.c) {
                return s((i.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C2355t c2355t = C2355t.this;
            int i8 = this.f23653a;
            return c2355t.new a(i8, i8, this.f23654b);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof i.c) {
                return t((i.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            C2355t c2355t = C2355t.this;
            int i8 = this.f23653a;
            return c2355t.new a(i8, i8, this.f23654b);
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public i.c get(int i8) {
            Object obj = C2355t.this.f23645a[i8 + this.f23653a];
            t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        public int o() {
            return this.f23654b - this.f23653a;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int s(i.c cVar) {
            int i8 = this.f23653a;
            int i9 = this.f23654b;
            if (i8 > i9) {
                return -1;
            }
            while (!t.c(C2355t.this.f23645a[i8], cVar)) {
                if (i8 == i9) {
                    return -1;
                }
                i8++;
            }
            return i8 - this.f23653a;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return o();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i8, int i9) {
            C2355t c2355t = C2355t.this;
            int i10 = this.f23653a;
            return c2355t.new b(i8 + i10, i10 + i9);
        }

        public int t(i.c cVar) {
            int i8 = this.f23654b;
            int i9 = this.f23653a;
            if (i9 > i8) {
                return -1;
            }
            while (!t.c(C2355t.this.f23645a[i8], cVar)) {
                if (i8 == i9) {
                    return -1;
                }
                i8--;
            }
            return i8 - this.f23653a;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC2632j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i8) {
            C2355t c2355t = C2355t.this;
            int i9 = this.f23653a;
            return c2355t.new a(i8 + i9, i9, this.f23654b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC2632j.b(this, objArr);
        }
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i.c get(int i8) {
        Object obj = this.f23645a[i8];
        t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (i.c) obj;
    }

    public int D() {
        return this.f23648d;
    }

    public final boolean E() {
        long jY = y();
        return AbstractC2352p.c(jY) < 0.0f && AbstractC2352p.d(jY);
    }

    public final void F(i.c cVar, boolean z8, Function0 function0) {
        G(cVar, -1.0f, z8, function0);
    }

    public final void G(i.c cVar, float f8, boolean z8, Function0 function0) {
        int i8 = this.f23647c;
        this.f23647c = i8 + 1;
        u();
        Object[] objArr = this.f23645a;
        int i9 = this.f23647c;
        objArr[i9] = cVar;
        this.f23646b[i9] = AbstractC2356u.a(f8, z8);
        K();
        function0.invoke();
        this.f23647c = i8;
    }

    public int H(i.c cVar) {
        int iP = r.p(this);
        if (iP < 0) {
            return -1;
        }
        int i8 = 0;
        while (!t.c(this.f23645a[i8], cVar)) {
            if (i8 == iP) {
                return -1;
            }
            i8++;
        }
        return i8;
    }

    public final boolean I(float f8, boolean z8) {
        if (this.f23647c == r.p(this)) {
            return true;
        }
        return AbstractC2352p.a(y(), AbstractC2356u.a(f8, z8)) > 0;
    }

    public int J(i.c cVar) {
        for (int iP = r.p(this); -1 < iP; iP--) {
            if (t.c(this.f23645a[iP], cVar)) {
                return iP;
            }
        }
        return -1;
    }

    public final void K() {
        int i8 = this.f23647c + 1;
        int iP = r.p(this);
        if (i8 <= iP) {
            while (true) {
                this.f23645a[i8] = null;
                if (i8 == iP) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f23648d = this.f23647c + 1;
    }

    public final void L(i.c cVar, float f8, boolean z8, Function0 function0) {
        if (this.f23647c == r.p(this)) {
            G(cVar, f8, z8, function0);
            if (this.f23647c + 1 == r.p(this)) {
                K();
                return;
            }
            return;
        }
        long jY = y();
        int i8 = this.f23647c;
        this.f23647c = r.p(this);
        G(cVar, f8, z8, function0);
        if (this.f23647c + 1 < r.p(this) && AbstractC2352p.a(jY, y()) > 0) {
            int i9 = this.f23647c + 1;
            int i10 = i8 + 1;
            Object[] objArr = this.f23645a;
            C0933m.i(objArr, objArr, i10, i9, size());
            long[] jArr = this.f23646b;
            C0933m.h(jArr, jArr, i10, i9, size());
            this.f23647c = ((size() + i8) - this.f23647c) - 1;
        }
        K();
        this.f23647c = i8;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        this.f23647c = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f23647c = -1;
        K();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i.c) {
            return t((i.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((i.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i.c) {
            return H((i.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i.c) {
            return J((i.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return D();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        return new b(i8, i9);
    }

    public boolean t(i.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public final void u() {
        int i8 = this.f23647c;
        Object[] objArr = this.f23645a;
        if (i8 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f23645a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f23646b, length);
            t.f(jArrCopyOf, "copyOf(this, newSize)");
            this.f23646b = jArrCopyOf;
        }
    }

    public final long y() {
        long jA = AbstractC2356u.a(Float.POSITIVE_INFINITY, false);
        int i8 = this.f23647c + 1;
        int iP = r.p(this);
        if (i8 <= iP) {
            while (true) {
                long jB = AbstractC2352p.b(this.f23646b[i8]);
                if (AbstractC2352p.a(jB, jA) < 0) {
                    jA = jB;
                }
                if ((AbstractC2352p.c(jA) < 0.0f && AbstractC2352p.d(jA)) || i8 == iP) {
                    break;
                }
                i8++;
            }
        }
        return jA;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        return new a(this, i8, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(RaiWHuj.YnUULZSoj);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC2632j.b(this, objArr);
    }

    /* JADX INFO: renamed from: g1.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements ListIterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23651c;

        public a(int i8, int i9, int i10) {
            this.f23649a = i8;
            this.f23650b = i9;
            this.f23651c = i10;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.c next() {
            Object[] objArr = C2355t.this.f23645a;
            int i8 = this.f23649a;
            this.f23649a = i8 + 1;
            Object obj = objArr[i8];
            t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public i.c previous() {
            Object[] objArr = C2355t.this.f23645a;
            int i8 = this.f23649a - 1;
            this.f23649a = i8;
            Object obj = objArr[i8];
            t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23649a < this.f23651c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23649a > this.f23650b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23649a - this.f23650b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f23649a - this.f23650b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C2355t c2355t, int i8, int i9, int i10, int i11, AbstractC2633k abstractC2633k) {
            this((i11 & 1) != 0 ? 0 : i8, (i11 & 2) != 0 ? 0 : i9, (i11 & 4) != 0 ? c2355t.size() : i10);
        }
    }
}
