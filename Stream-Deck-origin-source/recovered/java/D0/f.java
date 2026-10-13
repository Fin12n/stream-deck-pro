package D0;

import D6.AbstractC0925e;
import D6.C0933m;
import W6.n;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2625c;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0925e implements C0.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0.e f1693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f1694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G0.e f1697e = new G0.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f1698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f1699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1700h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f1701a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Collection collection) {
            super(1);
            this.f1701a = collection;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f1701a.contains(obj));
        }
    }

    public f(C0.e eVar, Object[] objArr, Object[] objArr2, int i8) {
        this.f1693a = eVar;
        this.f1694b = objArr;
        this.f1695c = objArr2;
        this.f1696d = i8;
        this.f1698f = this.f1694b;
        this.f1699g = this.f1695c;
        this.f1700h = this.f1693a.size();
    }

    private final Object[] H(Object[] objArr, int i8, int i9, Object obj, d dVar) {
        Object obj2;
        int iA = l.a(i9, i8);
        if (i8 == 0) {
            dVar.b(objArr[31]);
            Object[] objArrI = C0933m.i(objArr, L(objArr), iA + 1, iA, 31);
            objArrI[iA] = obj;
            return objArrI;
        }
        Object[] objArrL = L(objArr);
        int i10 = i8 - 5;
        Object obj3 = objArrL[iA];
        t.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrL[iA] = H((Object[]) obj3, i10, i9, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrL[iA]) == null) {
                break;
            }
            t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrL[iA] = H((Object[]) obj2, i10, 0, dVar.a(), dVar);
        }
        return objArrL;
    }

    private final Object[] Q(Object[] objArr, int i8, int i9, d dVar) {
        Object[] objArrQ;
        int iA = l.a(i9 - 1, i8);
        if (i8 == 5) {
            dVar.b(objArr[iA]);
            objArrQ = null;
        } else {
            Object obj = objArr[iA];
            t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ = Q((Object[]) obj, i8 - 5, i9, dVar);
        }
        if (objArrQ == null && iA == 0) {
            return null;
        }
        Object[] objArrL = L(objArr);
        objArrL[iA] = objArrQ;
        return objArrL;
    }

    private final Object[] b0(Object[] objArr, int i8, int i9, d dVar) {
        int iA = l.a(i9, i8);
        if (i8 == 0) {
            Object obj = objArr[iA];
            Object[] objArrI = C0933m.i(objArr, L(objArr), iA, iA + 1, 32);
            objArrI[31] = dVar.a();
            dVar.b(obj);
            return objArrI;
        }
        int iA2 = objArr[31] == null ? l.a(e0() - 1, i8) : 31;
        Object[] objArrL = L(objArr);
        int i10 = i8 - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj2 = objArrL[iA2];
                t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrL[iA2] = b0((Object[]) obj2, i10, 0, dVar);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrL[iA];
        t.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrL[iA] = b0((Object[]) obj3, i10, i9, dVar);
        return objArrL;
    }

    private final int e0() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] t(int i8) {
        if (e0() <= i8) {
            return this.f1699g;
        }
        Object[] objArr = this.f1698f;
        t.d(objArr);
        for (int i9 = this.f1696d; i9 > 0; i9 -= 5) {
            Object[] objArr2 = objArr[l.a(i8, i9)];
            t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    public final int A() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] D() {
        return this.f1698f;
    }

    public final int E() {
        return this.f1696d;
    }

    public final Object[] F() {
        return this.f1699g;
    }

    public final void G(Collection collection, int i8, int i9, Object[][] objArr, int i10, Object[] objArr2) {
        Object[] objArr3;
        if (this.f1698f == null) {
            throw new IllegalStateException("root is null");
        }
        int i11 = i8 >> 5;
        Object[] objArrG0 = g0(i11, i9, objArr, i10, objArr2);
        int iE0 = i10 - (((e0() >> 5) - 1) - i11);
        if (iE0 < i10) {
            Object[] objArr4 = objArr[iE0];
            t.d(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        h0(collection, i8, objArrG0, 32, objArr, iE0, objArr3);
    }

    public final void I(Object[] objArr, int i8, Object obj) {
        int iI0 = i0();
        Object[] objArrL = L(this.f1699g);
        if (iI0 < 32) {
            C0933m.i(this.f1699g, objArrL, i8 + 1, i8, iI0);
            objArrL[i8] = obj;
            this.f1698f = objArr;
            this.f1699g = objArrL;
            this.f1700h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f1699g;
        Object obj2 = objArr2[31];
        C0933m.i(objArr2, objArrL, i8 + 1, i8, 31);
        objArrL[i8] = obj;
        U(objArr, objArrL, O(obj2));
    }

    public final boolean J(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f1697e;
    }

    public final ListIterator K(int i8) {
        Object[] objArr = this.f1698f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iE0 = e0() >> 5;
        G0.d.b(i8, iE0);
        int i9 = this.f1696d;
        return i9 == 0 ? new i(objArr, i8) : new k(objArr, i8, iE0, i9 / 5);
    }

    public final Object[] L(Object[] objArr) {
        if (objArr == null) {
            return N();
        }
        return J(objArr) ? objArr : C0933m.m(objArr, N(), 0, 0, n.g(objArr.length, 32), 6, null);
    }

    public final Object[] M(Object[] objArr, int i8) {
        return J(objArr) ? C0933m.i(objArr, objArr, i8, 0, 32 - i8) : C0933m.i(objArr, N(), i8, 0, 32 - i8);
    }

    public final Object[] N() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f1697e;
        return objArr;
    }

    public final Object[] O(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f1697e;
        return objArr;
    }

    public final Object[] P(Object[] objArr, int i8, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("shift should be positive");
        }
        if (i9 == 0) {
            return objArr;
        }
        int iA = l.a(i8, i9);
        Object obj = objArr[iA];
        t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objP = P((Object[]) obj, i8, i9 - 5);
        if (iA < 31) {
            int i10 = iA + 1;
            if (objArr[i10] != null) {
                if (J(objArr)) {
                    C0933m.s(objArr, null, i10, 32);
                }
                objArr = C0933m.i(objArr, N(), 0, 0, i10);
            }
        }
        if (objP == objArr[iA]) {
            return objArr;
        }
        Object[] objArrL = L(objArr);
        objArrL[iA] = objP;
        return objArrL;
    }

    public final void R(Object[] objArr, int i8, int i9) {
        if (i9 == 0) {
            this.f1698f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f1699g = objArr;
            this.f1700h = i8;
            this.f1696d = i9;
            return;
        }
        d dVar = new d(null);
        t.d(objArr);
        Object[] objArrQ = Q(objArr, i9, i8, dVar);
        t.d(objArrQ);
        Object objA = dVar.a();
        t.e(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f1699g = (Object[]) objA;
        this.f1700h = i8;
        if (objArrQ[1] == null) {
            this.f1698f = (Object[]) objArrQ[0];
            this.f1696d = i9 - 5;
        } else {
            this.f1698f = objArrQ;
            this.f1696d = i9;
        }
    }

    public final Object[] S(Object[] objArr, int i8, int i9, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalArgumentException("invalid buffersIterator");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("negative shift");
        }
        if (i9 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrL = L(objArr);
        int iA = l.a(i8, i9);
        int i10 = i9 - 5;
        objArrL[iA] = S((Object[]) objArrL[iA], i8, i10, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrL[iA] = S((Object[]) objArrL[iA], 0, i10, it);
        }
        return objArrL;
    }

    public final Object[] T(Object[] objArr, int i8, Object[][] objArr2) {
        Iterator itA = AbstractC2625c.a(objArr2);
        int i9 = i8 >> 5;
        int i10 = this.f1696d;
        Object[] objArrS = i9 < (1 << i10) ? S(objArr, i8, i10, itA) : L(objArr);
        while (itA.hasNext()) {
            this.f1696d += 5;
            objArrS = O(objArrS);
            int i11 = this.f1696d;
            S(objArrS, 1 << i11, i11, itA);
        }
        return objArrS;
    }

    public final void U(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i8 = this.f1696d;
        if (size > (1 << i8)) {
            this.f1698f = V(O(objArr), objArr2, this.f1696d + 5);
            this.f1699g = objArr3;
            this.f1696d += 5;
            this.f1700h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f1698f = objArr2;
            this.f1699g = objArr3;
            this.f1700h = size() + 1;
        } else {
            this.f1698f = V(objArr, objArr2, i8);
            this.f1699g = objArr3;
            this.f1700h = size() + 1;
        }
    }

    public final Object[] V(Object[] objArr, Object[] objArr2, int i8) {
        int iA = l.a(size() - 1, i8);
        Object[] objArrL = L(objArr);
        if (i8 == 5) {
            objArrL[iA] = objArr2;
            return objArrL;
        }
        objArrL[iA] = V((Object[]) objArrL[iA], objArr2, i8 - 5);
        return objArrL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int W(Q6.k kVar, Object[] objArr, int i8, int i9, d dVar, List list, List list2) {
        if (J(objArr)) {
            list.add(objArr);
        }
        Object objA = dVar.a();
        t.e(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrN = objArr2;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (!((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (i9 == 32) {
                    objArrN = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : N();
                    i9 = 0;
                }
                objArrN[i9] = obj;
                i9++;
            }
        }
        dVar.b(objArrN);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i9;
    }

    public final int X(Q6.k kVar, Object[] objArr, int i8, d dVar) {
        Object[] objArrL = objArr;
        int i9 = i8;
        boolean z8 = false;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (!z8) {
                    objArrL = L(objArr);
                    z8 = true;
                    i9 = i10;
                }
            } else if (z8) {
                objArrL[i9] = obj;
                i9++;
            }
        }
        dVar.b(objArrL);
        return i9;
    }

    public final boolean Y(Q6.k kVar) {
        Object[] objArrS;
        int iI0 = i0();
        d dVar = new d(null);
        if (this.f1698f == null) {
            return Z(kVar, iI0, dVar) != iI0;
        }
        ListIterator listIteratorK = K(0);
        int iX = 32;
        while (iX == 32 && listIteratorK.hasNext()) {
            iX = X(kVar, (Object[]) listIteratorK.next(), 32, dVar);
        }
        if (iX == 32) {
            G0.a.a(!listIteratorK.hasNext());
            int iZ = Z(kVar, iI0, dVar);
            if (iZ == 0) {
                R(this.f1698f, size(), this.f1696d);
            }
            return iZ != iI0;
        }
        int iPreviousIndex = listIteratorK.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iW = iX;
        while (listIteratorK.hasNext()) {
            iW = W(kVar, (Object[]) listIteratorK.next(), 32, iW, dVar, arrayList2, arrayList);
        }
        int iW2 = W(kVar, this.f1699g, iI0, iW, dVar, arrayList2, arrayList);
        Object objA = dVar.a();
        t.e(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        C0933m.s(objArr, null, iW2, 32);
        if (arrayList.isEmpty()) {
            objArrS = this.f1698f;
            t.d(objArrS);
        } else {
            objArrS = S(this.f1698f, iPreviousIndex, this.f1696d, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.f1698f = d0(objArrS, size);
        this.f1699g = objArr;
        this.f1700h = size + iW2;
        return true;
    }

    public final int Z(Q6.k kVar, int i8, d dVar) {
        int iX = X(kVar, this.f1699g, i8, dVar);
        if (iX == i8) {
            G0.a.a(dVar.a() == this.f1699g);
            return i8;
        }
        Object objA = dVar.a();
        t.e(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        C0933m.s(objArr, null, iX, i8);
        this.f1699g = objArr;
        this.f1700h = size() - (i8 - iX);
        return iX;
    }

    public final boolean a0(Q6.k kVar) {
        boolean zY = Y(kVar);
        if (zY) {
            ((AbstractList) this).modCount++;
        }
        return zY;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iI0 = i0();
        if (iI0 < 32) {
            Object[] objArrL = L(this.f1699g);
            objArrL[iI0] = obj;
            this.f1699g = objArrL;
            this.f1700h = size() + 1;
        } else {
            U(this.f1698f, this.f1699g, O(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iI0 = i0();
        Iterator it = collection.iterator();
        if (32 - iI0 >= collection.size()) {
            this.f1699g = y(L(this.f1699g), iI0, it);
            this.f1700h = size() + collection.size();
        } else {
            int size = ((collection.size() + iI0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = y(L(this.f1699g), iI0, it);
            for (int i8 = 1; i8 < size; i8++) {
                objArr[i8] = y(N(), 0, it);
            }
            this.f1698f = T(this.f1698f, e0(), objArr);
            this.f1699g = y(N(), 0, it);
            this.f1700h = size() + collection.size();
        }
        return true;
    }

    @Override // C0.e.a
    public C0.e build() {
        C0.e eVar;
        if (this.f1698f == this.f1694b && this.f1699g == this.f1695c) {
            eVar = this.f1693a;
        } else {
            this.f1697e = new G0.e();
            Object[] objArr = this.f1698f;
            this.f1694b = objArr;
            Object[] objArr2 = this.f1699g;
            this.f1695c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f1698f;
                t.d(objArr3);
                eVar = new e(objArr3, this.f1699g, size(), this.f1696d);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f1699g, size());
                t.f(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.f1693a = eVar;
        return eVar;
    }

    @Override // D6.AbstractC0925e
    public int c() {
        return this.f1700h;
    }

    public final Object c0(Object[] objArr, int i8, int i9, int i10) {
        int size = size() - i8;
        G0.a.a(i10 < size);
        if (size == 1) {
            Object obj = this.f1699g[0];
            R(objArr, i8, i9);
            return obj;
        }
        Object[] objArr2 = this.f1699g;
        Object obj2 = objArr2[i10];
        Object[] objArrI = C0933m.i(objArr2, L(objArr2), i10, i10 + 1, size);
        objArrI[size - 1] = null;
        this.f1698f = objArr;
        this.f1699g = objArrI;
        this.f1700h = (i8 + size) - 1;
        this.f1696d = i9;
        return obj2;
    }

    public final Object[] d0(Object[] objArr, int i8) {
        if ((i8 & 31) != 0) {
            throw new IllegalArgumentException("invalid size");
        }
        if (i8 == 0) {
            this.f1696d = 0;
            return null;
        }
        int i9 = i8 - 1;
        while (true) {
            int i10 = this.f1696d;
            if ((i9 >> i10) != 0) {
                return P(objArr, i9, i10);
            }
            this.f1696d = i10 - 5;
            Object[] objArr2 = objArr[0];
            t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    public final Object[] f0(Object[] objArr, int i8, int i9, Object obj, d dVar) {
        int iA = l.a(i9, i8);
        Object[] objArrL = L(objArr);
        if (i8 != 0) {
            Object obj2 = objArrL[iA];
            t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrL[iA] = f0((Object[]) obj2, i8 - 5, i9, obj, dVar);
            return objArrL;
        }
        if (objArrL != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.b(objArrL[iA]);
        objArrL[iA] = obj;
        return objArrL;
    }

    public final Object[] g0(int i8, int i9, Object[][] objArr, int i10, Object[] objArr2) {
        if (this.f1698f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorK = K(e0() >> 5);
        while (listIteratorK.previousIndex() != i8) {
            Object[] objArr3 = (Object[]) listIteratorK.previous();
            C0933m.i(objArr3, objArr2, 0, 32 - i9, 32);
            objArr2 = M(objArr3, i9);
            i10--;
            objArr[i10] = objArr2;
        }
        return (Object[]) listIteratorK.previous();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        G0.d.a(i8, size());
        return t(i8)[i8 & 31];
    }

    public final void h0(Collection collection, int i8, Object[] objArr, int i9, Object[][] objArr2, int i10, Object[] objArr3) {
        Object[] objArrN;
        if (i10 < 1) {
            throw new IllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrL = L(objArr);
        objArr2[0] = objArrL;
        int i11 = i8 & 31;
        int size = ((i8 + collection.size()) - 1) & 31;
        int i12 = (i9 - i11) + size;
        if (i12 < 32) {
            C0933m.i(objArrL, objArr3, size + 1, i11, i9);
        } else {
            int i13 = i12 - 31;
            if (i10 == 1) {
                objArrN = objArrL;
            } else {
                objArrN = N();
                i10--;
                objArr2[i10] = objArrN;
            }
            int i14 = i9 - i13;
            C0933m.i(objArrL, objArr3, 0, i14, i9);
            C0933m.i(objArrL, objArrN, size + 1, i11, i14);
            objArr3 = objArrN;
        }
        Iterator it = collection.iterator();
        y(objArrL, i11, it);
        for (int i15 = 1; i15 < i10; i15++) {
            objArr2[i15] = y(N(), 0, it);
        }
        y(objArr3, 0, it);
    }

    public final int i0() {
        return j0(size());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    public final int j0(int i8) {
        return i8 <= 32 ? i8 : i8 - l.d(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // D6.AbstractC0925e
    public Object o(int i8) {
        G0.d.a(i8, size());
        ((AbstractList) this).modCount++;
        int iE0 = e0();
        if (i8 >= iE0) {
            return c0(this.f1698f, iE0, this.f1696d, i8 - iE0);
        }
        d dVar = new d(this.f1699g[0]);
        Object[] objArr = this.f1698f;
        t.d(objArr);
        c0(b0(objArr, this.f1696d, i8, dVar), iE0, this.f1696d, 0);
        return dVar.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        return a0(new a(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        G0.d.a(i8, size());
        if (e0() > i8) {
            d dVar = new d(null);
            Object[] objArr = this.f1698f;
            t.d(objArr);
            this.f1698f = f0(objArr, this.f1696d, i8, obj, dVar);
            return dVar.a();
        }
        Object[] objArrL = L(this.f1699g);
        if (objArrL != this.f1699g) {
            ((AbstractList) this).modCount++;
        }
        int i9 = i8 & 31;
        Object obj2 = objArrL[i9];
        objArrL[i9] = obj;
        this.f1699g = objArrL;
        return obj2;
    }

    public final Object[] y(Object[] objArr, int i8, Iterator it) {
        while (i8 < 32 && it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        G0.d.b(i8, size());
        return new h(this, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        G0.d.b(i8, size());
        if (i8 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iE0 = e0();
        if (i8 >= iE0) {
            I(this.f1698f, i8 - iE0, obj);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f1698f;
        t.d(objArr);
        I(H(objArr, this.f1696d, i8, obj, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        f fVar;
        Collection collection2;
        Object[] objArrI;
        Object[][] objArr;
        G0.d.b(i8, size());
        if (i8 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i9 = (i8 >> 5) << 5;
        int size = (((size() - i9) + collection.size()) - 1) / 32;
        if (size == 0) {
            G0.a.a(i8 >= e0());
            int i10 = i8 & 31;
            int size2 = ((i8 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.f1699g;
            Object[] objArrI2 = C0933m.i(objArr2, L(objArr2), size2 + 1, i10, i0());
            y(objArrI2, i10, collection.iterator());
            this.f1699g = objArrI2;
            this.f1700h = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iI0 = i0();
        int iJ0 = j0(size() + collection.size());
        if (i8 >= e0()) {
            objArrI = N();
            objArr = objArr3;
            fVar = this;
            collection2 = collection;
            fVar.h0(collection2, i8, this.f1699g, iI0, objArr, size, objArrI);
        } else {
            fVar = this;
            collection2 = collection;
            if (iJ0 > iI0) {
                int i11 = iJ0 - iI0;
                Object[] objArrM = M(fVar.f1699g, i11);
                fVar.G(collection2, i8, i11, objArr3, size, objArrM);
                objArr = objArr3;
                objArrI = objArrM;
            } else {
                int i12 = iI0 - iJ0;
                objArrI = C0933m.i(fVar.f1699g, N(), 0, i12, iI0);
                int i13 = 32 - i12;
                Object[] objArrM2 = M(fVar.f1699g, i13);
                int i14 = size - 1;
                objArr3[i14] = objArrM2;
                fVar.G(collection2, i8, i13, objArr3, i14, objArrM2);
                collection2 = collection2;
                objArr = objArr3;
                fVar = fVar;
            }
        }
        fVar.f1698f = T(fVar.f1698f, i9, objArr);
        fVar.f1699g = objArrI;
        fVar.f1700h = size() + collection2.size();
        return true;
    }
}
