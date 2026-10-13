package p035d7;

import G6.d;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface y {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ boolean a(y yVar, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return yVar.d(th);
        }
    }

    boolean d(Throwable th);

    Object i(Object obj, d dVar);

    void k(k kVar);

    Object m(Object obj);

    boolean n();
}
