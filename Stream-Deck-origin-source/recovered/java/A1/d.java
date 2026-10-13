package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface d extends l {
    default float E0(float f8) {
        return f8 * getDensity();
    }

    default long I(long j8) {
        return j8 != Q0.l.f9103b.a() ? i.b(p0(Q0.l.i(j8)), p0(Q0.l.g(j8))) : k.f441b.a();
    }

    default int V0(float f8) {
        float fE0 = E0(f8);
        if (Float.isInfinite(fE0)) {
            return Integer.MAX_VALUE;
        }
        return S6.c.d(fE0);
    }

    float getDensity();

    default long i0(float f8) {
        return H(p0(f8));
    }

    default long i1(long j8) {
        return j8 != k.f441b.a() ? Q0.m.a(E0(k.h(j8)), E0(k.g(j8))) : Q0.l.f9103b.a();
    }

    default float l1(long j8) {
        if (x.g(v.g(j8), x.f466b.b())) {
            return E0(T(j8));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default float n0(int i8) {
        return h.m(i8 / getDensity());
    }

    default float p0(float f8) {
        return h.m(f8 / getDensity());
    }
}
