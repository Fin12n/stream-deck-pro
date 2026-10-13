package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B1 {
    public static Y a(io.sentry.util.r rVar, ILogger iLogger) {
        Y yB = b(rVar, iLogger);
        yB.a();
        return yB;
    }

    public static Y b(io.sentry.util.r rVar, ILogger iLogger) {
        Class clsC;
        if (io.sentry.util.w.c() && rVar.a("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger) && (clsC = rVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger)) != null) {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof Y)) {
                    return (Y) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C2527n();
    }
}
