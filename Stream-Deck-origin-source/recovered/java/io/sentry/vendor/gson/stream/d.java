package io.sentry.vendor.gson.stream;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends IOException {
    public d(String str) {
        super(str);
    }

    public d(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public d(Throwable th) {
        initCause(th);
    }
}
