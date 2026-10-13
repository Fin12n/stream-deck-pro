package C6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String message) {
        super(message);
        kotlin.jvm.internal.t.g(message, "message");
    }

    public /* synthetic */ n(String str, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
