package M3;

import C6.G;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f5421a;

        /* JADX INFO: renamed from: M3.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0194a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f5422a;

            /* JADX INFO: renamed from: M3.n$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0195a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f5423a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5424b;

                public C0195a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5423a = obj;
                    this.f5424b |= Integer.MIN_VALUE;
                    return C0194a.this.emit(null, this);
                }
            }

            public C0194a(InterfaceC2261g interfaceC2261g) {
                this.f5422a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0195a c0195a;
                if (dVar instanceof C0195a) {
                    c0195a = (C0195a) dVar;
                    int i8 = c0195a.f5424b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0195a.f5424b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0195a = new C0195a(dVar);
                    }
                } else {
                    c0195a = new C0195a(dVar);
                }
                Object obj2 = c0195a.f5423a;
                Object objF = H6.c.f();
                int i9 = c0195a.f5424b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f5422a;
                    M3.g gVarD = ((m.C1038c) obj).d();
                    c0195a.f5424b = 1;
                    if (interfaceC2261g.emit(gVarD, c0195a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public a(InterfaceC2260f interfaceC2260f) {
            this.f5421a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f5421a.collect(new C0194a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5427b;

        public b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(dVar);
            bVar.f5427b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M3.g gVar, G6.d dVar) {
            return ((b) create(gVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            H6.c.f();
            if (this.f5426a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            M3.g gVar = (M3.g) this.f5427b;
            if (gVar instanceof M3.g.a) {
                z8 = false;
            } else {
                if (gVar instanceof M3.g.f) {
                    throw new IllegalStateException("Connection state is expected to be `Closed` but was `Unauthenticated`");
                }
                z8 = true;
            }
            return I6.b.a(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5429b;

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(dVar);
            cVar.f5429b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M3.g gVar, G6.d dVar) {
            return ((c) create(gVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            H6.c.f();
            if (this.f5428a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            M3.g gVar = (M3.g) this.f5429b;
            if (gVar instanceof M3.g.e) {
                z8 = false;
            } else {
                if (gVar instanceof M3.g.f ? true : gVar instanceof M3.g.C0186g) {
                    throw new IllegalStateException("Connection state is expected to be `Ready` but was `" + gVar + "`");
                }
                z8 = true;
            }
            return I6.b.a(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5431b;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f5431b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M3.g gVar, G6.d dVar) {
            return ((d) create(gVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            H6.c.f();
            if (this.f5430a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            M3.g gVar = (M3.g) this.f5431b;
            if (gVar instanceof M3.g.f) {
                z8 = false;
            } else {
                if (gVar instanceof M3.g.e ? true : gVar instanceof M3.g.C0186g) {
                    throw new IllegalStateException("Connection state is expected to be `Unauthenticated` but was `" + gVar + "`");
                }
                z8 = true;
            }
            return I6.b.a(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5433b;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = new e(dVar);
            eVar.f5433b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M3.g gVar, G6.d dVar) {
            return ((e) create(gVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f5432a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            M3.g gVar = (M3.g) this.f5433b;
            boolean z8 = true;
            if (gVar instanceof M3.g.f ? true : gVar instanceof M3.g.e) {
                z8 = false;
            } else if (gVar instanceof M3.g.C0186g) {
                throw new IllegalStateException("Connection state is expected to be `Unauthenticated` but was `" + gVar + "`");
            }
            return I6.b.a(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5435b;

        public f(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(dVar);
            fVar.f5435b = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M3.g gVar, G6.d dVar) {
            return ((f) create(gVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            H6.c.f();
            if (this.f5434a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            M3.g gVar = (M3.g) this.f5435b;
            if (gVar instanceof M3.g.C0186g) {
                z8 = false;
            } else {
                if (gVar instanceof M3.g.f) {
                    throw new IllegalStateException("Connection state is expected to be `VirtualDeviceOpen` but was `Unauthenticated`");
                }
                z8 = true;
            }
            return I6.b.a(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f5436a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f5437a;

            /* JADX INFO: renamed from: M3.n$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0196a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f5438a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5439b;

                public C0196a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5438a = obj;
                    this.f5439b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f5437a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0196a c0196a;
                if (dVar instanceof C0196a) {
                    c0196a = (C0196a) dVar;
                    int i8 = c0196a.f5439b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0196a.f5439b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0196a = new C0196a(dVar);
                    }
                } else {
                    c0196a = new C0196a(dVar);
                }
                Object obj2 = c0196a.f5438a;
                Object objF = H6.c.f();
                int i9 = c0196a.f5439b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f5437a;
                    M3.g gVarD = ((m.C1038c) obj).d();
                    c0196a.f5439b = 1;
                    if (interfaceC2261g.emit(gVarD, c0196a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public g(InterfaceC2260f interfaceC2260f) {
            this.f5436a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f5436a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5442b;

        public h(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            h hVar = new h(dVar);
            hVar.f5442b = obj;
            return hVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M3.g gVar, G6.d dVar) {
            return ((h) create(gVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws M3.d.a {
            H6.c.f();
            if (this.f5441a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            M3.g gVar = (M3.g) this.f5442b;
            if (gVar instanceof M3.g.a) {
                throw new M3.d.a(((M3.g.a) gVar).a());
            }
            return G.f1419a;
        }
    }

    public static final Object a(m mVar, G6.d dVar) {
        Object objI = AbstractC2262h.i(AbstractC2262h.U(AbstractC2262h.p(new a(mVar.K())), new b(null)), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public static final Object b(m mVar, G6.d dVar) throws M3.d.a {
        mVar.T();
        Object objI = AbstractC2262h.i(AbstractC2262h.U(f(mVar), new c(null)), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public static final Object c(m mVar, G6.d dVar) throws M3.d.a {
        mVar.T();
        Object objI = AbstractC2262h.i(AbstractC2262h.U(f(mVar), new d(null)), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public static final Object d(m mVar, G6.d dVar) throws M3.d.a {
        mVar.T();
        Object objI = AbstractC2262h.i(AbstractC2262h.U(f(mVar), new e(null)), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public static final Object e(m mVar, G6.d dVar) throws M3.d.a {
        mVar.T();
        Object objI = AbstractC2262h.i(AbstractC2262h.U(f(mVar), new f(null)), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public static final InterfaceC2260f f(m mVar) {
        kotlin.jvm.internal.t.g(mVar, "<this>");
        return AbstractC2262h.M(AbstractC2262h.p(new g(mVar.K())), new h(null));
    }
}
