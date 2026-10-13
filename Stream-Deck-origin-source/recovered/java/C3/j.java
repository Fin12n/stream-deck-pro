package C3;

import A3.n;
import C6.G;
import C6.r;
import Q6.o;
import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.DiKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p065h1.I0;
import p082j0.T;
import p191w0.N;
import p191w0.O;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p210y3.a implements p210y3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f1329b = new d(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f1330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f1331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V2.b f1332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, l lVar, V2.b bVar) {
            super(0);
            this.f1330a = nVar;
            this.f1331b = lVar;
            this.f1332c = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
            if (this.f1330a.c()) {
                this.f1331b.i();
                return;
            }
            V2.b bVar = this.f1332c;
            A3.l lVar = new A3.l(A3.l.h.Faceplate);
            if (bVar.l() instanceof A3.l) {
                return;
            }
            bVar.o(lVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.b f1333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l.b bVar) {
            super(2);
            this.f1333a = bVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(935155817, i8, -1, "com.elgato.streamdeck.settings.faceplate.FaceplateSelectionScreen.Actions.<anonymous> (FaceplateSelectionScreen.kt:88)");
            }
            O.b(p101l1.g.b(V0.d.f10289k, this.f1333a.e() ? p154r3.h.f32464O : p154r3.h.f32472W, interfaceC3163l, 8), null, null, 0L, interfaceC3163l, 48, 12);
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
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f1335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T t8, int i8) {
            super(2);
            this.f1335b = t8;
            this.f1336c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            j.this.s(this.f1335b, interfaceC3163l, F0.a(this.f1336c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {
        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T3.a f1337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f1339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T3.a aVar, String str, l lVar) {
            super(0);
            this.f1337a = aVar;
            this.f1338b = str;
            this.f1339c = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V3.j invoke() {
            if (t.c(this.f1338b, C3.e.c(((T3.a.C0274a) this.f1337a.e().getValue()).a(), ((T3.a.C0274a) this.f1337a.e().getValue()).c()))) {
                return null;
            }
            return k.d(j.f1329b, (C3.b) this.f1339c.c().j().getValue(), ((List) this.f1339c.c().i().getValue()).size(), P3.f.h(((T3.a.C0274a) this.f1337a.e().getValue()).a()), P3.f.j(((T3.a.C0274a) this.f1337a.e().getValue()).a()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f1340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.b f1341b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar, V2.b bVar) {
            super(1);
            this.f1340a = lVar;
            this.f1341b = bVar;
        }

        public final void b(C3.b bVar) {
            if (this.f1340a.e(bVar)) {
                this.f1340a.h(bVar);
                return;
            }
            V2.b bVar2 = this.f1341b;
            A3.l lVar = new A3.l(A3.l.h.Faceplate);
            if (bVar2.l() instanceof A3.l) {
                return;
            }
            bVar2.o(lVar);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C3.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f1343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p018c.h f1344c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar, p018c.h hVar, G6.d dVar) {
            super(2, dVar);
            this.f1343b = lVar;
            this.f1344c = hVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new g(this.f1343b, this.f1344c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f1342a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            if (((Boolean) this.f1343b.f().getValue()).booleanValue()) {
                this.f1344c.a(p036e.i.a(p045f.c.C0499c.f21233a));
                this.f1343b.f().setValue(I6.b.a(false));
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1346b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i8) {
            super(2);
            this.f1346b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            j.this.m(interfaceC3163l, F0.a(this.f1346b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f1347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(l lVar, int i8) {
            super(1);
            this.f1347a = lVar;
            this.f1348b = i8;
        }

        public final void b(Uri uri) {
            if (uri != null) {
                this.f1347a.a(uri, this.f1348b);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Uri) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: C3.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0058j extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0058j(int i8) {
            super(2);
            this.f1350b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            j.this.u(interfaceC3163l, F0.a(this.f1350b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1220979499);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1220979499, i8, -1, "com.elgato.streamdeck.settings.faceplate.FaceplateSelectionScreen.Content (FaceplateSelectionScreen.kt:99)");
            }
            V2.b bVar = (V2.b) V2.d.e(V2.d.f(), interfaceC3163lP, 0);
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(l.class, false, null, null);
            A5.h hVar = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
            if (objG == aVar2.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            l lVar = (l) objG;
            q1 q1VarB = g1.b(lVar.d(), null, interfaceC3163lP, 8, 1);
            DisplayMetrics displayMetrics = ((Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g())).getResources().getDisplayMetrics();
            int iMax = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
            interfaceC3163lP.f(1853070191);
            A5.a aVar3 = new A5.a(T3.a.class, false, null, null);
            A5.h hVar2 = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar2.a()) {
                objG2 = hVar2.h(aVar3, null);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            T3.a aVar4 = (T3.a) objG2;
            T3.a.C0274a c0274a = (T3.a.C0274a) g1.b(aVar4.e(), null, interfaceC3163lP, 8, 1).getValue();
            H3.e.a(new e(aVar4, C3.e.c(c0274a.a(), c0274a.c()), lVar), interfaceC3163lP, 0);
            p045f.c cVar = new p045f.c();
            interfaceC3163lP.f(-1423574600);
            boolean zR = interfaceC3163lP.R(lVar) | interfaceC3163lP.i(iMax);
            Object objG3 = interfaceC3163lP.g();
            if (zR || objG3 == aVar2.a()) {
                objG3 = new i(lVar, iMax);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            p018c.h hVarA = p018c.c.a(cVar, (Q6.k) objG3, interfaceC3163lP, 8);
            k.a((l.b) q1VarB.getValue(), new f(lVar, bVar), interfaceC3163lP, 8);
            K.d(lVar.f().getValue(), new g(lVar, hVarA, null), interfaceC3163lP, 64);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new h(i8));
        }
    }

    @Override // p210y3.b
    public void s(T rowScope, InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        t.g(rowScope, "rowScope");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-839752351);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-839752351, i8, -1, "com.elgato.streamdeck.settings.faceplate.FaceplateSelectionScreen.Actions (FaceplateSelectionScreen.kt:73)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(l.class, false, null, null);
            A5.h hVar = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar2 = InterfaceC3163l.f38803a;
            if (objG == aVar2.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            l lVar = (l) objG;
            interfaceC3163lP.f(1853070191);
            A5.a aVar3 = new A5.a(n.class, false, null, null);
            A5.h hVar2 = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar2.a()) {
                objG2 = hVar2.h(aVar3, null);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            n nVar = (n) objG2;
            V2.b bVar = (V2.b) V2.d.e(V2.d.f(), interfaceC3163lP, 0);
            l.b bVar2 = (l.b) g1.b(lVar.d(), null, interfaceC3163lP, 8, 1).getValue();
            if (bVar2.c()) {
                N.a(new a(nVar, lVar, bVar), K3.c.a(I0.a(L0.i.f4836a, "faceplate_edit_mode"), p194w3.b.f37041n, interfaceC3163lP, 6), false, null, null, H0.c.b(interfaceC3163lP, 935155817, true, new b(bVar2)), interfaceC3163lP, 196608, 28);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(rowScope, i8));
        }
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(222757484);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(222757484, i8, -1, "com.elgato.streamdeck.settings.faceplate.FaceplateSelectionScreen.Title (FaceplateSelectionScreen.kt:70)");
            }
            p210y3.c.a(p194w3.b.f37079z1, null, interfaceC3163lP, 0, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0058j(i8));
        }
    }
}
