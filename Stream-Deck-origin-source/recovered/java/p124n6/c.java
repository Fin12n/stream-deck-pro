package p124n6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {
    public /* synthetic */ c(String str, Throwable th, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? "Cannot write to a channel" : str, th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message, Throwable exception) {
        super(message, exception);
        t.g(message, "message");
        t.g(exception, "exception");
    }
}
