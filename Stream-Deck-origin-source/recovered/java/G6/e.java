package G6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface e extends g.b {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final b f2817J = b.f2818a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static g.b a(e eVar, g.c key) {
            g.b bVarB;
            t.g(key, "key");
            if (!(key instanceof G6.b)) {
                if (e.f2817J != key) {
                    return null;
                }
                t.e(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            G6.b bVar = (G6.b) key;
            if (!bVar.a(eVar.getKey()) || (bVarB = bVar.b(eVar)) == null) {
                return null;
            }
            return bVarB;
        }

        public static g b(e eVar, g.c key) {
            t.g(key, "key");
            if (!(key instanceof G6.b)) {
                return e.f2817J == key ? h.f2820a : eVar;
            }
            G6.b bVar = (G6.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f2820a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f2818a = new b();
    }

    void C1(d dVar);

    d U1(d dVar);
}
