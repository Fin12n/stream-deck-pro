package io.sentry.android.core;

import I0.mIk.efuWFSeiT;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C2568u2;
import io.sentry.C2586x0;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2500g0;
import io.sentry.J2;
import io.sentry.N1;
import io.sentry.r3;
import io.sentry.util.C2569a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryPerformanceProvider extends e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f26254f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f26255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f26256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f26257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2569a f26258e = new C2569a();

    public SentryPerformanceProvider() {
        C2472u c2472u = new C2472u();
        this.f26256c = c2472u;
        this.f26257d = new Q(c2472u);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final void b(Context context, io.sentry.android.core.performance.f fVar) {
        fVar.n().A(f26254f);
        if (this.f26257d.d() < 24) {
            return;
        }
        if (context instanceof Application) {
            this.f26255b = (Application) context;
        }
        if (this.f26255b == null) {
            return;
        }
        fVar.h().A(Process.getStartUptimeMillis());
        fVar.q(this.f26255b);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.f fVarM = io.sentry.android.core.performance.f.m();
        b(getContext(), fVarM);
        a(fVarM);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        InterfaceC2480b0 interfaceC2480b0A = io.sentry.android.core.performance.f.f26515p.a();
        try {
            InterfaceC2500g0 interfaceC2500g0F = io.sentry.android.core.performance.f.m().f();
            if (interfaceC2500g0F != null) {
                interfaceC2500g0F.close();
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

    public final void a(io.sentry.android.core.performance.f fVar) {
        Context context = getContext();
        if (context == null) {
            this.f26256c.c(EnumC2596z2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File(AbstractC2477z.d(context), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    N1 n8 = (N1) new C2586x0(J2.empty()).c(bufferedReader, N1.class);
                    if (n8 == null) {
                        this.f26256c.c(EnumC2596z2.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (!n8.f()) {
                        this.f26256c.c(EnumC2596z2.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else {
                        r3 r3Var = new r3(Boolean.valueOf(n8.g()), n8.d(), Boolean.valueOf(n8.e()), n8.a());
                        fVar.t(r3Var);
                        if (r3Var.b().booleanValue() && r3Var.e().booleanValue()) {
                            this.f26256c.c(EnumC2596z2.DEBUG, "App start profiling started.", new Object[0]);
                            D d8 = new D(context, this.f26257d, new io.sentry.android.core.internal.util.u(context, this.f26256c, this.f26257d), this.f26256c, n8.b(), n8.f(), n8.c(), new C2568u2());
                            fVar.s(d8);
                            d8.start();
                        } else {
                            this.f26256c.c(EnumC2596z2.DEBUG, RaiWHuj.lTXBtGYBMGWizA, new Object[0]);
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (FileNotFoundException e8) {
                this.f26256c.b(EnumC2596z2.ERROR, efuWFSeiT.ztoyOlblpIct, e8);
            } catch (Throwable th3) {
                this.f26256c.b(EnumC2596z2.ERROR, "Error reading app start profiling config file. ", th3);
            }
        }
    }
}
