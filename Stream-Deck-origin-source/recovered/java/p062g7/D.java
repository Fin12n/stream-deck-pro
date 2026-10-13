package p062g7;

import G6.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p017b7.L0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends AbstractC2366e implements L0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23814d = AtomicIntegerFieldUpdater.newUpdater(D.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23815c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public D(long j8, D d8, int i8) {
        super(d8);
        this.f23815c = j8;
        this.cleanedAndPointers$volatile = i8 << 16;
    }

    @Override // p062g7.AbstractC2366e
    public boolean k() {
        return f23814d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f23814d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i8, Throwable th, g gVar);

    public final void t() {
        if (f23814d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23814d;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
