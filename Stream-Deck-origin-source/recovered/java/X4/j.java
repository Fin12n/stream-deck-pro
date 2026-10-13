package X4;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends AbstractC1914k1 implements N1 {
    private static final j zzb;
    private InterfaceC1948r1 zzd = AbstractC1914k1.u();

    static {
        j jVar = new j();
        zzb = jVar;
        AbstractC1914k1.C(j.class, jVar);
    }

    public static i J() {
        return (i) zzb.l();
    }

    public static /* synthetic */ void L(j jVar, g gVar) {
        gVar.getClass();
        InterfaceC1948r1 interfaceC1948r1 = jVar.zzd;
        if (!interfaceC1948r1.j()) {
            jVar.zzd = AbstractC1914k1.v(interfaceC1948r1);
        }
        jVar.zzd.add(gVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", g.class});
        }
        if (i9 == 3) {
            return new j();
        }
        h hVar = null;
        if (i9 == 4) {
            return new i(hVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
