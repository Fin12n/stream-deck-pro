package p138p3;

/* JADX INFO: renamed from: p3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2771f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31192a;

    /* JADX INFO: renamed from: p3.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31193a;

        public /* synthetic */ a(Y y8) {
        }

        public C2771f a() {
            String str = this.f31193a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C2771f c2771f = new C2771f(null);
            c2771f.f31192a = str;
            return c2771f;
        }

        public a b(String str) {
            this.f31193a = str;
            return this;
        }
    }

    public /* synthetic */ C2771f(Z z8) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f31192a;
    }
}
