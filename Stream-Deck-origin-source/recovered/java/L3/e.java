package L3;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import Z2.j;
import Z2.p;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.AppUpdates;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L3.c f4978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.elgato.streamdeck.a.b f4979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppSettingsStore f4980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f4981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f4982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f4983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f4984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1815v0 f4985h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L3.b f4994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f4995c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f4996a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppUpdates invoke(AppUpdates it) {
                t.g(it, "it");
                GeneratedMessageLite generatedMessageLiteBuild = ((AppUpdates.Builder) it.toBuilder()).setShownOutdatedSDKVersionAlertDate(System.currentTimeMillis()).build();
                t.f(generatedMessageLiteBuild, "build(...)");
                return (AppUpdates) generatedMessageLiteBuild;
            }
        }

        /* JADX INFO: renamed from: L3.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0178b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0178b f4997a = new C0178b();

            public C0178b() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppUpdates invoke(AppUpdates it) {
                t.g(it, "it");
                GeneratedMessageLite generatedMessageLiteBuild = ((AppUpdates.Builder) it.toBuilder()).setShownAppUpdateAvailableAlertDate(System.currentTimeMillis()).build();
                t.f(generatedMessageLiteBuild, "build(...)");
                return (AppUpdates) generatedMessageLiteBuild;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L3.b bVar, e eVar, G6.d dVar) {
            super(2, dVar);
            this.f4994b = bVar;
            this.f4995c = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new b(this.f4994b, this.f4995c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5.createOrUpdateAppUpdates(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            if (r5.createOrUpdateAppUpdates(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            return r0;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f4993a;
            if (i8 == 0) {
                r.b(obj);
                L3.b bVar = this.f4994b;
                if (bVar instanceof L3.b.C0176b) {
                    AppSettingsStore appSettingsStore = this.f4995c.f4980c;
                    a aVar = a.f4996a;
                    this.f4993a = 1;
                } else if (bVar instanceof L3.b.c) {
                    AppSettingsStore appSettingsStore2 = this.f4995c.f4980c;
                    C0178b c0178b = C0178b.f4997a;
                    this.f4993a = 2;
                }
            } else {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L3.b f4999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f5000c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L3.b f5001a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L3.b bVar) {
                super(1);
                this.f5001a = bVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppUpdates invoke(AppUpdates it) {
                t.g(it, "it");
                GeneratedMessageLite generatedMessageLiteBuild = ((AppUpdates.Builder) it.toBuilder()).setHideOutdatedSDKVersionAlert(((L3.b.C0176b) this.f5001a).a()).build();
                t.f(generatedMessageLiteBuild, "build(...)");
                return (AppUpdates) generatedMessageLiteBuild;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(L3.b bVar, e eVar, G6.d dVar) {
            super(2, dVar);
            this.f4999b = bVar;
            this.f5000c = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new c(this.f4999b, this.f5000c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f4998a;
            if (i8 == 0) {
                r.b(obj);
                if (this.f4999b instanceof L3.b.C0176b) {
                    AppSettingsStore appSettingsStore = this.f5000c.f4980c;
                    a aVar = new a(this.f4999b);
                    this.f4998a = 1;
                    if (appSettingsStore.createOrUpdateAppUpdates(aVar, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5002a;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return e.this.new d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5002a;
            if (i8 == 0) {
                r.b(obj);
                e eVar = e.this;
                this.f5002a = 1;
                if (eVar.k(this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: L3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0179e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5005b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5007d;

        public C0179e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5005b = obj;
            this.f5007d |= Integer.MIN_VALUE;
            return e.this.j(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5011d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5013f;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5011d = obj;
            this.f5013f |= Integer.MIN_VALUE;
            return e.this.k(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class g extends C2639q implements Function0 {
        public g(Object obj) {
            super(0, obj, e.class, "dismiss", "dismiss()V", 0);
        }

        public final void h() {
            ((e) this.receiver).f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class h extends C2639q implements Function0 {
        public h(Object obj) {
            super(0, obj, e.class, "doNotShowAgain", "doNotShowAgain()V", 0);
        }

        public final void h() {
            ((e) this.receiver).g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    public e(L3.c permissionProvider, com.elgato.streamdeck.a.b vendor, AppSettingsStore store, J scope) {
        t.g(permissionProvider, "permissionProvider");
        t.g(vendor, "vendor");
        t.g(store, "store");
        t.g(scope, "scope");
        this.f4978a = permissionProvider;
        this.f4979b = vendor;
        this.f4980c = store;
        this.f4981d = scope;
        x xVarA = O.a(new a(null, vendor, false, null, null, 29, null));
        this.f4982e = xVarA;
        this.f4983f = AbstractC2262h.b(xVarA);
        this.f4984g = j.f12858c.d("ElgatoUpdateInfo");
    }

    public final void f() {
        L3.b bVarE;
        a aVar = (a) this.f4982e.getValue();
        if (aVar.f() && (bVarE = aVar.e()) != null) {
            if (bVarE instanceof L3.b.d) {
                bVarE = null;
            }
            if (bVarE != null) {
                x xVar = this.f4982e;
                xVar.setValue(a.b((a) xVar.getValue(), null, null, false, null, null, 27, null));
                AbstractC1789i.d(this.f4981d, null, null, new b(bVarE, this, null), 3, null);
            }
        }
    }

    public final void g() {
        L3.b bVarE;
        a aVar = (a) this.f4982e.getValue();
        if (aVar.f() && (bVarE = aVar.e()) != null) {
            if (bVarE instanceof L3.b.d) {
                bVarE = null;
            }
            if (bVarE != null) {
                x xVar = this.f4982e;
                xVar.setValue(a.b((a) xVar.getValue(), null, null, false, null, null, 27, null));
                AbstractC1789i.d(this.f4981d, null, null, new c(bVarE, this, null), 3, null);
            }
        }
    }

    public final M h() {
        return this.f4983f;
    }

    public final void i() {
        InterfaceC1815v0 interfaceC1815v0 = this.f4985h;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.f4985h = AbstractC1789i.d(this.f4981d, null, null, new d(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(L3.b bVar, G6.d dVar) {
        C0179e c0179e;
        if (dVar instanceof C0179e) {
            c0179e = (C0179e) dVar;
            int i8 = c0179e.f5007d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0179e.f5007d = i8 - Integer.MIN_VALUE;
            } else {
                c0179e = new C0179e(dVar);
            }
        } else {
            c0179e = new C0179e(dVar);
        }
        Object obj = c0179e.f5005b;
        Object objF = H6.c.f();
        int i9 = c0179e.f5007d;
        boolean z8 = true;
        if (i9 == 0) {
            r.b(obj);
            AppSettingsStore appSettingsStore = this.f4980c;
            c0179e.f5004a = bVar;
            c0179e.f5007d = 1;
            obj = appSettingsStore.get(c0179e);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (L3.b) c0179e.f5004a;
            r.b(obj);
        }
        AppUpdates appUpdates = ((AppSettings) obj).getAppUpdates();
        if (bVar instanceof L3.b.C0176b) {
            if (appUpdates.hasHideOutdatedSDKVersionAlert()) {
                z8 = false;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - appUpdates.getShownOutdatedSDKVersionAlertDate();
                p008a7.a.C0338a c0338a = p008a7.a.f13446b;
                if (jCurrentTimeMillis < p008a7.a.z(p008a7.c.s(1, p008a7.d.DAYS))) {
                    z8 = false;
                }
            }
        } else if (!(bVar instanceof L3.b.d)) {
            if (bVar instanceof L3.b.c) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - appUpdates.getShownAppUpdateAvailableAlertDate();
                p008a7.a.C0338a c0338a2 = p008a7.a.f13446b;
                if (jCurrentTimeMillis2 < p008a7.a.z(p008a7.c.s(1, p008a7.d.DAYS))) {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
        }
        return I6.b.a(z8);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(G6.d dVar) {
        f fVar;
        e eVar;
        L3.b bVar;
        L3.b bVar2;
        e eVar2;
        AppUpdates appUpdates;
        e eVar3;
        x xVar;
        Object objJ;
        L3.b bVar3;
        e eVar4;
        x xVar2;
        j jVar;
        String str;
        String strC;
        p pVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f5013f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f5013f = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objA = fVar.f5011d;
        Object objF = H6.c.f();
        int i9 = fVar.f5013f;
        if (i9 == 0) {
            r.b(objA);
            L3.c cVar = this.f4978a;
            fVar.f5008a = this;
            fVar.f5013f = 1;
            objA = cVar.a(fVar);
            if (objA != objF) {
                eVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            eVar = (e) fVar.f5008a;
            r.b(objA);
        } else {
            if (i9 == 2) {
                bVar2 = (L3.b) fVar.f5009b;
                eVar2 = (e) fVar.f5008a;
                r.b(objA);
                appUpdates = ((AppSettings) objA).getAppUpdates();
                if (appUpdates.hasHideOutdatedSDKVersionAlert() || appUpdates.getHideOutdatedSDKVersionAlert() == ((L3.b.C0176b) bVar2).a()) {
                    bVar = bVar2;
                    eVar = eVar2;
                    xVar = eVar.f4982e;
                    fVar.f5008a = eVar;
                    fVar.f5009b = bVar;
                    fVar.f5010c = xVar;
                    fVar.f5013f = 4;
                    objJ = eVar.j(bVar, fVar);
                    if (objJ != objF) {
                        bVar3 = bVar;
                        objA = objJ;
                        eVar4 = eVar;
                        xVar2 = xVar;
                    }
                } else {
                    AppSettingsStore appSettingsStore = eVar2.f4980c;
                    fVar.f5008a = eVar2;
                    fVar.f5009b = bVar2;
                    fVar.f5013f = 3;
                    if (appSettingsStore.clearAppUpdates(fVar) != objF) {
                        eVar3 = eVar2;
                        bVar = bVar2;
                        eVar = eVar3;
                        xVar = eVar.f4982e;
                        fVar.f5008a = eVar;
                        fVar.f5009b = bVar;
                        fVar.f5010c = xVar;
                        fVar.f5013f = 4;
                        objJ = eVar.j(bVar, fVar);
                        if (objJ != objF) {
                            bVar3 = bVar;
                            objA = objJ;
                            eVar4 = eVar;
                            xVar2 = xVar;
                        }
                    }
                }
                return objF;
            }
            if (i9 == 3) {
                bVar2 = (L3.b) fVar.f5009b;
                eVar3 = (e) fVar.f5008a;
                r.b(objA);
                bVar = bVar2;
                eVar = eVar3;
                xVar = eVar.f4982e;
                fVar.f5008a = eVar;
                fVar.f5009b = bVar;
                fVar.f5010c = xVar;
                fVar.f5013f = 4;
                objJ = eVar.j(bVar, fVar);
                if (objJ != objF) {
                    bVar3 = bVar;
                    objA = objJ;
                    eVar4 = eVar;
                    xVar2 = xVar;
                }
                return objF;
            }
            if (i9 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar2 = (x) fVar.f5010c;
            L3.b bVar4 = (L3.b) fVar.f5009b;
            eVar4 = (e) fVar.f5008a;
            r.b(objA);
            bVar3 = bVar4;
        }
        xVar2.setValue(new a(bVar3, eVar4.f4979b, ((Boolean) objA).booleanValue(), new g(eVar4), new h(eVar4)));
        jVar = eVar4.f4984g;
        str = "App start permission set to " + bVar3;
        strC = jVar.c();
        pVar = p.Info;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, str);
        }
        return G.f1419a;
        bVar = (L3.b) objA;
        if (bVar instanceof L3.b.C0176b) {
            AppSettingsStore appSettingsStore2 = eVar.f4980c;
            fVar.f5008a = eVar;
            fVar.f5009b = bVar;
            fVar.f5013f = 2;
            Object obj = appSettingsStore2.get(fVar);
            if (obj != objF) {
                e eVar5 = eVar;
                bVar2 = bVar;
                objA = obj;
                eVar2 = eVar5;
                appUpdates = ((AppSettings) objA).getAppUpdates();
                if (appUpdates.hasHideOutdatedSDKVersionAlert()) {
                }
                bVar = bVar2;
                eVar = eVar2;
                xVar = eVar.f4982e;
                fVar.f5008a = eVar;
                fVar.f5009b = bVar;
                fVar.f5010c = xVar;
                fVar.f5013f = 4;
                objJ = eVar.j(bVar, fVar);
                if (objJ != objF) {
                    bVar3 = bVar;
                    objA = objJ;
                    eVar4 = eVar;
                    xVar2 = xVar;
                    xVar2.setValue(new a(bVar3, eVar4.f4979b, ((Boolean) objA).booleanValue(), new g(eVar4), new h(eVar4)));
                    jVar = eVar4.f4984g;
                    str = "App start permission set to " + bVar3;
                    strC = jVar.c();
                    pVar = p.Info;
                    if (jVar.a().a().compareTo(pVar) <= 0) {
                        jVar.b(pVar, strC, null, str);
                    }
                    return G.f1419a;
                }
            }
        } else {
            xVar = eVar.f4982e;
            fVar.f5008a = eVar;
            fVar.f5009b = bVar;
            fVar.f5010c = xVar;
            fVar.f5013f = 4;
            objJ = eVar.j(bVar, fVar);
            if (objJ != objF) {
                bVar3 = bVar;
                objA = objJ;
                eVar4 = eVar;
                xVar2 = xVar;
                xVar2.setValue(new a(bVar3, eVar4.f4979b, ((Boolean) objA).booleanValue(), new g(eVar4), new h(eVar4)));
                jVar = eVar4.f4984g;
                str = "App start permission set to " + bVar3;
                strC = jVar.c();
                pVar = p.Info;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                return G.f1419a;
            }
        }
        return objF;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L3.b f4986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.elgato.streamdeck.a.b f4987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function0 f4989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Function0 f4990e;

        /* JADX INFO: renamed from: L3.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0177a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0177a f4991a = new C0177a();

            public C0177a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m69invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m69invoke() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f4992a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m70invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m70invoke() {
            }
        }

        public a(L3.b bVar, com.elgato.streamdeck.a.b vendor, boolean z8, Function0 dismiss, Function0 doNotShowAgain) {
            t.g(vendor, "vendor");
            t.g(dismiss, "dismiss");
            t.g(doNotShowAgain, "doNotShowAgain");
            this.f4986a = bVar;
            this.f4987b = vendor;
            this.f4988c = z8;
            this.f4989d = dismiss;
            this.f4990e = doNotShowAgain;
        }

        public static /* synthetic */ a b(a aVar, L3.b bVar, com.elgato.streamdeck.a.b bVar2, boolean z8, Function0 function0, Function0 function1, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                bVar = aVar.f4986a;
            }
            if ((i8 & 2) != 0) {
                bVar2 = aVar.f4987b;
            }
            if ((i8 & 4) != 0) {
                z8 = aVar.f4988c;
            }
            if ((i8 & 8) != 0) {
                function0 = aVar.f4989d;
            }
            if ((i8 & 16) != 0) {
                function1 = aVar.f4990e;
            }
            Function0 function2 = function1;
            boolean z9 = z8;
            return aVar.a(bVar, bVar2, z9, function0, function2);
        }

        public final a a(L3.b bVar, com.elgato.streamdeck.a.b vendor, boolean z8, Function0 dismiss, Function0 doNotShowAgain) {
            t.g(vendor, "vendor");
            t.g(dismiss, "dismiss");
            t.g(doNotShowAgain, "doNotShowAgain");
            return new a(bVar, vendor, z8, dismiss, doNotShowAgain);
        }

        public final Function0 c() {
            return this.f4989d;
        }

        public final Function0 d() {
            return this.f4990e;
        }

        public final L3.b e() {
            return this.f4986a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f4986a, aVar.f4986a) && this.f4987b == aVar.f4987b && this.f4988c == aVar.f4988c && t.c(this.f4989d, aVar.f4989d) && t.c(this.f4990e, aVar.f4990e);
        }

        public final boolean f() {
            return this.f4988c;
        }

        public final com.elgato.streamdeck.a.b g() {
            return this.f4987b;
        }

        public int hashCode() {
            L3.b bVar = this.f4986a;
            return ((((((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.f4987b.hashCode()) * 31) + Boolean.hashCode(this.f4988c)) * 31) + this.f4989d.hashCode()) * 31) + this.f4990e.hashCode();
        }

        public String toString() {
            return "ViewState(permission=" + this.f4986a + ", vendor=" + this.f4987b + ", showDialog=" + this.f4988c + ", dismiss=" + this.f4989d + ", doNotShowAgain=" + this.f4990e + ")";
        }

        public /* synthetic */ a(L3.b bVar, com.elgato.streamdeck.a.b bVar2, boolean z8, Function0 function0, Function0 function1, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? null : bVar, bVar2, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? C0177a.f4991a : function0, (i8 & 16) != 0 ? b.f4992a : function1);
        }
    }
}
