package p143q0;

import A1.h;
import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import L0.i;
import Q0.g;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.U0;
import T0.f;
import W6.n;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.J;
import p037e0.AbstractC2206b;
import p037e0.AbstractC2214j;
import p037e0.C2205a;
import p037e0.InterfaceC2213i;
import p037e0.O;
import p128o1.E;
import p176u1.D;
import p176u1.M;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2213i f31403a = AbstractC2214j.d(AbstractC2214j.e(b.f31418a), null, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31404b = h.m(2);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1582d0 f31405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V f31406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M f31407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ D f31408d;

        /* JADX INFO: renamed from: q0.H$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0671a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f31409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2205a f31410b;

            /* JADX INFO: renamed from: q0.H$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0672a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f31411a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2205a f31412b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0672a(C2205a c2205a, d dVar) {
                    super(2, dVar);
                    this.f31412b = c2205a;
                }

                @Override // I6.a
                public final d create(Object obj, d dVar) {
                    return new C0672a(this.f31412b, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, d dVar) {
                    return ((C0672a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                
                    if (p037e0.C2205a.f(r3, r4, r5, null, null, r11, 12, null) == r0) goto L15;
                 */
                @Override // I6.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objF = c.f();
                    int i8 = this.f31411a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            r.b(obj);
                        } else {
                            if (i8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r.b(obj);
                        }
                        return G.f1419a;
                    }
                    r.b(obj);
                    C2205a c2205a = this.f31412b;
                    Float fC = I6.b.c(1.0f);
                    this.f31411a = 1;
                    if (c2205a.t(fC, this) != objF) {
                    }
                    return objF;
                    C2205a c2205a2 = this.f31412b;
                    Float fC2 = I6.b.c(0.0f);
                    InterfaceC2213i interfaceC2213i = H.f31403a;
                    this.f31411a = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0671a(C2205a c2205a, d dVar) {
                super(2, dVar);
                this.f31410b = c2205a;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new C0671a(this.f31410b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((C0671a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f31409a;
                if (i8 == 0) {
                    r.b(obj);
                    C2812l c2812l = C2812l.f31866a;
                    C0672a c0672a = new C0672a(this.f31410b, null);
                    this.f31409a = 1;
                    if (AbstractC1785g.g(c2812l, c0672a, this) == objF) {
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
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2205a f31413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f31414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ M f31415c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ V f31416d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AbstractC1582d0 f31417e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C2205a c2205a, D d8, M m8, V v8, AbstractC1582d0 abstractC1582d0) {
                super(1);
                this.f31413a = c2205a;
                this.f31414b = d8;
                this.f31415c = m8;
                this.f31416d = v8;
                this.f31417e = abstractC1582d0;
            }

            public final void b(T0.c cVar) {
                Q0.h hVar;
                E eF;
                cVar.v1();
                float fJ = n.j(((Number) this.f31413a.m()).floatValue(), 0.0f, 1.0f);
                if (fJ == 0.0f) {
                    return;
                }
                int iB = this.f31414b.b(p128o1.G.n(this.f31415c.g()));
                X xH = this.f31416d.h();
                if (xH == null || (eF = xH.f()) == null || (hVar = eF.e(iB)) == null) {
                    hVar = new Q0.h(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fE0 = cVar.E0(H.c());
                float f8 = fE0 / 2;
                float fC = n.c(n.f(hVar.i() + f8, Q0.l.i(cVar.d()) - f8), f8);
                f.s0(cVar, this.f31417e, g.a(fC, hVar.l()), g.a(fC, hVar.e()), fE0, 0, null, fJ, null, 0, 432, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((T0.c) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1582d0 abstractC1582d0, V v8, M m8, D d8) {
            super(3);
            this.f31405a = abstractC1582d0;
            this.f31406b = v8;
            this.f31407c = m8;
            this.f31408d = d8;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            i iVarD;
            interfaceC3163l.f(1634330012);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1634330012, i8, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
            }
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = AbstractC2206b.b(1.0f, 0.0f, 2, null);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            C2205a c2205a = (C2205a) objG;
            AbstractC1582d0 abstractC1582d0 = this.f31405a;
            boolean z8 = ((abstractC1582d0 instanceof U0) && ((U0) abstractC1582d0).b() == C1598l0.f9405b.e()) ? false : true;
            if (this.f31406b.d() && p128o1.G.h(this.f31407c.g()) && z8) {
                K.e(this.f31407c.e(), p128o1.G.b(this.f31407c.g()), new C0671a(c2205a, null), interfaceC3163l, 512);
                iVarD = androidx.compose.ui.draw.a.d(iVar, new b(c2205a, this.f31408d, this.f31407c, this.f31406b, this.f31405a));
            } else {
                iVarD = i.f4836a;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarD;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31418a = new b();

        public b() {
            super(1);
        }

        public final void b(O.b bVar) {
            bVar.d(1000);
            Float fValueOf = Float.valueOf(1.0f);
            bVar.f(fValueOf, 0);
            bVar.f(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            bVar.f(fValueOf2, 500);
            bVar.f(fValueOf2, 999);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((O.b) obj);
            return G.f1419a;
        }
    }

    public static final i b(i iVar, V v8, M m8, D d8, AbstractC1582d0 abstractC1582d0, boolean z8) {
        return z8 ? L0.h.b(iVar, null, new a(abstractC1582d0, v8, m8, d8), 1, null) : iVar;
    }

    public static final float c() {
        return f31404b;
    }
}
