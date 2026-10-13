package R;

import A.AbstractC0890p0;
import A.G0;
import A.x0;
import H.J;
import I.w;
import I.x;
import Q.N;
import Q.S;
import Q.X;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p090k.zI.jULK;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f9279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f9280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f9281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f9283e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f9284a;

        public a(N n8) {
            this.f9284a = n8;
        }

        @Override // K.c
        public void b(Throwable th) {
            if (this.f9284a.s() == 2 && (th instanceof CancellationException)) {
                AbstractC0890p0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC0890p0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + X.a(this.f9284a.s()), th);
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(G0 g8) {
            T1.f.g(g8);
            try {
                r.this.f9279a.b(g8);
            } catch (x0 e8) {
                AbstractC0890p0.d("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static b d(N n8, N n9, List list) {
            return new R.b(n8, n9, list);
        }

        public abstract List a();

        public abstract N b();

        public abstract N c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends HashMap {
    }

    public r(J j8, J j9, S s8) {
        this.f9280b = j8;
        this.f9281c = j9;
        this.f9279a = s8;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f9282d;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((N) it.next()).i();
            }
        }
    }

    public void d() {
        this.f9279a.a();
        w.e(new Runnable() { // from class: R.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f9272a);
            }
        });
    }

    public final void e(J j8, J j9, N n8, N n9, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            final J j10 = j8;
            final J j11 = j9;
            final N n10 = n8;
            final N n11 = n9;
            c(j10, j11, n10, n11, entry);
            ((N) entry.getValue()).e(new Runnable() { // from class: R.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9273a.c(j10, j11, n10, n11, entry);
                }
            });
            j8 = j10;
            j9 = j11;
            n8 = n10;
            n9 = n11;
        }
    }

    public final void f(J j8, N n8, boolean z8) {
        try {
            this.f9279a.d(n8.l(j8, z8));
        } catch (x0 e8) {
            AbstractC0890p0.d("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e8);
        }
    }

    public c g(b bVar) {
        w.b();
        AbstractC0890p0.a("DualSurfaceProcessorNode", "DualSurfaceProcessorNode Transform Processor = " + this.f9279a + "\n   primary input = " + bVar.b() + "\n   secondary input = " + bVar.c());
        Iterator it = bVar.a().iterator();
        while (it.hasNext()) {
            AbstractC0890p0.a("SurfaceProcessorNode", "   outputConfig = " + ((d) it.next()));
        }
        this.f9283e = bVar;
        this.f9282d = new c();
        N nB = this.f9283e.b();
        N nC = this.f9283e.c();
        for (d dVar : this.f9283e.a()) {
            this.f9282d.put(dVar, h(nB, dVar.a()));
        }
        f(this.f9280b, nB, true);
        f(this.f9281c, nC, false);
        e(this.f9280b, this.f9281c, nB, nC, this.f9282d);
        return this.f9282d;
    }

    public final N h(N n8, S.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n8.q());
        matrix.postConcat(x.e(new RectF(rectA), x.r(fVar.d()), iC, zG));
        T1.f.a(x.j(x.f(rectA, iC), fVar.d()));
        Rect rectP = x.p(fVar.d());
        return new N(fVar.e(), fVar.b(), n8.r().i().f(fVar.d()).a(), matrix, false, rectP, n8.p() - iC, -1, n8.v() != zG);
    }

    public final void c(J j8, J j9, N n8, N n9, Map.Entry entry) {
        N n10 = (N) entry.getValue();
        AbstractC0890p0.a(OjEsfyJYzbPn.YpeLYqjnkoMmsT, jULK.zuMqy + n10);
        Size sizeF = n8.r().f();
        Rect rectA = ((d) entry.getKey()).a().a();
        if (!n8.t()) {
            j8 = null;
        }
        G0.a aVarF = G0.a.f(sizeF, rectA, j8, ((d) entry.getKey()).a().c(), ((d) entry.getKey()).a().g());
        Size sizeF2 = n9.r().f();
        Rect rectA2 = ((d) entry.getKey()).b().a();
        if (!n9.t()) {
            j9 = null;
        }
        K.n.j(n10.j(((d) entry.getKey()).a().b(), aVarF, G0.a.f(sizeF2, rectA2, j9, ((d) entry.getKey()).b().c(), ((d) entry.getKey()).b().g())), new a(n10), J.a.d());
    }
}
