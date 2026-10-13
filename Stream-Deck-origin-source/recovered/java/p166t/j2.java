package p166t;

import A.AbstractC0890p0;
import A.W0;
import L.h;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.lifecycle.AbstractC1737u;
import androidx.lifecycle.x;
import java.util.concurrent.Executor;
import p174u.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984w f33767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f33768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f33769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f33770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f33771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33772f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2984w.c f33773g = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements C2984w.c {
        public a() {
        }

        @Override // p166t.C2984w.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            j2.this.f33771e.a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d(p158s.a.C0723a c0723a);

        void e();
    }

    public j2(C2984w c2984w, n nVar, Executor executor) {
        this.f33767a = c2984w;
        this.f33768b = executor;
        b bVarB = b(nVar);
        this.f33771e = bVarB;
        k2 k2Var = new k2(bVarB.b(), bVarB.c());
        this.f33769c = k2Var;
        k2Var.e(1.0f);
        this.f33770d = new x(h.e(k2Var));
        c2984w.t(this.f33773g);
    }

    public static b b(n nVar) {
        return e(nVar) ? new C2925c(nVar) : new C2960n1(nVar);
    }

    public static Range c(n nVar) {
        try {
            return (Range) nVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e8) {
            AbstractC0890p0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e8);
            return null;
        }
    }

    public static boolean e(n nVar) {
        return Build.VERSION.SDK_INT >= 30 && c(nVar) != null;
    }

    public void a(p158s.a.C0723a c0723a) {
        this.f33771e.d(c0723a);
    }

    public AbstractC1737u d() {
        return this.f33770d;
    }

    public void f(boolean z8) {
        W0 w0E;
        if (this.f33772f == z8) {
            return;
        }
        this.f33772f = z8;
        if (z8) {
            return;
        }
        synchronized (this.f33769c) {
            this.f33769c.e(1.0f);
            w0E = h.e(this.f33769c);
        }
        g(w0E);
        this.f33771e.e();
        this.f33767a.f0();
    }

    public final void g(W0 w8) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f33770d.m(w8);
        } else {
            this.f33770d.k(w8);
        }
    }
}
