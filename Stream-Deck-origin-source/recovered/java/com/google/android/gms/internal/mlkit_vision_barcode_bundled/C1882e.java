package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import I0.mIk.efuWFSeiT;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1882e extends AbstractC1914k1 implements N1 {
    private static final C1882e zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        C1882e c1882e = new C1882e();
        zzb = c1882e;
        AbstractC1914k1.C(C1882e.class, c1882e);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", efuWFSeiT.IRHoByDnnh, f4.f18127a, "zzf"});
        }
        if (i9 == 3) {
            return new C1882e();
        }
        AbstractC1872c abstractC1872c = null;
        if (i9 == 4) {
            return new C1877d(abstractC1872c);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
