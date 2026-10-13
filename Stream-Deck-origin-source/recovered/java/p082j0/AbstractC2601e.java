package p082j0;

import A1.s;
import C6.G;
import L0.h;
import L0.i;
import Q6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.InterfaceC2343g;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.v1;

/* JADX INFO: renamed from: j0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2601e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f27942a = new C2602f(L0.c.f4806a.m(), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f27943b = c.f27947a;

    /* JADX INFO: renamed from: j0.e$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f27944a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f27944a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f27944a.invoke();
        }
    }

    /* JADX INFO: renamed from: j0.e$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f27945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27946b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, int i8) {
            super(2);
            this.f27945a = iVar;
            this.f27946b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC2601e.a(this.f27945a, interfaceC3163l, F0.a(this.f27946b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-211209833);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-211209833, i9, -1, "androidx.compose.foundation.layout.Box (Box.kt:207)");
            }
            H h8 = f27943b;
            interfaceC3163lP.f(544976794);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            i iVarC = h.c(interfaceC3163lP, iVar);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar.a();
            interfaceC3163lP.f(1405779621);
            if (interfaceC3163lP.t() == null) {
                AbstractC3157i.c();
            }
            interfaceC3163lP.r();
            if (interfaceC3163lP.m()) {
                interfaceC3163lP.w(new a(function0A));
            } else {
                interfaceC3163lP.G();
            }
            InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163lP);
            v1.b(interfaceC3163lA, h8, aVar.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar.e());
            v1.b(interfaceC3163lA, iVarC, aVar.d());
            o oVarB = aVar.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar, i8));
        }
    }

    public static final C2600d d(p038e1.G g8) {
        Object objE = g8.e();
        if (objE instanceof C2600d) {
            return (C2600d) objE;
        }
        return null;
    }

    public static final boolean e(p038e1.G g8) {
        C2600d c2600dD = d(g8);
        if (c2600dD != null) {
            return c2600dD.e2();
        }
        return false;
    }

    public static final void f(a0.a aVar, a0 a0Var, p038e1.G g8, A1.t tVar, int i8, int i9, L0.c cVar) {
        L0.c cVarD2;
        C2600d c2600dD = d(g8);
        a0.a.h(aVar, a0Var, ((c2600dD == null || (cVarD2 = c2600dD.d2()) == null) ? cVar : cVarD2).a(s.a(a0Var.y0(), a0Var.h0()), s.a(i8, i9), tVar), 0.0f, 2, null);
    }

    public static final H g(L0.c cVar, boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        H h8;
        interfaceC3163l.f(56522820);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(56522820, i8, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:84)");
        }
        if (!t.c(cVar, L0.c.f4806a.m()) || z8) {
            Boolean boolValueOf = Boolean.valueOf(z8);
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(boolValueOf) | interfaceC3163l.R(cVar);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2602f(cVar, z8);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            h8 = (H) objG;
        } else {
            h8 = f27942a;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return h8;
    }

    /* JADX INFO: renamed from: j0.e$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27947a = new c();

        @Override // p038e1.H
        public final I d(J j8, List list, long j9) {
            return J.X0(j8, A1.b.p(j9), A1.b.o(j9), null, a.f27948a, 4, null);
        }

        /* JADX INFO: renamed from: j0.e$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27948a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }

            public final void b(a0.a aVar) {
            }
        }
    }
}
