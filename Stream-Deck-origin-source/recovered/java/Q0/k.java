package Q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final j a(float f8, float f9, float f10, float f11, float f12, float f13) {
        long jA = b.a(f12, f13);
        return new j(f8, f9, f10, f11, jA, jA, jA, jA, null);
    }

    public static final j b(h hVar, long j8, long j9, long j10, long j11) {
        return new j(hVar.i(), hVar.l(), hVar.j(), hVar.e(), j8, j9, j10, j11, null);
    }

    public static final j c(float f8, float f9, float f10, float f11, long j8) {
        return a(f8, f9, f10, f11, a.d(j8), a.e(j8));
    }

    public static final boolean d(j jVar) {
        return a.d(jVar.h()) == a.e(jVar.h()) && a.d(jVar.h()) == a.d(jVar.i()) && a.d(jVar.h()) == a.e(jVar.i()) && a.d(jVar.h()) == a.d(jVar.c()) && a.d(jVar.h()) == a.e(jVar.c()) && a.d(jVar.h()) == a.d(jVar.b()) && a.d(jVar.h()) == a.e(jVar.b());
    }
}
