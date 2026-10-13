package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1952s0 extends AbstractC1914k1 implements N1 {
    private static final C1952s0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C1952s0 c1952s0 = new C1952s0();
        zzb = c1952s0;
        AbstractC1914k1.C(C1952s0.class, c1952s0);
    }

    public static C1952s0 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C1943q0.f18630a, "zzf"});
        }
        if (i9 == 3) {
            return new C1952s0();
        }
        AbstractC1903i0 abstractC1903i0 = null;
        if (i9 == 4) {
            return new C1938p0(abstractC1903i0);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzf;
    }

    public final int M() {
        int iA = AbstractC1947r0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
