package Q;

import A.AbstractC0890p0;
import A.G0;
import A.S0;
import A.x0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f8992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H.J f8993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f8994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f8995d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f8996a;

        public a(N n8) {
            this.f8996a = n8;
        }

        @Override // K.c
        public void b(Throwable th) {
            if (this.f8996a.s() == 2 && (th instanceof CancellationException)) {
                AbstractC0890p0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC0890p0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + X.a(this.f8996a.s()), th);
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(G0 g8) {
            T1.f.g(g8);
            try {
                W.this.f8992a.b(g8);
            } catch (x0 e8) {
                AbstractC0890p0.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static b c(N n8, List list) {
            return new C1554c(n8, list);
        }

        public abstract List a();

        public abstract N b();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends HashMap {
    }

    public W(H.J j8, S s8) {
        this.f8993b = j8;
        this.f8992a = s8;
    }

    public static /* synthetic */ void b(Map map, S0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((S.f) entry.getKey()).c();
            if (((S.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((N) entry.getValue()).y(I.x.u(iB), -1);
        }
    }

    public static /* synthetic */ void c(W w8) {
        c cVar = w8.f8994c;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((N) it.next()).i();
            }
        }
    }

    public final void d(N n8, Map.Entry entry) {
        N n9 = (N) entry.getValue();
        AbstractC0890p0.a("SurfaceProcessorNode", "     -> outputEdge = " + n9);
        K.n.j(n9.j(((S.f) entry.getKey()).b(), G0.a.f(n8.r().f(), ((S.f) entry.getKey()).a(), n8.t() ? this.f8993b : null, ((S.f) entry.getKey()).c(), ((S.f) entry.getKey()).g()), null), new a(n9), J.a.d());
    }

    public S e() {
        return this.f8992a;
    }

    public void f() {
        this.f8992a.a();
        I.w.e(new Runnable() { // from class: Q.T
            @Override // java.lang.Runnable
            public final void run() {
                W.c(this.f8987a);
            }
        });
    }

    public final void g(final N n8, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            d(n8, entry);
            ((N) entry.getValue()).e(new Runnable() { // from class: Q.U
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8988a.d(n8, entry);
                }
            });
        }
    }

    public final void h(N n8) {
        try {
            this.f8992a.d(n8.k(this.f8993b));
        } catch (x0 e8) {
            AbstractC0890p0.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e8);
        }
    }

    public void i(N n8, final Map map) {
        n8.f(new T1.a() { // from class: Q.V
            @Override // T1.a
            public final void accept(Object obj) {
                W.b(map, (S0.h) obj);
            }
        });
    }

    public c j(b bVar) {
        I.w.b();
        AbstractC0890p0.a("SurfaceProcessorNode", "SurfaceProcessorNode Transform (Processor=" + this.f8992a + "\n   inputEdge = " + bVar.b());
        Iterator it = bVar.a().iterator();
        while (it.hasNext()) {
            AbstractC0890p0.a("SurfaceProcessorNode", "   outputConfig = " + ((S.f) it.next()));
        }
        this.f8995d = bVar;
        this.f8994c = new c();
        N nB = bVar.b();
        for (S.f fVar : bVar.a()) {
            this.f8994c.put(fVar, k(nB, fVar));
        }
        h(nB);
        g(nB, this.f8994c);
        i(nB, this.f8994c);
        return this.f8994c;
    }

    public final N k(N n8, S.f fVar) {
        Rect rectP;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n8.q());
        Matrix matrixE = I.x.e(new RectF(rectA), I.x.r(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        T1.f.a(I.x.j(I.x.f(rectA, iC), fVar.d()));
        if (fVar.j()) {
            T1.f.b(fVar.a().contains(n8.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), n8.n()));
            rectP = new Rect();
            RectF rectF = new RectF(n8.n());
            matrixE.mapRect(rectF);
            rectF.round(rectP);
        } else {
            rectP = I.x.p(fVar.d());
        }
        Rect rect = rectP;
        return new N(fVar.e(), fVar.b(), n8.r().i().f(fVar.d()).a(), matrix, false, rect, n8.p() - iC, -1, n8.v() != zG);
    }
}
