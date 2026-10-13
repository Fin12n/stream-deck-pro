package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1916k3 extends AbstractC1914k1 implements N1 {
    private static final C1916k3 zzb;
    private int zzd;
    private int zze;
    private C1876c3 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private InterfaceC1948r1 zzf = AbstractC1914k1.u();
    private int zzg = -1;
    private String zzi = "";
    private InterfaceC1944q1 zzl = AbstractC1914k1.t();
    private String zzm = "";

    static {
        C1916k3 c1916k3 = new C1916k3();
        zzb = c1916k3;
        AbstractC1914k1.C(C1916k3.class, c1916k3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", C1891f3.f18126a, "zzf", C1886e3.class, "zzg", "zzh", "zzi", "zzj", C1901h3.f18579a, "zzk", C1906i3.f18582a, "zzl", "zzm", "zzn", C1911j3.f18588a});
        }
        if (i9 == 3) {
            return new C1916k3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new C1896g3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
