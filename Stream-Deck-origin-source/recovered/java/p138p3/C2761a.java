package p138p3;

/* JADX INFO: renamed from: p3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2761a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31183a;

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0669a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31184a;

        public /* synthetic */ C0669a(AbstractC2783s abstractC2783s) {
        }

        public C2761a a() {
            String str = this.f31184a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C2761a c2761a = new C2761a(null);
            c2761a.f31183a = str;
            return c2761a;
        }

        public C0669a b(String str) {
            this.f31184a = str;
            return this;
        }
    }

    public /* synthetic */ C2761a(G g8) {
    }

    public static C0669a b() {
        return new C0669a(null);
    }

    public String a() {
        return this.f31183a;
    }
}
