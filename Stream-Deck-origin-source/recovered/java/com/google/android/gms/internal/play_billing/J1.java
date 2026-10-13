package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J1 extends I1 {
    @Override // com.google.android.gms.internal.play_billing.I1
    public final int a(int i8, byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                i9 = i11;
            } else {
                if (b8 < -32) {
                    if (i11 >= i10) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i9 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 >= -16) {
                    if (i11 >= i10 - 2) {
                        return L1.a(bArr, i11, i10);
                    }
                    int i12 = i9 + 2;
                    byte b9 = bArr[i11];
                    if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i13 = i9 + 3;
                        if (bArr[i12] <= -65) {
                            i9 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 1) {
                    return L1.a(bArr, i11, i10);
                }
                int i14 = i9 + 2;
                byte b10 = bArr[i11];
                if (b10 > -65 || (b8 == -32 && b10 < -96)) {
                    return -1;
                }
                if (b8 == -19 && b10 >= -96) {
                    return -1;
                }
                i9 += 3;
                if (bArr[i14] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
