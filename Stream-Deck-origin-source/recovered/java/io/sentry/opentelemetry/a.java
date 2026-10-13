package io.sentry.opentelemetry;

import io.sentry.E0;
import io.sentry.E2;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.util.A;
import io.sentry.util.r;
import io.sentry.util.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static void a(J2 j8) {
        if (w.c()) {
            Iterator it = b(j8).iterator();
            while (it.hasNext()) {
                j8.addIgnoredSpanOrigin((String) it.next());
            }
        }
    }

    public static List b(J2 j8) {
        E2 openTelemetryMode = j8.getOpenTelemetryMode();
        return E2.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : A.a(openTelemetryMode);
    }

    public static void c(J2 j8, r rVar) {
        if (w.c()) {
            if (E2.AUTO.equals(j8.getOpenTelemetryMode())) {
                if (rVar.a("io.sentry.opentelemetry.agent.AgentMarker", E0.e())) {
                    j8.getLogger().c(EnumC2596z2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    j8.setOpenTelemetryMode(E2.AGENT);
                } else if (rVar.a("io.sentry.opentelemetry.agent.AgentlessMarker", E0.e())) {
                    j8.getLogger().c(EnumC2596z2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    j8.setOpenTelemetryMode(E2.AGENTLESS);
                } else if (rVar.a("io.sentry.opentelemetry.agent.AgentlessSpringMarker", E0.e())) {
                    j8.getLogger().c(EnumC2596z2.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    j8.setOpenTelemetryMode(E2.AGENTLESS_SPRING);
                }
            }
        }
    }
}
