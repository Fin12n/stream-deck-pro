package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1962u0 implements M1 {
    protected int zza = 0;

    public int c(InterfaceC1890f2 interfaceC1890f2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final J0 f() {
        try {
            int iA = a();
            J0 j8 = J0.f17985b;
            byte[] bArr = new byte[iA];
            O0 o8 = new O0(bArr, 0, iA);
            b(o8);
            o8.c();
            return new I0(bArr);
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e8);
        }
    }

    public final byte[] i() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            O0 o8 = new O0(bArr, 0, iA);
            b(o8);
            o8.c();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
