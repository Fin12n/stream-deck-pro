package p080i7;

import W6.n;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1775b;
import p017b7.AbstractC1777c;
import p017b7.N;
import p062g7.B;
import p062g7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0569a f24743h = new C0569a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24744i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f24745j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24746k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final G f24747l = new G("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24750c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p080i7.d f24752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p080i7.d f24753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B f24754g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0569a {
        public /* synthetic */ C0569a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0569a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24755a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24755a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ J6.a f24771g = J6.b.a(a());
    }

    public a(int i8, int i9, long j8, String str) {
        this.f24748a = i8;
        this.f24749b = i9;
        this.f24750c = j8;
        this.f24751d = str;
        if (i8 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i8 + WaYxBuDSBD.pCf).toString());
        }
        if (i9 < i8) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        if (i9 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j8 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
        }
        this.f24752e = new p080i7.d();
        this.f24753f = new p080i7.d();
        this.f24754g = new B((i8 + 1) * 2);
        this.controlState$volatile = ((long) i8) << 42;
        this._isTerminated$volatile = 0;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater A() {
        return f24745j;
    }

    public static /* synthetic */ boolean a1(a aVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = f24745j.get(aVar);
        }
        return aVar.V0(j8);
    }

    public static /* synthetic */ void z(a aVar, Runnable runnable, i iVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            iVar = l.f24791g;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        aVar.y(runnable, iVar, z8);
    }

    public final void A0(c cVar, int i8, int i9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24744i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            int iJ0 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & (-2097152);
            if (iJ0 == i8) {
                iJ0 = i9 == 0 ? j0(cVar) : i9;
            }
            if (iJ0 >= 0) {
                if (f24744i.compareAndSet(this, j8, j9 | ((long) iJ0))) {
                    return;
                }
            }
        }
    }

    public final void H0(h hVar) {
        try {
            hVar.run();
            AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
            if (abstractC1775b != null) {
                abstractC1775b.e();
            }
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC1775b abstractC1775b2 = AbstractC1777c.f15940a;
                if (abstractC1775b2 != null) {
                    abstractC1775b2.e();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void L0(long j8) throws InterruptedException {
        int i8;
        h hVarG;
        if (f24746k.compareAndSet(this, 0, 1)) {
            c cVarV = v();
            synchronized (this.f24754g) {
                i8 = (int) (A().get(this) & 2097151);
            }
            if (1 <= i8) {
                int i9 = 1;
                while (true) {
                    Object objB = this.f24754g.b(i9);
                    t.d(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarV) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j8);
                        }
                        cVar.f24757a.j(this.f24753f);
                    }
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f24753f.b();
            this.f24752e.b();
            while (true) {
                if (cVarV == null) {
                    hVarG = (h) this.f24752e.e();
                    if (hVarG == null && (hVarG = (h) this.f24753f.e()) == null) {
                        break;
                    }
                } else {
                    hVarG = cVarV.g(true);
                    if (hVarG == null) {
                        hVarG = (h) this.f24752e.e();
                        if (hVarG == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                H0(hVarG);
            }
            if (cVarV != null) {
                cVarV.u(d.TERMINATED);
            }
            f24744i.set(this, 0L);
            f24745j.set(this, 0L);
        }
    }

    public final void O0(long j8, boolean z8) {
        if (z8 || g1() || V0(j8)) {
            return;
        }
        g1();
    }

    public final void Q0() {
        if (g1() || a1(this, 0L, 1, null)) {
            return;
        }
        g1();
    }

    public final h T0(c cVar, h hVar, boolean z8) {
        if (cVar == null || cVar.f24759c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f24782b.b() == 0 && cVar.f24759c == d.BLOCKING) {
            return hVar;
        }
        cVar.f24763g = true;
        return cVar.f24757a.a(hVar, z8);
    }

    public final boolean V0(long j8) {
        if (n.d(((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21)), 0) < this.f24748a) {
            int iO = o();
            if (iO == 1 && this.f24748a > 1) {
                o();
            }
            if (iO > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        L0(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        z(this, runnable, null, false, 6, null);
    }

    public final boolean g1() {
        c cVarR0;
        do {
            cVarR0 = r0();
            if (cVarR0 == null) {
                return false;
            }
        } while (!c.f24756i.compareAndSet(cVarR0, -1, 0));
        LockSupport.unpark(cVarR0);
        return true;
    }

    public final boolean isTerminated() {
        return f24746k.get(this) != 0;
    }

    public final boolean j(h hVar) {
        return hVar.f24782b.b() == 1 ? this.f24753f.a(hVar) : this.f24752e.a(hVar);
    }

    public final int j0(c cVar) {
        Object objI = cVar.i();
        while (objI != f24747l) {
            if (objI == null) {
                return 0;
            }
            c cVar2 = (c) objI;
            int iH = cVar2.h();
            if (iH != 0) {
                return iH;
            }
            objI = cVar2.i();
        }
        return -1;
    }

    public final int o() {
        synchronized (this.f24754g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j8 = f24745j.get(this);
                int i8 = (int) (j8 & 2097151);
                int iD = n.d(i8 - ((int) ((j8 & 4398044413952L) >> 21)), 0);
                if (iD >= this.f24748a) {
                    return 0;
                }
                if (i8 >= this.f24749b) {
                    return 0;
                }
                int i9 = ((int) (A().get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f24754g.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i9);
                this.f24754g.c(i9, cVar);
                if (i9 != ((int) (2097151 & f24745j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = iD + 1;
                cVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c r0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24744i;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f24754g.b((int) (2097151 & j8));
            if (cVar == null) {
                return null;
            }
            long j9 = (2097152 + j8) & (-2097152);
            int iJ0 = j0(cVar);
            if (iJ0 >= 0 && f24744i.compareAndSet(this, j8, ((long) iJ0) | j9)) {
                cVar.r(f24747l);
                return cVar;
            }
        }
    }

    public final h t(Runnable runnable, i iVar) {
        long jA = l.f24790f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, jA, iVar);
        }
        h hVar = (h) runnable;
        hVar.f24781a = jA;
        hVar.f24782b = iVar;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f24754g.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < iA; i13++) {
            c cVar = (c) this.f24754g.b(i13);
            if (cVar != null) {
                int i14 = cVar.f24757a.i();
                int i15 = b.f24755a[cVar.f24759c.ordinal()];
                if (i15 == 1) {
                    i10++;
                } else if (i15 == 2) {
                    i9++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i14);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i15 == 3) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i14);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i15 == 4) {
                    i11++;
                    if (i14 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i14);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i15 == 5) {
                    i12++;
                }
            }
        }
        long j8 = f24745j.get(this);
        return this.f24751d + '@' + N.b(this) + "[Pool Size {core = " + this.f24748a + ", max = " + this.f24749b + "}, Worker States {CPU = " + i8 + ", blocking = " + i9 + ", parked = " + i10 + ", dormant = " + i11 + ", terminated = " + i12 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f24752e.c() + ", global blocking queue size = " + this.f24753f.c() + ", Control State {created workers= " + ((int) (2097151 & j8)) + ", blocking tasks = " + ((int) ((4398044413952L & j8) >> 21)) + ", CPUs acquired = " + (this.f24748a - ((int) ((9223367638808264704L & j8) >> 42))) + "}]";
    }

    public final c v() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !t.c(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final boolean w0(c cVar) {
        long j8;
        int iH;
        if (cVar.i() != f24747l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24744i;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            iH = cVar.h();
            cVar.r(this.f24754g.b((int) (2097151 & j8)));
        } while (!f24744i.compareAndSet(this, j8, ((2097152 + j8) & (-2097152)) | ((long) iH)));
        return true;
    }

    public final void y(Runnable runnable, i iVar, boolean z8) {
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        if (abstractC1775b != null) {
            abstractC1775b.d();
        }
        h hVarT = t(runnable, iVar);
        boolean z9 = false;
        boolean z10 = hVarT.f24782b.b() == 1;
        long jAddAndGet = z10 ? f24745j.addAndGet(this, 2097152L) : 0L;
        c cVarV = v();
        h hVarT0 = T0(cVarV, hVarT, z8);
        if (hVarT0 != null && !j(hVarT0)) {
            throw new RejectedExecutionException(this.f24751d + " was terminated");
        }
        if (z8 && cVarV != null) {
            z9 = true;
        }
        if (z10) {
            O0(jAddAndGet, z9);
        } else {
            if (z9) {
                return;
            }
            Q0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f24756i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f24757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J f24758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f24759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f24760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f24761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f24763g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f24757a = new n();
            this.f24758b = new J();
            this.f24759c = d.DORMANT;
            this.nextParkedWorker = a.f24747l;
            int iNanoTime = (int) System.nanoTime();
            this.f24762f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final void b(int i8) {
            if (i8 == 0) {
                return;
            }
            a.A().addAndGet(a.this, -2097152L);
            if (this.f24759c != d.TERMINATED) {
                this.f24759c = d.DORMANT;
            }
        }

        public final void c(int i8) {
            if (i8 != 0 && u(d.BLOCKING)) {
                a.this.Q0();
            }
        }

        public final void d(h hVar) {
            int iB = hVar.f24782b.b();
            k(iB);
            c(iB);
            a.this.H0(hVar);
            b(iB);
        }

        public final h e(boolean z8) {
            h hVarO;
            h hVarO2;
            if (z8) {
                boolean z9 = m(a.this.f24748a * 2) == 0;
                if (z9 && (hVarO2 = o()) != null) {
                    return hVarO2;
                }
                h hVarK = this.f24757a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z9 && (hVarO = o()) != null) {
                    return hVarO;
                }
            } else {
                h hVarO3 = o();
                if (hVarO3 != null) {
                    return hVarO3;
                }
            }
            return v(3);
        }

        public final h f() {
            h hVarL = this.f24757a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f24753f.e();
            return hVar == null ? v(1) : hVar;
        }

        public final h g(boolean z8) {
            return s() ? e(z8) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i8) {
            this.f24760d = 0L;
            if (this.f24759c == d.PARKING) {
                this.f24759c = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != a.f24747l;
        }

        public final int m(int i8) {
            int i9 = this.f24762f;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f24762f = i12;
            int i13 = i8 - 1;
            return (i13 & i8) == 0 ? i12 & i13 : (i12 & Integer.MAX_VALUE) % i8;
        }

        public final void n() {
            if (this.f24760d == 0) {
                this.f24760d = System.nanoTime() + a.this.f24750c;
            }
            LockSupport.parkNanos(a.this.f24750c);
            if (System.nanoTime() - this.f24760d >= 0) {
                this.f24760d = 0L;
                w();
            }
        }

        public final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f24752e.e();
                return hVar != null ? hVar : (h) a.this.f24753f.e();
            }
            h hVar2 = (h) a.this.f24753f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f24752e.e();
        }

        public final void p() {
            loop0: while (true) {
                boolean z8 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f24759c == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarG = g(this.f24763g);
                    if (hVarG != null) {
                        this.f24761e = 0L;
                        d(hVarG);
                        break;
                    }
                    this.f24763g = false;
                    if (this.f24761e == 0) {
                        t();
                    } else {
                        if (z8) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f24761e);
                            this.f24761e = 0L;
                            break;
                        }
                        z8 = true;
                    }
                }
            }
            u(d.TERMINATED);
        }

        public final void q(int i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f24751d);
            sb.append("-worker-");
            sb.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j8;
            if (this.f24759c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterA = a.A();
            do {
                j8 = atomicLongFieldUpdaterA.get(aVar);
                if (((int) ((9223367638808264704L & j8) >> 42)) == 0) {
                    return false;
                }
            } while (!a.A().compareAndSet(aVar, j8, j8 - 4398046511104L));
            this.f24759c = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                a.this.w0(this);
                return;
            }
            f24756i.set(this, -1);
            while (l() && f24756i.get(this) == -1 && !a.this.isTerminated() && this.f24759c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f24759c;
            boolean z8 = dVar2 == d.CPU_ACQUIRED;
            if (z8) {
                a.A().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f24759c = dVar;
            }
            return z8;
        }

        public final h v(int i8) {
            int i9 = (int) (a.A().get(a.this) & 2097151);
            if (i9 < 2) {
                return null;
            }
            int iM = m(i9);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i9; i10++) {
                iM++;
                if (iM > i9) {
                    iM = 1;
                }
                c cVar = (c) aVar.f24754g.b(iM);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f24757a.r(i8, this.f24758b);
                    if (jR == -1) {
                        J j8 = this.f24758b;
                        h hVar = (h) j8.f28779a;
                        j8.f28779a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f24761e = jMin;
            return null;
        }

        public final void w() {
            a aVar = a.this;
            synchronized (aVar.f24754g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.A().get(aVar) & 2097151)) <= aVar.f24748a) {
                        return;
                    }
                    if (f24756i.compareAndSet(this, -1, 1)) {
                        int i8 = this.indexInArray;
                        q(0);
                        aVar.A0(this, i8, 0);
                        int andDecrement = (int) (a.A().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i8) {
                            Object objB = aVar.f24754g.b(andDecrement);
                            t.d(objB);
                            c cVar = (c) objB;
                            aVar.f24754g.c(i8, cVar);
                            cVar.q(i8);
                            aVar.A0(cVar, andDecrement, i8);
                        }
                        aVar.f24754g.c(andDecrement, null);
                        C6.G g8 = C6.G.f1419a;
                        this.f24759c = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i8) {
            this();
            q(i8);
        }
    }

    public /* synthetic */ a(int i8, int i9, long j8, String str, int i10, AbstractC2633k abstractC2633k) {
        this(i8, i9, (i10 & 4) != 0 ? l.f24789e : j8, (i10 & 8) != 0 ? l.f24785a : str);
    }
}
