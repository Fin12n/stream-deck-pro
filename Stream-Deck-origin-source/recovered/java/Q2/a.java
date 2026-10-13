package Q2;

import C6.G;
import Q6.k;
import Q6.o;
import Q6.q;
import S2.l;
import S2.m;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1724g;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.L;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l, InterfaceC1733p, S, p217z2.f, InterfaceC1724g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0257a f9155g = new C0257a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9156h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1726i.a[] f9157i = {AbstractC1726i.a.ON_CREATE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AbstractC1726i.a[] f9158j = {AbstractC1726i.a.ON_START, AbstractC1726i.a.ON_RESUME};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC1726i.a[] f9159k = {AbstractC1726i.a.ON_PAUSE, AbstractC1726i.a.ON_STOP};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1726i.a[] f9160l = {AbstractC1726i.a.ON_DESTROY};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f9162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f9163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f9164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p217z2.e f9165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f9166f;

    /* JADX INFO: renamed from: Q2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0257a {

        /* JADX INFO: renamed from: Q2.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0258a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0258a f9167a = new C0258a();

            public C0258a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String it) {
                t.g(it, "it");
                return new a(null);
            }
        }

        public /* synthetic */ C0257a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final l a(T2.a screen) {
            t.g(screen, "screen");
            S2.i iVarA = m.f9722a.a(screen, K.i(a.class), C0258a.f9167a);
            if (iVarA != null) {
                return (a) iVarA;
            }
            throw new NullPointerException("null cannot be cast to non-null type cafe.adriel.voyager.androidx.AndroidScreenLifecycleOwner");
        }

        public C0257a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f9169b;

        /* JADX INFO: renamed from: Q2.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0259a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f9170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f9171b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f9172c;

            public C0259a(Function0 function0, a aVar, Bundle bundle) {
                this.f9170a = function0;
                this.f9171b = aVar;
                this.f9172c = bundle;
            }

            @Override // p215z0.H
            public void d() {
                this.f9170a.invoke();
                this.f9171b.x(this.f9172c);
                this.f9171b.q();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bundle bundle) {
            super(1);
            this.f9169b = bundle;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffect) {
            t.g(DisposableEffect, "$this$DisposableEffect");
            Function0 function0Y = a.this.y(this.f9169b);
            a.this.p();
            return new C0259a(function0Y, a.this, this.f9169b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8) {
            super(2);
            this.f9174b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.this.d(interfaceC3163l, F0.a(this.f9174b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9175a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return new Bundle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f9177b;

        /* JADX INFO: renamed from: Q2.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0260a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f9178a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0260a(o oVar) {
                super(2);
                this.f9178a = oVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(149857323, i8, -1, "cafe.adriel.voyager.androidx.AndroidScreenLifecycleOwner.ProvideBeforeScreenContent.<anonymous>.<anonymous> (AndroidScreenLifecycleOwner.kt:119)");
                }
                this.f9178a.invoke(interfaceC3163l, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o oVar) {
            super(2);
            this.f9177b = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1252663061, i8, -1, "cafe.adriel.voyager.androidx.AndroidScreenLifecycleOwner.ProvideBeforeScreenContent.<anonymous> (AndroidScreenLifecycleOwner.kt:114)");
            }
            a.this.d(interfaceC3163l, 8);
            C0[] c0Arr = (C0[]) a.this.s(interfaceC3163l, 8).toArray(new C0[0]);
            AbstractC3182v.b((C0[]) Arrays.copyOf(c0Arr, c0Arr.length), H0.c.b(interfaceC3163l, 149857323, true, new C0260a(this.f9177b)), interfaceC3163l, 56);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f9180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f9181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q qVar, o oVar, int i8) {
            super(2);
            this.f9180b = qVar;
            this.f9181c = oVar;
            this.f9182d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.this.c(this.f9180b, this.f9181c, interfaceC3163l, F0.a(this.f9182d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i f9183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f9184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AbstractC1726i abstractC1726i, i iVar) {
            super(0);
            this.f9183a = abstractC1726i;
            this.f9184b = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m74invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m74invoke() {
            this.f9183a.d(this.f9184b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f9185a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m75invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m75invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f9187b;

        public i(Bundle bundle) {
            this.f9187b = bundle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC1733p owner) {
            t.g(owner, "owner");
            a aVar = a.this;
            aVar.z(aVar.w(), AbstractC1726i.a.ON_PAUSE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC1733p owner) {
            t.g(owner, "owner");
            a aVar = a.this;
            aVar.z(aVar.w(), AbstractC1726i.a.ON_RESUME);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC1733p owner) {
            t.g(owner, "owner");
            a aVar = a.this;
            aVar.z(aVar.w(), AbstractC1726i.a.ON_START);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC1733p owner) {
            t.g(owner, "owner");
            a aVar = a.this;
            aVar.z(aVar.w(), AbstractC1726i.a.ON_STOP);
            a.this.x(this.f9187b);
        }
    }

    public /* synthetic */ a(AbstractC2633k abstractC2633k) {
        this();
    }

    private final void v(Bundle bundle) {
        if (u()) {
            throw new IllegalStateException("onCreate already called");
        }
        A(true);
        this.f9165e.d(bundle);
        for (AbstractC1726i.a aVar : f9157i) {
            z(w(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Bundle bundle) {
        this.f9165e.e(bundle);
    }

    public final void A(boolean z8) {
        this.f9166f.setValue(Boolean.valueOf(z8));
    }

    @Override // S2.i
    public void a(T2.a screen) {
        t.g(screen, "screen");
        k().a();
        for (AbstractC1726i.a aVar : f9160l) {
            z(w(), aVar);
        }
    }

    @Override // S2.j
    public void c(q provideSaveableState, o content, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(provideSaveableState, "provideSaveableState");
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(271793937);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(271793937, i8, -1, "cafe.adriel.voyager.androidx.AndroidScreenLifecycleOwner.ProvideBeforeScreenContent (AndroidScreenLifecycleOwner.kt:112)");
        }
        provideSaveableState.i("lifecycle", H0.c.b(interfaceC3163lP, -1252663061, true, new e(content)), interfaceC3163lP, Integer.valueOf(((i8 << 6) & 896) | 54));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(provideSaveableState, content, i8));
        }
    }

    public final void d(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(248653203);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(248653203, i8, -1, "cafe.adriel.voyager.androidx.AndroidScreenLifecycleOwner.LifecycleDisposableEffect (AndroidScreenLifecycleOwner.kt:185)");
        }
        Bundle bundle = (Bundle) I0.b.b(new Object[0], null, null, d.f9175a, interfaceC3163lP, 3080, 6);
        if (!u()) {
            v(bundle);
        }
        p215z0.K.a(this, new b(bundle), interfaceC3163lP, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(i8));
        }
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public P.c f() {
        Context context = (Context) this.f9163c.get();
        return new L(context != null ? r(context) : null, this);
    }

    @Override // androidx.lifecycle.InterfaceC1724g
    public p153r2.a g() {
        Application applicationR = null;
        p153r2.b bVar = new p153r2.b(null, 1, null);
        Context context = (Context) this.f9163c.get();
        if (context != null) {
            t.d(context);
            applicationR = r(context);
        }
        if (applicationR != null) {
            bVar.c(P.a.f15249h, applicationR);
        }
        bVar.c(androidx.lifecycle.I.f15227a, this);
        bVar.c(androidx.lifecycle.I.f15228b, this);
        return bVar;
    }

    @Override // androidx.lifecycle.S
    public Q k() {
        return this.f9162b;
    }

    @Override // p217z2.f
    public p217z2.d l() {
        return this.f9165e.b();
    }

    public final void p() {
        for (AbstractC1726i.a aVar : f9158j) {
            z(w(), aVar);
        }
    }

    public final void q() {
        for (AbstractC1726i.a aVar : f9159k) {
            z(w(), aVar);
        }
    }

    public final Application r(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        return null;
    }

    public final List s(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1197173186);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1197173186, i8, -1, "cafe.adriel.voyager.androidx.AndroidScreenLifecycleOwner.getHooks (AndroidScreenLifecycleOwner.kt:136)");
        }
        X.i.a(this.f9163c, null, ((Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g())).getApplicationContext());
        X.i.a(this.f9164d, null, interfaceC3163l.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()));
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(this);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = D6.r.q(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().c(this), p161s2.a.f32876a.b(this), AndroidCompositionLocals_androidKt.i().c(this));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        List list = (List) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return list;
    }

    @Override // androidx.lifecycle.InterfaceC1733p
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public r w() {
        return this.f9161a;
    }

    public final boolean u() {
        return ((Boolean) this.f9166f.getValue()).booleanValue();
    }

    public final Function0 y(Bundle bundle) {
        InterfaceC1733p interfaceC1733p = (InterfaceC1733p) this.f9164d.get();
        if (interfaceC1733p == null) {
            return h.f9185a;
        }
        i iVar = new i(bundle);
        AbstractC1726i abstractC1726iW = interfaceC1733p.w();
        abstractC1726iW.a(iVar);
        return new g(abstractC1726iW, iVar);
    }

    public final void z(r rVar, AbstractC1726i.a aVar) {
        if (rVar.b().b(AbstractC1726i.b.INITIALIZED)) {
            rVar.i(aVar);
        }
    }

    public a() {
        this.f9161a = new r(this);
        this.f9162b = new Q();
        this.f9163c = new AtomicReference();
        this.f9164d = new AtomicReference();
        p217z2.e eVarA = p217z2.e.f39070d.a(this);
        this.f9165e = eVarA;
        this.f9166f = l1.e(Boolean.FALSE, null, 2, null);
        eVarA.c();
        androidx.lifecycle.I.c(this);
    }
}
