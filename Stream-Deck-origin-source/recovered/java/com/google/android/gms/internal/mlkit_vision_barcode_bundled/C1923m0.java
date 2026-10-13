package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1923m0 extends AbstractC1914k1 implements N1 {
    private static final C1923m0 zzb;
    private int zzd;
    private int zze;
    private B1 zzg;
    private byte zzh = 2;
    private InterfaceC1948r1 zzf = AbstractC1914k1.u();

    static {
        C1923m0 c1923m0 = new C1923m0();
        zzb = c1923m0;
        AbstractC1914k1.C(C1923m0.class, c1923m0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C1913k0.f18589a, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new C1923m0();
        }
        AbstractC1903i0 abstractC1903i0 = null;
        if (i9 == 4) {
            return new C1908j0(abstractC1903i0);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List K() {
        return this.zzf;
    }

    public final int L() {
        int iA = AbstractC1918l0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
