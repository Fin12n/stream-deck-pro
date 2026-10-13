package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends AbstractC1914k1 implements N1 {
    private static final b4 zzb;
    private int zzd;
    private InterfaceC1948r1 zze = AbstractC1914k1.u();
    private String zzf = "";

    static {
        b4 b4Var = new b4();
        zzb = b4Var;
        AbstractC1914k1.C(b4.class, b4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new b4();
        }
        Z3 z8 = null;
        if (i9 == 4) {
            return new a4(z8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
