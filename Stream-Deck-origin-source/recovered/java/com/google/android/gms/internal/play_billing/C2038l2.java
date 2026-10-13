package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2038l2 extends AbstractC2056q0 implements W0 {
    private static final C2038l2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C2038l2 c2038l2 = new C2038l2();
        zzb = c2038l2;
        AbstractC2056q0.u(C2038l2.class, c2038l2);
    }

    public static /* synthetic */ void B(C2038l2 c2038l2, String str) {
        str.getClass();
        c2038l2.zzd |= 1;
        c2038l2.zze = str;
    }

    public static /* synthetic */ void C(C2038l2 c2038l2, String str) {
        str.getClass();
        c2038l2.zzd |= 2;
        c2038l2.zzf = str;
    }

    public static /* synthetic */ void D(C2038l2 c2038l2, int i8) {
        c2038l2.zzd |= 4;
        c2038l2.zzg = i8;
    }

    public static C2034k2 E() {
        return (C2034k2) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new C2038l2();
        }
        AbstractC2030j2 abstractC2030j2 = null;
        if (i9 == 4) {
            return new C2034k2(abstractC2030j2);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
