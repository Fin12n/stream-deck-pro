package O4;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p140p5.AbstractC2793c;
import p140p5.C2797g;
import p219z4.C3204m;

/* JADX INFO: renamed from: O4.x5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1539x5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static N5 f8640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final P5 f8641l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1491q5 f8644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p140p5.m f8645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S4.k f8646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S4.k f8647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f8650i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f8651j = new HashMap();

    public C1539x5(Context context, final p140p5.m mVar, InterfaceC1491q5 interfaceC1491q5, String str) {
        this.f8642a = context.getPackageName();
        this.f8643b = AbstractC2793c.a(context);
        this.f8645d = mVar;
        this.f8644c = interfaceC1491q5;
        K5.a();
        this.f8648g = str;
        this.f8646e = C2797g.a().b(new Callable() { // from class: O4.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8564a.a();
            }
        });
        C2797g c2797gA = C2797g.a();
        mVar.getClass();
        this.f8647f = c2797gA.b(new Callable() { // from class: O4.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        P5 p8 = f8641l;
        this.f8649h = p8.containsKey(str) ? DynamiteModule.b(context, (String) p8.get(str)) : -1;
    }

    public static synchronized N5 d() {
        try {
            N5 n8 = f8640k;
            if (n8 != null) {
                return n8;
            }
            P1.g gVarA = P1.e.a(Resources.getSystem().getConfiguration());
            C1470n5 c1470n5 = new C1470n5();
            for (int i8 = 0; i8 < gVarA.g(); i8++) {
                c1470n5.c(AbstractC2793c.b(gVarA.c(i8)));
            }
            N5 n5D = c1470n5.d();
            f8640k = n5D;
            return n5D;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ String a() {
        return C3204m.a().b(this.f8648g);
    }

    public final /* synthetic */ void b(InterfaceC1484p5 interfaceC1484p5, F3 f8, String str) {
        interfaceC1484p5.a(f8);
        String strJ = interfaceC1484p5.j();
        K4 k8 = new K4();
        k8.b(this.f8642a);
        k8.c(this.f8643b);
        k8.h(d());
        k8.g(Boolean.TRUE);
        k8.l(strJ);
        k8.j(str);
        k8.i(this.f8647f.l() ? (String) this.f8647f.i() : this.f8645d.a());
        k8.d(10);
        k8.k(Integer.valueOf(this.f8649h));
        interfaceC1484p5.b(k8);
        this.f8644c.a(interfaceC1484p5);
    }

    public final void c(H5 h8, final F3 f8) {
        EnumC1502s3 enumC1502s3;
        EnumC1544y3 enumC1544y3;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8650i.get(f8) != null && jElapsedRealtime - ((Long) this.f8650i.get(f8)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f8650i.put(f8, Long.valueOf(jElapsedRealtime));
        int i8 = h8.f7890a;
        int i9 = h8.f7891b;
        int i10 = h8.f7892c;
        int i11 = h8.f7893d;
        int i12 = h8.f7894e;
        long j8 = h8.f7895f;
        int i13 = h8.f7896g;
        C1537x3 c1537x3 = new C1537x3();
        if (i8 == -1) {
            enumC1502s3 = EnumC1502s3.BITMAP;
        } else if (i8 == 35) {
            enumC1502s3 = EnumC1502s3.YUV_420_888;
        } else if (i8 == 842094169) {
            enumC1502s3 = EnumC1502s3.YV12;
        } else if (i8 != 16) {
            enumC1502s3 = i8 != 17 ? EnumC1502s3.UNKNOWN_FORMAT : EnumC1502s3.NV21;
        } else {
            enumC1502s3 = EnumC1502s3.NV16;
        }
        c1537x3.d(enumC1502s3);
        if (i9 == 1) {
            enumC1544y3 = EnumC1544y3.BITMAP;
        } else if (i9 == 2) {
            enumC1544y3 = EnumC1544y3.BYTEARRAY;
        } else if (i9 != 3) {
            enumC1544y3 = i9 != 4 ? EnumC1544y3.ANDROID_MEDIA_IMAGE : EnumC1544y3.FILEPATH;
        } else {
            enumC1544y3 = EnumC1544y3.BYTEBUFFER;
        }
        c1537x3.f(enumC1544y3);
        c1537x3.c(Integer.valueOf(i10));
        c1537x3.e(Integer.valueOf(i11));
        c1537x3.g(Integer.valueOf(i12));
        c1537x3.b(Long.valueOf(j8));
        c1537x3.h(Integer.valueOf(i13));
        A3 a3J = c1537x3.j();
        G3 g8 = new G3();
        g8.d(a3J);
        final InterfaceC1484p5 interfaceC1484p5D = y5.d(g8);
        final String strB = this.f8646e.l() ? (String) this.f8646e.i() : C3204m.a().b(this.f8648g);
        C2797g.d().execute(new Runnable() { // from class: O4.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f8605a.b(interfaceC1484p5D, f8, strB);
            }
        });
    }
}
