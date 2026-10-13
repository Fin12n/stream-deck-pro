package p143q0;

import C6.G;
import C6.r;
import G6.d;
import G6.h;
import H6.c;
import I6.l;
import L0.i;
import Q0.f;
import Q6.k;
import Q6.p;
import kotlin.jvm.internal.u;
import p011b1.S;
import p017b7.AbstractC1789i;
import p017b7.J;
import p055g0.D;
import p073i0.j;
import p073i0.m;
import p073i0.o;
import p073i0.q;
import p215z0.AbstractC3169o;
import p215z0.C3190z;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f31461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f31462b;

        /* JADX INFO: renamed from: q0.P$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0676a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f31463a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f31464b;

            /* JADX INFO: renamed from: q0.P$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0677a implements H {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f31465a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f31466b;

                public C0677a(InterfaceC3164l0 interfaceC3164l0, m mVar) {
                    this.f31465a = interfaceC3164l0;
                    this.f31466b = mVar;
                }

                @Override // p215z0.H
                public void d() {
                    p073i0.p pVar = (p073i0.p) this.f31465a.getValue();
                    if (pVar != null) {
                        o oVar = new o(pVar);
                        m mVar = this.f31466b;
                        if (mVar != null) {
                            mVar.a(oVar);
                        }
                        this.f31465a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0676a(InterfaceC3164l0 interfaceC3164l0, m mVar) {
                super(1);
                this.f31463a = interfaceC3164l0;
                this.f31464b = mVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final H invoke(I i8) {
                return new C0677a(this.f31463a, this.f31464b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f31467a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f31468b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f31469c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f31470d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f31471e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ q1 f31472f;

            /* JADX INFO: renamed from: q0.P$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0678a extends l implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f31473a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f31474b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ long f31475c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ J f31476d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f31477e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ m f31478f;

                /* JADX INFO: renamed from: q0.P$a$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0679a extends l implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public Object f31479a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f31480b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC3164l0 f31481c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f31482d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ m f31483e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0679a(InterfaceC3164l0 interfaceC3164l0, long j8, m mVar, d dVar) {
                        super(2, dVar);
                        this.f31481c = interfaceC3164l0;
                        this.f31482d = j8;
                        this.f31483e = mVar;
                    }

                    @Override // I6.a
                    public final d create(Object obj, d dVar) {
                        return new C0679a(this.f31481c, this.f31482d, this.f31483e, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(J j8, d dVar) {
                        return ((C0679a) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        InterfaceC3164l0 interfaceC3164l0;
                        InterfaceC3164l0 interfaceC3164l1;
                        p073i0.p pVar;
                        m mVar;
                        p073i0.p pVar2;
                        Object objF = c.f();
                        int i8 = this.f31480b;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                interfaceC3164l1 = (InterfaceC3164l0) this.f31479a;
                                r.b(obj);
                            } else {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                pVar2 = (p073i0.p) this.f31479a;
                                r.b(obj);
                            }
                            pVar = pVar2;
                            this.f31481c.setValue(pVar);
                            return G.f1419a;
                        }
                        r.b(obj);
                        p073i0.p pVar3 = (p073i0.p) this.f31481c.getValue();
                        if (pVar3 == null) {
                            pVar = new p073i0.p(this.f31482d, null);
                            mVar = this.f31483e;
                            if (mVar != null) {
                                this.f31479a = pVar;
                                this.f31480b = 2;
                                if (mVar.b(pVar, this) != objF) {
                                    pVar2 = pVar;
                                    pVar = pVar2;
                                }
                            }
                            this.f31481c.setValue(pVar);
                            return G.f1419a;
                        }
                        m mVar2 = this.f31483e;
                        interfaceC3164l0 = this.f31481c;
                        o oVar = new o(pVar3);
                        if (mVar2 == null) {
                            interfaceC3164l0.setValue(null);
                            pVar = new p073i0.p(this.f31482d, null);
                            mVar = this.f31483e;
                            if (mVar != null) {
                                this.f31479a = pVar;
                                this.f31480b = 2;
                                if (mVar.b(pVar, this) != objF) {
                                    pVar2 = pVar;
                                    pVar = pVar2;
                                }
                            }
                            this.f31481c.setValue(pVar);
                            return G.f1419a;
                        }
                        this.f31479a = interfaceC3164l0;
                        this.f31480b = 1;
                        if (mVar2.b(oVar, this) != objF) {
                            interfaceC3164l1 = interfaceC3164l0;
                        }
                        return objF;
                        interfaceC3164l0 = interfaceC3164l1;
                        interfaceC3164l0.setValue(null);
                        pVar = new p073i0.p(this.f31482d, null);
                        mVar = this.f31483e;
                        if (mVar != null) {
                            this.f31479a = pVar;
                            this.f31480b = 2;
                            if (mVar.b(pVar, this) != objF) {
                                pVar2 = pVar;
                                pVar = pVar2;
                            }
                            return objF;
                        }
                        this.f31481c.setValue(pVar);
                        return G.f1419a;
                    }
                }

                /* JADX INFO: renamed from: q0.P$a$b$a$b, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0680b extends l implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public Object f31484a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f31485b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC3164l0 f31486c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ boolean f31487d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ m f31488e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0680b(InterfaceC3164l0 interfaceC3164l0, boolean z8, m mVar, d dVar) {
                        super(2, dVar);
                        this.f31486c = interfaceC3164l0;
                        this.f31487d = z8;
                        this.f31488e = mVar;
                    }

                    @Override // I6.a
                    public final d create(Object obj, d dVar) {
                        return new C0680b(this.f31486c, this.f31487d, this.f31488e, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(J j8, d dVar) {
                        return ((C0680b) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        InterfaceC3164l0 interfaceC3164l0;
                        InterfaceC3164l0 interfaceC3164l1;
                        Object objF = c.f();
                        int i8 = this.f31485b;
                        if (i8 == 0) {
                            r.b(obj);
                            p073i0.p pVar = (p073i0.p) this.f31486c.getValue();
                            if (pVar != null) {
                                boolean z8 = this.f31487d;
                                m mVar = this.f31488e;
                                interfaceC3164l0 = this.f31486c;
                                j qVar = z8 ? new q(pVar) : new o(pVar);
                                if (mVar != null) {
                                    this.f31484a = interfaceC3164l0;
                                    this.f31485b = 1;
                                    if (mVar.b(qVar, this) == objF) {
                                        return objF;
                                    }
                                    interfaceC3164l1 = interfaceC3164l0;
                                }
                                interfaceC3164l0.setValue(null);
                            }
                            return G.f1419a;
                        }
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3164l1 = (InterfaceC3164l0) this.f31484a;
                        r.b(obj);
                        interfaceC3164l0 = interfaceC3164l1;
                        interfaceC3164l0.setValue(null);
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0678a(J j8, InterfaceC3164l0 interfaceC3164l0, m mVar, d dVar) {
                    super(3, dVar);
                    this.f31476d = j8;
                    this.f31477e = interfaceC3164l0;
                    this.f31478f = mVar;
                }

                public final Object g(D d8, long j8, d dVar) {
                    C0678a c0678a = new C0678a(this.f31476d, this.f31477e, this.f31478f, dVar);
                    c0678a.f31474b = d8;
                    c0678a.f31475c = j8;
                    return c0678a.invokeSuspend(G.f1419a);
                }

                @Override // Q6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return g((D) obj, ((f) obj2).x(), (d) obj3);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = c.f();
                    int i8 = this.f31473a;
                    if (i8 == 0) {
                        r.b(obj);
                        D d8 = (D) this.f31474b;
                        AbstractC1789i.d(this.f31476d, null, null, new C0679a(this.f31477e, this.f31475c, this.f31478f, null), 3, null);
                        this.f31473a = 1;
                        obj = d8.s1(this);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    AbstractC1789i.d(this.f31476d, null, null, new C0680b(this.f31477e, ((Boolean) obj).booleanValue(), this.f31478f, null), 3, null);
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: q0.P$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0681b extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ q1 f31489a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0681b(q1 q1Var) {
                    super(1);
                    this.f31489a = q1Var;
                }

                public final void b(long j8) {
                    ((k) this.f31489a.getValue()).invoke(f.d(j8));
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((f) obj).x());
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(J j8, InterfaceC3164l0 interfaceC3164l0, m mVar, q1 q1Var, d dVar) {
                super(2, dVar);
                this.f31469c = j8;
                this.f31470d = interfaceC3164l0;
                this.f31471e = mVar;
                this.f31472f = q1Var;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                b bVar = new b(this.f31469c, this.f31470d, this.f31471e, this.f31472f, dVar);
                bVar.f31468b = obj;
                return bVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p011b1.I i8, d dVar) {
                return ((b) create(i8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f31467a;
                if (i8 == 0) {
                    r.b(obj);
                    p011b1.I i9 = (p011b1.I) this.f31468b;
                    C0678a c0678a = new C0678a(this.f31469c, this.f31470d, this.f31471e, null);
                    C0681b c0681b = new C0681b(this.f31472f);
                    this.f31467a = 1;
                    if (p055g0.P.h(i9, c0678a, c0681b, this) == objF) {
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
        public a(k kVar, m mVar) {
            super(3);
            this.f31461a = kVar;
            this.f31462b = mVar;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-102778667);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-102778667, i8, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            interfaceC3163l.f(773894976);
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                Object c3190z = new C3190z(K.i(h.f2820a, interfaceC3163l));
                interfaceC3163l.H(c3190z);
                objG = c3190z;
            }
            interfaceC3163l.N();
            J jA = ((C3190z) objG).a();
            interfaceC3163l.N();
            interfaceC3163l.f(-492369756);
            Object objG2 = interfaceC3163l.g();
            if (objG2 == aVar.a()) {
                objG2 = l1.e(null, null, 2, null);
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG2;
            q1 q1VarP = g1.p(this.f31461a, interfaceC3163l, 0);
            m mVar = this.f31462b;
            interfaceC3163l.f(-585649902);
            boolean zR = interfaceC3163l.R(interfaceC3164l0) | interfaceC3163l.R(this.f31462b);
            m mVar2 = this.f31462b;
            Object objG3 = interfaceC3163l.g();
            if (zR || objG3 == aVar.a()) {
                objG3 = new C0676a(interfaceC3164l0, mVar2);
                interfaceC3163l.H(objG3);
            }
            interfaceC3163l.N();
            K.a(mVar, (k) objG3, interfaceC3163l, 0);
            i.a aVar2 = i.f4836a;
            m mVar3 = this.f31462b;
            i iVarC = S.c(aVar2, mVar3, new b(jA, interfaceC3164l0, mVar3, q1VarP, null));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarC;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, m mVar, boolean z8, k kVar) {
        return z8 ? L0.h.b(iVar, null, new a(kVar, mVar), 1, null) : iVar;
    }
}
