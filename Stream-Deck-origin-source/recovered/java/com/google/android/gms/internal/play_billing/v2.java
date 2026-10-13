package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends AbstractC2056q0 implements W0 {
    private static final v2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C2038l2 zzg;
    private C2050o2 zzh;

    static {
        v2 v2Var = new v2();
        zzb = v2Var;
        AbstractC2056q0.u(v2.class, v2Var);
    }

    public static /* synthetic */ void B(v2 v2Var, C2 c8) {
        v2Var.zzf = c8;
        v2Var.zze = 4;
    }

    public static /* synthetic */ void C(v2 v2Var, C2038l2 c2038l2) {
        c2038l2.getClass();
        v2Var.zzg = c2038l2;
        v2Var.zzd |= 1;
    }

    public static /* synthetic */ void D(v2 v2Var, R1 r8) {
        v2Var.zzf = r8;
        v2Var.zze = 2;
    }

    public static /* synthetic */ void E(v2 v2Var, V1 v8) {
        v2Var.zzf = v8;
        v2Var.zze = 3;
    }

    public static u2 F() {
        return (u2) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", R1.class, V1.class, C2.class, C2026i2.class, "zzh"});
        }
        if (i9 == 3) {
            return new v2();
        }
        t2 t2Var = null;
        if (i9 == 4) {
            return new u2(t2Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
