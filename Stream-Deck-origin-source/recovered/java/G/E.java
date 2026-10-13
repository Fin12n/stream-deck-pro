package G;

import A.E0;
import H.A0;
import H.m1;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class E implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f2457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f2458b;

    public E(A0 a8) {
        this.f2457a = a8;
    }

    public static /* synthetic */ void a(E e8, A0.a aVar, A0 a8) {
        e8.getClass();
        aVar.a(e8);
    }

    public void b(Q q8) {
        T1.f.j(this.f2458b == null, "Pending request should be null");
        this.f2458b = q8;
    }

    public void c() {
        this.f2458b = null;
    }

    @Override // H.A0
    public void close() {
        this.f2457a.close();
    }

    public final androidx.camera.core.d d(androidx.camera.core.d dVar) {
        if (dVar == null) {
            return null;
        }
        m1 m1VarB = this.f2458b == null ? m1.b() : m1.a(new Pair(this.f2458b.j(), this.f2458b.i().get(0)));
        this.f2458b = null;
        return new E0(dVar, new Size(dVar.g(), dVar.f()), new L.c(new U.l(m1VarB, dVar.e1().a())));
    }

    @Override // H.A0
    public int f() {
        return this.f2457a.f();
    }

    @Override // H.A0
    public int g() {
        return this.f2457a.g();
    }

    @Override // H.A0
    public Surface getSurface() {
        return this.f2457a.getSurface();
    }

    @Override // H.A0
    public androidx.camera.core.d h() {
        return d(this.f2457a.h());
    }

    @Override // H.A0
    public void i(final A0.a aVar, Executor executor) {
        this.f2457a.i(new A0.a() { // from class: G.D
            @Override // H.A0.a
            public final void a(A0 a8) {
                E.a(this.f2455a, aVar, a8);
            }
        }, executor);
    }

    @Override // H.A0
    public int j() {
        return this.f2457a.j();
    }

    @Override // H.A0
    public void k() {
        this.f2457a.k();
    }

    @Override // H.A0
    public int l() {
        return this.f2457a.l();
    }

    @Override // H.A0
    public androidx.camera.core.d m() {
        return d(this.f2457a.m());
    }
}
