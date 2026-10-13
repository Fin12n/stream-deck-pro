package p202x3;

import A5.h;
import B3.i;
import C6.G;
import Q6.k;
import Q6.o;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC1726i;
import com.elgato.streamdeck.DiKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p210y3.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements k {
        public a(Object obj) {
            super(1, obj, i.class, "handleLayout", "handleLayout(Landroidx/compose/ui/layout/LayoutCoordinates;)V", 0);
        }

        public final void h(InterfaceC2247s p8) {
            t.g(p8, "p0");
            ((i) this.receiver).d(p8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((InterfaceC2247s) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2639q implements k {
        public b(Object obj) {
            super(1, obj, i.class, "onPage", "onPage(Z)V", 0);
        }

        public final void h(boolean z8) {
            ((i) this.receiver).f(z8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h(((Boolean) obj).booleanValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements o {
        public c(Object obj) {
            super(2, obj, i.class, "setKey", "setKey(Lcom/elgato/streamdeck/vsd2/keypad/Key;Z)V", 0);
        }

        public final void h(Q3.a p8, boolean z8) {
            t.g(p8, "p0");
            ((i) this.receiver).h(p8, z8);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            h((Q3.a) obj, ((Boolean) obj2).booleanValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class d extends C2639q implements Function0 {
        public d(Object obj) {
            super(0, obj, i.class, "show", "show()V", 0);
        }

        public final void h() {
            ((i) this.receiver).j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: x3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0827e extends C2639q implements Function0 {
        public C0827e(Object obj) {
            super(0, obj, i.class, "disconnect", "disconnect()V", 0);
        }

        public final void h() {
            ((i) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G3.c f37251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f37252b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(G3.c cVar, Activity activity) {
            super(0);
            this.f37251a = cVar;
            this.f37252b = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m289invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m289invoke() {
            this.f37251a.e(this.f37252b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37254b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i8) {
            super(2);
            this.f37254b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            e.this.m(interfaceC3163l, F0.a(this.f37254b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163l2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1802454149);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            interfaceC3163l2 = interfaceC3163lP;
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1802454149, i8, -1, "com.elgato.streamdeck.keypad.KeypadScreen.Content (KeypadScreen.kt:59)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(i.class, false, null, null);
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
            i iVar = (i) objG;
            interfaceC3163lP.f(1853070191);
            A5.a aVar3 = new A5.a(i.class, false, null, null);
            h hVar2 = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG2 = interfaceC3163lP.g();
            if (objG2 == aVar2.a()) {
                objG2 = hVar2.h(aVar3, null);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            i iVar2 = (i) objG2;
            i.a aVar4 = (i.a) p137p2.a.b(iVar.c(), null, null, null, interfaceC3163lP, 8, 7).getValue();
            interfaceC3163lP.f(1853070191);
            A5.a aVar5 = new A5.a(G3.c.class, false, null, null);
            h hVar3 = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG3 = interfaceC3163lP.g();
            if (objG3 == aVar2.a()) {
                objG3 = hVar3.h(aVar5, null);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            G3.c cVar = (G3.c) objG3;
            Activity activityB = p186v3.a.b((Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g()));
            L0.i iVarF = androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null);
            interfaceC3163lP.f(-551049468);
            boolean zR = interfaceC3163lP.R(iVar);
            Object objG4 = interfaceC3163lP.g();
            if (zR || objG4 == aVar2.a()) {
                objG4 = new a(iVar);
                interfaceC3163lP.H(objG4);
            }
            interfaceC3163lP.N();
            L0.i iVarA = androidx.compose.ui.layout.c.a(iVarF, (k) ((X6.h) objG4));
            Q3.b bVarB = aVar4.b();
            C3.b bVarA = aVar4.a();
            interfaceC3163lP.f(-551049349);
            boolean zR2 = interfaceC3163lP.R(iVar);
            Object objG5 = interfaceC3163lP.g();
            if (zR2 || objG5 == aVar2.a()) {
                objG5 = new b(iVar);
                interfaceC3163lP.H(objG5);
            }
            interfaceC3163lP.N();
            k kVar = (k) ((X6.h) objG5);
            interfaceC3163lP.f(-551049309);
            boolean zR3 = interfaceC3163lP.R(iVar);
            Object objG6 = interfaceC3163lP.g();
            if (zR3 || objG6 == aVar2.a()) {
                objG6 = new c(iVar);
                interfaceC3163lP.H(objG6);
            }
            interfaceC3163lP.N();
            o oVar = (o) ((X6.h) objG6);
            interfaceC3163lP.f(-551049267);
            boolean zR4 = interfaceC3163lP.R(iVar2);
            Object objG7 = interfaceC3163lP.g();
            if (zR4 || objG7 == aVar2.a()) {
                objG7 = new d(iVar2);
                interfaceC3163lP.H(objG7);
            }
            interfaceC3163lP.N();
            p202x3.f.b(iVarA, bVarB, bVarA, kVar, oVar, (Function0) ((X6.h) objG7), interfaceC3163lP, 0, 0);
            boolean zC = aVar4.c();
            interfaceC3163lP.f(-551049188);
            boolean zR5 = interfaceC3163lP.R(iVar2);
            Object objG8 = interfaceC3163lP.g();
            if (zR5 || objG8 == aVar2.a()) {
                objG8 = new C0827e(iVar2);
                interfaceC3163lP.H(objG8);
            }
            interfaceC3163lP.N();
            h.a(zC, (Function0) ((X6.h) objG8), interfaceC3163lP, 0);
            K3.b.a(interfaceC3163lP, 0);
            p137p2.c.a(AbstractC1726i.a.ON_START, null, new f(cVar, activityB), interfaceC3163lP, 6, 2);
            interfaceC3163l2 = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new g(i8));
        }
    }
}
