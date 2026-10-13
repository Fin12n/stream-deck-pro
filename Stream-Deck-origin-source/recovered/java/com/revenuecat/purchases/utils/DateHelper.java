package com.revenuecat.purchases.utils;

import java.util.Date;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p008a7.c;
import p008a7.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DateHelper {
    public static final Companion Companion = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA$default, reason: not valid java name */
        public static /* synthetic */ DateActive m184isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                j8 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m185isDateActiveSxA4cEA(date, date2, j8);
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA, reason: not valid java name */
        public final DateActive m185isDateActiveSxA4cEA(Date date, Date requestDate, long j8) {
            t.g(requestDate, "requestDate");
            if (date == null) {
                return new DateActive(true, true);
            }
            boolean z8 = new Date().getTime() - requestDate.getTime() <= p008a7.a.z(j8);
            if (!z8) {
                requestDate = new Date();
            }
            return new DateActive(date.after(requestDate), z8);
        }

        private Companion() {
        }
    }

    static {
        p008a7.a.C0338a c0338a = p008a7.a.f13446b;
        ENTITLEMENT_GRACE_PERIOD = c.s(3, d.DAYS);
    }

    private DateHelper() {
    }
}
