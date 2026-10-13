package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G3 extends AbstractC1914k1 implements N1 {
    private static final G3 zzb;
    private int zzd;
    private InterfaceC1948r1 zze = AbstractC1914k1.u();
    private I3 zzf;
    private N2 zzg;

    static {
        G3 g8 = new G3();
        zzb = g8;
        AbstractC1914k1.C(G3.class, g8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", S3.class, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new G3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new F3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
