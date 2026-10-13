package p154r3;

import A5.h;
import B3.f;
import B3.i;
import C6.G;
import C6.r;
import D6.z;
import F5.g;
import I6.l;
import Q6.k;
import Q6.o;
import Q6.p;
import Q6.q;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.MainActivity;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p028d0.InterfaceC2204f;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p063h.e;
import p110m1.n;
import p110m1.v;
import p110m1.x;
import p181u6.GfRt.QhsKALGiniuQ;
import p191w0.F0;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p154r3.d f32354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f32355b;

        /* JADX INFO: renamed from: r3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0708a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0708a f32356a = new C0708a();

            public C0708a() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((x) obj);
                return G.f1419a;
            }

            public final void b(x xVar) {
                t.g(xVar, QhsKALGiniuQ.VmfcctllZOp);
                v.a(xVar, true);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p154r3.d f32357a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f32358b;

            /* JADX INFO: renamed from: r3.c$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0709a extends u implements p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ q1 f32359a;

                /* JADX INFO: renamed from: r3.c$a$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0710a extends l implements o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f32360a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ V2.b f32361b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ q1 f32362c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0710a(V2.b bVar, q1 q1Var, G6.d dVar) {
                        super(2, dVar);
                        this.f32361b = bVar;
                        this.f32362c = q1Var;
                    }

                    @Override // I6.a
                    public final G6.d create(Object obj, G6.d dVar) {
                        return new C0710a(this.f32361b, this.f32362c, dVar);
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(J j8, G6.d dVar) {
                        return ((C0710a) create(j8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        H6.c.f();
                        if (this.f32360a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        T2.a aVar = (T2.a) z.k0(this.f32361b.h());
                        if (aVar == null || !p181u6.b.b(aVar, K.b(b.d(this.f32362c).getClass()))) {
                            this.f32361b.p(b.d(this.f32362c));
                        }
                        return G.f1419a;
                    }
                }

                /* JADX INFO: renamed from: r3.c$a$b$a$b, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0711b extends u implements q {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ h f32363a;

                    /* JADX INFO: renamed from: r3.c$a$b$a$b$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                    public static final class C0712a extends u implements o {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ T2.a f32364a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0712a(T2.a aVar) {
                            super(2);
                            this.f32364a = aVar;
                        }

                        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                                interfaceC3163l.z();
                                return;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(7965887, i8, -1, "com.elgato.streamdeck.MainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainView.kt:68)");
                            }
                            this.f32364a.m(interfaceC3163l, 8);
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

                    /* JADX INFO: renamed from: r3.c$a$b$a$b$b, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                    public static final class C0713b extends u implements k {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ AbstractC1726i f32365a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0713b(AbstractC1726i abstractC1726i) {
                            super(1);
                            this.f32365a = abstractC1726i;
                        }

                        public final void b(A5.c.a createSubgraph) throws A5.q {
                            t.g(createSubgraph, "$this$createSubgraph");
                            createSubgraph.m(new g(new A5.a(AbstractC1726i.class, false, null, null), this.f32365a));
                        }

                        @Override // Q6.k
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws A5.q {
                            b((A5.c.a) obj);
                            return G.f1419a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0711b(h hVar) {
                        super(4);
                        this.f32363a = hVar;
                    }

                    public final void b(InterfaceC2204f FadeTransition, T2.a screen, InterfaceC3163l interfaceC3163l, int i8) throws Throwable {
                        t.g(FadeTransition, "$this$FadeTransition");
                        t.g(screen, "screen");
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2015327873, i8, -1, "com.elgato.streamdeck.MainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainView.kt:57)");
                        }
                        AbstractC1726i abstractC1726iW = ((InterfaceC1733p) interfaceC3163l.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).w();
                        S sA = p161s2.a.f32876a.a(interfaceC3163l, p161s2.a.f32878c);
                        if (sA == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        B5.d.a aVar = B5.d.f1209c;
                        h hVar = this.f32363a;
                        B5.d dVar = (B5.d) new P(sA).b(B5.d.class);
                        h hVarE = dVar.e();
                        if (hVarE == null) {
                            hVarE = hVar.c(B5.c.b(), new C0713b(abstractC1726iW));
                            dVar.f(hVarE);
                        }
                        AbstractC3182v.a(DiKt.d().c(hVarE), H0.c.b(interfaceC3163l, 7965887, true, new C0712a(screen)), interfaceC3163l, 56);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                    }

                    @Override // Q6.q
                    public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
                        b((InterfaceC2204f) obj, (T2.a) obj2, (InterfaceC3163l) obj3, ((Number) obj4).intValue());
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0709a(q1 q1Var) {
                    super(3);
                    this.f32359a = q1Var;
                }

                public final void b(V2.b navigator, InterfaceC3163l interfaceC3163l, int i8) {
                    t.g(navigator, "navigator");
                    if ((i8 & 14) == 0) {
                        i8 |= interfaceC3163l.R(navigator) ? 4 : 2;
                    }
                    if ((i8 & 91) == 18 && interfaceC3163l.s()) {
                        interfaceC3163l.z();
                        return;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-1615753499, i8, -1, "com.elgato.streamdeck.MainView.<anonymous>.<anonymous>.<anonymous> (MainView.kt:48)");
                    }
                    h hVar = (h) interfaceC3163l.e(DiKt.d());
                    p215z0.K.d(b.d(this.f32359a), new C0710a(navigator, this.f32359a, null), interfaceC3163l, 72);
                    Y2.d.b(navigator, null, null, H0.c.b(interfaceC3163l, -2015327873, true, new C0711b(hVar)), interfaceC3163l, V2.b.f10520j | 3072 | (i8 & 14), 6);
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

            /* JADX INFO: renamed from: r3.c$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class C0714b extends C2639q implements Function0 {
                public C0714b(Object obj) {
                    super(0, obj, i.class, "hide", "hide()V", 0);
                }

                public final void h() {
                    ((i) this.receiver).e();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    h();
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p154r3.d dVar, i iVar) {
                super(2);
                this.f32357a = dVar;
                this.f32358b = iVar;
            }

            public static final T2.a d(q1 q1Var) {
                return (T2.a) q1Var.getValue();
            }

            public final void c(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2035534834, i8, -1, "com.elgato.streamdeck.MainView.<anonymous>.<anonymous> (MainView.kt:45)");
                }
                q1 q1VarB = p137p2.a.b(this.f32357a.h(), null, null, null, interfaceC3163l, 8, 7);
                V2.d.b(d(q1VarB), null, null, null, H0.c.b(interfaceC3163l, -1615753499, true, new C0709a(q1VarB)), interfaceC3163l, 24584, 14);
                A3.o.a(interfaceC3163l, 0);
                p178u3.a.a(null, interfaceC3163l, 0, 1);
                if (((Boolean) this.f32358b.f().getValue()).booleanValue()) {
                    f fVar = new f();
                    i iVar = this.f32358b;
                    interfaceC3163l.f(-620621901);
                    boolean zR = interfaceC3163l.R(iVar);
                    Object objG = interfaceC3163l.g();
                    if (zR || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new C0714b(iVar);
                        interfaceC3163l.H(objG);
                    }
                    interfaceC3163l.N();
                    J3.a.c(fVar, (Function0) ((X6.h) objG), interfaceC3163l, 0);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p154r3.d dVar, i iVar) {
            super(2);
            this.f32354a = dVar;
            this.f32355b = iVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1486939827, i8, -1, "com.elgato.streamdeck.MainView.<anonymous> (MainView.kt:44)");
            }
            F0.a(n.d(L0.i.f4836a, false, C0708a.f32356a, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, H0.c.b(interfaceC3163l, -2035534834, true, new b(this.f32354a, this.f32355b)), interfaceC3163l, 12582912, 126);
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
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32366a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8) {
            super(2);
            this.f32366a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            c.a(interfaceC3163l, p215z0.F0.a(this.f32366a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: r3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0715c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M3.p f32368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MainActivity f32369c;

        /* JADX INFO: renamed from: r3.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MainActivity f32370a;

            /* JADX INFO: renamed from: r3.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class C0716a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f32371a;

                static {
                    int[] iArr = new int[KnownHost.Device.Appearance.values().length];
                    try {
                        iArr[KnownHost.Device.Appearance.LIGHT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KnownHost.Device.Appearance.DARK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f32371a = iArr;
                }
            }

            public a(MainActivity mainActivity) {
                this.f32370a = mainActivity;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x001a A[PHI: r1
              0x001a: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:7:0x0014, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(KnownHost.Device.Appearance appearance, G6.d dVar) {
                int i8;
                e eVarL0 = this.f32370a.l0();
                int i9 = appearance == null ? -1 : C0716a.f32371a[appearance.ordinal()];
                int i10 = 1;
                if (i9 != 1) {
                    i10 = 2;
                    i8 = i9 == 2 ? i10 : -1;
                }
                eVarL0.J(i8);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: r3.c$c$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f32372a;

            /* JADX INFO: renamed from: r3.c$c$b$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f32373a;

                /* JADX INFO: renamed from: r3.c$c$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0717a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f32374a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f32375b;

                    public C0717a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f32374a = obj;
                        this.f32375b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2261g interfaceC2261g) {
                    this.f32373a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0717a c0717a;
                    if (dVar instanceof C0717a) {
                        c0717a = (C0717a) dVar;
                        int i8 = c0717a.f32375b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0717a.f32375b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0717a = new C0717a(dVar);
                        }
                    } else {
                        c0717a = new C0717a(dVar);
                    }
                    Object obj2 = c0717a.f32374a;
                    Object objF = H6.c.f();
                    int i9 = c0717a.f32375b;
                    if (i9 == 0) {
                        r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f32373a;
                        KnownHost.Device.Appearance appearance = ((KnownHost.Device) obj).getAppearance();
                        c0717a.f32375b = 1;
                        if (interfaceC2261g.emit(appearance, c0717a) == objF) {
                            return objF;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            public b(InterfaceC2260f interfaceC2260f) {
                this.f32372a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f32372a.collect(new a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0715c(M3.p pVar, MainActivity mainActivity, G6.d dVar) {
            super(2, dVar);
            this.f32368b = pVar;
            this.f32369c = mainActivity;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new C0715c(this.f32368b, this.f32369c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0715c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32367a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260fP = AbstractC2262h.p(new b(this.f32368b.f()));
                a aVar = new a(this.f32369c);
                this.f32367a = 1;
                if (interfaceC2260fP.collect(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(2);
            this.f32377a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            c.b(interfaceC3163l, p215z0.F0.a(this.f32377a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1484431288);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1484431288, i8, -1, "com.elgato.streamdeck.MainView (MainView.kt:36)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(p154r3.d.class, false, null, null);
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
            p154r3.d dVar = (p154r3.d) objG;
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
            b(interfaceC3163lP, 0);
            p014b4.a.a(false, null, null, 0L, false, H0.c.b(interfaceC3163lP, 1486939827, true, new a(dVar, (i) objG2)), interfaceC3163lP, 196608, 31);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8));
        }
    }

    public static final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-475981738);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-475981738, i8, -1, "com.elgato.streamdeck.NightModeEffect (MainView.kt:86)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(M3.p.class, false, null, null);
            h hVar = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            Activity activityB = p186v3.a.b((Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g()));
            t.e(activityB, "null cannot be cast to non-null type com.elgato.streamdeck.MainActivity");
            p215z0.K.d(G.f1419a, new C0715c((M3.p) objG, (MainActivity) activityB, null), interfaceC3163lP, 70);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(i8));
        }
    }
}
