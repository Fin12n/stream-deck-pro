package com.revenuecat.purchases.models;

import C6.v;
import D6.M;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionOptionsKt {
    private static final int DAYS_IN_DAY = 1;
    private static final int DAYS_IN_MONTH = 30;
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_YEAR = 365;
    private static final Map<Period.Unit, Integer> DAYS_IN_UNIT = M.j(v.a(Period.Unit.DAY, 1), v.a(Period.Unit.WEEK, 7), v.a(Period.Unit.MONTH, 30), v.a(Period.Unit.YEAR, Integer.valueOf(DAYS_IN_YEAR)));
}
