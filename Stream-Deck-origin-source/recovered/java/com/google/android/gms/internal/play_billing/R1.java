package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class R1 extends AbstractC2056q0 implements W0 {
    private static final R1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C1998b2 zzh;

    static {
        R1 r8 = new R1();
        zzb = r8;
        AbstractC2056q0.u(R1.class, r8);
    }

    public static R1 B(byte[] bArr, C2008e0 c2008e0) {
        return (R1) AbstractC2056q0.m(zzb, bArr, c2008e0);
    }

    public static /* synthetic */ void C(R1 r8, C1998b2 c1998b2) {
        c1998b2.getClass();
        r8.zzh = c1998b2;
        r8.zzd |= 2;
    }

    public static /* synthetic */ void D(R1 r8, s2 s2Var) {
        s2Var.getClass();
        r8.zzf = s2Var;
        r8.zze = 4;
    }

    public static /* synthetic */ void E(R1 r8, int i8) {
        r8.zzg = i8 - 1;
        r8.zzd |= 1;
    }

    public static Q1 F() {
        return (Q1) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", S1.f18823a, "zzh", s2.class});
        }
        if (i9 == 3) {
            return new R1();
        }
        P1 p8 = null;
        if (i9 == 4) {
            return new Q1(p8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
