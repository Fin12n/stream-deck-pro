package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.AbstractC2519l;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import io.sentry.V1;
import io.sentry.util.C2569a;
import java.io.Closeable;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f26215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f26216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2569a f26217d = new C2569a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f26218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J2 f26219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile c f26220g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.sentry.X f26221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J2 f26222b;

        public a(io.sentry.X x8, J2 j8) {
            this.f26221a = x8;
            this.f26222b = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkBreadcrumbsIntegration.this.f26218e) {
                return;
            }
            InterfaceC2480b0 interfaceC2480b0A = NetworkBreadcrumbsIntegration.this.f26217d.a();
            try {
                NetworkBreadcrumbsIntegration.this.f26220g = new c(this.f26221a, NetworkBreadcrumbsIntegration.this.f26215b, this.f26222b.getDateProvider());
                if (io.sentry.android.core.internal.util.a.k(NetworkBreadcrumbsIntegration.this.f26214a, NetworkBreadcrumbsIntegration.this.f26216c, NetworkBreadcrumbsIntegration.this.f26215b, NetworkBreadcrumbsIntegration.this.f26220g)) {
                    NetworkBreadcrumbsIntegration.this.f26216c.c(EnumC2596z2.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.o.a("NetworkBreadcrumbs");
                } else {
                    NetworkBreadcrumbsIntegration.this.f26216c.c(EnumC2596z2.DEBUG, vHKCAgr.BNyqZBvSFm, new Object[0]);
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
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f26227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f26229f;

        public b(NetworkCapabilities networkCapabilities, Q q8, long j8) {
            io.sentry.util.u.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.u.c(q8, "BuildInfoProvider is required");
            this.f26224a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f26225b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = q8.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f26226c = signalStrength > -100 ? signalStrength : 0;
            this.f26228e = networkCapabilities.hasTransport(4);
            String strI = io.sentry.android.core.internal.util.a.i(networkCapabilities);
            this.f26229f = strI == null ? "" : strI;
            this.f26227d = j8;
        }

        public boolean a(b bVar) {
            int iAbs = Math.abs(this.f26226c - bVar.f26226c);
            int iAbs2 = Math.abs(this.f26224a - bVar.f26224a);
            int iAbs3 = Math.abs(this.f26225b - bVar.f26225b);
            boolean z8 = AbstractC2519l.k((double) Math.abs(this.f26227d - bVar.f26227d)) < 5000.0d;
            return this.f26228e == bVar.f26228e && this.f26229f.equals(bVar.f26229f) && (z8 || iAbs <= 5) && (z8 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f26224a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f26224a)) * 0.1d) ? 0 : -1)) <= 0) && (z8 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f26225b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f26225b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.sentry.X f26230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Q f26231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f26232c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public NetworkCapabilities f26233d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f26234e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final V1 f26235f;

        public c(io.sentry.X x8, Q q8, V1 v8) {
            this.f26230a = (io.sentry.X) io.sentry.util.u.c(x8, "Scopes are required");
            this.f26231b = (Q) io.sentry.util.u.c(q8, "BuildInfoProvider is required");
            this.f26235f = (V1) io.sentry.util.u.c(v8, "SentryDateProvider is required");
        }

        public final C2491e a(String str) {
            C2491e c2491e = new C2491e();
            c2491e.C("system");
            c2491e.y("network.event");
            c2491e.z("action", str);
            c2491e.A(EnumC2596z2.INFO);
            return c2491e;
        }

        public final b b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j8, long j9) {
            if (networkCapabilities == null) {
                return new b(networkCapabilities2, this.f26231b, j9);
            }
            b bVar = new b(networkCapabilities, this.f26231b, j8);
            b bVar2 = new b(networkCapabilities2, this.f26231b, j9);
            if (bVar.a(bVar2)) {
                return null;
            }
            return bVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.f26232c)) {
                return;
            }
            this.f26230a.i(a("NETWORK_AVAILABLE"));
            this.f26232c = network;
            this.f26233d = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long j8;
            b bVarB;
            if (network.equals(this.f26232c) && (bVarB = b(this.f26233d, networkCapabilities, this.f26234e, (j8 = this.f26235f.a().j()))) != null) {
                this.f26233d = networkCapabilities;
                this.f26234e = j8;
                C2491e c2491eA = a("NETWORK_CAPABILITIES_CHANGED");
                c2491eA.z("download_bandwidth", Integer.valueOf(bVarB.f26224a));
                c2491eA.z("upload_bandwidth", Integer.valueOf(bVarB.f26225b));
                c2491eA.z("vpn_active", Boolean.valueOf(bVarB.f26228e));
                c2491eA.z("network_type", bVarB.f26229f);
                int i8 = bVarB.f26226c;
                if (i8 != 0) {
                    c2491eA.z("signal_strength", Integer.valueOf(i8));
                }
                io.sentry.H h8 = new io.sentry.H();
                h8.k("android:networkCapabilities", bVarB);
                this.f26230a.e(c2491eA, h8);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.f26232c)) {
                this.f26230a.i(a("NETWORK_LOST"));
                this.f26232c = null;
                this.f26233d = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, Q q8, ILogger iLogger) {
        this.f26214a = (Context) io.sentry.util.u.c(Z.h(context), "Context is required");
        this.f26215b = (Q) io.sentry.util.u.c(q8, "BuildInfoProvider is required");
        this.f26216c = (ILogger) io.sentry.util.u.c(iLogger, "ILogger is required");
    }

    public static /* synthetic */ void b(NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration) {
        InterfaceC2480b0 interfaceC2480b0A = networkBreadcrumbsIntegration.f26217d.a();
        try {
            if (networkBreadcrumbsIntegration.f26220g != null) {
                io.sentry.android.core.internal.util.a.l(networkBreadcrumbsIntegration.f26214a, networkBreadcrumbsIntegration.f26216c, networkBreadcrumbsIntegration.f26220g);
                networkBreadcrumbsIntegration.f26216c.c(EnumC2596z2.DEBUG, "NetworkBreadcrumbsIntegration removed.", new Object[0]);
            }
            networkBreadcrumbsIntegration.f26220g = null;
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26218e = true;
        try {
            ((J2) io.sentry.util.u.c(this.f26219f, "Options is required")).getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.o0
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkBreadcrumbsIntegration.b(this.f26497a);
                }
            });
        } catch (Throwable th) {
            this.f26216c.b(EnumC2596z2.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        ILogger iLogger = this.f26216c;
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        iLogger.c(enumC2596z2, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        this.f26219f = j8;
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f26215b.d() < 24) {
                this.f26216c.c(enumC2596z2, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            try {
                j8.getExecutorService().submit(new a(x8, j8));
            } catch (Throwable th) {
                this.f26216c.b(EnumC2596z2.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
            }
        }
    }
}
