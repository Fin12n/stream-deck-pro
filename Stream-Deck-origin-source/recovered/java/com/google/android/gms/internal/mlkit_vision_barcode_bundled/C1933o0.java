package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1933o0 extends AbstractC1914k1 implements N1 {
    private static final C1933o0 zzb;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;

    static {
        C1933o0 c1933o0 = new C1933o0();
        zzb = c1933o0;
        AbstractC1914k1.C(C1933o0.class, c1933o0);
    }

    public static C1933o0 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new C1933o0();
        }
        AbstractC1903i0 abstractC1903i0 = null;
        if (i9 == 4) {
            return new C1928n0(abstractC1903i0);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zze;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzi;
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzf;
    }

    public final String R() {
        return this.zzk;
    }

    public C1933o0() {
        String str = kDsnNkYbBsI.QKbooKIKkdG;
        this.zze = str;
        this.zzf = str;
        this.zzg = str;
        this.zzh = str;
        this.zzi = str;
        this.zzj = str;
        this.zzk = str;
    }
}
