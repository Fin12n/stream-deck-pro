package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class RateLimiter {
    private final long[] callTimestamps;
    private int index;
    private final int maxCallInclusive;
    private final int maxCallsInPeriod;
    private final long periodSeconds;

    public /* synthetic */ RateLimiter(int i8, long j8, AbstractC2633k abstractC2633k) {
        this(i8, j8);
    }

    public final int getMaxCallsInPeriod() {
        return this.maxCallsInPeriod;
    }

    /* JADX INFO: renamed from: getPeriodSeconds-UwyO8pc, reason: not valid java name */
    public final long m188getPeriodSecondsUwyO8pc() {
        return this.periodSeconds;
    }

    public final synchronized boolean shouldProceed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i8 = (this.index + 1) % this.maxCallInclusive;
        long j8 = this.callTimestamps[i8];
        if (j8 != 0 && jCurrentTimeMillis - j8 <= p008a7.a.z(this.periodSeconds)) {
            return false;
        }
        this.callTimestamps[this.index] = jCurrentTimeMillis;
        this.index = i8;
        return true;
    }

    private RateLimiter(int i8, long j8) {
        this.maxCallsInPeriod = i8;
        this.periodSeconds = j8;
        int i9 = i8 + 1;
        this.maxCallInclusive = i9;
        this.callTimestamps = new long[i9];
    }
}
