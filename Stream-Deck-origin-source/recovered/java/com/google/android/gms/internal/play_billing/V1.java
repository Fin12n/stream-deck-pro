package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V1 extends AbstractC2056q0 implements W0 {
    private static final V1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        V1 v8 = new V1();
        zzb = v8;
        AbstractC2056q0.u(V1.class, v8);
    }

    public static /* synthetic */ void B(V1 v8, s2 s2Var) {
        s2Var.getClass();
        v8.zzf = s2Var;
        v8.zze = 2;
    }

    public static /* synthetic */ void C(V1 v8, int i8) {
        v8.zzg = i8 - 1;
        v8.zzd |= 1;
    }

    public static U1 D() {
        return (U1) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", S1.f18823a, s2.class, F2.class});
        }
        if (i9 == 3) {
            return new V1();
        }
        T1 t8 = null;
        if (i9 == 4) {
            return new U1(t8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
