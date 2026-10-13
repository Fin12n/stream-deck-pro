package p166t;

import A.C0883m;
import F1.c;
import H.InterfaceC0984i0;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Executor;
import p158s.a;
import p174u.n;

/* JADX INFO: renamed from: t.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2969q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984w f33844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2971r1 f33845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f33846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33847d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f33848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2984w.c f33849f;

    public C2969q1(C2984w c2984w, n nVar, Executor executor) {
        this.f33844a = c2984w;
        this.f33845b = new C2971r1(nVar, 0);
        this.f33846c = executor;
    }

    public final void a() {
        c.a aVar = this.f33848e;
        if (aVar != null) {
            aVar.f(new C0883m("Cancelled by another setExposureCompensationIndex()"));
            this.f33848e = null;
        }
        C2984w.c cVar = this.f33849f;
        if (cVar != null) {
            this.f33844a.T(cVar);
            this.f33849f = null;
        }
    }

    public void b(boolean z8) {
        if (z8 == this.f33847d) {
            return;
        }
        this.f33847d = z8;
        if (z8) {
            return;
        }
        this.f33845b.b(0);
        a();
    }

    public void c(a.C0723a c0723a) {
        c0723a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f33845b.a()), InterfaceC0984i0.c.REQUIRED);
    }
}
