package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends R0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17994f;

    public O0(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f17992d = bArr;
        this.f17994f = 0;
        this.f17993e = i9;
    }

    public final void D(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, i8, this.f17992d, this.f17994f, i9);
            this.f17994f += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new P0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17994f), Integer.valueOf(this.f17993e), Integer.valueOf(i9)), e8);
        }
    }

    public final void E(String str) throws P0 {
        int i8 = this.f17994f;
        try {
            int iA = R0.a(str.length() * 3);
            int iA2 = R0.a(str.length());
            if (iA2 != iA) {
                w(F2.e(str));
                byte[] bArr = this.f17992d;
                int i9 = this.f17994f;
                this.f17994f = F2.d(str, bArr, i9, this.f17993e - i9);
                return;
            }
            int i10 = i8 + iA2;
            this.f17994f = i10;
            int iD = F2.d(str, this.f17992d, i10, this.f17993e - i10);
            this.f17994f = i8;
            w((iD - i8) - iA2);
            this.f17994f = iD;
        } catch (E2 e8) {
            this.f17994f = i8;
            d(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new P0(e9);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final int f() {
        return this.f17993e - this.f17994f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void g(byte b8) throws P0 {
        try {
            byte[] bArr = this.f17992d;
            int i8 = this.f17994f;
            this.f17994f = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new P0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17994f), Integer.valueOf(this.f17993e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void h(int i8, boolean z8) throws P0 {
        w(i8 << 3);
        g(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void i(int i8, J0 j8) throws P0 {
        w((i8 << 3) | 2);
        w(j8.y());
        j8.I(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void j(int i8, int i9) throws P0 {
        w((i8 << 3) | 5);
        k(i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void k(int i8) throws P0 {
        try {
            byte[] bArr = this.f17992d;
            int i9 = this.f17994f;
            int i10 = i9 + 1;
            this.f17994f = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f17994f = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f17994f = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f17994f = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new P0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17994f), Integer.valueOf(this.f17993e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void l(int i8, long j8) throws P0 {
        w((i8 << 3) | 1);
        m(j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void m(long j8) throws P0 {
        try {
            byte[] bArr = this.f17992d;
            int i8 = this.f17994f;
            int i9 = i8 + 1;
            this.f17994f = i9;
            bArr[i8] = (byte) (((int) j8) & 255);
            int i10 = i8 + 2;
            this.f17994f = i10;
            bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
            int i11 = i8 + 3;
            this.f17994f = i11;
            bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
            int i12 = i8 + 4;
            this.f17994f = i12;
            bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
            int i13 = i8 + 5;
            this.f17994f = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f17994f = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f17994f = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f17994f = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new P0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17994f), Integer.valueOf(this.f17993e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void n(int i8, int i9) throws P0 {
        w(i8 << 3);
        o(i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void o(int i8) throws P0 {
        if (i8 >= 0) {
            w(i8);
        } else {
            y(i8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void p(byte[] bArr, int i8, int i9) {
        D(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void q(int i8, M1 m8, InterfaceC1890f2 interfaceC1890f2) throws P0 {
        w((i8 << 3) | 2);
        w(((AbstractC1962u0) m8).c(interfaceC1890f2));
        interfaceC1890f2.i(m8, this.f18016a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void r(int i8, M1 m8) throws P0 {
        w(11);
        v(2, i8);
        w(26);
        w(m8.a());
        m8.b(this);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void s(int i8, J0 j8) throws P0 {
        w(11);
        v(2, i8);
        i(3, j8);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void t(int i8, String str) throws P0 {
        w((i8 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void u(int i8, int i9) throws P0 {
        w((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void v(int i8, int i9) throws P0 {
        w(i8 << 3);
        w(i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void w(int i8) throws P0 {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f17992d;
                int i9 = this.f17994f;
                this.f17994f = i9 + 1;
                bArr[i9] = (byte) ((i8 | 128) & 255);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new P0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17994f), Integer.valueOf(this.f17993e), 1), e8);
            }
        }
        byte[] bArr2 = this.f17992d;
        int i10 = this.f17994f;
        this.f17994f = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void x(int i8, long j8) throws P0 {
        w(i8 << 3);
        y(j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.R0
    public final void y(long j8) throws P0 {
        if (!R0.f18015c || this.f17993e - this.f17994f < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f17992d;
                    int i8 = this.f17994f;
                    this.f17994f = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new P0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17994f), Integer.valueOf(this.f17993e), 1), e8);
                }
            }
            byte[] bArr2 = this.f17992d;
            int i9 = this.f17994f;
            this.f17994f = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f17992d;
                int i11 = this.f17994f;
                this.f17994f = i11 + 1;
                AbstractC1989z2.s(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f17992d;
            int i12 = this.f17994f;
            this.f17994f = i12 + 1;
            AbstractC1989z2.s(bArr4, i12, (byte) ((i10 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
