package p038e1;

import C6.G;
import L0.h;
import L0.i;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.F;
import p056g1.InterfaceC2343g;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.K;
import p215z0.P0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20482a = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public String toString() {
            return "ReusedSlotId";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f20483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(0);
            this.f20483a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f20483a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f20484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f20485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f20487d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, o oVar, int i8, int i9) {
            super(2);
            this.f20484a = iVar;
            this.f20485b = oVar;
            this.f20486c = i8;
            this.f20487d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h0.a(this.f20484a, this.f20485b, interfaceC3163l, F0.a(this.f20486c | 1), this.f20487d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f20488a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i0 i0Var) {
            super(0);
            this.f20488a = i0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m193invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m193invoke() {
            this.f20488a.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f20489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f20490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f20491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f20492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f20493e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i0 i0Var, i iVar, o oVar, int i8, int i9) {
            super(2);
            this.f20489a = i0Var;
            this.f20490b = iVar;
            this.f20491c = oVar;
            this.f20492d = i8;
            this.f20493e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            h0.b(this.f20489a, this.f20490b, this.f20491c, interfaceC3163l, F0.a(this.f20492d | 1), this.f20493e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        o oVar2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1298353104);
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
            oVar2 = oVar;
        } else {
            if (i11 != 0) {
                iVar = i.f4836a;
            }
            i iVar2 = iVar;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1298353104, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:74)");
            }
            interfaceC3163lP.f(-492369756);
            Object objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = new i0();
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            int i12 = i10 << 3;
            oVar2 = oVar;
            b((i0) objG, iVar2, oVar2, interfaceC3163lP, (i12 & 112) | 8 | (i12 & 896), 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            iVar = iVar2;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(iVar, oVar2, i8, i9));
        }
    }

    public static final void b(i0 i0Var, i iVar, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-511989831);
        if ((i9 & 2) != 0) {
            iVar = i.f4836a;
        }
        i iVar2 = iVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-511989831, i8, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:108)");
        }
        int iA = AbstractC3157i.a(interfaceC3163lP, 0);
        AbstractC3173q abstractC3173qD = AbstractC3157i.d(interfaceC3163lP, 0);
        i iVarC = h.c(interfaceC3163lP, iVar2);
        InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
        Function0 function0A = F.f23314W.a();
        interfaceC3163lP.f(1405779621);
        if (interfaceC3163lP.t() == null) {
            AbstractC3157i.c();
        }
        interfaceC3163lP.r();
        if (interfaceC3163lP.m()) {
            interfaceC3163lP.w(new b(function0A));
        } else {
            interfaceC3163lP.G();
        }
        InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163lP);
        v1.b(interfaceC3163lA, i0Var, i0Var.g());
        v1.b(interfaceC3163lA, abstractC3173qD, i0Var.e());
        v1.b(interfaceC3163lA, oVar, i0Var.f());
        InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
        v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
        v1.b(interfaceC3163lA, iVarC, aVar.d());
        o oVarB = aVar.b();
        if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
            interfaceC3163lA.H(Integer.valueOf(iA));
            interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
        }
        interfaceC3163lP.O();
        interfaceC3163lP.N();
        if (!interfaceC3163lP.s()) {
            K.g(new d(i0Var), interfaceC3163lP, 0);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(i0Var, iVar2, oVar, i8, i9));
        }
    }

    public static final k0 c(int i8) {
        return new C2238i(i8);
    }
}
