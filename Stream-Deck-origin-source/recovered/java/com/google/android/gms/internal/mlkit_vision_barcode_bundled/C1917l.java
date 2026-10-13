package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1917l extends AbstractC1914k1 implements N1 {
    private static final C1917l zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C1917l c1917l = new C1917l();
        zzb = c1917l;
        AbstractC1914k1.C(C1917l.class, c1917l);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", GOKsbdzhLhXAMt.NpDghazVTZpNfz});
        }
        if (i9 == 3) {
            return new C1917l();
        }
        AbstractC1907j abstractC1907j = null;
        if (i9 == 4) {
            return new C1912k(abstractC1907j);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
