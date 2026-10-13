package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC1914k1 implements N1 {
    private static final L zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        L l8 = new L();
        zzb = l8;
        AbstractC1914k1.C(L.class, l8);
    }

    public static L K() {
        return zzb;
    }

    public final String L() {
        return this.zzf;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzg;
    }

    public final int O() {
        int iA = K.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", BpgIURjN.EnvlRv, J.f38431a, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new L();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new I(abstractC3126b);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
