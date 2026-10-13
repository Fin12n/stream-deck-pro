package io.sentry;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2523m implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f27223a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f27224b;

    public C2523m(J2 j8) {
        this.f27224b = j8;
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, H h8) {
        io.sentry.protocol.p pVarW0;
        String strK;
        Long lJ;
        if (!io.sentry.util.m.h(h8, UncaughtExceptionHandlerIntegration.a.class) || (pVarW0 = c2557s2.w0()) == null || (strK = pVarW0.k()) == null || (lJ = pVarW0.j()) == null) {
            return c2557s2;
        }
        Long l8 = (Long) this.f27223a.get(strK);
        if (l8 == null || l8.equals(lJ)) {
            this.f27223a.put(strK, lJ);
            return c2557s2;
        }
        this.f27224b.getLogger().c(EnumC2596z2.INFO, "Event %s has been dropped due to multi-threaded deduplication", c2557s2.G());
        io.sentry.util.m.n(h8, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
