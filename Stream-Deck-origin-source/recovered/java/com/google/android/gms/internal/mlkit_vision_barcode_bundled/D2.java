package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D2 extends C2 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i8, byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        if (i8 != 0) {
            if (i9 >= i10) {
                return i8;
            }
            byte b8 = (byte) i8;
            if (b8 < -32) {
                if (b8 >= -62) {
                    i12 = i9 + 1;
                }
                return -1;
            }
            int i13 = ~(i8 >> 8);
            if (b8 < -16) {
                byte b9 = (byte) i13;
                if (b9 == 0) {
                    int i14 = i9 + 1;
                    byte b10 = bArr[i9];
                    if (i14 >= i10) {
                        return F2.h(b8, b10);
                    }
                    i9 = i14;
                    b9 = b10;
                }
                if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                    i12 = i9 + 1;
                }
                return -1;
            }
            byte b11 = (byte) i13;
            if (b11 == 0) {
                int i15 = i9 + 1;
                b11 = bArr[i9];
                if (i15 >= i10) {
                    return F2.h(b8, b11);
                }
                i9 = i15;
                i11 = 0;
            } else {
                i11 = i8 >> 16;
            }
            if (i11 == 0) {
                int i16 = i9 + 1;
                byte b12 = bArr[i9];
                if (i16 >= i10) {
                    return F2.i(b8, b11, b12);
                }
                i9 = i16;
                i11 = b12;
            }
            if (b11 <= -65 && (((b8 << 28) + (b11 + 112)) >> 30) == 0 && i11 <= -65) {
                i12 = i9 + 1;
            }
            return -1;
            i9 = i12;
        }
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        while (i9 < i10) {
            int i17 = i9 + 1;
            byte b13 = bArr[i9];
            if (b13 >= 0) {
                i9 = i17;
            } else {
                if (b13 < -32) {
                    if (i17 >= i10) {
                        return b13;
                    }
                    if (b13 >= -62) {
                        i9 += 2;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
                if (b13 >= -16) {
                    if (i17 >= i10 - 2) {
                        return F2.c(bArr, i17, i10);
                    }
                    int i18 = i9 + 2;
                    byte b14 = bArr[i17];
                    if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                        int i19 = i9 + 3;
                        if (bArr[i18] <= -65) {
                            i9 += 4;
                            if (bArr[i19] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i17 >= i10 - 1) {
                    return F2.c(bArr, i17, i10);
                }
                int i20 = i9 + 2;
                byte b15 = bArr[i17];
                if (b15 > -65 || (b13 == -32 && b15 < -96)) {
                    return -1;
                }
                if (b13 == -19 && b15 >= -96) {
                    return -1;
                }
                i9 += 3;
                if (bArr[i20] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
