package D3;

import A5.h;
import C6.G;
import Q6.k;
import Q6.o;
import V3.j;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p210y3.a implements p210y3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1874b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2639q implements k {
        public b(Object obj) {
            super(1, obj, D3.e.class, "select", "select(Lcom/elgato/streamdeck/settings/layout/KeypadLayout;)V", 0);
        }

        public final void h(D3.b p8) {
            t.g(p8, "p0");
            ((D3.e) this.receiver).c(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((D3.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1876b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8) {
            super(2);
            this.f1876b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            d.this.m(interfaceC3163l, F0.a(this.f1876b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: D3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0080d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D3.e f1877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1880d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0080d(D3.e eVar, String str, int i8, int i9) {
            super(0);
            this.f1877a = eVar;
            this.f1878b = str;
            this.f1879c = i8;
            this.f1880d = i9;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            String strC = defpackage.a.c(((T3.a.C0274a) this.f1877a.a().e().getValue()).a());
            int keypadRows = ((T3.a.C0274a) this.f1877a.a().e().getValue()).a().getKeypadRows();
            int keypadColumns = ((T3.a.C0274a) this.f1877a.a().e().getValue()).a().getKeypadColumns();
            if (t.c(this.f1878b, strC) && this.f1879c == keypadRows && this.f1880d == keypadColumns) {
                return null;
            }
            KnownHost.Device deviceA = ((T3.a.C0274a) this.f1877a.a().e().getValue()).a();
            return D3.c.d(d.f1874b, strC, keypadColumns, keypadRows, P3.f.h(deviceA), P3.f.j(deviceA));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D3.e f1882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(D3.e eVar, int i8) {
            super(2);
            this.f1882b = eVar;
            this.f1883c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            d.this.a(this.f1882b, interfaceC3163l, F0.a(this.f1883c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1885b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i8) {
            super(2);
            this.f1885b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.this.u(interfaceC3163l, F0.a(this.f1885b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public final void a(D3.e eVar, InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-415311173);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(eVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-415311173, i9, -1, "com.elgato.streamdeck.settings.layout.KeypadLayoutSelectionScreen.SetupTracking (KeypadLayoutSelection.kt:82)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(T3.a.class, false, null, null);
            h hVar = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
            if (objG == aVar2.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            T3.a.C0274a c0274a = (T3.a.C0274a) g1.b(((T3.a) objG).e(), null, interfaceC3163lP, 8, 1).getValue();
            String strC = defpackage.a.c(c0274a.a());
            int keypadRows = c0274a.a().getKeypadRows();
            int keypadColumns = c0274a.a().getKeypadColumns();
            interfaceC3163lP.f(-1947069011);
            boolean zR = interfaceC3163lP.R(strC) | ((i9 & 14) == 4) | interfaceC3163lP.i(keypadRows) | interfaceC3163lP.i(keypadColumns);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == aVar2.a()) {
                objG2 = new C0080d(eVar, strC, keypadRows, keypadColumns);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            H3.e.a((Function0) objG2, interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(eVar, i8));
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1040634922);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(this) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1040634922, i9, -1, "com.elgato.streamdeck.settings.layout.KeypadLayoutSelectionScreen.Content (KeypadLayoutSelection.kt:69)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(D3.e.class, false, null, null);
            h hVar = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
            if (objG == aVar2.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            D3.e eVar = (D3.e) objG;
            q1 q1VarB = g1.b(eVar.b(), null, interfaceC3163lP, 8, 1);
            a(eVar, interfaceC3163lP, (i9 << 3) & 112);
            D3.e.a aVar3 = (D3.e.a) q1VarB.getValue();
            interfaceC3163lP.f(980631949);
            boolean zR = interfaceC3163lP.R(eVar);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == aVar2.a()) {
                objG2 = new b(eVar);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            D3.c.b(aVar3, (k) ((X6.h) objG2), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(i8));
        }
    }

    @Override // p210y3.b
    public void s(T t8, InterfaceC3163l interfaceC3163l, int i8) {
        y3.b.a.a(this, t8, interfaceC3163l, i8);
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(435487797);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(435487797, i8, -1, "com.elgato.streamdeck.settings.layout.KeypadLayoutSelectionScreen.Title (KeypadLayoutSelection.kt:66)");
            }
            p210y3.c.a(p194w3.b.f37033k0, null, interfaceC3163lP, 0, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(i8));
        }
    }
}
