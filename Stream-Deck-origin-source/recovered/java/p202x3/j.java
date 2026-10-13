package p202x3;

import C6.G;
import C6.r;
import I6.l;
import M3.g;
import M3.m;
import Q6.o;
import Q6.p;
import V3.h;
import kotlin.jvm.internal.t;
import p017b7.U;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f37366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f37367c;

        public a(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object obj, G6.d dVar) {
            a aVar = new a(dVar);
            aVar.f37366b = interfaceC2261g;
            aVar.f37367c = obj;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f37365a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f37366b;
                InterfaceC2260f interfaceC2260fD = AbstractC2262h.D(new c((g) this.f37367c, null));
                this.f37365a = 1;
                if (AbstractC2262h.u(interfaceC2261g, interfaceC2260fD, this) == objF) {
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
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f37368a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f37369a;

            /* JADX INFO: renamed from: x3.j$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0838a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f37370a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f37371b;

                public C0838a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f37370a = obj;
                    this.f37371b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f37369a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0838a c0838a;
                if (dVar instanceof C0838a) {
                    c0838a = (C0838a) dVar;
                    int i8 = c0838a.f37371b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0838a.f37371b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0838a = new C0838a(dVar);
                    }
                } else {
                    c0838a = new C0838a(dVar);
                }
                Object obj2 = c0838a.f37370a;
                Object objF = H6.c.f();
                int i9 = c0838a.f37371b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f37369a;
                    m.C1038c c1038c = (m.C1038c) obj;
                    g gVarD = c1038c != null ? c1038c.d() : null;
                    if (gVarD != null) {
                        c0838a.f37371b = 1;
                        if (interfaceC2261g.emit(gVarD, c0838a) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public b(InterfaceC2260f interfaceC2260f) {
            this.f37368a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f37368a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f37374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f37375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, G6.d dVar) {
            super(2, dVar);
            this.f37375c = gVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f37375c, dVar);
            cVar.f37374b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((c) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L22;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2261g interfaceC2261g;
            Object objF = H6.c.f();
            int i8 = this.f37373a;
            if (i8 != 0) {
                if (i8 == 1) {
                    interfaceC2261g = (InterfaceC2261g) this.f37374b;
                    r.b(obj);
                    Boolean boolA = I6.b.a(true);
                    this.f37374b = null;
                    this.f37373a = 2;
                } else {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            interfaceC2261g = (InterfaceC2261g) this.f37374b;
            if (t.c(this.f37375c, g.b.f5152a)) {
                p008a7.a.C0338a c0338a = p008a7.a.f13446b;
                long jS = p008a7.c.s(2, p008a7.d.SECONDS);
                this.f37374b = interfaceC2261g;
                this.f37373a = 1;
                if (U.b(jS, this) != objF) {
                    Boolean boolA2 = I6.b.a(true);
                    this.f37374b = null;
                    this.f37373a = 2;
                }
            } else {
                Boolean boolA3 = I6.b.a(false);
                this.f37373a = 3;
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f37377b;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f37377b = obj;
            return dVar2;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((d) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f37376a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f37377b;
                Boolean boolA = I6.b.a(false);
                this.f37376a = 1;
                if (interfaceC2261g.emit(boolA, this) == objF) {
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

    public static final h.b d() {
        return new h.b(V3.c.EnumC0291c.KEY_PRESS_COUNT.b(), 1);
    }

    public static final h.b e() {
        return new h.b(V3.c.EnumC0291c.PAGE_TURN_COUNT.b(), 1);
    }

    public static final InterfaceC2260f f(InterfaceC2260f interfaceC2260f) {
        return AbstractC2262h.p(AbstractC2262h.N(AbstractC2262h.W(AbstractC2262h.p(new b(interfaceC2260f)), new a(null)), new d(null)));
    }
}
