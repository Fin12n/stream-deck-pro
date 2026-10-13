package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC1914k1 implements N1 {
    private static final u zzb;
    private InterfaceC1948r1 zzd = AbstractC1914k1.u();
    private InterfaceC1948r1 zze = AbstractC1914k1.u();

    static {
        u uVar = new u();
        zzb = uVar;
        AbstractC1914k1.C(u.class, uVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", r.class, "zze", r.class});
        }
        if (i9 == 3) {
            return new u();
        }
        s sVar = null;
        if (i9 == 4) {
            return new t(sVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
