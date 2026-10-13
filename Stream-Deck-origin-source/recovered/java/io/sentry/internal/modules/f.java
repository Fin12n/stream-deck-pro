package io.sentry.internal.modules;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.util.C2570b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ClassLoader f27199d;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f27199d.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map mapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return mapC;
                }
                this.f27196a.c(EnumC2596z2.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            this.f27196a.b(EnumC2596z2.INFO, "Access to resources failed.", e8);
        } catch (SecurityException e9) {
            this.f27196a.b(EnumC2596z2.INFO, "Access to resources denied.", e9);
        }
    }

    public f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f27199d = C2570b.a(classLoader);
    }
}
