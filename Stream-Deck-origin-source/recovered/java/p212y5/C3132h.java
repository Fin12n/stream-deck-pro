package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: renamed from: y5.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3132h extends AbstractC1914k1 implements N1 {
    private static final C3132h zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C3132h c3132h = new C3132h();
        zzb = c3132h;
        AbstractC1914k1.C(C3132h.class, c3132h);
    }

    public static C3131g L() {
        return (C3131g) zzb.l();
    }

    public static /* synthetic */ void N(C3132h c3132h, int i8) {
        c3132h.zzd |= 1;
        c3132h.zze = i8;
    }

    public static /* synthetic */ void O(C3132h c3132h, int i8) {
        c3132h.zzd |= 2;
        c3132h.zzf = i8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C3132h();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new C3131g(abstractC3126b);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int J() {
        return this.zze;
    }

    public final int K() {
        return this.zzf;
    }
}
