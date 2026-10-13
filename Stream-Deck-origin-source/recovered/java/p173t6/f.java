package p173t6;

import G6.g;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final e a(Object context, List interceptors, Object subject, g coroutineContext, boolean z8) {
        t.g(context, "context");
        t.g(interceptors, "interceptors");
        t.g(subject, "subject");
        t.g(coroutineContext, "coroutineContext");
        return (g.a() || z8) ? new a(context, interceptors, subject, coroutineContext) : new n(subject, context, interceptors);
    }
}
