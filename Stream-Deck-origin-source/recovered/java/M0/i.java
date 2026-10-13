package M0;

import C6.G;
import Q6.k;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5080a = new LinkedHashMap();

    public final Map a() {
        return this.f5080a;
    }

    public final G b(int i8, String str) {
        k kVarE;
        h hVar = (h) this.f5080a.get(Integer.valueOf(i8));
        if (hVar == null || (kVarE = hVar.e()) == null) {
            return null;
        }
        kVarE.invoke(str);
        return G.f1419a;
    }
}
