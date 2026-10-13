package com.revenuecat.purchases.common;

import p008a7.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        p008a7.a.C0338a c0338a = p008a7.a.f13446b;
        d dVar = d.MILLISECONDS;
        jitterDelay = p008a7.c.t(5000L, dVar);
        jitterLongDelay = p008a7.c.t(10000L, dVar);
    }

    private DispatcherConstants() {
    }

    /* JADX INFO: renamed from: getJitterDelay-UwyO8pc, reason: not valid java name */
    public final long m155getJitterDelayUwyO8pc() {
        return jitterDelay;
    }

    /* JADX INFO: renamed from: getJitterLongDelay-UwyO8pc, reason: not valid java name */
    public final long m156getJitterLongDelayUwyO8pc() {
        return jitterLongDelay;
    }
}
