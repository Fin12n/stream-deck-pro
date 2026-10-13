package F5;

import A5.m;
import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2416c;

    public g(m key, Object obj) {
        t.g(key, "key");
        this.f2415b = key;
        this.f2416c = obj;
    }

    @Override // F5.d, F5.j
    public String a() {
        return A5.b.g();
    }

    @Override // F5.d, F5.j
    public boolean b() {
        return false;
    }

    @Override // F5.j
    public d c(A5.h graph) {
        t.g(graph, "graph");
        return this;
    }

    @Override // F5.d
    public Object e(k kVar) {
        return this.f2416c;
    }

    @Override // F5.d
    public Object f(A5.h graph) {
        t.g(graph, "graph");
        throw new AssertionError("BUG: This method should not be called.");
    }

    @Override // F5.d, F5.j
    public m getKey() {
        return this.f2415b;
    }

    public final Object i() {
        return this.f2416c;
    }

    @Override // F5.d
    public j d() {
        return this;
    }
}
