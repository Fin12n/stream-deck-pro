package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2079x1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2079x1 f19025f = new C2079x1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19029d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19030e;

    public C2079x1(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f19026a = i8;
        this.f19027b = iArr;
        this.f19028c = objArr;
        this.f19030e = z8;
    }

    public static C2079x1 c() {
        return f19025f;
    }

    public static C2079x1 e(C2079x1 c2079x1, C2079x1 c2079x2) {
        int i8 = c2079x1.f19026a + c2079x2.f19026a;
        int[] iArrCopyOf = Arrays.copyOf(c2079x1.f19027b, i8);
        System.arraycopy(c2079x2.f19027b, 0, iArrCopyOf, c2079x1.f19026a, c2079x2.f19026a);
        Object[] objArrCopyOf = Arrays.copyOf(c2079x1.f19028c, i8);
        System.arraycopy(c2079x2.f19028c, 0, objArrCopyOf, c2079x1.f19026a, c2079x2.f19026a);
        return new C2079x1(i8, iArrCopyOf, objArrCopyOf, true);
    }

    public static C2079x1 f() {
        return new C2079x1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i8 = this.f19029d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f19026a; i10++) {
            int i11 = this.f19027b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f19028c[i10]).getClass();
                    iW2 = AbstractC1992a0.w(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    S s8 = (S) this.f19028c[i10];
                    int iW3 = AbstractC1992a0.w(i14);
                    int iT = s8.t();
                    iW2 = iW3 + AbstractC1992a0.w(iT) + iT;
                } else if (i13 == 3) {
                    int iW4 = AbstractC1992a0.w(i12 << 3);
                    iW = iW4 + iW4;
                    iX = ((C2079x1) this.f19028c[i10]).a();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(A0.a());
                    }
                    ((Integer) this.f19028c[i10]).getClass();
                    iW2 = AbstractC1992a0.w(i12 << 3) + 4;
                }
                i9 += iW2;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f19028c[i10]).longValue();
                iW = AbstractC1992a0.w(i15);
                iX = AbstractC1992a0.x(jLongValue);
            }
            iW2 = iW + iX;
            i9 += iW2;
        }
        this.f19029d = i9;
        return i9;
    }

    public final int b() {
        int i8 = this.f19029d;
        if (i8 != -1) {
            return i8;
        }
        int iW = 0;
        for (int i9 = 0; i9 < this.f19026a; i9++) {
            int i10 = this.f19027b[i9] >>> 3;
            S s8 = (S) this.f19028c[i9];
            int iW2 = AbstractC1992a0.w(8);
            int iW3 = AbstractC1992a0.w(16) + AbstractC1992a0.w(i10);
            int iW4 = AbstractC1992a0.w(24);
            int iT = s8.t();
            iW += iW2 + iW2 + iW3 + iW4 + AbstractC1992a0.w(iT) + iT;
        }
        this.f19029d = iW;
        return iW;
    }

    public final C2079x1 d(C2079x1 c2079x1) {
        if (c2079x1.equals(f19025f)) {
            return this;
        }
        g();
        int i8 = this.f19026a + c2079x1.f19026a;
        m(i8);
        System.arraycopy(c2079x1.f19027b, 0, this.f19027b, this.f19026a, c2079x1.f19026a);
        System.arraycopy(c2079x1.f19028c, 0, this.f19028c, this.f19026a, c2079x1.f19026a);
        this.f19026a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2079x1)) {
            return false;
        }
        C2079x1 c2079x1 = (C2079x1) obj;
        int i8 = this.f19026a;
        if (i8 == c2079x1.f19026a) {
            int[] iArr = this.f19027b;
            int[] iArr2 = c2079x1.f19027b;
            for (int i9 = 0; i9 < i8; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            Object[] objArr = this.f19028c;
            Object[] objArr2 = c2079x1.f19028c;
            int i10 = this.f19026a;
            for (int i11 = 0; i11 < i10; i11++) {
                if (objArr[i11].equals(objArr2[i11])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (!this.f19030e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f19030e) {
            this.f19030e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f19026a;
        int i9 = i8 + 527;
        int[] iArr = this.f19027b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i9 * 31) + i10) * 31;
        Object[] objArr = this.f19028c;
        int i13 = this.f19026a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }

    public final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f19026a; i9++) {
            X0.b(sb, i8, String.valueOf(this.f19027b[i9] >>> 3), this.f19028c[i9]);
        }
    }

    public final void j(int i8, Object obj) {
        g();
        m(this.f19026a + 1);
        int[] iArr = this.f19027b;
        int i9 = this.f19026a;
        iArr[i9] = i8;
        this.f19028c[i9] = obj;
        this.f19026a = i9 + 1;
    }

    public final void k(O1 o8) {
        for (int i8 = 0; i8 < this.f19026a; i8++) {
            o8.x(this.f19027b[i8] >>> 3, this.f19028c[i8]);
        }
    }

    public final void l(O1 o8) {
        if (this.f19026a != 0) {
            for (int i8 = 0; i8 < this.f19026a; i8++) {
                int i9 = this.f19027b[i8];
                Object obj = this.f19028c[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    o8.g(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    o8.D(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    o8.J(i11, (S) obj);
                } else if (i10 == 3) {
                    o8.H(i11);
                    ((C2079x1) obj).l(o8);
                    o8.G(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(A0.a());
                    }
                    o8.e(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i8) {
        int[] iArr = this.f19027b;
        if (i8 > iArr.length) {
            int i9 = this.f19026a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f19027b = Arrays.copyOf(iArr, i8);
            this.f19028c = Arrays.copyOf(this.f19028c, i8);
        }
    }
}
