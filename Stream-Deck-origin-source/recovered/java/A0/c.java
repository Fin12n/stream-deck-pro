package A0;

import C6.C0920i;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;
import p215z0.AbstractC3169o;
import p215z0.C3147d;
import p215z0.InterfaceC3149e;
import p215z0.K0;
import p215z0.W0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f372a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f373b = new g();

    public final void a() {
        this.f373b.m();
        this.f372a.m();
    }

    public final void c() {
        if (this.f373b.u()) {
            this.f373b.w(this.f372a);
        } else {
            AbstractC3169o.v("Cannot end node insertion, there are no pending operations that can be realized.");
            throw new C0920i();
        }
    }

    public final void d(InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
        if (this.f373b.t()) {
            this.f372a.r(interfaceC3149e, w8, k8);
        } else {
            AbstractC3169o.v("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            throw new C0920i();
        }
    }

    public final boolean e() {
        return this.f372a.t();
    }

    public final void f(Object obj, o oVar) {
        g gVar = this.f372a;
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

    public final void b(Function0 function0, int i8, C3147d c3147d) {
        g gVar = this.f372a;
        d.m mVar = d.m.f394c;
        gVar.y(mVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.s.a(0), function0);
        g.c.c(gVarA, d.p.a(0), i8);
        int i9 = 1;
        g.c.d(gVarA, d.s.a(1), c3147d);
        int i10 = gVar.f416g;
        int iN = gVar.n(mVar.b());
        String str = GIGvBf.JARPIrzkP;
        if (i10 != iN || gVar.f417h != gVar.n(mVar.d())) {
            StringBuilder sb = new StringBuilder();
            int iB = mVar.b();
            int i11 = 0;
            for (int i12 = 0; i12 < iB; i12++) {
                if (((1 << i12) & gVar.f416g) != 0) {
                    if (i11 > 0) {
                        sb.append(str);
                    }
                    sb.append(mVar.e(d.p.a(i12)));
                    i11++;
                }
            }
            String string = sb.toString();
            t.f(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int i13 = 0;
            int i14 = 0;
            for (int iD = mVar.d(); i13 < iD; iD = iD) {
                if (((1 << i13) & gVar.f417h) != 0) {
                    if (i11 > 0) {
                        sb2.append(str);
                    }
                    sb2.append(mVar.f(d.s.a(i13)));
                    i14++;
                }
                i13++;
            }
            String string2 = sb2.toString();
            t.f(string2, "StringBuilder().apply(builderAction).toString()");
            throw new IllegalStateException(("Error while pushing " + mVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i14 + " object arguments (" + string2 + ").").toString());
        }
        g gVar2 = this.f373b;
        d.t tVar = d.t.f399c;
        gVar2.y(tVar);
        g gVarA2 = g.c.a(gVar2);
        g.c.c(gVarA2, d.p.a(0), i8);
        g.c.d(gVarA2, d.s.a(0), c3147d);
        if (gVar2.f416g == gVar2.n(tVar.b()) && gVar2.f417h == gVar2.n(tVar.d())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int iB2 = tVar.b();
        int i15 = 0;
        int i16 = 0;
        while (i15 < iB2) {
            if (((i9 << i15) & gVar2.f416g) != 0) {
                if (i16 > 0) {
                    sb3.append(str);
                }
                sb3.append(tVar.e(d.p.a(i15)));
                i16++;
            }
            i15++;
            i9 = i9;
        }
        int i17 = i9;
        String string3 = sb3.toString();
        t.f(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder();
        int iD2 = tVar.d();
        int i18 = 0;
        int i19 = 0;
        while (i19 < iD2) {
            if (((i17 << i19) & gVar2.f417h) != 0) {
                if (i16 > 0) {
                    sb4.append(str);
                }
                sb4.append(tVar.f(d.s.a(i19)));
                i18++;
            }
            i19++;
            gVar2 = gVar2;
        }
        String string4 = sb4.toString();
        t.f(string4, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalStateException(("Error while pushing " + tVar + ". Not all arguments were provided. Missing " + i16 + " int arguments (" + string3 + ") and " + i18 + " object arguments (" + string4 + ").").toString());
    }
}
