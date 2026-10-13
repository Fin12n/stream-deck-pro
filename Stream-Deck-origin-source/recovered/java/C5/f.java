package C5;

import A5.p;
import A5.q;
import X6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1406c;

    public f(Object target, p application) {
        t.g(target, "target");
        t.g(application, "application");
        this.f1404a = target;
        this.f1405b = application;
        this.f1406c = new ArrayList();
    }

    public final List a() {
        return this.f1406c;
    }

    public f b(Object thisRef, l property) {
        t.g(thisRef, "thisRef");
        t.g(property, "property");
        return this;
    }

    public final void c() throws q {
        d(c.b(this.f1405b.d(), this.f1404a));
    }

    public final void d(A5.h graph) throws q {
        t.g(graph, "graph");
        Iterator it = this.f1406c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).d(graph);
        }
    }
}
