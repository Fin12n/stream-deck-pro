package N4;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p140p5.AbstractC2793c;
import p140p5.C2797g;
import p219z4.C3204m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class N9 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static AbstractC1183j0 f6498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1207l0 f6499l = AbstractC1207l0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D9 f6502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p140p5.m f6503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S4.k f6504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S4.k f6505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f6508i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f6509j = new HashMap();

    public N9(Context context, final p140p5.m mVar, D9 d9, String str) {
        this.f6500a = context.getPackageName();
        this.f6501b = AbstractC2793c.a(context);
        this.f6503d = mVar;
        this.f6502c = d9;
        C1085aa.a();
        this.f6506g = str;
        this.f6504e = C2797g.a().b(new Callable() { // from class: N4.J9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6324a.b();
            }
        });
        C2797g c2797gA = C2797g.a();
        Objects.requireNonNull(mVar);
        this.f6505f = c2797gA.b(new Callable() { // from class: N4.K9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mVar.a();
            }
        });
        AbstractC1207l0 abstractC1207l0 = f6499l;
        this.f6507h = abstractC1207l0.containsKey(str) ? DynamiteModule.b(context, (String) abstractC1207l0.get(str)) : -1;
    }

    public static long a(List list, double d8) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d8 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    public static synchronized AbstractC1183j0 i() {
        try {
            AbstractC1183j0 abstractC1183j0 = f6498k;
            if (abstractC1183j0 != null) {
                return abstractC1183j0;
            }
            P1.g gVarA = P1.e.a(Resources.getSystem().getConfiguration());
            C1147g0 c1147g0 = new C1147g0();
            for (int i8 = 0; i8 < gVarA.g(); i8++) {
                c1147g0.e(AbstractC2793c.b(gVarA.c(i8)));
            }
            AbstractC1183j0 abstractC1183j0G = c1147g0.g();
            f6498k = abstractC1183j0G;
            return abstractC1183j0G;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ String b() {
        return C3204m.a().b(this.f6506g);
    }

    public final /* synthetic */ void c(C9 c9, Z6 z8, String str) {
        c9.n(z8);
        String strK = c9.k();
        Y8 y8 = new Y8();
        y8.b(this.f6500a);
        y8.c(this.f6501b);
        y8.h(i());
        y8.g(Boolean.TRUE);
        y8.l(strK);
        y8.j(str);
        y8.i(this.f6505f.l() ? (String) this.f6505f.i() : this.f6503d.a());
        y8.d(10);
        y8.k(Integer.valueOf(this.f6507h));
        c9.l(y8);
        this.f6502c.a(c9);
    }

    public final void d(C9 c9, Z6 z8) {
        e(c9, z8, j());
    }

    public final void e(final C9 c9, final Z6 z8, final String str) {
        C2797g.d().execute(new Runnable() { // from class: N4.H9
            @Override // java.lang.Runnable
            public final void run() {
                this.f6307a.c(c9, z8, str);
            }
        });
    }

    public final void f(M9 m9, Z6 z8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(z8, jElapsedRealtime, 30L)) {
            this.f6508i.put(z8, Long.valueOf(jElapsedRealtime));
            e(m9.zza(), z8, j());
        }
    }

    public final /* synthetic */ void g(Z6 z8, p188v5.j jVar) {
        InterfaceC1243o0 interfaceC1243o0 = (InterfaceC1243o0) this.f6509j.get(z8);
        if (interfaceC1243o0 != null) {
            for (Object obj : interfaceC1243o0.c()) {
                ArrayList arrayList = new ArrayList(interfaceC1243o0.b(obj));
                Collections.sort(arrayList);
                C1347x6 c1347x6 = new C1347x6();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c1347x6.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                c1347x6.c(Long.valueOf(a(arrayList, 100.0d)));
                c1347x6.f(Long.valueOf(a(arrayList, 75.0d)));
                c1347x6.d(Long.valueOf(a(arrayList, 50.0d)));
                c1347x6.b(Long.valueOf(a(arrayList, 25.0d)));
                c1347x6.e(Long.valueOf(a(arrayList, 0.0d)));
                e(jVar.a(obj, arrayList.size(), c1347x6.g()), z8, j());
            }
            this.f6509j.remove(z8);
        }
    }

    public final /* synthetic */ void h(final Z6 z8, Object obj, long j8, final p188v5.j jVar) {
        if (!this.f6509j.containsKey(z8)) {
            this.f6509j.put(z8, L.q());
        }
        ((InterfaceC1243o0) this.f6509j.get(z8)).a(obj, Long.valueOf(j8));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(z8, jElapsedRealtime, 30L)) {
            this.f6508i.put(z8, Long.valueOf(jElapsedRealtime));
            C2797g.d().execute(new Runnable() { // from class: N4.I9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6317a.g(z8, jVar);
                }
            });
        }
    }

    public final String j() {
        if (this.f6504e.l()) {
            return (String) this.f6504e.i();
        }
        return C3204m.a().b(this.f6506g);
    }

    public final boolean k(Z6 z8, long j8, long j9) {
        return this.f6508i.get(z8) == null || j8 - ((Long) this.f6508i.get(z8)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
