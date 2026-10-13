package W;

import A.C0888o0;
import A.D0;
import A.InterfaceC0881l;
import A.InterfaceC0896t;
import A.T0;
import H.I;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1732o;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC1732o, InterfaceC0881l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1733p f10750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L.f f10751c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10749a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f10752d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10753e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10754f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D0 f10755g = null;

    public c(InterfaceC1733p interfaceC1733p, L.f fVar) {
        this.f10750b = interfaceC1733p;
        this.f10751c = fVar;
        if (interfaceC1733p.w().b().b(AbstractC1726i.b.STARTED)) {
            fVar.v();
        } else {
            fVar.G();
        }
        interfaceC1733p.w().a(this);
    }

    public static /* synthetic */ void d(D.b bVar, D0 d8) {
        HashSet hashSet = new HashSet();
        if (bVar != null) {
            hashSet.addAll(bVar.a());
        }
        d8.d().accept(hashSet);
    }

    @Override // A.InterfaceC0881l
    public InterfaceC0896t c() {
        return this.f10751c.c();
    }

    public void f(final D0 d8) {
        synchronized (this.f10749a) {
            try {
                if (this.f10755g == null) {
                    this.f10755g = d8;
                } else if (d8.m()) {
                    if (!this.f10755g.m()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f10755g.k());
                    arrayList.addAll(d8.k());
                    this.f10755g = new C0888o0(arrayList, d8.l(), d8.c());
                } else {
                    if (this.f10755g.m()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f10755g = d8;
                    L.f fVar = this.f10751c;
                    fVar.e0(fVar.N());
                }
                this.f10751c.l0(d8.l());
                this.f10751c.h0(d8.c());
                this.f10751c.k0(d8.i());
                this.f10751c.j0(d8.f());
                final D.b bVarB = D.b.b(d8, (I) c());
                d8.e().execute(new Runnable() { // from class: W.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.d(bVarB, d8);
                    }
                });
                this.f10751c.i(d8.k(), bVarB);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public L.f i() {
        return this.f10751c;
    }

    @z(AbstractC1726i.a.ON_DESTROY)
    public void onDestroy(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10749a) {
            L.f fVar = this.f10751c;
            fVar.e0(fVar.N());
        }
    }

    @z(AbstractC1726i.a.ON_PAUSE)
    public void onPause(InterfaceC1733p interfaceC1733p) {
        this.f10751c.l(false);
    }

    @z(AbstractC1726i.a.ON_RESUME)
    public void onResume(InterfaceC1733p interfaceC1733p) {
        this.f10751c.l(true);
    }

    @z(AbstractC1726i.a.ON_START)
    public void onStart(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10749a) {
            try {
                if (!this.f10753e && !this.f10754f) {
                    this.f10751c.v();
                    this.f10752d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @z(AbstractC1726i.a.ON_STOP)
    public void onStop(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10749a) {
            try {
                if (!this.f10753e && !this.f10754f) {
                    this.f10751c.G();
                    this.f10752d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC1733p s() {
        InterfaceC1733p interfaceC1733p;
        synchronized (this.f10749a) {
            interfaceC1733p = this.f10750b;
        }
        return interfaceC1733p;
    }

    public List t() {
        List listUnmodifiableList;
        synchronized (this.f10749a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f10751c.N());
        }
        return listUnmodifiableList;
    }

    public boolean u(T0 t8) {
        boolean zContains;
        synchronized (this.f10749a) {
            zContains = this.f10751c.N().contains(t8);
        }
        return zContains;
    }

    public boolean v() {
        boolean zM;
        synchronized (this.f10749a) {
            D0 d8 = this.f10755g;
            zM = d8 == null ? false : d8.m();
        }
        return zM;
    }

    public void w() {
        synchronized (this.f10749a) {
            try {
                if (this.f10753e) {
                    return;
                }
                onStop(this.f10750b);
                this.f10753e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.f10749a) {
            L.f fVar = this.f10751c;
            fVar.e0(fVar.N());
            this.f10755g = null;
        }
    }

    public void y() {
        synchronized (this.f10749a) {
            try {
                if (this.f10753e) {
                    this.f10753e = false;
                    if (this.f10750b.w().b().b(AbstractC1726i.b.STARTED)) {
                        onStart(this.f10750b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
