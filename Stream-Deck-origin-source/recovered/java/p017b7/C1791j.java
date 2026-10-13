package p017b7;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: b7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1791j implements InterfaceC1793k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f15962a;

    public C1791j(Future<?> future) {
        this.f15962a = future;
    }

    @Override // p017b7.InterfaceC1793k
    public void a(Throwable th) {
        if (th != null) {
            this.f15962a.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f15962a + ']';
    }
}
