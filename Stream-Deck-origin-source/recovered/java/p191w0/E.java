package p191w0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f35230a = new LinkedHashMap();

    public final void a(Object obj, float f8) {
        this.f35230a.put(obj, Float.valueOf(f8));
    }

    public final Map b() {
        return this.f35230a;
    }
}
