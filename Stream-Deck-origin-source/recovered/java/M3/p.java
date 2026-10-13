package M3;

import C6.G;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.B;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f5443l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Z2.j f5444m = Z2.j.f12858c.d("StreamDeckConnectionHolder");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f5445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppSettingsStore f5446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f5447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1815v0 f5448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f5449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f5450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f5451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f5452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC2260f f5453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2260f f5454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5455k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f5456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final M3.a f5457b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z8, M3.a reason) {
                super(null);
                kotlin.jvm.internal.t.g(reason, "reason");
                this.f5456a = z8;
                this.f5457b = reason;
            }

            public final M3.a a() {
                return this.f5457b;
            }

            public final boolean b() {
                return this.f5456a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f5456a == aVar.f5456a && kotlin.jvm.internal.t.c(this.f5457b, aVar.f5457b);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f5456a) * 31) + this.f5457b.hashCode();
            }

            public String toString() {
                return "Closed(wasConnected=" + this.f5456a + ", reason=" + this.f5457b + ")";
            }
        }

        /* JADX INFO: renamed from: M3.p$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0197b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0197b f5458a = new C0197b();

            public C0197b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0197b);
            }

            public int hashCode() {
                return 1562341827;
            }

            public String toString() {
                return "None";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f5459a = new c();

            public c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 653571884;
            }

            public String toString() {
                return "Pending";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f5461b;

            public /* synthetic */ d(String str, String str2, AbstractC2633k abstractC2633k) {
                this(str, str2);
            }

            public final String a() {
                return this.f5461b;
            }

            public final String b() {
                return this.f5460a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return P3.i.d(this.f5460a, dVar.f5460a) && P3.b.d(this.f5461b, dVar.f5461b);
            }

            public int hashCode() {
                return (P3.i.e(this.f5460a) * 31) + P3.b.e(this.f5461b);
            }

            public String toString() {
                return "Stopped(workstationID=" + P3.i.f(this.f5460a) + ", deviceID=" + P3.b.f(this.f5461b) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String workstationID, String deviceID) {
                super(null);
                kotlin.jvm.internal.t.g(workstationID, "workstationID");
                kotlin.jvm.internal.t.g(deviceID, "deviceID");
                this.f5460a = workstationID;
                this.f5461b = deviceID;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5462a;

            public /* synthetic */ e(String str, AbstractC2633k abstractC2633k) {
                this(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && P3.b.d(this.f5462a, ((e) obj).f5462a);
            }

            public int hashCode() {
                return P3.b.e(this.f5462a);
            }

            public String toString() {
                return "VirtualDeviceOpen(deviceID=" + P3.b.f(this.f5462a) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String deviceID) {
                super(null);
                kotlin.jvm.internal.t.g(deviceID, "deviceID");
                this.f5462a = deviceID;
            }
        }

        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5463a;

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return p.this.new c(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5463a;
            if (i8 == 0) {
                C6.r.b(obj);
                AppSettingsStore appSettingsStore = p.this.f5446b;
                this.f5463a = 1;
                if (appSettingsStore.m106updateLastOpenedDeviceID6V7edJQ(null, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            p.this.m(null);
            p.this.p(b.C0197b.f5458a);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f5466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f5467c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f5468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f5469b;

            /* JADX INFO: renamed from: M3.p$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0198a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f5470a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f5471b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f5472c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f5474e;

                public C0198a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5472c = obj;
                    this.f5474e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(m mVar, p pVar) {
                this.f5468a = mVar;
                this.f5469b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(M3.g gVar, G6.d dVar) {
                C0198a c0198a;
                String strG;
                a aVar;
                if (dVar instanceof C0198a) {
                    c0198a = (C0198a) dVar;
                    int i8 = c0198a.f5474e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0198a.f5474e = i8 - Integer.MIN_VALUE;
                    } else {
                        c0198a = new C0198a(dVar);
                    }
                } else {
                    c0198a = new C0198a(dVar);
                }
                Object obj = c0198a.f5472c;
                Object objF = H6.c.f();
                int i9 = c0198a.f5474e;
                AbstractC2633k abstractC2633k = null;
                if (i9 == 0) {
                    C6.r.b(obj);
                    if (gVar instanceof M3.g.C0186g) {
                        String strE = this.f5468a.J().e();
                        P3.b bVarA = strE != null ? P3.b.a(strE) : null;
                        if (bVarA == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        strG = bVarA.g();
                        AppSettingsStore appSettingsStore = this.f5469b.f5446b;
                        c0198a.f5470a = this;
                        c0198a.f5471b = strG;
                        c0198a.f5474e = 1;
                        if (appSettingsStore.m106updateLastOpenedDeviceID6V7edJQ(strG, c0198a) == objF) {
                            return objF;
                        }
                        aVar = this;
                    }
                    return G.f1419a;
                }
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strG = (String) c0198a.f5471b;
                aVar = (a) c0198a.f5470a;
                C6.r.b(obj);
                aVar.f5469b.p(new b.e(strG, abstractC2633k));
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m mVar, p pVar, G6.d dVar) {
            super(2, dVar);
            this.f5466b = mVar;
            this.f5467c = pVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new d(this.f5466b, this.f5467c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5465a;
            boolean z8 = true;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    InterfaceC2260f interfaceC2260fF = n.f(this.f5466b);
                    a aVar = new a(this.f5466b, this.f5467c);
                    this.f5465a = 1;
                    if (interfaceC2260fF.collect(aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
            } catch (M3.d.a e8) {
                p pVar = this.f5467c;
                List listB = this.f5466b.J().g().b();
                if (listB != null && listB.isEmpty()) {
                    z8 = false;
                    break;
                }
                Iterator it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        z8 = false;
                        break;
                    }
                } while (!(((M3.e.h) it.next()) instanceof M3.e.c));
                pVar.p(new b.a(z8, e8.a()));
                this.f5467c.m(null);
            } catch (CancellationException unused) {
                m.A(this.f5466b, null, 1, null);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5476b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5478d;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5476b = obj;
            this.f5478d |= Integer.MIN_VALUE;
            return p.this.k(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5481c;

        public f(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object obj, G6.d dVar) {
            f fVar = new f(dVar);
            fVar.f5480b = interfaceC2261g;
            fVar.f5481c = obj;
            return fVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2260f interfaceC2260fF;
            Object objF = H6.c.f();
            int i8 = this.f5479a;
            if (i8 == 0) {
                C6.r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f5480b;
                m mVar = (m) this.f5481c;
                if (mVar == null || (interfaceC2260fF = mVar.K()) == null) {
                    interfaceC2260fF = AbstractC2262h.F(null);
                }
                this.f5479a = 1;
                if (AbstractC2262h.u(interfaceC2261g, interfaceC2260fF, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f5485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(G6.d dVar, p pVar) {
            super(3, dVar);
            this.f5485d = pVar;
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object obj, G6.d dVar) {
            g gVar = new g(dVar, this.f5485d);
            gVar.f5483b = interfaceC2261g;
            gVar.f5484c = obj;
            return gVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5482a;
            if (i8 == 0) {
                C6.r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f5483b;
                InterfaceC2260f interfaceC2260fW = AbstractC2262h.w(this.f5485d.f5446b.m101getDeviceByIDqOAwsH0(((P3.b) this.f5484c).g()));
                this.f5482a = 1;
                if (AbstractC2262h.u(interfaceC2261g, interfaceC2260fW, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f5486a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f5487a;

            /* JADX INFO: renamed from: M3.p$h$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0199a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f5488a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5489b;

                public C0199a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5488a = obj;
                    this.f5489b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f5487a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0199a c0199a;
                if (dVar instanceof C0199a) {
                    c0199a = (C0199a) dVar;
                    int i8 = c0199a.f5489b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0199a.f5489b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0199a = new C0199a(dVar);
                    }
                } else {
                    c0199a = new C0199a(dVar);
                }
                Object obj2 = c0199a.f5488a;
                Object objF = H6.c.f();
                int i9 = c0199a.f5489b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f5487a;
                    m.C1038c c1038c = (m.C1038c) obj;
                    String strE = c1038c != null ? c1038c.e() : null;
                    P3.b bVarA = strE != null ? P3.b.a(strE) : null;
                    if (bVarA != null) {
                        c0199a.f5489b = 1;
                        if (interfaceC2261g.emit(bVarA, c0199a) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public h(InterfaceC2260f interfaceC2260f) {
            this.f5486a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f5486a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    public p(o connectionFactory, AppSettingsStore appSettingsStore, J scope) {
        kotlin.jvm.internal.t.g(connectionFactory, "connectionFactory");
        kotlin.jvm.internal.t.g(appSettingsStore, "appSettingsStore");
        kotlin.jvm.internal.t.g(scope, "scope");
        this.f5445a = connectionFactory;
        this.f5446b = appSettingsStore;
        this.f5447c = scope;
        x xVarA = O.a(b.C0197b.f5458a);
        this.f5449e = xVarA;
        this.f5450f = AbstractC2262h.b(xVarA);
        x xVarA2 = O.a(null);
        this.f5451g = xVarA2;
        M mB = AbstractC2262h.b(xVarA2);
        this.f5452h = mB;
        B bS = AbstractC2262h.S(AbstractC2262h.W(mB, new f(null)), scope, H.a.b(H.f20929a, 1000L, 0L, 2, null), 1);
        this.f5453i = bS;
        this.f5454j = AbstractC2262h.W(AbstractC2262h.p(new h(bS)), new g(null, this));
        this.f5455k = true;
    }

    public final void c() {
        AbstractC1789i.d(this.f5447c, null, null, new c(null), 3, null);
    }

    public final m d() {
        return (m) this.f5451g.getValue();
    }

    public final InterfaceC2260f e() {
        return this.f5453i;
    }

    public final InterfaceC2260f f() {
        return this.f5454j;
    }

    public final b g() {
        return (b) this.f5449e.getValue();
    }

    public final M h() {
        return this.f5450f;
    }

    public final InterfaceC1815v0 i(m mVar) {
        return AbstractC1789i.d(this.f5447c, null, null, new d(mVar, this, null), 3, null);
    }

    public final m j(String id, String deviceID) {
        kotlin.jvm.internal.t.g(id, "id");
        kotlin.jvm.internal.t.g(deviceID, "deviceID");
        m mVarD = d();
        String strL = mVarD != null ? mVarD.L() : null;
        if (strL == null ? false : P3.i.d(strL, id)) {
            String strE = mVarD.J().e();
            if (strE != null ? P3.b.d(strE, deviceID) : false) {
                return mVarD;
            }
        }
        m mVarA = this.f5445a.a(id, deviceID);
        m(mVarA);
        m mVarD2 = d();
        if (mVarD2 != null) {
            mVarD2.T();
        }
        return mVarA;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(G6.d dVar) {
        e eVar;
        p pVar;
        p pVar2;
        KnownHost.Device device;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f5478d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f5478d = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objX = eVar.f5476b;
        Object objF = H6.c.f();
        int i9 = eVar.f5478d;
        if (i9 != 0) {
            if (i9 == 1) {
                pVar = (p) eVar.f5475a;
                C6.r.b(objX);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar2 = (p) eVar.f5475a;
                C6.r.b(objX);
            }
            device = (KnownHost.Device) objX;
            if (device == null) {
                return I6.b.a(false);
            }
            pVar2.j(P3.f.k(device), P3.f.e(device));
            return I6.b.a(true);
        }
        C6.r.b(objX);
        if (d() != null) {
            return I6.b.a(true);
        }
        if (l()) {
            return I6.b.a(true);
        }
        if (!this.f5455k) {
            return I6.b.a(false);
        }
        this.f5455k = false;
        AppSettingsStore appSettingsStore = this.f5446b;
        eVar.f5475a = this;
        eVar.f5478d = 1;
        objX = appSettingsStore.get(eVar);
        if (objX != objF) {
            pVar = this;
        }
        return objF;
        String strB = P3.a.b((AppSettings) objX);
        if (strB == null) {
            return I6.b.a(false);
        }
        InterfaceC2260f interfaceC2260fM101getDeviceByIDqOAwsH0 = pVar.f5446b.m101getDeviceByIDqOAwsH0(strB);
        eVar.f5475a = pVar;
        eVar.f5478d = 2;
        objX = AbstractC2262h.x(interfaceC2260fM101getDeviceByIDqOAwsH0, eVar);
        if (objX != objF) {
            pVar2 = pVar;
            device = (KnownHost.Device) objX;
            if (device == null) {
                return I6.b.a(false);
            }
            pVar2.j(P3.f.k(device), P3.f.e(device));
            return I6.b.a(true);
        }
        return objF;
    }

    public final boolean l() {
        b bVarG = g();
        b.d dVar = bVarG instanceof b.d ? (b.d) bVarG : null;
        return (dVar != null ? j(dVar.b(), dVar.a()) : null) != null;
    }

    public final void m(m mVar) {
        if (mVar == ((m) this.f5451g.getValue())) {
            return;
        }
        InterfaceC1815v0 interfaceC1815v0 = this.f5448d;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.f5451g.setValue(mVar);
        Z2.j jVar = f5444m;
        String strL = mVar != null ? mVar.L() : null;
        String str = "Changing connection to " + (strL == null ? "null" : P3.i.f(strL));
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, str);
        }
        if (mVar == null) {
            if (g() instanceof b.d) {
                return;
            }
            p(b.C0197b.f5458a);
        } else {
            p(b.c.f5459a);
            mVar.W();
            this.f5448d = i(mVar);
        }
    }

    public final void n() {
        l();
    }

    public final void o() {
        String strE;
        m mVarD = d();
        AbstractC2633k abstractC2633k = null;
        if (mVarD != null && (strE = mVarD.J().e()) != null) {
            p(new b.d(mVarD.L(), strE, abstractC2633k));
        }
        m(null);
    }

    public final void p(b bVar) {
        if (kotlin.jvm.internal.t.c(this.f5449e.getValue(), bVar)) {
            return;
        }
        this.f5449e.setValue(bVar);
    }
}
