package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0;
import java.util.List;

/* JADX INFO: renamed from: y5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3125a extends AbstractC1914k1 implements N1 {
    private static final C3125a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC1948r1 zze = AbstractC1914k1.u();
    private String zzg = "";
    private J0 zzh = J0.f17985b;

    static {
        C3125a c3125a = new C3125a();
        zzb = c3125a;
        AbstractC1914k1.C(C3125a.class, c3125a);
    }

    public static C3125a K(byte[] bArr, V0 v8) {
        return (C3125a) AbstractC1914k1.q(zzb, bArr, v8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", C3135k.f38432a, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new C3125a();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new x(abstractC3126b);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List L() {
        return this.zze;
    }
}
