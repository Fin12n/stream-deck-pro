package com.google.android.gms.internal.play_billing;

import p211y4.vJ.RaiWHuj;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2026i2 extends AbstractC2056q0 implements W0 {
    private static final InterfaceC2075w0 zzb = new C2002c2();
    private static final C2026i2 zzd;
    private int zze;
    private int zzg;
    private C1998b2 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC2072v0 zzh = AbstractC2056q0.n();
    private InterfaceC2078x0 zzi = AbstractC2056q0.p();

    static {
        C2026i2 c2026i2 = new C2026i2();
        zzd = c2026i2;
        AbstractC2056q0.u(C2026i2.class, c2026i2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2056q0
    public final Object y(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC2056q0.r(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", C2022h2.f18908a, "zzh", C2010e2.f18892a, "zzi", y2.class, RaiWHuj.hSIvmU, "zzk", "zzl"});
        }
        if (i9 == 3) {
            return new C2026i2();
        }
        C2002c2 c2002c2 = null;
        if (i9 == 4) {
            return new C2018g2(c2002c2);
        }
        if (i9 != 5) {
            return null;
        }
        return zzd;
    }
}
