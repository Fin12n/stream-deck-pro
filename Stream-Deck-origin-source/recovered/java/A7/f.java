package A7;

import P2.Lsk.mHPawN;
import kotlin.jvm.internal.t;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f867a = new f();

    public final boolean a(String method) {
        t.g(method, "method");
        return t.c(method, "POST") || t.c(method, "PATCH") || t.c(method, "PUT") || t.c(method, "DELETE") || t.c(method, "MOVE");
    }

    public final boolean c(String method) {
        t.g(method, "method");
        return !t.c(method, "PROPFIND");
    }

    public final boolean d(String method) {
        t.g(method, "method");
        return t.c(method, "PROPFIND");
    }

    public static final boolean b(String method) {
        t.g(method, "method");
        return (t.c(method, "GET") || t.c(method, toqHM.tUZzOoLPojReDr)) ? false : true;
    }

    public static final boolean e(String method) {
        t.g(method, "method");
        return t.c(method, "POST") || t.c(method, "PUT") || t.c(method, "PATCH") || t.c(method, "PROPPATCH") || t.c(method, mHPawN.NTuUC);
    }
}
