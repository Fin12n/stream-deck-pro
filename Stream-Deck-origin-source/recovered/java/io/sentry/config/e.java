package io.sentry.config;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ILogger f27065b;

    public e(String str, ILogger iLogger) {
        this.f27064a = str;
        this.f27065b = iLogger;
    }

    public Properties a() {
        try {
            File file = new File(this.f27064a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            this.f27065b.a(EnumC2596z2.ERROR, e8, "Failed to load Sentry configuration from file: %s", this.f27064a);
            return null;
        }
    }
}
