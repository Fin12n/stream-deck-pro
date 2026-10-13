package p110m1;

import C6.G;
import D6.r;
import D6.z;
import L0.i;
import Q0.h;
import Q6.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p038e1.InterfaceC2251w;
import p056g1.AbstractC2347k;
import p056g1.F;
import p056g1.InterfaceC2346j;
import p056g1.X;
import p056g1.Z;
import p056g1.p0;
import p056g1.q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.c f29552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f29554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f29555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f29557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29558g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f29559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(1);
            this.f29559a = hVar;
        }

        public final void b(x xVar) {
            u.S(xVar, this.f29559a.n());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f29560a = str;
        }

        public final void b(x xVar) {
            u.M(xVar, this.f29560a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends i.c implements p0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ k f29561n;

        public c(k kVar) {
            this.f29561n = kVar;
        }

        @Override // p056g1.p0
        public void Q(x xVar) {
            this.f29561n.invoke(xVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29562a = new d();

        public d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(F f8) {
            k kVarG = f8.G();
            boolean z8 = false;
            if (kVarG != null && kVarG.E()) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f29563a = new e();

        public e() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(F f8) {
            k kVarG = f8.G();
            boolean z8 = false;
            if (kVarG != null && kVarG.E()) {
                z8 = true;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f29564a = new f();

        public f() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(F f8) {
            return Boolean.valueOf(f8.j0().r(Z.a(8)));
        }
    }

    public o(i.c cVar, boolean z8, F f8, k kVar) {
        this.f29552a = cVar;
        this.f29553b = z8;
        this.f29554c = f8;
        this.f29555d = kVar;
        this.f29558g = f8.o0();
    }

    public static /* synthetic */ List C(o oVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return oVar.B(z8);
    }

    public static /* synthetic */ List g(o oVar, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = new ArrayList();
        }
        return oVar.f(list);
    }

    public final void A(k kVar) {
        if (this.f29555d.D()) {
            return;
        }
        List listC = C(this, false, 1, null);
        int size = listC.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) listC.get(i8);
            if (!oVar.x()) {
                kVar.F(oVar.f29555d);
                oVar.A(kVar);
            }
        }
    }

    public final List B(boolean z8) {
        if (this.f29556e) {
            return r.n();
        }
        ArrayList arrayList = new ArrayList();
        d(this.f29554c, arrayList);
        if (z8) {
            b(arrayList);
        }
        return arrayList;
    }

    public final o a() {
        return new o(this.f29552a, true, this.f29554c, this.f29555d);
    }

    public final void b(List list) {
        h hVarH = p.h(this);
        if (hVarH != null && this.f29555d.E() && !list.isEmpty()) {
            list.add(c(hVarH, new a(hVarH)));
        }
        k kVar = this.f29555d;
        r rVar = r.f29573a;
        if (kVar.o(rVar.c()) && !list.isEmpty() && this.f29555d.E()) {
            List list2 = (List) l.a(this.f29555d, rVar.c());
            String str = list2 != null ? (String) z.k0(list2) : null;
            if (str != null) {
                list.add(0, c(null, new b(str)));
            }
        }
    }

    public final o c(h hVar, k kVar) {
        k kVar2 = new k();
        kVar2.H(false);
        kVar2.G(false);
        kVar.invoke(kVar2);
        o oVar = new o(new c(kVar), false, new F(true, hVar != null ? p.i(this) : p.e(this)), kVar2);
        oVar.f29556e = true;
        oVar.f29557f = this;
        return oVar;
    }

    public final void d(F f8, List list) {
        B0.d dVarT0 = f8.t0();
        int iS = dVarT0.s();
        if (iS > 0) {
            Object[] objArrR = dVarT0.r();
            int i8 = 0;
            do {
                F f9 = (F) objArrR[i8];
                if (f9.I0()) {
                    if (f9.j0().r(Z.a(8))) {
                        list.add(p.a(f9, this.f29553b));
                    } else {
                        d(f9, list);
                    }
                }
                i8++;
            } while (i8 < iS);
        }
    }

    public final X e() {
        if (this.f29556e) {
            o oVarQ = q();
            if (oVarQ != null) {
                return oVarQ.e();
            }
            return null;
        }
        InterfaceC2346j interfaceC2346jG = p.g(this.f29554c);
        if (interfaceC2346jG == null) {
            interfaceC2346jG = this.f29552a;
        }
        return AbstractC2347k.h(interfaceC2346jG, Z.a(8));
    }

    public final List f(List list) {
        List listC = C(this, false, 1, null);
        int size = listC.size();
        for (int i8 = 0; i8 < size; i8++) {
            o oVar = (o) listC.get(i8);
            if (oVar.x()) {
                list.add(oVar);
            } else if (!oVar.f29555d.D()) {
                oVar.f(list);
            }
        }
        return list;
    }

    public final h h() {
        InterfaceC2247s interfaceC2247sA2;
        o oVarQ = q();
        if (oVarQ == null) {
            return h.f9087e.a();
        }
        X xE = e();
        if (xE != null) {
            if (!xE.y()) {
                xE = null;
            }
            if (xE != null && (interfaceC2247sA2 = xE.a2()) != null) {
                return InterfaceC2247s.t(AbstractC2347k.h(oVarQ.f29552a, Z.a(8)), interfaceC2247sA2, false, 2, null);
            }
        }
        return h.f9087e.a();
    }

    public final h i() {
        h hVarB;
        X xE = e();
        if (xE != null) {
            if (!xE.y()) {
                xE = null;
            }
            if (xE != null && (hVarB = AbstractC2248t.b(xE)) != null) {
                return hVarB;
            }
        }
        return h.f9087e.a();
    }

    public final h j() {
        h hVarC;
        X xE = e();
        if (xE != null) {
            if (!xE.y()) {
                xE = null;
            }
            if (xE != null && (hVarC = AbstractC2248t.c(xE)) != null) {
                return hVarC;
            }
        }
        return h.f9087e.a();
    }

    public final List k() {
        return l(!this.f29553b, false);
    }

    public final List l(boolean z8, boolean z9) {
        if (z8 || !this.f29555d.D()) {
            return x() ? g(this, null, 1, null) : B(z9);
        }
        return r.n();
    }

    public final k m() {
        if (!x()) {
            return this.f29555d;
        }
        k kVarT = this.f29555d.t();
        A(kVarT);
        return kVarT;
    }

    public final int n() {
        return this.f29558g;
    }

    public final InterfaceC2251w o() {
        return this.f29554c;
    }

    public final F p() {
        return this.f29554c;
    }

    public final o q() {
        o oVar = this.f29557f;
        if (oVar != null) {
            return oVar;
        }
        F f8 = this.f29553b ? p.f(this.f29554c, e.f29563a) : null;
        if (f8 == null) {
            f8 = p.f(this.f29554c, f.f29564a);
        }
        if (f8 == null) {
            return null;
        }
        return p.a(f8, this.f29553b);
    }

    public final long r() {
        X xE = e();
        if (xE != null) {
            if (!xE.y()) {
                xE = null;
            }
            if (xE != null) {
                return AbstractC2248t.e(xE);
            }
        }
        return Q0.f.f9082b.c();
    }

    public final List s() {
        return l(false, true);
    }

    public final long t() {
        X xE = e();
        return xE != null ? xE.a() : A1.r.f455b.a();
    }

    public final h u() {
        InterfaceC2346j interfaceC2346jG;
        if (!this.f29555d.E() || (interfaceC2346jG = p.g(this.f29554c)) == null) {
            interfaceC2346jG = this.f29552a;
        }
        return q0.c(interfaceC2346jG.I0(), q0.a(this.f29555d));
    }

    public final k v() {
        return this.f29555d;
    }

    public final boolean w() {
        return this.f29556e;
    }

    public final boolean x() {
        return this.f29553b && this.f29555d.E();
    }

    public final boolean y() {
        X xE = e();
        if (xE != null) {
            return xE.v2();
        }
        return false;
    }

    public final boolean z() {
        return !this.f29556e && s().isEmpty() && p.f(this.f29554c, d.f29562a) == null;
    }
}
