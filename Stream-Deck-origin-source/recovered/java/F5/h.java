package F5;

import A5.m;
import D6.r;
import Q6.k;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2419c;

    public h(m key, k factory) {
        t.g(key, "key");
        t.g(factory, "factory");
        this.f2417a = key;
        this.f2418b = factory;
        this.f2419c = r.n();
    }

    @Override // F5.j
    public String a() {
        return A5.b.f();
    }

    @Override // F5.j
    public boolean b() {
        return !this.f2419c.isEmpty();
    }

    @Override // F5.j
    public d c(A5.h graph) {
        t.g(graph, "graph");
        return new c(graph, this);
    }

    public final k d() {
        return this.f2418b;
    }

    public final List e() {
        return this.f2419c;
    }

    @Override // F5.j
    public m getKey() {
        return this.f2417a;
    }
}
