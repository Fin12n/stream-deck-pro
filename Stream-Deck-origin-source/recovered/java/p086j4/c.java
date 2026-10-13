package p086j4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f28291c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f28293b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f28294a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f28295b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f28294a, this.f28295b);
        }

        public a b(long j8) {
            this.f28294a = j8;
            return this;
        }

        public a c(b bVar) {
            this.f28295b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b implements p069h5.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28304a;

        b(int i8) {
            this.f28304a = i8;
        }

        @Override // p069h5.c
        public int getNumber() {
            return this.f28304a;
        }
    }

    public c(long j8, b bVar) {
        this.f28292a = j8;
        this.f28293b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f28292a;
    }

    public b b() {
        return this.f28293b;
    }
}
