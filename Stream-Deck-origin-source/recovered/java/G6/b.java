package G6;

import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f2812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.c f2813b;

    public b(g.c baseKey, k safeCast) {
        t.g(baseKey, "baseKey");
        t.g(safeCast, "safeCast");
        this.f2812a = safeCast;
        this.f2813b = baseKey instanceof b ? ((b) baseKey).f2813b : baseKey;
    }

    public final boolean a(g.c key) {
        t.g(key, "key");
        return key == this || this.f2813b == key;
    }

    public final g.b b(g.b element) {
        t.g(element, "element");
        return (g.b) this.f2812a.invoke(element);
    }
}
