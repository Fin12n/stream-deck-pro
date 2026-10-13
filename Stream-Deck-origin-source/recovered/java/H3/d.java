package H3;

import D6.L;
import D6.M;
import V3.h;
import X3.i;
import X3.k;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f3535b;

        public a(h.a aVar) {
            Map mapG;
            this.f3534a = aVar.b();
            Map mapA = aVar.a();
            if (mapA != null) {
                mapG = new LinkedHashMap(L.d(mapA.size()));
                for (Map.Entry entry : mapA.entrySet()) {
                    mapG.put(entry.getKey(), i.Companion.g((String) entry.getValue()));
                }
            } else {
                mapG = M.g();
            }
            this.f3535b = mapG;
        }

        @Override // X3.k
        public Date a() {
            return k.a.a(this);
        }

        @Override // X3.k
        public Map b() {
            return this.f3535b;
        }

        @Override // X3.k
        public String c() {
            return this.f3534a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3536a = "screen_view";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f3537b;

        public b(h.c cVar) {
            Map mapC = L.c();
            mapC.put("screen_name", i.Companion.g(cVar.b()));
            Map mapA = cVar.a();
            if (mapA != null) {
                for (Map.Entry entry : mapA.entrySet()) {
                    mapC.put((String) entry.getKey(), i.Companion.g((String) entry.getValue()));
                }
            }
            this.f3537b = L.b(mapC);
        }

        @Override // X3.k
        public Date a() {
            return k.a.a(this);
        }

        @Override // X3.k
        public Map b() {
            return this.f3537b;
        }

        @Override // X3.k
        public String c() {
            return this.f3536a;
        }
    }

    public static final a c(h.a aVar) {
        return new a(aVar);
    }

    public static final b d(h.c cVar) {
        return new b(cVar);
    }
}
