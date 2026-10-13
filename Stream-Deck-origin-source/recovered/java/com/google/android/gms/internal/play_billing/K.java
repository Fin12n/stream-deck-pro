package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K extends O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18773f;

    public K(byte[] bArr, int i8, int i9) {
        super(bArr);
        S.F(0, i9, bArr.length);
        this.f18773f = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.O
    public final int J() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.O, com.google.android.gms.internal.play_billing.S
    public final byte c(int i8) {
        int i9 = this.f18773f;
        if (((i9 - (i8 + 1)) | i8) >= 0) {
            return this.f18811e[i8];
        }
        if (i8 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
    }

    @Override // com.google.android.gms.internal.play_billing.O, com.google.android.gms.internal.play_billing.S
    public final byte o(int i8) {
        return this.f18811e[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.O, com.google.android.gms.internal.play_billing.S
    public final int t() {
        return this.f18773f;
    }
}
