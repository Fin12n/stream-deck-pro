package io.sentry.android.core.internal.util;

import io.sentry.protocol.C2543e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static C2543e.b a(int i8) {
        if (i8 == 1) {
            return C2543e.b.PORTRAIT;
        }
        if (i8 != 2) {
            return null;
        }
        return C2543e.b.LANDSCAPE;
    }
}
