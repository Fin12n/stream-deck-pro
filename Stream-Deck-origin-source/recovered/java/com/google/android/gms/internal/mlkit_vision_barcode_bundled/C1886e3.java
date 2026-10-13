package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1886e3 extends AbstractC1914k1 implements N1 {
    private static final C1886e3 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C1886e3 c1886e3 = new C1886e3();
        zzb = c1886e3;
        AbstractC1914k1.C(C1886e3.class, c1886e3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", C1891f3.f18126a, "zzf"});
        }
        if (i9 == 3) {
            return new C1886e3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new C1881d3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
