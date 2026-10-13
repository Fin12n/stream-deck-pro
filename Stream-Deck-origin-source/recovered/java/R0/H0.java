package R0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9305a = a.f9306a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f9306a = new a();
    }

    static /* synthetic */ void n(H0 h8, H0 h9, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i8 & 2) != 0) {
            j8 = Q0.f.f9082b.c();
        }
        h8.p(h9, j8);
    }

    boolean a();

    void b(float f8, float f9);

    void c(float f8, float f9, float f10, float f11, float f12, float f13);

    void close();

    void d(float f8, float f9, float f10, float f11);

    void e(float f8, float f9, float f10, float f11);

    void f(int i8);

    int g();

    Q0.h getBounds();

    boolean h(H0 h8, H0 h9, int i8);

    void i(Q0.j jVar);

    boolean isEmpty();

    void j(float f8, float f9);

    void k(float f8, float f9, float f10, float f11, float f12, float f13);

    void l();

    void m(long j8);

    void o(float f8, float f9);

    void p(H0 h8, long j8);

    void q(Q0.h hVar);

    void r(float f8, float f9);

    void reset();
}
