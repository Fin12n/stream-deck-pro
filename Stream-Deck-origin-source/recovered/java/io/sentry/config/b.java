package io.sentry.config;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.util.C2570b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f27061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f27062c;

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f27060a = str;
        this.f27061b = C2570b.a(classLoader);
        this.f27062c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f27061b.getResourceAsStream(this.f27060a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e8) {
            this.f27062c.a(EnumC2596z2.ERROR, e8, "Failed to load Sentry configuration from classpath resource: %s", this.f27060a);
            return null;
        }
    }

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
