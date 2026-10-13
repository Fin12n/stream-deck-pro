package p098k7;

import C6.G;
import G6.d;
import I6.h;
import Q6.k;
import Q6.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1801o;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.b1;
import p062g7.AbstractC2365d;
import p062g7.D;
import p062g7.E;
import p089j7.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28757c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28758d = AtomicLongFieldUpdater.newUpdater(e.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28759e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28760f = AtomicLongFieldUpdater.newUpdater(e.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28761g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f28763b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28764a = new a();

        public a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g h(long j8, g gVar) {
            return f.j(j8, gVar);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return h(((Number) obj).longValue(), (g) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {
        public b() {
            super(1);
        }

        public final void b(Throwable th) {
            e.this.a();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28766a = new c();

        public c() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g h(long j8, g gVar) {
            return f.j(j8, gVar);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return h(((Number) obj).longValue(), (g) obj2);
        }
    }

    public e(int i8, int i9) {
        this.f28762a = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i8).toString());
        }
        if (i9 < 0 || i9 > i8) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i8).toString());
        }
        g gVar = new g(0L, null, 2);
        this.head$volatile = gVar;
        this.tail$volatile = gVar;
        this._availablePermits$volatile = i8 - i9;
        this.f28763b = new b();
    }

    public static /* synthetic */ Object h(e eVar, d dVar) {
        if (eVar.l() > 0) {
            return G.f1419a;
        }
        Object objI = eVar.i(dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    @Override // p098k7.d
    public void a() {
        do {
            int andIncrement = f28761g.getAndIncrement(this);
            if (andIncrement >= this.f28762a) {
                k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f28762a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!u());
    }

    @Override // p098k7.d
    public Object d(d dVar) {
        return h(this, dVar);
    }

    public final void g(InterfaceC1795l interfaceC1795l) {
        while (l() <= 0) {
            t.e(interfaceC1795l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((b1) interfaceC1795l)) {
                return;
            }
        }
        interfaceC1795l.G(G.f1419a, this.f28763b);
    }

    public final Object i(d dVar) {
        C1797m c1797mB = AbstractC1801o.b(H6.b.c(dVar));
        try {
            if (!j(c1797mB)) {
                g(c1797mB);
            }
            Object objS = c1797mB.s();
            if (objS == H6.c.f()) {
                h.c(dVar);
            }
            return objS == H6.c.f() ? objS : G.f1419a;
        } catch (Throwable th) {
            c1797mB.M();
            throw th;
        }
    }

    public final boolean j(b1 b1Var) {
        Object objC;
        g gVar = (g) f28759e.get(this);
        long andIncrement = f28760f.getAndIncrement(this);
        a aVar = a.f28764a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28759e;
        long j8 = andIncrement / ((long) f.f28772f);
        loop0: while (true) {
            objC = AbstractC2365d.c(gVar, j8, aVar);
            if (!E.c(objC)) {
                D dB = E.b(objC);
                while (true) {
                    D d8 = (D) atomicReferenceFieldUpdater.get(this);
                    if (d8.f23815c >= dB.f23815c) {
                        break loop0;
                    }
                    if (!dB.u()) {
                        break;
                    }
                    if (F1.b.a(atomicReferenceFieldUpdater, this, d8, dB)) {
                        if (!d8.p()) {
                            break loop0;
                        }
                        d8.n();
                        break loop0;
                    }
                    if (dB.p()) {
                        dB.n();
                    }
                }
            } else {
                break;
            }
        }
        g gVar2 = (g) E.b(objC);
        int i8 = (int) (andIncrement % ((long) f.f28772f));
        if (p221z6.c.a(gVar2.v(), i8, null, b1Var)) {
            b1Var.d(gVar2, i8);
            return true;
        }
        if (!p221z6.c.a(gVar2.v(), i8, f.f28768b, f.f28769c)) {
            return false;
        }
        if (b1Var instanceof InterfaceC1795l) {
            t.e(b1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1795l) b1Var).G(G.f1419a, this.f28763b);
        } else {
            if (!(b1Var instanceof j)) {
                throw new IllegalStateException(("unexpected: " + b1Var).toString());
            }
            ((j) b1Var).g(G.f1419a);
        }
        return true;
    }

    public final void k() {
        int i8;
        do {
            i8 = f28761g.get(this);
            if (i8 <= this.f28762a) {
                return;
            }
        } while (!f28761g.compareAndSet(this, i8, this.f28762a));
    }

    public final int l() {
        int andDecrement;
        do {
            andDecrement = f28761g.getAndDecrement(this);
        } while (andDecrement > this.f28762a);
        return andDecrement;
    }

    public int m() {
        return Math.max(f28761g.get(this), 0);
    }

    public boolean s() {
        while (true) {
            int i8 = f28761g.get(this);
            if (i8 > this.f28762a) {
                k();
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (f28761g.compareAndSet(this, i8, i8 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean t(Object obj) {
        if (!(obj instanceof InterfaceC1795l)) {
            if (obj instanceof j) {
                return ((j) obj).e(this, G.f1419a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1795l interfaceC1795l = (InterfaceC1795l) obj;
        Object objF = interfaceC1795l.F(G.f1419a, null, this.f28763b);
        if (objF == null) {
            return false;
        }
        interfaceC1795l.K(objF);
        return true;
    }

    public final boolean u() {
        Object objC;
        g gVar = (g) f28757c.get(this);
        long andIncrement = f28758d.getAndIncrement(this);
        long j8 = andIncrement / ((long) f.f28772f);
        c cVar = c.f28766a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28757c;
        loop0: while (true) {
            objC = AbstractC2365d.c(gVar, j8, cVar);
            if (E.c(objC)) {
                break;
            }
            D dB = E.b(objC);
            while (true) {
                D d8 = (D) atomicReferenceFieldUpdater.get(this);
                if (d8.f23815c >= dB.f23815c) {
                    break loop0;
                }
                if (!dB.u()) {
                    break;
                }
                if (F1.b.a(atomicReferenceFieldUpdater, this, d8, dB)) {
                    if (!d8.p()) {
                        break loop0;
                    }
                    d8.n();
                    break loop0;
                }
                if (dB.p()) {
                    dB.n();
                }
            }
        }
        g gVar2 = (g) E.b(objC);
        gVar2.c();
        if (gVar2.f23815c > j8) {
            return false;
        }
        int i8 = (int) (andIncrement % ((long) f.f28772f));
        Object andSet = gVar2.v().getAndSet(i8, f.f28768b);
        if (andSet != null) {
            if (andSet == f.f28771e) {
                return false;
            }
            return t(andSet);
        }
        int i9 = f.f28767a;
        for (int i10 = 0; i10 < i9; i10++) {
            if (gVar2.v().get(i8) == f.f28769c) {
                return true;
            }
        }
        return !p221z6.c.a(gVar2.v(), i8, f.f28768b, f.f28770d);
    }
}
