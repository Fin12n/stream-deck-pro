package J3;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p110m1.x;
import p191w0.AbstractC3085t;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f4288a = str;
        }

        public final void b(x clearAndSetSemantics) {
            t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
            p110m1.u.X(clearAndSetSemantics, "keypad_settings_button");
            p110m1.u.M(clearAndSetSemantics, this.f4288a);
            p110m1.u.S(clearAndSetSemantics, p110m1.h.f29507b.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f4289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f4290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4292d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L0.i iVar, Function0 function0, int i8, int i9) {
            super(2);
            this.f4289a = iVar;
            this.f4290b = function0;
            this.f4291c = i8;
            this.f4292d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            p.a(this.f4289a, this.f4290b, interfaceC3163l, F0.a(this.f4291c | 1), this.f4292d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(L0.i iVar, Function0 onClick, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        t.g(onClick, "onClick");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1731066661);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.l(onClick) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i11 != 0) {
                iVar = L0.i.f4836a;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1731066661, i10, -1, "com.elgato.streamdeck.ui.components.SettingsButton (SettingsButton.kt:33)");
            }
            String strB = p101l1.f.b(p194w3.b.f37063u0, interfaceC3163lP, 0);
            L0.i iVarB = androidx.compose.foundation.layout.a.b(iVar, 1.0f, false, 2, null);
            interfaceC3163lP.f(-18381288);
            boolean zR = interfaceC3163lP.R(strB);
            Object objG = interfaceC3163lP.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(strB);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            AbstractC3085t.b(onClick, p110m1.n.a(iVarB, (Q6.k) objG), false, p135p0.g.f(), null, null, null, null, g.f4165a.a(), interfaceC3163lP, ((i10 >> 3) & 14) | 100663296, 244);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar, onClick, i8, i9));
        }
    }
}
