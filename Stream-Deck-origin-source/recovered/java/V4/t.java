package V4;

import S4.InterfaceC1634e;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f10706o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f10708b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f10714h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f10718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f10719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final U4.i f10720n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10710d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f10711e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10712f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f10716j = new IBinder.DeathRecipient() { // from class: V4.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.h(this.f10698a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f10717k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10709c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f10715i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, U4.i iVar2, o oVar, byte[] bArr) {
        this.f10707a = context;
        this.f10708b = iVar;
        this.f10714h = intent;
        this.f10720n = iVar2;
    }

    public static /* synthetic */ void h(t tVar) {
        tVar.f10708b.d("reportBinderDeath", new Object[0]);
        p063h.s.a(tVar.f10715i.get());
        tVar.f10708b.d("%s : Binder has died.", tVar.f10709c);
        Iterator it = tVar.f10710d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(tVar.s());
        }
        tVar.f10710d.clear();
        tVar.t();
    }

    public static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f10719m != null || tVar.f10713g) {
            if (!tVar.f10713g) {
                jVar.run();
                return;
            } else {
                tVar.f10708b.d("Waiting to bind to the service.", new Object[0]);
                tVar.f10710d.add(jVar);
                return;
            }
        }
        tVar.f10708b.d("Initiate binding to the service.", new Object[0]);
        tVar.f10710d.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f10718l = sVar;
        tVar.f10713g = true;
        if (tVar.f10707a.bindService(tVar.f10714h, sVar, 1)) {
            return;
        }
        tVar.f10708b.d("Failed to bind to the service.", new Object[0]);
        tVar.f10713g = false;
        Iterator it = tVar.f10710d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f10710d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(t tVar) {
        tVar.f10708b.d("linkToDeath", new Object[0]);
        try {
            tVar.f10719m.asBinder().linkToDeath(tVar.f10716j, 0);
        } catch (RemoteException e8) {
            tVar.f10708b.c(e8, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f10708b.d("unlinkToDeath", new Object[0]);
        tVar.f10719m.asBinder().unlinkToDeath(tVar.f10716j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f10706o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f10709c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f10709c, 10);
                    handlerThread.start();
                    map.put(this.f10709c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f10709c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f10719m;
    }

    public final void p(j jVar, final S4.l lVar) {
        synchronized (this.f10712f) {
            this.f10711e.add(lVar);
            lVar.a().b(new InterfaceC1634e() { // from class: V4.k
                @Override // S4.InterfaceC1634e
                public final void a(S4.k kVar) {
                    this.f10696a.q(lVar, kVar);
                }
            });
        }
        synchronized (this.f10712f) {
            try {
                if (this.f10717k.getAndIncrement() > 0) {
                    this.f10708b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    public final /* synthetic */ void q(S4.l lVar, S4.k kVar) {
        synchronized (this.f10712f) {
            this.f10711e.remove(lVar);
        }
    }

    public final void r(S4.l lVar) {
        synchronized (this.f10712f) {
            this.f10711e.remove(lVar);
        }
        synchronized (this.f10712f) {
            try {
                if (this.f10717k.get() > 0 && this.f10717k.decrementAndGet() > 0) {
                    this.f10708b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final RemoteException s() {
        return new RemoteException(String.valueOf(this.f10709c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f10712f) {
            try {
                Iterator it = this.f10711e.iterator();
                while (it.hasNext()) {
                    ((S4.l) it.next()).d(s());
                }
                this.f10711e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
