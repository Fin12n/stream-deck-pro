package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.protocol.C2546h;
import io.sentry.util.C2569a;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.core.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2460h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameMetricsAggregator f26342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f26343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f26346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2569a f26347f;

    /* JADX INFO: renamed from: io.sentry.android.core.h$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26350c;

        public b(int i8, int i9, int i10) {
            this.f26348a = i8;
            this.f26349b = i9;
            this.f26350c = i10;
        }
    }

    public C2460h(io.sentry.util.r rVar, SentryAndroidOptions sentryAndroidOptions, l0 l0Var) {
        this.f26342a = null;
        this.f26344c = new ConcurrentHashMap();
        this.f26345d = new WeakHashMap();
        this.f26347f = new C2569a();
        if (rVar.a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f26342a = new FrameMetricsAggregator();
        }
        this.f26343b = sentryAndroidOptions;
        this.f26346e = l0Var;
    }

    public static /* synthetic */ void c(C2460h c2460h, Runnable runnable, String str) {
        c2460h.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                c2460h.f26343b.getLogger().c(EnumC2596z2.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public void e(final Activity activity) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26347f.a();
        try {
            if (!h()) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } else {
                i(new Runnable() { // from class: io.sentry.android.core.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26309a.f26342a.a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                k(activity);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
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

    public final b f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i8;
        int i9;
        SparseIntArray sparseIntArray;
        if (!h() || (frameMetricsAggregator = this.f26342a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = frameMetricsAggregator.b();
        int i10 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i8 = 0;
            i9 = 0;
        } else {
            int i11 = 0;
            i8 = 0;
            i9 = 0;
            while (i10 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i10);
                int iValueAt = sparseIntArray.valueAt(i10);
                i11 += iValueAt;
                if (iKeyAt > 700) {
                    i9 += iValueAt;
                } else if (iKeyAt > 16) {
                    i8 += iValueAt;
                }
                i10++;
            }
            i10 = i11;
        }
        return new b(i10, i8, i9);
    }

    public final b g(Activity activity) {
        b bVarF;
        b bVar = (b) this.f26345d.remove(activity);
        if (bVar == null || (bVarF = f()) == null) {
            return null;
        }
        return new b(bVarF.f26348a - bVar.f26348a, bVarF.f26349b - bVar.f26349b, bVarF.f26350c - bVar.f26350c);
    }

    public boolean h() {
        return (this.f26342a == null || !this.f26343b.isEnableFramesTracking() || this.f26343b.isEnablePerformanceV2()) ? false : true;
    }

    public final void i(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.d.d().b()) {
                runnable.run();
            } else {
                this.f26346e.b(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2460h.c(this.f26324a, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f26343b.getLogger().c(EnumC2596z2.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public void j(final Activity activity, io.sentry.protocol.u uVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26347f.a();
        try {
            if (!h()) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            i(new Runnable() { // from class: io.sentry.android.core.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26336a.f26342a.c(activity);
                }
            }, null);
            b bVarG = g(activity);
            if (bVarG != null && (bVarG.f26348a != 0 || bVarG.f26349b != 0 || bVarG.f26350c != 0)) {
                C2546h c2546h = new C2546h(Integer.valueOf(bVarG.f26348a), "none");
                C2546h c2546h2 = new C2546h(Integer.valueOf(bVarG.f26349b), "none");
                C2546h c2546h3 = new C2546h(Integer.valueOf(bVarG.f26350c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", c2546h);
                map.put("frames_slow", c2546h2);
                map.put("frames_frozen", c2546h3);
                this.f26344c.put(uVar, map);
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
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

    public final void k(Activity activity) {
        b bVarF = f();
        if (bVarF != null) {
            this.f26345d.put(activity, bVarF);
        }
    }

    public void l() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26347f.a();
        try {
            if (h()) {
                i(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26322a.f26342a.e();
                    }
                }, "FrameMetricsAggregator.stop");
                this.f26342a.d();
            }
            this.f26344c.clear();
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

    public Map m(io.sentry.protocol.u uVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26347f.a();
        try {
            if (!h()) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return null;
            }
            Map map = (Map) this.f26344c.get(uVar);
            this.f26344c.remove(uVar);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return map;
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

    public C2460h(io.sentry.util.r rVar, SentryAndroidOptions sentryAndroidOptions) {
        this(rVar, sentryAndroidOptions, new l0());
    }
}
