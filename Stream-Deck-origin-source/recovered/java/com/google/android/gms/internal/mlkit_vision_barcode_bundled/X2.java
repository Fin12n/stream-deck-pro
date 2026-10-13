package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X2 extends AbstractC1914k1 implements N1 {
    private static final X2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        X2 x8 = new X2();
        zzb = x8;
        AbstractC1914k1.C(X2.class, x8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", W2.f18043a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new X2();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new V2(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
