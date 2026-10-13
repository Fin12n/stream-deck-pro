package B3;

import C6.G;
import Q6.o;
import Q6.p;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p065h1.I0;
import p082j0.AbstractC2601e;
import p082j0.InterfaceC2608l;
import p191w0.AbstractC3066j;
import p191w0.AbstractC3087u;
import p191w0.P0;
import p191w0.Z;
import p201x2.vAk.kDsnNkYbBsI;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.l1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: B3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0026a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.Appearance f956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.k f957c;

        /* JADX INFO: renamed from: B3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0027a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f958a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0027a(InterfaceC3164l0 interfaceC3164l0) {
                super(0);
                this.f958a = interfaceC3164l0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m14invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m14invoke() {
                a.c(this.f958a, true);
            }
        }

        /* JADX INFO: renamed from: B3.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device.Appearance f959a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(KnownHost.Device.Appearance appearance) {
                super(2);
                this.f959a = appearance;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1577649783, i8, -1, "com.elgato.streamdeck.settings.AppearanceRow.<anonymous>.<anonymous>.<anonymous> (AppearanceRow.kt:44)");
                }
                P0.b(p101l1.f.b(j.d(this.f959a), interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163l, Z.f35787b).a(), interfaceC3163l, 0, 0, 65534);
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

        /* JADX INFO: renamed from: B3.a$a$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f960a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC3164l0 interfaceC3164l0) {
                super(0);
                this.f960a = interfaceC3164l0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m15invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m15invoke() {
                a.c(this.f960a, false);
            }
        }

        /* JADX INFO: renamed from: B3.a$a$d */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Q6.k f961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device.Appearance f962b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f963c;

            /* JADX INFO: renamed from: B3.a$a$d$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0028a extends u implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ KnownHost.Device.Appearance f964a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0028a(KnownHost.Device.Appearance appearance) {
                    super(2);
                    this.f964a = appearance;
                }

                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-898841769, i8, -1, "com.elgato.streamdeck.settings.AppearanceRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppearanceRow.kt:65)");
                    }
                    P0.b(p101l1.f.b(j.d(this.f964a), interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
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

            /* JADX INFO: renamed from: B3.a$a$d$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Q6.k f965a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KnownHost.Device.Appearance f966b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f967c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Q6.k kVar, KnownHost.Device.Appearance appearance, InterfaceC3164l0 interfaceC3164l0) {
                    super(0);
                    this.f965a = kVar;
                    this.f966b = appearance;
                    this.f967c = interfaceC3164l0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m16invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m16invoke() {
                    this.f965a.invoke(this.f966b);
                    a.c(this.f967c, false);
                }
            }

            /* JADX INFO: renamed from: B3.a$a$d$c */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ J6.a f968a = J6.b.a(KnownHost.Device.Appearance.values());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Q6.k kVar, KnownHost.Device.Appearance appearance, InterfaceC3164l0 interfaceC3164l0) {
                super(3);
                this.f961a = kVar;
                this.f962b = appearance;
                this.f963c = interfaceC3164l0;
            }

            public final void b(InterfaceC2608l DropdownMenu, InterfaceC3163l interfaceC3163l, int i8) {
                InterfaceC3163l interfaceC3163l2 = interfaceC3163l;
                t.g(DropdownMenu, "$this$DropdownMenu");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1032866121, i8, -1, "com.elgato.streamdeck.settings.AppearanceRow.<anonymous>.<anonymous>.<anonymous> (AppearanceRow.kt:62)");
                }
                for (KnownHost.Device.Appearance appearance : c.f968a) {
                    interfaceC3163l.f(-1043519338);
                    if (appearance == KnownHost.Device.Appearance.UNRECOGNIZED) {
                        interfaceC3163l.N();
                    } else {
                        H0.a aVarB = H0.c.b(interfaceC3163l, -898841769, true, new C0028a(appearance));
                        interfaceC3163l.f(-1043519027);
                        boolean zR = interfaceC3163l.R(this.f961a) | interfaceC3163l.R(appearance);
                        Q6.k kVar = this.f961a;
                        InterfaceC3164l0 interfaceC3164l0 = this.f963c;
                        Object objG = interfaceC3163l.g();
                        if (zR || objG == InterfaceC3163l.f38803a.a()) {
                            objG = new b(kVar, appearance, interfaceC3164l0);
                            interfaceC3163l.H(objG);
                        }
                        Function0 function0 = (Function0) objG;
                        interfaceC3163l.N();
                        AbstractC3066j.b(aVarB, function0, null, null, appearance != this.f962b ? null : B3.b.f974a.b(), false, null, null, null, interfaceC3163l2, 6, 492);
                        interfaceC3163l.N();
                        interfaceC3163l2 = interfaceC3163l;
                    }
                }
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
        public C0026a(InterfaceC3164l0 interfaceC3164l0, KnownHost.Device.Appearance appearance, Q6.k kVar) {
            super(2);
            this.f955a = interfaceC3164l0;
            this.f956b = appearance;
            this.f957c = kVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            InterfaceC3164l0 interfaceC3164l0;
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2061196062, i8, -1, "com.elgato.streamdeck.settings.AppearanceRow.<anonymous> (AppearanceRow.kt:39)");
            }
            InterfaceC3164l0 interfaceC3164l1 = this.f955a;
            KnownHost.Device.Appearance appearance = this.f956b;
            Q6.k kVar = this.f957c;
            interfaceC3163l.f(733328855);
            L0.i.a aVar = L0.i.f4836a;
            H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163l, 0);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            p pVarB = AbstractC2252x.b(aVar);
            if (interfaceC3163l.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l.r();
            if (interfaceC3163l.m()) {
                interfaceC3163l.w(function0A);
            } else {
                interfaceC3163l.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
            v1.b(interfaceC3163lA, hG, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
            interfaceC3163l.f(1128938849);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar3 = InterfaceC3163l.f38803a;
            if (objG == aVar3.a()) {
                objG = new C0027a(interfaceC3164l1);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            AbstractC3087u.b(false, (Function0) objG, H0.c.b(interfaceC3163l, -1577649783, true, new b(appearance)), I0.a(aVar, "settings_appearance"), false, null, B3.b.f974a.a(), null, null, null, null, null, interfaceC3163l, 1576374, 0, 4016);
            boolean zB = a.b(interfaceC3164l1);
            interfaceC3163l.f(1128939696);
            Object objG2 = interfaceC3163l.g();
            if (objG2 == aVar3.a()) {
                interfaceC3164l0 = interfaceC3164l1;
                objG2 = new c(interfaceC3164l0);
                interfaceC3163l.H(objG2);
            } else {
                interfaceC3164l0 = interfaceC3164l1;
            }
            interfaceC3163l.N();
            AbstractC3066j.a(zB, (Function0) objG2, null, 0L, null, null, H0.c.b(interfaceC3163l, 1032866121, true, new d(kVar, appearance, interfaceC3164l0)), interfaceC3163l, 1572912, 60);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
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
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.Appearance f969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L0.i f971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f973e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KnownHost.Device.Appearance appearance, Q6.k kVar, L0.i iVar, int i8, int i9) {
            super(2);
            this.f969a = appearance;
            this.f970b = kVar;
            this.f971c = iVar;
            this.f972d = i8;
            this.f973e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f969a, this.f970b, this.f971c, interfaceC3163l, F0.a(this.f972d | 1), this.f973e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final boolean b(InterfaceC3164l0 interfaceC3164l0) {
        return ((Boolean) interfaceC3164l0.getValue()).booleanValue();
    }

    public static final void c(InterfaceC3164l0 interfaceC3164l0, boolean z8) {
        interfaceC3164l0.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void a(KnownHost.Device.Appearance selected, Q6.k kVar, L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        L0.i iVar2;
        L0.i iVar3;
        Object objG;
        L0.i iVar4;
        p215z0.P0 p0V;
        t.g(selected, "selected");
        t.g(kVar, kDsnNkYbBsI.CGrRzJdniXxuffa);
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-970136325);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(selected) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.l(kVar) ? 32 : 16;
        }
        int i11 = i9 & 4;
        if (i11 == 0) {
            if ((i8 & 896) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            if ((i10 & 731) == 146 || !interfaceC3163lP.s()) {
                if (i11 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-970136325, i10, -1, "com.elgato.streamdeck.settings.AppearanceRow (AppearanceRow.kt:32)");
                }
                interfaceC3163lP.f(719925329);
                objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = l1.e(Boolean.FALSE, null, 2, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                L0.i iVar5 = iVar3;
                e.a(iVar5, Integer.valueOf(p194w3.b.f37076y1), null, Integer.valueOf(p154r3.h.f32479b0), null, H0.c.b(interfaceC3163lP, -2061196062, true, new C0026a((InterfaceC3164l0) objG, selected, kVar)), false, null, null, interfaceC3163lP, ((i10 >> 6) & 14) | 196608, 468);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar5;
            } else {
                interfaceC3163lP.z();
                iVar4 = iVar2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(selected, kVar, iVar4, i8, i9));
            }
        }
        i10 |= 384;
        iVar2 = iVar;
        if ((i10 & 731) == 146) {
            if (i11 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-970136325, i10, -1, "com.elgato.streamdeck.settings.AppearanceRow (AppearanceRow.kt:32)");
            }
            interfaceC3163lP.f(719925329);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l1.e(Boolean.FALSE, null, 2, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            L0.i iVar6 = iVar3;
            e.a(iVar6, Integer.valueOf(p194w3.b.f37076y1), null, Integer.valueOf(p154r3.h.f32479b0), null, H0.c.b(interfaceC3163lP, -2061196062, true, new C0026a((InterfaceC3164l0) objG, selected, kVar)), false, null, null, interfaceC3163lP, ((i10 >> 6) & 14) | 196608, 468);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar6;
        } else {
            if (i11 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-970136325, i10, -1, "com.elgato.streamdeck.settings.AppearanceRow (AppearanceRow.kt:32)");
            }
            interfaceC3163lP.f(719925329);
            objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l1.e(Boolean.FALSE, null, 2, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            L0.i iVar7 = iVar3;
            e.a(iVar7, Integer.valueOf(p194w3.b.f37076y1), null, Integer.valueOf(p154r3.h.f32479b0), null, H0.c.b(interfaceC3163lP, -2061196062, true, new C0026a((InterfaceC3164l0) objG, selected, kVar)), false, null, null, interfaceC3163lP, ((i10 >> 6) & 14) | 196608, 468);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar7;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(selected, kVar, iVar4, i8, i9));
        }
    }
}
