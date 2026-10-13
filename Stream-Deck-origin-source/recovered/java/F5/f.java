package F5;

import D6.z;
import Q6.k;
import Q6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A5.h f2411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f2413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2414e;

    public f(A5.h graph, i unboundService) {
        t.g(graph, "graph");
        t.g(unboundService, "unboundService");
        this.f2411b = graph;
        this.f2412c = unboundService;
        this.f2413d = A5.b.h();
    }

    @Override // F5.d
    public Object e(k kVar) {
        Object obj = this.f2413d;
        if (obj != A5.b.h()) {
            return obj;
        }
        synchronized (this) {
            Object obj2 = this.f2413d;
            if (obj2 != A5.b.h()) {
                return obj2;
            }
            return this.f2411b.e(this, kVar);
        }
    }

    @Override // F5.d
    public Object f(A5.h graph) {
        t.g(graph, "graph");
        Object objInvoke = d().e().invoke(graph);
        this.f2413d = objInvoke;
        return objInvoke;
    }

    @Override // F5.d
    public void g() {
        List list = this.f2414e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return;
        }
        Object obj = this.f2413d;
        Object obj2 = obj != A5.b.h() ? obj : null;
        if (obj2 == null) {
            return;
        }
        Iterator it = z.D0(list).iterator();
        while (it.hasNext()) {
            ((o) it.next()).invoke(this.f2411b, obj2);
        }
    }

    @Override // F5.d
    public void h(A5.h graph, Object obj) {
        t.g(graph, "graph");
        if (d().f().isEmpty()) {
            return;
        }
        List listF = d().f();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((o) it.next()).invoke(graph, obj);
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        this.f2414e = arrayList;
    }

    @Override // F5.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i d() {
        return this.f2412c;
    }
}
