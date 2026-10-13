package p014b4;

import C6.G;
import Q6.o;
import R0.AbstractC1602n0;
import R0.C1598l0;
import R0.R0;
import T0.g;
import U1.W;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p046f0.AbstractC2287o;
import p128o1.I;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p184v1.e;
import p191w0.AbstractC3049a0;
import p191w0.AbstractC3091w;
import p191w0.C3089v;
import p191w0.U0;
import p191w0.y0;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;
import p216z1.h;
import p216z1.k;
import p216z1.q;
import p216z1.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3089v f15829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3089v f15830b;

    /* JADX INFO: renamed from: b4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0395a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f15831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f15832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f15833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0395a(View view, long j8, boolean z8) {
            super(0);
            this.f15831a = view;
            this.f15832b = j8;
            this.f15833c = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m93invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m93invoke() {
            Context context = this.f15831a.getContext();
            t.e(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            window.setStatusBarColor(AbstractC1602n0.j(this.f15832b));
            W.a(window, this.f15831a).c(this.f15833c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p014b4.c f15834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f15835b;

        /* JADX INFO: renamed from: b4.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0396a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f15836a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0396a(o oVar) {
                super(2);
                this.f15836a = oVar;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-337442028, i8, -1, "com.elgato.ui.ElgatoMaterial3Theme.<anonymous>.<anonymous> (ElgatoMaterial3Theme.kt:66)");
                }
                this.f15836a.invoke(interfaceC3163l, 0);
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
        public b(p014b4.c cVar, o oVar) {
            super(2);
            this.f15834a = cVar;
            this.f15835b = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-686336428, i8, -1, "com.elgato.ui.ElgatoMaterial3Theme.<anonymous> (ElgatoMaterial3Theme.kt:65)");
            }
            AbstractC3182v.a(p014b4.b.a().c(this.f15834a), H0.c.b(interfaceC3163l, -337442028, true, new C0396a(this.f15835b)), interfaceC3163l, C0.f38510d | 48);
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC3009n f15838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ U0 f15839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f15840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f15841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f15842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f15843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f15844h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, AbstractC3009n abstractC3009n, U0 u8, long j8, boolean z9, o oVar, int i8, int i9) {
            super(2);
            this.f15837a = z8;
            this.f15838b = abstractC3009n;
            this.f15839c = u8;
            this.f15840d = j8;
            this.f15841e = z9;
            this.f15842f = oVar;
            this.f15843g = i8;
            this.f15844h = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f15837a, this.f15838b, this.f15839c, this.f15840d, this.f15841e, this.f15842f, interfaceC3163l, F0.a(this.f15843g | 1), this.f15844h);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    static {
        W3.b bVar = W3.b.f11304a;
        f15829a = AbstractC3091w.k(bVar.k(), bVar.f(), bVar.q(), bVar.i(), bVar.f(), bVar.q(), bVar.j(), bVar.r(), bVar.j(), bVar.q(), bVar.j(), bVar.s(), bVar.j(), bVar.p(), bVar.i(), bVar.p(), bVar.i(), bVar.q(), bVar.i(), bVar.c(), bVar.t(), bVar.f(), bVar.e(), bVar.f(), bVar.o(), bVar.g(), bVar.a(), bVar.a(), bVar.i(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
        W3.a aVar = W3.a.f11004a;
        f15830b = AbstractC3091w.e(aVar.k(), aVar.f(), aVar.n(), aVar.i(), aVar.f(), aVar.n(), aVar.j(), aVar.o(), aVar.j(), aVar.n(), aVar.j(), aVar.p(), aVar.j(), aVar.m(), aVar.i(), aVar.m(), aVar.i(), aVar.n(), aVar.i(), aVar.c(), aVar.q(), aVar.g(), aVar.e(), aVar.f(), aVar.l(), aVar.f(), aVar.a(), aVar.a(), aVar.i(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:101:0x0159  */
    /* JADX WARN: Code duplicated, block: B:103:0x015c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0167  */
    /* JADX WARN: Code duplicated, block: B:107:0x016d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0179  */
    /* JADX WARN: Code duplicated, block: B:112:0x0181  */
    /* JADX WARN: Code duplicated, block: B:114:0x0185  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x0204  */
    /* JADX WARN: Code duplicated, block: B:124:0x0211  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    public static final void a(boolean z8, AbstractC3009n abstractC3009n, U0 u8, long j8, boolean z9, o content, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        boolean zA;
        int i10;
        AbstractC3009n abstractC3009nB;
        U0 u9;
        long jD;
        boolean z10;
        int i11;
        AbstractC3009n abstractC3009n2;
        U0 u0A;
        int i12;
        U0 u10;
        long j9;
        C3089v c3089v;
        View view;
        long j10;
        U0 u11;
        AbstractC3009n abstractC3009n3;
        P0 p0V;
        t.g(content, "content");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(576339112);
        if ((i8 & 14) == 0) {
            if ((i9 & 1) == 0) {
                zA = z8;
                int i13 = interfaceC3163lP.c(zA) ? 4 : 2;
                i10 = i13 | i8;
            } else {
                zA = z8;
            }
            i10 = i13 | i8;
        } else {
            zA = z8;
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if ((i9 & 2) == 0) {
                abstractC3009nB = abstractC3009n;
                int i14 = interfaceC3163lP.R(abstractC3009nB) ? 32 : 16;
                i10 |= i14;
            } else {
                abstractC3009nB = abstractC3009n;
            }
            i10 |= i14;
        } else {
            abstractC3009nB = abstractC3009n;
        }
        if ((i8 & 896) == 0) {
            if ((i9 & 4) == 0) {
                u9 = u8;
                int i15 = interfaceC3163lP.R(u9) ? 256 : 128;
                i10 |= i15;
            } else {
                u9 = u8;
            }
            i10 |= i15;
        } else {
            u9 = u8;
        }
        int i16 = i9 & 8;
        if (i16 != 0) {
            i10 |= 3072;
            jD = j8;
        } else {
            jD = j8;
            if ((i8 & 7168) == 0) {
                i10 |= interfaceC3163lP.j(jD) ? 2048 : 1024;
            }
        }
        if ((57344 & i8) == 0) {
            if ((i9 & 16) == 0) {
                z10 = z9;
                int i17 = interfaceC3163lP.c(z10) ? 16384 : 8192;
                i10 |= i17;
            } else {
                z10 = z9;
            }
            i10 |= i17;
        } else {
            z10 = z9;
        }
        if ((i9 & 32) == 0) {
            if ((458752 & i8) == 0) {
                i11 = interfaceC3163lP.l(content) ? 131072 : 65536;
            }
            if ((374491 & i10) == 74898 || !interfaceC3163lP.s()) {
                interfaceC3163lP.o();
                if ((i8 & 1) != 0 || interfaceC3163lP.F()) {
                    if ((i9 & 1) != 0) {
                        zA = AbstractC2287o.a(interfaceC3163lP, 0);
                        i10 &= -15;
                    }
                    if ((i9 & 2) != 0) {
                        abstractC3009nB = d.b(AbstractC3009n.f34080b);
                        i10 &= -113;
                    }
                    abstractC3009n2 = abstractC3009nB;
                    if ((i9 & 4) != 0) {
                        u0A = d.a(new I(0L, 0L, (C) null, (y) null, (z) null, abstractC3009n2, (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (e) null, 0L, (k) null, (R0) null, (g) null, 0, 0, 0L, (q) null, (p128o1.z) null, (h) null, 0, 0, (s) null, 16777183, (AbstractC2633k) null));
                        i10 &= -897;
                    } else {
                        u0A = u9;
                    }
                    if (i16 != 0) {
                        jD = C1598l0.f9405b.d();
                    }
                    if ((i9 & 16) != 0) {
                        i10 &= -57345;
                        u10 = u0A;
                        z10 = !zA;
                    } else {
                        i12 = i10;
                        u10 = u0A;
                    }
                    j9 = jD;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(576339112, i12, -1, "com.elgato.ui.ElgatoMaterial3Theme (ElgatoMaterial3Theme.kt:35)");
                    }
                    if (zA) {
                        c3089v = f15830b;
                    } else {
                        c3089v = f15829a;
                    }
                    C3089v c3089v2 = c3089v;
                    p014b4.c cVar = new p014b4.c(zA);
                    view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                    interfaceC3163lP.f(351074940);
                    if (!view.isInEditMode()) {
                        K.g(new C0395a(view, j9, z10), interfaceC3163lP, 0);
                    }
                    interfaceC3163lP.N();
                    W3.c cVar2 = W3.c.f11463a;
                    AbstractC3049a0.a(c3089v2, new y0(p135p0.g.c(cVar2.f()), p135p0.g.c(cVar2.d()), p135p0.g.c(cVar2.c()), p135p0.g.c(cVar2.b()), p135p0.g.c(cVar2.e())), u10, H0.c.b(interfaceC3163lP, -686336428, true, new b(cVar, content)), interfaceC3163lP, (i12 & 896) | 3072, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    j10 = j9;
                    u11 = u10;
                    abstractC3009n3 = abstractC3009n2;
                } else {
                    interfaceC3163lP.z();
                    if ((i9 & 1) != 0) {
                        i10 &= -15;
                    }
                    if ((i9 & 2) != 0) {
                        i10 &= -113;
                    }
                    if ((i9 & 4) != 0) {
                        i10 &= -897;
                    }
                    if ((i9 & 16) != 0) {
                        i10 &= -57345;
                    }
                    abstractC3009n2 = abstractC3009nB;
                    u10 = u9;
                }
                i12 = i10;
                j9 = jD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(576339112, i12, -1, "com.elgato.ui.ElgatoMaterial3Theme (ElgatoMaterial3Theme.kt:35)");
                }
                if (zA) {
                    c3089v = f15829a;
                } else {
                    c3089v = f15830b;
                }
                C3089v c3089v3 = c3089v;
                p014b4.c cVar3 = new p014b4.c(zA);
                view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                interfaceC3163lP.f(351074940);
                if (!view.isInEditMode()) {
                    K.g(new C0395a(view, j9, z10), interfaceC3163lP, 0);
                }
                interfaceC3163lP.N();
                W3.c cVar4 = W3.c.f11463a;
                AbstractC3049a0.a(c3089v3, new y0(p135p0.g.c(cVar4.f()), p135p0.g.c(cVar4.d()), p135p0.g.c(cVar4.c()), p135p0.g.c(cVar4.b()), p135p0.g.c(cVar4.e())), u10, H0.c.b(interfaceC3163lP, -686336428, true, new b(cVar3, content)), interfaceC3163lP, (i12 & 896) | 3072, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                j10 = j9;
                u11 = u10;
                abstractC3009n3 = abstractC3009n2;
            } else {
                interfaceC3163lP.z();
                abstractC3009n3 = abstractC3009nB;
                u11 = u9;
                j10 = jD;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(zA, abstractC3009n3, u11, j10, z10, content, i8, i9));
            }
        }
        i11 = 196608;
        i10 |= i11;
        if ((374491 & i10) == 74898) {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if ((i9 & 1) != 0) {
                    zA = AbstractC2287o.a(interfaceC3163lP, 0);
                    i10 &= -15;
                }
                if ((i9 & 2) != 0) {
                    abstractC3009nB = d.b(AbstractC3009n.f34080b);
                    i10 &= -113;
                }
                abstractC3009n2 = abstractC3009nB;
                if ((i9 & 4) != 0) {
                    u0A = d.a(new I(0L, 0L, (C) null, (y) null, (z) null, abstractC3009n2, (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (e) null, 0L, (k) null, (R0) null, (g) null, 0, 0, 0L, (q) null, (p128o1.z) null, (h) null, 0, 0, (s) null, 16777183, (AbstractC2633k) null));
                    i10 &= -897;
                } else {
                    u0A = u9;
                }
                if (i16 != 0) {
                    jD = C1598l0.f9405b.d();
                }
                if ((i9 & 16) != 0) {
                    i10 &= -57345;
                    u10 = u0A;
                    z10 = !zA;
                    i12 = i10;
                } else {
                    i12 = i10;
                    u10 = u0A;
                }
            } else {
                if ((i9 & 1) != 0) {
                    zA = AbstractC2287o.a(interfaceC3163lP, 0);
                    i10 &= -15;
                }
                if ((i9 & 2) != 0) {
                    abstractC3009nB = d.b(AbstractC3009n.f34080b);
                    i10 &= -113;
                }
                abstractC3009n2 = abstractC3009nB;
                if ((i9 & 4) != 0) {
                    u0A = d.a(new I(0L, 0L, (C) null, (y) null, (z) null, abstractC3009n2, (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (e) null, 0L, (k) null, (R0) null, (g) null, 0, 0, 0L, (q) null, (p128o1.z) null, (h) null, 0, 0, (s) null, 16777183, (AbstractC2633k) null));
                    i10 &= -897;
                } else {
                    u0A = u9;
                }
                if (i16 != 0) {
                    jD = C1598l0.f9405b.d();
                }
                if ((i9 & 16) != 0) {
                    i10 &= -57345;
                    u10 = u0A;
                    z10 = !zA;
                    i12 = i10;
                } else {
                    i12 = i10;
                    u10 = u0A;
                }
            }
            j9 = jD;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(576339112, i12, -1, "com.elgato.ui.ElgatoMaterial3Theme (ElgatoMaterial3Theme.kt:35)");
            }
            if (zA) {
                c3089v = f15829a;
            } else {
                c3089v = f15830b;
            }
            C3089v c3089v4 = c3089v;
            p014b4.c cVar5 = new p014b4.c(zA);
            view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            interfaceC3163lP.f(351074940);
            if (!view.isInEditMode()) {
                K.g(new C0395a(view, j9, z10), interfaceC3163lP, 0);
            }
            interfaceC3163lP.N();
            W3.c cVar6 = W3.c.f11463a;
            AbstractC3049a0.a(c3089v4, new y0(p135p0.g.c(cVar6.f()), p135p0.g.c(cVar6.d()), p135p0.g.c(cVar6.c()), p135p0.g.c(cVar6.b()), p135p0.g.c(cVar6.e())), u10, H0.c.b(interfaceC3163lP, -686336428, true, new b(cVar5, content)), interfaceC3163lP, (i12 & 896) | 3072, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            j10 = j9;
            u11 = u10;
            abstractC3009n3 = abstractC3009n2;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0) {
                if ((i9 & 1) != 0) {
                    zA = AbstractC2287o.a(interfaceC3163lP, 0);
                    i10 &= -15;
                }
                if ((i9 & 2) != 0) {
                    abstractC3009nB = d.b(AbstractC3009n.f34080b);
                    i10 &= -113;
                }
                abstractC3009n2 = abstractC3009nB;
                if ((i9 & 4) != 0) {
                    u0A = d.a(new I(0L, 0L, (C) null, (y) null, (z) null, abstractC3009n2, (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (e) null, 0L, (k) null, (R0) null, (g) null, 0, 0, 0L, (q) null, (p128o1.z) null, (h) null, 0, 0, (s) null, 16777183, (AbstractC2633k) null));
                    i10 &= -897;
                } else {
                    u0A = u9;
                }
                if (i16 != 0) {
                    jD = C1598l0.f9405b.d();
                }
                if ((i9 & 16) != 0) {
                    i10 &= -57345;
                    u10 = u0A;
                    z10 = !zA;
                    i12 = i10;
                } else {
                    i12 = i10;
                    u10 = u0A;
                }
            } else {
                if ((i9 & 1) != 0) {
                    zA = AbstractC2287o.a(interfaceC3163lP, 0);
                    i10 &= -15;
                }
                if ((i9 & 2) != 0) {
                    abstractC3009nB = d.b(AbstractC3009n.f34080b);
                    i10 &= -113;
                }
                abstractC3009n2 = abstractC3009nB;
                if ((i9 & 4) != 0) {
                    u0A = d.a(new I(0L, 0L, (C) null, (y) null, (z) null, abstractC3009n2, (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (e) null, 0L, (k) null, (R0) null, (g) null, 0, 0, 0L, (q) null, (p128o1.z) null, (h) null, 0, 0, (s) null, 16777183, (AbstractC2633k) null));
                    i10 &= -897;
                } else {
                    u0A = u9;
                }
                if (i16 != 0) {
                    jD = C1598l0.f9405b.d();
                }
                if ((i9 & 16) != 0) {
                    i10 &= -57345;
                    u10 = u0A;
                    z10 = !zA;
                    i12 = i10;
                } else {
                    i12 = i10;
                    u10 = u0A;
                }
            }
            j9 = jD;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(576339112, i12, -1, "com.elgato.ui.ElgatoMaterial3Theme (ElgatoMaterial3Theme.kt:35)");
            }
            if (zA) {
                c3089v = f15829a;
            } else {
                c3089v = f15830b;
            }
            C3089v c3089v5 = c3089v;
            p014b4.c cVar7 = new p014b4.c(zA);
            view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            interfaceC3163lP.f(351074940);
            if (!view.isInEditMode()) {
                K.g(new C0395a(view, j9, z10), interfaceC3163lP, 0);
            }
            interfaceC3163lP.N();
            W3.c cVar8 = W3.c.f11463a;
            AbstractC3049a0.a(c3089v5, new y0(p135p0.g.c(cVar8.f()), p135p0.g.c(cVar8.d()), p135p0.g.c(cVar8.c()), p135p0.g.c(cVar8.b()), p135p0.g.c(cVar8.e())), u10, H0.c.b(interfaceC3163lP, -686336428, true, new b(cVar7, content)), interfaceC3163lP, (i12 & 896) | 3072, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            j10 = j9;
            u11 = u10;
            abstractC3009n3 = abstractC3009n2;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(zA, abstractC3009n3, u11, j10, z10, content, i8, i9));
        }
    }
}
