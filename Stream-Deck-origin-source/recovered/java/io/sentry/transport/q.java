package io.sentry.transport;

import io.sentry.H;
import io.sentry.W1;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface q extends Closeable {
    void a(boolean z8);

    A m();

    void m0(W1 w8, H h8);

    default boolean n() {
        return true;
    }

    void p(long j8);

    default void u1(W1 w8) {
        m0(w8, new H());
    }
}
