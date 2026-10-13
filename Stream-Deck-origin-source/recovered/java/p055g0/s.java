package p055g0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23250a = new LinkedHashMap();

    public final void a(Object obj, float f8) {
        this.f23250a.put(obj, Float.valueOf(f8));
    }

    public final Map b() {
        return this.f23250a;
    }
}
