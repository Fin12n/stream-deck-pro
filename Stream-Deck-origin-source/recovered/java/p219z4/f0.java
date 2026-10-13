package p219z4;

import F4.g;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements ServiceConnection, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39201a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39202b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f39204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f39205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f39206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f39207g;

    public f0(i0 i0Var, e0 e0Var) {
        this.f39207g = i0Var;
        this.f39205e = e0Var;
    }

    public final int a() {
        return this.f39202b;
    }

    public final ComponentName b() {
        return this.f39206f;
    }

    public final IBinder c() {
        return this.f39204d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f39201a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) throws Throwable {
        this.f39202b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (g.i()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            i0 i0Var = this.f39207g;
            try {
                boolean zD = i0Var.f39223j.d(i0Var.f39220g, str, this.f39205e.b(i0Var.f39220g), this, 4225, executor);
                this.f39203c = zD;
                if (zD) {
                    this.f39207g.f39221h.sendMessageDelayed(this.f39207g.f39221h.obtainMessage(1, this.f39205e), this.f39207g.f39225l);
                } else {
                    this.f39202b = 2;
                    try {
                        i0 i0Var2 = this.f39207g;
                        i0Var2.f39223j.c(i0Var2.f39220g, this);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                StrictMode.setVmPolicy(vmPolicy);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f39201a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f39207g.f39221h.removeMessages(1, this.f39205e);
        i0 i0Var = this.f39207g;
        i0Var.f39223j.c(i0Var.f39220g, this);
        this.f39203c = false;
        this.f39202b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f39201a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f39201a.isEmpty();
    }

    public final boolean j() {
        return this.f39203c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f39207g.f39219f) {
            try {
                this.f39207g.f39221h.removeMessages(1, this.f39205e);
                this.f39204d = iBinder;
                this.f39206f = componentName;
                Iterator it = this.f39201a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f39202b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f39207g.f39219f) {
            try {
                this.f39207g.f39221h.removeMessages(1, this.f39205e);
                this.f39204d = null;
                this.f39206f = componentName;
                Iterator it = this.f39201a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f39202b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
