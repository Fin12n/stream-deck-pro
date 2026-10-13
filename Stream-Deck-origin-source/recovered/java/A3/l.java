package A3;

import C6.G;
import D6.z;
import R0.pkXL.Oitvkwcwn;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.elgato.streamdeck.DiKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.X0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l extends p210y3.a implements p210y3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f648c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f649b;

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
        public final /* synthetic */ Context f650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p.g f651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3160j0 f652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f653d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, p.g gVar, InterfaceC3160j0 interfaceC3160j0, p pVar) {
            super(0);
            this.f650a = context;
            this.f651b = gVar;
            this.f652c = interfaceC3160j0;
            this.f653d = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            A3.g gVar;
            Activity activityA = p186v3.a.a(this.f650a);
            if (activityA == null || (gVar = (A3.g) z.l0(this.f651b.g(), this.f652c.f())) == null) {
                return;
            }
            this.f653d.l(activityA, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c extends C2639q implements Function0 {
        public c(Object obj) {
            super(0, obj, p.class, "restorePurchase", "restorePurchase()V", 0);
        }

        public final void h() {
            ((p) this.receiver).m();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f654a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            V3.f.b(m.e(l.f648c));
            p154r3.j.a(this.f654a, "https://www.elgato.com/s/privacy-policy/");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p.g f655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f656b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p.g gVar, Context context) {
            super(0);
            this.f655a = gVar;
            this.f656b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            p154r3.j.a(this.f656b, this.f655a.f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i8) {
            super(2);
            this.f658b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            l.this.m(interfaceC3163l, F0.a(this.f658b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p.g f659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p.g gVar) {
            super(0);
            this.f659a = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3160j0 invoke() {
            Iterator it = this.f659a.g().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                if (((A3.g) it.next()).n()) {
                    return i8 == -1 ? X0.a(0) : X0.a(i8);
                }
                i8++;
            }
            i8 = -1;
            if (i8 == -1) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum h {
        Keypad,
        Faceplate;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ J6.a f663d = J6.b.a(a());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i8) {
            super(2);
            this.f665b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            l.this.u(interfaceC3163l, F0.a(this.f665b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p210y3.b
    public void s(T t8, InterfaceC3163l interfaceC3163l, int i8) {
        y3.b.a.a(this, t8, interfaceC3163l, i8);
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1553506599);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1553506599, i8, -1, "com.elgato.streamdeck.purchase.PurchaseScreen.Title (PurchaseScreen.kt:61)");
            }
            p210y3.c.a(p194w3.b.f36997X0, null, interfaceC3163lP, 0, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new i(i8));
        }
    }

    public /* synthetic */ l(h hVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? h.Keypad : hVar);
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        int i9;
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2139385896);
        if ((i8 & 14) == 0) {
            if (interfaceC3163lP.R(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2139385896, i9, -1, Oitvkwcwn.zaUErkFLzDyoW);
            }
            Context context = (Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g());
            interfaceC3163lP.f(1853070191);
            e eVar = null;
            A5.a aVar = new A5.a(p.class, false, null, null);
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
            p pVar = (p) objG;
            p.g gVar = (p.g) p137p2.a.b(pVar.h(), null, null, null, interfaceC3163lP, 8, 7).getValue();
            InterfaceC3160j0 interfaceC3160j0 = (InterfaceC3160j0) I0.b.b(new Object[]{gVar.g()}, null, null, new g(gVar), interfaceC3163lP, 8, 6);
            h hVar2 = this.f649b;
            b bVar = new b(context, gVar, interfaceC3160j0, pVar);
            interfaceC3163lP.f(-1178388387);
            boolean zR = interfaceC3163lP.R(pVar);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == aVar2.a()) {
                objG2 = new c(pVar);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            Function0 function0 = (Function0) ((X6.h) objG2);
            d dVar = new d(context);
            if (gVar.f() != null) {
                eVar = new e(gVar, context);
            }
            m.a(hVar2, gVar, interfaceC3160j0, false, bVar, function0, dVar, eVar, interfaceC3163lP, 64, 8);
            interfaceC3163lP = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(i8));
        }
    }

    public l(h source) {
        t.g(source, "source");
        this.f649b = source;
    }
}
