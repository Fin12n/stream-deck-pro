package p132o5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f30951a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f30952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f30953b;

        public <RemoteT extends b> a(Class<RemoteT> cls, b bVar) {
            this.f30952a = cls;
            this.f30953b = bVar;
        }

        public final b a() {
            return this.f30953b;
        }

        public final Class b() {
            return this.f30952a;
        }
    }

    public c(Set<a> set) {
        for (a aVar : set) {
            this.f30951a.put(aVar.b(), aVar.a());
        }
    }
}
