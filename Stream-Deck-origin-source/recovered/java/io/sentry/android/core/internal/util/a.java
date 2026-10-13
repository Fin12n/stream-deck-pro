package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.google.mlkit.common.internal.ckI.WqXA;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.M;
import io.sentry.android.core.Q;
import io.sentry.android.core.Z;
import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f26409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f26410c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager.NetworkCallback f26413f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2569a f26412e = new C2569a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26411d = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.internal.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0586a extends ConnectivityManager.NetworkCallback {
        public C0586a() {
        }

        public void a() {
            M.a aVarB = a.this.b();
            InterfaceC2480b0 interfaceC2480b0A = a.this.f26412e.a();
            try {
                Iterator it = a.this.f26411d.iterator();
                while (it.hasNext()) {
                    ((M.b) it.next()).j(aVarB);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
        }
    }

    public a(Context context, ILogger iLogger, Q q8) {
        this.f26408a = Z.h(context);
        this.f26409b = iLogger;
        this.f26410c = q8;
    }

    public static M.a g(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!m.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC2596z2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return M.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? M.a.CONNECTED : M.a.DISCONNECTED;
            }
            iLogger.c(EnumC2596z2.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return M.a.DISCONNECTED;
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.WARNING, "Could not retrieve Connection Status", th);
            return M.a.UNKNOWN;
        }
    }

    public static String h(Context context, ILogger iLogger, Q q8) {
        ConnectivityManager connectivityManagerJ = j(context, iLogger);
        if (connectivityManagerJ == null) {
            return null;
        }
        boolean zHasTransport = false;
        if (!m.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC2596z2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            boolean zHasTransport2 = true;
            if (q8.d() >= 23) {
                Network activeNetwork = connectivityManagerJ.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(EnumC2596z2.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerJ.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(EnumC2596z2.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport = networkCapabilities.hasTransport(1);
                zHasTransport2 = networkCapabilities.hasTransport(0);
                zHasTransport = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerJ.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(EnumC2596z2.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport = false;
                } else if (type != 1) {
                    if (type == 9) {
                        zHasTransport = true;
                    }
                    zHasTransport2 = zHasTransport;
                } else {
                    zHasTransport = true;
                    zHasTransport2 = false;
                }
            }
            if (zHasTransport) {
                return "ethernet";
            }
            if (zHasTransport) {
                return "wifi";
            }
            if (zHasTransport2) {
                return "cellular";
            }
            return null;
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Failed to retrieve network info", th);
        }
    }

    public static String i(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public static ConnectivityManager j(Context context, ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.c(EnumC2596z2.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    public static void l(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerJ = j(context, iLogger);
        if (connectivityManagerJ == null) {
            return;
        }
        try {
            connectivityManagerJ.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.WARNING, "unregisterNetworkCallback failed", th);
        }
    }

    @Override // io.sentry.M
    public String a() {
        return h(this.f26408a, this.f26409b, this.f26410c);
    }

    @Override // io.sentry.M
    public M.a b() {
        ConnectivityManager connectivityManagerJ = j(this.f26408a, this.f26409b);
        return connectivityManagerJ == null ? M.a.UNKNOWN : g(this.f26408a, connectivityManagerJ, this.f26409b);
    }

    @Override // io.sentry.M
    public boolean c(M.b bVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26412e.a();
        try {
            this.f26411d.add(bVar);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            if (this.f26413f == null) {
                InterfaceC2480b0 interfaceC2480b0A2 = this.f26412e.a();
                try {
                    if (this.f26413f == null) {
                        C0586a c0586a = new C0586a();
                        if (!k(this.f26408a, this.f26409b, this.f26410c, c0586a)) {
                            if (interfaceC2480b0A2 != null) {
                                interfaceC2480b0A2.close();
                            }
                            return false;
                        }
                        this.f26413f = c0586a;
                        if (interfaceC2480b0A2 != null) {
                            interfaceC2480b0A2.close();
                        }
                        return true;
                    }
                    if (interfaceC2480b0A2 != null) {
                        interfaceC2480b0A2.close();
                    }
                } catch (Throwable th) {
                    if (interfaceC2480b0A2 != null) {
                        try {
                            interfaceC2480b0A2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return true;
        } catch (Throwable th3) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.M
    public void d(M.b bVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26412e.a();
        try {
            this.f26411d.remove(bVar);
            if (this.f26411d.isEmpty() && this.f26413f != null) {
                l(this.f26408a, this.f26409b, this.f26413f);
                this.f26413f = null;
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

    public static boolean k(Context context, ILogger iLogger, Q q8, ConnectivityManager.NetworkCallback networkCallback) {
        if (q8.d() < 24) {
            iLogger.c(EnumC2596z2.DEBUG, WqXA.BrvkQAqqgNYHtkX, new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerJ = j(context, iLogger);
        if (connectivityManagerJ == null) {
            return false;
        }
        if (!m.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC2596z2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerJ.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }
}
