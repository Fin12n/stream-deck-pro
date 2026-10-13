package p046f0;

import A1.t;
import L0.i;
import Q0.l;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.D0;
import R0.E0;
import R0.N0;
import R0.T0;
import T0.c;
import T0.f;
import kotlin.jvm.internal.AbstractC2633k;
import p056g1.InterfaceC2353q;

/* JADX INFO: renamed from: f0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2276d extends i.c implements InterfaceC2353q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC1582d0 f21437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f21438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public T0 f21439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f21440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f21441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public D0 f21442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public T0 f21443u;

    public /* synthetic */ C2276d(long j8, AbstractC1582d0 abstractC1582d0, float f8, T0 t8, AbstractC2633k abstractC2633k) {
        this(j8, abstractC1582d0, f8, t8);
    }

    public final void b(float f8) {
        this.f21438p = f8;
    }

    public final void d2(c cVar) {
        D0 d0A;
        c cVar2;
        if (l.e(cVar.d(), this.f21440r) && cVar.getLayoutDirection() == this.f21441s && kotlin.jvm.internal.t.c(this.f21443u, this.f21439q)) {
            d0A = this.f21442t;
            kotlin.jvm.internal.t.d(d0A);
        } else {
            d0A = this.f21439q.a(cVar.d(), cVar.getLayoutDirection(), cVar);
        }
        D0 d8 = d0A;
        if (C1598l0.q(this.f21436n, C1598l0.f9405b.e())) {
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            E0.e(cVar2, d8, this.f21436n, 0.0f, null, null, 0, 60, null);
        }
        AbstractC1582d0 abstractC1582d0 = this.f21437o;
        if (abstractC1582d0 != null) {
            E0.c(cVar2, d8, abstractC1582d0, this.f21438p, null, null, 0, 56, null);
        }
        this.f21442t = d8;
        this.f21440r = l.c(cVar2.d());
        this.f21441s = cVar2.getLayoutDirection();
        this.f21443u = this.f21439q;
    }

    public final void e2(c cVar) {
        if (!C1598l0.q(this.f21436n, C1598l0.f9405b.e())) {
            f.w1(cVar, this.f21436n, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        AbstractC1582d0 abstractC1582d0 = this.f21437o;
        if (abstractC1582d0 != null) {
            f.q0(cVar, abstractC1582d0, 0L, 0L, this.f21438p, null, null, 0, 118, null);
        }
    }

    public final void f2(AbstractC1582d0 abstractC1582d0) {
        this.f21437o = abstractC1582d0;
    }

    public final void g2(long j8) {
        this.f21436n = j8;
    }

    @Override // p056g1.InterfaceC2353q
    public void q(c cVar) {
        if (this.f21439q == N0.a()) {
            e2(cVar);
        } else {
            d2(cVar);
        }
        cVar.v1();
    }

    public final void x(T0 t8) {
        this.f21439q = t8;
    }

    public C2276d(long j8, AbstractC1582d0 abstractC1582d0, float f8, T0 t8) {
        this.f21436n = j8;
        this.f21437o = abstractC1582d0;
        this.f21438p = f8;
        this.f21439q = t8;
    }
}
