package A0;

import Q6.k;
import Q6.o;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.google.mlkit.common.internal.ckI.WqXA;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p215z0.AbstractC3173q;
import p215z0.B;
import p215z0.C3147d;
import p215z0.C3154g0;
import p215z0.C3156h0;
import p215z0.InterfaceC3149e;
import p215z0.InterfaceC3159j;
import p215z0.InterfaceC3171p;
import p215z0.K0;
import p215z0.L0;
import p215z0.T0;
import p215z0.W0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f357a = new g();

    public final void A() {
        this.f357a.x(d.A.f376c);
    }

    public final void C(Object obj, o oVar) {
        g gVar = this.f357a;
        d.C c8 = d.C.f378c;
        gVar.y(c8);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), obj);
        int iA = d.s.a(1);
        t.e(oVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(gVarA, iA, (o) P.e(oVar, 2));
        if (gVar.f416g == gVar.n(c8.b()) && gVar.f417h == gVar.n(c8.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c8.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(c8.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c8.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c8.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c8 + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void D(Object obj, int i8) {
        g gVar = this.f357a;
        d.D d8 = d.D.f379c;
        gVar.y(d8);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), obj);
        g.c.c(gVarA, d.p.a(0), i8);
        if (gVar.f416g == gVar.n(d8.b()) && gVar.f417h == gVar.n(d8.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = d8.b();
        int i9 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f416g) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(d8.e(d.p.a(i10)));
                i9++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = d8.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f417h) != 0) {
                if (i9 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d8.f(d.s.a(i12)));
                i11++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + d8 + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").").toString());
    }

    public final void F(Object obj) {
        if (obj instanceof InterfaceC3159j) {
            this.f357a.x(d.F.f381c);
        }
    }

    public final void a() {
        this.f357a.m();
    }

    public final void b(InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
        this.f357a.r(interfaceC3149e, w8, k8);
    }

    public final boolean c() {
        return this.f357a.t();
    }

    public final boolean d() {
        return this.f357a.u();
    }

    public final void e(int i8) {
        g gVar = this.f357a;
        d.C0907a c0907a = d.C0907a.f382c;
        gVar.y(c0907a);
        g.c.c(g.c.a(gVar), d.p.a(0), i8);
        if (gVar.f416g == gVar.n(c0907a.b()) && gVar.f417h == gVar.n(c0907a.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c0907a.b();
        int i9 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f416g) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(c0907a.e(d.p.a(i10)));
                i9++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c0907a.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f417h) != 0) {
                if (i9 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0907a.f(d.s.a(i12)));
                i11++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0907a + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").").toString());
    }

    public final void f(List list, H0.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        g gVar = this.f357a;
        d.C0909c c0909c = d.C0909c.f384c;
        gVar.y(c0909c);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(1), list);
        g.c.d(gVarA, d.s.a(0), dVar);
        if (gVar.f416g == gVar.n(c0909c.b()) && gVar.f417h == gVar.n(c0909c.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c0909c.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(c0909c.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c0909c.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0909c.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0909c + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void g(C3154g0 c3154g0, AbstractC3173q abstractC3173q, C3156h0 c3156h0, C3156h0 c3156h1) {
        g gVar = this.f357a;
        d.C0000d c0000d = d.C0000d.f385c;
        gVar.y(c0000d);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), c3154g0);
        g.c.d(gVarA, d.s.a(1), abstractC3173q);
        g.c.d(gVarA, d.s.a(3), c3156h1);
        g.c.d(gVarA, d.s.a(2), c3156h0);
        if (gVar.f416g == gVar.n(c0000d.b()) && gVar.f417h == gVar.n(c0000d.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c0000d.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(c0000d.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c0000d.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0000d.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0000d + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void h() {
        this.f357a.x(d.C0910e.f386c);
    }

    public final void j(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        g gVar = this.f357a;
        d.g gVar2 = d.g.f388c;
        gVar.y(gVar2);
        g.c.d(g.c.a(gVar), d.s.a(0), objArr);
        if (gVar.f416g == gVar.n(gVar2.b()) && gVar.f417h == gVar.n(gVar2.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = gVar2.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(gVar2.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = gVar2.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(gVar2.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + gVar2 + ". Not all arguments were provided. Missing " + i8 + uYOhHhTXuF.CDvUr + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void k(k kVar, InterfaceC3171p interfaceC3171p) {
        g gVar = this.f357a;
        d.h hVar = d.h.f389c;
        gVar.y(hVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), kVar);
        g.c.d(gVarA, d.s.a(1), interfaceC3171p);
        if (gVar.f416g == gVar.n(hVar.b()) && gVar.f417h == gVar.n(hVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = hVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(hVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = hVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(hVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + hVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void l() {
        this.f357a.x(d.i.f390c);
    }

    public final void m() {
        this.f357a.x(d.j.f391c);
    }

    public final void n(C3147d c3147d) {
        g gVar = this.f357a;
        d.k kVar = d.k.f392c;
        gVar.y(kVar);
        g.c.d(g.c.a(gVar), d.s.a(0), c3147d);
        if (gVar.f416g == gVar.n(kVar.b()) && gVar.f417h == gVar.n(kVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = kVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(kVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = kVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(kVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + kVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void o() {
        this.f357a.x(d.l.f393c);
    }

    public final void q(C3147d c3147d, T0 t8) {
        g gVar = this.f357a;
        d.n nVar = d.n.f395c;
        gVar.y(nVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), c3147d);
        g.c.d(gVarA, d.s.a(1), t8);
        if (gVar.f416g == gVar.n(nVar.b()) && gVar.f417h == gVar.n(nVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = nVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(nVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = nVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(nVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void r(C3147d c3147d, T0 t8, c cVar) {
        g gVar = this.f357a;
        d.o oVar = d.o.f396c;
        gVar.y(oVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), c3147d);
        g.c.d(gVarA, d.s.a(1), t8);
        g.c.d(gVarA, d.s.a(2), cVar);
        if (gVar.f416g == gVar.n(oVar.b()) && gVar.f417h == gVar.n(oVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = oVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(oVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = oVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void s(int i8) {
        g gVar = this.f357a;
        d.q qVar = d.q.f397c;
        gVar.y(qVar);
        g.c.c(g.c.a(gVar), d.p.a(0), i8);
        if (gVar.f416g == gVar.n(qVar.b()) && gVar.f417h == gVar.n(qVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = qVar.b();
        int i9 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f416g) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(qVar.e(d.p.a(i10)));
                i9++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = qVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f417h) != 0) {
                if (i9 > 0) {
                    sb2.append(", ");
                }
                sb2.append(qVar.f(d.s.a(i12)));
                i11++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + qVar + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").").toString());
    }

    public final void t(int i8, int i9, int i10) {
        g gVar = this.f357a;
        d.r rVar = d.r.f398c;
        gVar.y(rVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.p.a(1), i8);
        g.c.c(gVarA, d.p.a(0), i9);
        g.c.c(gVarA, d.p.a(2), i10);
        if (gVar.f416g == gVar.n(rVar.b()) && gVar.f417h == gVar.n(rVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = rVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < iB; i12++) {
            if (((1 << i12) & gVar.f416g) != 0) {
                if (i11 > 0) {
                    sb.append(", ");
                }
                sb.append(rVar.e(d.p.a(i12)));
                i11++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = rVar.d();
        int i13 = 0;
        for (int i14 = 0; i14 < iD; i14++) {
            if (((1 << i14) & gVar.f417h) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.f(d.s.a(i14)));
                i13++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").").toString());
    }

    public final void u(B b8, AbstractC3173q abstractC3173q, C3156h0 c3156h0) {
        g gVar = this.f357a;
        d.u uVar = d.u.f400c;
        gVar.y(uVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), b8);
        g.c.d(gVarA, d.s.a(1), abstractC3173q);
        g.c.d(gVarA, d.s.a(2), c3156h0);
        if (gVar.f416g == gVar.n(uVar.b()) && gVar.f417h == gVar.n(uVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = uVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(uVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = uVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(uVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void v(L0 l8) {
        g gVar = this.f357a;
        d.v vVar = d.v.f401c;
        gVar.y(vVar);
        g.c.d(g.c.a(gVar), d.s.a(0), l8);
        if (gVar.f416g == gVar.n(vVar.b()) && gVar.f417h == gVar.n(vVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = vVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = vVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(vVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void w() {
        this.f357a.x(d.w.f402c);
    }

    public final void x(int i8, int i9) {
        g gVar = this.f357a;
        d.x xVar = d.x.f403c;
        gVar.y(xVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.p.a(0), i8);
        g.c.c(gVarA, d.p.a(1), i9);
        if (gVar.f416g == gVar.n(xVar.b()) && gVar.f417h == gVar.n(xVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = xVar.b();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.f416g) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(xVar.e(d.p.a(i11)));
                i10++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = xVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.f417h) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(xVar.f(d.s.a(i13)));
                i12++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + xVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").").toString());
    }

    public final void y() {
        this.f357a.x(d.y.f404c);
    }

    public final void z(Function0 function0) {
        g gVar = this.f357a;
        d.z zVar = d.z.f405c;
        gVar.y(zVar);
        g.c.d(g.c.a(gVar), d.s.a(0), function0);
        if (gVar.f416g == gVar.n(zVar.b()) && gVar.f417h == gVar.n(zVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = zVar.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = zVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(zVar.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + zVar + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void B(Object obj) {
        String str;
        g gVar = this.f357a;
        d.B b8 = d.B.f377c;
        gVar.y(b8);
        g.c.d(g.c.a(gVar), d.s.a(0), obj);
        if (gVar.f416g == gVar.n(b8.b()) && gVar.f417h == gVar.n(b8.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = b8.b();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            str = ZWZaxQrCHfNe.LdkGhvtSMdPytYk;
            if (i8 >= iB) {
                break;
            }
            if (((1 << i8) & gVar.f416g) != 0) {
                if (i9 > 0) {
                    sb.append(str);
                }
                sb.append(b8.e(d.p.a(i8)));
                i9++;
            }
            i8++;
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = b8.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i9 > 0) {
                    sb2.append(str);
                }
                sb2.append(b8.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + b8 + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + string + ") and " + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void E(int i8) {
        g gVar = this.f357a;
        d.E e8 = d.E.f380c;
        gVar.y(e8);
        g.c.c(g.c.a(gVar), d.p.a(0), i8);
        if (gVar.f416g == gVar.n(e8.b()) && gVar.f417h == gVar.n(e8.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = e8.b();
        int i9 = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            if (((1 << i10) & gVar.f416g) != 0) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(e8.e(d.p.a(i10)));
                i9++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = e8.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            if (((1 << i12) & gVar.f417h) != 0) {
                if (i9 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e8.f(d.s.a(i12)));
                i11++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException((WqXA.BbIbYEZQZkU + e8 + ". Not all arguments were provided. Missing " + i9 + " int arguments (" + string + ") and " + i11 + " object arguments (" + string2 + ").").toString());
    }

    public final void i(H0.d dVar, C3147d c3147d) {
        g gVar = this.f357a;
        d.C0911f c0911f = d.C0911f.f387c;
        gVar.y(c0911f);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), dVar);
        g.c.d(gVarA, d.s.a(1), c3147d);
        if (gVar.f416g == gVar.n(c0911f.b()) && gVar.f417h == gVar.n(c0911f.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = c0911f.b();
        int i8 = 0;
        for (int i9 = 0; i9 < iB; i9++) {
            if (((1 << i9) & gVar.f416g) != 0) {
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(c0911f.e(d.p.a(i9)));
                i8++;
            }
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int iD = c0911f.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            if (((1 << i11) & gVar.f417h) != 0) {
                if (i8 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0911f.f(d.s.a(i11)));
                i10++;
            }
        }
        String string2 = sb2.toString();
        t.f(string2, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + c0911f + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + WqXA.zcdxlNWYsnVAt + i10 + " object arguments (" + string2 + ").").toString());
    }

    public final void p(a aVar, H0.d dVar) {
        if (aVar.d()) {
            g gVar = this.f357a;
            d.C0908b c0908b = d.C0908b.f383c;
            gVar.y(c0908b);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.s.a(0), aVar);
            g.c.d(gVarA, d.s.a(1), dVar);
            if (gVar.f416g == gVar.n(c0908b.b()) && gVar.f417h == gVar.n(c0908b.d())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int iB = c0908b.b();
            int i8 = 0;
            for (int i9 = 0; i9 < iB; i9++) {
                if (((1 << i9) & gVar.f416g) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0908b.e(d.p.a(i9)));
                    i8++;
                }
            }
            String string = sb.toString();
            t.f(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int iD = c0908b.d();
            int i10 = 0;
            for (int i11 = 0; i11 < iD; i11++) {
                if (((1 << i11) & gVar.f417h) != 0) {
                    if (i8 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c0908b.f(d.s.a(i11)));
                    i10++;
                }
            }
            String string2 = sb2.toString();
            t.f(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + c0908b + ". Not all arguments were provided. Missing " + i8 + " int arguments (" + string + ") and " + i10 + ajyWhveMDgQ.ASqru + string2 + ").").toString());
        }
    }
}
