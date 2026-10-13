package p162s3;

import C6.G;
import C6.q;
import C6.r;
import D6.C0937q;
import D6.z;
import I6.h;
import I6.l;
import N3.p;
import P3.i;
import Q6.k;
import Q6.o;
import Z2.j;
import Z6.w;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.elgato.streamdeck.vsd2.Endpoint;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.J;
import p017b7.K;
import p035d7.v;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p098k7.d;
import p098k7.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NsdManager f33030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f33031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NsdManager nsdManager, b bVar) {
            super(1);
            this.f33030a = nsdManager;
            this.f33031b = bVar;
        }

        public final void b(Throwable th) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f33030a.stopServiceResolution(this.f33031b);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements NsdManager.ResolveListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f33032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NsdServiceInfo f33033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NsdManager f33034c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NsdManager f33035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f33036b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NsdManager nsdManager, b bVar) {
                super(1);
                this.f33035a = nsdManager;
                this.f33036b = bVar;
            }

            public final void b(Throwable it) {
                t.g(it, "it");
                if (Build.VERSION.SDK_INT >= 34) {
                    this.f33035a.stopServiceResolution(this.f33036b);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        public b(InterfaceC1795l interfaceC1795l, NsdServiceInfo nsdServiceInfo, NsdManager nsdManager) {
            this.f33032a = interfaceC1795l;
            this.f33033b = nsdServiceInfo;
            this.f33034c = nsdManager;
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo failedInfo, int i8) {
            t.g(failedInfo, "failedInfo");
            InterfaceC1795l interfaceC1795l = this.f33032a;
            q.a aVar = q.f1441b;
            interfaceC1795l.resumeWith(q.b(r.a(new l(i8, "Resolving of `" + this.f33033b.getServiceName() + "` failed."))));
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo info) {
            t.g(info, "info");
            this.f33032a.G(info, new a(this.f33034c, this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f33038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NsdManager f33039c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NsdManager f33040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f33041b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NsdManager nsdManager, b bVar) {
                super(0);
                this.f33040a = nsdManager;
                this.f33041b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m261invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m261invoke() {
                this.f33040a.stopServiceDiscovery(this.f33041b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements NsdManager.DiscoveryListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f33042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f33043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f33044c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ NsdManager f33045d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Map f33046e;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f33047a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f33048b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f33049c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ NsdManager f33050d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ NsdServiceInfo f33051e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ j f33052f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Map f33053g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ v f33054h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(d dVar, NsdManager nsdManager, NsdServiceInfo nsdServiceInfo, j jVar, Map map, v vVar, G6.d dVar2) {
                    super(2, dVar2);
                    this.f33049c = dVar;
                    this.f33050d = nsdManager;
                    this.f33051e = nsdServiceInfo;
                    this.f33052f = jVar;
                    this.f33053g = map;
                    this.f33054h = vVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    a aVar = new a(this.f33049c, this.f33050d, this.f33051e, this.f33052f, this.f33053g, this.f33054h, dVar);
                    aVar.f33048b = obj;
                    return aVar;
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0057 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:24:0x004f, B:26:0x0057, B:28:0x005a, B:30:0x0089, B:31:0x008d, B:14:0x0025, B:20:0x003e, B:17:0x0031), top: B:38:0x0008 }] */
                /* JADX WARN: Code duplicated, block: B:28:0x005a A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:24:0x004f, B:26:0x0057, B:28:0x005a, B:30:0x0089, B:31:0x008d, B:14:0x0025, B:20:0x003e, B:17:0x0031), top: B:38:0x0008 }] */
                /* JADX WARN: Code duplicated, block: B:30:0x0089 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:24:0x004f, B:26:0x0057, B:28:0x005a, B:30:0x0089, B:31:0x008d, B:14:0x0025, B:20:0x003e, B:17:0x0031), top: B:38:0x0008 }] */
                /* JADX WARN: Instruction removed from duplicated block: B:28:0x005a, please report this as an issue */
                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    J j8;
                    J j9;
                    p pVarA;
                    j jVar;
                    String str;
                    String strC;
                    Z2.p pVar;
                    Object objF = H6.c.f();
                    int i8 = this.f33047a;
                    try {
                        if (i8 == 0) {
                            r.b(obj);
                            j8 = (J) this.f33048b;
                            d dVar = this.f33049c;
                            this.f33048b = j8;
                            this.f33047a = 1;
                            if (dVar.d(this) == objF) {
                            }
                            return objF;
                        }
                        if (i8 == 1) {
                            J j10 = (J) this.f33048b;
                            r.b(obj);
                            j8 = j10;
                        } else {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j9 = (J) this.f33048b;
                            r.b(obj);
                        }
                        pVarA = m.a((NsdServiceInfo) obj);
                        if (pVarA == null) {
                            return G.f1419a;
                        }
                        this.f33049c.a();
                        K.g(j9);
                        jVar = this.f33052f;
                        str = "Host resolved: " + pVarA;
                        strC = jVar.c();
                        pVar = Z2.p.Debug;
                        if (jVar.a().a().compareTo(pVar) <= 0) {
                            jVar.b(pVar, strC, null, str);
                        }
                        this.f33053g.put(pVarA.d(), pVarA);
                        this.f33054h.m(z.R0(this.f33053g.values()));
                        return G.f1419a;
                        NsdManager nsdManager = this.f33050d;
                        NsdServiceInfo nsdServiceInfo = this.f33051e;
                        this.f33048b = j8;
                        this.f33047a = 2;
                        Object objD = m.d(nsdManager, nsdServiceInfo, this);
                        if (objD != objF) {
                            j9 = j8;
                            obj = objD;
                            pVarA = m.a((NsdServiceInfo) obj);
                            if (pVarA == null) {
                                return G.f1419a;
                            }
                            this.f33049c.a();
                            K.g(j9);
                            jVar = this.f33052f;
                            str = "Host resolved: " + pVarA;
                            strC = jVar.c();
                            pVar = Z2.p.Debug;
                            if (jVar.a().a().compareTo(pVar) <= 0) {
                                jVar.b(pVar, strC, null, str);
                            }
                            this.f33053g.put(pVarA.d(), pVarA);
                            this.f33054h.m(z.R0(this.f33053g.values()));
                            return G.f1419a;
                        }
                        return objF;
                    } catch (Throwable th) {
                        this.f33049c.a();
                        j jVar2 = this.f33052f;
                        String str2 = "Error resolving host " + this.f33051e.getServiceName();
                        String strC2 = jVar2.c();
                        Z2.p pVar2 = Z2.p.Error;
                        if (jVar2.a().a().compareTo(pVar2) <= 0) {
                            jVar2.b(pVar2, strC2, th, str2);
                        }
                    }
                }
            }

            public b(j jVar, v vVar, d dVar, NsdManager nsdManager, Map map) {
                this.f33042a = jVar;
                this.f33043b = vVar;
                this.f33044c = dVar;
                this.f33045d = nsdManager;
                this.f33046e = map;
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStarted(String serviceType) {
                t.g(serviceType, "serviceType");
                j jVar = this.f33042a;
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, "Started");
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStopped(String serviceTyep) {
                t.g(serviceTyep, "serviceTyep");
                j jVar = this.f33042a;
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, "Stopped");
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceFound(NsdServiceInfo info) {
                t.g(info, "info");
                j jVar = this.f33042a;
                String str = "Host found: " + info.getServiceName() + ". Trying to resolve...";
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                v vVar = this.f33043b;
                AbstractC1789i.d(vVar, null, null, new a(this.f33044c, this.f33045d, info, this.f33042a, this.f33046e, vVar, null), 3, null);
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceLost(NsdServiceInfo info) {
                t.g(info, "info");
                j jVar = this.f33042a;
                String str = "Host lost: " + info.getServiceName();
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                if (this.f33046e.remove(info.getServiceName()) != null) {
                    this.f33043b.m(z.R0(this.f33046e.values()));
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStartDiscoveryFailed(String serviceType, int i8) {
                t.g(serviceType, "serviceType");
                j jVar = this.f33042a;
                String str = "Starting failed with code " + i8;
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Error;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                this.f33043b.d(new l(i8, "Starting failed"));
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStopDiscoveryFailed(String serviceType, int i8) {
                t.g(serviceType, "serviceType");
                j jVar = this.f33042a;
                String str = "Stopping failed with code " + i8;
                String strC = jVar.c();
                Z2.p pVar = Z2.p.Error;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                this.f33043b.d(new l(i8, "Stopping failed"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NsdManager nsdManager, G6.d dVar) {
            super(2, dVar);
            this.f33039c = nsdManager;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f33039c, dVar);
            cVar.f33038b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, G6.d dVar) {
            return ((c) create(vVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f33037a;
            if (i8 == 0) {
                r.b(obj);
                v vVar = (v) this.f33038b;
                b bVar = new b(j.f12858c.d("BonjourDiscovery"), vVar, f.b(1, 0, 2, null), this.f33039c, new LinkedHashMap());
                this.f33039c.discoverServices("_vstreamdeck2._tcp", 1, bVar);
                a aVar = new a(this.f33039c, bVar);
                this.f33037a = 1;
                if (p035d7.t.a(vVar, aVar, this) == objF) {
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

    public static final p a(NsdServiceInfo nsdServiceInfo) {
        String hostAddress;
        List listE;
        Endpoint endpoint;
        t.g(nsdServiceInfo, "<this>");
        String strC = c(nsdServiceInfo);
        if (strC == null) {
            return null;
        }
        String serviceName = nsdServiceInfo.getServiceName();
        if (serviceName == null || w.b0(serviceName)) {
            serviceName = null;
        }
        if (serviceName == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            List<InetAddress> hostAddresses = nsdServiceInfo.getHostAddresses();
            t.f(hostAddresses, "getHostAddresses(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : hostAddresses) {
                if (((InetAddress) obj).isSiteLocalAddress()) {
                    arrayList.add(obj);
                }
            }
            listE = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String hostAddress2 = ((InetAddress) it.next()).getHostAddress();
                if (hostAddress2 != null) {
                    t.d(hostAddress2);
                    endpoint = (Endpoint) Endpoint.newBuilder().setHost(hostAddress2).setPort(nsdServiceInfo.getPort()).setSource(Endpoint.Source.BONJOUR).build();
                } else {
                    endpoint = null;
                }
                if (endpoint != null) {
                    listE.add(endpoint);
                }
            }
            if (listE.isEmpty()) {
                listE = null;
            }
            if (listE == null) {
                return null;
            }
        } else {
            InetAddress host = nsdServiceInfo.getHost();
            if (!host.isSiteLocalAddress()) {
                host = null;
            }
            if (host == null || (hostAddress = host.getHostAddress()) == null || (listE = C0937q.e(Endpoint.newBuilder().setHost(hostAddress).setPort(nsdServiceInfo.getPort()).setSource(Endpoint.Source.BONJOUR).build())) == null) {
                return null;
            }
        }
        return new p(strC, serviceName, listE, null);
    }

    public static final InterfaceC2260f b(NsdManager nsdManager) {
        t.g(nsdManager, "<this>");
        return AbstractC2262h.e(new c(nsdManager, null));
    }

    public static final String c(NsdServiceInfo nsdServiceInfo) {
        t.g(nsdServiceInfo, "<this>");
        byte[] bArr = nsdServiceInfo.getAttributes().get("VSDSV");
        if (bArr != null) {
            if (bArr.length == 0) {
                bArr = null;
            }
            if (bArr != null) {
                return i.b(new String(bArr, Z6.c.f12941b));
            }
        }
        return null;
    }

    public static final Object d(NsdManager nsdManager, NsdServiceInfo nsdServiceInfo, G6.d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        b bVar = new b(c1797m, nsdServiceInfo, nsdManager);
        nsdManager.resolveService(nsdServiceInfo, bVar);
        c1797m.J(new a(nsdManager, bVar));
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS;
    }
}
