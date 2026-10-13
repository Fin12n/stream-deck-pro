package p183v0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f35016a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f35017b = new LinkedHashMap();

    public final a a(l lVar) {
        return (a) this.f35017b.get(lVar);
    }

    public final l b(a aVar) {
        return (l) this.f35016a.get(aVar);
    }

    public final void c(a aVar) {
        l lVar = (l) this.f35016a.get(aVar);
        if (lVar != null) {
        }
        this.f35016a.remove(aVar);
    }

    public final void d(a aVar, l lVar) {
        this.f35016a.put(aVar, lVar);
        this.f35017b.put(lVar, aVar);
    }
}
