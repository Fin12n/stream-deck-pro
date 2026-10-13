package G;

import A.C0864c0;
import A.C0868e0;
import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class U implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f2501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.a f2502b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F1.c.a f2505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.c.a f2506f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y4.a f2509i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2507g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2508h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y4.a f2503c = F1.c.a(new F1.c.InterfaceC0112c() { // from class: G.S
        @Override // F1.c.InterfaceC0112c
        public final Object a(F1.c.a aVar) {
            return U.j(this.f2499a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y4.a f2504d = F1.c.a(new F1.c.InterfaceC0112c() { // from class: G.T
        @Override // F1.c.InterfaceC0112c
        public final Object a(F1.c.a aVar) {
            return U.k(this.f2500a, aVar);
        }
    });

    public U(h0 h0Var, h0.a aVar) {
        this.f2501a = h0Var;
        this.f2502b = aVar;
    }

    public static /* synthetic */ Object j(U u8, F1.c.a aVar) {
        u8.f2505e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object k(U u8, F1.c.a aVar) {
        u8.f2506f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // G.W
    public boolean a() {
        return this.f2507g;
    }

    @Override // G.W
    public void b(int i8) {
        I.w.b();
        if (this.f2507g) {
            return;
        }
        this.f2501a.t(i8);
    }

    @Override // G.W
    public void c() {
        I.w.b();
        if (this.f2507g) {
            return;
        }
        if (!this.f2508h) {
            f();
        }
        this.f2505e.c(null);
    }

    @Override // G.W
    public void d(C0868e0 c0868e0) {
        I.w.b();
        if (this.f2507g) {
            return;
        }
        o();
        r();
        s(c0868e0);
    }

    @Override // G.W
    public void e(Bitmap bitmap) {
        I.w.b();
        if (this.f2507g) {
            return;
        }
        this.f2501a.v(bitmap);
    }

    @Override // G.W
    public void f() {
        I.w.b();
        if (this.f2507g || this.f2508h) {
            return;
        }
        this.f2508h = true;
        C0864c0.e eVarI = this.f2501a.i();
        if (eVarI != null) {
            eVarI.b();
        }
        this.f2501a.k();
    }

    @Override // G.W
    public void g(C0868e0 c0868e0) {
        I.w.b();
        if (this.f2507g) {
            return;
        }
        boolean zF = this.f2501a.f();
        if (!zF) {
            s(c0868e0);
        }
        r();
        this.f2505e.f(c0868e0);
        if (zF) {
            this.f2502b.a(this.f2501a);
        }
    }

    @Override // G.W
    public void h(androidx.camera.core.d dVar) {
        I.w.b();
        if (this.f2507g) {
            dVar.close();
            return;
        }
        o();
        r();
        this.f2501a.x(dVar);
    }

    @Override // G.W
    public void i(C0864c0.h hVar) {
        I.w.b();
        if (this.f2507g) {
            return;
        }
        o();
        r();
        this.f2501a.w(hVar);
    }

    public final void l(C0868e0 c0868e0) {
        I.w.b();
        this.f2507g = true;
        Y4.a aVar = this.f2509i;
        Objects.requireNonNull(aVar);
        aVar.cancel(true);
        this.f2505e.f(c0868e0);
        this.f2506f.c(null);
    }

    public void m(C0868e0 c0868e0) {
        I.w.b();
        if (this.f2504d.isDone()) {
            return;
        }
        l(c0868e0);
        s(c0868e0);
    }

    public void n() {
        I.w.b();
        if (this.f2504d.isDone()) {
            return;
        }
        l(new C0868e0(3, "The request is aborted silently and retried.", null));
        this.f2502b.a(this.f2501a);
    }

    public final void o() {
        T1.f.j(this.f2503c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public Y4.a p() {
        I.w.b();
        return this.f2503c;
    }

    public Y4.a q() {
        I.w.b();
        return this.f2504d;
    }

    public final void r() {
        if (!this.f2501a.r() || this.f2501a.q()) {
            if (!this.f2501a.r()) {
                T1.f.j(!this.f2504d.isDone(), "The callback can only complete once.");
            }
            this.f2506f.c(null);
        }
    }

    public final void s(C0868e0 c0868e0) {
        I.w.b();
        this.f2501a.u(c0868e0);
    }

    public void t(Y4.a aVar) {
        I.w.b();
        T1.f.j(this.f2509i == null, "CaptureRequestFuture can only be set once.");
        this.f2509i = aVar;
    }
}
