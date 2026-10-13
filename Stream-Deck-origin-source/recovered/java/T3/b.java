package T3;

import C6.G;
import C6.o;
import C6.r;
import C6.v;
import I6.l;
import M3.m;
import M3.p;
import P3.i;
import Q6.k;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements T3.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppSettingsStore f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3.a f9844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f9845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2260f f9846e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9847a = new a();

        public a() {
            super(1);
        }

        public final String b(m.C1038c c1038c) {
            if (c1038c != null) {
                return c1038c.e();
            }
            return null;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            String strB = b((m.C1038c) obj);
            if (strB != null) {
                return P3.b.a(strB);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: T3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0276b extends l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f9850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9851d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0276b(String str, G6.d dVar) {
            super(3, dVar);
            this.f9851d = str;
        }

        public final Object g(KnownHost knownHost, boolean z8, G6.d dVar) {
            C0276b c0276b = new C0276b(this.f9851d, dVar);
            c0276b.f9849b = knownHost;
            c0276b.f9850c = z8;
            return c0276b.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((KnownHost) obj, ((Boolean) obj2).booleanValue(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            H6.c.f();
            if (this.f9848a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            KnownHost knownHost = (KnownHost) this.f9849b;
            boolean z8 = this.f9850c;
            if (knownHost == null) {
                return null;
            }
            List<KnownHost.Device> devicesList = knownHost.getDevicesList();
            t.f(devicesList, "getDevicesList(...)");
            String str = this.f9851d;
            Iterator<T> it = devicesList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((KnownHost.Device) next).getRawID(), str));
            KnownHost.Device device = (KnownHost.Device) next;
            if (device == null) {
                return null;
            }
            return new T3.a.C0274a(knownHost, device, z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f9854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f9855d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G6.d dVar, b bVar) {
            super(3, dVar);
            this.f9855d = bVar;
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object obj, G6.d dVar) {
            c cVar = new c(dVar, this.f9855d);
            cVar.f9853b = interfaceC2261g;
            cVar.f9854c = obj;
            return cVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f9852a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f9853b;
                o oVar = (o) this.f9854c;
                i iVar = (i) oVar.a();
                String strG = iVar != null ? iVar.g() : null;
                P3.b bVar = (P3.b) oVar.b();
                String strG2 = bVar != null ? bVar.g() : null;
                InterfaceC2260f interfaceC2260fF = (strG == null || strG2 == null) ? AbstractC2262h.F(new T3.a.C0274a(null, null, false, 7, null)) : AbstractC2262h.w(AbstractC2262h.k(this.f9855d.f9842a.m103getKnownHostByIDjCyGMI4(strG), this.f9855d.f9844c.d(), new C0276b(strG2, null)));
                this.f9852a = 1;
                if (AbstractC2262h.u(interfaceC2261g, interfaceC2260fF, this) == objF) {
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
    public static final class d implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f9856a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f9857a;

            /* JADX INFO: renamed from: T3.b$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0277a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f9858a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f9859b;

                public C0277a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f9858a = obj;
                    this.f9859b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f9857a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0277a c0277a;
                if (dVar instanceof C0277a) {
                    c0277a = (C0277a) dVar;
                    int i8 = c0277a.f9859b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0277a.f9859b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0277a = new C0277a(dVar);
                    }
                } else {
                    c0277a = new C0277a(dVar);
                }
                Object obj2 = c0277a.f9858a;
                Object objF = H6.c.f();
                int i9 = c0277a.f9859b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f9857a;
                    m.C1038c c1038c = (m.C1038c) obj;
                    String strM = c1038c != null ? c1038c.m() : null;
                    i iVarA = strM != null ? i.a(strM) : null;
                    String strE = c1038c != null ? c1038c.e() : null;
                    o oVarA = v.a(iVarA, strE != null ? P3.b.a(strE) : null);
                    c0277a.f9859b = 1;
                    if (interfaceC2261g.emit(oVarA, c0277a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public d(InterfaceC2260f interfaceC2260f) {
            this.f9856a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f9856a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9861a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f9865e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a extends C2639q implements Q6.o {
            public a(Object obj) {
                super(2, obj, t.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/elgato/streamdeck/vsd2/KnownHost$Device;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Object invoke(KnownHost.Device device, G6.d dVar) {
                return e.k((k) this.receiver, device, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, k kVar, G6.d dVar) {
            super(2, dVar);
            this.f9863c = str;
            this.f9864d = str2;
            this.f9865e = kVar;
        }

        public static final /* synthetic */ Object k(k kVar, KnownHost.Device device, G6.d dVar) {
            return kVar.invoke(device);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return b.this.new e(this.f9863c, this.f9864d, this.f9865e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f9861a;
            if (i8 == 0) {
                r.b(obj);
                AppSettingsStore appSettingsStore = b.this.f9842a;
                String str = this.f9863c;
                String str2 = this.f9864d;
                a aVar = new a(this.f9865e);
                this.f9861a = 1;
                if (AppSettingsStore.m95createOrUpdateDeviceDUA0qnw$default(appSettingsStore, str, str2, null, aVar, this, 4, null) == objF) {
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

    public b(AppSettingsStore settingsStore, p connectionHolder, S3.a isProUser, J scope) {
        t.g(settingsStore, "settingsStore");
        t.g(connectionHolder, "connectionHolder");
        t.g(isProUser, "isProUser");
        t.g(scope, "scope");
        this.f9842a = settingsStore;
        this.f9843b = connectionHolder;
        this.f9844c = isProUser;
        this.f9845d = scope;
        this.f9846e = AbstractC2262h.W(new d(AbstractC2262h.q(connectionHolder.e(), a.f9847a)), new c(null, this));
    }

    @Override // T3.a.b
    public InterfaceC2260f a() {
        return this.f9846e;
    }

    @Override // T3.a.b
    public void b(k updater) {
        m.C1038c c1038cJ;
        String strE;
        t.g(updater, "updater");
        m mVarD = this.f9843b.d();
        if (mVarD != null) {
            String strL = mVarD.L();
            m mVarD2 = this.f9843b.d();
            if (mVarD2 == null || (c1038cJ = mVarD2.J()) == null || (strE = c1038cJ.e()) == null) {
                return;
            }
            AbstractC1789i.d(this.f9845d, null, null, new e(strL, strE, updater, null), 3, null);
        }
    }
}
