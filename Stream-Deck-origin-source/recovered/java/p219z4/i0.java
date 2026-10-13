package p219z4;

import E4.a;
import L4.e;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends AbstractC3199h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f39219f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f39220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Handler f39221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0 f39222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f39223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f39224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f39225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Executor f39226m;

    public i0(Context context, Looper looper, Executor executor) {
        h0 h0Var = new h0(this, null);
        this.f39222i = h0Var;
        this.f39220g = context.getApplicationContext();
        this.f39221h = new e(looper, h0Var);
        this.f39223j = a.b();
        this.f39224k = 5000L;
        this.f39225l = 300000L;
        this.f39226m = executor;
    }

    @Override // p219z4.AbstractC3199h
    public final void d(e0 e0Var, ServiceConnection serviceConnection, String str) {
        AbstractC3207p.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f39219f) {
            try {
                f0 f0Var = (f0) this.f39219f.get(e0Var);
                if (f0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + e0Var.toString());
                }
                if (!f0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + e0Var.toString());
                }
                f0Var.f(serviceConnection, str);
                if (f0Var.i()) {
                    this.f39221h.sendMessageDelayed(this.f39221h.obtainMessage(0, e0Var), this.f39224k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p219z4.AbstractC3199h
    public final boolean f(e0 e0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        AbstractC3207p.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f39219f) {
            try {
                f0 f0Var = (f0) this.f39219f.get(e0Var);
                if (executor == null) {
                    executor = this.f39226m;
                }
                if (f0Var == null) {
                    f0Var = new f0(this, e0Var);
                    f0Var.d(serviceConnection, serviceConnection, str);
                    f0Var.e(str, executor);
                    this.f39219f.put(e0Var, f0Var);
                } else {
                    this.f39221h.removeMessages(0, e0Var);
                    if (f0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + e0Var.toString());
                    }
                    f0Var.d(serviceConnection, serviceConnection, str);
                    int iA = f0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(f0Var.b(), f0Var.c());
                    } else if (iA == 2) {
                        f0Var.e(str, executor);
                    }
                }
                zJ = f0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
