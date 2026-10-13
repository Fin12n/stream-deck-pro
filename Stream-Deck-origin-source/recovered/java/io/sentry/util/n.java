package io.sentry.util;

import io.sentry.J2;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static boolean a(J2 j8, J2 j9, boolean z8) {
        return !z8 || j8 == null || j9.isForceInit() || j8.getInitPriority().ordinal() <= j9.getInitPriority().ordinal();
    }
}
