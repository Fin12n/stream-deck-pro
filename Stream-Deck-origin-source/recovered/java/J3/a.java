package J3;

import C6.G;
import P2.Lsk.mHPawN;
import R0.C1598l0;
import R0.N0;
import R0.T0;
import android.view.KeyEvent;
import androidx.compose.foundation.FocusableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2623a;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p009b.C;
import p009b.F;
import p017b7.AbstractC1789i;
import p017b7.J;
import p037e0.AbstractC2207c;
import p038e1.AbstractC2252x;
import p038e1.H;
import p046f0.AbstractC2282j;
import p056g1.InterfaceC2343g;
import p082j0.AbstractC2601e;
import p082j0.InterfaceC2608l;
import p082j0.T;
import p082j0.f0;
import p082j0.i0;
import p191w0.AbstractC3069k0;
import p191w0.AbstractC3091w;
import p191w0.B0;
import p191w0.C0;
import p191w0.C3061g0;
import p191w0.C3063h0;
import p191w0.C3070l;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.C3190z;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.K;
import p215z0.P0;
import p215z0.R0;
import p215z0.q1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: J3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0150a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f4075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B0 f4076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f4077d;

        /* JADX INFO: renamed from: J3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0151a extends C2639q implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f4078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0 f4079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f4080c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0151a(J j8, B0 b8, Function0 function0) {
                super(0, t.a.class, "close", "BottomSheet_dNgdfXs$close(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V", 0);
                this.f4078a = j8;
                this.f4079b = b8;
                this.f4080c = function0;
            }

            public final void h() {
                a.b(this.f4078a, this.f4079b, this.f4080c);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                h();
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0150a(Q6.k kVar, J j8, B0 b8, Function0 function0) {
            super(0);
            this.f4074a = kVar;
            this.f4075b = j8;
            this.f4076c = b8;
            this.f4077d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m62invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m62invoke() {
            Q6.k kVar = this.f4074a;
            if (kVar != null) {
                kVar.invoke(new C0151a(this.f4075b, this.f4076c, this.f4077d));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f4081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F f8) {
            super(1);
            this.f4081a = f8;
        }

        public final Boolean b(KeyEvent it) {
            C cB;
            t.g(it, "it");
            if (!Z0.a.p(Z0.d.a(it), Z0.a.f12684b.a()) || !Z0.c.e(Z0.d.b(it), Z0.c.f12836a.b()) || it.isCanceled()) {
                return Boolean.FALSE;
            }
            F f8 = this.f4081a;
            if (f8 != null && (cB = f8.b()) != null) {
                cB.l();
            }
            return Boolean.TRUE;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Z0.b) obj).f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.p f4082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f4083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B0 f4084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f4085d;

        /* JADX INFO: renamed from: J3.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0152a extends C2639q implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f4086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B0 f4087b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Function0 f4088c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0152a(J j8, B0 b8, Function0 function0) {
                super(0, t.a.class, "close", "BottomSheet_dNgdfXs$close(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V", 0);
                this.f4086a = j8;
                this.f4087b = b8;
                this.f4088c = function0;
            }

            public final void h() {
                a.b(this.f4086a, this.f4087b, this.f4088c);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                h();
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q6.p pVar, J j8, B0 b8, Function0 function0) {
            super(2);
            this.f4082a = pVar;
            this.f4083b = j8;
            this.f4084c = b8;
            this.f4085d = function0;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1117916674, i8, -1, "com.elgato.streamdeck.ui.components.BottomSheet.<anonymous>.<anonymous> (BottomSheet.kt:130)");
            }
            Q6.p pVar = this.f4082a;
            if (pVar != null) {
                pVar.invoke(new C0152a(this.f4083b, this.f4084c, this.f4085d), interfaceC3163l, 0);
            }
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
    public static final class d extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.focus.g f4089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.p f4090b;

        /* JADX INFO: renamed from: J3.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0153a extends C2639q implements Function0 {
            public C0153a(Object obj) {
                super(0, obj, androidx.compose.ui.focus.g.class, "requestFocus", "requestFocus()V", 0);
            }

            public final void h() {
                ((androidx.compose.ui.focus.g) this.receiver).e();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                h();
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.focus.g gVar, Q6.p pVar) {
            super(3);
            this.f4089a = gVar;
            this.f4090b = pVar;
        }

        public final void b(InterfaceC2608l ModalBottomSheet, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((i8 & 14) == 0) {
                i8 |= interfaceC3163l.R(ModalBottomSheet) ? 4 : 2;
            }
            if ((i8 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(306210622, i8, -1, "com.elgato.streamdeck.ui.components.BottomSheet.<anonymous>.<anonymous> (BottomSheet.kt:137)");
            }
            androidx.compose.ui.focus.g gVar = this.f4089a;
            interfaceC3163l.f(-678095840);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0153a(gVar);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            K.g((Function0) ((X6.h) objG), interfaceC3163l, 0);
            this.f4090b.invoke(ModalBottomSheet, interfaceC3163l, Integer.valueOf(i8 & 14));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f4091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L0.i f4092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T0 f4093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ B0 f4094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Q6.p f4095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f4096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f4097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4098h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Q6.p f4099i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f4100j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f4101k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, L0.i iVar, T0 t8, B0 b8, Q6.p pVar, long j8, long j9, Q6.k kVar, Q6.p pVar2, int i8, int i9) {
            super(2);
            this.f4091a = function0;
            this.f4092b = iVar;
            this.f4093c = t8;
            this.f4094d = b8;
            this.f4095e = pVar;
            this.f4096f = j8;
            this.f4097g = j9;
            this.f4098h = kVar;
            this.f4099i = pVar2;
            this.f4100j = i8;
            this.f4101k = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f4091a, this.f4092b, this.f4093c, this.f4094d, this.f4095e, this.f4096f, this.f4097g, this.f4098h, this.f4099i, interfaceC3163l, F0.a(this.f4100j | 1), this.f4101k);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B0 f4103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(B0 b8, G6.d dVar) {
            super(2, dVar);
            this.f4103b = b8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new f(this.f4103b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f4102a;
            if (i8 == 0) {
                C6.r.b(obj);
                B0 b8 = this.f4103b;
                this.f4102a = 1;
                if (b8.k(this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f4104a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0) {
            super(1);
            this.f4104a = function0;
        }

        public final void b(Throwable th) {
            this.f4104a.invoke();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f4105a;

        /* JADX INFO: renamed from: J3.a$h$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0154a extends u implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f4106a;

            /* JADX INFO: renamed from: J3.a$h$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0155a extends u implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ p210y3.b f4107a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0155a(p210y3.b bVar) {
                    super(2);
                    this.f4107a = bVar;
                }

                public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                    if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1239915869, i8, -1, "com.elgato.streamdeck.ui.components.NavigationBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheet.kt:63)");
                    }
                    p210y3.b bVar = this.f4107a;
                    if (bVar != null) {
                        bVar.u(interfaceC3163l, 0);
                    }
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

            /* JADX INFO: renamed from: J3.a$h$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends u implements Q6.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ p210y3.b f4108a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(p210y3.b bVar) {
                    super(3);
                    this.f4108a = bVar;
                }

                public final void b(T it, InterfaceC3163l interfaceC3163l, int i8) {
                    t.g(it, "it");
                    if ((i8 & 14) == 0) {
                        i8 |= interfaceC3163l.R(it) ? 4 : 2;
                    }
                    if ((i8 & 91) == 18 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1593342998, i8, -1, "com.elgato.streamdeck.ui.components.NavigationBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheet.kt:64)");
                    }
                    p210y3.b bVar = this.f4108a;
                    if (bVar != null) {
                        bVar.s(it, interfaceC3163l, i8 & 14);
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                }

                @Override // Q6.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((T) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                    return G.f1419a;
                }
            }

            /* JADX INFO: renamed from: J3.a$h$a$c */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class c extends C2623a implements Function0 {
                public c(Object obj) {
                    super(0, obj, V2.b.class, "pop", "pop()Z", 8);
                }

                public final void b() {
                    ((V2.b) this.f28792a).n();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    b();
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0154a(V2.b bVar) {
                super(3);
                this.f4106a = bVar;
            }

            public final void b(Function0 closeSheet, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(closeSheet, "closeSheet");
                if ((i8 & 14) == 0) {
                    i8 |= interfaceC3163l.l(closeSheet) ? 4 : 2;
                }
                if ((i8 & 91) == 18 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-636200108, i8, -1, "com.elgato.streamdeck.ui.components.NavigationBottomSheet.<anonymous>.<anonymous> (BottomSheet.kt:60)");
                }
                T2.a aVarK = this.f4106a.k();
                p210y3.b bVar = aVarK instanceof p210y3.b ? (p210y3.b) aVarK : null;
                B3.h.a(closeSheet, H0.c.b(interfaceC3163l, -1239915869, true, new C0155a(bVar)), H0.c.b(interfaceC3163l, -1593342998, true, new b(bVar)), this.f4106a.e(), new c(this.f4106a), interfaceC3163l, (i8 & 14) | 432, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((Function0) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f4109a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(V2.b bVar) {
                super(1);
                this.f4109a = bVar;
            }

            public final void b(Function0 closeSheet) {
                t.g(closeSheet, "closeSheet");
                if (this.f4109a.e()) {
                    this.f4109a.n();
                } else {
                    closeSheet.invoke();
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Function0) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f4110a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(V2.b bVar) {
                super(3);
                this.f4110a = bVar;
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }

            public final void b(InterfaceC2608l BottomSheet, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(BottomSheet, "$this$BottomSheet");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-1027518242, i8, -1, mHPawN.TQpFQ);
                }
                Y2.g.b(this.f4110a, null, null, null, null, interfaceC3163l, V2.b.f10520j, 30);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(3);
            this.f4105a = function0;
        }

        public final void b(V2.b navigator, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(navigator, "navigator");
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(navigator) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1839079251, i9, -1, "com.elgato.streamdeck.ui.components.NavigationBottomSheet.<anonymous> (BottomSheet.kt:56)");
            }
            a.a(this.f4105a, null, N0.a(), null, H0.c.b(interfaceC3163l, -636200108, true, new C0154a(navigator)), 0L, 0L, new b(navigator), H0.c.b(interfaceC3163l, -1027518242, true, new c(navigator)), interfaceC3163l, 100688256, 106);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((V2.b) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T2.a f4111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f4112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(T2.a aVar, Function0 function0, int i8) {
            super(2);
            this.f4111a = aVar;
            this.f4112b = function0;
            this.f4113c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.c(this.f4111a, this.f4112b, interfaceC3163l, F0.a(this.f4113c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f4114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f4115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j8, q1 q1Var) {
            super(1);
            this.f4114a = j8;
            this.f4115b = q1Var;
        }

        public final void b(T0.f Canvas) {
            t.g(Canvas, "$this$Canvas");
            T0.f.w1(Canvas, this.f4114a, 0L, 0L, a.e(this.f4115b), null, null, 0, 118, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f4116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f4117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j8, boolean z8, int i8) {
            super(2);
            this.f4116a = j8;
            this.f4117b = z8;
            this.f4118c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.d(this.f4116a, this.f4117b, interfaceC3163l, F0.a(this.f4118c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x017f  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01df  */
    /* JADX WARN: Code duplicated, block: B:152:0x0200  */
    /* JADX WARN: Code duplicated, block: B:155:0x022b  */
    /* JADX WARN: Code duplicated, block: B:158:0x024d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0251  */
    /* JADX WARN: Code duplicated, block: B:163:0x0291  */
    /* JADX WARN: Code duplicated, block: B:166:0x029d  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:175:0x0302  */
    /* JADX WARN: Code duplicated, block: B:176:0x0306  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:183:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v27 */
    public static final void a(Function0 onDismissRequest, L0.i iVar, T0 t8, B0 b8, Q6.p pVar, long j8, long j9, Q6.k kVar, Q6.p content, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        L0.i iVar2;
        T0 t0D;
        B0 b0N;
        int i11;
        int i12;
        long j10;
        long jC;
        int i13;
        Q6.k kVar2;
        int i14;
        int i15;
        L0.i iVar3;
        int i16;
        Q6.p pVarA;
        long jB;
        Q6.p pVar2;
        T0 t9;
        int i17;
        Q6.k kVar3;
        L0.i iVar4;
        Object objG;
        InterfaceC3163l.a aVar;
        Object objG2;
        C0 c0J;
        C0 c8;
        boolean z8;
        int iA;
        Function0 function0A;
        InterfaceC3163l interfaceC3163lA;
        Q6.o oVarB;
        boolean z9;
        ?? r9;
        InterfaceC3163l interfaceC3163l2;
        T0 t10;
        long j11;
        Q6.k kVar4;
        B0 b9;
        long j12;
        L0.i iVar5;
        Q6.p pVar3;
        P0 p0V;
        int i18;
        int i19;
        t.g(onDismissRequest, "onDismissRequest");
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1332677633);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.l(onDismissRequest) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i20 = i9 & 2;
        if (i20 == 0) {
            if ((i8 & 112) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 32 : 16;
            }
            if ((i8 & 896) == 0) {
                if ((i9 & 4) == 0) {
                    t0D = t8;
                    int i21 = interfaceC3163lP.R(t0D) ? 256 : 128;
                    i10 |= i21;
                } else {
                    t0D = t8;
                }
                i10 |= i21;
            } else {
                t0D = t8;
            }
            if ((i8 & 7168) == 0) {
                if ((i9 & 8) == 0) {
                    b0N = b8;
                    int i22 = interfaceC3163lP.R(b0N) ? 2048 : 1024;
                    i10 |= i22;
                } else {
                    b0N = b8;
                }
                i10 |= i22;
            } else {
                b0N = b8;
            }
            i11 = i9 & 16;
            if (i11 != 0) {
                if ((i8 & 57344) == 0) {
                    if (interfaceC3163lP.l(pVar)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i10 |= i12;
                }
                if ((i8 & 458752) == 0) {
                    j10 = j8;
                    if ((i9 & 32) == 0 || !interfaceC3163lP.j(j10)) {
                        i19 = 65536;
                    } else {
                        i19 = 131072;
                    }
                    i10 |= i19;
                } else {
                    j10 = j8;
                }
                if ((i8 & 3670016) == 0) {
                    jC = j9;
                    if ((i9 & 64) == 0 || !interfaceC3163lP.j(jC)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i10 |= i18;
                } else {
                    jC = j9;
                }
                i13 = i9 & 128;
                if (i13 != 0) {
                    i10 |= 12582912;
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar;
                    if ((i8 & 29360128) == 0) {
                        if (interfaceC3163lP.l(kVar2)) {
                            i14 = 8388608;
                        } else {
                            i14 = 4194304;
                        }
                        i10 |= i14;
                    }
                }
                if ((i9 & 256) != 0) {
                    if ((i8 & 234881024) == 0) {
                        if (interfaceC3163lP.l(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i10) == 38347922 || !interfaceC3163lP.s()) {
                        interfaceC3163lP.o();
                        if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                            if (i20 != 0) {
                                iVar3 = L0.i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if ((i9 & 4) != 0) {
                                i10 &= -897;
                                t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                                i16 = 6;
                            } else {
                                i16 = 6;
                            }
                            L0.i iVar6 = iVar3;
                            if ((i9 & 8) != 0) {
                                b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                                i10 &= -7169;
                            } else {
                                b0N = b0N;
                            }
                            if (i11 != 0) {
                                pVarA = J3.f.f4162a.a();
                            } else {
                                pVarA = pVar;
                            }
                            if ((i9 & 32) != 0) {
                                jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                                i10 &= -458753;
                            } else {
                                jB = j10;
                            }
                            if ((i9 & 64) != 0) {
                                jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                                i10 &= -3670017;
                            }
                            int i23 = i10;
                            pVar2 = pVarA;
                            t9 = t0D;
                            i17 = i23;
                            if (i13 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            iVar4 = iVar6;
                        } else {
                            interfaceC3163lP.z();
                            if ((i9 & 4) != 0) {
                                i10 &= -897;
                            }
                            if ((i9 & 8) != 0) {
                                i10 &= -7169;
                            }
                            if ((i9 & 32) != 0) {
                                i10 &= -458753;
                            }
                            if ((i9 & 64) != 0) {
                                i10 &= -3670017;
                            }
                            iVar4 = iVar2;
                            jB = j10;
                            kVar3 = kVar2;
                            t9 = t0D;
                            i17 = i10;
                            pVar2 = pVar;
                        }
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                        }
                        interfaceC3163lP.f(773894976);
                        interfaceC3163lP.f(-492369756);
                        objG = interfaceC3163lP.g();
                        aVar = InterfaceC3163l.f38803a;
                        if (objG == aVar.a()) {
                            C3190z c3190z = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                            interfaceC3163lP.H(c3190z);
                            objG = c3190z;
                        }
                        interfaceC3163lP.N();
                        J jA = ((C3190z) objG).a();
                        interfaceC3163lP.N();
                        interfaceC3163lP.f(-1974480898);
                        objG2 = interfaceC3163lP.g();
                        if (objG2 == aVar.a()) {
                            objG2 = new androidx.compose.ui.focus.g();
                            interfaceC3163lP.H(objG2);
                        }
                        androidx.compose.ui.focus.g gVar = (androidx.compose.ui.focus.g) objG2;
                        interfaceC3163lP.N();
                        T0 t11 = t9;
                        F fA = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                        c0J = b0N.j();
                        long j13 = jC;
                        c8 = C0.Hidden;
                        if (c0J != c8) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        int i24 = i17;
                        p018c.d.a(z8, new C0150a(kVar3, jA, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                        interfaceC3163lP.f(733328855);
                        L0.i.a aVar2 = L0.i.f4836a;
                        H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                        Q6.k kVar5 = kVar3;
                        interfaceC3163lP.f(-1323940314);
                        iA = AbstractC3157i.a(interfaceC3163lP, 0);
                        InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
                        InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
                        function0A = aVar3.a();
                        Q6.p pVarB = AbstractC2252x.b(aVar2);
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
                        long j14 = jB;
                        v1.b(interfaceC3163lA, hG, aVar3.c());
                        v1.b(interfaceC3163lA, interfaceC3184wE, aVar3.e());
                        oVarB = aVar3.b();
                        if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                            interfaceC3163lA.H(Integer.valueOf(iA));
                            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                        }
                        pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                        interfaceC3163lP.f(2058660585);
                        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                        C3070l c3070l = C3070l.f36205a;
                        long jE = c3070l.e(interfaceC3163lP, 6);
                        if (b0N.j() != c8) {
                            r9 = 0;
                            z9 = true;
                        } else {
                            z9 = false;
                            r9 = 0;
                        }
                        d(jE, z9, interfaceC3163lP, r9);
                        L0.i iVar7 = iVar4;
                        interfaceC3163l2 = interfaceC3163lP;
                        Q6.p pVar4 = pVar2;
                        B0 b10 = b0N;
                        AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar), r9, null, 3, null), new b(fA)), b10, 0.0f, t11, j14, j13, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA, b0N, onDismissRequest)), f0.d(c3070l.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar, content)), interfaceC3163l2, (i24 & 14) | 918552576 | ((i24 >> 3) & 896) | ((i24 << 6) & 57344) | (i24 & 458752) | (i24 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                        interfaceC3163l2.N();
                        interfaceC3163l2.O();
                        interfaceC3163l2.N();
                        interfaceC3163l2.N();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        t10 = t11;
                        j11 = j13;
                        kVar4 = kVar5;
                        b9 = b10;
                        j12 = j14;
                        iVar5 = iVar7;
                        pVar3 = pVar4;
                    } else {
                        interfaceC3163lP.z();
                        interfaceC3163l2 = interfaceC3163lP;
                        iVar5 = iVar2;
                        t10 = t0D;
                        pVar3 = pVar;
                        kVar4 = kVar2;
                        j11 = jC;
                        b9 = b0N;
                        j12 = j10;
                    }
                    p0V = interfaceC3163l2.v();
                    if (p0V != null) {
                        p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
                    }
                }
                i15 = 100663296;
                i10 |= i15;
                if ((191739611 & i10) == 38347922) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar8 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i25 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i25;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar8;
                    } else {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar9 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i26 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i26;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar9;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                    }
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG == aVar.a()) {
                        C3190z c3190z2 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z2);
                        objG = c3190z2;
                    }
                    interfaceC3163lP.N();
                    J jA2 = ((C3190z) objG).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-1974480898);
                    objG2 = interfaceC3163lP.g();
                    if (objG2 == aVar.a()) {
                        objG2 = new androidx.compose.ui.focus.g();
                        interfaceC3163lP.H(objG2);
                    }
                    androidx.compose.ui.focus.g gVar2 = (androidx.compose.ui.focus.g) objG2;
                    interfaceC3163lP.N();
                    T0 t12 = t9;
                    F fA2 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                    c0J = b0N.j();
                    long j15 = jC;
                    c8 = C0.Hidden;
                    if (c0J != c8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i27 = i17;
                    p018c.d.a(z8, new C0150a(kVar3, jA2, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.f(733328855);
                    L0.i.a aVar4 = L0.i.f4836a;
                    H hG2 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                    Q6.k kVar6 = kVar3;
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE2 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar5 = InterfaceC2343g.f23596Q;
                    function0A = aVar5.a();
                    Q6.p pVarB2 = AbstractC2252x.b(aVar4);
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
                    long j16 = jB;
                    v1.b(interfaceC3163lA, hG2, aVar5.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE2, aVar5.e());
                    oVarB = aVar5.b();
                    if (interfaceC3163lA.m()) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    } else {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB2.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f14485a;
                    C3070l c3070l2 = C3070l.f36205a;
                    long jE2 = c3070l2.e(interfaceC3163lP, 6);
                    if (b0N.j() != c8) {
                        r9 = 0;
                        z9 = true;
                    } else {
                        z9 = false;
                        r9 = 0;
                    }
                    d(jE2, z9, interfaceC3163lP, r9);
                    L0.i iVar10 = iVar4;
                    interfaceC3163l2 = interfaceC3163lP;
                    Q6.p pVar5 = pVar2;
                    B0 b11 = b0N;
                    AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar2), r9, null, 3, null), new b(fA2)), b11, 0.0f, t12, j16, j15, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA2, b0N, onDismissRequest)), f0.d(c3070l2.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar2, content)), interfaceC3163l2, (i27 & 14) | 918552576 | ((i27 >> 3) & 896) | ((i27 << 6) & 57344) | (i27 & 458752) | (i27 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    t10 = t12;
                    j11 = j15;
                    kVar4 = kVar6;
                    b9 = b11;
                    j12 = j16;
                    iVar5 = iVar10;
                    pVar3 = pVar5;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar11 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i28 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i28;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar11;
                    } else {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar12 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i29 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i29;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar12;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                    }
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG == aVar.a()) {
                        C3190z c3190z3 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z3);
                        objG = c3190z3;
                    }
                    interfaceC3163lP.N();
                    J jA3 = ((C3190z) objG).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-1974480898);
                    objG2 = interfaceC3163lP.g();
                    if (objG2 == aVar.a()) {
                        objG2 = new androidx.compose.ui.focus.g();
                        interfaceC3163lP.H(objG2);
                    }
                    androidx.compose.ui.focus.g gVar3 = (androidx.compose.ui.focus.g) objG2;
                    interfaceC3163lP.N();
                    T0 t13 = t9;
                    F fA3 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                    c0J = b0N.j();
                    long j17 = jC;
                    c8 = C0.Hidden;
                    if (c0J != c8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i210 = i17;
                    p018c.d.a(z8, new C0150a(kVar3, jA3, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.f(733328855);
                    L0.i.a aVar6 = L0.i.f4836a;
                    H hG3 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                    Q6.k kVar7 = kVar3;
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE3 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar7 = InterfaceC2343g.f23596Q;
                    function0A = aVar7.a();
                    Q6.p pVarB3 = AbstractC2252x.b(aVar6);
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
                    long j18 = jB;
                    v1.b(interfaceC3163lA, hG3, aVar7.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE3, aVar7.e());
                    oVarB = aVar7.b();
                    if (interfaceC3163lA.m()) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    } else {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB3.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.f14485a;
                    C3070l c3070l3 = C3070l.f36205a;
                    long jE3 = c3070l3.e(interfaceC3163lP, 6);
                    if (b0N.j() != c8) {
                        r9 = 0;
                        z9 = true;
                    } else {
                        z9 = false;
                        r9 = 0;
                    }
                    d(jE3, z9, interfaceC3163lP, r9);
                    L0.i iVar13 = iVar4;
                    interfaceC3163l2 = interfaceC3163lP;
                    Q6.p pVar6 = pVar2;
                    B0 b12 = b0N;
                    AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar3), r9, null, 3, null), new b(fA3)), b12, 0.0f, t13, j18, j17, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA3, b0N, onDismissRequest)), f0.d(c3070l3.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar3, content)), interfaceC3163l2, (i210 & 14) | 918552576 | ((i210 >> 3) & 896) | ((i210 << 6) & 57344) | (i210 & 458752) | (i210 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    t10 = t13;
                    j11 = j17;
                    kVar4 = kVar7;
                    b9 = b12;
                    j12 = j18;
                    iVar5 = iVar13;
                    pVar3 = pVar6;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
                }
            }
            i10 |= 24576;
            if ((i8 & 458752) == 0) {
                j10 = j8;
                if ((i9 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i10 |= i19;
            } else {
                j10 = j8;
            }
            if ((i8 & 3670016) == 0) {
                jC = j9;
                if ((i9 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            } else {
                jC = j9;
            }
            i13 = i9 & 128;
            if (i13 != 0) {
                i10 |= 12582912;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(kVar2)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i10 |= i14;
                }
            }
            if ((i9 & 256) != 0) {
                if ((i8 & 234881024) == 0) {
                    if (interfaceC3163lP.l(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i10) == 38347922) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar14 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i211 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i211;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar14;
                    } else {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar15 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i212 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i212;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar15;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                    }
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG == aVar.a()) {
                        C3190z c3190z4 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z4);
                        objG = c3190z4;
                    }
                    interfaceC3163lP.N();
                    J jA4 = ((C3190z) objG).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-1974480898);
                    objG2 = interfaceC3163lP.g();
                    if (objG2 == aVar.a()) {
                        objG2 = new androidx.compose.ui.focus.g();
                        interfaceC3163lP.H(objG2);
                    }
                    androidx.compose.ui.focus.g gVar4 = (androidx.compose.ui.focus.g) objG2;
                    interfaceC3163lP.N();
                    T0 t14 = t9;
                    F fA4 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                    c0J = b0N.j();
                    long j19 = jC;
                    c8 = C0.Hidden;
                    if (c0J != c8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i213 = i17;
                    p018c.d.a(z8, new C0150a(kVar3, jA4, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.f(733328855);
                    L0.i.a aVar8 = L0.i.f4836a;
                    H hG4 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                    Q6.k kVar8 = kVar3;
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE4 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar9 = InterfaceC2343g.f23596Q;
                    function0A = aVar9.a();
                    Q6.p pVarB4 = AbstractC2252x.b(aVar8);
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
                    long j110 = jB;
                    v1.b(interfaceC3163lA, hG4, aVar9.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE4, aVar9.e());
                    oVarB = aVar9.b();
                    if (interfaceC3163lA.m()) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    } else {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB4.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.f14485a;
                    C3070l c3070l4 = C3070l.f36205a;
                    long jE4 = c3070l4.e(interfaceC3163lP, 6);
                    if (b0N.j() != c8) {
                        r9 = 0;
                        z9 = true;
                    } else {
                        z9 = false;
                        r9 = 0;
                    }
                    d(jE4, z9, interfaceC3163lP, r9);
                    L0.i iVar16 = iVar4;
                    interfaceC3163l2 = interfaceC3163lP;
                    Q6.p pVar7 = pVar2;
                    B0 b13 = b0N;
                    AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar4), r9, null, 3, null), new b(fA4)), b13, 0.0f, t14, j110, j19, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA4, b0N, onDismissRequest)), f0.d(c3070l4.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar4, content)), interfaceC3163l2, (i213 & 14) | 918552576 | ((i213 >> 3) & 896) | ((i213 << 6) & 57344) | (i213 & 458752) | (i213 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    t10 = t14;
                    j11 = j19;
                    kVar4 = kVar8;
                    b9 = b13;
                    j12 = j110;
                    iVar5 = iVar16;
                    pVar3 = pVar7;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar17 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i214 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i214;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar17;
                    } else {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar18 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i215 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i215;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar18;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                    }
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG == aVar.a()) {
                        C3190z c3190z5 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z5);
                        objG = c3190z5;
                    }
                    interfaceC3163lP.N();
                    J jA5 = ((C3190z) objG).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-1974480898);
                    objG2 = interfaceC3163lP.g();
                    if (objG2 == aVar.a()) {
                        objG2 = new androidx.compose.ui.focus.g();
                        interfaceC3163lP.H(objG2);
                    }
                    androidx.compose.ui.focus.g gVar5 = (androidx.compose.ui.focus.g) objG2;
                    interfaceC3163lP.N();
                    T0 t15 = t9;
                    F fA5 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                    c0J = b0N.j();
                    long j111 = jC;
                    c8 = C0.Hidden;
                    if (c0J != c8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i216 = i17;
                    p018c.d.a(z8, new C0150a(kVar3, jA5, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.f(733328855);
                    L0.i.a aVar10 = L0.i.f4836a;
                    H hG5 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                    Q6.k kVar9 = kVar3;
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE5 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar11 = InterfaceC2343g.f23596Q;
                    function0A = aVar11.a();
                    Q6.p pVarB5 = AbstractC2252x.b(aVar10);
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
                    long j112 = jB;
                    v1.b(interfaceC3163lA, hG5, aVar11.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE5, aVar11.e());
                    oVarB = aVar11.b();
                    if (interfaceC3163lA.m()) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    } else {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB5.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    androidx.compose.foundation.layout.b bVar5 = androidx.compose.foundation.layout.b.f14485a;
                    C3070l c3070l5 = C3070l.f36205a;
                    long jE5 = c3070l5.e(interfaceC3163lP, 6);
                    if (b0N.j() != c8) {
                        r9 = 0;
                        z9 = true;
                    } else {
                        z9 = false;
                        r9 = 0;
                    }
                    d(jE5, z9, interfaceC3163lP, r9);
                    L0.i iVar19 = iVar4;
                    interfaceC3163l2 = interfaceC3163lP;
                    Q6.p pVar8 = pVar2;
                    B0 b14 = b0N;
                    AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar5), r9, null, 3, null), new b(fA5)), b14, 0.0f, t15, j112, j111, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA5, b0N, onDismissRequest)), f0.d(c3070l5.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar5, content)), interfaceC3163l2, (i216 & 14) | 918552576 | ((i216 >> 3) & 896) | ((i216 << 6) & 57344) | (i216 & 458752) | (i216 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    t10 = t15;
                    j11 = j111;
                    kVar4 = kVar9;
                    b9 = b14;
                    j12 = j112;
                    iVar5 = iVar19;
                    pVar3 = pVar8;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
                }
            }
            i15 = 100663296;
            i10 |= i15;
            if ((191739611 & i10) == 38347922) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar110 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i217 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i217;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar110;
                } else {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar111 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i218 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i218;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar111;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                }
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG == aVar.a()) {
                    C3190z c3190z6 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z6);
                    objG = c3190z6;
                }
                interfaceC3163lP.N();
                J jA6 = ((C3190z) objG).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-1974480898);
                objG2 = interfaceC3163lP.g();
                if (objG2 == aVar.a()) {
                    objG2 = new androidx.compose.ui.focus.g();
                    interfaceC3163lP.H(objG2);
                }
                androidx.compose.ui.focus.g gVar6 = (androidx.compose.ui.focus.g) objG2;
                interfaceC3163lP.N();
                T0 t16 = t9;
                F fA6 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                c0J = b0N.j();
                long j113 = jC;
                c8 = C0.Hidden;
                if (c0J != c8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i219 = i17;
                p018c.d.a(z8, new C0150a(kVar3, jA6, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                interfaceC3163lP.f(733328855);
                L0.i.a aVar12 = L0.i.f4836a;
                H hG6 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                Q6.k kVar10 = kVar3;
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE6 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar13 = InterfaceC2343g.f23596Q;
                function0A = aVar13.a();
                Q6.p pVarB6 = AbstractC2252x.b(aVar12);
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
                long j114 = jB;
                v1.b(interfaceC3163lA, hG6, aVar13.c());
                v1.b(interfaceC3163lA, interfaceC3184wE6, aVar13.e());
                oVarB = aVar13.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB6.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar6 = androidx.compose.foundation.layout.b.f14485a;
                C3070l c3070l6 = C3070l.f36205a;
                long jE6 = c3070l6.e(interfaceC3163lP, 6);
                if (b0N.j() != c8) {
                    r9 = 0;
                    z9 = true;
                } else {
                    z9 = false;
                    r9 = 0;
                }
                d(jE6, z9, interfaceC3163lP, r9);
                L0.i iVar112 = iVar4;
                interfaceC3163l2 = interfaceC3163lP;
                Q6.p pVar9 = pVar2;
                B0 b15 = b0N;
                AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar6), r9, null, 3, null), new b(fA6)), b15, 0.0f, t16, j114, j113, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA6, b0N, onDismissRequest)), f0.d(c3070l6.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar6, content)), interfaceC3163l2, (i219 & 14) | 918552576 | ((i219 >> 3) & 896) | ((i219 << 6) & 57344) | (i219 & 458752) | (i219 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                t10 = t16;
                j11 = j113;
                kVar4 = kVar10;
                b9 = b15;
                j12 = j114;
                iVar5 = iVar112;
                pVar3 = pVar9;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar113 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i2110 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i2110;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar113;
                } else {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar114 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i2111 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i2111;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar114;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                }
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG == aVar.a()) {
                    C3190z c3190z7 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z7);
                    objG = c3190z7;
                }
                interfaceC3163lP.N();
                J jA7 = ((C3190z) objG).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-1974480898);
                objG2 = interfaceC3163lP.g();
                if (objG2 == aVar.a()) {
                    objG2 = new androidx.compose.ui.focus.g();
                    interfaceC3163lP.H(objG2);
                }
                androidx.compose.ui.focus.g gVar7 = (androidx.compose.ui.focus.g) objG2;
                interfaceC3163lP.N();
                T0 t17 = t9;
                F fA7 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                c0J = b0N.j();
                long j115 = jC;
                c8 = C0.Hidden;
                if (c0J != c8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i2112 = i17;
                p018c.d.a(z8, new C0150a(kVar3, jA7, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                interfaceC3163lP.f(733328855);
                L0.i.a aVar14 = L0.i.f4836a;
                H hG7 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                Q6.k kVar11 = kVar3;
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE7 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar15 = InterfaceC2343g.f23596Q;
                function0A = aVar15.a();
                Q6.p pVarB7 = AbstractC2252x.b(aVar14);
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
                long j116 = jB;
                v1.b(interfaceC3163lA, hG7, aVar15.c());
                v1.b(interfaceC3163lA, interfaceC3184wE7, aVar15.e());
                oVarB = aVar15.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB7.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar7 = androidx.compose.foundation.layout.b.f14485a;
                C3070l c3070l7 = C3070l.f36205a;
                long jE7 = c3070l7.e(interfaceC3163lP, 6);
                if (b0N.j() != c8) {
                    r9 = 0;
                    z9 = true;
                } else {
                    z9 = false;
                    r9 = 0;
                }
                d(jE7, z9, interfaceC3163lP, r9);
                L0.i iVar115 = iVar4;
                interfaceC3163l2 = interfaceC3163lP;
                Q6.p pVar10 = pVar2;
                B0 b16 = b0N;
                AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar7), r9, null, 3, null), new b(fA7)), b16, 0.0f, t17, j116, j115, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA7, b0N, onDismissRequest)), f0.d(c3070l7.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar7, content)), interfaceC3163l2, (i2112 & 14) | 918552576 | ((i2112 >> 3) & 896) | ((i2112 << 6) & 57344) | (i2112 & 458752) | (i2112 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                t10 = t17;
                j11 = j115;
                kVar4 = kVar11;
                b9 = b16;
                j12 = j116;
                iVar5 = iVar115;
                pVar3 = pVar10;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
            }
        }
        i10 |= 48;
        iVar2 = iVar;
        if ((i8 & 896) == 0) {
            if ((i9 & 4) == 0) {
                t0D = t8;
                if (interfaceC3163lP.R(t0D)) {
                }
                i10 |= i21;
            } else {
                t0D = t8;
            }
            i10 |= i21;
        } else {
            t0D = t8;
        }
        if ((i8 & 7168) == 0) {
            if ((i9 & 8) == 0) {
                b0N = b8;
                if (interfaceC3163lP.R(b0N)) {
                }
                i10 |= i22;
            } else {
                b0N = b8;
            }
            i10 |= i22;
        } else {
            b0N = b8;
        }
        i11 = i9 & 16;
        if (i11 != 0) {
            if ((i8 & 57344) == 0) {
                if (interfaceC3163lP.l(pVar)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            if ((i8 & 458752) == 0) {
                j10 = j8;
                if ((i9 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i10 |= i19;
            } else {
                j10 = j8;
            }
            if ((i8 & 3670016) == 0) {
                jC = j9;
                if ((i9 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            } else {
                jC = j9;
            }
            i13 = i9 & 128;
            if (i13 != 0) {
                i10 |= 12582912;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if ((i8 & 29360128) == 0) {
                    if (interfaceC3163lP.l(kVar2)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i10 |= i14;
                }
            }
            if ((i9 & 256) != 0) {
                if ((i8 & 234881024) == 0) {
                    if (interfaceC3163lP.l(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i10) == 38347922) {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar116 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i2113 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i2113;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar116;
                    } else {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar117 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i2114 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i2114;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar117;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                    }
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG == aVar.a()) {
                        C3190z c3190z8 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z8);
                        objG = c3190z8;
                    }
                    interfaceC3163lP.N();
                    J jA8 = ((C3190z) objG).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-1974480898);
                    objG2 = interfaceC3163lP.g();
                    if (objG2 == aVar.a()) {
                        objG2 = new androidx.compose.ui.focus.g();
                        interfaceC3163lP.H(objG2);
                    }
                    androidx.compose.ui.focus.g gVar8 = (androidx.compose.ui.focus.g) objG2;
                    interfaceC3163lP.N();
                    T0 t18 = t9;
                    F fA8 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                    c0J = b0N.j();
                    long j117 = jC;
                    c8 = C0.Hidden;
                    if (c0J != c8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i2115 = i17;
                    p018c.d.a(z8, new C0150a(kVar3, jA8, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.f(733328855);
                    L0.i.a aVar16 = L0.i.f4836a;
                    H hG8 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                    Q6.k kVar12 = kVar3;
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE8 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar17 = InterfaceC2343g.f23596Q;
                    function0A = aVar17.a();
                    Q6.p pVarB8 = AbstractC2252x.b(aVar16);
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
                    long j118 = jB;
                    v1.b(interfaceC3163lA, hG8, aVar17.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE8, aVar17.e());
                    oVarB = aVar17.b();
                    if (interfaceC3163lA.m()) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    } else {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB8.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    androidx.compose.foundation.layout.b bVar8 = androidx.compose.foundation.layout.b.f14485a;
                    C3070l c3070l8 = C3070l.f36205a;
                    long jE8 = c3070l8.e(interfaceC3163lP, 6);
                    if (b0N.j() != c8) {
                        r9 = 0;
                        z9 = true;
                    } else {
                        z9 = false;
                        r9 = 0;
                    }
                    d(jE8, z9, interfaceC3163lP, r9);
                    L0.i iVar118 = iVar4;
                    interfaceC3163l2 = interfaceC3163lP;
                    Q6.p pVar11 = pVar2;
                    B0 b17 = b0N;
                    AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar8), r9, null, 3, null), new b(fA8)), b17, 0.0f, t18, j118, j117, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA8, b0N, onDismissRequest)), f0.d(c3070l8.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar8, content)), interfaceC3163l2, (i2115 & 14) | 918552576 | ((i2115 >> 3) & 896) | ((i2115 << 6) & 57344) | (i2115 & 458752) | (i2115 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    t10 = t18;
                    j11 = j117;
                    kVar4 = kVar12;
                    b9 = b17;
                    j12 = j118;
                    iVar5 = iVar118;
                    pVar3 = pVar11;
                } else {
                    interfaceC3163lP.o();
                    if ((i8 & 1) != 0) {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar119 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i2116 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i2116;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar119;
                    } else {
                        if (i20 != 0) {
                            iVar3 = L0.i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i9 & 4) != 0) {
                            i10 &= -897;
                            t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                            i16 = 6;
                        } else {
                            i16 = 6;
                        }
                        L0.i iVar1110 = iVar3;
                        if ((i9 & 8) != 0) {
                            b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                            i10 &= -7169;
                        } else {
                            b0N = b0N;
                        }
                        if (i11 != 0) {
                            pVarA = J3.f.f4162a.a();
                        } else {
                            pVarA = pVar;
                        }
                        if ((i9 & 32) != 0) {
                            jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                            i10 &= -458753;
                        } else {
                            jB = j10;
                        }
                        if ((i9 & 64) != 0) {
                            jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                            i10 &= -3670017;
                        }
                        int i2117 = i10;
                        pVar2 = pVarA;
                        t9 = t0D;
                        i17 = i2117;
                        if (i13 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        iVar4 = iVar1110;
                    }
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                    }
                    interfaceC3163lP.f(773894976);
                    interfaceC3163lP.f(-492369756);
                    objG = interfaceC3163lP.g();
                    aVar = InterfaceC3163l.f38803a;
                    if (objG == aVar.a()) {
                        C3190z c3190z9 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                        interfaceC3163lP.H(c3190z9);
                        objG = c3190z9;
                    }
                    interfaceC3163lP.N();
                    J jA9 = ((C3190z) objG).a();
                    interfaceC3163lP.N();
                    interfaceC3163lP.f(-1974480898);
                    objG2 = interfaceC3163lP.g();
                    if (objG2 == aVar.a()) {
                        objG2 = new androidx.compose.ui.focus.g();
                        interfaceC3163lP.H(objG2);
                    }
                    androidx.compose.ui.focus.g gVar9 = (androidx.compose.ui.focus.g) objG2;
                    interfaceC3163lP.N();
                    T0 t19 = t9;
                    F fA9 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                    c0J = b0N.j();
                    long j119 = jC;
                    c8 = C0.Hidden;
                    if (c0J != c8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i2118 = i17;
                    p018c.d.a(z8, new C0150a(kVar3, jA9, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                    interfaceC3163lP.f(733328855);
                    L0.i.a aVar18 = L0.i.f4836a;
                    H hG9 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                    Q6.k kVar13 = kVar3;
                    interfaceC3163lP.f(-1323940314);
                    iA = AbstractC3157i.a(interfaceC3163lP, 0);
                    InterfaceC3184w interfaceC3184wE9 = interfaceC3163lP.E();
                    InterfaceC2343g.a aVar19 = InterfaceC2343g.f23596Q;
                    function0A = aVar19.a();
                    Q6.p pVarB9 = AbstractC2252x.b(aVar18);
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
                    long j1110 = jB;
                    v1.b(interfaceC3163lA, hG9, aVar19.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE9, aVar19.e());
                    oVarB = aVar19.b();
                    if (interfaceC3163lA.m()) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    } else {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB9.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                    interfaceC3163lP.f(2058660585);
                    androidx.compose.foundation.layout.b bVar9 = androidx.compose.foundation.layout.b.f14485a;
                    C3070l c3070l9 = C3070l.f36205a;
                    long jE9 = c3070l9.e(interfaceC3163lP, 6);
                    if (b0N.j() != c8) {
                        r9 = 0;
                        z9 = true;
                    } else {
                        z9 = false;
                        r9 = 0;
                    }
                    d(jE9, z9, interfaceC3163lP, r9);
                    L0.i iVar1111 = iVar4;
                    interfaceC3163l2 = interfaceC3163lP;
                    Q6.p pVar12 = pVar2;
                    B0 b18 = b0N;
                    AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar9), r9, null, 3, null), new b(fA9)), b18, 0.0f, t19, j1110, j119, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA9, b0N, onDismissRequest)), f0.d(c3070l9.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar9, content)), interfaceC3163l2, (i2118 & 14) | 918552576 | ((i2118 >> 3) & 896) | ((i2118 << 6) & 57344) | (i2118 & 458752) | (i2118 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                    interfaceC3163l2.N();
                    interfaceC3163l2.O();
                    interfaceC3163l2.N();
                    interfaceC3163l2.N();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    t10 = t19;
                    j11 = j119;
                    kVar4 = kVar13;
                    b9 = b18;
                    j12 = j1110;
                    iVar5 = iVar1111;
                    pVar3 = pVar12;
                }
                p0V = interfaceC3163l2.v();
                if (p0V != null) {
                    p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
                }
            }
            i15 = 100663296;
            i10 |= i15;
            if ((191739611 & i10) == 38347922) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar1112 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i2119 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i2119;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar1112;
                } else {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar1113 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21110 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21110;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar1113;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                }
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG == aVar.a()) {
                    C3190z c3190z10 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z10);
                    objG = c3190z10;
                }
                interfaceC3163lP.N();
                J jA10 = ((C3190z) objG).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-1974480898);
                objG2 = interfaceC3163lP.g();
                if (objG2 == aVar.a()) {
                    objG2 = new androidx.compose.ui.focus.g();
                    interfaceC3163lP.H(objG2);
                }
                androidx.compose.ui.focus.g gVar10 = (androidx.compose.ui.focus.g) objG2;
                interfaceC3163lP.N();
                T0 t110 = t9;
                F fA10 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                c0J = b0N.j();
                long j1111 = jC;
                c8 = C0.Hidden;
                if (c0J != c8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i21111 = i17;
                p018c.d.a(z8, new C0150a(kVar3, jA10, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                interfaceC3163lP.f(733328855);
                L0.i.a aVar110 = L0.i.f4836a;
                H hG10 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                Q6.k kVar14 = kVar3;
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE10 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar111 = InterfaceC2343g.f23596Q;
                function0A = aVar111.a();
                Q6.p pVarB10 = AbstractC2252x.b(aVar110);
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
                long j1112 = jB;
                v1.b(interfaceC3163lA, hG10, aVar111.c());
                v1.b(interfaceC3163lA, interfaceC3184wE10, aVar111.e());
                oVarB = aVar111.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB10.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar10 = androidx.compose.foundation.layout.b.f14485a;
                C3070l c3070l10 = C3070l.f36205a;
                long jE10 = c3070l10.e(interfaceC3163lP, 6);
                if (b0N.j() != c8) {
                    r9 = 0;
                    z9 = true;
                } else {
                    z9 = false;
                    r9 = 0;
                }
                d(jE10, z9, interfaceC3163lP, r9);
                L0.i iVar1114 = iVar4;
                interfaceC3163l2 = interfaceC3163lP;
                Q6.p pVar13 = pVar2;
                B0 b19 = b0N;
                AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar10), r9, null, 3, null), new b(fA10)), b19, 0.0f, t110, j1112, j1111, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA10, b0N, onDismissRequest)), f0.d(c3070l10.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar10, content)), interfaceC3163l2, (i21111 & 14) | 918552576 | ((i21111 >> 3) & 896) | ((i21111 << 6) & 57344) | (i21111 & 458752) | (i21111 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                t10 = t110;
                j11 = j1111;
                kVar4 = kVar14;
                b9 = b19;
                j12 = j1112;
                iVar5 = iVar1114;
                pVar3 = pVar13;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar1115 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21112 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21112;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar1115;
                } else {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar1116 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21113 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21113;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar1116;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                }
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG == aVar.a()) {
                    C3190z c3190z11 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z11);
                    objG = c3190z11;
                }
                interfaceC3163lP.N();
                J jA11 = ((C3190z) objG).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-1974480898);
                objG2 = interfaceC3163lP.g();
                if (objG2 == aVar.a()) {
                    objG2 = new androidx.compose.ui.focus.g();
                    interfaceC3163lP.H(objG2);
                }
                androidx.compose.ui.focus.g gVar11 = (androidx.compose.ui.focus.g) objG2;
                interfaceC3163lP.N();
                T0 t111 = t9;
                F fA11 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                c0J = b0N.j();
                long j1113 = jC;
                c8 = C0.Hidden;
                if (c0J != c8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i21114 = i17;
                p018c.d.a(z8, new C0150a(kVar3, jA11, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                interfaceC3163lP.f(733328855);
                L0.i.a aVar112 = L0.i.f4836a;
                H hG11 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                Q6.k kVar15 = kVar3;
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE11 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar113 = InterfaceC2343g.f23596Q;
                function0A = aVar113.a();
                Q6.p pVarB11 = AbstractC2252x.b(aVar112);
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
                long j1114 = jB;
                v1.b(interfaceC3163lA, hG11, aVar113.c());
                v1.b(interfaceC3163lA, interfaceC3184wE11, aVar113.e());
                oVarB = aVar113.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB11.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar11 = androidx.compose.foundation.layout.b.f14485a;
                C3070l c3070l11 = C3070l.f36205a;
                long jE11 = c3070l11.e(interfaceC3163lP, 6);
                if (b0N.j() != c8) {
                    r9 = 0;
                    z9 = true;
                } else {
                    z9 = false;
                    r9 = 0;
                }
                d(jE11, z9, interfaceC3163lP, r9);
                L0.i iVar1117 = iVar4;
                interfaceC3163l2 = interfaceC3163lP;
                Q6.p pVar14 = pVar2;
                B0 b110 = b0N;
                AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar11), r9, null, 3, null), new b(fA11)), b110, 0.0f, t111, j1114, j1113, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA11, b0N, onDismissRequest)), f0.d(c3070l11.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar11, content)), interfaceC3163l2, (i21114 & 14) | 918552576 | ((i21114 >> 3) & 896) | ((i21114 << 6) & 57344) | (i21114 & 458752) | (i21114 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                t10 = t111;
                j11 = j1113;
                kVar4 = kVar15;
                b9 = b110;
                j12 = j1114;
                iVar5 = iVar1117;
                pVar3 = pVar14;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
            }
        }
        i10 |= 24576;
        if ((i8 & 458752) == 0) {
            j10 = j8;
            if ((i9 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i10 |= i19;
        } else {
            j10 = j8;
        }
        if ((i8 & 3670016) == 0) {
            jC = j9;
            if ((i9 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i10 |= i18;
        } else {
            jC = j9;
        }
        i13 = i9 & 128;
        if (i13 != 0) {
            i10 |= 12582912;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if ((i8 & 29360128) == 0) {
                if (interfaceC3163lP.l(kVar2)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i10 |= i14;
            }
        }
        if ((i9 & 256) != 0) {
            if ((i8 & 234881024) == 0) {
                if (interfaceC3163lP.l(content)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
            }
            if ((191739611 & i10) == 38347922) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar1118 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21115 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21115;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar1118;
                } else {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar1119 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21116 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21116;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar1119;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                }
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG == aVar.a()) {
                    C3190z c3190z12 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z12);
                    objG = c3190z12;
                }
                interfaceC3163lP.N();
                J jA12 = ((C3190z) objG).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-1974480898);
                objG2 = interfaceC3163lP.g();
                if (objG2 == aVar.a()) {
                    objG2 = new androidx.compose.ui.focus.g();
                    interfaceC3163lP.H(objG2);
                }
                androidx.compose.ui.focus.g gVar12 = (androidx.compose.ui.focus.g) objG2;
                interfaceC3163lP.N();
                T0 t112 = t9;
                F fA12 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                c0J = b0N.j();
                long j1115 = jC;
                c8 = C0.Hidden;
                if (c0J != c8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i21117 = i17;
                p018c.d.a(z8, new C0150a(kVar3, jA12, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                interfaceC3163lP.f(733328855);
                L0.i.a aVar114 = L0.i.f4836a;
                H hG12 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                Q6.k kVar16 = kVar3;
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE12 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar115 = InterfaceC2343g.f23596Q;
                function0A = aVar115.a();
                Q6.p pVarB12 = AbstractC2252x.b(aVar114);
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
                long j1116 = jB;
                v1.b(interfaceC3163lA, hG12, aVar115.c());
                v1.b(interfaceC3163lA, interfaceC3184wE12, aVar115.e());
                oVarB = aVar115.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB12.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar12 = androidx.compose.foundation.layout.b.f14485a;
                C3070l c3070l12 = C3070l.f36205a;
                long jE12 = c3070l12.e(interfaceC3163lP, 6);
                if (b0N.j() != c8) {
                    r9 = 0;
                    z9 = true;
                } else {
                    z9 = false;
                    r9 = 0;
                }
                d(jE12, z9, interfaceC3163lP, r9);
                L0.i iVar11110 = iVar4;
                interfaceC3163l2 = interfaceC3163lP;
                Q6.p pVar15 = pVar2;
                B0 b111 = b0N;
                AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar12), r9, null, 3, null), new b(fA12)), b111, 0.0f, t112, j1116, j1115, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA12, b0N, onDismissRequest)), f0.d(c3070l12.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar12, content)), interfaceC3163l2, (i21117 & 14) | 918552576 | ((i21117 >> 3) & 896) | ((i21117 << 6) & 57344) | (i21117 & 458752) | (i21117 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                t10 = t112;
                j11 = j1115;
                kVar4 = kVar16;
                b9 = b111;
                j12 = j1116;
                iVar5 = iVar11110;
                pVar3 = pVar15;
            } else {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0) {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar11111 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21118 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21118;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar11111;
                } else {
                    if (i20 != 0) {
                        iVar3 = L0.i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                        t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                        i16 = 6;
                    } else {
                        i16 = 6;
                    }
                    L0.i iVar11112 = iVar3;
                    if ((i9 & 8) != 0) {
                        b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                        i10 &= -7169;
                    } else {
                        b0N = b0N;
                    }
                    if (i11 != 0) {
                        pVarA = J3.f.f4162a.a();
                    } else {
                        pVarA = pVar;
                    }
                    if ((i9 & 32) != 0) {
                        jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                        i10 &= -458753;
                    } else {
                        jB = j10;
                    }
                    if ((i9 & 64) != 0) {
                        jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                        i10 &= -3670017;
                    }
                    int i21119 = i10;
                    pVar2 = pVarA;
                    t9 = t0D;
                    i17 = i21119;
                    if (i13 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    iVar4 = iVar11112;
                }
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
                }
                interfaceC3163lP.f(773894976);
                interfaceC3163lP.f(-492369756);
                objG = interfaceC3163lP.g();
                aVar = InterfaceC3163l.f38803a;
                if (objG == aVar.a()) {
                    C3190z c3190z13 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                    interfaceC3163lP.H(c3190z13);
                    objG = c3190z13;
                }
                interfaceC3163lP.N();
                J jA13 = ((C3190z) objG).a();
                interfaceC3163lP.N();
                interfaceC3163lP.f(-1974480898);
                objG2 = interfaceC3163lP.g();
                if (objG2 == aVar.a()) {
                    objG2 = new androidx.compose.ui.focus.g();
                    interfaceC3163lP.H(objG2);
                }
                androidx.compose.ui.focus.g gVar13 = (androidx.compose.ui.focus.g) objG2;
                interfaceC3163lP.N();
                T0 t113 = t9;
                F fA13 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
                c0J = b0N.j();
                long j1117 = jC;
                c8 = C0.Hidden;
                if (c0J != c8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int i211110 = i17;
                p018c.d.a(z8, new C0150a(kVar3, jA13, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
                interfaceC3163lP.f(733328855);
                L0.i.a aVar116 = L0.i.f4836a;
                H hG13 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
                Q6.k kVar17 = kVar3;
                interfaceC3163lP.f(-1323940314);
                iA = AbstractC3157i.a(interfaceC3163lP, 0);
                InterfaceC3184w interfaceC3184wE13 = interfaceC3163lP.E();
                InterfaceC2343g.a aVar117 = InterfaceC2343g.f23596Q;
                function0A = aVar117.a();
                Q6.p pVarB13 = AbstractC2252x.b(aVar116);
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
                long j1118 = jB;
                v1.b(interfaceC3163lA, hG13, aVar117.c());
                v1.b(interfaceC3163lA, interfaceC3184wE13, aVar117.e());
                oVarB = aVar117.b();
                if (interfaceC3163lA.m()) {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                } else {
                    interfaceC3163lA.H(Integer.valueOf(iA));
                    interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                }
                pVarB13.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
                interfaceC3163lP.f(2058660585);
                androidx.compose.foundation.layout.b bVar13 = androidx.compose.foundation.layout.b.f14485a;
                C3070l c3070l13 = C3070l.f36205a;
                long jE13 = c3070l13.e(interfaceC3163lP, 6);
                if (b0N.j() != c8) {
                    r9 = 0;
                    z9 = true;
                } else {
                    z9 = false;
                    r9 = 0;
                }
                d(jE13, z9, interfaceC3163lP, r9);
                L0.i iVar11113 = iVar4;
                interfaceC3163l2 = interfaceC3163lP;
                Q6.p pVar16 = pVar2;
                B0 b112 = b0N;
                AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar13), r9, null, 3, null), new b(fA13)), b112, 0.0f, t113, j1118, j1117, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA13, b0N, onDismissRequest)), f0.d(c3070l13.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar13, content)), interfaceC3163l2, (i211110 & 14) | 918552576 | ((i211110 >> 3) & 896) | ((i211110 << 6) & 57344) | (i211110 & 458752) | (i211110 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
                interfaceC3163l2.N();
                interfaceC3163l2.O();
                interfaceC3163l2.N();
                interfaceC3163l2.N();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                t10 = t113;
                j11 = j1117;
                kVar4 = kVar17;
                b9 = b112;
                j12 = j1118;
                iVar5 = iVar11113;
                pVar3 = pVar16;
            }
            p0V = interfaceC3163l2.v();
            if (p0V != null) {
                p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
            }
        }
        i15 = 100663296;
        i10 |= i15;
        if ((191739611 & i10) == 38347922) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i20 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 = 6;
                } else {
                    i16 = 6;
                }
                L0.i iVar11114 = iVar3;
                if ((i9 & 8) != 0) {
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                    i10 &= -7169;
                } else {
                    b0N = b0N;
                }
                if (i11 != 0) {
                    pVarA = J3.f.f4162a.a();
                } else {
                    pVarA = pVar;
                }
                if ((i9 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                    i10 &= -458753;
                } else {
                    jB = j10;
                }
                if ((i9 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                    i10 &= -3670017;
                }
                int i211111 = i10;
                pVar2 = pVarA;
                t9 = t0D;
                i17 = i211111;
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                iVar4 = iVar11114;
            } else {
                if (i20 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 = 6;
                } else {
                    i16 = 6;
                }
                L0.i iVar11115 = iVar3;
                if ((i9 & 8) != 0) {
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                    i10 &= -7169;
                } else {
                    b0N = b0N;
                }
                if (i11 != 0) {
                    pVarA = J3.f.f4162a.a();
                } else {
                    pVarA = pVar;
                }
                if ((i9 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                    i10 &= -458753;
                } else {
                    jB = j10;
                }
                if ((i9 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                    i10 &= -3670017;
                }
                int i211112 = i10;
                pVar2 = pVarA;
                t9 = t0D;
                i17 = i211112;
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                iVar4 = iVar11115;
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
            }
            interfaceC3163lP.f(773894976);
            interfaceC3163lP.f(-492369756);
            objG = interfaceC3163lP.g();
            aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                C3190z c3190z14 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                interfaceC3163lP.H(c3190z14);
                objG = c3190z14;
            }
            interfaceC3163lP.N();
            J jA14 = ((C3190z) objG).a();
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1974480898);
            objG2 = interfaceC3163lP.g();
            if (objG2 == aVar.a()) {
                objG2 = new androidx.compose.ui.focus.g();
                interfaceC3163lP.H(objG2);
            }
            androidx.compose.ui.focus.g gVar14 = (androidx.compose.ui.focus.g) objG2;
            interfaceC3163lP.N();
            T0 t114 = t9;
            F fA14 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
            c0J = b0N.j();
            long j1119 = jC;
            c8 = C0.Hidden;
            if (c0J != c8) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i211113 = i17;
            p018c.d.a(z8, new C0150a(kVar3, jA14, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
            interfaceC3163lP.f(733328855);
            L0.i.a aVar118 = L0.i.f4836a;
            H hG14 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
            Q6.k kVar18 = kVar3;
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE14 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar119 = InterfaceC2343g.f23596Q;
            function0A = aVar119.a();
            Q6.p pVarB14 = AbstractC2252x.b(aVar118);
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
            long j11110 = jB;
            v1.b(interfaceC3163lA, hG14, aVar119.c());
            v1.b(interfaceC3163lA, interfaceC3184wE14, aVar119.e());
            oVarB = aVar119.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB14.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            androidx.compose.foundation.layout.b bVar14 = androidx.compose.foundation.layout.b.f14485a;
            C3070l c3070l14 = C3070l.f36205a;
            long jE14 = c3070l14.e(interfaceC3163lP, 6);
            if (b0N.j() != c8) {
                r9 = 0;
                z9 = true;
            } else {
                z9 = false;
                r9 = 0;
            }
            d(jE14, z9, interfaceC3163lP, r9);
            L0.i iVar11116 = iVar4;
            interfaceC3163l2 = interfaceC3163lP;
            Q6.p pVar17 = pVar2;
            B0 b113 = b0N;
            AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar14), r9, null, 3, null), new b(fA14)), b113, 0.0f, t114, j11110, j1119, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA14, b0N, onDismissRequest)), f0.d(c3070l14.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar14, content)), interfaceC3163l2, (i211113 & 14) | 918552576 | ((i211113 >> 3) & 896) | ((i211113 << 6) & 57344) | (i211113 & 458752) | (i211113 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            t10 = t114;
            j11 = j1119;
            kVar4 = kVar18;
            b9 = b113;
            j12 = j11110;
            iVar5 = iVar11116;
            pVar3 = pVar17;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if (i20 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 = 6;
                } else {
                    i16 = 6;
                }
                L0.i iVar11117 = iVar3;
                if ((i9 & 8) != 0) {
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                    i10 &= -7169;
                } else {
                    b0N = b0N;
                }
                if (i11 != 0) {
                    pVarA = J3.f.f4162a.a();
                } else {
                    pVarA = pVar;
                }
                if ((i9 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                    i10 &= -458753;
                } else {
                    jB = j10;
                }
                if ((i9 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                    i10 &= -3670017;
                }
                int i211114 = i10;
                pVar2 = pVarA;
                t9 = t0D;
                i17 = i211114;
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                iVar4 = iVar11117;
            } else {
                if (i20 != 0) {
                    iVar3 = L0.i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                    t0D = C3070l.f36205a.d(interfaceC3163lP, 6);
                    i16 = 6;
                } else {
                    i16 = 6;
                }
                L0.i iVar11118 = iVar3;
                if ((i9 & 8) != 0) {
                    b0N = AbstractC3069k0.n(true, null, interfaceC3163lP, i16, 2);
                    i10 &= -7169;
                } else {
                    b0N = b0N;
                }
                if (i11 != 0) {
                    pVarA = J3.f.f4162a.a();
                } else {
                    pVarA = pVar;
                }
                if ((i9 & 32) != 0) {
                    jB = C3070l.f36205a.b(interfaceC3163lP, 6);
                    i10 &= -458753;
                } else {
                    jB = j10;
                }
                if ((i9 & 64) != 0) {
                    jC = AbstractC3091w.c(jB, interfaceC3163lP, (i10 >> 15) & 14);
                    i10 &= -3670017;
                }
                int i211115 = i10;
                pVar2 = pVarA;
                t9 = t0D;
                i17 = i211115;
                if (i13 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                iVar4 = iVar11118;
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1332677633, i17, -1, "com.elgato.streamdeck.ui.components.BottomSheet (BottomSheet.kt:92)");
            }
            interfaceC3163lP.f(773894976);
            interfaceC3163lP.f(-492369756);
            objG = interfaceC3163lP.g();
            aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                C3190z c3190z15 = new C3190z(K.i(G6.h.f2820a, interfaceC3163lP));
                interfaceC3163lP.H(c3190z15);
                objG = c3190z15;
            }
            interfaceC3163lP.N();
            J jA15 = ((C3190z) objG).a();
            interfaceC3163lP.N();
            interfaceC3163lP.f(-1974480898);
            objG2 = interfaceC3163lP.g();
            if (objG2 == aVar.a()) {
                objG2 = new androidx.compose.ui.focus.g();
                interfaceC3163lP.H(objG2);
            }
            androidx.compose.ui.focus.g gVar15 = (androidx.compose.ui.focus.g) objG2;
            interfaceC3163lP.N();
            T0 t115 = t9;
            F fA15 = p018c.g.f16020a.a(interfaceC3163lP, p018c.g.f16022c);
            c0J = b0N.j();
            long j11111 = jC;
            c8 = C0.Hidden;
            if (c0J != c8) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i211116 = i17;
            p018c.d.a(z8, new C0150a(kVar3, jA15, b0N, onDismissRequest), interfaceC3163lP, 0, 0);
            interfaceC3163lP.f(733328855);
            L0.i.a aVar1110 = L0.i.f4836a;
            H hG15 = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163lP, 0);
            Q6.k kVar19 = kVar3;
            interfaceC3163lP.f(-1323940314);
            iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE15 = interfaceC3163lP.E();
            InterfaceC2343g.a aVar1111 = InterfaceC2343g.f23596Q;
            function0A = aVar1111.a();
            Q6.p pVarB15 = AbstractC2252x.b(aVar1110);
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
            long j11112 = jB;
            v1.b(interfaceC3163lA, hG15, aVar1111.c());
            v1.b(interfaceC3163lA, interfaceC3184wE15, aVar1111.e());
            oVarB = aVar1111.b();
            if (interfaceC3163lA.m()) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            } else {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB15.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            androidx.compose.foundation.layout.b bVar15 = androidx.compose.foundation.layout.b.f14485a;
            C3070l c3070l15 = C3070l.f36205a;
            long jE15 = c3070l15.e(interfaceC3163lP, 6);
            if (b0N.j() != c8) {
                r9 = 0;
                z9 = true;
            } else {
                z9 = false;
                r9 = 0;
            }
            d(jE15, z9, interfaceC3163lP, r9);
            L0.i iVar11119 = iVar4;
            interfaceC3163l2 = interfaceC3163lP;
            Q6.p pVar18 = pVar2;
            B0 b114 = b0N;
            AbstractC3069k0.a(onDismissRequest, androidx.compose.ui.input.key.a.b(FocusableKt.b(androidx.compose.ui.focus.h.a(iVar4, gVar15), r9, null, 3, null), new b(fA15)), b114, 0.0f, t115, j11112, j11111, A1.h.m((float) r9), C1598l0.o(C1598l0.f9405b.f(), 0.001f, 0.0f, 0.0f, 0.0f, 14, null), H0.c.b(interfaceC3163lP, -1117916674, true, new c(pVar2, jA15, b0N, onDismissRequest)), f0.d(c3070l15.g(interfaceC3163lP, 6), i0.f28011a.g()), C3061g0.b(C3061g0.f35892a, null, false, false, 3, null), H0.c.b(interfaceC3163lP, 306210622, true, new d(gVar15, content)), interfaceC3163l2, (i211116 & 14) | 918552576 | ((i211116 >> 3) & 896) | ((i211116 << 6) & 57344) | (i211116 & 458752) | (i211116 & 3670016), (C3063h0.f35948d << 3) | 384, 8);
            interfaceC3163l2.N();
            interfaceC3163l2.O();
            interfaceC3163l2.N();
            interfaceC3163l2.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            t10 = t115;
            j11 = j11111;
            kVar4 = kVar19;
            b9 = b114;
            j12 = j11112;
            iVar5 = iVar11119;
            pVar3 = pVar18;
        }
        p0V = interfaceC3163l2.v();
        if (p0V != null) {
            p0V.a(new e(onDismissRequest, iVar5, t10, b9, pVar3, j12, j11, kVar4, content, i8, i9));
        }
    }

    public static final void b(J j8, B0 b8, Function0 function0) {
        AbstractC1789i.d(j8, null, null, new f(b8, null), 3, null).H0(new g(function0));
    }

    public static final void c(T2.a screen, Function0 onDismissRequest, InterfaceC3163l interfaceC3163l, int i8) {
        t.g(screen, "screen");
        t.g(onDismissRequest, "onDismissRequest");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(167664740);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(167664740, i8, -1, "com.elgato.streamdeck.ui.components.NavigationBottomSheet (BottomSheet.kt:54)");
        }
        V2.d.b(screen, null, null, null, H0.c.b(interfaceC3163lP, -1839079251, true, new h(onDismissRequest)), interfaceC3163lP, 24584, 14);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new i(screen, onDismissRequest, i8));
        }
    }

    public static final void d(long j8, boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1320071325);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.j(j8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.c(z8) ? 32 : 16;
        }
        int i10 = i9;
        if ((i10 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1320071325, i10, -1, "com.elgato.streamdeck.ui.components.Scrim (BottomSheet.kt:145)");
            }
            if (j8 != C1598l0.f9405b.e()) {
                q1 q1VarD = AbstractC2207c.d(z8 ? 1.0f : 0.0f, new p037e0.i0(0, 0, null, 7, null), 0.0f, "Bottom sheet scrim animation", null, interfaceC3163lP, 3120, 20);
                L0.i iVarF = androidx.compose.foundation.layout.f.f(L0.i.f4836a, 0.0f, 1, null);
                interfaceC3163lP.f(158170860);
                boolean zR = interfaceC3163lP.R(q1VarD) | ((i10 & 14) == 4);
                Object objG = interfaceC3163lP.g();
                if (zR || objG == InterfaceC3163l.f38803a.a()) {
                    objG = new j(j8, q1VarD);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                AbstractC2282j.a(iVarF, (Q6.k) objG, interfaceC3163lP, 6);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new k(j8, z8, i8));
        }
    }

    public static final float e(q1 q1Var) {
        return ((Number) q1Var.getValue()).floatValue();
    }
}
