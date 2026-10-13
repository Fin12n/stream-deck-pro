package E0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2016e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f2017f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f2018g = new t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G0.e f2021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f2022d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final t a() {
            return t.f2018g;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f2023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2024b;

        public b(t tVar, int i8) {
            this.f2023a = tVar;
            this.f2024b = i8;
        }

        public final t a() {
            return this.f2023a;
        }

        public final int b() {
            return this.f2024b;
        }

        public final void c(t tVar) {
            this.f2023a = tVar;
        }
    }

    public t(int i8, int i9, Object[] objArr, G0.e eVar) {
        this.f2019a = i8;
        this.f2020b = i9;
        this.f2021c = eVar;
        this.f2022d = objArr;
    }

    public final t A(int i8, f fVar) {
        fVar.m(fVar.size() - 1);
        fVar.k(W(i8));
        if (this.f2022d.length == 2) {
            return null;
        }
        if (this.f2021c != fVar.h()) {
            return new t(0, 0, x.h(this.f2022d, i8), fVar.h());
        }
        this.f2022d = x.h(this.f2022d, i8);
        return this;
    }

    public final t B(int i8, Object obj, Object obj2, G0.e eVar) {
        int iN = n(i8);
        if (this.f2021c != eVar) {
            return new t(i8 | this.f2019a, this.f2020b, x.g(this.f2022d, iN, obj, obj2), eVar);
        }
        this.f2022d = x.g(this.f2022d, iN, obj, obj2);
        this.f2019a = i8 | this.f2019a;
        return this;
    }

    public final t C(int i8, int i9, int i10, Object obj, Object obj2, int i11, G0.e eVar) {
        if (this.f2021c != eVar) {
            return new t(this.f2019a ^ i9, i9 | this.f2020b, d(i8, i9, i10, obj, obj2, i11, eVar), eVar);
        }
        this.f2022d = d(i8, i9, i10, obj, obj2, i11, eVar);
        this.f2019a ^= i9;
        this.f2020b |= i9;
        return this;
    }

    public final t D(int i8, Object obj, Object obj2, int i9, f fVar) {
        f fVar2;
        t tVarD;
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            int iN = n(iF);
            if (kotlin.jvm.internal.t.c(obj, t(iN))) {
                fVar.k(W(iN));
                return W(iN) == obj2 ? this : M(iN, obj2, fVar);
            }
            fVar.m(fVar.size() + 1);
            return C(iN, iF, i8, obj, obj2, i9, fVar.h());
        }
        if (!r(iF)) {
            fVar.m(fVar.size() + 1);
            return B(iF, obj, obj2, fVar.h());
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i9 == 30) {
            tVarD = tVarN.w(obj, obj2, fVar);
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            tVarD = tVarN.D(i8, obj, obj2, i9 + 5, fVar2);
        }
        return tVarN == tVarD ? this : L(iO, tVarD, fVar2.h());
    }

    public final t E(t tVar, int i8, G0.b bVar, f fVar) {
        if (this == tVar) {
            bVar.b(e());
            return this;
        }
        int i9 = i8;
        if (i9 > 30) {
            return x(tVar, bVar, fVar.h());
        }
        int i10 = this.f2020b | tVar.f2020b;
        int i11 = this.f2019a;
        int i12 = tVar.f2019a;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i14);
            if (kotlin.jvm.internal.t.c(t(n(iLowestOneBit)), tVar.t(tVar.n(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i10 |= iLowestOneBit;
            }
            i14 ^= iLowestOneBit;
        }
        if ((i10 & i15) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        t tVar2 = (kotlin.jvm.internal.t.c(this.f2021c, fVar.h()) && this.f2019a == i15 && this.f2020b == i10) ? this : new t(i15, i10, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i10)]);
        int i16 = 0;
        int i17 = i10;
        int i18 = 0;
        while (i17 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i17);
            Object[] objArr = tVar2.f2022d;
            objArr[(objArr.length - 1) - i18] = F(tVar, iLowestOneBit2, i9, bVar, fVar);
            i18++;
            i17 ^= iLowestOneBit2;
            i9 = i8;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i19 = i16 * 2;
            if (tVar.q(iLowestOneBit3)) {
                int iN = tVar.n(iLowestOneBit3);
                tVar2.f2022d[i19] = tVar.t(iN);
                tVar2.f2022d[i19 + 1] = tVar.W(iN);
                if (q(iLowestOneBit3)) {
                    bVar.c(bVar.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                tVar2.f2022d[i19] = t(iN2);
                tVar2.f2022d[i19 + 1] = W(iN2);
            }
            i16++;
            i15 ^= iLowestOneBit3;
        }
        if (l(tVar2)) {
            return this;
        }
        return tVar.l(tVar2) ? tVar : tVar2;
    }

    public final t F(t tVar, int i8, int i9, G0.b bVar, f fVar) {
        if (r(i8)) {
            t tVarN = N(O(i8));
            if (tVar.r(i8)) {
                return tVarN.E(tVar.N(tVar.O(i8)), i9 + 5, bVar, fVar);
            }
            if (!tVar.q(i8)) {
                return tVarN;
            }
            int iN = tVar.n(i8);
            Object objT = tVar.t(iN);
            Object objW = tVar.W(iN);
            int size = fVar.size();
            t tVarD = tVarN.D(objT != null ? objT.hashCode() : 0, objT, objW, i9 + 5, fVar);
            if (fVar.size() == size) {
                bVar.c(bVar.a() + 1);
            }
            return tVarD;
        }
        if (!tVar.r(i8)) {
            int iN2 = n(i8);
            Object objT2 = t(iN2);
            Object objW2 = W(iN2);
            int iN3 = tVar.n(i8);
            Object objT3 = tVar.t(iN3);
            return u(objT2 != null ? objT2.hashCode() : 0, objT2, objW2, objT3 != null ? objT3.hashCode() : 0, objT3, tVar.W(iN3), i9 + 5, fVar.h());
        }
        t tVarN2 = tVar.N(tVar.O(i8));
        if (!q(i8)) {
            return tVarN2;
        }
        int iN4 = n(i8);
        Object objT4 = t(iN4);
        int i10 = i9 + 5;
        if (!tVarN2.k(objT4 != null ? objT4.hashCode() : 0, objT4, i10)) {
            return tVarN2.D(objT4 != null ? objT4.hashCode() : 0, objT4, W(iN4), i10, fVar);
        }
        bVar.c(bVar.a() + 1);
        return tVarN2;
    }

    public final t G(int i8, Object obj, int i9, f fVar) {
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            int iN = n(iF);
            if (kotlin.jvm.internal.t.c(obj, t(iN))) {
                return I(iN, iF, fVar);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return K(tVarN, i9 == 30 ? tVarN.y(obj, fVar) : tVarN.G(i8, obj, i9 + 5, fVar), iO, iF, fVar.h());
        }
        return this;
    }

    public final t H(int i8, Object obj, Object obj2, int i9, f fVar) {
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            int iN = n(iF);
            if (kotlin.jvm.internal.t.c(obj, t(iN)) && kotlin.jvm.internal.t.c(obj2, W(iN))) {
                return I(iN, iF, fVar);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return K(tVarN, i9 == 30 ? tVarN.z(obj, obj2, fVar) : tVarN.H(i8, obj, obj2, i9 + 5, fVar), iO, iF, fVar.h());
        }
        return this;
    }

    public final t I(int i8, int i9, f fVar) {
        fVar.m(fVar.size() - 1);
        fVar.k(W(i8));
        if (this.f2022d.length == 2) {
            return null;
        }
        if (this.f2021c != fVar.h()) {
            return new t(i9 ^ this.f2019a, this.f2020b, x.h(this.f2022d, i8), fVar.h());
        }
        this.f2022d = x.h(this.f2022d, i8);
        this.f2019a ^= i9;
        return this;
    }

    public final t J(int i8, int i9, G0.e eVar) {
        Object[] objArr = this.f2022d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f2021c != eVar) {
            return new t(this.f2019a, i9 ^ this.f2020b, x.i(objArr, i8), eVar);
        }
        this.f2022d = x.i(objArr, i8);
        this.f2020b ^= i9;
        return this;
    }

    public final t K(t tVar, t tVar2, int i8, int i9, G0.e eVar) {
        if (tVar2 == null) {
            return J(i8, i9, eVar);
        }
        return (this.f2021c == eVar || tVar != tVar2) ? L(i8, tVar2, eVar) : this;
    }

    public final t L(int i8, t tVar, G0.e eVar) {
        Object[] objArr = this.f2022d;
        if (objArr.length == 1 && tVar.f2022d.length == 2 && tVar.f2020b == 0) {
            tVar.f2019a = this.f2020b;
            return tVar;
        }
        if (this.f2021c == eVar) {
            objArr[i8] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i8] = tVar;
        return new t(this.f2019a, this.f2020b, objArrCopyOf, eVar);
    }

    public final t M(int i8, Object obj, f fVar) {
        if (this.f2021c == fVar.h()) {
            this.f2022d[i8 + 1] = obj;
            return this;
        }
        fVar.j(fVar.f() + 1);
        Object[] objArr = this.f2022d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i8 + 1] = obj;
        return new t(this.f2019a, this.f2020b, objArrCopyOf, fVar.h());
    }

    public final int O(int i8) {
        return (this.f2022d.length - 1) - Integer.bitCount((i8 - 1) & this.f2020b);
    }

    public final b P(int i8, Object obj, Object obj2, int i9) {
        b bVarP;
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            int iN = n(iF);
            if (!kotlin.jvm.internal.t.c(obj, t(iN))) {
                return v(iN, iF, i8, obj, obj2, i9).b();
            }
            if (W(iN) == obj2) {
                return null;
            }
            return V(iN, obj2).c();
        }
        if (!r(iF)) {
            return s(iF, obj, obj2).b();
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i9 == 30) {
            bVarP = tVarN.h(obj, obj2);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = tVarN.P(i8, obj, obj2, i9 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final t Q(int i8, Object obj, int i9) {
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            int iN = n(iF);
            if (kotlin.jvm.internal.t.c(obj, t(iN))) {
                return R(iN, iF);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return T(tVarN, i9 == 30 ? tVarN.i(obj) : tVarN.Q(i8, obj, i9 + 5), iO, iF);
        }
        return this;
    }

    public final t R(int i8, int i9) {
        Object[] objArr = this.f2022d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(i9 ^ this.f2019a, this.f2020b, x.h(objArr, i8));
    }

    public final t S(int i8, int i9) {
        Object[] objArr = this.f2022d;
        if (objArr.length == 1) {
            return null;
        }
        return new t(this.f2019a, i9 ^ this.f2020b, x.i(objArr, i8));
    }

    public final t T(t tVar, t tVar2, int i8, int i9) {
        if (tVar2 == null) {
            return S(i8, i9);
        }
        return tVar != tVar2 ? U(i8, i9, tVar2) : this;
    }

    public final t U(int i8, int i9, t tVar) {
        Object[] objArr = tVar.f2022d;
        if (objArr.length != 2 || tVar.f2020b != 0) {
            Object[] objArr2 = this.f2022d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i8] = tVar;
            return new t(this.f2019a, this.f2020b, objArrCopyOf);
        }
        if (this.f2022d.length == 1) {
            tVar.f2019a = this.f2020b;
            return tVar;
        }
        return new t(this.f2019a ^ i9, i9 ^ this.f2020b, x.k(this.f2022d, i8, n(i9), objArr[0], objArr[1]));
    }

    public final t V(int i8, Object obj) {
        Object[] objArr = this.f2022d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i8 + 1] = obj;
        return new t(this.f2019a, this.f2020b, objArrCopyOf);
    }

    public final Object W(int i8) {
        return this.f2022d[i8 + 1];
    }

    public final b b() {
        return new b(this, 1);
    }

    public final b c() {
        return new b(this, 0);
    }

    public final Object[] d(int i8, int i9, int i10, Object obj, Object obj2, int i11, G0.e eVar) {
        Object objT = t(i8);
        return x.j(this.f2022d, i8, O(i9) + 1, u(objT != null ? objT.hashCode() : 0, objT, W(i8), i10, obj, obj2, i11 + 5, eVar));
    }

    public final int e() {
        if (this.f2020b == 0) {
            return this.f2022d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f2019a);
        int length = this.f2022d.length;
        for (int i8 = iBitCount * 2; i8 < length; i8++) {
            iBitCount += N(i8).e();
        }
        return iBitCount;
    }

    public final boolean f(Object obj) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (!kotlin.jvm.internal.t.c(obj, this.f2022d[iS])) {
                if (iS != iT) {
                    iS += iU;
                }
            }
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU <= 0 || iS > iT) && (iU >= 0 || iT > iS)) {
            return null;
        }
        while (!kotlin.jvm.internal.t.c(obj, t(iS))) {
            if (iS == iT) {
                return null;
            }
            iS += iU;
        }
        return W(iS);
    }

    public final b h(Object obj, Object obj2) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (!kotlin.jvm.internal.t.c(obj, t(iS))) {
                if (iS != iT) {
                    iS += iU;
                }
            }
            if (obj2 == W(iS)) {
                return null;
            }
            Object[] objArr = this.f2022d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iS + 1] = obj2;
            return new t(0, 0, objArrCopyOf).c();
        }
        return new t(0, 0, x.g(this.f2022d, 0, obj, obj2)).b();
    }

    public final t i(Object obj) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (!kotlin.jvm.internal.t.c(obj, t(iS))) {
                if (iS != iT) {
                    iS += iU;
                }
            }
            return j(iS);
        }
        return this;
    }

    public final t j(int i8) {
        Object[] objArr = this.f2022d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(0, 0, x.h(objArr, i8));
    }

    public final boolean k(int i8, Object obj, int i9) {
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            return kotlin.jvm.internal.t.c(obj, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        t tVarN = N(O(iF));
        return i9 == 30 ? tVarN.f(obj) : tVarN.k(i8, obj, i9 + 5);
    }

    public final boolean l(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f2020b != tVar.f2020b || this.f2019a != tVar.f2019a) {
            return false;
        }
        int length = this.f2022d.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (this.f2022d[i8] != tVar.f2022d[i8]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return Integer.bitCount(this.f2019a);
    }

    public final int n(int i8) {
        return Integer.bitCount((i8 - 1) & this.f2019a) * 2;
    }

    public final Object o(int i8, Object obj, int i9) {
        int iF = 1 << x.f(i8, i9);
        if (q(iF)) {
            int iN = n(iF);
            if (kotlin.jvm.internal.t.c(obj, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        t tVarN = N(O(iF));
        return i9 == 30 ? tVarN.g(obj) : tVarN.o(i8, obj, i9 + 5);
    }

    public final Object[] p() {
        return this.f2022d;
    }

    public final boolean q(int i8) {
        return (i8 & this.f2019a) != 0;
    }

    public final boolean r(int i8) {
        return (i8 & this.f2020b) != 0;
    }

    public final t s(int i8, Object obj, Object obj2) {
        return new t(i8 | this.f2019a, this.f2020b, x.g(this.f2022d, n(i8), obj, obj2));
    }

    public final Object t(int i8) {
        return this.f2022d[i8];
    }

    public final t u(int i8, Object obj, Object obj2, int i9, Object obj3, Object obj4, int i10, G0.e eVar) {
        if (i10 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iF = x.f(i8, i10);
        int iF2 = x.f(i9, i10);
        if (iF != iF2) {
            return new t((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new t(0, 1 << iF, new Object[]{u(i8, obj, obj2, i9, obj3, obj4, i10 + 5, eVar)}, eVar);
    }

    public final t v(int i8, int i9, int i10, Object obj, Object obj2, int i11) {
        return new t(this.f2019a ^ i9, this.f2020b | i9, d(i8, i9, i10, obj, obj2, i11, null));
    }

    public final t w(Object obj, Object obj2, f fVar) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (!kotlin.jvm.internal.t.c(obj, t(iS))) {
                if (iS != iT) {
                    iS += iU;
                }
            }
            fVar.k(W(iS));
            if (this.f2021c == fVar.h()) {
                this.f2022d[iS + 1] = obj2;
                return this;
            }
            fVar.j(fVar.f() + 1);
            Object[] objArr = this.f2022d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iS + 1] = obj2;
            return new t(0, 0, objArrCopyOf, fVar.h());
        }
        fVar.m(fVar.size() + 1);
        return new t(0, 0, x.g(this.f2022d, 0, obj, obj2), fVar.h());
    }

    public final t x(t tVar, G0.b bVar, G0.e eVar) {
        G0.a.a(this.f2020b == 0);
        G0.a.a(this.f2019a == 0);
        G0.a.a(tVar.f2020b == 0);
        G0.a.a(tVar.f2019a == 0);
        Object[] objArr = this.f2022d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f2022d.length);
        kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f2022d.length;
        W6.g gVarT = W6.n.t(W6.n.v(0, tVar.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (true) {
                if (f(tVar.f2022d[iS])) {
                    bVar.c(bVar.a() + 1);
                } else {
                    Object[] objArr2 = tVar.f2022d;
                    objArrCopyOf[length] = objArr2[iS];
                    objArrCopyOf[length + 1] = objArr2[iS + 1];
                    length += 2;
                }
                if (iS == iT) {
                    break;
                }
                iS += iU;
            }
        }
        if (length == this.f2022d.length) {
            return this;
        }
        if (length == tVar.f2022d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new t(0, 0, objArrCopyOf, eVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        kotlin.jvm.internal.t.f(objArrCopyOf2, "copyOf(this, newSize)");
        return new t(0, 0, objArrCopyOf2, eVar);
    }

    public final t y(Object obj, f fVar) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (!kotlin.jvm.internal.t.c(obj, t(iS))) {
                if (iS != iT) {
                    iS += iU;
                }
            }
            return A(iS, fVar);
        }
        return this;
    }

    public final t z(Object obj, Object obj2, f fVar) {
        W6.g gVarT = W6.n.t(W6.n.v(0, this.f2022d.length), 2);
        int iS = gVarT.s();
        int iT = gVarT.t();
        int iU = gVarT.u();
        if ((iU > 0 && iS <= iT) || (iU < 0 && iT <= iS)) {
            while (true) {
                if (kotlin.jvm.internal.t.c(obj, t(iS)) && kotlin.jvm.internal.t.c(obj2, W(iS))) {
                    return A(iS, fVar);
                }
                if (iS != iT) {
                    iS += iU;
                }
            }
        }
        return this;
    }

    public final t N(int i8) {
        Object obj = this.f2022d[i8];
        kotlin.jvm.internal.t.e(obj, hJroAgFztiMK.yuLb);
        return (t) obj;
    }

    public t(int i8, int i9, Object[] objArr) {
        this(i8, i9, objArr, null);
    }
}
