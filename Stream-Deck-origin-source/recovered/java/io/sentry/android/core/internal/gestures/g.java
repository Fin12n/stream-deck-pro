package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C2491e;
import io.sentry.C2533o1;
import io.sentry.EnumC2596z2;
import io.sentry.H;
import io.sentry.InterfaceC2496f0;
import io.sentry.InterfaceC2549q1;
import io.sentry.V;
import io.sentry.X;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.k3;
import io.sentry.protocol.E;
import io.sentry.s3;
import io.sentry.u3;
import io.sentry.util.F;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f26366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f26367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f26368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.internal.gestures.b f26369d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2496f0 f26370e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f26371f = b.Unknown;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f26372g = new c(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26373a;

        static {
            int[] iArr = new int[b.values().length];
            f26373a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26373a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26373a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26373a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(Activity activity, X x8, SentryAndroidOptions sentryAndroidOptions) {
        this.f26366a = new WeakReference(activity);
        this.f26367b = x8;
        this.f26368c = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, V v8, InterfaceC2496f0 interfaceC2496f0, InterfaceC2496f0 interfaceC2496f1) {
        if (interfaceC2496f1 != null) {
            gVar.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC2496f0.getName());
        } else {
            gVar.getClass();
            v8.G(interfaceC2496f0);
        }
    }

    public static /* synthetic */ void d(g gVar, V v8, InterfaceC2496f0 interfaceC2496f0) {
        if (interfaceC2496f0 == gVar.f26370e) {
            v8.n();
        }
    }

    public static String j(b bVar) {
        int i8 = a.f26373a[bVar.ordinal()];
        if (i8 == 1) {
            return "click";
        }
        if (i8 != 2) {
            return i8 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    public final void e(io.sentry.internal.gestures.b bVar, b bVar2, Map map, MotionEvent motionEvent) {
        if (this.f26368c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            H h8 = new H();
            h8.k("android:motionEvent", motionEvent);
            h8.k("android:view", bVar.f());
            this.f26367b.e(C2491e.E(strJ, bVar.d(), bVar.a(), bVar.e(), map), h8);
        }
    }

    public void f(final V v8, final InterfaceC2496f0 interfaceC2496f0) {
        v8.E(new C2533o1.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.C2533o1.c
            public final void a(InterfaceC2496f0 interfaceC2496f1) {
                g.b(this.f26361a, v8, interfaceC2496f0, interfaceC2496f1);
            }
        });
    }

    public void g(final V v8) {
        v8.E(new C2533o1.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.C2533o1.c
            public final void a(InterfaceC2496f0 interfaceC2496f0) {
                g.d(this.f26364a, v8, interfaceC2496f0);
            }
        });
    }

    public final View h(String str) {
        Activity activity = (Activity) this.f26366a.get();
        if (activity == null) {
            this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    public final String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public void k(MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f26372g.f26375b;
        if (viewH == null || bVar == null) {
            return;
        }
        if (this.f26372g.f26374a == b.Unknown) {
            this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f26372g.f26374a, Collections.singletonMap("direction", this.f26372g.i(motionEvent)), motionEvent);
        l(bVar, this.f26372g.f26374a);
        this.f26372g.j();
    }

    public final void l(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z8 = bVar2 == b.Click || !(bVar2 == this.f26371f && bVar.equals(this.f26369d));
        if (!this.f26368c.isTracingEnabled() || !this.f26368c.isEnableUserInteractionTracing()) {
            if (z8) {
                if (this.f26368c.isEnableAutoTraceIdGeneration()) {
                    F.h(this.f26367b);
                }
                this.f26369d = bVar;
                this.f26371f = bVar2;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f26366a.get();
        if (activity == null) {
            this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        InterfaceC2496f0 interfaceC2496f0 = this.f26370e;
        if (interfaceC2496f0 != null) {
            if (!z8 && !interfaceC2496f0.d()) {
                this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f26368c.getIdleTimeout() != null) {
                    this.f26370e.o();
                    return;
                }
                return;
            }
            m(k3.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        u3 u3Var = new u3();
        u3Var.v(true);
        u3Var.s(30000L);
        u3Var.t(this.f26368c.getIdleTimeout());
        u3Var.i(true);
        u3Var.g("auto.ui.gesture_listener." + bVar.c());
        final InterfaceC2496f0 interfaceC2496f0S = this.f26367b.s(new s3(str, E.COMPONENT, str2), u3Var);
        this.f26367b.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.InterfaceC2549q1
            public final void a(V v8) {
                this.f26359a.f(v8, interfaceC2496f0S);
            }
        });
        this.f26370e = interfaceC2496f0S;
        this.f26369d = bVar;
        this.f26371f = bVar2;
    }

    public void m(k3 k3Var) {
        InterfaceC2496f0 interfaceC2496f0 = this.f26370e;
        if (interfaceC2496f0 != null) {
            if (interfaceC2496f0.a() == null) {
                this.f26370e.g(k3Var);
            } else {
                this.f26370e.i();
            }
        }
        this.f26367b.u(new InterfaceC2549q1() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.InterfaceC2549q1
            public final void a(V v8) {
                this.f26358a.g(v8);
            }
        });
        this.f26370e = null;
        if (this.f26369d != null) {
            this.f26369d = null;
        }
        this.f26371f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f26372g.j();
        this.f26372g.f26376c = motionEvent.getX();
        this.f26372g.f26377d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        this.f26372g.f26374a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f26372g.f26374a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f26368c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f26372g.k(bVarA);
            this.f26372g.f26374a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f26368c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.CLICKABLE);
            if (bVarA == null) {
                this.f26368c.getLogger().c(EnumC2596z2.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f26374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.sentry.internal.gestures.b f26375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f26376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f26377d;

        public c() {
            this.f26374a = b.Unknown;
            this.f26376c = 0.0f;
            this.f26377d = 0.0f;
        }

        public final String i(MotionEvent motionEvent) {
            float x8 = motionEvent.getX() - this.f26376c;
            float y8 = motionEvent.getY() - this.f26377d;
            if (Math.abs(x8) > Math.abs(y8)) {
                return x8 > 0.0f ? "right" : "left";
            }
            return y8 > 0.0f ? "down" : "up";
        }

        public final void j() {
            this.f26375b = null;
            this.f26374a = b.Unknown;
            this.f26376c = 0.0f;
            this.f26377d = 0.0f;
        }

        public final void k(io.sentry.internal.gestures.b bVar) {
            this.f26375b = bVar;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}
