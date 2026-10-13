package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U2 extends AbstractC1914k1 implements N1 {
    private static final U2 zzb;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        U2 u8 = new U2();
        zzb = u8;
        AbstractC1914k1.C(U2.class, u8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", T2.f18019a, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new U2();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new S2(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
