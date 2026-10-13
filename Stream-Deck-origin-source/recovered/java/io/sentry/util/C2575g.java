package io.sentry.util;

import java.util.Set;

/* JADX INFO: renamed from: io.sentry.util.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2575g {
    public static Throwable a(Throwable th) {
        u.c(th, "throwable cannot be null");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean b(Set set, Throwable th) {
        return set.contains(th.getClass());
    }
}
