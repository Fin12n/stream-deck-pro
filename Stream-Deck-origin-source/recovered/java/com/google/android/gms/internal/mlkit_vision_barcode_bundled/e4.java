package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import I0.mIk.efuWFSeiT;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e4 extends AbstractC1914k1 implements N1 {
    private static final e4 zzb;
    private int zzd;
    private Y3 zzj;
    private byte zzk = 2;
    private InterfaceC1944q1 zze = AbstractC1914k1.t();
    private InterfaceC1939p1 zzf = AbstractC1914k1.r();
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        e4 e4Var = new e4();
        zzb = e4Var;
        AbstractC1914k1.C(e4.class, e4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", efuWFSeiT.CHKgzIkxco, "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new e4();
        }
        c4 c4Var = null;
        if (i9 == 4) {
            return new d4(c4Var);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
