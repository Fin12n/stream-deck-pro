package p017b7;

import G6.h;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f15930a;

    public Y(F f8) {
        this.f15930a = f8;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        F f8 = this.f15930a;
        h hVar = h.f2820a;
        if (f8.g1(hVar)) {
            this.f15930a.L0(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f15930a.toString();
    }
}
