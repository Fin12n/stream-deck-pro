package p009b;

import C6.G;
import D6.C0930j;
import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f15454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T1.a f15455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0930j f15456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B f15457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedCallback f15458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f15459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15461h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {
        public a() {
            super(1);
        }

        public final void b(C1739b backEvent) {
            t.g(backEvent, "backEvent");
            C.this.n(backEvent);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C1739b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {
        public b() {
            super(1);
        }

        public final void b(C1739b backEvent) {
            t.g(backEvent, "backEvent");
            C.this.m(backEvent);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C1739b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            C.this.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
            C.this.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m91invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m91invoke() {
            C.this.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f15467a = new f();

        public static final void c(Function0 onBackInvoked) {
            t.g(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(final Function0 onBackInvoked) {
            t.g(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: b.D
                public final void onBackInvoked() {
                    C.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int i8, Object callback) {
            t.g(dispatcher, "dispatcher");
            t.g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i8, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            t.g(dispatcher, "dispatcher");
            t.g(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f15468a = new g();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.k f15469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.k f15470b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f15471c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f15472d;

            public a(Q6.k kVar, Q6.k kVar2, Function0 function0, Function0 function1) {
                this.f15469a = kVar;
                this.f15470b = kVar2;
                this.f15471c = function0;
                this.f15472d = function1;
            }

            public void onBackCancelled() {
                this.f15472d.invoke();
            }

            public void onBackInvoked() {
                this.f15471c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                t.g(backEvent, "backEvent");
                this.f15470b.invoke(new C1739b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                t.g(backEvent, "backEvent");
                this.f15469a.invoke(new C1739b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(Q6.k onBackStarted, Q6.k onBackProgressed, Function0 onBackInvoked, Function0 onBackCancelled) {
            t.g(onBackStarted, "onBackStarted");
            t.g(onBackProgressed, "onBackProgressed");
            t.g(onBackInvoked, "onBackInvoked");
            t.g(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class h implements InterfaceC1730m, InterfaceC1740c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1726i f15473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f15474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC1740c f15475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C f15476d;

        public h(C c8, AbstractC1726i lifecycle, B onBackPressedCallback) {
            t.g(lifecycle, "lifecycle");
            t.g(onBackPressedCallback, "onBackPressedCallback");
            this.f15476d = c8;
            this.f15473a = lifecycle;
            this.f15474b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // p009b.InterfaceC1740c
        public void cancel() {
            this.f15473a.d(this);
            this.f15474b.i(this);
            InterfaceC1740c interfaceC1740c = this.f15475c;
            if (interfaceC1740c != null) {
                interfaceC1740c.cancel();
            }
            this.f15475c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1730m
        public void j(InterfaceC1733p source, AbstractC1726i.a event) {
            t.g(source, "source");
            t.g(event, "event");
            if (event == AbstractC1726i.a.ON_START) {
                this.f15475c = this.f15476d.j(this.f15474b);
                return;
            }
            if (event != AbstractC1726i.a.ON_STOP) {
                if (event == AbstractC1726i.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1740c interfaceC1740c = this.f15475c;
                if (interfaceC1740c != null) {
                    interfaceC1740c.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class i implements InterfaceC1740c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B f15477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C f15478b;

        public i(C c8, B onBackPressedCallback) {
            t.g(onBackPressedCallback, "onBackPressedCallback");
            this.f15478b = c8;
            this.f15477a = onBackPressedCallback;
        }

        @Override // p009b.InterfaceC1740c
        public void cancel() {
            this.f15478b.f15456c.remove(this.f15477a);
            if (t.c(this.f15478b.f15457d, this.f15477a)) {
                this.f15477a.c();
                this.f15478b.f15457d = null;
            }
            this.f15477a.i(this);
            Function0 function0B = this.f15477a.b();
            if (function0B != null) {
                function0B.invoke();
            }
            this.f15477a.k(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class j extends C2639q implements Function0 {
        public j(Object obj) {
            super(0, obj, C.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void h() {
            ((C) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class k extends C2639q implements Function0 {
        public k(Object obj) {
            super(0, obj, C.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void h() {
            ((C) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void h(InterfaceC1733p owner, B onBackPressedCallback) {
        t.g(owner, "owner");
        t.g(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1726i abstractC1726iW = owner.w();
        if (abstractC1726iW.b() == AbstractC1726i.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new h(this, abstractC1726iW, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new j(this));
    }

    public final void i(B onBackPressedCallback) {
        t.g(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final InterfaceC1740c j(B onBackPressedCallback) {
        t.g(onBackPressedCallback, "onBackPressedCallback");
        this.f15456c.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.a(iVar);
        q();
        onBackPressedCallback.k(new k(this));
        return iVar;
    }

    public final void k() {
        Object objPrevious;
        B b8 = this.f15457d;
        if (b8 == null) {
            C0930j c0930j = this.f15456c;
            ListIterator<E> listIterator = c0930j.listIterator(c0930j.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((B) objPrevious).g());
            b8 = (B) objPrevious;
        }
        this.f15457d = null;
        if (b8 != null) {
            b8.c();
        }
    }

    public final void l() {
        Object objPrevious;
        B b8 = this.f15457d;
        if (b8 == null) {
            C0930j c0930j = this.f15456c;
            ListIterator<E> listIterator = c0930j.listIterator(c0930j.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((B) objPrevious).g());
            b8 = (B) objPrevious;
        }
        this.f15457d = null;
        if (b8 != null) {
            b8.d();
            return;
        }
        Runnable runnable = this.f15454a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m(C1739b c1739b) {
        Object objPrevious;
        B b8 = this.f15457d;
        if (b8 == null) {
            C0930j c0930j = this.f15456c;
            ListIterator<E> listIterator = c0930j.listIterator(c0930j.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((B) objPrevious).g());
            b8 = (B) objPrevious;
        }
        if (b8 != null) {
            b8.e(c1739b);
        }
    }

    public final void n(C1739b c1739b) {
        Object objPrevious;
        C0930j c0930j = this.f15456c;
        ListIterator<E> listIterator = c0930j.listIterator(c0930j.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((B) objPrevious).g());
        B b8 = (B) objPrevious;
        if (this.f15457d != null) {
            k();
        }
        this.f15457d = b8;
        if (b8 != null) {
            b8.f(c1739b);
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        t.g(invoker, "invoker");
        this.f15459f = invoker;
        p(this.f15461h);
    }

    public final void p(boolean z8) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f15459f;
        OnBackInvokedCallback onBackInvokedCallback = this.f15458e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z8 && !this.f15460g) {
            f.f15467a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f15460g = true;
        } else {
            if (z8 || !this.f15460g) {
                return;
            }
            f.f15467a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f15460g = false;
        }
    }

    public final void q() {
        boolean z8 = this.f15461h;
        C0930j c0930j = this.f15456c;
        boolean z9 = false;
        if (c0930j == null || !c0930j.isEmpty()) {
            Iterator<E> it = c0930j.iterator();
            while (it.hasNext()) {
                if (((B) it.next()).g()) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f15461h = z9;
        if (z9 != z8) {
            T1.a aVar = this.f15455b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z9));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z9);
            }
        }
    }

    public C(Runnable runnable, T1.a aVar) {
        this.f15454a = runnable;
        this.f15455b = aVar;
        this.f15456c = new C0930j();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            this.f15458e = i8 >= 34 ? g.f15468a.a(new a(), new b(), new c(), new d()) : f.f15467a.b(new e());
        }
    }

    public /* synthetic */ C(Runnable runnable, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : runnable);
    }

    public C(Runnable runnable) {
        this(runnable, null);
    }
}
