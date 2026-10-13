package io.sentry.util;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.J2;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class r {
    public boolean a(String str, ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    public boolean b(String str, J2 j8) {
        return a(str, j8 != null ? j8.getLogger() : null);
    }

    public Class c(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e8) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC2596z2.DEBUG, "Class not available:" + str, e8);
            return null;
        } catch (UnsatisfiedLinkError e9) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC2596z2.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e9);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.b(EnumC2596z2.ERROR, "Failed to initialize " + str, th);
            return null;
        }
    }
}
