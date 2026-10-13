package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1885e2 extends J0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f18118h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J0 f18120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J0 f18121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18123g;

    public static int T(int i8) {
        int[] iArr = f18118h;
        int length = iArr.length;
        if (i8 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i8];
    }

    public static J0 W(J0 j8, J0 j9) {
        if (j9.y() == 0) {
            return j8;
        }
        if (j8.y() == 0) {
            return j9;
        }
        int iY = j8.y() + j9.y();
        if (iY < 128) {
            return X(j8, j9);
        }
        if (j8 instanceof C1885e2) {
            C1885e2 c1885e2 = (C1885e2) j8;
            if (c1885e2.f18121e.y() + j9.y() < 128) {
                return new C1885e2(c1885e2.f18120d, X(c1885e2.f18121e, j9));
            }
            if (c1885e2.f18120d.A() > c1885e2.f18121e.A() && c1885e2.f18123g > j9.A()) {
                return new C1885e2(c1885e2.f18120d, new C1885e2(c1885e2.f18121e, j9));
            }
        }
        return iY >= T(Math.max(j8.A(), j9.A()) + 1) ? new C1885e2(j8, j9) : Z1.a(new Z1(null), j8, j9);
    }

    public static J0 X(J0 j8, J0 j9) {
        int iY = j8.y();
        int iY2 = j9.y();
        byte[] bArr = new byte[iY + iY2];
        j8.R(bArr, 0, 0, iY);
        j9.R(bArr, 0, iY, iY2);
        return new I0(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int A() {
        return this.f18123g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final boolean D() {
        return this.f18119c >= T(this.f18123g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int E(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f18122f;
        if (i11 <= i12) {
            return this.f18120d.E(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f18121e.E(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f18121e.E(this.f18120d.E(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int F(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f18122f;
        if (i11 <= i12) {
            return this.f18120d.F(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f18121e.F(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f18121e.F(this.f18120d.F(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final J0 G(int i8, int i9) {
        int iK = J0.K(i8, i9, this.f18119c);
        if (iK == 0) {
            return J0.f17985b;
        }
        if (iK == this.f18119c) {
            return this;
        }
        int i10 = this.f18122f;
        if (i9 <= i10) {
            return this.f18120d.G(i8, i9);
        }
        if (i8 >= i10) {
            return this.f18121e.G(i8 - i10, i9 - i10);
        }
        J0 j8 = this.f18120d;
        return new C1885e2(j8.G(i8, j8.y()), this.f18121e.G(0, i9 - this.f18122f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final String H(Charset charset) {
        return new String(S(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final void I(A0 a8) {
        this.f18120d.I(a8);
        this.f18121e.I(a8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final boolean J() {
        J0 j8 = this.f18120d;
        J0 j9 = this.f18121e;
        return j9.F(j8.F(0, 0, this.f18122f), 0, j9.y()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    /* JADX INFO: renamed from: M */
    public final F0 iterator() {
        return new X1(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final byte c(int i8) {
        J0.Q(i8, this.f18119c);
        return o(i8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j8 = (J0) obj;
        if (this.f18119c != j8.y()) {
            return false;
        }
        if (this.f18119c == 0) {
            return true;
        }
        int iL = L();
        int iL2 = j8.L();
        if (iL != 0 && iL2 != 0 && iL != iL2) {
            return false;
        }
        AbstractC1870b2 abstractC1870b2 = null;
        C1875c2 c1875c2 = new C1875c2(this, abstractC1870b2);
        H0 h0B = c1875c2.next();
        C1875c2 c1875c3 = new C1875c2(j8, abstractC1870b2);
        H0 h0B2 = c1875c3.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int iY = h0B.y() - i8;
            int iY2 = h0B2.y() - i9;
            int iMin = Math.min(iY, iY2);
            if (!(i8 == 0 ? h0B.T(h0B2, i9, iMin) : h0B2.T(h0B, i8, iMin))) {
                return false;
            }
            i10 += iMin;
            int i11 = this.f18119c;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iY) {
                h0B = c1875c2.next();
                i8 = 0;
            } else {
                i8 += iMin;
            }
            if (iMin == iY2) {
                h0B = h0B;
                h0B2 = c1875c3.next();
                i9 = 0;
            } else {
                h0B = h0B;
                i9 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new X1(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final byte o(int i8) {
        int i9 = this.f18122f;
        return i8 < i9 ? this.f18120d.o(i8) : this.f18121e.o(i8 - i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int y() {
        return this.f18119c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final void z(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.f18122f;
        if (i11 <= i12) {
            this.f18120d.z(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.f18121e.z(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.f18120d.z(bArr, i8, i9, i13);
            this.f18121e.z(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    public C1885e2(J0 j8, J0 j9) {
        this.f18120d = j8;
        this.f18121e = j9;
        int iY = j8.y();
        this.f18122f = iY;
        this.f18119c = iY + j9.y();
        this.f18123g = Math.max(j8.A(), j9.A()) + 1;
    }
}
