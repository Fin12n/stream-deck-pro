package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import io.sentry.AbstractC2519l;
import io.sentry.C2557s2;
import io.sentry.EnumC2596z2;
import io.sentry.K2;
import io.sentry.P1;
import io.sentry.protocol.C2539a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.android.core.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2455c0 implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f26303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f26304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Future f26305d;

    public C2455c0(Context context, Q q8, final SentryAndroidOptions sentryAndroidOptions) {
        this.f26302a = (Context) io.sentry.util.u.c(Z.h(context), "The application context is required.");
        this.f26303b = (Q) io.sentry.util.u.c(q8, "The BuildInfoProvider is required.");
        this.f26304c = (SentryAndroidOptions) io.sentry.util.u.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f26305d = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d0.i(this.f26289a.f26302a, sentryAndroidOptions);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private void e(P1 p8) {
        String str;
        io.sentry.protocol.k kVarF = p8.C().f();
        try {
            p8.C().q(((d0) this.f26305d.get()).j());
        } catch (Throwable th) {
            this.f26304c.getLogger().b(EnumC2596z2.ERROR, "Failed to retrieve os system", th);
        }
        if (kVarF != null) {
            String strG = kVarF.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            p8.C().j(str, kVarF);
        }
    }

    private void f(P1 p8) {
        io.sentry.protocol.F fQ = p8.Q();
        if (fQ == null) {
            fQ = new io.sentry.protocol.F();
            p8.e0(fQ);
        }
        if (fQ.i() == null) {
            fQ.l(i0.a(this.f26302a));
        }
        if (fQ.j() == null && this.f26304c.isSendDefaultPii()) {
            fQ.m("{{auto}}");
        }
    }

    private void n(P1 p8) {
        try {
            Z.a aVarL = ((d0) this.f26305d.get()).l();
            if (aVarL != null) {
                for (Map.Entry entry : aVarL.a().entrySet()) {
                    p8.c0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f26304c.getLogger().b(EnumC2596z2.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void o(C2557s2 c2557s2, io.sentry.H h8) {
        if (c2557s2.t0() != null) {
            boolean zI = io.sentry.util.m.i(h8);
            for (io.sentry.protocol.A a8 : c2557s2.t0()) {
                boolean zF = io.sentry.android.core.internal.util.d.d().f(a8);
                if (a8.o() == null) {
                    a8.r(Boolean.valueOf(zF));
                }
                if (!zI && a8.p() == null) {
                    a8.v(Boolean.valueOf(zF));
                }
            }
        }
    }

    private boolean p(P1 p8, io.sentry.H h8) {
        if (io.sentry.util.m.q(h8)) {
            return true;
        }
        this.f26304c.getLogger().c(EnumC2596z2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", p8.G());
        return false;
    }

    @Override // io.sentry.C
    public K2 b(K2 k8, io.sentry.H h8) {
        boolean zP = p(k8, h8);
        if (zP) {
            g(k8, h8);
        }
        i(k8, false, zP);
        return k8;
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, io.sentry.H h8) {
        boolean zP = p(c2557s2, h8);
        if (zP) {
            g(c2557s2, h8);
            o(c2557s2, h8);
        }
        i(c2557s2, true, zP);
        d(c2557s2);
        return c2557s2;
    }

    public final void g(P1 p8, io.sentry.H h8) {
        C2539a c2539aD = p8.C().d();
        if (c2539aD == null) {
            c2539aD = new C2539a();
        }
        h(c2539aD, h8);
        m(p8, c2539aD);
        p8.C().m(c2539aD);
    }

    public final void h(C2539a c2539a, io.sentry.H h8) {
        Boolean boolB;
        c2539a.o(Z.j(this.f26302a));
        io.sentry.android.core.performance.g gVarI = io.sentry.android.core.performance.f.m().i(this.f26304c);
        if (gVarI.x()) {
            c2539a.p(AbstractC2519l.n(gVarI.m()));
        }
        if (io.sentry.util.m.i(h8) || c2539a.l() != null || (boolB = P.a().b()) == null) {
            return;
        }
        c2539a.r(Boolean.valueOf(!boolB.booleanValue()));
    }

    public final void i(P1 p8, boolean z8, boolean z9) {
        f(p8);
        k(p8, z8, z9);
        n(p8);
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, io.sentry.H h8) {
        boolean zP = p(b8, h8);
        if (zP) {
            g(b8, h8);
        }
        i(b8, false, zP);
        return b8;
    }

    public final void k(P1 p8, boolean z8, boolean z9) {
        if (p8.C().e() == null) {
            try {
                p8.C().o(((d0) this.f26305d.get()).a(z8, z9));
            } catch (Throwable th) {
                this.f26304c.getLogger().b(EnumC2596z2.ERROR, "Failed to retrieve device info", th);
            }
            e(p8);
        }
    }

    public final void l(P1 p8, String str) {
        if (p8.E() == null) {
            p8.T(str);
        }
    }

    public final void m(P1 p8, C2539a c2539a) {
        d0 d0Var;
        PackageInfo packageInfoQ = Z.q(this.f26302a, 4096, this.f26304c.getLogger(), this.f26303b);
        if (packageInfoQ != null) {
            l(p8, Z.s(packageInfoQ, this.f26303b));
            try {
                d0Var = (d0) this.f26305d.get();
            } catch (Throwable th) {
                this.f26304c.getLogger().b(EnumC2596z2.ERROR, "Failed to retrieve device info", th);
                d0Var = null;
            }
            Z.z(packageInfoQ, this.f26303b, d0Var, c2539a);
        }
    }

    public static void d(C2557s2 c2557s2) {
        io.sentry.protocol.z zVarI;
        List listD;
        List listO0 = c2557s2.o0();
        if (listO0 != null && listO0.size() > 1) {
            io.sentry.protocol.p pVar = (io.sentry.protocol.p) listO0.get(listO0.size() - 1);
            if (uYOhHhTXuF.UNBvE.equals(pVar.h()) && (zVarI = pVar.i()) != null && (listD = zVarI.d()) != null) {
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.y) it.next()).r())) {
                        Collections.reverse(listO0);
                        return;
                    }
                }
            }
        }
    }
}
