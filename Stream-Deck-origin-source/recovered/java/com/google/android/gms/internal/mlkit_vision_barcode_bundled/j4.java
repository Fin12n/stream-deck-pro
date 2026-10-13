package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j4 extends AbstractC1914k1 implements N1 {
    private static final j4 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private Y3 zzg;
    private byte zzh = 2;

    static {
        j4 j4Var = new j4();
        zzb = j4Var;
        AbstractC1914k1.C(j4.class, j4Var);
        AbstractC1914k1.n(Y3.L(), j4Var, j4Var, null, 13258261, G2.f17963l, j4.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new j4();
        }
        h4 h4Var = null;
        if (i9 == 4) {
            return new i4(h4Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
