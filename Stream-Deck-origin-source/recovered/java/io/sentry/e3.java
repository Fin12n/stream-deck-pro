package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e3 {
    public static InterfaceC2492e0 a(io.sentry.util.r rVar, ILogger iLogger) {
        Class clsC;
        if (io.sentry.util.w.c() && rVar.a("io.sentry.opentelemetry.OtelSpanFactory", iLogger) && (clsC = rVar.c("io.sentry.opentelemetry.OtelSpanFactory", iLogger)) != null) {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof InterfaceC2492e0)) {
                    return (InterfaceC2492e0) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new C2531o();
    }
}
