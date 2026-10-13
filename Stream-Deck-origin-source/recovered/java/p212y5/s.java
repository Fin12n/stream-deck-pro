package p212y5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1952s0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1944q1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC1914k1 implements N1 {
    private static final s zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private J0 zzf;
    private String zzg;
    private C3130f zzh;
    private int zzi;
    private F zzj;
    private L zzk;
    private C1952s0 zzl;
    private C3134j zzm;
    private q zzn;
    private C3137m zzo;
    private P zzp;
    private D zzq;
    private H zzr;
    private z zzs;
    private InterfaceC1948r1 zzt;
    private InterfaceC1944q1 zzu;
    private String zzv;
    private InterfaceC1948r1 zzw;
    private boolean zzx;
    private double zzy;
    private J0 zzz;

    static {
        s sVar = new s();
        zzb = sVar;
        AbstractC1914k1.C(s.class, sVar);
    }

    public s() {
        J0 j8 = J0.f17985b;
        this.zzf = j8;
        this.zzg = "";
        this.zzt = AbstractC1914k1.u();
        this.zzu = AbstractC1914k1.t();
        this.zzv = "";
        this.zzw = AbstractC1914k1.u();
        this.zzx = true;
        this.zzz = j8;
    }

    public static /* synthetic */ void Y(s sVar, int i8, C3132h c3132h) {
        c3132h.getClass();
        InterfaceC1948r1 interfaceC1948r1 = sVar.zzt;
        if (!interfaceC1948r1.j()) {
            sVar.zzt = AbstractC1914k1.v(interfaceC1948r1);
        }
        sVar.zzt.set(i8, c3132h);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i9 == 2) {
            return AbstractC1914k1.x(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", t.f38434a, "zzf", "zzg", "zzi", v.f38435a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C3132h.class, "zzv", "zzw", C3132h.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i9 == 3) {
            return new s();
        }
        AbstractC3126b abstractC3126b = null;
        if (i9 == 4) {
            return new r(abstractC3126b);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int J() {
        int iA = w.a(this.zzi);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int K() {
        return this.zzt.size();
    }

    public final C1952s0 L() {
        C1952s0 c1952s0 = this.zzl;
        return c1952s0 == null ? C1952s0.K() : c1952s0;
    }

    public final D N() {
        D d8 = this.zzq;
        return d8 == null ? D.M() : d8;
    }

    public final F O() {
        F f8 = this.zzj;
        return f8 == null ? F.L() : f8;
    }

    public final H P() {
        H h8 = this.zzr;
        return h8 == null ? H.K() : h8;
    }

    public final L Q() {
        L l8 = this.zzk;
        return l8 == null ? L.K() : l8;
    }

    public final P R() {
        P p8 = this.zzp;
        return p8 == null ? P.M() : p8;
    }

    public final C3134j S() {
        C3134j c3134j = this.zzm;
        return c3134j == null ? C3134j.K() : c3134j;
    }

    public final C3137m T() {
        C3137m c3137m = this.zzo;
        return c3137m == null ? C3137m.K() : c3137m;
    }

    public final q U() {
        q qVar = this.zzn;
        return qVar == null ? q.K() : qVar;
    }

    public final J0 V() {
        return this.zzf;
    }

    public final String W() {
        return this.zzg;
    }

    public final List X() {
        return this.zzt;
    }

    public final boolean Z() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 32) != 0;
    }

    public final boolean b0() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean c0() {
        return (this.zzd & 64) != 0;
    }

    public final boolean d0() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean e0() {
        return (this.zzd & 128) != 0;
    }

    public final boolean f0() {
        return (this.zzd & 256) != 0;
    }

    public final boolean g0() {
        return (this.zzd & 1024) != 0;
    }

    public final boolean h0() {
        return (this.zzd & 512) != 0;
    }

    public final int i0() {
        int iA = u.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
