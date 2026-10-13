package F5;

import A5.m;
import A5.q;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f2405b;

    public a(m targetKey, m newKey) {
        t.g(targetKey, "targetKey");
        t.g(newKey, "newKey");
        this.f2404a = targetKey;
        this.f2405b = newKey;
    }

    @Override // F5.j
    public String a() {
        return A5.b.f();
    }

    @Override // F5.j
    public boolean b() {
        return false;
    }

    @Override // F5.j
    public d c(A5.h graph) throws q {
        t.g(graph, "graph");
        try {
            m mVar = this.f2404a;
            t.e(mVar, "null cannot be cast to non-null type io.jentz.winter.TypeKey<R of io.jentz.winter.services.AliasService>");
            d dVarK = A5.h.k(graph, mVar, null, 2, null);
            if (dVarK != null) {
                return new b(this, dVarK);
            }
            throw new A5.f(this.f2404a, null, 2, null);
        } catch (Throwable th) {
            throw new q("Error resolving alias `" + this.f2405b + "` pointing to `" + this.f2404a + "`.", th);
        }
    }

    @Override // F5.j
    public m getKey() {
        return this.f2405b;
    }
}
