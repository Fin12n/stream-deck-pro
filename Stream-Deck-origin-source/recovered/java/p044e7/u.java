package p044e7;

import C6.G;
import C6.r;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21174a;

        /* JADX INFO: renamed from: e7.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0494a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f21175a;

            /* JADX INFO: renamed from: e7.u$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0495a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f21176a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f21177b;

                public C0495a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f21176a = obj;
                    this.f21177b |= Integer.MIN_VALUE;
                    return C0494a.this.emit(null, this);
                }
            }

            public C0494a(InterfaceC2261g interfaceC2261g) {
                this.f21175a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0495a c0495a;
                if (dVar instanceof C0495a) {
                    c0495a = (C0495a) dVar;
                    int i8 = c0495a.f21177b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0495a.f21177b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0495a = new C0495a(dVar);
                    }
                } else {
                    c0495a = new C0495a(dVar);
                }
                Object obj2 = c0495a.f21176a;
                Object objF = H6.c.f();
                int i9 = c0495a.f21177b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f21175a;
                    if (obj != null) {
                        c0495a.f21177b = 1;
                        if (interfaceC2261g.emit(obj, c0495a) == objF) {
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

        public a(InterfaceC2260f interfaceC2260f) {
            this.f21174a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f21174a.collect(new C0494a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f21180b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f21181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f21182b;

            /* JADX INFO: renamed from: e7.u$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0496a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f21183a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f21184b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Object f21186d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f21187e;

                public C0496a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f21183a = obj;
                    this.f21184b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g, o oVar) {
                this.f21181a = interfaceC2261g;
                this.f21182b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            @Override // p044e7.InterfaceC2261g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, G6.d dVar) {
                C0496a c0496a;
                Object obj2;
                InterfaceC2261g interfaceC2261g;
                if (dVar instanceof C0496a) {
                    c0496a = (C0496a) dVar;
                    int i8 = c0496a.f21184b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0496a.f21184b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0496a = new C0496a(dVar);
                    }
                } else {
                    c0496a = new C0496a(dVar);
                }
                Object obj3 = c0496a.f21183a;
                Object objF = H6.c.f();
                int i9 = c0496a.f21184b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        interfaceC2261g = (InterfaceC2261g) c0496a.f21187e;
                        obj2 = c0496a.f21186d;
                        r.b(obj3);
                    } else {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj3);
                    }
                    return G.f1419a;
                }
                r.b(obj3);
                InterfaceC2261g interfaceC2261g2 = this.f21181a;
                o oVar = this.f21182b;
                c0496a.f21186d = obj;
                c0496a.f21187e = interfaceC2261g2;
                c0496a.f21184b = 1;
                kotlin.jvm.internal.r.a(6);
                Object objInvoke = oVar.invoke(obj, c0496a);
                kotlin.jvm.internal.r.a(7);
                if (objInvoke != objF) {
                    obj2 = obj;
                    interfaceC2261g = interfaceC2261g2;
                }
                return objF;
                c0496a.f21186d = null;
                c0496a.f21187e = null;
                c0496a.f21184b = 2;
            }
        }

        public b(InterfaceC2260f interfaceC2260f, o oVar) {
            this.f21179a = interfaceC2260f;
            this.f21180b = oVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f21179a.collect(new a(interfaceC2261g, this.f21180b), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f21188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f21190c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21192b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f21194d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21195e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f21196f;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21191a = obj;
                this.f21192b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Object obj, InterfaceC2260f interfaceC2260f, p pVar) {
            this.f21188a = obj;
            this.f21189b = interfaceC2260f;
            this.f21190c = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        
            if (r8.collect(r5, r0) == r1) goto L22;
         */
        @Override // p044e7.InterfaceC2260f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            a aVar;
            c cVar;
            InterfaceC2261g interfaceC2261g2;
            J j8;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21192b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21192b = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f21191a;
            Object objF = H6.c.f();
            int i9 = aVar.f21192b;
            if (i9 != 0) {
                if (i9 == 1) {
                    j8 = (J) aVar.f21196f;
                    interfaceC2261g2 = (InterfaceC2261g) aVar.f21195e;
                    cVar = (c) aVar.f21194d;
                    r.b(obj);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            J j9 = new J();
            Object obj2 = this.f21188a;
            j9.f28779a = obj2;
            aVar.f21194d = this;
            aVar.f21195e = interfaceC2261g;
            aVar.f21196f = j9;
            aVar.f21192b = 1;
            if (interfaceC2261g.emit(obj2, aVar) != objF) {
                cVar = this;
                interfaceC2261g2 = interfaceC2261g;
                j8 = j9;
            }
            return objF;
            InterfaceC2260f interfaceC2260f = cVar.f21189b;
            d dVar2 = new d(j8, cVar.f21190c, interfaceC2261g2);
            aVar.f21194d = null;
            aVar.f21195e = null;
            aVar.f21196f = null;
            aVar.f21192b = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f21197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f21198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f21199c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21200a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f21201b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21202c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f21204e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21202c = obj;
                this.f21204e |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(J j8, p pVar, InterfaceC2261g interfaceC2261g) {
            this.f21197a = j8;
            this.f21198b = pVar;
            this.f21199c = interfaceC2261g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        @Override // p044e7.InterfaceC2261g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, G6.d dVar) {
            a aVar;
            J j8;
            d dVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21204e;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21204e = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj2 = aVar.f21202c;
            Object objF = H6.c.f();
            int i9 = aVar.f21204e;
            if (i9 != 0) {
                if (i9 == 1) {
                    j8 = (J) aVar.f21201b;
                    dVar2 = (d) aVar.f21200a;
                    r.b(obj2);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
            r.b(obj2);
            J j9 = this.f21197a;
            p pVar = this.f21198b;
            Object obj3 = j9.f28779a;
            aVar.f21200a = this;
            aVar.f21201b = j9;
            aVar.f21204e = 1;
            Object objInvoke = pVar.invoke(obj3, obj, aVar);
            if (objInvoke != objF) {
                obj2 = objInvoke;
                j8 = j9;
                dVar2 = this;
            }
            return objF;
            j8.f28779a = obj2;
            InterfaceC2261g interfaceC2261g = dVar2.f21199c;
            Object obj4 = dVar2.f21197a.f28779a;
            aVar.f21200a = null;
            aVar.f21201b = null;
            aVar.f21204e = 2;
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f) {
        return new a(interfaceC2260f);
    }

    public static final InterfaceC2260f b(InterfaceC2260f interfaceC2260f, o oVar) {
        return new b(interfaceC2260f, oVar);
    }

    public static final InterfaceC2260f c(InterfaceC2260f interfaceC2260f, Object obj, p pVar) {
        return new c(obj, interfaceC2260f, pVar);
    }

    public static final InterfaceC2260f d(InterfaceC2260f interfaceC2260f, Object obj, p pVar) {
        return AbstractC2262h.Q(interfaceC2260f, obj, pVar);
    }
}
