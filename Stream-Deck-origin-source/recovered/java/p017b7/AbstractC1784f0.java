package p017b7;

import D6.C0930j;
import p062g7.AbstractC2376o;

/* JADX INFO: renamed from: b7.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1784f0 extends F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0930j f15952e;

    public static /* synthetic */ void a2(AbstractC1784f0 abstractC1784f0, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        abstractC1784f0.Z1(z8);
    }

    public static /* synthetic */ void q1(AbstractC1784f0 abstractC1784f0, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        abstractC1784f0.o1(z8);
    }

    public final long D1(boolean z8) {
        return z8 ? 4294967296L : 1L;
    }

    public final void M1(W w8) {
        C0930j c0930j = this.f15952e;
        if (c0930j == null) {
            c0930j = new C0930j();
            this.f15952e = c0930j;
        }
        c0930j.addLast(w8);
    }

    public long X1() {
        C0930j c0930j = this.f15952e;
        return (c0930j == null || c0930j.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void Z1(boolean z8) {
        this.f15950c += D1(z8);
        if (z8) {
            return;
        }
        this.f15951d = true;
    }

    public final boolean b2() {
        return this.f15950c >= D1(true);
    }

    public final boolean c2() {
        C0930j c0930j = this.f15952e;
        if (c0930j != null) {
            return c0930j.isEmpty();
        }
        return true;
    }

    public long d2() {
        return !e2() ? Long.MAX_VALUE : 0L;
    }

    public final boolean e2() {
        W w8;
        C0930j c0930j = this.f15952e;
        if (c0930j == null || (w8 = (W) c0930j.K()) == null) {
            return false;
        }
        w8.run();
        return true;
    }

    public boolean f2() {
        return false;
    }

    @Override // p017b7.F
    public final F k1(int i8) {
        AbstractC2376o.a(i8);
        return this;
    }

    public final void o1(boolean z8) {
        long jD1 = this.f15950c - D1(z8);
        this.f15950c = jD1;
        if (jD1 <= 0 && this.f15951d) {
            shutdown();
        }
    }

    public void shutdown() {
    }
}
