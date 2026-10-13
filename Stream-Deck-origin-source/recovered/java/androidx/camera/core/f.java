package androidx.camera.core;

import A.F0;
import H.A0;
import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f implements A0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A0 f14162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Surface f14163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.a f14164f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14159a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14160b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14161c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f14165g = new b.a() { // from class: A.A0
        @Override // androidx.camera.core.b.a
        public final void b(androidx.camera.core.d dVar) {
            androidx.camera.core.f.b(this.f2a, dVar);
        }
    };

    public f(A0 a8) {
        this.f14162d = a8;
        this.f14163e = a8.getSurface();
    }

    public static /* synthetic */ void a(f fVar, A0.a aVar, A0 a8) {
        fVar.getClass();
        aVar.a(fVar);
    }

    public static /* synthetic */ void b(f fVar, d dVar) {
        b.a aVar;
        synchronized (fVar.f14159a) {
            try {
                int i8 = fVar.f14160b - 1;
                fVar.f14160b = i8;
                if (fVar.f14161c && i8 == 0) {
                    fVar.close();
                }
                aVar = fVar.f14164f;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(dVar);
        }
    }

    public int c() {
        int iL;
        synchronized (this.f14159a) {
            iL = this.f14162d.l() - this.f14160b;
        }
        return iL;
    }

    @Override // H.A0
    public void close() {
        synchronized (this.f14159a) {
            try {
                Surface surface = this.f14163e;
                if (surface != null) {
                    surface.release();
                }
                this.f14162d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (this.f14159a) {
            try {
                this.f14161c = true;
                this.f14162d.k();
                if (this.f14160b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(b.a aVar) {
        synchronized (this.f14159a) {
            this.f14164f = aVar;
        }
    }

    @Override // H.A0
    public int f() {
        int iF;
        synchronized (this.f14159a) {
            iF = this.f14162d.f();
        }
        return iF;
    }

    @Override // H.A0
    public int g() {
        int iG;
        synchronized (this.f14159a) {
            iG = this.f14162d.g();
        }
        return iG;
    }

    @Override // H.A0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f14159a) {
            surface = this.f14162d.getSurface();
        }
        return surface;
    }

    @Override // H.A0
    public d h() {
        d dVarN;
        synchronized (this.f14159a) {
            dVarN = n(this.f14162d.h());
        }
        return dVarN;
    }

    @Override // H.A0
    public void i(final A0.a aVar, Executor executor) {
        synchronized (this.f14159a) {
            this.f14162d.i(new A0.a() { // from class: A.B0
                @Override // H.A0.a
                public final void a(H.A0 a8) {
                    androidx.camera.core.f.a(this.f9a, aVar, a8);
                }
            }, executor);
        }
    }

    @Override // H.A0
    public int j() {
        int iJ;
        synchronized (this.f14159a) {
            iJ = this.f14162d.j();
        }
        return iJ;
    }

    @Override // H.A0
    public void k() {
        synchronized (this.f14159a) {
            this.f14162d.k();
        }
    }

    @Override // H.A0
    public int l() {
        int iL;
        synchronized (this.f14159a) {
            iL = this.f14162d.l();
        }
        return iL;
    }

    @Override // H.A0
    public d m() {
        d dVarN;
        synchronized (this.f14159a) {
            dVarN = n(this.f14162d.m());
        }
        return dVarN;
    }

    public final d n(d dVar) {
        if (dVar == null) {
            return null;
        }
        this.f14160b++;
        F0 f8 = new F0(dVar);
        f8.b(this.f14165g);
        return f8;
    }
}
