package p166t;

import A.AbstractC0890p0;
import H.AbstractC0994n0;
import H.B0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.O0;
import H.c1;
import H.u1;
import H.v1;
import L.q;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p174u.n;
import p198x.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0994n0 f33367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c1 f33368b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f33370d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f33372f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f33371e = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c1.c f33373g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f33369c = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f33374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f33375b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f33374a = surface;
            this.f33375b = surfaceTexture;
        }

        @Override // K.c
        public void b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            this.f33374a.release();
            this.f33375b.release();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements u1 {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public final InterfaceC0984i0 f33377P;

        public b() {
            O0 o0I0 = O0.i0();
            o0I0.L(u1.f3229y, new Q0());
            o0I0.L(InterfaceC1015y0.f3283j, 34);
            f0(o0I0);
            this.f33377P = o0I0;
        }

        @Override // H.u1
        public v1.b O() {
            return v1.b.METERING_REPEATING;
        }

        public final void f0(O0 o8) {
            o8.L(q.f4795N, K1.class);
            o8.L(q.f4794M, K1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // H.a1
        public InterfaceC0984i0 q() {
            return this.f33377P;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void a();
    }

    public K1(n nVar, C2963o1 c2963o1, c cVar) {
        this.f33372f = cVar;
        Size sizeG = g(nVar, c2963o1);
        this.f33370d = sizeG;
        AbstractC0890p0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + sizeG);
        this.f33368b = d();
    }

    public static /* synthetic */ void a(K1 k8, c1 c1Var, c1.g gVar) {
        k8.f33368b = k8.d();
        c cVar = k8.f33372f;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void c() {
        AbstractC0890p0.a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC0994n0 abstractC0994n0 = this.f33367a;
        if (abstractC0994n0 != null) {
            abstractC0994n0.d();
        }
        this.f33367a = null;
    }

    public c1 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f33370d.getWidth(), this.f33370d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        c1.b bVarQ = c1.b.q(this.f33369c, this.f33370d);
        bVarQ.y(1);
        B0 b8 = new B0(surface);
        this.f33367a = b8;
        K.n.j(b8.k(), new a(surface, surfaceTexture), J.a.a());
        bVarQ.l(this.f33367a);
        c1.c cVar = this.f33373g;
        if (cVar != null) {
            cVar.b();
        }
        c1.c cVar2 = new c1.c(new c1.d() { // from class: t.I1
            @Override // H.c1.d
            public final void a(c1 c1Var, c1.g gVar) {
                K1.a(this.f33353a, c1Var, gVar);
            }
        });
        this.f33373g = cVar2;
        bVarQ.r(cVar2);
        return bVarQ.p();
    }

    public Size e() {
        return this.f33370d;
    }

    public String f() {
        return "MeteringRepeating";
    }

    public final Size g(n nVar, C2963o1 c2963o1) {
        Size[] sizeArrF = nVar.e().f(34);
        if (sizeArrF == null) {
            AbstractC0890p0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] sizeArrA = this.f33371e.a(sizeArrF);
        List listAsList = Arrays.asList(sizeArrA);
        Collections.sort(listAsList, new Comparator() { // from class: t.J1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            }
        });
        Size sizeF = c2963o1.f();
        long jMin = Math.min(((long) sizeF.getWidth()) * ((long) sizeF.getHeight()), 307200L);
        int length = sizeArrA.length;
        Size size = null;
        int i8 = 0;
        while (i8 < length) {
            Size size2 = sizeArrA[i8];
            long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
            if (width == jMin) {
                return size2;
            }
            if (width > jMin) {
                if (size == null) {
                    break;
                }
                return size;
            }
            i8++;
            size = size2;
        }
        return (Size) listAsList.get(0);
    }

    public c1 h() {
        return this.f33368b;
    }

    public u1 i() {
        return this.f33369c;
    }
}
