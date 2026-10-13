package p086j4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f28315c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28317b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f28318a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f28319b = 0;

        public f a() {
            return new f(this.f28318a, this.f28319b);
        }

        public a b(long j8) {
            this.f28319b = j8;
            return this;
        }

        public a c(long j8) {
            this.f28318a = j8;
            return this;
        }
    }

    public f(long j8, long j9) {
        this.f28316a = j8;
        this.f28317b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f28317b;
    }

    public long b() {
        return this.f28316a;
    }
}
