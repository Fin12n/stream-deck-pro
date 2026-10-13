package D0;

import D6.C0933m;
import W6.n;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b implements C0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1692e;

    public e(Object[] objArr, Object[] objArr2, int i8, int i9) {
        this.f1689b = objArr;
        this.f1690c = objArr2;
        this.f1691d = i8;
        this.f1692e = i9;
        if (size() > 32) {
            G0.a.a(size() - l.d(size()) <= n.g(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    public final e A(Object[] objArr, int i8, Object obj) {
        int size = size() - J();
        Object[] objArrCopyOf = Arrays.copyOf(this.f1690c, 32);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            C0933m.i(this.f1690c, objArrCopyOf, i8 + 1, i8, size);
            objArrCopyOf[i8] = obj;
            return new e(objArr, objArrCopyOf, size() + 1, this.f1692e);
        }
        Object[] objArr2 = this.f1690c;
        Object obj2 = objArr2[31];
        C0933m.i(objArr2, objArrCopyOf, i8 + 1, i8, size - 1);
        objArrCopyOf[i8] = obj;
        return F(objArr, objArrCopyOf, l.c(obj2));
    }

    public final Object[] D(Object[] objArr, int i8, int i9, d dVar) {
        Object[] objArrD;
        int iA = l.a(i9, i8);
        if (i8 == 5) {
            dVar.b(objArr[iA]);
            objArrD = null;
        } else {
            Object obj = objArr[iA];
            t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD = D((Object[]) obj, i8 - 5, i9, dVar);
        }
        if (objArrD == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrD;
        return objArrCopyOf;
    }

    public final C0.e E(Object[] objArr, int i8, int i9) {
        if (i9 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                t.f(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] objArrD = D(objArr, i9, i8 - 1, dVar);
        t.d(objArrD);
        Object objA = dVar.a();
        t.e(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        if (objArrD[1] != null) {
            return new e(objArrD, objArr2, i8, i9);
        }
        Object obj = objArrD[0];
        t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr2, i8, i9 - 5);
    }

    public final e F(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i8 = this.f1692e;
        if (size <= (1 << i8)) {
            return new e(G(objArr, i8, objArr2), objArr3, size() + 1, this.f1692e);
        }
        Object[] objArrC = l.c(objArr);
        int i9 = this.f1692e + 5;
        return new e(G(objArrC, i9, objArr2), objArr3, size() + 1, i9);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public final Object[] G(Object[] objArr, int i8, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iA = l.a(size() - 1, i8);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i8 == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = G((Object[]) objArrCopyOf[iA], i8 - 5, objArr2);
        return objArrCopyOf;
    }

    public final Object[] H(Object[] objArr, int i8, int i9, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i9, i8);
        if (i8 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                t.f(objArrCopyOf, "copyOf(this, newSize)");
            }
            C0933m.i(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = dVar.a();
            dVar.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? l.a(J() - 1, i8) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        t.f(objArrCopyOf2, "copyOf(this, newSize)");
        int i10 = i8 - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = H((Object[]) obj, i10, 0, dVar);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = H((Object[]) obj2, i10, i9, dVar);
        return objArrCopyOf2;
    }

    public final C0.e I(Object[] objArr, int i8, int i9, int i10) {
        int size = size() - i8;
        G0.a.a(i10 < size);
        if (size == 1) {
            return E(objArr, i8, i9);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f1690c, 32);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        int i11 = size - 1;
        if (i10 < i11) {
            C0933m.i(this.f1690c, objArrCopyOf, i10, i10 + 1, size);
        }
        objArrCopyOf[i11] = null;
        return new e(objArr, objArrCopyOf, (i8 + size) - 1, i9);
    }

    public final int J() {
        return l.d(size());
    }

    public final Object[] K(Object[] objArr, int i8, int i9, Object obj) {
        int iA = l.a(i9, i8);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        if (i8 == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = K((Object[]) obj2, i8 - 5, i9, obj);
        return objArrCopyOf;
    }

    @Override // java.util.Collection, java.util.List, C0.e
    public C0.e add(Object obj) {
        int size = size() - J();
        if (size >= 32) {
            return F(this.f1689b, this.f1690c, l.c(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f1690c, 32);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = obj;
        return new e(this.f1689b, objArrCopyOf, size() + 1, this.f1692e);
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f1691d;
    }

    @Override // D6.AbstractC0922b, java.util.List
    public Object get(int i8) {
        G0.d.a(i8, size());
        return o(i8)[i8 & 31];
    }

    @Override // C0.e
    public C0.e i(Q6.k kVar) {
        f fVarBuilder = builder();
        fVarBuilder.a0(kVar);
        return fVarBuilder.build();
    }

    @Override // D6.AbstractC0922b, java.util.List
    public ListIterator listIterator(int i8) {
        G0.d.b(i8, size());
        return new g(this.f1689b, this.f1690c, i8, size(), (this.f1692e / 5) + 1);
    }

    public final Object[] o(int i8) {
        if (J() <= i8) {
            return this.f1690c;
        }
        Object[] objArr = this.f1689b;
        for (int i9 = this.f1692e; i9 > 0; i9 -= 5) {
            Object[] objArr2 = objArr[l.a(i8, i9)];
            t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // C0.e
    public C0.e q(int i8) {
        G0.d.a(i8, size());
        int iJ = J();
        return i8 >= iJ ? I(this.f1689b, iJ, this.f1692e, i8 - iJ) : I(H(this.f1689b, this.f1692e, i8, new d(this.f1690c[0])), iJ, this.f1692e, 0);
    }

    @Override // D6.AbstractC0922b, java.util.List, C0.e
    public C0.e set(int i8, Object obj) {
        G0.d.a(i8, size());
        if (J() > i8) {
            return new e(K(this.f1689b, this.f1692e, i8, obj), this.f1690c, size(), this.f1692e);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f1690c, 32);
        t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i8 & 31] = obj;
        return new e(this.f1689b, objArrCopyOf, size(), this.f1692e);
    }

    @Override // C0.e
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public f builder() {
        return new f(this, this.f1689b, this.f1690c, this.f1692e);
    }

    public final Object[] y(Object[] objArr, int i8, int i9, Object obj, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i9, i8);
        if (i8 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                t.f(objArrCopyOf, "copyOf(this, newSize)");
            }
            C0933m.i(objArr, objArrCopyOf, iA + 1, iA, 31);
            dVar.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        t.f(objArrCopyOf2, "copyOf(this, newSize)");
        int i10 = i8 - 5;
        Object obj2 = objArr[iA];
        t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = y((Object[]) obj2, i10, i9, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            t.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = y((Object[]) obj3, i10, 0, dVar.a(), dVar);
        }
        return objArrCopyOf2;
    }

    @Override // java.util.List, C0.e
    public C0.e add(int i8, Object obj) {
        G0.d.b(i8, size());
        if (i8 == size()) {
            return add(obj);
        }
        int iJ = J();
        if (i8 >= iJ) {
            return A(this.f1689b, i8 - iJ, obj);
        }
        d dVar = new d(null);
        return A(y(this.f1689b, this.f1692e, i8, obj, dVar), 0, dVar.a());
    }
}
