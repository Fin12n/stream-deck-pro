package io.sentry.transport;

import io.sentry.H;
import io.sentry.W1;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements io.sentry.cache.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f27690a = new s();

    public static s c() {
        return f27690a;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.g
    public void e(W1 w8) {
    }

    @Override // io.sentry.cache.g
    public void p(W1 w8, H h8) {
    }
}
