package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class I0 extends H0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17983c;

    public I0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f17983c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int E(int i8, int i9, int i10) {
        return AbstractC1953s1.b(i8, this.f17983c, U() + i9, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int F(int i8, int i9, int i10) {
        int iU = U() + i9;
        return F2.f(i8, this.f17983c, iU, i10 + iU);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final J0 G(int i8, int i9) {
        int iK = J0.K(i8, i9, y());
        return iK == 0 ? J0.f17985b : new E0(this.f17983c, U() + i8, iK);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final String H(Charset charset) {
        return new String(this.f17983c, U(), y(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final void I(A0 a8) {
        ((O0) a8).D(this.f17983c, U(), y());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final boolean J() {
        int iU = U();
        return F2.g(this.f17983c, iU, y() + iU);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0
    public final boolean T(J0 j8, int i8, int i9) {
        if (i9 > j8.y()) {
            throw new IllegalArgumentException("Length too large: " + i9 + y());
        }
        int i10 = i8 + i9;
        if (i10 > j8.y()) {
            throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + j8.y());
        }
        if (!(j8 instanceof I0)) {
            return j8.G(i8, i10).equals(G(0, i9));
        }
        I0 i11 = (I0) j8;
        byte[] bArr = this.f17983c;
        byte[] bArr2 = i11.f17983c;
        int iU = U() + i9;
        int iU2 = U();
        int iU3 = i11.U() + i8;
        while (iU2 < iU) {
            if (bArr[iU2] != bArr2[iU3]) {
                return false;
            }
            iU2++;
            iU3++;
        }
        return true;
    }

    public int U() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public byte c(int i8) {
        return this.f17983c[i8];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0) || y() != ((J0) obj).y()) {
            return false;
        }
        if (y() == 0) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return obj.equals(this);
        }
        I0 i8 = (I0) obj;
        int iL = L();
        int iL2 = i8.L();
        if (iL == 0 || iL2 == 0 || iL == iL2) {
            return T(i8, 0, y());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public byte o(int i8) {
        return this.f17983c[i8];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public int y() {
        return this.f17983c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public void z(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f17983c, i8, bArr, i9, i10);
    }
}
