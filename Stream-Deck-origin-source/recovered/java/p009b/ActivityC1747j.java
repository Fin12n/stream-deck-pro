package p009b;

import C6.G;
import C6.j;
import C6.k;
import H1.n;
import H1.o;
import H1.q;
import P2.Lsk.mHPawN;
import U1.C1655q;
import U1.InterfaceC1654p;
import U1.InterfaceC1656s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.D;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1724g;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.r;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: renamed from: b.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC1747j extends H1.f implements InterfaceC1733p, S, InterfaceC1724g, p217z2.f, F, p036e.f, I1.c, I1.d, n, o, InterfaceC1654p, A {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f15504v = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p027d.a f15505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1655q f15506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p217z2.e f15507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Q f15508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f15509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f15510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f15512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p036e.e f15513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f15514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f15515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f15516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f15517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f15518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f15519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f15522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f15523u;

    /* JADX INFO: renamed from: b.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC1730m {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC1730m
        public void j(InterfaceC1733p source, AbstractC1726i.a event) {
            t.g(source, "source");
            t.g(event, "event");
            ActivityC1747j.this.S();
            ActivityC1747j.this.w().d(this);
        }
    }

    /* JADX INFO: renamed from: b.j$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15525a = new b();

        public final OnBackInvokedDispatcher a(Activity activity) {
            t.g(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            t.f(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* JADX INFO: renamed from: b.j$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: b.j$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f15526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Q f15527b;

        public final Q a() {
            return this.f15527b;
        }

        public final void b(Object obj) {
            this.f15526a = obj;
        }

        public final void c(Q q8) {
            this.f15527b = q8;
        }
    }

    /* JADX INFO: renamed from: b.j$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e extends Executor {
        void J0(View view);

        void c();
    }

    /* JADX INFO: renamed from: b.j$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15528a = SystemClock.uptimeMillis() + ((long) ModuleDescriptor.MODULE_VERSION);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f15529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15530c;

        public f() {
        }

        public static final void b(f this$0) {
            t.g(this$0, "this$0");
            Runnable runnable = this$0.f15529b;
            if (runnable != null) {
                t.d(runnable);
                runnable.run();
                this$0.f15529b = null;
            }
        }

        @Override // p009b.ActivityC1747j.e
        public void J0(View view) {
            t.g(view, "view");
            if (this.f15530c) {
                return;
            }
            this.f15530c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // p009b.ActivityC1747j.e
        public void c() {
            ActivityC1747j.this.getWindow().getDecorView().removeCallbacks(this);
            ActivityC1747j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            t.g(runnable, "runnable");
            this.f15529b = runnable;
            View decorView = ActivityC1747j.this.getWindow().getDecorView();
            t.f(decorView, "window.decorView");
            if (!this.f15530c) {
                decorView.postOnAnimation(new Runnable() { // from class: b.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC1747j.f.b(this.f15537a);
                    }
                });
            } else if (t.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f15529b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f15528a) {
                    this.f15530c = false;
                    ActivityC1747j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f15529b = null;
            if (ActivityC1747j.this.T().c()) {
                this.f15530c = false;
                ActivityC1747j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityC1747j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX INFO: renamed from: b.j$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends p036e.e {
        public g() {
        }

        public static final void s(g this$0, int i8, p045f.a.C0498a c0498a) {
            t.g(this$0, "this$0");
            this$0.f(i8, c0498a.a());
        }

        public static final void t(g this$0, int i8, IntentSender.SendIntentException e8) {
            t.g(this$0, "this$0");
            t.g(e8, "$e");
            this$0.e(i8, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e8));
        }

        @Override // p036e.e
        public void i(final int i8, p045f.a contract, Object obj, H1.b bVar) {
            Bundle bundleExtra;
            final int i9;
            t.g(contract, "contract");
            ActivityC1747j activityC1747j = ActivityC1747j.this;
            final p045f.a.C0498a c0498aB = contract.b(activityC1747j, obj);
            if (c0498aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC1747j.g.s(this.f15538a, i8, c0498aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(activityC1747j, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                t.d(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(activityC1747j.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (t.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                H1.a.j(activityC1747j, stringArrayExtra, i8);
                return;
            }
            if (!t.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                H1.a.k(activityC1747j, intentA, i8, bundle);
                return;
            }
            p036e.g gVar = (p036e.g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                t.d(gVar);
                i9 = i8;
                try {
                    H1.a.l(activityC1747j, gVar.d(), i9, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e8) {
                    e = e8;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC1747j.g.t(this.f15541a, i9, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                i9 = i8;
            }
        }
    }

    /* JADX INFO: renamed from: b.j$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L invoke() {
            Application application = ActivityC1747j.this.getApplication();
            ActivityC1747j activityC1747j = ActivityC1747j.this;
            return new L(application, activityC1747j, activityC1747j.getIntent() != null ? ActivityC1747j.this.getIntent().getExtras() : null);
        }
    }

    /* JADX INFO: renamed from: b.j$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Function0 {

        /* JADX INFO: renamed from: b.j$i$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActivityC1747j f15535a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityC1747j activityC1747j) {
                super(0);
                this.f15535a = activityC1747j;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m92invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m92invoke() {
                this.f15535a.reportFullyDrawn();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z invoke() {
            return new z(ActivityC1747j.this.f15509g, new a(ActivityC1747j.this));
        }
    }

    /* JADX INFO: renamed from: b.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0390j extends u implements Function0 {
        public C0390j() {
            super(0);
        }

        public static final void e(ActivityC1747j this$0) {
            t.g(this$0, "this$0");
            try {
                ActivityC1747j.super.onBackPressed();
            } catch (IllegalStateException e8) {
                if (!t.c(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e8;
                }
            } catch (NullPointerException e9) {
                if (!t.c(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e9;
                }
            }
        }

        public static final void f(ActivityC1747j this$0, C dispatcher) {
            t.g(this$0, "this$0");
            t.g(dispatcher, "$dispatcher");
            this$0.N(dispatcher);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C invoke() {
            final ActivityC1747j activityC1747j = ActivityC1747j.this;
            final C c8 = new C(new Runnable() { // from class: b.n
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC1747j.C0390j.e(activityC1747j);
                }
            });
            final ActivityC1747j activityC1747j2 = ActivityC1747j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!t.c(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC1747j.C0390j.f(activityC1747j2, c8);
                        }
                    });
                    return c8;
                }
                activityC1747j2.N(c8);
            }
            return c8;
        }
    }

    public ActivityC1747j() {
        this.f15505c = new p027d.a();
        this.f15506d = new C1655q(new Runnable() { // from class: b.d
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC1747j.W(this.f15497a);
            }
        });
        p217z2.e eVarA = p217z2.e.f39070d.a(this);
        this.f15507e = eVarA;
        this.f15509g = R();
        this.f15510h = k.b(new i());
        this.f15512j = new AtomicInteger();
        this.f15513k = new g();
        this.f15514l = new CopyOnWriteArrayList();
        this.f15515m = new CopyOnWriteArrayList();
        this.f15516n = new CopyOnWriteArrayList();
        this.f15517o = new CopyOnWriteArrayList();
        this.f15518p = new CopyOnWriteArrayList();
        this.f15519q = new CopyOnWriteArrayList();
        if (w() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        w().a(new InterfaceC1730m() { // from class: b.e
            @Override // androidx.lifecycle.InterfaceC1730m
            public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
                ActivityC1747j.F(this.f15498a, interfaceC1733p, aVar);
            }
        });
        w().a(new InterfaceC1730m() { // from class: b.f
            @Override // androidx.lifecycle.InterfaceC1730m
            public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
                ActivityC1747j.G(this.f15499a, interfaceC1733p, aVar);
            }
        });
        w().a(new a());
        eVarA.c();
        I.c(this);
        l().h("android:support:activity-result", new z2.d.c() { // from class: b.g
            @Override // z2.d.c
            public final Bundle a() {
                return ActivityC1747j.H(this.f15500a);
            }
        });
        P(new p027d.b() { // from class: b.h
            @Override // p027d.b
            public final void a(Context context) {
                ActivityC1747j.I(this.f15501a, context);
            }
        });
        this.f15522t = k.b(new h());
        this.f15523u = k.b(new C0390j());
    }

    public static final void F(ActivityC1747j this$0, InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
        Window window;
        View viewPeekDecorView;
        t.g(this$0, "this$0");
        t.g(interfaceC1733p, "<anonymous parameter 0>");
        t.g(event, "event");
        if (event != AbstractC1726i.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void G(ActivityC1747j this$0, InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
        t.g(this$0, "this$0");
        t.g(interfaceC1733p, "<anonymous parameter 0>");
        t.g(event, "event");
        if (event == AbstractC1726i.a.ON_DESTROY) {
            this$0.f15505c.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.k().a();
            }
            this$0.f15509g.c();
        }
    }

    public static final Bundle H(ActivityC1747j this$0) {
        t.g(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.f15513k.k(bundle);
        return bundle;
    }

    public static final void I(ActivityC1747j this$0, Context it) {
        t.g(this$0, "this$0");
        t.g(it, "it");
        Bundle bundleB = this$0.l().b("android:support:activity-result");
        if (bundleB != null) {
            this$0.f15513k.j(bundleB);
        }
    }

    public static final void W(ActivityC1747j this$0) {
        t.g(this$0, "this$0");
        this$0.V();
    }

    public final void N(final C c8) {
        w().a(new InterfaceC1730m() { // from class: b.i
            @Override // androidx.lifecycle.InterfaceC1730m
            public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
                ActivityC1747j.O(c8, this, interfaceC1733p, aVar);
            }
        });
    }

    public final void P(p027d.b listener) {
        t.g(listener, "listener");
        this.f15505c.a(listener);
    }

    public final void Q(T1.a listener) {
        t.g(listener, "listener");
        this.f15516n.add(listener);
    }

    public final e R() {
        return new f();
    }

    public final void S() {
        if (this.f15508f == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f15508f = dVar.a();
            }
            if (this.f15508f == null) {
                this.f15508f = new Q();
            }
        }
    }

    public z T() {
        return (z) this.f15510h.getValue();
    }

    public void U() {
        View decorView = getWindow().getDecorView();
        t.f(decorView, "window.decorView");
        T.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        t.f(decorView2, "window.decorView");
        U.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        t.f(decorView3, "window.decorView");
        p217z2.g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        t.f(decorView4, "window.decorView");
        J.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        t.f(decorView5, "window.decorView");
        I.a(decorView5, this);
    }

    public void V() {
        invalidateOptionsMenu();
    }

    public Object X() {
        return null;
    }

    public final p036e.c Y(p045f.a contract, p036e.b callback) {
        t.g(contract, "contract");
        t.g(callback, "callback");
        return Z(contract, this.f15513k, callback);
    }

    public final p036e.c Z(p045f.a contract, p036e.e registry, p036e.b callback) {
        t.g(contract, "contract");
        t.g(registry, "registry");
        t.g(callback, "callback");
        return registry.l("activity_rq#" + this.f15512j.getAndIncrement(), this, contract, callback);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        e eVar = this.f15509g;
        View decorView = getWindow().getDecorView();
        t.f(decorView, "window.decorView");
        eVar.J0(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p009b.F
    public final C b() {
        return (C) this.f15523u.getValue();
    }

    @Override // I1.d
    public final void c(T1.a listener) {
        t.g(listener, "listener");
        this.f15515m.remove(listener);
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public P.c f() {
        return (P.c) this.f15522t.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public p153r2.a g() {
        p153r2.b bVar = new p153r2.b(null, 1, null);
        if (getApplication() != null) {
            r2.a.b bVar2 = P.a.f15249h;
            Application application = getApplication();
            t.f(application, "application");
            bVar.c(bVar2, application);
        }
        bVar.c(I.f15227a, this);
        bVar.c(I.f15228b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(I.f15229c, extras);
        }
        return bVar;
    }

    @Override // I1.c
    public final void h(T1.a listener) {
        t.g(listener, "listener");
        this.f15514l.add(listener);
    }

    @Override // p036e.f
    public final p036e.e i() {
        return this.f15513k;
    }

    @Override // androidx.lifecycle.S
    public Q k() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        S();
        Q q8 = this.f15508f;
        t.d(q8);
        return q8;
    }

    @Override // p217z2.f
    public final p217z2.d l() {
        return this.f15507e.b();
    }

    @Override // I1.d
    public final void m(T1.a listener) {
        t.g(listener, "listener");
        this.f15515m.add(listener);
    }

    @Override // H1.n
    public final void n(T1.a listener) {
        t.g(listener, "listener");
        this.f15517o.remove(listener);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        if (this.f15513k.e(i8, i9, intent)) {
            return;
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        b().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f15514l.iterator();
        while (it.hasNext()) {
            ((T1.a) it.next()).accept(newConfig);
        }
    }

    @Override // H1.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f15507e.d(bundle);
        this.f15505c.c(this);
        super.onCreate(bundle);
        D.f15213b.c(this);
        int i8 = this.f15511i;
        if (i8 != 0) {
            setContentView(i8);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        t.g(menu, "menu");
        if (i8 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i8, menu);
        this.f15506d.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem item) {
        t.g(item, "item");
        if (super.onMenuItemSelected(i8, item)) {
            return true;
        }
        if (i8 == 0) {
            return this.f15506d.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z8) {
        if (this.f15520r) {
            return;
        }
        Iterator it = this.f15517o.iterator();
        while (it.hasNext()) {
            ((T1.a) it.next()).accept(new H1.g(z8));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        t.g(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f15516n.iterator();
        while (it.hasNext()) {
            ((T1.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        t.g(menu, "menu");
        this.f15506d.c(menu);
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8) {
        if (this.f15521s) {
            return;
        }
        Iterator it = this.f15518p.iterator();
        while (it.hasNext()) {
            ((T1.a) it.next()).accept(new q(z8));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        t.g(menu, "menu");
        if (i8 != 0) {
            return true;
        }
        super.onPreparePanel(i8, view, menu);
        this.f15506d.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        t.g(permissions, "permissions");
        t.g(grantResults, "grantResults");
        if (this.f15513k.e(i8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i8, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objX = X();
        Q qA = this.f15508f;
        if (qA == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            qA = dVar.a();
        }
        if (qA == null && objX == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(objX);
        dVar2.c(qA);
        return dVar2;
    }

    @Override // H1.f, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        t.g(outState, "outState");
        if (w() instanceof r) {
            AbstractC1726i abstractC1726iW = w();
            t.e(abstractC1726iW, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((r) abstractC1726iW).n(AbstractC1726i.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f15507e.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        Iterator it = this.f15515m.iterator();
        while (it.hasNext()) {
            ((T1.a) it.next()).accept(Integer.valueOf(i8));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f15519q.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // H1.o
    public final void p(T1.a listener) {
        t.g(listener, "listener");
        this.f15518p.add(listener);
    }

    @Override // H1.n
    public final void q(T1.a listener) {
        t.g(listener, "listener");
        this.f15517o.add(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (E2.a.d()) {
                E2.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            T().b();
        } finally {
            E2.a.b();
        }
    }

    @Override // U1.InterfaceC1654p
    public void s(InterfaceC1656s provider) {
        t.g(provider, "provider");
        this.f15506d.f(provider);
    }

    @Override // android.app.Activity
    public void setContentView(int i8) {
        U();
        e eVar = this.f15509g;
        View decorView = getWindow().getDecorView();
        t.f(decorView, "window.decorView");
        eVar.J0(decorView);
        super.setContentView(i8);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i8) {
        t.g(intent, "intent");
        super.startActivityForResult(intent, i8);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i8, Intent intent2, int i9, int i10, int i11) throws IntentSender.SendIntentException {
        t.g(intent, "intent");
        super.startIntentSenderForResult(intent, i8, intent2, i9, i10, i11);
    }

    @Override // I1.c
    public final void t(T1.a listener) {
        t.g(listener, "listener");
        this.f15514l.remove(listener);
    }

    @Override // H1.o
    public final void u(T1.a listener) {
        t.g(listener, "listener");
        this.f15518p.remove(listener);
    }

    @Override // H1.f, androidx.lifecycle.InterfaceC1733p
    public AbstractC1726i w() {
        return super.w();
    }

    public static final void O(C c8, ActivityC1747j this$0, InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
        t.g(c8, bGZGhbtQmA.gtoeR);
        t.g(this$0, "this$0");
        t.g(interfaceC1733p, "<anonymous parameter 0>");
        t.g(event, "event");
        if (event == AbstractC1726i.a.ON_CREATE) {
            c8.o(b.f15525a.a(this$0));
        }
    }

    @Override // U1.InterfaceC1654p
    public void d(InterfaceC1656s interfaceC1656s) {
        t.g(interfaceC1656s, mHPawN.JNlDcspVfUmGOKU);
        this.f15506d.a(interfaceC1656s);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i8, Bundle bundle) {
        t.g(intent, "intent");
        super.startActivityForResult(intent, i8, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i8, Intent intent2, int i9, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
        t.g(intent, "intent");
        super.startIntentSenderForResult(intent, i8, intent2, i9, i10, i11, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z8, Configuration newConfig) {
        t.g(newConfig, "newConfig");
        this.f15520r = true;
        try {
            super.onMultiWindowModeChanged(z8, newConfig);
            this.f15520r = false;
            Iterator it = this.f15517o.iterator();
            while (it.hasNext()) {
                ((T1.a) it.next()).accept(new H1.g(z8, newConfig));
            }
        } catch (Throwable th) {
            this.f15520r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z8, Configuration newConfig) {
        t.g(newConfig, "newConfig");
        this.f15521s = true;
        try {
            super.onPictureInPictureModeChanged(z8, newConfig);
            this.f15521s = false;
            Iterator it = this.f15518p.iterator();
            while (it.hasNext()) {
                ((T1.a) it.next()).accept(new q(z8, newConfig));
            }
        } catch (Throwable th) {
            this.f15521s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        U();
        e eVar = this.f15509g;
        View decorView = getWindow().getDecorView();
        t.f(decorView, "window.decorView");
        eVar.J0(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        e eVar = this.f15509g;
        View decorView = getWindow().getDecorView();
        t.f(decorView, "window.decorView");
        eVar.J0(decorView);
        super.setContentView(view, layoutParams);
    }

    public ActivityC1747j(int i8) {
        this();
        this.f15511i = i8;
    }
}
