package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC1914k1 implements N1 {
    private static final B zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        B b8 = new B();
        zzb = b8;
        AbstractC1914k1.C(B.class, b8);
    }

    public static B Q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new B();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new A(abstractC3126b);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public final int J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzh;
    }

    public final int L() {
        return this.zzi;
    }

    public final int M() {
        return this.zzf;
    }

    public final int N() {
        return this.zzj;
    }

    public final int O() {
        return this.zze;
    }

    public final boolean R() {
        return this.zzk;
    }
}
