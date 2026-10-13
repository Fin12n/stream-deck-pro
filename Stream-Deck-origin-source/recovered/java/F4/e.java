package F4;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f2400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f2401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f2402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f2403d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2403d == null) {
            boolean z8 = false;
            if (g.f() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z8 = true;
            }
            f2403d = Boolean.valueOf(z8);
        }
        return f2403d.booleanValue();
    }

    public static boolean b(Context context) {
        return f(context.getPackageManager());
    }

    public static boolean c(Context context) {
        if (b(context) && !g.e()) {
            return true;
        }
        if (d(context)) {
            return !g.f() || g.h();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f2401b == null) {
            boolean z8 = false;
            if (g.d() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z8 = true;
            }
            f2401b = Boolean.valueOf(z8);
        }
        return f2401b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f2402c == null) {
            boolean z8 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z8 = false;
            }
            f2402c = Boolean.valueOf(z8);
        }
        return f2402c.booleanValue();
    }

    public static boolean f(PackageManager packageManager) {
        if (f2400a == null) {
            boolean z8 = false;
            if (g.c() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z8 = true;
            }
            f2400a = Boolean.valueOf(z8);
        }
        return f2400a.booleanValue();
    }
}
