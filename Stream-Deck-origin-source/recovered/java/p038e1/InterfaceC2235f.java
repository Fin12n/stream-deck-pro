package p038e1;

import Q0.l;

/* JADX INFO: renamed from: e1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2235f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20468a = a.f20469a;

    /* JADX INFO: renamed from: e1.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f20469a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InterfaceC2235f f20470b = new C0472a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InterfaceC2235f f20471c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final InterfaceC2235f f20472d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InterfaceC2235f f20473e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final InterfaceC2235f f20474f = new C0473f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C2239j f20475g = new C2239j(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final InterfaceC2235f f20476h = new b();

        /* JADX INFO: renamed from: e1.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0472a implements InterfaceC2235f {
            @Override // p038e1.InterfaceC2235f
            public long a(long j8, long j9) {
                float f8 = AbstractC2236g.f(j8, j9);
                return g0.a(f8, f8);
            }
        }

        /* JADX INFO: renamed from: e1.f$a$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2235f {
            @Override // p038e1.InterfaceC2235f
            public long a(long j8, long j9) {
                return g0.a(AbstractC2236g.h(j8, j9), AbstractC2236g.e(j8, j9));
            }
        }

        /* JADX INFO: renamed from: e1.f$a$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements InterfaceC2235f {
            @Override // p038e1.InterfaceC2235f
            public long a(long j8, long j9) {
                float fE = AbstractC2236g.e(j8, j9);
                return g0.a(fE, fE);
            }
        }

        /* JADX INFO: renamed from: e1.f$a$d */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d implements InterfaceC2235f {
            @Override // p038e1.InterfaceC2235f
            public long a(long j8, long j9) {
                float fH = AbstractC2236g.h(j8, j9);
                return g0.a(fH, fH);
            }
        }

        /* JADX INFO: renamed from: e1.f$a$e */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e implements InterfaceC2235f {
            @Override // p038e1.InterfaceC2235f
            public long a(long j8, long j9) {
                float fG = AbstractC2236g.g(j8, j9);
                return g0.a(fG, fG);
            }
        }

        /* JADX INFO: renamed from: e1.f$a$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0473f implements InterfaceC2235f {
            @Override // p038e1.InterfaceC2235f
            public long a(long j8, long j9) {
                if (l.i(j8) <= l.i(j9) && l.g(j8) <= l.g(j9)) {
                    return g0.a(1.0f, 1.0f);
                }
                float fG = AbstractC2236g.g(j8, j9);
                return g0.a(fG, fG);
            }
        }

        public final InterfaceC2235f a() {
            return f20470b;
        }

        public final InterfaceC2235f b() {
            return f20473e;
        }

        public final InterfaceC2235f c() {
            return f20471c;
        }

        public final InterfaceC2235f d() {
            return f20474f;
        }
    }

    long a(long j8, long j9);
}
