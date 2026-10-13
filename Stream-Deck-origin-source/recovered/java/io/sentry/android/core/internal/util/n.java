package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.android.core.Q;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f26437g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f26439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f26440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f26441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f26442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runtime f26443f;

    public n(Context context, Q q8, ILogger iLogger) {
        this(context, q8, iLogger, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", ajyWhveMDgQ.VCl}, Runtime.getRuntime());
    }

    public final boolean a() {
        for (String str : this.f26441d) {
            try {
                if (new File(str).exists()) {
                    return true;
                }
            } catch (RuntimeException e8) {
                this.f26440c.a(EnumC2596z2.ERROR, e8, "Error when trying to check if root file %s exists.", str);
            }
        }
        return false;
    }

    public final boolean b(ILogger iLogger) {
        Q q8 = new Q(iLogger);
        PackageManager packageManager = this.f26438a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f26442e) {
                try {
                    if (q8.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c() {
        Process processExec = null;
        try {
            try {
                processExec = this.f26443f.exec(new String[]{"/system/xbin/which", "su"});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f26437g));
                try {
                    boolean z8 = bufferedReader.readLine() != null;
                    bufferedReader.close();
                    processExec.destroy();
                    return z8;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th3;
            }
        } catch (IOException unused) {
            this.f26440c.c(EnumC2596z2.DEBUG, "SU isn't found on this Device.", new Object[0]);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th4) {
            this.f26440c.b(EnumC2596z2.DEBUG, "Error when trying to check if SU exists.", th4);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    public final boolean d() {
        String strA = this.f26439b.a();
        return strA != null && strA.contains("test-keys");
    }

    public boolean e() {
        return d() || a() || c() || b(this.f26440c);
    }

    public n(Context context, Q q8, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f26438a = (Context) io.sentry.util.u.c(context, "The application context is required.");
        this.f26439b = (Q) io.sentry.util.u.c(q8, "The BuildInfoProvider is required.");
        this.f26440c = (ILogger) io.sentry.util.u.c(iLogger, "The Logger is required.");
        this.f26441d = (String[]) io.sentry.util.u.c(strArr, "The root Files are required.");
        this.f26442e = (String[]) io.sentry.util.u.c(strArr2, "The root packages are required.");
        this.f26443f = (Runtime) io.sentry.util.u.c(runtime, "The Runtime is required.");
    }
}
