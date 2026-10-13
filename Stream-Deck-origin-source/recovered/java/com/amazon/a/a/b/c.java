package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f16368A = "deviceDisplay";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f16369B = "deviceBrand";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f16370C = "deviceBoard";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f16371D = "androidVersion";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f16372E = "deviceModel";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f16373F = "packageFilePath";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f16374G = "packageName";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f16375H = "packageVersionName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16376a = new com.amazon.a.a.o.c("CrashReport");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f16377b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16378c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f16379d = "SHA1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16380e = "crashTime";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f16381f = "UTF-8";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f16382g = "crashId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f16383h = "threadDump";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f16384i = "stackTrace";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f16385j = "threadAllocSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f16386k = "threadAllocCount";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f16387l = "nativeHeapFreeSize";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f16388m = "nativeHeapSize";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f16389n = "memLowThreshold";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f16390o = "memLowFlag";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f16391p = "availableInternalMemorySize";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f16392q = "totalInternalMemorySize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f16393r = "deviceUser";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f16394s = "deviceType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f16395t = "deviceTime";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f16396u = "deviceTags";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f16397v = "deviceProduct";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f16398w = "deviceManufacturer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f16399x = "deviceId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f16400y = "deviceHost";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f16401z = "deviceFingerPrint";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final HashMap<String, String> f16402I = new LinkedHashMap();

    public c(Application application, Throwable th) {
        try {
            a(application, th);
        } catch (Throwable th2) {
            if (com.amazon.a.a.o.c.f16783b) {
                f16376a.b("Error collection crash report details", th2);
            }
        }
    }

    private void a(Application application, Throwable th) {
        b();
        a(application);
        c(application);
        a(th);
        e();
        f();
    }

    private void b() {
        this.f16402I.put(f16380e, new Date().toString());
    }

    private void c(Application application) {
        this.f16402I.put(f16372E, Build.MODEL);
        this.f16402I.put(f16371D, Build.VERSION.RELEASE);
        this.f16402I.put(f16370C, Build.BOARD);
        this.f16402I.put(f16369B, Build.BRAND);
        this.f16402I.put(f16368A, Build.DISPLAY);
        this.f16402I.put(f16401z, Build.FINGERPRINT);
        this.f16402I.put(f16400y, Build.HOST);
        this.f16402I.put(f16399x, Build.ID);
        this.f16402I.put(f16398w, Build.MANUFACTURER);
        this.f16402I.put(f16397v, Build.PRODUCT);
        this.f16402I.put(f16396u, Build.TAGS);
        this.f16402I.put(f16395t, Long.toString(Build.TIME));
        this.f16402I.put(f16394s, Build.TYPE);
        this.f16402I.put(f16393r, Build.USER);
        this.f16402I.put(f16392q, Long.toString(d()));
        this.f16402I.put(f16391p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.f16402I.put(f16390o, Boolean.toString(memoryInfo.lowMemory));
            this.f16402I.put(f16389n, Long.toString(memoryInfo.threshold));
        }
        this.f16402I.put(f16388m, Long.toString(Debug.getNativeHeapSize()));
        this.f16402I.put(f16387l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.f16402I.put(f16386k, Long.toString(Debug.getThreadAllocCount()));
        this.f16402I.put(f16385j, Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    private void f() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16402I.get(f16374G));
            sb.append(this.f16402I.get(f16375H));
            sb.append(this.f16402I.get(f16371D));
            String str = this.f16402I.get(f16384i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f16378c).matcher(str);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
            }
            this.f16402I.put(f16382g, new BigInteger(MessageDigest.getInstance(f16379d).digest(sb.toString().getBytes(f16381f))).abs().toString(16));
        } catch (Exception e8) {
            if (com.amazon.a.a.o.c.f16783b) {
                f16376a.b("Error capturing crash id", e8);
            }
        }
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e8) {
            if (!com.amazon.a.a.o.c.f16783b) {
                return null;
            }
            f16376a.b("Unable to fetch package info", e8);
            return null;
        }
    }

    private void e() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb.append("Thread : " + key.getId());
            if (!e.a(key.getName())) {
                sb.append("/" + key.getName());
            }
            sb.append("\n");
            sb.append("isAlive : " + key.isAlive() + "\n");
            sb.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb.append(SZCvugJaXc.JVLIcqjbLh + key.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : value) {
                sb.append("\tat " + stackTraceElement + "\n");
            }
            sb.append("\n\n");
        }
        this.f16402I.put(f16383h, sb.toString());
    }

    private void a(Application application) {
        PackageInfo packageInfoB = b(application);
        if (packageInfoB == null) {
            return;
        }
        this.f16402I.put(f16375H, packageInfoB.versionName);
        this.f16402I.put(f16374G, packageInfoB.packageName);
        this.f16402I.put(f16373F, application.getFilesDir().getAbsolutePath());
    }

    private void a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb.append(stringWriter.toString());
        sb.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb.append(stringWriter.toString());
            cause = cause.getCause();
            sb.append("\n\n");
        }
        printWriter.close();
        this.f16402I.put(f16384i, sb.toString());
    }

    public Map<String, String> a() {
        return this.f16402I;
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
