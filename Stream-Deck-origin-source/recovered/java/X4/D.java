package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends AbstractC1914k1 implements N1 {
    private static final D zzb;

    static {
        D d8 = new D();
        zzb = d8;
        AbstractC1914k1.C(D.class, d8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        B b8 = null;
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0001\u0000", null);
        }
        if (i9 == 3) {
            return new D();
        }
        if (i9 == 4) {
            return new C(b8);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
