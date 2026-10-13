package p046f0;

import C6.G;
import L0.i;
import O0.f;
import Q6.k;
import Q6.o;
import R0.C1600m0;
import R0.InterfaceC1621x0;
import V0.q;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.H;
import p038e1.I;
import p038e1.InterfaceC2235f;
import p038e1.J;
import p038e1.a0;
import p056g1.InterfaceC2343g;
import p110m1.h;
import p110m1.n;
import p110m1.x;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f21259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f21259a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f21259a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ U0.b f21262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f21263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f21264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0.c f21265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2235f f21266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f21267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C1600m0 f21268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f21269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f21270i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(U0.b bVar, String str, i iVar, L0.c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0, int i8, int i9) {
            super(2);
            this.f21262a = bVar;
            this.f21263b = str;
            this.f21264c = iVar;
            this.f21265d = cVar;
            this.f21266e = interfaceC2235f;
            this.f21267f = f8;
            this.f21268g = c1600m0;
            this.f21269h = i8;
            this.f21270i = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            D.a(this.f21262a, this.f21263b, this.f21264c, this.f21265d, this.f21266e, this.f21267f, this.f21268g, interfaceC3163l, F0.a(this.f21269h | 1), this.f21270i);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f21271a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f21271a = str;
        }

        public final void b(x xVar) {
            p110m1.u.M(xVar, this.f21271a);
            p110m1.u.S(xVar, h.f29507b.d());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    public static final void a(U0.b bVar, String str, i iVar, L0.c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        i iVarD;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1142754848);
        i iVar2 = (i9 & 4) != 0 ? i.f4836a : iVar;
        L0.c cVarE = (i9 & 8) != 0 ? L0.c.f4806a.e() : cVar;
        InterfaceC2235f interfaceC2235fC = (i9 & 16) != 0 ? InterfaceC2235f.f20468a.c() : interfaceC2235f;
        float f9 = (i9 & 32) != 0 ? 1.0f : f8;
        C1600m0 c1600m1 = (i9 & 64) != 0 ? null : c1600m0;
        if (AbstractC3169o.K()) {
            i10 = i8;
            AbstractC3169o.W(1142754848, i10, -1, "androidx.compose.foundation.Image (Image.kt:243)");
        } else {
            i10 = i8;
        }
        if (str != null) {
            i.a aVar = i.f4836a;
            interfaceC3163lP.f(-175855396);
            boolean zR = interfaceC3163lP.R(str);
            Object objG = interfaceC3163lP.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new d(str);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            iVarD = n.d(aVar, false, (k) objG, 1, null);
        } else {
            iVarD = i.f4836a;
        }
        C1600m0 c1600m2 = c1600m1;
        float f10 = f9;
        i iVarB = androidx.compose.ui.draw.b.b(f.b(iVar2.j(iVarD)), bVar, false, cVarE, interfaceC2235fC, f10, c1600m2, 2, null);
        b bVar2 = b.f21260a;
        interfaceC3163lP.f(544976794);
        int iA = AbstractC3157i.a(interfaceC3163lP, 0);
        i iVarC = L0.h.c(interfaceC3163lP, iVarB);
        InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
        InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
        Function0 function0A = aVar2.a();
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
        v1.b(interfaceC3163lA, bVar2, aVar2.c());
        v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
        v1.b(interfaceC3163lA, iVarC, aVar2.d());
        o oVarB = aVar2.b();
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
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(bVar, str, iVar2, cVarE, interfaceC2235fC, f10, c1600m2, i10, i9));
        }
    }

    public static final void b(V0.d dVar, String str, i iVar, L0.c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(1595907091);
        if ((i9 & 4) != 0) {
            iVar = i.f4836a;
        }
        i iVar2 = iVar;
        if ((i9 & 8) != 0) {
            cVar = L0.c.f4806a.e();
        }
        L0.c cVar2 = cVar;
        if ((i9 & 16) != 0) {
            interfaceC2235f = InterfaceC2235f.f20468a.c();
        }
        InterfaceC2235f interfaceC2235f2 = interfaceC2235f;
        if ((i9 & 32) != 0) {
            f8 = 1.0f;
        }
        float f9 = f8;
        C1600m0 c1600m1 = (i9 & 64) != 0 ? null : c1600m0;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1595907091, i8, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        a(q.g(dVar, interfaceC3163l, i8 & 14), str, iVar2, cVar2, interfaceC2235f2, f9, c1600m1, interfaceC3163l, VectorPainter.f14716n | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8), 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    public static final void c(InterfaceC1621x0 interfaceC1621x0, String str, i iVar, L0.c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0, int i8, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        interfaceC3163l.f(-1396260732);
        i iVar2 = (i10 & 4) != 0 ? i.f4836a : iVar;
        L0.c cVarE = (i10 & 8) != 0 ? L0.c.f4806a.e() : cVar;
        InterfaceC2235f interfaceC2235fC = (i10 & 16) != 0 ? InterfaceC2235f.f20468a.c() : interfaceC2235f;
        float f9 = (i10 & 32) != 0 ? 1.0f : f8;
        C1600m0 c1600m1 = (i10 & 64) != 0 ? null : c1600m0;
        int iB = (i10 & 128) != 0 ? T0.f.f9808L.b() : i8;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1396260732, i9, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(interfaceC1621x0);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = U0.a.b(interfaceC1621x0, 0L, 0L, iB, 6, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        a((BitmapPainter) objG, str, iVar2, cVarE, interfaceC2235fC, f9, c1600m1, interfaceC3163l, (i9 & 3670016) | (i9 & 112) | 8 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9), 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21260a = new b();

        @Override // p038e1.H
        public final I d(J j8, List list, long j9) {
            return J.X0(j8, A1.b.p(j9), A1.b.o(j9), null, a.f21261a, 4, null);
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f21261a = new a();

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
