package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC1914k1 implements N1 {
    private static final q zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        q qVar = new q();
        zzb = qVar;
        AbstractC1914k1.C(q.class, qVar);
    }

    public static q K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C3139o.f38433a, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new q();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new C3138n(abstractC3126b);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String L() {
        return this.zzg;
    }

    public final String M() {
        return this.zze;
    }

    public final int N() {
        int iA = AbstractC3140p.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
