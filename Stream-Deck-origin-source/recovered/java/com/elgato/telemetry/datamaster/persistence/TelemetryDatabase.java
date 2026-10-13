package com.elgato.telemetry.datamaster.persistence;

import Z3.d;
import android.content.Context;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p193w2.q;
import p193w2.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class TelemetryDatabase extends r {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f17679p = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final TelemetryDatabase a(Context context, boolean z8) {
            t.g(context, "context");
            return z8 ? (TelemetryDatabase) q.c(context, TelemetryDatabase.class).a() : (TelemetryDatabase) q.a(context, TelemetryDatabase.class, "elgato_telemetry.db").b().a();
        }

        public a() {
        }
    }

    public abstract Z3.a D();

    public abstract d E();
}
