package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1959t2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1959t2 f18655f = new C1959t2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f18658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18659d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18660e;

    public C1959t2(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f18656a = i8;
        this.f18657b = iArr;
        this.f18658c = objArr;
        this.f18660e = z8;
    }

    public static C1959t2 c() {
        return f18655f;
    }

    public static C1959t2 e(C1959t2 c1959t2, C1959t2 c1959t3) {
        int i8 = c1959t2.f18656a + c1959t3.f18656a;
        int[] iArrCopyOf = Arrays.copyOf(c1959t2.f18657b, i8);
        System.arraycopy(c1959t3.f18657b, 0, iArrCopyOf, c1959t2.f18656a, c1959t3.f18656a);
        Object[] objArrCopyOf = Arrays.copyOf(c1959t2.f18658c, i8);
        System.arraycopy(c1959t3.f18658c, 0, objArrCopyOf, c1959t2.f18656a, c1959t3.f18656a);
        return new C1959t2(i8, iArrCopyOf, objArrCopyOf, true);
    }

    public static C1959t2 f() {
        return new C1959t2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i8 = this.f18659d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f18656a; i10++) {
            int i11 = this.f18657b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f18658c[i10]).getClass();
                    iA2 = R0.a(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    J0 j8 = (J0) this.f18658c[i10];
                    int iA3 = R0.a(i14);
                    int iY = j8.y();
                    iA2 = iA3 + R0.a(iY) + iY;
                } else if (i13 == 3) {
                    int iA4 = R0.a(i12 << 3);
                    iA = iA4 + iA4;
                    iB = ((C1959t2) this.f18658c[i10]).a();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new C1958t1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f18658c[i10]).getClass();
                    iA2 = R0.a(i12 << 3) + 4;
                }
                i9 += iA2;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f18658c[i10]).longValue();
                iA = R0.a(i15);
                iB = R0.b(jLongValue);
            }
            iA2 = iA + iB;
            i9 += iA2;
        }
        this.f18659d = i9;
        return i9;
    }

    public final int b() {
        int i8 = this.f18659d;
        if (i8 != -1) {
            return i8;
        }
        int iA = 0;
        for (int i9 = 0; i9 < this.f18656a; i9++) {
            int i10 = this.f18657b[i9] >>> 3;
            J0 j8 = (J0) this.f18658c[i9];
            int iA2 = R0.a(8);
            int iA3 = R0.a(16) + R0.a(i10);
            int iA4 = R0.a(24);
            int iY = j8.y();
            iA += iA2 + iA2 + iA3 + iA4 + R0.a(iY) + iY;
        }
        this.f18659d = iA;
        return iA;
    }

    public final C1959t2 d(C1959t2 c1959t2) {
        if (c1959t2.equals(f18655f)) {
            return this;
        }
        g();
        int i8 = this.f18656a + c1959t2.f18656a;
        m(i8);
        System.arraycopy(c1959t2.f18657b, 0, this.f18657b, this.f18656a, c1959t2.f18656a);
        System.arraycopy(c1959t2.f18658c, 0, this.f18658c, this.f18656a, c1959t2.f18656a);
        this.f18656a = i8;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1959t2)) {
            return false;
        }
        C1959t2 c1959t2 = (C1959t2) obj;
        int i8 = this.f18656a;
        if (i8 == c1959t2.f18656a) {
            int[] iArr = this.f18657b;
            int[] iArr2 = c1959t2.f18657b;
            for (int i9 = 0; i9 < i8; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            Object[] objArr = this.f18658c;
            Object[] objArr2 = c1959t2.f18658c;
            int i10 = this.f18656a;
            for (int i11 = 0; i11 < i10; i11++) {
                if (objArr[i11].equals(objArr2[i11])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (!this.f18660e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f18660e) {
            this.f18660e = false;
        }
    }

    public final int hashCode() {
        int i8 = this.f18656a;
        int i9 = i8 + 527;
        int[] iArr = this.f18657b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i9 * 31) + i10) * 31;
        Object[] objArr = this.f18658c;
        int i13 = this.f18656a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }

    public final void i(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.f18656a; i9++) {
            O1.b(sb, i8, String.valueOf(this.f18657b[i9] >>> 3), this.f18658c[i9]);
        }
    }

    public final void j(int i8, Object obj) {
        g();
        m(this.f18656a + 1);
        int[] iArr = this.f18657b;
        int i9 = this.f18656a;
        iArr[i9] = i8;
        this.f18658c[i9] = obj;
        this.f18656a = i9 + 1;
    }

    public final void k(I2 i8) {
        for (int i9 = 0; i9 < this.f18656a; i9++) {
            i8.x(this.f18657b[i9] >>> 3, this.f18658c[i9]);
        }
    }

    public final void l(I2 i8) {
        if (this.f18656a != 0) {
            for (int i9 = 0; i9 < this.f18656a; i9++) {
                int i10 = this.f18657b[i9];
                Object obj = this.f18658c[i9];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    i8.g(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    i8.D(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    i8.J(i12, (J0) obj);
                } else if (i11 == 3) {
                    i8.H(i12);
                    ((C1959t2) obj).l(i8);
                    i8.G(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new C1958t1("Protocol message tag had invalid wire type."));
                    }
                    i8.e(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i8) {
        int[] iArr = this.f18657b;
        if (i8 > iArr.length) {
            int i9 = this.f18656a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f18657b = Arrays.copyOf(iArr, i8);
            this.f18658c = Arrays.copyOf(this.f18658c, i8);
        }
    }
}
