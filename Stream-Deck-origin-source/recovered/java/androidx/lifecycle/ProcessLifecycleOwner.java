package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleOwner implements InterfaceC1733p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f15256i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProcessLifecycleOwner f15257j = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15259b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f15262e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15260c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15261d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f15263f = new r(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f15264g = new Runnable() { // from class: androidx.lifecycle.A
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.j(this.f15179a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D.a f15265h = new d();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15266a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.t.g(activity, "activity");
            kotlin.jvm.internal.t.g(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final InterfaceC1733p a() {
            return ProcessLifecycleOwner.f15257j;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.t.g(context, "context");
            ProcessLifecycleOwner.f15257j.i(context);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends C1722e {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends C1722e {
            final /* synthetic */ ProcessLifecycleOwner this$0;

            public a(ProcessLifecycleOwner processLifecycleOwner) {
                this.this$0 = processLifecycleOwner;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.t.g(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.t.g(activity, "activity");
                this.this$0.g();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.C1722e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.t.g(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                D.f15213b.b(activity).e(ProcessLifecycleOwner.this.f15265h);
            }
        }

        @Override // androidx.lifecycle.C1722e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.t.g(activity, "activity");
            ProcessLifecycleOwner.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.t.g(activity, "activity");
            a.a(activity, new a(ProcessLifecycleOwner.this));
        }

        @Override // androidx.lifecycle.C1722e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.t.g(activity, "activity");
            ProcessLifecycleOwner.this.h();
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static final void j(ProcessLifecycleOwner this$0) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        this$0.k();
        this$0.m();
    }

    public static final InterfaceC1733p n() {
        return f15256i.a();
    }

    public final void e() {
        int i8 = this.f15259b - 1;
        this.f15259b = i8;
        if (i8 == 0) {
            Handler handler = this.f15262e;
            kotlin.jvm.internal.t.d(handler);
            handler.postDelayed(this.f15264g, 700L);
        }
    }

    public final void f() {
        int i8 = this.f15259b + 1;
        this.f15259b = i8;
        if (i8 == 1) {
            if (this.f15260c) {
                this.f15263f.i(AbstractC1726i.a.ON_RESUME);
                this.f15260c = false;
            } else {
                Handler handler = this.f15262e;
                kotlin.jvm.internal.t.d(handler);
                handler.removeCallbacks(this.f15264g);
            }
        }
    }

    public final void g() {
        int i8 = this.f15258a + 1;
        this.f15258a = i8;
        if (i8 == 1 && this.f15261d) {
            this.f15263f.i(AbstractC1726i.a.ON_START);
            this.f15261d = false;
        }
    }

    public final void h() {
        this.f15258a--;
        m();
    }

    public final void i(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        this.f15262e = new Handler();
        this.f15263f.i(AbstractC1726i.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.f15259b == 0) {
            this.f15260c = true;
            this.f15263f.i(AbstractC1726i.a.ON_PAUSE);
        }
    }

    public final void m() {
        if (this.f15258a == 0 && this.f15260c) {
            this.f15263f.i(AbstractC1726i.a.ON_STOP);
            this.f15261d = true;
        }
    }

    @Override // androidx.lifecycle.InterfaceC1733p
    public AbstractC1726i w() {
        return this.f15263f;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements D.a {
        public d() {
        }

        @Override // androidx.lifecycle.D.a
        public void b() {
            ProcessLifecycleOwner.this.f();
        }

        @Override // androidx.lifecycle.D.a
        public void c() {
            ProcessLifecycleOwner.this.g();
        }

        @Override // androidx.lifecycle.D.a
        public void a() {
        }
    }
}
