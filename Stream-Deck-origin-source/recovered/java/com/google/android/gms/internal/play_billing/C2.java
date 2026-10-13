package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2 extends AbstractC2056q0 implements W0 {
    private static final C2 zzb;
    private int zzd;
    private int zze;

    static {
        C2 c8 = new C2();
        zzb = c8;
        AbstractC2056q0.u(C2.class, c8);
    }

    public static C2 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", B2.f18746a});
        }
        if (i9 == 3) {
            return new C2();
        }
        z2 z2Var = null;
        if (i9 == 4) {
            return new A2(z2Var);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
