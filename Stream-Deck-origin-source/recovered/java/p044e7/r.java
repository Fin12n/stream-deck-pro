package p044e7;

import C6.G;
import D6.C0934n;
import I6.l;
import Q6.o;
import Q6.p;
import p053f7.i;
import p053f7.j;
import p062g7.H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21110a = H.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f21112b;

        /* JADX INFO: renamed from: e7.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0490a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f21113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f21114b;

            /* JADX INFO: renamed from: e7.r$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0491a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f21115a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f21116b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f21117c;

                public C0491a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f21115a = obj;
                    this.f21116b |= Integer.MIN_VALUE;
                    return C0490a.this.emit(null, this);
                }
            }

            public C0490a(InterfaceC2261g interfaceC2261g, o oVar) {
                this.f21113a = interfaceC2261g;
                this.f21114b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L22;
             */
            @Override // p044e7.InterfaceC2261g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, G6.d dVar) {
                C0491a c0491a;
                InterfaceC2261g interfaceC2261g;
                if (dVar instanceof C0491a) {
                    c0491a = (C0491a) dVar;
                    int i8 = c0491a.f21116b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0491a.f21116b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0491a = new C0491a(dVar);
                    }
                } else {
                    c0491a = new C0491a(dVar);
                }
                Object obj2 = c0491a.f21115a;
                Object objF = H6.c.f();
                int i9 = c0491a.f21116b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        interfaceC2261g = (InterfaceC2261g) c0491a.f21117c;
                        C6.r.b(obj2);
                    } else {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
                C6.r.b(obj2);
                InterfaceC2261g interfaceC2261g2 = this.f21113a;
                o oVar = this.f21114b;
                c0491a.f21117c = interfaceC2261g2;
                c0491a.f21116b = 1;
                Object objInvoke = oVar.invoke(obj, c0491a);
                if (objInvoke != objF) {
                    obj2 = objInvoke;
                    interfaceC2261g = interfaceC2261g2;
                }
                return objF;
                c0491a.f21117c = null;
                c0491a.f21116b = 2;
            }
        }

        public a(InterfaceC2260f interfaceC2260f, o oVar) {
            this.f21111a = interfaceC2260f;
            this.f21112b = oVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f21111a.collect(new C0490a(interfaceC2261g, this.f21112b), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21119a;

        public b(InterfaceC2260f interfaceC2260f) {
            this.f21119a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f21119a.collect(new c(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f21120a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21121a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21123c;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21121a = obj;
                this.f21123c |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        public c(InterfaceC2261g interfaceC2261g) {
            this.f21120a = interfaceC2261g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC2260f interfaceC2260f, G6.d dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21123c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21123c = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f21121a;
            Object objF = H6.c.f();
            int i9 = aVar.f21123c;
            if (i9 == 0) {
                C6.r.b(obj);
                InterfaceC2261g interfaceC2261g = this.f21120a;
                aVar.f21123c = 1;
                if (AbstractC2262h.u(interfaceC2261g, interfaceC2260f, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f21127d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o oVar, G6.d dVar) {
            super(3, dVar);
            this.f21127d = oVar;
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, Object obj, G6.d dVar) {
            d dVar2 = new d(this.f21127d, dVar);
            dVar2.f21125b = interfaceC2261g;
            dVar2.f21126c = obj;
            return dVar2.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2261g interfaceC2261g;
            Object objF = H6.c.f();
            int i8 = this.f21124a;
            if (i8 != 0) {
                if (i8 == 1) {
                    interfaceC2261g = (InterfaceC2261g) this.f21125b;
                    C6.r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
            C6.r.b(obj);
            interfaceC2261g = (InterfaceC2261g) this.f21125b;
            Object obj2 = this.f21126c;
            o oVar = this.f21127d;
            this.f21125b = interfaceC2261g;
            this.f21124a = 1;
            obj = oVar.invoke(obj2, this);
            if (obj != objF) {
            }
            return objF;
            this.f21125b = null;
            this.f21124a = 2;
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f, o oVar) {
        return AbstractC2262h.C(new a(interfaceC2260f, oVar));
    }

    public static final InterfaceC2260f b(InterfaceC2260f interfaceC2260f) {
        return new b(interfaceC2260f);
    }

    public static final InterfaceC2260f c(InterfaceC2260f interfaceC2260f, o oVar) {
        return AbstractC2262h.W(interfaceC2260f, new d(oVar, null));
    }

    public static final InterfaceC2260f d(Iterable iterable) {
        return new j(iterable, null, 0, null, 14, null);
    }

    public static final InterfaceC2260f e(InterfaceC2260f... interfaceC2260fArr) {
        return AbstractC2262h.J(C0934n.E(interfaceC2260fArr));
    }

    public static final InterfaceC2260f f(InterfaceC2260f interfaceC2260f, p pVar) {
        return new i(pVar, interfaceC2260f, null, 0, null, 28, null);
    }
}
