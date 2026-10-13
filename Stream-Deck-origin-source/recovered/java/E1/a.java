package E1;

import A1.t;
import C6.G;
import D6.r;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.J;
import p038e1.a0;
import p056g1.InterfaceC2343g;
import p065h1.X;
import p110m1.x;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.K;
import p215z0.P0;
import p215z0.R0;
import p215z0.g1;
import p215z0.q1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: E1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0089a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2029a;

        /* JADX INFO: renamed from: E1.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0090a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f2030a;

            public C0090a(h hVar) {
                this.f2030a = hVar;
            }

            @Override // p215z0.H
            public void d() {
                this.f2030a.dismiss();
                this.f2030a.j();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0089a(h hVar) {
            super(1);
            this.f2029a = hVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            this.f2029a.show();
            return new C0090a(this.f2029a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f2031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f2032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E1.g f2033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t f2034d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, Function0 function0, E1.g gVar, t tVar) {
            super(0);
            this.f2031a = hVar;
            this.f2032b = function0;
            this.f2033c = gVar;
            this.f2034d = tVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m52invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke() {
            this.f2031a.o(this.f2032b, this.f2033c, this.f2034d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f2035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E1.g f2036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.o f2037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2039e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, E1.g gVar, Q6.o oVar, int i8, int i9) {
            super(2);
            this.f2035a = function0;
            this.f2036b = gVar;
            this.f2037c = oVar;
            this.f2038d = i8;
            this.f2039e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f2035a, this.f2036b, this.f2037c, interfaceC3163l, F0.a(this.f2038d | 1), this.f2039e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f2040a;

        /* JADX INFO: renamed from: E1.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0091a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0091a f2041a = new C0091a();

            public C0091a() {
                super(1);
            }

            public final void b(x xVar) {
                p110m1.u.j(xVar);
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
            public final /* synthetic */ q1 f2042a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q1 q1Var) {
                super(2);
                this.f2042a = q1Var;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-533674951, i8, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:176)");
                }
                a.b(this.f2042a).invoke(interfaceC3163l, 0);
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
        public d(q1 q1Var) {
            super(2);
            this.f2040a = q1Var;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(488261145, i8, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:173)");
            }
            a.c(p110m1.n.d(L0.i.f4836a, false, C0091a.f2041a, 1, null), H0.c.b(interfaceC3163l, -533674951, true, new b(this.f2040a)), interfaceC3163l, 48, 0);
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
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f2043a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements p038e1.H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f2044a = new f();

        /* JADX INFO: renamed from: E1.a$f$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0092a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f2045a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0092a(List list) {
                super(1);
                this.f2045a = list;
            }

            public final void b(a0.a aVar) {
                List list = this.f2045a;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    a0.a.j(aVar, (a0) list.get(i8), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        @Override // p038e1.H
        public final p038e1.I d(J j8, List list, long j9) {
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((p038e1.G) list.get(i8)).J(j9));
            }
            Object obj2 = null;
            int i9 = 1;
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(0);
                int iY0 = ((a0) obj).y0();
                int iP = r.p(arrayList);
                if (1 <= iP) {
                    int i10 = 1;
                    while (true) {
                        Object obj3 = arrayList.get(i10);
                        int iY1 = ((a0) obj3).y0();
                        if (iY0 < iY1) {
                            obj = obj3;
                            iY0 = iY1;
                        }
                        if (i10 == iP) {
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                obj = null;
            }
            a0 a0Var = (a0) obj;
            int iY2 = a0Var != null ? a0Var.y0() : A1.b.p(j9);
            if (!arrayList.isEmpty()) {
                Object obj4 = arrayList.get(0);
                int iH0 = ((a0) obj4).h0();
                int iP2 = r.p(arrayList);
                if (1 <= iP2) {
                    while (true) {
                        Object obj5 = arrayList.get(i9);
                        int iH1 = ((a0) obj5).h0();
                        if (iH0 < iH1) {
                            obj4 = obj5;
                            iH0 = iH1;
                        }
                        if (i9 == iP2) {
                            break;
                        }
                        i9++;
                    }
                }
                obj2 = obj4;
            }
            a0 a0Var2 = (a0) obj2;
            return J.X0(j8, iY2, a0Var2 != null ? a0Var2.h0() : A1.b.o(j9), null, new C0092a(arrayList), 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f2046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.o f2047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(L0.i iVar, Q6.o oVar, int i8, int i9) {
            super(2);
            this.f2046a = iVar;
            this.f2047b = oVar;
            this.f2048c = i8;
            this.f2049d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.c(this.f2046a, this.f2047b, interfaceC3163l, F0.a(this.f2048c | 1), this.f2049d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(Function0 function0, E1.g gVar, Q6.o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        E1.g gVar2;
        int i11;
        View view;
        A1.d dVar;
        t tVar;
        AbstractC3173q abstractC3173qD;
        q1 q1VarP;
        UUID uuid;
        boolean zR;
        Object objG;
        E1.g gVar3;
        t tVar2;
        P0 p0V;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2032877254);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.l(function0) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i12 = i9 & 2;
        if (i12 == 0) {
            if ((i8 & 112) == 0) {
                gVar2 = gVar;
                i10 |= interfaceC3163lP.R(gVar2) ? 32 : 16;
            }
            if ((i9 & 4) != 0) {
                i10 |= 384;
            } else if ((i8 & 896) == 0) {
                if (interfaceC3163lP.l(oVar)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i10 |= i11;
            }
            if ((i10 & 731) == 146 || !interfaceC3163lP.s()) {
                if (i12 != 0) {
                    gVar2 = new E1.g(false, false, (p) null, 7, (AbstractC2633k) null);
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-2032877254, i10, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:154)");
                }
                view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
                dVar = (A1.d) interfaceC3163lP.e(X.d());
                tVar = (t) interfaceC3163lP.e(X.i());
                abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
                q1VarP = g1.p(oVar, interfaceC3163lP, (i10 >> 6) & 14);
                uuid = (UUID) I0.b.b(new Object[0], null, null, e.f2043a, interfaceC3163lP, 3080, 6);
                interfaceC3163lP.f(511388516);
                zR = interfaceC3163lP.R(view) | interfaceC3163lP.R(dVar);
                objG = interfaceC3163lP.g();
                if (!zR || objG == InterfaceC3163l.f38803a.a()) {
                    gVar3 = gVar2;
                    tVar2 = tVar;
                    h hVar = new h(function0, gVar3, view, tVar2, dVar, uuid);
                    hVar.k(abstractC3173qD, H0.c.c(488261145, true, new d(q1VarP)));
                    interfaceC3163lP.H(hVar);
                    objG = hVar;
                } else {
                    gVar3 = gVar2;
                    tVar2 = tVar;
                }
                interfaceC3163lP.N();
                h hVar2 = (h) objG;
                K.a(hVar2, new C0089a(hVar2), interfaceC3163lP, 8);
                K.g(new b(hVar2, function0, gVar3, tVar2), interfaceC3163lP, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            } else {
                interfaceC3163lP.z();
                gVar3 = gVar2;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new c(function0, gVar3, oVar, i8, i9));
            }
        }
        i10 |= 48;
        gVar2 = gVar;
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (interfaceC3163lP.l(oVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146) {
            if (i12 != 0) {
                gVar2 = new E1.g(false, false, (p) null, 7, (AbstractC2633k) null);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2032877254, i10, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:154)");
            }
            view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            tVar = (t) interfaceC3163lP.e(X.i());
            abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
            q1VarP = g1.p(oVar, interfaceC3163lP, (i10 >> 6) & 14);
            uuid = (UUID) I0.b.b(new Object[0], null, null, e.f2043a, interfaceC3163lP, 3080, 6);
            interfaceC3163lP.f(511388516);
            zR = interfaceC3163lP.R(view) | interfaceC3163lP.R(dVar);
            objG = interfaceC3163lP.g();
            if (zR) {
                gVar3 = gVar2;
                tVar2 = tVar;
                h hVar3 = new h(function0, gVar3, view, tVar2, dVar, uuid);
                hVar3.k(abstractC3173qD, H0.c.c(488261145, true, new d(q1VarP)));
                interfaceC3163lP.H(hVar3);
                objG = hVar3;
            } else {
                gVar3 = gVar2;
                tVar2 = tVar;
                h hVar4 = new h(function0, gVar3, view, tVar2, dVar, uuid);
                hVar4.k(abstractC3173qD, H0.c.c(488261145, true, new d(q1VarP)));
                interfaceC3163lP.H(hVar4);
                objG = hVar4;
            }
            interfaceC3163lP.N();
            h hVar5 = (h) objG;
            K.a(hVar5, new C0089a(hVar5), interfaceC3163lP, 8);
            K.g(new b(hVar5, function0, gVar3, tVar2), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        } else {
            if (i12 != 0) {
                gVar2 = new E1.g(false, false, (p) null, 7, (AbstractC2633k) null);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2032877254, i10, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:154)");
            }
            view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
            dVar = (A1.d) interfaceC3163lP.e(X.d());
            tVar = (t) interfaceC3163lP.e(X.i());
            abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
            q1VarP = g1.p(oVar, interfaceC3163lP, (i10 >> 6) & 14);
            uuid = (UUID) I0.b.b(new Object[0], null, null, e.f2043a, interfaceC3163lP, 3080, 6);
            interfaceC3163lP.f(511388516);
            zR = interfaceC3163lP.R(view) | interfaceC3163lP.R(dVar);
            objG = interfaceC3163lP.g();
            if (zR) {
                gVar3 = gVar2;
                tVar2 = tVar;
                h hVar6 = new h(function0, gVar3, view, tVar2, dVar, uuid);
                hVar6.k(abstractC3173qD, H0.c.c(488261145, true, new d(q1VarP)));
                interfaceC3163lP.H(hVar6);
                objG = hVar6;
            } else {
                gVar3 = gVar2;
                tVar2 = tVar;
                h hVar7 = new h(function0, gVar3, view, tVar2, dVar, uuid);
                hVar7.k(abstractC3173qD, H0.c.c(488261145, true, new d(q1VarP)));
                interfaceC3163lP.H(hVar7);
                objG = hVar7;
            }
            interfaceC3163lP.N();
            h hVar8 = (h) objG;
            K.a(hVar8, new C0089a(hVar8), interfaceC3163lP, 8);
            K.g(new b(hVar8, function0, gVar3, tVar2), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(function0, gVar3, oVar, i8, i9));
        }
    }

    public static final Q6.o b(q1 q1Var) {
        return (Q6.o) q1Var.getValue();
    }

    public static final void c(L0.i iVar, Q6.o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1177876616);
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
            i10 |= interfaceC3163lP.l(oVar) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i11 != 0) {
                iVar = L0.i.f4836a;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1177876616, i10, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:452)");
            }
            f fVar = f.f2044a;
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            Q6.p pVarB = AbstractC2252x.b(iVar);
            int i12 = ((((((i10 >> 3) & 14) | 384) | ((i10 << 3) & 112)) << 9) & 7168) | 6;
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(function0A);
            } else {
                interfaceC3163lP.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, fVar, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            Q6.o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !kotlin.jvm.internal.t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            oVar.invoke(interfaceC3163lP, Integer.valueOf((i12 >> 9) & 14));
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new g(iVar, oVar, i8, i9));
        }
    }
}
