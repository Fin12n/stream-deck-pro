package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    default long H(float f8) {
        B1.b bVar = B1.b.f907a;
        if (!bVar.f(x0()) || m.a()) {
            return w.e(f8 / x0());
        }
        B1.a aVarB = bVar.b(x0());
        return w.e(aVarB != null ? aVarB.a(f8) : f8 / x0());
    }

    default float T(long j8) {
        if (!x.g(v.g(j8), x.f466b.b())) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        B1.b bVar = B1.b.f907a;
        if (!bVar.f(x0()) || m.a()) {
            return h.m(v.h(j8) * x0());
        }
        B1.a aVarB = bVar.b(x0());
        float fH = v.h(j8);
        return aVarB == null ? h.m(fH * x0()) : h.m(aVarB.b(fH));
    }

    float x0();
}
