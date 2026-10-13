package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends AbstractC2056q0 implements W0 {
    private static final s2 zzb;
    private int zzd;
    private int zze;

    static {
        s2 s2Var = new s2();
        zzb = s2Var;
        AbstractC2056q0.u(s2.class, s2Var);
    }

    public static /* synthetic */ void B(s2 s2Var, int i8) {
        s2Var.zze = i8 - 1;
        s2Var.zzd |= 1;
    }

    public static C2058q2 C() {
        return (C2058q2) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2061r2.f19009a});
        }
        if (i9 == 3) {
            return new s2();
        }
        AbstractC2054p2 abstractC2054p2 = null;
        if (i9 == 4) {
            return new C2058q2(abstractC2054p2);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
