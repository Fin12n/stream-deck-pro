package p055g0;

import G6.d;
import Q6.o;
import p046f0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface M {
    static /* synthetic */ Object c(M m8, K k8, o oVar, d dVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i8 & 1) != 0) {
            k8 = K.Default;
        }
        return m8.f(k8, oVar, dVar);
    }

    default boolean a() {
        return true;
    }

    boolean b();

    default boolean d() {
        return true;
    }

    float e(float f8);

    Object f(K k8, o oVar, d dVar);
}
