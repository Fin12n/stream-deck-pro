package p202x3;

import C6.G;
import C6.r;
import E1.g;
import I6.l;
import J3.i;
import Q6.o;
import android.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p065h1.I0;
import p101l1.f;
import p191w0.AbstractC3064i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f37327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f37328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3164l0 interfaceC3164l0, boolean z8, G6.d dVar) {
            super(2, dVar);
            this.f37327b = interfaceC3164l0;
            this.f37328c = z8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f37327b, this.f37328c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f37326a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f37327b.setValue(I6.b.a(this.f37328c));
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f37330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f37331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f37329a = z8;
            this.f37330b = function0;
            this.f37331c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f37329a, this.f37330b, interfaceC3163l, F0.a(this.f37331c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f37332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f37333b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f37334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function0 f37335b;

            /* JADX INFO: renamed from: x3.h$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class C0834a extends C2639q implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f37336a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Function0 f37337b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0834a(InterfaceC3164l0 interfaceC3164l0, Function0 function0) {
                    super(0, t.a.class, "cancel", "KeypadStallingDialog$cancel(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;)V", 0);
                    this.f37336a = interfaceC3164l0;
                    this.f37337b = function0;
                }

                public final void h() {
                    h.b(this.f37336a, this.f37337b);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    h();
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3164l0 interfaceC3164l0, Function0 function0) {
                super(2);
                this.f37334a = interfaceC3164l0;
                this.f37335b = function0;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1502211431, i8, -1, "com.elgato.streamdeck.keypad.KeypadStallingDialog.<anonymous>.<anonymous> (KeypadStallingDialog.kt:56)");
                }
                String strB = f.b(p194w3.b.f37051q0, interfaceC3163l, 0);
                String strB2 = f.b(p194w3.b.f37048p0, interfaceC3163l, 0);
                String strB3 = f.b(R.string.cancel, interfaceC3163l, 6);
                interfaceC3163l.f(-557350552);
                boolean zR = interfaceC3163l.R(this.f37334a) | interfaceC3163l.R(this.f37335b);
                InterfaceC3164l0 interfaceC3164l0 = this.f37334a;
                Function0 function0 = this.f37335b;
                Object objG = interfaceC3163l.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new C0834a(interfaceC3164l0, function0);
                    interfaceC3163l.H(objG);
                }
                interfaceC3163l.N();
                i.b(strB, strB2, null, null, null, null, strB3, (Function0) ((X6.h) objG), null, null, null, interfaceC3163l, 0, 0, 1852);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, InterfaceC3164l0 interfaceC3164l0) {
            super(2);
            this.f37332a = function0;
            this.f37333b = interfaceC3164l0;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(924387731, i8, -1, "com.elgato.streamdeck.keypad.KeypadStallingDialog.<anonymous> (KeypadStallingDialog.kt:45)");
            }
            g gVar = new g(false, false, null, false, false, 5, null);
            L0.i iVarA = I0.a(androidx.compose.foundation.layout.e.i(L0.i.f4836a, W3.c.f11463a.k()), "update_dialog");
            Function0 function0 = this.f37332a;
            AbstractC3064i.a(function0, iVarA, gVar, H0.c.b(interfaceC3163l, -1502211431, true, new a(this.f37333b, function0)), interfaceC3163l, 3456, 0);
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
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f37339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f37340c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f37338a = z8;
            this.f37339b = function0;
            this.f37340c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h.a(this.f37338a, this.f37339b, interfaceC3163l, F0.a(this.f37340c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z8) {
            super(0);
            this.f37341a = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3164l0 invoke() {
            return l1.e(Boolean.valueOf(this.f37341a), null, 2, null);
        }
    }

    public static final void a(boolean z8, Function0 onCancel, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        t.g(onCancel, "onCancel");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1927161128);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.c(z8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(onCancel) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1927161128, i9, -1, "com.elgato.streamdeck.keypad.KeypadStallingDialog (KeypadStallingDialog.kt:29)");
            }
            Object[] objArr = new Object[0];
            interfaceC3163lP.f(1264917200);
            int i10 = i9 & 14;
            boolean z9 = i10 == 4;
            Object objG = interfaceC3163lP.g();
            if (z9 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new e(z8);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(objArr, null, null, (Function0) objG, interfaceC3163lP, 8, 6);
            Boolean boolValueOf = Boolean.valueOf(z8);
            interfaceC3163lP.f(1264917259);
            boolean zR = (i10 == 4) | interfaceC3163lP.R(interfaceC3164l0);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == InterfaceC3163l.f38803a.a()) {
                objG2 = new a(interfaceC3164l0, z8, null);
                interfaceC3163lP.H(objG2);
            }
            interfaceC3163lP.N();
            K.d(boolValueOf, (o) objG2, interfaceC3163lP, i10 | 64);
            if (!((Boolean) interfaceC3164l0.getValue()).booleanValue()) {
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                P0 p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new b(z8, onCancel, i8));
                    return;
                }
                return;
            }
            H3.e.b(d(), interfaceC3163lP, 8);
            p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, 924387731, true, new c(onCancel, interfaceC3164l0)), interfaceC3163lP, 196608, 31);
            if (AbstractC3169o.K()) {
                interfaceC3163lP = interfaceC3163lP;
                AbstractC3169o.V();
            }
        }
        interfaceC3163lP = interfaceC3163lP;
        P0 p0V2 = interfaceC3163lP.v();
        if (p0V2 != null) {
            p0V2.a(new d(z8, onCancel, i8));
        }
    }

    public static final void b(InterfaceC3164l0 interfaceC3164l0, Function0 function0) {
        interfaceC3164l0.setValue(Boolean.FALSE);
        function0.invoke();
    }

    public static final V3.i d() {
        return V3.d.c(V3.c.f10602a, V3.c.d.f10652j, new C6.o[0]);
    }
}
