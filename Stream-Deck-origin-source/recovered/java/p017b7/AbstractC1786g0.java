package p017b7;

import C6.G;
import G6.g;
import P2.Lsk.mHPawN;
import W6.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p062g7.M;
import p062g7.N;
import p062g7.t;

/* JADX INFO: renamed from: b7.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1786g0 extends AbstractC1788h0 implements T {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15953f = AtomicReferenceFieldUpdater.newUpdater(AbstractC1786g0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15954g = AtomicReferenceFieldUpdater.newUpdater(AbstractC1786g0.class, Object.class, mHPawN.uncPEuh);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15955h = AtomicIntegerFieldUpdater.newUpdater(AbstractC1786g0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: b7.g0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC1795l f15956c;

        public a(long j8, InterfaceC1795l interfaceC1795l) {
            super(j8);
            this.f15956c = interfaceC1795l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15956c.C(AbstractC1786g0.this, G.f1419a);
        }

        @Override // p017b7.AbstractC1786g0.c
        public String toString() {
            return super.toString() + this.f15956c;
        }
    }

    /* JADX INFO: renamed from: b7.g0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f15958c;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.f15958c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15958c.run();
        }

        @Override // p017b7.AbstractC1786g0.c
        public String toString() {
            return super.toString() + this.f15958c;
        }
    }

    /* JADX INFO: renamed from: b7.g0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c implements Runnable, Comparable, InterfaceC1776b0, N {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15960b = -1;

        public c(long j8) {
            this.f15959a = j8;
        }

        @Override // p062g7.N
        public M a() {
            Object obj = this._heap;
            if (obj instanceof M) {
                return (M) obj;
            }
            return null;
        }

        @Override // p062g7.N
        public void b(M m8) {
            if (this._heap == AbstractC1792j0.f15963a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m8;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j8 = this.f15959a - cVar.f15959a;
            if (j8 > 0) {
                return 1;
            }
            return j8 < 0 ? -1 : 0;
        }

        @Override // p017b7.InterfaceC1776b0
        public final void d() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC1792j0.f15963a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC1792j0.f15963a;
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p062g7.N
        public int getIndex() {
            return this.f15960b;
        }

        public final int m(long j8, d dVar, AbstractC1786g0 abstractC1786g0) {
            synchronized (this) {
                if (this._heap == AbstractC1792j0.f15963a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC1786g0.y()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f15961c = j8;
                        } else {
                            long j9 = cVar.f15959a;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - dVar.f15961c > 0) {
                                dVar.f15961c = j8;
                            }
                        }
                        long j10 = this.f15959a;
                        long j11 = dVar.f15961c;
                        if (j10 - j11 < 0) {
                            this.f15959a = j11;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean s(long j8) {
            return j8 - this.f15959a >= 0;
        }

        @Override // p062g7.N
        public void setIndex(int i8) {
            this.f15960b = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15959a + ']';
        }
    }

    /* JADX INFO: renamed from: b7.g0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15961c;

        public d(long j8) {
            this.f15961c = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        return f15955h.get(this) != 0;
    }

    @Override // p017b7.F
    public final void L0(g gVar, Runnable runnable) {
        m2(runnable);
    }

    @Override // p017b7.AbstractC1784f0
    public long X1() {
        c cVar;
        if (super.X1() == 0) {
            return 0L;
        }
        Object obj = f15953f.get(this);
        if (obj != null) {
            if (!(obj instanceof t)) {
                return obj == AbstractC1792j0.f15964b ? Long.MAX_VALUE : 0L;
            }
            if (!((t) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f15954g.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = cVar.f15959a;
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        return n.e(j8 - (abstractC1775b != null ? abstractC1775b.a() : System.nanoTime()), 0L);
    }

    @Override // p017b7.AbstractC1784f0
    public long d2() {
        N nI;
        if (e2()) {
            return 0L;
        }
        d dVar = (d) f15954g.get(this);
        if (dVar != null && !dVar.e()) {
            AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
            long jA = abstractC1775b != null ? abstractC1775b.a() : System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        N nB = dVar.b();
                        nI = null;
                        if (nB != null) {
                            c cVar = (c) nB;
                            nI = cVar.s(jA) ? n2(cVar) : false ? dVar.i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) nI) != null);
        }
        Runnable runnableL2 = l2();
        if (runnableL2 == null) {
            return X1();
        }
        runnableL2.run();
        return 0L;
    }

    public final void k2() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15953f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (F1.b.a(f15953f, this, null, AbstractC1792j0.f15964b)) {
                    return;
                }
            } else if (obj instanceof t) {
                ((t) obj).d();
                return;
            } else {
                if (obj == AbstractC1792j0.f15964b) {
                    return;
                }
                t tVar = new t(8, true);
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar.a((Runnable) obj);
                if (F1.b.a(f15953f, this, obj, tVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable l2() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15953f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof t) {
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                t tVar = (t) obj;
                Object objM = tVar.m();
                if (objM != t.f23868h) {
                    return (Runnable) objM;
                }
                F1.b.a(f15953f, this, obj, tVar.l());
            } else {
                if (obj == AbstractC1792j0.f15964b) {
                    return null;
                }
                if (F1.b.a(f15953f, this, obj, null)) {
                    kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void m2(Runnable runnable) {
        if (n2(runnable)) {
            i2();
        } else {
            O.f15912i.m2(runnable);
        }
    }

    public final boolean n2(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15953f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (y()) {
                return false;
            }
            if (obj == null) {
                if (F1.b.a(f15953f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof t) {
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                t tVar = (t) obj;
                int iA = tVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    F1.b.a(f15953f, this, obj, tVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC1792j0.f15964b) {
                    return false;
                }
                t tVar2 = new t(8, true);
                kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar2.a((Runnable) obj);
                tVar2.a(runnable);
                if (F1.b.a(f15953f, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    public InterfaceC1776b0 o(long j8, Runnable runnable, g gVar) {
        return T.a.a(this, j8, runnable, gVar);
    }

    public boolean r2() {
        if (!c2()) {
            return false;
        }
        d dVar = (d) f15954g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f15953f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof t) {
            return ((t) obj).j();
        }
        return obj == AbstractC1792j0.f15964b;
    }

    public final void s2() {
        c cVar;
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        long jA = abstractC1775b != null ? abstractC1775b.a() : System.nanoTime();
        while (true) {
            d dVar = (d) f15954g.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                h2(jA, cVar);
            }
        }
    }

    @Override // p017b7.AbstractC1784f0
    public void shutdown() {
        U0.f15919a.c();
        x2(true);
        k2();
        while (d2() <= 0) {
        }
        s2();
    }

    public final void t2() {
        f15953f.set(this, null);
        f15954g.set(this, null);
    }

    public final void u2(long j8, c cVar) {
        int iV2 = v2(j8, cVar);
        if (iV2 == 0) {
            if (y2(cVar)) {
                i2();
            }
        } else if (iV2 == 1) {
            h2(j8, cVar);
        } else if (iV2 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int v2(long j8, c cVar) {
        if (y()) {
            return 1;
        }
        d dVar = (d) f15954g.get(this);
        if (dVar == null) {
            F1.b.a(f15954g, this, null, new d(j8));
            Object obj = f15954g.get(this);
            kotlin.jvm.internal.t.d(obj);
            dVar = (d) obj;
        }
        return cVar.m(j8, dVar, this);
    }

    @Override // p017b7.T
    public void w0(long j8, InterfaceC1795l interfaceC1795l) {
        long jC = AbstractC1792j0.c(j8);
        if (jC < 4611686018427387903L) {
            AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
            long jA = abstractC1775b != null ? abstractC1775b.a() : System.nanoTime();
            a aVar = new a(jC + jA, interfaceC1795l);
            u2(jA, aVar);
            AbstractC1801o.a(interfaceC1795l, aVar);
        }
    }

    public final InterfaceC1776b0 w2(long j8, Runnable runnable) {
        long jC = AbstractC1792j0.c(j8);
        if (jC >= 4611686018427387903L) {
            return K0.f15903a;
        }
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        long jA = abstractC1775b != null ? abstractC1775b.a() : System.nanoTime();
        b bVar = new b(jC + jA, runnable);
        u2(jA, bVar);
        return bVar;
    }

    public final void x2(boolean z8) {
        f15955h.set(this, z8 ? 1 : 0);
    }

    public final boolean y2(c cVar) {
        d dVar = (d) f15954g.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }
}
