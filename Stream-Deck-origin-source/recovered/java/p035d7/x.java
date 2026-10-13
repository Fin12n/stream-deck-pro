package p035d7;

import G6.d;
import java.util.concurrent.CancellationException;
import p089j7.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface x {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ void a(x xVar, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            xVar.z(cancellationException);
        }
    }

    f a();

    Object g();

    Object h(d dVar);

    i iterator();

    Object l(d dVar);

    void z(CancellationException cancellationException);
}
