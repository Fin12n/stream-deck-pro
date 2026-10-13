package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3 extends AbstractC1914k1 implements N1 {
    private static final C3 zzb;
    private int zzd;
    private int zzg;
    private j4 zzh;
    private e4 zzi;
    private Y3 zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private InterfaceC1948r1 zzf = AbstractC1914k1.u();
    private InterfaceC1948r1 zzl = AbstractC1914k1.u();

    static {
        C3 c8 = new C3();
        zzb = c8;
        AbstractC1914k1.C(C3.class, c8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C1871b3.f18111a, "zzf", C1902i.class, "zzg", "zzh", "zzi", "zzk", "zzl", C1917l.class, "zzj"});
        }
        if (i9 == 3) {
            return new C3();
        }
        AbstractC1865a2 abstractC1865a2 = null;
        if (i9 == 4) {
            return new A2(abstractC1865a2);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
