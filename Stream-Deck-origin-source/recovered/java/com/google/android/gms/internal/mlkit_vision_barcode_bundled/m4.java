package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m4 extends AbstractC1914k1 implements N1 {
    private static final m4 zzb;
    private int zzd;
    private C1867b zze;

    static {
        m4 m4Var = new m4();
        zzb = m4Var;
        AbstractC1914k1.C(m4.class, m4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new m4();
        }
        k4 k4Var = null;
        if (i9 == 4) {
            return new l4(k4Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
