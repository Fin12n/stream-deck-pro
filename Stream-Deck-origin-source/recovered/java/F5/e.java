package F5;

import Q6.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final Object a(d dVar, boolean z8, k kVar) throws A5.e {
        t.g(dVar, "<this>");
        Object objE = dVar.e(kVar);
        if (objE != null || z8) {
            return objE;
        }
        throw new A5.e(dVar.getKey(), "Service `" + dVar.getKey() + "` returned null for non-optional key", null, 4, null);
    }
}
