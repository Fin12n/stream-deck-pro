package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.C2;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2500g0;
import io.sentry.U1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.Z;
import io.sentry.r3;
import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile f f26514o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26517b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f26513n = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2569a f26515p = new C2569a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f26516a = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2500g0 f26523h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r3 f26524i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U1 f26525j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26526k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26527l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26528m = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f26518c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f26519d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f26520e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f26521f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f26522g = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        UNKNOWN,
        COLD,
        WARM
    }

    public f() {
        this.f26517b = false;
        this.f26517b = Z.u();
    }

    public static /* synthetic */ void b(f fVar, Application application) {
        if (fVar.f26525j == null) {
            fVar.f26517b = false;
            InterfaceC2500g0 interfaceC2500g0 = fVar.f26523h;
            if (interfaceC2500g0 != null && interfaceC2500g0.isRunning()) {
                fVar.f26523h.close();
                fVar.f26523h = null;
            }
        }
        application.unregisterActivityLifecycleCallbacks(f26514o);
    }

    public static f m() {
        if (f26514o == null) {
            InterfaceC2480b0 interfaceC2480b0A = f26515p.a();
            try {
                if (f26514o == null) {
                    f26514o = new f();
                }
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC2480b0A != null) {
                    try {
                        interfaceC2480b0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return f26514o;
    }

    public void c(c cVar) {
        this.f26522g.add(cVar);
    }

    public final void d(final Application application) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.e
            @Override // java.lang.Runnable
            public final void run() {
                f.b(this.f26511a, application);
            }
        });
    }

    public g e() {
        g gVar = new g();
        gVar.B("Process Initialization", this.f26518c.s(), this.f26518c.u(), f26513n);
        return gVar;
    }

    public InterfaceC2500g0 f() {
        return this.f26523h;
    }

    public r3 g() {
        return this.f26524i;
    }

    public g h() {
        return this.f26518c;
    }

    public g i(SentryAndroidOptions sentryAndroidOptions) {
        if (!o()) {
            return new g();
        }
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            g gVarH = h();
            if (gVarH.x()) {
                return gVarH;
            }
        }
        return n();
    }

    public a j() {
        return this.f26516a;
    }

    public g k() {
        return this.f26520e;
    }

    public List l() {
        ArrayList arrayList = new ArrayList(this.f26521f.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public g n() {
        return this.f26519d;
    }

    public boolean o() {
        return this.f26517b && !this.f26526k;
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f26517b && this.f26525j == null) {
            this.f26525j = new C2();
            if ((this.f26518c.y() ? this.f26518c.e() : System.currentTimeMillis()) - this.f26518c.s() > TimeUnit.MINUTES.toMillis(1L)) {
                this.f26526k = true;
            }
        }
    }

    public void p() {
        this.f26528m = false;
        this.f26521f.clear();
        this.f26522g.clear();
    }

    public void q(final Application application) {
        if (this.f26527l) {
            return;
        }
        boolean z8 = true;
        this.f26527l = true;
        if (!this.f26517b && !Z.u()) {
            z8 = false;
        }
        this.f26517b = z8;
        application.registerActivityLifecycleCallbacks(f26514o);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f26509a.d(application);
            }
        });
    }

    public void r(long j8) {
        this.f26528m = true;
        this.f26526k = false;
        this.f26517b = true;
        this.f26518c.z();
        this.f26518c.C();
        this.f26518c.A(j8);
        f26513n = this.f26518c.u();
    }

    public void s(InterfaceC2500g0 interfaceC2500g0) {
        this.f26523h = interfaceC2500g0;
    }

    public void t(r3 r3Var) {
        this.f26524i = r3Var;
    }

    public void u(a aVar) {
        this.f26516a = aVar;
    }

    public boolean v() {
        return this.f26528m;
    }
}
