package A5;

import C6.C0920i;
import D6.r;
import D6.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p063h.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E5.b f849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f853f;

    public l(h graph, E5.b plugins) {
        t.g(graph, "graph");
        t.g(plugins, "plugins");
        this.f848a = graph;
        this.f849b = plugins;
    }

    public final void a() {
        List list = this.f851d;
        if (list == null) {
            return;
        }
        this.f851d = null;
        int iP = r.p(list);
        int iC = K6.c.c(iP, 0, -3);
        if (iC > iP) {
            return;
        }
        while (true) {
            Object obj = list.get(iP - 2);
            t.e(obj, "null cannot be cast to non-null type io.jentz.winter.services.BoundService<kotlin.Any>");
            Object obj2 = list.get(iP - 1);
            Object obj3 = list.get(iP);
            t.e(obj3, "null cannot be cast to non-null type io.jentz.winter.Graph");
            ((F5.d) obj).h((h) obj3, obj2);
            if (iP == iC) {
                return;
            } else {
                iP -= 3;
            }
        }
    }

    public final Object b(F5.d service, h graph) throws d {
        t.g(service, "service");
        t.g(graph, "graph");
        m key = service.getKey();
        boolean z8 = this.f850c;
        this.f850c = true;
        if (service.f2410a) {
            service.f2410a = false;
            this.f852e = key;
            this.f853f = new ArrayList();
            throw new d(key, "internal", null, 4, null);
        }
        service.f2410a = true;
        try {
            try {
                try {
                    try {
                        Object objF = service.f(graph);
                        if (objF == null) {
                            if (service.getKey().isOptional()) {
                                service.f2410a = false;
                                if (!z8) {
                                    this.f850c = false;
                                    a();
                                }
                                return null;
                            }
                            throw new q("Service for key `" + service.getKey() + "` returned null", null, 2, null);
                        }
                        if (service.b()) {
                            List arrayList = this.f851d;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(service);
                            arrayList.add(objF);
                            arrayList.add(graph);
                            this.f851d = arrayList;
                        }
                        Iterator it = this.f849b.iterator();
                        if (it.hasNext()) {
                            s.a(it.next());
                            service.a();
                            throw null;
                        }
                        service.f2410a = false;
                        if (!z8) {
                            this.f850c = false;
                            a();
                        }
                        return objF;
                    } catch (Throwable th) {
                        throw new e(key, "Factory of dependency with key " + key + " threw an exception on invocation.", th);
                    }
                } catch (f e8) {
                    throw new e(key, "Error while resolving dependency with key: " + key + " reason: could not find dependency with key " + e8.a(), e8);
                }
            } catch (d e9) {
                c(key, e9);
                throw new C0920i();
            } catch (q e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            service.f2410a = false;
            if (z8) {
                throw th2;
            }
            this.f850c = false;
            a();
            throw th2;
        }
    }

    public final Void c(m mVar, d dVar) throws d {
        if (this.f852e == null) {
            throw dVar;
        }
        List list = this.f853f;
        t.d(list);
        list.add(dVar.a());
        if (!t.c(this.f852e, mVar)) {
            throw new d(mVar, "internal", null, 4, null);
        }
        this.f852e = null;
        this.f853f = null;
        if (list.size() == 1) {
            throw new d(mVar, "Cyclic dependency found: `" + mVar + "` is directly dependent of itself.\nDependency chain: " + mVar + " => " + mVar, null, 4, null);
        }
        list.add(mVar);
        list.remove(0);
        throw new d(mVar, "Cyclic dependency found: `" + mVar + "` is dependent of itself.\nDependency chain: " + z.r0(z.D0(list), " -> ", null, " => " + mVar, 0, null, null, 58, null), null, 4, null);
    }
}
