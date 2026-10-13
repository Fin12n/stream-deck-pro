package com.revenuecat.purchases.common.caching;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.t;
import p008a7.a;
import p008a7.c;
import p008a7.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DateExtensionsKt {
    private static final long CACHE_REFRESH_PERIOD_IN_BACKGROUND;
    private static final long CACHE_REFRESH_PERIOD_IN_FOREGROUND;

    static {
        a.C0338a c0338a = a.f13446b;
        CACHE_REFRESH_PERIOD_IN_FOREGROUND = c.s(5, d.MINUTES);
        CACHE_REFRESH_PERIOD_IN_BACKGROUND = c.s(25, d.HOURS);
    }

    public static final boolean isCacheStale(Date date, boolean z8, DateProvider dateProvider) {
        t.g(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.CHECKING_IF_CACHE_STALE, Arrays.copyOf(new Object[]{Boolean.valueOf(z8)}, 1));
        t.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return m158isCacheStale8Mi8wO0(date, z8 ? CACHE_REFRESH_PERIOD_IN_BACKGROUND : CACHE_REFRESH_PERIOD_IN_FOREGROUND, dateProvider);
    }

    public static /* synthetic */ boolean isCacheStale$default(Date date, boolean z8, DateProvider dateProvider, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return isCacheStale(date, z8, dateProvider);
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0, reason: not valid java name */
    public static final boolean m158isCacheStale8Mi8wO0(Date date, long j8, DateProvider dateProvider) {
        t.g(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        a.C0338a c0338a = a.f13446b;
        return a.m(c.t(dateProvider.getNow().getTime() - date.getTime(), d.MILLISECONDS), j8) >= 0;
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ boolean m159isCacheStale8Mi8wO0$default(Date date, long j8, DateProvider dateProvider, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return m158isCacheStale8Mi8wO0(date, j8, dateProvider);
    }
}
