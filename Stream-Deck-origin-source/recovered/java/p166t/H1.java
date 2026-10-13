package p166t;

import A.C0883m;
import F1.c;
import I.w;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.lifecycle.AbstractC1737u;
import androidx.lifecycle.x;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984w f33340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f33341b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33343d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f33346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.a f33348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2984w.c f33350k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f33342c = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f33344e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33345f = false;

    public H1(C2984w c2984w, n nVar, Executor executor) {
        this.f33340a = c2984w;
        this.f33346g = executor;
        boolean zB = b(nVar);
        this.f33343d = zB;
        this.f33341b = new x(-1);
        C2984w.c cVar = new C2984w.c() { // from class: t.G1
            @Override // p166t.C2984w.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return H1.a(this.f33337a, totalCaptureResult);
            }
        };
        this.f33350k = cVar;
        if (zB) {
            c2984w.t(cVar);
        }
    }

    public static /* synthetic */ boolean a(H1 h8, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (h8.f33348i != null) {
            Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AE_MODE);
            if (num2 != null) {
                if ((num2.intValue() == 6) == h8.f33349j) {
                    h8.f33348i.c(null);
                    h8.f33348i = null;
                    if (Build.VERSION.SDK_INT >= 35) {
                        h8.e(h8.f33341b, num.intValue());
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 35 && h8.f33349j && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) != null) {
            h8.e(h8.f33341b, num.intValue());
        }
        return false;
    }

    public static boolean b(n nVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) nVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i8 : iArr) {
                if (i8 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC1737u c() {
        return this.f33341b;
    }

    public void d(boolean z8) {
        if (this.f33347h == z8) {
            return;
        }
        this.f33347h = z8;
        if (z8) {
            return;
        }
        if (this.f33349j) {
            this.f33349j = false;
            this.f33340a.w(false);
            e(this.f33341b, -1);
        }
        c.a aVar = this.f33348i;
        if (aVar != null) {
            aVar.f(new C0883m("Camera is not active."));
            this.f33348i = null;
        }
    }

    public final void e(x xVar, int i8) {
        if (this.f33342c.getAndSet(i8) != i8) {
            if (w.d()) {
                xVar.m(Integer.valueOf(i8));
            } else {
                xVar.k(Integer.valueOf(i8));
            }
        }
    }

    public void f(boolean z8) {
        synchronized (this.f33344e) {
            try {
                this.f33345f = z8;
                if (z8) {
                    if (this.f33349j) {
                        this.f33349j = false;
                        this.f33340a.w(false);
                        e(this.f33341b, -1);
                        c.a aVar = this.f33348i;
                        if (aVar != null) {
                            aVar.f(new IllegalStateException("Low-light boost is disabled when expected frame rate range exceeds 30 or HDR 10-bit is on."));
                            this.f33348i = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
