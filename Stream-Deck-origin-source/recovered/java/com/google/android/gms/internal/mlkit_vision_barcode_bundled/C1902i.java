package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1902i extends AbstractC1914k1 implements N1 {
    private static final C1902i zzb;
    private int zzd;
    private m4 zzj;
    private Y3 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private InterfaceC1944q1 zzg = AbstractC1914k1.t();
    private String zzh = "";
    private String zzi = "";

    static {
        C1902i c1902i = new C1902i();
        zzb = c1902i;
        AbstractC1914k1.C(C1902i.class, c1902i);
        AbstractC1914k1.n(Y3.L(), c1902i, c1902i, null, 308676116, G2.f17963l, C1902i.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", QhsKALGiniuQ.iteFvkWLuZC, "zzg", C1897h.f18577a, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i9 == 3) {
            return new C1902i();
        }
        AbstractC1887f abstractC1887f = null;
        if (i9 == 4) {
            return new C1892g(abstractC1887f);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
