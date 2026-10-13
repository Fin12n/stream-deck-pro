package com.revenuecat.purchases.common;

import java.util.Date;
import kotlin.jvm.internal.t;
import p008a7.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DurationExtensionsKt {
    public static final long between(p008a7.a.C0338a c0338a, Date startTime, Date endTime) {
        t.g(c0338a, "<this>");
        t.g(startTime, "startTime");
        t.g(endTime, "endTime");
        return p008a7.c.t(endTime.getTime() - startTime.getTime(), d.MILLISECONDS);
    }

    /* JADX INFO: renamed from: min-QTBD994, reason: not valid java name */
    public static final long m157minQTBD994(long j8, long j9) {
        return p008a7.a.m(j8, j9) < 0 ? j8 : j9;
    }
}
