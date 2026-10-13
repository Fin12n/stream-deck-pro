package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.J2;
import io.sentry.protocol.C2539a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f26274a = new io.sentry.android.core.util.a(new io.sentry.android.core.util.a.InterfaceC0587a() { // from class: io.sentry.android.core.S
        @Override // io.sentry.android.core.util.a.InterfaceC0587a
        public final Object a(Context context) {
            return Settings.Global.getString(context.getContentResolver(), "device_name");
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.util.q f26275b = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.android.core.T
        @Override // io.sentry.util.q.a
        public final Object a() {
            return Z.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f26276c = new io.sentry.android.core.util.a(new io.sentry.android.core.util.a.InterfaceC0587a() { // from class: io.sentry.android.core.U
        @Override // io.sentry.android.core.util.a.InterfaceC0587a
        public final Object a(Context context) {
            return Z.g(context);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f26277d = new io.sentry.android.core.util.a(new io.sentry.android.core.util.a.InterfaceC0587a() { // from class: io.sentry.android.core.V
        @Override // io.sentry.android.core.util.a.InterfaceC0587a
        public final Object a(Context context) {
            return Z.e(context);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f26278e = new io.sentry.android.core.util.a(new io.sentry.android.core.util.a.InterfaceC0587a() { // from class: io.sentry.android.core.W
        @Override // io.sentry.android.core.util.a.InterfaceC0587a
        public final Object a(Context context) {
            return Z.c(context);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f26279f = new io.sentry.android.core.util.a(new io.sentry.android.core.util.a.InterfaceC0587a() { // from class: io.sentry.android.core.X
        @Override // io.sentry.android.core.util.a.InterfaceC0587a
        public final Object a(Context context) {
            return Z.f(context);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f26280g = new io.sentry.android.core.util.a(new io.sentry.android.core.util.a.InterfaceC0587a() { // from class: io.sentry.android.core.Y
        @Override // io.sentry.android.core.util.a.InterfaceC0587a
        public final Object a(Context context) {
            return Z.a(context);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26282b;

        public a(boolean z8, String str) {
            this.f26281a = z8;
            this.f26282b = str;
        }

        public Map a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f26281a));
            String str = this.f26282b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f26284b;

        public b(boolean z8, String[] strArr) {
            this.f26283a = z8;
            this.f26284b = strArr;
        }

        public String[] a() {
            return this.f26284b;
        }

        public boolean b() {
            return this.f26283a;
        }
    }

    public static /* synthetic */ ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i8 = applicationInfo.labelRes;
            if (i8 != 0) {
                return context.getString(i8);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ Boolean d() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return Boolean.valueOf(runningAppProcessInfo.importance == 100);
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ PackageInfo e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo f(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static ApplicationInfo i(Context context, Q q8) {
        return q8.d() >= 33 ? (ApplicationInfo) f26279f.a(context) : (ApplicationInfo) f26280g.a(context);
    }

    public static String j(Context context) {
        return (String) f26278e.a(context);
    }

    public static String[] k() {
        return Build.SUPPORTED_ABIS;
    }

    public static String l(Context context) {
        return (String) f26274a.a(context);
    }

    public static DisplayMetrics m(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    public static String n(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static String o(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            iLogger.b(EnumC2596z2.ERROR, "Exception while attempting to read kernel information", e8);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo p(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(EnumC2596z2.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo q(Context context, int i8, ILogger iLogger, Q q8) {
        try {
            return q8.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i8)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i8);
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    public static PackageInfo r(Context context, Q q8) {
        return q8.d() >= 33 ? (PackageInfo) f26276c.a(context) : (PackageInfo) f26277d.a(context);
    }

    public static String s(PackageInfo packageInfo, Q q8) {
        return q8.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : t(packageInfo);
    }

    public static String t(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean u() {
        return ((Boolean) f26275b.a()).booleanValue();
    }

    public static Intent v(Context context, J2 j8, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return w(context, new Q(j8.getLogger()), broadcastReceiver, intentFilter);
    }

    public static Intent w(Context context, Q q8, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return q8.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 4) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static a x(Context context, ILogger iLogger, Q q8) {
        String str;
        try {
            PackageInfo packageInfoR = r(context, q8);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoR != null && packageManager != null) {
                str = packageInfoR.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(EnumC2596z2.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static b y(Context context, Q q8) {
        Bundle bundle;
        ApplicationInfo applicationInfoI = i(context, q8);
        PackageInfo packageInfoR = r(context, q8);
        if (packageInfoR == null) {
            return null;
        }
        return new b((applicationInfoI == null || (bundle = applicationInfoI.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfoR.splitNames);
    }

    public static void z(PackageInfo packageInfo, Q q8, d0 d0Var, C2539a c2539a) {
        c2539a.n(packageInfo.packageName);
        c2539a.q(packageInfo.versionName);
        c2539a.m(s(packageInfo, q8));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i8 = 0; i8 < strArr.length; i8++) {
                String str = strArr[i8];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i8] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        c2539a.s(map);
        if (d0Var != null) {
            try {
                b bVarM = d0Var.m();
                if (bVarM != null) {
                    c2539a.t(Boolean.valueOf(bVarM.b()));
                    if (bVarM.a() != null) {
                        c2539a.u(Arrays.asList(bVarM.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
