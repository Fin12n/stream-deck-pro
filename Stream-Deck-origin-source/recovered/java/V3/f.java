package V3;

import java.util.Arrays;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(i event) {
        t.g(event, "event");
        e.f10671a.b(event);
    }

    public static final void b(j... events) {
        t.g(events, "events");
        e.f10671a.c((j[]) Arrays.copyOf(events, events.length));
    }
}
