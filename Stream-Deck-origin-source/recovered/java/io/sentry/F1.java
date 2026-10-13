package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface F1 {
    static /* synthetic */ void b(ILogger iLogger, String str, AbstractC2558t abstractC2558t, File file) {
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        iLogger.c(enumC2596z2, "Started processing cached files from %s", str);
        abstractC2558t.d(file);
        iLogger.c(enumC2596z2, "Finished processing cached files from %s", str);
    }

    default C1 a(final AbstractC2558t abstractC2558t, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new C1() { // from class: io.sentry.E1
            @Override // io.sentry.C1
            public final void a() {
                F1.b(iLogger, str, abstractC2558t, file);
            }
        };
    }

    C1 c(X x8, J2 j8);

    default boolean d(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(EnumC2596z2.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }
}
