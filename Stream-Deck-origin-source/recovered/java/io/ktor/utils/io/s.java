package io.ktor.utils.io;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static final Throwable a(Throwable th) {
        kotlin.jvm.internal.t.g(th, "<this>");
        Throwable th2 = th;
        while (th2 instanceof CancellationException) {
            if (kotlin.jvm.internal.t.c(th2, th2.getCause())) {
                return th;
            }
            Throwable cause = th2.getCause();
            if (cause == null) {
                return th2;
            }
            th2 = cause;
        }
        return th2;
    }
}
