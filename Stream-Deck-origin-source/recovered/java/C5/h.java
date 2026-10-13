package C5;

import A5.m;
import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f1407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m key, k kVar) {
        super(key);
        t.g(key, "key");
        this.f1407d = kVar;
    }

    @Override // C5.a
    public Object e(A5.h graph, m key) {
        t.g(graph, "graph");
        t.g(key, "key");
        return graph.h(key, this.f1407d);
    }
}
