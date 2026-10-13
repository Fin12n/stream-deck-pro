package p010b0;

import D6.C0933m;
import D6.z;
import M6.eLZq.eGwOBWCdOTaKus;
import R6.b;
import R6.f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2625c;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: b0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1749b implements Collection, Set, b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15591c;

    /* JADX INFO: renamed from: b0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a extends AbstractC1752e {
        public a() {
            super(C1749b.this.u());
        }

        @Override // p010b0.AbstractC1752e
        public Object b(int i8) {
            return C1749b.this.G(i8);
        }

        @Override // p010b0.AbstractC1752e
        public void c(int i8) {
            C1749b.this.A(i8);
        }
    }

    public C1749b() {
        this(0, 1, null);
    }

    public final Object A(int i8) {
        int i9;
        Object[] objArr;
        int iU = u();
        Object obj = o()[i8];
        if (iU <= 1) {
            clear();
            return obj;
        }
        int i10 = iU - 1;
        if (s().length <= 8 || u() >= s().length / 3) {
            if (i8 < i10) {
                int i11 = i8 + 1;
                C0933m.g(s(), s(), i8, i11, iU);
                C0933m.i(o(), o(), i8, i11, iU);
            }
            o()[i10] = null;
        } else {
            int iU2 = u() > 8 ? u() + (u() >> 1) : 8;
            int[] iArrS = s();
            Object[] objArrO = o();
            AbstractC1751d.a(this, iU2);
            if (i8 > 0) {
                C0933m.l(iArrS, s(), 0, 0, i8, 6, null);
                objArr = objArrO;
                C0933m.m(objArr, o(), 0, 0, i8, 6, null);
                i9 = i8;
            } else {
                i9 = i8;
                objArr = objArrO;
            }
            if (i9 < i10) {
                int i12 = i9 + 1;
                C0933m.g(iArrS, s(), i9, i12, iU);
                C0933m.i(objArr, o(), i9, i12, iU);
            }
        }
        if (iU != u()) {
            throw new ConcurrentModificationException();
        }
        F(i10);
        return obj;
    }

    public final void D(Object[] objArr) {
        t.g(objArr, "<set-?>");
        this.f15590b = objArr;
    }

    public final void E(int[] iArr) {
        t.g(iArr, "<set-?>");
        this.f15589a = iArr;
    }

    public final void F(int i8) {
        this.f15591c = i8;
    }

    public final Object G(int i8) {
        return o()[i8];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i8;
        int iC;
        int iU = u();
        if (obj == null) {
            iC = AbstractC1751d.d(this);
            i8 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i8 = iHashCode;
            iC = AbstractC1751d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i9 = ~iC;
        if (iU >= s().length) {
            int i10 = 8;
            if (iU >= 8) {
                i10 = (iU >> 1) + iU;
            } else if (iU < 4) {
                i10 = 4;
            }
            int[] iArrS = s();
            Object[] objArrO = o();
            AbstractC1751d.a(this, i10);
            if (iU != u()) {
                throw new ConcurrentModificationException();
            }
            if (!(s().length == 0)) {
                C0933m.l(iArrS, s(), 0, 0, iArrS.length, 6, null);
                C0933m.m(objArrO, o(), 0, 0, objArrO.length, 6, null);
            }
        }
        if (i9 < iU) {
            int i11 = i9 + 1;
            C0933m.g(s(), s(), i11, i9, iU);
            C0933m.i(o(), o(), i11, i9, iU);
        }
        if (iU != u() || i9 >= s().length) {
            throw new ConcurrentModificationException();
        }
        s()[i9] = i8;
        o()[i9] = obj;
        F(u() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        t.g(elements, "elements");
        m(u() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (u() != 0) {
            E(p019c0.a.f16026a);
            D(p019c0.a.f16028c);
            F(0);
        }
        if (u() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        t.g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iU = u();
            for (int i8 = 0; i8 < iU; i8++) {
                if (!((Set) obj).contains(G(i8))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrS = s();
        int iU = u();
        int i8 = 0;
        for (int i9 = 0; i9 < iU; i9++) {
            i8 += iArrS[i9];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC1751d.d(this) : AbstractC1751d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return u() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final void m(int i8) {
        int iU = u();
        if (s().length < i8) {
            int[] iArrS = s();
            Object[] objArrO = o();
            AbstractC1751d.a(this, i8);
            if (u() > 0) {
                C0933m.l(iArrS, s(), 0, 0, u(), 6, null);
                C0933m.m(objArrO, o(), 0, 0, u(), 6, null);
            }
        }
        if (u() != iU) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object[] o() {
        return this.f15590b;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        A(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        t.g(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public final int[] s() {
        return this.f15589a;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return t();
    }

    public int t() {
        return this.f15591c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C0933m.o(this.f15590b, 0, this.f15591c);
    }

    public final int u() {
        return this.f15591c;
    }

    public final boolean y(C1749b array) {
        t.g(array, "array");
        int iU = array.u();
        int iU2 = u();
        for (int i8 = 0; i8 < iU; i8++) {
            remove(array.G(i8));
        }
        return iU2 != u();
    }

    public C1749b(int i8) {
        this.f15589a = p019c0.a.f16026a;
        this.f15590b = p019c0.a.f16028c;
        if (i8 > 0) {
            AbstractC1751d.a(this, i8);
        }
    }

    public final void c(C1749b c1749b) {
        t.g(c1749b, kDsnNkYbBsI.VwEjn);
        int iU = c1749b.u();
        m(u() + iU);
        if (u() != 0) {
            for (int i8 = 0; i8 < iU; i8++) {
                add(c1749b.G(i8));
            }
            return;
        }
        if (iU > 0) {
            C0933m.l(c1749b.s(), s(), 0, 0, iU, 6, null);
            C0933m.m(c1749b.o(), o(), 0, 0, iU, 6, null);
            if (u() != 0) {
                throw new ConcurrentModificationException();
            }
            F(iU);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        t.g(collection, eGwOBWCdOTaKus.cOgfwUSCg);
        boolean z8 = false;
        for (int iU = u() - 1; -1 < iU; iU--) {
            if (!z.b0(collection, o()[iU])) {
                A(iU);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        t.g(array, "array");
        Object[] result = AbstractC1750c.a(array, this.f15591c);
        C0933m.i(this.f15590b, result, 0, 0, this.f15591c);
        t.f(result, "result");
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(u() * 14);
        sb.append('{');
        int iU = u();
        for (int i8 = 0; i8 < iU; i8++) {
            if (i8 > 0) {
                sb.append(GOKsbdzhLhXAMt.fhFwYoUA);
            }
            Object objG = G(i8);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public /* synthetic */ C1749b(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public C1749b(C1749b c1749b) {
        this(0);
        if (c1749b != null) {
            c(c1749b);
        }
    }

    public C1749b(Collection<Object> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    public C1749b(Object[] objArr) {
        this(0);
        if (objArr != null) {
            Iterator itA = AbstractC2625c.a(objArr);
            while (itA.hasNext()) {
                add(itA.next());
            }
        }
    }
}
