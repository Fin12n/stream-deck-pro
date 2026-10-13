package p035d7;

import C6.C0918g;
import C6.G;
import C6.q;
import C6.r;
import I6.h;
import Q6.k;
import Q6.o;
import Q6.p;
import T0.Vl.PCRzgdeK;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1801o;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.b1;
import p062g7.AbstractC2365d;
import p062g7.AbstractC2366e;
import p062g7.AbstractC2374m;
import p062g7.D;
import p062g7.E;
import p062g7.F;
import p062g7.P;
import p062g7.y;
import p089j7.i;
import p089j7.j;
import p089j7.l;
import p116m7.kKPq.toqHM;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e implements p035d7.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19885d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19886e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19887f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19888g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19889h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19890i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19891j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19892k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19893l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f19895b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f19896c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements i, b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19897a = p035d7.f.f19933p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1797m f19898b;

        public a() {
        }

        @Override // p035d7.i
        public Object a(G6.d dVar) {
            e eVar = e.this;
            l lVar = (l) e.X().get(eVar);
            while (!eVar.l0()) {
                long andIncrement = e.Y().getAndIncrement(eVar);
                int i8 = p035d7.f.f19919b;
                long j8 = andIncrement / ((long) i8);
                int i9 = (int) (andIncrement % ((long) i8));
                if (lVar.f23815c != j8) {
                    l lVarO = eVar.O(j8, lVar);
                    if (lVarO == null) {
                        continue;
                    } else {
                        lVar = lVarO;
                    }
                }
                Object objX0 = eVar.X0(lVar, i9, andIncrement, null);
                if (objX0 == p035d7.f.f19930m) {
                    throw new IllegalStateException("unreachable");
                }
                if (objX0 != p035d7.f.f19932o) {
                    if (objX0 == p035d7.f.f19931n) {
                        return f(lVar, i9, andIncrement, dVar);
                    }
                    lVar.c();
                    this.f19897a = objX0;
                    return I6.b.a(true);
                }
                if (andIncrement < eVar.d0()) {
                    lVar.c();
                }
            }
            return I6.b.a(g());
        }

        @Override // p017b7.b1
        public void d(D d8, int i8) {
            C1797m c1797m = this.f19898b;
            if (c1797m != null) {
                c1797m.d(d8, i8);
            }
        }

        public final Object f(l lVar, int i8, long j8, G6.d dVar) throws Throwable {
            Boolean boolA;
            k kVar;
            G6.g context;
            l lVarO;
            e eVar = e.this;
            C1797m c1797mB = AbstractC1801o.b(H6.b.c(dVar));
            try {
                this.f19898b = c1797mB;
                try {
                    Object objX0 = eVar.X0(lVar, i8, j8, this);
                    if (objX0 == p035d7.f.f19930m) {
                        eVar.D0(this, lVar, i8);
                    } else {
                        k kVarA = null;
                        if (objX0 == p035d7.f.f19932o) {
                            if (j8 < eVar.d0()) {
                                lVar.c();
                            }
                            l lVar2 = (l) e.X().get(eVar);
                            while (true) {
                                if (eVar.l0()) {
                                    h();
                                } else {
                                    long andIncrement = e.Y().getAndIncrement(eVar);
                                    int i9 = p035d7.f.f19919b;
                                    long j9 = andIncrement / ((long) i9);
                                    int i10 = (int) (andIncrement % ((long) i9));
                                    if (lVar2.f23815c != j9) {
                                        lVarO = eVar.O(j9, lVar2);
                                        if (lVarO == null) {
                                        }
                                    } else {
                                        lVarO = lVar2;
                                    }
                                    objX0 = eVar.X0(lVarO, i10, andIncrement, this);
                                    if (objX0 == p035d7.f.f19930m) {
                                        eVar.D0(this, lVarO, i10);
                                    } else if (objX0 == p035d7.f.f19932o) {
                                        if (andIncrement < eVar.d0()) {
                                            lVarO.c();
                                        }
                                        lVar2 = lVarO;
                                    } else {
                                        if (objX0 == p035d7.f.f19931n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVarO.c();
                                        this.f19897a = objX0;
                                        this.f19898b = null;
                                        boolA = I6.b.a(true);
                                        kVar = eVar.f19895b;
                                        if (kVar != null) {
                                            context = c1797mB.getContext();
                                            kVarA = y.a(kVar, objX0, context);
                                        }
                                        c1797mB.G(boolA, kVarA);
                                    }
                                }
                            }
                        } else {
                            lVar.c();
                            this.f19897a = objX0;
                            this.f19898b = null;
                            boolA = I6.b.a(true);
                            kVar = eVar.f19895b;
                            if (kVar != null) {
                                context = c1797mB.getContext();
                                kVarA = y.a(kVar, objX0, context);
                            }
                            c1797mB.G(boolA, kVarA);
                        }
                    }
                    Object objS = c1797mB.s();
                    if (objS == H6.c.f()) {
                        h.c(dVar);
                    }
                    return objS;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c1797mB.M();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final boolean g() throws Throwable {
            this.f19897a = p035d7.f.z();
            Throwable thT = e.this.T();
            if (thT == null) {
                return false;
            }
            throw F.a(thT);
        }

        public final void h() {
            C1797m c1797m = this.f19898b;
            t.d(c1797m);
            this.f19898b = null;
            this.f19897a = p035d7.f.z();
            Throwable thT = e.this.T();
            if (thT == null) {
                q.a aVar = q.f1441b;
                c1797m.resumeWith(q.b(Boolean.FALSE));
            } else {
                q.a aVar2 = q.f1441b;
                c1797m.resumeWith(q.b(r.a(thT)));
            }
        }

        public final boolean i(Object obj) {
            C1797m c1797m = this.f19898b;
            t.d(c1797m);
            this.f19898b = null;
            this.f19897a = obj;
            Boolean bool = Boolean.TRUE;
            k kVar = e.this.f19895b;
            return p035d7.f.B(c1797m, bool, kVar != null ? y.a(kVar, obj, c1797m.getContext()) : null);
        }

        public final void j() {
            C1797m c1797m = this.f19898b;
            t.d(c1797m);
            this.f19898b = null;
            this.f19897a = p035d7.f.z();
            Throwable thT = e.this.T();
            if (thT == null) {
                q.a aVar = q.f1441b;
                c1797m.resumeWith(q.b(Boolean.FALSE));
            } else {
                q.a aVar2 = q.f1441b;
                c1797m.resumeWith(q.b(r.a(thT)));
            }
        }

        @Override // p035d7.i
        public Object next() throws Throwable {
            Object obj = this.f19897a;
            if (obj == p035d7.f.f19933p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f19897a = p035d7.f.f19933p;
            if (obj != p035d7.f.z()) {
                return obj;
            }
            throw F.a(e.this.W());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1795l f19900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1797m f19901b;

        public b(InterfaceC1795l interfaceC1795l) {
            this.f19900a = interfaceC1795l;
            t.e(interfaceC1795l, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f19901b = (C1797m) interfaceC1795l;
        }

        public final InterfaceC1795l a() {
            return this.f19900a;
        }

        @Override // p017b7.b1
        public void d(D d8, int i8) {
            this.f19901b.d(d8, i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f19902a = new c();

        public c() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void h(e eVar, j jVar, Object obj) {
            eVar.K0(jVar, obj);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            h((e) obj, (j) obj2, obj3);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class d extends C2639q implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f19903a = new d();

        public d() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, Object obj, Object obj2) {
            return eVar.F0(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: d7.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0462e extends u implements p {

        /* JADX INFO: renamed from: d7.e$e$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f19905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f19906b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f19907c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, e eVar, j jVar) {
                super(1);
                this.f19905a = obj;
                this.f19906b = eVar;
                this.f19907c = jVar;
            }

            public final void b(Throwable th) throws IllegalAccessException, InvocationTargetException {
                if (this.f19905a != p035d7.f.z()) {
                    y.b(this.f19906b.f19895b, this.f19905a, this.f19907c.getContext());
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        public C0462e() {
            super(3);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke(j jVar, Object obj, Object obj2) {
            return new a(obj2, e.this, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f19908a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19910c;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f19908a = obj;
            this.f19910c |= Integer.MIN_VALUE;
            Object objH0 = e.H0(e.this, this);
            return objH0 == H6.c.f() ? objH0 : k.b(objH0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f19912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f19914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19915e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19917g;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f19915e = obj;
            this.f19917g |= Integer.MIN_VALUE;
            Object objI0 = e.this.I0(null, 0, 0L, this);
            return objI0 == H6.c.f() ? objI0 : k.b(objI0);
        }
    }

    public e(int i8, k kVar) {
        this.f19894a = i8;
        this.f19895b = kVar;
        if (i8 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = p035d7.f.A(i8);
        this.completedExpandBuffersAndPauseFlag$volatile = R();
        l lVar = new l(0L, null, this, 3);
        this.sendSegment$volatile = lVar;
        this.receiveSegment$volatile = lVar;
        if (p0()) {
            lVar = p035d7.f.f19918a;
            t.e(lVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar;
        this.f19896c = kVar != null ? new C0462e() : null;
        this._closeCause$volatile = p035d7.f.f19936s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static /* synthetic */ Object H0(e eVar, G6.d dVar) throws Throwable {
        f fVar;
        l lVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f19910c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f19910c = i8 - Integer.MIN_VALUE;
            } else {
                fVar = eVar.new f(dVar);
            }
        } else {
            fVar = eVar.new f(dVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f19908a;
        Object objF = H6.c.f();
        int i9 = fVar2.f19910c;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return ((k) obj).k();
        }
        r.b(obj);
        l lVar2 = (l) X().get(eVar);
        while (!eVar.l0()) {
            long andIncrement = Y().getAndIncrement(eVar);
            int i10 = p035d7.f.f19919b;
            long j8 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f23815c != j8) {
                l lVarO = eVar.O(j8, lVar2);
                if (lVarO == null) {
                    continue;
                } else {
                    lVar = lVarO;
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object objX0 = eVar2.X0(lVar, i11, andIncrement, null);
            if (objX0 == p035d7.f.f19930m) {
                throw new IllegalStateException("unexpected");
            }
            if (objX0 != p035d7.f.f19932o) {
                if (objX0 != p035d7.f.f19931n) {
                    lVar.c();
                    return k.f19942b.c(objX0);
                }
                fVar2.f19910c = 1;
                Object objI0 = eVar2.I0(lVar, i11, andIncrement, fVar2);
                return objI0 == objF ? objF : objI0;
            }
            if (andIncrement < eVar2.d0()) {
                lVar.c();
            }
            eVar = eVar2;
            lVar2 = lVar;
        }
        return k.f19942b.a(eVar.T());
    }

    public static /* synthetic */ Object P0(e eVar, Object obj, G6.d dVar) throws IllegalAccessException, InvocationTargetException {
        l lVar;
        l lVar2 = (l) b0().get(eVar);
        while (true) {
            long andIncrement = c0().getAndIncrement(eVar);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zN0 = eVar.n0(andIncrement);
            int i8 = p035d7.f.f19919b;
            long j9 = j8 / ((long) i8);
            int i9 = (int) (j8 % ((long) i8));
            if (lVar2.f23815c != j9) {
                l lVarP = eVar.P(j9, lVar2);
                if (lVarP != null) {
                    lVar = lVarP;
                } else if (zN0) {
                    Object objZ0 = eVar.z0(obj, dVar);
                    if (objZ0 != H6.c.f()) {
                        break;
                    }
                    return objZ0;
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object obj2 = obj;
            int iZ0 = eVar2.Z0(lVar, i9, obj2, j8, null, zN0);
            if (iZ0 == 0) {
                lVar.c();
                break;
            }
            if (iZ0 != 1) {
                if (iZ0 == 2) {
                    if (!zN0) {
                        break;
                    }
                    lVar.t();
                    Object objZ1 = eVar2.z0(obj2, dVar);
                    if (objZ1 != H6.c.f()) {
                        break;
                    }
                    return objZ1;
                }
                if (iZ0 == 3) {
                    Object objQ0 = eVar2.Q0(lVar, i9, obj2, j8, dVar);
                    if (objQ0 != H6.c.f()) {
                        break;
                    }
                    return objQ0;
                }
                if (iZ0 == 4) {
                    if (j8 < eVar2.Z()) {
                        lVar.c();
                    }
                    Object objZ2 = eVar2.z0(obj2, dVar);
                    if (objZ2 != H6.c.f()) {
                        break;
                    }
                    return objZ2;
                }
                if (iZ0 == 5) {
                    lVar.c();
                }
                eVar = eVar2;
                lVar2 = lVar;
                obj = obj2;
            } else {
                break;
            }
        }
        return G.f1419a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater X() {
        return f19890i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater Y() {
        return f19886e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater b0() {
        return f19889h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater c0() {
        return f19885d;
    }

    public static /* synthetic */ void h0(e eVar, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i8 & 1) != 0) {
            j8 = 1;
        }
        eVar.g0(j8);
    }

    public final void A0(Object obj, InterfaceC1795l interfaceC1795l) throws IllegalAccessException, InvocationTargetException {
        k kVar = this.f19895b;
        if (kVar != null) {
            y.b(kVar, obj, interfaceC1795l.getContext());
        }
        Throwable thA0 = a0();
        q.a aVar = q.f1441b;
        interfaceC1795l.resumeWith(q.b(r.a(thA0)));
    }

    public void B0() {
    }

    public void C0() {
    }

    public final boolean D(long j8) {
        return j8 < R() || j8 < Z() + ((long) this.f19894a);
    }

    public final void D0(b1 b1Var, l lVar, int i8) {
        C0();
        b1Var.d(lVar, i8);
    }

    public boolean E(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return H(th, true);
    }

    public final void E0(b1 b1Var, l lVar, int i8) {
        b1Var.d(lVar, i8 + p035d7.f.f19919b);
    }

    public final void F(l lVar, long j8) {
        Object objB = AbstractC2374m.b(null, 1, null);
        loop0: while (lVar != null) {
            for (int i8 = p035d7.f.f19919b - 1; -1 < i8; i8--) {
                if ((lVar.f23815c * ((long) p035d7.f.f19919b)) + ((long) i8) < j8) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lVar.B(i8);
                    if (objB2 != null && objB2 != p035d7.f.f19922e) {
                        if (!(objB2 instanceof z)) {
                            if (!(objB2 instanceof b1)) {
                                break;
                            }
                            if (lVar.v(i8, objB2, p035d7.f.z())) {
                                objB = AbstractC2374m.c(objB, objB2);
                                lVar.C(i8, true);
                                break;
                            }
                        } else {
                            if (lVar.v(i8, objB2, p035d7.f.z())) {
                                objB = AbstractC2374m.c(objB, ((z) objB2).f19961a);
                                lVar.C(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar.v(i8, objB2, p035d7.f.z())) {
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                M0((b1) objB);
                return;
            }
            t.e(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                M0((b1) arrayList.get(size));
            }
        }
    }

    public final Object F0(Object obj, Object obj2) {
        return k.b(obj2 == p035d7.f.z() ? k.f19942b.a(T()) : k.f19942b.c(obj2));
    }

    public final l G() {
        Object obj = f19891j.get(this);
        l lVar = (l) f19889h.get(this);
        if (lVar.f23815c > ((l) obj).f23815c) {
            obj = lVar;
        }
        l lVar2 = (l) f19890i.get(this);
        if (lVar2.f23815c > ((l) obj).f23815c) {
            obj = lVar2;
        }
        return (l) AbstractC2365d.b((AbstractC2366e) obj);
    }

    public boolean H(Throwable th, boolean z8) {
        if (z8) {
            r0();
        }
        boolean zA = F1.b.a(f19892k, this, p035d7.f.f19936s, th);
        if (z8) {
            s0();
        } else {
            t0();
        }
        K();
        v0();
        if (zA) {
            i0();
        }
        return zA;
    }

    public final void I(long j8) throws IllegalAccessException, InvocationTargetException {
        L0(J(j8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(l lVar, int i8, long j8, G6.d dVar) throws Throwable {
        g gVar;
        k kVarB;
        k kVar;
        G6.g context;
        l lVar2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i9 = gVar.f19917g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f19917g = i9 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objS = gVar.f19915e;
        Object objF = H6.c.f();
        int i10 = gVar.f19917g;
        if (i10 == 0) {
            r.b(objS);
            gVar.f19911a = this;
            gVar.f19912b = lVar;
            gVar.f19913c = i8;
            gVar.f19914d = j8;
            gVar.f19917g = 1;
            C1797m c1797mB = AbstractC1801o.b(H6.b.c(gVar));
            try {
                t.e(c1797mB, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                w wVar = new w(c1797mB);
                try {
                    Object objX0 = X0(lVar, i8, j8, wVar);
                    if (objX0 == p035d7.f.f19930m) {
                        D0(wVar, lVar, i8);
                    } else {
                        k kVarA = null;
                        if (objX0 == p035d7.f.f19932o) {
                            if (j8 < d0()) {
                                lVar.c();
                            }
                            l lVar3 = (l) X().get(this);
                            while (true) {
                                if (l0()) {
                                    w0(c1797mB);
                                } else {
                                    long andIncrement = Y().getAndIncrement(this);
                                    int i11 = p035d7.f.f19919b;
                                    long j9 = andIncrement / ((long) i11);
                                    int i12 = (int) (andIncrement % ((long) i11));
                                    if (lVar3.f23815c != j9) {
                                        l lVarO = O(j9, lVar3);
                                        if (lVarO != null) {
                                            lVar2 = lVarO;
                                        }
                                    } else {
                                        lVar2 = lVar3;
                                    }
                                    objX0 = X0(lVar2, i12, andIncrement, wVar);
                                    l lVar4 = lVar2;
                                    if (objX0 == p035d7.f.f19930m) {
                                        D0(wVar, lVar4, i12);
                                    } else if (objX0 == p035d7.f.f19932o) {
                                        if (andIncrement < d0()) {
                                            lVar4.c();
                                        }
                                        lVar3 = lVar4;
                                    } else {
                                        if (objX0 == p035d7.f.f19931n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar4.c();
                                        kVarB = k.b(k.f19942b.c(objX0));
                                        kVar = this.f19895b;
                                        if (kVar != null) {
                                            context = c1797mB.getContext();
                                            kVarA = y.a(kVar, objX0, context);
                                        }
                                        c1797mB.G(kVarB, kVarA);
                                    }
                                }
                            }
                        } else {
                            lVar.c();
                            kVarB = k.b(k.f19942b.c(objX0));
                            kVar = this.f19895b;
                            if (kVar != null) {
                                context = c1797mB.getContext();
                                kVarA = y.a(kVar, objX0, context);
                            }
                            c1797mB.G(kVarB, kVarA);
                        }
                    }
                    objS = c1797mB.s();
                    if (objS == H6.c.f()) {
                        h.c(gVar);
                    }
                    if (objS == objF) {
                        return objF;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c1797mB.M();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objS);
        }
        return ((k) objS).k();
    }

    public final l J(long j8) {
        l lVarG = G();
        if (o0()) {
            long jQ0 = q0(lVarG);
            if (jQ0 != -1) {
                L(jQ0);
            }
        }
        F(lVarG, j8);
        return lVarG;
    }

    public final Object J0(l lVar, int i8, long j8, G6.d dVar) {
        k kVar;
        G6.g context;
        l lVar2;
        C1797m c1797mB = AbstractC1801o.b(H6.b.c(dVar));
        try {
            Object objX0 = X0(lVar, i8, j8, c1797mB);
            if (objX0 == p035d7.f.f19930m) {
                D0(c1797mB, lVar, i8);
            } else {
                k kVarA = null;
                kVarA = null;
                if (objX0 == p035d7.f.f19932o) {
                    if (j8 < d0()) {
                        lVar.c();
                    }
                    l lVar3 = (l) X().get(this);
                    while (true) {
                        if (l0()) {
                            x0(c1797mB);
                        } else {
                            long andIncrement = Y().getAndIncrement(this);
                            int i9 = p035d7.f.f19919b;
                            long j9 = andIncrement / ((long) i9);
                            int i10 = (int) (andIncrement % ((long) i9));
                            if (lVar3.f23815c != j9) {
                                l lVarO = O(j9, lVar3);
                                if (lVarO != null) {
                                    lVar2 = lVarO;
                                }
                            } else {
                                lVar2 = lVar3;
                            }
                            objX0 = X0(lVar2, i10, andIncrement, c1797mB);
                            l lVar4 = lVar2;
                            if (objX0 == p035d7.f.f19930m) {
                                C1797m c1797m = c1797mB != null ? c1797mB : null;
                                if (c1797m != null) {
                                    D0(c1797m, lVar4, i10);
                                }
                            } else if (objX0 == p035d7.f.f19932o) {
                                if (andIncrement < d0()) {
                                    lVar4.c();
                                }
                                lVar3 = lVar4;
                            } else {
                                if (objX0 == p035d7.f.f19931n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                lVar4.c();
                                kVar = this.f19895b;
                                if (kVar != null) {
                                    context = c1797mB.getContext();
                                    kVarA = y.a(kVar, objX0, context);
                                }
                                c1797mB.G(objX0, kVarA);
                            }
                        }
                    }
                } else {
                    lVar.c();
                    kVar = this.f19895b;
                    if (kVar != null) {
                        context = c1797mB.getContext();
                        kVarA = y.a(kVar, objX0, context);
                    }
                    c1797mB.G(objX0, kVarA);
                }
            }
            Object objS = c1797mB.s();
            if (objS == H6.c.f()) {
                h.c(dVar);
            }
            return objS;
        } catch (Throwable th) {
            c1797mB.M();
            throw th;
        }
    }

    public final void K() {
        n();
    }

    public final void K0(j jVar, Object obj) {
        l lVar;
        l lVar2 = (l) X().get(this);
        while (!l0()) {
            long andIncrement = Y().getAndIncrement(this);
            int i8 = p035d7.f.f19919b;
            long j8 = andIncrement / ((long) i8);
            int i9 = (int) (andIncrement % ((long) i8));
            if (lVar2.f23815c != j8) {
                l lVarO = O(j8, lVar2);
                if (lVarO == null) {
                    continue;
                } else {
                    lVar = lVarO;
                }
            } else {
                lVar = lVar2;
            }
            j jVar2 = jVar;
            Object objX0 = X0(lVar, i9, andIncrement, jVar2);
            lVar2 = lVar;
            if (objX0 == p035d7.f.f19930m) {
                b1 b1Var = jVar2 instanceof b1 ? (b1) jVar2 : null;
                if (b1Var != null) {
                    D0(b1Var, lVar2, i9);
                    return;
                }
                return;
            }
            if (objX0 != p035d7.f.f19932o) {
                if (objX0 == p035d7.f.f19931n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar2.c();
                jVar2.g(objX0);
                return;
            }
            if (andIncrement < d0()) {
                lVar2.c();
            }
            jVar = jVar2;
        }
        y0(jVar);
    }

    public final void L(long j8) {
        l lVarO;
        P pD;
        l lVar = (l) f19890i.get(this);
        while (true) {
            long j9 = f19886e.get(this);
            if (j8 < Math.max(((long) this.f19894a) + j9, R())) {
                return;
            }
            if (f19886e.compareAndSet(this, j9, 1 + j9)) {
                int i8 = p035d7.f.f19919b;
                long j10 = j9 / ((long) i8);
                int i9 = (int) (j9 % ((long) i8));
                if (lVar.f23815c != j10) {
                    lVarO = O(j10, lVar);
                    if (lVarO == null) {
                        continue;
                    }
                } else {
                    lVarO = lVar;
                }
                Object objX0 = X0(lVarO, i9, j9, null);
                if (objX0 != p035d7.f.f19932o) {
                    lVarO.c();
                    k kVar = this.f19895b;
                    if (kVar != null && (pD = y.d(kVar, objX0, null, 2, null)) != null) {
                        throw pD;
                    }
                } else if (j9 < d0()) {
                    lVarO.c();
                }
                lVar = lVarO;
            }
        }
    }

    public final void M() {
        if (p0()) {
            return;
        }
        l lVar = (l) f19891j.get(this);
        while (true) {
            long andIncrement = f19887f.getAndIncrement(this);
            int i8 = p035d7.f.f19919b;
            long j8 = andIncrement / ((long) i8);
            if (d0() <= andIncrement) {
                if (lVar.f23815c < j8 && lVar.f() != null) {
                    u0(j8, lVar);
                }
                h0(this, 0L, 1, null);
                return;
            }
            if (lVar.f23815c != j8) {
                l lVarN = N(j8, lVar, andIncrement);
                if (lVarN == null) {
                    continue;
                } else {
                    lVar = lVarN;
                }
            }
            if (V0(lVar, (int) (andIncrement % ((long) i8)), andIncrement)) {
                h0(this, 0L, 1, null);
                return;
            }
            h0(this, 0L, 1, null);
        }
    }

    public final void M0(b1 b1Var) {
        O0(b1Var, true);
    }

    public final l N(long j8, l lVar, long j9) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19891j;
        o oVar = (o) p035d7.f.y();
        loop0: while (true) {
            objC = AbstractC2365d.c(lVar, j8, oVar);
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
        if (E.c(objC)) {
            K();
            u0(j8, lVar);
            h0(this, 0L, 1, null);
            return null;
        }
        l lVar2 = (l) E.b(objC);
        if (lVar2.f23815c <= j8) {
            return lVar2;
        }
        long j10 = lVar2.f23815c;
        int i8 = p035d7.f.f19919b;
        if (f19887f.compareAndSet(this, j9 + 1, j10 * ((long) i8))) {
            g0((lVar2.f23815c * ((long) i8)) - j9);
        } else {
            h0(this, 0L, 1, null);
        }
        return null;
    }

    public final void N0(b1 b1Var) {
        O0(b1Var, false);
    }

    public final l O(long j8, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19890i;
        o oVar = (o) p035d7.f.y();
        loop0: while (true) {
            objC = AbstractC2365d.c(lVar, j8, oVar);
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
        if (E.c(objC)) {
            K();
            if (lVar.f23815c * ((long) p035d7.f.f19919b) < d0()) {
                lVar.c();
            }
            return null;
        }
        l lVar2 = (l) E.b(objC);
        if (!p0() && j8 <= R() / ((long) p035d7.f.f19919b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19891j;
            while (true) {
                D d9 = (D) atomicReferenceFieldUpdater2.get(this);
                if (d9.f23815c >= lVar2.f23815c || !lVar2.u()) {
                    break;
                }
                if (F1.b.a(atomicReferenceFieldUpdater2, this, d9, lVar2)) {
                    if (!d9.p()) {
                        break;
                    }
                    d9.n();
                    break;
                }
                if (lVar2.p()) {
                    lVar2.n();
                }
            }
        }
        long j9 = lVar2.f23815c;
        if (j9 <= j8) {
            return lVar2;
        }
        int i8 = p035d7.f.f19919b;
        b1(j9 * ((long) i8));
        if (lVar2.f23815c * ((long) i8) < d0()) {
            lVar2.c();
        }
        return null;
    }

    public final void O0(b1 b1Var, boolean z8) {
        if (b1Var instanceof b) {
            InterfaceC1795l interfaceC1795lA = ((b) b1Var).a();
            q.a aVar = q.f1441b;
            interfaceC1795lA.resumeWith(q.b(Boolean.FALSE));
            return;
        }
        if (b1Var instanceof InterfaceC1795l) {
            G6.d dVar = (G6.d) b1Var;
            q.a aVar2 = q.f1441b;
            dVar.resumeWith(q.b(r.a(z8 ? W() : a0())));
        } else if (b1Var instanceof w) {
            C1797m c1797m = ((w) b1Var).f19960a;
            q.a aVar3 = q.f1441b;
            c1797m.resumeWith(q.b(k.b(k.f19942b.a(T()))));
        } else if (b1Var instanceof a) {
            ((a) b1Var).j();
        } else {
            if (b1Var instanceof j) {
                ((j) b1Var).e(this, p035d7.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + b1Var).toString());
        }
    }

    public final l P(long j8, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19889h;
        o oVar = (o) p035d7.f.y();
        loop0: while (true) {
            objC = AbstractC2365d.c(lVar, j8, oVar);
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
        if (E.c(objC)) {
            K();
            if (lVar.f23815c * ((long) p035d7.f.f19919b) < Z()) {
                lVar.c();
            }
            return null;
        }
        l lVar2 = (l) E.b(objC);
        long j9 = lVar2.f23815c;
        if (j9 <= j8) {
            return lVar2;
        }
        int i8 = p035d7.f.f19919b;
        c1(j9 * ((long) i8));
        if (lVar2.f23815c * ((long) i8) < Z()) {
            lVar2.c();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    public final Object Q0(l lVar, int i8, Object obj, long j8, G6.d dVar) {
        G g8;
        Object objS;
        l lVarP;
        C1797m c1797mB = AbstractC1801o.b(H6.b.c(dVar));
        try {
            int iZ0 = Z0(lVar, i8, obj, j8, c1797mB, false);
            if (iZ0 == 0) {
                lVar.c();
                q.a aVar = q.f1441b;
                g8 = G.f1419a;
            } else {
                if (iZ0 != 1) {
                    if (iZ0 != 2) {
                        if (iZ0 != 4) {
                            String str = "unexpected";
                            if (iZ0 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            lVar.c();
                            l lVar2 = (l) b0().get(this);
                            while (true) {
                                long andIncrement = c0().getAndIncrement(this);
                                long j9 = 1152921504606846975L & andIncrement;
                                boolean zN0 = n0(andIncrement);
                                int i9 = p035d7.f.f19919b;
                                long j10 = j9 / ((long) i9);
                                int i10 = (int) (j9 % ((long) i9));
                                str = str;
                                if (lVar2.f23815c != j10) {
                                    lVarP = P(j10, lVar2);
                                    if (lVarP == null) {
                                        if (zN0) {
                                        }
                                    }
                                } else {
                                    lVarP = lVar2;
                                }
                                int iZ1 = Z0(lVarP, i10, obj, j9, c1797mB, zN0);
                                if (iZ1 == 0) {
                                    lVarP.c();
                                    q.a aVar2 = q.f1441b;
                                    g8 = G.f1419a;
                                } else if (iZ1 == 1) {
                                    q.a aVar3 = q.f1441b;
                                    g8 = G.f1419a;
                                } else if (iZ1 == 2) {
                                    if (!zN0) {
                                        C1797m c1797m = c1797mB != null ? c1797mB : null;
                                        if (c1797m == null) {
                                            break;
                                        }
                                        E0(c1797m, lVarP, i10);
                                        break;
                                    }
                                    lVarP.t();
                                } else {
                                    if (iZ1 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iZ1 != 4) {
                                        if (iZ1 == 5) {
                                            lVarP.c();
                                        }
                                        lVar2 = lVarP;
                                    } else if (j9 < Z()) {
                                        lVarP.c();
                                    }
                                }
                            }
                        } else if (j8 < Z()) {
                            lVar.c();
                        }
                        A0(obj, c1797mB);
                        break;
                    } else {
                        E0(c1797mB, lVar, i8);
                    }
                    objS = c1797mB.s();
                    if (objS == H6.c.f()) {
                        h.c(dVar);
                    }
                    if (objS == H6.c.f()) {
                        return objS;
                    }
                    return G.f1419a;
                }
                q.a aVar4 = q.f1441b;
                g8 = G.f1419a;
            }
            c1797mB.resumeWith(q.b(g8));
            objS = c1797mB.s();
            if (objS == H6.c.f()) {
                h.c(dVar);
            }
            if (objS == H6.c.f()) {
                return objS;
            }
            return G.f1419a;
        } catch (Throwable th) {
            c1797mB.M();
            throw th;
        }
    }

    public final long R() {
        return f19887f.get(this);
    }

    public final boolean R0(long j8) {
        if (n0(j8)) {
            return false;
        }
        return !D(j8 & 1152921504606846975L);
    }

    public final boolean S0(Object obj, Object obj2) {
        if (obj instanceof j) {
            return ((j) obj).e(this, obj2);
        }
        if (obj instanceof w) {
            t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            w wVar = (w) obj;
            C1797m c1797m = wVar.f19960a;
            k kVarB = k.b(k.f19942b.c(obj2));
            k kVar = this.f19895b;
            return p035d7.f.B(c1797m, kVarB, kVar != null ? y.a(kVar, obj2, wVar.f19960a.getContext()) : null);
        }
        if (obj instanceof a) {
            t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC1795l) {
            t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1795l interfaceC1795l = (InterfaceC1795l) obj;
            k kVar2 = this.f19895b;
            return p035d7.f.B(interfaceC1795l, obj2, kVar2 != null ? y.a(kVar2, obj2, interfaceC1795l.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Throwable T() {
        return (Throwable) f19892k.get(this);
    }

    public final boolean T0(Object obj, l lVar, int i8) {
        if (obj instanceof InterfaceC1795l) {
            t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return p035d7.f.C((InterfaceC1795l) obj, G.f1419a, null, 2, null);
        }
        if (obj instanceof j) {
            t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            l lVarX = ((i) obj).x(this, G.f1419a);
            if (lVarX == l.REREGISTER) {
                lVar.w(i8);
            }
            return lVarX == l.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return p035d7.f.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object U0(Object obj) {
        l lVarP;
        Object obj2 = p035d7.f.f19921d;
        l lVar = (l) b0().get(this);
        while (true) {
            long andIncrement = c0().getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zN0 = n0(andIncrement);
            int i8 = p035d7.f.f19919b;
            long j9 = j8 / ((long) i8);
            int i9 = (int) (j8 % ((long) i8));
            if (lVar.f23815c != j9) {
                lVarP = P(j9, lVar);
                if (lVarP == null) {
                    if (zN0) {
                        return k.f19942b.a(a0());
                    }
                }
            } else {
                lVarP = lVar;
            }
            Object obj3 = obj;
            int iZ0 = Z0(lVarP, i9, obj3, j8, obj2, zN0);
            lVar = lVarP;
            if (iZ0 == 0) {
                lVar.c();
                return k.f19942b.c(G.f1419a);
            }
            if (iZ0 == 1) {
                return k.f19942b.c(G.f1419a);
            }
            if (iZ0 == 2) {
                if (zN0) {
                    lVar.t();
                    return k.f19942b.a(a0());
                }
                b1 b1Var = obj2 instanceof b1 ? (b1) obj2 : null;
                if (b1Var != null) {
                    E0(b1Var, lVar, i9);
                }
                L((lVar.f23815c * ((long) i8)) + ((long) i9));
                return k.f19942b.c(G.f1419a);
            }
            if (iZ0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iZ0 == 4) {
                if (j8 < Z()) {
                    lVar.c();
                }
                return k.f19942b.a(a0());
            }
            if (iZ0 == 5) {
                lVar.c();
            }
            obj = obj3;
        }
    }

    public final boolean V0(l lVar, int i8, long j8) {
        Object objB = lVar.B(i8);
        if (!(objB instanceof b1) || j8 < f19886e.get(this) || !lVar.v(i8, objB, p035d7.f.f19924g)) {
            return W0(lVar, i8, j8);
        }
        if (T0(objB, lVar, i8)) {
            lVar.F(i8, p035d7.f.f19921d);
            return true;
        }
        lVar.F(i8, p035d7.f.f19927j);
        lVar.C(i8, false);
        return false;
    }

    public final Throwable W() {
        Throwable thT = T();
        return thT == null ? new p("Channel was closed") : thT;
    }

    public final boolean W0(l lVar, int i8, long j8) {
        while (true) {
            Object objB = lVar.B(i8);
            if (objB instanceof b1) {
                if (j8 < f19886e.get(this)) {
                    if (lVar.v(i8, objB, new z((b1) objB))) {
                        return true;
                    }
                } else if (lVar.v(i8, objB, p035d7.f.f19924g)) {
                    if (T0(objB, lVar, i8)) {
                        lVar.F(i8, p035d7.f.f19921d);
                        return true;
                    }
                    lVar.F(i8, p035d7.f.f19927j);
                    lVar.C(i8, false);
                    return false;
                }
            } else {
                if (objB == p035d7.f.f19927j) {
                    return false;
                }
                if (objB == null) {
                    if (lVar.v(i8, objB, p035d7.f.f19922e)) {
                        return true;
                    }
                } else {
                    if (objB == p035d7.f.f19921d || objB == p035d7.f.f19925h || objB == p035d7.f.f19926i || objB == p035d7.f.f19928k || objB == p035d7.f.z()) {
                        return true;
                    }
                    if (objB != p035d7.f.f19923f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    public final Object X0(l lVar, int i8, long j8, Object obj) {
        Object objB = lVar.B(i8);
        if (objB == null) {
            if (j8 >= (f19885d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return p035d7.f.f19931n;
                }
                if (lVar.v(i8, objB, obj)) {
                    M();
                    return p035d7.f.f19930m;
                }
            }
        } else if (objB == p035d7.f.f19921d && lVar.v(i8, objB, p035d7.f.f19926i)) {
            M();
            return lVar.D(i8);
        }
        return Y0(lVar, i8, j8, obj);
    }

    public final Object Y0(l lVar, int i8, long j8, Object obj) {
        while (true) {
            Object objB = lVar.B(i8);
            if (objB == null || objB == p035d7.f.f19922e) {
                if (j8 < (f19885d.get(this) & 1152921504606846975L)) {
                    if (lVar.v(i8, objB, p035d7.f.f19925h)) {
                        M();
                        return p035d7.f.f19932o;
                    }
                } else {
                    if (obj == null) {
                        return p035d7.f.f19931n;
                    }
                    if (lVar.v(i8, objB, obj)) {
                        M();
                        return p035d7.f.f19930m;
                    }
                }
            } else {
                if (objB != p035d7.f.f19921d) {
                    if (objB != p035d7.f.f19927j && objB != p035d7.f.f19925h) {
                        if (objB == p035d7.f.z()) {
                            M();
                            return p035d7.f.f19932o;
                        }
                        if (objB != p035d7.f.f19924g && lVar.v(i8, objB, p035d7.f.f19923f)) {
                            boolean z8 = objB instanceof z;
                            if (z8) {
                                objB = ((z) objB).f19961a;
                            }
                            if (T0(objB, lVar, i8)) {
                                lVar.F(i8, p035d7.f.f19926i);
                                M();
                                return lVar.D(i8);
                            }
                            lVar.F(i8, p035d7.f.f19927j);
                            lVar.C(i8, false);
                            if (z8) {
                                M();
                            }
                            return p035d7.f.f19932o;
                        }
                    }
                    return p035d7.f.f19932o;
                }
                if (lVar.v(i8, objB, p035d7.f.f19926i)) {
                    M();
                    return lVar.D(i8);
                }
            }
        }
    }

    public final long Z() {
        return f19886e.get(this);
    }

    public final int Z0(l lVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        lVar.G(i8, obj);
        if (z8) {
            return a1(lVar, i8, obj, j8, obj2, z8);
        }
        Object objB = lVar.B(i8);
        if (objB == null) {
            if (D(j8)) {
                if (lVar.v(i8, null, p035d7.f.f19921d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.v(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof b1) {
            lVar.w(i8);
            if (S0(objB, obj)) {
                lVar.F(i8, p035d7.f.f19926i);
                B0();
                return 0;
            }
            if (lVar.x(i8, p035d7.f.f19928k) == p035d7.f.f19928k) {
                return 5;
            }
            lVar.C(i8, true);
            return 5;
        }
        return a1(lVar, i8, obj, j8, obj2, z8);
    }

    public final Throwable a0() {
        Throwable thT = T();
        return thT == null ? new q("Channel was closed") : thT;
    }

    public final int a1(l lVar, int i8, Object obj, long j8, Object obj2, boolean z8) {
        while (true) {
            Object objB = lVar.B(i8);
            if (objB == null) {
                if (!D(j8) || z8) {
                    if (z8) {
                        if (lVar.v(i8, null, p035d7.f.f19927j)) {
                            lVar.C(i8, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.v(i8, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.v(i8, null, p035d7.f.f19921d)) {
                    return 1;
                }
            } else {
                if (objB != p035d7.f.f19922e) {
                    if (objB == p035d7.f.f19928k) {
                        lVar.w(i8);
                        return 5;
                    }
                    if (objB == p035d7.f.f19925h) {
                        lVar.w(i8);
                        return 5;
                    }
                    if (objB == p035d7.f.z()) {
                        lVar.w(i8);
                        K();
                        return 4;
                    }
                    lVar.w(i8);
                    if (objB instanceof z) {
                        objB = ((z) objB).f19961a;
                    }
                    if (S0(objB, obj)) {
                        lVar.F(i8, p035d7.f.f19926i);
                        B0();
                        return 0;
                    }
                    if (lVar.x(i8, p035d7.f.f19928k) != p035d7.f.f19928k) {
                        lVar.C(i8, true);
                    }
                    return 5;
                }
                if (lVar.v(i8, objB, p035d7.f.f19921d)) {
                    return 1;
                }
            }
        }
    }

    public final void b1(long j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19886e;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(this);
            if (j9 >= j8) {
                return;
            }
            long j10 = j8;
            if (f19886e.compareAndSet(this, j9, j10)) {
                return;
            } else {
                j8 = j10;
            }
        }
    }

    public final void c1(long j8) {
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19885d;
        do {
            j9 = atomicLongFieldUpdater.get(this);
            j10 = 1152921504606846975L & j9;
            if (j10 >= j8) {
                return;
            }
        } while (!f19885d.compareAndSet(this, j9, p035d7.f.w(j10, (int) (j9 >> 60))));
    }

    @Override // p035d7.y
    public boolean d(Throwable th) {
        return H(th, false);
    }

    public final long d0() {
        return f19885d.get(this) & 1152921504606846975L;
    }

    public final void d1(long j8) {
        e eVar = this;
        if (eVar.p0()) {
            return;
        }
        while (eVar.R() <= j8) {
            eVar = this;
        }
        int i8 = p035d7.f.f19920c;
        for (int i9 = 0; i9 < i8; i9++) {
            long jR = eVar.R();
            if (jR == (4611686018427387903L & f19888g.get(eVar)) && jR == eVar.R()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19888g;
        while (true) {
            long j9 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j9, p035d7.f.v(j9 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jR2 = eVar.R();
            long j10 = f19888g.get(eVar);
            long j11 = j10 & 4611686018427387903L;
            boolean z8 = (4611686018427387904L & j10) != 0;
            if (jR2 == j11 && jR2 == eVar.R()) {
                break;
            }
            if (z8) {
                eVar = this;
            } else {
                eVar = this;
                f19888g.compareAndSet(eVar, j10, p035d7.f.v(j11, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19888g;
        while (true) {
            long j12 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j12, p035d7.f.v(j12 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    public final boolean f0() {
        while (true) {
            l lVarO = (l) f19890i.get(this);
            long jZ = Z();
            if (d0() <= jZ) {
                return false;
            }
            int i8 = p035d7.f.f19919b;
            long j8 = jZ / ((long) i8);
            if (lVarO.f23815c == j8 || (lVarO = O(j8, lVarO)) != null) {
                lVarO.c();
                if (j0(lVarO, (int) (jZ % ((long) i8)), jZ)) {
                    return true;
                }
                f19886e.compareAndSet(this, jZ, 1 + jZ);
            } else if (((l) f19890i.get(this)).f23815c < j8) {
                return false;
            }
        }
    }

    @Override // p035d7.x
    public Object g() {
        l lVarO;
        long j8 = f19886e.get(this);
        long j9 = f19885d.get(this);
        if (m0(j9)) {
            return k.f19942b.a(T());
        }
        if (j8 >= (j9 & 1152921504606846975L)) {
            return k.f19942b.b();
        }
        Object obj = p035d7.f.f19928k;
        l lVar = (l) X().get(this);
        while (!l0()) {
            long andIncrement = Y().getAndIncrement(this);
            int i8 = p035d7.f.f19919b;
            long j10 = andIncrement / ((long) i8);
            int i9 = (int) (andIncrement % ((long) i8));
            if (lVar.f23815c != j10) {
                lVarO = O(j10, lVar);
                if (lVarO == null) {
                    continue;
                }
            } else {
                lVarO = lVar;
            }
            Object objX0 = X0(lVarO, i9, andIncrement, obj);
            if (objX0 == p035d7.f.f19930m) {
                b1 b1Var = obj instanceof b1 ? (b1) obj : null;
                if (b1Var != null) {
                    D0(b1Var, lVarO, i9);
                }
                d1(andIncrement);
                lVarO.t();
                return k.f19942b.b();
            }
            if (objX0 != p035d7.f.f19932o) {
                if (objX0 == p035d7.f.f19931n) {
                    throw new IllegalStateException("unexpected");
                }
                lVarO.c();
                return k.f19942b.c(objX0);
            }
            if (andIncrement < d0()) {
                lVarO.c();
            }
            lVar = lVarO;
        }
        return k.f19942b.a(T());
    }

    public final void g0(long j8) {
        if ((f19888g.addAndGet(this, j8) & 4611686018427387904L) != 0) {
            while ((f19888g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    @Override // p035d7.x
    public Object h(G6.d dVar) {
        return H0(this, dVar);
    }

    @Override // p035d7.y
    public Object i(Object obj, G6.d dVar) {
        return P0(this, obj, dVar);
    }

    public final void i0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19893l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!F1.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? p035d7.f.f19934q : p035d7.f.f19935r));
        if (obj == null) {
            return;
        }
        ((k) obj).invoke(T());
    }

    @Override // p035d7.x
    public i iterator() {
        return new a();
    }

    public final boolean j0(l lVar, int i8, long j8) {
        Object objB;
        do {
            objB = lVar.B(i8);
            if (objB != null && objB != p035d7.f.f19922e) {
                if (objB == p035d7.f.f19921d) {
                    return true;
                }
                if (objB == p035d7.f.f19927j || objB == p035d7.f.z() || objB == p035d7.f.f19926i || objB == p035d7.f.f19925h) {
                    return false;
                }
                if (objB == p035d7.f.f19924g) {
                    return true;
                }
                return objB != p035d7.f.f19923f && j8 == Z();
            }
        } while (!lVar.v(i8, objB, p035d7.f.f19925h));
        M();
        return false;
    }

    @Override // p035d7.y
    public void k(k kVar) {
        if (F1.b.a(f19893l, this, null, kVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19893l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != p035d7.f.f19934q) {
                if (obj == p035d7.f.f19935r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!F1.b.a(f19893l, this, p035d7.f.f19934q, p035d7.f.f19935r));
        kVar.invoke(T());
    }

    public final boolean k0(long j8, boolean z8) throws IllegalAccessException, InvocationTargetException {
        int i8 = (int) (j8 >> 60);
        if (i8 == 0 || i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            J(j8 & 1152921504606846975L);
            return (z8 && f0()) ? false : true;
        }
        if (i8 == 3) {
            I(j8 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i8).toString());
    }

    @Override // p035d7.x
    public Object l(G6.d dVar) {
        return G0(this, dVar);
    }

    public boolean l0() {
        return m0(f19885d.get(this));
    }

    @Override // p035d7.y
    public Object m(Object obj) {
        l lVar;
        if (R0(f19885d.get(this))) {
            return k.f19942b.b();
        }
        Object obj2 = p035d7.f.f19927j;
        l lVar2 = (l) b0().get(this);
        while (true) {
            long andIncrement = c0().getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zN0 = n0(andIncrement);
            int i8 = p035d7.f.f19919b;
            long j9 = j8 / ((long) i8);
            int i9 = (int) (j8 % ((long) i8));
            if (lVar2.f23815c != j9) {
                l lVarP = P(j9, lVar2);
                if (lVarP != null) {
                    lVar = lVarP;
                } else if (zN0) {
                    return k.f19942b.a(a0());
                }
            } else {
                lVar = lVar2;
            }
            int iZ0 = Z0(lVar, i9, obj, j8, obj2, zN0);
            lVar2 = lVar;
            if (iZ0 == 0) {
                lVar2.c();
                return k.f19942b.c(G.f1419a);
            }
            if (iZ0 == 1) {
                return k.f19942b.c(G.f1419a);
            }
            if (iZ0 == 2) {
                if (zN0) {
                    lVar2.t();
                    return k.f19942b.a(a0());
                }
                b1 b1Var = obj2 instanceof b1 ? (b1) obj2 : null;
                if (b1Var != null) {
                    E0(b1Var, lVar2, i9);
                }
                lVar2.t();
                return k.f19942b.b();
            }
            if (iZ0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iZ0 == 4) {
                if (j8 < Z()) {
                    lVar2.c();
                }
                return k.f19942b.a(a0());
            }
            if (iZ0 == 5) {
                lVar2.c();
            }
            obj = obj;
        }
    }

    public final boolean m0(long j8) {
        return k0(j8, true);
    }

    @Override // p035d7.y
    public boolean n() {
        return n0(f19885d.get(this));
    }

    public final boolean n0(long j8) {
        return k0(j8, false);
    }

    public boolean o0() {
        return false;
    }

    public final boolean p0() {
        long jR = R();
        return jR == 0 || jR == Long.MAX_VALUE;
    }

    public final long q0(l lVar) {
        do {
            int i8 = p035d7.f.f19919b;
            while (true) {
                i8--;
                if (-1 < i8) {
                    long j8 = (lVar.f23815c * ((long) p035d7.f.f19919b)) + ((long) i8);
                    if (j8 >= Z()) {
                        while (true) {
                            Object objB = lVar.B(i8);
                            if (objB != null && objB != p035d7.f.f19922e) {
                                if (objB != p035d7.f.f19921d) {
                                    break;
                                }
                                return j8;
                            }
                            if (lVar.v(i8, objB, p035d7.f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        return -1L;
    }

    public final void r0() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19885d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (((int) (j8 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, p035d7.f.w(1152921504606846975L & j8, 1)));
    }

    public final void s0() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19885d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, p035d7.f.w(1152921504606846975L & j8, 3)));
    }

    public final void t0() {
        long j8;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19885d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 >> 60);
            if (i8 == 0) {
                jW = p035d7.f.w(1152921504606846975L & j8, 2);
            } else if (i8 != 1) {
                return;
            } else {
                jW = p035d7.f.w(1152921504606846975L & j8, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, jW));
    }

    public final void u0(long j8, l lVar) {
        l lVar2;
        l lVar3;
        while (lVar.f23815c < j8 && (lVar3 = (l) lVar.f()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.k() || (lVar2 = (l) lVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19891j;
                while (true) {
                    D d8 = (D) atomicReferenceFieldUpdater.get(this);
                    if (d8.f23815c >= lVar.f23815c) {
                        return;
                    }
                    if (!lVar.u()) {
                        break;
                    }
                    if (F1.b.a(atomicReferenceFieldUpdater, this, d8, lVar)) {
                        if (d8.p()) {
                            d8.n();
                            return;
                        }
                        return;
                    } else if (lVar.p()) {
                        lVar.n();
                    }
                }
            } else {
                lVar = lVar2;
            }
        }
    }

    public void v0() {
    }

    public final void w0(InterfaceC1795l interfaceC1795l) {
        q.a aVar = q.f1441b;
        interfaceC1795l.resumeWith(q.b(k.b(k.f19942b.a(T()))));
    }

    public final void x0(InterfaceC1795l interfaceC1795l) {
        q.a aVar = q.f1441b;
        interfaceC1795l.resumeWith(q.b(r.a(W())));
    }

    public final void y0(j jVar) {
        jVar.g(p035d7.f.z());
    }

    @Override // p035d7.x
    public final void z(CancellationException cancellationException) {
        E(cancellationException);
    }

    public final Object z0(Object obj, G6.d dVar) throws IllegalAccessException, InvocationTargetException {
        P pD;
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        k kVar = this.f19895b;
        if (kVar == null || (pD = y.d(kVar, obj, null, 2, null)) == null) {
            Throwable thA0 = a0();
            q.a aVar = q.f1441b;
            c1797m.resumeWith(q.b(r.a(thA0)));
        } else {
            C0918g.a(pD, a0());
            q.a aVar2 = q.f1441b;
            c1797m.resumeWith(q.b(r.a(pD)));
        }
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            h.c(dVar);
        }
        return objS == H6.c.f() ? objS : G.f1419a;
    }

    public final void L0(l lVar) throws IllegalAccessException, InvocationTargetException {
        k kVar = this.f19895b;
        P pC = null;
        Object objB = AbstractC2374m.b(null, 1, null);
        loop0: do {
            for (int i8 = p035d7.f.f19919b - 1; -1 < i8; i8--) {
                long j8 = (lVar.f23815c * ((long) p035d7.f.f19919b)) + ((long) i8);
                while (true) {
                    Object objB2 = lVar.B(i8);
                    if (objB2 == p035d7.f.f19926i) {
                        break loop0;
                    }
                    if (objB2 != p035d7.f.f19921d) {
                        if (objB2 != p035d7.f.f19922e && objB2 != null) {
                            if (!(objB2 instanceof b1) && !(objB2 instanceof z)) {
                                if (objB2 != p035d7.f.f19924g && objB2 != p035d7.f.f19923f) {
                                    if (objB2 != p035d7.f.f19924g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j8 < Z()) {
                                    break loop0;
                                }
                                b1 b1Var = objB2 instanceof z ? ((z) objB2).f19961a : (b1) objB2;
                                if (lVar.v(i8, objB2, p035d7.f.z())) {
                                    if (kVar != null) {
                                        pC = y.c(kVar, lVar.A(i8), pC);
                                    }
                                    objB = AbstractC2374m.c(objB, b1Var);
                                    lVar.w(i8);
                                    lVar.t();
                                    break;
                                }
                            }
                        } else {
                            if (lVar.v(i8, objB2, p035d7.f.z())) {
                                lVar.t();
                                break;
                            }
                        }
                    } else {
                        if (j8 < Z()) {
                            break loop0;
                        }
                        if (lVar.v(i8, objB2, p035d7.f.z())) {
                            if (kVar != null) {
                                pC = y.c(kVar, lVar.A(i8), pC);
                            }
                            lVar.w(i8);
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        } while (lVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                t.e(objB, toqHM.fpgynwRM);
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    N0((b1) arrayList.get(size));
                }
            } else {
                N0((b1) objB);
            }
        }
        if (pC != null) {
            throw pC;
        }
    }

    @Override // p035d7.x
    public p089j7.f a() {
        c cVar = c.f19902a;
        t.e(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        p pVar = (p) kotlin.jvm.internal.P.e(cVar, 3);
        d dVar = d.f19903a;
        t.e(dVar, kDsnNkYbBsI.YcQnbTkZLDEOI);
        return new p089j7.g(this, pVar, (p) kotlin.jvm.internal.P.e(dVar, 3), this.f19896c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i8 = (int) (f19885d.get(this) >> 60);
        if (i8 == 2) {
            sb.append("closed,");
        } else if (i8 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f19894a + ',');
        sb.append("data=[");
        int i9 = 0;
        boolean z8 = true;
        List listQ = D6.r.q(f19890i.get(this), f19889h.get(this), f19891j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((l) obj) != p035d7.f.f19918a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((l) next).f23815c;
            do {
                Object next2 = it.next();
                long j9 = ((l) next2).f23815c;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long jZ = Z();
        long jD0 = d0();
        loop2: while (true) {
            int i10 = p035d7.f.f19919b;
            int i11 = i9;
            while (i11 < i10) {
                long j10 = (lVar.f23815c * ((long) p035d7.f.f19919b)) + ((long) i11);
                if (j10 >= jD0 && j10 >= jZ) {
                    break loop2;
                }
                Object objB = lVar.B(i11);
                Object objA = lVar.A(i11);
                boolean z9 = z8;
                if (objB instanceof InterfaceC1795l) {
                    string = (j10 >= jZ || j10 < jD0) ? (j10 >= jD0 || j10 < jZ) ? "cont" : "send" : "receive";
                } else if (objB instanceof j) {
                    string = (j10 >= jZ || j10 < jD0) ? (j10 >= jD0 || j10 < jZ) ? "select" : "onSend" : "onReceive";
                } else if (objB instanceof w) {
                    string = "receiveCatching";
                } else if (objB instanceof b) {
                    string = "sendBroadcast";
                } else if (objB instanceof z) {
                    string = "EB(" + objB + ')';
                } else if (t.c(objB, p035d7.f.f19923f) ? z9 : t.c(objB, p035d7.f.f19924g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objB == null ? z9 : t.c(objB, p035d7.f.f19922e) ? z9 : t.c(objB, p035d7.f.f19926i) ? z9 : t.c(objB, p035d7.f.f19925h) ? z9 : t.c(objB, p035d7.f.f19928k) ? z9 : t.c(objB, p035d7.f.f19927j) ? z9 : t.c(objB, p035d7.f.z()))) {
                        string = objB.toString();
                    }
                    i11++;
                    z8 = z9;
                }
                if (objA != null) {
                    sb.append('(' + string + ',' + objA + "),");
                } else {
                    sb.append(string + ',');
                }
                i11++;
                z8 = z9;
            }
            boolean z10 = z8;
            lVar = (l) lVar.f();
            if (lVar == null) {
                break;
            }
            z8 = z10;
            i9 = 0;
        }
        if (Z6.y.b1(sb) == ',') {
            t.f(sb.deleteCharAt(sb.length() - 1), ZWZaxQrCHfNe.BdpXNNLdo);
        }
        sb.append("]");
        return sb.toString();
    }

    public static /* synthetic */ Object G0(e eVar, G6.d dVar) throws Throwable {
        l lVar;
        l lVar2 = (l) X().get(eVar);
        while (!eVar.l0()) {
            long andIncrement = Y().getAndIncrement(eVar);
            int i8 = p035d7.f.f19919b;
            long j8 = andIncrement / ((long) i8);
            int i9 = (int) (andIncrement % ((long) i8));
            if (lVar2.f23815c != j8) {
                l lVarO = eVar.O(j8, lVar2);
                if (lVarO == null) {
                    continue;
                } else {
                    lVar = lVarO;
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object objX0 = eVar2.X0(lVar, i9, andIncrement, null);
            if (objX0 != p035d7.f.f19930m) {
                if (objX0 == p035d7.f.f19932o) {
                    if (andIncrement < eVar2.d0()) {
                        lVar.c();
                    }
                    eVar = eVar2;
                    lVar2 = lVar;
                } else {
                    if (objX0 == p035d7.f.f19931n) {
                        return eVar2.J0(lVar, i9, andIncrement, dVar);
                    }
                    lVar.c();
                    return objX0;
                }
            } else {
                throw new IllegalStateException(PCRzgdeK.ICpvKLGF);
            }
        }
        throw F.a(eVar.W());
    }

    public /* synthetic */ e(int i8, k kVar, int i9, AbstractC2633k abstractC2633k) {
        this(i8, (i9 & 2) != 0 ? null : kVar);
    }
}
