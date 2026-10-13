package p173t6;

import G6.d;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final Throwable a(Throwable exception, d continuation) {
        t.g(exception, "exception");
        t.g(continuation, "continuation");
        try {
            return j.a(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
