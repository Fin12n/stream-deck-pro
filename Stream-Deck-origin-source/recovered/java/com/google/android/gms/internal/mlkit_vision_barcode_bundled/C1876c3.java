package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1876c3 extends AbstractC1914k1 implements N1 {
    private static final C1876c3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC1948r1 zzg = AbstractC1914k1.u();
    private int zzh;

    static {
        C1876c3 c1876c3 = new C1876c3();
        zzb = c1876c3;
        AbstractC1914k1.C(C1876c3.class, c1876c3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", C1866a3.f18056a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new C1876c3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new Z2(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
