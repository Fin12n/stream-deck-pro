package androidx.lifecycle;

import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.C1797m;
import p017b7.H0;
import p017b7.InterfaceC1795l;
import p017b7.InterfaceC1815v0;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i f15184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i.b f15185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.o f15186e;

        /* JADX INFO: renamed from: androidx.lifecycle.C$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0373a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f15187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f15188b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f15189c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f15190d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f15191e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f15192f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f15193g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ AbstractC1726i f15194h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ AbstractC1726i.b f15195i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ p017b7.J f15196j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Q6.o f15197k;

            /* JADX INFO: renamed from: androidx.lifecycle.C$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0374a implements InterfaceC1730m {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AbstractC1726i.a f15198a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.J f15199b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p017b7.J f15200c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ AbstractC1726i.a f15201d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1795l f15202e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ p098k7.a f15203f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Q6.o f15204g;

                /* JADX INFO: renamed from: androidx.lifecycle.C$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0375a extends I6.l implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public Object f15205a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public Object f15206b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f15207c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ p098k7.a f15208d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Q6.o f15209e;

                    /* JADX INFO: renamed from: androidx.lifecycle.C$a$a$a$a$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                    public static final class C0376a extends I6.l implements Q6.o {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public int f15210a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public /* synthetic */ Object f15211b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Q6.o f15212c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0376a(Q6.o oVar, G6.d dVar) {
                            super(2, dVar);
                            this.f15212c = oVar;
                        }

                        @Override // I6.a
                        public final G6.d create(Object obj, G6.d dVar) {
                            C0376a c0376a = new C0376a(this.f15212c, dVar);
                            c0376a.f15211b = obj;
                            return c0376a;
                        }

                        @Override // Q6.o
                        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(p017b7.J j8, G6.d dVar) {
                            return ((C0376a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
                        }

                        @Override // I6.a
                        public final Object invokeSuspend(Object obj) {
                            Object objF = H6.c.f();
                            int i8 = this.f15210a;
                            if (i8 == 0) {
                                C6.r.b(obj);
                                p017b7.J j8 = (p017b7.J) this.f15211b;
                                Q6.o oVar = this.f15212c;
                                this.f15210a = 1;
                                if (oVar.invoke(j8, this) == objF) {
                                    return objF;
                                }
                            } else {
                                if (i8 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C6.r.b(obj);
                            }
                            return C6.G.f1419a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0375a(p098k7.a aVar, Q6.o oVar, G6.d dVar) {
                        super(2, dVar);
                        this.f15208d = aVar;
                        this.f15209e = oVar;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new C0375a(this.f15208d, this.f15209e, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(p017b7.J j8, G6.d dVar) {
                        return ((C0375a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        p098k7.a aVar;
                        Q6.o oVar;
                        p098k7.a aVar2;
                        Throwable th;
                        Object objF = H6.c.f();
                        int i8 = this.f15207c;
                        try {
                            if (i8 == 0) {
                                C6.r.b(obj);
                                aVar = this.f15208d;
                                oVar = this.f15209e;
                                this.f15205a = aVar;
                                this.f15206b = oVar;
                                this.f15207c = 1;
                                if (aVar.b(null, this) != objF) {
                                }
                                return objF;
                            }
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = (p098k7.a) this.f15205a;
                                try {
                                    C6.r.b(obj);
                                    C6.G g8 = C6.G.f1419a;
                                    aVar2.e(null);
                                    return C6.G.f1419a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2.e(null);
                                    throw th;
                                }
                            }
                            oVar = (Q6.o) this.f15206b;
                            p098k7.a aVar3 = (p098k7.a) this.f15205a;
                            C6.r.b(obj);
                            aVar = aVar3;
                            C0376a c0376a = new C0376a(oVar, null);
                            this.f15205a = aVar;
                            this.f15206b = null;
                            this.f15207c = 2;
                            if (p017b7.K.f(c0376a, this) != objF) {
                                aVar2 = aVar;
                                C6.G g9 = C6.G.f1419a;
                                aVar2.e(null);
                                return C6.G.f1419a;
                            }
                            return objF;
                        } catch (Throwable th3) {
                            aVar2 = aVar;
                            th = th3;
                            aVar2.e(null);
                            throw th;
                        }
                    }
                }

                public C0374a(AbstractC1726i.a aVar, kotlin.jvm.internal.J j8, p017b7.J j9, AbstractC1726i.a aVar2, InterfaceC1795l interfaceC1795l, p098k7.a aVar3, Q6.o oVar) {
                    this.f15198a = aVar;
                    this.f15199b = j8;
                    this.f15200c = j9;
                    this.f15201d = aVar2;
                    this.f15202e = interfaceC1795l;
                    this.f15203f = aVar3;
                    this.f15204g = oVar;
                }

                @Override // androidx.lifecycle.InterfaceC1730m
                public final void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
                    kotlin.jvm.internal.t.g(interfaceC1733p, "<anonymous parameter 0>");
                    kotlin.jvm.internal.t.g(event, "event");
                    if (event == this.f15198a) {
                        this.f15199b.f28779a = AbstractC1789i.d(this.f15200c, null, null, new C0375a(this.f15203f, this.f15204g, null), 3, null);
                        return;
                    }
                    if (event == this.f15201d) {
                        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) this.f15199b.f28779a;
                        if (interfaceC1815v0 != null) {
                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                        }
                        this.f15199b.f28779a = null;
                    }
                    if (event == AbstractC1726i.a.ON_DESTROY) {
                        InterfaceC1795l interfaceC1795l = this.f15202e;
                        C6.q.a aVar = C6.q.f1441b;
                        interfaceC1795l.resumeWith(C6.q.b(C6.G.f1419a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0373a(AbstractC1726i abstractC1726i, AbstractC1726i.b bVar, p017b7.J j8, Q6.o oVar, G6.d dVar) {
                super(2, dVar);
                this.f15194h = abstractC1726i;
                this.f15195i = bVar;
                this.f15196j = j8;
                this.f15197k = oVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new C0373a(this.f15194h, this.f15195i, this.f15196j, this.f15197k, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p017b7.J j8, G6.d dVar) {
                return ((C0373a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
            @Override // I6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.jvm.internal.J j8;
                Throwable th;
                kotlin.jvm.internal.J j9;
                InterfaceC1815v0 interfaceC1815v0;
                InterfaceC1730m interfaceC1730m;
                InterfaceC1815v0 interfaceC1815v1;
                InterfaceC1730m interfaceC1730m2;
                Object objF = H6.c.f();
                int i8 = this.f15193g;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j8 = (kotlin.jvm.internal.J) this.f15188b;
                    j9 = (kotlin.jvm.internal.J) this.f15187a;
                    try {
                        C6.r.b(obj);
                        interfaceC1815v1 = (InterfaceC1815v0) j9.f28779a;
                        if (interfaceC1815v1 != null) {
                            InterfaceC1815v0.a.a(interfaceC1815v1, null, 1, null);
                        }
                        interfaceC1730m2 = (InterfaceC1730m) j8.f28779a;
                        if (interfaceC1730m2 != null) {
                            this.f15194h.d(interfaceC1730m2);
                        }
                        return C6.G.f1419a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC1815v0 = (InterfaceC1815v0) j9.f28779a;
                        if (interfaceC1815v0 != null) {
                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                        }
                        interfaceC1730m = (InterfaceC1730m) j8.f28779a;
                        if (interfaceC1730m != null) {
                            throw th;
                        }
                        this.f15194h.d(interfaceC1730m);
                        throw th;
                    }
                }
                C6.r.b(obj);
                if (this.f15194h.b() == AbstractC1726i.b.DESTROYED) {
                    return C6.G.f1419a;
                }
                kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
                j8 = new kotlin.jvm.internal.J();
                try {
                    AbstractC1726i.b bVar = this.f15195i;
                    AbstractC1726i abstractC1726i = this.f15194h;
                    p017b7.J j11 = this.f15196j;
                    Q6.o oVar = this.f15197k;
                    this.f15187a = j10;
                    this.f15188b = j8;
                    this.f15189c = bVar;
                    this.f15190d = abstractC1726i;
                    this.f15191e = j11;
                    this.f15192f = oVar;
                    this.f15193g = 1;
                    C1797m c1797m = new C1797m(H6.b.c(this), 1);
                    c1797m.z();
                    AbstractC1726i.a.C0379a c0379a = AbstractC1726i.a.Companion;
                    C0374a c0374a = new C0374a(c0379a.c(bVar), j10, j11, c0379a.a(bVar), c1797m, p098k7.c.b(false, 1, null), oVar);
                    j8.f28779a = c0374a;
                    kotlin.jvm.internal.t.e(c0374a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC1726i.a(c0374a);
                    Object objS = c1797m.s();
                    if (objS == H6.c.f()) {
                        I6.h.c(this);
                    }
                    if (objS == objF) {
                        return objF;
                    }
                    j9 = j10;
                    interfaceC1815v1 = (InterfaceC1815v0) j9.f28779a;
                    if (interfaceC1815v1 != null) {
                        InterfaceC1815v0.a.a(interfaceC1815v1, null, 1, null);
                    }
                    interfaceC1730m2 = (InterfaceC1730m) j8.f28779a;
                    if (interfaceC1730m2 != null) {
                        this.f15194h.d(interfaceC1730m2);
                    }
                    return C6.G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    j9 = j10;
                    interfaceC1815v0 = (InterfaceC1815v0) j9.f28779a;
                    if (interfaceC1815v0 != null) {
                        InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                    }
                    interfaceC1730m = (InterfaceC1730m) j8.f28779a;
                    if (interfaceC1730m != null) {
                        throw th;
                    }
                    this.f15194h.d(interfaceC1730m);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1726i abstractC1726i, AbstractC1726i.b bVar, Q6.o oVar, G6.d dVar) {
            super(2, dVar);
            this.f15184c = abstractC1726i;
            this.f15185d = bVar;
            this.f15186e = oVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            a aVar = new a(this.f15184c, this.f15185d, this.f15186e, dVar);
            aVar.f15183b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f15182a;
            if (i8 == 0) {
                C6.r.b(obj);
                p017b7.J j8 = (p017b7.J) this.f15183b;
                H0 h0O1 = Z.c().o1();
                C0373a c0373a = new C0373a(this.f15184c, this.f15185d, j8, this.f15186e, null);
                this.f15182a = 1;
                if (AbstractC1785g.g(h0O1, c0373a, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    public static final Object a(AbstractC1726i abstractC1726i, AbstractC1726i.b bVar, Q6.o oVar, G6.d dVar) {
        if (bVar == AbstractC1726i.b.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (abstractC1726i.b() == AbstractC1726i.b.DESTROYED) {
            return C6.G.f1419a;
        }
        Object objF = p017b7.K.f(new a(abstractC1726i, bVar, oVar, null), dVar);
        return objF == H6.c.f() ? objF : C6.G.f1419a;
    }
}
