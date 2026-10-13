package p017b7;

import C6.C0918g;
import G6.g;
import java.lang.reflect.InvocationTargetException;
import p062g7.AbstractC2370i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H {
    public static final void a(g gVar, Throwable th) {
        try {
            G g8 = (G) gVar.A(G.f15897N);
            if (g8 != null) {
                g8.R1(gVar, th);
            } else {
                AbstractC2370i.a(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC2370i.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C0918g.a(runtimeException, th);
        return runtimeException;
    }
}
