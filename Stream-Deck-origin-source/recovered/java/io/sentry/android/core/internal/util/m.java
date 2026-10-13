package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    public static boolean a(Context context, String str) {
        io.sentry.util.u.c(context, ajyWhveMDgQ.EXJTlWQmUCFqKbw);
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
