package K2;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface c extends K2.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0163a f4554b = new C0163a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4555c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f4556d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4557a;

        /* JADX INFO: renamed from: K2.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0163a {
            public /* synthetic */ C0163a(AbstractC2633k abstractC2633k) {
                this();
            }

            public C0163a() {
            }
        }

        public a(String str) {
            this.f4557a = str;
        }

        public String toString() {
            return this.f4557a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4558b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f4559c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f4560d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4561a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f4561a = str;
        }

        public String toString() {
            return this.f4561a;
        }
    }

    /* JADX INFO: renamed from: K2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0164c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4562b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0164c f4563c = new C0164c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0164c f4564d = new C0164c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4565a;

        /* JADX INFO: renamed from: K2.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public a() {
            }
        }

        public C0164c(String str) {
            this.f4565a = str;
        }

        public String toString() {
            return this.f4565a;
        }
    }

    C0164c a();

    boolean b();

    a c();

    b d();
}
