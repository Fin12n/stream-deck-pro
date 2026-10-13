package p055g0;

import C6.G;
import C6.r;
import D6.M;
import I6.l;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import Q6.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.L;
import p037e0.InterfaceC2213i;
import p037e0.d0;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p073i0.m;
import p215z0.g1;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2324e {

    /* JADX INFO: renamed from: g0.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ float f23052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C2325f f23053d;

        /* JADX INFO: renamed from: g0.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0533a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f23054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2325f f23055b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f23056c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0533a(C2325f c2325f, float f8, G6.d dVar) {
                super(2, dVar);
                this.f23055b = c2325f;
                this.f23056c = f8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0533a(this.f23055b, this.f23056c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0533a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f23054a;
                if (i8 == 0) {
                    r.b(obj);
                    C2325f c2325f = this.f23055b;
                    float f8 = this.f23056c;
                    this.f23054a = 1;
                    if (c2325f.C(f8, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2325f c2325f, G6.d dVar) {
            super(3, dVar);
            this.f23053d = c2325f;
        }

        public final Object g(J j8, float f8, G6.d dVar) {
            a aVar = new a(this.f23053d, dVar);
            aVar.f23051b = j8;
            aVar.f23052c = f8;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((J) obj, ((Number) obj2).floatValue(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f23050a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            AbstractC1789i.d((J) this.f23051b, null, null, new C0533a(this.f23053d, this.f23052c, null), 3, null);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: g0.e$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f23059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f23060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2325f f23061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f23062f;

        /* JADX INFO: renamed from: g0.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2323d f23063a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.G f23064b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2323d interfaceC2323d, kotlin.jvm.internal.G g8) {
                super(2);
                this.f23063a = interfaceC2323d;
                this.f23064b = g8;
            }

            public final void b(float f8, float f9) {
                this.f23063a.a(f8, f9);
                this.f23064b.f28776a = f8;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2325f c2325f, float f8, G6.d dVar) {
            super(4, dVar);
            this.f23061e = c2325f;
            this.f23062f = f8;
        }

        @Override // Q6.q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object i(InterfaceC2323d interfaceC2323d, r rVar, Object obj, G6.d dVar) {
            b bVar = new b(this.f23061e, this.f23062f, dVar);
            bVar.f23058b = interfaceC2323d;
            bVar.f23059c = rVar;
            bVar.f23060d = obj;
            return bVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f23057a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2323d interfaceC2323d = (InterfaceC2323d) this.f23058b;
                float fD = ((r) this.f23059c).d(this.f23060d);
                if (!Float.isNaN(fD)) {
                    kotlin.jvm.internal.G g8 = new kotlin.jvm.internal.G();
                    float fS = Float.isNaN(this.f23061e.s()) ? 0.0f : this.f23061e.s();
                    g8.f28776a = fS;
                    float f8 = this.f23062f;
                    InterfaceC2213i interfaceC2213iN = this.f23061e.n();
                    a aVar = new a(interfaceC2323d, g8);
                    this.f23058b = null;
                    this.f23059c = null;
                    this.f23057a = 1;
                    if (d0.b(fS, fD, f8, interfaceC2213iN, aVar, this) == objF) {
                        return objF;
                    }
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

    /* JADX INFO: renamed from: g0.e$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f23065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23066b;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23065a = obj;
            this.f23066b |= Integer.MIN_VALUE;
            return AbstractC2324e.h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: g0.e$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f23069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f23070d;

        /* JADX INFO: renamed from: g0.e$d$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.J f23071a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ J f23072b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f23073c;

            /* JADX INFO: renamed from: g0.e$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0534a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f23074a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f23075b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Object f23076c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ J f23077d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0534a(o oVar, Object obj, J j8, G6.d dVar) {
                    super(2, dVar);
                    this.f23075b = oVar;
                    this.f23076c = obj;
                    this.f23077d = j8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0534a(this.f23075b, this.f23076c, this.f23077d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0534a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f23074a;
                    if (i8 == 0) {
                        r.b(obj);
                        o oVar = this.f23075b;
                        Object obj2 = this.f23076c;
                        this.f23074a = 1;
                        if (oVar.invoke(obj2, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    K.d(this.f23077d, new C2322c());
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: g0.e$d$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f23078a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f23079b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f23080c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f23081d;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public int f23083f;

                public b(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f23081d = obj;
                    this.f23083f |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlin.jvm.internal.J j8, J j9, o oVar) {
                this.f23071a = j8;
                this.f23072b = j9;
                this.f23073c = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                b bVar;
                a aVar;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i8 = bVar.f23083f;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        bVar.f23083f = i8 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(dVar);
                    }
                } else {
                    bVar = new b(dVar);
                }
                Object obj2 = bVar.f23081d;
                Object objF = H6.c.f();
                int i9 = bVar.f23083f;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) this.f23071a.f28779a;
                    if (interfaceC1815v0 != null) {
                        interfaceC1815v0.z(new C2322c());
                        bVar.f23078a = this;
                        bVar.f23079b = obj;
                        bVar.f23080c = interfaceC1815v0;
                        bVar.f23083f = 1;
                        if (interfaceC1815v0.i0(bVar) == objF) {
                            return objF;
                        }
                    }
                    aVar = this;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f23079b;
                    aVar = (a) bVar.f23078a;
                    r.b(obj2);
                }
                kotlin.jvm.internal.J j8 = aVar.f23071a;
                J j9 = aVar.f23072b;
                j8.f28779a = AbstractC1789i.d(j9, null, L.UNDISPATCHED, new C0534a(aVar.f23073c, obj, j9, null), 1, null);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, o oVar, G6.d dVar) {
            super(2, dVar);
            this.f23069c = function0;
            this.f23070d = oVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(this.f23069c, this.f23070d, dVar);
            dVar2.f23068b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f23067a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f23068b;
                kotlin.jvm.internal.J j9 = new kotlin.jvm.internal.J();
                InterfaceC2260f interfaceC2260fQ = g1.q(this.f23069c);
                a aVar = new a(j9, j8, this.f23070d);
                this.f23067a = 1;
                if (interfaceC2260fQ.collect(aVar, this) == objF) {
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

    public static final r a(k kVar) {
        s sVar = new s();
        kVar.invoke(sVar);
        return new y(sVar.b());
    }

    public static final i d(i iVar, C2325f c2325f, B b8, boolean z8, boolean z9, m mVar, boolean z10) {
        return t.k(iVar, c2325f.r(), b8, z8, mVar, z10, null, new a(c2325f, null), z9, 32, null);
    }

    public static /* synthetic */ i e(i iVar, C2325f c2325f, B b8, boolean z8, boolean z9, m mVar, boolean z10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        boolean z11 = z8;
        if ((i8 & 8) != 0) {
            z9 = false;
        }
        boolean z12 = z9;
        if ((i8 & 16) != 0) {
            mVar = null;
        }
        m mVar2 = mVar;
        if ((i8 & 32) != 0) {
            z10 = c2325f.u();
        }
        return d(iVar, c2325f, b8, z11, z12, mVar2, z10);
    }

    public static final Object f(C2325f c2325f, Object obj, float f8, G6.d dVar) throws Throwable {
        Object objJ = C2325f.j(c2325f, obj, null, new b(c2325f, f8, null), dVar, 2, null);
        return objJ == H6.c.f() ? objJ : G.f1419a;
    }

    public static final y g() {
        return new y(M.g());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(Function0 function0, o oVar, G6.d dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f23066b;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f23066b = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f23065a;
        Object objF = H6.c.f();
        int i9 = cVar.f23066b;
        try {
            if (i9 == 0) {
                r.b(obj);
                d dVar2 = new d(function0, oVar, null);
                cVar.f23066b = 1;
                if (K.f(dVar2, cVar) == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
        } catch (C2322c unused) {
        }
        return G.f1419a;
    }
}
