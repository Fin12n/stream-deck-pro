package p040e3;

import A1.b;
import A1.c;
import A1.r;
import A1.s;
import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p056g1.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20689o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0 f20690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var) {
            super(1);
            this.f20690a = a0Var;
        }

        public final void b(a0.a layout) {
            t.g(layout, "$this$layout");
            a0.a.j(layout, this.f20690a, 0, 0, 0.0f, 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((a0.a) obj);
            return G.f1419a;
        }
    }

    public f(int i8, int i9) {
        this.f20688n = i8;
        this.f20689o = i9;
    }

    @Override // p056g1.A
    public I c(J measure, p038e1.G measurable, long j8) {
        long jA;
        t.g(measure, "$this$measure");
        t.g(measurable, "measurable");
        long jD = c.d(j8, s.a(this.f20688n, this.f20689o));
        if (b.m(j8) != Integer.MAX_VALUE || b.n(j8) == Integer.MAX_VALUE) {
            jA = (b.n(j8) != Integer.MAX_VALUE || b.m(j8) == Integer.MAX_VALUE) ? c.a(r.g(jD), r.g(jD), r.f(jD), r.f(jD)) : c.a((r.f(jD) * this.f20688n) / this.f20689o, (r.f(jD) * this.f20688n) / this.f20689o, r.f(jD), r.f(jD));
        } else {
            jA = c.a(r.g(jD), r.g(jD), (r.g(jD) * this.f20689o) / this.f20688n, (r.g(jD) * this.f20689o) / this.f20688n);
        }
        a0 a0VarJ = measurable.J(jA);
        return J.X0(measure, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ), 4, null);
    }

    public final void d2(int i8) {
        this.f20689o = i8;
    }

    public final void e2(int i8) {
        this.f20688n = i8;
    }
}
