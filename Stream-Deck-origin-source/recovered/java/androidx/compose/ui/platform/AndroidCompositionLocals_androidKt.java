package androidx.compose.ui.platform;

import C6.C0920i;
import C6.G;
import Q6.o;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.InterfaceC1733p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2385d0;
import p065h1.C2381b0;
import p065h1.N;
import p065h1.X;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.C0;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f14856a = AbstractC3182v.d(null, a.f14862a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f14857b = AbstractC3182v.e(b.f14863a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f14858c = AbstractC3182v.e(c.f14864a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f14859d = AbstractC3182v.e(d.f14865a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B0 f14860e = AbstractC3182v.e(e.f14866a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B0 f14861f = AbstractC3182v.e(f.f14867a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14862a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.k("LocalConfiguration");
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14863a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.k("LocalContext");
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14864a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p101l1.b invoke() {
            AndroidCompositionLocals_androidKt.k("LocalImageVectorCache");
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f14865a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1733p invoke() {
            AndroidCompositionLocals_androidKt.k("LocalLifecycleOwner");
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f14866a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p217z2.f invoke() {
            AndroidCompositionLocals_androidKt.k("LocalSavedStateRegistryOwner");
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f14867a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.k("LocalView");
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f14868a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC3164l0 interfaceC3164l0) {
            super(1);
            this.f14868a = interfaceC3164l0;
        }

        public final void b(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f14868a, new Configuration(configuration));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Configuration) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2381b0 f14869a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2381b0 f14870a;

            public a(C2381b0 c2381b0) {
                this.f14870a = c2381b0;
            }

            @Override // p215z0.H
            public void d() {
                this.f14870a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C2381b0 c2381b0) {
            super(1);
            this.f14869a = c2381b0;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            return new a(this.f14869a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f14872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f14873c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AndroidComposeView androidComposeView, N n8, o oVar) {
            super(2);
            this.f14871a = androidComposeView;
            this.f14872b = n8;
            this.f14873c = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1471621628, i8, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:118)");
            }
            X.a(this.f14871a, this.f14872b, this.f14873c, interfaceC3163l, 72);
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
    public static final class j extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f14875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14876c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AndroidComposeView androidComposeView, o oVar, int i8) {
            super(2);
            this.f14874a = androidComposeView;
            this.f14875b = oVar;
            this.f14876c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AndroidCompositionLocals_androidKt.a(this.f14874a, this.f14875b, interfaceC3163l, F0.a(this.f14876c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f14877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f14878b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f14879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f14880b;

            public a(Context context, l lVar) {
                this.f14879a = context;
                this.f14880b = lVar;
            }

            @Override // p215z0.H
            public void d() {
                this.f14879a.getApplicationContext().unregisterComponentCallbacks(this.f14880b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, l lVar) {
            super(1);
            this.f14877a = context;
            this.f14878b = lVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            this.f14877a.getApplicationContext().registerComponentCallbacks(this.f14878b);
            return new a(this.f14877a, this.f14878b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Configuration f14881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p101l1.b f14882b;

        public l(Configuration configuration, p101l1.b bVar) {
            this.f14881a = configuration;
            this.f14882b = bVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f14882b.c(this.f14881a.updateFrom(configuration));
            this.f14881a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f14882b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i8) {
            this.f14882b.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1396852028);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1396852028, i8, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        interfaceC3163lP.f(-492369756);
        Object objG = interfaceC3163lP.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = l1.e(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        interfaceC3163lP.f(-230243351);
        boolean zR = interfaceC3163lP.R(interfaceC3164l0);
        Object objG2 = interfaceC3163lP.g();
        if (zR || objG2 == aVar.a()) {
            objG2 = new g(interfaceC3164l0);
            interfaceC3163lP.H(objG2);
        }
        interfaceC3163lP.N();
        androidComposeView.setConfigurationChangeObserver((Q6.k) objG2);
        interfaceC3163lP.f(-492369756);
        Object objG3 = interfaceC3163lP.g();
        if (objG3 == aVar.a()) {
            objG3 = new N(context);
            interfaceC3163lP.H(objG3);
        }
        interfaceC3163lP.N();
        N n8 = (N) objG3;
        AndroidComposeView.c viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        interfaceC3163lP.f(-492369756);
        Object objG4 = interfaceC3163lP.g();
        if (objG4 == aVar.a()) {
            objG4 = AbstractC2385d0.b(androidComposeView, viewTreeOwners.b());
            interfaceC3163lP.H(objG4);
        }
        interfaceC3163lP.N();
        C2381b0 c2381b0 = (C2381b0) objG4;
        K.a(G.f1419a, new h(c2381b0), interfaceC3163lP, 6);
        AbstractC3182v.b(new C0[]{f14856a.c(b(interfaceC3164l0)), f14857b.c(context), f14859d.c(viewTreeOwners.a()), f14860e.c(viewTreeOwners.b()), I0.i.b().c(c2381b0), f14861f.c(androidComposeView.getView()), f14858c.c(l(context, b(interfaceC3164l0), interfaceC3163lP, 72))}, H0.c.b(interfaceC3163lP, 1471621628, true, new i(androidComposeView, n8, oVar)), interfaceC3163lP, 56);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new j(androidComposeView, oVar, i8));
        }
    }

    public static final Configuration b(InterfaceC3164l0 interfaceC3164l0) {
        return (Configuration) interfaceC3164l0.getValue();
    }

    public static final void c(InterfaceC3164l0 interfaceC3164l0, Configuration configuration) {
        interfaceC3164l0.setValue(configuration);
    }

    public static final B0 f() {
        return f14856a;
    }

    public static final B0 g() {
        return f14857b;
    }

    public static final B0 getLocalLifecycleOwner() {
        return f14859d;
    }

    public static final B0 h() {
        return f14858c;
    }

    public static final B0 i() {
        return f14860e;
    }

    public static final B0 j() {
        return f14861f;
    }

    public static final Void k(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final p101l1.b l(Context context, Configuration configuration, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-485908294);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-485908294, i8, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:131)");
        }
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = new p101l1.b();
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        p101l1.b bVar = (p101l1.b) objG;
        interfaceC3163l.f(-492369756);
        Object objG2 = interfaceC3163l.g();
        Object obj = objG2;
        if (objG2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC3163l.H(configuration2);
            obj = configuration2;
        }
        interfaceC3163l.N();
        Configuration configuration3 = (Configuration) obj;
        interfaceC3163l.f(-492369756);
        Object objG3 = interfaceC3163l.g();
        if (objG3 == aVar.a()) {
            objG3 = new l(configuration3, bVar);
            interfaceC3163l.H(objG3);
        }
        interfaceC3163l.N();
        K.a(bVar, new k(context, (l) objG3), interfaceC3163l, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return bVar;
    }
}
