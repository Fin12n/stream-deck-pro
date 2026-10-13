package H5;

import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p007a6.c content) {
        super("Failed to write body: " + K.b(content.getClass()));
        t.g(content, "content");
    }
}
