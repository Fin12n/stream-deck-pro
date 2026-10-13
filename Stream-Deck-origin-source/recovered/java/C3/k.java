package C3;

import C6.G;
import C6.v;
import J3.m;
import Q6.o;
import Q6.p;
import Q6.q;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p056g1.InterfaceC2343g;
import p082j0.C2598b;
import p082j0.J;
import p082j0.S;
import p082j0.U;
import p082j0.d0;
import p082j0.j0;
import p100l0.A;
import p100l0.AbstractC2647h;
import p100l0.C2641b;
import p100l0.E;
import p100l0.InterfaceC2640a;
import p100l0.r;
import p110m1.n;
import p110m1.x;
import p191w0.AbstractC3086t0;
import p191w0.P0;
import p191w0.Z;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.b f1351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f1352b;

        /* JADX INFO: renamed from: C3.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0059a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l.b f1353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q6.k f1354b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0059a(l.b bVar, Q6.k kVar) {
                super(1);
                this.f1353a = bVar;
                this.f1354b = kVar;
            }

            public final void b(A LazyVerticalGrid) {
                t.g(LazyVerticalGrid, "$this$LazyVerticalGrid");
                k.g(LazyVerticalGrid, p194w3.b.f37000Z, this.f1353a.d(), false, 4, null);
                k.e(LazyVerticalGrid, this.f1353a.b(), this.f1354b);
                k.g(LazyVerticalGrid, p194w3.b.f36998Y, null, true, 2, null);
                k.e(LazyVerticalGrid, this.f1353a.a(), this.f1354b);
                k.h(LazyVerticalGrid, p194w3.b.f37003a0);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((A) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l.b bVar, Q6.k kVar) {
            super(3);
            this.f1351a = bVar;
            this.f1352b = kVar;
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
                AbstractC3169o.W(1323203597, i9, -1, "com.elgato.streamdeck.settings.faceplate.FaceplateSelectionContent.<anonymous> (FaceplateSelectionScreen.kt:167)");
            }
            AbstractC2647h.a(new InterfaceC2640a.C0632a(A1.h.m(100), null), androidx.compose.foundation.layout.f.d(androidx.compose.foundation.c.b(L0.i.f4836a, m.c(Z.f35786a.a(interfaceC3163l, Z.f35787b), interfaceC3163l, 0), null, 2, null), 0.0f, 1, null), null, K3.d.a(paddingValues, m.g(W3.c.f11463a), interfaceC3163l, i9 & 14), false, null, null, null, false, new C0059a(this.f1351a, this.f1352b), interfaceC3163l, 0, 500);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((J) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.b f1355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f1356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1357c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l.b bVar, Q6.k kVar, int i8) {
            super(2);
            this.f1355a = bVar;
            this.f1356b = kVar;
            this.f1357c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.a(this.f1355a, this.f1356b, interfaceC3163l, F0.a(this.f1357c | 1));
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
        public static final c f1358a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f1359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f1360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Q6.k kVar, List list) {
            super(1);
            this.f1359a = kVar;
            this.f1360b = list;
        }

        public final Object b(int i8) {
            return this.f1359a.invoke(this.f1360b.get(i8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f1361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f1362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Q6.k kVar, List list) {
            super(1);
            this.f1361a = kVar;
            this.f1362b = list;
        }

        public final Object b(int i8) {
            return this.f1361a.invoke(this.f1362b.get(i8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f1363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f1364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, Q6.k kVar) {
            super(4);
            this.f1363a = list;
            this.f1364b = kVar;
        }

        public final void b(p100l0.q qVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
            int i10;
            if ((i9 & 14) == 0) {
                i10 = (interfaceC3163l.R(qVar) ? 4 : 2) | i9;
            } else {
                i10 = i9;
            }
            if ((i9 & 112) == 0) {
                i10 |= interfaceC3163l.i(i8) ? 32 : 16;
            }
            if ((i10 & 731) == 146 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(699646206, i10, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
            }
            l.a aVar = (l.a) this.f1363a.get(i8);
            interfaceC3163l.f(-1152480106);
            C3.c.c(p100l0.q.a(qVar, L0.i.f4836a, null, 1, null), aVar, this.f1364b, interfaceC3163l, 0, 0);
            interfaceC3163l.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((p100l0.q) obj, ((Number) obj2).intValue(), (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f1365a = new g();

        public g() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l.a it) {
            String strB;
            t.g(it, "it");
            C3.b bVarA = it.a();
            return (bVarA == null || (strB = bVarA.b()) == null) ? "add" : strB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f1366a = new h();

        public h() {
            super(1);
        }

        public final long b(r item) {
            t.g(item, "$this$item");
            return E.a(item.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C2641b.a(b((r) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1369c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1370a = new a();

            public a() {
                super(1);
            }

            public final void b(x clearAndSetSemantics) {
                t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z8, int i8, String str) {
            super(3);
            this.f1367a = z8;
            this.f1368b = i8;
            this.f1369c = str;
        }

        public final void b(p100l0.q item, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(item, "$this$item");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1916571571, i8, -1, "com.elgato.streamdeck.settings.faceplate.headline.<anonymous> (FaceplateSelectionScreen.kt:208)");
            }
            L0.i iVarA = this.f1367a ? n.a(L0.i.f4836a, a.f1370a) : L0.i.f4836a;
            C2598b.e eVarE = C2598b.f27914a.e();
            L0.c.InterfaceC0174c interfaceC0174cA = L0.c.f4806a.a();
            int i9 = this.f1368b;
            String str = this.f1369c;
            interfaceC3163l.f(693286680);
            H hA = S.a(eVarE, interfaceC0174cA, interfaceC3163l, 54);
            interfaceC3163l.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163l, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            p pVarB = AbstractC2252x.b(iVarA);
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
            v1.b(interfaceC3163lA, hA, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
            interfaceC3163l.f(2058660585);
            U u8 = U.f27892a;
            J3.n.a(i9, androidx.compose.foundation.layout.e.e(0.0f, W3.c.f11463a.j(), 0.0f, 0.0f, 13, null), interfaceC3163l, 0, 0);
            interfaceC3163l.f(672660311);
            if (str != null) {
                P0.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
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
            b((p100l0.q) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f1371a = new j();

        public j() {
            super(1);
        }

        public final long b(r item) {
            t.g(item, "$this$item");
            return E.a(item.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C2641b.a(b((r) obj));
        }
    }

    /* JADX INFO: renamed from: C3.k$k, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0060k extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0060k(int i8) {
            super(3);
            this.f1372a = i8;
        }

        public final void b(p100l0.q item, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(item, "$this$item");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-372964277, i8, -1, "com.elgato.streamdeck.settings.faceplate.text.<anonymous> (FaceplateSelectionScreen.kt:202)");
            }
            P0.b(p101l1.f.b(this.f1372a, interfaceC3163l, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC3163l, 0, 0, 131070);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((p100l0.q) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    public static final void a(l.b viewState, Q6.k onSelect, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(viewState, "viewState");
        t.g(onSelect, "onSelect");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-750547460);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-750547460, i8, -1, "com.elgato.streamdeck.settings.faceplate.FaceplateSelectionContent (FaceplateSelectionScreen.kt:163)");
        }
        AbstractC3086t0.b(null, null, null, null, null, 0, 0L, 0L, j0.b(d0.f27940a, interfaceC3163lP, 8), H0.c.b(interfaceC3163lP, 1323203597, true, new a(viewState, onSelect)), interfaceC3163lP, 805306368, 255);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        p215z0.P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(viewState, onSelect, i8));
        }
    }

    public static final V3.h.a d(C3.j.d eventSelectedValueChanged, C3.b faceplate, int i8, String str, String str2) {
        t.g(eventSelectedValueChanged, "$this$eventSelectedValueChanged");
        t.g(faceplate, "faceplate");
        String strB = V3.c.b.VIRTUAL_DEVICE_SETTING_CHANGED.b();
        C6.o oVarA = v.a("screen_name", V3.c.d.FACEPLATE.b());
        C6.o oVarA2 = v.a("faceplate", p186v3.b.a(faceplate));
        C6.o oVarA3 = v.a("number_of_custom_faceplates", String.valueOf(i8));
        if (str == null) {
            str = "-1";
        }
        C6.o oVarA4 = v.a("device_id", str);
        if (str2 == null) {
            str2 = "-1";
        }
        return new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, oVarA3, oVarA4, v.a("workstation_id", str2)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final void e(A a8, List list, Q6.k kVar) {
        g gVar = g.f1365a;
        a8.e(list.size(), gVar != null ? new d(gVar, list) : null, null, new e(c.f1358a, list), H0.c.c(699646206, true, new f(list, kVar)));
    }

    public static final void f(A a8, int i8, String str, boolean z8) {
        A.f(a8, null, h.f1366a, null, H0.c.c(-1916571571, true, new i(z8, i8, str)), 5, null);
    }

    public static /* synthetic */ void g(A a8, int i8, String str, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        f(a8, i8, str, z8);
    }

    public static final void h(A a8, int i8) {
        A.f(a8, null, j.f1371a, null, H0.c.c(-372964277, true, new C0060k(i8)), 5, null);
    }
}
