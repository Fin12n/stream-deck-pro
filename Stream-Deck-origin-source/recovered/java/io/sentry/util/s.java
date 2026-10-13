package io.sentry.util;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static void a(Class cls, Object obj, ILogger iLogger) {
        iLogger.c(EnumC2596z2.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
