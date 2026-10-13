package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1931n3 extends AbstractC1914k1 implements N1 {
    private static final C1931n3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C1931n3 c1931n3 = new C1931n3();
        zzb = c1931n3;
        AbstractC1914k1.C(C1931n3.class, c1931n3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C1931n3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new C1926m3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
