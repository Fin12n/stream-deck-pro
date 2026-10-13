package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.L2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractC1914k1 implements N1 {
    private static final m zzb;
    private int zzd;
    private j zzj;
    private L2 zzl;
    private String zze = "";
    private J0 zzf = J0.f17985b;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        m mVar = new m();
        zzb = mVar;
        AbstractC1914k1.C(m.class, mVar);
    }

    public static l J() {
        return (l) zzb.l();
    }

    public static /* synthetic */ void L(m mVar, j jVar) {
        jVar.getClass();
        mVar.zzj = jVar;
        mVar.zzd |= 32;
    }

    public static /* synthetic */ void M(m mVar, J0 j8) {
        j8.getClass();
        mVar.zzd |= 2;
        mVar.zzf = j8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", hJroAgFztiMK.WkjUcKat, "zzh", "zzi", "zzj", "zzk", ajyWhveMDgQ.ggCT, "zzm", "zzn", "zzo"});
        }
        if (i9 == 3) {
            return new m();
        }
        k kVar = null;
        if (i9 == 4) {
            return new l(kVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
