package p173t6;

import io.ktor.utils.io.r;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final Throwable a(Throwable th, Throwable th2) {
        Throwable thE;
        t.g(th, "<this>");
        if (th2 == null || t.c(th.getCause(), th2) || (thE = r.e(th, th2)) == null) {
            return th;
        }
        thE.setStackTrace(th.getStackTrace());
        return thE;
    }
}
