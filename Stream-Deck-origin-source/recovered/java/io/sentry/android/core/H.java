package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC2516k0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H {
    public static InterfaceC2516k0 a(Context context, Q q8) {
        return q8.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
