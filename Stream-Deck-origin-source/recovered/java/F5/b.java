package F5;

import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f2407c;

    public b(a unboundService, d targetService) {
        t.g(unboundService, "unboundService");
        t.g(targetService, "targetService");
        this.f2406b = unboundService;
        this.f2407c = targetService;
    }

    @Override // F5.d
    public Object e(k kVar) {
        return this.f2407c.e(kVar);
    }

    @Override // F5.d
    public Object f(A5.h graph) {
        t.g(graph, "graph");
        throw new AssertionError("BUG: This method should not be called.");
    }

    @Override // F5.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a d() {
        return this.f2406b;
    }
}
