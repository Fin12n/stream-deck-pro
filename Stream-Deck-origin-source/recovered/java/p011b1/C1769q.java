package p011b1;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: b1.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1769q extends CancellationException {
    public C1769q(long j8) {
        super("Timed out waiting for " + j8 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
