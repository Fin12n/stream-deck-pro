package p118n0;

import C6.G;
import C6.r;
import C6.v;
import G6.d;
import H6.c;
import I6.l;
import Q0.h;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p017b7.K;
import p038e1.InterfaceC2247s;
import p047f1.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p118n0.a implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f30491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f30492q = p047f1.i.b(v.a(p118n0.b.a(), this));

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f30494b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2247s f30496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f30497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f30498f;

        /* JADX INFO: renamed from: n0.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0654a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f30499a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f30500b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2247s f30501c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f30502d;

            /* JADX INFO: renamed from: n0.i$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class C0655a extends C2639q implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f30503a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2247s f30504b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f30505c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0655a(i iVar, InterfaceC2247s interfaceC2247s, Function0 function0) {
                    super(0, t.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f30503a = iVar;
                    this.f30504b = interfaceC2247s;
                    this.f30505c = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public final h invoke() {
                    return i.h2(this.f30503a, this.f30504b, this.f30505c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0654a(i iVar, InterfaceC2247s interfaceC2247s, Function0 function0, d dVar) {
                super(2, dVar);
                this.f30500b = iVar;
                this.f30501c = interfaceC2247s;
                this.f30502d = function0;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new C0654a(this.f30500b, this.f30501c, this.f30502d, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((C0654a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f30499a;
                if (i8 == 0) {
                    r.b(obj);
                    g gVarI2 = this.f30500b.i2();
                    C0655a c0655a = new C0655a(this.f30500b, this.f30501c, this.f30502d);
                    this.f30499a = 1;
                    if (gVarI2.n1(c0655a, this) == objF) {
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
            public int f30506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f30507b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f30508c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, Function0 function0, d dVar) {
                super(2, dVar);
                this.f30507b = iVar;
                this.f30508c = function0;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new b(this.f30507b, this.f30508c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f30506a;
                if (i8 == 0) {
                    r.b(obj);
                    c cVarF2 = this.f30507b.f2();
                    InterfaceC2247s interfaceC2247sD2 = this.f30507b.d2();
                    if (interfaceC2247sD2 == null) {
                        return G.f1419a;
                    }
                    Function0 function0 = this.f30508c;
                    this.f30506a = 1;
                    if (cVarF2.o1(interfaceC2247sD2, function0, this) == objF) {
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
        public a(InterfaceC2247s interfaceC2247s, Function0 function0, Function0 function1, d dVar) {
            super(2, dVar);
            this.f30496d = interfaceC2247s;
            this.f30497e = function0;
            this.f30498f = function1;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = i.this.new a(this.f30496d, this.f30497e, this.f30498f, dVar);
            aVar.f30494b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.f30493a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            J j8 = (J) this.f30494b;
            AbstractC1789i.d(j8, null, null, new C0654a(i.this, this.f30496d, this.f30497e, null), 3, null);
            return AbstractC1789i.d(j8, null, null, new b(i.this, this.f30498f, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2247s f30510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f30511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2247s interfaceC2247s, Function0 function0) {
            super(0);
            this.f30510b = interfaceC2247s;
            this.f30511c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVarH2 = i.h2(i.this, this.f30510b, this.f30511c);
            if (hVarH2 != null) {
                return i.this.i2().D0(hVarH2);
            }
            return null;
        }
    }

    public i(g gVar) {
        this.f30491p = gVar;
    }

    public static final h h2(i iVar, InterfaceC2247s interfaceC2247s, Function0 function0) {
        h hVar;
        InterfaceC2247s interfaceC2247sD2 = iVar.d2();
        if (interfaceC2247sD2 == null) {
            return null;
        }
        if (!interfaceC2247s.y()) {
            interfaceC2247s = null;
        }
        if (interfaceC2247s == null || (hVar = (h) function0.invoke()) == null) {
            return null;
        }
        return h.b(interfaceC2247sD2, interfaceC2247s, hVar);
    }

    public final g i2() {
        return this.f30491p;
    }

    @Override // p118n0.c
    public Object o1(InterfaceC2247s interfaceC2247s, Function0 function0, d dVar) {
        Object objF = K.f(new a(interfaceC2247s, function0, new b(interfaceC2247s, function0), null), dVar);
        return objF == c.f() ? objF : G.f1419a;
    }

    @Override // p047f1.h
    public g u0() {
        return this.f30492q;
    }
}
