package p159s0;

import p143q0.B;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32803a = a.f32804a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f32804a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f32805b = new t() { // from class: s0.o
            @Override // p159s0.t
            public final C2892n a(z zVar) {
                return t.a.h(zVar);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f32806c = new t() { // from class: s0.p
            @Override // p159s0.t
            public final C2892n a(z zVar) {
                return t.a.f(zVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final t f32807d = new t() { // from class: s0.q
            @Override // p159s0.t
            public final C2892n a(z zVar) {
                return t.a.j(zVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final t f32808e = new t() { // from class: s0.r
            @Override // p159s0.t
            public final C2892n a(z zVar) {
                return t.a.i(zVar);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final t f32809f = new t() { // from class: s0.s
            @Override // p159s0.t
            public final C2892n a(z zVar) {
                return t.a.g(zVar);
            }
        };

        /* JADX INFO: renamed from: s0.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0734a implements InterfaceC2881c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0734a f32810a = new C0734a();

            @Override // p159s0.InterfaceC2881c
            public final long a(C2891m c2891m, int i8) {
                return B.c(c2891m.c(), i8);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2881c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f32811a = new b();

            @Override // p159s0.InterfaceC2881c
            public final long a(C2891m c2891m, int i8) {
                return c2891m.k().C(i8);
            }
        }

        public static final C2892n f(z zVar) {
            return u.h(f32805b.a(zVar), zVar);
        }

        public static final C2892n g(z zVar) {
            C2892n.a aVarC;
            C2892n.a aVarL;
            C2892n.a aVarE;
            C2892n.a aVarC2;
            C2892n c2892nC = zVar.c();
            if (c2892nC == null) {
                return f32807d.a(zVar);
            }
            if (zVar.a()) {
                aVarC = c2892nC.e();
                aVarL = u.l(zVar, zVar.i(), aVarC);
                aVarC2 = c2892nC.c();
                aVarE = aVarL;
            } else {
                aVarC = c2892nC.c();
                aVarL = u.l(zVar, zVar.g(), aVarC);
                aVarE = c2892nC.e();
                aVarC2 = aVarL;
            }
            if (kotlin.jvm.internal.t.c(aVarL, aVarC)) {
                return c2892nC;
            }
            return u.h(new C2892n(aVarE, aVarC2, zVar.h() == EnumC2883e.CROSSED || (zVar.h() == EnumC2883e.COLLAPSED && aVarE.c() > aVarC2.c())), zVar);
        }

        public static final C2892n h(z zVar) {
            return new C2892n(zVar.i().a(zVar.i().g()), zVar.g().a(zVar.g().e()), zVar.h() == EnumC2883e.CROSSED);
        }

        public static final C2892n i(z zVar) {
            return u.e(zVar, C0734a.f32810a);
        }

        public static final C2892n j(z zVar) {
            return u.e(zVar, b.f32811a);
        }

        public final t k() {
            return f32809f;
        }

        public final t l() {
            return f32805b;
        }

        public final t m() {
            return f32808e;
        }

        public final t n() {
            return f32807d;
        }
    }

    C2892n a(z zVar);
}
