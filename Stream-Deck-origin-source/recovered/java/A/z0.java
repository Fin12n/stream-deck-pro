package A;

import H.b1;
import H.n1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f345a = new z0() { // from class: A.y0
        @Override // A.z0
        public final z0.c e(z0.b bVar) {
            return z0.c.f350d;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f346b = new H.V.b(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f347c = new H.V(a());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0 f348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f349b;

        public a(z0 z0Var) {
            this.f348a = z0Var;
            this.f349b = z0Var.b();
        }

        public z0 a() {
            z0 z0Var = this.f348a;
            return z0Var instanceof b1 ? ((b1) z0Var).d(this.f349b) : new n1(this.f349b, this.f348a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        int a();

        Throwable b();

        long c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f350d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f351e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f352f = new c(true, 100);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static c f353g = new c(false, 0, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f356c;

        public c(boolean z8) {
            this(z8, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f354a;
        }

        public boolean c() {
            return this.f356c;
        }

        public boolean d() {
            return this.f355b;
        }

        public c(boolean z8, long j8) {
            this(z8, j8, false);
        }

        public c(boolean z8, long j8, boolean z9) {
            this.f355b = z8;
            this.f354a = j8;
            if (z9) {
                T1.f.b(!z8, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f356c = z9;
        }
    }

    static long a() {
        return 6000L;
    }

    default long b() {
        return 0L;
    }

    c e(b bVar);
}
