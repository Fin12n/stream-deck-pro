package p219z4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f39216a;

    public /* synthetic */ h0(i0 i0Var, g0 g0Var) {
        this.f39216a = i0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            synchronized (this.f39216a.f39219f) {
                try {
                    e0 e0Var = (e0) message.obj;
                    f0 f0Var = (f0) this.f39216a.f39219f.get(e0Var);
                    if (f0Var != null && f0Var.i()) {
                        if (f0Var.j()) {
                            f0Var.g("GmsClientSupervisor");
                        }
                        this.f39216a.f39219f.remove(e0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i8 != 1) {
            return false;
        }
        synchronized (this.f39216a.f39219f) {
            try {
                e0 e0Var2 = (e0) message.obj;
                f0 f0Var2 = (f0) this.f39216a.f39219f.get(e0Var2);
                if (f0Var2 != null && f0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(e0Var2), new Exception());
                    ComponentName componentNameB = f0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = e0Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = e0Var2.c();
                        AbstractC3207p.k(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    f0Var2.onServiceDisconnected(componentNameB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
