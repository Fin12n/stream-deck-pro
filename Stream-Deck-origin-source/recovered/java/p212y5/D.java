package p212y5;

import Z.JTT.ryTuoS;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC1914k1 implements N1 {
    private static final D zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private B zzj;
    private B zzk;

    static {
        D d8 = new D();
        zzb = d8;
        AbstractC1914k1.C(D.class, d8);
    }

    public static D M() {
        return zzb;
    }

    public final B J() {
        B b8 = this.zzk;
        return b8 == null ? B.Q() : b8;
    }

    public final B K() {
        B b8 = this.zzj;
        return b8 == null ? B.Q() : b8;
    }

    public final String N() {
        return this.zzf;
    }

    public final String O() {
        return this.zzg;
    }

    public final String P() {
        return this.zzh;
    }

    public final String Q() {
        return this.zzi;
    }

    public final String R() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", ryTuoS.OfuMrAEbQZsQvp, "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new D();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new C(abstractC3126b);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
