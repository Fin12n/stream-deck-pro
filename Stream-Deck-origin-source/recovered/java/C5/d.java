package C5;

import A5.q;
import C6.F;
import X6.l;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f1402a;

    public abstract void a(A5.h hVar);

    public abstract Object b();

    public final Object c(Object obj, l property) throws q {
        t.g(property, "property");
        try {
            return b();
        } catch (F unused) {
            throw new q("Injected property `" + property.getName() + "` not initialized.", null, 2, null);
        }
    }

    public final void d(A5.h graph) throws q {
        t.g(graph, "graph");
        if (this.f1402a) {
            throw new q("Inject was called multiple times.", null, 2, null);
        }
        a(graph);
        this.f1402a = true;
    }
}
