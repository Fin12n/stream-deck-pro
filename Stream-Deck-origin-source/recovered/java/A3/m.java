package A3;

import C6.G;
import C6.v;
import P2.Lsk.mHPawN;
import R0.C1598l0;
import R0.pkXL.Oitvkwcwn;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p046f0.Z;
import p065h1.I0;
import p082j0.J;
import p191w0.AbstractC3086t0;
import p191w0.B;
import p191w0.F0;
import p211y4.vJ.RaiWHuj;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f666a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m9invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f667a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f668a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p.g f669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l.h f671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f675g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f676h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f677i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p.g gVar, Function0 function0, l.h hVar, boolean z8, InterfaceC3160j0 interfaceC3160j0, Function0 function1, Function0 function2, Function0 function3, long j8) {
            super(3);
            this.f669a = gVar;
            this.f670b = function0;
            this.f671c = hVar;
            this.f672d = z8;
            this.f673e = interfaceC3160j0;
            this.f674f = function1;
            this.f675g = function2;
            this.f676h = function3;
            this.f677i = j8;
        }

        public static final L0.i d(L0.i iVar, J j8) {
            return androidx.compose.foundation.layout.e.h(androidx.compose.foundation.layout.e.h(iVar, j8), J3.m.g(W3.c.f11463a));
        }

        public final void b(J paddingValues, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(paddingValues) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(979155405, i9, -1, "com.elgato.streamdeck.purchase.PurchaseContent.<anonymous> (PurchaseScreen.kt:141)");
            }
            if (!this.f669a.j()) {
                interfaceC3163l.f(717334724);
                c(paddingValues, p194w3.b.f36990U, p194w3.b.f36958J, Integer.valueOf(p154r3.h.f32478b), null, interfaceC3163l, 0, 8);
                interfaceC3163l.N();
            } else if (this.f669a.h()) {
                interfaceC3163l.f(717334985);
                c(paddingValues, p194w3.b.f36994W, p194w3.b.f36964L, null, null, interfaceC3163l, 0, 12);
                interfaceC3163l.N();
            } else if (this.f669a.e() != null) {
                interfaceC3163l.f(717335197);
                c(paddingValues, p194w3.b.f36988T, p194w3.b.f36955I, null, this.f669a.e().getLocalizedMessage(), interfaceC3163l, 0, 4);
                interfaceC3163l.N();
            } else {
                if (this.f669a.d() != null) {
                    interfaceC3163l.f(717335453);
                    interfaceC3163l.f(717335453);
                    if (this.f669a.c() != null) {
                        A3.e eVarD = this.f669a.d();
                        t.e(eVarD, "null cannot be cast to non-null type com.elgato.streamdeck.purchase.ProEntitlement.Product");
                        H3.e.b(m.f(((A3.e.a) eVarD).a() != null, ((A3.e.a) this.f669a.d()).f(), this.f669a.c().d(), ((A3.e.a) this.f669a.d()).c(), ((A3.e.a) this.f669a.d()).h() != null), interfaceC3163l, 8);
                    }
                    interfaceC3163l.N();
                    f.b(this.f669a.d(), this.f669a.c(), paddingValues, this.f670b, interfaceC3163l, (i9 << 6) & 896, 0);
                    interfaceC3163l.N();
                } else if (this.f669a.g().isEmpty()) {
                    interfaceC3163l.f(717336890);
                    interfaceC3163l.N();
                } else {
                    interfaceC3163l.f(717336251);
                    H3.e.b(m.d(), interfaceC3163l, 8);
                    k.c(d(Z.d(androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null), Z.a(0, interfaceC3163l, 0, 1), false, null, false, 14, null), paddingValues), this.f671c, this.f669a.g(), this.f672d, this.f673e, this.f674f, this.f675g, this.f676h, interfaceC3163l, 512, 0);
                    interfaceC3163l.N();
                }
            }
            if (this.f669a.i()) {
                F0.a(androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null), null, this.f677i, 0L, 0.0f, 0.0f, null, A3.c.f515a.a(), interfaceC3163l, 12582918, 122);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((J) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004e  */
        public static final void c(J j8, int i8, int i9, Integer num, String str, InterfaceC3163l interfaceC3163l, int i10, int i11) {
            String str2;
            interfaceC3163l.f(188523229);
            Integer num2 = (i11 & 4) != 0 ? null : num;
            String str3 = (i11 & 8) != 0 ? null : str;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(188523229, i10, -1, "com.elgato.streamdeck.purchase.PurchaseContent.<anonymous>.ErrorDialog (PurchaseScreen.kt:151)");
            }
            String strB = p101l1.f.b(i8, interfaceC3163l, i10 & 14);
            String strB2 = p101l1.f.b(i9, interfaceC3163l, (i10 >> 3) & 14);
            if (str3 != null) {
                str2 = "\n\n" + str3;
                if (str2 == null) {
                    str2 = Oitvkwcwn.bDSMktIFTOjRp;
                }
            } else {
                str2 = Oitvkwcwn.bDSMktIFTOjRp;
            }
            J3.i.b(strB, strB2 + str2, I0.a(androidx.compose.foundation.layout.f.f(d(L0.i.f4836a, j8), 0.0f, 1, null), "error_dialog"), num2, null, null, null, null, null, null, null, interfaceC3163l, (i10 << 3) & 7168, 0, 2032);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.h f678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p.g f679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f685h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f686i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f687j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l.h hVar, p.g gVar, InterfaceC3160j0 interfaceC3160j0, boolean z8, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i8, int i9) {
            super(2);
            this.f678a = hVar;
            this.f679b = gVar;
            this.f680c = interfaceC3160j0;
            this.f681d = z8;
            this.f682e = function0;
            this.f683f = function1;
            this.f684g = function2;
            this.f685h = function3;
            this.f686i = i8;
            this.f687j = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            m.a(this.f678a, this.f679b, this.f680c, this.f681d, this.f682e, this.f683f, this.f684g, this.f685h, interfaceC3163l, p215z0.F0.a(this.f686i | 1), this.f687j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(l.h source, p.g state, InterfaceC3160j0 selectedProductIndex, boolean z8, Function0 function0, Function0 function1, Function0 function2, Function0 function3, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        t.g(source, "source");
        t.g(state, "state");
        t.g(selectedProductIndex, "selectedProductIndex");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-746919298);
        boolean z9 = (i9 & 8) != 0 ? false : z8;
        Function0 function4 = (i9 & 16) != 0 ? a.f666a : function0;
        Function0 function5 = (i9 & 32) != 0 ? b.f667a : function1;
        Function0 function6 = (i9 & 64) != 0 ? c.f668a : function2;
        Function0 function7 = (i9 & 128) != 0 ? null : function3;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-746919298, i8, -1, "com.elgato.streamdeck.purchase.PurchaseContent (PurchaseScreen.kt:135)");
        }
        long jC = J3.m.c(p191w0.Z.f35786a.a(interfaceC3163lP, p191w0.Z.f35787b), interfaceC3163lP, 0);
        boolean z10 = z9;
        AbstractC3086t0.b(null, null, null, null, null, 0, jC, ((C1598l0) interfaceC3163lP.e(B.a())).y(), null, H0.c.b(interfaceC3163lP, 979155405, true, new d(state, function7, source, z9, selectedProductIndex, function4, function5, function6, jC)), interfaceC3163lP, 805306368, 319);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(source, state, selectedProductIndex, z10, function4, function5, function6, function7, i8, i9));
        }
    }

    public static final V3.i d() {
        return V3.d.c(V3.c.f10602a, V3.c.d.PRO_PAYWALL, new C6.o[0]);
    }

    public static final V3.h.a e(l.a aVar) {
        t.g(aVar, RaiWHuj.tZC);
        return new V3.h.a(V3.c.b.PRIVACY_POLICY.b(), new C6.o[]{v.a("screen_name", V3.c.d.PRO_PAYWALL.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.i f(boolean z8, String str, String str2, boolean z9, boolean z10) {
        return V3.d.c(V3.c.f10602a, V3.c.d.f10655m, v.a("has_billing_issue", String.valueOf(z8)), v.a("entitlement_identifier", str), v.a(mHPawN.SEhIOifTvO, str2.toString()), v.a("active_trial", String.valueOf(z9)), v.a("cancelled", String.valueOf(z10)));
    }
}
