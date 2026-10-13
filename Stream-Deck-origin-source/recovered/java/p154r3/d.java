package p154r3;

import C6.C0920i;
import C6.G;
import C6.q;
import C6.r;
import C6.v;
import G3.n;
import I6.l;
import M3.m;
import M3.p;
import P3.i;
import Q6.o;
import Z2.j;
import Z6.w;
import android.os.Bundle;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p017b7.J;
import p017b7.U;
import p017b7.X0;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f32378i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f32379j = j.f12858c.d("MainViewModel");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f32380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N3.f f32381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f32382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O3.b f32383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppSettingsStore f32384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f32385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f32386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f32387h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f32389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f32390c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32392e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f32390c = obj;
            this.f32392e |= Integer.MIN_VALUE;
            return d.this.i(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32394b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32396d;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f32394b = obj;
            this.f32396d |= Integer.MIN_VALUE;
            return d.this.o(this);
        }
    }

    /* JADX INFO: renamed from: r3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0718d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32397a;

        public C0718d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return d.this.new C0718d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0718d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32397a;
            if (i8 == 0) {
                r.b(obj);
                m mVarD = d.this.f32380a.d();
                if (mVarD == null) {
                    return null;
                }
                this.f32397a = 1;
                if (M3.n.e(mVarD, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32400b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32402d;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f32400b = obj;
            this.f32402d |= Integer.MIN_VALUE;
            return d.this.p(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32403a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1812u f32405c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f32406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1812u f32407b;

            /* JADX INFO: renamed from: r3.d$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0719a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f32408a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f32409b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f32410c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f32412e;

                public C0719a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f32410c = obj;
                    this.f32412e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(d dVar, InterfaceC1812u interfaceC1812u) {
                this.f32406a = dVar;
                this.f32407b = interfaceC1812u;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(p.b bVar, G6.d dVar) {
                C0719a c0719a;
                a aVar;
                if (dVar instanceof C0719a) {
                    c0719a = (C0719a) dVar;
                    int i8 = c0719a.f32412e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0719a.f32412e = i8 - Integer.MIN_VALUE;
                    } else {
                        c0719a = new C0719a(dVar);
                    }
                } else {
                    c0719a = new C0719a(dVar);
                }
                Object obj = c0719a.f32410c;
                Object objF = H6.c.f();
                int i9 = c0719a.f32412e;
                if (i9 == 0) {
                    r.b(obj);
                    if (t.c(bVar, p.b.C0197b.f5458a)) {
                        this.f32406a.f32381b.M();
                        if (!(this.f32406a.f32386g.getValue() instanceof p162s3.f)) {
                            this.f32406a.f32386g.setValue(new p162s3.f());
                        }
                        aVar = this;
                    } else {
                        if (!(this.f32406a.f32386g.getValue() instanceof p202x3.e)) {
                            this.f32406a.f32386g.setValue(new p202x3.e());
                        }
                        if (bVar instanceof p.b.e) {
                            c0719a.f32408a = this;
                            c0719a.f32409b = bVar;
                            c0719a.f32412e = 1;
                            if (U.a(250L, c0719a) == objF) {
                                return objF;
                            }
                            aVar = this;
                        } else {
                            aVar = this;
                        }
                        if (bVar instanceof p.b.a) {
                            p178u3.b.a(aVar.f32406a.f32383d, (p.b.a) bVar);
                        }
                    }
                    InterfaceC1812u interfaceC1812u = aVar.f32407b;
                    G g8 = G.f1419a;
                    interfaceC1812u.r1(g8);
                    return g8;
                }
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (p.b) c0719a.f32409b;
                aVar = (a) c0719a.f32408a;
                r.b(obj);
                aVar.f32406a.f32381b.P();
                if (bVar instanceof p.b.a) {
                    p178u3.b.a(aVar.f32406a.f32383d, (p.b.a) bVar);
                }
                InterfaceC1812u interfaceC1812u2 = aVar.f32407b;
                G g9 = G.f1419a;
                interfaceC1812u2.r1(g9);
                return g9;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC1812u interfaceC1812u, G6.d dVar) {
            super(2, dVar);
            this.f32405c = interfaceC1812u;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return d.this.new f(this.f32405c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32403a;
            if (i8 == 0) {
                r.b(obj);
                M mH = d.this.f32380a.h();
                a aVar = new a(d.this, this.f32405c);
                this.f32403a = 1;
                if (mH.collect(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            throw new C0920i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32413a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32415a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ boolean f32416b;

            public a(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(dVar);
                aVar.f32416b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            public final Object g(boolean z8, G6.d dVar) {
                return ((a) create(Boolean.valueOf(z8), dVar)).invokeSuspend(G.f1419a);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((Boolean) obj).booleanValue(), (G6.d) obj2);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f32415a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return I6.b.a(this.f32416b);
            }
        }

        public g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return d.this.new g(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r6.p(r5) == r0) goto L15;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32413a;
            if (i8 != 0) {
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            InterfaceC2260f interfaceC2260fF = p154r3.b.f(d.this.f32384e);
            a aVar = new a(null);
            this.f32413a = 1;
            if (AbstractC2262h.y(interfaceC2260fF, aVar, this) != objF) {
            }
            return objF;
            d dVar = d.this;
            this.f32413a = 2;
        }
    }

    public d(p connectionHolder, N3.f discoveryService, n sceneManager, O3.b errors, AppSettingsStore settings, J scope) {
        t.g(connectionHolder, "connectionHolder");
        t.g(discoveryService, "discoveryService");
        t.g(sceneManager, "sceneManager");
        t.g(errors, "errors");
        t.g(settings, "settings");
        t.g(scope, "scope");
        this.f32380a = connectionHolder;
        this.f32381b = discoveryService;
        this.f32382c = sceneManager;
        this.f32383d = errors;
        this.f32384e = settings;
        this.f32385f = scope;
        x xVarA = O.a(new p154r3.e());
        this.f32386g = xVarA;
        this.f32387h = AbstractC2262h.b(xVarA);
    }

    public static final Bundle n(d dVar) {
        m.C1038c c1038cJ;
        String strE;
        m mVarD = dVar.f32380a.d();
        if (mVarD == null || (c1038cJ = mVarD.J()) == null || (strE = c1038cJ.e()) == null) {
            return null;
        }
        String strM = c1038cJ.m();
        j jVar = f32379j;
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, "Saving instance state");
        }
        return P1.c.a(v.a("WorkstationID", strM), v.a("DeviceID", strE));
    }

    public final M h() {
        return this.f32387h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r2.p(r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Bundle bundle, G6.d dVar) {
        b bVar;
        d dVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f32392e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f32392e = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objX = bVar.f32390c;
        Object objF = H6.c.f();
        int i9 = bVar.f32392e;
        if (i9 != 0) {
            if (i9 == 1) {
                bundle = (Bundle) bVar.f32389b;
                dVar2 = (d) bVar.f32388a;
                r.b(objX);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objX);
            }
            return G.f1419a;
        }
        r.b(objX);
        InterfaceC2260f interfaceC2260fF = p154r3.b.f(this.f32384e);
        bVar.f32388a = this;
        bVar.f32389b = bundle;
        bVar.f32392e = 1;
        objX = AbstractC2262h.x(interfaceC2260fF, bVar);
        if (objX != objF) {
            dVar2 = this;
        }
        return objF;
        if (!((Boolean) objX).booleanValue()) {
            dVar2.q();
            return G.f1419a;
        }
        if (bundle != null) {
            dVar2.l(bundle);
        }
        bVar.f32388a = null;
        bVar.f32389b = null;
        bVar.f32392e = 2;
    }

    public final void j() {
        j jVar = f32379j;
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, "background");
        }
        this.f32381b.P();
        this.f32380a.o();
    }

    public final void k() {
        j jVar = f32379j;
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, "foreground");
        }
        if (this.f32387h.getValue() instanceof p162s3.f) {
            this.f32381b.M();
        }
        this.f32380a.n();
    }

    public final void l(Bundle bundle) {
        String string;
        Bundle bundle2 = bundle.getBundle("MainViewModel");
        if (bundle2 == null || (string = bundle2.getString("WorkstationID")) == null) {
            return;
        }
        if (w.b0(string)) {
            string = null;
        }
        if (string != null) {
            String strB = i.b(string);
            String string2 = bundle2.getString("DeviceID");
            if (string2 != null) {
                if (w.b0(string2)) {
                    string2 = null;
                }
                if (string2 != null) {
                    String strB2 = P3.b.b(string2);
                    j jVar = f32379j;
                    String strC = jVar.c();
                    Z2.p pVar = Z2.p.Debug;
                    if (jVar.a().a().compareTo(pVar) <= 0) {
                        jVar.b(pVar, strC, null, "Restoring from instance state (" + i.f(strB) + ", " + P3.b.f(strB2) + ")");
                    }
                    this.f32380a.j(strB, strB2);
                }
            }
        }
    }

    public final void m(Bundle outState) {
        t.g(outState, "outState");
        outState.putBundle("MainViewModel", n(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r8 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(G6.d dVar) {
        c cVar;
        d dVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f32396d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f32396d = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objK = cVar.f32394b;
        Object objF = H6.c.f();
        int i9 = cVar.f32396d;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    dVar2 = (d) cVar.f32393a;
                    r.b(objK);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(objK);
                }
                q.b((G) objK);
                return G.f1419a;
            }
            r.b(objK);
            if (this.f32382c.d()) {
                p pVar = this.f32380a;
                cVar.f32393a = this;
                cVar.f32396d = 1;
                objK = pVar.k(cVar);
                if (objK != objF) {
                    dVar2 = this;
                }
                return objF;
            }
            return G.f1419a;
            if (((Boolean) objK).booleanValue()) {
                q.a aVar = q.f1441b;
                p008a7.a.C0338a c0338a = p008a7.a.f13446b;
                long jS = p008a7.c.s(1, p008a7.d.SECONDS);
                C0718d c0718d = dVar2.new C0718d(null);
                cVar.f32393a = null;
                cVar.f32396d = 2;
                objK = X0.d(jS, c0718d, cVar);
            }
            return G.f1419a;
        } catch (Throwable th) {
            q.a aVar2 = q.f1441b;
            q.b(r.a(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r13.Q0(r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(G6.d dVar) {
        e eVar;
        d dVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f32402d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f32402d = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f32400b;
        Object objF = H6.c.f();
        int i9 = eVar.f32402d;
        if (i9 != 0) {
            if (i9 == 1) {
                dVar2 = (d) eVar.f32399a;
                r.b(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
        r.b(obj);
        j jVar = f32379j;
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, "Starting app flow");
        }
        eVar.f32399a = this;
        eVar.f32402d = 1;
        if (o(eVar) != objF) {
            dVar2 = this;
        }
        return objF;
        InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
        AbstractC1789i.d(dVar2.f32385f, null, null, dVar2.new f(interfaceC1812uB, null), 3, null);
        eVar.f32399a = null;
        eVar.f32402d = 2;
    }

    public final void q() {
        j jVar = f32379j;
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, "Starting onboarding flow");
        }
        if (!(this.f32386g.getValue() instanceof p154r3.e)) {
            this.f32386g.setValue(new p154r3.e());
        }
        AbstractC1789i.d(this.f32385f, null, null, new g(null), 3, null);
    }
}
