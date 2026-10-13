package A3;

import C6.G;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p082j0.J;
import p082j0.X;
import p091k0.v;
import p191w0.AbstractC3085t;
import p191w0.U;
import p191w0.V;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, Object obj) {
            super(2);
            this.f531a = i8;
            this.f532b = obj;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-453907347, i8, -1, "com.elgato.streamdeck.purchase.ListItem.<anonymous> (ProStatusView.kt:146)");
            }
            f.e(this.f531a, this.f532b, interfaceC3163l, 64, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.o f535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f537e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, Object obj, Q6.o oVar, int i9, int i10) {
            super(2);
            this.f533a = i8;
            this.f534b = obj;
            this.f535c = oVar;
            this.f536d = i9;
            this.f537e = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.a(this.f533a, this.f534b, this.f535c, interfaceC3163l, F0.a(this.f536d | 1), this.f537e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A3.g f538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A3.e f539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f540c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A3.g f541a;

            /* JADX INFO: renamed from: A3.f$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0006a extends u implements Q6.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ A3.g f542a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0006a(A3.g gVar) {
                    super(3);
                    this.f542a = gVar;
                }

                public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
                    t.g(Card, "$this$Card");
                    if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(798381409, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:55)");
                    }
                    int i9 = this.f542a.p() ? p194w3.b.f37055r1 : p194w3.b.f37052q1;
                    A3.b bVar = A3.b.f500a;
                    f.a(i9, null, bVar.a(), interfaceC3163l, 384, 2);
                    f.a(p194w3.b.f36983R0, null, bVar.b(), interfaceC3163l, 384, 2);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                }

                @Override // Q6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(A3.g gVar) {
                super(3);
                this.f541a = gVar;
            }

            public final void b(p091k0.b item, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(item, "$this$item");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1110846829, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:54)");
                }
                AbstractC3085t.a(null, null, null, null, null, H0.c.b(interfaceC3163l, 798381409, true, new C0006a(this.f541a)), interfaceC3163l, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((p091k0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A3.g f543a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f544b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ A3.e f545c;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends u implements Q6.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ A3.g f546a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ A3.e f547b;

                /* JADX INFO: renamed from: A3.f$c$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0007a extends u implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ A3.e f548a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ A3.g f549b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0007a(A3.e eVar, A3.g gVar) {
                        super(2);
                        this.f548a = eVar;
                        this.f549b = gVar;
                    }

                    public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                        if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                            interfaceC3163l.z();
                            return;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-411312662, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:68)");
                        }
                        f.c(this.f548a, this.f549b, interfaceC3163l, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                    }

                    @Override // Q6.o
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(A3.g gVar, A3.e eVar) {
                    super(3);
                    this.f546a = gVar;
                    this.f547b = eVar;
                }

                public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
                    t.g(Card, "$this$Card");
                    if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-499569974, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:67)");
                    }
                    f.a(p194w3.b.f36989T0, this.f546a.m(), H0.c.b(interfaceC3163l, -411312662, true, new C0007a(this.f547b, this.f546a)), interfaceC3163l, 384, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                }

                @Override // Q6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: A3.f$c$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0008b extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function0 f550a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0008b(Function0 function0) {
                    super(0);
                    this.f550a = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m0invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m0invoke() {
                    V3.f.b(f.l());
                    this.f550a.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(A3.g gVar, Function0 function0, A3.e eVar) {
                super(3);
                this.f543a = gVar;
                this.f544b = function0;
                this.f545c = eVar;
            }

            public final void b(p091k0.b item, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(item, "$this$item");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1316871300, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:66)");
                }
                AbstractC3085t.a(null, null, null, null, null, H0.c.b(interfaceC3163l, -499569974, true, new a(this.f543a, this.f545c)), interfaceC3163l, 196608, 31);
                L0.i.a aVar = L0.i.f4836a;
                X.a(androidx.compose.foundation.layout.f.i(aVar, W3.c.f11463a.g()), interfaceC3163l, 0);
                if (this.f543a.p() && this.f544b != null) {
                    int i9 = p194w3.b.f36986S0;
                    L0.i iVarH = androidx.compose.foundation.layout.f.h(aVar, 0.0f, 1, null);
                    interfaceC3163l.f(-1196779336);
                    boolean zR = interfaceC3163l.R(this.f544b);
                    Function0 function0 = this.f544b;
                    Object objG = interfaceC3163l.g();
                    if (zR || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C0008b(function0);
                        interfaceC3163l.H(objG);
                    }
                    interfaceC3163l.N();
                    J3.b.a(i9, iVarH, null, null, null, null, false, (Function0) objG, interfaceC3163l, 48, 124);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((p091k0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: A3.f$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0009c extends u implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A3.e f551a;

            /* JADX INFO: renamed from: A3.f$c$c$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends u implements Q6.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ A3.e f552a;

                /* JADX INFO: renamed from: A3.f$c$c$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0010a extends u implements Q6.o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ A3.e f553a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0010a(A3.e eVar) {
                        super(2);
                        this.f553a = eVar;
                    }

                    public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                        if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                            interfaceC3163l.z();
                            return;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-1831184198, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:90)");
                        }
                        if (((A3.e.b) this.f553a).a() != null) {
                            interfaceC3163l.f(193958236);
                            f.d(p194w3.b.f36991U0, f.m(((A3.e.b) this.f553a).a()), interfaceC3163l, 0, 0);
                            interfaceC3163l.N();
                        } else {
                            interfaceC3163l.f(193958468);
                            f.d(p194w3.b.f36993V0, null, interfaceC3163l, 0, 2);
                            interfaceC3163l.N();
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                    }

                    @Override // Q6.o
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(A3.e eVar) {
                    super(3);
                    this.f552a = eVar;
                }

                public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
                    t.g(Card, "$this$Card");
                    if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(716227800, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:87)");
                    }
                    V.a(H0.c.b(interfaceC3163l, -1831184198, true, new C0010a(this.f552a)), null, null, null, null, null, J3.m.b(U.f35700a, interfaceC3163l, U.f35702c), 0.0f, 0.0f, interfaceC3163l, 6, 446);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                }

                @Override // Q6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0009c(A3.e eVar) {
                super(3);
                this.f551a = eVar;
            }

            public final void b(p091k0.b item, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(item, "$this$item");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-101073526, i8, -1, "com.elgato.streamdeck.purchase.ProStatusView.<anonymous>.<anonymous>.<anonymous> (ProStatusView.kt:86)");
                }
                AbstractC3085t.a(null, null, null, null, null, H0.c.b(interfaceC3163l, 716227800, true, new a(this.f551a)), interfaceC3163l, 196608, 31);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((p091k0.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(A3.g gVar, A3.e eVar, Function0 function0) {
            super(1);
            this.f538a = gVar;
            this.f539b = eVar;
            this.f540c = function0;
        }

        public final void b(v LazyColumnForm) {
            t.g(LazyColumnForm, "$this$LazyColumnForm");
            A3.g gVar = this.f538a;
            if (gVar != null) {
                v.c(LazyColumnForm, null, null, H0.c.c(-1110846829, true, new a(gVar)), 3, null);
                v.c(LazyColumnForm, null, null, H0.c.c(-1316871300, true, new b(this.f538a, this.f540c, this.f539b)), 3, null);
            } else {
                A3.e eVar = this.f539b;
                if (eVar instanceof A3.e.b) {
                    v.c(LazyColumnForm, null, null, H0.c.c(-101073526, true, new C0009c(eVar)), 3, null);
                }
            }
            v.c(LazyColumnForm, null, null, A3.b.f500a.c(), 3, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((v) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A3.e f554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A3.g f555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f559f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(A3.e eVar, A3.g gVar, J j8, Function0 function0, int i8, int i9) {
            super(2);
            this.f554a = eVar;
            this.f555b = gVar;
            this.f556c = j8;
            this.f557d = function0;
            this.f558e = i8;
            this.f559f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.b(this.f554a, this.f555b, this.f556c, this.f557d, interfaceC3163l, F0.a(this.f558e | 1), this.f559f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A3.e f560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A3.g f561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(A3.e eVar, A3.g gVar, int i8) {
            super(2);
            this.f560a = eVar;
            this.f561b = gVar;
            this.f562c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.c(this.f560a, this.f561b, interfaceC3163l, F0.a(this.f562c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: A3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0011f extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f566d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011f(int i8, Object obj, int i9, int i10) {
            super(2);
            this.f563a = i8;
            this.f564b = obj;
            this.f565c = i9;
            this.f566d = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.d(this.f563a, this.f564b, interfaceC3163l, F0.a(this.f565c | 1), this.f566d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f570d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i8, Object obj, int i9, int i10) {
            super(2);
            this.f567a = i8;
            this.f568b = obj;
            this.f569c = i9;
            this.f570d = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.e(this.f567a, this.f568b, interfaceC3163l, F0.a(this.f569c | 1), this.f570d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(int i8, Object obj, Q6.o oVar, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        Q6.o oVar2;
        Object obj2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(132879371);
        if ((i10 & 1) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.i(i8) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            if ((i9 & 896) == 0) {
                i11 |= interfaceC3163lP.l(oVar2) ? 256 : 128;
            }
        }
        if (i12 == 2 && (i11 & 731) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            obj2 = obj;
        } else {
            Object obj3 = i12 != 0 ? null : obj;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(132879371, i11, -1, "com.elgato.streamdeck.purchase.ListItem (ProStatusView.kt:144)");
            }
            V.a(H0.c.b(interfaceC3163lP, -453907347, true, new a(i8, obj3)), null, null, oVar2, null, null, J3.m.b(U.f35700a, interfaceC3163lP, U.f35702c), 0.0f, 0.0f, interfaceC3163lP, ((i11 << 3) & 7168) | 6, 438);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            obj2 = obj3;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8, obj2, oVar, i9, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void b(A3.e entitlement, A3.g gVar, J j8, Function0 function0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        J jC;
        int i11;
        Function0 function1;
        int i12;
        Function0 function2;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objG;
        J j9;
        P0 p0V;
        t.g(entitlement, "entitlement");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-486225439);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(entitlement) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(gVar) ? 32 : 16;
        }
        int i13 = i9 & 4;
        if (i13 == 0) {
            if ((i8 & 896) == 0) {
                jC = j8;
                i10 |= interfaceC3163lP.R(jC) ? 256 : 128;
            }
            i11 = i9 & 8;
            if (i11 != 0) {
                if ((i8 & 7168) == 0) {
                    function1 = function0;
                    if (interfaceC3163lP.l(function1)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i10 |= i12;
                }
                if ((i10 & 5851) == 1170 || !interfaceC3163lP.s()) {
                    if (i13 != 0) {
                        jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
                    }
                    if (i11 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
                    }
                    interfaceC3163lP.f(123038563);
                    if ((i10 & 112) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((i10 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z8 | z9 | ((i10 & 7168) == 2048);
                    objG = interfaceC3163lP.g();
                    if (z10 || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new c(gVar, entitlement, function2);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                } else {
                    interfaceC3163lP.z();
                    function2 = function1;
                }
                j9 = jC;
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new d(entitlement, gVar, j9, function2, i8, i9));
                }
            }
            i10 |= 3072;
            function1 = function0;
            if ((i10 & 5851) == 1170) {
                if (i13 != 0) {
                    jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
                }
                if (i11 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
                }
                interfaceC3163lP.f(123038563);
                if ((i10 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i10 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9 | ((i10 & 7168) == 2048);
                objG = interfaceC3163lP.g();
                if (z10) {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                if (i13 != 0) {
                    jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
                }
                if (i11 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
                }
                interfaceC3163lP.f(123038563);
                if ((i10 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i10 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9 | ((i10 & 7168) == 2048);
                objG = interfaceC3163lP.g();
                if (z10) {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }
            j9 = jC;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(entitlement, gVar, j9, function2, i8, i9));
            }
        }
        i10 |= 384;
        jC = j8;
        i11 = i9 & 8;
        if (i11 != 0) {
            if ((i8 & 7168) == 0) {
                function1 = function0;
                if (interfaceC3163lP.l(function1)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i10 |= i12;
            }
            if ((i10 & 5851) == 1170) {
                if (i13 != 0) {
                    jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
                }
                if (i11 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
                }
                interfaceC3163lP.f(123038563);
                if ((i10 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i10 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9 | ((i10 & 7168) == 2048);
                objG = interfaceC3163lP.g();
                if (z10) {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                if (i13 != 0) {
                    jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
                }
                if (i11 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
                }
                interfaceC3163lP.f(123038563);
                if ((i10 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i10 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9 | ((i10 & 7168) == 2048);
                objG = interfaceC3163lP.g();
                if (z10) {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new c(gVar, entitlement, function2);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }
            j9 = jC;
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new d(entitlement, gVar, j9, function2, i8, i9));
            }
        }
        i10 |= 3072;
        function1 = function0;
        if ((i10 & 5851) == 1170) {
            if (i13 != 0) {
                jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
            }
            if (i11 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
            }
            interfaceC3163lP.f(123038563);
            if ((i10 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i10 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z8 | z9 | ((i10 & 7168) == 2048);
            objG = interfaceC3163lP.g();
            if (z10) {
                objG = new c(gVar, entitlement, function2);
                interfaceC3163lP.H(objG);
            } else {
                objG = new c(gVar, entitlement, function2);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        } else {
            if (i13 != 0) {
                jC = androidx.compose.foundation.layout.e.c(0.0f, 0.0f, 3, null);
            }
            if (i11 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-486225439, i10, -1, "com.elgato.streamdeck.purchase.ProStatusView (ProStatusView.kt:50)");
            }
            interfaceC3163lP.f(123038563);
            if ((i10 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i10 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z8 | z9 | ((i10 & 7168) == 2048);
            objG = interfaceC3163lP.g();
            if (z10) {
                objG = new c(gVar, entitlement, function2);
                interfaceC3163lP.H(objG);
            } else {
                objG = new c(gVar, entitlement, function2);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            J3.m.a(null, jC, null, (Q6.k) objG, interfaceC3163lP, (i10 >> 3) & 112, 5);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        j9 = jC;
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(entitlement, gVar, j9, function2, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0202  */
    public static final void c(A3.e eVar, A3.g gVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        String str;
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(475925429);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(eVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.R(gVar) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(475925429, i9, -1, "com.elgato.streamdeck.purchase.ProductInfo (ProStatusView.kt:111)");
            }
            interfaceC3163lP.f(-483455358);
            L0.i.a aVar = L0.i.f4836a;
            H hA = AbstractC2607k.a(C2598b.f27914a.g(), L0.c.f4806a.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            Q6.p pVarB = AbstractC2252x.b(aVar);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hA, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            Q6.o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            if (gVar.p()) {
                str = gVar.a() + "/" + gVar.g();
            } else {
                str = gVar.a() + " " + gVar.g();
            }
            p191w0.P0.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163lP, 0, 0, 131070);
            interfaceC3163lP.f(-1443986385);
            if (eVar instanceof A3.e.a) {
                A3.e.a aVar3 = (A3.e.a) eVar;
                if (aVar3.b() != null && aVar3.i()) {
                    interfaceC3163lP.f(-209408300);
                    d(p194w3.b.f36995W0, m(aVar3.b()), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.N();
                } else if (aVar3.b() != null) {
                    interfaceC3163lP.f(-209408112);
                    d(p194w3.b.f36977P0, m(aVar3.b()), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.N();
                } else {
                    interfaceC3163lP.f(-209407981);
                    interfaceC3163lP.N();
                }
                if (aVar3.a() != null) {
                    interfaceC3163l2 = interfaceC3163lP;
                    p191w0.P0.b(p101l1.f.b(p194w3.b.f36974O0, interfaceC3163lP, 0), null, Z.f35786a.a(interfaceC3163lP, Z.f35787b).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l2, 0, 0, 131066);
                } else {
                    interfaceC3163l2 = interfaceC3163lP;
                }
            } else {
                interfaceC3163l2 = interfaceC3163lP;
            }
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new e(eVar, gVar, i8));
        }
    }

    public static final void d(int i8, Object obj, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        InterfaceC3163l interfaceC3163l2;
        Object obj2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-379789733);
        if ((i10 & 1) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.i(i8) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 16;
        }
        if (i12 == 2 && (i11 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            obj2 = obj;
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            Object obj3 = i12 != 0 ? null : obj;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-379789733, i11, -1, "com.elgato.streamdeck.purchase.Text (ProStatusView.kt:157)");
            }
            interfaceC3163lP.f(-1401643873);
            String strC = obj3 != null ? p101l1.f.c(i8, new Object[]{obj3}, interfaceC3163lP, (i11 & 14) | 64) : null;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1401643885);
            if (strC == null) {
                strC = p101l1.f.b(i8, interfaceC3163lP, i11 & 14);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            p191w0.P0.b(strC, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l2, 0, 0, 131070);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            obj2 = obj3;
        }
        P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new C0011f(i8, obj2, i9, i10));
        }
    }

    public static final void e(int i8, Object obj, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        int i11;
        InterfaceC3163l interfaceC3163l2;
        Object obj2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1230875990);
        if ((i10 & 1) != 0) {
            i11 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i11 = (interfaceC3163lP.i(i8) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 16;
        }
        if (i12 == 2 && (i11 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            obj2 = obj;
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            Object obj3 = i12 != 0 ? null : obj;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1230875990, i11, -1, "com.elgato.streamdeck.purchase.Title (ProStatusView.kt:151)");
            }
            interfaceC3163lP.f(-497883796);
            String strC = obj3 != null ? p101l1.f.c(i8, new Object[]{obj3}, interfaceC3163lP, (i11 & 14) | 64) : null;
            interfaceC3163lP.N();
            interfaceC3163lP.f(-497883808);
            if (strC == null) {
                strC = p101l1.f.b(i8, interfaceC3163lP, i11 & 14);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            p191w0.P0.b(strC, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).n(), interfaceC3163l2, 0, 0, 65534);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            obj2 = obj3;
        }
        P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new g(i8, obj2, i9, i10));
        }
    }

    public static final V3.h.a l() {
        return new V3.h.a(V3.c.b.f10610H.b(), new C6.o[]{C6.v.a("screen_name", V3.c.d.f10655m.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final String m(Date date) {
        String str = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        t.f(str, "format(...)");
        return str;
    }
}
