package p143q0;

import A1.b;
import C6.G;
import C6.o;
import D6.r;
import L0.i;
import Q6.k;
import Q6.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2252x;
import p038e1.H;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.InterfaceC2343g;
import p128o1.C2739d;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.v1;

/* JADX INFO: renamed from: q0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2802b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f31568a = new o(r.n(), r.n());

    /* JADX INFO: renamed from: q0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31569a = new a();

        /* JADX INFO: renamed from: q0.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0688a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f31570a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0688a(List list) {
                super(1);
                this.f31570a = list;
            }

            public final void b(a0.a aVar) {
                List list = this.f31570a;
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
        public final I d(J j8, List list, long j9) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((p038e1.G) list.get(i8)).J(j9));
            }
            return J.X0(j8, b.n(j9), b.m(j9), null, new C0688a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: q0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0689b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2739d f31571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f31572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0689b(C2739d c2739d, List list, int i8) {
            super(2);
            this.f31571a = c2739d;
            this.f31572b = list;
            this.f31573c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC2802b.a(this.f31571a, this.f31572b, interfaceC3163l, F0.a(this.f31573c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(C2739d c2739d, List list, InterfaceC3163l interfaceC3163l, int i8) {
        int i9 = 0;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1794596951);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1794596951, i8, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C2739d.b bVar = (C2739d.b) list.get(i10);
            p pVar = (p) bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            a aVar = a.f31569a;
            interfaceC3163lP.f(-1323940314);
            i.a aVar2 = i.f4836a;
            int iA = AbstractC3157i.a(interfaceC3163lP, i9);
            InterfaceC3184w interfaceC3184wE = interfaceC3163lP.E();
            InterfaceC2343g.a aVar3 = InterfaceC2343g.f23596Q;
            Function0 function0A = aVar3.a();
            p pVarB = AbstractC2252x.b(aVar2);
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
            int i11 = size;
            v1.b(interfaceC3163lA, aVar, aVar3.c());
            v1.b(interfaceC3163lA, interfaceC3184wE, aVar3.e());
            Q6.o oVarB = aVar3.b();
            if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                interfaceC3163lA.H(Integer.valueOf(iA));
                interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
            }
            pVarB.invoke(R0.a(R0.b(interfaceC3163lP)), interfaceC3163lP, 0);
            interfaceC3163lP.f(2058660585);
            pVar.invoke(c2739d.subSequence(iB, iC).i(), interfaceC3163lP, 0);
            interfaceC3163lP.N();
            interfaceC3163lP.O();
            interfaceC3163lP.N();
            i10++;
            size = i11;
            i9 = 0;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0689b(c2739d, list, i8));
        }
    }

    public static final boolean b(C2739d c2739d) {
        return c2739d.l("androidx.compose.foundation.text.inlineContent", 0, c2739d.i().length());
    }

    public static final o c(C2739d c2739d, Map map) {
        if (map == null || map.isEmpty()) {
            return f31568a;
        }
        List listH = c2739d.h("androidx.compose.foundation.text.inlineContent", 0, c2739d.i().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listH.size();
        for (int i8 = 0; i8 < size; i8++) {
            C2739d.b bVar = (C2739d.b) listH.get(i8);
            C2817q c2817q = (C2817q) map.get(bVar.e());
            if (c2817q != null) {
                arrayList.add(new C2739d.b(c2817q.b(), bVar.f(), bVar.d()));
                arrayList2.add(new C2739d.b(c2817q.a(), bVar.f(), bVar.d()));
            }
        }
        return new o(arrayList, arrayList2);
    }
}
