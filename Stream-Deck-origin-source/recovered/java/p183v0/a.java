package p183v0;

import C6.G;
import Q0.l;
import R0.C1598l0;
import R0.F;
import R0.InterfaceC1586f0;
import T0.c;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p073i0.p;
import p215z0.InterfaceC3164l0;
import p215z0.L0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements L0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f34947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f34948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f34949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f34950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3164l0 f34951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3164l0 f34952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Function0 f34955l;

    /* JADX INFO: renamed from: v0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0790a extends u implements Function0 {
        public C0790a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m281invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m281invoke() {
            a aVar = a.this;
            aVar.p(!aVar.l());
        }
    }

    public /* synthetic */ a(boolean z8, float f8, q1 q1Var, q1 q1Var2, ViewGroup viewGroup, AbstractC2633k abstractC2633k) {
        this(z8, f8, q1Var, q1Var2, viewGroup);
    }

    @Override // p046f0.F
    public void a(c cVar) {
        this.f34953j = cVar.d();
        this.f34954k = Float.isNaN(this.f34946c) ? S6.c.d(h.a(cVar, this.f34945b, cVar.d())) : cVar.V0(this.f34946c);
        long jY = ((C1598l0) this.f34947d.getValue()).y();
        float fD = ((f) this.f34948e.getValue()).d();
        cVar.v1();
        f(cVar, this.f34946c, jY);
        InterfaceC1586f0 interfaceC1586f0C = cVar.K0().c();
        l();
        l lVarN = n();
        if (lVarN != null) {
            lVarN.f(cVar.d(), this.f34954k, jY, fD);
            lVarN.draw(F.d(interfaceC1586f0C));
        }
    }

    @Override // p215z0.L0
    public void b() {
        k();
    }

    @Override // p215z0.L0
    public void c() {
        k();
    }

    @Override // p183v0.m
    public void e(p pVar, J j8) {
        l lVarB = m().b(this);
        lVarB.b(pVar, this.f34945b, this.f34953j, this.f34954k, ((C1598l0) this.f34947d.getValue()).y(), ((f) this.f34948e.getValue()).d(), this.f34955l);
        q(lVarB);
    }

    @Override // p183v0.m
    public void g(p pVar) {
        l lVarN = n();
        if (lVarN != null) {
            lVarN.e();
        }
    }

    public final void k() {
        i iVar = this.f34950g;
        if (iVar != null) {
            iVar.a(this);
        }
    }

    public final boolean l() {
        return ((Boolean) this.f34952i.getValue()).booleanValue();
    }

    public final i m() {
        i iVar = this.f34950g;
        if (iVar != null) {
            t.d(iVar);
            return iVar;
        }
        int childCount = this.f34949f.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = this.f34949f.getChildAt(i8);
            if (childAt instanceof i) {
                this.f34950g = (i) childAt;
                break;
            }
        }
        if (this.f34950g == null) {
            i iVar2 = new i(this.f34949f.getContext());
            this.f34949f.addView(iVar2);
            this.f34950g = iVar2;
        }
        i iVar3 = this.f34950g;
        t.d(iVar3);
        return iVar3;
    }

    public final l n() {
        return (l) this.f34951h.getValue();
    }

    public final void o() {
        q(null);
    }

    public final void p(boolean z8) {
        this.f34952i.setValue(Boolean.valueOf(z8));
    }

    public final void q(l lVar) {
        this.f34951h.setValue(lVar);
    }

    public a(boolean z8, float f8, q1 q1Var, q1 q1Var2, ViewGroup viewGroup) {
        super(z8, q1Var2);
        this.f34945b = z8;
        this.f34946c = f8;
        this.f34947d = q1Var;
        this.f34948e = q1Var2;
        this.f34949f = viewGroup;
        this.f34951h = l1.e(null, null, 2, null);
        this.f34952i = l1.e(Boolean.TRUE, null, 2, null);
        this.f34953j = l.f9103b.b();
        this.f34954k = -1;
        this.f34955l = new C0790a();
    }

    @Override // p215z0.L0
    public void d() {
    }
}
