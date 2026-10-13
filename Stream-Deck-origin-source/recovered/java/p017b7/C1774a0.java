package p017b7;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: b7.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1774a0 implements InterfaceC1776b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future f15938a;

    public C1774a0(Future<?> future) {
        this.f15938a = future;
    }

    @Override // p017b7.InterfaceC1776b0
    public void d() {
        this.f15938a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f15938a + ']';
    }
}
