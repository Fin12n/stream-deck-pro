package io.sentry.util;

import io.sentry.r3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static r3 a(r3 r3Var) {
        if (r3Var.c() != null) {
            return r3Var;
        }
        return new r3(r3Var.e(), r3Var.d(), b(null, r3Var.d(), r3Var.e()), r3Var.b(), r3Var.a());
    }

    public static Double b(Double d8, Double d9, Boolean bool) {
        if (d8 != null) {
            return d8;
        }
        double d10 = z.a().d();
        if (d9 == null || bool == null) {
            return Double.valueOf(d10);
        }
        return bool.booleanValue() ? Double.valueOf(d10 * d9.doubleValue()) : Double.valueOf(d9.doubleValue() + (d10 * (1.0d - d9.doubleValue())));
    }

    public static boolean c(Double d8) {
        return d(d8, true);
    }

    public static boolean d(Double d8, boolean z8) {
        if (d8 == null) {
            return z8;
        }
        return !d8.isNaN() && d8.doubleValue() >= 0.0d && d8.doubleValue() <= 1.0d;
    }

    public static boolean e(Double d8) {
        return d(d8, true);
    }

    public static boolean f(Double d8) {
        return g(d8, true);
    }

    public static boolean g(Double d8, boolean z8) {
        return d(d8, z8);
    }
}
