package p017b7;

import G6.d;
import G6.g;
import H6.b;
import H6.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p062g7.AbstractC2373l;
import p062g7.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15921e = AtomicIntegerFieldUpdater.newUpdater(V.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public V(g gVar, d<Object> dVar) {
        super(gVar, dVar);
    }

    private final boolean h1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15921e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f15921e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean j1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15921e;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f15921e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p062g7.C, p017b7.AbstractC1773a
    public void Y0(Object obj) {
        if (h1()) {
            return;
        }
        AbstractC2373l.c(b.c(this.f23813d), C.a(obj, this.f23813d), null, 2, null);
    }

    public final Object d1() {
        if (j1()) {
            return c.f();
        }
        Object objH = E0.h(c0());
        if (objH instanceof C1822z) {
            throw ((C1822z) objH).f15995a;
        }
        return objH;
    }

    @Override // p062g7.C, p017b7.D0
    public void w(Object obj) {
        Y0(obj);
    }
}
