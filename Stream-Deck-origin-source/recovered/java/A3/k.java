package A3;

import C6.G;
import C6.v;
import D6.z;
import I0.mIk.efuWFSeiT;
import R0.AbstractC1582d0;
import R0.C1598l0;
import android.content.res.Configuration;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.xmlpull.v1.XmlPullParserException;
import p028d0.AbstractC2203e;
import p028d0.InterfaceC2204f;
import p038e1.AbstractC2252x;
import p038e1.H;
import p038e1.InterfaceC2235f;
import p046f0.D;
import p056g1.InterfaceC2343g;
import p065h1.I0;
import p082j0.AbstractC2601e;
import p082j0.AbstractC2607k;
import p082j0.C2598b;
import p082j0.C2609m;
import p082j0.InterfaceC2608l;
import p082j0.S;
import p082j0.T;
import p082j0.U;
import p082j0.X;
import p110m1.x;
import p128o1.I;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.l1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L0.i f601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f603e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, int i9, L0.i iVar, int i10, int i11) {
            super(2);
            this.f599a = i8;
            this.f600b = i9;
            this.f601c = iVar;
            this.f602d = i10;
            this.f603e = i11;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws XmlPullParserException, IOException {
            k.a(this.f599a, this.f600b, this.f601c, interfaceC3163l, F0.a(this.f602d | 1), this.f603e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f604a = new b();

        public b() {
            super(1);
        }

        public final Integer b(int i8) {
            return Integer.valueOf(i8 / 2);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f605a = new c();

        public c() {
            super(1);
        }

        public final Integer b(int i8) {
            return Integer.valueOf(i8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f607b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A3.g f608a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(A3.g gVar) {
                super(1);
                this.f608a = gVar;
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
                p110m1.u.X(semantics, I3.d.f3774a.a(this.f608a));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3160j0 f609a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f610b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC3160j0 interfaceC3160j0, int i8) {
                super(0);
                this.f609a = interfaceC3160j0;
                this.f610b = i8;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1invoke() {
                this.f609a.p(this.f610b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, InterfaceC3160j0 interfaceC3160j0) {
            super(3);
            this.f606a = list;
            this.f607b = interfaceC3160j0;
        }

        public final void b(InterfaceC2204f AnimatedVisibility, InterfaceC3163l interfaceC3163l, int i8) {
            InterfaceC3163l interfaceC3163l2 = interfaceC3163l;
            t.g(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1199831742, i8, -1, "com.elgato.streamdeck.purchase.BenefitsPlansBox.<anonymous>.<anonymous> (ProductsView.kt:218)");
            }
            L0.i iVarH = androidx.compose.foundation.layout.f.h(L0.i.f4836a, 0.0f, 1, null);
            W3.c cVar = W3.c.f11463a;
            L0.i iVarM = androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.e.k(iVarH, cVar.h(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, cVar.j(), 7, null);
            C2598b.e eVarN = C2598b.f27914a.n(cVar.h());
            L0.c.InterfaceC0174c interfaceC0174cA = L0.c.f4806a.a();
            List<A3.g> list = this.f606a;
            InterfaceC3160j0 interfaceC3160j0 = this.f607b;
            interfaceC3163l2.f(693286680);
            H hA = S.a(eVarN, interfaceC0174cA, interfaceC3163l2, 48);
            interfaceC3163l2.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l2, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l2.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            Q6.p pVarB = AbstractC2252x.b(iVarM);
            if (interfaceC3163l2.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163l2.r();
            if (interfaceC3163l2.m()) {
                interfaceC3163l2.w(function0A);
            } else {
                interfaceC3163l2.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l2);
            v1.b(interfaceC3163lA, hA, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            Q6.o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l2)), interfaceC3163l2, 0);
            interfaceC3163l2.f(2058660585);
            U u8 = U.f27892a;
            interfaceC3163l2.f(-59955608);
            int i9 = 0;
            for (A3.g gVar : list) {
                int i10 = i9 + 1;
                boolean z8 = interfaceC3160j0.f() == i9;
                L0.i iVarB = T.b(u8, L0.i.f4836a, 1.0f, false, 2, null);
                interfaceC3163l2.f(1399403977);
                boolean zR = interfaceC3163l2.R(gVar);
                Object objG = interfaceC3163l2.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new a(gVar);
                    interfaceC3163l2.H(objG);
                }
                interfaceC3163l2.N();
                L0.i iVarD = p110m1.n.d(iVarB, false, (Q6.k) objG, 1, null);
                interfaceC3163l2.f(1399404061);
                boolean zR2 = interfaceC3163l2.R(interfaceC3160j0) | interfaceC3163l2.i(i9);
                Object objG2 = interfaceC3163l2.g();
                if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
                    objG2 = new b(interfaceC3160j0, i9);
                    interfaceC3163l2.H(objG2);
                }
                interfaceC3163l2.N();
                A3.j.a(gVar, z8, iVarD, (Function0) objG2, interfaceC3163l2, 0);
                interfaceC3163l2 = interfaceC3163l;
                i9 = i10;
            }
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((InterfaceC2204f) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f611a = new e();

        public e() {
            super(1);
        }

        public final Integer b(int i8) {
            return Integer.valueOf(-i8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.focus.g f613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f615d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f616a = new a();

            public a() {
                super(1);
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f617a = new b();

            public b() {
                super(1);
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f618a = new c();

            public c() {
                super(1);
            }

            public final void b(x semantics) {
                t.g(semantics, "$this$semantics");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, androidx.compose.ui.focus.g gVar, List list, InterfaceC3160j0 interfaceC3160j0) {
            super(3);
            this.f612a = z8;
            this.f613b = gVar;
            this.f614c = list;
            this.f615d = interfaceC3160j0;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
            b((InterfaceC2204f) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }

        public final void b(InterfaceC2204f interfaceC2204f, InterfaceC3163l interfaceC3163l, int i8) throws XmlPullParserException, IOException {
            t.g(interfaceC2204f, efuWFSeiT.lfSAaQHdltICo);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(659170037, i8, -1, "com.elgato.streamdeck.purchase.BenefitsPlansBox.<anonymous>.<anonymous> (ProductsView.kt:245)");
            }
            L0.i.a aVar = L0.i.f4836a;
            W3.c cVar = W3.c.f11463a;
            L0.i iVarJ = androidx.compose.foundation.layout.e.j(aVar, cVar.l(), cVar.j());
            L0.c.b bVarF = L0.c.f4806a.f();
            C2598b.e eVarN = C2598b.f27914a.n(cVar.h());
            androidx.compose.ui.focus.g gVar = this.f613b;
            List list = this.f614c;
            InterfaceC3160j0 interfaceC3160j0 = this.f615d;
            interfaceC3163l.f(-483455358);
            H hA = AbstractC2607k.a(eVarN, bVarF, interfaceC3163l, 48);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            Q6.p pVarB = AbstractC2252x.b(iVarJ);
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
            v1.b(interfaceC3163lA, hA, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            Q6.o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            C2609m c2609m = C2609m.f28036a;
            k.a(p154r3.h.f32470U, p194w3.b.f36935B0, K3.c.a(p110m1.n.c(FocusableKt.b(androidx.compose.ui.focus.h.a(aVar, gVar), false, null, 3, null), true, a.f616a), p194w3.b.f36944E0, interfaceC3163l, 0), interfaceC3163l, 0, 0);
            k.a(p154r3.h.f32487f0, p194w3.b.f36938C0, K3.c.a(p110m1.n.c(aVar, true, b.f617a), p194w3.b.f36944E0, interfaceC3163l, 0), interfaceC3163l, 0, 0);
            k.a(p154r3.h.f32474Y, p194w3.b.f36941D0, K3.c.a(p110m1.n.c(aVar, true, c.f618a), p194w3.b.f36944E0, interfaceC3163l, 0), interfaceC3163l, 0, 0);
            P0.b(((A3.g) list.get(interfaceC3160j0.f())).f(), androidx.compose.foundation.layout.e.k(aVar, 0.0f, cVar.j(), 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(p216z1.j.f39010b.a()), 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163l, Z.f35787b).b(), interfaceC3163l, 0, 0, 65020);
            interfaceC3163l.N();
            interfaceC3163l.O();
            interfaceC3163l.N();
            interfaceC3163l.N();
            interfaceC3163l.f(-59953112);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = l1.e(Boolean.FALSE, null, 2, null);
                interfaceC3163l.H(objG);
            }
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
            interfaceC3163l.N();
            if (!this.f612a && interfaceC2204f.a().h() == interfaceC2204f.a().n()) {
                if (((Boolean) interfaceC3164l0.getValue()).booleanValue()) {
                    this.f613b.e();
                }
                interfaceC3164l0.setValue(Boolean.TRUE);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0.i f622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f624f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z8, List list, InterfaceC3160j0 interfaceC3160j0, L0.i iVar, int i8, int i9) {
            super(2);
            this.f619a = z8;
            this.f620b = list;
            this.f621c = interfaceC3160j0;
            this.f622d = iVar;
            this.f623e = i8;
            this.f624f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.b(this.f619a, this.f620b, this.f621c, this.f622d, interfaceC3163l, F0.a(this.f623e | 1), this.f624f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f625a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f626a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f627a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m4invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke() {
        }
    }

    /* JADX INFO: renamed from: A3.k$k, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0012k extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0012k(InterfaceC3164l0 interfaceC3164l0) {
            super(0);
            this.f628a = interfaceC3164l0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            V3.f.b(k.d(this.f628a) ? k.n() : k.o());
            InterfaceC3164l0 interfaceC3164l0 = this.f628a;
            k.e(interfaceC3164l0, true ^ k.d(interfaceC3164l0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A3.l.h f630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f634f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Function0 f635g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Function0 f636h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f637i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f638j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(L0.i iVar, A3.l.h hVar, List list, boolean z8, InterfaceC3160j0 interfaceC3160j0, Function0 function0, Function0 function1, Function0 function2, int i8, int i9) {
            super(2);
            this.f629a = iVar;
            this.f630b = hVar;
            this.f631c = list;
            this.f632d = z8;
            this.f633e = interfaceC3160j0;
            this.f634f = function0;
            this.f635g = function1;
            this.f636h = function2;
            this.f637i = i8;
            this.f638j = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.c(this.f629a, this.f630b, this.f631c, this.f632d, this.f633e, this.f634f, this.f635g, this.f636h, interfaceC3163l, F0.a(this.f637i | 1), this.f638j);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f639a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z8) {
            super(0);
            this.f639a = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3164l0 invoke() {
            return l1.e(Boolean.valueOf(this.f639a), null, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f640a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j8) {
            super(1);
            this.f640a = j8;
        }

        public final void b(T0.c drawWithContent) {
            t.g(drawWithContent, "$this$drawWithContent");
            AbstractC1582d0 abstractC1582d0C = AbstractC1582d0.a.c(AbstractC1582d0.f9393b, D6.r.q(C1598l0.g(C1598l0.f9405b.d()), C1598l0.g(this.f640a)), 0.0f, 0.0f, 0, 14, null);
            drawWithContent.v1();
            T0.f.q0(drawWithContent, abstractC1582d0C, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f641a = new o();

        public o() {
            super(1);
        }

        public final void b(x semantics) {
            t.g(semantics, "$this$semantics");
            p110m1.u.q(semantics);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f642a = new p();

        public p() {
            super(1);
        }

        public final void b(x semantics) {
            t.g(semantics, "$this$semantics");
            p110m1.u.q(semantics);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A3.l.h f643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f646d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(A3.l.h hVar, L0.i iVar, int i8, int i9) {
            super(2);
            this.f643a = hVar;
            this.f644b = iVar;
            this.f645c = i8;
            this.f646d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.f(this.f643a, this.f644b, interfaceC3163l, F0.a(this.f645c | 1), this.f646d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f647a;

        static {
            int[] iArr = new int[A3.l.h.values().length];
            try {
                iArr[A3.l.h.Keypad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[A3.l.h.Faceplate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f647a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(int i8, int i9, L0.i iVar, InterfaceC3163l interfaceC3163l, int i10, int i11) throws XmlPullParserException, IOException {
        int i12;
        int i13;
        L0.i iVar2;
        L0.i iVar3;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        Q6.o oVarB;
        InterfaceC3163l interfaceC3163l2;
        L0.i iVar4;
        p215z0.P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-392249376);
        if ((i11 & 1) != 0) {
            i13 = i10 | 6;
            i12 = i8;
        } else if ((i10 & 14) == 0) {
            i12 = i8;
            i13 = (interfaceC3163lP.i(i12) ? 4 : 2) | i10;
        } else {
            i12 = i8;
            i13 = i10;
        }
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= interfaceC3163lP.i(i9) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                iVar2 = iVar;
                i13 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            if ((i13 & 731) == 146 || !interfaceC3163lP.s()) {
                if (i14 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-392249376, i13, -1, "com.elgato.streamdeck.purchase.BenefitRow (ProductsView.kt:295)");
                }
                L0.i iVarH = androidx.compose.foundation.layout.f.h(iVar3, 0.0f, 1, null);
                L0.c.InterfaceC0174c interfaceC0174cG = L0.c.f4806a.g();
                interfaceC3163lP.f(693286680);
                H hA = S.a(C2598b.f27914a.f(), interfaceC0174cG, interfaceC3163lP, 48);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
                function0A = aVar.a();
                Q6.p pVarB = AbstractC2252x.b(iVarH);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A);
                } else {
                    interfaceC3163lP.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA, hA, aVar.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
                oVarB = aVar.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                U u8 = U.f27892a;
                J3.e.a(i12, null, null, interfaceC3163lP, i13 & 14, 6);
                X.a(androidx.compose.foundation.layout.f.p(L0.i.f4836a, W3.c.f11463a.h()), interfaceC3163lP, 0);
                interfaceC3163l2 = interfaceC3163lP;
                L0.i iVar5 = iVar3;
                P0.b(p101l1.f.b(i9, interfaceC3163lP, (i13 >> 3) & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).a(), interfaceC3163l2, 0, 0, 65534);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar4 = iVar5;
            } else {
                interfaceC3163lP.z();
                iVar4 = iVar2;
                interfaceC3163l2 = interfaceC3163lP;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new a(i8, i9, iVar4, i10, i11));
            }
        }
        i13 |= 384;
        iVar2 = iVar;
        if ((i13 & 731) == 146) {
            if (i14 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-392249376, i13, -1, "com.elgato.streamdeck.purchase.BenefitRow (ProductsView.kt:295)");
            }
            L0.i iVarH2 = androidx.compose.foundation.layout.f.h(iVar3, 0.0f, 1, null);
            L0.c.InterfaceC0174c interfaceC0174cG2 = L0.c.f4806a.g();
            interfaceC3163lP.f(693286680);
            H hA2 = S.a(C2598b.f27914a.f(), interfaceC0174cG2, interfaceC3163lP, 48);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            function0A = aVar2.a();
            Q6.p pVarB2 = AbstractC2252x.b(iVarH2);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hA2, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE2, aVar2.e());
            oVarB = aVar2.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            U u9 = U.f27892a;
            J3.e.a(i12, null, null, interfaceC3163lP, i13 & 14, 6);
            X.a(androidx.compose.foundation.layout.f.p(L0.i.f4836a, W3.c.f11463a.h()), interfaceC3163lP, 0);
            interfaceC3163l2 = interfaceC3163lP;
            L0.i iVar6 = iVar3;
            P0.b(p101l1.f.b(i9, interfaceC3163lP, (i13 >> 3) & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).a(), interfaceC3163l2, 0, 0, 65534);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar6;
        } else {
            if (i14 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-392249376, i13, -1, "com.elgato.streamdeck.purchase.BenefitRow (ProductsView.kt:295)");
            }
            L0.i iVarH3 = androidx.compose.foundation.layout.f.h(iVar3, 0.0f, 1, null);
            L0.c.InterfaceC0174c interfaceC0174cG3 = L0.c.f4806a.g();
            interfaceC3163lP.f(693286680);
            H hA3 = S.a(C2598b.f27914a.f(), interfaceC0174cG3, interfaceC3163lP, 48);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            function0A = aVar3.a();
            Q6.p pVarB3 = AbstractC2252x.b(iVarH3);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hA3, aVar3.c());
            v1.b(interfaceC3163lA, interfaceC3184wE3, aVar3.e());
            oVarB = aVar3.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            U u10 = U.f27892a;
            J3.e.a(i12, null, null, interfaceC3163lP, i13 & 14, 6);
            X.a(androidx.compose.foundation.layout.f.p(L0.i.f4836a, W3.c.f11463a.h()), interfaceC3163lP, 0);
            interfaceC3163l2 = interfaceC3163lP;
            L0.i iVar7 = iVar3;
            P0.b(p101l1.f.b(i9, interfaceC3163lP, (i13 >> 3) & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Z.f35786a.c(interfaceC3163lP, Z.f35787b).a(), interfaceC3163l2, 0, 0, 65534);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar4 = iVar7;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new a(i8, i9, iVar4, i10, i11));
        }
    }

    public static final void b(boolean z8, List list, InterfaceC3160j0 interfaceC3160j0, L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(85193568);
        L0.i iVar2 = (i9 & 8) != 0 ? L0.i.f4836a : iVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(85193568, i8, -1, "com.elgato.streamdeck.purchase.BenefitsPlansBox (ProductsView.kt:207)");
        }
        L0.c cVarD = L0.c.f4806a.d();
        interfaceC3163lP.f(733328855);
        H hG = AbstractC2601e.g(cVarD, false, interfaceC3163lP, 6);
        interfaceC3163lP.f(-1323940314);
        int iA = AbstractC3157i.a(interfaceC3163lP, 0);
        InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
        InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
        Function0 function0A = aVar.a();
        Q6.p pVarB = AbstractC2252x.b(iVar2);
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
        v1.b(interfaceC3163lA, hG, aVar.c());
        v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
        Q6.o oVarB = aVar.b();
        if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
            interfaceC3163lA.H(Integer.valueOf(iA));
            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
        }
        pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
        interfaceC3163lP.f(2058660585);
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
        AbstractC2203e.e(z8, null, androidx.compose.animation.e.x(null, b.f604a, 1, null), androidx.compose.animation.e.B(null, c.f605a, 1, null).c(androidx.compose.animation.e.o(null, 0.0f, 3, null)), null, H0.c.b(interfaceC3163lP, 1199831742, true, new d(list, interfaceC3160j0)), interfaceC3163lP, (i8 & 14) | 200064, 18);
        interfaceC3163lP.f(1868411128);
        Object objG = interfaceC3163lP.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = new androidx.compose.ui.focus.g();
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        AbstractC2203e.e(!z8, null, androidx.compose.animation.e.x(null, null, 3, null), androidx.compose.animation.e.B(null, e.f611a, 1, null).c(androidx.compose.animation.e.o(null, 0.0f, 3, null)), null, H0.c.b(interfaceC3163lP, 659170037, true, new f(z8, (androidx.compose.ui.focus.g) objG, list, interfaceC3160j0)), interfaceC3163lP, 200064, 18);
        interfaceC3163lP.N();
        interfaceC3163lP.O();
        interfaceC3163lP.N();
        interfaceC3163lP.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        p215z0.P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new g(z8, list, interfaceC3160j0, iVar2, i8, i9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0294  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0324  */
    /* JADX WARN: Code duplicated, block: B:93:0x039d  */
    /* JADX WARN: Code duplicated, block: B:96:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void c(L0.i iVar, A3.l.h source, List products, boolean z8, InterfaceC3160j0 selectedProductIndex, Function0 function0, Function0 function1, Function0 function2, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        int i11;
        Function0 function3;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        Q6.o oVarB;
        int i12;
        boolean zR;
        Object objG;
        Function0 function4;
        Function0 function5;
        p215z0.P0 p0V;
        t.g(source, "source");
        t.g(products, "products");
        t.g(selectedProductIndex, "selectedProductIndex");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(356517729);
        L0.i iVar2 = (i9 & 1) != 0 ? L0.i.f4836a : iVar;
        Function0 function6 = (i9 & 32) != 0 ? h.f625a : function0;
        Function0 function7 = (i9 & 64) != 0 ? i.f626a : function1;
        Function0 function8 = (i9 & 128) != 0 ? j.f627a : function2;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(356517729, i8, -1, "com.elgato.streamdeck.purchase.ProductsView (ProductsView.kt:82)");
        }
        Object[] objArr = new Object[0];
        interfaceC3163lP.f(-633689966);
        boolean z9 = (((i8 & 7168) ^ 3072) > 2048 && interfaceC3163lP.c(z8)) || (i8 & 3072) == 2048;
        Object objG2 = interfaceC3163lP.g();
        if (z9 || objG2 == InterfaceC3163l.f38803a.a()) {
            objG2 = new m(z8);
            interfaceC3163lP.H(objG2);
        }
        interfaceC3163lP.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(objArr, null, null, (Function0) objG2, interfaceC3163lP, 8, 6);
        A3.g gVar = (A3.g) z.l0(products, selectedProductIndex.f());
        L0.c.a aVar = L0.c.f4806a;
        L0.c.b bVarF = aVar.f();
        C2598b c2598b = C2598b.f27914a;
        C2598b.l lVarA = c2598b.a();
        interfaceC3163lP.f(-483455358);
        H hA = AbstractC2607k.a(lVarA, bVarF, interfaceC3163lP, 54);
        interfaceC3163lP.f(-1323940314);
        int iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
        InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
        InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
        Function0 function0A2 = aVar2.a();
        Q6.p pVarB = AbstractC2252x.b(iVar2);
        if (interfaceC3163lP.t() == null) {
            AbstractC3157i.c();
        }
        interfaceC3163lP.r();
        if (interfaceC3163lP.m()) {
            interfaceC3163lP.w(function0A2);
        } else {
            interfaceC3163lP.G();
        }
        InterfaceC3163l interfaceC3163lA2 = v1.a(interfaceC3163lP);
        v1.b(interfaceC3163lA2, hA, aVar2.c());
        v1.b(interfaceC3163lA2, interfaceC3184wE, aVar2.e());
        Q6.o oVarB2 = aVar2.b();
        if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
            interfaceC3163lA2.H(Integer.valueOf(iA2));
            interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
        }
        pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
        interfaceC3163lP.f(2058660585);
        f(source, ((Configuration) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.f())).orientation == 1 ? InterfaceC2608l.c(C2609m.f28036a, L0.i.f4836a, 1.0f, false, 2, null) : androidx.compose.foundation.layout.f.i(L0.i.f4836a, A1.h.m(RCHTTPStatusCodes.SUCCESS)), interfaceC3163lP, (i8 >> 3) & 14, 0);
        boolean zD = d(interfaceC3164l0);
        L0.i.a aVar3 = L0.i.f4836a;
        b(zD, products, selectedProductIndex, androidx.compose.foundation.layout.f.k(aVar3, A1.h.m(RCHTTPStatusCodes.SUCCESS), 0.0f, 2, null), interfaceC3163lP, ((i8 >> 6) & 896) | 3136, 0);
        C2598b.e eVarN = c2598b.n(W3.c.f11463a.j());
        interfaceC3163lP.f(-483455358);
        H hA2 = AbstractC2607k.a(eVarN, aVar.i(), interfaceC3163lP, 0);
        interfaceC3163lP.f(-1323940314);
        int iA3 = AbstractC3157i.a(interfaceC3163lP, 0);
        InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
        Function0 function0A3 = aVar2.a();
        Q6.p pVarB2 = AbstractC2252x.b(aVar3);
        if (interfaceC3163lP.t() == null) {
            AbstractC3157i.c();
        }
        interfaceC3163lP.r();
        if (interfaceC3163lP.m()) {
            interfaceC3163lP.w(function0A3);
        } else {
            interfaceC3163lP.G();
        }
        InterfaceC3163l interfaceC3163lA3 = v1.a(interfaceC3163lP);
        v1.b(interfaceC3163lA3, hA2, aVar2.c());
        v1.b(interfaceC3163lA3, interfaceC3184wE2, aVar2.e());
        Q6.o oVarB3 = aVar2.b();
        if (interfaceC3163lA3.m() || !t.c(interfaceC3163lA3.g(), Integer.valueOf(iA3))) {
            interfaceC3163lA3.H(Integer.valueOf(iA3));
            interfaceC3163lA3.A(Integer.valueOf(iA3), oVarB3);
        }
        pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
        interfaceC3163lP.f(2058660585);
        if (gVar != null) {
            i10 = 1;
            if (gVar.b()) {
                i11 = p194w3.b.f37075y0;
            }
            J3.b.a(i11, I0.a(androidx.compose.foundation.layout.f.h(aVar3, 0.0f, i10, null), "checkout_button"), null, J3.d.ACCENT, J3.c.L, null, false, function6, interfaceC3163lP, ((i8 << 6) & 29360128) | 27696, 100);
            function3 = function6;
            interfaceC3163lP.f(-483455358);
            H hA3 = AbstractC2607k.a(c2598b.g(), aVar.i(), interfaceC3163lP, 0);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
            function0A = aVar2.a();
            Q6.p pVarB3 = AbstractC2252x.b(aVar3);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hA3, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE3, aVar2.e());
            oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            if (d(interfaceC3164l0)) {
                i12 = p194w3.b.f37078z0;
            } else {
                i12 = p194w3.b.f36932A0;
            }
            int i13 = i12;
            J3.c cVar = J3.c.S;
            L0.i iVarH = androidx.compose.foundation.layout.f.h(I0.a(aVar3, "plans_benefits_toggle_button"), 0.0f, i10, null);
            interfaceC3163lP.f(-920843326);
            zR = interfaceC3163lP.R(interfaceC3164l0);
            objG = interfaceC3163lP.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0012k(interfaceC3164l0);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            J3.b.a(i13, iVarH, null, null, cVar, null, false, (Function0) objG, interfaceC3163lP, 24624, 108);
            function4 = function7;
            J3.b.a(p194w3.b.f37072x0, I0.a(androidx.compose.foundation.layout.f.h(aVar3, 0.0f, i10, null), "restore_purchases_button"), null, null, cVar, null, false, function4, interfaceC3163lP, ((i8 << 3) & 29360128) | 24624, 108);
            function5 = function8;
            J3.b.a(p194w3.b.f37069w0, androidx.compose.foundation.layout.f.h(aVar3, 0.0f, i10, null), null, null, cVar, null, false, function5, interfaceC3163lP, (i8 & 29360128) | 24624, 108);
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new l(iVar2, source, products, z8, selectedProductIndex, function3, function4, function5, i8, i9));
            }
        }
        i10 = 1;
        i11 = p194w3.b.f37066v0;
        J3.b.a(i11, I0.a(androidx.compose.foundation.layout.f.h(aVar3, 0.0f, i10, null), "checkout_button"), null, J3.d.ACCENT, J3.c.L, null, false, function6, interfaceC3163lP, ((i8 << 6) & 29360128) | 27696, 100);
        function3 = function6;
        interfaceC3163lP.f(-483455358);
        H hA4 = AbstractC2607k.a(c2598b.g(), aVar.i(), interfaceC3163lP, 0);
        interfaceC3163lP.f(-1323940314);
        iA = AbstractC3157i.a(interfaceC3163lP, 0);
        InterfaceC3184w interfaceC3184wE4 = interfaceC3163lP.E();
        function0A = aVar2.a();
        Q6.p pVarB4 = AbstractC2252x.b(aVar3);
        if (interfaceC3163lP.t() == null) {
            AbstractC3157i.c();
        }
        interfaceC3163lP.r();
        if (interfaceC3163lP.m()) {
            interfaceC3163lP.w(function0A);
        } else {
            interfaceC3163lP.G();
        }
        interfaceC3163lA = v1.a(interfaceC3163lP);
        v1.b(interfaceC3163lA, hA4, aVar2.c());
        v1.b(interfaceC3163lA, interfaceC3184wE4, aVar2.e());
        oVarB = aVar2.b();
        if (interfaceC3163lA.m()) {
            interfaceC3163lA.H(Integer.valueOf(iA));
            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
        } else {
            interfaceC3163lA.H(Integer.valueOf(iA));
            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
        }
        pVarB4.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
        interfaceC3163lP.f(2058660585);
        if (d(interfaceC3164l0)) {
            i12 = p194w3.b.f37078z0;
        } else {
            i12 = p194w3.b.f36932A0;
        }
        int i14 = i12;
        J3.c cVar2 = J3.c.S;
        L0.i iVarH2 = androidx.compose.foundation.layout.f.h(I0.a(aVar3, "plans_benefits_toggle_button"), 0.0f, i10, null);
        interfaceC3163lP.f(-920843326);
        zR = interfaceC3163lP.R(interfaceC3164l0);
        objG = interfaceC3163lP.g();
        if (zR) {
            objG = new C0012k(interfaceC3164l0);
            interfaceC3163lP.H(objG);
        } else {
            objG = new C0012k(interfaceC3164l0);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        J3.b.a(i14, iVarH2, null, null, cVar2, null, false, (Function0) objG, interfaceC3163lP, 24624, 108);
        function4 = function7;
        J3.b.a(p194w3.b.f37072x0, I0.a(androidx.compose.foundation.layout.f.h(aVar3, 0.0f, i10, null), "restore_purchases_button"), null, null, cVar2, null, false, function4, interfaceC3163lP, ((i8 << 3) & 29360128) | 24624, 108);
        function5 = function8;
        J3.b.a(p194w3.b.f37069w0, androidx.compose.foundation.layout.f.h(aVar3, 0.0f, i10, null), null, null, cVar2, null, false, function5, interfaceC3163lP, (i8 & 29360128) | 24624, 108);
        interfaceC3163lP.N();
        interfaceC3163lP.O();
        interfaceC3163lP.N();
        interfaceC3163lP.N();
        interfaceC3163lP.N();
        interfaceC3163lP.O();
        interfaceC3163lP.N();
        interfaceC3163lP.N();
        interfaceC3163lP.N();
        interfaceC3163lP.O();
        interfaceC3163lP.N();
        interfaceC3163lP.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new l(iVar2, source, products, z8, selectedProductIndex, function3, function4, function5, i8, i9));
        }
    }

    public static final boolean d(InterfaceC3164l0 interfaceC3164l0) {
        return ((Boolean) interfaceC3164l0.getValue()).booleanValue();
    }

    public static final void e(InterfaceC3164l0 interfaceC3164l0, boolean z8) {
        interfaceC3164l0.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x0192  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:73:0x0208  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void f(A3.l.h hVar, L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        L0.i iVar2;
        L0.i iVar3;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        Q6.o oVarB;
        long jC;
        boolean zJ;
        Object objG;
        int iA2;
        Function0 function0A2;
        InterfaceC3163l interfaceC3163lA2;
        Q6.o oVarB2;
        int i11;
        int i12;
        InterfaceC3163l interfaceC3163l2;
        p215z0.P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1532015527);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(hVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 == 0) {
            if ((i8 & 112) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            if ((i10 & 91) == 18 || !interfaceC3163lP.s()) {
                if (i13 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1532015527, i10, -1, "com.elgato.streamdeck.purchase.TitleBox (ProductsView.kt:159)");
                }
                L0.c.a aVar = L0.c.f4806a;
                L0.c cVarB = aVar.b();
                interfaceC3163lP.f(733328855);
                H hG = AbstractC2601e.g(cVarB, false, interfaceC3163lP, 6);
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                function0A = aVar2.a();
                Q6.p pVarB = AbstractC2252x.b(iVar3);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A);
                } else {
                    interfaceC3163lP.G();
                }
                interfaceC3163lA = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA, hG, aVar2.c());
                v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
                oVarB = aVar2.b();
                if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                Z z8 = Z.f35786a;
                int i14 = Z.f35787b;
                jC = J3.m.c(z8.a(interfaceC3163lP, i14), interfaceC3163lP, 0);
                U0.b bVarD = p101l1.c.d(p154r3.h.f32495j0, interfaceC3163lP, 0);
                L0.i.a aVar3 = L0.i.f4836a;
                interfaceC3163lP.f(1950693079);
                zJ = interfaceC3163lP.j(jC);
                objG = interfaceC3163lP.g();
                if (zJ || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new n(jC);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                D.a(bVarD, null, androidx.compose.ui.draw.a.d(aVar3, (Q6.k) objG), aVar.k(), InterfaceC2235f.f20468a.b(), 0.0f, null, interfaceC3163lP, 27704, 96);
                L0.c.b bVarF = aVar.f();
                interfaceC3163lP.f(-483455358);
                H hA = AbstractC2607k.a(C2598b.f27914a.g(), bVarF, interfaceC3163lP, 48);
                interfaceC3163lP.f(-1323940314);
                iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
                function0A2 = aVar2.a();
                Q6.p pVarB2 = AbstractC2252x.b(aVar3);
                if (interfaceC3163lP.t() == null) {
                    AbstractC3157i.c();
                }
                interfaceC3163lP.r();
                if (interfaceC3163lP.m()) {
                    interfaceC3163lP.w(function0A2);
                } else {
                    interfaceC3163lP.G();
                }
                interfaceC3163lA2 = v1.a(interfaceC3163lP);
                v1.b(interfaceC3163lA2, hA, aVar2.c());
                v1.b(interfaceC3163lA2, interfaceC3184wE2, aVar2.e());
                oVarB2 = aVar2.b();
                if (interfaceC3163lA2.m() || !t.c(interfaceC3163lA2.g(), Integer.valueOf(iA2))) {
                    interfaceC3163lA2.H(Integer.valueOf(iA2));
                    interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
                }
                pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                C2609m c2609m = C2609m.f28036a;
                i11 = r.f647a[hVar.ordinal()];
                if (i11 == 1) {
                    i12 = p194w3.b.f36968M0;
                } else {
                    if (i11 != 2) {
                        throw new C6.m();
                    }
                    i12 = p194w3.b.f36965L0;
                }
                String upperCase = p101l1.f.b(i12, interfaceC3163lP, 0).toUpperCase(Locale.ROOT);
                t.f(upperCase, "toUpperCase(...)");
                I iD = z8.c(interfaceC3163lP, i14).d();
                z1.j.a aVar4 = p216z1.j.f39010b;
                interfaceC3163l2 = interfaceC3163lP;
                P0.b(upperCase, p110m1.n.d(aVar3, false, o.f641a, 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, iD, interfaceC3163l2, 0, 0, 65020);
                W3.c cVar = W3.c.f11463a;
                X.a(androidx.compose.foundation.layout.f.i(aVar3, cVar.j()), interfaceC3163l2, 0);
                P0.b(p101l1.f.b(p194w3.b.f36971N0, interfaceC3163l2, 0), p110m1.n.d(androidx.compose.foundation.layout.e.m(aVar3, 0.0f, 0.0f, 0.0f, cVar.j(), 7, null), false, p.f642a, 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, z8.c(interfaceC3163l2, i14).g(), interfaceC3163l2, 0, 0, 65020);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                iVar2 = iVar3;
            } else {
                interfaceC3163lP.z();
                interfaceC3163l2 = interfaceC3163lP;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new q(hVar, iVar2, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        if ((i10 & 91) == 18) {
            if (i13 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1532015527, i10, -1, "com.elgato.streamdeck.purchase.TitleBox (ProductsView.kt:159)");
            }
            L0.c.a aVar5 = L0.c.f4806a;
            L0.c cVarB2 = aVar5.b();
            interfaceC3163lP.f(733328855);
            H hG2 = AbstractC2601e.g(cVarB2, false, interfaceC3163lP, 6);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar6 = InterfaceC2343g.f23596Q;
            function0A = aVar6.a();
            Q6.p pVarB3 = AbstractC2252x.b(iVar3);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hG2, aVar6.c());
            v1.b(interfaceC3163lA, interfaceC3184wE3, aVar6.e());
            oVarB = aVar6.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f14485a;
            Z z9 = Z.f35786a;
            int i15 = Z.f35787b;
            jC = J3.m.c(z9.a(interfaceC3163lP, i15), interfaceC3163lP, 0);
            U0.b bVarD2 = p101l1.c.d(p154r3.h.f32495j0, interfaceC3163lP, 0);
            L0.i.a aVar7 = L0.i.f4836a;
            interfaceC3163lP.f(1950693079);
            zJ = interfaceC3163lP.j(jC);
            objG = interfaceC3163lP.g();
            if (zJ) {
                objG = new n(jC);
                interfaceC3163lP.H(objG);
            } else {
                objG = new n(jC);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            D.a(bVarD2, null, androidx.compose.ui.draw.a.d(aVar7, (Q6.k) objG), aVar5.k(), InterfaceC2235f.f20468a.b(), 0.0f, null, interfaceC3163lP, 27704, 96);
            L0.c.b bVarF2 = aVar5.f();
            interfaceC3163lP.f(-483455358);
            H hA2 = AbstractC2607k.a(C2598b.f27914a.g(), bVarF2, interfaceC3163lP, 48);
            interfaceC3163lP.f(-1323940314);
            iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE4 = interfaceC3163lP.E();
            function0A2 = aVar6.a();
            Q6.p pVarB4 = AbstractC2252x.b(aVar7);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A2);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA2 = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA2, hA2, aVar6.c());
            v1.b(interfaceC3163lA2, interfaceC3184wE4, aVar6.e());
            oVarB2 = aVar6.b();
            if (interfaceC3163lA2.m()) {
                interfaceC3163lA2.H(Integer.valueOf(iA2));
                interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
            } else {
                interfaceC3163lA2.H(Integer.valueOf(iA2));
                interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
            }
            pVarB4.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m2 = C2609m.f28036a;
            i11 = r.f647a[hVar.ordinal()];
            if (i11 == 1) {
                i12 = p194w3.b.f36968M0;
            } else {
                if (i11 != 2) {
                    throw new C6.m();
                }
                i12 = p194w3.b.f36965L0;
            }
            String upperCase2 = p101l1.f.b(i12, interfaceC3163lP, 0).toUpperCase(Locale.ROOT);
            t.f(upperCase2, "toUpperCase(...)");
            I iD2 = z9.c(interfaceC3163lP, i15).d();
            z1.j.a aVar8 = p216z1.j.f39010b;
            interfaceC3163l2 = interfaceC3163lP;
            P0.b(upperCase2, p110m1.n.d(aVar7, false, o.f641a, 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar8.a()), 0L, 0, false, 0, 0, null, iD2, interfaceC3163l2, 0, 0, 65020);
            W3.c cVar2 = W3.c.f11463a;
            X.a(androidx.compose.foundation.layout.f.i(aVar7, cVar2.j()), interfaceC3163l2, 0);
            P0.b(p101l1.f.b(p194w3.b.f36971N0, interfaceC3163l2, 0), p110m1.n.d(androidx.compose.foundation.layout.e.m(aVar7, 0.0f, 0.0f, 0.0f, cVar2.j(), 7, null), false, p.f642a, 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar8.a()), 0L, 0, false, 0, 0, null, z9.c(interfaceC3163l2, i15).g(), interfaceC3163l2, 0, 0, 65020);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar2 = iVar3;
        } else {
            if (i13 != 0) {
                iVar3 = L0.i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1532015527, i10, -1, "com.elgato.streamdeck.purchase.TitleBox (ProductsView.kt:159)");
            }
            L0.c.a aVar9 = L0.c.f4806a;
            L0.c cVarB3 = aVar9.b();
            interfaceC3163lP.f(733328855);
            H hG3 = AbstractC2601e.g(cVarB3, false, interfaceC3163lP, 6);
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE5 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar10 = InterfaceC2343g.f23596Q;
            function0A = aVar10.a();
            Q6.p pVarB5 = AbstractC2252x.b(iVar3);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, hG3, aVar10.c());
            v1.b(interfaceC3163lA, interfaceC3184wE5, aVar10.e());
            oVarB = aVar10.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB5.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.f14485a;
            Z z10 = Z.f35786a;
            int i16 = Z.f35787b;
            jC = J3.m.c(z10.a(interfaceC3163lP, i16), interfaceC3163lP, 0);
            U0.b bVarD3 = p101l1.c.d(p154r3.h.f32495j0, interfaceC3163lP, 0);
            L0.i.a aVar11 = L0.i.f4836a;
            interfaceC3163lP.f(1950693079);
            zJ = interfaceC3163lP.j(jC);
            objG = interfaceC3163lP.g();
            if (zJ) {
                objG = new n(jC);
                interfaceC3163lP.H(objG);
            } else {
                objG = new n(jC);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            D.a(bVarD3, null, androidx.compose.ui.draw.a.d(aVar11, (Q6.k) objG), aVar9.k(), InterfaceC2235f.f20468a.b(), 0.0f, null, interfaceC3163lP, 27704, 96);
            L0.c.b bVarF3 = aVar9.f();
            interfaceC3163lP.f(-483455358);
            H hA3 = AbstractC2607k.a(C2598b.f27914a.g(), bVarF3, interfaceC3163lP, 48);
            interfaceC3163lP.f(-1323940314);
            iA2 = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE6 = interfaceC3163lP.E();
            function0A2 = aVar10.a();
            Q6.p pVarB6 = AbstractC2252x.b(aVar11);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A2);
            } else {
                interfaceC3163lP.G();
            }
            interfaceC3163lA2 = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA2, hA3, aVar10.c());
            v1.b(interfaceC3163lA2, interfaceC3184wE6, aVar10.e());
            oVarB2 = aVar10.b();
            if (interfaceC3163lA2.m()) {
                interfaceC3163lA2.H(Integer.valueOf(iA2));
                interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
            } else {
                interfaceC3163lA2.H(Integer.valueOf(iA2));
                interfaceC3163lA2.A(Integer.valueOf(iA2), oVarB2);
            }
            pVarB6.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            C2609m c2609m3 = C2609m.f28036a;
            i11 = r.f647a[hVar.ordinal()];
            if (i11 == 1) {
                i12 = p194w3.b.f36968M0;
            } else {
                if (i11 != 2) {
                    throw new C6.m();
                }
                i12 = p194w3.b.f36965L0;
            }
            String upperCase3 = p101l1.f.b(i12, interfaceC3163lP, 0).toUpperCase(Locale.ROOT);
            t.f(upperCase3, "toUpperCase(...)");
            I iD3 = z10.c(interfaceC3163lP, i16).d();
            z1.j.a aVar12 = p216z1.j.f39010b;
            interfaceC3163l2 = interfaceC3163lP;
            P0.b(upperCase3, p110m1.n.d(aVar11, false, o.f641a, 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar12.a()), 0L, 0, false, 0, 0, null, iD3, interfaceC3163l2, 0, 0, 65020);
            W3.c cVar3 = W3.c.f11463a;
            X.a(androidx.compose.foundation.layout.f.i(aVar11, cVar3.j()), interfaceC3163l2, 0);
            P0.b(p101l1.f.b(p194w3.b.f36971N0, interfaceC3163l2, 0), p110m1.n.d(androidx.compose.foundation.layout.e.m(aVar11, 0.0f, 0.0f, 0.0f, cVar3.j(), 7, null), false, p.f642a, 1, null), 0L, 0L, null, null, null, 0L, null, p216z1.j.h(aVar12.a()), 0L, 0, false, 0, 0, null, z10.c(interfaceC3163l2, i16).g(), interfaceC3163l2, 0, 0, 65020);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar2 = iVar3;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new q(hVar, iVar2, i8, i9));
        }
    }

    public static final V3.h.a n() {
        return new V3.h.a(V3.c.b.VIEW_BENEFITS.b(), new C6.o[]{v.a("screen_name", V3.c.d.PRO_PAYWALL.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a o() {
        return new V3.h.a(V3.c.b.VIEW_OTHER_PLANS.b(), new C6.o[]{v.a("screen_name", V3.c.d.PRO_PAYWALL.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }
}
