package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0 f19483f = new w0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19488e;

    public w0() {
        this(0, new int[8], new Object[8], true);
    }

    public static w0 c() {
        return f19483f;
    }

    public static int f(int[] iArr, int i8) {
        int i9 = 17;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        return i9;
    }

    public static int g(Object[] objArr, int i8) {
        int iHashCode = 17;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return iHashCode;
    }

    public static w0 n(w0 w0Var, w0 w0Var2) {
        int i8 = w0Var.f19484a + w0Var2.f19484a;
        int[] iArrCopyOf = Arrays.copyOf(w0Var.f19485b, i8);
        System.arraycopy(w0Var2.f19485b, 0, iArrCopyOf, w0Var.f19484a, w0Var2.f19484a);
        Object[] objArrCopyOf = Arrays.copyOf(w0Var.f19486c, i8);
        System.arraycopy(w0Var2.f19486c, 0, objArrCopyOf, w0Var.f19484a, w0Var2.f19484a);
        return new w0(i8, iArrCopyOf, objArrCopyOf, true);
    }

    public static w0 o() {
        return new w0();
    }

    public static boolean p(Object[] objArr, Object[] objArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (!objArr[i9].equals(objArr2[i9])) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(int[] iArr, int[] iArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (iArr[i9] != iArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    public static void u(int i8, Object obj, D0 d8) {
        int iA = C0.a(i8);
        int iB = C0.b(i8);
        if (iB == 0) {
            d8.q(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            d8.k(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            d8.v(iA, (AbstractC2097h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(B.e());
            }
            d8.f(iA, ((Integer) obj).intValue());
        } else if (d8.l() == D0.a.ASCENDING) {
            d8.u(iA);
            ((w0) obj).v(d8);
            d8.H(iA);
        } else {
            d8.H(iA);
            ((w0) obj).v(d8);
            d8.u(iA);
        }
    }

    public void a() {
        if (!this.f19488e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i8) {
        int[] iArr = this.f19485b;
        if (i8 > iArr.length) {
            int i9 = this.f19484a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f19485b = Arrays.copyOf(iArr, i8);
            this.f19486c = Arrays.copyOf(this.f19486c, i8);
        }
    }

    public int d() {
        int iY;
        int i8 = this.f19487d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f19484a; i10++) {
            int i11 = this.f19485b[i10];
            int iA = C0.a(i11);
            int iB = C0.b(i11);
            if (iB == 0) {
                iY = AbstractC2100k.Y(iA, ((Long) this.f19486c[i10]).longValue());
            } else if (iB == 1) {
                iY = AbstractC2100k.p(iA, ((Long) this.f19486c[i10]).longValue());
            } else if (iB == 2) {
                iY = AbstractC2100k.h(iA, (AbstractC2097h) this.f19486c[i10]);
            } else if (iB == 3) {
                iY = (AbstractC2100k.V(iA) * 2) + ((w0) this.f19486c[i10]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(B.e());
                }
                iY = AbstractC2100k.n(iA, ((Integer) this.f19486c[i10]).intValue());
            }
            i9 += iY;
        }
        this.f19487d = i9;
        return i9;
    }

    public int e() {
        int i8 = this.f19487d;
        if (i8 != -1) {
            return i8;
        }
        int iK = 0;
        for (int i9 = 0; i9 < this.f19484a; i9++) {
            iK += AbstractC2100k.K(C0.a(this.f19485b[i9]), (AbstractC2097h) this.f19486c[i9]);
        }
        this.f19487d = iK;
        return iK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        int i8 = this.f19484a;
        return i8 == w0Var.f19484a && s(this.f19485b, w0Var.f19485b, i8) && p(this.f19486c, w0Var.f19486c, this.f19484a);
    }

    public void h() {
        if (this.f19488e) {
            this.f19488e = false;
        }
    }

    public int hashCode() {
        int i8 = this.f19484a;
        return ((((527 + i8) * 31) + f(this.f19485b, i8)) * 31) + g(this.f19486c, this.f19484a);
    }

    public boolean i(int i8, AbstractC2098i abstractC2098i) throws B.a {
        a();
        int iA = C0.a(i8);
        int iB = C0.b(i8);
        if (iB == 0) {
            r(i8, Long.valueOf(abstractC2098i.z()));
            return true;
        }
        if (iB == 1) {
            r(i8, Long.valueOf(abstractC2098i.v()));
            return true;
        }
        if (iB == 2) {
            r(i8, abstractC2098i.r());
            return true;
        }
        if (iB == 3) {
            w0 w0Var = new w0();
            w0Var.j(abstractC2098i);
            abstractC2098i.a(C0.c(iA, 4));
            r(i8, w0Var);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw B.e();
        }
        r(i8, Integer.valueOf(abstractC2098i.u()));
        return true;
    }

    public final w0 j(AbstractC2098i abstractC2098i) {
        int iJ;
        do {
            iJ = abstractC2098i.J();
            if (iJ == 0) {
                break;
            }
        } while (i(iJ, abstractC2098i));
        return this;
    }

    public w0 k(w0 w0Var) {
        if (w0Var.equals(c())) {
            return this;
        }
        a();
        int i8 = this.f19484a + w0Var.f19484a;
        b(i8);
        System.arraycopy(w0Var.f19485b, 0, this.f19485b, this.f19484a, w0Var.f19484a);
        System.arraycopy(w0Var.f19486c, 0, this.f19486c, this.f19484a, w0Var.f19484a);
        this.f19484a = i8;
        return this;
    }

    public w0 l(int i8, AbstractC2097h abstractC2097h) {
        a();
        if (i8 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(C0.c(i8, 2), abstractC2097h);
        return this;
    }

    public w0 m(int i8, int i9) {
        a();
        if (i8 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(C0.c(i8, 0), Long.valueOf(i9));
        return this;
    }

    public final void q(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f19484a; i9++) {
            V.d(sb, i8, String.valueOf(C0.a(this.f19485b[i9])), this.f19486c[i9]);
        }
    }

    public void r(int i8, Object obj) {
        a();
        b(this.f19484a + 1);
        int[] iArr = this.f19485b;
        int i9 = this.f19484a;
        iArr[i9] = i8;
        this.f19486c[i9] = obj;
        this.f19484a = i9 + 1;
    }

    public void t(D0 d8) {
        if (d8.l() == D0.a.DESCENDING) {
            for (int i8 = this.f19484a - 1; i8 >= 0; i8--) {
                d8.e(C0.a(this.f19485b[i8]), this.f19486c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.f19484a; i9++) {
            d8.e(C0.a(this.f19485b[i9]), this.f19486c[i9]);
        }
    }

    public void v(D0 d8) {
        if (this.f19484a == 0) {
            return;
        }
        if (d8.l() == D0.a.ASCENDING) {
            for (int i8 = 0; i8 < this.f19484a; i8++) {
                u(this.f19485b[i8], this.f19486c[i8], d8);
            }
            return;
        }
        for (int i9 = this.f19484a - 1; i9 >= 0; i9--) {
            u(this.f19485b[i9], this.f19486c[i9], d8);
        }
    }

    public w0(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f19487d = -1;
        this.f19484a = i8;
        this.f19485b = iArr;
        this.f19486c = objArr;
        this.f19488e = z8;
    }
}
