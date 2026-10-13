package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2050o2 extends AbstractC2056q0 implements W0 {
    private static final C2050o2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C2050o2 c2050o2 = new C2050o2();
        zzb = c2050o2;
        AbstractC2056q0.u(C2050o2.class, c2050o2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C2050o2();
        }
        AbstractC2042m2 abstractC2042m2 = null;
        if (i9 == 4) {
            return new C2046n2(abstractC2042m2);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
