package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: renamed from: X4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1668a extends AbstractC1914k1 implements N1 {
    private static final C1668a zzb;
    private int zzd;
    private m zze;
    private e zzf;
    private u zzg;

    static {
        C1668a c1668a = new C1668a();
        zzb = c1668a;
        AbstractC1914k1.C(C1668a.class, c1668a);
    }

    public static o J() {
        return (o) zzb.l();
    }

    public static /* synthetic */ void L(C1668a c1668a, m mVar) {
        mVar.getClass();
        c1668a.zze = mVar;
        c1668a.zzd |= 1;
    }

    public static /* synthetic */ void M(C1668a c1668a, e eVar) {
        eVar.getClass();
        c1668a.zzf = eVar;
        c1668a.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new C1668a();
        }
        n nVar = null;
        if (i9 == 4) {
            return new o(nVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
