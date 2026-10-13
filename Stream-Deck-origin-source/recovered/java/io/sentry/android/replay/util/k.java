package io.sentry.android.replay.util;

import io.sentry.util.x;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final boolean a(x xVar, Double d8) {
        t.g(xVar, "<this>");
        return d8 != null && d8.doubleValue() >= xVar.d();
    }
}
