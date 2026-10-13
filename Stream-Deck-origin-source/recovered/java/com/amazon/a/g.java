package com.amazon.a;

import T0.Vl.PCRzgdeK;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f16875a = "ActivityName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f16876b = "EventName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f16877c = "Timestamp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16878d = new com.amazon.a.a.o.c("Kiwi");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f16879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f16881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b f16882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f16883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f16884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f16885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f16886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f16887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f16888n;

    private g(Application application, boolean z8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f16880f = z8;
        if (com.amazon.a.a.o.c.f16782a) {
            com.amazon.a.a.o.c cVar = f16878d;
            cVar.a("Starting initialization process for application: " + application.getPackageName());
            cVar.a("DRM enabled: " + z8);
        }
        a(application);
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.Constructor Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void d(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onStart", activity)) {
            f16879e.f16881g.e(activity);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ActivityOnStart Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void e(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onStop", activity)) {
            f16879e.f16881g.f(activity);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ActivityOnStop Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    private void f() {
        this.f16883i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.g.2
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(g.f16876b, com.amazon.a.a.a.a.b.RESUME.name());
                map.put(g.f16875a, aVar.b().getClass().getName());
                map.put(g.f16877c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f16782a) {
                    g.f16878d.a("Adding lifecycle RESUME command to pipeline");
                }
                g.c(bVar);
            }
        });
    }

    private void g() {
        this.f16883i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.g.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                g.this.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (com.amazon.a.a.o.c.f16782a) {
            f16878d.a("Enqueuing launch workflow");
        }
        this.f16884j.a(com.amazon.a.a.n.b.d.COMMAND, i());
    }

    private com.amazon.a.a.n.a i() {
        return this.f16880f ? new f() : new e();
    }

    private void j() {
        this.f16883i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.g.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                if (com.amazon.a.a.o.c.f16782a) {
                    g.f16878d.a("Beginning shutdown process for application: " + g.this.f16887m.getPackageName());
                }
                g unused = g.f16879e = null;
            }
        });
    }

    private void a(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.b());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.c());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a();
        cVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        f16879e.f16884j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
    }

    private static boolean c() {
        return f16879e != null;
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16878d.a(str + " called on context: " + context + " when Kiwi is dead, ignoring...");
        }
    }

    public static void c(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", activity)) {
            try {
                f16879e.f16881g.b(activity);
            } catch (Exception e8) {
                f16878d.b(PCRzgdeK.wsvEf, e8);
            }
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ActivityOnDestroy Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void b(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onPause", activity)) {
            f16879e.f16881g.d(activity);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ActivityOnPause Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    private void d() {
        this.f16883i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.g.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.f16320d;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(g.f16876b, com.amazon.a.a.a.a.b.f16320d.name());
                map.put(g.f16875a, aVar.b().getClass().getName());
                map.put(g.f16877c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f16782a) {
                    g.f16878d.a("Adding lifecycle PAUSE command to pipeline");
                }
                g.c(bVar);
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        g();
        j();
        d();
        f();
    }

    public static void b(Activity activity, boolean z8) {
        if (a("onWindowFocusChanged", activity)) {
            f16879e.f16885k.a(activity, z8);
        }
    }

    public static void a(Activity activity, boolean z8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!c()) {
            f16879e = new g(activity.getApplication(), z8);
        }
        if (a("onCreate", activity)) {
            f16879e.f16881g.a(activity);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ActivityOnCreate Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.f16782a) {
            f16878d.a("WARNING: Use of deprecated method detected.");
        }
        if (c()) {
            c(aVar);
        } else {
            f16878d.b("Kiwi subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!c()) {
            if (context != null && context.getApplicationContext() != null) {
                f16879e = new g((Application) context.getApplicationContext(), false);
            } else {
                f16878d.b("Kiwi subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
        }
        c(aVar);
    }

    public static com.amazon.a.a.i.e a() {
        return f16879e.f16885k;
    }

    public static boolean a(String str, String str2) {
        if (c()) {
            try {
                return com.amazon.a.a.o.b.e.a(str, str2, f16879e.f16888n.a());
            } catch (com.amazon.a.a.o.b.a.a e8) {
                f16878d.a("Unable to validate signature: " + e8.getMessage());
                return false;
            }
        }
        f16878d.a("Kiwi was not yet initialized - cannot do the IAP call");
        return false;
    }

    private static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f16782a) {
            f16878d.a(str + ": " + context);
        }
        if (c()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static void a(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onResume", activity)) {
            f16879e.f16881g.c(activity);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ActivityOnResume Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static Dialog a(Activity activity, int i8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onCreateDialog", activity)) {
            return f16879e.f16885k.a(activity, i8);
        }
        if (!com.amazon.a.a.o.c.f16782a) {
            return null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        f16878d.a("Kiwi.ActivityOnCreateDialog Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        return null;
    }

    public static boolean a(Activity activity, int i8, int i9, Intent intent) {
        if (!a("onActivityResult", activity)) {
            return false;
        }
        return f16879e.f16882h.a(new com.amazon.a.a.l.a(activity, i8, i9, intent));
    }

    public static void a(Service service, boolean z8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onCreate", service)) {
            f16879e.f16881g.a(service);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a(vHKCAgr.nCVkKp + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void a(Service service) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", service)) {
            f16879e.f16881g.b(service);
        }
        if (com.amazon.a.a.o.c.f16782a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f16878d.a("Kiwi.ServiceOnDestroy Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }
}
