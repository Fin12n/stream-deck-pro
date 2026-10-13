package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1998b2 extends AbstractC2056q0 implements W0 {
    private static final C1998b2 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C1998b2 c1998b2 = new C1998b2();
        zzb = c1998b2;
        AbstractC2056q0.u(C1998b2.class, c1998b2);
    }

    public static /* synthetic */ void B(C1998b2 c1998b2, int i8) {
        c1998b2.zzd |= 1;
        c1998b2.zze = i8;
    }

    public static /* synthetic */ void C(C1998b2 c1998b2, String str) {
        str.getClass();
        c1998b2.zzd |= 2;
        c1998b2.zzf = str;
    }

    public static /* synthetic */ void D(C1998b2 c1998b2, String str) {
        c1998b2.zzd |= 8;
        c1998b2.zzh = str;
    }

    public static /* synthetic */ void E(C1998b2 c1998b2, int i8) {
        c1998b2.zzg = i8 - 1;
        c1998b2.zzd |= 4;
    }

    public static X1 F() {
        return (X1) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", Z1.f18853a, "zzh"});
        }
        if (i9 == 3) {
            return new C1998b2();
        }
        W1 w8 = null;
        if (i9 == 4) {
            return new X1(w8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
