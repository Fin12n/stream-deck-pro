package U;

import A.T0;
import H.F;
import H.I;
import H.J;
import H.R0;
import I.w;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f9975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T0.c f9978d;

    public j(J j8, T0.c cVar, g.a aVar) {
        this.f9975a = j8;
        this.f9978d = cVar;
        this.f9976b = new p(j8.g(), aVar);
        this.f9977c = new q(j8.r());
    }

    @Override // H.J
    public Y4.a a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // H.J
    public R0 b() {
        return this.f9975a.b();
    }

    @Override // A.T0.c
    public void d(T0 t8) {
        w.b();
        this.f9978d.d(t8);
    }

    @Override // A.T0.c
    public void f(T0 t8) {
        w.b();
        this.f9978d.f(t8);
    }

    @Override // H.J
    public F g() {
        return this.f9976b;
    }

    @Override // A.T0.c
    public void i(T0 t8) {
        w.b();
        this.f9978d.i(t8);
    }

    @Override // A.T0.c
    public void j(T0 t8) {
        w.b();
        this.f9978d.j(t8);
    }

    @Override // H.J
    public void m(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // H.J
    public void n(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // H.J
    public boolean p() {
        return false;
    }

    @Override // H.J
    public I r() {
        return this.f9977c;
    }

    public void s(int i8) {
        this.f9977c.t(i8);
    }
}
