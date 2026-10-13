package T0;

import R0.AbstractC1596k0;
import R0.H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface h {
    static /* synthetic */ void e(h hVar, H0 h8, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i9 & 2) != 0) {
            i8 = AbstractC1596k0.f9402a.b();
        }
        hVar.b(h8, i8);
    }

    static /* synthetic */ void i(h hVar, float f8, float f9, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        hVar.d(f8, f9);
    }

    void a(float[] fArr);

    void b(H0 h8, int i8);

    void c(float f8, float f9, float f10, float f11, int i8);

    void d(float f8, float f9);

    void f(float f8, float f9, long j8);

    void g(float f8, float f9, float f10, float f11);

    void h(float f8, long j8);
}
