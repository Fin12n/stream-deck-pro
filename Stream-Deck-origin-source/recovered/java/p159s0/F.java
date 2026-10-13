package p159s0;

import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
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
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32652a = new a();

        /* JADX INFO: renamed from: s0.F$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0724a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f32653a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0724a(List list) {
                super(1);
                this.f32653a = list;
            }

            public final void b(a0.a aVar) {
                List list = this.f32653a;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    a0.a.f(aVar, (a0) list.get(i8), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        @Override // p038e1.H
        public final I d(J j8, List list, long j9) {
            ArrayList arrayList = new ArrayList(list.size());
            Integer numValueOf = 0;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((p038e1.G) list.get(i8)).J(j9));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i9 = 0; i9 < size2; i9++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((a0) arrayList.get(i9)).y0()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i10 = 0; i10 < size3; i10++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((a0) arrayList.get(i10)).h0()));
            }
            return J.X0(j8, iIntValue, numValueOf.intValue(), null, new C0724a(arrayList), 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f32654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f32655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32657d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, o oVar, int i8, int i9) {
            super(2);
            this.f32654a = iVar;
            this.f32655b = oVar;
            this.f32656c = i8;
            this.f32657d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            F.a(this.f32654a, this.f32655b, interfaceC3163l, F0.a(this.f32656c | 1), this.f32657d);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2105228848);
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
                iVar = i.f4836a;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2105228848, i10, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f32652a;
            interfaceC3163lP.f(-1323940314);
            int iA = AbstractC3157i.a(interfaceC3163lP, 0);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar2.a();
            p pVarB = AbstractC2252x.b(iVar);
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
            v1.b(interfaceC3163lA, aVar, aVar2.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
            o oVarB = aVar2.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
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
            p0V.a(new b(iVar, oVar, i8, i9));
        }
    }
}
