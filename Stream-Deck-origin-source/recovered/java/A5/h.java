package A5;

import C6.G;
import P2.Lsk.mHPawN;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p063h.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f831a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {

        /* JADX INFO: renamed from: A5.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0020a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0020a f832a = new C0020a();

            public C0020a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0020a);
            }

            public int hashCode() {
                return -985311723;
            }

            public String toString() {
                return "Closed";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final h f835c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final p f836d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final E5.b f837e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final l f838f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Q6.k f839g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Map f840h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f841i;

            public final p a() {
                return this.f836d;
            }

            public final c b() {
                return this.f834b;
            }

            public final Q6.k c() {
                return this.f839g;
            }

            public final h d() {
                return this.f835c;
            }

            public final E5.b e() {
                return this.f837e;
            }

            public final Map f() {
                return this.f840h;
            }

            public final l g() {
                return this.f838f;
            }

            public final boolean h() {
                return this.f841i;
            }

            public final void i(boolean z8) {
                this.f841i = z8;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h graph, c cVar, h hVar, p application, E5.b plugins, l serviceEvaluator, Q6.k kVar) {
                super(null);
                t.g(graph, "graph");
                t.g(cVar, mHPawN.InaPugzhCi);
                t.g(application, "application");
                t.g(plugins, "plugins");
                t.g(serviceEvaluator, "serviceEvaluator");
                this.f833a = graph;
                this.f834b = cVar;
                this.f835c = hVar;
                this.f836d = application;
                this.f837e = plugins;
                this.f838f = serviceEvaluator;
                this.f839g = kVar;
                HashMap map = new HashMap();
                this.f840h = map;
                map.put(i.f846b, new F5.g(i.f846b, graph));
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E5.b f843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Q6.k kVar, E5.b bVar, h hVar) {
            super(1);
            this.f842a = kVar;
            this.f843b = bVar;
            this.f844c = hVar;
        }

        public final void b(c.a derive) {
            t.g(derive, "$this$derive");
            Q6.k kVar = this.f842a;
            if (kVar != null) {
                kVar.invoke(derive);
            }
            Iterator it = this.f843b.iterator();
            if (it.hasNext()) {
                s.a(it.next());
                throw null;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((c.a) obj);
            return G.f1419a;
        }
    }

    public h(p application, h hVar, c component, Q6.k kVar, Q6.k kVar2) throws e {
        t.g(application, "application");
        t.g(component, "component");
        E5.b bVarE = application.e();
        this.f831a = new a.b(this, (bVarE.m() || kVar2 != null) ? c.g(component, null, new b(kVar2, bVarE, hVar), 1, null) : component, hVar, application, bVarE, new l(this, bVarE), kVar);
        Iterator it = bVarE.iterator();
        if (it.hasNext()) {
            s.a(it.next());
            throw null;
        }
        Set<m> set = (Set) i(this, A5.b.e(), null, 2, null);
        if (set != null) {
            for (m mVar : set) {
                try {
                    i(this, mVar, null, 2, null);
                } catch (f e8) {
                    throw new e(mVar, "Error resolving eager dependency with key `" + mVar + "`", e8);
                }
            }
        }
    }

    public static /* synthetic */ Object i(h hVar, m mVar, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        return hVar.h(mVar, kVar);
    }

    public static /* synthetic */ F5.d k(h hVar, m mVar, h hVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            hVar2 = hVar;
        }
        return hVar.j(mVar, hVar2);
    }

    public final F5.d a(m key) throws f {
        t.g(key, "key");
        F5.d dVarK = k(this, key, null, 2, null);
        if (dVarK != null || key.isOptional()) {
            return dVarK;
        }
        throw new f(key, null, 2, null);
    }

    public final void b() {
        synchronized (this) {
            try {
                a aVar = this.f831a;
                if (aVar instanceof a.C0020a) {
                    G g8 = G.f1419a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new C6.m();
                    }
                    a.b bVar = (a.b) aVar;
                    try {
                        if (bVar.h()) {
                            this.f831a = a.C0020a.f832a;
                            return;
                        }
                        bVar.i(true);
                        Iterator it = bVar.e().iterator();
                        if (it.hasNext()) {
                            s.a(it.next());
                            throw null;
                        }
                        Iterator it2 = bVar.f().values().iterator();
                        while (it2.hasNext()) {
                            ((F5.d) it2.next()).g();
                        }
                        Q6.k kVarC = bVar.c();
                        if (kVarC != null) {
                            kVarC.invoke(this);
                            G g9 = G.f1419a;
                        }
                        this.f831a = a.C0020a.f832a;
                    } catch (Throwable th) {
                        this.f831a = a.C0020a.f832a;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final h c(String subcomponentQualifier, Q6.k kVar) throws Throwable {
        t.g(subcomponentQualifier, "subcomponentQualifier");
        synchronized (this) {
            try {
                a aVar = this.f831a;
                try {
                    if (aVar instanceof a.C0020a) {
                        throw new q("Graph is already closed.", null, 2, null);
                    }
                    if (!(aVar instanceof a.b)) {
                        throw new C6.m();
                    }
                    return new h(((a.b) aVar).a(), this, f().k(subcomponentQualifier), null, kVar);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            throw th;
        }
    }

    public final h d(Q6.k kVar) throws q {
        a aVar = this.f831a;
        if (aVar instanceof a.C0020a) {
            throw new q("Graph is already closed.", null, 2, null);
        }
        if (aVar instanceof a.b) {
            return new h(((a.b) aVar).a(), this, A5.b.a(i.f845a, kVar), null, null);
        }
        throw new C6.m();
    }

    public final Object e(F5.d service, Q6.k kVar) {
        Object objB;
        t.g(service, "service");
        synchronized (this) {
            try {
                a aVar = this.f831a;
                if (aVar instanceof a.C0020a) {
                    throw new q("Graph is already closed.", null, 2, null);
                }
                if (!(aVar instanceof a.b)) {
                    throw new C6.m();
                }
                a.b bVar = (a.b) aVar;
                if (kVar == null) {
                    objB = bVar.g().b(service, this);
                } else {
                    h hVarD = d(kVar);
                    try {
                        objB = bVar.g().b(service, hVarD);
                        hVarD.b();
                    } catch (Throwable th) {
                        hVarD.b();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objB;
    }

    public final c f() throws q {
        a aVar = this.f831a;
        if (aVar instanceof a.C0020a) {
            throw new q("Graph is already closed.", null, 2, null);
        }
        if (aVar instanceof a.b) {
            return ((a.b) aVar).b();
        }
        throw new C6.m();
    }

    public final h g() throws q {
        a aVar = this.f831a;
        if (aVar instanceof a.C0020a) {
            throw new q("Graph is already closed.", null, 2, null);
        }
        if (aVar instanceof a.b) {
            return ((a.b) aVar).d();
        }
        throw new C6.m();
    }

    public final Object h(m key, Q6.k kVar) throws f {
        t.g(key, "key");
        F5.d dVarA = a(key);
        if (dVarA != null) {
            return F5.e.a(dVarA, key.isOptional(), kVar);
        }
        return null;
    }

    public final F5.d j(m key, h hVar) {
        h hVarG;
        t.g(key, "key");
        while (hVar != null) {
            synchronized (hVar) {
                try {
                    a aVar = hVar.f831a;
                    if (aVar instanceof a.C0020a) {
                        throw new q("Graph is already closed.", null, 2, null);
                    }
                    if (!(aVar instanceof a.b)) {
                        throw new C6.m();
                    }
                    a.b bVar = (a.b) aVar;
                    Map mapF = bVar.f();
                    Object objC = mapF.get(key);
                    if (objC == null) {
                        F5.j jVarH = bVar.b().h(key);
                        if (jVarH != null && (objC = jVarH.c(hVar)) != null) {
                            mapF.put(key, objC);
                        }
                        hVarG = hVar.g();
                    }
                    t.e(objC, "null cannot be cast to non-null type io.jentz.winter.services.BoundService<R of io.jentz.winter.Graph.service$lambda$11>");
                    return (F5.d) objC;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar = hVarG;
        }
        return null;
    }
}
