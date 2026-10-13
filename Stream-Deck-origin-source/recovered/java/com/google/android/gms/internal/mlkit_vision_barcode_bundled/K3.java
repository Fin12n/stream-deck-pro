package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K3 extends AbstractC1914k1 implements N1 {
    private static final K3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        K3 k8 = new K3();
        zzb = k8;
        AbstractC1914k1.C(K3.class, k8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new K3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new J3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
