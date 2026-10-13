package Y2;

import C6.G;
import C6.r;
import D6.C0938s;
import D6.T;
import D6.U;
import D6.z;
import I0.j;
import I6.l;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p028d0.InterfaceC2200b;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12124a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(T2.a it) {
            t.g(it, "it");
            return it.getKey();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f12126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f12127c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ V2.b f12128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f12129b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f12130c;

            public a(V2.b bVar, InterfaceC3164l0 interfaceC3164l0, List list) {
                this.f12128a = bVar;
                this.f12129b = interfaceC3164l0;
                this.f12130c = list;
            }

            @Override // p215z0.H
            public void d() {
                List listH = this.f12128a.h();
                ArrayList arrayList = new ArrayList(C0938s.y(listH, 10));
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T2.a) it.next()).getKey());
                }
                InterfaceC3164l0 interfaceC3164l0 = this.f12129b;
                Set set = (Set) interfaceC3164l0.getValue();
                List list = this.f12130c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (!arrayList.contains(((T2.a) obj).getKey())) {
                        arrayList2.add(obj);
                    }
                }
                interfaceC3164l0.setValue(U.i(set, arrayList2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V2.b bVar, InterfaceC3164l0 interfaceC3164l0, List list) {
            super(1);
            this.f12125a = bVar;
            this.f12126b = interfaceC3164l0;
            this.f12127c = list;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffect) {
            t.g(DisposableEffect, "$this$DisposableEffect");
            return new a(this.f12125a, this.f12126b, this.f12127c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f12131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.b f12132b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12133a;

            static {
                int[] iArr = new int[U2.c.values().length];
                try {
                    iArr[U2.c.Pop.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[U2.c.Replace.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f12133a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, V2.b bVar) {
            super(1);
            this.f12131a = kVar;
            this.f12132b = bVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p028d0.k invoke(androidx.compose.animation.c AnimatedContent) {
            t.g(AnimatedContent, "$this$AnimatedContent");
            p028d0.k kVar = (p028d0.k) this.f12131a.invoke(AnimatedContent);
            int i8 = a.f12133a[this.f12132b.j().ordinal()];
            if (i8 == 1 || i8 == 2) {
            }
            return new p028d0.k(kVar.c(), kVar.a(), kVar.d(), kVar.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f12134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V2.b f12135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f12136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f12137d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f12138a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ V2.b f12139b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f12140c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(V2.b bVar, InterfaceC3164l0 interfaceC3164l0, G6.d dVar) {
                super(2, dVar);
                this.f12139b = bVar;
                this.f12140c = interfaceC3164l0;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f12139b, this.f12140c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f12138a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                List listH = this.f12139b.h();
                ArrayList arrayList = new ArrayList(C0938s.y(listH, 10));
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    arrayList.add(((T2.a) it.next()).getKey());
                }
                Iterable iterable = (Iterable) this.f12140c.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable) {
                    if (!arrayList.contains(((T2.a) obj2).getKey())) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    V2.b bVar = this.f12139b;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        bVar.d((T2.a) it2.next());
                    }
                    this.f12139b.c();
                }
                this.f12140c.setValue(T.d());
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f12141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2200b f12142b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T2.a f12143c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, InterfaceC2200b interfaceC2200b, T2.a aVar) {
                super(2);
                this.f12141a = qVar;
                this.f12142b = interfaceC2200b;
                this.f12143c = aVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-213849240, i8, -1, "cafe.adriel.voyager.transitions.ScreenTransition.<anonymous>.<anonymous> (ScreenTransition.kt:219)");
                }
                this.f12141a.i(this.f12142b, this.f12143c, interfaceC3163l, 72);
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
        public d(boolean z8, V2.b bVar, InterfaceC3164l0 interfaceC3164l0, q qVar) {
            super(4);
            this.f12134a = z8;
            this.f12135b = bVar;
            this.f12136c = interfaceC3164l0;
            this.f12137d = qVar;
        }

        public final void b(InterfaceC2200b AnimatedContent, T2.a screen, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(AnimatedContent, "$this$AnimatedContent");
            t.g(screen, "screen");
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1148408837, i8, -1, "cafe.adriel.voyager.transitions.ScreenTransition.<anonymous> (ScreenTransition.kt:206)");
            }
            interfaceC3163l.f(-1728395422);
            if (AnimatedContent.a().n() == AnimatedContent.a().h() && this.f12134a) {
                K.d(G.f1419a, new a(this.f12135b, this.f12136c, null), interfaceC3163l, 70);
            }
            interfaceC3163l.N();
            this.f12135b.q("transition", screen, H0.c.b(interfaceC3163l, -213849240, true, new b(this.f12137d, AnimatedContent, screen)), interfaceC3163l, (V2.b.f10520j << 9) | 454, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            b((InterfaceC2200b) obj, (T2.a) obj2, (InterfaceC3163l) obj3, ((Number) obj4).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: Y2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0308e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V2.b f12144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f12145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f12146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0.c f12147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f12148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f12149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q f12150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f12151h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f12152i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0308e(V2.b bVar, k kVar, i iVar, L0.c cVar, boolean z8, k kVar2, q qVar, int i8, int i9) {
            super(2);
            this.f12144a = bVar;
            this.f12145b = kVar;
            this.f12146c = iVar;
            this.f12147d = cVar;
            this.f12148e = z8;
            this.f12149f = kVar2;
            this.f12150g = qVar;
            this.f12151h = i8;
            this.f12152i = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.a(this.f12144a, this.f12145b, this.f12146c, this.f12147d, this.f12148e, this.f12149f, this.f12150g, interfaceC3163l, F0.a(this.f12151h | 1), this.f12152i);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f12153a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3164l0 invoke() {
            return l1.e(T.d(), null, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f12154a = new g();

        public g() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(I0.l Saver, InterfaceC3164l0 it) {
            t.g(Saver, "$this$Saver");
            t.g(it, "it");
            return z.R0((Iterable) it.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12155a = new h();

        public h() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3164l0 invoke(List it) {
            t.g(it, "it");
            return l1.e(z.W0(it), null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    public static final void a(V2.b navigator, k transition, i iVar, L0.c cVar, boolean z8, k kVar, q qVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVar2;
        int i11;
        L0.c cVarM;
        int i12;
        int i13;
        boolean z9;
        int i14;
        int i15;
        k kVar2;
        int i16;
        int i17;
        q qVar2;
        int i18;
        i iVar3;
        boolean z10;
        k kVar3;
        q qVarA;
        InterfaceC3164l0 interfaceC3164l0;
        List listH;
        q qVar3;
        i iVar4;
        L0.c cVar2;
        k kVar4;
        P0 p0V;
        t.g(navigator, "navigator");
        t.g(transition, "transition");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2062617034);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(navigator) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.l(transition) ? 32 : 16;
        }
        int i19 = i9 & 4;
        if (i19 == 0) {
            if ((i8 & 896) == 0) {
                iVar2 = iVar;
                i10 |= interfaceC3163lP.R(iVar2) ? 256 : 128;
            }
            i11 = i9 & 8;
            if (i11 != 0) {
                if ((i8 & 7168) == 0) {
                    cVarM = cVar;
                    if (interfaceC3163lP.R(cVarM)) {
                        i12 = 2048;
                    } else {
                        i12 = 1024;
                    }
                    i10 |= i12;
                }
                i13 = i9 & 16;
                if (i13 != 0) {
                    if ((57344 & i8) == 0) {
                        z9 = z8;
                        if (interfaceC3163lP.c(z9)) {
                            i14 = 16384;
                        } else {
                            i14 = 8192;
                        }
                        i10 |= i14;
                    }
                    i15 = i9 & 32;
                    if (i15 != 0) {
                        if ((i8 & 458752) == 0) {
                            kVar2 = kVar;
                            if (interfaceC3163lP.l(kVar2)) {
                                i16 = 131072;
                            } else {
                                i16 = 65536;
                            }
                            i10 |= i16;
                        }
                        i17 = i9 & 64;
                        if (i17 != 0) {
                            if ((3670016 & i8) == 0) {
                                qVar2 = qVar;
                                if (interfaceC3163lP.l(qVar2)) {
                                    i18 = 1048576;
                                } else {
                                    i18 = 524288;
                                }
                                i10 |= i18;
                            }
                            if ((i10 & 2995931) == 599186 || !interfaceC3163lP.s()) {
                                if (i19 != 0) {
                                    iVar3 = i.f4836a;
                                } else {
                                    iVar3 = iVar2;
                                }
                                if (i11 != 0) {
                                    cVarM = L0.c.f4806a.m();
                                }
                                if (i13 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z9;
                                }
                                if (i15 != 0) {
                                    kVar3 = a.f12124a;
                                } else {
                                    kVar3 = kVar2;
                                }
                                if (i17 != 0) {
                                    qVarA = Y2.b.f12091a.a();
                                } else {
                                    qVarA = qVar2;
                                }
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                                }
                                q qVar4 = qVarA;
                                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                                listH = navigator.h();
                                interfaceC3163lP.f(527504208);
                                if (z10) {
                                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                                }
                                interfaceC3163lP.N();
                                k kVar5 = kVar3;
                                L0.c cVar3 = cVarM;
                                i iVar5 = iVar3;
                                androidx.compose.animation.a.b(navigator.k(), iVar5, new c(transition, navigator), cVar3, null, kVar5, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar4)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                                interfaceC3163lP = interfaceC3163lP;
                                if (AbstractC3169o.K()) {
                                    AbstractC3169o.V();
                                }
                                qVar3 = qVar4;
                                iVar4 = iVar5;
                                cVar2 = cVar3;
                                kVar4 = kVar5;
                            } else {
                                interfaceC3163lP.z();
                                iVar4 = iVar2;
                                cVar2 = cVarM;
                                z10 = z9;
                                kVar4 = kVar2;
                                qVar3 = qVar2;
                            }
                            p0V = interfaceC3163lP.v();
                            if (p0V != null) {
                                p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                            }
                        }
                        i10 |= 1572864;
                        qVar2 = qVar;
                        if ((i10 & 2995931) == 599186) {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar5 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar6 = kVar3;
                            L0.c cVar4 = cVarM;
                            i iVar6 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar6, new c(transition, navigator), cVar4, null, kVar6, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar5)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar5;
                            iVar4 = iVar6;
                            cVar2 = cVar4;
                            kVar4 = kVar6;
                        } else {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar6 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar7 = kVar3;
                            L0.c cVar5 = cVarM;
                            i iVar7 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar7, new c(transition, navigator), cVar5, null, kVar7, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar6)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar6;
                            iVar4 = iVar7;
                            cVar2 = cVar5;
                            kVar4 = kVar7;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                        }
                    }
                    i10 |= 196608;
                    kVar2 = kVar;
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        if ((3670016 & i8) == 0) {
                            qVar2 = qVar;
                            if (interfaceC3163lP.l(qVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i10 |= i18;
                        }
                        if ((i10 & 2995931) == 599186) {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar7 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar8 = kVar3;
                            L0.c cVar6 = cVarM;
                            i iVar8 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar8, new c(transition, navigator), cVar6, null, kVar8, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar7)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar7;
                            iVar4 = iVar8;
                            cVar2 = cVar6;
                            kVar4 = kVar8;
                        } else {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar8 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar9 = kVar3;
                            L0.c cVar7 = cVarM;
                            i iVar9 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar9, new c(transition, navigator), cVar7, null, kVar9, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar8)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar8;
                            iVar4 = iVar9;
                            cVar2 = cVar7;
                            kVar4 = kVar9;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                        }
                    }
                    i10 |= 1572864;
                    qVar2 = qVar;
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar9 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar10 = kVar3;
                        L0.c cVar8 = cVarM;
                        i iVar10 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar10, new c(transition, navigator), cVar8, null, kVar10, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar9)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar9;
                        iVar4 = iVar10;
                        cVar2 = cVar8;
                        kVar4 = kVar10;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar10 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar11 = kVar3;
                        L0.c cVar9 = cVarM;
                        i iVar11 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar11, new c(transition, navigator), cVar9, null, kVar11, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar10)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar10;
                        iVar4 = iVar11;
                        cVar2 = cVar9;
                        kVar4 = kVar11;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 24576;
                z9 = z8;
                i15 = i9 & 32;
                if (i15 != 0) {
                    if ((i8 & 458752) == 0) {
                        kVar2 = kVar;
                        if (interfaceC3163lP.l(kVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i10 |= i16;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        if ((3670016 & i8) == 0) {
                            qVar2 = qVar;
                            if (interfaceC3163lP.l(qVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i10 |= i18;
                        }
                        if ((i10 & 2995931) == 599186) {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar11 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar12 = kVar3;
                            L0.c cVar10 = cVarM;
                            i iVar12 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar12, new c(transition, navigator), cVar10, null, kVar12, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar11;
                            iVar4 = iVar12;
                            cVar2 = cVar10;
                            kVar4 = kVar12;
                        } else {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar12 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar13 = kVar3;
                            L0.c cVar11 = cVarM;
                            i iVar13 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar13, new c(transition, navigator), cVar11, null, kVar13, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar12)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar12;
                            iVar4 = iVar13;
                            cVar2 = cVar11;
                            kVar4 = kVar13;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                        }
                    }
                    i10 |= 1572864;
                    qVar2 = qVar;
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar13 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar14 = kVar3;
                        L0.c cVar12 = cVarM;
                        i iVar14 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar14, new c(transition, navigator), cVar12, null, kVar14, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar13)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar13;
                        iVar4 = iVar14;
                        cVar2 = cVar12;
                        kVar4 = kVar14;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar14 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar15 = kVar3;
                        L0.c cVar13 = cVarM;
                        i iVar15 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar15, new c(transition, navigator), cVar13, null, kVar15, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar14)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar14;
                        iVar4 = iVar15;
                        cVar2 = cVar13;
                        kVar4 = kVar15;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 196608;
                kVar2 = kVar;
                i17 = i9 & 64;
                if (i17 != 0) {
                    if ((3670016 & i8) == 0) {
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar15 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar16 = kVar3;
                        L0.c cVar14 = cVarM;
                        i iVar16 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar16, new c(transition, navigator), cVar14, null, kVar16, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar15)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar15;
                        iVar4 = iVar16;
                        cVar2 = cVar14;
                        kVar4 = kVar16;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar16 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar17 = kVar3;
                        L0.c cVar15 = cVarM;
                        i iVar17 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar17, new c(transition, navigator), cVar15, null, kVar17, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar16)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar16;
                        iVar4 = iVar17;
                        cVar2 = cVar15;
                        kVar4 = kVar17;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar17 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar18 = kVar3;
                    L0.c cVar16 = cVarM;
                    i iVar18 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar18, new c(transition, navigator), cVar16, null, kVar18, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar17)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar17;
                    iVar4 = iVar18;
                    cVar2 = cVar16;
                    kVar4 = kVar18;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar18 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar19 = kVar3;
                    L0.c cVar17 = cVarM;
                    i iVar19 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar19, new c(transition, navigator), cVar17, null, kVar19, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar18)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar18;
                    iVar4 = iVar19;
                    cVar2 = cVar17;
                    kVar4 = kVar19;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 3072;
            cVarM = cVar;
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    z9 = z8;
                    if (interfaceC3163lP.c(z9)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                i15 = i9 & 32;
                if (i15 != 0) {
                    if ((i8 & 458752) == 0) {
                        kVar2 = kVar;
                        if (interfaceC3163lP.l(kVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i10 |= i16;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        if ((3670016 & i8) == 0) {
                            qVar2 = qVar;
                            if (interfaceC3163lP.l(qVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i10 |= i18;
                        }
                        if ((i10 & 2995931) == 599186) {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar19 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar110 = kVar3;
                            L0.c cVar18 = cVarM;
                            i iVar110 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar110, new c(transition, navigator), cVar18, null, kVar110, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar19)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar19;
                            iVar4 = iVar110;
                            cVar2 = cVar18;
                            kVar4 = kVar110;
                        } else {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar110 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar111 = kVar3;
                            L0.c cVar19 = cVarM;
                            i iVar111 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar111, new c(transition, navigator), cVar19, null, kVar111, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar110)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar110;
                            iVar4 = iVar111;
                            cVar2 = cVar19;
                            kVar4 = kVar111;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                        }
                    }
                    i10 |= 1572864;
                    qVar2 = qVar;
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar111 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar112 = kVar3;
                        L0.c cVar110 = cVarM;
                        i iVar112 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar112, new c(transition, navigator), cVar110, null, kVar112, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar111;
                        iVar4 = iVar112;
                        cVar2 = cVar110;
                        kVar4 = kVar112;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar112 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar113 = kVar3;
                        L0.c cVar111 = cVarM;
                        i iVar113 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar113, new c(transition, navigator), cVar111, null, kVar113, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar112)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar112;
                        iVar4 = iVar113;
                        cVar2 = cVar111;
                        kVar4 = kVar113;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 196608;
                kVar2 = kVar;
                i17 = i9 & 64;
                if (i17 != 0) {
                    if ((3670016 & i8) == 0) {
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar113 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar114 = kVar3;
                        L0.c cVar112 = cVarM;
                        i iVar114 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar114, new c(transition, navigator), cVar112, null, kVar114, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar113)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar113;
                        iVar4 = iVar114;
                        cVar2 = cVar112;
                        kVar4 = kVar114;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar114 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar115 = kVar3;
                        L0.c cVar113 = cVarM;
                        i iVar115 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar115, new c(transition, navigator), cVar113, null, kVar115, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar114)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar114;
                        iVar4 = iVar115;
                        cVar2 = cVar113;
                        kVar4 = kVar115;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar115 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar116 = kVar3;
                    L0.c cVar114 = cVarM;
                    i iVar116 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar116, new c(transition, navigator), cVar114, null, kVar116, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar115)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar115;
                    iVar4 = iVar116;
                    cVar2 = cVar114;
                    kVar4 = kVar116;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar116 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar117 = kVar3;
                    L0.c cVar115 = cVarM;
                    i iVar117 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar117, new c(transition, navigator), cVar115, null, kVar117, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar116)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar116;
                    iVar4 = iVar117;
                    cVar2 = cVar115;
                    kVar4 = kVar117;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 24576;
            z9 = z8;
            i15 = i9 & 32;
            if (i15 != 0) {
                if ((i8 & 458752) == 0) {
                    kVar2 = kVar;
                    if (interfaceC3163lP.l(kVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i10 |= i16;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    if ((3670016 & i8) == 0) {
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar117 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar118 = kVar3;
                        L0.c cVar116 = cVarM;
                        i iVar118 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar118, new c(transition, navigator), cVar116, null, kVar118, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar117)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar117;
                        iVar4 = iVar118;
                        cVar2 = cVar116;
                        kVar4 = kVar118;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar118 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar119 = kVar3;
                        L0.c cVar117 = cVarM;
                        i iVar119 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar119, new c(transition, navigator), cVar117, null, kVar119, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar118)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar118;
                        iVar4 = iVar119;
                        cVar2 = cVar117;
                        kVar4 = kVar119;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar119 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar1110 = kVar3;
                    L0.c cVar118 = cVarM;
                    i iVar1110 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar1110, new c(transition, navigator), cVar118, null, kVar1110, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar119)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar119;
                    iVar4 = iVar1110;
                    cVar2 = cVar118;
                    kVar4 = kVar1110;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar1110 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar1111 = kVar3;
                    L0.c cVar119 = cVarM;
                    i iVar1111 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar1111, new c(transition, navigator), cVar119, null, kVar1111, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1110)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar1110;
                    iVar4 = iVar1111;
                    cVar2 = cVar119;
                    kVar4 = kVar1111;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 196608;
            kVar2 = kVar;
            i17 = i9 & 64;
            if (i17 != 0) {
                if ((3670016 & i8) == 0) {
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar1111 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar1112 = kVar3;
                    L0.c cVar1110 = cVarM;
                    i iVar1112 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar1112, new c(transition, navigator), cVar1110, null, kVar1112, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar1111;
                    iVar4 = iVar1112;
                    cVar2 = cVar1110;
                    kVar4 = kVar1112;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar1112 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar1113 = kVar3;
                    L0.c cVar1111 = cVarM;
                    i iVar1113 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar1113, new c(transition, navigator), cVar1111, null, kVar1113, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1112)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar1112;
                    iVar4 = iVar1113;
                    cVar2 = cVar1111;
                    kVar4 = kVar1113;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if ((i10 & 2995931) == 599186) {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar1113 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar1114 = kVar3;
                L0.c cVar1112 = cVarM;
                i iVar1114 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar1114, new c(transition, navigator), cVar1112, null, kVar1114, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1113)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar1113;
                iVar4 = iVar1114;
                cVar2 = cVar1112;
                kVar4 = kVar1114;
            } else {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar1114 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar1115 = kVar3;
                L0.c cVar1113 = cVarM;
                i iVar1115 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar1115, new c(transition, navigator), cVar1113, null, kVar1115, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1114)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar1114;
                iVar4 = iVar1115;
                cVar2 = cVar1113;
                kVar4 = kVar1115;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 384;
        iVar2 = iVar;
        i11 = i9 & 8;
        if (i11 != 0) {
            if ((i8 & 7168) == 0) {
                cVarM = cVar;
                if (interfaceC3163lP.R(cVarM)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i10 |= i12;
            }
            i13 = i9 & 16;
            if (i13 != 0) {
                if ((57344 & i8) == 0) {
                    z9 = z8;
                    if (interfaceC3163lP.c(z9)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                }
                i15 = i9 & 32;
                if (i15 != 0) {
                    if ((i8 & 458752) == 0) {
                        kVar2 = kVar;
                        if (interfaceC3163lP.l(kVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i10 |= i16;
                    }
                    i17 = i9 & 64;
                    if (i17 != 0) {
                        if ((3670016 & i8) == 0) {
                            qVar2 = qVar;
                            if (interfaceC3163lP.l(qVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i10 |= i18;
                        }
                        if ((i10 & 2995931) == 599186) {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar1115 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar1116 = kVar3;
                            L0.c cVar1114 = cVarM;
                            i iVar1116 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar1116, new c(transition, navigator), cVar1114, null, kVar1116, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1115)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar1115;
                            iVar4 = iVar1116;
                            cVar2 = cVar1114;
                            kVar4 = kVar1116;
                        } else {
                            if (i19 != 0) {
                                iVar3 = i.f4836a;
                            } else {
                                iVar3 = iVar2;
                            }
                            if (i11 != 0) {
                                cVarM = L0.c.f4806a.m();
                            }
                            if (i13 != 0) {
                                z10 = false;
                            } else {
                                z10 = z9;
                            }
                            if (i15 != 0) {
                                kVar3 = a.f12124a;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i17 != 0) {
                                qVarA = Y2.b.f12091a.a();
                            } else {
                                qVarA = qVar2;
                            }
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                            }
                            q qVar1116 = qVarA;
                            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                            listH = navigator.h();
                            interfaceC3163lP.f(527504208);
                            if (z10) {
                                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                            }
                            interfaceC3163lP.N();
                            k kVar1117 = kVar3;
                            L0.c cVar1115 = cVarM;
                            i iVar1117 = iVar3;
                            androidx.compose.animation.a.b(navigator.k(), iVar1117, new c(transition, navigator), cVar1115, null, kVar1117, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1116)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                            interfaceC3163lP = interfaceC3163lP;
                            if (AbstractC3169o.K()) {
                                AbstractC3169o.V();
                            }
                            qVar3 = qVar1116;
                            iVar4 = iVar1117;
                            cVar2 = cVar1115;
                            kVar4 = kVar1117;
                        }
                        p0V = interfaceC3163lP.v();
                        if (p0V != null) {
                            p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                        }
                    }
                    i10 |= 1572864;
                    qVar2 = qVar;
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar1117 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar1118 = kVar3;
                        L0.c cVar1116 = cVarM;
                        i iVar1118 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar1118, new c(transition, navigator), cVar1116, null, kVar1118, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1117)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar1117;
                        iVar4 = iVar1118;
                        cVar2 = cVar1116;
                        kVar4 = kVar1118;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar1118 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar1119 = kVar3;
                        L0.c cVar1117 = cVarM;
                        i iVar1119 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar1119, new c(transition, navigator), cVar1117, null, kVar1119, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1118)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar1118;
                        iVar4 = iVar1119;
                        cVar2 = cVar1117;
                        kVar4 = kVar1119;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 196608;
                kVar2 = kVar;
                i17 = i9 & 64;
                if (i17 != 0) {
                    if ((3670016 & i8) == 0) {
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar1119 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar11110 = kVar3;
                        L0.c cVar1118 = cVarM;
                        i iVar11110 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar11110, new c(transition, navigator), cVar1118, null, kVar11110, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1119)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar1119;
                        iVar4 = iVar11110;
                        cVar2 = cVar1118;
                        kVar4 = kVar11110;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar11110 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar11111 = kVar3;
                        L0.c cVar1119 = cVarM;
                        i iVar11111 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar11111, new c(transition, navigator), cVar1119, null, kVar11111, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11110)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar11110;
                        iVar4 = iVar11111;
                        cVar2 = cVar1119;
                        kVar4 = kVar11111;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar11111 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar11112 = kVar3;
                    L0.c cVar11110 = cVarM;
                    i iVar11112 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar11112, new c(transition, navigator), cVar11110, null, kVar11112, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11111)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar11111;
                    iVar4 = iVar11112;
                    cVar2 = cVar11110;
                    kVar4 = kVar11112;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar11112 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar11113 = kVar3;
                    L0.c cVar11111 = cVarM;
                    i iVar11113 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar11113, new c(transition, navigator), cVar11111, null, kVar11113, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11112)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar11112;
                    iVar4 = iVar11113;
                    cVar2 = cVar11111;
                    kVar4 = kVar11113;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 24576;
            z9 = z8;
            i15 = i9 & 32;
            if (i15 != 0) {
                if ((i8 & 458752) == 0) {
                    kVar2 = kVar;
                    if (interfaceC3163lP.l(kVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i10 |= i16;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    if ((3670016 & i8) == 0) {
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar11113 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar11114 = kVar3;
                        L0.c cVar11112 = cVarM;
                        i iVar11114 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar11114, new c(transition, navigator), cVar11112, null, kVar11114, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11113)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar11113;
                        iVar4 = iVar11114;
                        cVar2 = cVar11112;
                        kVar4 = kVar11114;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar11114 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar11115 = kVar3;
                        L0.c cVar11113 = cVarM;
                        i iVar11115 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar11115, new c(transition, navigator), cVar11113, null, kVar11115, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11114)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar11114;
                        iVar4 = iVar11115;
                        cVar2 = cVar11113;
                        kVar4 = kVar11115;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar11115 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar11116 = kVar3;
                    L0.c cVar11114 = cVarM;
                    i iVar11116 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar11116, new c(transition, navigator), cVar11114, null, kVar11116, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11115)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar11115;
                    iVar4 = iVar11116;
                    cVar2 = cVar11114;
                    kVar4 = kVar11116;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar11116 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar11117 = kVar3;
                    L0.c cVar11115 = cVarM;
                    i iVar11117 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar11117, new c(transition, navigator), cVar11115, null, kVar11117, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11116)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar11116;
                    iVar4 = iVar11117;
                    cVar2 = cVar11115;
                    kVar4 = kVar11117;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 196608;
            kVar2 = kVar;
            i17 = i9 & 64;
            if (i17 != 0) {
                if ((3670016 & i8) == 0) {
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar11117 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar11118 = kVar3;
                    L0.c cVar11116 = cVarM;
                    i iVar11118 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar11118, new c(transition, navigator), cVar11116, null, kVar11118, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11117)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar11117;
                    iVar4 = iVar11118;
                    cVar2 = cVar11116;
                    kVar4 = kVar11118;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar11118 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar11119 = kVar3;
                    L0.c cVar11117 = cVarM;
                    i iVar11119 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar11119, new c(transition, navigator), cVar11117, null, kVar11119, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11118)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar11118;
                    iVar4 = iVar11119;
                    cVar2 = cVar11117;
                    kVar4 = kVar11119;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if ((i10 & 2995931) == 599186) {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar11119 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar111110 = kVar3;
                L0.c cVar11118 = cVarM;
                i iVar111110 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar111110, new c(transition, navigator), cVar11118, null, kVar111110, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar11119)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar11119;
                iVar4 = iVar111110;
                cVar2 = cVar11118;
                kVar4 = kVar111110;
            } else {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar111110 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar111111 = kVar3;
                L0.c cVar11119 = cVarM;
                i iVar111111 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar111111, new c(transition, navigator), cVar11119, null, kVar111111, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111110)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar111110;
                iVar4 = iVar111111;
                cVar2 = cVar11119;
                kVar4 = kVar111111;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 3072;
        cVarM = cVar;
        i13 = i9 & 16;
        if (i13 != 0) {
            if ((57344 & i8) == 0) {
                z9 = z8;
                if (interfaceC3163lP.c(z9)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i10 |= i14;
            }
            i15 = i9 & 32;
            if (i15 != 0) {
                if ((i8 & 458752) == 0) {
                    kVar2 = kVar;
                    if (interfaceC3163lP.l(kVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i10 |= i16;
                }
                i17 = i9 & 64;
                if (i17 != 0) {
                    if ((3670016 & i8) == 0) {
                        qVar2 = qVar;
                        if (interfaceC3163lP.l(qVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i10 |= i18;
                    }
                    if ((i10 & 2995931) == 599186) {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar111111 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar111112 = kVar3;
                        L0.c cVar111110 = cVarM;
                        i iVar111112 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar111112, new c(transition, navigator), cVar111110, null, kVar111112, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111111)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar111111;
                        iVar4 = iVar111112;
                        cVar2 = cVar111110;
                        kVar4 = kVar111112;
                    } else {
                        if (i19 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if (i11 != 0) {
                            cVarM = L0.c.f4806a.m();
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (i15 != 0) {
                            kVar3 = a.f12124a;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i17 != 0) {
                            qVarA = Y2.b.f12091a.a();
                        } else {
                            qVarA = qVar2;
                        }
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                        }
                        q qVar111112 = qVarA;
                        interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                        listH = navigator.h();
                        interfaceC3163lP.f(527504208);
                        if (z10) {
                            K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                        }
                        interfaceC3163lP.N();
                        k kVar111113 = kVar3;
                        L0.c cVar111111 = cVarM;
                        i iVar111113 = iVar3;
                        androidx.compose.animation.a.b(navigator.k(), iVar111113, new c(transition, navigator), cVar111111, null, kVar111113, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111112)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                        interfaceC3163lP = interfaceC3163lP;
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        qVar3 = qVar111112;
                        iVar4 = iVar111113;
                        cVar2 = cVar111111;
                        kVar4 = kVar111113;
                    }
                    p0V = interfaceC3163lP.v();
                    if (p0V != null) {
                        p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                    }
                }
                i10 |= 1572864;
                qVar2 = qVar;
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar111113 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar111114 = kVar3;
                    L0.c cVar111112 = cVarM;
                    i iVar111114 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar111114, new c(transition, navigator), cVar111112, null, kVar111114, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111113)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar111113;
                    iVar4 = iVar111114;
                    cVar2 = cVar111112;
                    kVar4 = kVar111114;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar111114 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar111115 = kVar3;
                    L0.c cVar111113 = cVarM;
                    i iVar111115 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar111115, new c(transition, navigator), cVar111113, null, kVar111115, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111114)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar111114;
                    iVar4 = iVar111115;
                    cVar2 = cVar111113;
                    kVar4 = kVar111115;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 196608;
            kVar2 = kVar;
            i17 = i9 & 64;
            if (i17 != 0) {
                if ((3670016 & i8) == 0) {
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar111115 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar111116 = kVar3;
                    L0.c cVar111114 = cVarM;
                    i iVar111116 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar111116, new c(transition, navigator), cVar111114, null, kVar111116, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111115)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar111115;
                    iVar4 = iVar111116;
                    cVar2 = cVar111114;
                    kVar4 = kVar111116;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar111116 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar111117 = kVar3;
                    L0.c cVar111115 = cVarM;
                    i iVar111117 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar111117, new c(transition, navigator), cVar111115, null, kVar111117, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111116)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar111116;
                    iVar4 = iVar111117;
                    cVar2 = cVar111115;
                    kVar4 = kVar111117;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if ((i10 & 2995931) == 599186) {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar111117 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar111118 = kVar3;
                L0.c cVar111116 = cVarM;
                i iVar111118 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar111118, new c(transition, navigator), cVar111116, null, kVar111118, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111117)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar111117;
                iVar4 = iVar111118;
                cVar2 = cVar111116;
                kVar4 = kVar111118;
            } else {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar111118 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar111119 = kVar3;
                L0.c cVar111117 = cVarM;
                i iVar111119 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar111119, new c(transition, navigator), cVar111117, null, kVar111119, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111118)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar111118;
                iVar4 = iVar111119;
                cVar2 = cVar111117;
                kVar4 = kVar111119;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 24576;
        z9 = z8;
        i15 = i9 & 32;
        if (i15 != 0) {
            if ((i8 & 458752) == 0) {
                kVar2 = kVar;
                if (interfaceC3163lP.l(kVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i10 |= i16;
            }
            i17 = i9 & 64;
            if (i17 != 0) {
                if ((3670016 & i8) == 0) {
                    qVar2 = qVar;
                    if (interfaceC3163lP.l(qVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i10 |= i18;
                }
                if ((i10 & 2995931) == 599186) {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar111119 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar1111110 = kVar3;
                    L0.c cVar111118 = cVarM;
                    i iVar1111110 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar1111110, new c(transition, navigator), cVar111118, null, kVar1111110, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar111119)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar111119;
                    iVar4 = iVar1111110;
                    cVar2 = cVar111118;
                    kVar4 = kVar1111110;
                } else {
                    if (i19 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if (i11 != 0) {
                        cVarM = L0.c.f4806a.m();
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z9;
                    }
                    if (i15 != 0) {
                        kVar3 = a.f12124a;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i17 != 0) {
                        qVarA = Y2.b.f12091a.a();
                    } else {
                        qVarA = qVar2;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                    }
                    q qVar1111110 = qVarA;
                    interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                    listH = navigator.h();
                    interfaceC3163lP.f(527504208);
                    if (z10) {
                        K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                    }
                    interfaceC3163lP.N();
                    k kVar1111111 = kVar3;
                    L0.c cVar111119 = cVarM;
                    i iVar1111111 = iVar3;
                    androidx.compose.animation.a.b(navigator.k(), iVar1111111, new c(transition, navigator), cVar111119, null, kVar1111111, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111110)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                    interfaceC3163lP = interfaceC3163lP;
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    qVar3 = qVar1111110;
                    iVar4 = iVar1111111;
                    cVar2 = cVar111119;
                    kVar4 = kVar1111111;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
                }
            }
            i10 |= 1572864;
            qVar2 = qVar;
            if ((i10 & 2995931) == 599186) {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar1111111 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar1111112 = kVar3;
                L0.c cVar1111110 = cVarM;
                i iVar1111112 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar1111112, new c(transition, navigator), cVar1111110, null, kVar1111112, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111111)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar1111111;
                iVar4 = iVar1111112;
                cVar2 = cVar1111110;
                kVar4 = kVar1111112;
            } else {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar1111112 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar1111113 = kVar3;
                L0.c cVar1111111 = cVarM;
                i iVar1111113 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar1111113, new c(transition, navigator), cVar1111111, null, kVar1111113, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111112)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar1111112;
                iVar4 = iVar1111113;
                cVar2 = cVar1111111;
                kVar4 = kVar1111113;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 196608;
        kVar2 = kVar;
        i17 = i9 & 64;
        if (i17 != 0) {
            if ((3670016 & i8) == 0) {
                qVar2 = qVar;
                if (interfaceC3163lP.l(qVar2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i10 |= i18;
            }
            if ((i10 & 2995931) == 599186) {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar1111113 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar1111114 = kVar3;
                L0.c cVar1111112 = cVarM;
                i iVar1111114 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar1111114, new c(transition, navigator), cVar1111112, null, kVar1111114, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111113)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar1111113;
                iVar4 = iVar1111114;
                cVar2 = cVar1111112;
                kVar4 = kVar1111114;
            } else {
                if (i19 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if (i11 != 0) {
                    cVarM = L0.c.f4806a.m();
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (i15 != 0) {
                    kVar3 = a.f12124a;
                } else {
                    kVar3 = kVar2;
                }
                if (i17 != 0) {
                    qVarA = Y2.b.f12091a.a();
                } else {
                    qVarA = qVar2;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
                }
                q qVar1111114 = qVarA;
                interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
                listH = navigator.h();
                interfaceC3163lP.f(527504208);
                if (z10) {
                    K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
                }
                interfaceC3163lP.N();
                k kVar1111115 = kVar3;
                L0.c cVar1111113 = cVarM;
                i iVar1111115 = iVar3;
                androidx.compose.animation.a.b(navigator.k(), iVar1111115, new c(transition, navigator), cVar1111113, null, kVar1111115, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111114)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
                interfaceC3163lP = interfaceC3163lP;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                qVar3 = qVar1111114;
                iVar4 = iVar1111115;
                cVar2 = cVar1111113;
                kVar4 = kVar1111115;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
            }
        }
        i10 |= 1572864;
        qVar2 = qVar;
        if ((i10 & 2995931) == 599186) {
            if (i19 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                cVarM = L0.c.f4806a.m();
            }
            if (i13 != 0) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (i15 != 0) {
                kVar3 = a.f12124a;
            } else {
                kVar3 = kVar2;
            }
            if (i17 != 0) {
                qVarA = Y2.b.f12091a.a();
            } else {
                qVarA = qVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
            }
            q qVar1111115 = qVarA;
            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
            listH = navigator.h();
            interfaceC3163lP.f(527504208);
            if (z10) {
                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
            }
            interfaceC3163lP.N();
            k kVar1111116 = kVar3;
            L0.c cVar1111114 = cVarM;
            i iVar1111116 = iVar3;
            androidx.compose.animation.a.b(navigator.k(), iVar1111116, new c(transition, navigator), cVar1111114, null, kVar1111116, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111115)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
            interfaceC3163lP = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            qVar3 = qVar1111115;
            iVar4 = iVar1111116;
            cVar2 = cVar1111114;
            kVar4 = kVar1111116;
        } else {
            if (i19 != 0) {
                iVar3 = i.f4836a;
            } else {
                iVar3 = iVar2;
            }
            if (i11 != 0) {
                cVarM = L0.c.f4806a.m();
            }
            if (i13 != 0) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (i15 != 0) {
                kVar3 = a.f12124a;
            } else {
                kVar3 = kVar2;
            }
            if (i17 != 0) {
                qVarA = Y2.b.f12091a.a();
            } else {
                qVarA = qVar2;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2062617034, i10, -1, "cafe.adriel.voyager.transitions.ScreenTransition (ScreenTransition.kt:160)");
            }
            q qVar1111116 = qVarA;
            interfaceC3164l0 = (InterfaceC3164l0) I0.b.b(new Object[0], b(), null, f.f12153a, interfaceC3163lP, 3144, 4);
            listH = navigator.h();
            interfaceC3163lP.f(527504208);
            if (z10) {
                K.a(listH, new b(navigator, interfaceC3164l0, listH), interfaceC3163lP, 8);
            }
            interfaceC3163lP.N();
            k kVar1111117 = kVar3;
            L0.c cVar1111115 = cVarM;
            i iVar1111117 = iVar3;
            androidx.compose.animation.a.b(navigator.k(), iVar1111117, new c(transition, navigator), cVar1111115, null, kVar1111117, H0.c.b(interfaceC3163lP, -1148408837, true, new d(z10, navigator, interfaceC3164l0, qVar1111116)), interfaceC3163lP, ((i10 >> 3) & 112) | 1572872 | (i10 & 7168) | (i10 & 458752), 16);
            interfaceC3163lP = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            qVar3 = qVar1111116;
            iVar4 = iVar1111117;
            cVar2 = cVar1111115;
            kVar4 = kVar1111117;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0308e(navigator, transition, iVar4, cVar2, z10, kVar4, qVar3, i8, i9));
        }
    }

    public static final j b() {
        return I0.k.a(g.f12154a, h.f12155a);
    }
}
