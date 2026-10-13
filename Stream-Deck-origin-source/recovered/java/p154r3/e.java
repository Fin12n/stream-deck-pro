package p154r3;

import A5.f;
import A5.h;
import B3.i;
import C6.G;
import Q6.k;
import Q6.o;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.DiKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p210y3.a implements T2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32417b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements k {
        public c(Object obj) {
            super(1, obj, j.class, "openUrl", "openUrl(Landroid/content/Context;Ljava/lang/String;)V", 1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.f1419a;
        }

        public final void invoke(String p8) {
            t.g(p8, "p0");
            j.a((Context) this.receiver, p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f32420a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar) {
            super(0);
            this.f32420a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m239invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m239invoke() {
            this.f32420a.i();
        }
    }

    /* JADX INFO: renamed from: r3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0720e extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32422b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0720e(int i8) {
            super(2);
            this.f32422b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws f {
            e.this.m(interfaceC3163l, F0.a(this.f32422b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public final Intent b() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "https://elgato.com/s/downloads");
        intent.setType("text/plain");
        return Intent.createChooser(intent, null);
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws f {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1031699307);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(this) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1031699307, i9, -1, "com.elgato.streamdeck.OnboardingScreen.Content (OnboardingScreen.kt:67)");
            }
            Context context = (Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g());
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
            H3.e.b(g.s(f32417b), interfaceC3163lP, 8);
            b bVar = new b(context, this);
            c cVar = new c(context);
            interfaceC3163lP.f(-321651082);
            boolean zR = interfaceC3163lP.R(iVar);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == aVar2.a()) {
                objG2 = new d(iVar);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            g.f(new f(bVar, cVar, (Function0) objG2), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0720e(i8));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f32418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f32419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, e eVar) {
            super(0);
            this.f32418a = context;
            this.f32419b = eVar;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m238invoke() {
            V3.f.b(g.t(e.f32417b));
            this.f32418a.startActivity(this.f32419b.b());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m238invoke();
            return G.f1419a;
        }
    }
}
