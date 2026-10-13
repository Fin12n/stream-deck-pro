package B3;

import C6.G;
import C6.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p210y3.a implements p210y3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1023b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1024a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f1024a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            V3.f.a(J3.l.b());
            p154r3.j.a(this.f1024a, "https://help.elgato.com/hc/sections/360005918272-Elgato-Stream-Deck-Mobile/");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f1025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V2.b bVar) {
            super(0);
            this.f1025a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
            V2.b bVar = this.f1025a;
            E3.c cVar = new E3.c();
            if (bVar.l() instanceof E3.c) {
                return;
            }
            bVar.o(cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1027b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str) {
            super(0);
            this.f1026a = context;
            this.f1027b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            Intent intent = new Intent();
            String str = this.f1027b;
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            this.f1026a.startActivity(Intent.createChooser(intent, "Sharing Stream Deck Mobile RC ID"));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G3.n f1028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f1029b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(G3.n nVar, Activity activity) {
            super(0);
            this.f1028a = nVar;
            this.f1029b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m31invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m31invoke() {
            this.f1028a.e(this.f1029b);
        }
    }

    /* JADX INFO: renamed from: B3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0032f extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0032f(int i8) {
            super(2);
            this.f1031b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            f.this.m(interfaceC3163l, F0.a(this.f1031b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T3.a f1033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(T3.a aVar, G6.d dVar) {
            super(2, dVar);
            this.f1033b = aVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new g(this.f1033b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f1032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f1033b.b();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class h extends C2639q implements Q6.k {
        public h(Object obj) {
            super(1, obj, B3.i.class, "selectAppearance", "selectAppearance(Lcom/elgato/streamdeck/vsd2/KnownHost$Device$Appearance;)V", 0);
        }

        public final void h(KnownHost.Device.Appearance p8) {
            t.g(p8, "p0");
            ((B3.i) this.receiver).g(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((KnownHost.Device.Appearance) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class i extends C2639q implements Function0 {
        public i(Object obj) {
            super(0, obj, B3.i.class, "disconnect", "disconnect()V", 0);
        }

        public final void h() {
            ((B3.i) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1034a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(0);
            this.f1034a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            V3.f.b(B3.g.c(f.f1023b));
            Context context = this.f1034a;
            String strB = com.elgato.streamdeck.a.C0419a.f17668a.b(context);
            t.d(strB);
            p154r3.j.a(context, strB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class k extends C2639q implements Q6.k {
        public k(Object obj) {
            super(1, obj, B3.i.class, "selectForcedProUser", "selectForcedProUser(Lcom/elgato/streamdeck/settings/SettingsViewModel$ForcedProUser;)V", 0);
        }

        public final void h(B3.i.b p8) {
            t.g(p8, "p0");
            ((B3.i) this.receiver).h(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((B3.i.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f1035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(V2.b bVar) {
            super(0);
            this.f1035a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m33invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m33invoke() {
            V2.b bVar = this.f1035a;
            D3.d dVar = new D3.d();
            if (bVar.l() instanceof D3.d) {
                return;
            }
            bVar.o(dVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f1036a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(V2.b bVar) {
            super(0);
            this.f1036a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m34invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m34invoke() {
            V2.b bVar = this.f1036a;
            F3.a aVar = new F3.a();
            if (bVar.l() instanceof F3.a) {
                return;
            }
            bVar.o(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f1037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(V2.b bVar) {
            super(0);
            this.f1037a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m35invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m35invoke() {
            V2.b bVar = this.f1037a;
            C3.j jVar = new C3.j();
            if (bVar.l() instanceof C3.j) {
                return;
            }
            bVar.o(jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f1038a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(V2.b bVar) {
            super(0);
            this.f1038a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m36invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m36invoke() {
            V2.b bVar = this.f1038a;
            A3.l lVar = new A3.l(null, 1, null);
            if (bVar.l() instanceof A3.l) {
                return;
            }
            bVar.o(lVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i8) {
            super(2);
            this.f1040b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f.this.u(interfaceC3163l, F0.a(this.f1040b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(68012214);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(68012214, i8, -1, "com.elgato.streamdeck.settings.SettingsScreen.Content (SettingsScreen.kt:84)");
            }
            boolean z8 = false;
            V2.b bVar = (V2.b) V2.d.e(V2.d.f(), interfaceC3163lP, 0);
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(T3.a.class, false, null, null);
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
            T3.a aVar3 = (T3.a) objG;
            interfaceC3163lP.f(1853070191);
            A5.a aVar4 = new A5.a(B3.i.class, false, null, null);
            A5.h hVar2 = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar2.a()) {
                objG2 = hVar2.h(aVar4, null);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            B3.i iVar = (B3.i) objG2;
            q1 q1VarB = p137p2.a.b(iVar.d(), null, null, null, interfaceC3163lP, 8, 7);
            String strC = iVar.c();
            Context context = (Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g());
            interfaceC3163lP.f(1853070191);
            A5.a aVar5 = new A5.a(G3.n.class, false, null, null);
            A5.h hVar3 = (A5.h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG3 = interfaceC3163lP.g();
            if (objG3 == aVar2.a()) {
                objG3 = hVar3.h(aVar5, null);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            G3.n nVar = (G3.n) objG3;
            Activity activityB = p186v3.a.b(context);
            boolean z9 = !t.c(p199x0.b.b(interfaceC3163lP, 0).a().a(), J2.c.f4070c) && nVar.c();
            if (z9 && nVar.a()) {
                z8 = true;
            }
            K.d(G.f1419a, new g(aVar3, null), interfaceC3163lP, 70);
            H3.e.b(B3.g.b(f1023b), interfaceC3163lP, 8);
            B3.i.c cVar = (B3.i.c) q1VarB.getValue();
            interfaceC3163lP.f(169021501);
            boolean zR = interfaceC3163lP.R(iVar);
            Object objG4 = interfaceC3163lP.g();
            if (zR || objG4 == aVar2.a()) {
                objG4 = new h(iVar);
                interfaceC3163lP.H(objG4);
            }
            X6.h hVar4 = (X6.h) objG4;
            interfaceC3163lP.N();
            interfaceC3163lP.f(169021635);
            boolean zR2 = interfaceC3163lP.R(iVar);
            Object objG5 = interfaceC3163lP.g();
            if (zR2 || objG5 == aVar2.a()) {
                objG5 = new i(iVar);
                interfaceC3163lP.H(objG5);
            }
            X6.h hVar5 = (X6.h) objG5;
            interfaceC3163lP.N();
            j jVar = com.elgato.streamdeck.a.C0419a.f17668a.b(context) != null ? new j(context) : null;
            interfaceC3163lP.f(169022244);
            boolean zR3 = interfaceC3163lP.R(iVar);
            Object objG6 = interfaceC3163lP.g();
            if (zR3 || objG6 == aVar2.a()) {
                objG6 = new k(iVar);
                interfaceC3163lP.H(objG6);
            }
            interfaceC3163lP.N();
            interfaceC3163l2 = interfaceC3163lP;
            B3.g.a(cVar, new l(bVar), new m(bVar), (Q6.k) hVar4, new n(bVar), (Function0) hVar5, new o(bVar), new b(context), jVar, new c(bVar), new d(context, strC), (Q6.k) ((X6.h) objG6), z8, z9, new e(nVar, activityB), interfaceC3163l2, 8, 0, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new C0032f(i8));
        }
    }

    @Override // p210y3.b
    public void s(T t8, InterfaceC3163l interfaceC3163l, int i8) {
        y3.b.a.a(this, t8, interfaceC3163l, i8);
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(653891511);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(653891511, i8, -1, "com.elgato.streamdeck.settings.SettingsScreen.Title (SettingsScreen.kt:81)");
            }
            p210y3.c.a(p194w3.b.f37067v1, null, interfaceC3163lP, 0, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new p(i8));
        }
    }
}
