package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1946q3 extends AbstractC1914k1 implements N1 {
    private static final C1946q3 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        C1946q3 c1946q3 = new C1946q3();
        zzb = c1946q3;
        AbstractC1914k1.C(C1946q3.class, c1946q3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            InterfaceC1934o1 interfaceC1934o1 = C1955s3.f18652a;
            InterfaceC1934o1 interfaceC1934o2 = C1936o3.f18609a;
            InterfaceC1934o1 interfaceC1934o3 = C1950r3.f18645a;
            return AbstractC1914k1.x(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", interfaceC1934o1, "zzg", "zzh", interfaceC1934o2, "zzi", interfaceC1934o3, "zzj", interfaceC1934o3, "zzk", interfaceC1934o3, "zzl", "zzm"});
        }
        if (i9 == 3) {
            return new C1946q3();
        }
        J2 j8 = null;
        if (i9 == 4) {
            return new C1941p3(j8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
