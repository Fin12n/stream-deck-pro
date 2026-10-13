package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1939p1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC1914k1 implements N1 {
    private static final g zzb;
    private int zzd;
    private InterfaceC1939p1 zze = AbstractC1914k1.r();
    private InterfaceC1939p1 zzf = AbstractC1914k1.r();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        g gVar = new g();
        zzb = gVar;
        AbstractC1914k1.C(g.class, gVar);
    }

    public static f J() {
        return (f) zzb.l();
    }

    public static /* synthetic */ void L(g gVar, int i8) {
        gVar.zzd |= 2;
        gVar.zzh = i8;
    }

    public static /* synthetic */ void M(g gVar, float f8) {
        InterfaceC1939p1 interfaceC1939p1 = gVar.zze;
        if (!interfaceC1939p1.j()) {
            gVar.zze = AbstractC1914k1.s(interfaceC1939p1);
        }
        gVar.zze.B(f8);
    }

    public static /* synthetic */ void N(g gVar, float f8) {
        InterfaceC1939p1 interfaceC1939p1 = gVar.zzf;
        if (!interfaceC1939p1.j()) {
            gVar.zzf = AbstractC1914k1.s(interfaceC1939p1);
        }
        gVar.zzf.B(f8);
    }

    public static /* synthetic */ void O(g gVar, int i8) {
        gVar.zzd |= 1;
        gVar.zzg = i8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new g();
        }
        AbstractC1669b abstractC1669b = null;
        if (i9 == 4) {
            return new f(abstractC1669b);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
