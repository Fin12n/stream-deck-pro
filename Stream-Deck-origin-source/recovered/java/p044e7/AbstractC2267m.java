package p044e7;

import C6.G;
import C6.r;
import G6.d;
import I6.l;
import Q6.k;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;
import p017b7.V0;
import p035d7.v;
import p035d7.x;
import p053f7.t;
import p089j7.i;

/* JADX INFO: renamed from: e7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2267m {

    /* JADX INFO: renamed from: e7.m$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f21007a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8) {
            super(1);
            this.f21007a = j8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke(Object obj) {
            return Long.valueOf(this.f21007a);
        }
    }

    /* JADX INFO: renamed from: e7.m$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f21012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f21013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21014g;

        /* JADX INFO: renamed from: e7.m$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f21016b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f21017c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2261g interfaceC2261g, J j8, d dVar) {
                super(1, dVar);
                this.f21016b = interfaceC2261g;
                this.f21017c = j8;
            }

            @Override // I6.a
            public final d create(d dVar) {
                return new a(this.f21016b, this.f21017c, dVar);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d dVar) {
                return ((a) create(dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f21015a;
                if (i8 == 0) {
                    r.b(obj);
                    InterfaceC2261g interfaceC2261g = this.f21016b;
                    p062g7.G g8 = t.f22340a;
                    Object obj2 = this.f21017c.f28779a;
                    if (obj2 == g8) {
                        obj2 = null;
                    }
                    this.f21015a = 1;
                    if (interfaceC2261g.emit(obj2, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                this.f21017c.f28779a = null;
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: e7.m$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0487b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21019b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21020c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ J f21021d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f21022e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0487b(J j8, InterfaceC2261g interfaceC2261g, d dVar) {
                super(2, dVar);
                this.f21021d = j8;
                this.f21022e = interfaceC2261g;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                C0487b c0487b = new C0487b(this.f21021d, this.f21022e, dVar);
                c0487b.f21020c = obj;
                return c0487b;
            }

            public final Object g(Object obj, d dVar) {
                return ((C0487b) create(p035d7.k.b(obj), dVar)).invokeSuspend(G.f1419a);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((p035d7.k) obj).k(), (d) obj2);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                J j8;
                J j9;
                Object objF = H6.c.f();
                int i8 = this.f21019b;
                if (i8 == 0) {
                    r.b(obj);
                    Object objK = ((p035d7.k) this.f21020c).k();
                    j8 = this.f21021d;
                    boolean z8 = objK instanceof d7.k.c;
                    if (!z8) {
                        j8.f28779a = objK;
                    }
                    InterfaceC2261g interfaceC2261g = this.f21022e;
                    if (z8) {
                        Throwable thE = p035d7.k.e(objK);
                        if (thE != null) {
                            throw thE;
                        }
                        Object obj2 = j8.f28779a;
                        if (obj2 != null) {
                            if (obj2 == t.f22340a) {
                                obj2 = null;
                            }
                            this.f21020c = objK;
                            this.f21018a = j8;
                            this.f21019b = 1;
                            if (interfaceC2261g.emit(obj2, this) == objF) {
                                return objF;
                            }
                            j9 = j8;
                        }
                        j8.f28779a = t.f22342c;
                    }
                    return G.f1419a;
                }
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = (J) this.f21018a;
                r.b(obj);
                j8 = j9;
                j8.f28779a = t.f22342c;
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: e7.m$b$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21023a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21024b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f21025c;

            /* JADX INFO: renamed from: e7.m$b$c$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ v f21026a;

                /* JADX INFO: renamed from: e7.m$b$c$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0488a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f21027a;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f21029c;

                    public C0488a(d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f21027a = obj;
                        this.f21029c |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(v vVar) {
                    this.f21026a = vVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, d dVar) {
                    C0488a c0488a;
                    if (dVar instanceof C0488a) {
                        c0488a = (C0488a) dVar;
                        int i8 = c0488a.f21029c;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0488a.f21029c = i8 - Integer.MIN_VALUE;
                        } else {
                            c0488a = new C0488a(dVar);
                        }
                    } else {
                        c0488a = new C0488a(dVar);
                    }
                    Object obj2 = c0488a.f21027a;
                    Object objF = H6.c.f();
                    int i9 = c0488a.f21029c;
                    if (i9 == 0) {
                        r.b(obj2);
                        v vVar = this.f21026a;
                        if (obj == null) {
                            obj = t.f22340a;
                        }
                        c0488a.f21029c = 1;
                        if (vVar.i(obj, c0488a) == objF) {
                            return objF;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC2260f interfaceC2260f, d dVar) {
                super(2, dVar);
                this.f21025c = interfaceC2260f;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                c cVar = new c(this.f21025c, dVar);
                cVar.f21024b = obj;
                return cVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(v vVar, d dVar) {
                return ((c) create(vVar, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f21023a;
                if (i8 == 0) {
                    r.b(obj);
                    v vVar = (v) this.f21024b;
                    InterfaceC2260f interfaceC2260f = this.f21025c;
                    a aVar = new a(vVar);
                    this.f21023a = 1;
                    if (interfaceC2260f.collect(aVar, this) == objF) {
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
        public b(k kVar, InterfaceC2260f interfaceC2260f, d dVar) {
            super(3, dVar);
            this.f21013f = kVar;
            this.f21014g = interfaceC2260f;
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, InterfaceC2261g interfaceC2261g, d dVar) {
            b bVar = new b(this.f21013f, this.f21014g, dVar);
            bVar.f21011d = j8;
            bVar.f21012e = interfaceC2261g;
            return bVar.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
          0x00a4: PHI (r1v3 kotlin.jvm.internal.I) = (r1v5 kotlin.jvm.internal.I), (r1v7 kotlin.jvm.internal.I), (r1v7 kotlin.jvm.internal.I) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r5v3 kotlin.jvm.internal.J) = (r5v5 kotlin.jvm.internal.J), (r5v6 kotlin.jvm.internal.J), (r5v6 kotlin.jvm.internal.J) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r6v2 d7.x) = (r6v4 d7.x), (r6v5 d7.x), (r6v5 d7.x) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 e7.g) = (r7v4 e7.g), (r7v5 e7.g), (r7v5 e7.g) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r7.o(r14) == r0) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            J j8;
            InterfaceC2261g interfaceC2261g;
            x xVar;
            I i8;
            I i9;
            J j9;
            x xVar2;
            InterfaceC2261g interfaceC2261g2;
            i iVar;
            Object obj2;
            p062g7.G g8;
            long jLongValue;
            Object obj3;
            Object objF = H6.c.f();
            int i10 = this.f21010c;
            if (i10 == 0) {
                r.b(obj);
                p017b7.J j10 = (p017b7.J) this.f21011d;
                InterfaceC2261g interfaceC2261g3 = (InterfaceC2261g) this.f21012e;
                x xVarD = p035d7.t.d(j10, null, 0, new c(this.f21014g, null), 3, null);
                j8 = new J();
                interfaceC2261g = interfaceC2261g3;
                xVar = xVarD;
                if (j8.f28779a != t.f22342c) {
                    return G.f1419a;
                }
                i8 = new I();
                obj2 = j8.f28779a;
                if (obj2 != null) {
                    k kVar = this.f21013f;
                    g8 = t.f22340a;
                    if (obj2 == g8) {
                        obj2 = null;
                    }
                    jLongValue = ((Number) kVar.invoke(obj2)).longValue();
                    i8.f28778a = jLongValue;
                    if (jLongValue < 0) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                    if (jLongValue != 0) {
                        i9 = i8;
                        j9 = j8;
                        xVar2 = xVar;
                        interfaceC2261g2 = interfaceC2261g;
                        iVar = new i(getContext());
                        if (j9.f28779a != null) {
                            p089j7.b.a(iVar, i9.f28778a, new a(interfaceC2261g2, j9, null));
                        }
                        iVar.f(xVar2.a(), new C0487b(j9, interfaceC2261g2, null));
                        this.f21011d = interfaceC2261g2;
                        this.f21012e = xVar2;
                        this.f21008a = j9;
                        this.f21009b = null;
                        this.f21010c = 2;
                    } else {
                        obj3 = j8.f28779a;
                        if (obj3 == g8) {
                            obj3 = null;
                        }
                        this.f21011d = interfaceC2261g;
                        this.f21012e = xVar;
                        this.f21008a = j8;
                        this.f21009b = i8;
                        this.f21010c = 1;
                    }
                } else {
                    i9 = i8;
                    j9 = j8;
                    xVar2 = xVar;
                    interfaceC2261g2 = interfaceC2261g;
                    iVar = new i(getContext());
                    if (j9.f28779a != null) {
                        p089j7.b.a(iVar, i9.f28778a, new a(interfaceC2261g2, j9, null));
                    }
                    iVar.f(xVar2.a(), new C0487b(j9, interfaceC2261g2, null));
                    this.f21011d = interfaceC2261g2;
                    this.f21012e = xVar2;
                    this.f21008a = j9;
                    this.f21009b = null;
                    this.f21010c = 2;
                }
                return objF;
            }
            if (i10 == 1) {
                i8 = (I) this.f21009b;
                j8 = (J) this.f21008a;
                xVar = (x) this.f21012e;
                interfaceC2261g = (InterfaceC2261g) this.f21011d;
                r.b(obj);
                j8.f28779a = null;
                i9 = i8;
                j9 = j8;
                xVar2 = xVar;
                interfaceC2261g2 = interfaceC2261g;
                iVar = new i(getContext());
                if (j9.f28779a != null) {
                    p089j7.b.a(iVar, i9.f28778a, new a(interfaceC2261g2, j9, null));
                }
                iVar.f(xVar2.a(), new C0487b(j9, interfaceC2261g2, null));
                this.f21011d = interfaceC2261g2;
                this.f21012e = xVar2;
                this.f21008a = j9;
                this.f21009b = null;
                this.f21010c = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = (J) this.f21008a;
                xVar2 = (x) this.f21012e;
                interfaceC2261g2 = (InterfaceC2261g) this.f21011d;
                r.b(obj);
            }
            interfaceC2261g = interfaceC2261g2;
            xVar = xVar2;
            j8 = j9;
            if (j8.f28779a != t.f22342c) {
                return G.f1419a;
            }
            i8 = new I();
            obj2 = j8.f28779a;
            if (obj2 != null) {
                k kVar2 = this.f21013f;
                g8 = t.f22340a;
                if (obj2 == g8) {
                    obj2 = null;
                }
                jLongValue = ((Number) kVar2.invoke(obj2)).longValue();
                i8.f28778a = jLongValue;
                if (jLongValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (jLongValue != 0) {
                    i9 = i8;
                    j9 = j8;
                    xVar2 = xVar;
                    interfaceC2261g2 = interfaceC2261g;
                    iVar = new i(getContext());
                    if (j9.f28779a != null) {
                        p089j7.b.a(iVar, i9.f28778a, new a(interfaceC2261g2, j9, null));
                    }
                    iVar.f(xVar2.a(), new C0487b(j9, interfaceC2261g2, null));
                    this.f21011d = interfaceC2261g2;
                    this.f21012e = xVar2;
                    this.f21008a = j9;
                    this.f21009b = null;
                    this.f21010c = 2;
                } else {
                    obj3 = j8.f28779a;
                    if (obj3 == g8) {
                        obj3 = null;
                    }
                    this.f21011d = interfaceC2261g;
                    this.f21012e = xVar;
                    this.f21008a = j8;
                    this.f21009b = i8;
                    this.f21010c = 1;
                }
            } else {
                i9 = i8;
                j9 = j8;
                xVar2 = xVar;
                interfaceC2261g2 = interfaceC2261g;
                iVar = new i(getContext());
                if (j9.f28779a != null) {
                    p089j7.b.a(iVar, i9.f28778a, new a(interfaceC2261g2, j9, null));
                }
                iVar.f(xVar2.a(), new C0487b(j9, interfaceC2261g2, null));
                this.f21011d = interfaceC2261g2;
                this.f21012e = xVar2;
                this.f21008a = j9;
                this.f21009b = null;
                this.f21010c = 2;
            }
            return objF;
        }
    }

    /* JADX INFO: renamed from: e7.m$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f21030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f21034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21035f;

        /* JADX INFO: renamed from: e7.m$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21036a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21037b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f21038c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2261g interfaceC2261g, d dVar) {
                super(2, dVar);
                this.f21038c = interfaceC2261g;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                a aVar = new a(this.f21038c, dVar);
                aVar.f21037b = obj;
                return aVar;
            }

            public final Object g(Object obj, d dVar) {
                return ((a) create(p035d7.k.b(obj), dVar)).invokeSuspend(G.f1419a);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((p035d7.k) obj).k(), (d) obj2);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x003c  */
            /* JADX WARN: Code duplicated, block: B:19:0x0042  */
            /* JADX WARN: Code duplicated, block: B:21:0x0048  */
            /* JADX WARN: Code duplicated, block: B:22:0x0049  */
            @Override // I6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objK;
                Object obj2;
                Throwable thE;
                Object objF = H6.c.f();
                int i8 = this.f21036a;
                if (i8 == 0) {
                    r.b(obj);
                    objK = ((p035d7.k) this.f21037b).k();
                    InterfaceC2261g interfaceC2261g = this.f21038c;
                    if (!(objK instanceof d7.k.c)) {
                        this.f21037b = objK;
                        this.f21036a = 1;
                        if (interfaceC2261g.emit(objK, this) == objF) {
                            return objF;
                        }
                        obj2 = objK;
                    }
                    if (objK instanceof d7.k.a) {
                        return I6.b.a(true);
                    }
                    thE = p035d7.k.e(objK);
                    if (thE == null) {
                        return I6.b.a(false);
                    }
                    throw thE;
                }
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f21037b;
                r.b(obj);
                objK = obj2;
                if (objK instanceof d7.k.a) {
                    return I6.b.a(true);
                }
                thE = p035d7.k.e(objK);
                if (thE == null) {
                    return I6.b.a(false);
                }
                throw thE;
            }
        }

        /* JADX INFO: renamed from: e7.m$c$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends l implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f21040b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j8, d dVar) {
                super(1, dVar);
                this.f21040b = j8;
            }

            @Override // I6.a
            public final d create(d dVar) {
                return new b(this.f21040b, dVar);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d dVar) {
                return ((b) create(dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f21039a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                throw new V0("Timed out waiting for " + ((Object) p008a7.a.S(this.f21040b)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, InterfaceC2260f interfaceC2260f, d dVar) {
            super(3, dVar);
            this.f21034e = j8;
            this.f21035f = interfaceC2260f;
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, InterfaceC2261g interfaceC2261g, d dVar) {
            c cVar = new c(this.f21034e, this.f21035f, dVar);
            cVar.f21032c = j8;
            cVar.f21033d = interfaceC2261g;
            return cVar.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r9.f21031b
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f21030a
                java.lang.Object r1 = r9.f21033d
                d7.x r1 = (p035d7.x) r1
                java.lang.Object r6 = r9.f21032c
                e7.g r6 = (p044e7.InterfaceC2261g) r6
                C6.r.b(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                C6.r.b(r10)
                java.lang.Object r10 = r9.f21032c
                b7.J r10 = (p017b7.J) r10
                java.lang.Object r1 = r9.f21033d
                e7.g r1 = (p044e7.InterfaceC2261g) r1
                long r4 = r9.f21034e
                a7.a$a r6 = p008a7.a.f13446b
                long r6 = r6.b()
                int r4 = p008a7.a.m(r4, r6)
                if (r4 <= 0) goto L82
                e7.f r4 = r9.f21035f
                r5 = 0
                r6 = 2
                e7.f r4 = p044e7.AbstractC2262h.d(r4, r5, r3, r6, r3)
                d7.x r10 = p044e7.AbstractC2262h.O(r4, r10)
                long r4 = r9.f21034e
                r6 = r1
                r1 = r10
            L4b:
                j7.i r10 = new j7.i
                G6.g r7 = r9.getContext()
                r10.<init>(r7)
                j7.f r7 = r1.a()
                e7.m$c$a r8 = new e7.m$c$a
                r8.<init>(r6, r3)
                r10.f(r7, r8)
                e7.m$c$b r7 = new e7.m$c$b
                r7.<init>(r4, r3)
                p089j7.b.b(r10, r4, r7)
                r9.f21032c = r6
                r9.f21033d = r1
                r9.f21030a = r4
                r9.f21031b = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                C6.G r10 = C6.G.f1419a
                return r10
            L82:
                b7.V0 r10 = new b7.V0
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p044e7.AbstractC2267m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f, long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? interfaceC2260f : b(interfaceC2260f, new a(j8));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final InterfaceC2260f b(InterfaceC2260f interfaceC2260f, k kVar) {
        return p053f7.o.b(new b(kVar, interfaceC2260f, null));
    }

    public static final InterfaceC2260f c(InterfaceC2260f interfaceC2260f, long j8) {
        return d(interfaceC2260f, j8);
    }

    public static final InterfaceC2260f d(InterfaceC2260f interfaceC2260f, long j8) {
        return p053f7.o.b(new c(j8, interfaceC2260f, null));
    }
}
