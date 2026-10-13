package C5;

import A5.m;
import C6.F;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1401c;

    public a(m key) {
        t.g(key, "key");
        this.f1400b = key;
        this.f1401c = e.f1403a;
    }

    @Override // C5.d
    public void a(A5.h graph) {
        t.g(graph, "graph");
        this.f1401c = e(graph, this.f1400b);
    }

    @Override // C5.d
    public final Object b() {
        if (this.f1401c != e.f1403a) {
            return this.f1401c;
        }
        throw new F("Property not initialized.");
    }

    public abstract Object e(A5.h hVar, m mVar);
}
