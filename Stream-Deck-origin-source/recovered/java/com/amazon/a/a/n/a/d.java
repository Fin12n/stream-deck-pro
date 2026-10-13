package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.amazon.d.a.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16594a = new com.amazon.a.a.o.c("CommandServiceClient");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16595b = "com.amazon.venezia.service.command.CommandServiceImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16596c = "com.amazon.venezia.CommandService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.d f16597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16598e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f16601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private b f16602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f16603j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue<c> f16599f = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BlockingQueue<com.amazon.d.a.d> f16600g = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ServiceConnection f16604k = new ServiceConnection() { // from class: com.amazon.a.a.n.a.d.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.f16594a.a("onServiceConnected");
            d.this.f16600g.add(com.amazon.d.a.d.a.a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.f16594a.a(QhsKALGiniuQ.VEVVtUNJUflTMW);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.amazon.d.a.i f16605l = new com.amazon.d.a.i.a() { // from class: com.amazon.a.a.n.a.d.2
        @Override // com.amazon.d.a.i
        public void a(j jVar) {
            d.this.f16599f.add(new c(jVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.h hVar) {
            d.this.f16599f.add(new c(hVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.f fVar) {
            d.this.f16599f.add(new c(fVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.g gVar) {
            d.this.f16599f.add(new c(gVar));
        }
    };

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f16611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f16612c;
    }

    private boolean d() {
        return this.f16597d != null;
    }

    private void e() throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.amazon.a.a.o.c cVar = f16594a;
        cVar.a("Binding Service!!!");
        Intent intentF = f();
        if (!a(this.f16601h, intentF)) {
            throw new com.amazon.a.a.n.a.a.c();
        }
        cVar.a("Found service on one or more packages");
        Intent intentA = a(intentF);
        String packageName = intentA.getComponent().getPackageName();
        cVar.a("Attempting to bind to service on " + packageName);
        if (!this.f16601h.bindService(intentA, this.f16604k, 1)) {
            throw new com.amazon.a.a.n.a.a.b();
        }
        try {
            cVar.a("Blocking while service is being bound!!");
            this.f16597d = this.f16600g.take();
            cVar.a("service bound, returning!!");
            if (com.amazon.a.a.o.c.f16782a) {
                cVar.a("Kiwi.BindService Time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
            this.f16603j.a(com.amazon.a.a.m.c.f16558f, packageName);
            this.f16598e = packageName;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new com.amazon.a.a.n.a.a.b();
        }
    }

    private Intent f() {
        Intent intent = new Intent();
        intent.setAction(f16596c);
        f16594a.a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    private c g() {
        try {
            com.amazon.a.a.o.c cVar = f16594a;
            cVar.a("Blocking for result from service");
            c cVarTake = this.f16599f.take();
            cVar.a("Received result from service");
            return cVarTake;
        } catch (InterruptedException unused) {
            f16594a.a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    private c b(com.amazon.d.a.c cVar) {
        this.f16603j.a(com.amazon.a.a.m.c.f16559g, cVar.b());
        this.f16597d.a(cVar, this.f16605l);
        return g();
    }

    public c a(com.amazon.d.a.c cVar) throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b {
        a aVar = new a();
        aVar.f16610a = 6;
        aVar.f16612c = 100L;
        while (true) {
            try {
                if (!d()) {
                    e();
                }
                return b(cVar);
            } catch (com.amazon.a.a.n.a.a.b e8) {
                a(e8, aVar);
                if (!aVar.f16611b) {
                    throw e8;
                }
            } catch (com.amazon.a.a.n.a.a.c e9) {
                a(e9, aVar);
                if (!aVar.f16611b) {
                    throw e9;
                }
            }
        }
    }

    public void b() {
        com.amazon.a.a.o.c cVar = f16594a;
        StringBuilder sb = new StringBuilder();
        sb.append("Finishing CommandServiceClient, unbinding service: ");
        sb.append(this.f16597d != null);
        cVar.a(sb.toString());
        if (this.f16597d != null) {
            this.f16601h.unbindService(this.f16604k);
            this.f16597d = null;
        }
    }

    private boolean b(String str) {
        f16594a.a("isPackageSignatureTrusted " + str);
        return this.f16602i.a(str, i.f16661a);
    }

    public static void a(com.amazon.a.a.d.b bVar, a aVar) {
        com.amazon.a.a.o.c cVar = f16594a;
        cVar.b("CommandServiceException happened, retriesLeft=" + aVar.f16610a, bVar);
        int i8 = aVar.f16610a;
        if (i8 == 0) {
            aVar.f16611b = false;
            return;
        }
        aVar.f16610a = i8 - 1;
        aVar.f16611b = true;
        try {
            cVar.a("Sleeping for " + aVar.f16612c + " ms");
            Thread.sleep(aVar.f16612c);
        } catch (InterruptedException unused) {
            aVar.f16611b = false;
        }
        aVar.f16612c *= 2;
    }

    public String a() {
        return this.f16598e;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction(f16596c);
        intent.setClassName(str, f16595b);
        return intent;
    }

    private Intent a(Intent intent) throws com.amazon.a.a.n.a.a.c {
        if (this.f16598e != null) {
            f16594a.a("Using previously determined package " + this.f16598e);
            return a(this.f16598e);
        }
        com.amazon.a.a.o.c cVar = f16594a;
        cVar.a("No previously determined package found, checking for suitable package.");
        Intent intentA = a(this.f16601h.getPackageManager().queryIntentServices(intent, 64));
        if (intentA != null) {
            return intentA;
        }
        cVar.a("No app with valid signature was providing our service.");
        throw new com.amazon.a.a.n.a.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009c A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #0 {Exception -> 0x007b, blocks: (B:3:0x0003, B:5:0x000a, B:8:0x0062, B:14:0x009c, B:11:0x007d), top: B:18:0x0003 }] */
    private Intent a(List<ResolveInfo> list) {
        int i8 = 0;
        String str = null;
        while (i8 < list.size()) {
            try {
                ResolveInfo resolveInfo = list.get(i8);
                String str2 = resolveInfo.serviceInfo.applicationInfo.packageName;
                com.amazon.a.a.o.c cVar = f16594a;
                cVar.a("Examining package " + str2);
                cVar.a("Priority is " + resolveInfo.filter.getPriority());
                cVar.a("Checking signature of package " + str2);
                if (b(str2)) {
                    cVar.a("Signature of package " + str2 + " is okay");
                    str = str2;
                    if (i8 > -1) {
                        return a(str);
                    }
                    return null;
                }
                cVar.a("Signature of package " + str2 + " is bad");
                i8++;
                str = str2;
            } catch (Exception e8) {
                f16594a.a("Caught exception " + e8);
            }
        }
        i8 = -1;
        if (i8 > -1) {
            return a(str);
        }
        return null;
    }

    public c a(com.amazon.d.a.a aVar) {
        aVar.a(null);
        return g();
    }

    public c a(com.amazon.d.a.f fVar, final e eVar) {
        fVar.a(new com.amazon.d.a.e.a() { // from class: com.amazon.a.a.n.a.d.3
            @Override // com.amazon.d.a.e
            public String a() {
                return eVar.name();
            }

            @Override // com.amazon.d.a.e
            public Map b() {
                return null;
            }
        });
        return g();
    }
}
