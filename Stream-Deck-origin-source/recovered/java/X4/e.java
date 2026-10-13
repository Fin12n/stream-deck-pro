package X4;

import T0.Vl.PCRzgdeK;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;
import p179u4.eubL.OjEsfyJYzbPn;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC1914k1 implements N1 {
    private static final e zzb;
    private int zzd;
    private String zze;
    private J0 zzf;
    private String zzg;
    private J0 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        e eVar = new e();
        zzb = eVar;
        AbstractC1914k1.C(e.class, eVar);
    }

    public static C1671d J() {
        return (C1671d) zzb.l();
    }

    public static /* synthetic */ void L(e eVar, J0 j8) {
        j8.getClass();
        eVar.zzd |= 2;
        eVar.zzf = j8;
    }

    public static /* synthetic */ void M(e eVar, J0 j8) {
        j8.getClass();
        eVar.zzd |= 8;
        eVar.zzh = j8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", PCRzgdeK.oKqMAzbTgc, "zzh", RaiWHuj.aLSwvFStiMdewk, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i9 == 3) {
            return new e();
        }
        AbstractC1670c abstractC1670c = null;
        if (i9 == 4) {
            return new C1671d(abstractC1670c);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }

    public e() {
        String str = OjEsfyJYzbPn.FNUuvlvpSgT;
        this.zze = str;
        J0 j8 = J0.f17985b;
        this.zzf = j8;
        this.zzg = str;
        this.zzh = j8;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }
}
