package p212y5;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1923m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1933o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1952s0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F extends AbstractC1914k1 implements N1 {
    private static final F zzb;
    private int zzd;
    private C1933o0 zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC1948r1 zzh = AbstractC1914k1.u();
    private InterfaceC1948r1 zzi = AbstractC1914k1.u();
    private InterfaceC1948r1 zzj = AbstractC1914k1.u();
    private InterfaceC1948r1 zzk = AbstractC1914k1.u();
    private String zzl = "";

    static {
        F f8 = new F();
        zzb = f8;
        AbstractC1914k1.C(F.class, f8);
    }

    public static F L() {
        return zzb;
    }

    public final C1933o0 J() {
        C1933o0 c1933o0 = this.zze;
        return c1933o0 == null ? C1933o0.K() : c1933o0;
    }

    public final String M() {
        return this.zzf;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzk;
    }

    public final List P() {
        return this.zzi;
    }

    public final List Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", WaYxBuDSBD.otvzpt, "zzh", C1952s0.class, "zzi", L.class, "zzj", "zzk", C1923m0.class, "zzl"});
        }
        if (i9 == 3) {
            return new F();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new E(abstractC3126b);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
