package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y2 extends AbstractC2056q0 implements W0 {
    private static final y2 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC2078x0 zze = AbstractC2056q0.p();
    private String zzg = "";

    static {
        y2 y2Var = new y2();
        zzb = y2Var;
        AbstractC2056q0.u(y2.class, y2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new y2();
        }
        w2 w2Var = null;
        if (i9 == 4) {
            return new x2(w2Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
