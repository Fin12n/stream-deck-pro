package io.sentry.android.core;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class NdkIntegration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f26212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f26213b;

    public NdkIntegration(Class<?> cls) {
        this.f26212a = cls;
    }

    public final void b(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f26213b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f26212a;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.f26213b.getLogger().c(EnumC2596z2.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e8) {
            this.f26213b.getLogger().b(EnumC2596z2.ERROR, "Failed to invoke the SentryNdk.close method.", e8);
        } catch (Throwable th) {
            this.f26213b.getLogger().b(EnumC2596z2.ERROR, "Failed to close SentryNdk.", th);
        } finally {
            b(this.f26213b);
        }
    }

    @Override // io.sentry.InterfaceC2516k0
    public final void o(io.sentry.X x8, J2 j8) {
        io.sentry.util.u.c(x8, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26213b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f26213b.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f26212a == null) {
            b(this.f26213b);
            return;
        }
        if (this.f26213b.getCacheDirPath() == null) {
            this.f26213b.getLogger().c(EnumC2596z2.ERROR, "No cache dir path is defined in options.", new Object[0]);
            b(this.f26213b);
            return;
        }
        try {
            this.f26212a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f26213b);
            this.f26213b.getLogger().c(enumC2596z2, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.o.a("Ndk");
        } catch (NoSuchMethodException e8) {
            b(this.f26213b);
            this.f26213b.getLogger().b(EnumC2596z2.ERROR, "Failed to invoke the SentryNdk.init method.", e8);
        } catch (Throwable th) {
            b(this.f26213b);
            this.f26213b.getLogger().b(EnumC2596z2.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
