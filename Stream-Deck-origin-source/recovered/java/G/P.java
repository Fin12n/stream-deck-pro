package G;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0868e0;
import H.Z0;
import Q.C1571u;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.List;
import java.util.concurrent.Executor;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q.y f2474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraCharacteristics f2475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q.A f2477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Q.A f2478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Q.A f2479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q.A f2480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Q.A f2481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Q.A f2482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Q.A f2483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Q.A f2484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Q.A f2485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z0 f2486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2487o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a e(int i8, List list) {
            return new C0945d(new C1571u(), new C1571u(), i8, list);
        }

        public abstract C1571u a();

        public abstract int b();

        public abstract List c();

        public abstract C1571u d();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public static b c(Q q8, androidx.camera.core.d dVar) {
            return new C0946e(q8, dVar);
        }

        public abstract androidx.camera.core.d a();

        public abstract Q b();
    }

    public P(Executor executor, CameraCharacteristics cameraCharacteristics, Q.y yVar) {
        this(executor, cameraCharacteristics, yVar, N.b.c());
    }

    public static /* synthetic */ void b(final P p8, final b bVar) {
        p8.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            p8.f2473a.execute(new Runnable() { // from class: G.K
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2463a.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final P p8, final b bVar) {
        p8.getClass();
        if (!bVar.b().l()) {
            p8.f2473a.execute(new Runnable() { // from class: G.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2461a.m(bVar);
                }
            });
        } else {
            AbstractC0890p0.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    public final Q.B i(Q.B b8, int i8) {
        T1.f.i(P.b.g(b8.e()));
        Q.B b9 = (Q.B) this.f2481i.apply(b8);
        Q.A a8 = this.f2485m;
        if (a8 != null) {
            b9 = (Q.B) a8.apply(b9);
        }
        return (Q.B) this.f2479g.apply(C0948g.b.c(b9, i8));
    }

    public androidx.camera.core.d j(b bVar) {
        Q qB = bVar.b();
        Q.B b8 = (Q.B) this.f2477e.apply(bVar);
        List listC = this.f2476d.c();
        T1.f.a(!listC.isEmpty());
        int iIntValue = ((Integer) listC.get(0)).intValue();
        if ((b8.e() == 35 || this.f2485m != null || this.f2487o) && iIntValue == 256) {
            Q.B bI = (Q.B) this.f2478f.apply(C0963w.a.c(b8, qB.c()));
            if (this.f2485m != null) {
                bI = i(bI, qB.c());
            }
            b8 = (Q.B) this.f2483k.apply(bI);
        }
        androidx.camera.core.d dVar = (androidx.camera.core.d) this.f2482j.apply(b8);
        if (listC.size() > 1) {
            qB.k().s(dVar.getFormat(), true);
        }
        return dVar;
    }

    public void k(b bVar) {
        final Q qB = bVar.b();
        try {
            boolean z8 = true;
            if (this.f2476d.c().size() <= 1) {
                z8 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.d dVarJ = j(bVar);
                J.a.d().execute(new Runnable() { // from class: G.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        qB.r(dVarJ);
                    }
                });
                return;
            }
            final C0864c0.h hVarL = l(bVar);
            if (z8 && !qB.k().q()) {
                return;
            }
            J.a.d().execute(new Runnable() { // from class: G.M
                @Override // java.lang.Runnable
                public final void run() {
                    qB.q(hVarL);
                }
            });
        } catch (C0868e0 e8) {
            o(qB, e8);
        } catch (OutOfMemoryError e9) {
            o(qB, new C0868e0(0, "Processing failed due to low memory.", e9));
        } catch (RuntimeException e10) {
            o(qB, new C0868e0(0, "Processing failed.", e10));
        }
    }

    public C0864c0.h l(b bVar) {
        List listC = this.f2476d.c();
        T1.f.a(!listC.isEmpty());
        Integer num = (Integer) listC.get(0);
        int iIntValue = num.intValue();
        T1.f.b(P.b.g(iIntValue) || P.b.h(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        Q qB = bVar.b();
        qB.d();
        T1.f.b(false, "OutputFileOptions cannot be empty");
        Q.B b8 = (Q.B) this.f2477e.apply(bVar);
        if (listC.size() <= 1) {
            if (iIntValue != 32) {
                qB.d();
                throw null;
            }
            qB.d();
            throw null;
        }
        qB.d();
        T1.f.b(false, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (b8.e() != 32) {
            qB.g();
            throw null;
        }
        qB.d();
        throw null;
    }

    public void n() {
    }

    public final void o(final Q q8, final C0868e0 c0868e0) {
        J.a.d().execute(new Runnable() { // from class: G.O
            @Override // java.lang.Runnable
            public final void run() {
                q8.u(c0868e0);
            }
        });
    }

    public Void p(a aVar) {
        this.f2476d = aVar;
        aVar.a().a(new T1.a() { // from class: G.H
            @Override // T1.a
            public final void accept(Object obj) {
                P.b(this.f2459a, (P.b) obj);
            }
        });
        aVar.d().a(new T1.a() { // from class: G.I
            @Override // T1.a
            public final void accept(Object obj) {
                P.d(this.f2460a, (P.b) obj);
            }
        });
        this.f2477e = new G();
        this.f2478f = new C0963w(this.f2486n);
        this.f2481i = new C0966z();
        this.f2479g = new C0948g();
        this.f2480h = new A();
        this.f2482j = new C();
        this.f2484l = new C0962v();
        if (aVar.b() == 35 || this.f2474b != null || this.f2487o) {
            this.f2483k = new B();
        }
        Q.y yVar = this.f2474b;
        if (yVar == null) {
            return null;
        }
        this.f2485m = new C0949h(yVar);
        return null;
    }

    public P(Executor executor, CameraCharacteristics cameraCharacteristics, Q.y yVar, Z0 z8) {
        if (N.b.b(LowMemoryQuirk.class) != null) {
            this.f2473a = J.a.f(executor);
        } else {
            this.f2473a = executor;
        }
        this.f2474b = yVar;
        this.f2475c = cameraCharacteristics;
        this.f2486n = z8;
        this.f2487o = z8.a(IncorrectJpegMetadataQuirk.class);
    }

    public void m(b bVar) {
        boolean z8;
        final Q qB = bVar.b();
        try {
            Q.B b8 = (Q.B) this.f2477e.apply(bVar);
            int iE = b8.e();
            if (iE != 35 && iE != 256 && iE != 4101) {
                z8 = false;
            } else {
                z8 = true;
            }
            T1.f.b(z8, String.format(OjEsfyJYzbPn.KlwOb, Integer.valueOf(iE)));
            final Bitmap bitmap = (Bitmap) this.f2484l.apply(b8);
            J.a.d().execute(new Runnable() { // from class: G.N
                @Override // java.lang.Runnable
                public final void run() {
                    qB.t(bitmap);
                }
            });
        } catch (Exception e8) {
            bVar.a().close();
            AbstractC0890p0.d("ProcessingNode", "process postview input packet failed.", e8);
        }
    }
}
