package p188v5;

import N4.C1082a7;
import N4.C1100c1;
import N4.C1112d1;
import N4.C1136f1;
import N4.C1147g0;
import N4.C1226m7;
import N4.C1369z6;
import N4.C9;
import N4.D6;
import N4.E6;
import N4.K6;
import N4.M9;
import N4.N9;
import N4.P9;
import N4.Q9;
import N4.X6;
import N4.Y6;
import N4.Z6;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import p140p5.AbstractC2796f;
import p140p5.C2797g;
import p140p5.C2799i;
import p156r5.b;
import p204x5.a;
import p204x5.d;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends AbstractC2796f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f35150j = d.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f35151k = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f35152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N9 f35154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P9 f35155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f35156h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35157i;

    public k(C2799i c2799i, b bVar, l lVar, N9 n9) {
        AbstractC3207p.l(c2799i, "MlKitContext can not be null");
        AbstractC3207p.l(bVar, "BarcodeScannerOptions can not be null");
        this.f35152d = bVar;
        this.f35153e = lVar;
        this.f35154f = n9;
        this.f35155g = P9.a(c2799i.b());
    }

    @Override // p140p5.k
    public final synchronized void b() {
        this.f35157i = this.f35153e.j();
    }

    @Override // p140p5.k
    public final synchronized void d() {
        try {
            this.f35153e.zzb();
            f35151k = true;
            C1082a7 c1082a7 = new C1082a7();
            X6 x8 = this.f35157i ? X6.TYPE_THICK : X6.TYPE_THIN;
            N9 n9 = this.f35154f;
            c1082a7.e(x8);
            C1226m7 c1226m7 = new C1226m7();
            c1226m7.i(b.c(this.f35152d));
            c1082a7.g(c1226m7.j());
            n9.d(Q9.a(c1082a7), Z6.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ C9 j(long j8, Y6 y8, C1147g0 c1147g0, C1147g0 c1147g1, p196w5.a aVar) {
        E6 e8;
        C1226m7 c1226m7 = new C1226m7();
        K6 k8 = new K6();
        k8.c(Long.valueOf(j8));
        k8.d(y8);
        k8.e(Boolean.valueOf(f35151k));
        Boolean bool = Boolean.TRUE;
        k8.a(bool);
        k8.b(bool);
        c1226m7.h(k8.f());
        c1226m7.i(b.c(this.f35152d));
        c1226m7.e(c1147g0.g());
        c1226m7.f(c1147g1.g());
        int iE = aVar.e();
        int iC = f35150j.c(aVar);
        D6 d8 = new D6();
        if (iE == -1) {
            e8 = E6.BITMAP;
        } else if (iE == 35) {
            e8 = E6.YUV_420_888;
        } else if (iE == 842094169) {
            e8 = E6.YV12;
        } else if (iE != 16) {
            e8 = iE != 17 ? E6.UNKNOWN_FORMAT : E6.NV21;
        } else {
            e8 = E6.NV16;
        }
        d8.a(e8);
        d8.b(Integer.valueOf(iC));
        c1226m7.g(d8.d());
        C1082a7 c1082a7 = new C1082a7();
        c1082a7.e(this.f35157i ? X6.TYPE_THICK : X6.TYPE_THIN);
        c1082a7.g(c1226m7.j());
        return Q9.a(c1082a7);
    }

    public final /* synthetic */ C9 k(C1136f1 c1136f1, int i8, C1369z6 c1369z6) {
        C1082a7 c1082a7 = new C1082a7();
        c1082a7.e(this.f35157i ? X6.TYPE_THICK : X6.TYPE_THIN);
        C1100c1 c1100c1 = new C1100c1();
        c1100c1.a(Integer.valueOf(i8));
        c1100c1.c(c1136f1);
        c1100c1.b(c1369z6);
        c1082a7.d(c1100c1.e());
        return Q9.a(c1082a7);
    }

    @Override // p140p5.AbstractC2796f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized List i(p196w5.a aVar) throws Throwable {
        k kVar;
        p196w5.a aVar2;
        try {
            try {
                a aVar3 = this.f35156h;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                aVar3.a(aVar);
                try {
                    List listA = this.f35153e.a(aVar);
                    kVar = this;
                    aVar2 = aVar;
                    try {
                        kVar.m(Y6.NO_ERROR, jElapsedRealtime, aVar2, listA);
                        f35151k = false;
                        return listA;
                    } catch (p105l5.a e8) {
                        e = e8;
                        p105l5.a aVar4 = e;
                        kVar.m(aVar4.a() == 14 ? Y6.MODEL_NOT_DOWNLOADED : Y6.UNKNOWN_ERROR, jElapsedRealtime, aVar2, null);
                        throw aVar4;
                    }
                } catch (p105l5.a e9) {
                    e = e9;
                    kVar = this;
                    aVar2 = aVar;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void m(final Y6 y8, long j8, final p196w5.a aVar, List list) {
        final C1147g0 c1147g0 = new C1147g0();
        final C1147g0 c1147g1 = new C1147g0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p172t5.a aVar2 = (p172t5.a) it.next();
                c1147g0.e(b.a(aVar2.b()));
                c1147g1.e(b.b(aVar2.d()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j8;
        this.f35154f.f(new M9() { // from class: v5.i
            @Override // N4.M9
            public final C9 zza() {
                return this.f35143a.j(jElapsedRealtime, y8, c1147g0, c1147g1, aVar);
            }
        }, Z6.ON_DEVICE_BARCODE_DETECT);
        C1112d1 c1112d1 = new C1112d1();
        c1112d1.e(y8);
        c1112d1.f(Boolean.valueOf(f35151k));
        c1112d1.g(b.c(this.f35152d));
        c1112d1.c(c1147g0.g());
        c1112d1.d(c1147g1.g());
        final C1136f1 c1136f1H = c1112d1.h();
        final j jVar = new j(this);
        final N9 n9 = this.f35154f;
        final Z6 z8 = Z6.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C2797g.d().execute(new Runnable() { // from class: N4.L9
            @Override // java.lang.Runnable
            public final void run() {
                n9.h(z8, c1136f1H, jElapsedRealtime, jVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f35155g.c(true != this.f35157i ? 24301 : 24302, y8.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
