package p080i7;

import G6.g;
import G6.h;
import W6.n;
import java.util.concurrent.Executor;
import p017b7.AbstractC1796l0;
import p017b7.F;
import p062g7.H;
import p062g7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1796l0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24772d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F f24773e = m.f24793c.k1(J.e("kotlinx.coroutines.io.parallelism", n.d(64, H.a()), 0, 0, 12, null));

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        f24773e.L0(gVar, runnable);
    }

    @Override // p017b7.F
    public void T0(g gVar, Runnable runnable) {
        f24773e.T0(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        L0(h.f2820a, runnable);
    }

    @Override // p017b7.F
    public F k1(int i8) {
        return m.f24793c.k1(i8);
    }

    @Override // p017b7.F
    public String toString() {
        return "Dispatchers.IO";
    }
}
