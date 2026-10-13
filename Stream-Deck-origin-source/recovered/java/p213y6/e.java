package p213y6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final Void a(long j8, String name) {
        t.g(name, "name");
        throw new IllegalArgumentException("Long value " + j8 + " of " + name + " doesn't fit into 32-bit integer");
    }
}
