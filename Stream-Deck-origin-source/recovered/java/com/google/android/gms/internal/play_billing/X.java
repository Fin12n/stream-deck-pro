package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X extends AbstractC1992a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18831f;

    public X(byte[] bArr, int i8, int i9) {
        super(null);
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f18829d = bArr;
        this.f18831f = 0;
        this.f18830e = i9;
    }

    public final void A(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, 0, this.f18829d, this.f18831f, i9);
            this.f18831f += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18831f), Integer.valueOf(this.f18830e), Integer.valueOf(i9)), e8);
        }
    }

    public final void B(String str) throws Y {
        int i8 = this.f18831f;
        try {
            int iW = AbstractC1992a0.w(str.length() * 3);
            int iW2 = AbstractC1992a0.w(str.length());
            if (iW2 != iW) {
                q(L1.c(str));
                byte[] bArr = this.f18829d;
                int i9 = this.f18831f;
                this.f18831f = L1.b(str, bArr, i9, this.f18830e - i9);
                return;
            }
            int i10 = i8 + iW2;
            this.f18831f = i10;
            int iB = L1.b(str, this.f18829d, i10, this.f18830e - i10);
            this.f18831f = i8;
            q((iB - i8) - iW2);
            this.f18831f = iB;
        } catch (K1 e8) {
            this.f18831f = i8;
            a(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new Y(e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final int c() {
        return this.f18830e - this.f18831f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void d(byte b8) throws Y {
        try {
            byte[] bArr = this.f18829d;
            int i8 = this.f18831f;
            this.f18831f = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18831f), Integer.valueOf(this.f18830e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void e(int i8, boolean z8) throws Y {
        q(i8 << 3);
        d(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void f(int i8, S s8) {
        q((i8 << 3) | 2);
        q(s8.t());
        s8.D(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void g(int i8, int i9) throws Y {
        q((i8 << 3) | 5);
        h(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void h(int i8) throws Y {
        try {
            byte[] bArr = this.f18829d;
            int i9 = this.f18831f;
            int i10 = i9 + 1;
            this.f18831f = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.f18831f = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.f18831f = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f18831f = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18831f), Integer.valueOf(this.f18830e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void i(int i8, long j8) throws Y {
        q((i8 << 3) | 1);
        j(j8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void j(long j8) throws Y {
        try {
            byte[] bArr = this.f18829d;
            int i8 = this.f18831f;
            int i9 = i8 + 1;
            this.f18831f = i9;
            bArr[i8] = (byte) (((int) j8) & 255);
            int i10 = i8 + 2;
            this.f18831f = i10;
            bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
            int i11 = i8 + 3;
            this.f18831f = i11;
            bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
            int i12 = i8 + 4;
            this.f18831f = i12;
            bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
            int i13 = i8 + 5;
            this.f18831f = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.f18831f = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.f18831f = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f18831f = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18831f), Integer.valueOf(this.f18830e), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void k(int i8, int i9) throws Y {
        q(i8 << 3);
        l(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void l(int i8) throws Y {
        if (i8 >= 0) {
            q(i8);
        } else {
            s(i8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void m(byte[] bArr, int i8, int i9) {
        A(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void n(int i8, String str) throws Y {
        q((i8 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void o(int i8, int i9) {
        q((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void p(int i8, int i9) {
        q(i8 << 3);
        q(i9);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void q(int i8) {
        while ((i8 & (-128)) != 0) {
            try {
                byte[] bArr = this.f18829d;
                int i9 = this.f18831f;
                this.f18831f = i9 + 1;
                bArr[i9] = (byte) ((i8 | 128) & 255);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18831f), Integer.valueOf(this.f18830e), 1), e8);
            }
        }
        byte[] bArr2 = this.f18829d;
        int i10 = this.f18831f;
        this.f18831f = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void r(int i8, long j8) throws Y {
        q(i8 << 3);
        s(j8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1992a0
    public final void s(long j8) throws Y {
        if (!AbstractC1992a0.f18873c || this.f18830e - this.f18831f < 10) {
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f18829d;
                    int i8 = this.f18831f;
                    this.f18831f = i8 + 1;
                    bArr[i8] = (byte) ((((int) j8) | 128) & 255);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f18831f), Integer.valueOf(this.f18830e), 1), e8);
                }
            }
            byte[] bArr2 = this.f18829d;
            int i9 = this.f18831f;
            this.f18831f = i9 + 1;
            bArr2[i9] = (byte) j8;
            return;
        }
        while (true) {
            int i10 = (int) j8;
            if ((j8 & (-128)) == 0) {
                byte[] bArr3 = this.f18829d;
                int i11 = this.f18831f;
                this.f18831f = i11 + 1;
                G1.s(bArr3, i11, (byte) i10);
                return;
            }
            byte[] bArr4 = this.f18829d;
            int i12 = this.f18831f;
            this.f18831f = i12 + 1;
            G1.s(bArr4, i12, (byte) ((i10 | 128) & 255));
            j8 >>>= 7;
        }
    }
}
