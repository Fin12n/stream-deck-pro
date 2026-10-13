package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B3 extends AbstractC1914k1 implements N1 {
    private static final B3 zzb;
    private int zzd;
    private int zze;

    static {
        B3 b8 = new B3();
        zzb = b8;
        AbstractC1914k1.C(B3.class, b8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new B3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new A3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
