package p215z0;

import C6.C0918g;
import C6.G;
import C6.q;
import C6.r;
import C6.v;
import D6.C0938s;
import D6.w;
import D6.z;
import I0.mIk.efuWFSeiT;
import J0.AbstractC1024g;
import J0.AbstractC1028k;
import J0.AbstractC1029l;
import J0.C1020c;
import J0.H;
import J0.InterfaceC1023f;
import Q6.o;
import Q6.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1794k0;
import p017b7.AbstractC1823z0;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.J;
import p017b7.K;
import p044e7.AbstractC2262h;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H0 extends AbstractC3173q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3153g f38549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1815v0 f38551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f38552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f38554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B0.b f38555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f38556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f38557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f38558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f38559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f38560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f38561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Set f38562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1795l f38563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f38565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f38566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f38567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f38568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC1818x f38569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final G6.g f38570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f38571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f38546y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f38547z = 8;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final x f38544A = O.a(C0.a.c());

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AtomicReference f38545B = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void c(c cVar) {
            C0.g gVar;
            C0.g gVarAdd;
            do {
                gVar = (C0.g) H0.f38544A.getValue();
                gVarAdd = gVar.add((Object) cVar);
                if (gVar == gVarAdd) {
                    return;
                }
            } while (!H0.f38544A.b(gVar, gVarAdd));
        }

        public final void d(c cVar) {
            C0.g gVar;
            C0.g gVarRemove;
            do {
                gVar = (C0.g) H0.f38544A.getValue();
                gVarRemove = gVar.remove((Object) cVar);
                if (gVar == gVarRemove) {
                    return;
                }
            } while (!H0.f38544A.b(gVar, gVarRemove));
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f38572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f38573b;

        public b(boolean z8, Exception exc) {
            this.f38572a = z8;
            this.f38573b = exc;
        }

        public Exception a() {
            return this.f38573b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        f38578d,
        Idle,
        PendingWork
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m290invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m290invoke() {
            InterfaceC1795l interfaceC1795lA0;
            Object obj = H0.this.f38550c;
            H0 h8 = H0.this;
            synchronized (obj) {
                interfaceC1795lA0 = h8.a0();
                if (((d) h8.f38568u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw AbstractC1794k0.a("Recomposer shutdown; frame clock awaiter will never resume", h8.f38552e);
                }
            }
            if (interfaceC1795lA0 != null) {
                q.a aVar = q.f1441b;
                interfaceC1795lA0.resumeWith(q.b(G.f1419a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ H0 f38584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Throwable f38585b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(H0 h8, Throwable th) {
                super(1);
                this.f38584a = h8;
                this.f38585b = th;
            }

            public final void b(Throwable th) {
                Object obj = this.f38584a.f38550c;
                H0 h8 = this.f38584a;
                Throwable th2 = this.f38585b;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                C0918g.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    h8.f38552e = th2;
                    h8.f38568u.setValue(d.ShutDown);
                    G g8 = G.f1419a;
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        public f() {
            super(1);
        }

        public final void b(Throwable th) {
            InterfaceC1795l interfaceC1795l;
            InterfaceC1795l interfaceC1795l2;
            CancellationException cancellationExceptionA = AbstractC1794k0.a("Recomposer effect job completed", th);
            Object obj = H0.this.f38550c;
            H0 h8 = H0.this;
            synchronized (obj) {
                try {
                    InterfaceC1815v0 interfaceC1815v0 = h8.f38551d;
                    interfaceC1795l = null;
                    if (interfaceC1815v0 != null) {
                        h8.f38568u.setValue(d.ShuttingDown);
                        if (h8.f38565r) {
                            if (h8.f38563p != null) {
                                interfaceC1795l2 = h8.f38563p;
                            }
                            h8.f38563p = null;
                            interfaceC1815v0.H0(new a(h8, th));
                            interfaceC1795l = interfaceC1795l2;
                        } else {
                            interfaceC1815v0.z(cancellationExceptionA);
                        }
                        interfaceC1795l2 = null;
                        h8.f38563p = null;
                        interfaceC1815v0.H0(new a(h8, th));
                        interfaceC1795l = interfaceC1795l2;
                    } else {
                        h8.f38552e = cancellationExceptionA;
                        h8.f38568u.setValue(d.ShutDown);
                        G g8 = G.f1419a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC1795l != null) {
                q.a aVar = q.f1441b;
                interfaceC1795l.resumeWith(q.b(G.f1419a));
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f38587b;

        public g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            g gVar = new g(dVar);
            gVar.f38587b = obj;
            return gVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, G6.d dVar2) {
            return ((g) create(dVar, dVar2)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f38586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return I6.b.a(((d) this.f38587b) == d.ShutDown);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B0.b f38588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B f38589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(B0.b bVar, B b8) {
            super(0);
            this.f38588a = bVar;
            this.f38589b = b8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m291invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m291invoke() {
            B0.b bVar = this.f38588a;
            B b8 = this.f38589b;
            Object[] objArrT = bVar.t();
            int size = bVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = objArrT[i8];
                t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                b8.q(obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f38590a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(B b8) {
            super(1);
            this.f38590a = b8;
        }

        public final void b(Object obj) {
            this.f38590a.a(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f38591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f38593c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f38595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3146c0 f38596f;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f38597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f38598b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f38599c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3146c0 f38600d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, InterfaceC3146c0 interfaceC3146c0, G6.d dVar) {
                super(2, dVar);
                this.f38599c = pVar;
                this.f38600d = interfaceC3146c0;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f38599c, this.f38600d, dVar);
                aVar.f38598b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f38597a;
                if (i8 == 0) {
                    r.b(obj);
                    J j8 = (J) this.f38598b;
                    p pVar = this.f38599c;
                    InterfaceC3146c0 interfaceC3146c0 = this.f38600d;
                    this.f38597a = 1;
                    if (pVar.invoke(j8, interfaceC3146c0, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ H0 f38601a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(H0 h8) {
                super(2);
                this.f38601a = h8;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Set) obj, (AbstractC1028k) obj2);
                return G.f1419a;
            }

            public final void b(Set set, AbstractC1028k abstractC1028k) {
                InterfaceC1795l interfaceC1795lA0;
                Object obj = this.f38601a.f38550c;
                H0 h8 = this.f38601a;
                synchronized (obj) {
                    try {
                        if (((d) h8.f38568u.getValue()).compareTo(d.Idle) >= 0) {
                            if (set instanceof B0.b) {
                                B0.b bVar = (B0.b) set;
                                Object[] objArrT = bVar.t();
                                int size = bVar.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    Object obj2 = objArrT[i8];
                                    t.e(obj2, efuWFSeiT.fbnU);
                                    if (!(obj2 instanceof H) || ((H) obj2).e(AbstractC1024g.a(1))) {
                                        h8.f38555h.add(obj2);
                                    }
                                }
                            } else {
                                for (Object obj3 : set) {
                                    if (!(obj3 instanceof H) || ((H) obj3).e(AbstractC1024g.a(1))) {
                                        h8.f38555h.add(obj3);
                                    }
                                }
                            }
                            interfaceC1795lA0 = h8.a0();
                        } else {
                            interfaceC1795lA0 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC1795lA0 != null) {
                    q.a aVar = q.f1441b;
                    interfaceC1795lA0.resumeWith(q.b(G.f1419a));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p pVar, InterfaceC3146c0 interfaceC3146c0, G6.d dVar) {
            super(2, dVar);
            this.f38595e = pVar;
            this.f38596f = interfaceC3146c0;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            j jVar = H0.this.new j(this.f38595e, this.f38596f, dVar);
            jVar.f38593c = obj;
            return jVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((j) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:28:0x0099, B:30:0x009f, B:33:0x00a5), top: B:58:0x0099 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ce A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:44:0x00c8, B:46:0x00ce, B:49:0x00d4), top: B:56:0x00c8 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC1815v0 interfaceC1815v0N;
            InterfaceC1023f interfaceC1023f;
            Throwable th;
            List listI0;
            Object obj2;
            H0 h8;
            Object obj3;
            H0 h9;
            Object objF = H6.c.f();
            int i8 = this.f38592b;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1023f = (InterfaceC1023f) this.f38591a;
                interfaceC1815v0N = (InterfaceC1815v0) this.f38593c;
                try {
                    r.b(obj);
                    interfaceC1023f.d();
                    obj3 = H0.this.f38550c;
                    h9 = H0.this;
                    synchronized (obj3) {
                        try {
                            if (h9.f38551d == interfaceC1815v0N) {
                                h9.f38551d = null;
                            }
                            h9.a0();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    H0.f38546y.d(H0.this.f38571x);
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1023f.d();
                    obj2 = H0.this.f38550c;
                    h8 = H0.this;
                    synchronized (obj2) {
                        try {
                            if (h8.f38551d == interfaceC1815v0N) {
                                h8.f38551d = null;
                            }
                            h8.a0();
                            H0.f38546y.d(H0.this.f38571x);
                            throw th;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            r.b(obj);
            interfaceC1815v0N = AbstractC1823z0.n(((J) this.f38593c).getCoroutineContext());
            H0.this.v0(interfaceC1815v0N);
            InterfaceC1023f interfaceC1023fG = AbstractC1028k.f3974e.g(new b(H0.this));
            H0.f38546y.c(H0.this.f38571x);
            try {
                Object obj4 = H0.this.f38550c;
                H0 h10 = H0.this;
                synchronized (obj4) {
                    listI0 = h10.i0();
                }
                int size = listI0.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((B) listI0.get(i9)).v();
                }
                a aVar = new a(this.f38595e, this.f38596f, null);
                this.f38593c = interfaceC1815v0N;
                this.f38591a = interfaceC1023fG;
                this.f38592b = 1;
                if (K.f(aVar, this) == objF) {
                    return objF;
                }
                interfaceC1023f = interfaceC1023fG;
                interfaceC1023f.d();
                obj3 = H0.this.f38550c;
                h9 = H0.this;
                synchronized (obj3) {
                    if (h9.f38551d == interfaceC1815v0N) {
                        h9.f38551d = null;
                    }
                    h9.a0();
                    H0.f38546y.d(H0.this.f38571x);
                    return G.f1419a;
                }
            } catch (Throwable th5) {
                interfaceC1023f = interfaceC1023fG;
                th = th5;
                interfaceC1023f.d();
                obj2 = H0.this.f38550c;
                h8 = H0.this;
                synchronized (obj2) {
                    if (h8.f38551d == interfaceC1815v0N) {
                        h8.f38551d = null;
                    }
                    h8.a0();
                }
                H0.f38546y.d(H0.this.f38571x);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f38602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f38603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f38604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f38605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f38606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f38607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f38608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f38609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f38610i;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ H0 f38612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0.b f38613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ B0.b f38614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List f38615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List f38616e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Set f38617f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ List f38618g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Set f38619h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(H0 h8, B0.b bVar, B0.b bVar2, List list, List list2, Set set, List list3, Set set2) {
                super(1);
                this.f38612a = h8;
                this.f38613b = bVar;
                this.f38614c = bVar2;
                this.f38615d = list;
                this.f38616e = list2;
                this.f38617f = set;
                this.f38618g = list3;
                this.f38619h = set2;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x0179 A[Catch: all -> 0x00c7, TryCatch #3 {all -> 0x00c7, blocks: (B:11:0x0047, B:12:0x004e, B:19:0x0073, B:20:0x0074, B:21:0x007a, B:23:0x0080, B:26:0x0088, B:28:0x008e, B:40:0x00c3, B:54:0x00e5, B:55:0x00e8, B:49:0x00da, B:56:0x00e9, B:67:0x0117, B:79:0x0135, B:90:0x015a, B:102:0x0179, B:103:0x017d, B:105:0x0181, B:106:0x0182, B:108:0x0196, B:109:0x0197, B:100:0x0175, B:101:0x0178, B:97:0x016e, B:77:0x0131, B:78:0x0134, B:74:0x012b, B:121:0x01bd, B:123:0x01c6, B:124:0x01ca, B:136:0x01f3, B:138:0x01f5, B:139:0x01f6, B:140:0x01f7, B:142:0x01fd, B:143:0x0200, B:145:0x0206, B:149:0x021a, B:157:0x023c, B:158:0x023f, B:155:0x0236, B:159:0x0240, B:160:0x0241, B:29:0x0098, B:31:0x009f, B:36:0x00b1, B:38:0x00b7, B:13:0x004f, B:15:0x005b, B:18:0x006a, B:81:0x013e, B:82:0x0145, B:84:0x014b, B:110:0x0198, B:112:0x019f, B:114:0x01ae, B:125:0x01cb, B:127:0x01d6, B:129:0x01e2, B:131:0x01e8, B:134:0x01ee, B:135:0x01f1, B:58:0x00f2, B:59:0x0102, B:61:0x0108, B:104:0x017e), top: B:169:0x0047, inners: #0, #2, #5, #6, #8, #9, #10, #15 }] */
            /* JADX WARN: Code duplicated, block: B:172:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:181:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:189:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:61:0x0108 A[Catch: all -> 0x0112, Exception -> 0x0114, TRY_LEAVE, TryCatch #10 {Exception -> 0x0114, blocks: (B:58:0x00f2, B:59:0x0102, B:61:0x0108), top: B:181:0x00f2, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:79:0x0135 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #3 {all -> 0x00c7, blocks: (B:11:0x0047, B:12:0x004e, B:19:0x0073, B:20:0x0074, B:21:0x007a, B:23:0x0080, B:26:0x0088, B:28:0x008e, B:40:0x00c3, B:54:0x00e5, B:55:0x00e8, B:49:0x00da, B:56:0x00e9, B:67:0x0117, B:79:0x0135, B:90:0x015a, B:102:0x0179, B:103:0x017d, B:105:0x0181, B:106:0x0182, B:108:0x0196, B:109:0x0197, B:100:0x0175, B:101:0x0178, B:97:0x016e, B:77:0x0131, B:78:0x0134, B:74:0x012b, B:121:0x01bd, B:123:0x01c6, B:124:0x01ca, B:136:0x01f3, B:138:0x01f5, B:139:0x01f6, B:140:0x01f7, B:142:0x01fd, B:143:0x0200, B:145:0x0206, B:149:0x021a, B:157:0x023c, B:158:0x023f, B:155:0x0236, B:159:0x0240, B:160:0x0241, B:29:0x0098, B:31:0x009f, B:36:0x00b1, B:38:0x00b7, B:13:0x004f, B:15:0x005b, B:18:0x006a, B:81:0x013e, B:82:0x0145, B:84:0x014b, B:110:0x0198, B:112:0x019f, B:114:0x01ae, B:125:0x01cb, B:127:0x01d6, B:129:0x01e2, B:131:0x01e8, B:134:0x01ee, B:135:0x01f1, B:58:0x00f2, B:59:0x0102, B:61:0x0108, B:104:0x017e), top: B:169:0x0047, inners: #0, #2, #5, #6, #8, #9, #10, #15 }] */
            /* JADX WARN: Code duplicated, block: B:84:0x014b A[Catch: all -> 0x0155, Exception -> 0x0157, TRY_LEAVE, TryCatch #5 {Exception -> 0x0157, blocks: (B:81:0x013e, B:82:0x0145, B:84:0x014b), top: B:172:0x013e, outer: #3 }] */
            public final void b(long j8) {
                int i8;
                List list;
                Iterator it;
                Iterator it2;
                List list2;
                if (this.f38612a.e0()) {
                    H0 h8 = this.f38612a;
                    u1 u1Var = u1.f38946a;
                    Object objA = u1Var.a("Recomposer:animation");
                    try {
                        h8.f38549b.k(j8);
                        AbstractC1028k.f3974e.k();
                        G g8 = G.f1419a;
                        u1Var.b(objA);
                    } catch (Throwable th) {
                        u1.f38946a.b(objA);
                        throw th;
                    }
                }
                H0 h9 = this.f38612a;
                B0.b bVar = this.f38613b;
                B0.b bVar2 = this.f38614c;
                List list3 = this.f38615d;
                List list4 = this.f38616e;
                Set set = this.f38617f;
                List list5 = this.f38618g;
                Set set2 = this.f38619h;
                Object objA2 = u1.f38946a.a("Recomposer:recompose");
                try {
                    h9.u0();
                    synchronized (h9.f38550c) {
                        try {
                            List list6 = h9.f38556i;
                            int size = list6.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                list3.add((B) list6.get(i9));
                            }
                            h9.f38556i.clear();
                            G g9 = G.f1419a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    bVar.clear();
                    bVar2.clear();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            break;
                        }
                        try {
                            try {
                                int size2 = list3.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    B b8 = (B) list3.get(i10);
                                    bVar2.add(b8);
                                    B bP0 = h9.p0(b8, bVar);
                                    if (bP0 != null) {
                                        list5.add(bP0);
                                    }
                                }
                                list3.clear();
                                if (bVar.u()) {
                                    synchronized (h9.f38550c) {
                                        try {
                                            List listI0 = h9.i0();
                                            int size3 = listI0.size();
                                            for (int i11 = 0; i11 < size3; i11++) {
                                                B b9 = (B) listI0.get(i11);
                                                if (!bVar2.contains(b9) && b9.e(bVar)) {
                                                    list3.add(b9);
                                                }
                                            }
                                            G g10 = G.f1419a;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        k.p(list4, h9);
                                        while (!list4.isEmpty()) {
                                            w.E(set, h9.o0(list4, bVar));
                                            k.p(list4, h9);
                                        }
                                    } catch (Exception e8) {
                                        H0.r0(h9, e8, null, true, 2, null);
                                        k.l(list3, list4, list5, set, set2, bVar, bVar2);
                                    }
                                }
                            } catch (Exception e9) {
                                H0.r0(h9, e9, null, true, 2, null);
                                list = list3;
                                try {
                                    k.l(list, list4, list5, set, set2, bVar, bVar2);
                                    list.clear();
                                } catch (Throwable th4) {
                                    th = th4;
                                    list.clear();
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            list = list3;
                            list.clear();
                            throw th;
                        }
                        u1.f38946a.b(objA2);
                    }
                    if (!list5.isEmpty()) {
                        h9.f38548a = h9.c0() + 1;
                        try {
                            try {
                                int size4 = list5.size();
                                for (int i12 = 0; i12 < size4; i12++) {
                                    set2.add((B) list5.get(i12));
                                }
                                int size5 = list5.size();
                                for (i8 = 0; i8 < size5; i8++) {
                                    ((B) list5.get(i8)).l();
                                }
                                list5.clear();
                                if (!set.isEmpty()) {
                                    try {
                                        try {
                                            w.E(set2, set);
                                            it = set.iterator();
                                            while (it.hasNext()) {
                                                ((B) it.next()).f();
                                            }
                                            set.clear();
                                            if (set2.isEmpty()) {
                                                synchronized (h9.f38550c) {
                                                    h9.a0();
                                                    AbstractC1028k.f3974e.e();
                                                    bVar2.clear();
                                                    bVar.clear();
                                                    h9.f38562o = null;
                                                    G g11 = G.f1419a;
                                                }
                                            } else {
                                                try {
                                                    try {
                                                        it2 = set2.iterator();
                                                        while (it2.hasNext()) {
                                                            ((B) it2.next()).t();
                                                        }
                                                        set2.clear();
                                                        synchronized (h9.f38550c) {
                                                            h9.a0();
                                                        }
                                                        AbstractC1028k.f3974e.e();
                                                        bVar2.clear();
                                                        bVar.clear();
                                                        h9.f38562o = null;
                                                        G g12 = G.f1419a;
                                                    } catch (Exception e10) {
                                                        H0.r0(h9, e10, null, false, 6, null);
                                                        try {
                                                            k.l(list3, list4, list5, set, set2, bVar, bVar2);
                                                            set2.clear();
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            set2 = set2;
                                                            set2.clear();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    set2.clear();
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e11) {
                                            H0.r0(h9, e11, null, false, 6, null);
                                            try {
                                                k.l(list3, list4, list5, set, set2, bVar, bVar2);
                                                set.clear();
                                            } catch (Throwable th8) {
                                                th = th8;
                                                set = set;
                                                set.clear();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        set.clear();
                                        throw th;
                                    }
                                } else if (set2.isEmpty()) {
                                    it2 = set2.iterator();
                                    while (it2.hasNext()) {
                                        ((B) it2.next()).t();
                                    }
                                    set2.clear();
                                    synchronized (h9.f38550c) {
                                        h9.a0();
                                        AbstractC1028k.f3974e.e();
                                        bVar2.clear();
                                        bVar.clear();
                                        h9.f38562o = null;
                                        G g13 = G.f1419a;
                                    }
                                } else {
                                    synchronized (h9.f38550c) {
                                        h9.a0();
                                        AbstractC1028k.f3974e.e();
                                        bVar2.clear();
                                        bVar.clear();
                                        h9.f38562o = null;
                                        G g14 = G.f1419a;
                                    }
                                }
                            } catch (Exception e12) {
                                H0.r0(h9, e12, null, false, 6, null);
                                try {
                                    k.l(list3, list4, list5, set, set2, bVar, bVar2);
                                    list5.clear();
                                } catch (Throwable th10) {
                                    th = th10;
                                    list2 = list5;
                                    list2.clear();
                                    throw th;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            list2 = list5;
                            list2.clear();
                            throw th;
                        }
                    } else if (!set.isEmpty()) {
                        w.E(set2, set);
                        it = set.iterator();
                        while (it.hasNext()) {
                            ((B) it.next()).f();
                        }
                        set.clear();
                        if (set2.isEmpty()) {
                            it2 = set2.iterator();
                            while (it2.hasNext()) {
                                ((B) it2.next()).t();
                            }
                            set2.clear();
                            synchronized (h9.f38550c) {
                                h9.a0();
                                AbstractC1028k.f3974e.e();
                                bVar2.clear();
                                bVar.clear();
                                h9.f38562o = null;
                                G g15 = G.f1419a;
                            }
                        } else {
                            synchronized (h9.f38550c) {
                                h9.a0();
                                AbstractC1028k.f3974e.e();
                                bVar2.clear();
                                bVar.clear();
                                h9.f38562o = null;
                                G g16 = G.f1419a;
                            }
                        }
                    } else if (set2.isEmpty()) {
                        it2 = set2.iterator();
                        while (it2.hasNext()) {
                            ((B) it2.next()).t();
                        }
                        set2.clear();
                        synchronized (h9.f38550c) {
                            h9.a0();
                            AbstractC1028k.f3974e.e();
                            bVar2.clear();
                            bVar.clear();
                            h9.f38562o = null;
                            G g17 = G.f1419a;
                        }
                    } else {
                        synchronized (h9.f38550c) {
                            h9.a0();
                            AbstractC1028k.f3974e.e();
                            bVar2.clear();
                            bVar.clear();
                            h9.f38562o = null;
                            G g18 = G.f1419a;
                        }
                    }
                    u1.f38946a.b(objA2);
                } catch (Throwable th12) {
                    u1.f38946a.b(objA2);
                    throw th12;
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return G.f1419a;
            }
        }

        public k(G6.d dVar) {
            super(3, dVar);
        }

        public static final void l(List list, List list2, List list3, Set set, Set set2, B0.b bVar, B0.b bVar2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
            bVar.clear();
            bVar2.clear();
        }

        public static final void p(List list, H0 h8) {
            list.clear();
            synchronized (h8.f38550c) {
                try {
                    List list2 = h8.f38558k;
                    int size = list2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        list.add((C3156h0) list2.get(i8));
                    }
                    h8.f38558k.clear();
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:17:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:20:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:23:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:25:0x00fe  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f0 -> B:24:0x00f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fe -> B:12:0x009d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.H0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, InterfaceC3146c0 interfaceC3146c0, G6.d dVar) {
            k kVar = H0.this.new k(dVar);
            kVar.f38610i = interfaceC3146c0;
            return kVar.invokeSuspend(G.f1419a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f38620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B0.b f38621b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(B b8, B0.b bVar) {
            super(1);
            this.f38620a = b8;
            this.f38621b = bVar;
        }

        public final void b(Object obj) {
            this.f38620a.q(obj);
            B0.b bVar = this.f38621b;
            if (bVar != null) {
                bVar.add(obj);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return G.f1419a;
        }
    }

    public H0(G6.g gVar) {
        C3153g c3153g = new C3153g(new e());
        this.f38549b = c3153g;
        this.f38550c = new Object();
        this.f38553f = new ArrayList();
        this.f38555h = new B0.b();
        this.f38556i = new ArrayList();
        this.f38557j = new ArrayList();
        this.f38558k = new ArrayList();
        this.f38559l = new LinkedHashMap();
        this.f38560m = new LinkedHashMap();
        this.f38568u = O.a(d.Inactive);
        InterfaceC1818x interfaceC1818xA = AbstractC1823z0.a((InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O));
        interfaceC1818xA.H0(new f());
        this.f38569v = interfaceC1818xA;
        this.f38570w = gVar.P1(c3153g).P1(interfaceC1818xA);
        this.f38571x = new c();
    }

    public static final void n0(List list, H0 h8, B b8) {
        list.clear();
        synchronized (h8.f38550c) {
            try {
                Iterator it = h8.f38558k.iterator();
                while (it.hasNext()) {
                    C3156h0 c3156h0 = (C3156h0) it.next();
                    if (t.c(c3156h0.b(), b8)) {
                        list.add(c3156h0);
                        it.remove();
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void r0(H0 h8, Exception exc, B b8, boolean z8, int i8, Object obj) throws Exception {
        if ((i8 & 2) != 0) {
            b8 = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        h8.q0(exc, b8, z8);
    }

    public final void V(B b8) {
        this.f38553f.add(b8);
        this.f38554g = null;
    }

    public final void W(C1020c c1020c) {
        try {
            if (c1020c.C() instanceof AbstractC1029l.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c1020c.d();
        } catch (Throwable th) {
            c1020c.d();
            throw th;
        }
    }

    public final Object X(G6.d dVar) {
        C1797m c1797m;
        if (h0()) {
            return G.f1419a;
        }
        C1797m c1797m2 = new C1797m(H6.b.c(dVar), 1);
        c1797m2.z();
        synchronized (this.f38550c) {
            if (h0()) {
                c1797m = c1797m2;
            } else {
                this.f38563p = c1797m2;
                c1797m = null;
            }
        }
        if (c1797m != null) {
            q.a aVar = q.f1441b;
            c1797m.resumeWith(q.b(G.f1419a));
        }
        Object objS = c1797m2.s();
        if (objS == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objS == H6.c.f() ? objS : G.f1419a;
    }

    public final void Y() {
        synchronized (this.f38550c) {
            try {
                if (((d) this.f38568u.getValue()).compareTo(d.Idle) >= 0) {
                    this.f38568u.setValue(d.ShuttingDown);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC1815v0.a.a(this.f38569v, null, 1, null);
    }

    public final void Z() {
        this.f38553f.clear();
        this.f38554g = D6.r.n();
    }

    @Override // p215z0.AbstractC3173q
    public void a(B b8, o oVar) throws Exception {
        Throwable th;
        boolean zM = b8.m();
        try {
            AbstractC1028k.a aVar = AbstractC1028k.f3974e;
            C1020c c1020cL = aVar.l(s0(b8), z0(b8, null));
            try {
                AbstractC1028k abstractC1028kL = c1020cL.l();
                try {
                    b8.b(oVar);
                    G g8 = G.f1419a;
                    c1020cL.s(abstractC1028kL);
                    W(c1020cL);
                    if (!zM) {
                        aVar.e();
                    }
                    synchronized (this.f38550c) {
                        try {
                            if (((d) this.f38568u.getValue()).compareTo(d.ShuttingDown) > 0) {
                                try {
                                    if (!i0().contains(b8)) {
                                        V(b8);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                m0(b8);
                                try {
                                    b8.l();
                                    b8.f();
                                    if (zM) {
                                        return;
                                    }
                                    aVar.e();
                                } catch (Exception e8) {
                                    r0(this, e8, null, false, 6, null);
                                }
                            } catch (Exception e9) {
                                q0(e9, b8, true);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        c1020cL.s(abstractC1028kL);
                        throw th4;
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            W(c1020cL);
                            throw th6;
                        } catch (Exception e10) {
                            e = e10;
                            q0(e, b8, true);
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final InterfaceC1795l a0() {
        d dVar;
        if (((d) this.f38568u.getValue()).compareTo(d.ShuttingDown) <= 0) {
            Z();
            this.f38555h = new B0.b();
            this.f38556i.clear();
            this.f38557j.clear();
            this.f38558k.clear();
            this.f38561n = null;
            InterfaceC1795l interfaceC1795l = this.f38563p;
            if (interfaceC1795l != null) {
                InterfaceC1795l.a.a(interfaceC1795l, null, 1, null);
            }
            this.f38563p = null;
            this.f38566s = null;
            return null;
        }
        if (this.f38566s != null) {
            dVar = d.Inactive;
        } else if (this.f38551d == null) {
            this.f38555h = new B0.b();
            this.f38556i.clear();
            dVar = f0() ? d.f38578d : d.Inactive;
        } else {
            dVar = (!this.f38556i.isEmpty() || this.f38555h.u() || !this.f38557j.isEmpty() || !this.f38558k.isEmpty() || this.f38564q > 0 || f0()) ? d.PendingWork : d.Idle;
        }
        this.f38568u.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        InterfaceC1795l interfaceC1795l2 = this.f38563p;
        this.f38563p = null;
        return interfaceC1795l2;
    }

    @Override // p215z0.AbstractC3173q
    public void b(C3156h0 c3156h0) {
        synchronized (this.f38550c) {
            I0.a(this.f38559l, c3156h0.c(), c3156h0);
        }
    }

    public final void b0() {
        int i8;
        List listN;
        synchronized (this.f38550c) {
            try {
                if (this.f38559l.isEmpty()) {
                    listN = D6.r.n();
                } else {
                    List listA = C0938s.A(this.f38559l.values());
                    this.f38559l.clear();
                    listN = new ArrayList(listA.size());
                    int size = listA.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        C3156h0 c3156h0 = (C3156h0) listA.get(i9);
                        listN.add(v.a(c3156h0, this.f38560m.get(c3156h0)));
                    }
                    this.f38560m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listN.size();
        for (i8 = 0; i8 < size2; i8++) {
            C6.o oVar = (C6.o) listN.get(i8);
            C3156h0 c3156h1 = (C3156h0) oVar.a();
            C3154g0 c3154g0 = (C3154g0) oVar.b();
            if (c3154g0 != null) {
                c3156h1.b().p(c3154g0);
            }
        }
    }

    public final long c0() {
        return this.f38548a;
    }

    @Override // p215z0.AbstractC3173q
    public boolean d() {
        return false;
    }

    public final M d0() {
        return this.f38568u;
    }

    @Override // p215z0.AbstractC3173q
    public boolean e() {
        return false;
    }

    public final boolean e0() {
        boolean zF0;
        synchronized (this.f38550c) {
            zF0 = f0();
        }
        return zF0;
    }

    public final boolean f0() {
        return !this.f38567t && this.f38549b.i();
    }

    @Override // p215z0.AbstractC3173q
    public int g() {
        return 1000;
    }

    public final boolean g0() {
        return !this.f38556i.isEmpty() || f0();
    }

    @Override // p215z0.AbstractC3173q
    public G6.g h() {
        return this.f38570w;
    }

    public final boolean h0() {
        boolean z8;
        synchronized (this.f38550c) {
            z8 = this.f38555h.u() || !this.f38556i.isEmpty() || f0();
        }
        return z8;
    }

    public final List i0() {
        List listN = this.f38554g;
        if (listN == null) {
            List list = this.f38553f;
            listN = list.isEmpty() ? D6.r.n() : new ArrayList(list);
            this.f38554g = listN;
        }
        return listN;
    }

    @Override // p215z0.AbstractC3173q
    public void j(C3156h0 c3156h0) {
        InterfaceC1795l interfaceC1795lA0;
        synchronized (this.f38550c) {
            this.f38558k.add(c3156h0);
            interfaceC1795lA0 = a0();
        }
        if (interfaceC1795lA0 != null) {
            q.a aVar = q.f1441b;
            interfaceC1795lA0.resumeWith(q.b(G.f1419a));
        }
    }

    public final boolean j0() {
        boolean z8;
        synchronized (this.f38550c) {
            z8 = this.f38565r;
        }
        if (!z8) {
            return true;
        }
        Iterator it = this.f38569v.Y().iterator();
        while (it.hasNext()) {
            if (((InterfaceC1815v0) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p215z0.AbstractC3173q
    public void k(B b8) {
        InterfaceC1795l interfaceC1795lA0;
        synchronized (this.f38550c) {
            if (this.f38556i.contains(b8)) {
                interfaceC1795lA0 = null;
            } else {
                this.f38556i.add(b8);
                interfaceC1795lA0 = a0();
            }
        }
        if (interfaceC1795lA0 != null) {
            q.a aVar = q.f1441b;
            interfaceC1795lA0.resumeWith(q.b(G.f1419a));
        }
    }

    public final Object k0(G6.d dVar) {
        Object objY = AbstractC2262h.y(d0(), new g(null), dVar);
        return objY == H6.c.f() ? objY : G.f1419a;
    }

    @Override // p215z0.AbstractC3173q
    public void l(C3156h0 c3156h0, C3154g0 c3154g0) {
        synchronized (this.f38550c) {
            this.f38560m.put(c3156h0, c3154g0);
            G g8 = G.f1419a;
        }
    }

    public final void l0() {
        synchronized (this.f38550c) {
            this.f38567t = true;
            G g8 = G.f1419a;
        }
    }

    @Override // p215z0.AbstractC3173q
    public C3154g0 m(C3156h0 c3156h0) {
        C3154g0 c3154g0;
        synchronized (this.f38550c) {
            c3154g0 = (C3154g0) this.f38560m.remove(c3156h0);
        }
        return c3154g0;
    }

    public final void m0(B b8) {
        synchronized (this.f38550c) {
            List list = this.f38558k;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (t.c(((C3156h0) list.get(i8)).b(), b8)) {
                    G g8 = G.f1419a;
                    ArrayList arrayList = new ArrayList();
                    n0(arrayList, this, b8);
                    while (!arrayList.isEmpty()) {
                        o0(arrayList, null);
                        n0(arrayList, this, b8);
                    }
                    return;
                }
            }
        }
    }

    public final List o0(List list, B0.b bVar) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            B b8 = ((C3156h0) obj).b();
            Object arrayList2 = map.get(b8);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(b8, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            B b9 = (B) entry.getKey();
            List list2 = (List) entry.getValue();
            AbstractC3169o.U(!b9.m());
            C1020c c1020cL = AbstractC1028k.f3974e.l(s0(b9), z0(b9, bVar));
            try {
                AbstractC1028k abstractC1028kL = c1020cL.l();
                try {
                    synchronized (this.f38550c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            C3156h0 c3156h0 = (C3156h0) list2.get(i9);
                            arrayList.add(v.a(c3156h0, I0.b(this.f38559l, c3156h0.c())));
                        }
                    }
                    b9.n(arrayList);
                    G g8 = G.f1419a;
                    c1020cL.s(abstractC1028kL);
                    W(c1020cL);
                } catch (Throwable th) {
                    c1020cL.s(abstractC1028kL);
                    throw th;
                }
            } catch (Throwable th2) {
                W(c1020cL);
                throw th2;
            }
        }
        return z.R0(map.keySet());
    }

    @Override // p215z0.AbstractC3173q
    public void p(B b8) {
        synchronized (this.f38550c) {
            try {
                Set linkedHashSet = this.f38562o;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f38562o = linkedHashSet;
                }
                linkedHashSet.add(b8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final B p0(B b8, B0.b bVar) {
        Set set;
        if (b8.m() || b8.g() || ((set = this.f38562o) != null && set.contains(b8))) {
            return null;
        }
        C1020c c1020cL = AbstractC1028k.f3974e.l(s0(b8), z0(b8, bVar));
        try {
            AbstractC1028k abstractC1028kL = c1020cL.l();
            if (bVar != null) {
                try {
                    if (bVar.u()) {
                        b8.h(new h(bVar, b8));
                    }
                } catch (Throwable th) {
                    c1020cL.s(abstractC1028kL);
                    throw th;
                }
            }
            boolean zU = b8.u();
            c1020cL.s(abstractC1028kL);
            W(c1020cL);
            if (zU) {
                return b8;
            }
            return null;
        } catch (Throwable th2) {
            W(c1020cL);
            throw th2;
        }
    }

    public final void q0(Exception exc, B b8, boolean z8) throws Exception {
        if (!((Boolean) f38545B.get()).booleanValue() || (exc instanceof C3161k)) {
            synchronized (this.f38550c) {
                b bVar = this.f38566s;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f38566s = new b(false, exc);
                G g8 = G.f1419a;
            }
            throw exc;
        }
        synchronized (this.f38550c) {
            try {
                AbstractC3143b.f("Error was captured in composition while live edit was enabled.", exc);
                this.f38557j.clear();
                this.f38556i.clear();
                this.f38555h = new B0.b();
                this.f38558k.clear();
                this.f38559l.clear();
                this.f38560m.clear();
                this.f38566s = new b(z8, exc);
                if (b8 != null) {
                    List arrayList = this.f38561n;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f38561n = arrayList;
                    }
                    if (!arrayList.contains(b8)) {
                        arrayList.add(b8);
                    }
                    w0(b8);
                }
                a0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p215z0.AbstractC3173q
    public void s(B b8) {
        synchronized (this.f38550c) {
            w0(b8);
            this.f38556i.remove(b8);
            this.f38557j.remove(b8);
            G g8 = G.f1419a;
        }
    }

    public final Q6.k s0(B b8) {
        return new i(b8);
    }

    public final Object t0(p pVar, G6.d dVar) {
        Object objG = AbstractC1785g.g(this.f38549b, new j(pVar, AbstractC3150e0.a(dVar.getContext()), null), dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    public final boolean u0() {
        List listI0;
        boolean zG0;
        synchronized (this.f38550c) {
            if (this.f38555h.isEmpty()) {
                return g0();
            }
            B0.b bVar = this.f38555h;
            this.f38555h = new B0.b();
            synchronized (this.f38550c) {
                listI0 = i0();
            }
            try {
                int size = listI0.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((B) listI0.get(i8)).i(bVar);
                    if (((d) this.f38568u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.f38555h = new B0.b();
                synchronized (this.f38550c) {
                    if (a0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zG0 = g0();
                }
                return zG0;
            } catch (Throwable th) {
                synchronized (this.f38550c) {
                    this.f38555h.c(bVar);
                    G g8 = G.f1419a;
                    throw th;
                }
            }
        }
    }

    public final void v0(InterfaceC1815v0 interfaceC1815v0) {
        synchronized (this.f38550c) {
            Throwable th = this.f38552e;
            if (th != null) {
                throw th;
            }
            if (((d) this.f38568u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f38551d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f38551d = interfaceC1815v0;
            a0();
        }
    }

    public final void w0(B b8) {
        this.f38553f.remove(b8);
        this.f38554g = null;
    }

    public final void x0() {
        InterfaceC1795l interfaceC1795lA0;
        synchronized (this.f38550c) {
            if (this.f38567t) {
                this.f38567t = false;
                interfaceC1795lA0 = a0();
            } else {
                interfaceC1795lA0 = null;
            }
        }
        if (interfaceC1795lA0 != null) {
            q.a aVar = q.f1441b;
            interfaceC1795lA0.resumeWith(q.b(G.f1419a));
        }
    }

    public final Object y0(G6.d dVar) {
        Object objT0 = t0(new k(null), dVar);
        return objT0 == H6.c.f() ? objT0 : G.f1419a;
    }

    public final Q6.k z0(B b8, B0.b bVar) {
        return new l(b8, bVar);
    }

    @Override // p215z0.AbstractC3173q
    public void n(Set set) {
    }
}
