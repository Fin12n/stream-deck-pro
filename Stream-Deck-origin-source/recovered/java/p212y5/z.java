package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends AbstractC1914k1 implements N1 {
    private static final z zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC1948r1 zzf = AbstractC1914k1.u();

    static {
        z zVar = new z();
        zzb = zVar;
        AbstractC1914k1.C(z.class, zVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", N.class});
        }
        if (i9 == 3) {
            return new z();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new y(abstractC3126b);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
