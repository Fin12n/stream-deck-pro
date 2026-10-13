package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B1 extends AbstractC1914k1 implements N1 {
    private static final B1 zzb;
    private int zzd;
    private Y3 zzi;
    private B1 zzj;
    private m4 zzk;
    private byte zzl = 2;
    private String zze = "";
    private InterfaceC1948r1 zzf = AbstractC1914k1.u();
    private InterfaceC1948r1 zzg = AbstractC1914k1.u();
    private InterfaceC1948r1 zzh = AbstractC1914k1.u();

    static {
        B1 b8 = new B1();
        zzb = b8;
        AbstractC1914k1.C(B1.class, b8);
        AbstractC1914k1.n(Y3.L(), b8, b8, null, 12208774, G2.f17963l, B1.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C3.class, "zzh", C3.class, "zzg", b4.class, "zzi", "zze", kDsnNkYbBsI.YwUVWz, "zzk"});
        }
        if (i9 == 3) {
            return new B1();
        }
        D0 d8 = null;
        if (i9 == 4) {
            return new C1879d1(d8);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
