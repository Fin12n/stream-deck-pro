package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: renamed from: y5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3130f extends AbstractC1914k1 implements N1 {
    private static final C3130f zzb;
    private InterfaceC1948r1 zzd = AbstractC1914k1.u();

    static {
        C3130f c3130f = new C3130f();
        zzb = c3130f;
        AbstractC1914k1.C(C3130f.class, c3130f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C3129e.class});
        }
        if (i9 == 3) {
            return new C3130f();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new C3127c(abstractC3126b);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
