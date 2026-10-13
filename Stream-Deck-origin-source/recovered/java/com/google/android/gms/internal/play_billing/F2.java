package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F2 extends AbstractC2056q0 implements W0 {
    private static final F2 zzb;
    private int zzd;
    private int zze;

    static {
        F2 f8 = new F2();
        zzb = f8;
        AbstractC2056q0.u(F2.class, f8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new F2();
        }
        D2 d8 = null;
        if (i9 == 4) {
            return new E2(d8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
