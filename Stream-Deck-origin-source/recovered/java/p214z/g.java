package p214z;

import A.C0883m;
import F1.c;
import H.InterfaceC0984i0;
import K.n;
import java.util.concurrent.Executor;
import p158s.a;
import p166t.C2984w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2984w f38490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f38491d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.a f38494g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38488a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38489b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f38492e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a.C0723a f38493f = new a.C0723a();

    public g(C2984w c2984w, Executor executor) {
        this.f38490c = c2984w;
        this.f38491d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final c.a aVar) {
        gVar.f38491d.execute(new Runnable() { // from class: z.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f38486a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final c.a aVar) {
        gVar.f38491d.execute(new Runnable() { // from class: z.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f38483a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public Y4.a g(l lVar) {
        h(lVar);
        return n.s(c.a(new c.InterfaceC0112c() { // from class: z.a
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return g.a(this.f38479a, aVar);
            }
        }));
    }

    public final void h(l lVar) {
        synchronized (this.f38492e) {
            this.f38493f.d(lVar);
        }
    }

    public void i(a.C0723a c0723a) {
        synchronized (this.f38492e) {
            c0723a.e(this.f38493f.a(), InterfaceC0984i0.c.ALWAYS_OVERRIDE);
        }
    }

    public Y4.a j() {
        k();
        return n.s(c.a(new c.InterfaceC0112c() { // from class: z.c
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return g.b(this.f38482a, aVar);
            }
        }));
    }

    public final void k() {
        synchronized (this.f38492e) {
            this.f38493f = new a.C0723a();
        }
    }

    public final void l() {
        c.a aVar = this.f38494g;
        if (aVar != null) {
            aVar.c(null);
            this.f38494g = null;
        }
    }

    public final void m(Exception exc) {
        c.a aVar = this.f38494g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f38494g = null;
        }
    }

    public a n() {
        a aVarC;
        synchronized (this.f38492e) {
            aVarC = this.f38493f.c();
        }
        return aVarC;
    }

    public void o(final boolean z8) {
        this.f38491d.execute(new Runnable() { // from class: z.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f38480a.p(z8);
            }
        });
    }

    public final void p(boolean z8) {
        if (this.f38488a == z8) {
            return;
        }
        this.f38488a = z8;
        if (!z8) {
            m(new C0883m("The camera control has became inactive."));
        } else if (this.f38489b) {
            r();
        }
    }

    public final void q(c.a aVar) {
        this.f38489b = true;
        m(new C0883m("Camera2CameraControl was updated with new options."));
        this.f38494g = aVar;
        if (this.f38488a) {
            r();
        }
    }

    public final void r() {
        this.f38490c.e0().a(new Runnable() { // from class: z.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f38485a.l();
            }
        }, this.f38491d);
        this.f38489b = false;
    }
}
