package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1867b extends AbstractC1914k1 implements N1 {
    private static final C1867b zzb;
    private int zzd;
    private C1882e zze;
    private boolean zzf;

    static {
        C1867b c1867b = new C1867b();
        zzb = c1867b;
        AbstractC1914k1.C(C1867b.class, c1867b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C1867b();
        }
        n4 n4Var = null;
        if (i9 == 4) {
            return new o4(n4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
