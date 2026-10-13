package G3;

import C6.G;
import C6.q;
import C6.r;
import C6.v;
import M3.p;
import Q6.o;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3.p f2731b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2733b;

        /* JADX INFO: renamed from: G3.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0117a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f2736b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ boolean f2737c;

            public C0117a(G6.d dVar) {
                super(3, dVar);
            }

            public final Object g(p.b bVar, boolean z8, G6.d dVar) {
                C0117a c0117a = new C0117a(dVar);
                c0117a.f2736b = bVar;
                c0117a.f2737c = z8;
                return c0117a.invokeSuspend(G.f1419a);
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return g((p.b) obj, ((Boolean) obj2).booleanValue(), (G6.d) obj3);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f2735a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return v.a((p.b) this.f2736b, I6.b.a(this.f2737c));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f2738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ J f2739b;

            /* JADX INFO: renamed from: G3.f$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0118a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f2740a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f2742c;

                public C0118a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f2740a = obj;
                    this.f2742c |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(f fVar, J j8) {
                this.f2738a = fVar;
                this.f2739b = j8;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C6.o oVar, G6.d dVar) {
                C0118a c0118a;
                if (dVar instanceof C0118a) {
                    c0118a = (C0118a) dVar;
                    int i8 = c0118a.f2742c;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0118a.f2742c = i8 - Integer.MIN_VALUE;
                    } else {
                        c0118a = new C0118a(dVar);
                    }
                } else {
                    c0118a = new C0118a(dVar);
                }
                Object obj = c0118a.f2740a;
                Object objF = H6.c.f();
                int i9 = c0118a.f2742c;
                try {
                    if (i9 == 0) {
                        r.b(obj);
                        p.b bVar = (p.b) oVar.a();
                        boolean zBooleanValue = ((Boolean) oVar.b()).booleanValue();
                        M3.m mVarD = this.f2738a.f2730a.d();
                        if (mVarD == null) {
                            return G.f1419a;
                        }
                        if (bVar instanceof p.b.e) {
                            q.a aVar = q.f1441b;
                            c0118a.f2742c = 1;
                            if (mVarD.a0(zBooleanValue, c0118a) == objF) {
                                return objF;
                            }
                        }
                        return G.f1419a;
                    }
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    q.b(G.f1419a);
                } catch (Throwable th) {
                    q.a aVar2 = q.f1441b;
                    q.b(r.a(th));
                }
                return G.f1419a;
            }
        }

        public a(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = f.this.new a(dVar);
            aVar.f2733b = obj;
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
            int i8 = this.f2732a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f2733b;
                InterfaceC2260f interfaceC2260fP = AbstractC2262h.p(AbstractC2262h.k(f.this.f2730a.h(), f.this.f2731b.k(), new C0117a(null)));
                b bVar = new b(f.this, j8);
                this.f2732a = 1;
                if (interfaceC2260fP.collect(bVar, this) == objF) {
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

    public f(p connectionHolder, A3.p purchaseViewModel, J coroutineScope) {
        t.g(connectionHolder, "connectionHolder");
        t.g(purchaseViewModel, "purchaseViewModel");
        t.g(coroutineScope, "coroutineScope");
        this.f2730a = connectionHolder;
        this.f2731b = purchaseViewModel;
        AbstractC1789i.d(coroutineScope, null, null, new a(null), 3, null);
    }
}
