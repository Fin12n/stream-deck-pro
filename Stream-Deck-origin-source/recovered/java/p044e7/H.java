package p044e7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20929a = a.f20930a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f20930a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final H f20931b = new J();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H f20932c = new K();

        public static /* synthetic */ H b(a aVar, long j8, long j9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            if ((i8 & 2) != 0) {
                j9 = Long.MAX_VALUE;
            }
            return aVar.a(j8, j9);
        }

        public final H a(long j8, long j9) {
            return new L(j8, j9);
        }

        public final H c() {
            return f20931b;
        }

        public final H d() {
            return f20932c;
        }
    }

    InterfaceC2260f a(M m8);
}
