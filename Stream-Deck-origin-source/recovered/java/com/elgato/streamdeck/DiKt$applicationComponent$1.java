package com.elgato.streamdeck;

import A5.h;
import D6.C0937q;
import D6.iIQ.BmWxZhjGfw;
import L3.e;
import L3.f;
import N5.b;
import O5.g;
import P2.Lsk.mHPawN;
import U4.d;
import V.ocy.SVzBK;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.nsd.NsdManager;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.AbstractC1727j;
import androidx.lifecycle.AbstractC1734q;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.CryptoBoxAndroid;
import com.elgato.streamdeck.vsd2.IconDecompressorAndroid;
import com.elgato.streamdeck.vsd2.PermissionChecker;
import com.elgato.streamdeck.vsd2.PermissionRepository;
import com.elgato.streamdeck.vsd2.connection.CryptoBox;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.amazon.AmazonConfiguration;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.K;
import p005a4.c;
import p009b.ActivityC1747j;
import p017b7.J;
import p017b7.Z;
import p043e6.dT.GIGvBf;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2261g;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class DiKt$applicationComponent$1 extends kotlin.jvm.internal.u implements Q6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DiKt$applicationComponent$1 f17510a = new DiKt$applicationComponent$1();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class A extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f17511a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(Function0 function0) {
            super(1);
            this.f17511a = function0;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return this.f17511a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class B extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f17512a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(Q6.k kVar) {
            super(1);
            this.f17512a = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return this.f17512a.invoke(singleton.h(new A5.a(Resources.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.o f17513a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(Q6.o oVar) {
            super(1);
            this.f17513a = oVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return this.f17513a.invoke(singleton.h(new A5.a(Context.class, false, null, null), null), singleton.h(new A5.a(J.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class D extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.o f17514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(Q6.o oVar) {
            super(1);
            this.f17514a = oVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return this.f17514a.invoke(singleton.h(new A5.a(ActivityManager.class, false, null, null), null), singleton.h(new A5.a(PackageManager.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class E extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f17515a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(Q6.k kVar) {
            super(1);
            this.f17515a = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return this.f17515a.invoke(singleton.h(new A5.a(Context.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class F extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f17516a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(Function0 function0) {
            super(1);
            this.f17516a = function0;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return this.f17516a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class G extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G f17517a = new G();

        public G() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h prototype) {
            kotlin.jvm.internal.t.g(prototype, "$this$prototype");
            Object systemService = ((Context) prototype.h(new A5.a(Context.class, false, null, null), null)).getSystemService((Class<Object>) NsdManager.class);
            kotlin.jvm.internal.t.f(systemService, "getSystemService(...)");
            return systemService;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class H extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f17518a = new H();

        public H() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h prototype) {
            kotlin.jvm.internal.t.g(prototype, "$this$prototype");
            Object systemService = ((Context) prototype.h(new A5.a(Context.class, false, null, null), null)).getSystemService((Class<Object>) ActivityManager.class);
            kotlin.jvm.internal.t.f(systemService, "getSystemService(...)");
            return systemService;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1827a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1827a f17519a = new C1827a();

        public C1827a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H3.a invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new H3.a((c) singleton.h(new A5.a(c.class, false, null, null), null), (J) singleton.h(new A5.a(J.class, false, null, null), null));
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1828b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1828b f17520a = new C1828b();

        public C1828b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set invoke(h singleton) throws A5.q {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            Set setB = D5.a.b(singleton);
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB) {
                if (((A5.m) obj).typeEquals(new A5.a(V3.k.class, false, null, null))) {
                    arrayList.add(obj);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(h.i(singleton, (A5.m) it.next(), null, 2, null));
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1829c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1829c f17521a = new C1829c();

        public C1829c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G3.c invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            AppSettingsStore appSettingsStore = (AppSettingsStore) singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null);
            J j8 = (J) singleton.h(new A5.a(J.class, false, null, null), null);
            U4.c cVarA = d.a((Context) singleton.h(new A5.a(Context.class, false, null, null), null));
            kotlin.jvm.internal.t.f(cVarA, "create(...)");
            return new G3.c(appSettingsStore, j8, cVarA, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1830d extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1830d f17522a = new C1830d();

        public C1830d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Resources invoke(h prototype) {
            kotlin.jvm.internal.t.g(prototype, "$this$prototype");
            Resources resources = ((Context) prototype.h(new A5.a(Context.class, false, null, null), null)).getResources();
            kotlin.jvm.internal.t.f(resources, ZWZaxQrCHfNe.WZBfbXje);
            return resources;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C1831e extends C2639q implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1831e f17523a = new C1831e();

        public C1831e() {
            super(1, p178u3.d.class, "<init>", "<init>(Landroid/content/res/Resources;)V", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final p178u3.d invoke(Resources p8) {
            kotlin.jvm.internal.t.g(p8, "p0");
            return new p178u3.d(p8);
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C1832f extends C2639q implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1832f f17524a = new C1832f();

        public C1832f() {
            super(2, G3.j.class, "IsOnline", "IsOnline(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)Lcom/elgato/streamdeck/vsd2/network/IsOnline;", 1);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final R3.a invoke(Context p8, J p9) {
            kotlin.jvm.internal.t.g(p8, "p0");
            kotlin.jvm.internal.t.g(p9, "p1");
            return G3.j.a(p8, p9);
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C1833g extends C2639q implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1833g f17525a = new C1833g();

        public C1833g() {
            super(2, G3.n.class, "<init>", "<init>(Landroid/app/ActivityManager;Landroid/content/pm/PackageManager;)V", 0);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final G3.n invoke(ActivityManager p8, PackageManager p9) {
            kotlin.jvm.internal.t.g(p8, "p0");
            kotlin.jvm.internal.t.g(p9, "p1");
            return new G3.n(p8, p9);
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1834h extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1834h f17526a = new C1834h();

        public C1834h() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Purchases invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            Purchases.Companion companion = Purchases.Companion;
            companion.setLogLevel(LogLevel.ERROR);
            return G3.h.a() ? companion.configure(new AmazonConfiguration.Builder((Context) singleton.h(new A5.a(Context.class, false, null, null), null), mHPawN.MnGviGod).build()) : companion.configure(new PurchasesConfiguration.Builder((Context) singleton.h(new A5.a(Context.class, false, null, null), null), "goog_OKgVgwbVmfbYpuOGByEveqSIaXC").build());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f17527a = new i();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f17528a;

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0417a extends kotlin.jvm.internal.u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Context f17529a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0417a(Context context) {
                    super(1);
                    this.f17529a = context;
                }

                public final void b(b.C0239b install) {
                    kotlin.jvm.internal.t.g(install, "$this$install");
                    install.g(g.b(new File(this.f17529a.getCacheDir(), "httpCache"), null, 2, null));
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((b.C0239b) obj);
                    return C6.G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.f17528a = context;
            }

            public final void b(G5.b HttpClient) {
                kotlin.jvm.internal.t.g(HttpClient, "$this$HttpClient");
                HttpClient.i(b.f7442g, new C0417a(this.f17528a));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((G5.b) obj);
                return C6.G.f1419a;
            }
        }

        public i() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G5.a invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return G5.d.a(new a((Context) singleton.h(new A5.a(Context.class, false, null, null), null)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f17530a = new j();

        public j() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L3.c invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return f.a((G5.a) singleton.h(new A5.a(G5.a.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class k extends C2639q implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f17531a = new k();

        public k() {
            super(0, CryptoBoxAndroid.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final CryptoBoxAndroid invoke() {
            return new CryptoBoxAndroid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f17532a = new l();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f17533a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.f17533a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File invoke() {
                return p039e2.a.a(this.f17533a, "connection_settings.pb");
            }
        }

        public l() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AppSettingsStore invoke(h hVar) {
            kotlin.jvm.internal.t.g(hVar, ajyWhveMDgQ.SORbKcj);
            return AppSettingsStore.Companion.create((CryptoBox) hVar.h(new A5.a(CryptoBox.class, false, null, null), null), new a((Context) hVar.h(new A5.a(Context.class, false, null, null), null)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f17534a = new m();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17535a;

            public a(G6.d dVar) {
                super(3, dVar);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, Throwable th, G6.d dVar) {
                return new a(dVar).invokeSuspend(C6.G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f17535a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return C6.G.f1419a;
            }
        }

        public m() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final N3.b invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return N3.c.a((J) singleton.h(new A5.a(J.class, false, null, null), null), N3.l.c((G5.a) singleton.h(new A5.a(G5.a.class, false, null, null), null), 0L, null, 0, null, 15, null), P3.g.d((AppSettingsStore) singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null)), AbstractC2262h.f(p162s3.m.b((NsdManager) singleton.h(new A5.a(NsdManager.class, false, null, null), null)), new a(null)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f17536a = new n();

        public n() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M3.o invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new p202x3.a((Context) singleton.h(new A5.a(Context.class, false, null, null), null), (G5.a) singleton.h(new A5.a(G5.a.class, false, null, null), null), (AppSettingsStore) singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), (N3.b) singleton.h(new A5.a(N3.b.class, false, null, null), null), (CryptoBox) singleton.h(new A5.a(CryptoBox.class, false, null, null), null), D5.a.c(singleton, new A5.a(M3.i.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class o extends C2639q implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f17537a = new o();

        public o() {
            super(1, G3.a.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final G3.a invoke(Context p8) {
            kotlin.jvm.internal.t.g(p8, "p0");
            return new G3.a(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f17538a = new p();

        public p() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PermissionRepository invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new PermissionRepository((PermissionChecker) singleton.h(new A5.a(PermissionChecker.class, false, null, null), null), C0937q.e(PermissionRepository.Permission.CAMERA));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class q extends C2639q implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f17539a = new q();

        public q() {
            super(0, C3.i.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final C3.i invoke() {
            return new C3.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f17540a = new r();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class A extends C2639q implements Q6.r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final A f17541a = new A();

            public A() {
                super(5, A3.p.class, "<init>", "<init>(Lcom/elgato/streamdeck/purchase/PurchaseService;Lcom/elgato/streamdeck/vsd2/network/IsOnline;Lkotlinx/coroutines/CoroutineScope;Lcom/elgato/streamdeck/Values$Vendor;Lcom/elgato/streamdeck/vsd2/errors/ErrorAlertViewModel;)V", 0);
            }

            @Override // Q6.r
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final A3.p n(A3.n p8, R3.a p9, p017b7.J p10, a.b p11, O3.b p12) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                kotlin.jvm.internal.t.g(p11, "p3");
                kotlin.jvm.internal.t.g(p12, "p4");
                return new A3.p(p8, p9, p10, p11, p12);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class B extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17543b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17544c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17545d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17546e;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements DefaultLifecycleObserver {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17547a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f17548b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Object f17549c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17550d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17551e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17552f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17553g;

                public a(Q6.o oVar, h hVar, Object obj, Q6.o oVar2, Q6.o oVar3, Q6.o oVar4, Q6.o oVar5) {
                    this.f17547a = oVar;
                    this.f17548b = hVar;
                    this.f17549c = obj;
                    this.f17550d = oVar2;
                    this.f17551e = oVar3;
                    this.f17552f = oVar4;
                    this.f17553g = oVar5;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17547a;
                    if (oVar != null) {
                        oVar.invoke(this.f17548b, this.f17549c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17552f;
                    if (oVar != null) {
                        oVar.invoke(this.f17548b, this.f17549c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17551e;
                    if (oVar != null) {
                        oVar.invoke(this.f17548b, this.f17549c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17550d;
                    if (oVar != null) {
                        oVar.invoke(this.f17548b, this.f17549c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17553g;
                    if (oVar != null) {
                        oVar.invoke(this.f17548b, this.f17549c);
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends kotlin.jvm.internal.u implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AbstractC1726i f17554a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f17555b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AbstractC1726i abstractC1726i, a aVar) {
                    super(2);
                    this.f17554a = abstractC1726i;
                    this.f17555b = aVar;
                }

                public final void b(h hVar, Object it) {
                    kotlin.jvm.internal.t.g(hVar, "$this$null");
                    kotlin.jvm.internal.t.g(it, "it");
                    this.f17554a.d(this.f17555b);
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((h) obj, obj2);
                    return C6.G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public B(Q6.o oVar, Q6.o oVar2, Q6.o oVar3, Q6.o oVar4, Q6.o oVar5) {
                super(2);
                this.f17542a = oVar;
                this.f17543b = oVar2;
                this.f17544c = oVar3;
                this.f17545d = oVar4;
                this.f17546e = oVar5;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Q6.o invoke(h addSideEffect, Object instance) {
                kotlin.jvm.internal.t.g(addSideEffect, "$this$addSideEffect");
                kotlin.jvm.internal.t.g(instance, "instance");
                a aVar = new a(this.f17542a, addSideEffect, instance, this.f17543b, this.f17544c, this.f17545d, this.f17546e);
                AbstractC1726i abstractC1726i = (AbstractC1726i) h.i(addSideEffect, new A5.a(AbstractC1726i.class, false, A5.b.d(), null), null, 2, null);
                abstractC1726i.a(aVar);
                return new b(abstractC1726i, aVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17556a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17557b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17558c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17559d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17560e;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements DefaultLifecycleObserver {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17561a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f17562b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Object f17563c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17564d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17565e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17566f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17567g;

                public a(Q6.o oVar, h hVar, Object obj, Q6.o oVar2, Q6.o oVar3, Q6.o oVar4, Q6.o oVar5) {
                    this.f17561a = oVar;
                    this.f17562b = hVar;
                    this.f17563c = obj;
                    this.f17564d = oVar2;
                    this.f17565e = oVar3;
                    this.f17566f = oVar4;
                    this.f17567g = oVar5;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17561a;
                    if (oVar != null) {
                        oVar.invoke(this.f17562b, this.f17563c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17566f;
                    if (oVar != null) {
                        oVar.invoke(this.f17562b, this.f17563c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17565e;
                    if (oVar != null) {
                        oVar.invoke(this.f17562b, this.f17563c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17564d;
                    if (oVar != null) {
                        oVar.invoke(this.f17562b, this.f17563c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17567g;
                    if (oVar != null) {
                        oVar.invoke(this.f17562b, this.f17563c);
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends kotlin.jvm.internal.u implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AbstractC1726i f17568a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f17569b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AbstractC1726i abstractC1726i, a aVar) {
                    super(2);
                    this.f17568a = abstractC1726i;
                    this.f17569b = aVar;
                }

                public final void b(h hVar, Object it) {
                    kotlin.jvm.internal.t.g(hVar, "$this$null");
                    kotlin.jvm.internal.t.g(it, "it");
                    this.f17568a.d(this.f17569b);
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((h) obj, obj2);
                    return C6.G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C(Q6.o oVar, Q6.o oVar2, Q6.o oVar3, Q6.o oVar4, Q6.o oVar5) {
                super(2);
                this.f17556a = oVar;
                this.f17557b = oVar2;
                this.f17558c = oVar3;
                this.f17559d = oVar4;
                this.f17560e = oVar5;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Q6.o invoke(h addSideEffect, Object instance) {
                kotlin.jvm.internal.t.g(addSideEffect, "$this$addSideEffect");
                kotlin.jvm.internal.t.g(instance, "instance");
                a aVar = new a(this.f17556a, addSideEffect, instance, this.f17557b, this.f17558c, this.f17559d, this.f17560e);
                AbstractC1726i abstractC1726i = (AbstractC1726i) h.i(addSideEffect, new A5.a(AbstractC1726i.class, false, A5.b.d(), null), null, 2, null);
                abstractC1726i.a(aVar);
                return new b(abstractC1726i, aVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class D extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17572c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17573d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17574e;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements DefaultLifecycleObserver {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17575a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f17576b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Object f17577c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17578d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17579e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17580f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Q6.o f17581g;

                public a(Q6.o oVar, h hVar, Object obj, Q6.o oVar2, Q6.o oVar3, Q6.o oVar4, Q6.o oVar5) {
                    this.f17575a = oVar;
                    this.f17576b = hVar;
                    this.f17577c = obj;
                    this.f17578d = oVar2;
                    this.f17579e = oVar3;
                    this.f17580f = oVar4;
                    this.f17581g = oVar5;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17575a;
                    if (oVar != null) {
                        oVar.invoke(this.f17576b, this.f17577c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onPause(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17580f;
                    if (oVar != null) {
                        oVar.invoke(this.f17576b, this.f17577c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onResume(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17579e;
                    if (oVar != null) {
                        oVar.invoke(this.f17576b, this.f17577c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17578d;
                    if (oVar != null) {
                        oVar.invoke(this.f17576b, this.f17577c);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStop(InterfaceC1733p owner) {
                    kotlin.jvm.internal.t.g(owner, "owner");
                    Q6.o oVar = this.f17581g;
                    if (oVar != null) {
                        oVar.invoke(this.f17576b, this.f17577c);
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends kotlin.jvm.internal.u implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AbstractC1726i f17582a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f17583b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(AbstractC1726i abstractC1726i, a aVar) {
                    super(2);
                    this.f17582a = abstractC1726i;
                    this.f17583b = aVar;
                }

                public final void b(h hVar, Object it) {
                    kotlin.jvm.internal.t.g(hVar, "$this$null");
                    kotlin.jvm.internal.t.g(it, "it");
                    this.f17582a.d(this.f17583b);
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((h) obj, obj2);
                    return C6.G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public D(Q6.o oVar, Q6.o oVar2, Q6.o oVar3, Q6.o oVar4, Q6.o oVar5) {
                super(2);
                this.f17570a = oVar;
                this.f17571b = oVar2;
                this.f17572c = oVar3;
                this.f17573d = oVar4;
                this.f17574e = oVar5;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Q6.o invoke(h addSideEffect, Object instance) {
                kotlin.jvm.internal.t.g(addSideEffect, "$this$addSideEffect");
                kotlin.jvm.internal.t.g(instance, "instance");
                a aVar = new a(this.f17570a, addSideEffect, instance, this.f17571b, this.f17572c, this.f17573d, this.f17574e);
                AbstractC1726i abstractC1726i = (AbstractC1726i) h.i(addSideEffect, new A5.a(AbstractC1726i.class, false, A5.b.d(), null), null, 2, null);
                abstractC1726i.a(aVar);
                return new b(abstractC1726i, aVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class E extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.r f17584a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public E(Q6.r rVar) {
                super(1);
                this.f17584a = rVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17584a.n(singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(M3.p.class, false, null, null), null), singleton.h(new A5.a(A3.p.class, false, null, null), null), singleton.h(new A5.a(T3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class F extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17585a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public F(Q6.o oVar) {
                super(1);
                this.f17585a = oVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17585a.invoke(singleton.h(new A5.a(T3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class G extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.p f17586a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public G(Q6.p pVar) {
                super(1);
                this.f17586a = pVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17586a.invoke(singleton.h(new A5.a(C3.f.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null), singleton.h(new A5.a(A3.n.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class H extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.p f17587a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public H(Q6.p pVar) {
                super(1);
                this.f17587a = pVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17587a.invoke(singleton.h(new A5.a(p017b7.J.class, false, null, null), null), singleton.h(new A5.a(N3.f.class, false, null, null), null), singleton.h(new A5.a(T3.a.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class I extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f17588a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public I(Function0 function0) {
                super(1);
                this.f17588a = function0;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17588a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class J extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.k f17589a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public J(Q6.k kVar) {
                super(1);
                this.f17589a = kVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17589a.invoke(singleton.h(new A5.a(p170t3.i.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class K extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.k f17590a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public K(Q6.k kVar) {
                super(1);
                this.f17590a = kVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17590a.invoke(singleton.h(new A5.a(Context.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class L extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17591a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public L(Q6.o oVar) {
                super(1);
                this.f17591a = oVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17591a.invoke(singleton.h(new A5.a(PermissionChecker.class, false, null, null), null), singleton.h(new A5.a(List.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class M extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f17592a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public M(Function0 function0) {
                super(1);
                this.f17592a = function0;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17592a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class N extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.p f17593a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public N(Q6.p pVar) {
                super(1);
                this.f17593a = pVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17593a.invoke(singleton.h(new A5.a(M3.p.class, false, null, null), null), singleton.h(new A5.a(A3.p.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class O extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.s f17594a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public O(Q6.s sVar) {
                super(1);
                this.f17594a = sVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17594a.j(singleton.h(new A5.a(M3.p.class, false, null, null), null), singleton.h(new A5.a(N3.f.class, false, null, null), null), singleton.h(new A5.a(G3.n.class, false, null, null), null), singleton.h(new A5.a(O3.b.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class P extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.k f17595a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public P(Q6.k kVar) {
                super(1);
                this.f17595a = kVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17595a.invoke(singleton.h(new A5.a(O3.d.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class Q extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.p f17596a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Q(Q6.p pVar) {
                super(1);
                this.f17596a = pVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17596a.invoke(singleton.h(new A5.a(M3.o.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class R extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.r f17597a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public R(Q6.r rVar) {
                super(1);
                this.f17597a = rVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17597a.n(singleton.h(new A5.a(M3.p.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(C3.f.class, false, null, null), null), singleton.h(new A5.a(G3.k.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class S extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.r f17598a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public S(Q6.r rVar) {
                super(1);
                this.f17598a = rVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17598a.n(singleton.h(new A5.a(Context.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(Purchases.class, false, null, null), null), singleton.h(new A5.a(R3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class T extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.r f17599a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public T(Q6.r rVar) {
                super(1);
                this.f17599a = rVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17599a.n(singleton.h(new A5.a(A3.n.class, false, null, null), null), singleton.h(new A5.a(R3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null), singleton.h(new A5.a(a.b.class, false, null, null), null), singleton.h(new A5.a(O3.b.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class U extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.q f17600a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public U(Q6.q qVar) {
                super(1);
                this.f17600a = qVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17600a.i(singleton.h(new A5.a(L3.c.class, false, null, null), null), singleton.h(new A5.a(a.b.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class V extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.q f17601a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public V(Q6.q qVar) {
                super(1);
                this.f17601a = qVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17601a.i(singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(M3.p.class, false, null, null), null), singleton.h(new A5.a(S3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class W extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.q f17602a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public W(Q6.q qVar) {
                super(1);
                this.f17602a = qVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return this.f17602a.i(singleton.h(new A5.a(T3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null), singleton.h(new A5.a(A3.n.class, false, null, null), null), singleton.h(new A5.a(Context.class, false, null, null), null));
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$a, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1835a extends C2639q implements Q6.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1835a f17603a = new C1835a();

            public C1835a() {
                super(4, e.class, "<init>", "<init>(Lcom/elgato/streamdeck/updateInfo/ElgatoAppStartPermissionProvider;Lcom/elgato/streamdeck/Values$Vendor;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.q
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final e i(L3.c p8, a.b p9, AppSettingsStore p10, p017b7.J p11) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                kotlin.jvm.internal.t.g(p11, "p3");
                return new e(p8, p9, p10, p11);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$b, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C1836b extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1836b f17604a = new C1836b();

            public C1836b() {
                super(2);
            }

            public final void b(h androidProcessLifecycle, e it) {
                kotlin.jvm.internal.t.g(androidProcessLifecycle, "$this$androidProcessLifecycle");
                kotlin.jvm.internal.t.g(it, "it");
                it.i();
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((h) obj, (e) obj2);
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$c, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1837c extends C2639q implements Q6.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1837c f17605a = new C1837c();

            public C1837c() {
                super(4, T3.a.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionHolder;Lcom/elgato/streamdeck/vsd2/purchase/IsProUser;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.q
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final T3.a i(AppSettingsStore p8, M3.p pVar, S3.a p9, p017b7.J p10) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(pVar, HRHLwtyqJWz.ZnR);
                kotlin.jvm.internal.t.g(p9, "p2");
                kotlin.jvm.internal.t.g(p10, "p3");
                return new T3.a(p8, pVar, p9, p10);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$d, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1838d extends C2639q implements Q6.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1838d f17606a = new C1838d();

            public C1838d() {
                super(4, C3.f.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/settings/DeviceSettingsEditor;Lkotlinx/coroutines/CoroutineScope;Lcom/elgato/streamdeck/purchase/PurchaseService;Landroid/content/Context;)V", 0);
            }

            @Override // Q6.q
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final C3.f i(T3.a p8, p017b7.J p9, A3.n p10, Context p11) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                kotlin.jvm.internal.t.g(p11, "p3");
                return new C3.f(p8, p9, p10, p11);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$e, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1839e extends C2639q implements Q6.r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1839e f17607a = new C1839e();

            public C1839e() {
                super(5, B3.i.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionHolder;Lcom/elgato/streamdeck/purchase/PurchaseViewModel;Lcom/elgato/streamdeck/vsd2/settings/DeviceSettingsEditor;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.r
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final B3.i n(AppSettingsStore p8, M3.p p9, A3.p p10, T3.a p11, p017b7.J p12) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                kotlin.jvm.internal.t.g(p11, "p3");
                kotlin.jvm.internal.t.g(p12, "p4");
                return new B3.i(p8, p9, p10, p11, p12);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$f, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1840f extends C2639q implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1840f f17608a = new C1840f();

            @Override // Q6.o
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final D3.e invoke(T3.a p8, p017b7.J p9) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                return new D3.e(p8, p9);
            }

            public C1840f() {
                super(2, D3.e.class, SVzBK.BcRfmLcuHk, "<init>(Lcom/elgato/streamdeck/vsd2/settings/DeviceSettingsEditor;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$g, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1841g extends C2639q implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1841g f17609a = new C1841g();

            public C1841g() {
                super(3, C3.l.class, "<init>", "<init>(Lcom/elgato/streamdeck/settings/faceplate/FaceplateManager;Lkotlinx/coroutines/CoroutineScope;Lcom/elgato/streamdeck/purchase/PurchaseService;)V", 0);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final C3.l invoke(C3.f p8, p017b7.J p9, A3.n p10) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                return new C3.l(p8, p9, p10);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$h, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1842h extends C2639q implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1842h f17610a = new C1842h();

            public C1842h() {
                super(3, N3.r.class, "<init>", "<init>(Lkotlinx/coroutines/CoroutineScope;Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService;Lcom/elgato/streamdeck/vsd2/settings/DeviceSettingsEditor;)V", 0);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final N3.r invoke(p017b7.J p8, N3.f p9, T3.a p10) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                return new N3.r(p8, p9, p10);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$i, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C1843i extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1843i f17611a = new C1843i();

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$i$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements G3.e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ h f17612a;

                public a(h hVar) {
                    this.f17612a = hVar;
                }

                @Override // G3.e
                public final Object a(G6.d dVar) {
                    return G3.g.a((Context) this.f17612a.h(new A5.a(Application.class, false, null, null), null), dVar);
                }
            }

            public C1843i() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final G3.e invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return new a(singleton);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$j, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1844j extends C2639q implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1844j f17613a = new C1844j();

            public C1844j() {
                super(0, p170t3.i.class, "<init>", "<init>()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final p170t3.i invoke() {
                return new p170t3.i();
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$k, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1845k extends C2639q implements Q6.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1845k f17614a = new C1845k();

            public C1845k() {
                super(6, p154r3.d.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionHolder;Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService;Lcom/elgato/streamdeck/system/SceneManager;Lcom/elgato/streamdeck/vsd2/errors/ErrorAlertViewModel;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.s
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final p154r3.d j(M3.p p8, N3.f p9, G3.n nVar, O3.b p10, AppSettingsStore p11, p017b7.J p12) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(nVar, GIGvBf.UnqC);
                kotlin.jvm.internal.t.g(p10, "p3");
                kotlin.jvm.internal.t.g(p11, "p4");
                kotlin.jvm.internal.t.g(p12, "p5");
                return new p154r3.d(p8, p9, nVar, p10, p11, p12);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$l, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1846l extends C2639q implements Q6.k {
            public C1846l(Object obj) {
                super(1, obj, t3.i.a.class, "createImageAnalyzer", "createImageAnalyzer(Lcom/elgato/streamdeck/discovery/qr_scanner/QrCodeAnalyzer;)Landroidx/camera/core/ImageAnalysis;", 0);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final A.S invoke(p170t3.i p8) {
                kotlin.jvm.internal.t.g(p8, "p0");
                return ((t3.i.a) this.receiver).a(p8);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$m, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1847m extends C2639q implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1847m f17615a = new C1847m();

            public C1847m() {
                super(1, G3.a.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final G3.a invoke(Context p8) {
                kotlin.jvm.internal.t.g(p8, "p0");
                return new G3.a(p8);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$n, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1848n extends C2639q implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1848n f17616a = new C1848n();

            @Override // Q6.o
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final PermissionRepository invoke(PermissionChecker p8, List p9) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                return new PermissionRepository(p8, p9);
            }

            public C1848n() {
                super(2, PermissionRepository.class, BmWxZhjGfw.zHYsZ, "<init>(Lcom/elgato/streamdeck/vsd2/PermissionChecker;Ljava/util/List;)V", 0);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$o, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C1849o extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1849o f17617a = new C1849o();

            public C1849o() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final N3.f invoke(h singleton) {
                kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                return new N3.f((N3.b) singleton.h(new A5.a(N3.b.class, false, null, null), null), (AppSettingsStore) singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), (M3.o) singleton.h(new A5.a(M3.o.class, false, null, null), null), (CryptoBox) singleton.h(new A5.a(CryptoBox.class, false, null, null), null), (M3.p) singleton.h(new A5.a(M3.p.class, false, null, null), null), ((p017b7.J) singleton.h(new A5.a(p017b7.J.class, false, null, null), null)).getCoroutineContext(), 0, 64, null);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$p, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1850p extends C2639q implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1850p f17618a = new C1850p();

            public C1850p() {
                super(0, G3.k.class, "<init>", "<init>()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final G3.k invoke() {
                return new G3.k();
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C1851q extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1851q f17619a = new C1851q();

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class a extends C2639q implements Q6.q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f17620a = new a();

                public a() {
                    super(4, N3.i.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lcom/elgato/streamdeck/vsd2/settings/DeviceSettingsEditor;Lkotlinx/coroutines/CoroutineScope;)V", 0);
                }

                @Override // Q6.q
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public final N3.i i(N3.f p8, AppSettingsStore p9, T3.a aVar, p017b7.J j8) {
                    kotlin.jvm.internal.t.g(p8, "p0");
                    kotlin.jvm.internal.t.g(p9, "p1");
                    kotlin.jvm.internal.t.g(aVar, cFAYKUlMj.vNBOaXRUdN);
                    kotlin.jvm.internal.t.g(j8, GIGvBf.CToMFVlHj);
                    return new N3.i(p8, p9, aVar, j8);
                }
            }

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class b extends C2639q implements Q6.q {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f17621a = new b();

                public b() {
                    super(4, p202x3.i.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionHolder;Lcom/elgato/streamdeck/purchase/PurchaseViewModel;Lkotlinx/coroutines/CoroutineScope;Lcom/elgato/streamdeck/settings/faceplate/FaceplateManager;)V", 0);
                }

                @Override // Q6.q
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public final p202x3.i i(M3.p p8, A3.p p9, p017b7.J p10, C3.f p11) {
                    kotlin.jvm.internal.t.g(p8, "p0");
                    kotlin.jvm.internal.t.g(p9, "p1");
                    kotlin.jvm.internal.t.g(p10, "p2");
                    kotlin.jvm.internal.t.g(p11, "p3");
                    return new p202x3.i(p8, p9, p10, p11);
                }
            }

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$c */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class c extends kotlin.jvm.internal.u implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f17622a = new c();

                public c() {
                    super(2);
                }

                public final void b(h onClose, p202x3.i it) {
                    kotlin.jvm.internal.t.g(onClose, "$this$onClose");
                    kotlin.jvm.internal.t.g(it, "it");
                    it.a();
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((h) obj, (p202x3.i) obj2);
                    return C6.G.f1419a;
                }
            }

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$d */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class d extends C2639q implements Q6.r {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final d f17623a = new d();

                public d() {
                    super(5, N3.m.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/PermissionRepository;Lcom/elgato/streamdeck/vsd2/discovery/ConnectionUrlSource;Lcom/elgato/streamdeck/vsd2/discovery/DiscoveryService;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lkotlinx/coroutines/CoroutineScope;)V", 0);
                }

                @Override // Q6.r
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public final N3.m n(PermissionRepository p8, N3.a p9, N3.f p10, AppSettingsStore p11, p017b7.J p12) {
                    kotlin.jvm.internal.t.g(p8, "p0");
                    kotlin.jvm.internal.t.g(p9, "p1");
                    kotlin.jvm.internal.t.g(p10, "p2");
                    kotlin.jvm.internal.t.g(p11, "p3");
                    kotlin.jvm.internal.t.g(p12, "p4");
                    return new N3.m(p8, p9, p10, p11, p12);
                }
            }

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$e */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class e extends kotlin.jvm.internal.u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.q f17624a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Q6.q qVar) {
                    super(1);
                    this.f17624a = qVar;
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(h singleton) {
                    kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                    return this.f17624a.i(singleton.h(new A5.a(N3.f.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(T3.a.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
                }
            }

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$f */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class f extends kotlin.jvm.internal.u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.q f17625a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(Q6.q qVar) {
                    super(1);
                    this.f17625a = qVar;
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(h singleton) {
                    kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                    return this.f17625a.i(singleton.h(new A5.a(M3.p.class, false, null, null), null), singleton.h(new A5.a(A3.p.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null), singleton.h(new A5.a(C3.f.class, false, null, null), null));
                }
            }

            /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$q$g */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class g extends kotlin.jvm.internal.u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.r f17626a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(Q6.r rVar) {
                    super(1);
                    this.f17626a = rVar;
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(h singleton) {
                    kotlin.jvm.internal.t.g(singleton, "$this$singleton");
                    return this.f17626a.n(singleton.h(new A5.a(PermissionRepository.class, false, null, null), null), singleton.h(new A5.a(N3.a.class, false, null, null), null), singleton.h(new A5.a(N3.f.class, false, null, null), null), singleton.h(new A5.a(AppSettingsStore.class, false, null, null), null), singleton.h(new A5.a(p017b7.J.class, false, null, null), null));
                }
            }

            public C1851q() {
                super(1);
            }

            public final void b(A5.c.a subcomponent) {
                kotlin.jvm.internal.t.g(subcomponent, "$this$subcomponent");
                DiKt.b(subcomponent, null, 1, null);
                ((F5.i) subcomponent.m(new F5.i(new A5.a(p202x3.i.class, false, null, null), new f(b.f17621a)))).g(c.f17622a);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((A5.c.a) obj);
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$r, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0418r extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0418r f17627a = new C0418r();

            public C0418r() {
                super(1);
            }

            public final void b(A5.c.a subcomponent) {
                kotlin.jvm.internal.t.g(subcomponent, "$this$subcomponent");
                DiKt.a(subcomponent, Z.c());
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((A5.c.a) obj);
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$s, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1852s extends C2639q implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1852s f17628a = new C1852s();

            public C1852s() {
                super(3, G3.f.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionHolder;Lcom/elgato/streamdeck/purchase/PurchaseViewModel;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final G3.f invoke(M3.p p8, A3.p p9, p017b7.J p10) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                return new G3.f(p8, p9, p10);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$t, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C1853t extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1853t f17629a = new C1853t();

            public C1853t() {
                super(2);
            }

            public final void b(h androidProcessLifecycle, p154r3.d it) {
                kotlin.jvm.internal.t.g(androidProcessLifecycle, "$this$androidProcessLifecycle");
                kotlin.jvm.internal.t.g(it, "it");
                it.k();
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((h) obj, (p154r3.d) obj2);
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$u, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C1854u extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1854u f17630a = new C1854u();

            public C1854u() {
                super(2);
            }

            public final void b(h androidProcessLifecycle, p154r3.d it) {
                kotlin.jvm.internal.t.g(androidProcessLifecycle, "$this$androidProcessLifecycle");
                kotlin.jvm.internal.t.g(it, "it");
                it.j();
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((h) obj, (p154r3.d) obj2);
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$v, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1855v extends C2639q implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1855v f17631a = new C1855v();

            public C1855v() {
                super(1, O3.b.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/errors/StringProvider;)V", 0);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final O3.b invoke(O3.d p8) {
                kotlin.jvm.internal.t.g(p8, "p0");
                return new O3.b(p8);
            }
        }

        /* JADX INFO: renamed from: com.elgato.streamdeck.DiKt$applicationComponent$1$r$w, reason: case insensitive filesystem */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C1856w extends C2639q implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1856w f17632a = new C1856w();

            public C1856w() {
                super(3, M3.p.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionFactory;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final M3.p invoke(M3.o p8, AppSettingsStore p9, p017b7.J p10) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                return new M3.p(p8, p9, p10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class x extends C2639q implements Q6.r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final x f17633a = new x();

            public x() {
                super(5, p202x3.g.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/connection/StreamDeckConnectionHolder;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lcom/elgato/streamdeck/settings/faceplate/FaceplateManager;Lcom/elgato/streamdeck/system/SceneIdentifier;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.r
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final p202x3.g n(M3.p p8, AppSettingsStore p9, C3.f p10, G3.k p11, p017b7.J p12) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                kotlin.jvm.internal.t.g(p11, "p3");
                kotlin.jvm.internal.t.g(p12, "p4");
                return new p202x3.g(p8, p9, p10, p11, p12);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class y extends C2639q implements Q6.r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final y f17634a = new y();

            public y() {
                super(5, A3.r.class, "<init>", "<init>(Landroid/content/Context;Lcom/elgato/streamdeck/vsd2/AppSettingsStore;Lcom/revenuecat/purchases/Purchases;Lcom/elgato/streamdeck/vsd2/network/IsOnline;Lkotlinx/coroutines/CoroutineScope;)V", 0);
            }

            @Override // Q6.r
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final A3.r n(Context p8, AppSettingsStore p9, Purchases p10, R3.a aVar, p017b7.J p11) {
                kotlin.jvm.internal.t.g(p8, "p0");
                kotlin.jvm.internal.t.g(p9, "p1");
                kotlin.jvm.internal.t.g(p10, "p2");
                kotlin.jvm.internal.t.g(aVar, SVzBK.QzHWfKaDXaPl);
                kotlin.jvm.internal.t.g(p11, "p4");
                return new A3.r(p8, p9, p10, aVar, p11);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class z extends kotlin.jvm.internal.u implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final z f17635a = new z();

            public z() {
                super(2);
            }

            public final void b(h androidProcessLifecycle, A3.r it) {
                kotlin.jvm.internal.t.g(androidProcessLifecycle, "$this$androidProcessLifecycle");
                kotlin.jvm.internal.t.g(it, "it");
                it.m();
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((h) obj, (A3.r) obj2);
                return C6.G.f1419a;
            }
        }

        public r() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws A5.q {
            b((A5.c.a) obj);
            return C6.G.f1419a;
        }

        public final void b(A5.c.a aVar) throws A5.q {
            kotlin.jvm.internal.t.g(aVar, BmWxZhjGfw.WWoXgZO);
            DiKt.b(aVar, null, 1, null);
            ((F5.i) aVar.m(new F5.i(new A5.a(p154r3.d.class, false, null, null), new O(C1845k.f17614a)))).d(new B(null, C1853t.f17629a, null, null, C1854u.f17630a));
            aVar.g((F5.i) aVar.m(new F5.i(new A5.a(p202x3.g.class, false, null, null), new R(x.f17633a))));
            aVar.g((F5.i) aVar.b(aVar.b((F5.i) aVar.m(new F5.i(new A5.a(A3.r.class, false, null, null), new S(y.f17634a))), new A5.a(A3.n.class, false, null, null)), new A5.a(S3.a.class, false, null, null))).d(new C(null, z.f17635a, null, null, null));
            aVar.g((F5.i) aVar.m(new F5.i(new A5.a(e.class, false, null, null), new U(C1835a.f17603a)))).d(new D(null, C1836b.f17604a, null, null, null));
            aVar.b((F5.i) aVar.m(new F5.i(new A5.a(p170t3.i.class, false, null, null), new I(C1844j.f17613a))), new A5.a(N3.a.class, false, null, null));
            aVar.b((F5.i) aVar.m(new F5.i(new A5.a(G3.a.class, false, null, null), new K(C1847m.f17615a))), new A5.a(PermissionChecker.class, false, null, null));
            aVar.m(new F5.g(new A5.a(List.class, false, null, null), C0937q.e(PermissionRepository.Permission.CAMERA)));
            aVar.g((F5.i) aVar.m(new F5.i(new A5.a(G3.k.class, false, null, null), new M(C1850p.f17618a))));
            A5.c.a.q(aVar, B5.c.b(), false, C1851q.f17619a, 2, null);
            A5.c.a.q(aVar, B5.c.a(), false, C0418r.f17627a, 2, null);
            aVar.g((F5.i) aVar.m(new F5.i(new A5.a(G3.f.class, false, null, null), new N(C1852s.f17628a))));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f17636a = new s();

        public s() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final M3.i invoke(h prototype) {
            kotlin.jvm.internal.t.g(prototype, "$this$prototype");
            return new IconDecompressorAndroid();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f17637a = new t();

        public t() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PackageManager invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return ((Context) singleton.h(new A5.a(Context.class, false, null, null), null)).getPackageManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f17638a = new u();

        public u() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.b invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return a.f17667a.a((Context) singleton.h(new A5.a(Context.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class v extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f17639a = new v();

        public v() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final X3.m invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new X3.m((Context) singleton.h(new A5.a(Context.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class w extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f17640a = new w();

        public w() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Y3.c invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new Y3.c(0L, 1, (AbstractC2633k) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class x extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f17641a = new x();

        public x() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class y extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f17642a = new y();

        public y() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H3.c invoke(h singleton) {
            kotlin.jvm.internal.t.g(singleton, "$this$singleton");
            return new H3.c((Y3.c) singleton.h(new A5.a(Y3.c.class, false, null, null), null), (J) singleton.h(new A5.a(J.class, false, null, null), null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class z implements C5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.o f17643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.o f17644b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityC1747j f17646b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Q6.o oVar, ActivityC1747j activityC1747j) {
                super(1);
                this.f17645a = oVar;
                this.f17646b = activityC1747j;
            }

            public final void b(A5.c.a createSubgraph) {
                kotlin.jvm.internal.t.g(createSubgraph, "$this$createSubgraph");
                Q6.o oVar = this.f17645a;
                if (oVar != null) {
                    oVar.invoke(createSubgraph, this.f17646b);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((A5.c.a) obj);
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActivityC1747j f17647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.o f17648b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ActivityC1747j activityC1747j, Q6.o oVar) {
                super(1);
                this.f17647a = activityC1747j;
                this.f17648b = oVar;
            }

            public final void b(A5.c.a createSubgraph) throws A5.q {
                kotlin.jvm.internal.t.g(createSubgraph, "$this$createSubgraph");
                ActivityC1747j activityC1747j = this.f17647a;
                createSubgraph.m(new F5.g(new A5.a(Context.class, false, null, null), activityC1747j));
                createSubgraph.m(new F5.g(new A5.a(Activity.class, false, null, null), activityC1747j));
                if (activityC1747j != null) {
                    createSubgraph.m(new F5.g(new A5.a(AbstractC1726i.class, false, null, null), activityC1747j.w()));
                    createSubgraph.m(new F5.g(new A5.a(AbstractC1727j.class, false, null, null), AbstractC1734q.a(activityC1747j)));
                }
                if (activityC1747j != null) {
                    createSubgraph.m(new F5.g(new A5.a(S.class, false, null, null), activityC1747j));
                    createSubgraph.m(new F5.g(new A5.a(Q.class, false, null, null), activityC1747j.k()));
                }
                if (activityC1747j != null) {
                    createSubgraph.m(new F5.g(new A5.a(p217z2.f.class, false, null, null), activityC1747j));
                    createSubgraph.m(new F5.g(new A5.a(p217z2.d.class, false, null, null), activityC1747j.l()));
                }
                if (activityC1747j != null) {
                    createSubgraph.m(new F5.g(new A5.a(p009b.F.class, false, null, null), activityC1747j));
                    createSubgraph.m(new F5.g(new A5.a(p009b.C.class, false, null, null), activityC1747j.b()));
                }
                if (activityC1747j != null && !A5.c.a.f(createSubgraph, new A5.a(ActivityC1747j.class, false, null, null), false, 2, null)) {
                    createSubgraph.m(new F5.g(new A5.a(ActivityC1747j.class, false, null, null), activityC1747j));
                }
                if (!A5.c.a.f(createSubgraph, new A5.a(MainActivity.class, false, null, null), false, 2, null)) {
                    createSubgraph.m(new F5.g(new A5.a(MainActivity.class, false, null, null), activityC1747j));
                }
                Q6.o oVar = this.f17648b;
                if (oVar != null) {
                    oVar.invoke(createSubgraph, this.f17647a);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws A5.q {
                b((A5.c.a) obj);
                return C6.G.f1419a;
            }
        }

        public z(Q6.o oVar, Q6.o oVar2) {
            this.f17643a = oVar;
            this.f17644b = oVar2;
        }

        @Override // C5.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h a(h graph, ActivityC1747j activity) throws Throwable {
            kotlin.jvm.internal.t.g(graph, "graph");
            kotlin.jvm.internal.t.g(activity, "activity");
            B5.d.a aVar = B5.d.f1209c;
            Q6.o oVar = this.f17643a;
            B5.d dVar = (B5.d) new P(activity).b(B5.d.class);
            h hVarE = dVar.e();
            if (hVarE == null) {
                hVarE = graph.c(B5.c.c(), new a(oVar, activity));
                dVar.f(hVarE);
            }
            h hVarC = hVarE.c(B5.c.a(), new b(activity, this.f17644b));
            AbstractC1726i abstractC1726iW = activity.w();
            kotlin.jvm.internal.t.f(abstractC1726iW, "<get-lifecycle>(...)");
            return B5.b.b(hVarC, abstractC1726iW, null, 2, null);
        }
    }

    public DiKt$applicationComponent$1() {
        super(1);
    }

    @Override // Q6.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws A5.q {
        b((A5.c.a) obj);
        return C6.G.f1419a;
    }

    public final void b(A5.c.a component) throws A5.q {
        kotlin.jvm.internal.t.g(component, "$this$component");
        final String str = null;
        component.m(new F5.g(new A5.a(C5.b.class, false, A5.k.a(K.b(MainActivity.class)), null), new z(null, null)));
        component.b((F5.i) component.m(new F5.i(new A5.a(CryptoBoxAndroid.class, false, null, null), new A(k.f17531a))), new A5.a(CryptoBox.class, false, null, null));
        component.b((F5.i) component.m(new F5.i(new A5.a(H3.c.class, false, null, null), y.f17642a)), new A5.a(V3.k.class, false, A5.k.b(toqHM.pGggZJZz), null));
        component.b((F5.i) component.m(new F5.i(new A5.a(H3.a.class, false, null, null), C1827a.f17519a)), new A5.a(V3.k.class, false, A5.k.b("sentry"), null));
        component.b((F5.i) component.m(new F5.i(new A5.a(p178u3.d.class, false, null, null), new B(C1831e.f17523a))), new A5.a(O3.d.class, false, null, null));
        component.g((F5.i) component.m(new F5.i(new A5.a(R3.a.class, false, null, null), new C(C1832f.f17524a))));
        component.g((F5.i) component.m(new F5.i(new A5.a(Purchases.class, false, null, null), C1834h.f17526a)));
        DiKt.b(component, null, 1, null);
        component.b((F5.i) component.m(new F5.i(new A5.a(G3.a.class, false, null, null), new E(o.f17537a))), new A5.a(PermissionChecker.class, false, null, null));
        component.b((F5.i) component.m(new F5.i(new A5.a(C3.i.class, false, null, null), new F(q.f17539a))), new A5.a(U3.a.class, false, null, null));
        A5.c.a.q(component, B5.c.c(), false, r.f17540a, 2, null);
    }
}
