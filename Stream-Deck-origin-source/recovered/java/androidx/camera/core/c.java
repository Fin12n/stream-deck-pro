package androidx.camera.core;

import A.V;
import H.A0;
import K.n;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends V {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f14138v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f14139w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f14140x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f14141y;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WeakReference f14144d;

        public b(d dVar, c cVar) {
            super(dVar);
            this.f14144d = new WeakReference(cVar);
            b(new androidx.camera.core.b.a() { // from class: A.X
                @Override // androidx.camera.core.b.a
                public final void b(androidx.camera.core.d dVar2) {
                    androidx.camera.core.c.b.j(this.f232a, dVar2);
                }
            });
        }

        public static /* synthetic */ void j(b bVar, d dVar) {
            final c cVar = (c) bVar.f14144d.get();
            if (cVar != null) {
                cVar.f14138v.execute(new Runnable() { // from class: A.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.w();
                    }
                });
            }
        }
    }

    public c(Executor executor) {
        this.f14138v = executor;
    }

    @Override // A.V
    public d d(A0 a8) {
        return a8.h();
    }

    @Override // A.V
    public void f() {
        synchronized (this.f14139w) {
            try {
                d dVar = this.f14140x;
                if (dVar != null) {
                    dVar.close();
                    this.f14140x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.V
    public void l(d dVar) {
        synchronized (this.f14139w) {
            try {
                if (!this.f221u) {
                    dVar.close();
                    return;
                }
                if (this.f14141y == null) {
                    b bVar = new b(dVar, this);
                    this.f14141y = bVar;
                    n.j(e(bVar), new a(bVar), J.a.a());
                } else {
                    if (dVar.e1().a() <= this.f14141y.e1().a()) {
                        dVar.close();
                    } else {
                        d dVar2 = this.f14140x;
                        if (dVar2 != null) {
                            dVar2.close();
                        }
                        this.f14140x = dVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w() {
        synchronized (this.f14139w) {
            try {
                this.f14141y = null;
                d dVar = this.f14140x;
                if (dVar != null) {
                    this.f14140x = null;
                    l(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f14142a;

        public a(b bVar) {
            this.f14142a = bVar;
        }

        @Override // K.c
        public void b(Throwable th) {
            this.f14142a.close();
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
        }
    }
}
