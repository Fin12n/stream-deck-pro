package p138p3;

/* JADX INFO: renamed from: p3.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2781p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31204a;

    /* JADX INFO: renamed from: p3.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31205a;

        public /* synthetic */ a(r0 r0Var) {
        }

        public C2781p a() {
            if (this.f31205a != null) {
                return new C2781p(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f31205a = str;
            return this;
        }
    }

    public /* synthetic */ C2781p(a aVar, s0 s0Var) {
        this.f31204a = aVar.f31205a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f31204a;
    }
}
