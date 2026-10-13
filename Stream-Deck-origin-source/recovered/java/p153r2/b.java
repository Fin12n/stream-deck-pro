package p153r2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p153r2.a
    public Object a(a.b key) {
        t.g(key, "key");
        return b().get(key);
    }

    public final void c(a.b key, Object obj) {
        t.g(key, "key");
        b().put(key, obj);
    }

    public b(a initialExtras) {
        t.g(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ b(a aVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? a.C0703a.f32334b : aVar);
    }
}
