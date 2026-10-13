package p124n6;

import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String message, Throwable exception) {
        super(message, exception);
        t.g(message, "message");
        t.g(exception, "exception");
    }
}
