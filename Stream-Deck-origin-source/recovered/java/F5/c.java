package F5;

import Q6.k;
import Q6.o;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A5.h f2408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f2409c;

    public c(A5.h graph, h unboundService) {
        t.g(graph, "graph");
        t.g(unboundService, "unboundService");
        this.f2408b = graph;
        this.f2409c = unboundService;
    }

    @Override // F5.d
    public Object e(k kVar) {
        return this.f2408b.e(this, kVar);
    }

    @Override // F5.d
    public void h(A5.h graph, Object obj) {
        t.g(graph, "graph");
        Iterator it = d().e().iterator();
        while (it.hasNext()) {
            ((o) it.next()).invoke(graph, obj);
        }
    }

    @Override // F5.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h d() {
        return this.f2409c;
    }

    @Override // F5.d
    public Object f(A5.h hVar) {
        t.g(hVar, hJroAgFztiMK.JLOZZQUGimUbRv);
        return d().d().invoke(hVar);
    }
}
