package io.sentry;

import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: io.sentry.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2489d1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f27074c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f27076b;

    public RunnableC2489d1(J2 j8, X x8) {
        this.f27075a = j8;
        this.f27076b = x8;
    }

    public final Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f27074c));
            try {
                String line = bufferedReader.readLine();
                this.f27075a.getLogger().c(EnumC2596z2.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateE = AbstractC2519l.e(line);
                bufferedReader.close();
                return dateE;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            this.f27075a.getLogger().b(EnumC2596z2.ERROR, "Error reading the crash marker file.", e8);
            return null;
        } catch (IllegalArgumentException e9) {
            this.f27075a.getLogger().a(EnumC2596z2.ERROR, e9, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f27075a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f27075a.getLogger().c(EnumC2596z2.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f27075a.isEnableAutoSessionTracking()) {
            this.f27075a.getLogger().c(EnumC2596z2.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f27075a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).R()) {
            this.f27075a.getLogger().c(EnumC2596z2.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileO = io.sentry.cache.f.O(cacheDirPath);
        InterfaceC2484c0 serializer = this.f27075a.getSerializer();
        if (fileO.exists()) {
            this.f27075a.getLogger().c(EnumC2596z2.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileO), f27074c));
                try {
                    Y2 y8 = (Y2) serializer.c(bufferedReader, Y2.class);
                    if (y8 == null) {
                        this.f27075a.getLogger().c(EnumC2596z2.ERROR, "Stream from path %s resulted in a null envelope.", fileO.getAbsolutePath());
                    } else {
                        File file = new File(this.f27075a.getCacheDirPath(), ajyWhveMDgQ.uoDnCFUybTz);
                        Date date = null;
                        if (file.exists()) {
                            this.f27075a.getLogger().c(EnumC2596z2.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            if (!file.delete()) {
                                this.f27075a.getLogger().c(EnumC2596z2.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            y8.p(Y2.b.Crashed, null, true);
                            date = dateA;
                        }
                        if (y8.f() == null) {
                            y8.d(date);
                        }
                        this.f27076b.D(W1.a(serializer, y8, this.f27075a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.f27075a.getLogger().b(EnumC2596z2.ERROR, "Error processing previous session.", th3);
            }
            if (fileO.delete()) {
                return;
            }
            this.f27075a.getLogger().c(EnumC2596z2.WARNING, kDsnNkYbBsI.VVPHt, new Object[0]);
        }
    }
}
