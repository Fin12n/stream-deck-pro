package io.sentry.android.core.cache;

import io.sentry.EnumC2596z2;
import io.sentry.H;
import io.sentry.J2;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.W1;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.g;
import io.sentry.cache.c;
import io.sentry.cache.f;
import io.sentry.transport.p;
import io.sentry.util.C2576h;
import io.sentry.util.m;
import io.sentry.util.u;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f26308i;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, io.sentry.android.core.internal.util.b.a());
    }

    public static /* synthetic */ void V(b bVar, SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar2) {
        bVar.getClass();
        Long lC = bVar2.c();
        sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "Writing last reported ANR marker with timestamp %d", lC);
        bVar.Y(lC);
    }

    public static boolean W(J2 j8) {
        String outboxPath = j8.getOutboxPath();
        if (outboxPath == null) {
            j8.getLogger().c(EnumC2596z2.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean zExists = file.exists();
            if (!zExists || file.delete()) {
                return zExists;
            }
            j8.getLogger().c(EnumC2596z2.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zExists;
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    public static Long X(J2 j8) {
        File file = new File((String) u.c(j8.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
            if (!file.exists() || !file.canRead()) {
                j8.getLogger().c(EnumC2596z2.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
                return null;
            }
            String strC = C2576h.c(file);
            if (strC.equals("null")) {
                return null;
            }
            return Long.valueOf(Long.parseLong(strC.trim()));
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Error reading last ANR marker", th);
        }
    }

    public final void Y(Long l8) {
        String cacheDirPath = this.f27015a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l8).getBytes(c.f27014e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Error writing the ANR marker to the disk", th3);
        }
    }

    public final void Z() {
        String outboxPath = this.f27015a.getOutboxPath();
        if (outboxPath == null) {
            this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public void p(W1 w8, H h8) {
        super.p(w8, h8);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f27015a;
        g gVarN = io.sentry.android.core.performance.f.m().n();
        if (m.h(h8, UncaughtExceptionHandlerIntegration.a.class) && gVarN.x()) {
            long currentTimeMillis = this.f26308i.getCurrentTimeMillis() - gVarN.u();
            if (currentTimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(currentTimeMillis));
                Z();
            }
        }
        m.k(h8, AnrV2Integration.b.class, new m.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                b.V(this.f26306a, sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
    }

    public b(SentryAndroidOptions sentryAndroidOptions, p pVar) {
        super(sentryAndroidOptions, (String) u.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f26308i = pVar;
    }
}
