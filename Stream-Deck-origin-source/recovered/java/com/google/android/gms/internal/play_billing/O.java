package com.google.android.gms.internal.play_billing;

import D6.iIQ.BmWxZhjGfw;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class O extends N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18811e;

    public O(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f18811e = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final String A(Charset charset) {
        return new String(this.f18811e, 0, t(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final void D(G g8) {
        ((X) g8).A(this.f18811e, 0, t());
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final boolean E() {
        return L1.e(this.f18811e, 0, t());
    }

    public int J() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public byte c(int i8) {
        return this.f18811e[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S) || t() != ((S) obj).t()) {
            return false;
        }
        if (t() == 0) {
            return true;
        }
        if (!(obj instanceof O)) {
            return obj.equals(this);
        }
        O o8 = (O) obj;
        int iG = G();
        int iG2 = o8.G();
        if (iG != 0 && iG2 != 0 && iG != iG2) {
            return false;
        }
        int iT = t();
        if (iT > o8.t()) {
            throw new IllegalArgumentException(BmWxZhjGfw.bcIEucGRx + iT + t());
        }
        if (iT > o8.t()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iT + ", " + o8.t());
        }
        byte[] bArr = this.f18811e;
        byte[] bArr2 = o8.f18811e;
        o8.J();
        int i8 = 0;
        int i9 = 0;
        while (i8 < iT) {
            if (bArr[i8] != bArr2[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public byte o(int i8) {
        return this.f18811e[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public int t() {
        return this.f18811e.length;
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final int y(int i8, int i9, int i10) {
        return AbstractC2081y0.b(i8, this.f18811e, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final S z(int i8, int i9) {
        int iF = S.F(0, i9, t());
        return iF == 0 ? S.f18819b : new K(this.f18811e, 0, iF);
    }
}
