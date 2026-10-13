package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1975w3 extends AbstractC1914k1 implements N1 {
    private static final C1975w3 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private J0 zzh = J0.f17985b;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        C1975w3 c1975w3 = new C1975w3();
        zzb = c1975w3;
        AbstractC1914k1.C(C1975w3.class, c1975w3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            InterfaceC1934o1 interfaceC1934o1 = C1965u3.f18668a;
            InterfaceC1934o1 interfaceC1934o2 = C1970v3.f18683a;
            return AbstractC1914k1.x(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", interfaceC1934o1, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", interfaceC1934o2, "zzn", interfaceC1934o2, "zzo"});
        }
        if (i9 == 3) {
            return new C1975w3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new C1960t3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
