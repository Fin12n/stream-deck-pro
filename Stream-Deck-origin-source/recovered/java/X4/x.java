package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC1914k1 implements N1 {
    private static final x zzb;

    static {
        x xVar = new x();
        zzb = xVar;
        AbstractC1914k1.C(x.class, xVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        v vVar = null;
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0000", null);
        }
        if (i9 == 3) {
            return new x();
        }
        if (i9 == 4) {
            return new w(vVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
