package p037e0;

import A1.h;
import A1.n;
import A1.r;
import C6.G;
import G6.d;
import H6.c;
import Q0.f;
import Q0.l;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p035d7.g;
import p035d7.j;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: renamed from: e0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f20129a = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f20130b = AbstractC2214j.g(0.0f, 0.0f, h.d(x0.a(h.f432b)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f20131c = AbstractC2214j.g(0.0f, 0.0f, l.c(x0.f(l.f9103b)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f20132d = AbstractC2214j.g(0.0f, 0.0f, f.d(x0.e(f.f9082b)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f20133e = AbstractC2214j.g(0.0f, 0.0f, x0.g(Q0.h.f9087e), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f20134f = AbstractC2214j.g(0.0f, 0.0f, Integer.valueOf(x0.b(s.f28815a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f20135g = AbstractC2214j.g(0.0f, 0.0f, n.b(x0.c(n.f446b)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f20136h = AbstractC2214j.g(0.0f, 0.0f, r.b(x0.d(r.f455b)), 3, null);

    /* JADX INFO: renamed from: e0.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f20137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20138b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, Object obj) {
            super(0);
            this.f20137a = gVar;
            this.f20138b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m190invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m190invoke() {
            this.f20137a.m(this.f20138b);
        }
    }

    /* JADX INFO: renamed from: e0.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f20141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f20142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2205a f20143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q1 f20144f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q1 f20145g;

        /* JADX INFO: renamed from: e0.c$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f20146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f20147b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2205a f20148c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q1 f20149d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q1 f20150e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C2205a c2205a, q1 q1Var, q1 q1Var2, d dVar) {
                super(2, dVar);
                this.f20147b = obj;
                this.f20148c = c2205a;
                this.f20149d = q1Var;
                this.f20150e = q1Var2;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new a(this.f20147b, this.f20148c, this.f20149d, this.f20150e, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objF = c.f();
                int i8 = this.f20146a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    if (!t.c(this.f20147b, this.f20148c.k())) {
                        C2205a c2205a = this.f20148c;
                        Object obj2 = this.f20147b;
                        InterfaceC2213i interfaceC2213iG = AbstractC2207c.g(this.f20149d);
                        this.f20146a = 1;
                        aVar = this;
                        if (C2205a.f(c2205a, obj2, interfaceC2213iG, null, null, aVar, 12, null) == objF) {
                            return objF;
                        }
                    }
                    return G.f1419a;
                }
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                aVar = this;
                k kVarF = AbstractC2207c.f(aVar.f20150e);
                if (kVarF != null) {
                    kVarF.invoke(aVar.f20148c.m());
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, C2205a c2205a, q1 q1Var, q1 q1Var2, d dVar) {
            super(2, dVar);
            this.f20142d = gVar;
            this.f20143e = c2205a;
            this.f20144f = q1Var;
            this.f20145g = q1Var2;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f20142d, this.f20143e, this.f20144f, this.f20145g, dVar);
            bVar.f20141c = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0042  */
        /* JADX WARN: Code duplicated, block: B:16:0x0052  */
        /* JADX WARN: Code duplicated, block: B:17:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:12:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0039
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r11.f20140b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f20139a
                d7.i r1 = (p035d7.i) r1
                java.lang.Object r3 = r11.f20141c
                b7.J r3 = (p017b7.J) r3
                C6.r.b(r12)
                goto L3a
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                C6.r.b(r12)
                java.lang.Object r12 = r11.f20141c
                b7.J r12 = (p017b7.J) r12
                d7.g r1 = r11.f20142d
                d7.i r1 = r1.iterator()
                r3 = r12
            L2d:
                r11.f20141c = r3
                r11.f20139a = r1
                r11.f20140b = r2
                java.lang.Object r12 = r1.a(r11)
                if (r12 != r0) goto L3a
                return r0
            L3a:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L6a
                java.lang.Object r12 = r1.next()
                d7.g r4 = r11.f20142d
                java.lang.Object r4 = r4.g()
                java.lang.Object r4 = p035d7.k.f(r4)
                if (r4 != 0) goto L54
                r6 = r12
                goto L55
            L54:
                r6 = r4
            L55:
                e0.c$b$a r5 = new e0.c$b$a
                e0.a r7 = r11.f20143e
                z0.q1 r8 = r11.f20144f
                z0.q1 r9 = r11.f20145g
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r7 = 3
                r8 = 0
                r4 = 0
                r6 = r5
                r5 = 0
                p017b7.AbstractC1785g.d(r3, r4, r5, r6, r7, r8)
                goto L2d
            L6a:
                C6.G r12 = C6.G.f1419a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p037e0.AbstractC2207c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final q1 c(float f8, InterfaceC2213i interfaceC2213i, String str, k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1407150062);
        if ((i9 & 2) != 0) {
            interfaceC2213i = f20130b;
        }
        InterfaceC2213i interfaceC2213i2 = interfaceC2213i;
        if ((i9 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i9 & 8) != 0) {
            kVar = null;
        }
        k kVar2 = kVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1407150062, i8, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i10 = i8 << 6;
        q1 q1VarE = e(h.d(f8), l0.b(h.f432b), interfaceC2213i2, null, str2, kVar2, interfaceC3163l, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarE;
    }

    public static final q1 d(float f8, InterfaceC2213i interfaceC2213i, float f9, String str, k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(668842840);
        if ((i9 & 2) != 0) {
            interfaceC2213i = f20129a;
        }
        if ((i9 & 4) != 0) {
            f9 = 0.01f;
        }
        if ((i9 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        k kVar2 = (i9 & 16) != 0 ? null : kVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(668842840, i8, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        interfaceC3163l.f(841393662);
        if (interfaceC2213i == f20129a) {
            Float fValueOf = Float.valueOf(f9);
            interfaceC3163l.f(1157296644);
            boolean zR = interfaceC3163l.R(fValueOf);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = AbstractC2214j.g(0.0f, 0.0f, Float.valueOf(f9), 3, null);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            interfaceC2213i = (InterfaceC2213i) objG;
        }
        interfaceC3163l.N();
        Float fValueOf2 = Float.valueOf(f8);
        j0 j0VarI = l0.i(C2635m.f28814a);
        Float fValueOf3 = Float.valueOf(f9);
        int i10 = i8 << 3;
        q1 q1VarE = e(fValueOf2, j0VarI, interfaceC2213i, fValueOf3, str2, kVar2, interfaceC3163l, (i8 & 14) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarE;
    }

    public static final q1 e(Object obj, j0 j0Var, InterfaceC2213i interfaceC2213i, Object obj2, String str, k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        InterfaceC2213i interfaceC2213iF;
        interfaceC3163l.f(-1994373980);
        if ((i9 & 4) != 0) {
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            interfaceC2213iF = (InterfaceC2213i) objG;
        } else {
            interfaceC2213iF = interfaceC2213i;
        }
        Object obj3 = (i9 & 8) != 0 ? null : obj2;
        String str2 = (i9 & 16) != 0 ? "ValueAnimation" : str;
        k kVar2 = (i9 & 32) != 0 ? null : kVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1994373980, i8, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        interfaceC3163l.f(-492369756);
        Object objG2 = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG2 == aVar.a()) {
            objG2 = l1.e(null, null, 2, null);
            interfaceC3163l.H(objG2);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG2;
        interfaceC3163l.f(-492369756);
        Object objG3 = interfaceC3163l.g();
        if (objG3 == aVar.a()) {
            objG3 = new C2205a(obj, j0Var, obj3, str2);
            interfaceC3163l.H(objG3);
        }
        interfaceC3163l.N();
        C2205a c2205a = (C2205a) objG3;
        q1 q1VarP = g1.p(kVar2, interfaceC3163l, (i8 >> 15) & 14);
        if (obj3 != null && (interfaceC2213iF instanceof a0)) {
            a0 a0Var = (a0) interfaceC2213iF;
            if (!t.c(a0Var.h(), obj3)) {
                interfaceC2213iF = AbstractC2214j.f(a0Var.f(), a0Var.g(), obj3);
            }
        }
        q1 q1VarP2 = g1.p(interfaceC2213iF, interfaceC3163l, 0);
        interfaceC3163l.f(-492369756);
        Object objG4 = interfaceC3163l.g();
        if (objG4 == aVar.a()) {
            objG4 = j.b(-1, null, null, 6, null);
            interfaceC3163l.H(objG4);
        }
        interfaceC3163l.N();
        g gVar = (g) objG4;
        K.g(new a(gVar, obj), interfaceC3163l, 0);
        K.d(gVar, new b(gVar, c2205a, q1VarP2, q1VarP, null), interfaceC3163l, 72);
        q1 q1VarG = (q1) interfaceC3164l0.getValue();
        if (q1VarG == null) {
            q1VarG = c2205a.g();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarG;
    }

    public static final k f(q1 q1Var) {
        return (k) q1Var.getValue();
    }

    public static final InterfaceC2213i g(q1 q1Var) {
        return (InterfaceC2213i) q1Var.getValue();
    }
}
