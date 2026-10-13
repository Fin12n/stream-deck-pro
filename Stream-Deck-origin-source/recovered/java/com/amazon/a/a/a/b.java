package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.g;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.pairip.VMRunner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f16331a = new com.amazon.a.a.o.c("ContextManagerImplV2");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f16339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f16340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f16341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f16342l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<Activity> f16332b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Activity> f16333c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g<Service> f16334d = new g<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g<Activity> f16335e = new g<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f16336f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f16337g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f16338h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f16343m = false;

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Checking if application is destroyed");
        }
        if (!this.f16333c.isEmpty()) {
            return false;
        }
        f16331a.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        return activity.isTaskRoot() && activity.isFinishing();
    }

    private boolean i() {
        return !this.f16343m && this.f16333c.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (com.amazon.a.a.o.c.f16782a) {
            com.amazon.a.a.o.c cVar = f16331a;
            cVar.a("----------- EXECUTING FINISH ACTIVITIES -----------");
            cVar.a(this.f16339i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        k();
        l();
        m();
    }

    private void k() {
        Activity activityA = a();
        for (Activity activity : this.f16333c) {
            if (!activity.equals(activityA)) {
                j(activity);
            }
        }
    }

    private void l() {
        Activity activityA = a();
        if (activityA == null) {
            f16331a.a("Shutdown found no root, no activities to pop off stack!");
            return;
        }
        com.amazon.a.a.o.c cVar = f16331a;
        cVar.a("Moving task to background");
        activityA.moveTaskToBack(true);
        cVar.a("Popping activity stack, root: " + activityA);
        Intent intent = new Intent(activityA, activityA.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        activityA.startActivity(intent);
    }

    private void m() {
        this.f16340j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.a.b.2
            public String toString() {
                return "ContextManager: kill root task";
            }

            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity activityA = b.this.a();
                com.amazon.a.a.o.c cVar = b.f16331a;
                cVar.a("Finishing Root Task: " + activityA);
                if (activityA != null) {
                    cVar.a(cFAYKUlMj.qBNPrQZM);
                    activityA.finish();
                }
            }
        });
    }

    @Override // com.amazon.a.a.a.a
    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f16333c.remove(activity);
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f16333c.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            this.f16343m = false;
            a(com.amazon.a.a.a.a.d.DESTROY);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f16331a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        Activity activityI = i(activity);
        StringBuilder sb = new StringBuilder();
        sb.append("Setting visible to: ");
        sb.append(activityI);
        cVar.a(sb.toString());
        this.f16332b.set(activityI);
        if (com.amazon.a.a.o.c.f16782a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    @Override // com.amazon.a.a.a.a
    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        if (b() == activity) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16331a.a("Setting visible activity to null");
            }
            this.f16332b.set(null);
            a(com.amazon.a.a.a.a.b.f16320d, activity);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f16331a.a("Activity started: " + activity);
        this.f16335e.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (this.f16335e.b() == 1) {
            a(com.amazon.a.a.a.a.d.START);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f16331a.a(kDsnNkYbBsI.qWWkHH + activity);
        this.f16335e.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.f16335e.a()) {
            a(com.amazon.a.a.a.a.d.STOP);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void g() {
        if (!this.f16337g.compareAndSet(false, true) && com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Ignoring duplicate stopServices request");
        }
        if (com.amazon.a.a.o.c.f16782a) {
            com.amazon.a.a.o.c cVar = f16331a;
            cVar.a("------------- STOPPING SERVICES -------------------");
            cVar.a(this.f16339i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        Intent intent = new Intent(this.f16342l);
        intent.setPackage(this.f16339i.getPackageName());
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Sending Broadcast!!!!: " + intent + ", Thread: " + Thread.currentThread());
        }
        this.f16339i.sendBroadcast(intent);
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    @Override // com.amazon.a.a.a.a
    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        for (int size = this.f16333c.size() - 1; size >= 0; size--) {
            Activity activity = this.f16333c.get(size);
            if (g(activity)) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f16333c.add(activity);
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f16333c.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (i()) {
            this.f16343m = true;
            a(com.amazon.a.a.a.a.d.CREATE);
        }
    }

    private void j(Activity activity) {
        if (activity == null) {
            return;
        }
        if (activity.isChild()) {
            f16331a.a("Not finishing activity: " + activity + ", it is a child of: " + activity.getParent());
            return;
        }
        f16331a.a("Finishing Activity: " + activity);
        activity.finish();
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f16342l = "com.amazon." + this.f16339i.getPackageName() + LYdqVGvOGMNr.vhMLGEZbg;
        this.f16339i.registerReceiver(new BroadcastReceiver() { // from class: com.amazon.a.a.a.b.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                VMRunner.invoke("sSLilys1YpZhKblP", new Object[]{this, context, intent});
            }
        }, new IntentFilter(this.f16342l));
    }

    @Override // com.amazon.a.a.a.a
    public void f() {
        if (this.f16336f.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f16782a) {
                com.amazon.a.a.o.c cVar = f16331a;
                cVar.a("---------- SCHEDULING FINISH ACTIVITIES -----------");
                cVar.a(this.f16339i.getPackageName());
                cVar.a(Thread.currentThread().toString());
                cVar.a("---------------------------------------------------");
            }
            this.f16340j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.a.b.1
                @Override // com.amazon.a.a.n.a
                public void a() {
                    b.this.j();
                }

                public String toString() {
                    return "ContextManager: init app shutdown on main thread";
                }
            });
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean h() {
        com.amazon.a.a.o.a.a.a("Method isContextAware() is not used for Kiwi's ContextManagerImplV2");
        return false;
    }

    @Override // com.amazon.a.a.a.a
    public boolean c() {
        return this.f16332b.get() != null;
    }

    @Override // com.amazon.a.a.a.a
    public boolean d() {
        return this.f16337g.get() || this.f16336f.get();
    }

    private void c(Service service) {
        if (service == null) {
            return;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Stopping service: " + service);
        }
        service.stopSelf();
    }

    @Override // com.amazon.a.a.a.a
    public void b(Service service) {
        com.amazon.a.a.o.a.a.a();
        this.f16334d.b(service);
    }

    @Override // com.amazon.a.a.a.a
    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f16332b.get();
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f16341k.a(new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(com.amazon.a.a.a.a.d dVar) {
        this.f16341k.a(new com.amazon.a.a.a.a.c(dVar, this.f16339i));
    }

    @Override // com.amazon.a.a.a.a
    public void a(Service service) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Service->onCreate: " + service);
        }
        this.f16334d.a(service);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16331a.a("Received broadcast intent: " + intent);
        }
        if (!intent.getAction().equals(this.f16342l)) {
            if (com.amazon.a.a.o.c.f16783b) {
                f16331a.b("Received broadcast for unrequested action: " + intent.getAction());
                return;
            }
            return;
        }
        if (!this.f16337g.get()) {
            if (com.amazon.a.a.o.c.f16783b) {
                f16331a.b("Received intent to shutdown app when we are not in shutdown state: " + intent);
                return;
            }
            return;
        }
        if (!this.f16338h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f16782a) {
                f16331a.a("shutdown broadcast already received, ignoring");
                return;
            }
            return;
        }
        if (com.amazon.a.a.o.c.f16782a) {
            com.amazon.a.a.o.c cVar = f16331a;
            cVar.a("Stopping services in response to broadcast");
            cVar.a("Service to stop: " + this.f16334d.b());
        }
        Iterator<Service> it = this.f16334d.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
