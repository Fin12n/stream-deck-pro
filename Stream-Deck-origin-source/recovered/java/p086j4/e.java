package p086j4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f28310c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28312b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f28313a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f28314b = 0;

        public e a() {
            return new e(this.f28313a, this.f28314b);
        }

        public a b(long j8) {
            this.f28313a = j8;
            return this;
        }

        public a c(long j8) {
            this.f28314b = j8;
            return this;
        }
    }

    public e(long j8, long j9) {
        this.f28311a = j8;
        this.f28312b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f28311a;
    }

    public long b() {
        return this.f28312b;
    }
}
