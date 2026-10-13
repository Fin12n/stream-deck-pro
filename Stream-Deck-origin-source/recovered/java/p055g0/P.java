package p055g0;

import C6.G;
import C6.r;
import H.FL.dCqzKmEghGTQ;
import I6.k;
import I6.l;
import Q6.o;
import Q6.p;
import p011b1.C1769q;
import p011b1.EnumC1768p;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.z;
import p017b7.AbstractC1789i;
import p017b7.J;
import p017b7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f22879a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22880a;

        public a(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(D d8, long j8, G6.d dVar) {
            return new a(dVar).invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((D) obj, ((Q0.f) obj2).x(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f22880a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22885e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22884d = obj;
            this.f22885e |= Integer.MIN_VALUE;
            return P.d(null, false, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends k implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z f22889e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar, G6.d dVar) {
            super(2, dVar);
            this.f22889e = zVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f22889e, dVar);
            cVar.f22888d = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
            return ((c) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0051 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:12:0x0047). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r11.f22887c
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                long r3 = r11.f22886b
                java.lang.Object r1 = r11.f22888d
                b1.c r1 = (p011b1.InterfaceC1755c) r1
                C6.r.b(r12)
                r5 = r1
                goto L47
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                C6.r.b(r12)
                java.lang.Object r12 = r11.f22888d
                b1.c r12 = (p011b1.InterfaceC1755c) r12
                b1.z r1 = r11.f22889e
                long r3 = r1.p()
                h1.R0 r1 = r12.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r5 = r12
            L35:
                r11.f22888d = r5
                r11.f22886b = r3
                r11.f22887c = r2
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = p055g0.P.e(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L47
                return r0
            L47:
                b1.z r12 = (p011b1.z) r12
                long r6 = r12.p()
                int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r1 < 0) goto L35
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.P.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22892c;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22891b = obj;
            this.f22892c |= Integer.MIN_VALUE;
            return P.g(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f22895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f22896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.k f22897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ E f22898f;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends k implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f22899b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f22900c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f22901d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p f22902e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Q6.k f22903f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ E f22904g;

            /* JADX INFO: renamed from: g0.P$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0526a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22905a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22906b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0526a(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22906b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0526a(this.f22906b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0526a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22905a;
                    if (i8 == 0) {
                        r.b(obj);
                        E e8 = this.f22906b;
                        this.f22905a = 1;
                        if (e8.f(this) == objF) {
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
            public static final class b extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22907a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f22908b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ E f22909c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z f22910d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(p pVar, E e8, z zVar, G6.d dVar) {
                    super(2, dVar);
                    this.f22908b = pVar;
                    this.f22909c = e8;
                    this.f22910d = zVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new b(this.f22908b, this.f22909c, this.f22910d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22907a;
                    if (i8 == 0) {
                        r.b(obj);
                        p pVar = this.f22908b;
                        E e8 = this.f22909c;
                        Q0.f fVarD = Q0.f.d(this.f22910d.i());
                        this.f22907a = 1;
                        if (pVar.invoke(e8, fVarD, this) == objF) {
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
            public static final class c extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22911a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22912b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22912b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new c(this.f22912b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f22911a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f22912b.c();
                    return G.f1419a;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class d extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22913a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22914b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22914b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new d(this.f22914b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f22913a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f22914b.e();
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J j8, p pVar, Q6.k kVar, E e8, G6.d dVar) {
                super(2, dVar);
                this.f22901d = j8;
                this.f22902e = pVar;
                this.f22903f = kVar;
                this.f22904g = e8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f22901d, this.f22902e, this.f22903f, this.f22904g, dVar);
                aVar.f22900c = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                return ((a) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
            
                if (r0 == r6) goto L18;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC1755c interfaceC1755c;
                Object objE;
                Object objL;
                Object objF = H6.c.f();
                int i8 = this.f22899b;
                if (i8 == 0) {
                    r.b(obj);
                    interfaceC1755c = (InterfaceC1755c) this.f22900c;
                    AbstractC1789i.d(this.f22901d, null, null, new C0526a(this.f22904g, null), 3, null);
                    this.f22900c = interfaceC1755c;
                    this.f22899b = 1;
                    objE = P.e(interfaceC1755c, false, null, this, 3, null);
                    if (objE != objF) {
                    }
                    return objF;
                }
                if (i8 == 1) {
                    interfaceC1755c = (InterfaceC1755c) this.f22900c;
                    r.b(obj);
                    objE = obj;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    objL = obj;
                }
                z zVar = (z) objL;
                if (zVar == null) {
                    AbstractC1789i.d(this.f22901d, null, null, new c(this.f22904g, null), 3, null);
                } else {
                    zVar.a();
                    AbstractC1789i.d(this.f22901d, null, null, new d(this.f22904g, null), 3, null);
                    Q6.k kVar = this.f22903f;
                    if (kVar != null) {
                        kVar.invoke(Q0.f.d(zVar.i()));
                    }
                }
                return G.f1419a;
                z zVar2 = (z) objE;
                zVar2.a();
                if (this.f22902e != P.f22879a) {
                    AbstractC1789i.d(this.f22901d, null, null, new b(this.f22902e, this.f22904g, zVar2, null), 3, null);
                }
                this.f22900c = null;
                this.f22899b = 2;
                objL = P.l(interfaceC1755c, null, this, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(I i8, p pVar, Q6.k kVar, E e8, G6.d dVar) {
            super(2, dVar);
            this.f22895c = i8;
            this.f22896d = pVar;
            this.f22897e = kVar;
            this.f22898f = e8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = new e(this.f22895c, this.f22896d, this.f22897e, this.f22898f, dVar);
            eVar.f22894b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f22893a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f22894b;
                I i9 = this.f22895c;
                a aVar = new a(j8, this.f22896d, this.f22897e, this.f22898f, null);
                this.f22893a = 1;
                if (x.c(i9, aVar, this) == objF) {
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
    public static final class f extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f22917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f22918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.k f22919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Q6.k f22920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Q6.k f22921g;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends k implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f22922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f22923c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f22924d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f22925e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f22926f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f22927g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ J f22928h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p f22929i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Q6.k f22930j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Q6.k f22931k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Q6.k f22932l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ E f22933m;

            /* JADX INFO: renamed from: g0.P$f$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0527a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22934a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22935b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0527a(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22935b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0527a(this.f22935b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0527a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f22934a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f22935b.e();
                    return G.f1419a;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22936a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22937b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22937b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new b(this.f22937b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22936a;
                    if (i8 == 0) {
                        r.b(obj);
                        E e8 = this.f22937b;
                        this.f22936a = 1;
                        if (e8.f(this) == objF) {
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
            public static final class c extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22938a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f22939b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ E f22940c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z f22941d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(p pVar, E e8, z zVar, G6.d dVar) {
                    super(2, dVar);
                    this.f22939b = pVar;
                    this.f22940c = e8;
                    this.f22941d = zVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new c(this.f22939b, this.f22940c, this.f22941d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22938a;
                    if (i8 == 0) {
                        r.b(obj);
                        p pVar = this.f22939b;
                        E e8 = this.f22940c;
                        Q0.f fVarD = Q0.f.d(this.f22941d.i());
                        this.f22938a = 1;
                        if (pVar.invoke(e8, fVarD, this) == objF) {
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
            public static final class d extends k implements o {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f22942b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f22943c;

                public d(G6.d dVar) {
                    super(2, dVar);
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    d dVar2 = new d(dVar);
                    dVar2.f22943c = obj;
                    return dVar2;
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                    return ((d) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22942b;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        return obj;
                    }
                    r.b(obj);
                    InterfaceC1755c interfaceC1755c = (InterfaceC1755c) this.f22943c;
                    this.f22942b = 1;
                    Object objL = P.l(interfaceC1755c, null, this, 1, null);
                    return objL == objF ? objF : objL;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class e extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22944a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22945b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22945b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new e(this.f22945b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f22944a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f22945b.c();
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: g0.P$f$a$f, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0528f extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22946a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22947b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0528f(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22947b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0528f(this.f22947b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0528f) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f22946a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f22947b.e();
                    return G.f1419a;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class g extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22948a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22949b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22949b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new g(this.f22949b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    H6.c.f();
                    if (this.f22948a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                    this.f22949b.e();
                    return G.f1419a;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class h extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22950a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ E f22951b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22951b = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new h(this.f22951b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22950a;
                    if (i8 == 0) {
                        r.b(obj);
                        E e8 = this.f22951b;
                        this.f22950a = 1;
                        if (e8.f(this) == objF) {
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
            public static final class j extends k implements o {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f22956b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f22957c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ J f22958d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Q6.k f22959e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Q6.k f22960f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.J f22961g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ E f22962h;

                /* JADX INFO: renamed from: g0.P$f$a$j$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0529a extends l implements o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f22963a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ E f22964b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0529a(E e8, G6.d dVar) {
                        super(2, dVar);
                        this.f22964b = e8;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new C0529a(this.f22964b, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(J j8, G6.d dVar) {
                        return ((C0529a) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        H6.c.f();
                        if (this.f22963a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f22964b.e();
                        return G.f1419a;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class b extends l implements o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f22965a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ E f22966b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(E e8, G6.d dVar) {
                        super(2, dVar);
                        this.f22966b = e8;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new b(this.f22966b, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(J j8, G6.d dVar) {
                        return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        H6.c.f();
                        if (this.f22965a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f22966b.c();
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(J j8, Q6.k kVar, Q6.k kVar2, kotlin.jvm.internal.J j9, E e8, G6.d dVar) {
                    super(2, dVar);
                    this.f22958d = j8;
                    this.f22959e = kVar;
                    this.f22960f = kVar2;
                    this.f22961g = j9;
                    this.f22962h = e8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    j jVar = new j(this.f22958d, this.f22959e, this.f22960f, this.f22961g, this.f22962h, dVar);
                    jVar.f22957c = obj;
                    return jVar;
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                    return ((j) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22956b;
                    if (i8 == 0) {
                        r.b(obj);
                        InterfaceC1755c interfaceC1755c = (InterfaceC1755c) this.f22957c;
                        this.f22956b = 1;
                        obj = P.l(interfaceC1755c, null, this, 1, null);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    z zVar = (z) obj;
                    if (zVar != null) {
                        zVar.a();
                        AbstractC1789i.d(this.f22958d, null, null, new C0529a(this.f22962h, null), 3, null);
                        this.f22959e.invoke(Q0.f.d(zVar.i()));
                        return G.f1419a;
                    }
                    AbstractC1789i.d(this.f22958d, null, null, new b(this.f22962h, null), 3, null);
                    Q6.k kVar = this.f22960f;
                    if (kVar == null) {
                        return null;
                    }
                    kVar.invoke(Q0.f.d(((z) this.f22961g.f28779a).i()));
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J j8, p pVar, Q6.k kVar, Q6.k kVar2, Q6.k kVar3, E e8, G6.d dVar) {
                super(2, dVar);
                this.f22928h = j8;
                this.f22929i = pVar;
                this.f22930j = kVar;
                this.f22931k = kVar2;
                this.f22932l = kVar3;
                this.f22933m = e8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f22928h, this.f22929i, this.f22930j, this.f22931k, this.f22932l, this.f22933m, dVar);
                aVar.f22927g = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                return ((a) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
            /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[Catch: q -> 0x010a, TryCatch #3 {q -> 0x010a, blocks: (B:34:0x00f3, B:36:0x00f9, B:38:0x010e), top: B:90:0x00f3 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x010e A[Catch: q -> 0x010a, TRY_LEAVE, TryCatch #3 {q -> 0x010a, blocks: (B:34:0x00f3, B:36:0x00f9, B:38:0x010e), top: B:90:0x00f3 }] */
            /* JADX WARN: Code duplicated, block: B:42:0x0129  */
            /* JADX WARN: Code duplicated, block: B:49:0x015e  */
            /* JADX WARN: Code duplicated, block: B:51:0x0162  */
            /* JADX WARN: Code duplicated, block: B:53:0x0166  */
            /* JADX WARN: Code duplicated, block: B:54:0x0175  */
            /* JADX WARN: Code duplicated, block: B:57:0x018c  */
            /* JADX WARN: Code duplicated, block: B:60:0x0192  */
            /* JADX WARN: Code duplicated, block: B:62:0x0196  */
            /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
            /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:72:0x01fd  */
            /* JADX WARN: Code duplicated, block: B:75:0x0210  */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0145, code lost:
            
                if (p055g0.P.g(r4, r19) == r6) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01f4, code lost:
            
                if (r2.l0(r0, r8, r19) == r6) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x0228, code lost:
            
                if (p055g0.P.g(r2, r19) == r6) goto L78;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC1755c interfaceC1755c;
                Object objE;
                InterfaceC1755c interfaceC1755c2;
                z zVar;
                long jC;
                kotlin.jvm.internal.J j8;
                Object objL0;
                InterfaceC1755c interfaceC1755c3;
                z zVar2;
                kotlin.jvm.internal.J j9;
                InterfaceC1755c interfaceC1755c4;
                Q6.k kVar;
                Object obj2;
                Object obj3;
                Object objF;
                kotlin.jvm.internal.J j10;
                InterfaceC1755c interfaceC1755c5;
                Q6.k kVar2;
                z zVar3;
                z zVar4;
                kotlin.jvm.internal.J j11;
                Q6.k kVar3;
                Q6.k kVar4;
                Q6.k kVar5;
                Object objF2 = H6.c.f();
                switch (this.f22926f) {
                    case 0:
                        r.b(obj);
                        interfaceC1755c = (InterfaceC1755c) this.f22927g;
                        this.f22927g = interfaceC1755c;
                        this.f22926f = 1;
                        objE = P.e(interfaceC1755c, false, null, this, 3, null);
                        if (objE != objF2) {
                            interfaceC1755c2 = interfaceC1755c;
                            zVar = (z) objE;
                            zVar.a();
                            AbstractC1789i.d(this.f22928h, null, null, new b(this.f22933m, null), 3, null);
                            if (this.f22929i != P.f22879a) {
                                AbstractC1789i.d(this.f22928h, null, null, new c(this.f22929i, this.f22933m, zVar, null), 3, null);
                            }
                            if (this.f22930j != null) {
                                jC = interfaceC1755c2.getViewConfiguration().c();
                            } else {
                                jC = 4611686018427387903L;
                            }
                            j8 = new kotlin.jvm.internal.J();
                            try {
                                d dVar = new d(null);
                                this.f22927g = interfaceC1755c2;
                                this.f22922b = zVar;
                                this.f22923c = j8;
                                this.f22924d = j8;
                                this.f22925e = jC;
                                this.f22926f = 2;
                                objL0 = interfaceC1755c2.l0(jC, dVar, this);
                                if (objL0 != objF2) {
                                    interfaceC1755c3 = interfaceC1755c2;
                                    zVar2 = zVar;
                                    j9 = j8;
                                    try {
                                        j8.f28779a = objL0;
                                        obj2 = j9.f28779a;
                                        if (obj2 == null) {
                                            AbstractC1789i.d(this.f22928h, null, null, new e(this.f22933m, null), 3, null);
                                        } else {
                                            ((z) obj2).a();
                                            AbstractC1789i.d(this.f22928h, null, null, new C0528f(this.f22933m, null), 3, null);
                                        }
                                        j8 = j9;
                                    } catch (C1769q unused) {
                                        j8 = j9;
                                        zVar = zVar2;
                                        interfaceC1755c4 = interfaceC1755c3;
                                        kVar = this.f22930j;
                                        if (kVar != null) {
                                            kVar.invoke(Q0.f.d(zVar.i()));
                                        }
                                        this.f22927g = interfaceC1755c4;
                                        this.f22922b = j8;
                                        this.f22923c = null;
                                        this.f22924d = null;
                                        this.f22925e = jC;
                                        this.f22926f = 3;
                                        break;
                                    }
                                    obj3 = j8.f28779a;
                                    if (obj3 != null) {
                                        if (this.f22931k == null) {
                                            this.f22927g = interfaceC1755c3;
                                            this.f22922b = j8;
                                            this.f22923c = null;
                                            this.f22924d = null;
                                            this.f22925e = jC;
                                            this.f22926f = 4;
                                            objF = P.f(interfaceC1755c3, (z) obj3, this);
                                            if (objF != objF2) {
                                                j10 = j8;
                                                interfaceC1755c5 = interfaceC1755c3;
                                                zVar3 = (z) objF;
                                                if (zVar3 != null) {
                                                    AbstractC1789i.d(this.f22928h, null, null, new h(this.f22933m, null), 3, null);
                                                    if (this.f22929i != P.f22879a) {
                                                        AbstractC1789i.d(this.f22928h, null, null, new i(this.f22929i, this.f22933m, zVar3, null), 3, null);
                                                    }
                                                    try {
                                                        j jVar = new j(this.f22928h, this.f22931k, this.f22932l, j10, this.f22933m, null);
                                                        this.f22927g = interfaceC1755c5;
                                                        this.f22922b = j10;
                                                        this.f22923c = zVar3;
                                                        this.f22926f = 5;
                                                    } catch (C1769q unused2) {
                                                        zVar4 = zVar3;
                                                        j11 = j10;
                                                        kVar4 = this.f22932l;
                                                        if (kVar4 != null) {
                                                            kVar4.invoke(Q0.f.d(((z) j11.f28779a).i()));
                                                        }
                                                        kVar5 = this.f22930j;
                                                        if (kVar5 != null) {
                                                            kVar5.invoke(Q0.f.d(zVar4.i()));
                                                        }
                                                        this.f22927g = null;
                                                        this.f22922b = null;
                                                        this.f22923c = null;
                                                        this.f22926f = 6;
                                                    }
                                                } else {
                                                    kVar3 = this.f22932l;
                                                    if (kVar3 != null) {
                                                        kVar3.invoke(Q0.f.d(((z) j10.f28779a).i()));
                                                    }
                                                }
                                            }
                                        } else {
                                            kVar2 = this.f22932l;
                                            if (kVar2 != null) {
                                                kVar2.invoke(Q0.f.d(((z) obj3).i()));
                                            }
                                        }
                                        break;
                                    }
                                    return G.f1419a;
                                }
                            } catch (C1769q unused3) {
                                interfaceC1755c4 = interfaceC1755c2;
                                kVar = this.f22930j;
                                if (kVar != null) {
                                    kVar.invoke(Q0.f.d(zVar.i()));
                                }
                                this.f22927g = interfaceC1755c4;
                                this.f22922b = j8;
                                this.f22923c = null;
                                this.f22924d = null;
                                this.f22925e = jC;
                                this.f22926f = 3;
                            }
                            break;
                        }
                        return objF2;
                    case 1:
                        interfaceC1755c = (InterfaceC1755c) this.f22927g;
                        r.b(obj);
                        objE = obj;
                        interfaceC1755c2 = interfaceC1755c;
                        zVar = (z) objE;
                        zVar.a();
                        AbstractC1789i.d(this.f22928h, null, null, new b(this.f22933m, null), 3, null);
                        if (this.f22929i != P.f22879a) {
                            AbstractC1789i.d(this.f22928h, null, null, new c(this.f22929i, this.f22933m, zVar, null), 3, null);
                        }
                        if (this.f22930j != null) {
                            jC = interfaceC1755c2.getViewConfiguration().c();
                        } else {
                            jC = 4611686018427387903L;
                        }
                        j8 = new kotlin.jvm.internal.J();
                        d dVar2 = new d(null);
                        this.f22927g = interfaceC1755c2;
                        this.f22922b = zVar;
                        this.f22923c = j8;
                        this.f22924d = j8;
                        this.f22925e = jC;
                        this.f22926f = 2;
                        objL0 = interfaceC1755c2.l0(jC, dVar2, this);
                        if (objL0 != objF2) {
                            interfaceC1755c3 = interfaceC1755c2;
                            zVar2 = zVar;
                            j9 = j8;
                            j8.f28779a = objL0;
                            obj2 = j9.f28779a;
                            if (obj2 == null) {
                                AbstractC1789i.d(this.f22928h, null, null, new e(this.f22933m, null), 3, null);
                            } else {
                                ((z) obj2).a();
                                AbstractC1789i.d(this.f22928h, null, null, new C0528f(this.f22933m, null), 3, null);
                            }
                            j8 = j9;
                            obj3 = j8.f28779a;
                            if (obj3 != null) {
                                if (this.f22931k == null) {
                                    this.f22927g = interfaceC1755c3;
                                    this.f22922b = j8;
                                    this.f22923c = null;
                                    this.f22924d = null;
                                    this.f22925e = jC;
                                    this.f22926f = 4;
                                    objF = P.f(interfaceC1755c3, (z) obj3, this);
                                    if (objF != objF2) {
                                        j10 = j8;
                                        interfaceC1755c5 = interfaceC1755c3;
                                        zVar3 = (z) objF;
                                        if (zVar3 != null) {
                                            AbstractC1789i.d(this.f22928h, null, null, new h(this.f22933m, null), 3, null);
                                            if (this.f22929i != P.f22879a) {
                                                AbstractC1789i.d(this.f22928h, null, null, new i(this.f22929i, this.f22933m, zVar3, null), 3, null);
                                            }
                                            j jVar2 = new j(this.f22928h, this.f22931k, this.f22932l, j10, this.f22933m, null);
                                            this.f22927g = interfaceC1755c5;
                                            this.f22922b = j10;
                                            this.f22923c = zVar3;
                                            this.f22926f = 5;
                                        } else {
                                            kVar3 = this.f22932l;
                                            if (kVar3 != null) {
                                                kVar3.invoke(Q0.f.d(((z) j10.f28779a).i()));
                                            }
                                        }
                                    }
                                } else {
                                    kVar2 = this.f22932l;
                                    if (kVar2 != null) {
                                        kVar2.invoke(Q0.f.d(((z) obj3).i()));
                                    }
                                }
                                break;
                            }
                            return G.f1419a;
                        }
                        return objF2;
                    case 2:
                        jC = this.f22925e;
                        j8 = (kotlin.jvm.internal.J) this.f22924d;
                        kotlin.jvm.internal.J j12 = (kotlin.jvm.internal.J) this.f22923c;
                        zVar = (z) this.f22922b;
                        interfaceC1755c2 = (InterfaceC1755c) this.f22927g;
                        try {
                            r.b(obj);
                            interfaceC1755c3 = interfaceC1755c2;
                            zVar2 = zVar;
                            j9 = j12;
                            objL0 = obj;
                            j8.f28779a = objL0;
                            obj2 = j9.f28779a;
                            if (obj2 == null) {
                                AbstractC1789i.d(this.f22928h, null, null, new e(this.f22933m, null), 3, null);
                            } else {
                                ((z) obj2).a();
                                AbstractC1789i.d(this.f22928h, null, null, new C0528f(this.f22933m, null), 3, null);
                            }
                            j8 = j9;
                        } catch (C1769q unused4) {
                            j8 = j12;
                            interfaceC1755c4 = interfaceC1755c2;
                            kVar = this.f22930j;
                            if (kVar != null) {
                                kVar.invoke(Q0.f.d(zVar.i()));
                            }
                            this.f22927g = interfaceC1755c4;
                            this.f22922b = j8;
                            this.f22923c = null;
                            this.f22924d = null;
                            this.f22925e = jC;
                            this.f22926f = 3;
                            break;
                        }
                        obj3 = j8.f28779a;
                        if (obj3 != null) {
                            if (this.f22931k == null) {
                                this.f22927g = interfaceC1755c3;
                                this.f22922b = j8;
                                this.f22923c = null;
                                this.f22924d = null;
                                this.f22925e = jC;
                                this.f22926f = 4;
                                objF = P.f(interfaceC1755c3, (z) obj3, this);
                                if (objF != objF2) {
                                    j10 = j8;
                                    interfaceC1755c5 = interfaceC1755c3;
                                    zVar3 = (z) objF;
                                    if (zVar3 != null) {
                                        AbstractC1789i.d(this.f22928h, null, null, new h(this.f22933m, null), 3, null);
                                        if (this.f22929i != P.f22879a) {
                                            AbstractC1789i.d(this.f22928h, null, null, new i(this.f22929i, this.f22933m, zVar3, null), 3, null);
                                        }
                                        j jVar3 = new j(this.f22928h, this.f22931k, this.f22932l, j10, this.f22933m, null);
                                        this.f22927g = interfaceC1755c5;
                                        this.f22922b = j10;
                                        this.f22923c = zVar3;
                                        this.f22926f = 5;
                                    } else {
                                        kVar3 = this.f22932l;
                                        if (kVar3 != null) {
                                            kVar3.invoke(Q0.f.d(((z) j10.f28779a).i()));
                                        }
                                    }
                                    break;
                                }
                                return objF2;
                            }
                            kVar2 = this.f22932l;
                            if (kVar2 != null) {
                                kVar2.invoke(Q0.f.d(((z) obj3).i()));
                            }
                        }
                        return G.f1419a;
                    case 3:
                        jC = this.f22925e;
                        j8 = (kotlin.jvm.internal.J) this.f22922b;
                        interfaceC1755c4 = (InterfaceC1755c) this.f22927g;
                        r.b(obj);
                        AbstractC1789i.d(this.f22928h, null, null, new g(this.f22933m, null), 3, null);
                        interfaceC1755c3 = interfaceC1755c4;
                        obj3 = j8.f28779a;
                        if (obj3 != null) {
                            if (this.f22931k == null) {
                                this.f22927g = interfaceC1755c3;
                                this.f22922b = j8;
                                this.f22923c = null;
                                this.f22924d = null;
                                this.f22925e = jC;
                                this.f22926f = 4;
                                objF = P.f(interfaceC1755c3, (z) obj3, this);
                                if (objF != objF2) {
                                    j10 = j8;
                                    interfaceC1755c5 = interfaceC1755c3;
                                    zVar3 = (z) objF;
                                    if (zVar3 != null) {
                                        AbstractC1789i.d(this.f22928h, null, null, new h(this.f22933m, null), 3, null);
                                        if (this.f22929i != P.f22879a) {
                                            AbstractC1789i.d(this.f22928h, null, null, new i(this.f22929i, this.f22933m, zVar3, null), 3, null);
                                        }
                                        j jVar4 = new j(this.f22928h, this.f22931k, this.f22932l, j10, this.f22933m, null);
                                        this.f22927g = interfaceC1755c5;
                                        this.f22922b = j10;
                                        this.f22923c = zVar3;
                                        this.f22926f = 5;
                                    } else {
                                        kVar3 = this.f22932l;
                                        if (kVar3 != null) {
                                            kVar3.invoke(Q0.f.d(((z) j10.f28779a).i()));
                                        }
                                    }
                                    break;
                                }
                                return objF2;
                            }
                            kVar2 = this.f22932l;
                            if (kVar2 != null) {
                                kVar2.invoke(Q0.f.d(((z) obj3).i()));
                            }
                        }
                        return G.f1419a;
                    case 4:
                        jC = this.f22925e;
                        kotlin.jvm.internal.J j13 = (kotlin.jvm.internal.J) this.f22922b;
                        InterfaceC1755c interfaceC1755c6 = (InterfaceC1755c) this.f22927g;
                        r.b(obj);
                        j10 = j13;
                        interfaceC1755c5 = interfaceC1755c6;
                        objF = obj;
                        zVar3 = (z) objF;
                        if (zVar3 != null) {
                            AbstractC1789i.d(this.f22928h, null, null, new h(this.f22933m, null), 3, null);
                            if (this.f22929i != P.f22879a) {
                                AbstractC1789i.d(this.f22928h, null, null, new i(this.f22929i, this.f22933m, zVar3, null), 3, null);
                            }
                            j jVar5 = new j(this.f22928h, this.f22931k, this.f22932l, j10, this.f22933m, null);
                            this.f22927g = interfaceC1755c5;
                            this.f22922b = j10;
                            this.f22923c = zVar3;
                            this.f22926f = 5;
                            break;
                        } else {
                            kVar3 = this.f22932l;
                            if (kVar3 != null) {
                                kVar3.invoke(Q0.f.d(((z) j10.f28779a).i()));
                            }
                        }
                        return G.f1419a;
                    case 5:
                        zVar4 = (z) this.f22923c;
                        j11 = (kotlin.jvm.internal.J) this.f22922b;
                        interfaceC1755c5 = (InterfaceC1755c) this.f22927g;
                        try {
                            r.b(obj);
                            break;
                        } catch (C1769q unused5) {
                            kVar4 = this.f22932l;
                            if (kVar4 != null) {
                                kVar4.invoke(Q0.f.d(((z) j11.f28779a).i()));
                            }
                            kVar5 = this.f22930j;
                            if (kVar5 != null) {
                                kVar5.invoke(Q0.f.d(zVar4.i()));
                            }
                            this.f22927g = null;
                            this.f22922b = null;
                            this.f22923c = null;
                            this.f22926f = 6;
                            break;
                        }
                        return G.f1419a;
                    case 6:
                        r.b(obj);
                        AbstractC1789i.d(this.f22928h, null, null, new C0527a(this.f22933m, null), 3, null);
                        return G.f1419a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class i extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22952a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f22953b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ E f22954c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z f22955d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(p pVar, E e8, z zVar, G6.d dVar) {
                    super(2, dVar);
                    this.f22953b = pVar;
                    this.f22954c = e8;
                    this.f22955d = zVar;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new i(this.f22953b, this.f22954c, this.f22955d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((i) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f22952a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            r.b(obj);
                        } else {
                            throw new IllegalStateException(dCqzKmEghGTQ.alvpsgL);
                        }
                    } else {
                        r.b(obj);
                        p pVar = this.f22953b;
                        E e8 = this.f22954c;
                        Q0.f fVarD = Q0.f.d(this.f22955d.i());
                        this.f22952a = 1;
                        if (pVar.invoke(e8, fVarD, this) == objF) {
                            return objF;
                        }
                    }
                    return G.f1419a;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(I i8, p pVar, Q6.k kVar, Q6.k kVar2, Q6.k kVar3, G6.d dVar) {
            super(2, dVar);
            this.f22917c = i8;
            this.f22918d = pVar;
            this.f22919e = kVar;
            this.f22920f = kVar2;
            this.f22921g = kVar3;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(this.f22917c, this.f22918d, this.f22919e, this.f22920f, this.f22921g, dVar);
            fVar.f22916b = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f22915a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f22916b;
                E e8 = new E(this.f22917c);
                I i9 = this.f22917c;
                a aVar = new a(j8, this.f22918d, this.f22919e, this.f22920f, this.f22921g, e8, null);
                this.f22915a = 1;
                if (x.c(i9, aVar, this) == objF) {
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
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22970d;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22969c = obj;
            this.f22970d |= Integer.MIN_VALUE;
            return P.k(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:19:0x005d->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(p011b1.InterfaceC1755c r9, boolean r10, p011b1.EnumC1768p r11, G6.d r12) {
        /*
            boolean r0 = r12 instanceof g0.P.b
            if (r0 == 0) goto L13
            r0 = r12
            g0.P$b r0 = (g0.P.b) r0
            int r1 = r0.f22885e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22885e = r1
            goto L18
        L13:
            g0.P$b r0 = new g0.P$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f22884d
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f22885e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.f22883c
            java.lang.Object r10 = r0.f22882b
            b1.p r10 = (p011b1.EnumC1768p) r10
            java.lang.Object r11 = r0.f22881a
            b1.c r11 = (p011b1.InterfaceC1755c) r11
            C6.r.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            C6.r.b(r12)
        L42:
            r0.f22881a = r9
            r0.f22882b = r11
            r0.f22883c = r10
            r0.f22885e = r3
            java.lang.Object r12 = r9.e1(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            b1.n r12 = (p011b1.C1766n) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            b1.z r7 = (p011b1.z) r7
            if (r10 == 0) goto L6c
            boolean r7 = p011b1.AbstractC1767o.a(r7)
            goto L70
        L6c:
            boolean r7 = p011b1.AbstractC1767o.b(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = r5
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.P.d(b1.c, boolean, b1.p, G6.d):java.lang.Object");
    }

    public static /* synthetic */ Object e(InterfaceC1755c interfaceC1755c, boolean z8, EnumC1768p enumC1768p, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            enumC1768p = EnumC1768p.Main;
        }
        return d(interfaceC1755c, z8, enumC1768p, dVar);
    }

    public static final Object f(InterfaceC1755c interfaceC1755c, z zVar, G6.d dVar) {
        return interfaceC1755c.x1(interfaceC1755c.getViewConfiguration().a(), new c(zVar, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[LOOP:1: B:22:0x0066->B:26:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0068
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(p011b1.InterfaceC1755c r8, G6.d r9) {
        /*
            boolean r0 = r9 instanceof g0.P.d
            if (r0 == 0) goto L13
            r0 = r9
            g0.P$d r0 = (g0.P.d) r0
            int r1 = r0.f22892c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22892c = r1
            goto L18
        L13:
            g0.P$d r0 = new g0.P$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f22891b
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f22892c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f22890a
            b1.c r8 = (p011b1.InterfaceC1755c) r8
            C6.r.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            C6.r.b(r9)
        L38:
            r0.f22890a = r8
            r0.f22892c = r3
            r9 = 0
            java.lang.Object r9 = p011b1.InterfaceC1755c.r1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            b1.n r9 = (p011b1.C1766n) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            b1.z r7 = (p011b1.z) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            b1.z r4 = (p011b1.z) r4
            boolean r4 = r4.j()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            C6.G r8 = C6.G.f1419a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.P.g(b1.c, G6.d):java.lang.Object");
    }

    public static final Object h(I i8, p pVar, Q6.k kVar, G6.d dVar) {
        Object objF = K.f(new e(i8, pVar, kVar, new E(i8), null), dVar);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public static final Object i(I i8, Q6.k kVar, Q6.k kVar2, p pVar, Q6.k kVar3, G6.d dVar) {
        Object objF = K.f(new f(i8, pVar, kVar2, kVar, kVar3, null), dVar);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public static /* synthetic */ Object j(I i8, Q6.k kVar, Q6.k kVar2, p pVar, Q6.k kVar3, G6.d dVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            kVar = null;
        }
        if ((i9 & 2) != 0) {
            kVar2 = null;
        }
        if ((i9 & 4) != 0) {
            pVar = f22879a;
        }
        if ((i9 & 8) != 0) {
            kVar3 = null;
        }
        return i(i8, kVar, kVar2, pVar, kVar3, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3 A[LOOP:1: B:23:0x007c->B:45:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(p011b1.InterfaceC1755c r17, p011b1.EnumC1768p r18, G6.d r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.P.k(b1.c, b1.p, G6.d):java.lang.Object");
    }

    public static /* synthetic */ Object l(InterfaceC1755c interfaceC1755c, EnumC1768p enumC1768p, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            enumC1768p = EnumC1768p.Main;
        }
        return k(interfaceC1755c, enumC1768p, dVar);
    }
}
