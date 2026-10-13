package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P2 extends AbstractC1914k1 implements N1 {
    private static final P2 zzb;
    private int zzd;
    private int zze = -1;

    static {
        P2 p8 = new P2();
        zzb = p8;
        AbstractC1914k1.C(P2.class, p8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{GIGvBf.tYxOToWbf, "zze"});
        }
        if (i9 == 3) {
            return new P2();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new O2(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
