package io.sentry.internal.debugmeta;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.util.C2570b;
import io.sentry.util.C2572d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILogger f27180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f27181b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f27181b.getResources(C2572d.f27725a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f27180a.c(EnumC2596z2.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e8) {
                    this.f27180a.a(EnumC2596z2.ERROR, e8, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e9) {
            this.f27180a.a(EnumC2596z2.ERROR, e9, "Failed to load %s", C2572d.f27725a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f27180a.c(EnumC2596z2.INFO, "No %s file was found.", C2572d.f27725a);
        return null;
    }

    public c(ILogger iLogger, ClassLoader classLoader) {
        this.f27180a = iLogger;
        this.f27181b = C2570b.a(classLoader);
    }
}
