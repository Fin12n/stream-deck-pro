package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.AbstractC2519l;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.J2;
import io.sentry.protocol.C2543e;
import io.sentry.util.C2569a;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile d0 f26311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2569a f26312j = new C2569a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f26314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f26315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f26316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z.a f26317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Z.b f26318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.sentry.protocol.k f26319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f26320h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26321a;

        static {
            int[] iArr = new int[io.sentry.M.a.values().length];
            f26321a = iArr;
            try {
                iArr[io.sentry.M.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26321a[io.sentry.M.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f26313a = context;
        this.f26314b = sentryAndroidOptions;
        Q q8 = new Q(sentryAndroidOptions.getLogger());
        this.f26315c = q8;
        io.sentry.android.core.internal.util.g.a().c();
        this.f26319g = u();
        this.f26316d = q8.f();
        this.f26317e = Z.x(context, sentryAndroidOptions.getLogger(), q8);
        this.f26318f = Z.y(context, q8);
        ActivityManager.MemoryInfo memoryInfoP = Z.p(context, sentryAndroidOptions.getLogger());
        if (memoryInfoP != null) {
            this.f26320h = Long.valueOf(memoryInfoP.totalMem);
        } else {
            this.f26320h = null;
        }
    }

    public static Float c(Intent intent, J2 j8) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static d0 i(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f26311i == null) {
            InterfaceC2480b0 interfaceC2480b0A = f26312j.a();
            try {
                if (f26311i == null) {
                    f26311i = new d0(Z.h(context), sentryAndroidOptions);
                }
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            } catch (Throwable th) {
                if (interfaceC2480b0A != null) {
                    try {
                        interfaceC2480b0A.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return f26311i;
    }

    public static Boolean t(Intent intent, J2 j8) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z8 = true;
            if (intExtra != 1 && intExtra != 2) {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        } catch (Throwable th) {
            j8.getLogger().b(EnumC2596z2.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    public C2543e a(boolean z8, boolean z9) {
        C2543e c2543e = new C2543e();
        if (this.f26314b.isSendDefaultPii()) {
            c2543e.d0(Z.l(this.f26313a));
        }
        c2543e.Z(Build.MANUFACTURER);
        c2543e.O(Build.BRAND);
        c2543e.T(Z.n(this.f26314b.getLogger()));
        c2543e.b0(Build.MODEL);
        c2543e.c0(Build.ID);
        c2543e.K(Z.k());
        c2543e.f0(k());
        Boolean bool = this.f26316d;
        if (bool != null) {
            c2543e.m0(bool);
        }
        DisplayMetrics displayMetricsM = Z.m(this.f26313a, this.f26314b.getLogger());
        if (displayMetricsM != null) {
            c2543e.l0(Integer.valueOf(displayMetricsM.widthPixels));
            c2543e.k0(Integer.valueOf(displayMetricsM.heightPixels));
            c2543e.i0(Float.valueOf(displayMetricsM.density));
            c2543e.j0(Integer.valueOf(displayMetricsM.densityDpi));
        }
        c2543e.N(e());
        c2543e.o0(n());
        if (c2543e.I() == null) {
            c2543e.W(f());
        }
        Locale locale = Locale.getDefault();
        if (c2543e.J() == null) {
            c2543e.X(locale.toString());
        }
        List listC = io.sentry.android.core.internal.util.g.a().c();
        if (!listC.isEmpty()) {
            c2543e.h0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            c2543e.g0(Integer.valueOf(listC.size()));
        }
        c2543e.a0(this.f26320h);
        if (z8 && this.f26314b.isCollectAdditionalContext()) {
            v(c2543e, z9);
        }
        return c2543e;
    }

    public final Intent b() {
        return Z.w(this.f26313a, this.f26315c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public final Float d(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    public final Date e() {
        try {
            return AbstractC2519l.d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e8) {
            this.f26314b.getLogger().a(EnumC2596z2.ERROR, e8, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    public final String f() {
        try {
            return i0.a(this.f26313a);
        } catch (Throwable th) {
            this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    public final File g(File file) {
        File[] externalFilesDirs = this.f26313a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f26314b.getLogger().c(EnumC2596z2.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    public final StatFs h(File file) {
        try {
            File fileG = g(file);
            if (fileG != null) {
                return new StatFs(fileG.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f26314b.getLogger().c(EnumC2596z2.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public io.sentry.protocol.k j() {
        return this.f26319g;
    }

    public final C2543e.b k() {
        C2543e.b bVarA;
        Throwable th;
        try {
            bVarA = io.sentry.android.core.internal.util.i.a(this.f26313a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f26314b.getLogger().c(EnumC2596z2.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th2) {
                th = th2;
                this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting device orientation.", th);
                return bVarA;
            }
        } catch (Throwable th3) {
            bVarA = null;
            th = th3;
        }
    }

    public Z.a l() {
        return this.f26317e;
    }

    public Z.b m() {
        return this.f26318f;
    }

    public final TimeZone n() {
        if (this.f26315c.d() >= 24) {
            LocaleList locales = this.f26313a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    public final Long o(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    public final Long p(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    public Long q() {
        return this.f26320h;
    }

    public final Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    public final Long s(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f26314b.getLogger().b(EnumC2596z2.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    public final io.sentry.protocol.k u() {
        io.sentry.protocol.k kVar = new io.sentry.protocol.k();
        kVar.j("Android");
        kVar.m(Build.VERSION.RELEASE);
        kVar.h(Build.DISPLAY);
        String strO = Z.o(this.f26314b.getLogger());
        if (strO != null) {
            kVar.i(strO);
        }
        if (this.f26314b.isEnableRootCheck()) {
            kVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.n(this.f26313a, this.f26315c, this.f26314b.getLogger()).e()));
        }
        return kVar;
    }

    public final void v(C2543e c2543e, boolean z8) {
        Boolean bool;
        Intent intentB = b();
        if (intentB != null) {
            c2543e.L(c(intentB, this.f26314b));
            c2543e.P(t(intentB, this.f26314b));
            c2543e.M(d(intentB));
        }
        int i8 = a.f26321a[this.f26314b.getConnectionStatusProvider().b().ordinal()];
        if (i8 != 1) {
            bool = i8 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        c2543e.e0(bool);
        ActivityManager.MemoryInfo memoryInfoP = Z.p(this.f26313a, this.f26314b.getLogger());
        if (memoryInfoP != null && z8) {
            c2543e.U(Long.valueOf(memoryInfoP.availMem));
            c2543e.Y(Boolean.valueOf(memoryInfoP.lowMemory));
        }
        File externalFilesDir = this.f26313a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            c2543e.n0(p(statFs));
            c2543e.V(s(statFs));
        }
        StatFs statFsH = h(externalFilesDir);
        if (statFsH != null) {
            c2543e.S(o(statFsH));
            c2543e.R(r(statFsH));
        }
        if (c2543e.H() == null) {
            c2543e.Q(this.f26314b.getConnectionStatusProvider().a());
        }
    }
}
