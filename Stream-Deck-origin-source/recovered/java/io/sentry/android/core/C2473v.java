package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C2485c1;

/* JADX INFO: renamed from: io.sentry.android.core.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2473v implements io.sentry.U {
    @Override // io.sentry.U
    public void c(C2485c1 c2485c1) {
        c2485c1.b(new io.sentry.A0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize()));
    }

    @Override // io.sentry.U
    public void e() {
    }
}
