package p166t;

import A.AbstractC0890p0;
import A.C0883m;
import F1.c;
import H.AbstractC0995o;
import H.C0980g0;
import H.C0999q;
import H.F;
import H.InterfaceC0984i0;
import H.InterfaceC1014y;
import H.Z0;
import K.n;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Log;
import android.util.Rational;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p198x.l;

/* JADX INFO: renamed from: t.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2992y1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final MeteringRectangle[] f33938x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984w f33939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f33940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f33941c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f33944f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f33947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture f33948j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f33955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f33956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f33957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c.a f33958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c.a f33959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2984w.c f33961w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f33942d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Rational f33943e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33945g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f33946h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f33949k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33950l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33951m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33952n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2984w.c f33953o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2984w.c f33954p = null;

    /* JADX INFO: renamed from: t.y1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends AbstractC0995o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f33962a;

        public a(c.a aVar) {
            this.f33962a = aVar;
        }

        @Override // H.AbstractC0995o
        public void a(int i8) {
            c.a aVar = this.f33962a;
            if (aVar != null) {
                aVar.f(new C0883m("Camera is closed"));
            }
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
            c.a aVar = this.f33962a;
            if (aVar != null) {
                aVar.c(interfaceC1014y);
            }
        }

        @Override // H.AbstractC0995o
        public void c(int i8, C0999q c0999q) {
            c.a aVar = this.f33962a;
            if (aVar != null) {
                aVar.f(new F.c(c0999q));
            }
        }
    }

    /* JADX INFO: renamed from: t.y1$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends AbstractC0995o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f33964a;

        public b(c.a aVar) {
            this.f33964a = aVar;
        }

        @Override // H.AbstractC0995o
        public void a(int i8) {
            c.a aVar = this.f33964a;
            if (aVar != null) {
                aVar.f(new C0883m("Camera is closed"));
            }
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
            if (this.f33964a != null) {
                AbstractC0890p0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f33964a.c(null);
            }
        }

        @Override // H.AbstractC0995o
        public void c(int i8, C0999q c0999q) {
            c.a aVar = this.f33964a;
            if (aVar != null) {
                aVar.f(new F.c(c0999q));
            }
        }
    }

    public C2992y1(C2984w c2984w, ScheduledExecutorService scheduledExecutorService, Executor executor, Z0 z8) {
        MeteringRectangle[] meteringRectangleArr = f33938x;
        this.f33955q = meteringRectangleArr;
        this.f33956r = meteringRectangleArr;
        this.f33957s = meteringRectangleArr;
        this.f33958t = null;
        this.f33959u = null;
        this.f33960v = false;
        this.f33961w = null;
        this.f33939a = c2984w;
        this.f33940b = executor;
        this.f33941c = scheduledExecutorService;
        this.f33944f = new l(z8);
    }

    public static /* synthetic */ boolean a(C2992y1 c2992y1, int i8, long j8, TotalCaptureResult totalCaptureResult) {
        c2992y1.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i8 || !C2984w.R(totalCaptureResult, j8)) {
            return false;
        }
        c2992y1.l();
        return true;
    }

    public static /* synthetic */ void b(C2992y1 c2992y1, boolean z8, c.a aVar) {
        c2992y1.f33939a.T(c2992y1.f33961w);
        c2992y1.f33960v = z8;
        c2992y1.o(aVar);
    }

    public static /* synthetic */ Object c(final C2992y1 c2992y1, final boolean z8, final c.a aVar) {
        c2992y1.f33940b.execute(new Runnable() { // from class: t.x1
            @Override // java.lang.Runnable
            public final void run() {
                C2992y1.b(this.f33920a, z8, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ boolean e(C2992y1 c2992y1, long j8, c.a aVar, TotalCaptureResult totalCaptureResult) {
        c2992y1.getClass();
        boolean z8 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        AbstractC0890p0.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z8);
        if (z8 != c2992y1.f33960v || !C2984w.R(totalCaptureResult, j8)) {
            return false;
        }
        AbstractC0890p0.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z8);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public static /* synthetic */ Object f(final C2992y1 c2992y1, final c.a aVar) {
        c2992y1.f33940b.execute(new Runnable() { // from class: t.s1
            @Override // java.lang.Runnable
            public final void run() {
                this.f33862a.y(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public void g(p158s.a.C0723a c0723a) {
        int iR = this.f33945g ? 1 : r();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object objValueOf = Integer.valueOf(this.f33939a.G(iR));
        InterfaceC0984i0.c cVar = InterfaceC0984i0.c.REQUIRED;
        c0723a.g(key, objValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f33955q;
        if (meteringRectangleArr.length != 0) {
            c0723a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f33956r;
        if (meteringRectangleArr2.length != 0) {
            c0723a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f33957s;
        if (meteringRectangleArr3.length != 0) {
            c0723a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    public void h(boolean z8, boolean z9) {
        if (this.f33942d) {
            C0980g0.a aVar = new C0980g0.a();
            aVar.u(true);
            aVar.t(this.f33952n);
            p158s.a.C0723a c0723a = new p158s.a.C0723a();
            if (z8) {
                c0723a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z9) {
                c0723a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0723a.c());
            this.f33939a.d0(Collections.singletonList(aVar.h()));
        }
    }

    public void i(c.a aVar) {
        q("Cancelled by another cancelFocusAndMetering()");
        p("Cancelled by cancelFocusAndMetering()");
        this.f33959u = aVar;
        m();
        k();
        if (w()) {
            h(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f33938x;
        this.f33955q = meteringRectangleArr;
        this.f33956r = meteringRectangleArr;
        this.f33957s = meteringRectangleArr;
        this.f33945g = false;
        final long jF0 = this.f33939a.f0();
        if (this.f33959u != null) {
            final int iG = this.f33939a.G(r());
            C2984w.c cVar = new C2984w.c() { // from class: t.u1
                @Override // p166t.C2984w.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C2992y1.a(this.f33874a, iG, jF0, totalCaptureResult);
                }
            };
            this.f33954p = cVar;
            this.f33939a.t(cVar);
        }
    }

    public void j() {
        i(null);
    }

    public final void k() {
        ScheduledFuture scheduledFuture = this.f33948j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f33948j = null;
        }
    }

    public final void l() {
        c.a aVar = this.f33959u;
        if (aVar != null) {
            aVar.c(null);
            this.f33959u = null;
        }
    }

    public final void m() {
        ScheduledFuture scheduledFuture = this.f33947i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f33947i = null;
        }
    }

    public Y4.a n(final boolean z8) {
        if (this.f33939a.E(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return c.a(new c.InterfaceC0112c() { // from class: t.v1
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return C2992y1.c(this.f33880a, z8, aVar);
            }
        });
    }

    public final void o(final c.a aVar) {
        if (!this.f33942d) {
            if (aVar != null) {
                aVar.f(new C0883m("Camera is not active."));
            }
        } else {
            final long jF0 = this.f33939a.f0();
            C2984w.c cVar = new C2984w.c() { // from class: t.t1
                @Override // p166t.C2984w.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C2992y1.e(this.f33867a, jF0, aVar, totalCaptureResult);
                }
            };
            this.f33961w = cVar;
            this.f33939a.t(cVar);
        }
    }

    public final void p(String str) {
        this.f33939a.T(this.f33953o);
        c.a aVar = this.f33958t;
        if (aVar != null) {
            aVar.f(new C0883m(str));
            this.f33958t = null;
        }
    }

    public final void q(String str) {
        this.f33939a.T(this.f33954p);
        c.a aVar = this.f33959u;
        if (aVar != null) {
            aVar.f(new C0883m(str));
            this.f33959u = null;
        }
    }

    public int r() {
        return this.f33952n != 3 ? 4 : 3;
    }

    public boolean s() {
        return this.f33960v;
    }

    public void t(boolean z8) {
        if (z8 == this.f33942d) {
            return;
        }
        this.f33942d = z8;
        if (this.f33942d) {
            return;
        }
        j();
    }

    public void u(Rational rational) {
        this.f33943e = rational;
    }

    public void v(int i8) {
        this.f33952n = i8;
    }

    public final boolean w() {
        return this.f33955q.length > 0;
    }

    public Y4.a x() {
        return c.a(new c.InterfaceC0112c() { // from class: t.w1
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return C2992y1.f(this.f33915a, aVar);
            }
        });
    }

    public void y(c.a aVar) {
        AbstractC0890p0.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f33942d) {
            if (aVar != null) {
                aVar.f(new C0883m("Camera is not active."));
                return;
            }
            return;
        }
        C0980g0.a aVar2 = new C0980g0.a();
        aVar2.t(this.f33952n);
        aVar2.u(true);
        p158s.a.C0723a c0723a = new p158s.a.C0723a();
        c0723a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0723a.c());
        aVar2.c(new b(aVar));
        this.f33939a.d0(Collections.singletonList(aVar2.h()));
    }

    public void z(c.a aVar, boolean z8) {
        if (!this.f33942d) {
            if (aVar != null) {
                aVar.f(new C0883m("Camera is not active."));
                return;
            }
            return;
        }
        C0980g0.a aVar2 = new C0980g0.a();
        aVar2.t(this.f33952n);
        aVar2.u(true);
        p158s.a.C0723a c0723a = new p158s.a.C0723a();
        c0723a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z8) {
            c0723a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f33939a.E(1)), InterfaceC0984i0.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0723a.c());
        aVar2.c(new a(aVar));
        this.f33939a.d0(Collections.singletonList(aVar2.h()));
    }
}
