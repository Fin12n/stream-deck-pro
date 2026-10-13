package T;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T.a f9785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f9787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9788d;

    public c(T.a aVar, d dVar, b bVar, int i8) {
        this.f9785a = aVar;
        this.f9786b = dVar;
        this.f9787c = bVar;
        this.f9788d = i8;
    }

    public int a() {
        return this.f9788d;
    }

    public T.a b() {
        return this.f9785a;
    }

    public b c() {
        return this.f9787c;
    }

    public d d() {
        return this.f9786b;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T.a f9789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f9790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f9791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9792d;

        public a() {
            this.f9789a = T.a.f9781c;
            this.f9790b = null;
            this.f9791c = null;
            this.f9792d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f9789a, this.f9790b, this.f9791c, this.f9792d);
        }

        public a c(int i8) {
            this.f9792d = i8;
            return this;
        }

        public a d(T.a aVar) {
            this.f9789a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f9791c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f9790b = dVar;
            return this;
        }

        public a(c cVar) {
            this.f9789a = T.a.f9781c;
            this.f9790b = null;
            this.f9791c = null;
            this.f9792d = 0;
            this.f9789a = cVar.b();
            this.f9790b = cVar.d();
            this.f9791c = cVar.c();
            this.f9792d = cVar.a();
        }
    }
}
