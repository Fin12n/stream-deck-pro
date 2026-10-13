package p183v0;

import T0.f;
import p017b7.J;
import p046f0.F;
import p073i0.j;
import p073i0.p;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f35028a;

    public m(boolean z8, q1 q1Var) {
        this.f35028a = new q(z8, q1Var);
    }

    public abstract void e(p pVar, J j8);

    public final void f(f fVar, float f8, long j8) {
        this.f35028a.b(fVar, f8, j8);
    }

    public abstract void g(p pVar);

    public final void h(j jVar, J j8) {
        this.f35028a.c(jVar, j8);
    }
}
