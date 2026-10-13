package p011b1;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: b1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1756d extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1756d f15735a = new C1756d();

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
