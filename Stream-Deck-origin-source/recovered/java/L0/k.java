package L0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface k extends G6.g.b {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final b f4851K = b.f4852a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static Object a(k kVar, Object obj, Q6.o oVar) {
            return G6.g.b.a.a(kVar, obj, oVar);
        }

        public static G6.g.b b(k kVar, G6.g.c cVar) {
            return G6.g.b.a.b(kVar, cVar);
        }

        public static G6.g c(k kVar, G6.g.c cVar) {
            return G6.g.b.a.c(kVar, cVar);
        }

        public static G6.g d(k kVar, G6.g gVar) {
            return G6.g.b.a.d(kVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements G6.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f4852a = new b();
    }

    float A0();

    @Override // G6.g.b
    default G6.g.c getKey() {
        return f4851K;
    }
}
