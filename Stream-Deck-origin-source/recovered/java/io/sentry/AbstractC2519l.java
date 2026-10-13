package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: io.sentry.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2519l {
    public static long a(Date date) {
        return h(date.getTime());
    }

    public static double b(Date date) {
        return i(date.getTime());
    }

    public static Date c() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f27764a).getTime();
    }

    public static Date d(long j8) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f27764a);
        calendar.setTimeInMillis(j8);
        return calendar.getTime();
    }

    public static Date e(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date f(String str) {
        try {
            return d(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String g(Date date) {
        return io.sentry.vendor.gson.internal.bind.util.a.b(date, true);
    }

    public static long h(long j8) {
        return j8 * 1000000;
    }

    public static double i(double d8) {
        return d8 / 1000.0d;
    }

    public static Date j(long j8) {
        return d(Double.valueOf(k(j8)).longValue());
    }

    public static double k(double d8) {
        return d8 / 1000000.0d;
    }

    public static double l(long j8) {
        return j8 / 1.0E9d;
    }

    public static long m(long j8) {
        return j8 * 1000000000;
    }

    public static Date n(U1 u8) {
        if (u8 == null) {
            return null;
        }
        return o(u8);
    }

    public static Date o(U1 u8) {
        return j(u8.j());
    }
}
