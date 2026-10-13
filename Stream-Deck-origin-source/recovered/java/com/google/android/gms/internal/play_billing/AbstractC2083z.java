package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2083z implements V0 {
    protected int zza = 0;

    public int c(InterfaceC2017g1 interfaceC2017g1) {
        throw null;
    }

    public final byte[] e() {
        try {
            int iL = l();
            byte[] bArr = new byte[iL];
            AbstractC1992a0 abstractC1992a0Y = AbstractC1992a0.y(bArr, 0, iL);
            b(abstractC1992a0Y);
            abstractC1992a0Y.z();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final S zzb() {
        try {
            int iL = l();
            S s8 = S.f18819b;
            byte[] bArr = new byte[iL];
            AbstractC1992a0 abstractC1992a0Y = AbstractC1992a0.y(bArr, 0, iL);
            b(abstractC1992a0Y);
            abstractC1992a0Y.z();
            return new O(bArr);
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e8);
        }
    }
}
