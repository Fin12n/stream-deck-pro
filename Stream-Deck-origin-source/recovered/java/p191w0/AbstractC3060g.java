package p191w0;

import C6.r;
import D6.M;
import G6.d;
import I6.l;
import Q6.k;
import Q6.o;
import Q6.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.K;
import p017b7.L;
import p037e0.InterfaceC2213i;
import p037e0.d0;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p215z0.g1;

/* JADX INFO: renamed from: w0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3060g {

    /* JADX INFO: renamed from: w0.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f35866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f35867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f35868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C3062h f35869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f35870f;

        /* JADX INFO: renamed from: w0.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0797a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3056e f35871a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ G f35872b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0797a(InterfaceC3056e interfaceC3056e, G g8) {
                super(2);
                this.f35871a = interfaceC3056e;
                this.f35872b = g8;
            }

            public final void b(float f8, float f9) {
                this.f35871a.a(f8, f9);
                this.f35872b.f28776a = f8;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C6.G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3062h c3062h, float f8, d dVar) {
            super(4, dVar);
            this.f35869e = c3062h;
            this.f35870f = f8;
        }

        @Override // Q6.q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object i(InterfaceC3056e interfaceC3056e, D d8, Object obj, d dVar) {
            a aVar = new a(this.f35869e, this.f35870f, dVar);
            aVar.f35866b = interfaceC3056e;
            aVar.f35867c = d8;
            aVar.f35868d = obj;
            return aVar.invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f35865a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC3056e interfaceC3056e = (InterfaceC3056e) this.f35866b;
                float fD = ((D) this.f35867c).d(this.f35868d);
                if (!Float.isNaN(fD)) {
                    G g8 = new G();
                    float fW = Float.isNaN(this.f35869e.w()) ? 0.0f : this.f35869e.w();
                    g8.f28776a = fW;
                    float f8 = this.f35870f;
                    InterfaceC2213i interfaceC2213iP = this.f35869e.p();
                    C0797a c0797a = new C0797a(interfaceC3056e, g8);
                    this.f35866b = null;
                    this.f35867c = null;
                    this.f35865a = 1;
                    if (d0.b(fW, fD, f8, interfaceC2213iP, c0797a, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.g$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f35873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35874b;

        public b(d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f35873a = obj;
            this.f35874b |= Integer.MIN_VALUE;
            return AbstractC3060g.g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: w0.g$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f35876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f35877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f35878d;

        /* JADX INFO: renamed from: w0.g$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f35879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p017b7.J f35880b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f35881c;

            /* JADX INFO: renamed from: w0.g$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0798a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f35882a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f35883b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Object f35884c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ p017b7.J f35885d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0798a(o oVar, Object obj, p017b7.J j8, d dVar) {
                    super(2, dVar);
                    this.f35883b = oVar;
                    this.f35884c = obj;
                    this.f35885d = j8;
                }

                @Override // I6.a
                public final d create(Object obj, d dVar) {
                    return new C0798a(this.f35883b, this.f35884c, this.f35885d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(p017b7.J j8, d dVar) {
                    return ((C0798a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f35882a;
                    if (i8 == 0) {
                        r.b(obj);
                        o oVar = this.f35883b;
                        Object obj2 = this.f35884c;
                        this.f35882a = 1;
                        if (oVar.invoke(obj2, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    K.d(this.f35885d, new C3054d());
                    return C6.G.f1419a;
                }
            }

            /* JADX INFO: renamed from: w0.g$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f35886a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f35887b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f35888c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f35889d;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public int f35891f;

                public b(d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f35889d = obj;
                    this.f35891f |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(J j8, p017b7.J j9, o oVar) {
                this.f35879a = j8;
                this.f35880b = j9;
                this.f35881c = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, d dVar) {
                b bVar;
                a aVar;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i8 = bVar.f35891f;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        bVar.f35891f = i8 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(dVar);
                    }
                } else {
                    bVar = new b(dVar);
                }
                Object obj2 = bVar.f35889d;
                Object objF = H6.c.f();
                int i9 = bVar.f35891f;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) this.f35879a.f28779a;
                    if (interfaceC1815v0 != null) {
                        interfaceC1815v0.z(new C3054d());
                        bVar.f35886a = this;
                        bVar.f35887b = obj;
                        bVar.f35888c = interfaceC1815v0;
                        bVar.f35891f = 1;
                        if (interfaceC1815v0.i0(bVar) == objF) {
                            return objF;
                        }
                    }
                    aVar = this;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f35887b;
                    aVar = (a) bVar.f35886a;
                    r.b(obj2);
                }
                J j8 = aVar.f35879a;
                p017b7.J j9 = aVar.f35880b;
                j8.f28779a = AbstractC1789i.d(j9, null, L.UNDISPATCHED, new C0798a(aVar.f35881c, obj, j9, null), 1, null);
                return C6.G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, o oVar, d dVar) {
            super(2, dVar);
            this.f35877c = function0;
            this.f35878d = oVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            c cVar = new c(this.f35877c, this.f35878d, dVar);
            cVar.f35876b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f35875a;
            if (i8 == 0) {
                r.b(obj);
                p017b7.J j8 = (p017b7.J) this.f35876b;
                J j9 = new J();
                InterfaceC2260f interfaceC2260fQ = g1.q(this.f35877c);
                a aVar = new a(j9, j8, this.f35878d);
                this.f35875a = 1;
                if (interfaceC2260fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    public static final D a(k kVar) {
        E e8 = new E();
        kVar.invoke(e8);
        return new X(e8.b());
    }

    public static final Object d(C3062h c3062h, Object obj, float f8, d dVar) throws Throwable {
        Object objK = C3062h.k(c3062h, obj, null, new a(c3062h, f8, null), dVar, 2, null);
        return objK == H6.c.f() ? objK : C6.G.f1419a;
    }

    public static /* synthetic */ Object e(C3062h c3062h, Object obj, float f8, d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            f8 = c3062h.v();
        }
        return d(c3062h, obj, f8, dVar);
    }

    public static final X f() {
        return new X(M.g());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(Function0 function0, o oVar, d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f35874b;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f35874b = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f35873a;
        Object objF = H6.c.f();
        int i9 = bVar.f35874b;
        try {
            if (i9 == 0) {
                r.b(obj);
                c cVar = new c(function0, oVar, null);
                bVar.f35874b = 1;
                if (K.f(cVar, bVar) == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
        } catch (C3054d unused) {
        }
        return C6.G.f1419a;
    }
}
