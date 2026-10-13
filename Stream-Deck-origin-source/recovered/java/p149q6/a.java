package p149q6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(Throwable th, Throwable cause) {
        t.g(th, "<this>");
        t.g(cause, "cause");
        th.initCause(cause);
    }
}
